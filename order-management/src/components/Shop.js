import React, { useEffect, useState } from "react";
import ApiHandler from "./ApiHandler";
import ShopItem from "./ShopItem";

const Shop = () => {
  const [itemList, setItemList] = useState([]);
  const [fetchError, setFetchError] = useState(null);
  const [isLoading, setIsLoading] = useState(true);
  const API_URL = "http://localhost:3500/items";

  useEffect(() => {

    const fetchItems = async () => {
      try {
        const response = await fetch(API_URL);
        if (!response.ok) throw Error("Could not connect to shop. Try refreshing page.");
        const items = await response.json();
        setItemList(items);
        setFetchError(null);
      } catch (err) {
        setFetchError(err.message);
      } finally {
        setIsLoading(false);
      }
    };

    fetchItems();
  }, []);

  const updateCheck = async (id) => {
    const list = itemList.map((item) =>
      item.id === id ? { ...item, checked: !item.checked } : item
    );
    setItemList(list);

    const item = list.filter((item) => item.id === id);
    const requestPara = {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ checked: item[0].checked }),
    };
    const response = await ApiHandler(`${API_URL}/${id}`, requestPara);
    if (response) setFetchError(response);
  };

  return (
    <ul>
      {isLoading && <div className="shopMsg">Loading...</div>}
      {fetchError && <p style={{color: "red"}}>{`Error: ${fetchError}`}</p>}
      {itemList.length + isLoading + fetchError ? (
        itemList.map((item) => (
          <ShopItem key={item.id} item={item} updateCheck={updateCheck} />
        ))
      ) : (
        <div className="shopMsg">Out of stock</div>
      )}
    </ul>
  );
};

export default Shop;

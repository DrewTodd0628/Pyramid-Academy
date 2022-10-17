import React, { useEffect, useState } from "react";
import ApiHandler from "./ApiHandler";
import ShopItem from "./ShopItem";

const Shop = () => {
  const [itemList, setItemList] = useState([]);
  const [fetchError, setFetchError] = useState(null);
  const [isLoading, setIsLoading] = useState(true);
  const API_URL = "http://localhost:3500/items";
  const [focusedItem, SetFocusedItem] = useState([]);
  const imgSrc = `data:image/png;base64,${focusedItem.image}`;

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

  // useEffect(() => {
  //   const list = itemList.filter((item) => item.name.toLowerCase().includes(search.toLowerCase()));
  //   setItemList(list);
  //   console.log("wdwfwefwefwef: " + search);
  // }, [search])

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

  const focusItem = (item) => {
      SetFocusedItem(item);
  }

  return (
    <>
      <section className="itemList">
        <ul>
        {isLoading && <div className="shopMsg">Loading...</div>}
        {fetchError && <p style={{color: "red"}}>{`Error: ${fetchError}`}</p>}
        {itemList.length + isLoading + fetchError ? (
          itemList.map((item) => (
            <ShopItem key={item.id} item={item} updateCheck={updateCheck} focusItem={focusItem}/>
          ))
        ) : (
          <div className="shopMsg">Out of stock</div>
        )}
      </ul>
      </section>



      <section className='sidePanel'>
        {focusedItem.length === 0 ? (<p>Spring Market Fall Sale! <br/> 10% off Halloween candy. </p>
        ) : (
          <div>
            <label>
              <span>
              <h3>{focusedItem.name}</h3>
              <p>${focusedItem.cost.price} {focusedItem.cost.per}</p>
              </span>
              <img className="itemImg" src={imgSrc} />
            </label>
            <p className="description">{focusedItem.description}</p>
          </div>
        )}
          
        {/* <button onClick={() => navigate("/checkout")}>Check Out</button> */}
      </section>
    </>
  );
};

export default Shop;

import React, { useEffect, useState } from 'react'
import ApiHandler from './ApiHandler';
import CartItem from './CartItem'

const ShoppingCart = () => {

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

  const deleteItem = async (id) => {
    const list = itemList.filter(item => item.id !== id);
    setItemList(list);

    const requestPara = { method: 'DELETE' };
    const response = await ApiHandler(`${API_URL}/${id}`, requestPara);
    if (response) setFetchError(response);
  }



  return (
    <ul>
      {isLoading && <div className="shopMsg">Loading...</div>}
      {fetchError && <p style={{color: "red"}}>{`Error: ${fetchError}`}</p>}
      {itemList.length + isLoading + fetchError ? (
        itemList.map((item) => (
          <CartItem key={item.id} item={item} deleteItem={deleteItem} />
        ))
      ) : (
        <div className="shopMsg">Cart is empty</div>
      )}
    </ul>
  )
}

export default ShoppingCart
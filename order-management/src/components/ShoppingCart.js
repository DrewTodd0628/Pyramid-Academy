import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import ApiHandler from './ApiHandler';
import CartItem from './CartItem'

const ShoppingCart = () => {

  const [search, setSearch] = useState("");
  const [totalPrice, setTotalPrice] = useState(0);
  const [itemList, setItemList] = useState([]);
  const [fetchError, setFetchError] = useState(null);
  const [isLoading, setIsLoading] = useState(true);
  const API_URL = "http://localhost:3500/items";
  const navigate = useNavigate();

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

  useEffect(() => {
    const list = itemList.filter(item => item.name === search);
    setItemList(list);
  }, [search])

  const deleteItem = async (id) => {
    const list = itemList.filter(item => item.id !== id);
    setItemList(list);

    const requestPara = { method: 'DELETE' };
    const response = await ApiHandler(`${API_URL}/${id}`, requestPara);
    if (response) setFetchError(response);
  }

  const searchItems = (search)



  return (
    <>
      <section className="itemList">
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
      </section>



      <section className='sidePanel checkout'>
        <div>
          <label>
            <h3>Checkout</h3>
          </label>
          <ul>
            <li><span>Total:</span> <span>${totalPrice}</span></li>
            <li><span>Tax:</span> <span>$0</span></li>
            <li><span>Shipping:</span> <span>$0</span></li>
            <li style={{fontWeight: "bold", marginTop: "5px"}}><span>Total:</span> <span>$0</span></li>
          </ul>
          <button onClick={() => navigate("/checkout")}>Check Out</button>
        </div>
      </section>
    </>
  )
}

export default ShoppingCart
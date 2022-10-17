const ShopItem = ({ item, updateCheck, focusItem }) => {

  const imgSrc = `data:image/png;base64,${item.image}`;

  return (
    <li className='item' onClick={() => focusItem(item)}>
        <label>
          <h5>{item.name}</h5>
          <img className="itemImg" src={imgSrc} />
        </label>
        <div className='itemDesc'>{item.description}</div>
        <input className="checkbox" type="checkbox" onChange={() => updateCheck(item.id)} checked={item.checked}/>
    </li>
  )
}

export default ShopItem
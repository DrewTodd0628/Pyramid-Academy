const ShopItem = ({ item, updateCheck }) => {
  return (
    <li className='item' onClick={() => updateCheck(item.id)}>
        <label>{item.name}</label>
        <div className='itemDesc'>{item.description}</div>
        <input className="checkbox" type="checkbox" onChange={() => updateCheck(item.id)} checked={item.checked}/>
    </li>
  )
}

export default ShopItem
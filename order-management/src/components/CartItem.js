import { FaTrashAlt } from "react-icons/fa";

const ShopItem = ({ item, deleteItem }) => {
  return (
    <li className="item cartItem">
      <label>{item.name}</label>
      <div className="itemDesc">{item.description}</div>

    <div className="flex-container-center-v">
      <FaTrashAlt
        className="deleteBtn"
        onClick={() => deleteItem(item.id)}
        role="button"
        tabIndex="0"
        aria-label={`Delete ${item.item}`}
      />
      </div>
    </li>
  );
};

export default ShopItem;

INSERT INTO RESTAURANT (name, address1, address2, latitude, longitude) VALUES
  ('Pizza Heaven', 'Kungsgatan 1', '111 43 Stockholm', '59.336078', '18.071807'),
  ('Pizzeria Apan', 'Långholmsgatan 34', '117 33 Stockholm', '59.315709', '18.033507');


INSERT INTO FOOD_ITEM_IMPL (name, price, type) VALUES
  ('Vesuvius', '79', 'pizza'),
  ('Hawaii', '79', 'pizza'),
  ('Parma', '89', 'pizza');

-- [
--   {
--     "id": 1,
--     "category": "Pizza",
--     "name": "Vesuvius",
--     "topping": [
--       "Tomat",
--       "Ost",
--       "Skinka"
--     ],
--     "price": 79,
--     "rank": 3
--   },
--   {
--     "id": 2,
--     "category": "Pizza",
--     "name": "Hawaii",
--     "topping": [
--       "Tomat",
--       "Ost",
--       "Skinka",
--       "Ananas"
--     ],
--     "price": 79,
--     "rank": 1
--   },
--   {
--     "id": 3,
--     "category": "Pizza",
--     "name": "Parma",
--     "topping": [
--       "Tomat",
--       "Ost",
--       "Parmaskinka",
--       "Oliver",
--       "Färska basilika"
--     ],
--     "price": 89,
--     "rank": 2
--   },
--   {
--     "id": 4,
--     "category": "Dryck",
--     "name": "Coca-cola, 33cl",
--     "price": 10
--   },
--   {
--     "id": 5,
--     "category": "Dryck",
--     "name": "Loka citron, 33cl",
--     "price": 10
--   },
--   {
--     "id": 6,
--     "category": "Tillbehör",
--     "name": "Pizzasallad",
--     "price": 0
--   },
--   {
--     "id": 7,
--     "category": "Tillbehör",
--     "name": "Bröd och smör",
--     "price": 10
--   }
-- ]

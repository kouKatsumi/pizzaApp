INSERT INTO RESTAURANT (name, address1, address2, latitude, longitude) VALUES
  ('Pizza Heaven', 'Kungsgatan 1', '111 43 Stockholm', '59.336078', '18.071807'),
  ('Pizzeria Apan', 'Långholmsgatan 34', '117 33 Stockholm', '59.315709', '18.033507');


INSERT INTO FOOD_ITEM_IMPL (id, name, price, type) VALUES
  ('1', 'Vesuvius', '79', 'pizza'),
  ('2', 'Hawaii', '79', 'pizza'),
  ('3', 'Parma', '89', 'pizza');

INSERT INTO INGREDIENT_IMPL (name) VALUES
  ('tomat'),
  ('ost'),
  ('skinka'),
  ('ananas'),
  ('parmskinka'),
  ('olivier'),
  ('Färska basilika');

INSERT INTO FOOD_ITEM_IMPL_INGREDIENTS (food_item_impl_id, ingredients_name) VALUES
  ('1', 'tomat'),
  ('1', 'ost'),
  ('1', 'skinka'),
  ('2', 'tomat'),
  ('2', 'ost'),
  ('2', 'skinka'),
  ('2', 'ananas'),
  ('3', 'tomat'),
  ('3', 'ost'),
  ('3', 'parmskinka'),
  ('3', 'olivier'),
  ('3', 'Färska basilika');


INSERT INTO DRINK_ITEM_IMPL (id, name, price, type) VALUES
  ('4', 'Coca-cola, 33cl', '10', 'drink'),
  ('5', 'Loka citron, 33cl', '10', 'drink');


INSERT INTO MENU_ITEM_IMPL (id, name, price, type) VALUES
  ('6', 'Pizzasallad', '0', 'additional'),
  ('7', 'Bröd och smör"', '10', 'additional');


CREATE TABLE IF NOT EXISTS Item (
    ItemCode VARCHAR(255),
    Quantity VARCHAR(255),
    Unitprice VARCHAR(255)
);

insert into
    Item (ItemCode, Quantity, Unitprice,)
values
    ('ISBN', '1', 'SingleCopy');

insert into
    Item (ItemCode, Quantity, Unitprice,)
values
    ('HB', '12', 'Pieces');

insert into
    Item (ItemCode, Quantity, Unitprice,)
values
    ('Bic', '20', 'Pieces');

insert into
    Item (ItemCode, Quantity, Unitprice,)
values
    ('Reams', '1', 'g/m2');

insert into
    Item (ItemCode, Quantity, Unitprice)
values
    (?, ?, ?, ?);
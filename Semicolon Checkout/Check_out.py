from datetime import datetime

now = datetime.now()
formatted_time = now.strftime("%Y-%m-%d %H:%M:%S")

customer_name = input("What is the Customer's Name: ")
item_bought = input("What did the Customer buy: ")
no_of_items = int(input("How many pieces did the customer buy: "))
price = float(input("How much per unit: "))

more_items = input("Add more items (true/false): ").strip().lower() == "true"
new_items = 0
if more_items:
    new_items = int(input("How many Items do you want to add: "))

item_bought_array = [""] * new_items
no_of_items_array = [0] * new_items
price_array = [0.0] * new_items

count = 0
while more_items:
    item_bought_array[count] = input("What did the Customer buy: ")
    no_of_items_array[count] = int(input("How many pieces did the customer buy: "))
    price_array[count] = float(input("How much per unit: "))
    count += 1
    if count == new_items:
        more_items = False

cashier_name = input("What is your Name: ")
discount = float(input("How much discount will he/she get: "))

total = price * no_of_items
calculating_discount = (discount / 100) * total
vat = (17.5 / 100) * total
new_total = total - calculating_discount + vat

print("\n")
print("""
        SEMICOLON STORES
        MAIN BRANCH 
        LOCATION: 321, HEBERT MACAULAY WAY, SABO YABA, LAGOS.
        TEL: 03293828343
""")
print("Date:", formatted_time)
print("Cashier:", cashier_name)
print("Customer Name:", customer_name)

print("=" * 70)
print(f"{'ITEM':<30}{'QTY':<10}{'PRICE':<15}{'TOTAL(NGN)':<15}")
print("-" * 70)

if new_items != 0:
    print(f"{item_bought:<30}{no_of_items:<10}{price:<15.2f}{price * no_of_items:<15.2f}")
    total2 = price * no_of_items

    for index in range(new_items):
        print(
            f"{item_bought_array[index]:<30}"
            f"{no_of_items_array[index]:<10}"
            f"{price_array[index]:<15.2f}"
            f"{price_array[index] * no_of_items_array[index]:<15.2f}"
        )
        total2 += price_array[index] * no_of_items_array[index]

    new_cost = total2 - ((discount / 100) * total2) + ((17.5 / 100) * total2)

    print("-" * 70)
    print(f"{'Sub Total:':<45}{total2:>10.2f}")
    print(f"{'Discount:':<45}{(discount / 100) * total2:>10.2f}")
    print(f"{'VAT @ 17.5%:':<45}{(17.5 / 100) * total2:>10.2f}")
    print("=" * 70)
    print(f"{'Bill Total:':<45}{new_cost:>10.2f}")
    print("=" * 70)
    print(f"THIS IS NOT A RECEIPT, KINDLY PAY {new_cost:.2f}")
    print("=" * 70)
else:
    print(f"{item_bought:<30}{no_of_items:<10}{price:<15.2f}{total:<15.2f}")
    print("-" * 70)
    print(f"{'Sub Total:':<45}{total:>10.2f}")
    print(f"{'Discount:':<45}{calculating_discount:>10.2f}")
    print(f"{'VAT @ 17.5%:':<45}{vat:>10.2f}")
    print("=" * 70)
    print(f"{'Bill Total:':<45}{new_total:>10.2f}")
    print("=" * 70)
    print(f"THIS IS NOT A RECEIPT, KINDLY PAY {new_total:.2f}")
    print("=" * 70)

money_paid = float(input("How much did the customer give to you? "))

print("\nPlease Wait While we process your Payment.............")
print("Payment Successful 👍\n")

print("""
        SEMICOLON STORES
        MAIN BRANCH 
        LOCATION: 321, HEBERT MACAULAY WAY, SABO YABA, LAGOS.
        TEL: 03293828343
""")
print("Date:", formatted_time)
print("Cashier:", cashier_name)
print("Customer Name:", customer_name)

print("=" * 70)
print(f"{'ITEM':<30}{'QTY':<10}{'PRICE':<15}{'TOTAL(NGN)':<15}")
print("-" * 70)

if new_items != 0:
    print(f"{item_bought:<30}{no_of_items:<10}{price:<15.2f}{price * no_of_items:<15.2f}")

    for index in range(new_items):
        print(
            f"{item_bought_array[index]:<30}"
            f"{no_of_items_array[index]:<10}"
            f"{price_array[index]:<15.2f}"
            f"{price_array[index] * no_of_items_array[index]:<15.2f}"
        )

    print("-" * 70)
    print(f"{'Sub Total:':<45}{total2:>10.2f}")
    print(f"{'Discount:':<45}{(discount / 100) * total2:>10.2f}")
    print(f"{'VAT @ 17.5%:':<45}{(17.5 / 100) * total2:>10.2f}")
    print("=" * 70)
    print(f"{'Bill Total:':<45}{new_cost:>10.2f}")
    print(f"{'Amount Paid:':<45}{money_paid:>10.2f}")
    print(f"{'Balance:':<45}{money_paid - new_cost:>10.2f}")
    print("=" * 70)
    print("        THANK YOU FOR YOUR PATRONAGE")
    print("=" * 70)
else:
    print(f"{item_bought:<30}{no_of_items:<10}{price:<15.2f}{total:<15.2f}")
    print("-" * 70)
    print(f"{'Sub Total:':<45}{total:>10.2f}")
    print(f"{'Discount:':<45}{calculating_discount:>10.2f}")
    print(f"{'VAT @ 17.5%:':<45}{vat:>10.2f}")
    print("=" * 70)
    print(f"{'Bill Total:':<45}{new_total:>10.2f}")
    print(f"{'Amount Paid:':<45}{money_paid:>10.2f}")
    print(f"{'Balance:':<45}{money_paid - new_total:>10.2f}")
    print("=" * 70)
    print("        THANK YOU FOR YOUR PATRONAGE")
    print("=" * 70)

package JavaDay01;

import java.util.*;

class Product {
  int id;
  String name;
  double price;

  Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String toString() {
    return "ID:" + id + ",Name:" + name + ",Price:" + price;
  }
}

class DeliveryPartner {
  int partnerId;
  String name;
  String area;

  DeliveryPartner(int partnerId, String name, String area) {
    this.partnerId = partnerId;
    this.name = name;
    this.area = area;
  }

  public String toString() {
    return "PartnerID: " + partnerId + ",Name:" + name + ", Area:" + area;
  }
}

public class LogisticManagemntSystem {
  static Scanner sc = new Scanner(System.in);
  static ArrayList<Product> products = new ArrayList<>();
  static Map<Integer, DeliveryPartner> partners = new HashMap<>();
  static Set<String> serviceAreas = new HashSet<>();

  public static void main(String[] args) {
    int choice;
    do {
      System.out.println("LOGISTICS MANAGEMENT SYSTEM");
      System.out.println("1. Add Product");
      System.out.println("2. View Products");
      System.out.println("3. Add Delivery Partner");
      System.out.println("4. View Delivery Partners");
      System.out.println("5. View Service Areas");
      System.out.println("6. Exit");
      System.out.print("Choose one option: ");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          addProduct();
          break;
        case 2:
          viewProducts();
          break;
        case 3:
          addPartner();
          break;
        case 4:
          viewPartners();
          break;
        case 5:
          viewServiceAreas();
          break;
        case 6:
          System.out.println("Exited");
          break;
        default:
          System.out.println("choose a valid option");
      }
    } while (choice != 6);
  }

  static void addProduct() {
    System.out.print("Enter Product ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Product Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Price: ");
    double price = sc.nextDouble();

    products.add(new Product(id, name, price));
    System.out.println("Product Added");
  }

  static void viewProducts() {
    if (products.isEmpty()) {
      System.out.println("No Products Available");
      return;
    }
    for (Product p : products) {
      System.out.println(p);
    }
  }

  static void addPartner() {
    System.out.print("Enter Partner ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Partner Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Service Area: ");
    String area = sc.nextLine();
    partners.put(id, new DeliveryPartner(id, name, area));
    serviceAreas.add(area);
    System.out.println("Delivery Partner Added");
  }

  static void viewPartners() {
    if (partners.isEmpty()) {
      System.out.println("No Delivery Partners Available");
      return;
    }
    for (Map.Entry<Integer, DeliveryPartner> entry : partners.entrySet()) {
      System.out.println(entry.getValue());
    }
  }

  static void viewServiceAreas() {
    if (serviceAreas.isEmpty()) {
      System.out.println("No Area Available");
      return;
    }
    System.out.println("Service Areas:");
    for (String area : serviceAreas) {
      System.out.println(area);
    }
  }
}

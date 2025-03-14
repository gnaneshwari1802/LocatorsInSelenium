# Session 22: Selenium with Java | Locators

In this session, we will cover how to locate web elements using various locators in Selenium WebDriver and how to interact with them. We will also dive deep into the difference between `findElement` and `findElements` methods and explore their use cases.

---

## Key Topics Covered:

### **Introduction to Session 22**
- Session 22 covers the essential concept of **locators** in Selenium WebDriver, which are used to find elements on a webpage.
- Learn how locators are crucial for automating web interactions with Selenium.

### **Understanding Locators and Actions in Selenium with Java**
- **Locators** are the key to locating elements in a web page that you want to interact with using Selenium.
- Actions such as clicking, typing, or extracting data depend on how well locators are defined.

### **Basic vs. Customized Locators in Selenium**
- **Basic Locators**: Simple locators like `ID`, `Name`, `Class Name`, `Link Text`, `Partial Link Text`, and `Tag Name`.
- **Customized Locators**: Advanced locators such as `XPath` and `CSS Selectors`, which allow more flexibility and specificity in locating elements.

### **Understanding Basic Locators in HTML**
- **ID**: An element’s unique identifier.
- **Name**: Often used for form elements.
- **Class Name**: Commonly used for grouping elements.
- **Link Text & Partial Link Text**: Used to identify links.
- **Tag Name**: Identifies an element by its HTML tag.

### **Using Locators to Locate Elements on a Web Page**
- Learn the practical usage of each locator type and how to implement them in Selenium WebDriver.

### **Locators in Selenium: ID, Link Text, and Partial Link Text**
- **ID** is often the most preferred locator since it uniquely identifies an element.
- **Link Text** and **Partial Link Text** are particularly useful for locating anchor (`<a>`) tags in a webpage.

### **Understanding Locators in Selenium with Java**
- We will explore how locators are used in the context of Selenium WebDriver in Java to interact with web elements.
  
### **Link Text vs Partial Link Text**
- **Link Text** is typically preferred over **Partial Link Text** as it is more reliable in locating the exact link.
- Learn when to use **Link Text** and when **Partial Link Text** might be more appropriate.

### **Understanding Partial Link Text in Selenium Locators**
- **Partial Link Text** can be used when only a portion of the link text is known, but it’s less reliable compared to **Link Text**.

### **Locators for Capturing Groups of Web Elements**
- Sometimes, you need to capture multiple elements on a webpage that share the same tag or property.
- Learn how locators can help you identify groups of elements (e.g., multiple buttons or links).

### **The Difference Between `findElement` and `findElements` Methods**
- `findElement`: Returns the first matching element.
- `findElements`: Returns a list of all matching elements.
- Understanding when to use each method based on your need to interact with a single or multiple elements.

### **Using Tag Name as a Locator**
- `Tag Name` locators are useful when you want to locate a group of elements, such as all `<input>` or `<button>` elements on a page.

### **Using Tag Name Locator to Capture Groups of Elements**
- Practical examples of using the `Tag Name` locator to locate and interact with multiple elements on a web page, such as forms, buttons, or links.

### **Return Locator vs. Find Elements Method**
- **Return Locator**: Refers to the type of locator returned (e.g., ID, Name, etc.).
- **findElements**: Can return a list of elements based on a locator, and is useful when multiple elements need to be interacted with.

### **`findElement` vs `findElements` in Selenium**
- We explore the key differences between `findElement` and `findElements` methods, how they behave differently, and when each should be used in Selenium automation scripts.

---

## Conclusion
Session 22 covered the essential Selenium locators and methods to interact with web elements. Understanding locators and their differences is crucial for writing efficient and reliable automation scripts.

## Example Code
```java
// Example of using ID locator in Selenium WebDriver
WebElement elementById = driver.findElement(By.id("elementID"));

// Example of using Link Text locator in Selenium WebDriver
WebElement elementByLinkText = driver.findElement(By.linkText("Click Here"));

// Example of using Tag Name locator in Selenium WebDriver
List<WebElement> elementsByTagName = driver.findElements(By.tagName("button"));

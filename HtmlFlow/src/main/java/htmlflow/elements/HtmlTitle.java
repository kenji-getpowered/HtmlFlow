package htmlflow.elements;

public class HtmlTitle<T> extends HtmlTextElement<T, HtmlTitle<T>> {
  @Override
  public String getElementName() {
    return ElementType.TITLE.toString();
  }
}

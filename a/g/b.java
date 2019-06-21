package a.g;

import a.f.b.j;
import a.i.k;
import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/properties/ObservableProperty;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "initialValue", "(Ljava/lang/Object;)V", "value", "Ljava/lang/Object;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "beforeChange", "", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "getValue", "thisRef", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"})
public abstract class b<T>
  implements c<Object, T>
{
  private T value;

  public b(T paramT)
  {
    this.value = paramT;
  }

  public final void a(k<?> paramk, T paramT)
  {
    j.p(paramk, "property");
    a(paramk);
    this.value = paramT;
    j.p(paramk, "property");
  }

  protected boolean a(k<?> paramk)
  {
    j.p(paramk, "property");
    return true;
  }

  public final T b(k<?> paramk)
  {
    j.p(paramk, "property");
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.g.b
 * JD-Core Version:    0.6.2
 */
package a.a;

import a.f.b.a.e;
import a.l;
import java.util.AbstractList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/AbstractMutableList;", "E", "", "Ljava/util/AbstractList;", "()V", "add", "", "index", "", "element", "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
public abstract class c<E> extends AbstractList<E>
  implements e, List<E>
{
  public abstract int getSize();

  public final E remove(int paramInt)
  {
    return removeAt(paramInt);
  }

  public abstract E removeAt(int paramInt);

  public final int size()
  {
    return getSize();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.a.c
 * JD-Core Version:    0.6.2
 */
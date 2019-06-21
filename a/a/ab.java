package a.a;

import a.f.b.a.a;
import a.l;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/IntIterator;", "", "", "()V", "next", "()Ljava/lang/Integer;", "nextInt", "kotlin-stdlib"})
public abstract class ab
  implements a, Iterator<Integer>
{
  public abstract int nextInt();

  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.a.ab
 * JD-Core Version:    0.6.2
 */
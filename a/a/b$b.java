package a.a;

import a.f.b.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
class b$b
  implements a, Iterator<E>
{
  int index;

  public boolean hasNext()
  {
    AppMethodBeat.i(56068);
    boolean bool;
    if (this.index < this.AUD.size())
    {
      bool = true;
      AppMethodBeat.o(56068);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56068);
    }
  }

  public E next()
  {
    AppMethodBeat.i(56069);
    if (!hasNext())
    {
      localObject = (Throwable)new NoSuchElementException();
      AppMethodBeat.o(56069);
      throw ((Throwable)localObject);
    }
    Object localObject = this.AUD;
    int i = this.index;
    this.index = (i + 1);
    localObject = ((b)localObject).get(i);
    AppMethodBeat.o(56069);
    return localObject;
  }

  public void remove()
  {
    AppMethodBeat.i(56070);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56070);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.a.b.b
 * JD-Core Version:    0.6.2
 */
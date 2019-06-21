package a.a;

import a.f.b.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Enumeration;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/collections/CollectionsKt__IteratorsJVMKt$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
public final class n$a
  implements a, Iterator<T>
{
  public n$a(Enumeration<T> paramEnumeration)
  {
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(56160);
    boolean bool = this.AUL.hasMoreElements();
    AppMethodBeat.o(56160);
    return bool;
  }

  public final T next()
  {
    AppMethodBeat.i(56161);
    Object localObject = this.AUL.nextElement();
    AppMethodBeat.o(56161);
    return localObject;
  }

  public final void remove()
  {
    AppMethodBeat.i(56162);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56162);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.a.n.a
 * JD-Core Version:    0.6.2
 */
package a.j;

import a.f.a.b;
import a.f.b.a.a;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/sequences/FlatteningSequence$iterator$1", "", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
public final class f$a
  implements a, Iterator<E>
{
  private final Iterator<T> AUT;
  private Iterator<? extends E> BOB;

  f$a()
  {
    AppMethodBeat.i(55927);
    this.AUT = localObject.BOr.iterator();
    AppMethodBeat.o(55927);
  }

  private final boolean ekL()
  {
    AppMethodBeat.i(55926);
    Object localObject = this.BOB;
    if ((localObject != null) && (!((Iterator)localObject).hasNext()))
      this.BOB = null;
    boolean bool;
    if (this.BOB == null)
      if (!this.AUT.hasNext())
      {
        bool = false;
        AppMethodBeat.o(55926);
      }
    while (true)
    {
      return bool;
      localObject = this.AUT.next();
      localObject = (Iterator)this.BOC.BOA.am(this.BOC.BOz.am(localObject));
      if (!((Iterator)localObject).hasNext())
        break;
      this.BOB = ((Iterator)localObject);
      AppMethodBeat.o(55926);
      bool = true;
      continue;
      AppMethodBeat.o(55926);
      bool = true;
    }
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(55925);
    boolean bool = ekL();
    AppMethodBeat.o(55925);
    return bool;
  }

  public final E next()
  {
    AppMethodBeat.i(55924);
    if (!ekL())
    {
      localObject = (Throwable)new NoSuchElementException();
      AppMethodBeat.o(55924);
      throw ((Throwable)localObject);
    }
    Object localObject = this.BOB;
    if (localObject == null)
      j.dWJ();
    localObject = ((Iterator)localObject).next();
    AppMethodBeat.o(55924);
    return localObject;
  }

  public final void remove()
  {
    AppMethodBeat.i(55928);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(55928);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.j.f.a
 * JD-Core Version:    0.6.2
 */
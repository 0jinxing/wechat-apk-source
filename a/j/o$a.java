package a.j;

import a.f.a.b;
import a.f.b.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/sequences/TakeWhileSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
public final class o$a
  implements a, Iterator<T>
{
  private final Iterator<T> AUT;
  private int BOw;
  private T BOx;

  o$a()
  {
    AppMethodBeat.i(55917);
    this.AUT = localObject.BOr.iterator();
    this.BOw = -1;
    AppMethodBeat.o(55917);
  }

  private final void ekK()
  {
    AppMethodBeat.i(55914);
    if (this.AUT.hasNext())
    {
      Object localObject = this.AUT.next();
      if (((Boolean)this.BON.BOv.am(localObject)).booleanValue())
      {
        this.BOw = 1;
        this.BOx = localObject;
        AppMethodBeat.o(55914);
      }
    }
    while (true)
    {
      return;
      this.BOw = 0;
      AppMethodBeat.o(55914);
    }
  }

  public final boolean hasNext()
  {
    boolean bool = true;
    AppMethodBeat.i(55916);
    if (this.BOw == -1)
      ekK();
    if (this.BOw == 1)
      AppMethodBeat.o(55916);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(55916);
    }
  }

  public final T next()
  {
    AppMethodBeat.i(55915);
    if (this.BOw == -1)
      ekK();
    if (this.BOw == 0)
    {
      localObject = (Throwable)new NoSuchElementException();
      AppMethodBeat.o(55915);
      throw ((Throwable)localObject);
    }
    Object localObject = this.BOx;
    this.BOx = null;
    this.BOw = -1;
    AppMethodBeat.o(55915);
    return localObject;
  }

  public final void remove()
  {
    AppMethodBeat.i(55918);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(55918);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.j.o.a
 * JD-Core Version:    0.6.2
 */
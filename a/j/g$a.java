package a.j;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/sequences/GeneratorSequence$iterator$1", "", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
public final class g$a
  implements a.f.b.a.a, Iterator<T>
{
  private int BOw = -2;
  private T BOx;

  private final void ekK()
  {
    AppMethodBeat.i(55932);
    Object localObject1;
    if (this.BOw == -2)
    {
      localObject1 = this.BOF.BOD.invoke();
      this.BOx = localObject1;
      if (this.BOx != null)
        break label83;
    }
    label83: for (int i = 0; ; i = 1)
    {
      this.BOw = i;
      AppMethodBeat.o(55932);
      return;
      localObject1 = this.BOF.BOE;
      Object localObject2 = this.BOx;
      if (localObject2 == null)
        j.dWJ();
      localObject1 = ((b)localObject1).am(localObject2);
      break;
    }
  }

  public final boolean hasNext()
  {
    boolean bool = true;
    AppMethodBeat.i(55934);
    if (this.BOw < 0)
      ekK();
    if (this.BOw == 1)
      AppMethodBeat.o(55934);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(55934);
    }
  }

  public final T next()
  {
    AppMethodBeat.i(55933);
    if (this.BOw < 0)
      ekK();
    if (this.BOw == 0)
    {
      localObject = (Throwable)new NoSuchElementException();
      AppMethodBeat.o(55933);
      throw ((Throwable)localObject);
    }
    Object localObject = this.BOx;
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type T");
      AppMethodBeat.o(55933);
      throw ((Throwable)localObject);
    }
    this.BOw = -1;
    AppMethodBeat.o(55933);
    return localObject;
  }

  public final void remove()
  {
    AppMethodBeat.i(55935);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(55935);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.j.g.a
 * JD-Core Version:    0.6.2
 */
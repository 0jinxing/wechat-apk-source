package kotlinx.coroutines;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.a.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;", "", "isActive", "", "queue", "Lkotlinx/coroutines/internal/ArrayQueue;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(ZLkotlinx/coroutines/internal/ArrayQueue;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlinx-coroutines-core"})
public final class bu$a
{
  public final b<Runnable> BQU;
  public boolean csi;

  private bu$a(b<Runnable> paramb)
  {
    AppMethodBeat.i(118482);
    this.csi = false;
    this.BQU = paramb;
    AppMethodBeat.o(118482);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(118486);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof a))
        break label69;
      paramObject = (a)paramObject;
      if (this.csi == paramObject.csi)
      {
        i = 1;
        if ((i == 0) || (!j.j(this.BQU, paramObject.BQU)))
          break label69;
      }
    }
    else
    {
      AppMethodBeat.o(118486);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label69: AppMethodBeat.o(118486);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118485);
    boolean bool1 = this.csi;
    boolean bool2 = bool1;
    if (bool1)
      bool2 = true;
    b localb = this.BQU;
    if (localb != null);
    for (int i = localb.hashCode(); ; i = 0)
    {
      AppMethodBeat.o(118485);
      return i + bool2 * true;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(118484);
    String str = "EventLoop(isActive=" + this.csi + ", queue=" + this.BQU + ")";
    AppMethodBeat.o(118484);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bu.a
 * JD-Core Version:    0.6.2
 */
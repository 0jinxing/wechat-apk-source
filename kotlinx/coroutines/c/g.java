package kotlinx.coroutines.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/NanoTimeSource;", "Lkotlinx/coroutines/scheduling/TimeSource;", "()V", "nanoTime", "", "kotlinx-coroutines-core"})
public final class g extends n
{
  public static final g BSK;

  static
  {
    AppMethodBeat.i(118354);
    BSK = new g();
    AppMethodBeat.o(118354);
  }

  public final long nanoTime()
  {
    AppMethodBeat.i(118353);
    long l = System.nanoTime();
    AppMethodBeat.o(118353);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.g
 * JD-Core Version:    0.6.2
 */
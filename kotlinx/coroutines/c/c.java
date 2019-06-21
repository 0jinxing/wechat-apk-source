package kotlinx.coroutines.c;

import a.h.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.a.n;
import kotlinx.coroutines.w;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "()V", "IO", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIO", "()Lkotlinx/coroutines/CoroutineDispatcher;", "close", "", "toDebugString", "", "toString", "kotlinx-coroutines-core"})
public final class c extends d
{
  private static final w BQg;
  public static final c BSC;

  static
  {
    int i = 0;
    AppMethodBeat.i(118301);
    Object localObject = new c();
    BSC = (c)localObject;
    int j = n.e("kotlinx.coroutines.io.parallelism", e.im(64, n.elQ()), 0, 0, 12);
    if (j > 0)
      i = 1;
    if (i == 0)
    {
      localObject = (Throwable)new IllegalArgumentException("Expected positive parallelism level, but have ".concat(String.valueOf(j)).toString());
      AppMethodBeat.o(118301);
      throw ((Throwable)localObject);
    }
    BQg = (w)new f((d)localObject, j, l.BSQ);
    AppMethodBeat.o(118301);
  }

  public static w elk()
  {
    return BQg;
  }

  public final void close()
  {
    AppMethodBeat.i(118300);
    Throwable localThrowable = (Throwable)new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    AppMethodBeat.o(118300);
    throw localThrowable;
  }

  public final String toString()
  {
    return "DefaultDispatcher";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.e.a;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a
  implements b.a
{
  public final boolean isLoggable(String paramString, int paramInt)
  {
    AppMethodBeat.i(63704);
    boolean bool = Log.isLoggable(paramString, paramInt);
    AppMethodBeat.o(63704);
    return bool;
  }

  public final void println(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(63703);
    Log.println(paramInt, paramString1, paramString2);
    AppMethodBeat.o(63703);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.e.a.a
 * JD-Core Version:    0.6.2
 */
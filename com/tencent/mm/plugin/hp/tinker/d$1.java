package com.tencent.mm.plugin.hp.tinker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tinker.lib.util.a.a;

final class d$1
  implements a.a
{
  public final void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90644);
    ab.e(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(90644);
  }

  public final void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90642);
    ab.i(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(90642);
  }

  public final void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90645);
    ab.printErrStackTrace(paramString1, paramThrowable, paramString2, paramArrayOfObject);
    AppMethodBeat.o(90645);
  }

  public final void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(90643);
    ab.w(paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(90643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.d.1
 * JD-Core Version:    0.6.2
 */
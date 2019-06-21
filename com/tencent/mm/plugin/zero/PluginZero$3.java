package com.tencent.mm.plugin.zero;

import android.os.Process;
import com.tencent.e.a.b.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ab.a;

final class PluginZero$3
  implements b.a
{
  PluginZero$3(PluginZero paramPluginZero)
  {
  }

  public final boolean isLoggable(String paramString, int paramInt)
  {
    AppMethodBeat.i(58750);
    boolean bool;
    if ((paramInt >= 2) && (paramInt <= 7) && (PluginZero.access$100()[paramInt] >= ab.getLogLevel()))
    {
      bool = true;
      AppMethodBeat.o(58750);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(58750);
    }
  }

  public final void println(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(58749);
    if (!isLoggable(paramString1, paramInt))
      AppMethodBeat.o(58749);
    while (true)
    {
      return;
      ab.a locala = ab.dos();
      int i = Process.myPid();
      int j = Process.myTid();
      switch (paramInt)
      {
      default:
        AppMethodBeat.o(58749);
        break;
      case 2:
        locala.logV(paramString1, "", "", 0, i, j, i, paramString2);
        AppMethodBeat.o(58749);
        break;
      case 3:
        locala.logD(paramString1, "", "", 0, i, j, i, paramString2);
        AppMethodBeat.o(58749);
        break;
      case 4:
        locala.logI(paramString1, "", "", 0, i, j, i, paramString2);
        AppMethodBeat.o(58749);
        break;
      case 5:
        locala.logW(paramString1, "", "", 0, i, j, i, paramString2);
        AppMethodBeat.o(58749);
        break;
      case 6:
        locala.logE(paramString1, "", "", 0, i, j, i, paramString2);
        AppMethodBeat.o(58749);
        break;
      case 7:
        locala.logF(paramString1, "", "", 0, i, j, i, paramString2);
        AppMethodBeat.o(58749);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.PluginZero.3
 * JD-Core Version:    0.6.2
 */
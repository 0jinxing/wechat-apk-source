package com.tencent.mm.console.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.secinforeport.a.d;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class e
  implements a
{
  static
  {
    AppMethodBeat.i(16133);
    com.tencent.mm.pluginsdk.cmd.b.a(new e(), new String[] { "//normsg" });
    AppMethodBeat.o(16133);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(16132);
    if (!com.tencent.mm.sdk.a.b.dnO())
      AppMethodBeat.o(16132);
    while (true)
    {
      label21: return bool;
      if (paramArrayOfString.length < 2)
      {
        AppMethodBeat.o(16132);
        continue;
      }
      try
      {
        if (paramArrayOfString.length >= 3)
          Integer.valueOf(paramArrayOfString[2]).intValue();
        label55: paramString = paramArrayOfString[1].toLowerCase();
        long l1 = System.nanoTime();
        int i = -1;
        switch (paramString.hashCode())
        {
        default:
        case -1422437344:
        }
        while (true)
          switch (i)
          {
          default:
            AppMethodBeat.o(16132);
            break label21;
            if (paramString.equals("testrpp"))
              i = 0;
            break;
          case 0:
          }
        d.qjp.ff(0, 15);
        Toast.makeText(paramContext, "info is reported.", 0).show();
        long l2 = System.nanoTime();
        paramArrayOfString = String.format("[NorMsgTest] cmd: %s, time: %d ns.", new Object[] { paramArrayOfString[1], Long.valueOf(l2 - l1) });
        ab.i("MicroMsg.NorMsgTest", paramArrayOfString);
        Toast.makeText(paramContext, paramArrayOfString, 0).show();
        AppMethodBeat.o(16132);
        bool = true;
      }
      catch (Exception paramString)
      {
        break label55;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.e
 * JD-Core Version:    0.6.2
 */
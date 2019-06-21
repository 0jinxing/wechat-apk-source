package com.tencent.mm.console.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Method;

public final class k
  implements a
{
  static
  {
    AppMethodBeat.i(16145);
    b.a(new k(), new String[] { "//warpgate" });
    AppMethodBeat.o(16145);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(16144);
    if (ab.getLogLevel() > 1)
      AppMethodBeat.o(16144);
    while (true)
    {
      return bool;
      if (paramArrayOfString.length >= 2)
        break;
      AppMethodBeat.o(16144);
      bool = true;
    }
    paramContext = paramArrayOfString[1];
    int i = -1;
    switch (paramContext.hashCode())
    {
    default:
      label96: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case 3551:
    case 109935:
    case 109757538:
    case 3540994:
    }
    while (true)
    {
      AppMethodBeat.o(16144);
      bool = true;
      break;
      if (!paramContext.equals("on"))
        break label96;
      i = 0;
      break label96;
      if (!paramContext.equals("off"))
        break label96;
      i = 1;
      break label96;
      if (!paramContext.equals("start"))
        break label96;
      i = 2;
      break label96;
      if (!paramContext.equals("stop"))
        break label96;
      i = 3;
      break label96;
      com.tencent.mm.platformtools.ae.gjo = true;
      com.tencent.mm.platformtools.ae.gjn = true;
      continue;
      com.tencent.mm.platformtools.ae.gjo = false;
      com.tencent.mm.platformtools.ae.gjn = false;
      continue;
      i = 8888;
      if (paramArrayOfString.length >= 3)
        i = bo.getInt(paramArrayOfString[2], 8888);
      try
      {
        Class.forName("com.tencent.mm.plugin.sl_warpgate.server.WarpGateHttpServer").getMethod("startServer", new Class[] { Integer.TYPE }).invoke(null, new Object[] { Integer.valueOf(i) });
        Toast.makeText(ah.getContext(), "start server on ".concat(String.valueOf(i)), 1).show();
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.WarpgateCommand", paramContext, "", new Object[0]);
      }
      continue;
      try
      {
        Class.forName("com.tencent.mm.plugin.sl_warpgate.server.WarpGateHttpServer").getMethod("stopServer", new Class[0]).invoke(null, new Object[0]);
        Toast.makeText(ah.getContext(), "stop server", 1).show();
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.WarpgateCommand", paramContext, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.k
 * JD-Core Version:    0.6.2
 */
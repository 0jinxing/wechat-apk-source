package com.tencent.mm.console.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bp;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.t;

public final class n
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    AppMethodBeat.i(16151);
    b.a(new n(), new String[] { "//cleanwx", "//showfile", "//hidefile" });
    AppMethodBeat.o(16151);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(16150);
    paramArrayOfString = paramArrayOfString[0];
    int i = -1;
    switch (paramArrayOfString.hashCode())
    {
    default:
      switch (i)
      {
      default:
        AppMethodBeat.o(16150);
        bool = false;
      case 0:
      case 1:
      case 2:
      }
      break;
    case 2113467658:
    case -35508263:
    case -1470593122:
    }
    while (true)
    {
      return bool;
      if (!paramArrayOfString.equals("//cleanwx"))
        break;
      i = 0;
      break;
      if (!paramArrayOfString.equals("//showfile"))
        break;
      i = 1;
      break;
      if (!paramArrayOfString.equals("//hidefile"))
        break;
      i = 2;
      break;
      paramArrayOfString = new bp();
      com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfString);
      t.makeText(paramContext, "clean wx file index now.", 0).show();
      AppMethodBeat.o(16150);
      continue;
      try
      {
        g.RP().Ry().set(ac.a.xSU, Integer.valueOf(1));
        t.makeText(paramContext, "show file now.", 0).show();
        label202: AppMethodBeat.o(16150);
        continue;
        try
        {
          g.RP().Ry().set(ac.a.xSU, Integer.valueOf(0));
          t.makeText(paramContext, "hide file now.", 0).show();
          label237: AppMethodBeat.o(16150);
        }
        catch (Exception paramContext)
        {
          break label237;
        }
      }
      catch (Exception paramContext)
      {
        break label202;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.n
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.console.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ip;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;

public final class d
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    AppMethodBeat.i(16131);
    b.a(new d(), new String[] { "//hotpatch" });
    AppMethodBeat.o(16131);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(16130);
    boolean bool;
    if (ab.getLogLevel() > 1)
    {
      AppMethodBeat.o(16130);
      bool = false;
    }
    while (true)
    {
      label22: return bool;
      if (paramArrayOfString.length < 2)
      {
        AppMethodBeat.o(16130);
        bool = true;
      }
      else
      {
        paramString = paramArrayOfString[1];
        int i = -1;
        switch (paramString.hashCode())
        {
        default:
        case 93029230:
        case 3237038:
        case 94746189:
        case 94627080:
        }
        while (true)
          switch (i)
          {
          default:
            AppMethodBeat.o(16130);
            bool = true;
            break label22;
            if (paramString.equals("apply"))
            {
              i = 0;
              continue;
              if (paramString.equals("info"))
              {
                i = 1;
                continue;
                if (paramString.equals("clear"))
                {
                  i = 2;
                  continue;
                  if (paramString.equals("check"))
                    i = 3;
                }
              }
            }
            break;
          case 0:
          case 1:
          case 2:
          case 3:
          }
        if (paramArrayOfString.length < 3);
        for (paramArrayOfString = "/data/local/tmp/test.apk"; ; paramArrayOfString = paramArrayOfString[2])
        {
          ab.d("MicroMsg.CommandTestHotPatches", "hotpatch test from %s", new Object[] { paramArrayOfString });
          if (!com.tencent.tinker.lib.e.a.iX(paramContext).ABK)
            com.tencent.tinker.lib.e.a.iX(paramContext).bGr();
          aw.ZK();
          c.Ry().set(ac.a.xSD, Long.valueOf(System.currentTimeMillis() - 300000L));
          paramContext = new ip();
          paramContext.cDI.cDN = paramArrayOfString;
          com.tencent.mm.sdk.b.a.xxA.m(paramContext);
          AppMethodBeat.o(16130);
          bool = true;
          break;
        }
        ab.d("MicroMsg.CommandTestHotPatches", "hotpatch current class loader=%s", new Object[] { getClass().getClassLoader() });
        AppMethodBeat.o(16130);
        bool = true;
        continue;
        ab.d("MicroMsg.CommandTestHotPatches", "clear hotpatch");
        paramContext = new ip();
        paramContext.cDI.cuy = 1;
        com.tencent.mm.sdk.b.a.xxA.m(paramContext);
        AppMethodBeat.o(16130);
        bool = true;
        continue;
        if (paramArrayOfString.length < 3)
        {
          AppMethodBeat.o(16130);
          bool = true;
        }
        else
        {
          paramArrayOfString = paramArrayOfString[2];
          paramContext = paramArrayOfString;
          if (!paramArrayOfString.startsWith("/"))
            paramContext = "/data/data/com.tencent.mm/app_dex/".concat(String.valueOf(paramArrayOfString));
          ab.i("MicroMsg.CommandTestHotPatches", "hotpatch check patch file %s", new Object[] { paramContext });
          ab.i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
          ab.i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
          ab.i("MicroMsg.CommandTestHotPatches", "hotpatch check md5, passed=%b", new Object[] { Boolean.valueOf(SharePatchFileUtil.aus(paramContext)) });
          ab.i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
          AppMethodBeat.o(16130);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.d
 * JD-Core Version:    0.6.2
 */
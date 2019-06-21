package com.tencent.mm.plugin.downloader_app.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.a.d;
import com.tencent.mm.plugin.downloader_app.a.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public static boolean bU(String paramString, int paramInt)
  {
    AppMethodBeat.i(136202);
    boolean bool;
    if (biR() == null)
    {
      bool = false;
      AppMethodBeat.o(136202);
    }
    while (true)
    {
      return bool;
      a locala = new a();
      locala.field_appId = paramString;
      locala.field_status = paramInt;
      locala.field_modifyTime = System.currentTimeMillis();
      bool = biR().a(locala);
      AppMethodBeat.o(136202);
    }
  }

  public static c biR()
  {
    c localc = null;
    AppMethodBeat.i(136201);
    if (g.RN().QY())
    {
      g.RN();
      if (!com.tencent.mm.kernel.a.QT());
    }
    else
    {
      ab.e("MicroMsg.DownloadTaskItemDbHelp", "no user login");
      AppMethodBeat.o(136201);
    }
    while (true)
    {
      return localc;
      if (g.K(d.class) == null)
      {
        ab.e("MicroMsg.DownloadTaskItemDbHelp", "service not ready");
        AppMethodBeat.o(136201);
      }
      else
      {
        localc = ((e)g.K(e.class)).biA();
        AppMethodBeat.o(136201);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.d.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.game.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.protocal.protobuf.bri;
import com.tencent.mm.protocal.protobuf.brj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;

public final class a
{
  public static void iN(long paramLong)
  {
    AppMethodBeat.i(111183);
    Object localObject = c.hv(paramLong);
    if (localObject == null)
    {
      ab.i("MicroMsg.ReportDownloadAppState", "report, info is null");
      AppMethodBeat.o(111183);
    }
    while (true)
    {
      return;
      if (!((com.tencent.mm.plugin.downloader.f.a)localObject).field_fromWeApp)
      {
        ab.i("MicroMsg.ReportDownloadAppState", "report,not from weApp, return");
        AppMethodBeat.o(111183);
      }
      else
      {
        if ((((com.tencent.mm.plugin.downloader.f.a)localObject).field_status != 3) || (e.ct(((com.tencent.mm.plugin.downloader.f.a)localObject).field_filePath)))
          break;
        ab.i("MicroMsg.ReportDownloadAppState", "download success, but file not exist");
        AppMethodBeat.o(111183);
      }
    }
    bri localbri = new bri();
    localbri.fKh = ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId;
    if (((com.tencent.mm.plugin.downloader.f.a)localObject).field_status == 3)
      localbri.jBT = a.a.mTB;
    while (true)
    {
      localObject = new b.a();
      ((b.a)localObject).fsI = 2683;
      ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/reportappdownloadstatus";
      ((b.a)localObject).fsJ = localbri;
      ((b.a)localObject).fsK = new brj();
      ((b.a)localObject).fsL = 0;
      ((b.a)localObject).fsM = 0;
      w.a(((b.a)localObject).acD(), new w.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, m paramAnonymousm)
        {
          AppMethodBeat.i(111182);
          ab.i("MicroMsg.ReportDownloadAppState", "doCgi, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          AppMethodBeat.o(111182);
          return 0;
        }
      });
      AppMethodBeat.o(111183);
      break;
      if (((com.tencent.mm.plugin.downloader.f.a)localObject).field_status == 4)
        localbri.jBT = a.a.DOWNLOAD_STATUS_FAILED;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.c.a
 * JD-Core Version:    0.6.2
 */
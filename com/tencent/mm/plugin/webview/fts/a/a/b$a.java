package com.tencent.mm.plugin.webview.fts.a.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cvv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.List;

final class b$a
  implements Runnable
{
  boolean isStopped;
  int lWS = 0;
  List<cvv> list;
  ak mHandler;

  public b$a(List<cvv> paramList)
  {
    this.list = paramList;
  }

  private void cWs()
  {
    AppMethodBeat.i(5768);
    this.mHandler.postDelayed(this, 500L);
    AppMethodBeat.o(5768);
  }

  public final void run()
  {
    AppMethodBeat.i(5767);
    try
    {
      int i = this.lWS + 1;
      this.lWS = i;
      if (i > this.list.size())
      {
        ab.i("WidgetPkgPreDownloadMgr", "download over, index %d", new Object[] { Integer.valueOf(this.lWS) });
        this.list = null;
        Thread.currentThread().interrupt();
        this.mHandler = null;
        AppMethodBeat.o(5767);
      }
      while (true)
      {
        return;
        cvv localcvv = (cvv)this.list.get(this.lWS - 1);
        ab.i("WidgetPkgPreDownloadMgr", "try to download pkg appid %s, md5 %s", new Object[] { localcvv.csB, localcvv.xrN });
        if (localcvv != null)
        {
          if ((TextUtils.isEmpty(localcvv.csB)) || (TextUtils.isEmpty(localcvv.xrN)) || (TextUtils.isEmpty(localcvv.xrO)))
          {
            ab.e("WidgetPkgPreDownloadMgr", "invalid appinfo");
            cWs();
            AppMethodBeat.o(5767);
          }
          else
          {
            ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.K(com.tencent.mm.modelappbrand.g.class)).a(localcvv.csB, localcvv.vOP, localcvv.xrN, localcvv.xrO);
            if (((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.K(com.tencent.mm.modelappbrand.g.class)).S(localcvv.csB, localcvv.vOP))
            {
              ab.i("WidgetPkgPreDownloadMgr", "pkg exist,run next");
              cWs();
              AppMethodBeat.o(5767);
            }
            else
            {
              ab.i("WidgetPkgPreDownloadMgr", "pkg not exist,starting download");
              h.pYm.k(918L, 1L, 1L);
              long l = System.currentTimeMillis();
              com.tencent.mm.modelappbrand.g localg = (com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.K(com.tencent.mm.modelappbrand.g.class);
              String str1 = localcvv.csB;
              i = localcvv.vOP;
              String str2 = localcvv.xrO;
              b.a.1 local1 = new com/tencent/mm/plugin/webview/fts/a/a/b$a$1;
              local1.<init>(this, localcvv, l);
              localg.a(str1, i, str2, local1);
            }
          }
        }
        else
          AppMethodBeat.o(5767);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("WidgetPkgPreDownloadMgr", localException, "", new Object[0]);
        AppMethodBeat.o(5767);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.a.a.b.a
 * JD-Core Version:    0.6.2
 */
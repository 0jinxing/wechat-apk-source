package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader;
import com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback;
import com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class h$1
  implements Runnable
{
  h$1(WepkgDownloadProcessTask paramWepkgDownloadProcessTask, a parama, int paramInt1, String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, String paramString5, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63567);
    WePkgDownloader.IWepkgUpdateCallback local1 = new WePkgDownloader.IWepkgUpdateCallback()
    {
      public final void a(String paramAnonymousString1, String paramAnonymousString2, WePkgDownloader.IWepkgUpdateCallback.RetCode paramAnonymousRetCode)
      {
        AppMethodBeat.i(63566);
        ab.i("MicroMsg.Wepkg.WepkgProcessTaskPerformer", "onPkgUpdatingCallback errCode:%s", new Object[] { paramAnonymousRetCode });
        h.1.this.uXs.cSY = paramAnonymousString1;
        h.1.this.uXs.gSP = paramAnonymousString2;
        h.1.this.uXs.uXg = paramAnonymousRetCode;
        if (h.1.this.uXt != null)
          h.1.this.uXt.a(h.1.this.uXs);
        AppMethodBeat.o(63566);
      }
    };
    if (this.uHY == 1)
    {
      WePkgDownloader.dgx().a(this.mXE, local1);
      AppMethodBeat.o(63567);
    }
    while (true)
    {
      return;
      WePkgDownloader.dgx().a(this.uHY, bo.nullAsNil(this.mXE), "", bo.nullAsNil(this.uXu), bo.nullAsNil(this.val$downloadUrl), this.uXv, bo.nullAsNil(this.uGc), "", bo.nullAsNil(this.iRf), this.uXw, local1);
      AppMethodBeat.o(63567);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.h.1
 * JD-Core Version:    0.6.2
 */
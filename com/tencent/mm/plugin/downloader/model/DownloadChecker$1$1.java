package com.tencent.mm.plugin.downloader.model;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.xweb.WebView;
import java.lang.ref.WeakReference;

final class DownloadChecker$1$1
  implements Runnable
{
  DownloadChecker$1$1(DownloadChecker.1 param1, DownloadChecker.DownloadInterceptBean paramDownloadInterceptBean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2342);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((this.kMm.kMk != null) && (this.kMm.kMk.get() != null))
    {
      localObject1 = (WebView)this.kMm.kMk.get();
      if (localObject1 != null)
      {
        localObject2 = ((WebView)localObject1).getContext();
        localObject3 = localObject1;
        localObject1 = localObject2;
      }
    }
    while (true)
    {
      if ((this.kMl == null) || (!this.kMl.csN))
      {
        if (localObject3 != null)
        {
          localObject3.loadUrl(this.kMm.val$downloadUrl);
          ab.i("MicroMsg.DownloadChecker", "reload apk");
          AppMethodBeat.o(2342);
        }
      }
      else
      {
        ab.i("MicroMsg.DownloadChecker", "confirm type: %d", new Object[] { Integer.valueOf(this.kMl.kMp) });
        if (localObject1 != null)
          break label590;
        localObject1 = ah.getContext();
      }
      label590: 
      while (true)
      {
        switch (this.kMl.kMp)
        {
        default:
        case 0:
        case 1:
        case 2:
        }
        while (true)
        {
          AppMethodBeat.o(2342);
          break;
          if (!at.isNetworkConnected(ah.getContext()))
          {
            Toast.makeText(ah.getContext(), ah.getContext().getString(2131300251), 0).show();
            ab.i("MicroMsg.DownloadChecker", "startDownload fail, network not ready");
            AppMethodBeat.o(2342);
            break;
          }
          if ((at.isWifi(ah.getContext())) || (!(localObject1 instanceof MMActivity)) || (((MMActivity)localObject1).isFinishing()))
          {
            if (((IPCLong)f.a("com.tencent.mm", this.kMl, DownloadChecker.a.class)).value > 0L)
              Toast.makeText(ah.getContext(), ah.getContext().getString(2131305895), 0).show();
            AppMethodBeat.o(2342);
            break;
          }
          h.a((Context)localObject1, ah.getResources().getString(2131305542), ah.getResources().getString(2131305543), ah.getResources().getString(2131305537), ah.getResources().getString(2131296868), false, new DownloadChecker.1.1.1(this), new DownloadChecker.1.1.2(this), 2131690683);
          AppMethodBeat.o(2342);
          break;
          localObject2 = new Intent();
          ((Intent)localObject2).setClassName((Context)localObject1, "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
          ((Intent)localObject2).putExtra("task_name", this.kMl.appName);
          ((Intent)localObject2).putExtra("title", this.kMl.appName);
          ((Intent)localObject2).putExtra("thumb_url", this.kMl.iconUrl);
          ((Intent)localObject2).putExtra("task_url", this.kMl.downloadUrl);
          ((Intent)localObject2).putExtra("alternative_url", this.kMl.kMr);
          ((Intent)localObject2).putExtra("task_size", this.kMl.size);
          ((Intent)localObject2).putExtra("file_md5", this.kMl.cvZ);
          ((Intent)localObject2).putExtra("fileType", 1);
          ((Intent)localObject2).putExtra("appid", this.kMl.appId);
          ((Intent)localObject2).putExtra("package_name", this.kMl.packageName);
          if (localObject3 != null)
            ((Intent)localObject2).putExtra("page_url", localObject3.getUrl());
          ((Intent)localObject2).putExtra("page_scene", -1);
          ((Intent)localObject2).putExtra("task_scene", 8070);
          ((Intent)localObject2).addFlags(268435456);
          ah.getContext().startActivity((Intent)localObject2);
          AppMethodBeat.o(2342);
          break;
          ab.i("MicroMsg.DownloadChecker", "coonfirm url: %s", new Object[] { this.kMl.kMq });
        }
      }
      localObject2 = null;
      localObject3 = localObject1;
      localObject1 = localObject2;
      continue;
      localObject1 = null;
      localObject3 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.DownloadChecker.1.1
 * JD-Core Version:    0.6.2
 */
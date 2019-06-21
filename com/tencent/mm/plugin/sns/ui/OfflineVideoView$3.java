package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.vfs.e;

final class OfflineVideoView$3
  implements Runnable
{
  OfflineVideoView$3(OfflineVideoView paramOfflineVideoView, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38362);
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    k.a(this.rld.getContext(), localIntent, e.asY(this.mqo), "video/*");
    try
    {
      this.rld.getContext().startActivity(localIntent);
      AppMethodBeat.o(38362);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.OfflineVideoView", "startActivity fail, activity not found");
        h.g(this.rld.getContext(), 2131299668, 2131299669);
        AppMethodBeat.o(38362);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OfflineVideoView.3
 * JD-Core Version:    0.6.2
 */
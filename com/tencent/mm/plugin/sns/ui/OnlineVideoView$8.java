package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.vfs.e;

final class OnlineVideoView$8
  implements Runnable
{
  OnlineVideoView$8(OnlineVideoView paramOnlineVideoView, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38397);
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    k.a(this.rly.getContext(), localIntent, e.asY(this.mqo), "video/*");
    try
    {
      this.rly.getContext().startActivity(localIntent);
      AppMethodBeat.o(38397);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.OnlineVideoView", "startActivity fail, activity not found");
        h.g(this.rly.getContext(), 2131299668, 2131299669);
        AppMethodBeat.o(38397);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.8
 * JD-Core Version:    0.6.2
 */
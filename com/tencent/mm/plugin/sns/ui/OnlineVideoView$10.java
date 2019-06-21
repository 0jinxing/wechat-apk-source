package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class OnlineVideoView$10
  implements Runnable
{
  OnlineVideoView$10(OnlineVideoView paramOnlineVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38399);
    if (OnlineVideoView.d(this.rly) != null)
      if (bo.isNullOrNil(OnlineVideoView.d(this.rly).getVideoPath()))
      {
        ab.i("MicroMsg.OnlineVideoView", "%d had not set video path to play", new Object[] { Integer.valueOf(this.rly.hashCode()) });
        String str = aq.a(OnlineVideoView.a(this.rly), OnlineVideoView.e(this.rly));
        if (!bo.isNullOrNil(str))
          this.rly.bq(str, false);
        AppMethodBeat.o(38399);
      }
    while (true)
    {
      return;
      if (!OnlineVideoView.d(this.rly).isPlaying())
      {
        OnlineVideoView.d(this.rly).start();
        AppMethodBeat.o(38399);
      }
      else
      {
        AppMethodBeat.o(38399);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.10
 * JD-Core Version:    0.6.2
 */
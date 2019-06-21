package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.sdk.platformtools.ab;

final class OnlineVideoView$9
  implements Runnable
{
  OnlineVideoView$9(OnlineVideoView paramOnlineVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38398);
    ab.w("MicroMsg.OnlineVideoView", "%d deal sns video change isOnlinePlay[%b]", new Object[] { Integer.valueOf(this.rly.hashCode()), Boolean.valueOf(OnlineVideoView.x(this.rly)) });
    if (OnlineVideoView.x(this.rly))
    {
      OnlineVideoView.y(this.rly);
      OnlineVideoView.d(this.rly).stop();
      this.rly.cse();
      String str = aq.D(OnlineVideoView.e(this.rly));
      boolean bool = com.tencent.mm.vfs.e.deleteFile(str);
      if (OnlineVideoView.k(this.rly) != null)
      {
        OnlineVideoView.k(this.rly).csk();
        OnlineVideoView.k(this.rly).clear();
        OnlineVideoView.a(this.rly, new ae(this.rly));
      }
      ab.i("MicroMsg.OnlineVideoView", "%d delete video file[%b] [%s]", new Object[] { Integer.valueOf(this.rly.hashCode()), Boolean.valueOf(bool), str });
      OnlineVideoView.z(this.rly);
      OnlineVideoView.A(this.rly);
    }
    AppMethodBeat.o(38398);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.9
 * JD-Core Version:    0.6.2
 */
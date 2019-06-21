package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.sdk.platformtools.ab;

final class OnlineVideoView$6
  implements e.e
{
  OnlineVideoView$6(OnlineVideoView paramOnlineVideoView)
  {
  }

  public final void bQL()
  {
    AppMethodBeat.i(38395);
    ab.i("MicroMsg.OnlineVideoView", "%d on texture update.", new Object[] { Integer.valueOf(this.rly.hashCode()) });
    try
    {
      OnlineVideoView.m(this.rly);
      AppMethodBeat.o(38395);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.OnlineVideoView", "texture view update. error " + localException.toString());
        AppMethodBeat.o(38395);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.6
 * JD-Core Version:    0.6.2
 */
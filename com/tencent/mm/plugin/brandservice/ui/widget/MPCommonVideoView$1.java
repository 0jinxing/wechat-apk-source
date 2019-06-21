package com.tencent.mm.plugin.brandservice.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;

final class MPCommonVideoView$1
  implements Runnable
{
  MPCommonVideoView$1(MPCommonVideoView paramMPCommonVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138056);
    if (MPCommonVideoView.a(this.jZf) != null)
      MPCommonVideoView.b(this.jZf).setOneTimeVideoTextureUpdateCallback(this.jZf);
    AppMethodBeat.o(138056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPCommonVideoView.1
 * JD-Core Version:    0.6.2
 */
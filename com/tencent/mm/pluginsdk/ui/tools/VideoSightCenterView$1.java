package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoSightCenterView$1
  implements b.e
{
  VideoSightCenterView$1(VideoSightCenterView paramVideoSightCenterView)
  {
  }

  public final void c(b paramb, int paramInt)
  {
    AppMethodBeat.i(70397);
    if (-1 == paramInt)
    {
      ab.i("MicroMsg.VideoSightCenterView", "error stop, isCompletion: %s", new Object[] { Boolean.valueOf(VideoSightCenterView.a(this.vvy)) });
      if ((this.vvy.llE == null) || (VideoSightCenterView.a(this.vvy)))
        break label115;
      this.vvy.llE.onError(0, 0);
      AppMethodBeat.o(70397);
    }
    while (true)
    {
      return;
      if (paramInt == 0)
      {
        ab.i("MicroMsg.VideoSightCenterView", "normal stop");
        VideoSightCenterView.b(this.vvy);
        if (this.vvy.llE != null)
          this.vvy.llE.EA();
      }
      label115: AppMethodBeat.o(70397);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView.1
 * JD-Core Version:    0.6.2
 */
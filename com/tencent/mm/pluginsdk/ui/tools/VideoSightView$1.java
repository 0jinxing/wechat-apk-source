package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;

final class VideoSightView$1
  implements b.e
{
  VideoSightView$1(VideoSightView paramVideoSightView)
  {
  }

  public final void c(b paramb, int paramInt)
  {
    AppMethodBeat.i(70415);
    if (-1 == paramInt)
    {
      if (this.vvC.llE == null)
        break label66;
      this.vvC.llE.onError(0, 0);
      AppMethodBeat.o(70415);
    }
    while (true)
    {
      return;
      if ((paramInt == 0) && (this.vvC.llE != null))
        this.vvC.llE.EA();
      label66: AppMethodBeat.o(70415);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoSightView.1
 * JD-Core Version:    0.6.2
 */
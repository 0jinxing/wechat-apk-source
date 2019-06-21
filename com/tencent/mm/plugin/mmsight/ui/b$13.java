package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$13
  implements ap.a
{
  b$13(b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(55161);
    if ((b.f(this.oBV) != null) && (b.f(this.oBV).isPlaying()))
    {
      if ((b.c(this.oBV) <= 0) || (b.f(this.oBV).getCurrentPosition() < b.c(this.oBV)))
        break label111;
      b.f(this.oBV).d(b.s(this.oBV), true);
      b.w(this.oBV).setCurrentCursorPosition(b.s(this.oBV) / b.d(this.oBV));
    }
    while (true)
    {
      AppMethodBeat.o(55161);
      return true;
      label111: b.w(this.oBV).setCurrentCursorPosition(b.f(this.oBV).getCurrentPosition() / b.d(this.oBV));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.13
 * JD-Core Version:    0.6.2
 */
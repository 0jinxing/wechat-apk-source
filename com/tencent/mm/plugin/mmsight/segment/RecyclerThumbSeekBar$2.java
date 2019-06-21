package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;

final class RecyclerThumbSeekBar$2
  implements Runnable
{
  RecyclerThumbSeekBar$2(RecyclerThumbSeekBar paramRecyclerThumbSeekBar)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54978);
    if ((this.oyy.getHeight() == 0) || (this.oyy.getWidth() == 0))
    {
      this.oyy.post(RecyclerThumbSeekBar.e(this.oyy));
      AppMethodBeat.o(54978);
    }
    while (true)
    {
      return;
      RecyclerThumbSeekBar.a(this.oyy, this.oyy.getHeight());
      RecyclerThumbSeekBar.b(this.oyy, (this.oyy.getWidth() - RecyclerThumbSeekBar.f(this.oyy) * 2) / 12);
      d.post(new RecyclerThumbSeekBar.2.1(this), "check duration of ");
      AppMethodBeat.o(54978);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.2
 * JD-Core Version:    0.6.2
 */
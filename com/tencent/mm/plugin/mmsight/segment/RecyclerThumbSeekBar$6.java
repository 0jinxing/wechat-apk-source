package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class RecyclerThumbSeekBar$6
  implements n.a
{
  RecyclerThumbSeekBar$6(RecyclerThumbSeekBar paramRecyclerThumbSeekBar)
  {
  }

  public final void bQm()
  {
    AppMethodBeat.i(54982);
    if ((RecyclerThumbSeekBar.p(this.oyy) != null) && (RecyclerThumbSeekBar.m(this.oyy) != null))
    {
      c.b localb = RecyclerThumbSeekBar.p(this.oyy);
      this.oyy.bQa();
      this.oyy.bQb();
      localb.bQc();
    }
    AppMethodBeat.o(54982);
  }

  public final void bQn()
  {
    AppMethodBeat.i(54983);
    if ((RecyclerThumbSeekBar.p(this.oyy) != null) && (RecyclerThumbSeekBar.m(this.oyy) != null))
      RecyclerThumbSeekBar.p(this.oyy).V(this.oyy.bQa(), this.oyy.bQb());
    AppMethodBeat.o(54983);
  }

  public final void iZ(boolean paramBoolean)
  {
    AppMethodBeat.i(54984);
    if ((RecyclerThumbSeekBar.p(this.oyy) != null) && (RecyclerThumbSeekBar.m(this.oyy) != null))
      RecyclerThumbSeekBar.p(this.oyy).W(this.oyy.bQa(), this.oyy.bQb());
    if (paramBoolean)
    {
      RecyclerThumbSeekBar.m(this.oyy).w(true, RecyclerThumbSeekBar.l(this.oyy).getLeftSliderBound());
      AppMethodBeat.o(54984);
    }
    while (true)
    {
      return;
      RecyclerThumbSeekBar.m(this.oyy).w(false, RecyclerThumbSeekBar.l(this.oyy).getWidth() - RecyclerThumbSeekBar.l(this.oyy).getRightSliderBound());
      AppMethodBeat.o(54984);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.6
 * JD-Core Version:    0.6.2
 */
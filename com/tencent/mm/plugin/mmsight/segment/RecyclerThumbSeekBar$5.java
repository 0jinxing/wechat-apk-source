package com.tencent.mm.plugin.mmsight.segment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RecyclerThumbSeekBar$5 extends RecyclerView.m
{
  RecyclerThumbSeekBar$5(RecyclerThumbSeekBar paramRecyclerThumbSeekBar)
  {
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(54981);
    if ((paramInt == 0) && (RecyclerThumbSeekBar.p(this.oyy) != null))
      RecyclerThumbSeekBar.p(this.oyy).U(this.oyy.bQa(), this.oyy.bQb());
    AppMethodBeat.o(54981);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.5
 * JD-Core Version:    0.6.2
 */
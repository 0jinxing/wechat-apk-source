package com.tencent.mm.plugin.mmsight.segment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RecyclerThumbSeekBar$c extends RecyclerView.a<RecyclerThumbSeekBar.e>
{
  RecyclerThumbSeekBar.d oyD;
  int oyE;
  int oyF;
  private View oyG;
  private View oyH;

  private RecyclerThumbSeekBar$c(RecyclerThumbSeekBar paramRecyclerThumbSeekBar)
  {
    AppMethodBeat.i(54988);
    this.oyD = new RecyclerThumbSeekBar.d(this.oyy);
    this.oyE = RecyclerThumbSeekBar.f(this.oyy);
    this.oyF = RecyclerThumbSeekBar.f(this.oyy);
    AppMethodBeat.o(54988);
  }

  public final int getItemCount()
  {
    int i = 0;
    AppMethodBeat.i(54991);
    if (RecyclerThumbSeekBar.i(this.oyy) <= 0)
      AppMethodBeat.o(54991);
    while (true)
    {
      return i;
      i = Math.max(0, (int)Math.floor(RecyclerThumbSeekBar.i(this.oyy) / RecyclerThumbSeekBar.b(this.oyy))) + 2;
      AppMethodBeat.o(54991);
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(54989);
    if (paramInt == 0)
    {
      paramInt = 1;
      AppMethodBeat.o(54989);
    }
    while (true)
    {
      return paramInt;
      if (paramInt == getItemCount() - 1)
      {
        paramInt = 2;
        AppMethodBeat.o(54989);
      }
      else
      {
        paramInt = 0;
        AppMethodBeat.o(54989);
      }
    }
  }

  public final void w(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(54990);
    if (paramBoolean)
    {
      if (this.oyG != null)
        this.oyG.setMinimumWidth(paramInt);
      if (((LinearLayoutManager)RecyclerThumbSeekBar.n(this.oyy).getLayoutManager()).iQ() == 0)
        RecyclerThumbSeekBar.n(this.oyy).scrollBy(paramInt - this.oyE, 0);
      this.oyE = paramInt;
      AppMethodBeat.o(54990);
    }
    while (true)
    {
      return;
      this.oyF = paramInt;
      if (this.oyH != null)
        this.oyH.setMinimumWidth(this.oyF);
      AppMethodBeat.o(54990);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.mmsight.segment;

import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ab;

final class RecyclerThumbSeekBar$3
  implements Runnable
{
  RecyclerThumbSeekBar$3(RecyclerThumbSeekBar paramRecyclerThumbSeekBar)
  {
  }

  public final void run()
  {
    int i = 1000;
    AppMethodBeat.i(54979);
    try
    {
      RecyclerThumbSeekBar.l(this.oyy).setCursorPos(-1.0F);
      Object localObject1 = this.oyy;
      Object localObject2 = new com/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBar$c;
      ((RecyclerThumbSeekBar.c)localObject2).<init>(this.oyy, (byte)0);
      RecyclerThumbSeekBar.a((RecyclerThumbSeekBar)localObject1, (RecyclerThumbSeekBar.c)localObject2);
      int j = RecyclerThumbSeekBar.e(this.oyy, RecyclerThumbSeekBar.j(this.oyy).duration * 1000 + 1000);
      localObject2 = this.oyy;
      if (RecyclerThumbSeekBar.b(this.oyy) <= 1000);
      while (true)
      {
        int k = RecyclerThumbSeekBar.e((RecyclerThumbSeekBar)localObject2, i);
        RecyclerThumbSeekBar.f(this.oyy, (this.oyy.getWidth() - j) / 2);
        localObject2 = RecyclerThumbSeekBar.l(this.oyy);
        i = RecyclerThumbSeekBar.f(this.oyy);
        localObject1 = new com/tencent/mm/plugin/mmsight/segment/n$1;
        ((n.1)localObject1).<init>((n)localObject2, j, i, k);
        ((n)localObject2).post((Runnable)localObject1);
        ab.i("RecyclerThumbSeekBar", "RecyclerThumbSeekBar.run(212) width %d", new Object[] { Integer.valueOf(this.oyy.getWidth()) });
        RecyclerThumbSeekBar.m(this.oyy).oyF = (this.oyy.getWidth() - RecyclerThumbSeekBar.f(this.oyy) - j);
        RecyclerThumbSeekBar.m(this.oyy).oyE = RecyclerThumbSeekBar.f(this.oyy);
        RecyclerThumbSeekBar.n(this.oyy).setAdapter(RecyclerThumbSeekBar.m(this.oyy));
        ab.d("RecyclerThumbSeekBar", "init segment thumb fetcher end, adapter.getItemCount() %d", new Object[] { Integer.valueOf(RecyclerThumbSeekBar.m(this.oyy).getItemCount()) });
        if (RecyclerThumbSeekBar.o(this.oyy) != null)
          RecyclerThumbSeekBar.o(this.oyy).iY(false);
        AppMethodBeat.o(54979);
        return;
        i = RecyclerThumbSeekBar.b(this.oyy);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("RecyclerThumbSeekBar", localException, "RecyclerThumbSeekBar notifySuccess error : %s", new Object[] { localException.getMessage() });
        if (RecyclerThumbSeekBar.o(this.oyy) != null)
          RecyclerThumbSeekBar.o(this.oyy).iY(true);
        AppMethodBeat.o(54979);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.3
 * JD-Core Version:    0.6.2
 */
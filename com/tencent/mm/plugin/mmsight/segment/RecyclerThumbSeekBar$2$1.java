package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ab;

final class RecyclerThumbSeekBar$2$1
  implements Runnable
{
  RecyclerThumbSeekBar$2$1(RecyclerThumbSeekBar.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54977);
    try
    {
      d locald = RecyclerThumbSeekBar.g(this.oyz.oyy).bQd();
      RecyclerThumbSeekBar.c(this.oyz.oyy, locald.getDurationMs());
      RecyclerThumbSeekBar.g(this.oyz.oyy).a(locald);
      i = 1;
      if (i == 0)
      {
        RecyclerThumbSeekBar.h(this.oyz.oyy);
        AppMethodBeat.o(54977);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("RecyclerThumbSeekBar", localException, "Try to init fetcher error : %s", new Object[] { localException.getMessage() });
        int i = 0;
        continue;
        if (RecyclerThumbSeekBar.i(this.oyz.oyy) >= 10000)
          RecyclerThumbSeekBar.d(this.oyz.oyy, RecyclerThumbSeekBar.j(this.oyz.oyy).duration * 1000 / 10);
        while (true)
        {
          ab.d("RecyclerThumbSeekBar", "duration %d interval %d", new Object[] { Integer.valueOf(RecyclerThumbSeekBar.i(this.oyz.oyy)), Integer.valueOf(RecyclerThumbSeekBar.b(this.oyz.oyy)) });
          RecyclerThumbSeekBar.k(this.oyz.oyy);
          AppMethodBeat.o(54977);
          break;
          if (RecyclerThumbSeekBar.i(this.oyz.oyy) <= 0)
            break label245;
          RecyclerThumbSeekBar.d(this.oyz.oyy, RecyclerThumbSeekBar.i(this.oyz.oyy) / 10);
        }
        label245: ab.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar duration invalid %d", new Object[] { Integer.valueOf(RecyclerThumbSeekBar.i(this.oyz.oyy)) });
        RecyclerThumbSeekBar.h(this.oyz.oyy);
        AppMethodBeat.o(54977);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.2.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.mmsight.segment;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

final class RecyclerThumbSeekBar$d
{
  ak handler;
  int ovf;
  HandlerThread[] oyI;
  int oyJ;
  private BlockingDeque<RecyclerThumbSeekBar.b> oyK;

  public RecyclerThumbSeekBar$d(RecyclerThumbSeekBar paramRecyclerThumbSeekBar)
  {
    AppMethodBeat.i(54994);
    this.handler = new ak();
    this.ovf = 4;
    this.oyJ = 0;
    this.oyK = new LinkedBlockingDeque();
    this.oyI = new HandlerThread[this.ovf];
    for (int i = 0; i < this.oyI.length; i++)
    {
      this.oyI[i] = d.ek("RecyclerThumbSeekBar_SimpleImageLoader_".concat(String.valueOf(i)), -1);
      this.oyI[i].start();
    }
    this.oyJ = 0;
    AppMethodBeat.o(54994);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.d
 * JD-Core Version:    0.6.2
 */
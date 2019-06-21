package com.tencent.mm.audio.mix.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class d
{
  public int channels = 2;
  public String ckD;
  public long ckG = 0L;
  public boolean ckH = false;
  public int cku = 2;
  public byte[] ckv;
  public int sampleRate = 44100;

  public final void reset()
  {
    AppMethodBeat.i(136978);
    this.sampleRate = 44100;
    this.channels = 44100;
    this.cku = 2;
    this.ckD = "";
    this.ckG = 0L;
    if (this.ckv != null)
      Arrays.fill(this.ckv, 0, this.ckv.length, (byte)0);
    AppMethodBeat.o(136978);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.a.d
 * JD-Core Version:    0.6.2
 */
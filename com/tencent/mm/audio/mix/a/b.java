package com.tencent.mm.audio.mix.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class b
{
  public int channels;
  public int cku;
  public byte[] ckv;
  public volatile LinkedList<String> ckw;
  public int sampleRate;

  public b()
  {
    AppMethodBeat.i(136960);
    this.sampleRate = 0;
    this.channels = 0;
    this.cku = 2;
    this.ckw = new LinkedList();
    AppMethodBeat.o(136960);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.a.b
 * JD-Core Version:    0.6.2
 */
package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  public final int bdU;
  public final int brf;
  public final int brg;
  public final int brh;
  public final int bri;
  public final long brj;
  public final int channels;
  public final int sampleRate;

  public f(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(95875);
    paramArrayOfByte = new k(paramArrayOfByte);
    paramArrayOfByte.setPosition(136);
    this.brf = paramArrayOfByte.ed(16);
    this.brg = paramArrayOfByte.ed(16);
    this.brh = paramArrayOfByte.ed(24);
    this.bri = paramArrayOfByte.ed(24);
    this.sampleRate = paramArrayOfByte.ed(20);
    this.channels = (paramArrayOfByte.ed(3) + 1);
    this.bdU = (paramArrayOfByte.ed(5) + 1);
    long l = paramArrayOfByte.ed(4);
    this.brj = (paramArrayOfByte.ed(32) & 0xFFFFFFFF | (l & 0xF) << 32);
    AppMethodBeat.o(95875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.f
 * JD-Core Version:    0.6.2
 */
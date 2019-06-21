package com.google.android.exoplayer2.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class f
{
  private static final long[] aVp = { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
  private final byte[] aTA;
  int length;
  private int state;

  public f()
  {
    AppMethodBeat.i(94917);
    this.aTA = new byte[8];
    AppMethodBeat.o(94917);
  }

  public static long b(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    long l1 = paramArrayOfByte[0] & 0xFF;
    long l2 = l1;
    if (paramBoolean)
      l2 = l1 & (aVp[(paramInt - 1)] ^ 0xFFFFFFFF);
    for (int i = 1; i < paramInt; i++)
      l2 = l2 << 8 | paramArrayOfByte[i] & 0xFF;
    return l2;
  }

  public static int dR(int paramInt)
  {
    int i = 0;
    if (i < aVp.length)
      if ((aVp[i] & paramInt) == 0L);
    for (paramInt = i + 1; ; paramInt = -1)
    {
      return paramInt;
      i++;
      break;
    }
  }

  public final long a(com.google.android.exoplayer2.c.f paramf, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(94918);
    long l;
    if (this.state == 0)
      if (!paramf.a(this.aTA, 0, 1, paramBoolean1))
      {
        l = -1L;
        AppMethodBeat.o(94918);
      }
    while (true)
    {
      return l;
      this.length = dR(this.aTA[0] & 0xFF);
      if (this.length == -1)
      {
        paramf = new IllegalStateException("No valid varint length mask found");
        AppMethodBeat.o(94918);
        throw paramf;
      }
      this.state = 1;
      if (this.length > paramInt)
      {
        this.state = 0;
        l = -2L;
        AppMethodBeat.o(94918);
      }
      else
      {
        if (this.length != 1)
          paramf.readFully(this.aTA, 1, this.length - 1);
        this.state = 0;
        l = b(this.aTA, this.length, paramBoolean2);
        AppMethodBeat.o(94918);
      }
    }
  }

  public final void reset()
  {
    this.state = 0;
    this.length = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.b.f
 * JD-Core Version:    0.6.2
 */
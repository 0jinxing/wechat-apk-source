package com.google.android.exoplayer2.c.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class i$a
{
  static final byte[] bbU = { 0, 0, 1 };
  boolean bbV;
  public int bbW;
  public byte[] data;
  public int length;

  public i$a()
  {
    AppMethodBeat.i(95111);
    this.data = new byte[''];
    AppMethodBeat.o(95111);
  }

  public final void d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95112);
    if (!this.bbV)
      AppMethodBeat.o(95112);
    while (true)
    {
      return;
      paramInt2 -= paramInt1;
      if (this.data.length < this.length + paramInt2)
        this.data = Arrays.copyOf(this.data, (this.length + paramInt2) * 2);
      System.arraycopy(paramArrayOfByte, paramInt1, this.data, this.length, paramInt2);
      this.length = (paramInt2 + this.length);
      AppMethodBeat.o(95112);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.i.a
 * JD-Core Version:    0.6.2
 */
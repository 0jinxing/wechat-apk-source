package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i
{
  private final int baE;
  int baF;
  int baG;
  private final byte[] data;

  public i(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(95051);
    this.data = paramArrayOfByte;
    this.baE = paramArrayOfByte.length;
    AppMethodBeat.o(95051);
  }

  private void rm()
  {
    AppMethodBeat.i(95055);
    if ((this.baF >= 0) && ((this.baF < this.baE) || ((this.baF == this.baE) && (this.baG == 0))));
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      AppMethodBeat.o(95055);
      return;
    }
  }

  public final int ed(int paramInt)
  {
    AppMethodBeat.i(95053);
    int i = this.baF;
    int j = Math.min(paramInt, 8 - this.baG);
    byte[] arrayOfByte = this.data;
    int k = i + 1;
    i = (arrayOfByte[i] & 0xFF) >> this.baG & 255 >> 8 - j;
    while (j < paramInt)
    {
      i |= (this.data[k] & 0xFF) << j;
      j += 8;
      k++;
    }
    ee(paramInt);
    AppMethodBeat.o(95053);
    return i & -1 >>> 32 - paramInt;
  }

  public final void ee(int paramInt)
  {
    AppMethodBeat.i(95054);
    int i = paramInt / 8;
    this.baF += i;
    this.baG = (paramInt - i * 8 + this.baG);
    if (this.baG > 7)
    {
      this.baF += 1;
      this.baG -= 8;
    }
    rm();
    AppMethodBeat.o(95054);
  }

  public final boolean rl()
  {
    AppMethodBeat.i(95052);
    if (((this.data[this.baF] & 0xFF) >> this.baG & 0x1) == 1);
    for (boolean bool = true; ; bool = false)
    {
      ee(1);
      AppMethodBeat.o(95052);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.i
 * JD-Core Version:    0.6.2
 */
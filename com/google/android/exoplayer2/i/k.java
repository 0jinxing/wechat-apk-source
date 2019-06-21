package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k
{
  private int baE;
  public int baF;
  public int baG;
  public byte[] data;

  public k()
  {
  }

  public k(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, paramArrayOfByte.length);
    AppMethodBeat.i(95893);
    AppMethodBeat.o(95893);
  }

  public k(byte[] paramArrayOfByte, int paramInt)
  {
    this.data = paramArrayOfByte;
    this.baE = paramInt;
  }

  private void tz()
  {
    AppMethodBeat.i(95896);
    int i = this.baG + 1;
    this.baG = i;
    if (i == 8)
    {
      this.baG = 0;
      this.baF += 1;
    }
    rm();
    AppMethodBeat.o(95896);
  }

  public final int ed(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(95899);
    if (paramInt == 0)
      AppMethodBeat.o(95899);
    int j;
    int k;
    for (paramInt = i; ; paramInt = (i | (k & 0xFF) >> 8 - j) & -1 >>> 32 - paramInt)
    {
      return paramInt;
      this.baG += paramInt;
      i = 0;
      while (this.baG > 8)
      {
        this.baG -= 8;
        byte[] arrayOfByte = this.data;
        j = this.baF;
        this.baF = (j + 1);
        i |= (arrayOfByte[j] & 0xFF) << this.baG;
      }
      k = this.data[this.baF];
      j = this.baG;
      if (this.baG == 8)
      {
        this.baG = 0;
        this.baF += 1;
      }
      rm();
      AppMethodBeat.o(95899);
    }
  }

  public final void ee(int paramInt)
  {
    AppMethodBeat.i(95897);
    int i = paramInt / 8;
    this.baF += i;
    this.baG = (paramInt - i * 8 + this.baG);
    if (this.baG > 7)
    {
      this.baF += 1;
      this.baG -= 8;
    }
    rm();
    AppMethodBeat.o(95897);
  }

  public final void n(byte[] paramArrayOfByte, int paramInt)
  {
    this.data = paramArrayOfByte;
    this.baF = 0;
    this.baG = 0;
    this.baE = paramInt;
  }

  public final void p(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(95901);
    if (this.baG == 0);
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      System.arraycopy(this.data, this.baF, paramArrayOfByte, 0, paramInt);
      this.baF += paramInt;
      rm();
      AppMethodBeat.o(95901);
      return;
    }
  }

  public final boolean rl()
  {
    AppMethodBeat.i(95898);
    if ((this.data[this.baF] & 128 >> this.baG) != 0);
    for (boolean bool = true; ; bool = false)
    {
      tz();
      AppMethodBeat.o(95898);
      return bool;
    }
  }

  public final void rm()
  {
    AppMethodBeat.i(95902);
    if ((this.baF >= 0) && ((this.baF < this.baE) || ((this.baF == this.baE) && (this.baG == 0))));
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      AppMethodBeat.o(95902);
      return;
    }
  }

  public final void setPosition(int paramInt)
  {
    AppMethodBeat.i(95895);
    this.baF = (paramInt / 8);
    this.baG = (paramInt - this.baF * 8);
    rm();
    AppMethodBeat.o(95895);
  }

  public final void tA()
  {
    AppMethodBeat.i(95900);
    if (this.baG == 0)
      AppMethodBeat.o(95900);
    while (true)
    {
      return;
      this.baG = 0;
      this.baF += 1;
      rm();
      AppMethodBeat.o(95900);
    }
  }

  public final int tx()
  {
    return (this.baE - this.baF) * 8 - this.baG;
  }

  public final int ty()
  {
    AppMethodBeat.i(95894);
    if (this.baG == 0);
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      int i = this.baF;
      AppMethodBeat.o(95894);
      return i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.k
 * JD-Core Version:    0.6.2
 */
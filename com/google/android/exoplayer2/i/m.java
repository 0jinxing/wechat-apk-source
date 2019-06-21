package com.google.android.exoplayer2.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m
{
  private int baE;
  private int baF;
  private int baG;
  private byte[] data;

  public m(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95920);
    l(paramArrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(95920);
  }

  private boolean eP(int paramInt)
  {
    if ((2 <= paramInt) && (paramInt < this.baE) && (this.data[paramInt] == 3) && (this.data[(paramInt - 2)] == 0) && (this.data[(paramInt - 1)] == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void rm()
  {
    AppMethodBeat.i(95930);
    if ((this.baF >= 0) && ((this.baF < this.baE) || ((this.baF == this.baE) && (this.baG == 0))));
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      AppMethodBeat.o(95930);
      return;
    }
  }

  public final boolean eO(int paramInt)
  {
    AppMethodBeat.i(95924);
    int i = this.baF;
    int j = paramInt / 8;
    int k = this.baF + j;
    paramInt = this.baG + paramInt - j * 8;
    j = k;
    int m = paramInt;
    if (paramInt > 7)
    {
      j = k + 1;
      m = paramInt - 8;
    }
    paramInt = i + 1;
    for (i = j; (paramInt <= i) && (i < this.baE); i = j)
    {
      j = i;
      k = paramInt;
      if (eP(paramInt))
      {
        j = i + 1;
        k = paramInt + 2;
      }
      paramInt = k + 1;
    }
    boolean bool;
    if ((i < this.baE) || ((i == this.baE) && (m == 0)))
    {
      bool = true;
      AppMethodBeat.o(95924);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95924);
    }
  }

  public final int ed(int paramInt)
  {
    int i = 2;
    AppMethodBeat.i(95926);
    this.baG += paramInt;
    int j = 0;
    int k;
    if (this.baG > 8)
    {
      this.baG -= 8;
      k = j | (this.data[this.baF] & 0xFF) << this.baG;
      m = this.baF;
      if (eP(this.baF + 1));
      for (j = 2; ; j = 1)
      {
        this.baF = (j + m);
        j = k;
        break;
      }
    }
    int n = this.data[this.baF];
    int m = this.baG;
    if (this.baG == 8)
    {
      this.baG = 0;
      k = this.baF;
      if (!eP(this.baF + 1))
        break label190;
    }
    while (true)
    {
      this.baF = (k + i);
      rm();
      AppMethodBeat.o(95926);
      return (j | (n & 0xFF) >> 8 - m) & -1 >>> 32 - paramInt;
      label190: i = 1;
    }
  }

  public final void ee(int paramInt)
  {
    AppMethodBeat.i(95923);
    int i = this.baF;
    int j = paramInt / 8;
    this.baF += j;
    this.baG = (paramInt - j * 8 + this.baG);
    if (this.baG > 7)
    {
      this.baF += 1;
      this.baG -= 8;
    }
    for (paramInt = i + 1; paramInt <= this.baF; paramInt = j + 1)
    {
      j = paramInt;
      if (eP(paramInt))
      {
        this.baF += 1;
        j = paramInt + 2;
      }
    }
    rm();
    AppMethodBeat.o(95923);
  }

  public final void l(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95921);
    this.data = paramArrayOfByte;
    this.baF = paramInt1;
    this.baE = paramInt2;
    this.baG = 0;
    rm();
    AppMethodBeat.o(95921);
  }

  public final boolean rl()
  {
    AppMethodBeat.i(95925);
    if ((this.data[this.baF] & 128 >> this.baG) != 0);
    for (boolean bool = true; ; bool = false)
    {
      tz();
      AppMethodBeat.o(95925);
      return bool;
    }
  }

  public final boolean tM()
  {
    boolean bool = true;
    AppMethodBeat.i(95927);
    int i = this.baF;
    int j = this.baG;
    for (int k = 0; (this.baF < this.baE) && (!rl()); k++);
    int m;
    if (this.baF == this.baE)
    {
      m = 1;
      this.baF = i;
      this.baG = j;
      if ((m != 0) || (!eO(k * 2 + 1)))
        break label99;
      AppMethodBeat.o(95927);
    }
    while (true)
    {
      return bool;
      m = 0;
      break;
      label99: AppMethodBeat.o(95927);
      bool = false;
    }
  }

  public final int tN()
  {
    AppMethodBeat.i(95928);
    int i = tO();
    if (i % 2 == 0);
    for (int j = -1; ; j = 1)
    {
      i = (i + 1) / 2;
      AppMethodBeat.o(95928);
      return j * i;
    }
  }

  public final int tO()
  {
    int i = 0;
    AppMethodBeat.i(95929);
    for (int j = 0; !rl(); j++);
    if (j > 0)
      i = ed(j);
    AppMethodBeat.o(95929);
    return (1 << j) - 1 + i;
  }

  public final void tz()
  {
    AppMethodBeat.i(95922);
    int i = this.baG + 1;
    this.baG = i;
    int j;
    if (i == 8)
    {
      this.baG = 0;
      j = this.baF;
      if (!eP(this.baF + 1))
        break label65;
    }
    label65: for (i = 2; ; i = 1)
    {
      this.baF = (i + j);
      rm();
      AppMethodBeat.o(95922);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.m
 * JD-Core Version:    0.6.2
 */
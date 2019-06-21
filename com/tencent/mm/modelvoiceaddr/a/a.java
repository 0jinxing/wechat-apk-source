package com.tencent.mm.modelvoiceaddr.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private int gbD;
  private int gbE;
  int gbF;
  private short[] gbG;

  public a(int paramInt)
  {
    AppMethodBeat.i(116754);
    this.gbD = 0;
    this.gbE = 0;
    this.gbF = 0;
    int i = paramInt;
    if (paramInt <= 1)
      i = 512;
    this.gbG = new short[i];
    AppMethodBeat.o(116754);
  }

  final int d(short[] paramArrayOfShort, int paramInt)
  {
    AppMethodBeat.i(116755);
    if (paramInt > paramArrayOfShort.length)
      paramInt = paramArrayOfShort.length;
    while (true)
    {
      if (paramInt == 0)
      {
        AppMethodBeat.o(116755);
        paramInt = 0;
        return paramInt;
      }
      int i = this.gbG.length;
      if (paramInt < this.gbF)
      {
        label41: if (paramInt > i - this.gbD)
          break label114;
        System.arraycopy(this.gbG, this.gbD, paramArrayOfShort, 0, paramInt);
        this.gbD += paramInt;
        if (this.gbD < i);
      }
      label114: int j;
      for (this.gbD = 0; ; this.gbD = j)
      {
        this.gbF -= paramInt;
        AppMethodBeat.o(116755);
        break;
        paramInt = this.gbF;
        break label41;
        i -= this.gbD;
        System.arraycopy(this.gbG, this.gbD, paramArrayOfShort, 0, i);
        j = paramInt - i;
        System.arraycopy(this.gbG, 0, paramArrayOfShort, i, j);
      }
    }
  }

  final int e(short[] paramArrayOfShort, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(116756);
    if (paramArrayOfShort.length < 0)
    {
      AppMethodBeat.o(116756);
      paramInt = i;
      return paramInt;
    }
    if (paramInt > paramArrayOfShort.length + 0)
      paramInt = paramArrayOfShort.length + 0;
    while (true)
    {
      if (paramInt == 0)
      {
        AppMethodBeat.o(116756);
        paramInt = i;
        break;
      }
      i = this.gbG.length - this.gbF;
      if (paramInt > i)
      {
        i = paramInt - i;
        if (i != 0)
        {
          if (i >= this.gbF)
            break label229;
          label80: if (i > this.gbG.length - this.gbD)
            break label237;
          this.gbD += i;
          if (this.gbD >= this.gbG.length)
            this.gbD = 0;
          label121: this.gbF -= i;
        }
      }
      if (paramInt > this.gbG.length)
      {
        i = paramInt - this.gbG.length + 0;
        paramInt = this.gbG.length;
      }
      while (true)
      {
        if (paramInt <= this.gbG.length - this.gbE)
        {
          System.arraycopy(paramArrayOfShort, i, this.gbG, this.gbE, paramInt);
          this.gbE += paramInt;
          if (this.gbE < this.gbG.length);
        }
        label229: label237: int k;
        for (this.gbE = 0; ; this.gbE = k)
        {
          this.gbF += paramInt;
          AppMethodBeat.o(116756);
          break;
          i = this.gbF;
          break label80;
          this.gbD = (i - (this.gbG.length - this.gbD));
          break label121;
          int j = this.gbG.length - this.gbE;
          System.arraycopy(paramArrayOfShort, i, this.gbG, this.gbE, j);
          k = paramInt - j;
          System.arraycopy(paramArrayOfShort, i + j, this.gbG, 0, k);
        }
        i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.a.a
 * JD-Core Version:    0.6.2
 */
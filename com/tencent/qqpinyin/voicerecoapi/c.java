package com.tencent.qqpinyin.voicerecoapi;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  private TRVADNative AqD;
  private int gaV;
  private int ioJ;

  public c()
  {
    AppMethodBeat.i(35437);
    this.AqD = new TRVADNative();
    this.gaV = 500000;
    this.ioJ = 10000000;
    AppMethodBeat.o(35437);
  }

  public c(int paramInt)
  {
    AppMethodBeat.i(35436);
    this.AqD = new TRVADNative();
    this.gaV = paramInt;
    this.ioJ = 5000000;
    AppMethodBeat.o(35436);
  }

  public final void a(short[] paramArrayOfShort, int paramInt, c.a parama)
  {
    double d1 = 26.0D;
    while (true)
    {
      int i;
      try
      {
        AppMethodBeat.i(35440);
        if (paramInt <= 0)
        {
          AppMethodBeat.o(35440);
          return;
        }
        switch (this.AqD.mfeSendData(paramArrayOfShort, paramInt))
        {
        default:
          parama.AqE = 0;
          i = 0;
          j = 0;
          if (i < paramInt)
            break label150;
          if (j >= 100)
            break label187;
          d1 = 0.0D;
          parama.AqI = ((int)d1);
          paramArrayOfShort = new java/lang/StringBuilder;
          paramArrayOfShort.<init>("volumn��");
          paramArrayOfShort.append(parama.AqI);
          AppMethodBeat.o(35440);
          continue;
        case 1:
        case 2:
        case 3:
        }
      }
      finally
      {
      }
      parama.AqE = 1;
      continue;
      parama.AqE = 2;
      continue;
      parama.AqE = 3;
      continue;
      label150: double d2 = j;
      double d3 = Math.sqrt(paramArrayOfShort[i] * paramArrayOfShort[i]);
      int j = (int)(d2 + d3 / paramInt);
      i++;
      continue;
      label187: if (j <= 16383)
        d1 = 26.0D * ((j - 100.0D) / 32667.0D);
    }
  }

  public final int dPU()
  {
    AppMethodBeat.i(35438);
    int i = this.AqD.mfeInit(this.gaV, this.ioJ);
    int j = i;
    if (i == 0)
    {
      i = this.AqD.mfeOpen();
      j = i;
      if (i == 0)
      {
        i = this.AqD.mfeEnableNoiseDetection(true);
        j = i;
        if (i == 0)
          j = this.AqD.mfeStart();
      }
    }
    if (j == 0)
    {
      j = 0;
      AppMethodBeat.o(35438);
    }
    while (true)
    {
      return j;
      j = -1;
      AppMethodBeat.o(35438);
    }
  }

  public final int stop()
  {
    AppMethodBeat.i(35439);
    int i = this.AqD.mfeStop();
    int j = i;
    if (i == 0)
    {
      i = this.AqD.mfeClose();
      j = i;
      if (i == 0)
        j = this.AqD.mfeExit();
    }
    if (j == 0)
    {
      j = 0;
      AppMethodBeat.o(35439);
    }
    while (true)
    {
      return j;
      j = -1;
      AppMethodBeat.o(35439);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqpinyin.voicerecoapi.c
 * JD-Core Version:    0.6.2
 */
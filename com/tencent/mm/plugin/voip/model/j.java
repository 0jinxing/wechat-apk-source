package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.io.OutputStream;

final class j
{
  private InputStream aEZ;
  protected f sOE;
  int sOF;
  private int sOG;
  private int sOH;
  private final OutputStream sOI;
  private int[] sOJ;
  int sOK;

  public j(InputStream paramInputStream)
  {
    AppMethodBeat.i(4369);
    this.sOE = new f();
    this.sOJ = new int[8];
    this.aEZ = paramInputStream;
    this.sOI = null;
    this.sOG = paramInputStream.read();
    this.sOH = paramInputStream.read();
    AppMethodBeat.o(4369);
  }

  public j(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    AppMethodBeat.i(4370);
    this.sOE = new f();
    this.sOJ = new int[8];
    this.aEZ = paramInputStream;
    this.sOI = paramOutputStream;
    this.sOG = paramInputStream.read();
    this.sOH = paramInputStream.read();
    AppMethodBeat.o(4370);
  }

  private long FW(int paramInt)
  {
    AppMethodBeat.i(4373);
    if (paramInt > 64)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Can not readByte more then 64 bit");
      AppMethodBeat.o(4373);
      throw localIllegalArgumentException;
    }
    long l = 0L;
    for (int i = 0; i < paramInt; i++)
      l = l << 1 | mm(true);
    AppMethodBeat.o(4373);
    return l;
  }

  private void Gb(int paramInt)
  {
    AppMethodBeat.i(4388);
    int i = 0;
    int j = 0;
    if (i < 15)
      if (paramInt >= (1 << i) + j);
    while (true)
    {
      G(0L, i);
      Ga(1);
      G(paramInt - j, i);
      AppMethodBeat.o(4388);
      return;
      j += (1 << i);
      i++;
      break;
      i = 0;
    }
  }

  private void advance()
  {
    AppMethodBeat.i(4375);
    this.sOG = this.sOH;
    this.sOH = this.aEZ.read();
    this.sOF = 0;
    AppMethodBeat.o(4375);
  }

  private int cIC()
  {
    AppMethodBeat.i(4382);
    int i = cIy();
    i = ((i & 0x1) + (i >> 1)) * (((i & 0x1) << 1) - 1);
    AppMethodBeat.o(4382);
    return i;
  }

  private void cID()
  {
    AppMethodBeat.i(4385);
    int i = this.sOJ[0];
    int j = this.sOJ[1];
    int k = this.sOJ[2];
    int m = this.sOJ[3];
    int n = this.sOJ[4];
    int i1 = this.sOJ[5];
    int i2 = this.sOJ[6];
    int i3 = this.sOJ[7];
    this.sOI.write(i << 7 | j << 6 | k << 5 | m << 4 | n << 3 | i1 << 2 | i2 << 1 | i3);
    AppMethodBeat.o(4385);
  }

  private int cIy()
  {
    int i = 0;
    AppMethodBeat.i(4378);
    for (int j = 0; mm(true) == 0; j++);
    if (j > 0)
    {
      long l = FW(j);
      i = (int)((1 << j) - 1 + l);
    }
    AppMethodBeat.o(4378);
    return i;
  }

  private int mm(boolean paramBoolean)
  {
    int i = -1;
    AppMethodBeat.i(4372);
    if (this.sOF == 8)
    {
      advance();
      if (this.sOG == -1)
        AppMethodBeat.o(4372);
    }
    while (true)
    {
      return i;
      i = this.sOG >> 7 - this.sOF & 0x1;
      this.sOF += 1;
      if ((paramBoolean) && (this.sOI != null))
        Ga(i);
      AppMethodBeat.o(4372);
    }
  }

  public final void FX(int paramInt)
  {
    AppMethodBeat.i(4374);
    if (paramInt > 64)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Can not skip more then 64 bit");
      AppMethodBeat.o(4374);
      throw localIllegalArgumentException;
    }
    for (int i = 0; i < paramInt; i++)
      mm(true);
    AppMethodBeat.o(4374);
  }

  public final void FY(int paramInt)
  {
    AppMethodBeat.i(4377);
    FX(paramInt);
    AppMethodBeat.o(4377);
  }

  public final void FZ(int paramInt)
  {
    AppMethodBeat.i(4383);
    int[] arrayOfInt = new int[paramInt];
    int i = 0;
    int j = 8;
    int k = 8;
    if (i < paramInt)
    {
      int m = j;
      if (j != 0)
        m = (cIC() + k + 256) % 256;
      if (m == 0);
      while (true)
      {
        arrayOfInt[i] = k;
        k = arrayOfInt[i];
        i++;
        j = m;
        break;
        k = m;
      }
    }
    AppMethodBeat.o(4383);
  }

  public final void G(long paramLong, int paramInt)
  {
    AppMethodBeat.i(4387);
    for (int i = 0; i < paramInt; i++)
      Ga((int)(paramLong >> paramInt - i - 1) & 0x1);
    AppMethodBeat.o(4387);
  }

  public final void Ga(int paramInt)
  {
    AppMethodBeat.i(4386);
    if (this.sOK == 8)
    {
      this.sOK = 0;
      cID();
    }
    int[] arrayOfInt = this.sOJ;
    int i = this.sOK;
    this.sOK = (i + 1);
    arrayOfInt[i] = paramInt;
    AppMethodBeat.o(4386);
  }

  public final void Gc(int paramInt)
  {
    AppMethodBeat.i(4389);
    Gb(paramInt);
    AppMethodBeat.o(4389);
  }

  public final int cIA()
  {
    AppMethodBeat.i(4380);
    int i = cIy();
    AppMethodBeat.o(4380);
    return i;
  }

  public final void cIB()
  {
    AppMethodBeat.i(4381);
    cIz();
    AppMethodBeat.o(4381);
  }

  public final long cIx()
  {
    AppMethodBeat.i(4376);
    long l = FW(8);
    AppMethodBeat.o(4376);
    return l;
  }

  final void cIz()
  {
    AppMethodBeat.i(4379);
    for (int i = 0; mm(true) == 0; i++);
    if (i > 0)
      FX(i);
    AppMethodBeat.o(4379);
  }

  public final void flush()
  {
    AppMethodBeat.i(4384);
    for (int i = this.sOK; i < 8; i++)
      this.sOJ[i] = 0;
    this.sOK = 0;
    cID();
    AppMethodBeat.o(4384);
  }

  public final boolean ml(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(4371);
    if (mm(paramBoolean) == 1)
    {
      AppMethodBeat.o(4371);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(4371);
    }
  }

  public final void mn(boolean paramBoolean)
  {
    AppMethodBeat.i(4390);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      Ga(i);
      AppMethodBeat.o(4390);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.j
 * JD-Core Version:    0.6.2
 */
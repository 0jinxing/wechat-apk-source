package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b.e;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.c.m.a;
import com.google.android.exoplayer2.h.a;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;
import java.nio.ByteBuffer;

public final class k
  implements m
{
  private final l aTj;
  private long bbO;
  private final com.google.android.exoplayer2.h.b bgF;
  private final int bhF;
  public final j bhG;
  private final j.a bhH;
  private k.a bhI;
  private k.a bhJ;
  private k.a bhK;
  private Format bhL;
  private boolean bhM;
  private Format bhN;
  private long bhO;
  public boolean bhP;
  public k.b bhQ;

  public k(com.google.android.exoplayer2.h.b paramb)
  {
    AppMethodBeat.i(95529);
    this.bgF = paramb;
    this.bhF = paramb.tk();
    this.bhG = new j();
    this.bhH = new j.a();
    this.aTj = new l(32);
    this.bhI = new k.a(0L, this.bhF);
    this.bhJ = this.bhI;
    this.bhK = this.bhI;
    AppMethodBeat.o(95529);
  }

  private void a(long paramLong, ByteBuffer paramByteBuffer, int paramInt)
  {
    AppMethodBeat.i(95538);
    ad(paramLong);
    while (paramInt > 0)
    {
      int i = Math.min(paramInt, (int)(this.bhJ.aXw - paramLong));
      paramByteBuffer.put(this.bhJ.bhS.data, this.bhJ.af(paramLong), i);
      int j = paramInt - i;
      long l = paramLong + i;
      paramLong = l;
      paramInt = j;
      if (l == this.bhJ.aXw)
      {
        this.bhJ = this.bhJ.bhT;
        paramLong = l;
        paramInt = j;
      }
    }
    AppMethodBeat.o(95538);
  }

  private void a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(95539);
    ad(paramLong);
    int i = paramInt;
    while (i > 0)
    {
      int j = Math.min(i, (int)(this.bhJ.aXw - paramLong));
      System.arraycopy(this.bhJ.bhS.data, this.bhJ.af(paramLong), paramArrayOfByte, paramInt - i, j);
      int k = i - j;
      long l = paramLong + j;
      i = k;
      paramLong = l;
      if (l == this.bhJ.aXw)
      {
        this.bhJ = this.bhJ.bhT;
        i = k;
        paramLong = l;
      }
    }
    AppMethodBeat.o(95539);
  }

  private void a(e parame, j.a parama)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(95537);
    long l1 = parama.xb;
    this.aTj.reset(1);
    a(l1, this.aTj.data, 1);
    l1 += 1L;
    int k = this.aTj.data[0];
    int m;
    if ((k & 0x80) != 0)
    {
      m = 1;
      k &= 127;
      if (parame.aSj.iv == null)
        parame.aSj.iv = new byte[16];
      a(l1, parame.aSj.iv, k);
      l1 += k;
      if (m == 0)
        break label315;
      this.aTj.reset(2);
      a(l1, this.aTj.data, 2);
      i = this.aTj.readUnsignedShort();
      l1 += 2L;
    }
    Object localObject1;
    Object localObject2;
    Object localObject3;
    long l2;
    label315: 
    while (true)
    {
      localObject1 = parame.aSj.numBytesOfClearData;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (localObject1.length >= i);
      }
      else
      {
        localObject2 = new int[i];
      }
      localObject3 = parame.aSj.numBytesOfEncryptedData;
      if (localObject3 != null)
      {
        localObject1 = localObject3;
        if (localObject3.length >= i);
      }
      else
      {
        localObject1 = new int[i];
      }
      if (m == 0)
        break label409;
      m = i * 6;
      this.aTj.reset(m);
      a(l1, this.aTj.data, m);
      l2 = m;
      this.aTj.setPosition(0);
      for (m = j; m < i; m++)
      {
        localObject2[m] = this.aTj.readUnsignedShort();
        localObject1[m] = this.aTj.tI();
      }
      m = 0;
      break;
    }
    l1 += l2;
    while (true)
    {
      localObject3 = parama.aUO;
      parame.aSj.a(i, (int[])localObject2, (int[])localObject1, ((m.a)localObject3).aTc, parame.aSj.iv, ((m.a)localObject3).aTb, ((m.a)localObject3).aRX, ((m.a)localObject3).aRY);
      m = (int)(l1 - parama.xb);
      parama.xb += m;
      parama.size -= m;
      AppMethodBeat.o(95537);
      return;
      label409: localObject2[0] = 0;
      localObject1[0] = (parama.size - (int)(l1 - parama.xb));
    }
  }

  private void a(k.a parama)
  {
    int i = 0;
    AppMethodBeat.i(95545);
    if (!parama.bhR)
      AppMethodBeat.o(95545);
    while (true)
    {
      return;
      if (this.bhK.bhR);
      a[] arrayOfa;
      for (int j = 1; ; j = 0)
      {
        arrayOfa = new a[j + (int)(this.bhK.aZQ - parama.aZQ) / this.bhF];
        for (j = i; j < arrayOfa.length; j++)
        {
          arrayOfa[j] = parama.bhS;
          parama = parama.sr();
        }
      }
      this.bgF.a(arrayOfa);
      AppMethodBeat.o(95545);
    }
  }

  private void ad(long paramLong)
  {
    while (paramLong >= this.bhJ.aXw)
      this.bhJ = this.bhJ.bhT;
  }

  private void ae(long paramLong)
  {
    AppMethodBeat.i(95540);
    if (paramLong == -1L)
      AppMethodBeat.o(95540);
    while (true)
    {
      return;
      while (paramLong >= this.bhI.aXw)
      {
        this.bgF.a(this.bhI.bhS);
        this.bhI = this.bhI.sr();
      }
      if (this.bhJ.aZQ < this.bhI.aZQ)
        this.bhJ = this.bhI;
      AppMethodBeat.o(95540);
    }
  }

  private int eq(int paramInt)
  {
    AppMethodBeat.i(95546);
    if (!this.bhK.bhR)
      this.bhK.a(this.bgF.tj(), new k.a(this.bhK.aXw, this.bhF));
    paramInt = Math.min(paramInt, (int)(this.bhK.aXw - this.bbO));
    AppMethodBeat.o(95546);
    return paramInt;
  }

  private void er(int paramInt)
  {
    this.bbO += paramInt;
    if (this.bbO == this.bhK.aXw)
      this.bhK = this.bhK.bhT;
  }

  public final int a(f paramf, int paramInt, boolean paramBoolean)
  {
    int i = -1;
    AppMethodBeat.i(95542);
    paramInt = eq(paramInt);
    paramInt = paramf.read(this.bhK.bhS.data, this.bhK.af(this.bbO), paramInt);
    if (paramInt == -1)
      if (paramBoolean)
      {
        AppMethodBeat.o(95542);
        paramInt = i;
      }
    while (true)
    {
      return paramInt;
      paramf = new EOFException();
      AppMethodBeat.o(95542);
      throw paramf;
      er(paramInt);
      AppMethodBeat.o(95542);
    }
  }

  public final int a(com.google.android.exoplayer2.k paramk, e parame, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    AppMethodBeat.i(95536);
    int i;
    switch (this.bhG.a(paramk, parame, paramBoolean1, paramBoolean2, this.bhL, this.bhH))
    {
    default:
      paramk = new IllegalStateException();
      AppMethodBeat.o(95536);
      throw paramk;
    case -5:
      this.bhL = paramk.aOv;
      i = -5;
      AppMethodBeat.o(95536);
    case -4:
    case -3:
    }
    while (true)
    {
      return i;
      if (!parame.qG())
      {
        if (parame.aSk < paramLong)
          parame.dB(-2147483648);
        if (parame.qK())
          a(parame, this.bhH);
        parame.dD(this.bhH.size);
        a(this.bhH.xb, parame.aEY, this.bhH.size);
      }
      i = -4;
      AppMethodBeat.o(95536);
      continue;
      i = -3;
      AppMethodBeat.o(95536);
    }
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, m.a parama)
  {
    AppMethodBeat.i(95544);
    if (this.bhM)
      f(this.bhN);
    if (this.bhP)
      if (((paramInt1 & 0x1) == 0) || (!this.bhG.ac(paramLong)))
        AppMethodBeat.o(95544);
    while (true)
    {
      return;
      this.bhP = false;
      long l1 = this.bhO;
      long l2 = this.bbO;
      long l3 = paramInt2;
      long l4 = paramInt3;
      this.bhG.a(paramLong + l1, paramInt1, l2 - l3 - l4, paramInt2, parama);
      AppMethodBeat.o(95544);
    }
  }

  public final void a(l paraml, int paramInt)
  {
    AppMethodBeat.i(95543);
    while (paramInt > 0)
    {
      int i = eq(paramInt);
      paraml.readBytes(this.bhK.bhS.data, this.bhK.af(this.bbO), i);
      paramInt -= i;
      er(i);
    }
    AppMethodBeat.o(95543);
  }

  public final void f(Format paramFormat)
  {
    AppMethodBeat.i(95541);
    long l = this.bhO;
    Format localFormat;
    if (paramFormat == null)
      localFormat = null;
    while (true)
    {
      boolean bool = this.bhG.i(localFormat);
      this.bhN = paramFormat;
      this.bhM = false;
      if ((this.bhQ != null) && (bool))
        this.bhQ.sa();
      AppMethodBeat.o(95541);
      return;
      if ((l != 0L) && (paramFormat.aOr != 9223372036854775807L))
        localFormat = paramFormat.E(l + paramFormat.aOr);
      else
        localFormat = paramFormat;
    }
  }

  public final boolean g(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(95535);
    paramBoolean = this.bhG.g(paramLong, paramBoolean);
    AppMethodBeat.o(95535);
    return paramBoolean;
  }

  public final void i(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(95532);
    ae(this.bhG.h(paramLong, paramBoolean));
    AppMethodBeat.o(95532);
  }

  public final void reset(boolean paramBoolean)
  {
    AppMethodBeat.i(95530);
    this.bhG.reset(paramBoolean);
    a(this.bhI);
    this.bhI = new k.a(0L, this.bhF);
    this.bhJ = this.bhI;
    this.bhK = this.bhI;
    this.bbO = 0L;
    this.bgF.trim();
    AppMethodBeat.o(95530);
  }

  public final void rewind()
  {
    AppMethodBeat.i(95531);
    this.bhG.rewind();
    this.bhJ = this.bhI;
    AppMethodBeat.o(95531);
  }

  public final void sp()
  {
    AppMethodBeat.i(95533);
    ae(this.bhG.sn());
    AppMethodBeat.o(95533);
  }

  public final void sq()
  {
    AppMethodBeat.i(95534);
    ae(this.bhG.so());
    AppMethodBeat.o(95534);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.k
 * JD-Core Version:    0.6.2
 */
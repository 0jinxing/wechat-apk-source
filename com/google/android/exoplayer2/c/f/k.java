package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;

public final class k
  implements h
{
  private boolean aTf;
  private com.google.android.exoplayer2.c.m aTw;
  private final boolean[] bbM;
  private long bbO;
  private long bbQ;
  private final s bbX;
  private String bbx;
  private k.a bcE;
  private final n bcF;
  private final n bcG;
  private final n bcH;
  private final n bca;
  private final n bcb;
  private final l bce;

  public k(s params)
  {
    AppMethodBeat.i(95128);
    this.bbX = params;
    this.bbM = new boolean[3];
    this.bcF = new n(32);
    this.bca = new n(33);
    this.bcb = new n(34);
    this.bcG = new n(39);
    this.bcH = new n(40);
    this.bce = new l();
    AppMethodBeat.o(95128);
  }

  private void e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95132);
    if (this.aTf)
      this.bcE.g(paramArrayOfByte, paramInt1, paramInt2);
    while (true)
    {
      this.bcG.f(paramArrayOfByte, paramInt1, paramInt2);
      this.bcH.f(paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(95132);
      return;
      this.bcF.f(paramArrayOfByte, paramInt1, paramInt2);
      this.bca.f(paramArrayOfByte, paramInt1, paramInt2);
      this.bcb.f(paramArrayOfByte, paramInt1, paramInt2);
    }
  }

  public final void a(g paramg, v.d paramd)
  {
    AppMethodBeat.i(95130);
    paramd.rz();
    this.bbx = paramd.rB();
    this.aTw = paramg.dM(paramd.rA());
    this.bcE = new k.a(this.aTw);
    this.bbX.a(paramg, paramd);
    AppMethodBeat.o(95130);
  }

  public final void d(long paramLong, boolean paramBoolean)
  {
    this.bbQ = paramLong;
  }

  public final void rn()
  {
    AppMethodBeat.i(95129);
    j.b(this.bbM);
    this.bcF.reset();
    this.bca.reset();
    this.bcb.reset();
    this.bcG.reset();
    this.bcH.reset();
    k.a locala = this.bcE;
    locala.bcK = false;
    locala.bcL = false;
    locala.bcM = false;
    locala.bco = false;
    locala.bcN = false;
    this.bbO = 0L;
    AppMethodBeat.o(95129);
  }

  public final void ro()
  {
  }

  public final void t(l paraml)
  {
    AppMethodBeat.i(95131);
    int i;
    label56: int m;
    int n;
    label149: Object localObject1;
    label200: boolean bool;
    label437: label467: label492: label499: String str;
    label525: label531: label611: Object localObject2;
    byte[] arrayOfByte2;
    int i3;
    int i4;
    int i6;
    int i7;
    int i8;
    int i9;
    if (paraml.tB() > 0)
    {
      i = paraml.position;
      int j = paraml.limit;
      byte[] arrayOfByte1 = paraml.data;
      this.bbO += paraml.tB();
      this.aTw.a(paraml, paraml.tB());
      int k;
      int i1;
      long l1;
      int i2;
      long l2;
      if (i < j)
      {
        k = j.a(arrayOfByte1, i, j, this.bbM);
        if (k == j)
        {
          e(arrayOfByte1, i, j);
          AppMethodBeat.o(95131);
          return;
        }
        m = j.l(arrayOfByte1, k);
        n = k - i;
        if (n > 0)
          e(arrayOfByte1, i, k);
        i1 = j - k;
        l1 = this.bbO - i1;
        if (n >= 0)
          break label525;
        i2 = -n;
        l2 = this.bbQ;
        if (!this.aTf)
          break label611;
        localObject1 = this.bcE;
        if ((!((k.a)localObject1).bcN) || (!((k.a)localObject1).bcL))
          break label531;
        ((k.a)localObject1).bbS = ((k.a)localObject1).bcI;
        ((k.a)localObject1).bcN = false;
      }
      do
      {
        while (true)
        {
          if (this.bcG.ej(i2))
          {
            i = j.j(this.bcG.bcV, this.bcG.bcW);
            this.bce.n(this.bcG.bcV, i);
            this.bce.eM(5);
            this.bbX.a(l2, this.bce);
          }
          if (this.bcH.ej(i2))
          {
            i = j.j(this.bcH.bcV, this.bcH.bcW);
            this.bce.n(this.bcH.bcV, i);
            this.bce.eM(5);
            this.bbX.a(l2, this.bce);
          }
          l2 = this.bbQ;
          if (!this.aTf)
            break label1680;
          localObject1 = this.bcE;
          ((k.a)localObject1).bcL = false;
          ((k.a)localObject1).bcM = false;
          ((k.a)localObject1).bcl = l2;
          ((k.a)localObject1).bcJ = 0;
          ((k.a)localObject1).bck = l1;
          if (m >= 32)
          {
            if ((!((k.a)localObject1).bcN) && (((k.a)localObject1).bco))
            {
              ((k.a)localObject1).eh(i1);
              ((k.a)localObject1).bco = false;
            }
            if (m <= 34)
            {
              if (((k.a)localObject1).bcN)
                break label1662;
              bool = true;
              ((k.a)localObject1).bcM = bool;
              ((k.a)localObject1).bcN = true;
            }
          }
          if ((m < 16) || (m > 21))
            break label1668;
          bool = true;
          ((k.a)localObject1).bcI = bool;
          if ((!((k.a)localObject1).bcI) && (m > 9))
            break label1674;
          bool = true;
          ((k.a)localObject1).bcK = bool;
          this.bcG.ei(m);
          this.bcH.ei(m);
          i = k + 3;
          break label56;
          break;
          i2 = 0;
          break label149;
          if ((((k.a)localObject1).bcM) || (((k.a)localObject1).bcL))
          {
            if (((k.a)localObject1).bco)
              ((k.a)localObject1).eh((int)(l1 - ((k.a)localObject1).bck) + i1);
            ((k.a)localObject1).bbR = ((k.a)localObject1).bck;
            ((k.a)localObject1).bbJ = ((k.a)localObject1).bcl;
            ((k.a)localObject1).bco = true;
            ((k.a)localObject1).bbS = ((k.a)localObject1).bcI;
          }
        }
        this.bcF.ej(i2);
        this.bca.ej(i2);
        this.bcb.ej(i2);
      }
      while ((!this.bcF.bcU) || (!this.bca.bcU) || (!this.bcb.bcU));
      localObject1 = this.aTw;
      str = this.bbx;
      n localn1 = this.bcF;
      localObject2 = this.bca;
      n localn2 = this.bcb;
      arrayOfByte2 = new byte[localn1.bcW + ((n)localObject2).bcW + localn2.bcW];
      System.arraycopy(localn1.bcV, 0, arrayOfByte2, 0, localn1.bcW);
      System.arraycopy(((n)localObject2).bcV, 0, arrayOfByte2, localn1.bcW, ((n)localObject2).bcW);
      System.arraycopy(localn2.bcV, 0, arrayOfByte2, localn1.bcW + ((n)localObject2).bcW, localn2.bcW);
      localObject2 = new com.google.android.exoplayer2.i.m(((n)localObject2).bcV, 0, ((n)localObject2).bcW);
      ((com.google.android.exoplayer2.i.m)localObject2).ee(44);
      i3 = ((com.google.android.exoplayer2.i.m)localObject2).ed(3);
      ((com.google.android.exoplayer2.i.m)localObject2).tz();
      ((com.google.android.exoplayer2.i.m)localObject2).ee(88);
      ((com.google.android.exoplayer2.i.m)localObject2).ee(8);
      n = 0;
      for (i4 = 0; i4 < i3; i4++)
      {
        i = n;
        if (((com.google.android.exoplayer2.i.m)localObject2).rl())
          i = n + 89;
        n = i;
        if (((com.google.android.exoplayer2.i.m)localObject2).rl())
          n = i + 8;
      }
      ((com.google.android.exoplayer2.i.m)localObject2).ee(n);
      if (i3 > 0)
        ((com.google.android.exoplayer2.i.m)localObject2).ee((8 - i3) * 2);
      ((com.google.android.exoplayer2.i.m)localObject2).tO();
      int i5 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
      if (i5 == 3)
        ((com.google.android.exoplayer2.i.m)localObject2).tz();
      i6 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
      i7 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
      i4 = i6;
      n = i7;
      if (((com.google.android.exoplayer2.i.m)localObject2).rl())
      {
        i4 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
        i8 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
        i9 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
        i10 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
        if ((i5 == 1) || (i5 == 2))
        {
          i = 2;
          if (i5 != 1)
            break label1112;
          n = 2;
          label1023: i4 = i6 - i * (i4 + i8);
          n = i7 - n * (i9 + i10);
        }
      }
      else
      {
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        i9 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
        if (!((com.google.android.exoplayer2.i.m)localObject2).rl())
          break label1118;
        i = 0;
      }
      while (true)
      {
        if (i > i3)
          break label1124;
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        i++;
        continue;
        i = 1;
        break;
        label1112: n = 1;
        break label1023;
        label1118: i = i3;
      }
      label1124: ((com.google.android.exoplayer2.i.m)localObject2).tO();
      ((com.google.android.exoplayer2.i.m)localObject2).tO();
      ((com.google.android.exoplayer2.i.m)localObject2).tO();
      ((com.google.android.exoplayer2.i.m)localObject2).tO();
      ((com.google.android.exoplayer2.i.m)localObject2).tO();
      ((com.google.android.exoplayer2.i.m)localObject2).tO();
      if ((((com.google.android.exoplayer2.i.m)localObject2).rl()) && (((com.google.android.exoplayer2.i.m)localObject2).rl()))
        for (i = 0; i < 4; i++)
        {
          i3 = 0;
          if (i3 < 6)
          {
            if (!((com.google.android.exoplayer2.i.m)localObject2).rl())
            {
              ((com.google.android.exoplayer2.i.m)localObject2).tO();
              label1207: if (i != 3)
                break label1272;
            }
            label1272: for (i7 = 3; ; i7 = 1)
            {
              i3 = i7 + i3;
              break;
              i6 = Math.min(64, 1 << (i << 1) + 4);
              if (i > 1)
                ((com.google.android.exoplayer2.i.m)localObject2).tN();
              for (i7 = 0; i7 < i6; i7++)
                ((com.google.android.exoplayer2.i.m)localObject2).tN();
              break label1207;
            }
          }
        }
      ((com.google.android.exoplayer2.i.m)localObject2).ee(2);
      if (((com.google.android.exoplayer2.i.m)localObject2).rl())
      {
        ((com.google.android.exoplayer2.i.m)localObject2).ee(8);
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        ((com.google.android.exoplayer2.i.m)localObject2).tz();
      }
      int i10 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
      bool = false;
      i7 = 0;
      i = 0;
      label1337: if (i < i10)
      {
        if (i == 0)
          break label1724;
        bool = ((com.google.android.exoplayer2.i.m)localObject2).rl();
      }
    }
    label1668: label1674: label1680: label1724: 
    while (true)
    {
      if (bool)
      {
        ((com.google.android.exoplayer2.i.m)localObject2).tz();
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        for (i6 = 0; ; i6++)
        {
          i3 = i7;
          if (i6 > i7)
            break;
          if (((com.google.android.exoplayer2.i.m)localObject2).rl())
            ((com.google.android.exoplayer2.i.m)localObject2).tz();
        }
      }
      i7 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
      i8 = ((com.google.android.exoplayer2.i.m)localObject2).tO();
      i6 = i7 + i8;
      for (i3 = 0; i3 < i7; i3++)
      {
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        ((com.google.android.exoplayer2.i.m)localObject2).tz();
      }
      for (i7 = 0; ; i7++)
      {
        i3 = i6;
        if (i7 >= i8)
          break;
        ((com.google.android.exoplayer2.i.m)localObject2).tO();
        ((com.google.android.exoplayer2.i.m)localObject2).tz();
      }
      i++;
      i7 = i3;
      break label1337;
      if (((com.google.android.exoplayer2.i.m)localObject2).rl())
        for (i = 0; i < ((com.google.android.exoplayer2.i.m)localObject2).tO(); i++)
          ((com.google.android.exoplayer2.i.m)localObject2).ee(i9 + 4 + 1);
      ((com.google.android.exoplayer2.i.m)localObject2).ee(2);
      float f1 = 1.0F;
      float f2;
      if ((((com.google.android.exoplayer2.i.m)localObject2).rl()) && (((com.google.android.exoplayer2.i.m)localObject2).rl()))
      {
        i = ((com.google.android.exoplayer2.i.m)localObject2).ed(8);
        if (i == 255)
        {
          i = ((com.google.android.exoplayer2.i.m)localObject2).ed(16);
          i3 = ((com.google.android.exoplayer2.i.m)localObject2).ed(16);
          f2 = f1;
          if (i != 0)
          {
            f2 = f1;
            if (i3 != 0)
              f2 = i / i3;
          }
        }
      }
      while (true)
      {
        ((com.google.android.exoplayer2.c.m)localObject1).f(Format.a(str, "video/hevc", i4, n, Collections.singletonList(arrayOfByte2), f2));
        this.aTf = true;
        break label200;
        if (i < j.brl.length)
        {
          f2 = j.brl[i];
          continue;
          label1662: bool = false;
          break label437;
          bool = false;
          break label467;
          bool = false;
          break label492;
          this.bcF.ei(m);
          this.bca.ei(m);
          this.bcb.ei(m);
          break label499;
          AppMethodBeat.o(95131);
          break;
        }
        f2 = 1.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.k
 * JD-Core Version:    0.6.2
 */
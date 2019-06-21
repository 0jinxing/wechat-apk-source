package com.google.android.exoplayer2.c.f;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Collections;

public final class i
  implements h
{
  private static final double[] bbK = { 23.976023976023978D, 24.0D, 25.0D, 29.970029970029969D, 30.0D, 50.0D, 59.940059940059939D, 60.0D };
  private boolean aTf;
  private m aTw;
  private long bbJ;
  private long bbL;
  private final boolean[] bbM;
  private final i.a bbN;
  private long bbO;
  private boolean bbP;
  private long bbQ;
  private long bbR;
  private boolean bbS;
  private boolean bbT;
  private String bbx;

  public i()
  {
    AppMethodBeat.i(95113);
    this.bbM = new boolean[4];
    this.bbN = new i.a();
    AppMethodBeat.o(95113);
  }

  public final void a(g paramg, v.d paramd)
  {
    AppMethodBeat.i(95115);
    paramd.rz();
    this.bbx = paramd.rB();
    this.aTw = paramg.dM(paramd.rA());
    AppMethodBeat.o(95115);
  }

  public final void d(long paramLong, boolean paramBoolean)
  {
    this.bbQ = paramLong;
  }

  public final void rn()
  {
    AppMethodBeat.i(95114);
    j.b(this.bbM);
    i.a locala = this.bbN;
    locala.bbV = false;
    locala.length = 0;
    locala.bbW = 0;
    this.bbO = 0L;
    this.bbP = false;
    AppMethodBeat.o(95114);
  }

  public final void ro()
  {
  }

  public final void t(l paraml)
  {
    AppMethodBeat.i(95116);
    int i = paraml.position;
    int j = paraml.limit;
    byte[] arrayOfByte1 = paraml.data;
    this.bbO += paraml.tB();
    this.aTw.a(paraml, paraml.tB());
    int k = j.a(arrayOfByte1, i, j, this.bbM);
    if (k == j)
    {
      if (!this.aTf)
        this.bbN.d(arrayOfByte1, i, j);
      AppMethodBeat.o(95116);
      return;
    }
    int m = paraml.data[(k + 3)] & 0xFF;
    int n;
    label146: Object localObject1;
    label198: label213: Object localObject2;
    byte[] arrayOfByte2;
    int i1;
    float f;
    if (!this.aTf)
    {
      n = k - i;
      if (n > 0)
        this.bbN.d(arrayOfByte1, i, k);
      if (n >= 0)
        break label684;
      i = -n;
      localObject1 = this.bbN;
      if (!((i.a)localObject1).bbV)
        break label700;
      ((i.a)localObject1).length -= i;
      if ((((i.a)localObject1).bbW != 0) || (m != 181))
        break label689;
      ((i.a)localObject1).bbW = ((i.a)localObject1).length;
      ((i.a)localObject1).d(i.a.bbU, 0, i.a.bbU.length);
      i = 0;
      if (i != 0)
      {
        localObject1 = this.bbN;
        localObject2 = this.bbx;
        arrayOfByte2 = Arrays.copyOf(((i.a)localObject1).data, ((i.a)localObject1).length);
        i1 = arrayOfByte2[4];
        i = arrayOfByte2[5] & 0xFF;
        n = arrayOfByte2[6];
        i1 = i >> 4 | (i1 & 0xFF) << 4;
        i = (i & 0xF) << 8 | n & 0xFF;
        f = 1.0F;
      }
    }
    label336: long l2;
    label562: label639: boolean bool;
    switch ((arrayOfByte2[7] & 0xF0) >> 4)
    {
    default:
      localObject2 = Format.a((String)localObject2, "video/mpeg2", i1, i, Collections.singletonList(arrayOfByte2), f);
      long l1 = 0L;
      i = (arrayOfByte2[7] & 0xF) - 1;
      l2 = l1;
      if (i >= 0)
      {
        l2 = l1;
        if (i < bbK.length)
        {
          double d1 = bbK[i];
          n = ((i.a)localObject1).bbW;
          i = (arrayOfByte2[(n + 9)] & 0x60) >> 5;
          n = arrayOfByte2[(n + 9)] & 0x1F;
          double d2 = d1;
          if (i != n)
            d2 = d1 * ((i + 1.0D) / (n + 1));
          l2 = ()(1000000.0D / d2);
        }
      }
      localObject1 = Pair.create(localObject2, Long.valueOf(l2));
      this.aTw.f((Format)((Pair)localObject1).first);
      this.bbL = ((Long)((Pair)localObject1).second).longValue();
      this.aTf = true;
      if ((m == 0) || (m == 179))
      {
        n = j - k;
        if ((this.bbP) && (this.bbT) && (this.aTf))
        {
          if (this.bbS)
          {
            i = 1;
            i1 = (int)(this.bbO - this.bbR);
            this.aTw.a(this.bbJ, i, i1 - n, n, null);
          }
        }
        else
        {
          if ((!this.bbP) || (this.bbT))
          {
            this.bbR = (this.bbO - n);
            if (this.bbQ == -9223372036854775807L)
              break label771;
            l2 = this.bbQ;
            this.bbJ = l2;
            this.bbS = false;
            this.bbQ = -9223372036854775807L;
            this.bbP = true;
          }
          if (m != 0)
            break label798;
          bool = true;
          label670: this.bbT = bool;
        }
      }
      break;
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      i = k + 3;
      break;
      label684: i = 0;
      break label146;
      label689: ((i.a)localObject1).bbV = false;
      i = 1;
      break label213;
      label700: if (m != 179)
        break label198;
      ((i.a)localObject1).bbV = true;
      break label198;
      f = i * 4 / (i1 * 3);
      break label336;
      f = i * 16 / (i1 * 9);
      break label336;
      f = i * 121 / (i1 * 100);
      break label336;
      i = 0;
      break label562;
      label771: if (this.bbP)
      {
        l2 = this.bbJ + this.bbL;
        break label639;
      }
      l2 = 0L;
      break label639;
      label798: bool = false;
      break label670;
      if (m == 184)
        this.bbS = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.i
 * JD-Core Version:    0.6.2
 */
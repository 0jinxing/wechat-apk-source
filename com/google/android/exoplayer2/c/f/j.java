package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.j.b;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class j
  implements h
{
  private boolean aTf;
  private m aTw;
  private final boolean[] bbM;
  private long bbO;
  private long bbQ;
  private final s bbX;
  private final boolean bbY;
  private final boolean bbZ;
  private String bbx;
  private final n bca;
  private final n bcb;
  private final n bcc;
  private j.a bcd;
  private final l bce;

  public j(s params, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(95122);
    this.bbX = params;
    this.bbY = paramBoolean1;
    this.bbZ = paramBoolean2;
    this.bbM = new boolean[3];
    this.bca = new n(7);
    this.bcb = new n(8);
    this.bcc = new n(6);
    this.bce = new l();
    AppMethodBeat.o(95122);
  }

  private void e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95126);
    if ((!this.aTf) || (this.bcd.bbZ))
    {
      this.bca.f(paramArrayOfByte, paramInt1, paramInt2);
      this.bcb.f(paramArrayOfByte, paramInt1, paramInt2);
    }
    this.bcc.f(paramArrayOfByte, paramInt1, paramInt2);
    this.bcd.f(paramArrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(95126);
  }

  public final void a(g paramg, v.d paramd)
  {
    AppMethodBeat.i(95124);
    paramd.rz();
    this.bbx = paramd.rB();
    this.aTw = paramg.dM(paramd.rA());
    this.bcd = new j.a(this.aTw, this.bbY, this.bbZ);
    this.bbX.a(paramg, paramd);
    AppMethodBeat.o(95124);
  }

  public final void d(long paramLong, boolean paramBoolean)
  {
    this.bbQ = paramLong;
  }

  public final void rn()
  {
    AppMethodBeat.i(95123);
    com.google.android.exoplayer2.i.j.b(this.bbM);
    this.bca.reset();
    this.bcb.reset();
    this.bcc.reset();
    this.bcd.reset();
    this.bbO = 0L;
    AppMethodBeat.o(95123);
  }

  public final void ro()
  {
  }

  public final void t(l paraml)
  {
    AppMethodBeat.i(95125);
    int i = paraml.position;
    int j = paraml.limit;
    byte[] arrayOfByte = paraml.data;
    this.bbO += paraml.tB();
    this.aTw.a(paraml, paraml.tB());
    int k = com.google.android.exoplayer2.i.j.a(arrayOfByte, i, j, this.bbM);
    if (k == j)
    {
      e(arrayOfByte, i, j);
      AppMethodBeat.o(95125);
      return;
    }
    int m = com.google.android.exoplayer2.i.j.k(arrayOfByte, k);
    int n = k - i;
    if (n > 0)
      e(arrayOfByte, i, k);
    int i1 = j - k;
    long l1 = this.bbO - i1;
    label136: long l2;
    Object localObject2;
    label372: int i3;
    if (n < 0)
    {
      i = -n;
      l2 = this.bbQ;
      Object localObject1;
      if ((!this.aTf) || (this.bcd.bbZ))
      {
        this.bca.ej(i);
        this.bcb.ej(i);
        if (this.aTf)
          break label1077;
        if ((this.bca.bcU) && (this.bcb.bcU))
        {
          localObject1 = new ArrayList();
          ((List)localObject1).add(Arrays.copyOf(this.bca.bcV, this.bca.bcW));
          ((List)localObject1).add(Arrays.copyOf(this.bcb.bcV, this.bcb.bcW));
          localObject2 = com.google.android.exoplayer2.i.j.k(this.bca.bcV, 3, this.bca.bcW);
          paraml = com.google.android.exoplayer2.i.j.m(this.bcb.bcV, this.bcb.bcW);
          this.aTw.f(Format.a(this.bbx, "video/avc", ((j.b)localObject2).width, ((j.b)localObject2).height, (List)localObject1, ((j.b)localObject2).brq));
          this.aTf = true;
          this.bcd.a((j.b)localObject2);
          this.bcd.a(paraml);
          this.bca.reset();
          this.bcb.reset();
        }
      }
      if (this.bcc.ej(i))
      {
        i = com.google.android.exoplayer2.i.j.j(this.bcc.bcV, this.bcc.bcW);
        this.bce.n(this.bcc.bcV, i);
        this.bce.setPosition(4);
        this.bbX.a(l2, this.bce);
      }
      paraml = this.bcd;
      if (paraml.bcj != 9)
      {
        if (paraml.bbZ)
        {
          localObject2 = paraml.bcn;
          localObject1 = paraml.bcm;
          if ((!((j.a.a)localObject2).bcp) || ((((j.a.a)localObject1).bcp) && (((j.a.a)localObject2).frameNum == ((j.a.a)localObject1).frameNum) && (((j.a.a)localObject2).bcu == ((j.a.a)localObject1).bcu) && (((j.a.a)localObject2).bcv == ((j.a.a)localObject1).bcv) && ((!((j.a.a)localObject2).bcw) || (!((j.a.a)localObject1).bcw) || (((j.a.a)localObject2).bcx == ((j.a.a)localObject1).bcx)) && ((((j.a.a)localObject2).bcs == ((j.a.a)localObject1).bcs) || ((((j.a.a)localObject2).bcs != 0) && (((j.a.a)localObject1).bcs != 0))) && ((((j.a.a)localObject2).bcr.bru != 0) || (((j.a.a)localObject1).bcr.bru != 0) || ((((j.a.a)localObject2).bcA == ((j.a.a)localObject1).bcA) && (((j.a.a)localObject2).bcB == ((j.a.a)localObject1).bcB))) && ((((j.a.a)localObject2).bcr.bru != 1) || (((j.a.a)localObject1).bcr.bru != 1) || ((((j.a.a)localObject2).bcC == ((j.a.a)localObject1).bcC) && (((j.a.a)localObject2).bcD == ((j.a.a)localObject1).bcD))) && (((j.a.a)localObject2).bcy == ((j.a.a)localObject1).bcy) && ((!((j.a.a)localObject2).bcy) || (!((j.a.a)localObject1).bcy) || (((j.a.a)localObject2).bcz == ((j.a.a)localObject1).bcz))))
            break label1170;
          i = 1;
          label725: if (i == 0);
        }
      }
      else
      {
        if (paraml.bco)
        {
          n = (int)(l1 - paraml.bck);
          if (!paraml.bbS)
            break label1175;
          i = 1;
          label755: int i2 = (int)(paraml.bck - paraml.bbR);
          paraml.aTw.a(paraml.bbJ, i, i2, i1 + n, null);
        }
        paraml.bbR = paraml.bck;
        paraml.bbJ = paraml.bcl;
        paraml.bbS = false;
        paraml.bco = true;
      }
      i3 = paraml.bbS;
      if (paraml.bcj != 5)
      {
        if ((!paraml.bbY) || (paraml.bcj != 1))
          break label1185;
        localObject2 = paraml.bcn;
        if ((!((j.a.a)localObject2).bcq) || ((((j.a.a)localObject2).bct != 7) && (((j.a.a)localObject2).bct != 2)))
          break label1180;
        i = 1;
        label879: if (i == 0)
          break label1185;
      }
    }
    label1170: label1175: label1180: label1185: for (i = 1; ; i = 0)
    {
      paraml.bbS = (i | i3);
      l2 = this.bbQ;
      if ((!this.aTf) || (this.bcd.bbZ))
      {
        this.bca.ei(m);
        this.bcb.ei(m);
      }
      this.bcc.ei(m);
      localObject2 = this.bcd;
      ((j.a)localObject2).bcj = m;
      ((j.a)localObject2).bcl = l2;
      ((j.a)localObject2).bck = l1;
      if (((((j.a)localObject2).bbY) && (((j.a)localObject2).bcj == 1)) || ((((j.a)localObject2).bbZ) && ((((j.a)localObject2).bcj == 5) || (((j.a)localObject2).bcj == 1) || (((j.a)localObject2).bcj == 2))))
      {
        paraml = ((j.a)localObject2).bcm;
        ((j.a)localObject2).bcm = ((j.a)localObject2).bcn;
        ((j.a)localObject2).bcn = paraml;
        ((j.a)localObject2).bcn.clear();
        ((j.a)localObject2).bci = 0;
        ((j.a)localObject2).bbV = true;
      }
      i = k + 3;
      break;
      i = 0;
      break label136;
      label1077: if (this.bca.bcU)
      {
        paraml = com.google.android.exoplayer2.i.j.k(this.bca.bcV, 3, this.bca.bcW);
        this.bcd.a(paraml);
        this.bca.reset();
        break label372;
      }
      if (!this.bcb.bcU)
        break label372;
      paraml = com.google.android.exoplayer2.i.j.m(this.bcb.bcV, this.bcb.bcW);
      this.bcd.a(paraml);
      this.bcb.reset();
      break label372;
      i = 0;
      break label725;
      i = 0;
      break label755;
      i = 0;
      break label879;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.j
 * JD-Core Version:    0.6.2
 */
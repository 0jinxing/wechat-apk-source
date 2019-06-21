package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

class gk$2 extends fx
{
  gk$2(gk paramgk, int paramInt, double[] paramArrayOfDouble, boolean paramBoolean, long paramLong, float paramFloat1, float paramFloat2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    super(paramInt, paramArrayOfDouble, paramBoolean);
  }

  public boolean a()
  {
    boolean bool = true;
    AppMethodBeat.i(99180);
    long l1 = System.currentTimeMillis() - this.j;
    double d1 = fh.b(l1, 0.0F, this.k, 5000L);
    double d2 = fh.b(l1, 0.0F, this.l, 5000L);
    double[] arrayOfDouble = this.b;
    arrayOfDouble[2] += Math.abs(d1);
    arrayOfDouble = this.b;
    arrayOfDouble[3] += Math.abs(d2);
    int i;
    int i1;
    if (this.b[2] >= Math.abs(this.m))
    {
      i = 1;
      if (this.b[3] < Math.abs(this.n))
        break label195;
      i1 = 1;
      label124: if (i == 0)
        break label201;
      this.b[0] = (this.o - this.q.o());
      label148: if (i1 == 0)
        break label212;
      this.b[1] = (this.p - this.q.p());
      label172: if ((i == 0) || (i1 == 0))
        break label223;
      AppMethodBeat.o(99180);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label195: i1 = 0;
      break label124;
      label201: this.b[0] = d1;
      break label148;
      label212: this.b[1] = d2;
      break label172;
      label223: AppMethodBeat.o(99180);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gk.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;

class go$4 extends fx
{
  go$4(go paramgo, int paramInt, double[] paramArrayOfDouble, long paramLong1, long paramLong2, PointF paramPointF)
  {
    super(paramInt, paramArrayOfDouble);
  }

  public boolean a()
  {
    AppMethodBeat.i(99391);
    long l1 = System.currentTimeMillis() - this.j;
    if (l1 > this.k)
    {
      go.a(this.m, false);
      AppMethodBeat.o(99391);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      double d;
      if (this.l.x != 0.0F)
      {
        d = fh.a(l1, this.l.x, -this.l.x, this.k);
        this.b[0] = d;
      }
      if (this.l.y != 0.0F)
      {
        d = fh.a(l1, this.l.y, -this.l.y, this.k);
        this.b[1] = d;
      }
      AppMethodBeat.o(99391);
    }
  }

  public void b()
  {
    AppMethodBeat.i(99390);
    go.a(this.m, false);
    AppMethodBeat.o(99390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.go.4
 * JD-Core Version:    0.6.2
 */
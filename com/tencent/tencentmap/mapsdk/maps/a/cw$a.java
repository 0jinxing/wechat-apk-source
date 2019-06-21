package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class cw$a
{
  long a;
  long b;
  long c;
  long d;
  long e;
  long f;
  long g = -1L;
  long h = -1L;
  long i = -1L;
  long j = -1L;
  long k = -1L;

  public final void a()
  {
    long l1 = -1L;
    this.g = (this.b - this.a);
    this.h = (this.c - this.b);
    this.i = (this.d - this.c);
    this.j = (this.e - this.d);
    this.k = (this.f - this.e);
    long l2 = this.g;
    if (l2 >= 0L)
    {
      this.g = l2;
      l2 = this.h;
      if (l2 < 0L)
        break label164;
      label96: this.h = l2;
      l2 = this.i;
      if (l2 < 0L)
        break label171;
      label112: this.i = l2;
      l2 = this.j;
      if (l2 < 0L)
        break label178;
    }
    while (true)
    {
      this.j = l2;
      long l3 = this.k;
      l2 = l1;
      if (l3 >= 0L)
        l2 = l3;
      this.k = l2;
      return;
      l2 = -1L;
      break;
      label164: l2 = -1L;
      break label96;
      label171: l2 = -1L;
      break label112;
      label178: l2 = -1L;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(98674);
    String str = "Stat{startToTryConnect=" + this.g + ", connectCost=" + this.h + ", connectToPost=" + this.i + ", postToRsp=" + this.j + ", rspToRead=" + this.k + '}';
    AppMethodBeat.o(98674);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cw.a
 * JD-Core Version:    0.6.2
 */
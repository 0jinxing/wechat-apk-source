package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class s$b
  implements Runnable
{
  final double bGn;
  final double bGo;
  final double bGp;
  final double bGq;
  final double bGr;
  final double bGs;
  final double lat;
  final double lng;

  private s$b(s params, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8)
  {
    this.lat = paramDouble1;
    this.lng = paramDouble2;
    this.bGn = paramDouble3;
    this.bGo = paramDouble4;
    this.bGp = paramDouble5;
    this.bGq = paramDouble6;
    this.bGr = paramDouble7;
    this.bGs = paramDouble8;
  }

  public final void run()
  {
    AppMethodBeat.i(55655);
    this.bGm.a(this.lat, this.lng, this.bGn, this.bGo, this.bGp, this.bGq, this.bGr, this.bGs);
    AppMethodBeat.o(55655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.b.a.a.s.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

class fd$a extends fd
{
  double d;

  fd$a(float paramFloat)
  {
    this.a = paramFloat;
    this.b = Double.TYPE;
  }

  fd$a(float paramFloat, double paramDouble)
  {
    this.a = paramFloat;
    this.d = paramDouble;
    this.b = Double.TYPE;
    this.c = true;
  }

  public Object a()
  {
    AppMethodBeat.i(98861);
    double d1 = this.d;
    AppMethodBeat.o(98861);
    return Double.valueOf(d1);
  }

  public a e()
  {
    AppMethodBeat.i(98862);
    a locala = new a(b(), this.d);
    locala.a(c());
    AppMethodBeat.o(98862);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fd.a
 * JD-Core Version:    0.6.2
 */
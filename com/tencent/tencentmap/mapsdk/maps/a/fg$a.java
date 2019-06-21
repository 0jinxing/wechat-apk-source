package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

class fg$a extends fg
{
  fa d;

  public fg$a(int paramInt, double[] paramArrayOfDouble)
  {
    super(paramInt, null);
    AppMethodBeat.i(98885);
    a(paramArrayOfDouble);
    AppMethodBeat.o(98885);
  }

  public void a(double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(98886);
    super.a(paramArrayOfDouble);
    this.d = ((fa)this.c);
    AppMethodBeat.o(98886);
  }

  public a c()
  {
    AppMethodBeat.i(98887);
    a locala = (a)super.a();
    locala.d = ((fa)locala.c);
    AppMethodBeat.o(98887);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fg.a
 * JD-Core Version:    0.6.2
 */
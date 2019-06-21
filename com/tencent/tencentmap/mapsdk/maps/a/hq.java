package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class hq extends m
{
  public String a = "";
  public int b = 0;
  public int c = 0;
  public int d = 0;
  public String e = "";
  public String f = "";
  public int g = 0;

  public final void readFrom(k paramk)
  {
    AppMethodBeat.i(99568);
    this.a = paramk.a(0, true);
    this.b = paramk.a(this.b, 1, true);
    this.c = paramk.a(this.c, 2, true);
    this.d = paramk.a(this.d, 3, false);
    this.e = paramk.a(4, false);
    this.f = paramk.a(5, false);
    this.g = paramk.a(this.g, 6, false);
    AppMethodBeat.o(99568);
  }

  public final void writeTo(l paraml)
  {
    AppMethodBeat.i(99567);
    paraml.a(this.a, 0);
    paraml.a(this.b, 1);
    paraml.a(this.c, 2);
    paraml.a(this.d, 3);
    if (this.e != null)
      paraml.a(this.e, 4);
    if (this.f != null)
      paraml.a(this.f, 5);
    paraml.a(this.g, 6);
    AppMethodBeat.o(99567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hq
 * JD-Core Version:    0.6.2
 */
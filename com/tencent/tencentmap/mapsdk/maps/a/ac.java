package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ac extends ak
  implements Cloneable
{
  public String a = "";
  public String b = "";
  public String c = "";
  public boolean d = true;
  public long e = 0L;
  public long f = 0L;
  public String g = "";
  public long h = 0L;
  private int i = 0;

  public final void a(ai paramai)
  {
    AppMethodBeat.i(98409);
    this.a = paramai.a(0, true);
    this.b = paramai.a(1, true);
    this.c = paramai.a(2, true);
    if (paramai.a((byte)0, 3, true) != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.d = bool;
      this.e = paramai.a(this.e, 4, true);
      this.f = paramai.a(this.f, 5, true);
      this.g = paramai.a(6, true);
      this.h = paramai.a(this.h, 7, true);
      this.i = paramai.a(this.i, 8, false);
      AppMethodBeat.o(98409);
      return;
    }
  }

  public final void a(aj paramaj)
  {
    AppMethodBeat.i(98408);
    paramaj.a(this.a, 0);
    paramaj.a(this.b, 1);
    paramaj.a(this.c, 2);
    paramaj.a(this.d);
    paramaj.a(this.e, 4);
    paramaj.a(this.f, 5);
    paramaj.a(this.g, 6);
    paramaj.a(this.h, 7);
    paramaj.a(this.i, 8);
    AppMethodBeat.o(98408);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ac
 * JD-Core Version:    0.6.2
 */
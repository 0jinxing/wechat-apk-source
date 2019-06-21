package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aa extends ak
{
  private static byte[] m;
  public byte a = (byte)0;
  public String b = "";
  public String c = "";
  public String d = "";
  public String e = "";
  public int f = 0;
  public byte[] g = null;
  public byte h = (byte)0;
  public byte i = (byte)0;
  public String j = "";
  public String k = "";
  public String l = "";

  public final void a(ai paramai)
  {
    AppMethodBeat.i(98405);
    this.a = paramai.a(this.a, 0, true);
    this.b = paramai.a(1, true);
    this.c = paramai.a(2, true);
    this.d = paramai.a(3, true);
    this.e = paramai.a(4, true);
    this.f = paramai.a(this.f, 5, true);
    if (m == null)
    {
      byte[] arrayOfByte = (byte[])new byte[1];
      m = arrayOfByte;
      ((byte[])arrayOfByte)[0] = ((byte)0);
    }
    this.g = ((byte[])paramai.b(6, true));
    this.h = paramai.a(this.h, 7, true);
    this.i = paramai.a(this.i, 8, true);
    this.j = paramai.a(9, false);
    this.k = paramai.a(10, false);
    this.l = paramai.a(11, false);
    AppMethodBeat.o(98405);
  }

  public final void a(aj paramaj)
  {
    AppMethodBeat.i(98404);
    paramaj.a(this.a, 0);
    paramaj.a(this.b, 1);
    paramaj.a(this.c, 2);
    paramaj.a(this.d, 3);
    paramaj.a(this.e, 4);
    paramaj.a(this.f, 5);
    paramaj.a(this.g, 6);
    paramaj.a(this.h, 7);
    paramaj.a(this.i, 8);
    if (this.j != null)
      paramaj.a(this.j, 9);
    if (this.k != null)
      paramaj.a(this.k, 10);
    if (this.l != null)
      paramaj.a(this.l, 11);
    AppMethodBeat.o(98404);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.aa
 * JD-Core Version:    0.6.2
 */
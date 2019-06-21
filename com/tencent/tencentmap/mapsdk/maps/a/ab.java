package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ab extends ak
{
  private static byte[] j;
  public byte a = (byte)0;
  public int b = 0;
  public byte[] c = null;
  public String d = "";
  public long e = 0L;
  private byte f = (byte)0;
  private byte g = (byte)0;
  private String h = "";
  private String i = "";

  public final void a(ai paramai)
  {
    AppMethodBeat.i(98407);
    this.a = paramai.a(this.a, 0, true);
    this.b = paramai.a(this.b, 1, true);
    if (j == null)
    {
      byte[] arrayOfByte = (byte[])new byte[1];
      j = arrayOfByte;
      ((byte[])arrayOfByte)[0] = ((byte)0);
    }
    this.c = ((byte[])paramai.b(2, true));
    this.d = paramai.a(3, true);
    this.f = paramai.a(this.f, 4, true);
    this.g = paramai.a(this.g, 5, true);
    this.e = paramai.a(this.e, 6, true);
    this.h = paramai.a(7, false);
    this.i = paramai.a(8, false);
    AppMethodBeat.o(98407);
  }

  public final void a(aj paramaj)
  {
    AppMethodBeat.i(98406);
    paramaj.a(this.a, 0);
    paramaj.a(this.b, 1);
    paramaj.a(this.c, 2);
    paramaj.a(this.d, 3);
    paramaj.a(this.f, 4);
    paramaj.a(this.g, 5);
    paramaj.a(this.e, 6);
    if (this.h != null)
      paramaj.a(this.h, 7);
    if (this.i != null)
      paramaj.a(this.i, 8);
    AppMethodBeat.o(98406);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ab
 * JD-Core Version:    0.6.2
 */
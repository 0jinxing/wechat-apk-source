package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class am extends ak
{
  private static byte[] k = null;
  private static Map<String, String> l = null;
  public short a = (short)3;
  public int b = 0;
  public String c = null;
  public String d = null;
  public byte[] e;
  private byte f = (byte)0;
  private int g = 0;
  private int h = 0;
  private Map<String, String> i;
  private Map<String, String> j;

  public final void a(ai paramai)
  {
    AppMethodBeat.i(98473);
    try
    {
      this.a = paramai.a(this.a, 1, true);
      this.f = paramai.a(this.f, 2, true);
      this.g = paramai.a(this.g, 3, true);
      this.b = paramai.a(this.b, 4, true);
      this.c = paramai.a(5, true);
      this.d = paramai.a(6, true);
      if (k == null)
        k = new byte[] { 0 };
      this.e = ((byte[])paramai.b(7, true));
      this.h = paramai.a(this.h, 8, true);
      HashMap localHashMap;
      if (l == null)
      {
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        l = localHashMap;
        localHashMap.put("", "");
      }
      this.i = ((Map)paramai.a(l, 9, true));
      if (l == null)
      {
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        l = localHashMap;
        localHashMap.put("", "");
      }
      this.j = ((Map)paramai.a(l, 10, true));
      AppMethodBeat.o(98473);
      return;
    }
    catch (Exception paramai)
    {
      paramai = new RuntimeException(paramai);
      AppMethodBeat.o(98473);
    }
    throw paramai;
  }

  public final void a(aj paramaj)
  {
    AppMethodBeat.i(98472);
    paramaj.a(this.a, 1);
    paramaj.a(this.f, 2);
    paramaj.a(this.g, 3);
    paramaj.a(this.b, 4);
    paramaj.a(this.c, 5);
    paramaj.a(this.d, 6);
    paramaj.a(this.e, 7);
    paramaj.a(this.h, 8);
    paramaj.a(this.i, 9);
    paramaj.a(this.j, 10);
    AppMethodBeat.o(98472);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.am
 * JD-Core Version:    0.6.2
 */
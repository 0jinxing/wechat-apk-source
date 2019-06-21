package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class af extends ak
{
  private static Map<String, String> g;
  private static ArrayList<String> h;
  private static ArrayList<String> i;
  public byte a = (byte)0;
  public byte b = (byte)0;
  public String c = "";
  public Map<String, String> d = null;
  public ArrayList<String> e = null;
  public ArrayList<String> f = null;

  public final void a(ai paramai)
  {
    AppMethodBeat.i(98415);
    this.a = paramai.a(this.a, 0, true);
    this.b = paramai.a(this.b, 1, true);
    this.c = paramai.a(2, true);
    if (g == null)
    {
      g = new HashMap();
      g.put("", "");
    }
    this.d = ((Map)paramai.a(g, 3, true));
    if (h == null)
    {
      h = new ArrayList();
      h.add("");
    }
    this.e = ((ArrayList)paramai.a(h, 4, false));
    if (i == null)
    {
      i = new ArrayList();
      i.add("");
    }
    this.f = ((ArrayList)paramai.a(i, 6, false));
    AppMethodBeat.o(98415);
  }

  public final void a(aj paramaj)
  {
    AppMethodBeat.i(98414);
    paramaj.a(this.a, 0);
    paramaj.a(this.b, 1);
    paramaj.a(this.c, 2);
    paramaj.a(this.d, 3);
    if (this.e != null)
      paramaj.a(this.e, 4);
    if (this.f != null)
      paramaj.a(this.f, 6);
    AppMethodBeat.o(98414);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.af
 * JD-Core Version:    0.6.2
 */
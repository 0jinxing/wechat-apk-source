package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class ae extends ak
{
  private static ArrayList<af> e;
  private static Map<String, String> f;
  public ArrayList<af> a = null;
  public int b = 0;
  public String c = "";
  public Map<String, String> d = null;

  public final void a(ai paramai)
  {
    AppMethodBeat.i(98413);
    if (e == null)
    {
      e = new ArrayList();
      af localaf = new af();
      e.add(localaf);
    }
    this.a = ((ArrayList)paramai.a(e, 0, true));
    this.b = paramai.a(this.b, 1, true);
    this.c = paramai.a(2, true);
    if (f == null)
    {
      f = new HashMap();
      f.put("", "");
    }
    this.d = ((Map)paramai.a(f, 3, false));
    AppMethodBeat.o(98413);
  }

  public final void a(aj paramaj)
  {
    AppMethodBeat.i(98412);
    paramaj.a(this.a, 0);
    paramaj.a(this.b, 1);
    paramaj.a(this.c, 2);
    if (this.d != null)
      paramaj.a(this.d, 3);
    AppMethodBeat.o(98412);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ae
 * JD-Core Version:    0.6.2
 */
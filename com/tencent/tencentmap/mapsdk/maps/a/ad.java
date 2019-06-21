package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class ad extends ak
  implements Cloneable
{
  private static ArrayList<ac> b;
  public ArrayList<ac> a = null;

  public final void a(ai paramai)
  {
    AppMethodBeat.i(98411);
    if (b == null)
    {
      b = new ArrayList();
      ac localac = new ac();
      b.add(localac);
    }
    this.a = ((ArrayList)paramai.a(b, 0, true));
    AppMethodBeat.o(98411);
  }

  public final void a(aj paramaj)
  {
    AppMethodBeat.i(98410);
    paramaj.a(this.a, 0);
    AppMethodBeat.o(98410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ad
 * JD-Core Version:    0.6.2
 */
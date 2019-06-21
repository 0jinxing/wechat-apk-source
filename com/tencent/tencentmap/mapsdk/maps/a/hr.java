package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class hr extends m
{
  static ArrayList<hq> c;
  public int a = 0;
  public ArrayList<hq> b = null;

  static
  {
    AppMethodBeat.i(99571);
    c = new ArrayList();
    hq localhq = new hq();
    c.add(localhq);
    AppMethodBeat.o(99571);
  }

  public final void readFrom(k paramk)
  {
    AppMethodBeat.i(99570);
    this.a = paramk.a(this.a, 0, true);
    this.b = ((ArrayList)paramk.a(c, 1, false));
    AppMethodBeat.o(99570);
  }

  public final void writeTo(l paraml)
  {
    AppMethodBeat.i(99569);
    paraml.a(this.a, 0);
    if (this.b != null)
      paraml.a(this.b, 1);
    AppMethodBeat.o(99569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hr
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

class iz$1
  implements Comparator<hz>
{
  iz$1(iz paramiz)
  {
  }

  public int a(hz paramhz1, hz paramhz2)
  {
    AppMethodBeat.i(99913);
    int i = Float.compare(paramhz1.D(), paramhz2.D());
    AppMethodBeat.o(99913);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.iz.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class kp
  implements ko
{
  public final <T, S extends kt> kj<T, S> a(kt paramkt, List<? extends kj<T, S>> paramList)
  {
    AppMethodBeat.i(100261);
    paramkt = (kj)Collections.min(paramList, ke.a(new Comparator[] { ke.a(paramkt.a()), ke.b(paramkt.a()) }));
    AppMethodBeat.o(100261);
    return paramkt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kp
 * JD-Core Version:    0.6.2
 */
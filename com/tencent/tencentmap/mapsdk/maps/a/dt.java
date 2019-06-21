package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class dt extends LinkedHashMap<String, String>
{
  dt(ds paramds, int paramInt, float paramFloat, boolean paramBoolean)
  {
    super(8, 1.0F, true);
  }

  protected final boolean removeEldestEntry(Map.Entry<String, String> paramEntry)
  {
    AppMethodBeat.i(98745);
    boolean bool;
    if (size() > 8)
    {
      bool = true;
      AppMethodBeat.o(98745);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(98745);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dt
 * JD-Core Version:    0.6.2
 */
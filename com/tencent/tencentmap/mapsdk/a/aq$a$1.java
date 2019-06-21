package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

class aq$a$1 extends LinkedHashMap<K, V>
{
  aq$a$1(aq.a parama, int paramInt, float paramFloat, boolean paramBoolean)
  {
    super(paramInt, paramFloat, paramBoolean);
  }

  protected boolean removeEldestEntry(Map.Entry<K, V> paramEntry)
  {
    AppMethodBeat.i(100573);
    boolean bool;
    if (size() > aq.a.a(this.a))
    {
      bool = true;
      AppMethodBeat.o(100573);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100573);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.aq.a.1
 * JD-Core Version:    0.6.2
 */
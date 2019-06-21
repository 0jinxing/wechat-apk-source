package com.tencent.mm.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.e.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class ArtistCacheManager$a
{
  public HashMap<a, d> efo;

  public ArtistCacheManager$a(ArtistCacheManager paramArtistCacheManager)
  {
    AppMethodBeat.i(116208);
    this.efo = new HashMap();
    AppMethodBeat.o(116208);
  }

  public final void clearAll()
  {
    AppMethodBeat.i(116209);
    Iterator localIterator = this.efo.entrySet().iterator();
    while (localIterator.hasNext())
      ((d)((Map.Entry)localIterator.next()).getValue()).onDestroy();
    AppMethodBeat.o(116209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.ArtistCacheManager.a
 * JD-Core Version:    0.6.2
 */
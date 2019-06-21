package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class a$5 extends LinkedHashMap<Long, Integer>
{
  a$5(int paramInt)
  {
    super(paramInt, 0.75F);
  }

  protected final boolean removeEldestEntry(Map.Entry<Long, Integer> paramEntry)
  {
    AppMethodBeat.i(36065);
    if ((size() > 500) && (paramEntry != null))
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "remove eldest ad snsId " + paramEntry.getKey());
    boolean bool;
    if (size() > 500)
    {
      bool = true;
      AppMethodBeat.o(36065);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36065);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.5
 * JD-Core Version:    0.6.2
 */
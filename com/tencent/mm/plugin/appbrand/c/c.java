package com.tencent.mm.plugin.appbrand.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class c
{
  public HashMap<String, a> hez;

  public c()
  {
    AppMethodBeat.i(129824);
    this.hez = new HashMap();
    AppMethodBeat.o(129824);
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(129825);
    if ((parama == null) || (bo.isNullOrNil(parama.czD)))
    {
      ab.e("MicroMsg.AppbrandMediaCdnItemManager", "item is null or local id is null, ignore this add");
      AppMethodBeat.o(129825);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppbrandMediaCdnItemManager", "add cdn item, local id : %s, file path : %s", new Object[] { parama.czD, parama.heo });
      this.hez.put(parama.czD, parama);
      AppMethodBeat.o(129825);
    }
  }

  public final a yE(String paramString)
  {
    AppMethodBeat.i(129826);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppbrandMediaCdnItemManager", "get by local id error, local id is null or nil");
      paramString = null;
      AppMethodBeat.o(129826);
    }
    while (true)
    {
      return paramString;
      paramString = (a)this.hez.get(paramString);
      AppMethodBeat.o(129826);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.c.c
 * JD-Core Version:    0.6.2
 */
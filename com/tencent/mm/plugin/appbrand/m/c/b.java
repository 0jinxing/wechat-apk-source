package com.tencent.mm.plugin.appbrand.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.m;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.appstorage.s;
import com.tencent.mm.plugin.appbrand.m.a.c;
import com.tencent.mm.plugin.appbrand.m.a.d;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b extends d
{
  private m iqe = null;

  public final int aIT()
  {
    return 7;
  }

  public final String b(com.tencent.mm.aa.i parami, c paramc)
  {
    AppMethodBeat.i(102193);
    Object localObject1 = paramc.gMN;
    int i;
    if (this.iqe == null)
    {
      localObject2 = ((q)localObject1).getRuntime();
      if (!(((q)localObject1).getRuntime().asE() instanceof s))
      {
        parami = new IllegalStateException("getFlattenFileSystem not LuggageFileSystemRegistry");
        AppMethodBeat.o(102193);
        throw parami;
      }
      localObject2 = ((s)((com.tencent.mm.plugin.appbrand.i)localObject2).asE()).gYd;
      i = 0;
      if (i < ((List)localObject2).size())
      {
        localObject1 = (p)((List)localObject2).get(i);
        if (!(localObject1 instanceof m))
          break label190;
        this.iqe = ((m)localObject1);
      }
    }
    localObject1 = this.iqe;
    Object localObject2 = null;
    if (localObject1 != null)
      localObject2 = ((m)localObject1).yl(parami.optString("path"));
    while (true)
    {
      ab.d("MicroMsg.GetFullPathOfFlatFSSync", "path:%s fullPath:%s", new Object[] { parami.optString("path"), localObject2 });
      parami = new HashMap();
      parami.put("fullPath", localObject2);
      parami = paramc.B(parami);
      AppMethodBeat.o(102193);
      return parami;
      label190: i++;
      break;
      ab.e("MicroMsg.GetFullPathOfFlatFSSync", "getFlattenFileSystem null");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.c.b
 * JD-Core Version:    0.6.2
 */
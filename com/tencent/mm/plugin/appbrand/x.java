package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.t;
import com.tencent.mm.d.a.t.a;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.s.u;
import java.util.ArrayList;

public final class x extends w
{
  public x(q paramq)
  {
    super(paramq);
  }

  protected final t auv()
  {
    AppMethodBeat.i(129131);
    ae localae = new ae(this.ciG);
    AppMethodBeat.o(129131);
    return localae;
  }

  protected final void b(ArrayList<t.a> paramArrayList, String paramString)
  {
    AppMethodBeat.i(129133);
    super.b(paramArrayList, paramString);
    paramArrayList.add(new ae.a(this.gNC.auf() + "WAWorker.js", aw.a(this.gNC.getRuntime(), "WAWorker.js"), this.gNC.getAppId(), this.gNC.atU()));
    paramString = u.getSysInfo();
    paramArrayList.add(new t.a(this.gNC.auf() + "sourcemapSysinfo", paramString));
    paramString = aw.a(this.gNC.getRuntime(), "WASourceMap.js");
    paramArrayList.add(new t.a(this.gNC.auf() + "WASourceMap.js", paramString));
    AppMethodBeat.o(129133);
  }

  protected final t.a xi(String paramString)
  {
    AppMethodBeat.i(129132);
    paramString = new ae.a(super.xi(paramString), u.a(this.gNC.getRuntime(), paramString, this.gNC.aug()), this.gNC.getAppId(), this.gNC.atU());
    AppMethodBeat.o(129132);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.x
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.a.a.a;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.y;

final class w$2
  implements a.a
{
  w$2(w paramw)
  {
  }

  public final String avJ()
  {
    AppMethodBeat.i(131899);
    Object localObject = f.auV().a(this.ihI.ihz.toString(), this.ihI.cvn, new String[] { "versionMd5" });
    localObject = "_" + ((at)localObject).field_versionMd5;
    AppMethodBeat.o(131899);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.w.2
 * JD-Core Version:    0.6.2
 */
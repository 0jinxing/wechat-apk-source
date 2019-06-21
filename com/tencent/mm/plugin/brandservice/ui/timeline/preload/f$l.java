package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.a.a;
import a.f.b.j;
import a.f.b.k;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"printDataState", "", "invoke"})
final class f$l extends k
  implements a<String>
{
  f$l(f paramf)
  {
    super(0);
  }

  public final String aXd()
  {
    AppMethodBeat.i(14824);
    Object localObject = new StringBuilder();
    if (!this.jSy.jRS)
      ((StringBuilder)localObject).append("async;");
    if (this.jSy.jRW)
      ((StringBuilder)localObject).append("mounted;");
    if (this.jSy.jSa)
      ((StringBuilder)localObject).append("cache_tmpl;");
    if (m.ar((CharSequence)localObject))
      ((StringBuilder)localObject).append("ok;");
    localObject = ((StringBuilder)localObject).toString();
    j.o(localObject, "sb.toString()");
    AppMethodBeat.o(14824);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.f.l
 * JD-Core Version:    0.6.2
 */
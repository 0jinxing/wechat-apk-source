package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.a.a;
import a.f.b.j;
import a.f.b.k;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"printWebViewState", "", "invoke"})
final class f$m extends k
  implements a<String>
{
  f$m(f paramf)
  {
    super(0);
  }

  public final String aXd()
  {
    AppMethodBeat.i(14826);
    Object localObject = new StringBuilder();
    if (this.jSy.jSc == 2)
      ((StringBuilder)localObject).append("relanuch;");
    if (!this.jSy.jRT)
      ((StringBuilder)localObject).append("cold;");
    if (!this.jSy.jRV)
      ((StringBuilder)localObject).append("inject fail;");
    if (this.jSy.jSt)
      ((StringBuilder)localObject).append("h5;");
    if (this.jSy.jRZ)
      ((StringBuilder)localObject).append("xweb_cc;");
    if (m.ar((CharSequence)localObject))
      ((StringBuilder)localObject).append("ok;");
    localObject = ((StringBuilder)localObject).toString();
    j.o(localObject, "sb.toString()");
    AppMethodBeat.o(14826);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.f.m
 * JD-Core Version:    0.6.2
 */
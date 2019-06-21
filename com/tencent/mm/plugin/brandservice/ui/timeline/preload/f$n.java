package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.a.a;
import a.f.b.j;
import a.f.b.k;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"printProcessState", "", "invoke"})
final class f$n extends k
  implements a<String>
{
  f$n(f paramf)
  {
    super(0);
  }

  public final String aXd()
  {
    AppMethodBeat.i(14828);
    Object localObject = new StringBuilder();
    if (this.jSy.jSc == 1)
      ((StringBuilder)localObject).append("relanuch;");
    if (!this.jSy.jSb)
      ((StringBuilder)localObject).append("cold;");
    if (m.ar((CharSequence)localObject))
      ((StringBuilder)localObject).append("ok;");
    localObject = ((StringBuilder)localObject).toString();
    j.o(localObject, "sb.toString()");
    AppMethodBeat.o(14828);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.f.n
 * JD-Core Version:    0.6.2
 */
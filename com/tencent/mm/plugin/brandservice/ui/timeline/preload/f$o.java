package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.a.a;
import a.f.b.j;
import a.f.b.k;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"printTmplState", "", "invoke"})
final class f$o extends k
  implements a<String>
{
  f$o(f paramf)
  {
    super(0);
  }

  public final String aXd()
  {
    AppMethodBeat.i(14830);
    Object localObject = new StringBuilder();
    if (this.jSy.jRX)
      ((StringBuilder)localObject).append("zip;");
    if (this.jSy.jRY)
      ((StringBuilder)localObject).append("prefixMP;");
    if (m.ar((CharSequence)localObject))
      ((StringBuilder)localObject).append("none;");
    localObject = ((StringBuilder)localObject).toString();
    j.o(localObject, "sb.toString()");
    AppMethodBeat.o(14830);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.f.o
 * JD-Core Version:    0.6.2
 */
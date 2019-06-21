package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.a.a;
import a.f.b.j;
import a.f.b.k;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.preload.TmplParams;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"printDebugger", "", "invoke"})
final class f$k extends k
  implements a<String>
{
  f$k(f paramf)
  {
    super(0);
  }

  public final String aXd()
  {
    AppMethodBeat.i(14822);
    Object localObject1 = new StringBuilder();
    Object localObject2 = g.jSD;
    if (g.a.aXk())
      ((StringBuilder)localObject1).append("\nno re-direct;");
    localObject2 = g.jSD;
    if (!g.a.aXf())
      ((StringBuilder)localObject1).append("\nno preload data;");
    localObject2 = g.jSD;
    if (g.a.aXl())
      ((StringBuilder)localObject1).append("\nno preload webview;");
    localObject2 = g.jSD;
    if (g.a.aXh())
      ((StringBuilder)localObject1).append("\ndata no expire;");
    localObject2 = g.jSD;
    if (g.a.aXm())
      ((StringBuilder)localObject1).append("\nno red;");
    localObject2 = this.jSy.aWY().upP;
    j.o(localObject2, "tmplParams.headers");
    if (!m.ar((CharSequence)localObject2));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        ((StringBuilder)localObject1).append(this.jSy.aWY().upP);
      if (m.ar((CharSequence)localObject1))
        ((StringBuilder)localObject1).append("none;");
      localObject1 = ((StringBuilder)localObject1).toString();
      j.o(localObject1, "sb.toString()");
      AppMethodBeat.o(14822);
      return localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.f.k
 * JD-Core Version:    0.6.2
 */
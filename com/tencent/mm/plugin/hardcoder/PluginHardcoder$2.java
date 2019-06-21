package com.tencent.mm.plugin.hardcoder;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class PluginHardcoder$2
  implements k.a
{
  PluginHardcoder$2(PluginHardcoder paramPluginHardcoder)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(60251);
    ab.i("MicroMsg.PluginHardcoder", "abTestListener onNotifyChange stack[%s]", new Object[] { bo.dpG() });
    if ((paramString != null) && (paramString.length() > 0) && ("event_updated".equals(paramString)))
      g.RS().m(new PluginHardcoder.2.1(this), 100L);
    AppMethodBeat.o(60251);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardcoder.PluginHardcoder.2
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.fingerprint;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.plugin.fingerprint.a.a;

public class PluginFingerprint extends f
  implements a
{
  public void configure(g paramg)
  {
    AppMethodBeat.i(3228);
    paramg.SG();
    AppMethodBeat.o(3228);
  }

  public void dependency()
  {
  }

  public void execute(g paramg)
  {
    AppMethodBeat.i(3229);
    paramg.SG();
    AppMethodBeat.o(3229);
  }

  public void installed()
  {
    AppMethodBeat.i(3227);
    alias(PluginFingerprint.class);
    AppMethodBeat.o(3227);
  }

  public String name()
  {
    return "plugin-fingerprint";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.PluginFingerprint
 * JD-Core Version:    0.6.2
 */
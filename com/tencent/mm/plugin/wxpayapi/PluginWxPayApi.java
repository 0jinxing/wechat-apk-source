package com.tencent.mm.plugin.wxpayapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.pluginsdk.wallet.b;

public class PluginWxPayApi extends f
  implements com.tencent.mm.plugin.wxpayapi.a.a
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(55860);
    paramg.SG();
    AppMethodBeat.o(55860);
  }

  public void dependency()
  {
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(55861);
    if (paramg.SG())
      com.tencent.mm.kernel.g.a(b.class, new com.tencent.mm.plugin.o.a());
    AppMethodBeat.o(55861);
  }

  public void installed()
  {
    AppMethodBeat.i(55859);
    alias(PluginWxPayApi.class);
    AppMethodBeat.o(55859);
  }

  public String name()
  {
    return "plugin-wxpayapi";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxpayapi.PluginWxPayApi
 * JD-Core Version:    0.6.2
 */
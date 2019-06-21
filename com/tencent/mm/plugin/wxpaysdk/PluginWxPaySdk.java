package com.tencent.mm.plugin.wxpaysdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.plugin.wxpaysdk.a.a;

public class PluginWxPaySdk extends f
  implements a
{
  public void configure(g paramg)
  {
    AppMethodBeat.i(56664);
    paramg.SG();
    AppMethodBeat.o(56664);
  }

  public void dependency()
  {
  }

  public void execute(g paramg)
  {
    AppMethodBeat.i(56665);
    paramg.SG();
    AppMethodBeat.o(56665);
  }

  public void installed()
  {
    AppMethodBeat.i(56663);
    alias(PluginWxPaySdk.class);
    AppMethodBeat.o(56663);
  }

  public String name()
  {
    return "plugin-wxpaysdk";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxpaysdk.PluginWxPaySdk
 * JD-Core Version:    0.6.2
 */
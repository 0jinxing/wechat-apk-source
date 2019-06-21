package com.tencent.mm;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.q;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.plugin.messenger.foundation.a.h;
import com.tencent.mm.sdk.e.j;
import java.util.HashMap;

public class PluginFunctionMsg extends com.tencent.mm.kernel.b.f
  implements q, com.tencent.mm.kernel.api.a
{
  private static HashMap<Integer, h.d> cbO;

  static
  {
    AppMethodBeat.i(35444);
    cbO = new HashMap();
    String str = j.a(com.tencent.mm.api.f.ccO, "FunctionMsgItem");
    cbO.put(Integer.valueOf("FunctionMsgItem".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return this.cbP;
      }
    });
    AppMethodBeat.o(35444);
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return cbO;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(35442);
    super.configure(paramg);
    com.tencent.mm.kernel.g.a(h.class, getReceiver());
    AppMethodBeat.o(35442);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public com.tencent.mm.u.a getReceiver()
  {
    return com.tencent.mm.u.a.eAA;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.PluginFunctionMsg
 * JD-Core Version:    0.6.2
 */
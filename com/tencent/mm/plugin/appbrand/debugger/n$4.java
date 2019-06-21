package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.m;
import com.tencent.mm.g.a.m.a;
import com.tencent.mm.protocal.protobuf.crb;
import com.tencent.mm.sdk.b.c;
import org.json.JSONObject;

final class n$4 extends c<m>
{
  n$4(n paramn)
  {
    AppMethodBeat.i(101837);
    this.xxI = m.class.getName().hashCode();
    AppMethodBeat.o(101837);
  }

  private boolean a(m paramm)
  {
    AppMethodBeat.i(101838);
    if ((paramm == null) || (paramm.csn == null) || (paramm.csn.csq == null))
      AppMethodBeat.o(101838);
    while (true)
    {
      return true;
      crb localcrb = new crb();
      localcrb.cso = paramm.csn.cso;
      localcrb.csp = paramm.csn.csp;
      localcrb.xoK = paramm.csn.csq.toString();
      localcrb.timestamp = System.currentTimeMillis();
      paramm = t.a(localcrb, this.hjY.hjR, "networkDebugAPI");
      this.hjY.a(paramm);
      AppMethodBeat.o(101838);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.n.4
 * JD-Core Version:    0.6.2
 */
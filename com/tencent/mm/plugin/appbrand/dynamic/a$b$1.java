package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.protocal.protobuf.ctb;
import com.tencent.mm.protocal.protobuf.ctc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.Map;

final class a$b$1
  implements Runnable
{
  a$b$1(a.b paramb, c paramc, String paramString, com.tencent.mm.ipcinvoker.c paramc1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10644);
    Object localObject = this.hla;
    ab.i("MicroMsg.DynamicPageViewIPCProxy", "detach(%s)", new Object[] { ((c)localObject).eIq });
    ((c)localObject).apg = false;
    ((c)localObject).cleanup();
    ((c)localObject).eIn = null;
    ((c)localObject).hll = null;
    ((c)localObject).eIq = null;
    ((c)localObject).hcl = null;
    k.Ab(this.val$id);
    this.eFW.ao(null);
    f localf = f.azA();
    String str = this.val$id;
    if (!localf.hlB.containsKey(str))
    {
      ab.w("MicroMsg.DynamicPageViewStateMonitor", "OnDettach but no keylist found, widgetId[%s]", new Object[] { str });
      AppMethodBeat.o(10644);
    }
    while (true)
    {
      return;
      localObject = (f.b)localf.hlB.get(str);
      ab.i("MicroMsg.DynamicPageViewStateMonitor", "OnDettach ready to report keyList[%s]", new Object[] { ((f.b)localObject).hlF.toString() });
      if (((f.b)localObject).hlF.size() > 0)
      {
        b.a locala = new b.a();
        locala.fsI = 2653;
        locala.uri = "/cgi-bin/mmux-bin/wxaapp/wxaapp_widgetalarm";
        ctb localctb = new ctb();
        localctb.csB = u.pr(str);
        localctb.id = ((f.b)localObject).fmr;
        localctb.xqi = ((f.b)localObject).hlF;
        localctb.query = ((f.b)localObject).query;
        locala.fsJ = localctb;
        locala.fsK = new ctc();
        b.a(locala.acD(), localf.hlC);
      }
      AppMethodBeat.o(10644);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.b.1
 * JD-Core Version:    0.6.2
 */
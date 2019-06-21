package com.tencent.mm.plugin.webview.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cz;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.modelappbrand.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.c;
import java.util.Iterator;
import java.util.List;

public final class a$1
  implements Runnable
{
  public a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5763);
    ab.i("WidgetPkgCoverageReport", "begin check");
    b.cWr();
    Object localObject1 = a.b.eGM;
    localObject1 = com.tencent.mm.ipcinvoker.wx_extension.a.a.ll("100429");
    if ((localObject1 == null) || (!((c)localObject1).isValid()));
    for (boolean bool = false; ; bool = b.a((c)localObject1))
    {
      localObject2 = ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.K(com.tencent.mm.modelappbrand.g.class)).abA();
      localObject1 = new StringBuilder();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        x localx = (x)((Iterator)localObject2).next();
        ((StringBuilder)localObject1).append(":").append(localx.csB).append("_").append(localx.version).append("_").append(localx.cvZ);
      }
    }
    Object localObject2 = new cz();
    if (bool);
    for (long l = 1L; ; l = 0L)
    {
      ((cz)localObject2).diz = l;
      ((cz)localObject2).ia(((StringBuilder)localObject1).toString()).ajK();
      ab.i("WidgetPkgCoverageReport", "end check");
      AppMethodBeat.o(5763);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.a.a.a.1
 * JD-Core Version:    0.6.2
 */
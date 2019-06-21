package com.tencent.mm.plugin.brandservice.ui.timeline.preload.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.ci.g;
import com.tencent.mm.protocal.protobuf.chh;
import com.tencent.mm.protocal.protobuf.chi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

final class c$1
  implements Runnable
{
  c$1(c paramc, chi paramchi, int paramInt, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14413);
    ab.i("MicroMsg.Preload.TmplDownloader", "Type:%d Version:%d CdnUrl:%s  start download md5:%s", new Object[] { Integer.valueOf(this.jTO.jCt), Integer.valueOf(this.jTO.Version), this.jTO.vZm, this.jTO.Md5 });
    int i = this.jTO.jCt;
    int j = this.jTO.Version;
    String str = this.jTO.vZm;
    boolean bool = this.jTO.xgd;
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.jTO.xgc.iterator();
    while (localIterator.hasNext())
    {
      localObject = (chh)localIterator.next();
      if ((!bo.isNullOrNil(((chh)localObject).vMU)) && (!bo.isNullOrNil(((chh)localObject).pXM)))
        localHashMap.put(((chh)localObject).vMU, ((chh)localObject).pXM);
    }
    Object localObject = this.jTO.wld;
    int k = this.jTO.wUX;
    g.dOW().h(new c.1.2(this, bool, str, localHashMap)).g(new c.1.1(this, k, i, (String)localObject, localHashMap, j));
    AppMethodBeat.o(14413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.c.1
 * JD-Core Version:    0.6.2
 */
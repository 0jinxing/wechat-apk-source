package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.b;
import com.tencent.xweb.c;
import java.util.Map;

final class ReadMailUI$2
  implements Runnable
{
  ReadMailUI$2(ReadMailUI paramReadMailUI, b paramb, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(68420);
    if (this.pzZ.isFinishing())
      AppMethodBeat.o(68420);
    while (true)
    {
      return;
      try
      {
        Object localObject2 = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
        ((ReadMailProxy)localObject2).<init>(ReadMailUI.l(this.pzZ), null);
        localObject2 = (Map)((ReadMailProxy)localObject2).REMOTE_CALL("getCookie", new Object[0]);
        localObject1 = localObject2;
        if (localObject1 != null)
        {
          this.pAa.setCookie(v.ccw(), "skey=" + (String)localObject1.get("skey"));
          this.pAa.setCookie(v.ccw(), "uin=" + (String)localObject1.get("uin"));
          this.pAa.setCookie(v.ccw(), "svrid=" + (String)localObject1.get("svrid"));
          c.dTT();
          c.sync();
        }
        if ((!this.pzZ.isFinishing()) && (ReadMailUI.g(this.pzZ) != null))
          this.cfC.run();
        AppMethodBeat.o(68420);
      }
      catch (Exception localException)
      {
        while (true)
          ab.w("MicroMsg.ReadMailUI", "getCookie, ex = %s", new Object[] { localException.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.2
 * JD-Core Version:    0.6.2
 */
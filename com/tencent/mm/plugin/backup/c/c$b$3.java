package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.g.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import junit.framework.Assert;

final class c$b$3
  implements Runnable
{
  c$b$3(c.b paramb)
  {
  }

  public final void run()
  {
    boolean bool = true;
    AppMethodBeat.i(17183);
    Assert.assertTrue(toString() + ", check running. ", this.jsa.hkm);
    ab.i(this.jsa.TAG, "requestBigFileList svrIdCnt:%d timeDiff:%d caller:%s", new Object[] { Integer.valueOf(this.jsa.jrV.size()), Long.valueOf(bo.gb(this.jsa.jrW)), an.doQ() });
    if (!this.jsa.jrV.isEmpty());
    while (true)
    {
      Assert.assertTrue("BigFileMap should not Empty", bool);
      c.b.3.1 local1 = new c.b.3.1(this);
      new l(this.jsa.talker, this.jsa.jrV, local1).aUc();
      AppMethodBeat.o(17183);
      return;
      bool = false;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(17182);
    String str = this.jsa.TAG + ".reqBigFile";
    AppMethodBeat.o(17182);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.b.3
 * JD-Core Version:    0.6.2
 */
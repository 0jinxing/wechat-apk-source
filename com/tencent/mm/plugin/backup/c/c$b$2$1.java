package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.g.c;
import com.tencent.mm.plugin.backup.i.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

final class c$b$2$1
  implements Runnable
{
  c$b$2$1(c.b.2 param2, c paramc, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17178);
    Assert.assertTrue(toString() + ", check running. ", this.jsd.jsa.hkm);
    long l1 = bo.anU();
    this.jsb.aUc();
    long l2 = bo.anU();
    ab.i(this.jsd.jsa.TAG, "SendFileScene size:%d waitTime:%d netTime:%d [%s]", new Object[] { Integer.valueOf(this.jsb.aUj()), Long.valueOf(l2 - this.jsc), Long.valueOf(l2 - l1), this.jsb.jxp.jCx });
    AppMethodBeat.o(17178);
  }

  public final String toString()
  {
    AppMethodBeat.i(17177);
    String str = this.jsd.jsa.TAG + ".sendFile";
    AppMethodBeat.o(17177);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.b.2.1
 * JD-Core Version:    0.6.2
 */
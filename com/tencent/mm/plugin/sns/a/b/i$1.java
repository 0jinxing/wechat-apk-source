package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.protocal.protobuf.cbd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class i$1
  implements Runnable
{
  i$1(i parami, int paramInt, Object[] paramArrayOfObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35750);
    axc localaxc = new axc();
    localaxc.wBd = this.qEH;
    localaxc.wBl = ((int)(System.currentTimeMillis() / 1000L));
    localaxc.jBv = 1;
    String str = i.s(this.qEI);
    localaxc.wBe = new b(str.getBytes());
    i.a(this.qEJ).vDW.add(localaxc);
    ab.i("MicroMsg.SnsLogMgr", "snsadlog " + this.qEH + " " + str);
    if (i.b(this.qEJ) == 0L)
      i.a(this.qEJ, System.currentTimeMillis());
    AppMethodBeat.o(35750);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.i.1
 * JD-Core Version:    0.6.2
 */
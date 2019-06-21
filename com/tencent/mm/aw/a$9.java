package com.tencent.mm.aw;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.sdk.b.a;
import java.util.List;

public final class a$9
  implements Runnable
{
  public a$9(List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137240);
    kd localkd = new kd();
    localkd.cFz.action = 5;
    localkd.cFz.cAV = this.fJO;
    localkd.cFz.cFD = this.fJP;
    a.xxA.m(localkd);
    AppMethodBeat.o(137240);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aw.a.9
 * JD-Core Version:    0.6.2
 */
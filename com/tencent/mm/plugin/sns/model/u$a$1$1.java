package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.sdk.platformtools.ak;

final class u$a$1$1
  implements Runnable
{
  u$a$1$1(u.a.1 param1, tb paramtb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36301);
    if (!this.qJM.qJK.qJH.a(this.qJL, this.qJM.qJK.mgn))
      this.qJM.qJK.mgn.sendEmptyMessage(0);
    AppMethodBeat.o(36301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.u.a.1.1
 * JD-Core Version:    0.6.2
 */
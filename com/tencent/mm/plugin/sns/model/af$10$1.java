package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.a.sk;
import com.tencent.mm.g.a.sk.a;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.sdk.platformtools.ab;

final class af$10$1
  implements Runnable
{
  af$10$1(af.10 param10, sk paramsk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36427);
    int i = (int)this.qMh.cOH.cOJ;
    k localk = af.cnK();
    String str = " update SnsComment set isRead = 1 where isRead = 0 and  createTime <= ".concat(String.valueOf(i));
    ab.i("MicroMsg.SnsCommentStorage", "updateToread ".concat(String.valueOf(str)));
    ab.i("MicroMsg.SnsCore", "update msg read ".concat(String.valueOf(localk.fni.hY("SnsComment", str))));
    u.cna();
    AppMethodBeat.o(36427);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.af.10.1
 * JD-Core Version:    0.6.2
 */
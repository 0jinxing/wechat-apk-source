package com.tencent.mm.chatroom.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class a
  implements bz.a
{
  public final void a(e.a parama)
  {
    AppMethodBeat.i(103956);
    cm localcm = parama.eAB;
    String str1;
    String str2;
    bi localbi;
    if (localcm.nao == 10002)
    {
      str1 = aa.a(localcm.vED);
      if (bo.isNullOrNil(str1))
      {
        ab.w("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "msg content is null");
        AppMethodBeat.o(103956);
        return;
      }
      str2 = aa.a(localcm.vEB);
      localbi = ((j)g.K(j.class)).bOr().Q(str2, localcm.ptF);
      if (localbi.field_msgId <= 0L)
        break label247;
    }
    label247: for (int i = 1; ; i = 0)
    {
      localbi.eI(localcm.ptF);
      localbi.eJ(bf.q(str2, localcm.pcX));
      localbi.setType(10002);
      localbi.setContent(str1);
      localbi.hO(0);
      localbi.ju(str2);
      localbi.ix(localcm.vEG);
      localbi.dtR();
      bf.a(localbi, parama);
      if (i == 0)
      {
        bf.l(localbi);
        AppMethodBeat.o(103956);
        break;
      }
      ((j)g.K(j.class)).bOr().b(localcm.ptF, localbi);
      AppMethodBeat.o(103956);
      break;
      ab.i("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(localcm.nao) });
      AppMethodBeat.o(103956);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.d.a
 * JD-Core Version:    0.6.2
 */
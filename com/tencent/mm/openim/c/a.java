package com.tencent.mm.openim.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.Map;

public final class a
  implements o
{
  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(78916);
    ab.i("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "onNewXmlReceived() ");
    cm localcm;
    String str;
    if (paramMap != null)
    {
      localcm = parama.eAB;
      if (bo.gW(localcm.nao, 10002))
      {
        str = aa.a(localcm.vED);
        if (bo.isNullOrNil(str))
        {
          ab.w("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "msg content is null");
          AppMethodBeat.o(78916);
        }
      }
    }
    while (true)
    {
      return;
      paramString = aa.a(localcm.vEB);
      paramMap = ((j)g.K(j.class)).bOr().Q(paramString, localcm.ptF);
      int i = 0;
      if (paramMap.field_msgId > 0L)
        i = 1;
      paramMap.eI(localcm.ptF);
      paramMap.eJ(bf.q(paramString, localcm.pcX));
      paramMap.setType(10002);
      paramMap.setContent(str);
      paramMap.hO(0);
      paramMap.ju(paramString);
      paramMap.ix(localcm.vEG);
      paramMap.dtR();
      bf.a(paramMap, parama);
      if (i == 0)
      {
        bf.l(paramMap);
        AppMethodBeat.o(78916);
      }
      else
      {
        ((j)g.K(j.class)).bOr().b(localcm.ptF, paramMap);
        AppMethodBeat.o(78916);
        continue;
        ab.i("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "not new xml type:%d ", new Object[] { Integer.valueOf(localcm.nao) });
        AppMethodBeat.o(78916);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.c.a
 * JD-Core Version:    0.6.2
 */
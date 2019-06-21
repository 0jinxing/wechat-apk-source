package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.record.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.d;
import com.tencent.mm.ui.chatting.d.a;

final class aq$1
  implements f
{
  aq$1(aq paramaq, bi parambi, String paramString, int paramInt)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33401);
    ab.d("MicroMsg.ChattingItemVoiceRemindSys", "errType " + paramInt1 + " errCode " + paramInt2 + "  scene " + paramm.getType());
    boolean bool = false;
    if (ao.a.flx != null)
      bool = ao.a.flx.fl(this.zhU.field_msgId);
    if ((!bool) && (paramInt1 == 0) && (paramInt2 == 0) && (((e)paramm).getMediaId().equals(this.IN)))
      ((aj)aq.a(this.zhW).aF(aj.class)).dFm().a(this.zhV, this.zhU);
    aw.Rg().b(221, aq.b(this.zhW));
    aq.c(this.zhW);
    AppMethodBeat.o(33401);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.aq.1
 * JD-Core Version:    0.6.2
 */
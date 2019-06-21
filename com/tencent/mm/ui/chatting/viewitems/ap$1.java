package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;

final class ap$1
  implements f
{
  ap$1(ap paramap)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33394);
    ab.d("MicroMsg.ChattingItemVoiceRemindRemind", "errType " + paramInt1 + " errCode " + paramInt2 + "  scene " + paramm.getType());
    aw.Rg().b(221, ap.a(this.zhS));
    ap.b(this.zhS);
    AppMethodBeat.o(33394);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ap.1
 * JD-Core Version:    0.6.2
 */
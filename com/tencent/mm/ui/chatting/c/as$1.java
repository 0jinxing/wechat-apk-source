package com.tencent.mm.ui.chatting.c;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.an;
import com.tencent.mm.model.ao.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class as$1
  implements ao.d
{
  as$1(as paramas)
  {
  }

  public final void p(String paramString, long paramLong)
  {
    AppMethodBeat.i(31866);
    ab.d("MicroMsg.ChattingUI.VoiceComponent", "onVoiceRemind " + paramString + " time " + paramLong);
    if (t.nw(aw.getNotification().IG()))
      h.a(this.yTi.cgL.yTx.getContext(), false, paramString, this.yTi.cgL.yTx.getMMResources().getString(2131304321), this.yTi.cgL.yTx.getMMResources().getString(2131304318), this.yTi.cgL.yTx.getMMResources().getString(2131304320), new as.1.1(this, paramLong), null);
    AppMethodBeat.o(31866);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.as.1
 * JD-Core Version:    0.6.2
 */
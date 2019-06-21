package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.d.a;

final class p$1
  implements j.a
{
  p$1(p paramp)
  {
  }

  public final void onError()
  {
    AppMethodBeat.i(30623);
    p.a(this.yJn).reset();
    p.b(this.yJn).stopTimer();
    p.c(this.yJn).stopTimer();
    com.tencent.mm.sdk.platformtools.aj.amB("keep_app_silent");
    p.d(this.yJn).bvH();
    ((com.tencent.mm.ui.chatting.c.b.aj)p.e(this.yJn).aF(com.tencent.mm.ui.chatting.c.b.aj.class)).dFm().dBx();
    ab.v("MicroMsg.ChattingFooterEventImpl", "record stop on error");
    p.e(this.yJn).yTx.enableOptionMenu(true);
    p.e(this.yJn).yTx.enableBackMenu(true);
    Toast.makeText(p.e(this.yJn).yTx.getContext(), p.e(this.yJn).yTx.getContext().getString(2131298207), 0).show();
    AppMethodBeat.o(30623);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p.1
 * JD-Core Version:    0.6.2
 */
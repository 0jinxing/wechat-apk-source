package com.tencent.mm.ui.chatting.c;

import android.content.res.Resources;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsimple.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class ad$2
  implements Runnable
{
  ad$2(ad paramad, bi parambi, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31614);
    ab.i("MicroMsg.NewXmlSysMsgComponent", "[handleClickInvokeMessageSysText] is over time to delete invokeMsg:%s", new Object[] { Long.valueOf(this.fkD.field_msgId) });
    t.a(this.yRg.cgL.yTx.getMMResources().getString(2131298222), "", this.fkD, "");
    aw.ZK();
    c.XO().a(this.fkD.field_msgId, this.fkD);
    al.d(new ad.2.1(this));
    AppMethodBeat.o(31614);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ad.2
 * JD-Core Version:    0.6.2
 */
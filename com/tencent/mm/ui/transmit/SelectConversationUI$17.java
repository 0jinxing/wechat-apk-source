package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.a;
import com.tencent.mm.g.a.nt.b;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.k;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a.b;

final class SelectConversationUI$17
  implements c.a.b
{
  SelectConversationUI$17(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(35140);
    Object localObject = k.hS(this.zKj.mController.ylL);
    j.b localb = j.b.me(bo.anj(n.a(((nt)localObject).cJZ.cKh.title, ((nt)localObject).cJZ.cKh.desc, ((nt)localObject).cJZ.cJy.cvA.cvC, ((nt)localObject).cJY.cKf)));
    if (localb == null)
      AppMethodBeat.o(35140);
    while (true)
    {
      return;
      localObject = new Intent();
      ((Intent)localObject).putExtra("message_id", SelectConversationUI.i(this.zKj));
      ((Intent)localObject).putExtra("record_xml", localb.fgU);
      ((Intent)localObject).putExtra("record_show_share", false);
      com.tencent.mm.bp.d.b(this.zKj.mController.ylL, "record", ".ui.RecordMsgDetailUI", (Intent)localObject);
      AppMethodBeat.o(35140);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.17
 * JD-Core Version:    0.6.2
 */
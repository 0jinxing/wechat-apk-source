package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a.b;

final class SelectConversationUI$14
  implements c.a.b
{
  SelectConversationUI$14(SelectConversationUI paramSelectConversationUI, j.b paramb)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(35138);
    Intent localIntent = new Intent();
    localIntent.putExtra("message_id", SelectConversationUI.i(this.zKj));
    localIntent.putExtra("record_xml", this.hWW.fgU);
    localIntent.putExtra("record_show_share", false);
    d.b(this.zKj.mController.ylL, "record", ".ui.RecordMsgDetailUI", localIntent);
    AppMethodBeat.o(35138);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.14
 * JD-Core Version:    0.6.2
 */
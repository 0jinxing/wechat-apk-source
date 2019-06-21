package com.tencent.mm.plugin.qmessage.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.be;

final class QConversationUI$4
  implements bf.a
{
  QConversationUI$4(QConversationUI paramQConversationUI, String paramString, ProgressDialog paramProgressDialog)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(24129);
    boolean bool = QConversationUI.i(this.ptk);
    AppMethodBeat.o(24129);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(24130);
    aw.ZK();
    c.XR().aoX(this.ewn);
    if (this.eiD != null)
      this.eiD.dismiss();
    AppMethodBeat.o(24130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.4
 * JD-Core Version:    0.6.2
 */
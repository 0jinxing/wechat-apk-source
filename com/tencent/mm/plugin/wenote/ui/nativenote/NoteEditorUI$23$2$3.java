package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

final class NoteEditorUI$23$2$3
  implements DialogInterface.OnClickListener
{
  NoteEditorUI$23$2$3(NoteEditorUI.23.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(27024);
    p localp = h.b(this.uTC.uTB.uTu.mController.ylL, this.uTC.uTB.uTu.getString(2131296882), false, null);
    NoteEditorUI.j(this.uTC.uTB.uTu).deV();
    paramDialogInterface = new gh();
    paramDialogInterface.cAH.type = 12;
    paramDialogInterface.cAH.cvv = NoteEditorUI.h(this.uTC.uTB.uTu);
    paramDialogInterface.cAH.cAM = new NoteEditorUI.23.2.3.1(this, localp);
    a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(27024);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.23.2.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class NoteEditorUI$23$2$2$1
  implements Runnable
{
  NoteEditorUI$23$2$2$1(NoteEditorUI.23.2.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27021);
    NoteEditorUI.g(this.uTD.uTC.uTB.uTu);
    Object localObject = new gh();
    ((gh)localObject).cAH.type = 32;
    ((gh)localObject).cAH.cvv = NoteEditorUI.h(this.uTD.uTC.uTB.uTu);
    a.xxA.m((b)localObject);
    boolean bool = ((gh)localObject).cAI.cAY;
    int i;
    if (((gh)localObject).cAI.ret != 0)
    {
      i = 1;
      if (((gh)localObject).cAI.path != null)
        break label153;
      com.tencent.mm.ui.base.h.bQ(this.uTD.uTC.uTB.uTu.mController.ylL, this.uTD.uTC.uTB.uTu.getString(2131299721));
      AppMethodBeat.o(27021);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label153: if (bool)
      {
        com.tencent.mm.ui.base.h.bQ(this.uTD.uTC.uTB.uTu.mController.ylL, this.uTD.uTC.uTB.uTu.getString(2131296323));
        AppMethodBeat.o(27021);
      }
      else if (i != 0)
      {
        com.tencent.mm.ui.base.h.bQ(this.uTD.uTC.uTB.uTu.mController.ylL, this.uTD.uTC.uTB.uTu.getString(2131296324));
        AppMethodBeat.o(27021);
      }
      else
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("Select_Conv_Type", 3);
        ((Intent)localObject).putExtra("scene_from", 1);
        ((Intent)localObject).putExtra("mutil_select_is_ret", true);
        ((Intent)localObject).putExtra("select_fav_local_id", NoteEditorUI.h(this.uTD.uTC.uTB.uTu));
        d.b(this.uTD.uTC.uTB.uTu, ".ui.transmit.SelectConversationUI", (Intent)localObject, 4101);
        com.tencent.mm.plugin.fav.a.h.j(NoteEditorUI.h(this.uTD.uTC.uTB.uTu), 1, 0);
        localObject = NoteEditorUI.i(this.uTD.uTC.uTB.uTu);
        ((h.a)localObject).meZ += 1;
        AppMethodBeat.o(27021);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.23.2.2.1
 * JD-Core Version:    0.6.2
 */
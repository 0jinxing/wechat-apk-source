package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;
import java.util.Map;

final class NoteEditorUI$23$1
  implements n.c
{
  NoteEditorUI$23$1(NoteEditorUI.23 param23)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(27019);
    if (NoteEditorUI.d(this.uTB.uTu) == 1)
    {
      paraml.e(4, this.uTB.uTu.getString(2131299734));
      NoteEditorUI.a(this.uTB.uTu, paraml);
      paraml.e(3, this.uTB.uTu.getString(2131301955));
      AppMethodBeat.o(27019);
      return;
    }
    String str;
    if (NoteEditorUI.d(this.uTB.uTu) == 2)
    {
      paraml.e(0, this.uTB.uTu.getString(2131299734));
      if (a.dfJ())
        paraml.e(7, this.uTB.uTu.mController.ylL.getString(2131299688));
      if (!NoteEditorUI.e(this.uTB.uTu))
        paraml.e(14, this.uTB.uTu.getString(2131299722));
      str = (String)com.tencent.mm.model.c.c.abi().ll("100353").dru().get("Close");
      if (bo.isNullOrNil(str))
        break label398;
    }
    label398: for (int i = bo.getInt(str, 0); ; i = 0)
    {
      if (i == 0);
      for (i = 1; ; i = 0)
      {
        if (i != 0)
          paraml.e(8, this.uTB.uTu.mController.ylL.getString(2131301755));
        NoteEditorUI.a(this.uTB.uTu, paraml);
        paraml.e(1, this.uTB.uTu.getString(2131299612));
        paraml.e(2, this.uTB.uTu.mController.ylL.getString(2131296881));
        AppMethodBeat.o(27019);
        break;
      }
      if (NoteEditorUI.d(this.uTB.uTu) == 4)
      {
        paraml.e(9, this.uTB.uTu.getString(2131299734));
        if (a.dfJ())
          paraml.e(12, this.uTB.uTu.mController.ylL.getString(2131299688));
        paraml.e(10, this.uTB.uTu.getString(2131301955));
      }
      AppMethodBeat.o(27019);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.23.1
 * JD-Core Version:    0.6.2
 */
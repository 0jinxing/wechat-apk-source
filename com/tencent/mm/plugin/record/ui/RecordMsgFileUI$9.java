package com.tencent.mm.plugin.record.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class RecordMsgFileUI$9
  implements View.OnClickListener
{
  RecordMsgFileUI$9(RecordMsgFileUI paramRecordMsgFileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24261);
    if (!f.Mn())
    {
      h.g(this.pKI.mController.ylL, 2131299671, 2131297061);
      AppMethodBeat.o(24261);
    }
    while (true)
    {
      return;
      n.b(RecordMsgFileUI.a(this.pKI), RecordMsgFileUI.b(this.pKI), true);
      RecordMsgFileUI.f(this.pKI);
      AppMethodBeat.o(24261);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.9
 * JD-Core Version:    0.6.2
 */
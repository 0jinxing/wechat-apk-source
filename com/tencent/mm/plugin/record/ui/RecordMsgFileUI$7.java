package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.b.n;

final class RecordMsgFileUI$7
  implements View.OnClickListener
{
  RecordMsgFileUI$7(RecordMsgFileUI paramRecordMsgFileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24259);
    paramView = n.c(RecordMsgFileUI.a(this.pKI), RecordMsgFileUI.b(this.pKI));
    new Intent().setAction("android.intent.action.VIEW");
    if (4 == RecordMsgFileUI.c(this.pKI))
    {
      RecordMsgFileUI.d(this.pKI);
      RecordMsgFileUI.e(this.pKI);
      AppMethodBeat.o(24259);
    }
    while (true)
    {
      return;
      RecordMsgFileUI.a(this.pKI, paramView);
      AppMethodBeat.o(24259);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.7
 * JD-Core Version:    0.6.2
 */
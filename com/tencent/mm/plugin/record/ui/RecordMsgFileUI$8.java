package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class RecordMsgFileUI$8
  implements View.OnClickListener
{
  RecordMsgFileUI$8(RecordMsgFileUI paramRecordMsgFileUI, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24260);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.mmb);
    d.b(this.pKI.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(24260);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.8
 * JD-Core Version:    0.6.2
 */
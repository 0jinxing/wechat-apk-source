package com.tencent.mm.plugin.record.ui;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class RecordMsgFileUI$3
  implements Runnable
{
  RecordMsgFileUI$3(RecordMsgFileUI paramRecordMsgFileUI, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24255);
    RecordMsgFileUI.n(this.pKI).setProgress(this.gOm);
    RecordMsgFileUI.o(this.pKI).setText(this.pKI.getString(2131299609, new Object[] { bo.aC(this.fzv), bo.aC(this.pKK) }));
    AppMethodBeat.o(24255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class RecordMsgFileUI$6
  implements Runnable
{
  RecordMsgFileUI$6(RecordMsgFileUI paramRecordMsgFileUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24258);
    RecordMsgFileUI.g(this.pKI);
    h.bQ(this.pKI.mController.ylL, this.pKI.getString(2131298922));
    AppMethodBeat.o(24258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.6
 * JD-Core Version:    0.6.2
 */
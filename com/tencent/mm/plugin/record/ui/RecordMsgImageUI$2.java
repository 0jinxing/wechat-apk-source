package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class RecordMsgImageUI$2
  implements Runnable
{
  RecordMsgImageUI$2(RecordMsgImageUI paramRecordMsgImageUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24295);
    RecordMsgImageUI.a(this.pKQ).notifyDataSetChanged();
    AppMethodBeat.o(24295);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgImageUI.2
 * JD-Core Version:    0.6.2
 */
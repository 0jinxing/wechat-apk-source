package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.List;

final class RecordMsgImageUI$7
  implements n.c
{
  RecordMsgImageUI$7(RecordMsgImageUI paramRecordMsgImageUI, List paramList1, List paramList2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(24301);
    paraml.setHeaderTitle("");
    for (int i = 0; i < this.lcO.size(); i++)
      paraml.e(((Integer)this.lcO.get(i)).intValue(), (CharSequence)this.lcP.get(i));
    AppMethodBeat.o(24301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgImageUI.7
 * JD-Core Version:    0.6.2
 */
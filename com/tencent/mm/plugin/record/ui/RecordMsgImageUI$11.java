package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.List;

final class RecordMsgImageUI$11
  implements Runnable
{
  RecordMsgImageUI$11(RecordMsgImageUI paramRecordMsgImageUI, List paramList, String paramString, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24305);
    Iterator localIterator = this.pKJ.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      g.bOk().a(this.pKQ.mController.ylL, str, RecordMsgImageUI.k(this.pKQ), 0, "", "");
      g.bOk().eZ(this.mjK, str);
    }
    al.d(this.cfC);
    AppMethodBeat.o(24305);
  }

  public final String toString()
  {
    AppMethodBeat.i(24306);
    String str = super.toString() + "|onActivityResult";
    AppMethodBeat.o(24306);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgImageUI.11
 * JD-Core Version:    0.6.2
 */
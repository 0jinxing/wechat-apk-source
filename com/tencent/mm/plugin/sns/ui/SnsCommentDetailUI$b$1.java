package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class SnsCommentDetailUI$b$1
  implements Runnable
{
  SnsCommentDetailUI$b$1(SnsCommentDetailUI.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38829);
    SnsCommentDetailUI.a(this.rrl.rqN).setSelection(SnsCommentDetailUI.a(this.rrl.rqN).getHeaderViewsCount() + this.rrl.rrj.size() - 1);
    AppMethodBeat.o(38829);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.b.1
 * JD-Core Version:    0.6.2
 */
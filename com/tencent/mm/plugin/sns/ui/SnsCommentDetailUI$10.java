package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsCommentDetailUI$10
  implements Runnable
{
  SnsCommentDetailUI$10(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38787);
    SnsCommentDetailUI.a(this.rqN, SnsCommentDetailUI.a(this.rqN).getBottom());
    ab.d("MicroMsg.SnsCommentDetailUI", "listOriginalBottom: " + SnsCommentDetailUI.d(this.rqN));
    AppMethodBeat.o(38787);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.10
 * JD-Core Version:    0.6.2
 */
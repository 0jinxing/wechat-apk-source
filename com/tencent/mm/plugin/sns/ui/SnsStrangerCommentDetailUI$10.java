package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsStrangerCommentDetailUI$10
  implements Runnable
{
  SnsStrangerCommentDetailUI$10(SnsStrangerCommentDetailUI paramSnsStrangerCommentDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39321);
    SnsStrangerCommentDetailUI.a(this.rxw, SnsStrangerCommentDetailUI.a(this.rxw).getBottom());
    ab.d("MicroMsg.SnsStrangerCommentDetailUI", "listOriginalBottom: " + SnsStrangerCommentDetailUI.g(this.rxw));
    AppMethodBeat.o(39321);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.10
 * JD-Core Version:    0.6.2
 */
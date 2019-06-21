package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsStrangerCommentDetailUI$8
  implements Runnable
{
  SnsStrangerCommentDetailUI$8(SnsStrangerCommentDetailUI paramSnsStrangerCommentDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39319);
    SnsStrangerCommentDetailUI.a(this.rxw).setSelection(SnsStrangerCommentDetailUI.d(this.rxw).getCount() - 1);
    AppMethodBeat.o(39319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.8
 * JD-Core Version:    0.6.2
 */
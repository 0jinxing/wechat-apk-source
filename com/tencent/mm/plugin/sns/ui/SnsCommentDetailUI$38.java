package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsCommentDetailUI$38
  implements View.OnClickListener
{
  SnsCommentDetailUI$38(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38823);
    ab.e("MicroMsg.SnsCommentDetailUI", "scrollTopClickListener");
    SnsCommentDetailUI.g(this.rqN);
    if (!SnsCommentDetailUI.h(this.rqN))
      AppMethodBeat.o(38823);
    while (true)
    {
      return;
      SnsCommentDetailUI.i(this.rqN);
      AppMethodBeat.o(38823);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.38
 * JD-Core Version:    0.6.2
 */
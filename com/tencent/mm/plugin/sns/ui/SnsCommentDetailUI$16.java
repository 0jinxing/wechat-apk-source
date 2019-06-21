package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsCommentDetailUI$16
  implements Runnable
{
  SnsCommentDetailUI$16(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38795);
    this.rqN.aqX();
    SnsCommentDetailUI.m(this.rqN).itemHeight = SnsCommentDetailUI.A(this.rqN);
    SnsCommentDetailUI.m(this.rqN).run();
    AppMethodBeat.o(38795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.16
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class SnsCommentDetailUI$c
  implements Runnable
{
  int Ro = -1;
  int itemHeight;
  private int offset = 0;
  private int rro = -1;
  private int rrp = 10;

  SnsCommentDetailUI$c(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38833);
    this.rrp = 10;
    SnsCommentDetailUI.b(this.rqN);
    this.rro = SnsCommentDetailUI.c(this.rqN).getTop();
    int i = this.rro - this.itemHeight;
    ab.i("MicroMsg.SnsCommentDetailUI", "list.bottom: %d, listOriginalBottom: %d, footerTop: %d, commentFooter.getTop: %d, topSelection: %d", new Object[] { Integer.valueOf(SnsCommentDetailUI.a(this.rqN).getBottom()), Integer.valueOf(SnsCommentDetailUI.d(this.rqN)), Integer.valueOf(this.rro), Integer.valueOf(SnsCommentDetailUI.c(this.rqN).getTop()), Integer.valueOf(i) });
    if (i == this.offset)
    {
      SnsCommentDetailUI.a(this.rqN).setSelectionFromTop(SnsCommentDetailUI.a(this.rqN).getHeaderViewsCount() + this.Ro, i);
      this.rrp = 0;
      this.offset = 0;
      AppMethodBeat.o(38833);
    }
    while (true)
    {
      return;
      int j = this.rrp;
      this.rrp = (j - 1);
      if (j > 0)
      {
        new ak().postDelayed(this, 100L);
        this.offset = i;
        AppMethodBeat.o(38833);
      }
      else
      {
        this.offset = 0;
        this.rrp = 0;
        AppMethodBeat.o(38833);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.c
 * JD-Core Version:    0.6.2
 */
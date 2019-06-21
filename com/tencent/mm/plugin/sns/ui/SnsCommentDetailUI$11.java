package com.tencent.mm.plugin.sns.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.ui.c.a.a;

final class SnsCommentDetailUI$11
  implements AbsListView.OnScrollListener
{
  SnsCommentDetailUI$11(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(38788);
    if (paramInt2 > 0)
      if ((paramInt1 == 0) && (!SnsCommentDetailUI.u(this.rqN)))
      {
        SnsCommentDetailUI.a(this.rqN, true);
        if (SnsCommentDetailUI.v(this.rqN) != null)
        {
          SnsCommentDetailUI.v(this.rqN).refreshView();
          AppMethodBeat.o(38788);
        }
      }
    while (true)
    {
      return;
      if (SnsCommentDetailUI.w(this.rqN) != null)
      {
        this.rqN.csX();
        AppMethodBeat.o(38788);
        continue;
        if (paramInt1 > 0)
          SnsCommentDetailUI.a(this.rqN, false);
      }
      else
      {
        AppMethodBeat.o(38788);
      }
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(38789);
    if (paramInt == 1)
    {
      this.rqN.aqX();
      SnsCommentDetailUI.x(this.rqN);
    }
    if ((paramInt == 0) && (SnsCommentDetailUI.r(this.rqN) != null))
      SnsCommentDetailUI.r(this.rqN).kH(true);
    AppMethodBeat.o(38789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.11
 * JD-Core Version:    0.6.2
 */
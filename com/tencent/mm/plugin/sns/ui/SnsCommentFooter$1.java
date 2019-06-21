package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.b;
import com.tencent.mm.ui.tools.b.c;

final class SnsCommentFooter$1
  implements View.OnClickListener
{
  SnsCommentFooter$1(SnsCommentFooter paramSnsCommentFooter, SnsCommentFooter.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38875);
    paramView = c.d(SnsCommentFooter.b(this.rrD)).PM(b.MX());
    paramView.zIx = true;
    paramView.a(new SnsCommentFooter.1.1(this));
    AppMethodBeat.o(38875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentFooter.1
 * JD-Core Version:    0.6.2
 */
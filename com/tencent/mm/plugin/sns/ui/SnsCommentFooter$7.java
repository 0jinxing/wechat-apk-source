package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;

final class SnsCommentFooter$7
  implements View.OnClickListener
{
  SnsCommentFooter$7(SnsCommentFooter paramSnsCommentFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38885);
    this.rrD.setModeClick(true);
    ab.i("MicroMsg.SnsCommentFooter", "state onClick" + SnsCommentFooter.i(this.rrD));
    if (SnsCommentFooter.i(this.rrD) == 0)
    {
      this.rrD.crP.aqX();
      SnsCommentFooter.b(this.rrD).requestFocus();
      SnsCommentFooter.a(this.rrD, 1);
      SnsCommentFooter.j(this.rrD);
      SnsCommentFooter.k(this.rrD).setImageResource(2130838303);
      SnsCommentFooter.l(this.rrD);
      AppMethodBeat.o(38885);
    }
    while (true)
    {
      return;
      SnsCommentFooter.m(this.rrD);
      SnsCommentFooter.l(this.rrD);
      SnsCommentFooter.b(this.rrD).requestFocus();
      this.rrD.crP.showVKB();
      SnsCommentFooter.k(this.rrD).setImageResource(2130838298);
      SnsCommentFooter.a(this.rrD, 0);
      AppMethodBeat.o(38885);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentFooter.7
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.sns.ui;

import android.content.res.Resources;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.n;
import com.tencent.mm.pluginsdk.ui.e.o;

final class SnsCommentDetailUI$a extends o
{
  SnsCommentDetailUI$a(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38827);
    SnsCommentDetailUI.j(this.rqN).rDs.onClick(paramView);
    AppMethodBeat.o(38827);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(38828);
    int i = this.rqN.getResources().getColor(2131690480);
    if (this.ozq)
    {
      paramTextPaint.bgColor = i;
      AppMethodBeat.o(38828);
    }
    while (true)
    {
      return;
      paramTextPaint.bgColor = 0;
      AppMethodBeat.o(38828);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.a
 * JD-Core Version:    0.6.2
 */
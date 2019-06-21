package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.n;

final class SnsCommentDetailUI$29
  implements View.OnClickListener
{
  SnsCommentDetailUI$29(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38812);
    try
    {
      int i = ((Integer)paramView.getTag()).intValue();
      paramView = new android/content/Intent;
      paramView.<init>();
      paramView.putExtra("sns_label_sns_info", i);
      a.gkE.u(paramView, this.rqN);
      AppMethodBeat.o(38812);
      return;
    }
    catch (Exception paramView)
    {
      while (true)
        AppMethodBeat.o(38812);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.29
 * JD-Core Version:    0.6.2
 */
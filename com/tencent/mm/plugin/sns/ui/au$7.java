package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.io.IOException;

final class au$7
  implements View.OnClickListener
{
  au$7(au paramau)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39409);
    if ((paramView.getParent() == null) || (!(paramView.getParent() instanceof SnsCommentCollapseLayout)))
      AppMethodBeat.o(39409);
    while (true)
    {
      return;
      if ((((SnsCommentCollapseLayout)paramView.getParent()).getTag() == null) || (!(((SnsCommentCollapseLayout)paramView.getParent()).getTag() instanceof l)))
      {
        AppMethodBeat.o(39409);
      }
      else
      {
        l locall = (l)((SnsCommentCollapseLayout)paramView.getParent()).getTag();
        if (locall == null)
          AppMethodBeat.o(39409);
        else
          try
          {
            paramView = new android/content/Intent;
            paramView.<init>();
            paramView.putExtra("sns_text_show", locall.ncM);
            paramView.putExtra("sns_local_id", locall.ria);
            paramView.putExtra("sns_comment_buf", locall.qJj.toByteArray());
            paramView.setClass(this.ryd.crP, SnsSingleTextViewUI.class);
            this.ryd.crP.startActivity(paramView);
            AppMethodBeat.o(39409);
          }
          catch (IOException paramView)
          {
            ab.printErrStackTrace("MicroMsg.SnsTimeLineBaseAdapter", paramView, "commentCollapse click exception.", new Object[0]);
            AppMethodBeat.o(39409);
          }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.au.7
 * JD-Core Version:    0.6.2
 */
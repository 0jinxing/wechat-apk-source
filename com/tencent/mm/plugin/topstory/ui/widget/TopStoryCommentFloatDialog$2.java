package com.tencent.mm.plugin.topstory.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.ui.SnsEditText;
import com.tencent.mm.plugin.topstory.a.c.f;
import com.tencent.mm.protocal.protobuf.chp;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

final class TopStoryCommentFloatDialog$2
  implements View.OnClickListener
{
  TopStoryCommentFloatDialog$2(TopStoryCommentFloatDialog paramTopStoryCommentFloatDialog, MMActivity paramMMActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2244);
    if (System.currentTimeMillis() - this.sIq.rCN < 500L)
      AppMethodBeat.o(2244);
    while (true)
    {
      return;
      this.sIq.rCN = System.currentTimeMillis();
      String str = this.sIq.sCX.getText().toString();
      if (str.length() > 200)
      {
        AppMethodBeat.o(2244);
      }
      else if ((str.length() <= 0) || (str.trim().length() <= 0))
      {
        AppMethodBeat.o(2244);
      }
      else if (!TopStoryCommentFloatDialog.bBL())
      {
        h.b(this.icV, this.icV.getString(2131299946), "", true);
        AppMethodBeat.o(2244);
      }
      else
      {
        this.sIq.tipDialog = h.b(this.icV, this.icV.getString(2131297043), false, null);
        paramView = new f(this.sIq.sIa);
        ((chp)paramView.ehh.fsG.fsP).ncM = str;
        g.Rg().a(paramView, 0);
        AppMethodBeat.o(2244);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog.2
 * JD-Core Version:    0.6.2
 */
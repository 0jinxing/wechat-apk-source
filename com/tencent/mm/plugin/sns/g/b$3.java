package com.tencent.mm.plugin.sns.g;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.SnsCommentUI;
import com.tencent.mm.ui.MMActivity;
import java.util.List;
import java.util.Map;

final class b$3
  implements View.OnClickListener
{
  b$3(b paramb, com.tencent.mm.plugin.sns.data.b paramb1, TextView paramTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(36759);
    int i = ((Integer)paramView.getTag()).intValue();
    paramView = (b.b)this.qPe.qOW.get(Long.valueOf(this.qPc.cND));
    int j = ((a)this.qPe.qOZ.qPP.get(i)).qOF;
    if (paramView != null)
      paramView.YA("3:" + j + ":" + this.ekn.getText());
    if (((a)this.qPe.qOZ.qPP.get(i)).qOJ == 1)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this.qPe.mContext, SnsCommentUI.class);
      localIntent.putExtra("sns_comment_type", 2);
      localIntent.putExtra("sns_id", this.qPc.cND);
      localIntent.putExtra("sns_uxinfo", paramView.qPj);
      localIntent.putExtra("action_st_time", paramView.qPk);
      localIntent.putExtra("sns_actionresult", paramView.qPi.toString());
      ((MMActivity)this.qPe.mContext).startActivity(localIntent);
      this.qPe.qOW.remove(Long.valueOf(this.qPc.cND));
      this.qPe.cox();
      AppMethodBeat.o(36759);
    }
    while (true)
    {
      return;
      this.qPe.a(paramView);
      this.qPe.cox();
      AppMethodBeat.o(36759);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.b.3
 * JD-Core Version:    0.6.2
 */
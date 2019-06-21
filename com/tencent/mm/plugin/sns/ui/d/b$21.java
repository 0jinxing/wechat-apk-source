package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI;
import com.tencent.mm.plugin.sns.ui.ar;
import com.tencent.mm.protocal.protobuf.TimeLineObject;

final class b$21
  implements View.OnClickListener
{
  b$21(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40270);
    n localn;
    if ((paramView.getTag() instanceof ar))
    {
      paramView = (ar)paramView.getTag();
      localn = af.cnF().YS(paramView.cFc);
      if (localn == null)
        AppMethodBeat.o(40270);
    }
    while (true)
    {
      return;
      paramView = new Intent();
      paramView.putExtra("sns_text_show", localn.cqu().xfF);
      paramView.putExtra("sns_local_id", localn.cqU());
      paramView.setClass(this.rKt.activity, SnsSingleTextViewUI.class);
      this.rKt.activity.startActivity(paramView);
      AppMethodBeat.o(40270);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.21
 * JD-Core Version:    0.6.2
 */
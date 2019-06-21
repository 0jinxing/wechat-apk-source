package com.tencent.mm.plugin.sns.lucky.ui;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements View.OnClickListener
{
  a$2(Dialog paramDialog, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(35901);
    ab.i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onClick");
    if ((this.qHc != null) && (this.qHc.isShowing()))
      this.qHc.dismiss();
    paramView = this.qHd;
    if (paramView != null)
      paramView.performClick();
    AppMethodBeat.o(35901);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.ui.a.2
 * JD-Core Version:    0.6.2
 */
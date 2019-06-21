package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsCommentDetailUI$37
  implements View.OnClickListener
{
  SnsCommentDetailUI$37(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38822);
    paramView = (String)paramView.getTag();
    ab.d("MicroMsg.SnsCommentDetailUI", "onCommentClick:".concat(String.valueOf(paramView)));
    Intent localIntent = new Intent();
    com.tencent.mm.plugin.sns.storage.n localn = SnsCommentDetailUI.e(this.rqN);
    if ((localn != null) && (localn.DI(32)))
    {
      i.a(new SnsAdClick(SnsCommentDetailUI.f(this.rqN), 2, localn.field_snsId, 1, 0));
      localIntent.putExtra("Contact_User", paramView);
      localIntent.putExtra("Contact_Scene", 37);
      a.gkE.c(localIntent, this.rqN);
      AppMethodBeat.o(38822);
    }
    while (true)
    {
      return;
      localIntent.putExtra("Contact_User", paramView);
      a.gkE.c(localIntent, this.rqN);
      AppMethodBeat.o(38822);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.37
 * JD-Core Version:    0.6.2
 */
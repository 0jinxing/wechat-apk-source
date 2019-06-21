package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.storage.n;

final class SnsCommentDetailUI$9
  implements View.OnClickListener
{
  SnsCommentDetailUI$9(SnsCommentDetailUI paramSnsCommentDetailUI, n paramn)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38786);
    if (this.rhJ.DI(32))
      AppMethodBeat.o(38786);
    while (true)
    {
      return;
      aj.Da(this.rhJ.reX);
      aj.CY(this.rhJ.reX);
      af.cnB().cmp();
      paramView = new Intent();
      this.rqN.setResult(-1, paramView);
      if (SnsCommentDetailUI.t(this.rqN))
        paramView.putExtra("sns_gallery_force_finish", true);
      this.rqN.finish();
      this.rqN.finish();
      AppMethodBeat.o(38786);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.9
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class CardConsumeSuccessUI$2
  implements View.OnClickListener
{
  CardConsumeSuccessUI$2(CardConsumeSuccessUI paramCardConsumeSuccessUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88118);
    if (paramView.getId() == 2131821997)
    {
      CardConsumeSuccessUI.a(this.kgU);
      AppMethodBeat.o(88118);
    }
    while (true)
    {
      return;
      if (paramView.getId() == 2131821999)
      {
        paramView = new Intent();
        paramView.putExtra("KLabel_range_index", this.kgU.kgP);
        paramView.putExtra("Klabel_name_list", CardConsumeSuccessUI.b(this.kgU));
        paramView.putExtra("Kother_user_name_list", CardConsumeSuccessUI.c(this.kgU));
        paramView.putExtra("k_sns_label_ui_title", this.kgU.getString(2131297972));
        paramView.putExtra("k_sns_label_ui_style", 0);
        paramView.putExtra("KLabel_is_filter_private", true);
        d.b(this.kgU, "sns", ".ui.SnsLabelUI", paramView, 1);
      }
      AppMethodBeat.o(88118);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI.2
 * JD-Core Version:    0.6.2
 */
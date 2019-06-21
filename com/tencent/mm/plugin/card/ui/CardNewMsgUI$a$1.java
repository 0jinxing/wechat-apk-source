package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.g;
import com.tencent.mm.plugin.card.model.g.a;
import com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CardNewMsgUI$a$1
  implements View.OnClickListener
{
  CardNewMsgUI$a$1(CardNewMsgUI.a parama, g.a parama1, g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88601);
    paramView = new Intent();
    if (this.kmX.kdC == 0)
    {
      paramView.setClass(this.kmZ.kmV.mController.ylL, CardDetailUI.class);
      paramView.putExtra("key_card_id", this.kmX.cardId);
      paramView.putExtra("key_card_ext", this.kmX.kdB);
      paramView.putExtra("key_from_scene", 17);
      this.kmZ.kmV.startActivity(paramView);
    }
    while (true)
    {
      h.pYm.e(11941, new Object[] { Integer.valueOf(8), this.kmY.field_card_id, this.kmY.field_card_tp_id, this.kmY.field_msg_id, this.kmX.cardId });
      AppMethodBeat.o(88601);
      return;
      if (this.kmX.kdC == 1)
      {
        paramView.setClass(this.kmZ.kmV.mController.ylL, CardConsumeSuccessUI.class);
        paramView.putExtra("key_card_id", this.kmY.field_card_id);
        paramView.putExtra("key_from_scene", 2);
        this.kmZ.kmV.startActivity(paramView);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardNewMsgUI.a.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.plugin.card.model.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.nm;
import com.tencent.mm.protocal.protobuf.nz;
import com.tencent.mm.sdk.platformtools.ab;

final class CardNewMsgUI$9
  implements View.OnClickListener
{
  CardNewMsgUI$9(CardNewMsgUI paramCardNewMsgUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88600);
    if (paramView.getId() == 2131822235)
    {
      paramView = (g)paramView.getTag();
      if ((paramView == null) || (paramView.baM() == null))
        AppMethodBeat.o(88600);
    }
    while (true)
    {
      return;
      h.pYm.e(11941, new Object[] { Integer.valueOf(2), paramView.field_card_id, paramView.field_card_tp_id, paramView.field_msg_id, "" });
      if (paramView.baM().kdC == 0)
      {
        ab.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_URL");
        if (!TextUtils.isEmpty(paramView.baM().url))
        {
          b.a(this.kmV, paramView.baM().url, 2);
          AppMethodBeat.o(88600);
        }
        else
        {
          ab.e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
          AppMethodBeat.o(88600);
        }
      }
      else
      {
        if (paramView.baM().kdC == 1)
        {
          ab.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_SHOP");
          Intent localIntent = new Intent();
          localIntent.putExtra("KEY_CARD_ID", paramView.field_card_id);
          localIntent.putExtra("KEY_CARD_TP_ID", paramView.field_card_tp_id);
          localIntent.setClass(this.kmV, CardShopUI.class);
          this.kmV.startActivity(localIntent);
          h.pYm.e(11324, new Object[] { "UsedStoresView", Integer.valueOf(paramView.field_card_type), paramView.field_card_tp_id, paramView.field_card_id, Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), "" });
        }
        AppMethodBeat.o(88600);
        continue;
        if (paramView.getId() == 2131822239)
        {
          paramView = (g)paramView.getTag();
          if ((paramView == null) || (paramView.baN() == null))
          {
            AppMethodBeat.o(88600);
          }
          else if (paramView.baN().type == 0)
          {
            ab.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_TEXT");
            if (!TextUtils.isEmpty(paramView.baN().url))
            {
              b.a(this.kmV, paramView.baN().url, 2);
              AppMethodBeat.o(88600);
            }
            else
            {
              ab.e("MicroMsg.CardNewMsgUI", "card msg oper region url is empty");
              AppMethodBeat.o(88600);
            }
          }
          else if (paramView.baN().type == 1)
          {
            ab.i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_CARDS");
          }
        }
        else
        {
          AppMethodBeat.o(88600);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardNewMsgUI.9
 * JD-Core Version:    0.6.2
 */
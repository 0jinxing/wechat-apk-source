package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class CardShopUI$1
  implements AdapterView.OnItemClickListener
{
  CardShopUI$1(CardShopUI paramCardShopUI, Intent paramIntent)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(88629);
    if (paramInt == 0)
    {
      ab.v("MicroMsg.CardShopUI", "onItemClick pos is 0, click headerview");
      AppMethodBeat.o(88629);
    }
    while (true)
    {
      return;
      int i = paramInt;
      if (paramInt > 0)
        i = paramInt - 1;
      paramAdapterView = (od)CardShopUI.a(this.knD).get(i);
      if ((!TextUtils.isEmpty(paramAdapterView.vTL)) && (!TextUtils.isEmpty(paramAdapterView.vTM)))
      {
        paramInt = this.val$intent.getIntExtra("key_from_appbrand_type", 0);
        com.tencent.mm.plugin.card.d.b.d(CardShopUI.b(this.knD), paramAdapterView.vTL, paramAdapterView.vTM, 1052, paramInt);
        AppMethodBeat.o(88629);
      }
      else
      {
        if (!TextUtils.isEmpty(paramAdapterView.kdF))
        {
          com.tencent.mm.plugin.card.d.b.a(this.knD, paramAdapterView.kdF, 1);
          h.pYm.e(11941, new Object[] { Integer.valueOf(4), CardShopUI.c(this.knD).aZZ(), CardShopUI.c(this.knD).baa(), "", paramAdapterView.name });
        }
        AppMethodBeat.o(88629);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardShopUI.1
 * JD-Core Version:    0.6.2
 */
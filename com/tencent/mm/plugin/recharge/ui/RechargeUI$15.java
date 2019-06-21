package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class RechargeUI$15
  implements View.OnClickListener
{
  RechargeUI$15(RechargeUI paramRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44321);
    paramView = c.cQT();
    Object localObject = RechargeUI.h(this.pHV).pFP;
    ab.d("MicroMsg.MallNewsManager", "removeNewsInIndexUI : ".concat(String.valueOf(localObject)));
    if ((!bo.isNullOrNil((String)localObject)) && (paramView.tDE.containsKey(localObject)))
    {
      localObject = (MallNews)paramView.tDE.get(localObject);
      if ("1".equals(((MallNews)localObject).tDt))
      {
        ((MallNews)localObject).tDt = "2";
        paramView.bZX();
      }
    }
    RechargeUI.i(this.pHV).setVisibility(8);
    AppMethodBeat.o(44321);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.15
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.as;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.g;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.e;

final class h$e$1
  implements View.OnClickListener
{
  h$e$1(h.e parame, as paramas, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42898);
    h.pYm.e(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(this.ogH.nZn) });
    if (this.ogO.ogG != null)
      g.gu(this.ogO.ogG.ogM, 1);
    if ((this.ogO.ogG != null) && (this.ogO.ogG.ogL))
      h.pYm.e(13051, new Object[] { Integer.valueOf(this.ogO.ogG.ogM), Integer.valueOf(2), "", "", "", this.ogH.content, this.ogH.type, "", "", Integer.valueOf(this.ogO.ogG.resourceId) });
    h localh;
    String str;
    if (this.ogH.type.equals("Native"))
    {
      ab.i("MicroMsg.LuckyMoneyOperationViewMgr", "go native:" + this.ogH.content);
      if ("weixin://festival/gotoshake".equalsIgnoreCase(this.ogH.content))
        ab.i("MicroMsg.LuckyMoneyOperationViewMgr", " go new year shake");
      localh = h.pYm;
      str = this.ogH.content;
      if (this.ogO.ogG.ogN == null)
        break label370;
    }
    label370: for (paramView = this.ogO.ogG.ogN.wwP; ; paramView = "")
    {
      localh.e(16589, new Object[] { Integer.valueOf(2), str, paramView });
      AppMethodBeat.o(42898);
      return;
      e.n(this.val$context, this.ogH.content, true);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.h.e.1
 * JD-Core Version:    0.6.2
 */
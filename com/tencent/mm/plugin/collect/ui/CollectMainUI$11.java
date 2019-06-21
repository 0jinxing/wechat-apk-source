package com.tencent.mm.plugin.collect.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bbc;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class CollectMainUI$11
  implements View.OnClickListener
{
  CollectMainUI$11(CollectMainUI paramCollectMainUI, bbc parambbc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41263);
    if (this.kHq.type == 1)
      if (this.kHq.url.equals("wxpay://f2f/f2fdetail"))
      {
        paramView = new Intent(this.kHl.mController.ylL, CollectBillUI.class);
        paramView.putExtra("key_from_scene", 0);
        this.kHl.startActivityForResult(paramView, 4097);
        h.pYm.e(13944, new Object[] { Integer.valueOf(1) });
        h.pYm.e(14526, new Object[] { Integer.valueOf(1), Integer.valueOf(1), this.kHq.cEh, "", "", "", Integer.valueOf(2) });
        if (this.kHq.wFV == 1)
          h.pYm.e(14526, new Object[] { Integer.valueOf(3), Integer.valueOf(1), this.kHq.cEh, "", "", "", Integer.valueOf(2) });
      }
    while (true)
    {
      this.kHl.kGZ.setVisibility(4);
      this.kHl.kHa.setVisibility(8);
      AppMethodBeat.o(41263);
      while (true)
      {
        return;
        if (this.kHq.type != 2)
          break label458;
        if (!bo.isNullOrNil(this.kHq.url))
          break;
        ab.w("MicroMsg.CollectMainUI", "empty bottom h5 url");
        AppMethodBeat.o(41263);
      }
      e.n(this.kHl.mController.ylL, this.kHq.url, false);
      h.pYm.e(14526, new Object[] { Integer.valueOf(1), Integer.valueOf(2), this.kHq.cEh, "", "", this.kHq.url, Integer.valueOf(2) });
      if (this.kHq.wFV == 1)
      {
        h.pYm.e(14526, new Object[] { Integer.valueOf(3), Integer.valueOf(2), this.kHq.cEh, "", "", this.kHq.url, Integer.valueOf(2) });
        continue;
        label458: if (this.kHq.type == 3)
        {
          paramView = new se();
          paramView.cOf.userName = this.kHq.wFS;
          paramView.cOf.cOh = bo.bc(this.kHq.wFT, "");
          paramView.cOf.scene = 1072;
          paramView.cOf.cOi = 0;
          a.xxA.m(paramView);
          h.pYm.e(14526, new Object[] { Integer.valueOf(1), Integer.valueOf(3), this.kHq.cEh, this.kHq.wFS, this.kHq.wFT, "", Integer.valueOf(2) });
          if (this.kHq.wFV == 1)
            h.pYm.e(14526, new Object[] { Integer.valueOf(3), Integer.valueOf(3), this.kHq.cEh, this.kHq.wFS, this.kHq.wFT, "", Integer.valueOf(2) });
        }
        else
        {
          paramView = new Intent(this.kHl.mController.ylL, CollectBillUI.class);
          paramView.putExtra("key_from_scene", 0);
          this.kHl.startActivityForResult(paramView, 4097);
          h.pYm.e(13944, new Object[] { Integer.valueOf(1) });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.11
 * JD-Core Version:    0.6.2
 */
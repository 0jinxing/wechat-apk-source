package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.List;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb, q paramq, b.b paramb1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44247);
    if (b.a(this.pGQ) != null)
    {
      if (!b.b(this.pGQ).contains(this.pGO.tnz))
      {
        ab.i("MicroMsg.PhoneRechargeAdapter", "mark recommendid: %s", new Object[] { this.pGO.tnz });
        b.b(this.pGQ).add(this.pGO.tnz);
        g.RP().Ry().set(ac.a.xVQ, bo.c(b.b(this.pGQ), ","));
        this.pGP.pGS.setVisibility(8);
      }
      b.a(this.pGQ).a(this.pGO);
    }
    AppMethodBeat.o(44247);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.b.1
 * JD-Core Version:    0.6.2
 */
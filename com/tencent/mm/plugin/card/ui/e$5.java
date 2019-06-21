package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

final class e$5
  implements View.OnClickListener
{
  e$5(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88342);
    if (this.kjI.kaS == null)
    {
      ab.e("MicroMsg.CardDetailUIContoller", "mCardInfo is null, err");
      AppMethodBeat.o(88342);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(11582, new Object[] { "CardDetailUiMenu", Integer.valueOf(1), Integer.valueOf(this.kjI.kaS.aZV().iAd), this.kjI.kaS.baa(), this.kjI.kaS.aZZ(), this.kjI.kjF.kiN });
      paramView = (String[])this.kjI.kjD.toArray(new String[this.kjI.kjD.size()]);
      com.tencent.mm.ui.base.h.a(this.kjI.kjd.mController.ylL, null, paramView, null, false, new e.5.1(this));
      AppMethodBeat.o(88342);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.e.5
 * JD-Core Version:    0.6.2
 */
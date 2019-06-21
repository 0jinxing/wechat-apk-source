package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bkc;
import com.tencent.mm.sdk.platformtools.ab;

final class HoneyPayCardManagerUI$4
  implements View.OnClickListener
{
  HoneyPayCardManagerUI$4(HoneyPayCardManagerUI paramHoneyPayCardManagerUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41796);
    if (HoneyPayCardManagerUI.c(this.nrS) != null)
    {
      ab.d(this.nrS.TAG, "click pay way: %s", new Object[] { Boolean.valueOf(HoneyPayCardManagerUI.c(this.nrS).wNm) });
      if (HoneyPayCardManagerUI.c(this.nrS).wNm)
      {
        HoneyPayCardManagerUI.e(this.nrS);
        AppMethodBeat.o(41796);
      }
    }
    while (true)
    {
      return;
      HoneyPayCardManagerUI.f(this.nrS);
      AppMethodBeat.o(41796);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.4
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.recharge.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RechargeUI$9
  implements Runnable
{
  RechargeUI$9(RechargeUI paramRechargeUI, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44314);
    RechargeUI.o(this.pHV).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(44314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.9
 * JD-Core Version:    0.6.2
 */
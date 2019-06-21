package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;

final class PaylistAAUI$5
  implements d.a
{
  PaylistAAUI$5(PaylistAAUI paramPaylistAAUI)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(40869);
    if (PaylistAAUI.d(this.gpC) != null)
      PaylistAAUI.d(this.gpC).dismiss();
    if (((paramObject instanceof String)) && (!paramObject.toString().equalsIgnoreCase("ok")))
      Toast.makeText(this.gpC, paramObject.toString(), 1).show();
    while (true)
    {
      ab.e("MicroMsg.PaylistAAUI", "urgeAAPay fail");
      AppMethodBeat.o(40869);
      return;
      Toast.makeText(this.gpC, 2131304187, 1).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.5
 * JD-Core Version:    0.6.2
 */
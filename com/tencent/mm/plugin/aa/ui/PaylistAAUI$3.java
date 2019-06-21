package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;

final class PaylistAAUI$3
  implements d.a
{
  PaylistAAUI$3(PaylistAAUI paramPaylistAAUI)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(40867);
    ab.i("MicroMsg.PaylistAAUI", "close pay list failed: %s", new Object[] { paramObject });
    if (PaylistAAUI.d(this.gpC) != null)
      PaylistAAUI.d(this.gpC).dismiss();
    if ((paramObject instanceof String))
    {
      Toast.makeText(this.gpC, paramObject.toString(), 1).show();
      AppMethodBeat.o(40867);
    }
    while (true)
    {
      return;
      Toast.makeText(this.gpC, 2131298339, 1).show();
      AppMethodBeat.o(40867);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.3
 * JD-Core Version:    0.6.2
 */
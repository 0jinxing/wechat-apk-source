package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.vending.g.d.a;

final class PaylistAAUI$15
  implements d.a
{
  PaylistAAUI$15(PaylistAAUI paramPaylistAAUI)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(40884);
    ab.i("MicroMsg.PaylistAAUI", "aapay failed: %s", new Object[] { paramObject });
    if (PaylistAAUI.d(this.gpC) != null)
      PaylistAAUI.d(this.gpC).dismiss();
    if (paramObject != null)
      if ((paramObject instanceof a))
      {
        a locala = (a)paramObject;
        String str1 = locala.cEh;
        paramObject = locala.nZb;
        String str2 = locala.nZc;
        c.a locala1 = new c.a(this.gpC);
        locala1.asE(str1);
        locala1.asJ(str2).a(new PaylistAAUI.15.1(this, locala));
        locala1.asK(paramObject);
        locala1.aMb().show();
        AppMethodBeat.o(40884);
      }
    while (true)
    {
      return;
      if (((paramObject instanceof String)) && (!paramObject.toString().equalsIgnoreCase("ok")))
      {
        Toast.makeText(this.gpC, paramObject.toString(), 1).show();
        AppMethodBeat.o(40884);
        continue;
        Toast.makeText(this.gpC, this.gpC.getString(2131296366), 1).show();
      }
      else
      {
        AppMethodBeat.o(40884);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.15
 * JD-Core Version:    0.6.2
 */
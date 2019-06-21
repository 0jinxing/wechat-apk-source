package com.tencent.mm.plugin.account.security.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.security.a.c;
import com.tencent.mm.plugin.account.security.a.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.q;

final class MySafeDeviceListUI$4
  implements h.b
{
  MySafeDeviceListUI$4(MySafeDeviceListUI paramMySafeDeviceListUI, d paramd)
  {
  }

  public final boolean s(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(69876);
    boolean bool;
    if (paramCharSequence == null)
    {
      paramCharSequence = "";
      if (!paramCharSequence.equals(this.gzE.field_name))
        break label48;
      AppMethodBeat.o(69876);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramCharSequence = paramCharSequence.toString().trim();
      break;
      label48: if (paramCharSequence.length() <= 0)
      {
        h.bQ(this.gzC.mController.ylL, this.gzC.getString(2131302686));
        AppMethodBeat.o(69876);
        bool = false;
      }
      else
      {
        paramCharSequence = new c(this.gzE.field_uid, paramCharSequence, this.gzE.field_devicetype);
        g.Rg().a(paramCharSequence, 0);
        if (MySafeDeviceListUI.c(this.gzC) != null)
          MySafeDeviceListUI.c(this.gzC).dismiss();
        MySafeDeviceListUI.a(this.gzC, h.b(this.gzC, a.an(this.gzC, 2131297086), true, new MySafeDeviceListUI.4.1(this, paramCharSequence)));
        AppMethodBeat.o(69876);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI.4
 * JD-Core Version:    0.6.2
 */
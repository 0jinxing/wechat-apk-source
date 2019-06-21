package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;

final class b$6
  implements View.OnClickListener
{
  b$6(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21976);
    h.pYm.e(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
    String str = this.nAl.nzS.getText().toString().replace("+", "");
    paramView = new Intent(this.nAl.crP, IPCallCountryCodeSelectUI.class);
    paramView.putExtra("couttry_code", str);
    paramView.putExtra("CountryCodeUI_isShowCountryCode", true);
    this.nAl.crP.startActivityForResult(paramView, 100);
    this.nAl.crP.overridePendingTransition(2131034229, -1);
    AppMethodBeat.o(21976);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.6
 * JD-Core Version:    0.6.2
 */
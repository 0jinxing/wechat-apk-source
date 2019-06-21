package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.bo;

final class FreeWifiSuccUI$2
  implements View.OnClickListener
{
  FreeWifiSuccUI$2(FreeWifiSuccUI paramFreeWifiSuccUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21086);
    if (!bo.isNullOrNil(FreeWifiSuccUI.b(this.mAn)))
    {
      paramView = new Intent();
      paramView.putExtra("Contact_User", FreeWifiSuccUI.b(this.mAn));
      d.b(this.mAn, "profile", ".ui.ContactInfoUI", paramView);
    }
    AppMethodBeat.o(21086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiSuccUI.2
 * JD-Core Version:    0.6.2
 */
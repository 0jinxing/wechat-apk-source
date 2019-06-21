package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class IPCallUserProfileUI$10
  implements View.OnClickListener
{
  IPCallUserProfileUI$10(IPCallUserProfileUI paramIPCallUserProfileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22382);
    try
    {
      h.pYm.e(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      paramView = new android/content/Intent;
      paramView.<init>("android.intent.action.INSERT");
      paramView.setType("vnd.android.cursor.dir/contact");
      paramView.putExtra("phone", IPCallUserProfileUI.f(this.nGq));
      this.nGq.startActivity(paramView);
      AppMethodBeat.o(22382);
      return;
    }
    catch (Exception paramView)
    {
      while (true)
      {
        ab.e("MicroMsg.IPCallUserProfileUI", paramView.getMessage());
        AppMethodBeat.o(22382);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.10
 * JD-Core Version:    0.6.2
 */
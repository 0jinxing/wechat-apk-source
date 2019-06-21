package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class IPCallUserProfileUI$3
  implements View.OnClickListener
{
  IPCallUserProfileUI$3(IPCallUserProfileUI paramIPCallUserProfileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22373);
    paramView = new Intent(this.nGq, IPCallAllRecordUI.class);
    if (!bo.isNullOrNil(IPCallUserProfileUI.e(this.nGq)))
      paramView.putExtra("IPCallAllRecordUI_contactId", IPCallUserProfileUI.e(this.nGq));
    while (true)
    {
      paramView.putExtra("IPCallAllRecordUI_isSinglePhoneNumber", IPCallUserProfileUI.g(this.nGq));
      this.nGq.startActivity(paramView);
      AppMethodBeat.o(22373);
      return;
      if (!bo.isNullOrNil(IPCallUserProfileUI.f(this.nGq)))
        paramView.putExtra("IPCallAllRecordUI_phoneNumber", IPCallUserProfileUI.f(this.nGq));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.3
 * JD-Core Version:    0.6.2
 */
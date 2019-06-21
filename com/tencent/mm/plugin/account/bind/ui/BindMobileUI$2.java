package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class BindMobileUI$2
  implements View.OnClickListener
{
  BindMobileUI$2(BindMobileUI paramBindMobileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13510);
    if ((BindMobileUI.a(this.gsp).getText().toString() == null) || (BindMobileUI.a(this.gsp).getText().toString().length() == 0))
    {
      Toast.makeText(this.gsp, this.gsp.getString(2131297537), 0).show();
      AppMethodBeat.o(13510);
    }
    while (true)
    {
      return;
      BindMobileUI.b(this.gsp, BindMobileUI.b(this.gsp).getText().toString().trim() + bo.PA(BindMobileUI.a(this.gsp).getText().toString()));
      ab.i("MicroMsg.BindMContactUI", "do next, send sms to self");
      BindMobileUI.c(this.gsp, BindMobileUI.c(this.gsp));
      AppMethodBeat.o(13510);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileUI.2
 * JD-Core Version:    0.6.2
 */
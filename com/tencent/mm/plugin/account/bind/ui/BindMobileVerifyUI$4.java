package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;

final class BindMobileVerifyUI$4
  implements View.OnClickListener
{
  BindMobileVerifyUI$4(BindMobileVerifyUI paramBindMobileVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13532);
    this.gst.aqX();
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("bindmcontact_mobile", BindMobileVerifyUI.b(this.gst));
    localBundle.putInt("voice_verify_type", 4);
    paramView.putExtras(localBundle);
    a.gkE.f(this.gst, paramView);
    AppMethodBeat.o(13532);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI.4
 * JD-Core Version:    0.6.2
 */
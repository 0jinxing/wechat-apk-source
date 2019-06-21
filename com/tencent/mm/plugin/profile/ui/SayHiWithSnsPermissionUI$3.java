package com.tencent.mm.plugin.profile.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class SayHiWithSnsPermissionUI$3
  implements View.OnFocusChangeListener
{
  SayHiWithSnsPermissionUI$3(SayHiWithSnsPermissionUI paramSayHiWithSnsPermissionUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(23768);
    if ((paramBoolean) && (!bo.ac(SayHiWithSnsPermissionUI.b(this.ppC).getHint())) && (bo.ac(SayHiWithSnsPermissionUI.b(this.ppC).getText())))
    {
      SayHiWithSnsPermissionUI.b(this.ppC).setText(SayHiWithSnsPermissionUI.b(this.ppC).getHint());
      SayHiWithSnsPermissionUI.b(this.ppC).setOnFocusChangeListener(null);
      SayHiWithSnsPermissionUI.b(this.ppC).setHint(null);
    }
    AppMethodBeat.o(23768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.3
 * JD-Core Version:    0.6.2
 */
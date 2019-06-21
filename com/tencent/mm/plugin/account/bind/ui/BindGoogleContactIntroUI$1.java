package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindGoogleContactIntroUI$1
  implements View.OnClickListener
{
  BindGoogleContactIntroUI$1(BindGoogleContactIntroUI paramBindGoogleContactIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13332);
    paramView = new Intent(this.gqt, BindGoogleContactUI.class);
    paramView.putExtra("enter_scene", BindGoogleContactIntroUI.a(this.gqt));
    this.gqt.startActivity(paramView);
    AppMethodBeat.o(13332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.b.c;

final class CreateAvatarUI$11
  implements View.OnClickListener
{
  CreateAvatarUI$11(CreateAvatarUI paramCreateAvatarUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7363);
    String str = CreateAvatarUI.b(this.urn).getText().toString();
    paramView = b.Ne();
    if ((!bo.isNullOrNil(paramView)) && (str.matches(".*[" + paramView + "].*")))
    {
      h.b(this.urn.mController.ylL, this.urn.getString(2131300632, new Object[] { paramView }), this.urn.getString(2131297061), true);
      AppMethodBeat.o(7363);
    }
    while (true)
    {
      return;
      c.d(CreateAvatarUI.b(this.urn)).hz(1, 32).a(this.urn);
      AppMethodBeat.o(7363);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.11
 * JD-Core Version:    0.6.2
 */
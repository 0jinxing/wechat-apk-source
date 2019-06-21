package com.tencent.mm.plugin.webview.ui.tools;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CreateAvatarUI$5
  implements View.OnKeyListener
{
  CreateAvatarUI$5(CreateAvatarUI paramCreateAvatarUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(7357);
    if (paramInt == 4)
    {
      CreateAvatarUI.a(this.urn, (InputMethodManager)this.urn.getSystemService("input_method"));
      if ((CreateAvatarUI.a(this.urn) != null) && (CreateAvatarUI.a(this.urn).isActive()))
      {
        CreateAvatarUI.a(this.urn).hideSoftInputFromWindow(this.urn.getCurrentFocus().getWindowToken(), 0);
        CreateAvatarUI.b(this.urn).setCursorVisible(false);
        this.urn.getWindow().getDecorView().requestFocus();
      }
    }
    AppMethodBeat.o(7357);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.5
 * JD-Core Version:    0.6.2
 */
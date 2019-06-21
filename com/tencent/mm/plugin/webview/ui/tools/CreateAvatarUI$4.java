package com.tencent.mm.plugin.webview.ui.tools;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CreateAvatarUI$4
  implements TextView.OnEditorActionListener
{
  CreateAvatarUI$4(CreateAvatarUI paramCreateAvatarUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(7356);
    if ((paramInt == 6) || ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66)))
    {
      CreateAvatarUI.a(this.urn, (InputMethodManager)this.urn.getSystemService("input_method"));
      if ((CreateAvatarUI.a(this.urn) != null) && (CreateAvatarUI.a(this.urn).isActive()))
      {
        CreateAvatarUI.a(this.urn).hideSoftInputFromWindow(this.urn.getCurrentFocus().getWindowToken(), 0);
        CreateAvatarUI.b(this.urn).setCursorVisible(false);
        this.urn.getWindow().getDecorView().requestFocus();
      }
    }
    AppMethodBeat.o(7356);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.4
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CreateAvatarUI$7
  implements View.OnTouchListener
{
  CreateAvatarUI$7(CreateAvatarUI paramCreateAvatarUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(7359);
    if (paramMotionEvent.getAction() == 0)
      CreateAvatarUI.b(this.urn).setCursorVisible(true);
    AppMethodBeat.o(7359);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.7
 * JD-Core Version:    0.6.2
 */
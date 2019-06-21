package com.tencent.mm.plugin.appbrand.widget.sms;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EditVerifyCodeView$3
  implements View.OnKeyListener
{
  EditVerifyCodeView$3(EditVerifyCodeView paramEditVerifyCodeView)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(134403);
    if ((paramInt == 67) && (paramKeyEvent.getAction() == 1))
    {
      EditVerifyCodeView.c(this.joT);
      AppMethodBeat.o(134403);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(134403);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView.3
 * JD-Core Version:    0.6.2
 */
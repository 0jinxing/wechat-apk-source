package com.tencent.mm.ui.conversation;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingCheckUnProcessWalletConvUI$2
  implements View.OnTouchListener
{
  SettingCheckUnProcessWalletConvUI$2(SettingCheckUnProcessWalletConvUI paramSettingCheckUnProcessWalletConvUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(34611);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(34611);
      return false;
      this.zvJ.aqX();
      SettingCheckUnProcessWalletConvUI.a(this.zvJ)[0] = ((int)paramMotionEvent.getRawX());
      SettingCheckUnProcessWalletConvUI.a(this.zvJ)[1] = ((int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI.2
 * JD-Core Version:    0.6.2
 */
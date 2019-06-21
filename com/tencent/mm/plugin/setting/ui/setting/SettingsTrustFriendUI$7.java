package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsTrustFriendUI$7
  implements View.OnTouchListener
{
  SettingsTrustFriendUI$7(SettingsTrustFriendUI paramSettingsTrustFriendUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(127538);
    if ((SettingsTrustFriendUI.b(this.qpo)) && (paramMotionEvent.getAction() == 1) && (SettingsTrustFriendUI.d(this.qpo).pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()) == -1))
    {
      SettingsTrustFriendUI.a(this.qpo, false);
      SettingsTrustFriendUI.c(this.qpo).notifyDataSetChanged();
      AppMethodBeat.o(127538);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(127538);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.7
 * JD-Core Version:    0.6.2
 */
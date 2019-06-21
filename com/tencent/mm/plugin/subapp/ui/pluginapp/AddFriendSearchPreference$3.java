package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AddFriendSearchPreference$3
  implements View.OnTouchListener
{
  AddFriendSearchPreference$3(AddFriendSearchPreference paramAddFriendSearchPreference)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(25494);
    if (paramMotionEvent.getAction() == 1)
      AddFriendSearchPreference.c(this.svb).onClick(paramView);
    AppMethodBeat.o(25494);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference.3
 * JD-Core Version:    0.6.2
 */
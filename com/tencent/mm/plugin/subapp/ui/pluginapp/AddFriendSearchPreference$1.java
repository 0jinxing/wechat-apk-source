package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AddFriendSearchPreference$1
  implements View.OnClickListener
{
  AddFriendSearchPreference$1(AddFriendSearchPreference paramAddFriendSearchPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25493);
    if ((AddFriendSearchPreference.a(this.svb) != null) && (AddFriendSearchPreference.b(this.svb) != null))
      if (AddFriendSearchPreference.b(this.svb).getText() == null)
      {
        AddFriendSearchPreference.a(this.svb);
        AppMethodBeat.o(25493);
      }
    while (true)
    {
      return;
      AddFriendSearchPreference.a(this.svb);
      AddFriendSearchPreference.b(this.svb).getText().toString();
      AppMethodBeat.o(25493);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference.1
 * JD-Core Version:    0.6.2
 */
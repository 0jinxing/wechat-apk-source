package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.b;

final class InviteFriendsBy3rdUI$2
  implements q.b
{
  InviteFriendsBy3rdUI$2(InviteFriendsBy3rdUI paramInviteFriendsBy3rdUI, String paramString, int paramInt)
  {
  }

  public final void iw(boolean paramBoolean)
  {
    AppMethodBeat.i(25539);
    String str;
    if (paramBoolean)
      if (InviteFriendsBy3rdUI.b(this.svC) == null)
      {
        str = this.gUV;
        InviteFriendsBy3rdUI.a(this.svC, this.nFd, str);
        AppMethodBeat.o(25539);
      }
    while (true)
    {
      return;
      str = InviteFriendsBy3rdUI.b(this.svC).getText().toString();
      break;
      AppMethodBeat.o(25539);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI.2
 * JD-Core Version:    0.6.2
 */
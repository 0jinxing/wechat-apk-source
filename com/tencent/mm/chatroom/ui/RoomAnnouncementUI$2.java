package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.s;

final class RoomAnnouncementUI$2 extends s
{
  RoomAnnouncementUI$2(RoomAnnouncementUI paramRoomAnnouncementUI)
  {
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(104138);
    boolean bool;
    if (paramString.equals("weixin://chatroom/upgradeagree"))
    {
      b.a(this.ejP, RoomAnnouncementUI.b(this.ejP), RoomAnnouncementUI.c(this.ejP));
      bool = true;
      AppMethodBeat.o(104138);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104138);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomAnnouncementUI.2
 * JD-Core Version:    0.6.2
 */
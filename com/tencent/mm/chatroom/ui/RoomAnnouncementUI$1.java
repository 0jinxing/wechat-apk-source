package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;

final class RoomAnnouncementUI$1 extends l
{
  RoomAnnouncementUI$1(RoomAnnouncementUI paramRoomAnnouncementUI)
  {
  }

  public final boolean a(WebView paramWebView, String paramString1, String paramString2, com.tencent.xweb.h paramh)
  {
    AppMethodBeat.i(104137);
    com.tencent.mm.ui.base.h.a(this.ejP, paramString2, null, new RoomAnnouncementUI.1.1(this));
    paramh.cancel();
    AppMethodBeat.o(104137);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomAnnouncementUI.1
 * JD-Core Version:    0.6.2
 */
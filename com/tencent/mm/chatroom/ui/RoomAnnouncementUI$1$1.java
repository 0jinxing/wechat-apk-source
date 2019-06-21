package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;

final class RoomAnnouncementUI$1$1
  implements DialogInterface.OnClickListener
{
  RoomAnnouncementUI$1$1(RoomAnnouncementUI.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104136);
    RoomAnnouncementUI.a(this.ejQ.ejP).requestFocus();
    AppMethodBeat.o(104136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomAnnouncementUI.1.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.chatroom.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.n.d;

final class RoomCardUI$7
  implements n.d
{
  RoomCardUI$7(RoomCardUI paramRoomCardUI, TextView paramTextView)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(104152);
    if (paramInt == 0)
      ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, this.ekn.getText().toString()));
    AppMethodBeat.o(104152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomCardUI.7
 * JD-Core Version:    0.6.2
 */
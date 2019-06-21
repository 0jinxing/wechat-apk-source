package com.tencent.mm.plugin.talkroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class TalkRoomUI$17
  implements DialogInterface.OnDismissListener
{
  TalkRoomUI$17(TalkRoomUI paramTalkRoomUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(25924);
    aw.ZK();
    int i = bo.a((Integer)c.Ry().get(144641, null), 0);
    aw.ZK();
    c.Ry().set(144641, Integer.valueOf(i + 1));
    this.szE.onBackPressed();
    AppMethodBeat.o(25924);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.17
 * JD-Core Version:    0.6.2
 */
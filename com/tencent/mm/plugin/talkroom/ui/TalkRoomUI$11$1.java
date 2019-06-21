package com.tencent.mm.plugin.talkroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.talkroom.model.b;
import com.tencent.mm.plugin.talkroom.model.g;

final class TalkRoomUI$11$1
  implements DialogInterface.OnClickListener
{
  TalkRoomUI$11$1(TalkRoomUI.11 param11)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(25915);
    TalkRoomUI.j(this.szG.szE);
    b.cEh().cEw();
    this.szG.szE.finish();
    AppMethodBeat.o(25915);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.11.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.pwdgroup.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FacingCreateChatRoomAllInOneUI$5
  implements DialogInterface.OnCancelListener
{
  FacingCreateChatRoomAllInOneUI$5(FacingCreateChatRoomAllInOneUI paramFacingCreateChatRoomAllInOneUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(23988);
    FacingCreateChatRoomAllInOneUI.cbW();
    AppMethodBeat.o(23988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.5
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.pwdgroup.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView.a;

final class FacingCreateChatRoomAllInOneUI$3
  implements MMCallBackScrollView.a
{
  FacingCreateChatRoomAllInOneUI$3(FacingCreateChatRoomAllInOneUI paramFacingCreateChatRoomAllInOneUI)
  {
  }

  public final void cm(int paramInt)
  {
    AppMethodBeat.i(23985);
    if (FacingCreateChatRoomAllInOneUI.l(this.prD) != null)
      if (paramInt == 0)
      {
        FacingCreateChatRoomAllInOneUI.l(this.prD).setVisibility(4);
        AppMethodBeat.o(23985);
      }
    while (true)
    {
      return;
      FacingCreateChatRoomAllInOneUI.l(this.prD).setVisibility(0);
      AppMethodBeat.o(23985);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.3
 * JD-Core Version:    0.6.2
 */
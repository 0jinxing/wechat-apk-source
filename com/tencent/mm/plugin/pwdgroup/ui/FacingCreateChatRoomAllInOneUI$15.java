package com.tencent.mm.plugin.pwdgroup.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView.a;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView;

final class FacingCreateChatRoomAllInOneUI$15
  implements MMKeyBoardView.a
{
  FacingCreateChatRoomAllInOneUI$15(FacingCreateChatRoomAllInOneUI paramFacingCreateChatRoomAllInOneUI)
  {
  }

  public final void axQ()
  {
    AppMethodBeat.i(23998);
    if (FacingCreateChatRoomAllInOneUI.g(this.prD) != null)
      FacingCreateChatRoomAllInOneUI.g(this.prD).axQ();
    AppMethodBeat.o(23998);
  }

  public final void delete()
  {
    AppMethodBeat.i(23999);
    if (FacingCreateChatRoomAllInOneUI.g(this.prD) != null)
      if ((FacingCreateChatRoomAllInOneUI.h(this.prD)) || (FacingCreateChatRoomAllInOneUI.i(this.prD)))
      {
        FacingCreateChatRoomAllInOneUI.g(this.prD).axQ();
        FacingCreateChatRoomAllInOneUI.a(this.prD, FacingCreateChatRoomAllInOneUI.a.prI);
        AppMethodBeat.o(23999);
      }
    while (true)
    {
      return;
      MMPwdInputView localMMPwdInputView = FacingCreateChatRoomAllInOneUI.g(this.prD);
      if (localMMPwdInputView.mbi > 0)
        localMMPwdInputView.enD.deleteCharAt(localMMPwdInputView.mbi - 1);
      localMMPwdInputView.btM();
      localMMPwdInputView.cbX();
      AppMethodBeat.o(23999);
    }
  }

  public final void input(String paramString)
  {
    AppMethodBeat.i(23997);
    if (FacingCreateChatRoomAllInOneUI.g(this.prD) != null)
      if ((FacingCreateChatRoomAllInOneUI.h(this.prD)) || (FacingCreateChatRoomAllInOneUI.i(this.prD)))
      {
        MMPwdInputView localMMPwdInputView = FacingCreateChatRoomAllInOneUI.g(this.prD);
        localMMPwdInputView.axQ();
        localMMPwdInputView.input(paramString);
        FacingCreateChatRoomAllInOneUI.a(this.prD, FacingCreateChatRoomAllInOneUI.a.prI);
        AppMethodBeat.o(23997);
      }
    while (true)
    {
      return;
      FacingCreateChatRoomAllInOneUI.g(this.prD).input(paramString);
      AppMethodBeat.o(23997);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.15
 * JD-Core Version:    0.6.2
 */
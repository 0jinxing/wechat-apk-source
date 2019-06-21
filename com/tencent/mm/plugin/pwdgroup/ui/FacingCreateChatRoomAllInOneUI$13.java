package com.tencent.mm.plugin.pwdgroup.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView.a;
import com.tencent.mm.sdk.platformtools.ab;

final class FacingCreateChatRoomAllInOneUI$13
  implements MMPwdInputView.a
{
  FacingCreateChatRoomAllInOneUI$13(FacingCreateChatRoomAllInOneUI paramFacingCreateChatRoomAllInOneUI)
  {
  }

  public final void o(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(23995);
    ab.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onFinishInput] %b %s", new Object[] { Boolean.valueOf(paramBoolean), paramString });
    FacingCreateChatRoomAllInOneUI.a(this.prD, paramString);
    if (paramBoolean)
    {
      FacingCreateChatRoomAllInOneUI.a(this.prD, true);
      FacingCreateChatRoomAllInOneUI.e(this.prD);
    }
    AppMethodBeat.o(23995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.13
 * JD-Core Version:    0.6.2
 */
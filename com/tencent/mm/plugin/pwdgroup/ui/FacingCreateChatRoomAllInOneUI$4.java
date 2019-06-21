package com.tencent.mm.plugin.pwdgroup.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView;
import com.tencent.mm.ui.widget.MMScrollGridView;

final class FacingCreateChatRoomAllInOneUI$4
  implements Animation.AnimationListener
{
  FacingCreateChatRoomAllInOneUI$4(FacingCreateChatRoomAllInOneUI paramFacingCreateChatRoomAllInOneUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(23987);
    FacingCreateChatRoomAllInOneUI.n(this.prD).setVisibility(8);
    FacingCreateChatRoomAllInOneUI.g(this.prD).setVisibility(0);
    FacingCreateChatRoomAllInOneUI.o(this.prD).setVisibility(0);
    FacingCreateChatRoomAllInOneUI.p(this.prD).setVisibility(0);
    FacingCreateChatRoomAllInOneUI.m(this.prD).setVisibility(0);
    FacingCreateChatRoomAllInOneUI.q(this.prD).setVisibility(8);
    FacingCreateChatRoomAllInOneUI.r(this.prD).setVisibility(8);
    FacingCreateChatRoomAllInOneUI.g(this.prD).clearAnimation();
    FacingCreateChatRoomAllInOneUI.o(this.prD).clearAnimation();
    FacingCreateChatRoomAllInOneUI.m(this.prD).clearAnimation();
    AppMethodBeat.o(23987);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(23986);
    FacingCreateChatRoomAllInOneUI.m(this.prD).setVisibility(4);
    AppMethodBeat.o(23986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.4
 * JD-Core Version:    0.6.2
 */
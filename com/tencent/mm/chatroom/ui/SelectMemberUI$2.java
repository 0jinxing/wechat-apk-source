package com.tencent.mm.chatroom.ui;

import android.os.HandlerThread;
import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;

final class SelectMemberUI$2
  implements TextWatcher
{
  private ap emH;

  SelectMemberUI$2(SelectMemberUI paramSelectMemberUI)
  {
    AppMethodBeat.i(104409);
    this.emH = new ap(g.RS().oAl.getLooper(), new SelectMemberUI.2.1(this), false);
    AppMethodBeat.o(104409);
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(104410);
    this.emH.stopTimer();
    this.emH.ae(500L, 500L);
    AppMethodBeat.o(104410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI.2
 * JD-Core Version:    0.6.2
 */
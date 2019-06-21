package com.tencent.mm.chatroom.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomCardUI$a
  implements TextWatcher
{
  private int eko = 280;
  private String ekp = "";
  private boolean ekq = false;

  private RoomCardUI$a(RoomCardUI paramRoomCardUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(104157);
    RoomCardUI.d(this.ekm);
    AppMethodBeat.o(104157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomCardUI.a
 * JD-Core Version:    0.6.2
 */
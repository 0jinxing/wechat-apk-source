package com.tencent.mm.chatroom.ui;

import android.text.Editable;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class ModRemarkRoomNameUI$1
  implements TextWatcher
{
  ModRemarkRoomNameUI$1(ModRemarkRoomNameUI paramModRemarkRoomNameUI, String paramString)
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
    AppMethodBeat.i(104117);
    if (!this.ejI.equals(paramCharSequence))
      this.ejJ.enableOptionMenu(true);
    if (paramCharSequence.length() > 0)
    {
      ModRemarkRoomNameUI.a(this.ejJ).setEllipsize(null);
      AppMethodBeat.o(104117);
    }
    while (true)
    {
      return;
      ModRemarkRoomNameUI.a(this.ejJ).setEllipsize(TextUtils.TruncateAt.END);
      AppMethodBeat.o(104117);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI.1
 * JD-Core Version:    0.6.2
 */
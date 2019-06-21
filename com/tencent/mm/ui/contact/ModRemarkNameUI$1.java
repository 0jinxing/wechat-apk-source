package com.tencent.mm.ui.contact;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText.b;

final class ModRemarkNameUI$1
  implements MMEditText.b
{
  ModRemarkNameUI$1(ModRemarkNameUI paramModRemarkNameUI)
  {
  }

  public final void aqH()
  {
    AppMethodBeat.i(33744);
    if (ModRemarkNameUI.a(this.znY).getText().toString().trim().length() > 0)
      this.znY.enableOptionMenu(true);
    AppMethodBeat.o(33744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ModRemarkNameUI.1
 * JD-Core Version:    0.6.2
 */
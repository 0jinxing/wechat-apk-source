package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ModRemarkNameUI$4
  implements View.OnClickListener
{
  ModRemarkNameUI$4(ModRemarkNameUI paramModRemarkNameUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33747);
    ModRemarkNameUI.f(this.znY).setVisibility(0);
    ModRemarkNameUI.g(this.znY).setVisibility(8);
    ModRemarkNameUI.h(this.znY).requestFocus();
    this.znY.showVKB();
    AppMethodBeat.o(33747);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ModRemarkNameUI.4
 * JD-Core Version:    0.6.2
 */
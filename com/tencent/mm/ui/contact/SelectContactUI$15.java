package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class SelectContactUI$15
  implements View.OnClickListener
{
  SelectContactUI$15(SelectContactUI paramSelectContactUI, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33863);
    h.d(this.zoP, this.zoP.getString(this.zoV, new Object[] { Integer.valueOf(this.zoW) }), "", this.zoP.getString(2131305796), this.zoP.getString(2131296868), new SelectContactUI.15.1(this), null);
    AppMethodBeat.o(33863);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.15
 * JD-Core Version:    0.6.2
 */
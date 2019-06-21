package com.tencent.mm.plugin.address.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class AddrEditView$4
  implements View.OnClickListener
{
  AddrEditView$4(AddrEditView paramAddrEditView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(16808);
    if (AddrEditView.f(this.gJT).getVisibility() == 0)
      if ((this.gJT.gJL) && (AddrEditView.d(this.gJT) != 2) && (!bo.isNullOrNil(this.gJT.getText())))
      {
        this.gJT.gJF.setText("");
        AddrEditView.b(this.gJT, AddrEditView.e(this.gJT).isFocused());
        AppMethodBeat.o(16808);
      }
    while (true)
    {
      return;
      if (AddrEditView.g(this.gJT) != null)
        AddrEditView.g(this.gJT).onClick();
      AppMethodBeat.o(16808);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.AddrEditView.4
 * JD-Core Version:    0.6.2
 */
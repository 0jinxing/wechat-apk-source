package com.tencent.mm.plugin.address.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AddrEditView$3
  implements TextWatcher
{
  AddrEditView$3(AddrEditView paramAddrEditView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(16807);
    boolean bool = this.gJT.asa();
    if ((bool != AddrEditView.a(this.gJT)) && (AddrEditView.b(this.gJT) != null))
    {
      ab.d("MicroMsg.AddrEditView", "View:" + AddrEditView.c(this.gJT) + ", editType:" + AddrEditView.d(this.gJT) + " inputValid change to " + bool);
      AddrEditView.a(this.gJT, bool);
      paramEditable = AddrEditView.b(this.gJT);
      AddrEditView.a(this.gJT);
      paramEditable.arX();
    }
    AddrEditView.b(this.gJT, AddrEditView.e(this.gJT).isFocused());
    AppMethodBeat.o(16807);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.AddrEditView.3
 * JD-Core Version:    0.6.2
 */
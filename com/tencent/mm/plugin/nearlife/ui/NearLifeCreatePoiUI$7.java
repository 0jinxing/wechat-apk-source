package com.tencent.mm.plugin.nearlife.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearLifeCreatePoiUI$7
  implements TextWatcher
{
  NearLifeCreatePoiUI$7(NearLifeCreatePoiUI paramNearLifeCreatePoiUI)
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
    AppMethodBeat.i(22978);
    if ((NearLifeCreatePoiUI.d(this.oSJ).getText().toString().trim().length() == 0) || (NearLifeCreatePoiUI.f(this.oSJ).getText().toString().trim().length() == 0) || (NearLifeCreatePoiUI.e(this.oSJ).getText().toString().trim().length() == 0))
    {
      this.oSJ.enableOptionMenu(0, false);
      AppMethodBeat.o(22978);
    }
    while (true)
    {
      return;
      this.oSJ.enableOptionMenu(0, true);
      AppMethodBeat.o(22978);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI.7
 * JD-Core Version:    0.6.2
 */
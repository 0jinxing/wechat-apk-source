package com.tencent.mm.plugin.ipcall.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.bo;

final class b$9
  implements TextWatcher
{
  b$9(b paramb)
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
    AppMethodBeat.i(21979);
    String str = bo.PA(paramCharSequence.toString());
    if (str.contains(" "))
    {
      paramCharSequence = str.replace(" ", "");
      this.nAl.nzT.setText(bo.ad(paramCharSequence));
      if (!a.Pu(paramCharSequence))
        break label209;
      str = a.Ps(paramCharSequence);
      if (!bo.isNullOrNil(str))
      {
        this.nAl.nzS.setText("+".concat(String.valueOf(str)));
        this.nAl.nzT.setText(a.Px(paramCharSequence));
      }
    }
    while (true)
    {
      if (this.nAl.nzQ != null)
        this.nAl.nzQ.Pb(this.nAl.nzT.getText().toString());
      AppMethodBeat.o(21979);
      return;
      if (this.nAl.nAk.equals(str))
      {
        paramCharSequence = str;
        if (paramInt3 <= 0)
          break;
      }
      paramCharSequence = str;
      if (!bo.isNullOrNil(str))
        break;
      this.nAl.nAk = str;
      this.nAl.nzT.setText("");
      paramCharSequence = str;
      break;
      label209: if (!paramCharSequence.equals(this.nAl.nAk))
      {
        this.nAl.nAk = paramCharSequence;
        this.nAl.nzT.setText(paramCharSequence);
        if (bo.isNullOrNil(this.nAl.nzS.getText().toString()))
          this.nAl.nzS.setText("+" + a.bIN());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.9
 * JD-Core Version:    0.6.2
 */
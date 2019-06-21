package com.tencent.mm.plugin.ipcall.ui;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class b$4
  implements View.OnClickListener
{
  b$4(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21974);
    paramView = this.nAl.nzT.getText().toString();
    if (bo.isNullOrNil(paramView))
    {
      paramView = this.nAl.nzS.getText().toString();
      if (!bo.isNullOrNil(paramView))
      {
        paramView = paramView.substring(0, paramView.length() - 1);
        if ((!bo.isNullOrNil(paramView)) && (!paramView.equals("+")))
        {
          this.nAl.nzS.setText(paramView);
          this.nAl.nAa = paramView;
          AppMethodBeat.o(21974);
        }
      }
      while (true)
      {
        return;
        this.nAl.nzS.setText("+");
        this.nAl.nAa = "+";
        this.nAl.nAf = true;
        AppMethodBeat.o(21974);
      }
    }
    int i = this.nAl.nzT.getSelectionStart();
    label196: String str;
    if ((this.nAl.nAi) && (i - 1 >= 0))
    {
      paramView = this.nAl.nzT.getText();
      paramView.delete(i - 1, i);
      paramView = paramView.toString();
      if (bo.isNullOrNil(paramView))
        break label371;
      str = this.nAl.nzS.getText().toString().replace("+", "");
      if (!this.nAl.nAi)
        break label341;
      this.nAl.nAb = b.eL(str, paramView);
      int j = this.nAl.nAb.length();
      int k = paramView.length();
      this.nAl.cq(this.nAl.nAb, j - k + (i - 1));
      label289: this.nAl.bId();
    }
    while (true)
    {
      this.nAl.nAc = "";
      this.nAl.goa.setText("");
      AppMethodBeat.o(21974);
      break;
      paramView = paramView.substring(0, paramView.length() - 1);
      break label196;
      label341: this.nAl.nAb = b.eL(str, paramView);
      this.nAl.cq(this.nAl.nAb, -1);
      break label289;
      label371: this.nAl.nAb = "";
      this.nAl.cq("", -1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.4
 * JD-Core Version:    0.6.2
 */
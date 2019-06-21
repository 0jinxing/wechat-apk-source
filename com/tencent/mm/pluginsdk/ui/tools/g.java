package com.tencent.mm.pluginsdk.ui.tools;

import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText.b;

public final class g
{
  public static InputFilter[] vuR;

  static
  {
    AppMethodBeat.i(105868);
    vuR = new InputFilter[] { new InputFilter.LengthFilter(50) };
    AppMethodBeat.o(105868);
  }

  public static final class a
    implements TextWatcher
  {
    public MMEditText.b vuS = null;

    public final void afterTextChanged(Editable paramEditable)
    {
    }

    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      AppMethodBeat.i(105867);
      if (this.vuS != null)
        this.vuS.aqH();
      AppMethodBeat.o(105867);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.g
 * JD-Core Version:    0.6.2
 */
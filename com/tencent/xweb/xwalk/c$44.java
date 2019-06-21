package com.tencent.xweb.xwalk;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkEnvironment;

final class c$44
  implements TextWatcher
{
  c$44(c paramc, EditText paramEditText)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(85172);
    paramEditable = this.ARE.getText().toString();
    int i = 0;
    try
    {
      j = Integer.parseInt(paramEditable);
      XWalkEnvironment.setGrayValueForTest(j);
      AppMethodBeat.o(85172);
      return;
    }
    catch (Exception paramEditable)
    {
      while (true)
        int j = i;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.44
 * JD-Core Version:    0.6.2
 */
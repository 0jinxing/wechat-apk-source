package com.tencent.mm.ui.base;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class MMAutoSwitchEditText$a
  implements TextWatcher, View.OnKeyListener
{
  int mIndex = 0;
  private String mText;
  private EditText tc;
  MMAutoSwitchEditText.c ytK;
  MMAutoSwitchEditText.b ytL;
  MMAutoSwitchEditText.d ytM;
  int ytN = 4;

  public MMAutoSwitchEditText$a(EditText paramEditText)
  {
    this.tc = paramEditText;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(106495);
    this.mText = paramEditable.toString();
    paramEditable = "";
    if (this.ytM != null)
      this.ytM.dzE();
    int i = 0;
    int j = 0;
    int k;
    while (true)
    {
      k = j;
      if (i >= this.mText.length())
        break;
      j++;
      k = j;
      if (j > this.ytN)
        break;
      paramEditable = paramEditable + this.mText.charAt(i);
      i++;
    }
    if (k > this.ytN)
    {
      this.tc.setText(paramEditable);
      this.tc.setSelection(paramEditable.length());
    }
    if ((k >= this.ytN) && (this.ytK != null))
      this.ytK.NE(this.mIndex);
    AppMethodBeat.o(106495);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(106496);
    if ((paramInt == 67) && (this.tc.getText().toString().trim().length() == 0) && (this.ytL != null))
      this.ytL.ND(this.mIndex);
    AppMethodBeat.o(106496);
    return false;
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoSwitchEditText.a
 * JD-Core Version:    0.6.2
 */
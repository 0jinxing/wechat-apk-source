package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

class MMAutoSwitchEditText extends EditText
{
  MMAutoSwitchEditText.a ytJ;

  public MMAutoSwitchEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106497);
    this.ytJ = new MMAutoSwitchEditText.a(this);
    addTextChangedListener(this.ytJ);
    setOnKeyListener(this.ytJ);
    AppMethodBeat.o(106497);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoSwitchEditText
 * JD-Core Version:    0.6.2
 */
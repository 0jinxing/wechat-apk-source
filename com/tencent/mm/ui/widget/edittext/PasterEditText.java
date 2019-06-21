package com.tencent.mm.ui.widget.edittext;

import android.content.Context;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PasterEditText extends EditText
{
  private Context context;
  private int iHm;
  private ClipboardManager rrN;

  public PasterEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112701);
    this.rrN = null;
    this.iHm = 0;
    this.context = paramContext;
    init();
    AppMethodBeat.o(112701);
  }

  public PasterEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112702);
    this.rrN = null;
    this.iHm = 0;
    init();
    AppMethodBeat.o(112702);
  }

  private void init()
  {
    AppMethodBeat.i(112703);
    this.rrN = ((ClipboardManager)this.context.getApplicationContext().getSystemService("clipboard"));
    AppMethodBeat.o(112703);
  }

  public int getPasterLen()
  {
    return this.iHm;
  }

  public boolean onTextContextMenuItem(int paramInt)
  {
    AppMethodBeat.i(112704);
    if (paramInt == 16908322)
      if ((this.rrN != null) && (this.rrN.getText() != null) && ((this.rrN.getText() instanceof String)) && (this.rrN.getText() != null) && (this.rrN.getText().length() > 0))
        this.iHm += this.rrN.getText().length();
    for (boolean bool = super.onTextContextMenuItem(paramInt); ; bool = super.onTextContextMenuItem(paramInt))
    {
      AppMethodBeat.o(112704);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.edittext.PasterEditText
 * JD-Core Version:    0.6.2
 */
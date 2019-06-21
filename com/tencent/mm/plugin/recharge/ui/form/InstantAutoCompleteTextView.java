package com.tencent.mm.plugin.recharge.ui.form;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class InstantAutoCompleteTextView extends AutoCompleteTextView
{
  private boolean pIf;

  public InstantAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public InstantAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void dismissDropDown()
  {
    AppMethodBeat.i(44364);
    super.dismissDropDown();
    ab.d("TestAutoCompleteTextView", "dismiss");
    AppMethodBeat.o(44364);
  }

  public boolean enoughToFilter()
  {
    AppMethodBeat.i(44365);
    boolean bool;
    if ((this.pIf) || (super.enoughToFilter()))
    {
      bool = true;
      AppMethodBeat.o(44365);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(44365);
    }
  }

  public void setShowAlways(boolean paramBoolean)
  {
    this.pIf = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView
 * JD-Core Version:    0.6.2
 */
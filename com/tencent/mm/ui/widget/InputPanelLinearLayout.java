package com.tencent.mm.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class InputPanelLinearLayout extends LinearLayout
  implements b.a
{
  private b zLU;

  public InputPanelLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public InputPanelLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107859);
    this.zLU = new b(this, this);
    AppMethodBeat.o(107859);
  }

  public b getInputPanelHelper()
  {
    return this.zLU;
  }

  public void m(boolean paramBoolean, int paramInt)
  {
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107860);
    this.zLU.PR(paramInt2);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(107860);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.InputPanelLinearLayout
 * JD-Core Version:    0.6.2
 */
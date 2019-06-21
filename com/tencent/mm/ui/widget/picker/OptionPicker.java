package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.aj;

public class OptionPicker extends NumberPicker
{
  private int dg;
  private int di;
  private String[] jkM;
  private int jkN;
  private Context mContext;

  public OptionPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112857);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(112857);
  }

  public OptionPicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112858);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(112858);
  }

  private void init()
  {
    AppMethodBeat.i(112859);
    this.dg = aj.fromDPToPix(this.mContext, 120);
    this.jkN = aj.fromDPToPix(this.mContext, 20);
    e.a(this, getResources().getDrawable(2130839831));
    setDescendantFocusability(393216);
    AppMethodBeat.o(112859);
  }

  public final String aRK()
  {
    AppMethodBeat.i(112861);
    String str;
    if ((this.jkM == null) || (this.jkM.length <= 0))
    {
      str = "";
      AppMethodBeat.o(112861);
    }
    while (true)
    {
      return str;
      str = this.jkM[getValue()];
      AppMethodBeat.o(112861);
    }
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(112865);
    super.onAttachedToWindow();
    AppMethodBeat.o(112865);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112864);
    if ((View.MeasureSpec.getMode(paramInt1) == -2147483648) || (View.MeasureSpec.getMode(paramInt1) == 1073741824))
      this.di = View.MeasureSpec.getSize(paramInt1);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), paramInt2);
    if ((getMeasuredWidth() <= this.dg) && ((this.di <= 0) || (this.dg <= this.di)))
    {
      setMeasuredDimension(this.dg, getMeasuredHeight());
      AppMethodBeat.o(112864);
      return;
    }
    paramInt2 = getMeasuredWidth() + this.jkN * 2;
    paramInt1 = paramInt2;
    if (this.di > 0)
      if (this.di <= paramInt2)
        break label136;
    label136: for (paramInt1 = paramInt2; ; paramInt1 = this.di)
    {
      setMeasuredDimension(paramInt1, getMeasuredHeight());
      AppMethodBeat.o(112864);
      break;
    }
  }

  @Deprecated
  public void setDisplayedValues(String[] paramArrayOfString)
  {
    AppMethodBeat.i(112863);
    super.setDisplayedValues(paramArrayOfString);
    AppMethodBeat.o(112863);
  }

  public final void setExtraPadding(int paramInt)
  {
    AppMethodBeat.i(112862);
    this.jkN = Math.max(paramInt, 0);
    AppMethodBeat.o(112862);
  }

  public final void setMaxWidth(int paramInt)
  {
    this.di = paramInt;
  }

  public final void setMinWidth(int paramInt)
  {
    this.dg = paramInt;
  }

  public void setOptionsArray(String[] paramArrayOfString)
  {
    AppMethodBeat.i(112860);
    if (paramArrayOfString == null)
      AppMethodBeat.o(112860);
    while (true)
    {
      return;
      this.jkM = paramArrayOfString;
      setDisplayedValues(null);
      setMinValue(0);
      setMaxValue(Math.max(paramArrayOfString.length - 1, 0));
      setWrapSelectorWheel(false);
      String[] arrayOfString = paramArrayOfString;
      if (paramArrayOfString.length <= 0)
        arrayOfString = null;
      super.setDisplayedValues(arrayOfString);
      AppMethodBeat.o(112860);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.OptionPicker
 * JD-Core Version:    0.6.2
 */
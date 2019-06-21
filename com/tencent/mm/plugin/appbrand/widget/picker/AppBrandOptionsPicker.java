package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Keep;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.jsapi.m.b;

public class AppBrandOptionsPicker extends NumberPicker
  implements b<String>
{
  private int dg;
  private int di;
  private String[] jkM;
  private int jkN;

  @Keep
  public AppBrandOptionsPicker(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, 2131493743));
    AppMethodBeat.i(126714);
    com.tencent.mm.ui.widget.picker.e.a(this, getResources().getDrawable(2130837797));
    com.tencent.mm.ui.widget.picker.e.c(this);
    com.tencent.mm.ui.widget.picker.e.e(this);
    e.a(this);
    this.dg = a.fromDPToPix(paramContext, 100);
    this.jkN = a.fromDPToPix(paramContext, 20);
    AppMethodBeat.o(126714);
  }

  public final void a(d paramd)
  {
  }

  public final void aEH()
  {
  }

  public final void aEI()
  {
  }

  public final String aRK()
  {
    AppMethodBeat.i(126720);
    String str;
    if ((this.jkM == null) || (this.jkM.length <= 0))
    {
      str = "";
      AppMethodBeat.o(126720);
    }
    while (true)
    {
      return str;
      str = this.jkM[getValue()];
      AppMethodBeat.o(126720);
    }
  }

  public final void b(d paramd)
  {
  }

  public View getView()
  {
    return this;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(126719);
    super.onAttachedToWindow();
    com.tencent.mm.ui.widget.picker.e.d(this);
    AppMethodBeat.o(126719);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126718);
    if ((View.MeasureSpec.getMode(paramInt1) == -2147483648) || (View.MeasureSpec.getMode(paramInt1) == 1073741824))
      this.di = View.MeasureSpec.getSize(paramInt1);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), paramInt2);
    if ((getMeasuredWidth() <= this.dg) && ((this.di <= 0) || (this.dg <= this.di)))
    {
      setMeasuredDimension(this.dg, getMeasuredHeight());
      AppMethodBeat.o(126718);
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
      AppMethodBeat.o(126718);
      break;
    }
  }

  @Deprecated
  public void setDisplayedValues(String[] paramArrayOfString)
  {
    AppMethodBeat.i(126717);
    super.setDisplayedValues(paramArrayOfString);
    AppMethodBeat.o(126717);
  }

  public final void setExtraPadding(int paramInt)
  {
    AppMethodBeat.i(126716);
    this.jkN = Math.max(paramInt, 0);
    AppMethodBeat.o(126716);
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
    AppMethodBeat.i(126715);
    if (paramArrayOfString == null)
      AppMethodBeat.o(126715);
    while (true)
    {
      return;
      this.jkM = paramArrayOfString;
      setDisplayedValues(null);
      setMinValue(0);
      setMaxValue(Math.max(paramArrayOfString.length - 1, 0));
      String[] arrayOfString = paramArrayOfString;
      if (paramArrayOfString.length <= 0)
        arrayOfString = null;
      super.setDisplayedValues(arrayOfString);
      AppMethodBeat.o(126715);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPicker
 * JD-Core Version:    0.6.2
 */
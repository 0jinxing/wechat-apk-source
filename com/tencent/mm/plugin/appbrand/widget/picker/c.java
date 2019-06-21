package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.jsapi.m.b;

public class c extends YANumberPicker
  implements b<String>
{
  private String[] jkM;
  private int jkO;

  public c(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(126722);
    setDividerHeight(a.fromDPToPix(paramContext, 2));
    setDividerColor(Color.parseColor("#1AAD19"));
    setItemPaddingVertical(a.fromDPToPix(paramContext, 8));
    setNormalTextColor(Color.parseColor("#A5A5A5"));
    setSelectedTextColor(-16777216);
    AppMethodBeat.o(126722);
  }

  public final void a(d paramd)
  {
  }

  public final void aEH()
  {
    AppMethodBeat.i(126725);
    aRX();
    AppMethodBeat.o(126725);
  }

  public final void aEI()
  {
  }

  public final void b(d paramd)
  {
  }

  public final View getView()
  {
    return this;
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126724);
    if (this.jkO > 0)
      paramInt1 = View.MeasureSpec.makeMeasureSpec(this.jkO, 1073741824);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(126724);
  }

  public final void setForceWidth(int paramInt)
  {
    this.jkO = paramInt;
  }

  public final void setOptionsArray(String[] paramArrayOfString)
  {
    AppMethodBeat.i(126723);
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      setEnabled(false);
      setVisibility(4);
      AppMethodBeat.o(126723);
    }
    while (true)
    {
      return;
      setEnabled(true);
      setVisibility(0);
      this.jkM = paramArrayOfString;
      int i = getMinValue();
      int j = getMaxValue();
      int k = paramArrayOfString.length - 1;
      if (k - i + 1 > j - i + 1)
      {
        setDisplayedValues(paramArrayOfString);
        setMaxValue(k);
        AppMethodBeat.o(126723);
      }
      else
      {
        setMaxValue(k);
        setDisplayedValues(paramArrayOfString);
        AppMethodBeat.o(126723);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.c
 * JD-Core Version:    0.6.2
 */
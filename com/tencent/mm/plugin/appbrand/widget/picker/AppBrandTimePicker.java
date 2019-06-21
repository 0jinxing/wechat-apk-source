package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.annotation.Keep;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TimePicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.plugin.appbrand.jsapi.m.b;

public final class AppBrandTimePicker extends TimePicker
  implements b<String>
{
  public int hUA;
  public int hUB;
  public int hUy;
  public int hUz;
  public NumberPicker jkY;
  private NumberPicker jkZ;

  @Keep
  public AppBrandTimePicker(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, 2131493743));
    AppMethodBeat.i(126742);
    this.hUy = -1;
    this.hUz = -1;
    this.hUA = -1;
    this.hUB = -1;
    setIs24HourView(Boolean.TRUE);
    this.jkY = EL("mHourSpinner");
    this.jkZ = EL("mMinuteSpinner");
    com.tencent.mm.ui.widget.picker.e.c(this.jkY);
    com.tencent.mm.ui.widget.picker.e.c(this.jkZ);
    e.a(this.jkY);
    e.a(this.jkZ);
    paramContext = getResources().getDrawable(2130837797);
    com.tencent.mm.ui.widget.picker.e.a(this.jkY, paramContext);
    com.tencent.mm.ui.widget.picker.e.a(this.jkZ, paramContext);
    if (this.jkY != null)
      this.jkY.setOnValueChangedListener(new AppBrandTimePicker.1(this));
    if ((this.jkZ != null) && (Build.VERSION.SDK_INT >= 21))
      this.jkZ.setOnValueChangedListener(new NumberPicker.OnValueChangeListener()
      {
        public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
        {
        }
      });
    com.tencent.mm.ui.widget.picker.e.e(this.jkY);
    com.tencent.mm.ui.widget.picker.e.e(this.jkZ);
    AppMethodBeat.o(126742);
  }

  private NumberPicker EL(String paramString)
  {
    AppMethodBeat.i(126746);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramString = EN(paramString);
      AppMethodBeat.o(126746);
    }
    while (true)
    {
      return paramString;
      paramString = EM(paramString);
      AppMethodBeat.o(126746);
    }
  }

  private NumberPicker EM(String paramString)
  {
    AppMethodBeat.i(126747);
    try
    {
      c localc = new com/tencent/mm/compatible/loader/c;
      localc.<init>(this, paramString, null);
      paramString = (NumberPicker)localc.get();
      AppMethodBeat.o(126747);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        AppMethodBeat.o(126747);
        paramString = null;
      }
    }
  }

  private NumberPicker EN(String paramString)
  {
    AppMethodBeat.i(126748);
    try
    {
      Object localObject = new com/tencent/mm/compatible/loader/c;
      ((c)localObject).<init>(this, "mDelegate", null);
      localObject = ((c)localObject).get();
      if (localObject != null)
      {
        c localc = new com/tencent/mm/compatible/loader/c;
        localc.<init>(localObject, paramString, null);
        paramString = (NumberPicker)localc.get();
        AppMethodBeat.o(126748);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        AppMethodBeat.o(126748);
        paramString = null;
      }
    }
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

  public final void aRM()
  {
    AppMethodBeat.i(126743);
    if ((f.qS(this.hUy)) && (com.tencent.mm.ui.widget.picker.f.qR(this.hUz)) && (this.jkY != null) && (this.jkZ != null))
    {
      if (this.jkY.getValue() == this.hUy)
        this.jkZ.setMinValue(this.hUz);
    }
    else
    {
      if ((!f.qS(this.hUA)) || (this.jkY == null) || (this.jkZ == null))
        break label139;
      if (this.jkY.getValue() != this.hUA)
        break label130;
      this.jkZ.setMaxValue(this.hUB);
      AppMethodBeat.o(126743);
    }
    while (true)
    {
      return;
      this.jkZ.setMinValue(0);
      break;
      label130: this.jkZ.setMaxValue(59);
      label139: AppMethodBeat.o(126743);
    }
  }

  public final void b(d paramd)
  {
  }

  public final View getView()
  {
    return this;
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(126749);
    super.onAttachedToWindow();
    com.tencent.mm.ui.widget.picker.e.d(this.jkY);
    com.tencent.mm.ui.widget.picker.e.d(this.jkZ);
    AppMethodBeat.o(126749);
  }

  public final void setCurrentHour(Integer paramInteger)
  {
    AppMethodBeat.i(126745);
    if (paramInteger == null);
    for (int i = 0; ; i = paramInteger.intValue())
    {
      super.setCurrentHour(Integer.valueOf(i));
      aRM();
      AppMethodBeat.o(126745);
      return;
    }
  }

  public final void setCurrentMinute(Integer paramInteger)
  {
    AppMethodBeat.i(126744);
    if (paramInteger == null);
    for (int i = 0; ; i = paramInteger.intValue())
    {
      super.setCurrentMinute(Integer.valueOf(i));
      aRM();
      AppMethodBeat.o(126744);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Keep;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m.b;
import com.tencent.mm.ui.widget.picker.YADatePicker;
import com.tencent.mm.ui.widget.picker.YADatePicker.c;
import com.tencent.mm.ui.widget.picker.YADatePicker.d;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class AppBrandDatePicker extends YADatePicker
  implements b<String>
{
  private Date jkA;
  private final Calendar jkB;
  private final String[] jkC;
  public boolean jkt;
  public boolean jku;
  public boolean jkv;
  public NumberPicker jkw;
  public NumberPicker jkx;
  public NumberPicker jky;
  private Date jkz;

  @Keep
  public AppBrandDatePicker(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, 2131493743));
    AppMethodBeat.i(126690);
    this.jkt = true;
    this.jku = true;
    this.jkv = true;
    this.jkC = new String[12];
    for (int i = 0; i < this.jkC.length; i++)
      this.jkC[i] = (i + 1);
    this.jkB = Calendar.getInstance(Locale.US);
    setCalendarViewShown(false);
    setSpinnersShown(true);
    this.jkw = ((YADatePicker.c)getUIDelegate()).zSP;
    this.jkx = ((YADatePicker.c)getUIDelegate()).zSO;
    this.jky = ((YADatePicker.c)getUIDelegate()).zSN;
    paramContext = getResources().getDrawable(2130837797);
    com.tencent.mm.ui.widget.picker.e.a(this.jkw, paramContext);
    com.tencent.mm.ui.widget.picker.e.a(this.jkx, paramContext);
    com.tencent.mm.ui.widget.picker.e.a(this.jky, paramContext);
    com.tencent.mm.ui.widget.picker.e.c(this.jkw);
    com.tencent.mm.ui.widget.picker.e.c(this.jkx);
    com.tencent.mm.ui.widget.picker.e.c(this.jky);
    e.a(this.jkw);
    e.a(this.jkx);
    e.a(this.jky);
    paramContext = new AppBrandDatePicker.1(this);
    if (this.jkw != null)
    {
      this.jkw.setOnValueChangedListener(paramContext);
      this.jkw.setMinValue(1900);
    }
    if (this.jkx != null)
      this.jkx.setOnValueChangedListener(paramContext);
    if (this.jky != null)
      this.jky.setOnValueChangedListener(paramContext);
    aRJ();
    com.tencent.mm.ui.widget.picker.e.e(this.jkw);
    com.tencent.mm.ui.widget.picker.e.e(this.jkx);
    com.tencent.mm.ui.widget.picker.e.e(this.jky);
    AppMethodBeat.o(126690);
  }

  private void aRJ()
  {
    int i = 0;
    AppMethodBeat.i(126691);
    if ((this.jkw == null) || (this.jkx == null) || (this.jky == null))
    {
      AppMethodBeat.o(126691);
      return;
    }
    this.jkx.setDisplayedValues(null);
    if ((this.jkw.getValue() == this.jkw.getMaxValue()) && (this.jkA != null))
    {
      this.jkx.setMaxValue(this.jkA.getMonth());
      if ((this.jkx.getValue() != this.jkx.getMaxValue()) || (this.jkA == null))
        break label335;
      this.jky.setMaxValue(this.jkA.getDate());
      j = 1;
      label120: if (j == 0)
      {
        j = this.jkw.getValue();
        int k = this.jkx.getValue();
        this.jkB.set(j, k, 1);
        j = this.jkB.getActualMaximum(5);
        this.jky.setMaxValue(j);
      }
      if ((this.jkw.getValue() != this.jkw.getMinValue()) || (this.jkz == null))
        break label340;
      this.jkx.setMinValue(this.jkz.getMonth());
      j = i;
      if (this.jkx.getValue() == this.jkx.getMinValue())
      {
        j = i;
        if (this.jkz != null)
          this.jky.setMinValue(this.jkz.getDate());
      }
    }
    for (int j = 1; ; j = i)
    {
      if (j == 0)
        this.jky.setMinValue(1);
      this.jkx.setDisplayedValues((String[])Arrays.copyOfRange(this.jkC, this.jkx.getMinValue(), this.jkx.getMaxValue() + 1));
      this.jkw.setWrapSelectorWheel(true);
      this.jkx.setWrapSelectorWheel(true);
      this.jky.setWrapSelectorWheel(true);
      AppMethodBeat.o(126691);
      break;
      this.jkx.setMaxValue(11);
      label335: j = 0;
      break label120;
      label340: this.jkx.setMinValue(0);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
  {
    AppMethodBeat.i(126696);
    super.a(paramInt1, Math.max(paramInt2 - 1, 0), paramInt3, paramd);
    aRJ();
    AppMethodBeat.o(126696);
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(126695);
    aRJ();
    AppMethodBeat.o(126695);
  }

  public final void aEH()
  {
  }

  public final void aEI()
  {
  }

  public final void b(d paramd)
  {
  }

  public final int getDayOfMonth()
  {
    AppMethodBeat.i(126699);
    int i;
    if (this.jky != null)
    {
      i = this.jky.getValue();
      AppMethodBeat.o(126699);
    }
    while (true)
    {
      return i;
      i = super.getDayOfMonth();
      AppMethodBeat.o(126699);
    }
  }

  public final int getMonth()
  {
    AppMethodBeat.i(126698);
    if (this.jkx != null);
    for (int i = this.jkx.getValue() + 1; ; i = super.getMonth() + 1)
    {
      i = Math.max(Math.min(i, 12), 0);
      AppMethodBeat.o(126698);
      return i;
    }
  }

  public final View getView()
  {
    return this;
  }

  public final int getYear()
  {
    AppMethodBeat.i(126697);
    int i;
    if (this.jkw != null)
    {
      i = this.jkw.getValue();
      AppMethodBeat.o(126697);
    }
    while (true)
    {
      return i;
      i = super.getYear();
      AppMethodBeat.o(126697);
    }
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(126694);
    super.onAttachedToWindow();
    com.tencent.mm.ui.widget.picker.e.d(this.jkw);
    com.tencent.mm.ui.widget.picker.e.d(this.jkx);
    com.tencent.mm.ui.widget.picker.e.d(this.jky);
    AppMethodBeat.o(126694);
  }

  public final void setMaxDate(long paramLong)
  {
    AppMethodBeat.i(126692);
    super.setMaxDate(paramLong);
    this.jkA = new Date(paramLong);
    if (this.jkw != null)
      this.jkw.setMaxValue(this.jkA.getYear() + 1900);
    AppMethodBeat.o(126692);
  }

  public final void setMinDate(long paramLong)
  {
    AppMethodBeat.i(126693);
    super.setMinDate(paramLong);
    this.jkz = new Date(paramLong);
    if (this.jkw != null)
      this.jkw.setMinValue(this.jkz.getYear() + 1900);
    AppMethodBeat.o(126693);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePicker
 * JD-Core Version:    0.6.2
 */
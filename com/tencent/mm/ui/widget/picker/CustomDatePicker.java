package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CustomDatePicker extends YADatePicker
{
  private Date jkA;
  private Calendar jkB;
  private String[] jkC;
  public boolean jku;
  public boolean jkv;
  private NumberPicker jkw;
  private NumberPicker jkx;
  private NumberPicker jky;
  private Date jkz;

  public CustomDatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112782);
    this.jku = true;
    this.jkv = true;
    initView();
    AppMethodBeat.o(112782);
  }

  public CustomDatePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112783);
    this.jku = true;
    this.jkv = true;
    initView();
    AppMethodBeat.o(112783);
  }

  private void dLk()
  {
    AppMethodBeat.i(112785);
    Drawable localDrawable = getResources().getDrawable(2130839831);
    e.a(this.jkw, localDrawable);
    e.a(this.jkx, localDrawable);
    e.a(this.jky, localDrawable);
    AppMethodBeat.o(112785);
  }

  private void initView()
  {
    AppMethodBeat.i(112784);
    this.jkC = new String[12];
    for (int i = 0; i < this.jkC.length; i++)
      this.jkC[i] = (i + 1);
    this.jkB = Calendar.getInstance(Locale.US);
    setCalendarViewShown(false);
    setSpinnersShown(true);
    this.jkw = ((YADatePicker.c)getUIDelegate()).zSP;
    this.jkx = ((YADatePicker.c)getUIDelegate()).zSO;
    this.jky = ((YADatePicker.c)getUIDelegate()).zSN;
    dLk();
    e.c(this.jkw);
    e.c(this.jkx);
    e.c(this.jky);
    CustomDatePicker.1 local1 = new CustomDatePicker.1(this);
    if (this.jkw != null)
    {
      this.jkw.setOnValueChangedListener(local1);
      this.jkw.setMinValue(1900);
    }
    if (this.jkx != null)
      this.jkx.setOnValueChangedListener(local1);
    if (this.jky != null)
      this.jky.setOnValueChangedListener(local1);
    aRJ();
    e.e(this.jkw);
    e.e(this.jkx);
    e.e(this.jky);
    AppMethodBeat.o(112784);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
  {
    AppMethodBeat.i(112790);
    super.a(paramInt1, Math.max(paramInt2 - 1, 0), paramInt3, paramd);
    aRJ();
    AppMethodBeat.o(112790);
  }

  public final void aA(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112789);
    a(paramInt1, paramInt2, paramInt3, null);
    AppMethodBeat.o(112789);
  }

  final void aRJ()
  {
    int i = 0;
    AppMethodBeat.i(112786);
    if ((this.jkw == null) || (this.jkx == null) || (this.jky == null))
    {
      AppMethodBeat.o(112786);
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
        int k = this.jkw.getValue();
        j = this.jkx.getValue();
        this.jkB.set(k, j, 1);
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
      AppMethodBeat.o(112786);
      break;
      this.jkx.setMaxValue(11);
      label335: j = 0;
      break label120;
      label340: this.jkx.setMinValue(0);
    }
  }

  public final void al(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    AppMethodBeat.i(112795);
    this.jku = paramBoolean1;
    this.jkv = paramBoolean2;
    if (this.jkw != null)
    {
      this.jkw.setEnabled(true);
      this.jkw.setVisibility(0);
    }
    NumberPicker localNumberPicker;
    if (this.jkx != null)
    {
      this.jkx.setEnabled(paramBoolean1);
      localNumberPicker = this.jkx;
      if (paramBoolean1)
      {
        j = 0;
        localNumberPicker.setVisibility(j);
      }
    }
    else if (this.jky != null)
    {
      this.jky.setEnabled(paramBoolean2);
      localNumberPicker = this.jky;
      if (!paramBoolean2)
        break label123;
    }
    label123: for (int j = i; ; j = 8)
    {
      localNumberPicker.setVisibility(j);
      AppMethodBeat.o(112795);
      return;
      j = 8;
      break;
    }
  }

  public int getDayOfMonth()
  {
    AppMethodBeat.i(112793);
    int i;
    if (this.jky != null)
    {
      i = this.jky.getValue();
      AppMethodBeat.o(112793);
    }
    while (true)
    {
      return i;
      i = super.getDayOfMonth();
      AppMethodBeat.o(112793);
    }
  }

  public int getMonth()
  {
    AppMethodBeat.i(112792);
    if (this.jkx != null);
    for (int i = this.jkx.getValue() + 1; ; i = super.getMonth() + 1)
    {
      i = Math.max(Math.min(i, 12), 0);
      AppMethodBeat.o(112792);
      return i;
    }
  }

  public int getYear()
  {
    AppMethodBeat.i(112791);
    int i;
    if (this.jkw != null)
    {
      i = this.jkw.getValue();
      AppMethodBeat.o(112791);
    }
    while (true)
    {
      return i;
      i = super.getYear();
      AppMethodBeat.o(112791);
    }
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(112794);
    super.onAttachedToWindow();
    e.d(this.jkw);
    e.d(this.jkx);
    e.d(this.jky);
    AppMethodBeat.o(112794);
  }

  public void setMaxDate(long paramLong)
  {
    AppMethodBeat.i(112787);
    super.setMaxDate(paramLong);
    this.jkA = new Date(paramLong);
    if (this.jkw != null)
      this.jkw.setMaxValue(this.jkA.getYear() + 1900);
    aRJ();
    AppMethodBeat.o(112787);
  }

  public void setMinDate(long paramLong)
  {
    AppMethodBeat.i(112788);
    super.setMinDate(paramLong);
    this.jkz = new Date(paramLong);
    if (this.jkw != null)
      this.jkw.setMinValue(this.jkz.getYear() + 1900);
    AppMethodBeat.o(112788);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.CustomDatePicker
 * JD-Core Version:    0.6.2
 */
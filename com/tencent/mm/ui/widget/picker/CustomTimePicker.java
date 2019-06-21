package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.ai;

public class CustomTimePicker extends TimePicker
{
  public int hUA;
  public int hUB;
  public int hUy;
  public int hUz;
  public NumberPicker jkY;
  private NumberPicker jkZ;

  public CustomTimePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(new ContextThemeWrapper(paramContext, 2131493831), paramAttributeSet);
    AppMethodBeat.i(112798);
    this.hUy = -1;
    this.hUz = -1;
    this.hUA = -1;
    this.hUB = -1;
    initView();
    AppMethodBeat.o(112798);
  }

  public CustomTimePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112799);
    this.hUy = -1;
    this.hUz = -1;
    this.hUA = -1;
    this.hUB = -1;
    initView();
    AppMethodBeat.o(112799);
  }

  private NumberPicker EL(String paramString)
  {
    AppMethodBeat.i(112803);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramString = EN(paramString);
      AppMethodBeat.o(112803);
    }
    while (true)
    {
      return paramString;
      paramString = EM(paramString);
      AppMethodBeat.o(112803);
    }
  }

  private NumberPicker EM(String paramString)
  {
    AppMethodBeat.i(112804);
    try
    {
      ad localad = new com/tencent/mm/ui/ad;
      localad.<init>(this, paramString);
      paramString = (NumberPicker)localad.get();
      AppMethodBeat.o(112804);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(112804);
      }
    }
  }

  private NumberPicker EN(String paramString)
  {
    AppMethodBeat.i(112805);
    try
    {
      Object localObject = new com/tencent/mm/ui/ad;
      ((ad)localObject).<init>(this, "mDelegate");
      localObject = ((ad)localObject).get();
      if (localObject != null)
      {
        ad localad = new com/tencent/mm/ui/ad;
        localad.<init>(localObject, paramString);
        paramString = (NumberPicker)localad.get();
        AppMethodBeat.o(112805);
        return paramString;
      }
    }
    catch (NoSuchFieldException paramString)
    {
      while (true)
      {
        ai.printErrStackTrace("CustomTimePicker", paramString, "super_getNumberPickerApi21 NoSuchFieldException", new Object[0]);
        paramString = null;
        AppMethodBeat.o(112805);
      }
    }
    catch (IllegalAccessException paramString)
    {
      while (true)
        ai.printErrStackTrace("CustomTimePicker", paramString, "super_getNumberPickerApi21 IllegalAccessException", new Object[0]);
    }
  }

  private void dLk()
  {
    AppMethodBeat.i(112806);
    Drawable localDrawable = getResources().getDrawable(2130839831);
    e.a(this.jkY, localDrawable);
    e.a(this.jkZ, localDrawable);
    AppMethodBeat.o(112806);
  }

  private void initView()
  {
    AppMethodBeat.i(112800);
    setIs24HourView(Boolean.TRUE);
    this.jkY = EL("mHourSpinner");
    this.jkZ = EL("mMinuteSpinner");
    e.c(this.jkY);
    e.c(this.jkZ);
    dLk();
    if (this.jkY != null)
      this.jkY.setOnValueChangedListener(new CustomTimePicker.1(this));
    if ((this.jkZ != null) && (Build.VERSION.SDK_INT >= 21))
      this.jkZ.setOnValueChangedListener(new CustomTimePicker.2(this));
    e.e(this.jkY);
    e.e(this.jkZ);
    AppMethodBeat.o(112800);
  }

  public final void aRM()
  {
    AppMethodBeat.i(112801);
    if ((f.qS(this.hUy)) && (f.qR(this.hUz)) && (this.jkY != null) && (this.jkZ != null))
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
      AppMethodBeat.o(112801);
    }
    while (true)
    {
      return;
      this.jkZ.setMinValue(0);
      break;
      label130: this.jkZ.setMaxValue(59);
      label139: AppMethodBeat.o(112801);
    }
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(112802);
    super.onAttachedToWindow();
    e.d(this.jkY);
    e.d(this.jkZ);
    AppMethodBeat.o(112802);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.CustomTimePicker
 * JD-Core Version:    0.6.2
 */
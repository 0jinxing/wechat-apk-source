package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;

public class MMSpinnerDatePicker extends DatePicker
  implements DatePicker.OnDateChangedListener
{
  private NumberPicker zMD;
  private NumberPicker zME;
  private NumberPicker zMF;
  private MMSpinnerDatePicker.a zMG;
  private int zMH;

  public MMSpinnerDatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107914);
    this.zMH = 0;
    init();
    AppMethodBeat.o(107914);
  }

  public MMSpinnerDatePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107915);
    this.zMH = 0;
    init();
    AppMethodBeat.o(107915);
  }

  private void a(NumberPicker paramNumberPicker, int paramInt)
  {
    AppMethodBeat.i(107920);
    if (paramNumberPicker == null)
      AppMethodBeat.o(107920);
    while (true)
    {
      return;
      Object localObject = (EditText)paramNumberPicker.findViewById(Resources.getSystem().getIdentifier("numberpicker_input", "id", "android"));
      ((EditText)localObject).setTextSize(0, getResources().getDimension(paramInt));
      paramInt = (int)((EditText)localObject).getTextSize();
      try
      {
        localObject = NumberPicker.class.getDeclaredField("mTextSize");
        ((Field)localObject).setAccessible(true);
        ((Field)localObject).set(paramNumberPicker, Integer.valueOf(paramInt));
        localObject = NumberPicker.class.getDeclaredField("mSelectorWheelPaint");
        ((Field)localObject).setAccessible(true);
        Paint localPaint = (Paint)((Field)localObject).get(paramNumberPicker);
        localPaint.setTextSize(paramInt);
        ((Field)localObject).set(paramNumberPicker, localPaint);
        AppMethodBeat.o(107920);
      }
      catch (NoSuchFieldException paramNumberPicker)
      {
        ab.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", paramNumberPicker, "", new Object[0]);
        AppMethodBeat.o(107920);
      }
      catch (IllegalAccessException paramNumberPicker)
      {
        ab.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", paramNumberPicker, "", new Object[0]);
        AppMethodBeat.o(107920);
      }
    }
  }

  private void init()
  {
    AppMethodBeat.i(107916);
    setCalendarViewShown(false);
    Object localObject = Resources.getSystem();
    int i = ((Resources)localObject).getIdentifier("year", "id", "android");
    int j = ((Resources)localObject).getIdentifier("month", "id", "android");
    int k = ((Resources)localObject).getIdentifier("day", "id", "android");
    this.zMD = ((NumberPicker)findViewById(i));
    this.zME = ((NumberPicker)findViewById(j));
    this.zMF = ((NumberPicker)findViewById(k));
    localObject = getChildAt(0);
    ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
    localLayoutParams.width = -1;
    ((View)localObject).setLayoutParams(localLayoutParams);
    localObject = (LinearLayout.LayoutParams)this.zMD.getLayoutParams();
    ((LinearLayout.LayoutParams)localObject).topMargin = 0;
    ((LinearLayout.LayoutParams)localObject).bottomMargin = 0;
    ((LinearLayout.LayoutParams)localObject).leftMargin = 0;
    ((LinearLayout.LayoutParams)localObject).rightMargin = 0;
    ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
    this.zMD.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.zME.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.zMF.setLayoutParams((ViewGroup.LayoutParams)localObject);
    setDescendantFocusability(393216);
    setPickerMode(2);
    AppMethodBeat.o(107916);
  }

  public final boolean dKC()
  {
    boolean bool = true;
    AppMethodBeat.i(107918);
    try
    {
      Field localField = NumberPicker.class.getDeclaredField("mSelectionDivider");
      localField.setAccessible(true);
      ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
      localColorDrawable.<init>();
      localColorDrawable.setColor(getResources().getColor(2131690597));
      localField.set(this.zMD, localColorDrawable);
      localField.set(this.zME, localColorDrawable);
      localField.set(this.zMF, localColorDrawable);
      invalidate();
      AppMethodBeat.o(107918);
      return bool;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", localIllegalAccessException, "", new Object[0]);
        AppMethodBeat.o(107918);
        bool = false;
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", localNoSuchFieldException, "", new Object[0]);
    }
  }

  public int getPickerMode()
  {
    return this.zMH;
  }

  public void onDateChanged(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void setOnDateChangeListener(MMSpinnerDatePicker.a parama)
  {
    this.zMG = parama;
  }

  public void setPickerMode(int paramInt)
  {
    AppMethodBeat.i(107917);
    this.zMH = paramInt;
    if (this.zMH == 0)
    {
      this.zMD.setVisibility(0);
      this.zME.setVisibility(0);
      this.zMF.setVisibility(0);
      AppMethodBeat.o(107917);
    }
    while (true)
    {
      return;
      if (this.zMH == 1)
      {
        this.zMD.setVisibility(0);
        this.zME.setVisibility(0);
        this.zMF.setVisibility(8);
        AppMethodBeat.o(107917);
      }
      else
      {
        this.zMD.setVisibility(0);
        this.zME.setVisibility(8);
        this.zMF.setVisibility(8);
        AppMethodBeat.o(107917);
      }
    }
  }

  public void setTextSize(int paramInt)
  {
    AppMethodBeat.i(107919);
    a(this.zMD, paramInt);
    a(this.zME, paramInt);
    a(this.zMF, paramInt);
    AppMethodBeat.o(107919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMSpinnerDatePicker
 * JD-Core Version:    0.6.2
 */
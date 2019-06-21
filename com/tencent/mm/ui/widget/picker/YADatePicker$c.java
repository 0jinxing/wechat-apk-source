package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cg.a.a;
import com.tencent.mm.ui.ai;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public final class YADatePicker$c extends YADatePicker.a
{
  Calendar jkB;
  private String[] jkC;
  public final NumberPicker zSN;
  public final NumberPicker zSO;
  public final NumberPicker zSP;
  private final LinearLayout zSQ;
  private final EditText zSR;
  private final EditText zSS;
  private final EditText zST;
  private final CalendarView zSU;
  private final java.text.DateFormat zSV;
  private int zSW;
  private Calendar zSX;
  private Calendar zSY;
  Calendar zSZ;
  private boolean zTa;

  YADatePicker$c(YADatePicker paramYADatePicker, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramYADatePicker, paramContext);
    AppMethodBeat.i(112872);
    this.zSV = new SimpleDateFormat("MM/dd/yyyy");
    this.zTa = true;
    this.zSJ = paramYADatePicker;
    this.mContext = paramContext;
    f(Locale.getDefault());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.DatePicker, paramInt, 0);
    boolean bool1 = localTypedArray.getBoolean(3, true);
    boolean bool2 = localTypedArray.getBoolean(4, true);
    int i = localTypedArray.getInt(13, 1900);
    paramInt = localTypedArray.getInt(14, 2100);
    paramYADatePicker = localTypedArray.getString(1);
    paramAttributeSet = localTypedArray.getString(2);
    int j = localTypedArray.getResourceId(6, 2130969261);
    localTypedArray.recycle();
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(j, this.zSJ, true);
    paramContext = new YADatePicker.c.1(this);
    this.zSQ = ((LinearLayout)this.zSJ.findViewById(2131823191));
    this.zSU = ((CalendarView)this.zSJ.findViewById(2131823195));
    this.zSU.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
    {
      public final void onSelectedDayChange(CalendarView paramAnonymousCalendarView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(112871);
        YADatePicker.c.this.aE(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
        YADatePicker.c.this.dLs();
        YADatePicker.c.b(YADatePicker.c.this);
        AppMethodBeat.o(112871);
      }
    });
    this.zSN = ((NumberPicker)this.zSJ.findViewById(2131823193));
    this.zSN.setFormatter(new g());
    this.zSN.setOnLongPressUpdateInterval(100L);
    this.zSN.setOnValueChangedListener(paramContext);
    this.zSR = e.b(this.zSN);
    this.zSO = ((NumberPicker)this.zSJ.findViewById(2131823192));
    this.zSO.setMinValue(0);
    this.zSO.setMaxValue(this.zSW - 1);
    this.zSO.setDisplayedValues(this.jkC);
    this.zSO.setOnLongPressUpdateInterval(200L);
    this.zSO.setOnValueChangedListener(paramContext);
    this.zSS = e.b(this.zSO);
    this.zSP = ((NumberPicker)this.zSJ.findViewById(2131823194));
    this.zSP.setOnLongPressUpdateInterval(100L);
    this.zSP.setOnValueChangedListener(paramContext);
    this.zST = e.b(this.zSP);
    if ((!bool1) && (!bool2))
      setSpinnersShown(true);
    while (true)
    {
      this.jkB.clear();
      if ((TextUtils.isEmpty(paramYADatePicker)) || (!a(paramYADatePicker, this.jkB)))
        this.jkB.set(i, 0, 1);
      setMinDate(this.jkB.getTimeInMillis());
      this.jkB.clear();
      if ((TextUtils.isEmpty(paramAttributeSet)) || (!a(paramAttributeSet, this.jkB)))
        this.jkB.set(paramInt, 11, 31);
      setMaxDate(this.jkB.getTimeInMillis());
      this.zSZ.setTimeInMillis(System.currentTimeMillis());
      a(this.zSZ.get(1), this.zSZ.get(2), this.zSZ.get(5), null);
      dLr();
      if (this.zSJ.getImportantForAccessibility() == 0)
        this.zSJ.setImportantForAccessibility(1);
      AppMethodBeat.o(112872);
      return;
      setSpinnersShown(bool1);
      setCalendarViewShown(bool2);
    }
  }

  private static Calendar a(Calendar paramCalendar, Locale paramLocale)
  {
    AppMethodBeat.i(112895);
    if (paramCalendar == null)
    {
      paramCalendar = Calendar.getInstance(paramLocale);
      AppMethodBeat.o(112895);
    }
    while (true)
    {
      return paramCalendar;
      long l = paramCalendar.getTimeInMillis();
      paramCalendar = Calendar.getInstance(paramLocale);
      paramCalendar.setTimeInMillis(l);
      AppMethodBeat.o(112895);
    }
  }

  private static void a(NumberPicker paramNumberPicker, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112901);
    if (paramInt2 < paramInt1 - 1);
    for (paramInt1 = 5; ; paramInt1 = 6)
    {
      paramNumberPicker = e.b(paramNumberPicker);
      if (paramNumberPicker != null)
        paramNumberPicker.setImeOptions(paramInt1);
      AppMethodBeat.o(112901);
      return;
    }
  }

  private boolean a(String paramString, Calendar paramCalendar)
  {
    boolean bool = false;
    AppMethodBeat.i(112897);
    try
    {
      paramCalendar.setTime(this.zSV.parse(paramString));
      bool = true;
      AppMethodBeat.o(112897);
      return bool;
    }
    catch (ParseException paramCalendar)
    {
      while (true)
      {
        ai.w(YADatePicker.access$1100(), "Date: " + paramString + " not in format: MM/dd/yyyy", new Object[0]);
        AppMethodBeat.o(112897);
      }
    }
  }

  private boolean dLq()
  {
    AppMethodBeat.i(112894);
    boolean bool = Character.isDigit(this.jkC[0].charAt(0));
    AppMethodBeat.o(112894);
    return bool;
  }

  private void dLr()
  {
    AppMethodBeat.i(112896);
    this.zSQ.removeAllViews();
    Object localObject;
    if ((Build.VERSION.SDK_INT < 17) || (this.zSJ.getLayoutDirection() == 0))
    {
      localObject = new char[3];
      Object tmp36_35 = localObject;
      tmp36_35[0] = 121;
      Object tmp42_36 = tmp36_35;
      tmp42_36[1] = 77;
      Object tmp48_42 = tmp42_36;
      tmp48_42[2] = 100;
      tmp48_42;
    }
    int i;
    int j;
    while (true)
    {
      i = localObject.length;
      j = 0;
      if (j >= i)
        break;
      switch (localObject[j])
      {
      default:
        localObject = new IllegalArgumentException(Arrays.toString((char[])localObject));
        AppMethodBeat.o(112896);
        throw ((Throwable)localObject);
        localObject = android.text.format.DateFormat.getDateFormatOrder(this.zSJ.getContext());
      case 'd':
      case 'M':
      case 'y':
      }
    }
    this.zSQ.addView(this.zSN);
    a(this.zSN, i, j);
    while (true)
    {
      j++;
      break;
      this.zSQ.addView(this.zSO);
      a(this.zSO, i, j);
      continue;
      this.zSQ.addView(this.zSP);
      a(this.zSP, i, j);
    }
    AppMethodBeat.o(112896);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
  {
    AppMethodBeat.i(112873);
    aE(paramInt1, paramInt2, paramInt3);
    dLs();
    dLt();
    this.zSL = paramd;
    AppMethodBeat.o(112873);
  }

  final void aE(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112898);
    this.zSZ.set(paramInt1, paramInt2, paramInt3);
    if (this.zSZ.before(this.zSX))
    {
      this.zSZ.setTimeInMillis(this.zSX.getTimeInMillis());
      AppMethodBeat.o(112898);
    }
    while (true)
    {
      return;
      if (this.zSZ.after(this.zSY))
        this.zSZ.setTimeInMillis(this.zSY.getTimeInMillis());
      AppMethodBeat.o(112898);
    }
  }

  public final Parcelable d(Parcelable paramParcelable)
  {
    AppMethodBeat.i(112889);
    paramParcelable = new YADatePicker.SavedState(paramParcelable, getYear(), getMonth(), getDayOfMonth(), (byte)0);
    AppMethodBeat.o(112889);
    return paramParcelable;
  }

  public final Calendar dLo()
  {
    AppMethodBeat.i(112879);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(this.zSU.getMinDate());
    AppMethodBeat.o(112879);
    return localCalendar;
  }

  public final Calendar dLp()
  {
    AppMethodBeat.i(112881);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(this.zSU.getMaxDate());
    AppMethodBeat.o(112881);
    return localCalendar;
  }

  final void dLs()
  {
    AppMethodBeat.i(112899);
    if (this.zSZ.equals(this.zSX))
    {
      this.zSN.setMinValue(this.zSZ.get(5));
      this.zSN.setMaxValue(this.zSZ.getActualMaximum(5));
      this.zSN.setWrapSelectorWheel(false);
      this.zSO.setDisplayedValues(null);
      this.zSO.setMinValue(this.zSZ.get(2));
      this.zSO.setMaxValue(this.zSZ.getActualMaximum(2));
      this.zSO.setWrapSelectorWheel(false);
    }
    while (true)
    {
      String[] arrayOfString = (String[])Arrays.copyOfRange(this.jkC, this.zSO.getMinValue(), this.zSO.getMaxValue() + 1);
      this.zSO.setDisplayedValues(arrayOfString);
      this.zSP.setMinValue(this.zSX.get(1));
      this.zSP.setMaxValue(this.zSY.get(1));
      this.zSP.setWrapSelectorWheel(false);
      this.zSP.setValue(this.zSZ.get(1));
      this.zSO.setValue(this.zSZ.get(2));
      this.zSN.setValue(this.zSZ.get(5));
      if (dLq())
        this.zSS.setRawInputType(2);
      AppMethodBeat.o(112899);
      return;
      if (this.zSZ.equals(this.zSY))
      {
        this.zSN.setMinValue(this.zSZ.getActualMinimum(5));
        this.zSN.setMaxValue(this.zSZ.get(5));
        this.zSN.setWrapSelectorWheel(false);
        this.zSO.setDisplayedValues(null);
        this.zSO.setMinValue(this.zSZ.getActualMinimum(2));
        this.zSO.setMaxValue(this.zSZ.get(2));
        this.zSO.setWrapSelectorWheel(false);
      }
      else
      {
        this.zSN.setMinValue(1);
        this.zSN.setMaxValue(this.zSZ.getActualMaximum(5));
        this.zSN.setWrapSelectorWheel(true);
        this.zSO.setDisplayedValues(null);
        this.zSO.setMinValue(0);
        this.zSO.setMaxValue(11);
        this.zSO.setWrapSelectorWheel(true);
      }
    }
  }

  final void dLt()
  {
    AppMethodBeat.i(112900);
    this.zSU.setDate(this.zSZ.getTimeInMillis(), false, false);
    AppMethodBeat.o(112900);
  }

  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(112891);
    onPopulateAccessibilityEvent(paramAccessibilityEvent);
    AppMethodBeat.o(112891);
    return true;
  }

  protected final void f(Locale paramLocale)
  {
    AppMethodBeat.i(112893);
    super.f(paramLocale);
    this.jkB = a(this.jkB, paramLocale);
    this.zSX = a(this.zSX, paramLocale);
    this.zSY = a(this.zSY, paramLocale);
    this.zSZ = a(this.zSZ, paramLocale);
    this.zSW = (this.jkB.getActualMaximum(2) + 1);
    this.jkC = new DateFormatSymbols().getShortMonths();
    if (dLq())
    {
      this.jkC = new String[this.zSW];
      for (int i = 0; i < this.zSW; i++)
        this.jkC[i] = String.format("%d", new Object[] { Integer.valueOf(i + 1) });
    }
    AppMethodBeat.o(112893);
  }

  public final CalendarView getCalendarView()
  {
    return this.zSU;
  }

  public final boolean getCalendarViewShown()
  {
    AppMethodBeat.i(112884);
    boolean bool;
    if (this.zSU.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(112884);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112884);
    }
  }

  public final int getDayOfMonth()
  {
    AppMethodBeat.i(112876);
    int i = this.zSZ.get(5);
    AppMethodBeat.o(112876);
    return i;
  }

  public final int getFirstDayOfWeek()
  {
    AppMethodBeat.i(112877);
    int i = this.zSU.getFirstDayOfWeek();
    AppMethodBeat.o(112877);
    return i;
  }

  public final int getMonth()
  {
    AppMethodBeat.i(112875);
    int i = this.zSZ.get(2);
    AppMethodBeat.o(112875);
    return i;
  }

  public final boolean getSpinnersShown()
  {
    AppMethodBeat.i(112886);
    boolean bool = this.zSQ.isShown();
    AppMethodBeat.o(112886);
    return bool;
  }

  public final int getYear()
  {
    AppMethodBeat.i(112874);
    int i = this.zSZ.get(1);
    AppMethodBeat.o(112874);
    return i;
  }

  public final boolean isEnabled()
  {
    return this.zTa;
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(112888);
    f(paramConfiguration.locale);
    AppMethodBeat.o(112888);
  }

  public final void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(112892);
    String str = DateUtils.formatDateTime(this.mContext, this.zSZ.getTimeInMillis(), 20);
    paramAccessibilityEvent.getText().add(str);
    AppMethodBeat.o(112892);
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(112890);
    paramParcelable = (YADatePicker.SavedState)paramParcelable;
    aE(YADatePicker.SavedState.a(paramParcelable), YADatePicker.SavedState.b(paramParcelable), YADatePicker.SavedState.c(paramParcelable));
    dLs();
    dLt();
    AppMethodBeat.o(112890);
  }

  public final void setCalendarViewShown(boolean paramBoolean)
  {
    AppMethodBeat.i(112885);
    CalendarView localCalendarView = this.zSU;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localCalendarView.setVisibility(i);
      AppMethodBeat.o(112885);
      return;
    }
  }

  public final void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(112883);
    this.zSN.setEnabled(paramBoolean);
    this.zSO.setEnabled(paramBoolean);
    this.zSP.setEnabled(paramBoolean);
    this.zSU.setEnabled(paramBoolean);
    this.zTa = paramBoolean;
    AppMethodBeat.o(112883);
  }

  public final void setFirstDayOfWeek(int paramInt)
  {
    AppMethodBeat.i(112878);
    this.zSU.setFirstDayOfWeek(paramInt);
    AppMethodBeat.o(112878);
  }

  public final void setMaxDate(long paramLong)
  {
    AppMethodBeat.i(112882);
    this.jkB.setTimeInMillis(paramLong);
    if ((this.jkB.get(1) == this.zSY.get(1)) && (this.jkB.get(6) != this.zSY.get(6)))
      AppMethodBeat.o(112882);
    while (true)
    {
      return;
      this.zSY.setTimeInMillis(paramLong);
      this.zSU.setMaxDate(paramLong);
      if (this.zSZ.after(this.zSY))
      {
        this.zSZ.setTimeInMillis(this.zSY.getTimeInMillis());
        dLt();
      }
      dLs();
      AppMethodBeat.o(112882);
    }
  }

  public final void setMinDate(long paramLong)
  {
    AppMethodBeat.i(112880);
    this.jkB.setTimeInMillis(paramLong);
    if ((this.jkB.get(1) == this.zSX.get(1)) && (this.jkB.get(6) != this.zSX.get(6)))
      AppMethodBeat.o(112880);
    while (true)
    {
      return;
      this.zSX.setTimeInMillis(paramLong);
      this.zSU.setMinDate(paramLong);
      if (this.zSZ.before(this.zSX))
      {
        this.zSZ.setTimeInMillis(this.zSX.getTimeInMillis());
        dLt();
      }
      dLs();
      AppMethodBeat.o(112880);
    }
  }

  public final void setSpinnersShown(boolean paramBoolean)
  {
    AppMethodBeat.i(112887);
    LinearLayout localLinearLayout = this.zSQ;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localLinearLayout.setVisibility(i);
      AppMethodBeat.o(112887);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.YADatePicker.c
 * JD-Core Version:    0.6.2
 */
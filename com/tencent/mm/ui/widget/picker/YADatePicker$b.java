package com.tencent.mm.ui.widget.picker;

import android.content.res.Configuration;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CalendarView;
import java.util.Calendar;

public abstract interface YADatePicker$b
{
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd);

  public abstract Parcelable d(Parcelable paramParcelable);

  public abstract Calendar dLo();

  public abstract Calendar dLp();

  public abstract boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);

  public abstract CalendarView getCalendarView();

  public abstract boolean getCalendarViewShown();

  public abstract int getDayOfMonth();

  public abstract int getFirstDayOfWeek();

  public abstract int getMonth();

  public abstract boolean getSpinnersShown();

  public abstract int getYear();

  public abstract boolean isEnabled();

  public abstract void onConfigurationChanged(Configuration paramConfiguration);

  public abstract void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);

  public abstract void onRestoreInstanceState(Parcelable paramParcelable);

  public abstract void setCalendarViewShown(boolean paramBoolean);

  public abstract void setEnabled(boolean paramBoolean);

  public abstract void setFirstDayOfWeek(int paramInt);

  public abstract void setMaxDate(long paramLong);

  public abstract void setMinDate(long paramLong);

  public abstract void setSpinnersShown(boolean paramBoolean);

  public abstract void setValidationCallback(YADatePicker.e parame);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.YADatePicker.b
 * JD-Core Version:    0.6.2
 */
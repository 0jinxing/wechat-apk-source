package com.tencent.mm.ui.widget;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.DatePicker;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends DatePickerDialog
{
  private boolean zMe = true;
  private long zMf;
  private int zMg;

  public e(Context paramContext, DatePickerDialog.OnDateSetListener paramOnDateSetListener, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    super(paramContext, 3, paramOnDateSetListener, paramInt1, paramInt2, paramInt3);
    this.zMf = paramLong;
    this.zMg = 1;
  }

  public e(Context paramContext, DatePickerDialog.OnDateSetListener paramOnDateSetListener, int paramInt1, int paramInt2, int paramInt3, long paramLong, byte paramByte)
  {
    super(paramContext, 3, paramOnDateSetListener, paramInt1, paramInt2, paramInt3);
    this.zMf = paramLong;
    this.zMg = 1;
  }

  private void hA(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107867);
    if (this.zMg > 1)
      setTitle(getContext().getString(2131300016, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2 + 1) }));
    AppMethodBeat.o(107867);
  }

  public final void nw(long paramLong)
  {
    AppMethodBeat.i(107868);
    getDatePicker().setMaxDate(paramLong);
    AppMethodBeat.o(107868);
  }

  public final void nx(long paramLong)
  {
    AppMethodBeat.i(107869);
    getDatePicker().setMinDate(paramLong);
    AppMethodBeat.o(107869);
  }

  public final void onDateChanged(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(107866);
    super.onDateChanged(paramDatePicker, paramInt1, paramInt2, paramInt3);
    hA(paramInt1, paramInt2);
    AppMethodBeat.o(107866);
  }

  @SuppressLint({"DefaultLocale"})
  public final void show()
  {
    int i = 1;
    AppMethodBeat.i(107865);
    super.show();
    Object localObject;
    if (this.zMe)
    {
      if (Build.VERSION.SDK_INT < 11)
        break label107;
      localObject = new e.a(this).x((ViewGroup)getWindow().getDecorView());
      if ((localObject != null) && (this.zMg > 1))
        ((View)localObject).setVisibility(8);
    }
    label107: label244: 
    while (true)
    {
      i = getDatePicker().getYear();
      int j = getDatePicker().getMonth();
      getDatePicker().getDayOfMonth();
      hA(i, j);
      this.zMe = false;
      AppMethodBeat.o(107865);
      return;
      String str = Settings.System.getString(getContext().getContentResolver(), "date_format");
      localObject = str;
      if (str != null)
        localObject = str.toLowerCase();
      if (("dd/mm/yyyy".equals(localObject)) || ("dd-mm-yyyy".equals(localObject)))
        j = 0;
      while (true)
      {
        if (j == -1)
          break label244;
        localObject = new e.b(this).e((ViewGroup)getWindow().getDecorView(), j);
        if (localObject == null)
          break;
        ((View)localObject).setVisibility(8);
        break;
        j = i;
        if (!"mm/dd/yyyy".equals(localObject))
        {
          j = i;
          if (!"mm-dd-yyyy".equals(localObject))
            if (("yyyy/mm/dd".equals(localObject)) || ("yyyy-mm-dd".equals(localObject)))
              j = 2;
            else
              j = -1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.e
 * JD-Core Version:    0.6.2
 */
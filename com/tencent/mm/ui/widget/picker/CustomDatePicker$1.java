package com.tencent.mm.ui.widget.picker;

import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CustomDatePicker$1
  implements NumberPicker.OnValueChangeListener
{
  CustomDatePicker$1(CustomDatePicker paramCustomDatePicker)
  {
  }

  public final void onValueChange(NumberPicker paramNumberPicker, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112781);
    CustomDatePicker.a(this.zSg);
    AppMethodBeat.o(112781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.CustomDatePicker.1
 * JD-Core Version:    0.6.2
 */
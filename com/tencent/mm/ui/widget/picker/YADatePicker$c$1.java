package com.tencent.mm.ui.widget.picker;

import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Calendar;

final class YADatePicker$c$1
  implements NumberPicker.OnValueChangeListener
{
  YADatePicker$c$1(YADatePicker.c paramc)
  {
  }

  public final void onValueChange(NumberPicker paramNumberPicker, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112870);
    YADatePicker.c.a(this.zTb);
    this.zTb.jkB.setTimeInMillis(this.zTb.zSZ.getTimeInMillis());
    int i;
    if (paramNumberPicker == this.zTb.zSN)
    {
      i = this.zTb.jkB.getActualMaximum(5);
      if ((paramInt1 == i) && (paramInt2 == 1))
        this.zTb.jkB.add(5, 1);
    }
    while (true)
    {
      this.zTb.aE(this.zTb.jkB.get(1), this.zTb.jkB.get(2), this.zTb.jkB.get(5));
      this.zTb.dLs();
      this.zTb.dLt();
      YADatePicker.c.b(this.zTb);
      AppMethodBeat.o(112870);
      return;
      if ((paramInt1 == 1) && (paramInt2 == i))
      {
        this.zTb.jkB.add(5, -1);
      }
      else
      {
        this.zTb.jkB.add(5, paramInt2 - paramInt1);
        continue;
        if (paramNumberPicker == this.zTb.zSO)
        {
          if ((paramInt1 == 11) && (paramInt2 == 0))
            this.zTb.jkB.add(2, 1);
          else if ((paramInt1 == 0) && (paramInt2 == 11))
            this.zTb.jkB.add(2, -1);
          else
            this.zTb.jkB.add(2, paramInt2 - paramInt1);
        }
        else
        {
          if (paramNumberPicker != this.zTb.zSP)
            break;
          this.zTb.jkB.set(1, paramInt2);
        }
      }
    }
    paramNumberPicker = new IllegalArgumentException();
    AppMethodBeat.o(112870);
    throw paramNumberPicker;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.YADatePicker.c.1
 * JD-Core Version:    0.6.2
 */
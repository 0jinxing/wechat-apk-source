package com.tencent.mm.ui.chatting.view;

import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.picker.OptionPicker;
import java.util.Calendar;

final class b$2
  implements NumberPicker.OnValueChangeListener
{
  b$2(b paramb)
  {
  }

  public final void onValueChange(NumberPicker paramNumberPicker, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32777);
    ab.d("MicroMsg.MMRemindDatePicker", "[onValueChange] oldVal:%s newVal:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.zba.zaV.setOptionsArray(this.zba.Pk(paramInt2));
    paramInt1 = Calendar.getInstance().get(11);
    if (paramInt2 == 0)
    {
      this.zba.zaV.setValue(0);
      AppMethodBeat.o(32777);
    }
    while (true)
    {
      return;
      this.zba.zaV.setValue(paramInt1);
      AppMethodBeat.o(32777);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.view.b.2
 * JD-Core Version:    0.6.2
 */
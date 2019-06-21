package com.tencent.mm.ui.tools;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TextView;
import android.widget.TimePicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;

final class HardCoderSettingUI$5
  implements TimePickerDialog.OnTimeSetListener
{
  HardCoderSettingUI$5(HardCoderSettingUI paramHardCoderSettingUI)
  {
  }

  public final void onTimeSet(TimePicker paramTimePicker, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34874);
    if (HardCoderSettingUI.s(this.zER))
    {
      WXHardCoderJNI.hcBeginTimeHour = paramInt1;
      WXHardCoderJNI.hcBeginTimeMin = paramInt2;
      HardCoderSettingUI.t(this.zER).setText(HardCoderSettingUI.h(this.zER, WXHardCoderJNI.hcBeginTimeHour, WXHardCoderJNI.hcBeginTimeMin));
      AppMethodBeat.o(34874);
    }
    while (true)
    {
      return;
      WXHardCoderJNI.hcEndTimeHour = paramInt1;
      WXHardCoderJNI.hcEndTimeMin = paramInt2;
      HardCoderSettingUI.u(this.zER).setText(HardCoderSettingUI.h(this.zER, WXHardCoderJNI.hcEndTimeHour, WXHardCoderJNI.hcEndTimeMin));
      AppMethodBeat.o(34874);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.HardCoderSettingUI.5
 * JD-Core Version:    0.6.2
 */
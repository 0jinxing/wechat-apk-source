package com.tencent.mm.plugin.setting.ui.fixtools;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FixToolsUplogUI$1
  implements DatePickerDialog.OnDateSetListener
{
  FixToolsUplogUI$1(FixToolsUplogUI paramFixToolsUplogUI, int paramInt, long paramLong)
  {
  }

  public final void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(126894);
    switch (this.val$id)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(126894);
      return;
      paramDatePicker = new StringBuffer().append(String.format("%02d", new Object[] { Integer.valueOf(paramInt1) })).append(".").append(String.format("%02d", new Object[] { Integer.valueOf(paramInt2 + 1) })).append(".").append(String.format("%02d", new Object[] { Integer.valueOf(paramInt3) }));
      FixToolsUplogUI.a(this.qkt).setText(paramDatePicker);
      FixToolsUplogUI.Wv(String.format("%02d", new Object[] { Integer.valueOf(paramInt1) }) + String.format("%02d", new Object[] { Integer.valueOf(paramInt2 + 1) }) + String.format("%02d", new Object[] { Integer.valueOf(paramInt3) }));
      ab.i("MicroMsg.FixToolsUplogUI", "uplog choose time maxTime[%d], date[%s]", new Object[] { Long.valueOf(this.qks), FixToolsUplogUI.access$100() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.1
 * JD-Core Version:    0.6.2
 */
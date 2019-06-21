package com.tencent.mm.chatroom.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

final class SelectDateUI$1$1
  implements Runnable
{
  SelectDateUI$1$1(SelectDateUI.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104379);
    DayPickerView localDayPickerView = SelectDateUI.c(this.ems.emr);
    long l;
    if (SelectDateUI.b(this.ems.emr) == -1L)
    {
      l = System.currentTimeMillis() * 1000L;
      localDayPickerView.setBeginDate(l);
      SelectDateUI.c(this.ems.emr).a(this.ems.emr, SelectDateUI.d(this.ems.emr).values());
      if (SelectDateUI.d(this.ems.emr).size() != 0)
        break label169;
      SelectDateUI.e(this.ems.emr).setVisibility(0);
      SelectDateUI.c(this.ems.emr).setVisibility(8);
      SelectDateUI.e(this.ems.emr).setText(this.ems.emr.getString(2131298210));
      AppMethodBeat.o(104379);
    }
    while (true)
    {
      return;
      l = SelectDateUI.b(this.ems.emr);
      break;
      label169: SelectDateUI.e(this.ems.emr).setVisibility(8);
      SelectDateUI.c(this.ems.emr).setVisibility(0);
      AppMethodBeat.o(104379);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectDateUI.1.1
 * JD-Core Version:    0.6.2
 */
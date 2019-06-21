package com.tencent.ttpic.logic.watermark;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LogicDataManager$51
  implements LogicDataManager.LogicValueProvider
{
  LogicDataManager$51(LogicDataManager paramLogicDataManager)
  {
  }

  public String getValue()
  {
    AppMethodBeat.i(83318);
    String str;
    if ((!TextUtils.isEmpty(LogicDataManager.access$3900(this.this$0))) && (LogicDataManager.access$3900(this.this$0).length() > 0))
    {
      str = LogicDataManager.access$3900(this.this$0).substring(0, 1);
      AppMethodBeat.o(83318);
    }
    while (true)
    {
      return str;
      str = LogicDataManager.access$300(this.this$0, 0);
      AppMethodBeat.o(83318);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager.51
 * JD-Core Version:    0.6.2
 */
package com.tencent.ttpic.logic.watermark;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LogicDataManager$57
  implements LogicDataManager.LogicValueProvider
{
  LogicDataManager$57(LogicDataManager paramLogicDataManager)
  {
  }

  public String getValue()
  {
    AppMethodBeat.i(83324);
    String str;
    if ((!TextUtils.isEmpty(LogicDataManager.access$3900(this.this$0))) && (LogicDataManager.access$3900(this.this$0).length() > 8))
    {
      str = LogicDataManager.access$3900(this.this$0).substring(8, 9);
      AppMethodBeat.o(83324);
    }
    while (true)
    {
      return str;
      str = LogicDataManager.access$1300(this.this$0, 0);
      AppMethodBeat.o(83324);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager.57
 * JD-Core Version:    0.6.2
 */
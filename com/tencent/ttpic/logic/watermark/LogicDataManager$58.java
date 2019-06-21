package com.tencent.ttpic.logic.watermark;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LogicDataManager$58
  implements LogicDataManager.LogicValueProvider
{
  LogicDataManager$58(LogicDataManager paramLogicDataManager)
  {
  }

  public String getValue()
  {
    AppMethodBeat.i(83325);
    String str;
    if ((!TextUtils.isEmpty(LogicDataManager.access$3900(this.this$0))) && (LogicDataManager.access$3900(this.this$0).length() > 9))
    {
      str = LogicDataManager.access$3900(this.this$0).substring(9, 10);
      AppMethodBeat.o(83325);
    }
    while (true)
    {
      return str;
      str = LogicDataManager.access$1300(this.this$0, 1);
      AppMethodBeat.o(83325);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager.58
 * JD-Core Version:    0.6.2
 */
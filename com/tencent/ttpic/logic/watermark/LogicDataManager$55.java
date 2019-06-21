package com.tencent.ttpic.logic.watermark;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LogicDataManager$55
  implements LogicDataManager.LogicValueProvider
{
  LogicDataManager$55(LogicDataManager paramLogicDataManager)
  {
  }

  public String getValue()
  {
    AppMethodBeat.i(83322);
    String str;
    if ((!TextUtils.isEmpty(LogicDataManager.access$3900(this.this$0))) && (LogicDataManager.access$3900(this.this$0).length() > 5))
    {
      str = LogicDataManager.access$3900(this.this$0).substring(5, 6);
      AppMethodBeat.o(83322);
    }
    while (true)
    {
      return str;
      str = LogicDataManager.access$800(this.this$0, 0);
      AppMethodBeat.o(83322);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager.55
 * JD-Core Version:    0.6.2
 */
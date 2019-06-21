package com.tencent.ttpic.logic.watermark;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LogicDataManager$52
  implements LogicDataManager.LogicValueProvider
{
  LogicDataManager$52(LogicDataManager paramLogicDataManager)
  {
  }

  public String getValue()
  {
    AppMethodBeat.i(83319);
    String str;
    if ((!TextUtils.isEmpty(LogicDataManager.access$3900(this.this$0))) && (LogicDataManager.access$3900(this.this$0).length() > 1))
    {
      str = LogicDataManager.access$3900(this.this$0).substring(1, 2);
      AppMethodBeat.o(83319);
    }
    while (true)
    {
      return str;
      str = LogicDataManager.access$300(this.this$0, 1);
      AppMethodBeat.o(83319);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager.52
 * JD-Core Version:    0.6.2
 */
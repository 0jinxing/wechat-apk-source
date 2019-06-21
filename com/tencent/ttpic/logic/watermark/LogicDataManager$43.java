package com.tencent.ttpic.logic.watermark;

import com.tencent.matrix.trace.core.AppMethodBeat;

class LogicDataManager$43
  implements LogicDataManager.LogicValueProvider
{
  LogicDataManager$43(LogicDataManager paramLogicDataManager)
  {
  }

  public String getValue()
  {
    AppMethodBeat.i(83309);
    String str;
    if (LogicDataManager.access$3200(this.this$0) == null)
    {
      str = "这里";
      AppMethodBeat.o(83309);
    }
    while (true)
    {
      return str;
      str = LogicDataManager.access$3200(this.this$0);
      AppMethodBeat.o(83309);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager.43
 * JD-Core Version:    0.6.2
 */
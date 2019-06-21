package com.tencent.ttpic.logic.watermark;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Queue;

class LogicDataManager$50
  implements LogicDataManager.LogicValueProvider
{
  LogicDataManager$50(LogicDataManager paramLogicDataManager)
  {
  }

  public String getValue()
  {
    AppMethodBeat.i(83317);
    synchronized (LogicDataManager.access$3800(this.this$0))
    {
      if (LogicDataManager.access$3800(this.this$0).isEmpty())
        break label100;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      if (!LogicDataManager.access$3800(this.this$0).isEmpty())
        localStringBuilder.append((String)LogicDataManager.access$3800(this.this$0).poll());
    }
    String str = localObject.toString();
    AppMethodBeat.o(83317);
    while (true)
    {
      return str;
      label100: str = "";
      AppMethodBeat.o(83317);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager.50
 * JD-Core Version:    0.6.2
 */
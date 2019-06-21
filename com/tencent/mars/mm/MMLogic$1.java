package com.tencent.mars.mm;

import com.tencent.mm.sdk.platformtools.ab;

final class MMLogic$1
  implements Runnable
{
  MMLogic$1(MMLogic.ReportInfo paramReportInfo)
  {
  }

  public final void run()
  {
    int i = MMLogic.access$100(this.val$item.actionId);
    if (i == 0)
      ab.e("C2Java", "ActionId Can not convert");
    while (true)
    {
      return;
      this.val$item.actionId = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mars.mm.MMLogic.1
 * JD-Core Version:    0.6.2
 */
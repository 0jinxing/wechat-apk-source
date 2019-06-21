package com.tencent.mars.mm;

import com.tencent.mm.network.aa;
import com.tencent.mm.network.y;
import com.tencent.mm.sdk.platformtools.bo;

final class MMLogic$3
  implements Runnable
{
  MMLogic$3(String paramString)
  {
  }

  public final void run()
  {
    y localy = aa.anq();
    if (bo.isNullOrNil(this.val$_info));
    for (byte[] arrayOfByte = null; ; arrayOfByte = this.val$_info.getBytes())
    {
      localy.onPush(268369923, arrayOfByte);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mars.mm.MMLogic.3
 * JD-Core Version:    0.6.2
 */
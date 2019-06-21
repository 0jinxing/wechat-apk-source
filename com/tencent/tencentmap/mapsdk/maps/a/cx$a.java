package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;

abstract class cx$a
  implements Runnable
{
  private cx$a(cx paramcx)
  {
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
      if (!cx.a(this.a).postAtFrontOfQueue(this))
        cx.a(this.a).post(this);
    while (true)
    {
      return;
      cx.a(this.a).post(this);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cx.a
 * JD-Core Version:    0.6.2
 */
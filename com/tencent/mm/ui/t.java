package com.tencent.mm.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class t
  implements MenuItem.OnMenuItemClickListener
{
  private long qBy = -1L;

  public abstract void Kp();

  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ab.i("MicroMsg.MMCustomMenuItemClickListener", "button onclick");
    if (this.qBy != -1L)
    {
      long l = (System.nanoTime() - this.qBy) / 1000000L;
      if (l < 500L)
        ab.i("MicroMsg.MMCustomMenuItemClickListener", "click time limited limitetime:%d, delaytime:%d", new Object[] { Long.valueOf(l), Long.valueOf(500L) });
    }
    while (true)
    {
      return false;
      this.qBy = System.nanoTime();
      Kp();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.t
 * JD-Core Version:    0.6.2
 */
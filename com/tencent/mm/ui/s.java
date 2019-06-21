package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class s
  implements View.OnClickListener
{
  private long qBy = -1L;

  public abstract void bgW();

  public void onClick(View paramView)
  {
    ab.i("MicroMsg.MMCustomClickListener", "button onclick");
    if (this.qBy != -1L)
    {
      long l = (System.nanoTime() - this.qBy) / 1000000L;
      if (l < 3000L)
        ab.i("MicroMsg.MMCustomClickListener", "click time limited limitetime:%d, delaytime:%d", new Object[] { Long.valueOf(l), Long.valueOf(3000L) });
    }
    while (true)
    {
      return;
      this.qBy = System.nanoTime();
      bgW();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.s
 * JD-Core Version:    0.6.2
 */
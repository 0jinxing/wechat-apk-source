package com.tencent.mm.plugin.messenger.a;

import android.view.View;
import com.tencent.mm.pluginsdk.ui.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class a extends n
{
  private long opR = -1L;

  public a()
  {
    super(1, null);
  }

  public void onClick(View paramView)
  {
    if (bo.az(this.opR) > 1000L)
    {
      super.onClick(paramView);
      onClickImp(paramView);
    }
    while (true)
    {
      this.opR = bo.yz();
      return;
      ab.w("MicroMsg.AvoidDuplicatedPressableSpan", "hy: too often click");
      this.ozq = false;
    }
  }

  public abstract void onClickImp(View paramView);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.a.a
 * JD-Core Version:    0.6.2
 */
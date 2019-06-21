package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.util.Pair;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import java.util.Map;
import java.util.Queue;

final class LuckyMoneyF2FQRCodeUI$1$1
  implements Runnable
{
  LuckyMoneyF2FQRCodeUI$1$1(LuckyMoneyF2FQRCodeUI.1 param1, String paramString1, String paramString2, String paramString3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42169);
    Object localObject;
    if (!LuckyMoneyF2FQRCodeUI.a(this.nVz.nVw).contains(this.nVx))
    {
      LuckyMoneyF2FQRCodeUI.a(this.nVz.nVw).add(0, this.nVx);
      if (!t.mY(this.eiH))
      {
        localObject = new h();
        ((h)localObject).username = this.eiH;
        o.act().b((h)localObject);
      }
      LuckyMoneyF2FQRCodeUI.b(this.nVz.nVw).put(this.nVx, this.eiH);
      localObject = LuckyMoneyF2FQRCodeUI.c(this.nVz.nVw);
      if (((ShuffleView)localObject).nVP.size() > 0)
      {
        if (((ShuffleView)localObject).nVT.isStarted())
          ((ShuffleView)localObject).nVT.end();
        if (((ShuffleView)localObject).lgH.isStarted())
          ((ShuffleView)localObject).lgH.end();
        if (((ShuffleView)localObject).gCO == null)
          break label351;
        ((ShuffleView)localObject).nVX = ((ShuffleView)localObject).gCO;
        ((ShuffleView)localObject).nVP.remove(((ShuffleView)localObject).nVX);
        if (((ShuffleView)localObject).nVR != null)
          ((ShuffleView)localObject).nVR.start();
        ((ShuffleView)localObject).xQ(((ShuffleView)localObject).nVZ);
        if (((ShuffleView)localObject).nWc <= 0)
          break label338;
        ((ShuffleView)localObject).nVZ = ((ShuffleView)localObject).bLm();
        ((ShuffleView)localObject).gCO = ((View)((ShuffleView)localObject).nVP.get(((ShuffleView)localObject).nVZ));
      }
    }
    while (true)
    {
      LuckyMoneyF2FQRCodeUI.d(this.nVz.nVw).remove(LuckyMoneyF2FQRCodeUI.c(this.nVz.nVw).getExitView());
      LuckyMoneyF2FQRCodeUI.e(this.nVz.nVw).ae(0L, 60000L);
      LuckyMoneyF2FQRCodeUI.f(this.nVz.nVw).add(new Pair(this.eiH, Integer.valueOf(bo.getInt(this.nVy, 0))));
      AppMethodBeat.o(42169);
      return;
      label338: ((ShuffleView)localObject).gCO = null;
      ((ShuffleView)localObject).nVZ = 0;
      continue;
      label351: ((ShuffleView)localObject).xO(((ShuffleView)localObject).bLm());
      ((ShuffleView)localObject).nVX = ((ShuffleView)localObject).gCO;
      ((ShuffleView)localObject).nVT.addListener(new ShuffleView.5((ShuffleView)localObject));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.1.1
 * JD-Core Version:    0.6.2
 */
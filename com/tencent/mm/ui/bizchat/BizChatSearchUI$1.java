package com.tencent.mm.ui.bizchat;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.a.l;
import com.tencent.mm.model.aw;

final class BizChatSearchUI$1
  implements AbsListView.OnScrollListener
{
  boolean jLx = false;

  BizChatSearchUI$1(BizChatSearchUI paramBizChatSearchUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 + paramInt2 == paramInt3);
    for (this.jLx = true; ; this.jLx = false)
      return;
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(30135);
    if ((paramInt == 0) && (this.jLx) && (BizChatSearchUI.a(this.yEB).yEP))
    {
      BizChatSearchUI.a locala = BizChatSearchUI.a(this.yEB);
      if ((locala.dAS()) && (!locala.yER))
      {
        locala.yER = true;
        paramAbsListView = new l(locala.jMp, locala.ema, locala.yEV);
        aw.Rg().a(paramAbsListView, 0);
        locala.dAW();
      }
    }
    AppMethodBeat.o(30135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSearchUI.1
 * JD-Core Version:    0.6.2
 */
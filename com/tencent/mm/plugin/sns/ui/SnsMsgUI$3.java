package com.tencent.mm.plugin.sns.ui;

import android.os.Process;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsMsgUI$3
  implements AbsListView.OnScrollListener
{
  SnsMsgUI$3(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(39067);
    if (!SnsMsgUI.g(this.rub))
      AppMethodBeat.o(39067);
    while (true)
    {
      return;
      ab.i("MicroMsg.SnsMsgUI", "onListViewScoll %s", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt == 2)
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcSNSMsgScrollEnable, SnsMsgUI.l(this.rub));
        SnsMsgUI localSnsMsgUI = this.rub;
        boolean bool = WXHardCoderJNI.hcSNSMsgScrollEnable;
        int i = WXHardCoderJNI.hcSNSMsgScrollDelay;
        int j = WXHardCoderJNI.hcSNSMsgScrollCPU;
        int k = WXHardCoderJNI.hcSNSMsgScrollIO;
        if (WXHardCoderJNI.hcSNSMsgScrollThr)
        {
          paramInt = Process.myTid();
          label93: SnsMsgUI.b(localSnsMsgUI, WXHardCoderJNI.startPerformance(bool, i, j, k, paramInt, WXHardCoderJNI.hcSNSMsgScrollTimeout, 705, WXHardCoderJNI.hcSNSMsgScrollAction, "MicroMsg.SnsMsgUI"));
          ab.i("MicroMsg.SnsMsgUI", "summer hardcoder sns startPerformance [%s]", new Object[] { Integer.valueOf(SnsMsgUI.l(this.rub)) });
        }
      }
      else
      {
        if (paramAbsListView.getLastVisiblePosition() != paramAbsListView.getCount() - 1)
          break label213;
        if (af.cnK().baS() <= 0)
          break label199;
        af.cnK().baT();
      }
      while (true)
      {
        SnsMsgUI.e(this.rub).a(null, null);
        AppMethodBeat.o(39067);
        break;
        paramInt = 0;
        break label93;
        label199: SnsMsgUI.e(this.rub).bdo();
      }
      label213: AppMethodBeat.o(39067);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.3
 * JD-Core Version:    0.6.2
 */
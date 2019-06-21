package com.tencent.mm.ui;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AllRemindMsgUI$a$1$1
  implements Runnable
{
  AllRemindMsgUI$a$1$1(AllRemindMsgUI.a.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29114);
    AllRemindMsgUI.c(this.yez.yey.yex).setVisibility(0);
    AllRemindMsgUI.e(this.yez.yey.yex).setVisibility(8);
    AllRemindMsgUI.a(this.yez.yey.yex).aop.notifyChanged();
    AppMethodBeat.o(29114);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.a.1.1
 * JD-Core Version:    0.6.2
 */
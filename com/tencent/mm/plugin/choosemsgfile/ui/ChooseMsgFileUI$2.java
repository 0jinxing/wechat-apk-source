package com.tencent.mm.plugin.choosemsgfile.ui;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.choosemsgfile.b.c.c;
import com.tencent.mm.plugin.choosemsgfile.b.c.f;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ChooseMsgFileUI$2 extends RecyclerView.m
{
  private Runnable kvR;

  ChooseMsgFileUI$2(ChooseMsgFileUI paramChooseMsgFileUI)
  {
    AppMethodBeat.i(54442);
    this.kvR = new ChooseMsgFileUI.2.1(this);
    AppMethodBeat.o(54442);
  }

  private void fQ(boolean paramBoolean)
  {
    AppMethodBeat.i(54443);
    if (paramBoolean)
    {
      ChooseMsgFileUI.h(this.kvQ).removeCallbacks(this.kvR);
      if (ChooseMsgFileUI.h(this.kvQ).getVisibility() == 0)
        break label124;
      ChooseMsgFileUI.h(this.kvQ).clearAnimation();
      Animation localAnimation = AnimationUtils.loadAnimation(this.kvQ.mController.ylL, 2131034180);
      ChooseMsgFileUI.h(this.kvQ).setVisibility(0);
      ChooseMsgFileUI.h(this.kvQ).startAnimation(localAnimation);
      AppMethodBeat.o(54443);
    }
    while (true)
    {
      return;
      ChooseMsgFileUI.h(this.kvQ).removeCallbacks(this.kvR);
      ChooseMsgFileUI.h(this.kvQ).postDelayed(this.kvR, 256L);
      label124: AppMethodBeat.o(54443);
    }
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54444);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    paramRecyclerView = (LinearLayoutManager)ChooseMsgFileUI.g(this.kvQ).bfC();
    paramRecyclerView = ChooseMsgFileUI.g(this.kvQ).kvi.ts(paramRecyclerView.iQ());
    if (paramRecyclerView == null)
      AppMethodBeat.o(54444);
    while (true)
    {
      return;
      paramRecyclerView = b.ha(paramRecyclerView.getTimeStamp());
      ChooseMsgFileUI.h(this.kvQ).setText(bo.bc(paramRecyclerView, ""));
      AppMethodBeat.o(54444);
    }
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(54445);
    if (1 == paramInt)
      fQ(true);
    while (true)
    {
      if ((paramRecyclerView.getLayoutManager() instanceof LinearLayoutManager))
      {
        if ((((LinearLayoutManager)paramRecyclerView.getLayoutManager()).iQ() == 0) && (!ChooseMsgFileUI.i(this.kvQ)))
          ChooseMsgFileUI.g(this.kvQ).b(false, ChooseMsgFileUI.e(this.kvQ), ChooseMsgFileUI.f(this.kvQ));
        ChooseMsgFileUI.j(this.kvQ);
        o.ahp().cm(paramInt);
      }
      AppMethodBeat.o(54445);
      return;
      if (paramInt == 0)
        fQ(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.2
 * JD-Core Version:    0.6.2
 */
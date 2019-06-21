package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DynamicGridView$2
  implements AbsListView.OnScrollListener
{
  private int eiY;
  private int rLU = -1;
  private int rLV = -1;
  private int rLW;
  private int rLX;

  DynamicGridView$2(DynamicGridView paramDynamicGridView)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(40344);
    this.rLW = paramInt1;
    this.rLX = paramInt2;
    int i;
    label49: label212: View localView;
    if (this.rLU == -1)
    {
      i = this.rLW;
      this.rLU = i;
      if (this.rLV != -1)
        break label302;
      i = this.rLX;
      this.rLV = i;
      if ((this.rLW != this.rLU) && (DynamicGridView.k(this.rLT)) && (DynamicGridView.h(this.rLT) != -1L))
      {
        DynamicGridView.a(this.rLT, DynamicGridView.h(this.rLT));
        DynamicGridView.p(this.rLT);
      }
      if ((this.rLW + this.rLX != this.rLU + this.rLV) && (DynamicGridView.k(this.rLT)) && (DynamicGridView.h(this.rLT) != -1L))
      {
        DynamicGridView.a(this.rLT, DynamicGridView.h(this.rLT));
        DynamicGridView.p(this.rLT);
      }
      this.rLU = this.rLW;
      this.rLV = this.rLX;
      if ((!DynamicGridView.cvn()) || (!DynamicGridView.i(this.rLT)))
        break label366;
      i = 0;
      if (i >= paramInt2)
        break label366;
      localView = this.rLT.getChildAt(i);
      if (localView != null)
      {
        if ((DynamicGridView.h(this.rLT) == -1L) || (Boolean.TRUE == localView.getTag(2131820591)))
          break label323;
        if (i % 2 != 0)
          break label311;
        DynamicGridView.c(this.rLT, localView);
        label277: localView.setTag(2131820591, Boolean.TRUE);
      }
    }
    while (true)
    {
      i++;
      break label212;
      i = this.rLU;
      break;
      label302: i = this.rLV;
      break label49;
      label311: DynamicGridView.d(this.rLT, localView);
      break label277;
      label323: if ((DynamicGridView.h(this.rLT) == -1L) && (localView.getRotation() != 0.0F))
      {
        localView.setRotation(0.0F);
        localView.setTag(2131820591, Boolean.FALSE);
      }
    }
    label366: if (DynamicGridView.j(this.rLT) != null)
      DynamicGridView.j(this.rLT).onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(40344);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(40345);
    this.eiY = paramInt;
    DynamicGridView.c(this.rLT, paramInt);
    if ((this.rLX > 0) && (this.eiY == 0))
    {
      if ((!DynamicGridView.k(this.rLT)) || (!DynamicGridView.l(this.rLT)))
        break label90;
      DynamicGridView.m(this.rLT);
    }
    while (true)
    {
      if (DynamicGridView.j(this.rLT) != null)
        DynamicGridView.j(this.rLT).onScrollStateChanged(paramAbsListView, paramInt);
      AppMethodBeat.o(40345);
      return;
      label90: if (DynamicGridView.n(this.rLT))
        DynamicGridView.o(this.rLT);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.2
 * JD-Core Version:    0.6.2
 */
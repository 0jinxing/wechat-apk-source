package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "mOldChildHeight", "", "mOldChildWidth", "mTable", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "getMTable", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "setMTable", "(Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;)V", "onItemClickListener", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView$OnItemClickListener;", "getOnItemClickListener", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView$OnItemClickListener;", "setOnItemClickListener", "(Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView$OnItemClickListener;)V", "computeScrollX", "computeScrollY", "initGridView", "", "onLayout", "changed", "", "l", "t", "r", "b", "reset", "OnItemClickListener", "plugin-radar_release"})
public final class RadarSpecialGridView extends RadarSpecialSmoothScrollView
{
  private RadarSpecialGridView.a pCH;
  public RadarSpecialTableLayout pCI;
  private int pCJ;
  private int pCK;

  public RadarSpecialGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103007);
    paramContext = getContext();
    j.o(paramContext, "context");
    this.pCI = new RadarSpecialTableLayout(paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, -2);
    paramContext.gravity = 80;
    paramAttributeSet = this.pCI;
    if (paramAttributeSet == null)
      j.avw("mTable");
    paramAttributeSet.setLayoutParams((ViewGroup.LayoutParams)paramContext);
    paramContext = this.pCI;
    if (paramContext == null)
      j.avw("mTable");
    paramContext.setStretchAllColumns(true);
    paramContext = this.pCI;
    if (paramContext == null)
      j.avw("mTable");
    paramContext.setShrinkAllColumns(true);
    paramContext = this.pCI;
    if (paramContext == null)
      j.avw("mTable");
    paramContext.setGravity(80);
    paramContext = this.pCI;
    if (paramContext == null)
      j.avw("mTable");
    addView((View)paramContext);
    AppMethodBeat.o(103007);
  }

  public final RadarSpecialTableLayout getMTable()
  {
    AppMethodBeat.i(103004);
    RadarSpecialTableLayout localRadarSpecialTableLayout = this.pCI;
    if (localRadarSpecialTableLayout == null)
      j.avw("mTable");
    AppMethodBeat.o(103004);
    return localRadarSpecialTableLayout;
  }

  public final RadarSpecialGridView.a getOnItemClickListener()
  {
    return this.pCH;
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    AppMethodBeat.i(103006);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      paramInt1 = getScrollX();
      j.o(localView, "child");
      paramInt1 = paramInt1 + localView.getWidth() - this.pCK;
      this.pCK = localView.getWidth();
      if (paramInt1 > 0)
      {
        if (getChildCount() <= 0)
          break label156;
        localView = getChildAt(0);
        paramInt2 = getScrollY();
        j.o(localView, "child");
        paramInt3 = paramInt2 + localView.getHeight() - this.pCJ;
        this.pCJ = localView.getHeight();
        paramInt2 = i;
        if (paramInt3 <= 0);
      }
    }
    label156: for (paramInt2 = paramInt3; ; paramInt2 = getScrollY())
    {
      scrollTo(paramInt1, paramInt2);
      AppMethodBeat.o(103006);
      return;
      paramInt1 = 0;
      break;
      paramInt1 = getScrollX();
      break;
    }
  }

  public final void setMTable(RadarSpecialTableLayout paramRadarSpecialTableLayout)
  {
    AppMethodBeat.i(103005);
    j.p(paramRadarSpecialTableLayout, "<set-?>");
    this.pCI = paramRadarSpecialTableLayout;
    AppMethodBeat.o(103005);
  }

  public final void setOnItemClickListener(RadarSpecialGridView.a parama)
  {
    this.pCH = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarSpecialGridView
 * JD-Core Version:    0.6.2
 */
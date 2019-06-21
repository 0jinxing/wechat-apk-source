package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.base.MMPullDownView;

public class CollectPullDownView extends MMPullDownView
{
  public CollectPullDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CollectPullDownView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void bhG()
  {
    AppMethodBeat.i(41328);
    View localView1 = inflate(this.context, 2130969156, null);
    View localView2 = inflate(this.context, 2130969156, null);
    addView(localView1, 0, new FrameLayout.LayoutParams(-1, a.fromDPToPix(this.context, 48)));
    addView(localView2, new FrameLayout.LayoutParams(-1, a.fromDPToPix(this.context, 48)));
    AppMethodBeat.o(41328);
  }

  public void setLoadDataEnd(boolean paramBoolean)
  {
    this.ywo = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectPullDownView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.v;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class BizTimeLineHotListView$b extends RecyclerView.v
{
  public View apJ;
  public TextView gne;
  public ImageView iYd;
  public FrameLayout iYe;
  public ImageView iqT;
  public ImageView jQj;

  public BizTimeLineHotListView$b(BizTimeLineHotListView paramBizTimeLineHotListView, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(14289);
    this.apJ = paramView;
    paramView.getLayoutParams().width = (paramBizTimeLineHotListView.getResources().getDisplayMetrics().widthPixels / 4);
    this.iqT = ((ImageView)paramView.findViewById(2131821821));
    this.iYd = ((ImageView)paramView.findViewById(2131821822));
    this.iYe = ((FrameLayout)paramView.findViewById(2131821820));
    this.gne = ((TextView)paramView.findViewById(2131821824));
    this.jQj = ((ImageView)paramView.findViewById(2131821823));
    AppMethodBeat.o(14289);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView.b
 * JD-Core Version:    0.6.2
 */
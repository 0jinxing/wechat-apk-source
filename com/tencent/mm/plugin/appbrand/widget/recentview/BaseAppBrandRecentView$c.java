package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.v;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class BaseAppBrandRecentView$c extends RecyclerView.v
{
  public View apJ;
  public TextView gne;
  public ImageView iYd;
  public FrameLayout iYe;
  public TextView iYf;
  public ImageView iqT;

  public BaseAppBrandRecentView$c(BaseAppBrandRecentView paramBaseAppBrandRecentView, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(134352);
    this.apJ = paramView;
    paramView.setOnClickListener(new BaseAppBrandRecentView.c.1(this, paramBaseAppBrandRecentView));
    paramView.setOnLongClickListener(new BaseAppBrandRecentView.c.2(this, paramBaseAppBrandRecentView));
    paramView.getLayoutParams().width = (paramBaseAppBrandRecentView.getResources().getDisplayMetrics().widthPixels / 4);
    this.iqT = ((ImageView)paramView.findViewById(2131820915));
    this.iYd = ((ImageView)paramView.findViewById(2131821484));
    this.iYe = ((FrameLayout)paramView.findViewById(2131821502));
    this.gne = ((TextView)paramView.findViewById(2131820678));
    this.iYf = ((TextView)paramView.findViewById(2131821485));
    AppMethodBeat.o(134352);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c
 * JD-Core Version:    0.6.2
 */
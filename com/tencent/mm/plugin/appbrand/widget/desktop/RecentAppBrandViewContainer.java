package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.v;
import java.util.List;

public class RecentAppBrandViewContainer extends LinearLayout
{
  RecentAppBrandView iXn;
  private View iYQ;
  Runnable iYR;
  boolean iYS;
  private View.OnClickListener iYT;
  private Context mContext;

  public RecentAppBrandViewContainer(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(133953);
    this.iYR = null;
    this.iYS = true;
    this.iYT = null;
    init(paramContext);
    AppMethodBeat.o(133953);
  }

  public RecentAppBrandViewContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(133954);
    this.iYR = null;
    this.iYS = true;
    this.iYT = null;
    init(paramContext);
    AppMethodBeat.o(133954);
  }

  public RecentAppBrandViewContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(133955);
    this.iYR = null;
    this.iYS = true;
    this.iYT = null;
    init(paramContext);
    AppMethodBeat.o(133955);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(133959);
    this.mContext = paramContext;
    paramContext = v.hu(paramContext).inflate(2130968675, this);
    this.iXn = ((RecentAppBrandView)paramContext.findViewById(2131821168));
    this.iYQ = paramContext.findViewById(2131821169);
    paramContext = new e(this.iYQ);
    int i = (int)d.dl(getContext());
    paramContext.iYe.getLayoutParams().width = ((int)(a.am(getContext(), 2131427858) * 2 * d.dm(getContext())) + i);
    paramContext.iYe.getLayoutParams().height = ((int)(a.am(getContext(), 2131427858) * 2 * d.dm(getContext())) + i);
    paramContext.iqT.getLayoutParams().width = i;
    paramContext.iqT.getLayoutParams().height = i;
    paramContext.iYd.getLayoutParams().width = i;
    paramContext.iYd.getLayoutParams().height = i;
    paramContext.iqT.setImageResource(2131231686);
    paramContext.iYf.setVisibility(8);
    paramContext.gne.setText("");
    paramContext.apJ.setOnClickListener(new RecentAppBrandViewContainer.2(this));
    AppMethodBeat.o(133959);
  }

  public RecentAppBrandView getRecentView()
  {
    return this.iXn;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(133956);
    if (this.iXn != null)
    {
      if (this.iXn.getDataCount() <= 4)
        break label44;
      this.iYQ.setVisibility(0);
    }
    while (true)
    {
      this.iXn.aPw();
      AppMethodBeat.o(133956);
      return;
      label44: this.iYQ.setVisibility(4);
    }
  }

  public void setDataList(List<AppBrandDesktopView.c> paramList)
  {
    AppMethodBeat.i(133957);
    if (this.iXn != null)
      this.iXn.setDataList(paramList);
    if (paramList.size() <= 4)
    {
      this.iYQ.setVisibility(8);
      AppMethodBeat.o(133957);
    }
    while (true)
    {
      return;
      this.iYQ.setVisibility(0);
      AppMethodBeat.o(133957);
    }
  }

  public void setItemPadding(int paramInt)
  {
    AppMethodBeat.i(133958);
    if (this.iXn != null)
      this.iXn.setItemPadding(paramInt);
    if (this.iYQ != null)
    {
      View localView = this.iYQ;
      localView.setPadding(paramInt, localView.getPaddingTop(), paramInt, this.iYQ.getPaddingBottom());
    }
    AppMethodBeat.o(133958);
  }

  public void setOnMoreClickListener(View.OnClickListener paramOnClickListener)
  {
    this.iYT = paramOnClickListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.RecentAppBrandViewContainer
 * JD-Core Version:    0.6.2
 */
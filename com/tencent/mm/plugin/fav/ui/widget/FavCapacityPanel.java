package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;

public class FavCapacityPanel extends LinearLayout
{
  private View.OnClickListener mjE;
  private LinearLayout mpt;
  public long mpu;
  public TextView mpv;
  public int mpw;
  public long mpx;

  public FavCapacityPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(74664);
    this.mpw = 0;
    this.mjE = new FavCapacityPanel.1(this);
    this.mpt = this;
    paramContext = View.inflate(getContext(), 2130969528, null);
    paramContext.measure(-2, -2);
    View localView = paramContext.findViewById(2131823974);
    paramAttributeSet = paramContext.findViewById(2131823975);
    this.mpv = ((TextView)paramContext.findViewById(2131823976));
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
    localLayoutParams.width = paramContext.getMeasuredWidth();
    localView.setLayoutParams(localLayoutParams);
    paramAttributeSet.setOnClickListener(this.mjE);
    paramAttributeSet = new LinearLayout.LayoutParams(0, -2);
    paramAttributeSet.weight = 1.0F;
    this.mpt.addView(paramContext, paramAttributeSet);
    this.mpu = (b.buh() / 1048576L);
    this.mpx = (b.bui() / 1048576L);
    paramContext = this.mpv;
    paramAttributeSet = this.mpv.getContext();
    if (this.mpx - this.mpu > 0L);
    for (long l = this.mpx - this.mpu; ; l = 0L)
    {
      paramContext.setText(paramAttributeSet.getString(2131299570, new Object[] { Long.valueOf(l), Long.valueOf(this.mpu) }));
      AppMethodBeat.o(74664);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel
 * JD-Core Version:    0.6.2
 */
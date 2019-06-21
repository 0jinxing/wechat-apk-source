package com.tencent.mm.plugin.multitalk.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.a.b;

public final class d
  implements View.OnClickListener
{
  private Context context;
  private View mKk;
  private int oIA;
  public int oIB;
  private int oIb;
  private int oIh;
  private LinearLayout oIt;
  public LinearLayout oIu;
  public LinearLayout oIv;
  private int oIw;
  private int oIx;
  private int oIy;
  private int oIz;
  public int size;

  public d(Activity paramActivity)
  {
    AppMethodBeat.i(54192);
    this.size = 0;
    this.oIb = b.oIb;
    this.oIy = (b.oIb + b.oIa);
    this.oIz = (b.oIb * 2 + b.oIa);
    this.oIA = (b.oIb * 4);
    this.oIh = b.oIh;
    this.context = paramActivity.getBaseContext();
    int i = a.gd(this.context) - this.oIA * 2;
    this.oIw = ((i - this.oIy * 10) / 5);
    this.oIx = ((i - this.oIz * 10) / 5);
    i = this.oIx;
    int j = this.oIb;
    this.mKk = paramActivity.findViewById(2131820896);
    this.mKk.getLayoutParams().height = (i * 2 + j * 12);
    this.oIt = ((LinearLayout)paramActivity.findViewById(2131826247));
    paramActivity = (RelativeLayout.LayoutParams)this.oIt.getLayoutParams();
    paramActivity.topMargin = (this.oIb * 2);
    paramActivity.bottomMargin = (this.oIb * 2);
    paramActivity.leftMargin = this.oIA;
    paramActivity.rightMargin = this.oIA;
    this.oIt.setLayoutParams(paramActivity);
    this.oIu = new LinearLayout(this.context);
    this.oIv = new LinearLayout(this.context);
    paramActivity = new LinearLayout.LayoutParams(-2, -2);
    this.oIu.setLayoutParams(paramActivity);
    paramActivity = new RelativeLayout.LayoutParams(-2, -2);
    paramActivity.addRule(14);
    this.oIv.setLayoutParams(paramActivity);
    paramActivity = new LinearLayout.LayoutParams(-1, -2);
    RelativeLayout localRelativeLayout = new RelativeLayout(this.context);
    localRelativeLayout.addView(this.oIv);
    localRelativeLayout.setLayoutParams(paramActivity);
    this.oIt.addView(this.oIu);
    this.oIt.addView(localRelativeLayout);
    AppMethodBeat.o(54192);
  }

  public final void Sp(String paramString)
  {
    AppMethodBeat.i(54194);
    this.size += 1;
    ImageView localImageView = new ImageView(this.context);
    localImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    localImageView.setTag(paramString);
    localImageView.setOnClickListener(this);
    a.b.b(localImageView, paramString);
    if (this.size <= 5)
      this.oIu.addView(localImageView);
    while (true)
    {
      zj(this.size);
      zk(this.size);
      AppMethodBeat.o(54194);
      return;
      this.oIv.addView(localImageView);
    }
  }

  public final void onClick(View paramView)
  {
    this.oIB += 1;
  }

  public final void setVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(54193);
    if (paramBoolean)
    {
      this.mKk.setVisibility(0);
      AppMethodBeat.o(54193);
    }
    while (true)
    {
      return;
      this.mKk.setVisibility(8);
      AppMethodBeat.o(54193);
    }
  }

  public final void zj(int paramInt)
  {
    AppMethodBeat.i(54195);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.oIu.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)this.oIv.getLayoutParams();
    if (paramInt <= 5)
    {
      localLayoutParams.height = this.oIw;
      this.oIv.setVisibility(8);
      AppMethodBeat.o(54195);
    }
    while (true)
    {
      return;
      localLayoutParams.height = this.oIx;
      localLayoutParams.topMargin = (this.oIb * 2);
      localLayoutParams.bottomMargin = (this.oIb * 2);
      this.oIv.setVisibility(0);
      localLayoutParams1.height = this.oIx;
      localLayoutParams1.topMargin = (this.oIb * 2);
      localLayoutParams1.bottomMargin = (this.oIb * 2);
      AppMethodBeat.o(54195);
    }
  }

  public final void zk(int paramInt)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(54196);
    int k;
    LinearLayout.LayoutParams localLayoutParams;
    if (paramInt <= 5)
    {
      for (k = 0; ; k++)
      {
        paramInt = j;
        if (k >= this.oIu.getChildCount())
          break;
        localLayoutParams = (LinearLayout.LayoutParams)this.oIu.getChildAt(k).getLayoutParams();
        localLayoutParams.width = this.oIw;
        localLayoutParams.height = this.oIw;
        localLayoutParams.rightMargin = this.oIy;
        localLayoutParams.leftMargin = this.oIy;
      }
      while (paramInt < this.oIv.getChildCount())
      {
        localLayoutParams = (LinearLayout.LayoutParams)this.oIv.getChildAt(paramInt).getLayoutParams();
        localLayoutParams.width = this.oIx;
        localLayoutParams.height = this.oIx;
        localLayoutParams.rightMargin = this.oIy;
        localLayoutParams.leftMargin = this.oIy;
        paramInt++;
      }
      AppMethodBeat.o(54196);
    }
    while (true)
    {
      return;
      for (k = 0; ; k++)
      {
        paramInt = i;
        if (k >= this.oIu.getChildCount())
          break;
        localLayoutParams = (LinearLayout.LayoutParams)this.oIu.getChildAt(k).getLayoutParams();
        localLayoutParams.width = this.oIx;
        localLayoutParams.height = this.oIx;
        localLayoutParams.rightMargin = this.oIz;
        localLayoutParams.leftMargin = this.oIz;
      }
      while (paramInt < this.oIv.getChildCount())
      {
        localLayoutParams = (LinearLayout.LayoutParams)this.oIv.getChildAt(paramInt).getLayoutParams();
        localLayoutParams.width = this.oIx;
        localLayoutParams.height = this.oIx;
        localLayoutParams.rightMargin = this.oIz;
        localLayoutParams.leftMargin = this.oIz;
        paramInt++;
      }
      AppMethodBeat.o(54196);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.widget.d
 * JD-Core Version:    0.6.2
 */
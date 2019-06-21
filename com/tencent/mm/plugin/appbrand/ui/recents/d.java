package com.tencent.mm.plugin.appbrand.ui.recents;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.e.k.a;
import java.util.List;

public abstract class d<_DataSource extends k> extends a
  implements View.OnClickListener
{
  private boolean Dx;
  private final int eop;
  private final int eoq;
  private final int eor;
  private final int eos = -1;
  private final Class iLZ;
  private final com.tencent.mm.plugin.appbrand.ui.widget.a iMa;
  protected final int iMb = 4;
  private ViewGroup iMc;
  protected AppBrandNearbyShowcaseView iMd;
  private volatile List<LocalUsageInfo> iMe;
  private ImageView iMf;
  private final ViewTreeObserver.OnPreDrawListener iMg = new d.1(this);
  private final k.a iMh = new d.4(this);
  private Activity mActivity;

  d(Class<_DataSource> paramClass, Activity paramActivity, ViewGroup paramViewGroup)
  {
    this.mActivity = paramActivity;
    this.iLZ = paramClass;
    this.eop = com.tencent.mm.bz.a.fromDPToPix(paramActivity, 25);
    this.eoq = com.tencent.mm.bz.a.fromDPToPix(paramActivity, 19);
    this.eor = com.tencent.mm.bz.a.fromDPToPix(paramActivity, 2);
    this.iMa = new com.tencent.mm.plugin.appbrand.ui.widget.a(this.eop, this.eor);
    this.iMc = ((ViewGroup)LayoutInflater.from(paramActivity).inflate(2130968714, paramViewGroup, false));
    this.iMc.setOnClickListener(this);
    ((TextView)this.iMc.findViewById(2131820678)).setText(getTitle());
    this.iMf = ((ImageView)this.iMc.findViewById(2131821332));
    this.iMd = ((AppBrandNearbyShowcaseView)this.iMc.findViewById(2131821330));
    this.iMd.setIconLayerCount(4);
    this.iMd.setIconSize(this.eop + this.eor * 2);
    this.iMd.setIconGap(this.eoq);
  }

  public final void aNh()
  {
    this.Dx = true;
    eG(true);
    this.iMc.getViewTreeObserver().addOnPreDrawListener(this.iMg);
  }

  public final View aNi()
  {
    return this.iMc;
  }

  protected abstract List<LocalUsageInfo> aNk();

  protected final Activity getActivity()
  {
    return this.mActivity;
  }

  protected abstract String getTitle();

  public void onClick(View paramView)
  {
  }

  public final void onDetached()
  {
    this.Dx = false;
    this.iMc.getViewTreeObserver().removeOnPreDrawListener(this.iMg);
    f.auO().d(this.iMh);
    ((k)f.E(this.iLZ)).d(this.iMh);
  }

  public final void onResume()
  {
  }

  public final void pS(int paramInt)
  {
    if (this.iMf != null)
      this.iMf.setVisibility(paramInt);
    TextView localTextView = (TextView)this.iMc.findViewById(2131820678);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localTextView.getLayoutParams();
    localLayoutParams.leftMargin = this.iMc.getResources().getDimensionPixelOffset(2131428018);
    localTextView.setLayoutParams(localLayoutParams);
  }

  public final void pT(int paramInt)
  {
    this.iMc.setBackgroundResource(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.d
 * JD-Core Version:    0.6.2
 */
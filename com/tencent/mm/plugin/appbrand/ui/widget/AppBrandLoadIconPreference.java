package com.tencent.mm.plugin.appbrand.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.r.e;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.LinkedList;

public class AppBrandLoadIconPreference extends Preference
{
  private String emo;
  private b.f eoo;
  private int eop;
  private int eoq;
  private int eor;
  private final int eos;
  private int eot;
  private ThreeDotsLoadingView iDW;
  private AppBrandNearbyShowcaseView iMd;
  private View iQN;
  private boolean iQO;
  private LinkedList<e> iQP;
  private Context mContext;
  private View mView;

  public AppBrandLoadIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(93760);
    this.mView = null;
    this.iQO = false;
    this.eos = -1;
    this.eot = -1;
    this.iQP = new LinkedList();
    bA(paramContext);
    AppMethodBeat.o(93760);
  }

  public AppBrandLoadIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(93761);
    this.mView = null;
    this.iQO = false;
    this.eos = -1;
    this.eot = -1;
    this.iQP = new LinkedList();
    bA(paramContext);
    AppMethodBeat.o(93761);
  }

  private void bA(Context paramContext)
  {
    AppMethodBeat.i(93762);
    setLayoutResource(2130970127);
    this.mContext = paramContext;
    AppMethodBeat.o(93762);
  }

  private static void c(View paramView, Runnable paramRunnable)
  {
    AppMethodBeat.i(93765);
    if (paramView.getVisibility() != 0)
    {
      paramView.setAlpha(0.0F);
      paramView.setVisibility(0);
    }
    paramView.animate().setDuration(200L).alpha(1.0F).withEndAction(paramRunnable).start();
    AppMethodBeat.o(93765);
  }

  private void cw(View paramView)
  {
    AppMethodBeat.i(93766);
    if (paramView.getVisibility() == 0)
      paramView.animate().setDuration(200L).alpha(0.0F).withEndAction(new AppBrandLoadIconPreference.4(this, paramView)).start();
    AppMethodBeat.o(93766);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(93764);
    super.onBindView(paramView);
    this.eop = a.fromDPToPix(this.mContext, 21);
    this.eoq = a.fromDPToPix(this.mContext, 11);
    this.eor = a.fromDPToPix(this.mContext, 2);
    this.iQN = paramView.findViewById(2131821481);
    this.iDW = ((ThreeDotsLoadingView)paramView.findViewById(2131821391));
    this.iMd = ((AppBrandNearbyShowcaseView)paramView.findViewById(2131821482));
    this.iMd.setIconSize(this.eop + this.eor * 2);
    this.iMd.setIconGap(this.eoq);
    if ((this.emo == null) || (this.iDW == null))
    {
      ab.i("MicroMsg.AppBrandLoadIconPreference", "startLoad mTalker or mLoadingView is null");
      AppMethodBeat.o(93764);
    }
    while (true)
    {
      return;
      if (this.iQO)
      {
        ab.i("MicroMsg.AppBrandLoadIconPreference", "startLoad has load.");
        AppMethodBeat.o(93764);
      }
      else
      {
        this.iQO = true;
        cw(this.iQN);
        c(this.iDW, null);
        this.iDW.dKS();
        g.RS().aa(new AppBrandLoadIconPreference.1(this));
        AppMethodBeat.o(93764);
      }
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(93763);
    if (this.mView == null)
    {
      paramViewGroup = super.onCreateView(paramViewGroup);
      ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
      localViewGroup.removeAllViews();
      View.inflate(this.mContext, 2130968765, localViewGroup);
      this.mView = paramViewGroup;
    }
    paramViewGroup = this.mView;
    AppMethodBeat.o(93763);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.widget.AppBrandLoadIconPreference
 * JD-Core Version:    0.6.2
 */
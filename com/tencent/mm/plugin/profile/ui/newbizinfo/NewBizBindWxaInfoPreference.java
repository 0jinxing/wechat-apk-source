package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.LinkedList;
import java.util.List;

public class NewBizBindWxaInfoPreference extends Preference
{
  private static final int eop;
  private static final int eoq;
  private static final int eor;
  private Context context;
  private b.f eoo;
  private ThreeDotsLoadingView iDW;
  private AppBrandNearbyShowcaseView iMd;
  private View iQN;
  private boolean iQO;
  private List<WxaAttributes.WxaEntryInfo> iUl;
  private View.OnClickListener lBl;
  private View mView;
  private View.OnClickListener pkL;
  private d pkW;

  static
  {
    AppMethodBeat.i(23841);
    eop = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 25);
    eoq = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 20);
    eor = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 2);
    AppMethodBeat.o(23841);
  }

  public NewBizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23831);
    this.mView = null;
    this.iQO = false;
    this.context = paramContext;
    init();
    AppMethodBeat.o(23831);
  }

  public NewBizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23832);
    this.mView = null;
    this.iQO = false;
    this.context = paramContext;
    init();
    AppMethodBeat.o(23832);
  }

  private void azx()
  {
    AppMethodBeat.i(23838);
    if ((this.pkW == null) || (this.iUl == null))
    {
      ab.w("MicroMsg.NewBizBindWxaInfoPreference", "mWxaEntryInfoList or bizInfo is null, return");
      AppMethodBeat.o(23838);
    }
    while (true)
    {
      return;
      this.iDW.dKT();
      cw(this.iDW);
      if (this.iUl.size() > 0)
      {
        this.iMd.setVisibility(0);
        this.iMd.setIconLayerCount(Math.min(this.iUl.size(), 4));
        final boolean bool;
        int i;
        label139: b localb;
        ImageView localImageView;
        if (this.iQN.getVisibility() != 0)
        {
          bool = true;
          if (bool)
            this.iMd.eO(false);
          if (this.eoo == null)
            this.eoo = new com.tencent.mm.plugin.appbrand.ui.widget.a(eop, eor);
          i = 0;
          if (i >= this.iMd.getChildCount())
            break label228;
          localb = b.abR();
          localImageView = this.iMd.qf(i);
          if (this.iUl.size() <= i)
            break label222;
        }
        label222: for (String str = ((WxaAttributes.WxaEntryInfo)this.iUl.get(i)).iconUrl; ; str = null)
        {
          localb.a(localImageView, str, com.tencent.mm.modelappbrand.a.a.abQ(), this.eoo);
          i++;
          break label139;
          bool = false;
          break;
        }
        label228: c(this.iQN, new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(23829);
            if ((bool) && (NewBizBindWxaInfoPreference.c(NewBizBindWxaInfoPreference.this) != null))
              NewBizBindWxaInfoPreference.c(NewBizBindWxaInfoPreference.this).aOB();
            AppMethodBeat.o(23829);
          }
        });
        if (this.iUl.size() == 1)
        {
          this.mView.setTag(((WxaAttributes.WxaEntryInfo)this.iUl.get(0)).username);
          this.mView.setOnClickListener(this.lBl);
          AppMethodBeat.o(23838);
        }
        else
        {
          this.mView.setTag(null);
          this.mView.setOnClickListener(this.pkL);
          AppMethodBeat.o(23838);
        }
      }
      else
      {
        this.iMd.setVisibility(8);
        AppMethodBeat.o(23838);
      }
    }
  }

  private static void c(View paramView, Runnable paramRunnable)
  {
    AppMethodBeat.i(23839);
    if (paramView.getVisibility() != 0)
    {
      paramView.setAlpha(0.0F);
      paramView.setVisibility(0);
    }
    paramView.animate().setDuration(200L).alpha(1.0F).withEndAction(paramRunnable).start();
    AppMethodBeat.o(23839);
  }

  private void cw(View paramView)
  {
    AppMethodBeat.i(23840);
    if (paramView.getVisibility() == 0)
      paramView.animate().setDuration(200L).alpha(0.0F).withEndAction(new NewBizBindWxaInfoPreference.4(this, paramView)).start();
    AppMethodBeat.o(23840);
  }

  private void init()
  {
    AppMethodBeat.i(23833);
    this.lBl = new NewBizBindWxaInfoPreference.1(this);
    this.pkL = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(23828);
        ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).a(NewBizBindWxaInfoPreference.this.mContext, NewBizBindWxaInfoPreference.a(NewBizBindWxaInfoPreference.this).field_username, NewBizBindWxaInfoPreference.a(NewBizBindWxaInfoPreference.this).field_appId, NewBizBindWxaInfoPreference.b(NewBizBindWxaInfoPreference.this));
        AppMethodBeat.o(23828);
      }
    };
    AppMethodBeat.o(23833);
  }

  private void ou()
  {
    AppMethodBeat.i(23837);
    if (this.iDW == null)
    {
      ab.i("MicroMsg.NewBizBindWxaInfoPreference", "startLoad or mLoadingView is null");
      AppMethodBeat.o(23837);
    }
    while (true)
    {
      return;
      if (this.iQO)
      {
        ab.i("MicroMsg.NewBizBindWxaInfoPreference", "startLoad has load.");
        AppMethodBeat.o(23837);
      }
      else
      {
        this.iQO = true;
        cw(this.iQN);
        c(this.iDW, null);
        this.iDW.dKS();
        azx();
        AppMethodBeat.o(23837);
      }
    }
  }

  public final void a(d paramd, List<WxaAttributes.WxaEntryInfo> paramList)
  {
    AppMethodBeat.i(23836);
    this.pkW = paramd;
    if (this.iUl == null)
      this.iUl = new LinkedList();
    while (true)
    {
      if ((paramList != null) && (!paramList.isEmpty()))
        this.iUl.addAll(paramList);
      ou();
      AppMethodBeat.o(23836);
      return;
      this.iUl.clear();
    }
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23834);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(23834);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23835);
    super.onBindView(paramView);
    this.iQN = paramView.findViewById(2131822973);
    this.iDW = ((ThreeDotsLoadingView)paramView.findViewById(2131822975));
    this.iMd = ((AppBrandNearbyShowcaseView)paramView.findViewById(2131822974));
    this.iMd.setIconSize(eop + eor * 2);
    this.iMd.setIconGap(eoq);
    ou();
    AppMethodBeat.o(23835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizBindWxaInfoPreference
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Switch;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.c;
import com.tencent.mm.api.e;
import com.tencent.mm.api.g;
import com.tencent.mm.api.s.a;
import com.tencent.mm.api.t;
import com.tencent.mm.api.u;
import com.tencent.mm.br.b;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ae;
import com.tencent.mm.view.footer.SelectColorBar;

public abstract class a extends c
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private s.a ccP;
  public boolean ccT = true;
  private com.tencent.mm.view.b.a ccv;
  private b cjc;
  private View iJO;
  private Button lXI;
  private Button oDB;
  public ChatFooterPanel odY;
  protected e[] zZM;
  private View zZN;
  private com.tencent.mm.view.footer.a zZO;
  private View zZP;
  private View zZQ;
  private PhotoEditText zZR;
  private Switch zZS;
  private boolean zZT = true;

  public a(Context paramContext, s.a parama)
  {
    super(paramContext);
    this.ccP = parama;
    getPresenter().a(getConfig());
    removeAllViews();
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    addView(getBaseBoardView(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, (int)getResources().getDimension(2131428404));
    paramContext.gravity = 80;
    addView(getFooterBg(), paramContext);
    addView(getBaseFooterView(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    getTextEditView().setVisibility(8);
    addView(getTextEditView(), paramContext);
    getViewTreeObserver().addOnGlobalLayoutListener(this);
    paramContext = new FrameLayout.LayoutParams(-1, -2);
    paramContext.gravity = 80;
    getRubbishView().setVisibility(8);
    addView(getRubbishView(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, (int)getResources().getDimension(2131428342));
    paramContext.gravity = 80;
    addView(getChatFooterPanel(), paramContext);
    new FrameLayout.LayoutParams(-1, (int)getResources().getDimension(2131427562)).gravity = 48;
    if (this.ccP.ccT)
      addView(getActionBar());
  }

  protected abstract com.tencent.mm.view.b.a dMG();

  protected abstract com.tencent.mm.view.footer.a dMH();

  public View getActionBar()
  {
    if (this.iJO == null)
    {
      this.iJO = LayoutInflater.from(getContext()).inflate(2130970362, null);
      if (!ae.hD(getContext()))
        break label122;
    }
    label122: for (int i = ae.hC(getContext()) + 0; ; i = 0)
    {
      this.iJO.setPadding(0, i, 0, 0);
      this.oDB = ((Button)this.iJO.findViewById(2131826543));
      this.oDB.setOnClickListener(new a.1(this));
      this.lXI = ((Button)this.iJO.findViewById(2131826542));
      this.lXI.setOnClickListener(new a.6(this));
      return this.iJO;
    }
  }

  public <T extends com.tencent.mm.view.b.a> T getBaseBoardView()
  {
    if (this.ccv == null)
      this.ccv = dMG();
    return this.ccv;
  }

  public <T extends com.tencent.mm.view.footer.a> T getBaseFooterView()
  {
    if (this.zZO == null)
      this.zZO = dMH();
    return this.zZO;
  }

  public ChatFooterPanel getChatFooterPanel()
  {
    boolean bool = false;
    if (this.odY == null);
    try
    {
      this.odY = u.aR(getContext());
      this.odY.setEntranceScene(ChatFooterPanel.vhk);
      this.odY.setBackgroundResource(2130837979);
      this.odY.AE();
      this.odY.bf(true);
      this.odY.j(true, true);
      this.odY.setVisibility(8);
      this.odY.onResume();
      localObject = u.AH();
      ((t)localObject).ccZ = new a.9(this);
      this.odY.setCallback((f)localObject);
      return this.odY;
    }
    catch (Exception localException)
    {
      Object localObject = localException.getMessage();
      if (getContext() == null)
        bool = true;
      ab.e("MicroMsg.BaseDrawingView", "exception:%s,getContext() is null?", new Object[] { localObject, Boolean.valueOf(bool) });
      throw localException;
    }
  }

  public s.a getConfig()
  {
    return this.ccP;
  }

  public abstract e[] getFeatures();

  public View getFooterBg()
  {
    if (this.zZN == null)
    {
      this.zZN = LayoutInflater.from(getContext()).inflate(2130969584, null);
      this.zZN.setVisibility(0);
    }
    return this.zZN;
  }

  public b getPresenter()
  {
    if (this.cjc == null)
    {
      this.cjc = new com.tencent.mm.br.a();
      this.cjc.a(this);
    }
    return this.cjc;
  }

  public View getRubbishView()
  {
    if (this.zZP == null)
      this.zZQ = LayoutInflater.from(getContext()).inflate(2130970533, null);
    return this.zZQ;
  }

  public View getTextEditView()
  {
    if (this.zZP == null)
    {
      this.zZP = LayoutInflater.from(getContext()).inflate(2130969319, null);
      this.zZR = ((PhotoEditText)this.zZP.findViewById(2131823386));
      int i = (int)this.zZR.getResources().getDimension(2131428308);
      int j = (int)this.zZR.getResources().getDimension(2131428230);
      int k = j;
      if (ae.hD(getContext()))
        k = j + ae.hC(getContext());
      this.zZR.setPadding(i, k, i, 0);
      SelectColorBar localSelectColorBar = (SelectColorBar)this.zZP.findViewById(2131823388);
      this.zZS = ((Switch)this.zZP.findViewById(2131823387));
      this.zZS.setTag(Integer.valueOf(-707825));
      this.zZS.setOnCheckedChangeListener(new a.7(this, localSelectColorBar));
      this.zZR.setTextColor(-1);
      localSelectColorBar.setSelectColor(-1);
      localSelectColorBar.setSelectColorListener(new a.8(this));
    }
    return this.zZP;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    post(new a.10(this));
  }

  public void onGlobalLayout()
  {
    if (getTextEditView().getVisibility() == 0)
    {
      getViewTreeObserver().removeOnGlobalLayoutListener(this);
      this.zZR.postDelayed(new a.5(this), 160L);
    }
  }

  public final void rj(boolean paramBoolean)
  {
    ab.i("MicroMsg.BaseDrawingView", "[hideSimleyPanel] isHide:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    Animation localAnimation;
    if ((this.odY.getVisibility() == 0) && (paramBoolean))
    {
      this.odY.setVisibility(8);
      localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034227);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          AppMethodBeat.i(116374);
          a.d(a.this).setVisibility(8);
          AppMethodBeat.o(116374);
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          AppMethodBeat.i(116373);
          a.d(a.this).setVisibility(0);
          AppMethodBeat.o(116373);
        }
      });
      this.odY.startAnimation(localAnimation);
    }
    while (true)
    {
      return;
      if ((this.odY.getVisibility() == 8) && (!paramBoolean))
      {
        localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034229);
        localAnimation.setAnimationListener(new a.4(this));
        this.odY.startAnimation(localAnimation);
      }
    }
  }

  public void setActionBarCallback(g paramg)
  {
    getPresenter().setActionBarCallback(paramg);
  }

  public void setActionBarVisible(boolean paramBoolean)
  {
    if (this.ccT == paramBoolean)
      ab.w("MicroMsg.BaseDrawingView", "[setActionBarVisible] isShowActionBar == isShow");
    while (true)
    {
      return;
      this.ccT = paramBoolean;
      Animation localAnimation;
      if (paramBoolean)
      {
        localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034125);
        localAnimation.setAnimationListener(new a.11(this));
        getActionBar().startAnimation(localAnimation);
      }
      else
      {
        localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034126);
        localAnimation.setAnimationListener(new a.12(this));
        getActionBar().startAnimation(localAnimation);
      }
    }
  }

  public void setAutoShowFooterAndBar(boolean paramBoolean)
  {
    getPresenter().setAutoShowFooterAndBar(paramBoolean);
  }

  public void setFooterBgVisible(boolean paramBoolean)
  {
    Animation localAnimation;
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034125);
      localAnimation.setAnimationListener(new a.13(this));
      getActionBar().startAnimation(localAnimation);
    }
    while (true)
    {
      return;
      localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034126);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          AppMethodBeat.i(116372);
          a.this.getFooterBg().setVisibility(8);
          a.this.getActionBar().setVisibility(8);
          AppMethodBeat.o(116372);
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
        }
      });
      getActionBar().startAnimation(localAnimation);
    }
  }

  public void setFooterVisible(boolean paramBoolean)
  {
    if (this.zZT != paramBoolean)
    {
      getBaseFooterView().setFooterVisible(paramBoolean);
      setFooterBgVisible(paramBoolean);
      this.zZT = paramBoolean;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a
 * JD-Core Version:    0.6.2
 */
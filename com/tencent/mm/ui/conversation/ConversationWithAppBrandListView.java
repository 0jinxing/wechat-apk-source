package com.tencent.mm.ui.conversation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Vibrator;
import android.support.v4.view.t;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ListView.FixedViewInfo;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.io;
import com.tencent.mm.g.a.js;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.header.GyroView;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.plugin.appbrand.widget.header.a.a.b;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.e;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import com.tencent.mm.plugin.appbrand.widget.recentview.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.ak;
import java.util.Iterator;
import java.util.LinkedList;

public class ConversationWithAppBrandListView extends ListView
  implements AbsListView.OnScrollListener, AppBrandRecentView.e
{
  private View Ek;
  private int anK;
  private int anL;
  private int anM;
  private boolean bZi;
  private boolean cAY;
  private boolean hasInit;
  private boolean iVX;
  private Vibrator iVt;
  private MMFragmentActivity iWA;
  private GyroView iWd;
  private b jat;
  private float jcW;
  private float lbS;
  private float lbT;
  private int mTouchSlop;
  private AbsListView.OnScrollListener nSS;
  private ValueAnimator rD;
  private LinkedList<ListView.FixedViewInfo> zrX;
  private View zsA;
  private AppBrandRecentView zsB;
  private boolean zsC;
  private Paint zsD;
  private Paint zsE;
  private String zsF;
  private float zsG;
  private com.tencent.mm.plugin.appbrand.widget.header.a.a zsH;
  private boolean zsI;
  private boolean zsJ;
  private boolean zsK;
  private float zsL;
  private float zsM;
  private int zsN;
  private boolean zsO;
  private com.tencent.mm.plugin.appbrand.widget.header.a zsP;
  private Runnable zsQ;
  private boolean zsR;
  private float zsS;
  private j zsT;
  private j zsU;
  private j zsV;
  private c<js> zsW;
  private int zsX;
  boolean zsY;
  private final c<io> zsZ;
  private View zst;
  private HeaderContainer zsz;
  private ConversationWithAppBrandListView.a zta;
  private int ztb;
  private float ztc;
  private float ztd;
  private float zte;
  private float ztf;
  private boolean ztg;
  private boolean zth;
  private boolean zti;
  private boolean ztj;
  private boolean ztk;
  private Runnable ztl;
  private Runnable ztm;
  private boolean ztn;
  private boolean zto;
  private int ztp;

  public ConversationWithAppBrandListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(34294);
    this.zrX = new LinkedList();
    this.zsC = false;
    this.zsI = false;
    this.zsJ = false;
    this.zsK = false;
    this.zsL = 0.0F;
    this.zsM = 0.0F;
    this.zsN = 0;
    this.zsO = false;
    this.zsQ = null;
    this.zsR = true;
    this.zsS = 0.0F;
    this.zsT = null;
    this.zsU = null;
    this.zsV = null;
    this.zsW = new ConversationWithAppBrandListView.1(this);
    this.bZi = true;
    this.zsX = 0;
    this.zsY = false;
    this.anK = -1;
    this.zsZ = new ConversationWithAppBrandListView.21(this);
    this.zta = new ConversationWithAppBrandListView.a(this);
    this.ztb = 0;
    this.zte = 0.0F;
    this.ztf = 0.0F;
    this.zth = false;
    this.ztj = false;
    this.ztk = false;
    this.ztm = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(34284);
        ConversationWithAppBrandListView.o(ConversationWithAppBrandListView.this);
        ConversationWithAppBrandListView.p(ConversationWithAppBrandListView.this);
        ConversationWithAppBrandListView.q(ConversationWithAppBrandListView.this);
        AppMethodBeat.o(34284);
      }
    };
    this.iVX = false;
    this.ztn = false;
    this.zto = false;
    this.hasInit = false;
    this.zsT = new j(getContext().getResources().getColor(2131689691), getContext().getResources().getColor(2131689690));
    this.zsW.dnU();
    AppMethodBeat.o(34294);
  }

  private boolean P(MotionEvent paramMotionEvent)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(34322);
    if (!dIF())
      AppMethodBeat.o(34322);
    while (true)
    {
      return bool;
      if (paramMotionEvent.getAction() == 0)
      {
        this.ztf = paramMotionEvent.getY();
        if (this.rD != null)
          this.rD.cancel();
      }
      label52: float f3;
      try
      {
        if (((paramMotionEvent.getAction() != 2) || (Math.abs(paramMotionEvent.getY() - this.lbT) <= 2.0F) || (getFirstVisiblePosition() != 0) || (this.zsz.getTop() != 0)) && (getChildTranslationY() == 0.0F))
          break label587;
        qI(true);
        if ((getHeight() - getTabViewHeight() - this.ztb) / 2 <= this.zte)
          qJ(false);
        while (true)
        {
          float f1 = paramMotionEvent.getY();
          float f2 = this.ztf;
          f3 = getHeight() - getTabViewHeight() - this.ztb;
          this.zte = ((f1 - f2) * 0.4F + this.zte);
          if (this.zte >= 0.0F)
            break label490;
          this.zte = 0.0F;
          dID();
          invalidate();
          this.ztf = paramMotionEvent.getY();
          AppMethodBeat.o(34322);
          break;
          if (paramMotionEvent.getActionMasked() == 5)
          {
            this.ztf = paramMotionEvent.getY();
            break label52;
          }
          if (((paramMotionEvent.getAction() != 1) && (paramMotionEvent.getAction() != 3)) || (this.zsz.getTop() != 0) || (getChildTranslationY() == 0.0F))
            break label52;
          qJ(true);
          this.zth = false;
          ab.d("MicroMsg.ConversationWithAppBrandListView", "[animationChild] offset:%s delay:%s duration%s", new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(180) });
          if (!dIF())
            break label52;
          if (this.rD != null)
            this.rD.cancel();
          this.rD = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("deltaY", new float[] { getChildTranslationY() + 0.0F, 0.0F }), PropertyValuesHolder.ofFloat("headerDeltaY", new float[] { getHeaderY() + 0.0F, 0.0F }) });
          this.rD.setDuration(180L);
          this.rD.addUpdateListener(new ConversationWithAppBrandListView.10(this));
          this.rD.addListener(new ConversationWithAppBrandListView.12(this));
          this.rD.setStartDelay(0L);
          this.rD.start();
          break label52;
          qJ(true);
        }
      }
      finally
      {
        this.ztf = paramMotionEvent.getY();
        AppMethodBeat.o(34322);
      }
      label490: int j = i;
      if (f3 < this.zte)
      {
        this.zte = f3;
        j = i;
      }
      if (j < getChildCount())
      {
        if (j == 0)
          getChildAt(j).setTranslationY(this.zte * 0.5F);
        while (true)
        {
          j++;
          break;
          getChildAt(j).setTranslationY(this.zte);
        }
      }
      invalidate();
      this.ztf = paramMotionEvent.getY();
      AppMethodBeat.o(34322);
      bool = true;
      continue;
      label587: this.ztf = paramMotionEvent.getY();
      AppMethodBeat.o(34322);
    }
  }

  private void Ps(int paramInt)
  {
    AppMethodBeat.i(34325);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[closeAppBrandRecentView] isOpenAppBrandRecentView:%s type:%s", new Object[] { Boolean.valueOf(this.zti), Integer.valueOf(paramInt) });
    if ((this.zti) && (getChildAt(0) != null) && (this.jat != null) && (this.zsH != null))
    {
      this.jat.N(this.zsH.getRecentAppBrandCount(), this.zsH.getStarAppBrandCount(), paramInt);
      this.zsH.qu(paramInt);
    }
    View localView;
    if (getFirstVisiblePosition() == 0)
    {
      localView = getChildAt(0);
      if (localView != null)
        break label171;
    }
    label171: for (paramInt = 0; ; paramInt = localView.getBottom())
    {
      if (paramInt != 0)
        smoothScrollToPositionFromTop(getFirstHeaderVisible(), 0, 150);
      dID();
      qI(true);
      setOpenAppBrandRecentView(false);
      al.n(new ConversationWithAppBrandListView.9(this), 500L);
      AppMethodBeat.o(34325);
      return;
    }
  }

  private float Pt(int paramInt)
  {
    AppMethodBeat.i(34336);
    ab.d("MicroMsg.ConversationWithAppBrandListView", "[isFull] totalItemCount:" + paramInt + " getFirstVisiblePosition:" + getFirstVisiblePosition() + " getLastVisiblePosition:" + getLastVisiblePosition() + " getHeaderViewsCount:" + getHeaderViewsCount() + " getFooterViewsCount:" + getFooterViewsCount());
    int i = (int)getResources().getDimension(2131427811);
    paramInt = paramInt - getHeaderViewsCount() - getFooterViewsCount();
    float f = getMeasuredHeight() - i * paramInt;
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[isFull] height:%s rawCount:%s extraHeight:%s", new Object[] { Integer.valueOf(getHeight()), Integer.valueOf(paramInt), Float.valueOf(f) });
    AppMethodBeat.o(34336);
    return f;
  }

  private void dIA()
  {
    AppMethodBeat.i(34314);
    if (this.zsO)
      AppMethodBeat.o(34314);
    while (true)
    {
      return;
      if (g.K(d.class) != null)
      {
        this.zsz = ((d)g.K(d.class)).df(this.iWA);
        this.zsO = true;
        this.zsz.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        this.zsA = this.zsz.findViewById(2131821163);
        this.zsA.setVisibility(8);
        this.iWd = this.zsz.getGyroView();
        this.zsH = this.zsz.getHeaderView();
        this.zsH.setCollectionRefreshListener(new ConversationWithAppBrandListView.4(this));
        this.zsH.setUsageRefreshListener(new ConversationWithAppBrandListView.5(this));
        this.zsH.setIOnLaunchUIListener(new a.b()
        {
          public final void aQg()
          {
            AppMethodBeat.i(34271);
            ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo onLaunchCollectionUI");
            ConversationWithAppBrandListView.this.J(300L, 10);
            AppMethodBeat.o(34271);
          }

          public final void aQh()
          {
            AppMethodBeat.i(34272);
            ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo onLaunchUsageUI");
            ConversationWithAppBrandListView.this.J(300L, 9);
            AppMethodBeat.o(34272);
          }
        });
        this.zsH.setOnEmptyViewListener(new ConversationWithAppBrandListView.7(this));
        this.zsH.setReporter(this.jat);
        this.Ek = this.zsz.getEmptyView();
        this.zrX.remove(this.zsz);
        ListView.FixedViewInfo localFixedViewInfo = new ListView.FixedViewInfo(this);
        localFixedViewInfo.view = this.zsz;
        localFixedViewInfo.data = null;
        localFixedViewInfo.isSelectable = true;
        this.zrX.addFirst(localFixedViewInfo);
        Iterator localIterator = this.zrX.iterator();
        while (localIterator.hasNext())
        {
          localFixedViewInfo = (ListView.FixedViewInfo)localIterator.next();
          super.addHeaderView(localFixedViewInfo.view, localFixedViewInfo.data, localFixedViewInfo.isSelectable);
        }
      }
      ab.e("MicroMsg.ConversationWithAppBrandListView", "alvinluo addAppBrandHalfView error");
      AppMethodBeat.o(34314);
      continue;
      this.zsH.refresh();
      AppMethodBeat.o(34314);
    }
  }

  private void dIB()
  {
    AppMethodBeat.i(34323);
    if (!this.zti)
    {
      ay.gL(getContext());
      if ((this.jat != null) && (this.zsH != null))
        this.jat.dw(this.zsH.getRecentAppBrandCount(), this.zsH.getStarAppBrandCount());
      if (this.zsH != null)
        this.zsH.aQc();
    }
    if ((this.zsY) && (this.zsB != null))
    {
      this.zsB.getAdapter().aop.notifyChanged();
      this.zsY = true;
    }
    super.smoothScrollToPositionFromTop(0, 0, 250);
    qI(true);
    setOpenAppBrandRecentView(true);
    dIC();
    AppMethodBeat.o(34323);
  }

  private void dIC()
  {
    AppMethodBeat.i(34324);
    if (this.zsH != null)
      this.zsH.aQd();
    AppMethodBeat.o(34324);
  }

  private void dID()
  {
    AppMethodBeat.i(34328);
    for (int i = 0; i < getChildCount(); i++)
      getChildAt(i).setTranslationY(0.0F);
    this.zte = 0.0F;
    invalidate();
    AppMethodBeat.o(34328);
  }

  private void dIE()
  {
    AppMethodBeat.i(34333);
    ab.d("MicroMsg.ConversationWithAppBrandListView", "alvinluo resetAppBrandHeaderBg");
    if (this.zsD != null)
    {
      int i = this.iWA.getResources().getColor(2131689694);
      this.zsD.setColor(i);
    }
    if (this.zsP != null)
      this.zsP.a(0.0F, this.iWA.getResources().getColor(2131690310), this.iWA.getResources().getColor(2131689486), this.iWA.getResources().getColor(2131689486));
    AppMethodBeat.o(34333);
  }

  private boolean dIF()
  {
    boolean bool = true;
    AppMethodBeat.i(34339);
    if (this.zsA != null)
      if ((qL(true)) && (this.zsA.getVisibility() == 0))
        AppMethodBeat.o(34339);
    while (true)
    {
      return bool;
      AppMethodBeat.o(34339);
      bool = false;
      continue;
      AppMethodBeat.o(34339);
      bool = false;
    }
  }

  private void dIx()
  {
    boolean bool = false;
    AppMethodBeat.i(34308);
    int i = getFirstHeaderVisible();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.zst.getLayoutParams();
    int j = localLayoutParams.height;
    try
    {
      if (getAdapter() == null);
      for (int k = 0; ; k = getAdapter().getCount())
      {
        f1 = Pt(k);
        if (f1 < 0.0F)
          bool = true;
        f2 = f1;
        if (f1 < getTabViewHeight())
          f2 = getTabViewHeight();
        ab.i("MicroMsg.ConversationWithAppBrandListView", "[checkEmptyFooter] isRealFull:" + bool + " extraHeight:" + f2);
        if (!bool)
          break;
        localLayoutParams.height = getTabViewHeight();
        if (j != localLayoutParams.height)
        {
          this.zst.setLayoutParams(localLayoutParams);
          if (!this.bZi)
            super.setSelection(i);
        }
        AppMethodBeat.o(34308);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        float f2;
        float f1 = 0.0F;
        continue;
        localLayoutParams.height = ((int)f2);
        if (this.bZi)
          post(new ConversationWithAppBrandListView.3(this));
      }
    }
  }

  private boolean dIy()
  {
    AppMethodBeat.i(34312);
    boolean bool;
    if ((this.zsA != null) && (this.zsH != null))
    {
      int i = this.zsz.getMeasuredHeight();
      if ((i != 0) && (i != this.ztb))
      {
        this.ztb = i;
        bool = true;
        AppMethodBeat.o(34312);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(34312);
    }
  }

  private void dIz()
  {
    AppMethodBeat.i(34313);
    if (dIy())
    {
      if (this.iWd != null)
        this.iWd.setVisibility(0);
      this.zsL = (-(this.jcW - getResources().getDimension(2131427780)));
      this.zsM = (-(this.jcW - (this.ztb / 2 - getResources().getDimension(2131427763))));
      if (!this.zsK)
      {
        if (this.zsA != null)
          this.zsA.setTranslationY(this.zsL);
        if (this.Ek != null)
          this.Ek.setTranslationY(0.0F);
        ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo initAppBrandHeaderHeight AppBrandHeader appBrandHeight: %d, setTranslationY: %s", new Object[] { Integer.valueOf(this.ztb), Float.valueOf(this.zsL) });
        AppMethodBeat.o(34313);
      }
    }
    while (true)
    {
      return;
      if (this.zsA != null)
        this.zsA.setTranslationY(0.0F);
      if (this.Ek != null)
        this.Ek.setTranslationY(this.zsM);
      ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo initAppBrandHeaderHeight emptyView appBrandHeight: %d, setTranslationY: %s", new Object[] { Integer.valueOf(this.ztb), Float.valueOf(this.zsM) });
      AppMethodBeat.o(34313);
    }
  }

  private float getChildTranslationY()
  {
    AppMethodBeat.i(34326);
    View localView = getChildAt(1);
    float f;
    if (localView == null)
    {
      f = 0.0F;
      AppMethodBeat.o(34326);
    }
    while (true)
    {
      return f;
      f = localView.getTranslationY();
      AppMethodBeat.o(34326);
    }
  }

  private View getEmptyFooter()
  {
    AppMethodBeat.i(34305);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    this.zst = new View(getContext());
    this.zst.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
    localLinearLayout.addView(this.zst);
    localLinearLayout.setBackgroundColor(getContext().getResources().getColor(2131690691));
    AppMethodBeat.o(34305);
    return localLinearLayout;
  }

  private float getHeaderY()
  {
    AppMethodBeat.i(34327);
    View localView = getChildAt(0);
    float f;
    if (localView == null)
    {
      f = 0.0F;
      AppMethodBeat.o(34327);
    }
    while (true)
    {
      return f;
      f = localView.getTranslationY();
      AppMethodBeat.o(34327);
    }
  }

  private float getRatio()
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(34334);
    if ((this.zsz != null) && (this.ztb != 0))
    {
      f1 = 1.0F - Math.abs(this.zsz.getTop() * 1.0F) / this.ztb;
      if (f1 >= 0.0F)
        break label127;
    }
    while (true)
    {
      ab.d("MicroMsg.ConversationWithAppBrandListView", "alvinluo header top: %d, header bottom: %d, ratio: %f, appBrandHeight: %d", new Object[] { Integer.valueOf(this.zsz.getTop()), Integer.valueOf(this.zsz.getBottom()), Float.valueOf(f2), Integer.valueOf(this.ztb) });
      AppMethodBeat.o(34334);
      while (true)
      {
        return f2;
        AppMethodBeat.o(34334);
        f2 = f1;
      }
      label127: f2 = f1;
    }
  }

  private int getTabViewHeight()
  {
    AppMethodBeat.i(34307);
    if (this.zsN == 0)
    {
      View localView = getRootView().findViewById(2131820634);
      if (localView != null)
      {
        ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo initTabViewHeight tabView.getHeight: %d", new Object[] { Integer.valueOf(localView.getHeight()) });
        this.zsN = localView.getHeight();
      }
    }
    int i = this.zsN;
    AppMethodBeat.o(34307);
    return i;
  }

  private void qH(boolean paramBoolean)
  {
    AppMethodBeat.i(34306);
    if ((this.zst == null) || (!qL(true)))
      AppMethodBeat.o(34306);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        postDelayed(new ConversationWithAppBrandListView.2(this), 0L);
        AppMethodBeat.o(34306);
      }
      else
      {
        dIx();
        AppMethodBeat.o(34306);
      }
    }
  }

  private void qI(boolean paramBoolean)
  {
    AppMethodBeat.i(34309);
    if (paramBoolean)
    {
      al.af(this.zta);
      AppMethodBeat.o(34309);
    }
    while (true)
    {
      return;
      al.af(this.zta);
      al.n(this.zta, 1000L);
      AppMethodBeat.o(34309);
    }
  }

  private void qJ(boolean paramBoolean)
  {
    AppMethodBeat.i(34331);
    if ((paramBoolean) && (this.ztl != null))
    {
      al.af(this.ztl);
      this.ztl = null;
      if (!this.ztk)
        break label80;
      qK(false);
      AppMethodBeat.o(34331);
    }
    while (true)
    {
      return;
      if ((!paramBoolean) && (this.ztl == null))
      {
        ConversationWithAppBrandListView.13 local13 = new ConversationWithAppBrandListView.13(this);
        this.ztl = local13;
        al.n(local13, 3000L);
      }
      label80: AppMethodBeat.o(34331);
    }
  }

  private void qK(boolean paramBoolean)
  {
    AppMethodBeat.i(34332);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[showTipWithAnim] isShow:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    ValueAnimator localValueAnimator;
    if (paramBoolean)
    {
      this.ztk = true;
      localValueAnimator = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("alpha", new int[] { 0, 77 }) });
      localValueAnimator.setDuration(200L);
      localValueAnimator.addUpdateListener(new ConversationWithAppBrandListView.14(this));
      localValueAnimator.start();
      if (this.jat != null)
        this.jat.aRY();
      AppMethodBeat.o(34332);
    }
    while (true)
    {
      return;
      localValueAnimator = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("alpha", new int[] { 77, 0 }) });
      localValueAnimator.setDuration(200L);
      localValueAnimator.addUpdateListener(new ConversationWithAppBrandListView.15(this));
      localValueAnimator.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
        }

        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          AppMethodBeat.i(34283);
          ConversationWithAppBrandListView.n(ConversationWithAppBrandListView.this);
          AppMethodBeat.o(34283);
        }

        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
        }

        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
        }
      });
      localValueAnimator.start();
      AppMethodBeat.o(34332);
    }
  }

  private boolean qL(boolean paramBoolean)
  {
    AppMethodBeat.i(34338);
    if (((!this.hasInit) || (!paramBoolean)) && (g.K(d.class) != null))
    {
      g.K(d.class);
      this.zsC = true;
      ab.i("MicroMsg.ConversationWithAppBrandListView", "[isAppBrandHeaderEnable] :%s", new Object[] { Boolean.valueOf(this.zsC) });
      this.hasInit = true;
    }
    paramBoolean = this.zsC;
    AppMethodBeat.o(34338);
    return paramBoolean;
  }

  private void setEmptyViewVisible(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(34310);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[setEmptyViewVisible] isShow:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    View localView;
    if (this.Ek != null)
    {
      localView = this.Ek;
      if (paramBoolean)
      {
        j = 0;
        localView.setVisibility(j);
      }
    }
    else if (this.zsA != null)
    {
      localView = this.zsA.findViewById(2131821501);
      if (localView != null)
        if (paramBoolean)
          break label102;
    }
    label102: for (int j = i; ; j = 4)
    {
      localView.setVisibility(j);
      AppMethodBeat.o(34310);
      return;
      j = 8;
      break;
    }
  }

  private void setOpenAppBrandRecentView(boolean paramBoolean)
  {
    this.zti = paramBoolean;
  }

  public final void J(long paramLong, int paramInt)
  {
    AppMethodBeat.i(34303);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[hideAppBrandRecentView] delay:%s, type: %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    if (!qL(true))
    {
      if (this.zsA != null)
        this.zsA.setVisibility(8);
      AppMethodBeat.o(34303);
    }
    while (true)
    {
      return;
      if (getFirstVisiblePosition() == 0)
        break;
      AppMethodBeat.o(34303);
    }
    if ((this.jat != null) && (this.zsH != null))
    {
      this.jat.N(this.zsH.getRecentAppBrandCount(), this.zsH.getStarAppBrandCount(), paramInt);
      this.zsH.qu(paramInt);
    }
    if (paramLong > 0L)
    {
      if (this.zsQ != null)
        removeCallbacks(this.zsQ);
      this.zsQ = new ConversationWithAppBrandListView.24(this);
      postDelayed(this.zsQ, paramLong);
    }
    while (true)
    {
      dID();
      AppMethodBeat.o(34303);
      break;
      if (this.zsH != null)
        this.zsH.aQb();
      if (this.zsB != null)
        this.zsB.smoothScrollToPosition(0);
      setSelection(0);
      ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo resetAppBrandHeaderBg");
      dIE();
    }
  }

  public void addHeaderView(View paramView, Object paramObject, boolean paramBoolean)
  {
    AppMethodBeat.i(34300);
    ListView.FixedViewInfo localFixedViewInfo = new ListView.FixedViewInfo(this);
    localFixedViewInfo.view = paramView;
    localFixedViewInfo.data = paramObject;
    localFixedViewInfo.isSelectable = paramBoolean;
    this.zrX.add(localFixedViewInfo);
    if (getAdapter() != null)
      super.addHeaderView(localFixedViewInfo.view, localFixedViewInfo.data, localFixedViewInfo.isSelectable);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo addHeaderView %d", new Object[] { Integer.valueOf(this.zrX.size()) });
    AppMethodBeat.o(34300);
  }

  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(34319);
    if ((qL(true)) && (getFirstVisiblePosition() == 0) && (paramInt2 < 0))
    {
      paramArrayOfInt1[1] = ((int)(paramInt2 / 3.0F));
      super.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
      AppMethodBeat.o(34319);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
      AppMethodBeat.o(34319);
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(34320);
    try
    {
      if (paramMotionEvent.getAction() == 0)
      {
        float f = paramMotionEvent.getX();
        this.lbS = f;
        this.ztc = f;
        f = paramMotionEvent.getY();
        this.lbT = f;
        this.ztd = f;
      }
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      return bool;
    }
    finally
    {
      this.lbS = paramMotionEvent.getX();
      this.lbT = paramMotionEvent.getY();
      AppMethodBeat.o(34320);
    }
  }

  public int getFirstHeaderVisible()
  {
    AppMethodBeat.i(34337);
    Iterator localIterator = this.zrX.iterator();
    int i = 0;
    int j;
    while (true)
      if (localIterator.hasNext())
      {
        ListView.FixedViewInfo localFixedViewInfo = (ListView.FixedViewInfo)localIterator.next();
        if (localFixedViewInfo.view == this.zsz)
        {
          i++;
        }
        else if ((localFixedViewInfo.view != null) && ((localFixedViewInfo.view instanceof ViewGroup)))
        {
          j = 0;
          label72: if (j < ((ViewGroup)localFixedViewInfo.view).getChildCount())
          {
            View localView = ((ViewGroup)localFixedViewInfo.view).getChildAt(j);
            if (((localView != null) && (localView.getHeight() > 0)) || (localView.getVisibility() == 0))
            {
              ab.i("MicroMsg.ConversationWithAppBrandListView", "[getFirstHeaderVisible] index:%s", new Object[] { Integer.valueOf(i) });
              AppMethodBeat.o(34337);
            }
          }
        }
      }
    while (true)
    {
      return i;
      j++;
      break label72;
      i++;
      break;
      ab.i("MicroMsg.ConversationWithAppBrandListView", "[getFirstHeaderVisible] index:%s, size: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.zrX.size()) });
      AppMethodBeat.o(34337);
    }
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(34298);
    super.onConfigurationChanged(paramConfiguration);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[onConfigurationChanged] orientation:%s", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    this.zsY = true;
    qH(true);
    if (this.zsH != null)
      this.zsH.a(paramConfiguration);
    this.zsR = false;
    AppMethodBeat.o(34298);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(34329);
    super.onDraw(paramCanvas);
    if ((getFirstVisiblePosition() == 0) && (this.zsz != null))
    {
      paramCanvas.drawRect(0.0F, 0.0F, getWidth(), this.zsz.getBottom() + this.zte, this.zsD);
      if (getChildAt(1) != null)
        if ((getHeight() == 0) || (!this.ztk))
          break label150;
    }
    label150: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        float f1 = (getWidth() - this.zsG) / 2.0F;
        float f2 = this.zsz.getBottom();
        float f3 = this.zte;
        float f4 = getResources().getDimension(2131427785);
        paramCanvas.drawText(this.zsF, f1, f2 + f3 - f4, this.zsE);
      }
      AppMethodBeat.o(34329);
      return;
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(34299);
    if (getFirstVisiblePosition() != 0)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(34299);
    }
    while (true)
    {
      return bool;
      i = paramMotionEvent.getActionMasked();
      j = paramMotionEvent.getActionIndex();
      switch (i)
      {
      case 1:
      case 3:
      case 4:
      default:
        bool = super.onInterceptTouchEvent(paramMotionEvent);
        AppMethodBeat.o(34299);
        break;
      case 0:
        this.anK = paramMotionEvent.getPointerId(0);
        this.anL = ((int)(paramMotionEvent.getX() + 0.5F));
        this.anM = ((int)(paramMotionEvent.getY() + 0.5F));
        bool = super.onInterceptTouchEvent(paramMotionEvent);
        AppMethodBeat.o(34299);
        break;
      case 5:
        this.anK = paramMotionEvent.getPointerId(j);
        this.anL = ((int)(paramMotionEvent.getX(j) + 0.5F));
        this.anM = ((int)(paramMotionEvent.getY(j) + 0.5F));
        bool = super.onInterceptTouchEvent(paramMotionEvent);
        AppMethodBeat.o(34299);
        break;
      case 2:
        j = paramMotionEvent.findPointerIndex(this.anK);
        if (j >= 0)
          break label224;
        AppMethodBeat.o(34299);
      }
    }
    label224: int i = (int)(paramMotionEvent.getX(j) + 0.5F);
    int k = (int)(paramMotionEvent.getY(j) + 0.5F);
    int j = this.anL;
    k -= this.anM;
    if ((Math.abs(k) > this.mTouchSlop) && (Math.abs(k) >= Math.abs(i - j)));
    for (i = 1; ; i = 0)
    {
      if ((i != 0) && (super.onInterceptTouchEvent(paramMotionEvent)))
      {
        AppMethodBeat.o(34299);
        bool = true;
        break;
      }
      AppMethodBeat.o(34299);
      break;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(34297);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (qL(true)))
      if (this.bZi)
      {
        qH(true);
        post(new ConversationWithAppBrandListView.20(this));
        this.zsX = paramInt4;
        this.bZi = false;
        AppMethodBeat.o(34297);
      }
    while (true)
    {
      return;
      if ((!this.cAY) && (this.zsX != paramInt4))
      {
        ab.i("MicroMsg.ConversationWithAppBrandListView", "[onLayout] mLastBottom:" + this.zsX + " b:" + paramInt4);
        qH(true);
        this.zsX = paramInt4;
      }
      AppMethodBeat.o(34297);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34311);
    super.onMeasure(paramInt1, paramInt2);
    dIz();
    AppMethodBeat.o(34311);
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(34335);
    if (this.nSS != null)
      this.nSS.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if (!qL(true))
      AppMethodBeat.o(34335);
    while (true)
    {
      return;
      dIz();
      if (this.ztb != 0)
        break;
      AppMethodBeat.o(34335);
    }
    ab.v("MicroMsg.ConversationWithAppBrandListView", "alvinluo onScroll firstVisibleItem: %d, visibleItemCount: %d, totalItemCount: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    float f2;
    Object localObject;
    View localView;
    if (paramInt1 == 0)
    {
      float f1 = getRatio();
      if ((this.zsS == 0.0F) || (this.zsS == 1.0F) || (Math.abs(f1 - this.zsS) >= 0.01D))
      {
        this.zsS = f1;
        f2 = f1;
        if (this.zsz != null)
        {
          if ((this.zsz.getTop() != 0) || (this.zsR))
            break label390;
          f2 = 0.0F;
        }
      }
      while (true)
      {
        if (this.zsT != null)
        {
          localObject = this.zsT;
          paramInt2 = Color.argb(255, (int)(((j)localObject).zuy + ((((j)localObject).zuB - ((j)localObject).zuy) * f2 + 0.5D)), (int)(((j)localObject).zuz + ((((j)localObject).zuC - ((j)localObject).zuz) * f2 + 0.5D)), (int)(((j)localObject).zuA + ((((j)localObject).zuD - ((j)localObject).zuA) * f2 + 0.5D)));
          if (this.zsD != null)
            this.zsD.setColor(paramInt2);
          if (this.zsA != null)
            this.zsA.setBackgroundColor(paramInt2);
          if (this.zsP != null)
            this.zsP.a(f2, paramInt2, 0, 0);
        }
        qI(false);
        paramAbsListView = paramAbsListView.getChildAt(0);
        if ((paramAbsListView == null) || (!(paramAbsListView instanceof HeaderContainer)))
          break label642;
        localView = paramAbsListView.findViewById(2131821163);
        if ((localView != null) && (localView.getVisibility() != 8))
          break label416;
        AppMethodBeat.o(34335);
        break;
        label390: f2 = f1;
        if (this.zsz.getTop() != 0)
        {
          this.zsR = true;
          f2 = f1;
        }
      }
      label416: localObject = ((HeaderContainer)paramAbsListView).getGyroView();
      ab.v("MicroMsg.ConversationWithAppBrandListView", "alvinluo appBrandHeaderTransH: %s, emptyTransH: %s, headerParent.bottom: %s, translationY: %f, mAppBrandHeight: %d", new Object[] { Float.valueOf(this.zsL), Float.valueOf(this.zsM), Integer.valueOf(paramAbsListView.getBottom()), Float.valueOf(localView.getTranslationY()), Integer.valueOf(this.ztb) });
      if (paramAbsListView.getBottom() <= 3)
      {
        if (!this.zsK)
        {
          localView.setTranslationY(this.zsL);
          label513: if (((GyroView)localObject).getVisibility() == 0)
          {
            ((GyroView)localObject).setVerticalScroll(0.0F);
            ((GyroView)localObject).setVisibility(8);
          }
          this.zto = false;
        }
      }
      else
      {
        if ((paramAbsListView.getBottom() <= 3) || (paramAbsListView.getBottom() > this.jcW) || ((localView.getTranslationY() == 0.0F) && ((this.Ek == null) || (this.Ek.getTranslationY() == 0.0F))))
          break label751;
        if (((GyroView)localObject).getVisibility() == 8)
          ((GyroView)localObject).setVisibility(0);
        ((GyroView)localObject).setAlpha(1.0F);
        ((GyroView)localObject).setTranslationY(-paramAbsListView.getBottom() / 2 + ((GyroView)localObject).getHeight() / 2);
        ((GyroView)localObject).setVerticalScroll(paramAbsListView.getBottom());
      }
    }
    label642: label1125: 
    while (true)
    {
      this.ztp = paramInt1;
      if ((this.ztn) && (this.iVX) && (paramInt1 == 0))
      {
        ab.e("MicroMsg.ConversationWithAppBrandListView", "[Stop fling!]");
        smoothScrollBy(0, 0);
        post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(34285);
            View localView = ConversationWithAppBrandListView.this.getChildAt(0);
            if (localView == null);
            for (int i = 0; ; i = localView.getBottom())
            {
              ab.i("MicroMsg.ConversationWithAppBrandListView", "[smoothScrollBy] offset: ".concat(String.valueOf(i)));
              ConversationWithAppBrandListView.this.smoothScrollToPositionFromTop(ConversationWithAppBrandListView.this.getFirstHeaderVisible(), 0, 300);
              ConversationWithAppBrandListView.q(ConversationWithAppBrandListView.this);
              AppMethodBeat.o(34285);
              return;
            }
          }
        });
        this.ztn = false;
      }
      al.af(this.ztm);
      al.n(this.ztm, 50L);
      AppMethodBeat.o(34335);
      break;
      if (this.Ek != null)
        this.Ek.setTranslationY(this.zsM);
      localView.setTranslationY(0.0F);
      break label513;
      label751: if ((paramAbsListView.getBottom() > this.jcW) && ((localView.getTranslationY() != 0.0F) || ((this.Ek != null) && (this.Ek.getTranslationY() != 0.0F))))
      {
        f2 = (float)(1.0D * (paramAbsListView.getBottom() - this.jcW) / (this.ztb - this.jcW));
        ab.v("MicroMsg.ConversationWithAppBrandListView", "alvinluo checkUpAppBrandHeader appbrandHeader translationY: %f, percent: %f, setTranslationY: %f, isEmpty: %b", new Object[] { Float.valueOf(localView.getTranslationY()), Float.valueOf(f2), Float.valueOf(this.zsL * (1.0F - f2)), Boolean.valueOf(this.zsK) });
        if (!this.zsK)
          localView.setTranslationY(this.zsL * (1.0F - f2));
        while (true)
        {
          ((GyroView)localObject).setTranslationY(-this.jcW / 2.0F + ((GyroView)localObject).getHeight() / 2 + (this.jcW / 2.0F + ((GyroView)localObject).getHeight()) * f2);
          ((GyroView)localObject).setAlpha(1.0F - 2.0F * f2);
          if ((!this.zto) && (1.0F != f2))
          {
            this.iVt.vibrate(10L);
            this.zto = true;
          }
          qI(true);
          break;
          if (this.Ek != null)
          {
            ab.v("MicroMsg.ConversationWithAppBrandListView", "alvinluo emptyView translationY: %f, set: %f", new Object[] { Float.valueOf(this.Ek.getTranslationY()), Float.valueOf(-this.zsM * (1.0F - f2)) });
            this.Ek.setTranslationY(this.zsM * (1.0F - f2));
          }
          localView.setTranslationY(0.0F);
        }
        if (this.zsz != null)
        {
          paramAbsListView = this.zsz.findViewById(2131821163);
          if (this.zsK)
            break label1125;
          if (paramAbsListView != null)
            paramAbsListView.setTranslationY(this.zsL);
        }
        while (true)
        {
          if ((this.ztp != 0) || (paramInt1 == 0))
            break label1153;
          Ps(4);
          qJ(true);
          qI(true);
          break;
          if (this.Ek != null)
            this.Ek.setTranslationY(this.zsM);
          if (paramAbsListView != null)
            paramAbsListView.setTranslationY(0.0F);
        }
      }
    }
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(34330);
    if (this.nSS != null)
      this.nSS.onScrollStateChanged(paramAbsListView, paramInt);
    if ((getFirstVisiblePosition() != 0) && (paramInt == 2) && (!this.ztj))
      this.iVX = true;
    AppMethodBeat.o(34330);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(34321);
    if (!qL(true))
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(34321);
      return bool;
    }
    if (paramMotionEvent.getAction() == 0)
      if (getFirstVisiblePosition() != 0)
        this.ztn = true;
    while (true)
    {
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        qI(true);
        this.ztg = false;
        if (getChildTranslationY() > 0.0F)
          dIB();
      }
      if (P(paramMotionEvent))
        break label380;
      if ((this.ztg) && (paramMotionEvent.getAction() == 2))
      {
        paramMotionEvent.setAction(0);
        super.onTouchEvent(paramMotionEvent);
        paramMotionEvent.setAction(2);
        this.ztg = false;
      }
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(34321);
      break;
      if (((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3)) && (getFirstVisiblePosition() == 0))
      {
        View localView = getChildAt(0);
        if (localView == null)
        {
          AppMethodBeat.o(34321);
          break;
        }
        if ((Math.abs(paramMotionEvent.getX() - this.lbS) < 3.0F) && (Math.abs(paramMotionEvent.getY() - this.lbT) < 3.0F))
          super.onTouchEvent(paramMotionEvent);
        if (getChildTranslationY() < 60.0F * getResources().getDisplayMetrics().density)
        {
          float f1 = Math.abs(paramMotionEvent.getX() - this.ztc);
          float f2 = Math.abs(paramMotionEvent.getY() - this.ztd);
          if (((paramMotionEvent.getY() - this.ztd < -5.0F) && (f1 - f2 < 0.0F) && (getFirstVisiblePosition() == 0)) || ((localView.getBottom() > 0) && (localView.getBottom() < this.jcW)))
            Ps(4);
          else if ((localView.getBottom() >= this.jcW) && (paramMotionEvent.getY() - this.ztd > 5.0F))
            dIB();
        }
      }
    }
    label380: if (paramMotionEvent.getAction() == 0)
      super.onTouchEvent(paramMotionEvent);
    while (true)
    {
      AppMethodBeat.o(34321);
      break;
      if ((paramMotionEvent.getAction() == 2) && (!this.ztg) && (Math.abs(paramMotionEvent.getY() - this.lbT) > 2.0F))
      {
        paramMotionEvent.setAction(3);
        super.onTouchEvent(paramMotionEvent);
        this.ztg = true;
      }
      else if (!this.ztg)
      {
        super.onTouchEvent(paramMotionEvent);
      }
    }
  }

  public final void qs(int paramInt)
  {
    AppMethodBeat.i(34304);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[next] size:%s isAppBrandHeaderEnable:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.zsC) });
    if (!qL(true))
    {
      ab.w("MicroMsg.ConversationWithAppBrandListView", "[next] is disable!");
      if (this.zsA != null)
        this.zsA.setVisibility(8);
      AppMethodBeat.o(34304);
      return;
    }
    if ((paramInt == 1) && (this.zsA != null))
      setEmptyViewVisible(true);
    while (true)
    {
      if ((this.zsA != null) && (this.zsA.getVisibility() == 8))
      {
        this.zsA.setVisibility(0);
        setSelection(getFirstVisiblePosition());
      }
      AppMethodBeat.o(34304);
      break;
      if ((paramInt > 1) && (this.zsA != null))
        setEmptyViewVisible(false);
    }
  }

  public void setActionBarUpdateCallback(com.tencent.mm.plugin.appbrand.widget.header.a parama)
  {
    this.zsP = parama;
  }

  public void setActivity(MMFragmentActivity paramMMFragmentActivity)
  {
    AppMethodBeat.i(34296);
    this.iWA = paramMMFragmentActivity;
    dIA();
    AppMethodBeat.o(34296);
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(34295);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[init] ");
    this.zsZ.dnU();
    this.iVt = ((Vibrator)getContext().getSystemService("vibrator"));
    this.mTouchSlop = t.a(ViewConfiguration.get(getContext()));
    this.zsD = new Paint(1);
    this.zsE = new Paint(1);
    this.zsD.setColor(getResources().getColor(2131689716));
    this.zsE.setColor(-2147483648);
    this.zsE.setTextSize(getResources().getDimension(2131427866));
    qL(false);
    if (g.K(d.class) != null)
      this.jat = ((d)g.K(d.class)).aOD();
    this.jcW = (100.0F * getResources().getDisplayMetrics().density);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo init mAnimationPadding: %f, density: %f", new Object[] { Float.valueOf(this.jcW), Float.valueOf(getResources().getDisplayMetrics().density) });
    this.zsF = getResources().getString(2131298785);
    this.zsG = this.zsE.measureText(this.zsF);
    super.setOnScrollListener(this);
    paramListAdapter.registerDataSetObserver(new ConversationWithAppBrandListView.11(this, paramListAdapter));
    try
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
      localLayoutParams.topMargin = ak.de(getContext());
      ab.i("MicroMsg.ConversationWithAppBrandListView", "[initLayoutParams]1 ActionBar height:%s", new Object[] { Integer.valueOf(localLayoutParams.topMargin) });
      if (localLayoutParams.topMargin <= 0)
      {
        ConversationWithAppBrandListView.19 local19 = new com/tencent/mm/ui/conversation/ConversationWithAppBrandListView$19;
        local19.<init>(this, localLayoutParams);
        postDelayed(local19, 200L);
      }
      if (this.iWA != null)
        dIA();
      addFooterView(getEmptyFooter());
      super.setAdapter(paramListAdapter);
      AppMethodBeat.o(34295);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ConversationWithAppBrandListView", localException, "alvinluo initLayoutParams exception", new Object[0]);
    }
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    AppMethodBeat.i(34301);
    super.setOnItemClickListener(new ConversationWithAppBrandListView.22(this, paramOnItemClickListener));
    AppMethodBeat.o(34301);
  }

  public void setOnItemLongClickListener(final AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    AppMethodBeat.i(34302);
    super.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        boolean bool = false;
        AppMethodBeat.i(34291);
        if ((paramAnonymousInt == 0) && (ConversationWithAppBrandListView.b(ConversationWithAppBrandListView.this)))
          AppMethodBeat.o(34291);
        while (true)
        {
          return bool;
          if (paramOnItemLongClickListener != null)
          {
            bool = paramOnItemLongClickListener.onItemLongClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
            AppMethodBeat.o(34291);
          }
          else
          {
            AppMethodBeat.o(34291);
          }
        }
      }
    });
    AppMethodBeat.o(34302);
  }

  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.nSS = paramOnScrollListener;
  }

  public void setSelection(int paramInt)
  {
    AppMethodBeat.i(34315);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[setSelection] position:%s", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == 0) && (qL(true)))
    {
      paramInt = getFirstHeaderVisible();
      ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo setSelection pos: %d, appbrandHeight: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.ztb) });
      super.setSelection(paramInt);
      if ((this.jat != null) && (this.zsH != null))
      {
        this.jat.N(this.zsH.getRecentAppBrandCount(), this.zsH.getStarAppBrandCount(), 7);
        this.zsH.qu(7);
      }
      AppMethodBeat.o(34315);
    }
    while (true)
    {
      return;
      super.setSelection(paramInt);
      AppMethodBeat.o(34315);
    }
  }

  public void smoothScrollToPosition(int paramInt)
  {
    AppMethodBeat.i(34316);
    ab.d("MicroMsg.ConversationWithAppBrandListView", "[smoothScrollToPosition] position:%s", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == 0) && (qL(true)))
    {
      super.smoothScrollToPosition(getFirstHeaderVisible());
      AppMethodBeat.o(34316);
    }
    while (true)
    {
      return;
      super.smoothScrollToPosition(paramInt);
      AppMethodBeat.o(34316);
    }
  }

  public void smoothScrollToPositionFromTop(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34317);
    ab.d("MicroMsg.ConversationWithAppBrandListView", "[smoothScrollToPositionFromTop] position:%s offset:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    int i = paramInt1;
    if (paramInt1 == 0)
    {
      i = paramInt1;
      if (qL(true))
        i = getFirstHeaderVisible();
    }
    al.n(new ConversationWithAppBrandListView.8(this, i, paramInt2), 100L);
    AppMethodBeat.o(34317);
  }

  public void smoothScrollToPositionFromTop(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(34318);
    ab.d("MicroMsg.ConversationWithAppBrandListView", "[smoothScrollToPositionFromTop] position:%s offset:%s duration:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt1 == 0) && (qL(true)))
    {
      super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), paramInt2, paramInt3);
      AppMethodBeat.o(34318);
    }
    while (true)
    {
      return;
      super.smoothScrollToPositionFromTop(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(34318);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView
 * JD-Core Version:    0.6.2
 */
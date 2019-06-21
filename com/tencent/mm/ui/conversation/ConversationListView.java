package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
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
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.plugin.appbrand.widget.header.b;
import com.tencent.mm.plugin.appbrand.widget.header.b.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.ak;
import java.util.Iterator;
import java.util.LinkedList;

public class ConversationListView extends ListView
  implements View.OnTouchListener, AbsListView.OnScrollListener, b.a, AppBrandRecentView.e
{
  private int acV;
  private AdapterView.OnItemClickListener arw;
  boolean iVR;
  HeaderContainer iVo;
  private int iVu;
  private com.tencent.mm.plugin.appbrand.widget.header.a iVv;
  private View iVx;
  private MMFragmentActivity iWA;
  private int ivr;
  private View.OnTouchListener jZu;
  private int mCount;
  private Paint mPaint;
  private int mScrollState;
  private AbsListView.OnScrollListener nSS;
  private AdapterView.OnItemLongClickListener oiQ;
  private LinkedList<ListView.FixedViewInfo> zrX;
  b zrY;
  private String zrZ;
  private float zsa;
  private int zsb;
  private Bitmap zsc;
  private RectF zsd;
  private boolean zse;
  private NinePatchDrawable zsf;
  private Rect zsg;
  private final float zsh;
  private final float zsi;
  private final float zsj;
  private final float zsk;
  private final float zsl;
  private final float zsm;
  private int zsn;
  Runnable zso;
  Runnable zsp;
  Runnable zsq;
  View zsr;
  private View.OnTouchListener zss;
  View zst;
  private boolean zsu;
  private boolean zsv;

  public ConversationListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(34221);
    this.zrX = new LinkedList();
    this.mPaint = new Paint(1);
    this.zsc = null;
    this.zsd = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.zse = false;
    this.zsf = null;
    this.zsg = new Rect();
    this.zsh = com.tencent.mm.bz.a.fromDPToPix(getContext(), 30);
    this.zsi = com.tencent.mm.bz.a.fromDPToPix(getContext(), 8);
    this.zsj = com.tencent.mm.bz.a.fromDPToPix(getContext(), 24);
    this.zsk = com.tencent.mm.bz.a.fromDPToPix(getContext(), 64);
    this.zsl = 0.5F;
    this.zsm = com.tencent.mm.bz.a.fromDPToPix(getContext(), 200);
    this.zsn = 0;
    this.iVR = false;
    this.iVv = null;
    this.zso = null;
    this.zsp = null;
    this.zsq = null;
    this.ivr = 0;
    this.zss = null;
    this.zsv = false;
    init(paramContext);
    AppMethodBeat.o(34221);
  }

  public ConversationListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(34222);
    this.zrX = new LinkedList();
    this.mPaint = new Paint(1);
    this.zsc = null;
    this.zsd = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.zse = false;
    this.zsf = null;
    this.zsg = new Rect();
    this.zsh = com.tencent.mm.bz.a.fromDPToPix(getContext(), 30);
    this.zsi = com.tencent.mm.bz.a.fromDPToPix(getContext(), 8);
    this.zsj = com.tencent.mm.bz.a.fromDPToPix(getContext(), 24);
    this.zsk = com.tencent.mm.bz.a.fromDPToPix(getContext(), 64);
    this.zsl = 0.5F;
    this.zsm = com.tencent.mm.bz.a.fromDPToPix(getContext(), 200);
    this.zsn = 0;
    this.iVR = false;
    this.iVv = null;
    this.zso = null;
    this.zsp = null;
    this.zsq = null;
    this.ivr = 0;
    this.zss = null;
    this.zsv = false;
    init(paramContext);
    AppMethodBeat.o(34222);
  }

  private float Pr(int paramInt)
  {
    AppMethodBeat.i(34240);
    int i = (int)getResources().getDimension(2131427811);
    int j = getHeaderViewsCount();
    int k = getFooterViewsCount();
    float f = getMeasuredHeight() - i * (paramInt - j - k);
    ab.d("MicroMsg.ConversationListView", "alvinluo isFullScreen getMeasuredHeight: %d", new Object[] { Integer.valueOf(getMeasuredHeight()) });
    ab.i("MicroMsg.ConversationListView", "[isFullScreen] totalItemCount:" + paramInt + " getFirstVisiblePosition:" + getFirstVisiblePosition() + " getLastVisiblePosition:" + getLastVisiblePosition() + " getHeaderViewsCount:" + getHeaderViewsCount() + " getFooterViewsCount:" + getFooterViewsCount() + " extraHeight:" + f);
    AppMethodBeat.o(34240);
    return f;
  }

  private void dIu()
  {
    AppMethodBeat.i(34238);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.zst.getLayoutParams();
    int i;
    float f1;
    boolean bool;
    label41: int j;
    int k;
    label144: int m;
    float f2;
    if (getAdapter() == null)
    {
      i = 0;
      f1 = Pr(i);
      if (f1 >= 0.0F)
        break label289;
      bool = true;
      j = localLayoutParams.height;
      ab.i("MicroMsg.ConversationListView", "[checkEmptyFooter] isRealFull:" + bool + " old height:" + j);
      View localView = getRootView().findViewById(2131820634);
      if (localView != null)
        ab.i("MicroMsg.ConversationListView", "alvinluo checkEmptyFooter tabView Height: %d", new Object[] { Integer.valueOf(localView.getHeight()) });
      k = (int)getResources().getDimension(2131427811);
      if (localView == null)
        break label295;
      i = localView.getHeight();
      m = i;
      if (i <= 0)
        m = this.zsn;
      ab.d("MicroMsg.ConversationListView", "alvinluo checkEmptyFooter tabHeight: %d", new Object[] { Integer.valueOf(m) });
      if (!bool)
        break label300;
      localLayoutParams.height = m;
      f2 = f1;
    }
    while (true)
    {
      if (j != localLayoutParams.height)
      {
        ab.i("MicroMsg.ConversationListView", "alvinluo checkEmptyFooter isHeaderOpen: %b", new Object[] { Boolean.valueOf(dIv()) });
        if (((!bool) || (Math.abs(f2) <= m + k)) && (!dIv()))
        {
          ab.i("MicroMsg.ConversationListView", "[checkEmptyFooter] setSelection");
          setSelection(1);
        }
        this.zst.requestLayout();
      }
      AppMethodBeat.o(34238);
      return;
      i = getAdapter().getCount();
      break;
      label289: bool = false;
      break label41;
      label295: i = 0;
      break label144;
      label300: f2 = f1;
      if (f1 < m)
        f2 = m;
      localLayoutParams.height = ((int)f2);
    }
  }

  private boolean dIw()
  {
    boolean bool = false;
    AppMethodBeat.i(34249);
    if (this.iVo == null)
      AppMethodBeat.o(34249);
    while (true)
    {
      return bool;
      if ((this.iVo.getBottom() >= this.acV + 3) && (getFirstVisiblePosition() == 0))
      {
        bool = true;
        AppMethodBeat.o(34249);
      }
      else
      {
        AppMethodBeat.o(34249);
      }
    }
  }

  private View getEmptyFooter()
  {
    AppMethodBeat.i(34239);
    Object localObject = getRootView().findViewById(2131820634);
    int i = (int)getResources().getDimension(2131427811);
    int j;
    if (localObject != null)
    {
      j = ((View)localObject).getHeight();
      if (j > 0)
        break label124;
      j = i;
    }
    label124: 
    while (true)
    {
      localObject = new LinearLayout(getContext());
      this.zst = new View(getContext());
      this.zst.setLayoutParams(new LinearLayout.LayoutParams(-1, j));
      ((LinearLayout)localObject).addView(this.zst);
      ((LinearLayout)localObject).setBackgroundColor(getContext().getResources().getColor(2131690691));
      AppMethodBeat.o(34239);
      return localObject;
      j = 0;
      break;
    }
  }

  private int getRealCount()
  {
    AppMethodBeat.i(34231);
    int i;
    if (getAdapter() == null)
    {
      i = 1;
      AppMethodBeat.o(34231);
    }
    while (true)
    {
      return i;
      i = getAdapter().getCount() - getHeaderViewsCount() - getFooterViewsCount();
      AppMethodBeat.o(34231);
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(34224);
    this.mPaint.setAlpha(255);
    this.mPaint.setTextSize(com.tencent.mm.bz.a.am(getContext(), 2131427794));
    this.zrZ = getResources().getString(2131298338);
    this.zsa = this.mPaint.measureText(this.zrZ);
    super.setOnScrollListener(this);
    super.setOnTouchListener(this);
    setOverScrollMode(2);
    ab.i("MicroMsg.ConversationListView", "alvinluo HeaderContainer new, ConversationListView: %d", new Object[] { Integer.valueOf(hashCode()) });
    this.iVo = ((com.tencent.mm.plugin.appbrand.widget.recentview.d)g.K(com.tencent.mm.plugin.appbrand.widget.recentview.d.class)).df(paramContext);
    this.iVo.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    addHeaderView(this.iVo);
    addFooterView(getEmptyFooter());
    this.zrY = ((com.tencent.mm.plugin.appbrand.widget.recentview.d)g.K(com.tencent.mm.plugin.appbrand.widget.recentview.d.class)).a(paramContext, this, this.iVo);
    this.zrY.a(this);
    this.iVo.setAnimController(this.zrY);
    com.tencent.mm.sdk.g.d.post(new ConversationListView.1(this), "DecodeCloseIcon");
    this.zsn = ((int)(com.tencent.mm.bz.a.am(getContext(), 2131427567) * com.tencent.mm.bz.a.fY(getContext())));
    AppMethodBeat.o(34224);
  }

  public final void aPs()
  {
    AppMethodBeat.i(34233);
    ab.d("MicroMsg.ConversationListView", "[onOpenHeader]");
    this.iVR = true;
    if (this.zso != null)
      removeCallbacks(this.zso);
    ConversationListView.7 local7 = new ConversationListView.7(this);
    this.zso = local7;
    post(local7);
    AppMethodBeat.o(34233);
  }

  public final void aPt()
  {
    AppMethodBeat.i(34236);
    aPs();
    AppMethodBeat.o(34236);
  }

  public void addHeaderView(View paramView, Object paramObject, boolean paramBoolean)
  {
    AppMethodBeat.i(34247);
    super.addHeaderView(paramView, paramObject, paramBoolean);
    ListView.FixedViewInfo localFixedViewInfo = new ListView.FixedViewInfo(this);
    localFixedViewInfo.view = paramView;
    localFixedViewInfo.data = paramObject;
    localFixedViewInfo.isSelectable = paramBoolean;
    this.zrX.add(localFixedViewInfo);
    AppMethodBeat.o(34247);
  }

  protected void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(34226);
    super.attachViewToParent(paramView, paramInt, paramLayoutParams);
    if ((this.acV <= 0) && (this.zrY != null))
    {
      this.acV = (ak.de(getContext()) + ae.hB(getContext()));
      this.iVu = 0;
      this.zrY.cD(getRootView().findViewById(2131820940));
      this.zrY.setTabView(getRootView().findViewById(2131820634));
    }
    AppMethodBeat.o(34226);
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    AppMethodBeat.i(34223);
    boolean bool;
    if (this.iVo == null)
    {
      bool = super.canScrollHorizontally(paramInt);
      AppMethodBeat.o(34223);
    }
    while (true)
    {
      return bool;
      if (this.iVo.getBottom() >= this.iVo.getHeight())
      {
        bool = true;
        AppMethodBeat.o(34223);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(34223);
      }
    }
  }

  public final boolean dIv()
  {
    AppMethodBeat.i(34248);
    boolean bool;
    if ((dIw()) && (this.iVR))
    {
      bool = true;
      AppMethodBeat.o(34248);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(34248);
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(34250);
    if (this.zss != null)
      this.zss.onTouch(this, paramMotionEvent);
    try
    {
      if ((dIv()) && (this.iVo != null))
      {
        if (paramMotionEvent.getAction() == 0)
          if (!this.iVo.getBackUpFooterRect().contains((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY()))
            break label100;
        label100: for (this.zsv = true; !this.zsv; this.zsv = false)
        {
          bool = this.iVo.dispatchTouchEvent(paramMotionEvent);
          AppMethodBeat.o(34250);
          return bool;
        }
      }
    }
    catch (Exception paramMotionEvent)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ConversationListView", paramMotionEvent, "alvinluo ConversationListView dispatchTouchEvent exception", new Object[0]);
        AppMethodBeat.o(34250);
        bool = false;
        continue;
        if ((this.iVo == null) || (this.iVo.getBottom() < this.iVo.getHeight()) || (!this.iVo.isFullScreen()) || (getFirstVisiblePosition() != 0))
          break;
        if ((paramMotionEvent.getAction() == 0) && (this.iVo.getBackUpFooterRect().contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())))
          this.zsu = true;
        while (true)
          if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
          {
            if (this.zsu)
            {
              this.zsu = false;
              if (this.zrY != null)
              {
                ab.i("MicroMsg.ConversationListView", "alvinluo closeHeader by click BackUpFooterRect");
                this.zrY.qh(12);
              }
              if (paramMotionEvent.getAction() != 1)
                break label327;
              ab.i("MicroMsg.ConversationListView", "alvinluo ConversationListView cancel touch event");
              paramMotionEvent.setAction(3);
              bool = super.dispatchTouchEvent(paramMotionEvent);
              AppMethodBeat.o(34250);
              break;
              if (paramMotionEvent.getAction() != 0)
                continue;
              this.zsu = false;
              continue;
            }
            bool = super.dispatchTouchEvent(paramMotionEvent);
            AppMethodBeat.o(34250);
            break;
            label327: AppMethodBeat.o(34250);
            break;
          }
        if ((this.zrY != null) && (paramMotionEvent.getAction() == 0))
          this.zrY.F(paramMotionEvent);
        bool = super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(34250);
      }
      if ((this.zsu) && (paramMotionEvent.getAction() == 1))
      {
        ab.i("MicroMsg.ConversationListView", "alvinluo ConversationListView cancel touch event..., isHeaderOpen: %b, isHeaderVisible: %b", new Object[] { Boolean.valueOf(dIv()), Boolean.valueOf(dIw()) });
        if (dIv())
          break label476;
        this.zsu = false;
      }
    }
    while (true)
    {
      if ((paramMotionEvent.getAction() == 0) && (this.zrY != null) && (paramMotionEvent.getAction() == 0))
        this.zrY.F(paramMotionEvent);
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(34250);
      break;
      label476: paramMotionEvent.setAction(3);
    }
  }

  final void e(float paramFloat, int paramInt)
  {
    AppMethodBeat.i(34232);
    if (this.iVv != null)
      this.iVv.a(paramFloat, 0, paramInt, 0);
    AppMethodBeat.o(34232);
  }

  public int getFirstHeaderVisible()
  {
    AppMethodBeat.i(34246);
    Iterator localIterator = this.zrX.iterator();
    int i = 0;
    while (true)
      if (localIterator.hasNext())
      {
        Object localObject = (ListView.FixedViewInfo)localIterator.next();
        if (((ListView.FixedViewInfo)localObject).view == this.iVo)
        {
          i++;
        }
        else if ((((ListView.FixedViewInfo)localObject).view != null) && ((((ListView.FixedViewInfo)localObject).view instanceof ViewGroup)))
        {
          localObject = ((ViewGroup)((ListView.FixedViewInfo)localObject).view).getChildAt(0);
          if ((localObject != null) && (((View)localObject).getVisibility() == 0))
          {
            ab.i("MicroMsg.ConversationListView", "[getFirstHeaderVisible] index:%s", new Object[] { Integer.valueOf(i) });
            AppMethodBeat.o(34246);
          }
        }
      }
    while (true)
    {
      return i;
      i++;
      break;
      ab.i("MicroMsg.ConversationListView", "[getFirstHeaderVisible] index:%s", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(34246);
    }
  }

  public final void i(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(34245);
    ab.i("MicroMsg.ConversationListView", "[showAppBrandHeader] isShow:" + paramBoolean1 + " isAnim:" + paramBoolean2 + " isScrollFirst:" + paramBoolean3);
    if (paramBoolean1)
    {
      if (this.zrY == null)
        break label88;
      this.zrY.aOS();
      AppMethodBeat.o(34245);
    }
    while (true)
    {
      return;
      if (this.zrY != null)
        this.zrY.qh(0);
      label88: AppMethodBeat.o(34245);
    }
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(34253);
    super.onConfigurationChanged(paramConfiguration);
    ab.i("MicroMsg.ConversationListView", "[onConfigurationChanged] orientation:%s, last: %d", new Object[] { Integer.valueOf(paramConfiguration.orientation), Integer.valueOf(this.ivr) });
    qH(true);
    if (this.zrY != null)
      this.zrY.gY();
    if (this.iVo != null)
      this.iVo.a(paramConfiguration);
    e(1.0F, getContext().getResources().getColor(2131689650));
    if (this.zsq != null)
      removeCallbacks(this.zsq);
    paramConfiguration = new ConversationListView.2(this);
    this.zsq = paramConfiguration;
    postDelayed(paramConfiguration, 800L);
    this.iVR = false;
    AppMethodBeat.o(34253);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(34227);
    super.onDraw(paramCanvas);
    Paint localPaint;
    if ((this.iVo != null) && (getFirstVisiblePosition() == 0) && (this.iVo.isFullScreen()) && (this.iVo.getBottom() > 6))
    {
      if (this.zsb < 30)
      {
        AppMethodBeat.o(34227);
        return;
      }
      if (this.iVo.getBackUpFooterRect().top >= this.zsm)
      {
        this.mPaint.reset();
        localPaint = this.mPaint;
        if (this.zsb >= 20)
          break label191;
      }
    }
    label191: for (int i = 0; ; i = this.zsb)
    {
      localPaint.setAlpha(i);
      if ((this.zsc != null) && (!this.zsc.isRecycled()))
      {
        float f1 = (getWidth() - this.zsc.getWidth()) / 2;
        float f2 = this.iVo.getBackUpFooterRect().top;
        float f3 = this.zsh;
        paramCanvas.drawBitmap(this.zsc, f1, f2 + f3, this.mPaint);
      }
      AppMethodBeat.o(34227);
      break;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(34230);
    try
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      boolean bool = dIv();
      ab.i("MicroMsg.ConversationListView", "[onLayout] changed:%s, isHeaderOpen: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
      ab.d("MicroMsg.ConversationListView", "[onLayout] top: %d, bottom: %d, height: %d, count: %d, realCount: %d, hashCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt4 - paramInt2), Integer.valueOf(this.mCount), Integer.valueOf(getRealCount()), Integer.valueOf(hashCode()) });
      if ((paramBoolean) && (!bool))
      {
        setSelection(1);
        Runnable local5 = new com/tencent/mm/ui/conversation/ConversationListView$5;
        local5.<init>(this);
        post(local5);
      }
      if ((paramBoolean) || ((this.mCount < 16) && (getRealCount() != this.mCount)))
        qH(false);
      if ((this.zsr != null) && (this.zsr.getVisibility() == 0) && (getFirstVisiblePosition() != 0))
        this.zsr.setVisibility(4);
      this.mCount = getRealCount();
      AppMethodBeat.o(34230);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ConversationListView", localException, "alvinluo onLayout exception", new Object[0]);
        AppMethodBeat.o(34230);
      }
    }
  }

  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(34229);
    if (this.nSS != null)
      this.nSS.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if (this.zrY != null)
      this.zrY.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if ((paramInt2 > 1) && (dIw()) && (this.iVo != null))
    {
      paramInt1 = this.iVo.getBottom();
      this.iVo.getBackUpFooterRect().set(0, paramInt1, getWidth(), getHeight() + paramInt1);
      ab.i("MicroMsg.ConversationListView", "alvinluo onScroll BackUpFooterRect: %s", new Object[] { this.iVo.getBackUpFooterRect().toString() });
      this.zsb = ((int)(255.0F * this.iVo.getBottom() / this.iVo.getHeight()));
    }
    AppMethodBeat.o(34229);
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(34228);
    if (this.nSS != null)
      this.nSS.onScrollStateChanged(paramAbsListView, paramInt);
    if (this.zrY != null)
      this.zrY.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 0)
    {
      if (!dIv())
        break label78;
      e(0.0F, getResources().getColor(2131689651));
    }
    while (true)
    {
      this.mScrollState = paramInt;
      AppMethodBeat.o(34228);
      return;
      label78: e(1.0F, getResources().getColor(2131689650));
    }
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(34225);
    boolean bool1 = this.zrY.onTouch(paramView, paramMotionEvent);
    boolean bool2 = bool1;
    if (this.jZu != null)
      bool2 = bool1 | this.jZu.onTouch(paramView, paramMotionEvent);
    AppMethodBeat.o(34225);
    return bool2;
  }

  final void qH(boolean paramBoolean)
  {
    AppMethodBeat.i(34237);
    if (this.zst == null)
      AppMethodBeat.o(34237);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        postDelayed(new ConversationListView.9(this), 0L);
        AppMethodBeat.o(34237);
      }
      else
      {
        dIu();
        AppMethodBeat.o(34237);
      }
    }
  }

  public final void qj(int paramInt)
  {
    AppMethodBeat.i(34234);
    ab.d("MicroMsg.ConversationListView", "[onCloseHeader]");
    this.zsu = false;
    this.iVR = false;
    this.zsb = 0;
    if (this.zso != null)
      removeCallbacks(this.zso);
    ConversationListView.8 local8 = new ConversationListView.8(this);
    this.zso = local8;
    post(local8);
    AppMethodBeat.o(34234);
  }

  public final void qk(int paramInt)
  {
    AppMethodBeat.i(34235);
    qj(paramInt);
    AppMethodBeat.o(34235);
  }

  public final void qs(int paramInt)
  {
  }

  public void setActionBarUpdateCallback(com.tencent.mm.plugin.appbrand.widget.header.a parama)
  {
    AppMethodBeat.i(34254);
    if (this.zrY != null)
    {
      this.iVv = parama;
      this.zrY.setActionBarUpdateCallback(new ConversationListView.4(this, parama));
    }
    AppMethodBeat.o(34254);
  }

  public void setActivity(MMFragmentActivity paramMMFragmentActivity)
  {
    AppMethodBeat.i(34255);
    this.iWA = paramMMFragmentActivity;
    if (this.iVo != null)
      this.iVo.setActivity(this.iWA);
    AppMethodBeat.o(34255);
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    AppMethodBeat.i(34252);
    this.arw = paramOnItemClickListener;
    super.setOnItemClickListener(new ConversationListView.11(this));
    AppMethodBeat.o(34252);
  }

  public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    AppMethodBeat.i(34251);
    this.oiQ = paramOnItemLongClickListener;
    super.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        boolean bool = false;
        AppMethodBeat.i(34219);
        ab.i("MicroMsg.ConversationListView", "alvinluo onItemLongClick isCanClose: %b", new Object[] { Boolean.valueOf(ConversationListView.b(ConversationListView.this)) });
        if ((ConversationListView.c(ConversationListView.this) != null) && (!ConversationListView.b(ConversationListView.this)))
        {
          bool = ConversationListView.c(ConversationListView.this).onItemLongClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
          AppMethodBeat.o(34219);
        }
        while (true)
        {
          return bool;
          AppMethodBeat.o(34219);
        }
      }
    });
    AppMethodBeat.o(34251);
  }

  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.nSS = paramOnScrollListener;
  }

  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.jZu = paramOnTouchListener;
  }

  public void setSelection(int paramInt)
  {
    AppMethodBeat.i(34241);
    ab.i("MicroMsg.ConversationListView", "[setSelection] position:%s", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 0)
    {
      super.setSelectionFromTop(getFirstHeaderVisible(), this.iVu);
      AppMethodBeat.o(34241);
    }
    while (true)
    {
      return;
      super.setSelectionFromTop(paramInt, this.iVu);
      AppMethodBeat.o(34241);
    }
  }

  public void setStatusBarMaskView(View paramView)
  {
    AppMethodBeat.i(34256);
    this.iVx = paramView;
    if (this.zrY != null)
      this.zrY.setStatusBarMaskView(paramView);
    AppMethodBeat.o(34256);
  }

  public void setonDispatchTouchEventListener(View.OnTouchListener paramOnTouchListener)
  {
    this.zss = paramOnTouchListener;
  }

  public void smoothScrollToPosition(int paramInt)
  {
    AppMethodBeat.i(34242);
    ab.i("MicroMsg.ConversationListView", "[smoothScrollToPosition] position:%s", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 0)
    {
      super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), this.iVu);
      AppMethodBeat.o(34242);
    }
    while (true)
    {
      return;
      super.smoothScrollToPositionFromTop(paramInt, this.iVu);
      AppMethodBeat.o(34242);
    }
  }

  public void smoothScrollToPositionFromTop(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34243);
    ab.i("MicroMsg.ConversationListView", "[smoothScrollToPositionFromTop] position:%s offset:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), this.iVu + paramInt2);
      AppMethodBeat.o(34243);
    }
    while (true)
    {
      return;
      super.smoothScrollToPositionFromTop(paramInt1, this.iVu + paramInt2);
      AppMethodBeat.o(34243);
    }
  }

  public void smoothScrollToPositionFromTop(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(34244);
    ab.i("MicroMsg.ConversationListView", "[smoothScrollToPositionFromTop] position:%s offset:%s duration:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (paramInt1 == 0)
    {
      super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), this.iVu + paramInt2, paramInt3);
      AppMethodBeat.o(34244);
    }
    while (true)
    {
      return;
      super.smoothScrollToPositionFromTop(paramInt1, this.iVu + paramInt2, paramInt3);
      AppMethodBeat.o(34244);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationListView
 * JD-Core Version:    0.6.2
 */
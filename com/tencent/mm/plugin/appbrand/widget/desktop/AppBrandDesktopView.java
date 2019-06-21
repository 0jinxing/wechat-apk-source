package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager.b;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.af.a;
import com.tencent.mm.plugin.appbrand.appusage.ag;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundGLSurfaceView;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.plugin.appbrand.widget.header.b.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.b.2;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.List;

public class AppBrandDesktopView extends DragRecyclerView
  implements b.a
{
  private RecyclerView.a Yq;
  private int aKu;
  private int aKv;
  public int akU;
  private int ape;
  private RecyclerView.m eja;
  private ArrayList<AppBrandDesktopView.c> iPr;
  HeaderContainer iVo;
  private AppBrandDesktopDragView.b iWI;
  private int iXA;
  private boolean iXB;
  private View iXC;
  private int iXD;
  private com.tencent.mm.plugin.appbrand.widget.recentview.b iXE;
  boolean iXF;
  private boolean iXG;
  boolean iXH;
  boolean iXI;
  boolean iXJ;
  private boolean iXK;
  AppBrandDesktopView.b iXL;
  AppBrandDesktopView.b iXM;
  boolean iXN;
  boolean iXO;
  private int iXP;
  private boolean iXQ;
  private boolean iXR;
  private ArrayList<AppBrandDesktopView.c> iXf;
  private int iXg;
  private boolean iXh;
  private boolean iXi;
  private AppBrandDesktopView.j iXj;
  private boolean iXk;
  RelativeLayout iXl;
  RecentAppBrandViewContainer iXm;
  private RecentAppBrandView iXn;
  private AppBrandDesktopDragView iXo;
  int iXp;
  private int iXq;
  private boolean iXr;
  private boolean iXs;
  Runnable iXt;
  Runnable iXu;
  private boolean iXv;
  private int iXw;
  private int iXx;
  private int iXy;
  private int iXz;
  boolean isPaused;
  int ivr;
  private int le;
  Context mContext;

  public AppBrandDesktopView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(133860);
    this.akU = 4;
    this.iPr = new ArrayList();
    this.iXf = new ArrayList();
    this.iXg = 0;
    this.iXh = false;
    this.iXi = false;
    this.iXj = null;
    this.iXk = false;
    this.ape = 0;
    this.aKu = 0;
    this.aKv = 0;
    this.iXp = 0;
    this.iXq = 0;
    this.iXr = false;
    this.iXs = false;
    this.iXt = null;
    this.iXu = null;
    this.iXv = false;
    this.iXy = 0;
    this.iXz = 0;
    this.iXA = 0;
    this.iXB = false;
    this.iXD = a.fromDPToPix(ah.getContext(), 80);
    this.ivr = 0;
    this.iXE = new com.tencent.mm.plugin.appbrand.widget.recentview.b();
    this.iXF = false;
    this.iXG = false;
    this.isPaused = false;
    this.iXH = false;
    this.iXI = false;
    this.iXJ = false;
    this.iXK = false;
    this.iXL = new AppBrandDesktopView.b(this, 1);
    this.iXM = new AppBrandDesktopView.b(this, 2);
    this.iXN = false;
    this.iXO = false;
    this.iWI = new AppBrandDesktopView.1(this);
    this.iXP = -1;
    this.iXQ = false;
    this.iXR = false;
    this.eja = new AppBrandDesktopView.3(this);
    init(paramContext);
    AppMethodBeat.o(133860);
  }

  public AppBrandDesktopView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(133861);
    this.akU = 4;
    this.iPr = new ArrayList();
    this.iXf = new ArrayList();
    this.iXg = 0;
    this.iXh = false;
    this.iXi = false;
    this.iXj = null;
    this.iXk = false;
    this.ape = 0;
    this.aKu = 0;
    this.aKv = 0;
    this.iXp = 0;
    this.iXq = 0;
    this.iXr = false;
    this.iXs = false;
    this.iXt = null;
    this.iXu = null;
    this.iXv = false;
    this.iXy = 0;
    this.iXz = 0;
    this.iXA = 0;
    this.iXB = false;
    this.iXD = a.fromDPToPix(ah.getContext(), 80);
    this.ivr = 0;
    this.iXE = new com.tencent.mm.plugin.appbrand.widget.recentview.b();
    this.iXF = false;
    this.iXG = false;
    this.isPaused = false;
    this.iXH = false;
    this.iXI = false;
    this.iXJ = false;
    this.iXK = false;
    this.iXL = new AppBrandDesktopView.b(this, 1);
    this.iXM = new AppBrandDesktopView.b(this, 2);
    this.iXN = false;
    this.iXO = false;
    this.iWI = new AppBrandDesktopView.1(this);
    this.iXP = -1;
    this.iXQ = false;
    this.iXR = false;
    this.eja = new AppBrandDesktopView.3(this);
    init(paramContext);
    AppMethodBeat.o(133861);
  }

  public AppBrandDesktopView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(133862);
    this.akU = 4;
    this.iPr = new ArrayList();
    this.iXf = new ArrayList();
    this.iXg = 0;
    this.iXh = false;
    this.iXi = false;
    this.iXj = null;
    this.iXk = false;
    this.ape = 0;
    this.aKu = 0;
    this.aKv = 0;
    this.iXp = 0;
    this.iXq = 0;
    this.iXr = false;
    this.iXs = false;
    this.iXt = null;
    this.iXu = null;
    this.iXv = false;
    this.iXy = 0;
    this.iXz = 0;
    this.iXA = 0;
    this.iXB = false;
    this.iXD = a.fromDPToPix(ah.getContext(), 80);
    this.ivr = 0;
    this.iXE = new com.tencent.mm.plugin.appbrand.widget.recentview.b();
    this.iXF = false;
    this.iXG = false;
    this.isPaused = false;
    this.iXH = false;
    this.iXI = false;
    this.iXJ = false;
    this.iXK = false;
    this.iXL = new AppBrandDesktopView.b(this, 1);
    this.iXM = new AppBrandDesktopView.b(this, 2);
    this.iXN = false;
    this.iXO = false;
    this.iWI = new AppBrandDesktopView.1(this);
    this.iXP = -1;
    this.iXQ = false;
    this.iXR = false;
    this.eja = new AppBrandDesktopView.3(this);
    init(paramContext);
    AppMethodBeat.o(133862);
  }

  private void aMq()
  {
    AppMethodBeat.i(133873);
    ab.d("MicroMsg.AppBrandDesktopView", "alvinluo resetSearchView");
    if ((this.iXi) || (this.iXh))
    {
      eU(false);
      AppMethodBeat.o(133873);
    }
    while (true)
    {
      return;
      eU(true);
      AppMethodBeat.o(133873);
    }
  }

  private void aPm()
  {
    AppMethodBeat.i(133858);
    this.iPr.clear();
    this.iPr.add(new AppBrandDesktopView.c(6));
    this.iPr.add(new AppBrandDesktopView.c(9));
    this.iPr.add(new AppBrandDesktopView.c(3));
    this.iXh = false;
    this.iXi = false;
    this.iXB = false;
    this.Yq.aop.notifyChanged();
    eU(true);
    AppMethodBeat.o(133858);
  }

  private void aPn()
  {
    int i = 0;
    AppMethodBeat.i(133859);
    ab.d("MicroMsg.AppBrandDesktopView", "alvinluo checkEmptyNum currentEmptyNum: %d, myAppBrandNum: %d, toAddEmptyNum: %d", new Object[] { Integer.valueOf(this.iXA), Integer.valueOf(this.iPr.size() - 4), Integer.valueOf(1) });
    while (i <= 0)
    {
      this.iPr.add(new AppBrandDesktopView.c(7));
      i++;
    }
    this.iXA = 1;
    AppMethodBeat.o(133859);
  }

  private void aPo()
  {
    AppMethodBeat.i(133865);
    this.iXq = getItemPadding();
    AppMethodBeat.o(133865);
  }

  private void aPq()
  {
    AppMethodBeat.i(133870);
    setVerticalFadingEdgeEnabled(true);
    setNestedScrollingEnabled(true);
    setBackgroundColor(getContext().getResources().getColor(2131690597));
    AppMethodBeat.o(133870);
  }

  private void aPr()
  {
    AppMethodBeat.i(133871);
    long l = System.currentTimeMillis();
    this.iPr.clear();
    this.iXf.clear();
    this.iXA = 0;
    this.iXB = false;
    this.iPr.add(new AppBrandDesktopView.c(6));
    if (g.K(ag.class) != null);
    for (Object localObject = ((ag)g.K(ag.class)).nA(50); ; localObject = null)
    {
      if (g.K(af.class) != null);
      for (List localList = ((af)g.K(af.class)).a(2147483647, af.a.haK); ; localList = null)
      {
        if ((localObject == null) || (((List)localObject).size() == 0))
        {
          this.iXh = false;
          this.iXg = 2;
          if (this.iXo != null)
            this.iXo.setCollectionStartPosition(this.iXg);
          if ((localList != null) && (localList.size() != 0))
            break label245;
          this.iXi = false;
          label169: if ((this.iXh) || (this.iXi))
            break label253;
          ab.i("MicroMsg.AppBrandDesktopView", "alvinluo DesktopView add fullEmpty item");
          this.iPr.add(new AppBrandDesktopView.c(9));
          this.iPr.add(new AppBrandDesktopView.c(3));
          AppMethodBeat.o(133871);
        }
        while (true)
        {
          return;
          this.iXh = true;
          this.iXg = 4;
          break;
          label245: this.iXi = true;
          break label169;
          label253: new AppBrandDesktopView.c(0);
          int i;
          if ((localObject != null) && (!((List)localObject).isEmpty()))
          {
            AppBrandDesktopView.c localc = new AppBrandDesktopView.c(10);
            this.iPr.add(localc);
            this.iPr.add(new AppBrandDesktopView.c(2));
            for (i = 0; i < ((List)localObject).size(); i++)
            {
              localc = new AppBrandDesktopView.c(2);
              localc.iXW = ((LocalUsageInfo)((List)localObject).get(i));
              this.iXf.add(localc);
            }
          }
          this.iPr.add(new AppBrandDesktopView.c(11));
          if (localList != null)
          {
            ab.i("MicroMsg.AppBrandDesktopView", "alvinluo makeData myList: %d", new Object[] { Integer.valueOf(localList.size()) });
            for (i = 0; i < localList.size(); i++)
            {
              localObject = new AppBrandDesktopView.c(1);
              ((AppBrandDesktopView.c)localObject).iXW = ((LocalUsageInfo)localList.get(i));
              this.iPr.add(localObject);
            }
          }
          aPn();
          if (!this.iXi)
          {
            this.iPr.add(new AppBrandDesktopView.c(8));
            this.iXB = true;
          }
          this.iPr.add(new AppBrandDesktopView.c(3));
          if (this.iXo != null)
          {
            this.iXo.setCopyList(this.iXf);
            this.iXo.setList(this.iPr);
          }
          ab.d("MicroMsg.AppBrandDesktopView", "[makeData] cost: %d, isShow: %b, isPaused: %b", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(isShown()), Boolean.valueOf(this.isPaused) });
          if (this.anv)
            this.iXv = true;
          this.Yq.aop.notifyChanged();
          if (this.iXm != null)
          {
            ab.d("MicroMsg.AppBrandDesktopView", "alvinluo makeData RecentView notifyDataSetChanged");
            this.iXm.setDataList(this.iXf);
            this.iXm.notifyDataSetChanged();
          }
          ab.i("MicroMsg.AppBrandDesktopView", "alvinluo AppBrandDesktopView init mDataList: %d, recentDataCount: %d, myAppBrandCount: %d", new Object[] { Integer.valueOf(this.iPr.size()), Integer.valueOf(this.iXf.size()), Integer.valueOf(this.iPr.size() - this.iXg) });
          AppMethodBeat.o(133871);
        }
      }
    }
  }

  private void eU(boolean paramBoolean)
  {
    AppMethodBeat.i(133879);
    if (paramBoolean);
    for (int i = 0; ; i = 1)
    {
      ql(i);
      AppMethodBeat.o(133879);
      return;
    }
  }

  private int getCollectionDataSize()
  {
    AppMethodBeat.i(133874);
    int i;
    if (!this.iXi)
    {
      i = 0;
      AppMethodBeat.o(133874);
    }
    while (true)
    {
      return i;
      i = this.iPr.size() - this.iXg - this.iXA - 1;
      AppMethodBeat.o(133874);
    }
  }

  private int getItemPadding()
  {
    AppMethodBeat.i(133869);
    int i = d.dj(getContext());
    AppMethodBeat.o(133869);
    return i;
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(133867);
    this.mContext = paramContext;
    this.iXz = 0;
    this.iXy = this.iXz;
    b.init(this.mContext);
    this.akU = b.getCompletelyCountPerPage();
    aPo();
    aPq();
    this.iXj = new AppBrandDesktopView.j(this, this.akU);
    this.iXj.akZ = new GridLayoutManager.b()
    {
      public final int bU(int paramAnonymousInt)
      {
        AppMethodBeat.i(133835);
        paramAnonymousInt = AppBrandDesktopView.this.getAdapter().getItemViewType(paramAnonymousInt);
        if ((paramAnonymousInt == 3) || (paramAnonymousInt == 11) || (paramAnonymousInt == 10) || (paramAnonymousInt == 2) || (paramAnonymousInt == 6) || (paramAnonymousInt == 8) || (paramAnonymousInt == 9))
        {
          paramAnonymousInt = AppBrandDesktopView.this.akU;
          AppMethodBeat.o(133835);
        }
        while (true)
        {
          return paramAnonymousInt;
          paramAnonymousInt = 1;
          AppMethodBeat.o(133835);
        }
      }
    };
    setLayoutManager(this.iXj);
    setOverScrollMode(2);
    a(this.eja);
    this.Yq = new AppBrandDesktopView.e(this, (byte)0);
    setAdapter(this.Yq);
    aPr();
    aPp();
    al.n(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(133836);
        AppBrandDesktopView.s(AppBrandDesktopView.this);
        AppMethodBeat.o(133836);
      }
    }
    , 200L);
    ab.i("MicroMsg.AppBrandDesktopView", "alvinluo DesktopView init %d, searchView height: %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.iXD) });
    AppMethodBeat.o(133867);
  }

  private boolean qi(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(133857);
    ab.d("MicroMsg.AppBrandDesktopView", "alvinluo reorderCollection");
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.iPr.size(); i++)
    {
      localObject = (AppBrandDesktopView.c)this.iPr.get(i);
      if ((((AppBrandDesktopView.c)localObject).type == 1) && (((AppBrandDesktopView.c)localObject).iXW != null))
        localArrayList.add(((AppBrandDesktopView.c)localObject).iXW);
    }
    Object localObject = (af)g.K(af.class);
    if (localObject == null)
      AppMethodBeat.o(133857);
    while (true)
    {
      return bool;
      bool = ((af)localObject).g(localArrayList, paramInt);
      if (!bool)
        ab.e("MicroMsg.AppBrandDesktopView", "alvinluo reorederCollection failed, needProcessResult: %b");
      AppMethodBeat.o(133857);
    }
  }

  private void ql(int paramInt)
  {
    AppMethodBeat.i(133880);
    this.ape = paramInt;
    int i = this.iXj.iQ();
    int j = this.iXj.iS();
    if (paramInt <= i)
    {
      bY(paramInt);
      AppMethodBeat.o(133880);
    }
    while (true)
    {
      return;
      if (paramInt <= j)
      {
        scrollBy(0, getChildAt(paramInt - i).getTop());
        AppMethodBeat.o(133880);
      }
      else
      {
        bY(paramInt);
        this.iXk = true;
        AppMethodBeat.o(133880);
      }
    }
  }

  private void setIgnoreNotify(boolean paramBoolean)
  {
    if (this.iXM != null)
      this.iXM.iXG = paramBoolean;
    if (this.iXL != null)
      this.iXL.iXG = paramBoolean;
  }

  final void aPp()
  {
    AppMethodBeat.i(133868);
    if (this.iXN)
      AppMethodBeat.o(133868);
    while (true)
    {
      return;
      ag localag = (ag)g.K(ag.class);
      af localaf = (af)g.K(af.class);
      if ((localag == null) || (localaf == null))
      {
        AppMethodBeat.o(133868);
      }
      else
      {
        this.iXN = true;
        localag.d(this.iXM);
        localag.c(this.iXM);
        localaf.d(this.iXL);
        localaf.c(this.iXL);
        AppMethodBeat.o(133868);
      }
    }
  }

  public final void aPs()
  {
    AppMethodBeat.i(133875);
    ab.i("MicroMsg.AppBrandDesktopView", "[onOpenHeader]");
    if (!this.iXF)
    {
      com.tencent.mm.plugin.appbrand.report.e.Dz(com.tencent.mm.plugin.appbrand.report.e.aLc());
      if ((this.iXE != null) && (this.iXn != null))
      {
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onOpenHeader report open recentCount: %d, collectionCount: %d", new Object[] { Integer.valueOf(this.iXn.getShowCount()), Integer.valueOf(getCollectionDataSize()) });
        this.iXE.dw(this.iXn.getShowCount(), getCollectionDataSize());
        com.tencent.mm.sdk.g.d.xDG.execute(new AppBrandDesktopView.10(this));
      }
      this.iXF = true;
      this.iXI = true;
      this.iXJ = true;
    }
    setLayoutFrozen(false);
    AppMethodBeat.o(133875);
  }

  public final void aPt()
  {
    AppMethodBeat.i(133878);
    aPs();
    AppMethodBeat.o(133878);
  }

  public int getLeftRightMargin()
  {
    AppMethodBeat.i(133866);
    int i = d.dk(getContext()) - this.iXq;
    int j = i;
    if (i < 0)
      j = 0;
    ab.d("MicroMsg.AppBrandDesktopView", "alvinluo getLeftRightMargin: %d, mGridItemPadding: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(this.iXq) });
    AppMethodBeat.o(133866);
    return j;
  }

  public RecyclerView getRecyclerView()
  {
    return this;
  }

  protected float getTopFadingEdgeStrength()
  {
    return 0.0F;
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(133864);
    super.onAttachedToWindow();
    View localView = getRootView();
    if (localView == null)
    {
      AppMethodBeat.o(133864);
      return;
    }
    this.iXo = ((AppBrandDesktopDragView)localView.findViewById(2131820594));
    if (this.iXo == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onAttachedToWindow mDragFeatureView == null: %b", new Object[] { Boolean.valueOf(bool) });
      this.iXo.setRecyclerView(this);
      this.iXo.setCopyList(this.iXf);
      this.iXo.setList(this.iPr);
      this.iXo.setHeaderContainer(this.iVo);
      this.iXo.setCollectionCallback(this.iWI);
      this.iXo.setItemPadding(this.iXq);
      this.iXo.setAppBrandCounter(new AppBrandDesktopView.a(this, (byte)0));
      this.iXo.setRecyclerViewScrollComputer(new AppBrandDesktopView.7(this));
      this.iYz = this.iXo;
      if ((this.iXo != null) && ((this.iXo.getParent() instanceof RelativeLayout)))
      {
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onAttachedToWindow get root container");
        this.iXl = ((RelativeLayout)this.iXo.getParent());
      }
      AppMethodBeat.o(133864);
      break;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133872);
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    this.aKu = paramInt1;
    this.aKv = paramInt2;
    paramInt1 = d.c(this.aKu, getContext());
    if (paramInt1 != this.iXq)
    {
      ab.i("MicroMsg.AppBrandDesktopView", "alvinluo notifyItemPaddingChanged itemPadding old: %d, new: %d", new Object[] { Integer.valueOf(this.iXq), Integer.valueOf(paramInt1) });
      b.init(getContext());
      this.iXq = paramInt1;
      ab.i("MicroMsg.AppBrandDesktopView", "alvinluo updateItemPadding %d", new Object[] { Integer.valueOf(this.iXq) });
      if (this.iXm != null)
      {
        this.iXm.setItemPadding(this.iXq);
        if (this.iXn != null)
          this.iXn.aPw();
      }
      if (this.Yq != null)
        this.Yq.aop.notifyChanged();
      if (this.iVo != null)
        this.iVo.aPi();
    }
    AppMethodBeat.o(133872);
  }

  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    AppMethodBeat.i(133863);
    super.onVisibilityChanged(paramView, paramInt);
    ab.d("MicroMsg.AppBrandDesktopView", "[onVisibilityChanged] visibility:".concat(String.valueOf(paramInt)));
    if ((paramInt == 8) || (paramInt == 4))
    {
      if ((this.iXK) && (this.iVo != null))
      {
        this.iVo.k(200L, 9);
        this.iXK = false;
      }
      if (this.iXv)
      {
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onVisibilityChanged needRefresh");
        this.iXv = false;
        if (this.iXu != null)
          removeCallbacks(this.iXu);
        paramView = new AppBrandDesktopView.6(this);
        this.iXu = paramView;
        postDelayed(paramView, 1000L);
      }
    }
    AppMethodBeat.o(133863);
  }

  public final void qj(int paramInt)
  {
    AppMethodBeat.i(133876);
    ab.i("MicroMsg.AppBrandDesktopView", "[onCloseHeader]");
    if (this.iXF)
    {
      if ((this.iXE != null) && (this.iXn != null))
      {
        com.tencent.mm.plugin.appbrand.widget.recentview.b localb = this.iXE;
        boolean bool = b.aPe();
        localb.jnn = bool;
        ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo enableNativeDynamicBackground %b", new Object[] { Boolean.valueOf(bool) });
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onCloseHeader report close recentCount: %d, collectionCount: %d, reason: %d", new Object[] { Integer.valueOf(this.iXn.getShowCount()), Integer.valueOf(getCollectionDataSize()), Integer.valueOf(paramInt) });
        localb = this.iXE;
        int i = this.iXn.getShowCount();
        int j = getCollectionDataSize();
        localb.jmO = i;
        localb.jmX = j;
        localb.jmL = paramInt;
        com.tencent.mm.sdk.g.d.xDG.execute(new b.2(localb));
      }
      this.iXF = false;
      this.iXI = false;
      this.iXJ = false;
      if (paramInt != 9)
        break label219;
      if (this.iXL != null)
        this.iXL.iXG = false;
    }
    while (true)
    {
      aMq();
      qi(1);
      AppMethodBeat.o(133876);
      return;
      label219: if (this.iXL != null)
        this.iXL.iXG = true;
    }
  }

  public final void qk(int paramInt)
  {
    AppMethodBeat.i(133877);
    qj(paramInt);
    AppMethodBeat.o(133877);
  }

  public void setHeaderContainer(HeaderContainer paramHeaderContainer)
  {
    this.iVo = paramHeaderContainer;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView
 * JD-Core Version:    0.6.2
 */
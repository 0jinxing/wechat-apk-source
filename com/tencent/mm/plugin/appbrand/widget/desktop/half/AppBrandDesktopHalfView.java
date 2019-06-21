package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.report.e;
import com.tencent.mm.plugin.appbrand.widget.desktop.c;
import com.tencent.mm.plugin.appbrand.widget.header.a.a.a;
import com.tencent.mm.plugin.appbrand.widget.header.a.a.b;
import com.tencent.mm.plugin.appbrand.widget.header.b.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.b;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.d;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.e;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.f;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppBrandDesktopHalfView extends LinearLayout
  implements com.tencent.mm.plugin.appbrand.widget.header.a.a, b.a
{
  boolean cAY;
  private int iWJ;
  private boolean iXF;
  private int ivr;
  private AppBrandDesktopHalfItemView jaI;
  private AppBrandDesktopHalfItemView jaJ;
  private LinearLayout jaK;
  private LinearLayout jaL;
  private boolean jaM;
  private boolean jaN;
  private AppBrandRecentView.e jaO;
  private AppBrandRecentView.e jaP;
  private int jaQ;
  private c jaR;
  private String jaS;
  private boolean jaT;
  private boolean jaU;
  private a.a jaV;
  private com.tencent.mm.plugin.appbrand.widget.recentview.b jat;
  private Context mContext;

  public AppBrandDesktopHalfView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(134183);
    this.jaM = false;
    this.jaN = false;
    this.iWJ = 0;
    this.jaO = null;
    this.jaP = null;
    com.tencent.mm.plugin.appbrand.widget.desktop.b.aPf();
    this.jaQ = 1;
    this.jaR = null;
    this.jat = null;
    this.jaS = null;
    this.jaT = true;
    this.iXF = false;
    this.ivr = 0;
    this.jaU = true;
    this.cAY = false;
    init(paramContext);
    AppMethodBeat.o(134183);
  }

  public AppBrandDesktopHalfView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(134184);
    this.jaM = false;
    this.jaN = false;
    this.iWJ = 0;
    this.jaO = null;
    this.jaP = null;
    com.tencent.mm.plugin.appbrand.widget.desktop.b.aPf();
    this.jaQ = 1;
    this.jaR = null;
    this.jat = null;
    this.jaS = null;
    this.jaT = true;
    this.iXF = false;
    this.ivr = 0;
    this.jaU = true;
    this.cAY = false;
    init(paramContext);
    AppMethodBeat.o(134184);
  }

  public AppBrandDesktopHalfView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(134185);
    this.jaM = false;
    this.jaN = false;
    this.iWJ = 0;
    this.jaO = null;
    this.jaP = null;
    com.tencent.mm.plugin.appbrand.widget.desktop.b.aPf();
    this.jaQ = 1;
    this.jaR = null;
    this.jat = null;
    this.jaS = null;
    this.jaT = true;
    this.iXF = false;
    this.ivr = 0;
    this.jaU = true;
    this.cAY = false;
    init(paramContext);
    AppMethodBeat.o(134185);
  }

  private void eY(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(134188);
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo showEmptyView show: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    LinearLayout localLinearLayout;
    if (paramBoolean)
    {
      if ((this.jaK.getVisibility() != 0) && (this.jaV != null))
        this.jaV.fa(true);
      localLinearLayout = this.jaK;
      if (!paramBoolean)
        break label109;
    }
    while (true)
    {
      localLinearLayout.setVisibility(i);
      AppMethodBeat.o(134188);
      return;
      if ((this.jaK.getVisibility() != 0) || (this.jaV == null))
        break;
      this.jaV.fa(false);
      break;
      label109: i = 4;
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(134187);
    this.mContext = paramContext;
    com.tencent.mm.plugin.appbrand.widget.desktop.b.init(this.mContext);
    this.iWJ = getItemPadding();
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo init itemPadding: %d", new Object[] { Integer.valueOf(this.iWJ) });
    paramContext = v.hu(this.mContext).inflate(2130968673, this);
    this.jaK = ((LinearLayout)paramContext.findViewById(2131821164));
    this.jaL = ((LinearLayout)paramContext.findViewById(2131821165));
    this.jaI = ((AppBrandDesktopHalfItemView)paramContext.findViewById(2131821166));
    this.jaI.a(AppBrandRecentView.f.jmH);
    this.jaI.setItemPadding(this.iWJ);
    this.jaI.setTitlePaddingLeft(this.iWJ + com.tencent.mm.bz.a.fromDPToPix(this.mContext, 8));
    this.jaI.getRecentView().a(new a(this.iWJ));
    this.jaI.setRefreshListener(new AppBrandDesktopHalfView.1(this));
    this.jaI.setOnDataChangedListener(new AppBrandRecentView.d()
    {
      public final void aQf()
      {
        AppMethodBeat.i(134169);
        AppBrandDesktopHalfView.b(AppBrandDesktopHalfView.this);
        AppMethodBeat.o(134169);
      }
    });
    this.jaI.jar = new AppBrandDesktopHalfView.16(this);
    this.jaI.setCreateContextMenuListener(new AppBrandDesktopHalfView.17(this));
    this.jaI.setMenuItemSelectedListener(new AppBrandRecentView.a()
    {
    });
    this.jaI.setOnItemClickListener(new AppBrandRecentView.b()
    {
      public final boolean a(View paramAnonymousView, com.tencent.mm.plugin.appbrand.widget.recentview.a paramAnonymousa, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        AppMethodBeat.i(134179);
        AppBrandDesktopHalfView.this.setLayoutFrozen(true);
        if ((AppBrandDesktopHalfView.g(AppBrandDesktopHalfView.this) != null) && (paramAnonymousa != null) && (paramAnonymousa.iXW != null) && (!bo.isNullOrNil(paramAnonymousa.iXW.appId)))
        {
          AppBrandDesktopHalfView.d(AppBrandDesktopHalfView.this).getRecentView();
          int i = RecyclerView.bo(paramAnonymousView);
          if (i != -1)
          {
            AppBrandDesktopHalfView.h(AppBrandDesktopHalfView.this);
            AppBrandDesktopHalfView.g(AppBrandDesktopHalfView.this).bA(paramAnonymousa.iXW.appId, i);
          }
          AppBrandDesktopHalfView.i(AppBrandDesktopHalfView.this);
        }
        AppMethodBeat.o(134179);
        return false;
      }

      public final boolean b(View paramAnonymousView, com.tencent.mm.plugin.appbrand.widget.recentview.a paramAnonymousa, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        return false;
      }
    });
    this.jaJ = ((AppBrandDesktopHalfItemView)paramContext.findViewById(2131821167));
    this.jaJ.a(AppBrandRecentView.f.jmI);
    this.jaJ.setItemPadding(this.iWJ);
    this.jaJ.setTitlePaddingLeft(this.iWJ + com.tencent.mm.bz.a.fromDPToPix(this.mContext, 8));
    this.jaJ.getRecentView().a(new a(this.iWJ));
    this.jaJ.setRefreshListener(new AppBrandDesktopHalfView.20(this));
    this.jaJ.setOnDataChangedListener(new AppBrandDesktopHalfView.21(this));
    this.jaJ.jar = new AppBrandDesktopHalfView.22(this);
    this.jaJ.setCreateContextMenuListener(new View.OnCreateContextMenuListener()
    {
      public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        AppMethodBeat.i(134161);
        if (paramAnonymousView != null)
        {
          AppBrandDesktopHalfView.c(AppBrandDesktopHalfView.this).getRecentView();
          int i = ConversationAppBrandRecentView.bo(paramAnonymousView);
          ab.d("MicroMsg.AppBrandDesktopHalfView", "alvinluo menu current pos: %d", new Object[] { Integer.valueOf(i) });
          if (i > AppBrandDesktopHalfView.l(AppBrandDesktopHalfView.this))
            paramAnonymousContextMenu.add(0, 12, 0, AppBrandDesktopHalfView.this.getContext().getResources().getString(2131296600));
        }
        AppMethodBeat.o(134161);
      }
    });
    this.jaJ.setMenuItemSelectedListener(new AppBrandRecentView.a()
    {
    });
    this.jaJ.setOnItemClickListener(new AppBrandRecentView.b()
    {
      public final boolean a(View paramAnonymousView, com.tencent.mm.plugin.appbrand.widget.recentview.a paramAnonymousa, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        AppMethodBeat.i(134163);
        AppBrandDesktopHalfView.this.setLayoutFrozen(true);
        if ((AppBrandDesktopHalfView.g(AppBrandDesktopHalfView.this) != null) && (paramAnonymousa != null) && (paramAnonymousa.iXW != null) && (!bo.isNullOrNil(paramAnonymousa.iXW.appId)))
        {
          AppBrandDesktopHalfView.c(AppBrandDesktopHalfView.this).getRecentView();
          int i = RecyclerView.bo(paramAnonymousView);
          if (i != -1)
          {
            AppBrandDesktopHalfView.h(AppBrandDesktopHalfView.this);
            AppBrandDesktopHalfView.g(AppBrandDesktopHalfView.this).bB(paramAnonymousa.iXW.appId, i);
          }
          AppBrandDesktopHalfView.i(AppBrandDesktopHalfView.this);
        }
        AppMethodBeat.o(134163);
        return false;
      }

      public final boolean b(View paramAnonymousView, com.tencent.mm.plugin.appbrand.widget.recentview.a paramAnonymousa, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        return false;
      }
    });
    this.jaI.setEnableDataCache(true);
    this.jaJ.setEnableDataCache(false);
    AppMethodBeat.o(134187);
  }

  private static void l(RecyclerView paramRecyclerView)
  {
    AppMethodBeat.i(134196);
    Object localObject = (LinearLayoutManager)paramRecyclerView.getLayoutManager();
    int i = ((LinearLayoutManager)localObject).iQ();
    int j = ((LinearLayoutManager)localObject).iS();
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo checkAlphaChange firstPos: %d, lastPos: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if (i <= j)
    {
      localObject = paramRecyclerView.cf(i);
      if ((localObject != null) && (((RecyclerView.v)localObject).apJ != null))
      {
        ((RecyclerView.v)localObject).apJ.setScaleX(1.0F);
        ((RecyclerView.v)localObject).apJ.setScaleY(1.0F);
        if (i != j)
          break label109;
        ((RecyclerView.v)localObject).apJ.setAlpha(0.3F);
      }
      while (true)
      {
        i++;
        break;
        label109: ((RecyclerView.v)localObject).apJ.setAlpha(1.0F);
      }
    }
    AppMethodBeat.o(134196);
  }

  private void qt(int paramInt)
  {
    AppMethodBeat.i(134189);
    Object localObject = this.jaJ.getPreviewList();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = ((com.tencent.mm.plugin.appbrand.widget.recentview.a)localIterator.next()).iXW;
      if (localObject != null)
      {
        ab.d("MicroMsg.AppBrandDesktopHalfView", "alvinluo reorderCollection info: %s, %d", new Object[] { ((LocalUsageInfo)localObject).nickname, Integer.valueOf(((LocalUsageInfo)localObject).har) });
        localArrayList.add(localObject);
      }
    }
    if (paramInt == 1)
      this.jaJ.getRecentView().setIgnoreNotify(false);
    while (true)
    {
      ((af)g.K(af.class)).g(localArrayList, paramInt);
      AppMethodBeat.o(134189);
      return;
      this.jaJ.getRecentView().setIgnoreNotify(true);
    }
  }

  public final void a(Configuration paramConfiguration)
  {
    AppMethodBeat.i(134197);
    onConfigurationChanged(paramConfiguration);
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo HalfView onConfigurationChanged orientation: %d", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    int i = getItemPadding();
    if ((this.ivr != paramConfiguration.orientation) || (i != this.iWJ))
    {
      this.ivr = paramConfiguration.orientation;
      com.tencent.mm.plugin.appbrand.widget.desktop.b.init(getContext());
      this.iWJ = i;
      if (this.jaI != null)
        this.jaI.setTitlePaddingLeft(this.iWJ + com.tencent.mm.bz.a.fromDPToPix(this.mContext, 8));
      if (this.jaJ != null)
        this.jaJ.setTitlePaddingLeft(this.iWJ + com.tencent.mm.bz.a.fromDPToPix(this.mContext, 8));
      if (this.jaI != null)
        this.jaI.a(paramConfiguration);
      if (this.jaJ != null)
        this.jaJ.a(paramConfiguration);
    }
    AppMethodBeat.o(134197);
  }

  public final void aPs()
  {
  }

  public final void aPt()
  {
  }

  public final void aQb()
  {
    AppMethodBeat.i(134193);
    if (this.jaJ != null)
      this.jaJ.aQb();
    if (this.jaI != null)
      this.jaI.aQb();
    AppMethodBeat.o(134193);
  }

  public final void aQc()
  {
    AppMethodBeat.i(134191);
    ab.d("MicroMsg.AppBrandDesktopHalfView", "alvinluo HalfView onOpen");
    this.iXF = true;
    ((af)g.K(af.class)).awX();
    String str = e.aLc();
    this.jaS = str;
    e.Dz(str);
    AppMethodBeat.o(134191);
  }

  public final void aQd()
  {
    AppMethodBeat.i(134201);
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo checkReportNameDuplicated");
    com.tencent.mm.sdk.g.d.post(new AppBrandDesktopHalfView.15(this), "checkReportNameDuplicated");
    AppMethodBeat.o(134201);
  }

  public int getItemPadding()
  {
    AppMethodBeat.i(134186);
    int i = com.tencent.mm.plugin.appbrand.widget.desktop.d.dj(getContext());
    AppMethodBeat.o(134186);
    return i;
  }

  public int getRecentAppBrandCount()
  {
    AppMethodBeat.i(134198);
    int i;
    if (this.jaI != null)
    {
      i = this.jaI.getDataCount() - this.jaI.getCustomCount();
      AppMethodBeat.o(134198);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(134198);
    }
  }

  public int getStarAppBrandCount()
  {
    AppMethodBeat.i(134199);
    int i;
    if (this.jaJ != null)
    {
      i = this.jaJ.getDataCount() - this.jaJ.getCustomCount();
      AppMethodBeat.o(134199);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(134199);
    }
  }

  public final void qj(int paramInt)
  {
    AppMethodBeat.i(134190);
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo onCloseHeader");
    postDelayed(new AppBrandDesktopHalfView.13(this), 500L);
    AppMethodBeat.o(134190);
  }

  public final void qk(int paramInt)
  {
    AppMethodBeat.i(134194);
    qj(paramInt);
    AppMethodBeat.o(134194);
  }

  public final void qu(int paramInt)
  {
    AppMethodBeat.i(134192);
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo HalfView onClose type: %d, isHeaderOpen: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.iXF) });
    if (this.iXF)
    {
      this.iXF = false;
      qt(1);
    }
    AppMethodBeat.o(134192);
  }

  public final void refresh()
  {
    AppMethodBeat.i(134203);
    ab.i("MicroMsg.AppBrandDesktopHalfView", "alvinluo refresh data");
    this.jaN = true;
    this.jaJ.iWW.refresh();
    this.jaM = true;
    this.jaI.iWW.refresh();
    AppMethodBeat.o(134203);
  }

  public void setCollectionRefreshListener(AppBrandRecentView.e parame)
  {
    this.jaP = parame;
  }

  public void setIOnLaunchUIListener(a.b paramb)
  {
    AppMethodBeat.i(134202);
    if (this.jaI != null)
      this.jaI.setOnLaunchUIListener(paramb);
    if (this.jaJ != null)
      this.jaJ.setOnLaunchUIListener(paramb);
    AppMethodBeat.o(134202);
  }

  public void setLayoutFrozen(boolean paramBoolean)
  {
    AppMethodBeat.i(134195);
    if ((this.jaI != null) && (this.jaI.getRecentView() != null))
      this.jaI.getRecentView().setLayoutFrozen(paramBoolean);
    if ((this.jaJ != null) && (this.jaJ.getRecentView() != null))
      this.jaJ.getRecentView().setLayoutFrozen(paramBoolean);
    AppMethodBeat.o(134195);
  }

  public void setMyRefreshListener(AppBrandRecentView.e parame)
  {
    this.jaP = parame;
  }

  public void setNeedScrollToFirstPageWhenResume(boolean paramBoolean)
  {
    this.jaT = paramBoolean;
  }

  public void setOnEmptyViewListener(a.a parama)
  {
    this.jaV = parama;
  }

  public void setRecentRefreshListener(AppBrandRecentView.e parame)
  {
    this.jaO = parame;
  }

  public void setReporter(com.tencent.mm.plugin.appbrand.widget.recentview.b paramb)
  {
    AppMethodBeat.i(134200);
    this.jat = paramb;
    if (this.jaI != null)
      this.jaI.setReporter(paramb);
    if (this.jaJ != null)
      this.jaJ.setReporter(paramb);
    AppMethodBeat.o(134200);
  }

  public void setUsageRefreshListener(AppBrandRecentView.e parame)
  {
    this.jaO = parame;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.desktop.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.util.List;

public class ConversationAppBrandRecentView extends BaseAppBrandRecentView
{
  private static final int jnT;
  private AppBrandRecentView.b jas;
  private e.a jnS;
  private float jnU = 0.0F;
  private int jnV = 0;
  private ConversationAppBrandRecentView.a jnW = null;
  private View.OnCreateContextMenuListener jnX = null;
  private AppBrandRecentView.a jnY = null;
  private boolean jnZ = false;
  private int mScreenWidth = 0;

  static
  {
    AppMethodBeat.i(134381);
    jnT = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 200);
    AppMethodBeat.o(134381);
  }

  public ConversationAppBrandRecentView(Context paramContext)
  {
    super(paramContext);
  }

  public ConversationAppBrandRecentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void g(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(134373);
    ab.d("MicroMsg.ConversationAppBrandRecentView", "alvinluo updateAlpha pos: %d", new Object[] { Integer.valueOf(paramInt) });
    float f;
    if (paramv != null)
    {
      f = paramv.apJ.getX();
      if (f >= this.mScreenWidth - getItemWidth() / 2)
      {
        paramv.apJ.setAlpha(0.3F);
        AppMethodBeat.o(134373);
      }
    }
    while (true)
    {
      return;
      if ((f < this.mScreenWidth - getItemWidth() / 2) && (f >= this.jnU))
      {
        f = 1.0F - (f - this.jnU) / this.jnV * 0.7F;
        ab.d("MicroMsg.ConversationAppBrandRecentView", "alvinluo updateAlpha %f", new Object[] { Float.valueOf(f) });
        paramv.apJ.setAlpha(f);
        AppMethodBeat.o(134373);
      }
      else
      {
        paramv.apJ.setAlpha(1.0F);
        AppMethodBeat.o(134373);
      }
    }
  }

  private int getItemPadding()
  {
    AppMethodBeat.i(134377);
    int i = com.tencent.mm.plugin.appbrand.widget.desktop.d.dj(getContext());
    AppMethodBeat.o(134377);
    return i;
  }

  public final void a(BaseAppBrandRecentView.c paramc, a parama, int paramInt)
  {
    AppMethodBeat.i(134364);
    super.a(paramc, parama, paramInt);
    if ((parama != null) && (parama.type == 0))
    {
      paramc.gne.setVisibility(4);
      paramc.iqT.setImageResource(2131231686);
    }
    if ((!b.aPd()) || (parama == null) || (paramc == null) || (paramc.apJ == null));
    while (true)
    {
      if (this.jnW != null)
        this.jnW.a(paramc, paramInt);
      AppMethodBeat.o(134364);
      return;
      if (parama.type == 3)
      {
        paramc.apJ.setVisibility(4);
        paramc.apJ.getLayoutParams().width = 0;
      }
      int i = (int)com.tencent.mm.plugin.appbrand.widget.desktop.d.dl(getContext());
      paramc.iYe.getLayoutParams().width = (com.tencent.mm.bz.a.am(getContext(), 2131427858) * 2 + i);
      paramc.iYe.getLayoutParams().height = (com.tencent.mm.bz.a.am(getContext(), 2131427858) * 2 + i);
      paramc.iqT.getLayoutParams().width = i;
      paramc.iqT.getLayoutParams().height = i;
      paramc.iYd.getLayoutParams().width = i;
      paramc.iYd.getLayoutParams().height = i;
      int j = getCurrentPage();
      int k = e.rb(j);
      i = e.rc(j);
      ab.i("MicroMsg.ConversationAppBrandRecentView", "alvinluo configView curPage: %d, firstPositionOfCurPage: %d, lastPositionOfCurPage: %d, position: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(paramInt) });
      if (paramInt == i)
      {
        paramc.apJ.animate().alpha(0.3F).setDuration(1L).start();
      }
      else if (parama.imK)
      {
        paramc.apJ.setVisibility(4);
      }
      else
      {
        paramc.apJ.setVisibility(0);
        paramc.apJ.setAlpha(1.0F);
      }
    }
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(134375);
    ab.i("MicroMsg.ConversationAppBrandRecentView", "[onNotifyChange] process:%s eventId:%s, mType: %s", new Object[] { ((h)g.RM().Rn()).toString(), Integer.valueOf(paramm.hsh), this.jax });
    if (aRZ())
      AppMethodBeat.o(134375);
    while (true)
    {
      return;
      refresh();
      AppMethodBeat.o(134375);
    }
  }

  public final void aR(List<a> paramList)
  {
    AppMethodBeat.i(134370);
    if (!b.aPd())
      paramList.add(new a(0));
    if (b.aPd())
    {
      b.aPf();
      paramList.add(0, new a(3));
    }
    AppMethodBeat.o(134370);
  }

  protected final boolean aRZ()
  {
    boolean bool = this.jnZ;
    this.jnZ = false;
    return bool;
  }

  protected int getCompletelyCountPerPage()
  {
    AppMethodBeat.i(134366);
    int i = b.getCompletelyCountPerPage();
    AppMethodBeat.o(134366);
    return i;
  }

  public int getCustomItemCount()
  {
    int i = 1;
    AppMethodBeat.i(134371);
    if (!b.aPd())
      AppMethodBeat.o(134371);
    while (true)
    {
      return i;
      if (b.aPd())
      {
        b.aPf();
        AppMethodBeat.o(134371);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(134371);
      }
    }
  }

  public int getItemWidth()
  {
    AppMethodBeat.i(134376);
    int i = com.tencent.mm.plugin.appbrand.widget.desktop.d.di(getContext());
    AppMethodBeat.o(134376);
    return i;
  }

  public int getLayoutId()
  {
    return 2130968770;
  }

  protected int getLoadCount()
  {
    int i = 50;
    AppMethodBeat.i(134367);
    if (this.jax == AppBrandRecentView.f.jmH)
      AppMethodBeat.o(134367);
    while (true)
    {
      return i;
      if (this.jax == AppBrandRecentView.f.jmI)
      {
        i = b.axI();
        AppMethodBeat.o(134367);
      }
      else
      {
        AppMethodBeat.o(134367);
      }
    }
  }

  public List<a> getPreviewItemList()
  {
    AppMethodBeat.i(134378);
    List localList = super.getPreviewItemList();
    AppMethodBeat.o(134378);
    return localList;
  }

  protected int getShowCount()
  {
    AppMethodBeat.i(134368);
    int i;
    if (this.jax == AppBrandRecentView.f.jmH)
    {
      i = b.iWq;
      AppMethodBeat.o(134368);
    }
    while (true)
    {
      return i;
      if (this.jax == AppBrandRecentView.f.jmI)
      {
        i = b.axI();
        AppMethodBeat.o(134368);
      }
      else
      {
        i = 50;
        AppMethodBeat.o(134368);
      }
    }
  }

  protected float getShowCountPerPage()
  {
    AppMethodBeat.i(134365);
    float f = b.getShowCountPerPage();
    AppMethodBeat.o(134365);
    return f;
  }

  protected String getType()
  {
    AppMethodBeat.i(134369);
    String str = ConversationAppBrandRecentView.class.getSimpleName();
    AppMethodBeat.o(134369);
    return str;
  }

  protected final void init(Context paramContext)
  {
    AppMethodBeat.i(134372);
    super.init(paramContext);
    this.mScreenWidth = getResources().getDisplayMetrics().widthPixels;
    super.setOnItemClickListener(new ConversationAppBrandRecentView.1(this));
    if (b.aPd())
      super.setOnScrollPageListener(new ConversationAppBrandRecentView.2(this));
    AppMethodBeat.o(134372);
  }

  protected final void qW(int paramInt)
  {
    AppMethodBeat.i(134374);
    super.qW(paramInt);
    getPreviewItemList().remove(paramInt);
    getAdapter().ci(paramInt);
    getAdapter().ar(paramInt, 5);
    if (this.jax == AppBrandRecentView.f.jmH)
    {
      al.n(new ConversationAppBrandRecentView.3(this), 200L);
      AppMethodBeat.o(134374);
    }
    while (true)
    {
      return;
      if (getOnDataChangedListener() != null)
      {
        AppBrandRecentView.d locald = getOnDataChangedListener();
        getPreviewItemList().size();
        locald.aQf();
      }
      AppMethodBeat.o(134374);
    }
  }

  public final boolean qX(int paramInt)
  {
    AppMethodBeat.i(134379);
    int i = getCurrentPage();
    int j = b.getCompletelyCountPerPage();
    b.aPf();
    boolean bool;
    if ((i + 1) * j + 1 == paramInt)
    {
      bool = true;
      AppMethodBeat.o(134379);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(134379);
    }
  }

  public void setCreateContextMenuListener(View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
    this.jnX = paramOnCreateContextMenuListener;
  }

  public void setIgnoreNotify(boolean paramBoolean)
  {
    this.jnZ = paramBoolean;
  }

  public void setMenuItemSelectedListener(AppBrandRecentView.a parama)
  {
    this.jnY = parama;
  }

  public void setOnBindCustomViewHolderListener(ConversationAppBrandRecentView.a parama)
  {
    this.jnW = parama;
  }

  public void setOnItemClickListener(AppBrandRecentView.b paramb)
  {
    this.jas = paramb;
  }

  public void setOnScrollPageListener(e.a parama)
  {
    this.jnS = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public class BizTimeLineHotListView extends MRecyclerView
{
  private List<b> iKa;
  private f jQe;
  private a jQf;
  private e jQg;
  private float jnU;
  private int jnV;
  private Context mContext;
  private int mScreenWidth;

  public BizTimeLineHotListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(14290);
    this.iKa = new ArrayList();
    this.jnU = 0.0F;
    this.mScreenWidth = 0;
    this.jnV = 0;
    this.mContext = paramContext;
    AppMethodBeat.o(14290);
  }

  public BizTimeLineHotListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(14291);
    this.iKa = new ArrayList();
    this.jnU = 0.0F;
    this.mScreenWidth = 0;
    this.jnV = 0;
    this.mContext = paramContext;
    AppMethodBeat.o(14291);
  }

  private void aR(List<b> paramList)
  {
    AppMethodBeat.i(14301);
    if (this.iKa == null)
      AppMethodBeat.o(14301);
    while (true)
    {
      return;
      b localb = new b((byte)0);
      localb.vGE = "__BizTimeLine.CustomItem__";
      paramList.add(0, localb);
      AppMethodBeat.o(14301);
    }
  }

  private void g(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(14295);
    ab.d("MicroMsg.BizTimeLineHotListView", "alvinluo updateAlpha pos: %d", new Object[] { Integer.valueOf(paramInt) });
    float f;
    if (paramv != null)
    {
      f = paramv.apJ.getX();
      if (f >= this.mScreenWidth - getItemWidth() / 2)
      {
        paramv.apJ.setAlpha(0.3F);
        AppMethodBeat.o(14295);
      }
    }
    while (true)
    {
      return;
      if ((f < this.mScreenWidth - getItemWidth() / 2) && (f >= this.jnU))
      {
        f = 1.0F - (f - this.jnU) / this.jnV * 0.7F;
        ab.d("MicroMsg.BizTimeLineHotListView", "alvinluo updateAlpha %f", new Object[] { Float.valueOf(f) });
        paramv.apJ.setAlpha(f);
        AppMethodBeat.o(14295);
      }
      else
      {
        paramv.apJ.setAlpha(1.0F);
        AppMethodBeat.o(14295);
      }
    }
  }

  private int getItemPadding()
  {
    AppMethodBeat.i(14297);
    int i = a.dj(getContext());
    AppMethodBeat.o(14297);
    return i;
  }

  public final void a(Context paramContext, List<b> paramList, e parame)
  {
    AppMethodBeat.i(14294);
    this.jQg = parame;
    this.iKa.addAll(paramList);
    aR(this.iKa);
    this.jQf = new a(paramContext);
    paramList = new BizTimeLineHotListView.2(this);
    paramList.setOrientation(0);
    setLayoutManager(paramList);
    setAdapter(this.jQf);
    this.jQe = new f(getCustomItemCount());
    paramList = this.jQe;
    int i = a.getCompletelyCountPerPage();
    paramList.mContext = paramContext;
    paramList.jQE = this;
    paramList.jom = i;
    paramList.jQE.b(paramList);
    paramList.jQE.a(paramList);
    paramList.jop = ((LinearLayoutManager)paramList.jQE.getLayoutManager());
    paramList.aoC = new f.1(paramList, paramList.jQE.getContext());
    paramList.jol = new f.2(paramList, paramList.jQE.getContext());
    setOnScrollPageListener(new f.a()
    {
      public final void fy(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(14283);
        if (!paramAnonymousBoolean)
        {
          int i = (int)(System.currentTimeMillis() / 1000L);
          h.pYm.e(15721, new Object[] { "", Integer.valueOf(0), Integer.valueOf(10), Integer.valueOf(i), Integer.valueOf(com.tencent.mm.storage.s.getSessionId()) });
        }
        BizTimeLineHotListView.this.aWJ();
        AppMethodBeat.o(14283);
      }

      public final void sj(int paramAnonymousInt)
      {
        AppMethodBeat.i(14282);
        ab.d("MicroMsg.BizTimeLineHotListView", "alvinluo ScrollPageListener onScrolled offsetOfCurPage: %d, , currentPage: %d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(BizTimeLineHotListView.this.getCurrentPage()) });
        BizTimeLineHotListView.d(BizTimeLineHotListView.this);
        AppMethodBeat.o(14282);
      }
    });
    setOnItemClickListener(new BizTimeLineHotListView.3(this));
    AppMethodBeat.o(14294);
  }

  public final boolean aSd()
  {
    return false;
  }

  public final void aWJ()
  {
    AppMethodBeat.i(14293);
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.iKa);
    com.tencent.mm.plugin.brandservice.b.a("BrandServiceWorkerThread", new BizTimeLineHotListView.1(this, localArrayList), 0L);
    AppMethodBeat.o(14293);
  }

  public final void aZ(List<b> paramList)
  {
    AppMethodBeat.i(14292);
    this.iKa.clear();
    this.iKa.addAll(paramList);
    aR(this.iKa);
    this.jQf.aop.notifyChanged();
    AppMethodBeat.o(14292);
  }

  public final boolean ak(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14296);
    f localf = this.jQe;
    localf.N(localf.qY(localf.mOffsetX + paramInt1), false);
    boolean bool = super.ak(paramInt1, paramInt2);
    AppMethodBeat.o(14296);
    return bool;
  }

  public a getAdapter()
  {
    return this.jQf;
  }

  public int getCurrentPage()
  {
    if (this.jQe != null);
    for (int i = this.jQe.jiy; ; i = 0)
      return i;
  }

  public int getCustomItemCount()
  {
    return 1;
  }

  public int getDataCount()
  {
    AppMethodBeat.i(14298);
    int i = this.iKa.size();
    AppMethodBeat.o(14298);
    return i;
  }

  public int getItemWidth()
  {
    AppMethodBeat.i(14300);
    int i = a.di(this.mContext);
    AppMethodBeat.o(14300);
    return i;
  }

  public int getShowCount()
  {
    return 12;
  }

  protected float getShowCountPerPage()
  {
    AppMethodBeat.i(14299);
    float f = a.getShowCountPerPage();
    AppMethodBeat.o(14299);
    return f;
  }

  public void setOnScrollPageListener(f.a parama)
  {
    if (this.jQe != null)
      this.jQe.jQG = parama;
  }

  public final class a extends RecyclerView.a<BizTimeLineHotListView.b>
  {
    private Context mContext;

    public a(Context arg2)
    {
      Object localObject;
      this.mContext = localObject;
    }

    private void a(BizTimeLineHotListView.b paramb, b paramb1, int paramInt)
    {
      AppMethodBeat.i(14286);
      int i = BizTimeLineHotListView.this.getItemWidth();
      float f = BizTimeLineHotListView.this.getShowCountPerPage();
      int j = i;
      if (i <= 0)
        j = (int)(BizTimeLineHotListView.this.getWidth() / f);
      i = j;
      if (j <= 0)
        i = (int)(BizTimeLineHotListView.this.getResources().getDisplayMetrics().widthPixels / f);
      j = i;
      if (paramInt == BizTimeLineHotListView.e(BizTimeLineHotListView.this).getItemCount() - 1)
      {
        double d = i;
        j = (int)((1.0D - (Math.ceil(f) - f)) * d);
        ab.i("MicroMsg.BizTimeLineHotListView", "alvinluo lastPosition %d set width %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j) });
      }
      paramb.apJ.getLayoutParams().width = j;
      paramb.apJ.setScaleX(1.0F);
      paramb.apJ.setScaleY(1.0F);
      paramb.gne.setText("pos:".concat(String.valueOf(paramInt)));
      ab.d("MicroMsg.BizTimeLineHotListView", "alvinluo onBindCustomViewHolder postion: %d, width: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j) });
      if ((paramb1 != null) && (paramb1.type != 2))
      {
        a.b.r(paramb.iqT, paramb1.vGE);
        String str = com.tencent.mm.model.s.mJ(paramb1.vGE);
        paramb.gne.setText(str);
        if (!paramb1.jQz)
          break label288;
        paramb.jQj.setVisibility(0);
      }
      while (true)
      {
        BizTimeLineHotListView.a(BizTimeLineHotListView.this, paramb, paramb1, paramInt);
        AppMethodBeat.o(14286);
        return;
        label288: paramb.jQj.setVisibility(8);
      }
    }

    public final int getItemCount()
    {
      AppMethodBeat.i(14284);
      int i;
      if (bo.ek(BizTimeLineHotListView.b(BizTimeLineHotListView.this)))
      {
        i = 0;
        AppMethodBeat.o(14284);
      }
      while (true)
      {
        return i;
        int j = BizTimeLineHotListView.b(BizTimeLineHotListView.this).size();
        int k = a.getCompletelyCountPerPage();
        i = j;
        if (BizTimeLineHotListView.this.getCustomItemCount() == 1)
          i = j - 1;
        j = i;
        if (i > BizTimeLineHotListView.this.getShowCount())
          j = BizTimeLineHotListView.this.getShowCount();
        if (BizTimeLineHotListView.this.getCustomItemCount() == 1)
        {
          if (j % k == 0)
            j++;
          while (true)
          {
            i = j + BizTimeLineHotListView.this.getCustomItemCount();
            AppMethodBeat.o(14284);
            break;
            j += k + 1 - j % k;
          }
        }
        i = j;
        if (j % k != 0)
          i = j + (k - j % k);
        AppMethodBeat.o(14284);
      }
    }

    public final int getItemViewType(int paramInt)
    {
      AppMethodBeat.i(14285);
      paramInt = super.getItemViewType(paramInt);
      AppMethodBeat.o(14285);
      return paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView
 * JD-Core Version:    0.6.2
 */
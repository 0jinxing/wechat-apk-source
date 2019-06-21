package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.support.v7.h.c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.ag;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class BaseAppBrandRecentView extends AppBrandRecentView
  implements k.a
{
  protected int aKu = 0;
  private float ati;
  private float atj;
  List<a> iJL = new ArrayList();
  protected AppBrandRecentView.f jax;
  private BaseAppBrandRecentView.a jnA;
  public e jnB = null;
  boolean jnC = false;
  private AppBrandRecentView.d jnD = null;
  private final Object jnE = new Object();
  private boolean jnF = false;
  private al jnG = null;
  private ConcurrentLinkedQueue<BaseAppBrandRecentView.d> jnH = new ConcurrentLinkedQueue();
  private AppBrandRecentView.c jnI = new AppBrandRecentView.c()
  {
    public final List<LocalUsageInfo> qr(int paramAnonymousInt)
    {
      AppMethodBeat.i(134341);
      List localList = ((ag)g.K(ag.class)).nA(paramAnonymousInt);
      AppMethodBeat.o(134341);
      return localList;
    }
  };
  private float jnJ = 1.0F;
  private boolean jnK = false;
  protected float jnw;
  private AppBrandRecentView.b jnx;
  public List<a> jny = new ArrayList();
  private BaseAppBrandRecentView.d jnz;
  private Context mContext;

  public BaseAppBrandRecentView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }

  public BaseAppBrandRecentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }

  private static String EU(String paramString)
  {
    Object localObject = paramString;
    if (paramString != null);
    try
    {
      if (com.tencent.mm.ui.tools.f.asg(paramString) <= 11)
      {
        localObject = paramString;
        return localObject;
      }
      char[] arrayOfChar = paramString.toCharArray();
      int i = arrayOfChar.length;
      int j = 0;
      int k = 0;
      int m = 0;
      while (true)
      {
        localObject = paramString;
        if (j >= i)
          break;
        m += com.tencent.mm.ui.tools.f.asg(String.valueOf(arrayOfChar[j]));
        if (m >= 11)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = paramString.substring(0, k) + '…';
          break;
        }
        j++;
        k++;
      }
    }
    catch (Exception localException)
    {
      while (true)
        String str = paramString;
    }
  }

  public void a(BaseAppBrandRecentView.c paramc, a parama, int paramInt)
  {
    int i = getItemWidth();
    float f = getShowCountPerPage();
    int j = i;
    if (i <= 0)
      j = (int)(getWidth() / f);
    i = j;
    if (j <= 0)
      i = (int)(getResources().getDisplayMetrics().widthPixels / f);
    j = i;
    if (paramInt == this.jnA.getItemCount() - 1)
    {
      double d = i;
      j = (int)((1.0D - (Math.ceil(f) - f)) * d);
      ab.i("MicroMsg.BaseAppBrandRecentView", "alvinluo lastPosition %d set width %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j) });
    }
    paramc.apJ.getLayoutParams().width = j;
    paramc.apJ.setScaleX(1.0F);
    paramc.apJ.setScaleY(1.0F);
    ab.d("MicroMsg.BaseAppBrandRecentView", "alvinluo onBindCustomViewHolder postion: %d, width: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j) });
    if ((parama != null) && (parama.type == 1) && (parama.iXW != null))
    {
      if (bo.isNullOrNil(parama.iXW.bQo))
        break label282;
      paramc.gne.setText(EU(parama.iXW.bQo));
      paramc.gne.setVisibility(0);
      paramc.iYd.setVisibility(0);
      if (bo.isNullOrNil(parama.iXW.haO))
        break label418;
      b.abR().a(paramc.iqT, parama.iXW.haO, com.tencent.mm.modelappbrand.a.a.abQ(), com.tencent.mm.modelappbrand.a.f.fqH);
    }
    while (true)
    {
      return;
      label282: if (!bo.isNullOrNil(parama.iXW.nickname))
      {
        String str = EU(parama.iXW.nickname);
        paramc.gne.setText(str);
        paramc.gne.setVisibility(0);
        break;
      }
      if (!bo.isNullOrNil(parama.iXW.username))
      {
        paramc.gne.setText(parama.iXW.username);
        paramc.gne.setVisibility(0);
        break;
      }
      ab.w("MicroMsg.BaseAppBrandRecentView", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", new Object[] { parama.iXW.username, parama.iXW.appId });
      paramc.gne.setText("");
      paramc.gne.setVisibility(4);
      break;
      label418: paramc.iqT.setImageDrawable(com.tencent.mm.modelappbrand.a.a.abQ());
    }
  }

  public void a(String paramString, m paramm)
  {
    ab.i("MicroMsg.BaseAppBrandRecentView", "[onNotifyChange] process:%s eventId:%s, mType: %s", new Object[] { ((h)g.RM().Rn()).toString(), Integer.valueOf(paramm.hsh), this.jax });
    if ((paramm.hsh == 5) && (aRZ()))
      ab.i("MicroMsg.BaseAppBrandRecentView", "[onNotifyChange] Ignore!!!");
    while (true)
    {
      return;
      refresh();
    }
  }

  public void aR(List<a> paramList)
  {
  }

  protected boolean aRZ()
  {
    return false;
  }

  public final boolean ak(int paramInt1, int paramInt2)
  {
    e locale = this.jnB;
    locale.N(locale.qY(locale.mOffsetX + paramInt1), false);
    return super.ak(paramInt1, paramInt2);
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    return true;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if (paramMotionEvent.getAction() == 0)
    {
      this.ati = paramMotionEvent.getRawX();
      this.atj = paramMotionEvent.getRawY();
      if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1))
        this.jnK = false;
      bool = super.dispatchTouchEvent(paramMotionEvent);
    }
    while (true)
    {
      return bool;
      if ((paramMotionEvent.getAction() != 2) || (!this.jnK))
        break;
    }
  }

  public RecyclerView.a getAdapter()
  {
    return this.jnA;
  }

  protected int getCompletelyCountPerPage()
  {
    return 4;
  }

  public int getCount()
  {
    return this.jny.size();
  }

  public int getCurrentPage()
  {
    if (this.jnB != null);
    for (int i = this.jnB.jiy; ; i = 0)
      return i;
  }

  public int getCustomItemCount()
  {
    return 0;
  }

  public int getDataCount()
  {
    if (this.jny != null);
    for (int i = this.jny.size(); ; i = 0)
      return i;
  }

  public int getItemWidth()
  {
    return 0;
  }

  public abstract int getLayoutId();

  protected abstract int getLoadCount();

  protected AppBrandRecentView.d getOnDataChangedListener()
  {
    return this.jnD;
  }

  public AppBrandRecentView.b getOnItemClickListener()
  {
    return this.jnx;
  }

  public List<a> getPreviewItemList()
  {
    if (this.jny == null)
      this.jny = new ArrayList();
    return this.jny;
  }

  protected abstract int getShowCount();

  protected float getShowCountPerPage()
  {
    return 4.0F;
  }

  protected abstract String getType();

  protected void init(Context paramContext)
  {
    this.mContext = paramContext;
    this.jnw = paramContext.getResources().getDimension(2131427569);
    paramContext = new BaseAppBrandRecentView.2(this);
    paramContext.setOrientation(0);
    setLayoutManager(paramContext);
    setHasFixedSize(true);
    paramContext = new BaseAppBrandRecentView.a(this, (byte)0);
    this.jnA = paramContext;
    setAdapter(paramContext);
    this.jnB = new e(getCustomItemCount());
    e locale = this.jnB;
    paramContext = getContext();
    int i = getCompletelyCountPerPage();
    locale.mContext = paramContext;
    locale.joi = this;
    locale.jom = i;
    locale.joi.b(locale);
    locale.joi.a(locale);
    locale.jop = ((LinearLayoutManager)locale.joi.getLayoutManager());
    locale.aoC = new e.1(locale, locale.joi.getContext());
    locale.jol = new e.2(locale, locale.joi.getContext());
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.aKu = getMeasuredWidth();
    ab.d("MicroMsg.BaseAppBrandRecentView", "alvinluo onMeasure mViewWidth %d", new Object[] { Integer.valueOf(this.aKu) });
  }

  protected void qW(int paramInt)
  {
    if ((this.jnC) && (paramInt - 1 < this.iJL.size()))
      this.iJL.remove(paramInt - 1);
  }

  public final void refresh()
  {
    if (this.jnG == null)
      this.jnG = new al("UpdateAppBrandList_" + this.jax);
    synchronized (this.jnE)
    {
      if (this.jnF)
      {
        ab.i("MicroMsg.BaseAppBrandRecentView", "alvinluo refresh is running and delay mType: %s", new Object[] { this.jax });
        if (this.jnH.size() <= 0)
        {
          ab.i("MicroMsg.BaseAppBrandRecentView", "alvinluo refresh add updateTask");
          localObject2 = this.jnH;
          locald = new com/tencent/mm/plugin/appbrand/widget/recentview/BaseAppBrandRecentView$d;
          locald.<init>(this);
          ((ConcurrentLinkedQueue)localObject2).add(locald);
        }
        return;
      }
      this.jnF = true;
      Object localObject2 = this.jnG;
      BaseAppBrandRecentView.d locald = new com/tencent/mm/plugin/appbrand/widget/recentview/BaseAppBrandRecentView$d;
      locald.<init>(this);
      ((al)localObject2).aa(locald);
    }
  }

  public final void release()
  {
    if (this.jax == AppBrandRecentView.f.jmI)
      if (g.K(af.class) != null)
        ((af)g.K(af.class)).d(this);
    while (true)
    {
      if (this.jnz != null)
        com.tencent.mm.sdk.g.d.xDG.remove(this.jnz);
      this.jny.clear();
      if (this.jnG != null)
        this.jnG.oAl.quit();
      return;
      if ((this.jax == AppBrandRecentView.f.jmH) && (g.K(ag.class) != null))
        ((ag)g.K(ag.class)).d(this);
    }
  }

  public void setDataQuery(AppBrandRecentView.c paramc)
  {
    this.jnI = paramc;
  }

  public void setEnableDataCache(boolean paramBoolean)
  {
    this.jnC = paramBoolean;
  }

  public void setOnDataChangedListener(AppBrandRecentView.d paramd)
  {
    this.jnD = paramd;
  }

  public void setOnItemClickListener(AppBrandRecentView.b paramb)
  {
    this.jnx = paramb;
  }

  public void setOnScrollPageListener(e.a parama)
  {
    if (this.jnB != null)
      this.jnB.jor = parama;
  }

  public void setType(AppBrandRecentView.f paramf)
  {
    this.jax = paramf;
    if (this.jax == AppBrandRecentView.f.jmI)
      if (g.K(af.class) != null)
        ((af)g.K(af.class)).c(this);
    while (true)
    {
      return;
      if ((this.jax == AppBrandRecentView.f.jmH) && (g.K(ag.class) != null))
        ((ag)g.K(ag.class)).c(this);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView
 * JD-Core Version:    0.6.2
 */
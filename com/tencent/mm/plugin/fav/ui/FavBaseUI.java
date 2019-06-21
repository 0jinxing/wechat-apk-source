package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ac;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.aj;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.o;
import com.tencent.mm.plugin.fav.a.r;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.a.a;
import com.tencent.mm.plugin.fav.ui.widget.c;
import com.tencent.mm.plugin.fav.ui.widget.c.a;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;

public abstract class FavBaseUI extends MMActivity
  implements AdapterView.OnItemClickListener
{
  protected com.tencent.mm.sdk.platformtools.ak fbD = new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper());
  private final Object lockObj = new Object();
  private HandlerThread mcx;
  protected com.tencent.mm.sdk.platformtools.ak mcy;
  private f mhA = new FavBaseUI.8(this);
  private f mhB = new FavBaseUI.9(this);
  private Runnable mhC = new Runnable()
  {
    public final void run()
    {
      AppMethodBeat.i(73935);
      a locala = FavBaseUI.this.bvu();
      locala.bvX();
      locala.bvY();
      FavBaseUI.this.bvz();
      AppMethodBeat.o(73935);
    }
  };
  protected Runnable mhD = new Runnable()
  {
    public final void run()
    {
      AppMethodBeat.i(73936);
      a locala = FavBaseUI.this.bvu();
      if ((!locala.isEmpty()) && (SystemClock.elapsedRealtime() - FavBaseUI.e(FavBaseUI.this) < 400L))
      {
        ab.d("MicroMsg.FavoriteBaseUI", "try refresh, time limit, now %d last %d delay %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(FavBaseUI.e(FavBaseUI.this)), Integer.valueOf(400) });
        FavBaseUI.this.fbD.postDelayed(this, 200L);
        AppMethodBeat.o(73936);
      }
      while (true)
      {
        return;
        FavBaseUI.f(FavBaseUI.this);
        FavBaseUI.a(FavBaseUI.this, SystemClock.elapsedRealtime());
        ab.v("MicroMsg.FavoriteBaseUI", "do refresh job");
        locala.notifyDataSetChanged();
        FavBaseUI.this.a(locala);
        if (FavBaseUI.this.mhp)
        {
          ab.v("MicroMsg.FavoriteBaseUI", "do scroll to first");
          FavBaseUI.this.mhs.setSelection(0);
          FavBaseUI.this.mhp = false;
        }
        AppMethodBeat.o(73936);
      }
    }
  };
  private Runnable mhE = new FavBaseUI.2(this);
  private k.a mhF = new FavBaseUI.3(this);
  private boolean mho = false;
  protected boolean mhp = false;
  private boolean mhq = false;
  private long mhr = 0L;
  protected ListView mhs;
  protected TextView mht;
  protected View mhu;
  private View mhv;
  protected c mhw;
  protected View mhx;
  protected l mhy;
  protected c.a mhz = null;

  private void hi(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.mht == null)
        this.mht = ((TextView)((ViewStub)findViewById(2131823991)).inflate().findViewById(2131823609));
      this.mht.setVisibility(0);
    }
    while (true)
    {
      return;
      if (this.mht != null)
        this.mht.setVisibility(8);
    }
  }

  protected final void a(a parama)
  {
    if (parama == null)
      ab.w("MicroMsg.FavoriteBaseUI", "handle empty view fail, adapter is null");
    while (true)
    {
      return;
      if (parama.isEmpty())
        if (bvw())
        {
          hh(true);
          hi(false);
        }
      while (true)
      {
        if ((!parama.isEmpty()) && (!((ae)g.M(ae.class)).getFavItemInfoStorage().t(parama.bvV(), parama.getType())))
          break label117;
        this.mhs.removeFooterView(this.mhu);
        break;
        hh(false);
        hi(true);
        bvx();
        continue;
        hh(false);
        hi(false);
      }
      label117: if (this.mhs.getFooterViewsCount() == 0)
        this.mhs.addFooterView(this.mhu);
    }
  }

  public abstract a bvu();

  protected abstract void bvv();

  protected abstract boolean bvw();

  protected abstract void bvx();

  protected abstract View.OnClickListener bvy();

  protected void bvz()
  {
    ab.i("MicroMsg.FavoriteBaseUI", "on storage change, try refresh job");
    this.fbD.removeCallbacks(this.mhD);
    this.fbD.post(this.mhD);
  }

  public final int getLayoutId()
  {
    return 2130969535;
  }

  protected final void hh(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.mhv == null)
        this.mhv = ((ViewStub)findViewById(2131823883)).inflate();
      this.mhv.setVisibility(0);
    }
    while (true)
    {
      return;
      if (this.mhv != null)
        this.mhv.setVisibility(8);
    }
  }

  protected void initHeaderView()
  {
    this.mhw = new c(this.mController.ylL);
    this.mhw.setCleanFavSpace(this.mhz);
    this.mhw.hn(false);
    this.mhw.mpK.setVisibility(8);
    this.mhw.mpL.setVisibility(8);
    ab.d("MicroMsg.FavoriteBaseUI", "padding %s, %s", new Object[] { Integer.valueOf(this.mhw.getPaddingTop()), Integer.valueOf(this.mhw.getPaddingBottom()) });
    this.mhs.addHeaderView(this.mhw);
    this.mhx = View.inflate(this.mController.ylL, 2130969532, null);
    TextView localTextView1 = (TextView)this.mhx.findViewById(2131823983);
    final TextView localTextView2 = (TextView)this.mhx.findViewById(2131823982);
    TextView localTextView3 = (TextView)this.mhx.findViewById(2131823987);
    TextView localTextView4 = (TextView)this.mhx.findViewById(2131823985);
    TextView localTextView5 = (TextView)this.mhx.findViewById(2131823989);
    TextView localTextView6 = (TextView)this.mhx.findViewById(2131823984);
    final TextView localTextView7 = (TextView)this.mhx.findViewById(2131823986);
    TextView localTextView8 = (TextView)this.mhx.findViewById(2131823988);
    View.OnClickListener localOnClickListener = bvy();
    localTextView1.setOnClickListener(localOnClickListener);
    localTextView1.setTag(Integer.valueOf(5));
    localTextView2.setOnClickListener(localOnClickListener);
    localTextView2.setTag(Integer.valueOf(21));
    localTextView3.setOnClickListener(localOnClickListener);
    localTextView3.setTag(Integer.valueOf(3));
    localTextView4.setOnClickListener(localOnClickListener);
    localTextView4.setTag(Integer.valueOf(7));
    localTextView5.setOnClickListener(localOnClickListener);
    localTextView5.setTag(Integer.valueOf(6));
    localTextView6.setOnClickListener(localOnClickListener);
    localTextView6.setTag(Integer.valueOf(8));
    localTextView7.setOnClickListener(localOnClickListener);
    localTextView7.setTag(Integer.valueOf(17));
    localTextView8.setOnClickListener(localOnClickListener);
    localTextView8.setTag(Integer.valueOf(18));
    this.mhx.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        AppMethodBeat.i(73932);
        FavBaseUI.this.mhx.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int i = FavBaseUI.this.mhx.findViewById(2131823981).getWidth() / 4;
        if ((i > 0) && (localTextView2.getWidth() < i))
        {
          localTextView2.setWidth(i);
          localTextView7.setWidth(i);
        }
        AppMethodBeat.o(73932);
      }
    });
    this.mhs.addHeaderView(this.mhx);
  }

  public final void initView()
  {
    long l = System.currentTimeMillis();
    this.mhs = ((ListView)findViewById(2131823990));
    this.mhs.setDrawingCacheEnabled(false);
    new FavBaseUI.4(this);
    initHeaderView();
    this.mhu = v.hu(this).inflate(2130969518, null);
    this.mhs.setOnScrollListener(new FavBaseUI.5(this));
    this.mhs.setOnItemClickListener(this);
    this.mhs.setOnTouchListener(new FavBaseUI.6(this));
    this.mhs.setAdapter(bvu());
    a(bvu());
    ab.d("MicroMsg.FavoriteBaseUI", "init view use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }

  public void onCreate(Bundle paramBundle)
  {
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    ab.i("MicroMsg.FavoriteBaseUI", "onCreate MMCore.accHasReady[%b]", new Object[] { Boolean.valueOf(g.RK()) });
    paramBundle = new com.tencent.mm.plugin.fav.a.ak();
    g.Rg().a(paramBundle, 0);
    ((ae)g.M(ae.class)).getFavItemInfoStorage().c(this.mhF);
    g.Rg().a(400, this.mhA);
    g.Rg().a(402, this.mhB);
    this.mcx = d.anM(getClass().getName() + "_handlerThread_" + System.currentTimeMillis());
    this.mcx.start();
    this.mcy = new com.tencent.mm.sdk.platformtools.ak(this.mcx.getLooper());
    this.mhy = new l(this.mController.ylL, 64);
    initView();
    xE(this.mController.ylL.getResources().getColor(2131690310));
    if (bo.h((Integer)g.RP().Ry().get(8217, null)) == 0)
    {
      ab.i("MicroMsg.FavoriteBaseUI", "do init data for first time");
      this.mhq = true;
      paramBundle = new aj();
      g.Rg().a(paramBundle, 0);
      if (this.mhq)
      {
        ab.i("MicroMsg.FavoriteBaseUI", "show loading dialog");
        if ((bvu() == null) || (bvu().isEmpty()))
          hh(true);
        hi(false);
      }
    }
    while (true)
    {
      ((ae)g.M(ae.class)).getFavCdnService().run();
      ((ae)g.M(ae.class)).getCheckCdnService().run();
      ((ae)g.M(ae.class)).getSendService().run();
      ((ae)g.M(ae.class)).getModService().run();
      g.RS().aa(new FavBaseUI.1(this));
      ab.d("MicroMsg.FavoriteBaseUI", "on create use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      return;
      b.startSync();
      if (bvu().isEmpty())
      {
        hh(true);
        hi(false);
        this.mhu.setVisibility(8);
      }
      else
      {
        hh(false);
        hi(false);
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (((ae)g.M(ae.class)).getFavItemInfoStorage().buR() == null);
    while (true)
    {
      return;
      this.mhy.destory();
      this.mhy = null;
      this.mcx.quit();
      ((ae)g.M(ae.class)).getFavItemInfoStorage().d(this.mhF);
      g.Rg().b(400, this.mhA);
      g.Rg().b(402, this.mhB);
    }
  }

  public void onPause()
  {
    super.onPause();
    bvu();
  }

  public void onResume()
  {
    super.onResume();
    i.Lt(5);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavBaseUI
 * JD-Core Version:    0.6.2
 */
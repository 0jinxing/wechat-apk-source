package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.d.a;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.d.a.c;
import com.tencent.mm.plugin.fav.ui.widget.a;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavCleanUI extends MMActivity
  implements a.c
{
  protected com.tencent.mm.sdk.platformtools.ak fbD;
  private HandlerThread mcx;
  protected com.tencent.mm.sdk.platformtools.ak mcy;
  private Runnable mhC;
  protected Runnable mhD;
  private l mhN;
  private com.tencent.mm.plugin.fav.ui.a.b mhO;
  private ListView mhP;
  private TextView mhQ;
  private a mhR;
  private boolean mhS;
  private int mhT;
  private d.a mhU;
  private f mhV;
  private boolean mho;
  protected boolean mhp;
  private long mhr;
  protected View mhu;
  private View mhv;

  public FavCleanUI()
  {
    AppMethodBeat.i(73961);
    this.mho = false;
    this.fbD = new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper());
    this.mhS = false;
    this.mhT = 0;
    this.mhU = new FavCleanUI.3(this);
    this.mhV = new FavCleanUI.6(this);
    this.mhC = new FavCleanUI.7(this);
    this.mhr = 0L;
    this.mhp = false;
    this.mhD = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(73960);
        if (FavCleanUI.e(FavCleanUI.this) == null)
          AppMethodBeat.o(73960);
        while (true)
        {
          return;
          if ((!FavCleanUI.e(FavCleanUI.this).isEmpty()) && (SystemClock.elapsedRealtime() - FavCleanUI.h(FavCleanUI.this) < 1000L))
          {
            ab.d("MicroMsg.FavCleanUI", "try refresh, time limit, now %d last %d delay %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(FavCleanUI.h(FavCleanUI.this)), Integer.valueOf(1000) });
            FavCleanUI.this.fbD.postDelayed(this, 500L);
            AppMethodBeat.o(73960);
          }
          else
          {
            FavCleanUI.i(FavCleanUI.this);
            FavCleanUI.a(FavCleanUI.this, SystemClock.elapsedRealtime());
            ab.v("MicroMsg.FavCleanUI", "do refresh job");
            FavCleanUI.d(FavCleanUI.this);
            if (FavCleanUI.this.mhp)
            {
              ab.v("MicroMsg.FavCleanUI", "do scroll to first");
              FavCleanUI.j(FavCleanUI.this).setSelection(0);
              FavCleanUI.this.mhp = false;
            }
            AppMethodBeat.o(73960);
          }
        }
      }
    };
    AppMethodBeat.o(73961);
  }

  private void eY(boolean paramBoolean)
  {
    AppMethodBeat.i(73969);
    if (paramBoolean)
    {
      this.mhv.setVisibility(8);
      this.mhQ.setVisibility(0);
      this.mhP.removeFooterView(this.mhu);
      if (this.mhR == null)
        break label102;
      this.mhR.hide();
      AppMethodBeat.o(73969);
    }
    while (true)
    {
      return;
      this.mhv.setVisibility(8);
      this.mhQ.setVisibility(8);
      this.mhP.removeFooterView(this.mhu);
      if (this.mhR != null)
        this.mhR.show();
      label102: AppMethodBeat.o(73969);
    }
  }

  private void hj(boolean paramBoolean)
  {
    AppMethodBeat.i(73970);
    if (paramBoolean)
    {
      if (this.mhP.getFooterViewsCount() != 0)
        break label50;
      this.mhP.addFooterView(this.mhu);
      AppMethodBeat.o(73970);
    }
    while (true)
    {
      return;
      this.mhP.removeFooterView(this.mhu);
      label50: AppMethodBeat.o(73970);
    }
  }

  protected final void bvz()
  {
    AppMethodBeat.i(73968);
    ab.i("MicroMsg.FavCleanUI", "on storage change, try refresh job");
    this.fbD.removeCallbacks(this.mhD);
    this.fbD.post(this.mhD);
    AppMethodBeat.o(73968);
  }

  public final int getLayoutId()
  {
    return 2130969493;
  }

  public final void iI(long paramLong)
  {
    AppMethodBeat.i(73972);
    Object localObject = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong);
    if ((localObject != null) && (((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto != null) && (((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.wiv.size() != 0))
    {
      localObject = ((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.wiv.iterator();
      while (((Iterator)localObject).hasNext())
        ((Iterator)localObject).next();
    }
    boolean bool;
    a locala;
    if (this.mhO.mlp)
    {
      localObject = this.mhR;
      if (this.mhO.bwb() > 0)
      {
        bool = true;
        if (((a)localObject).mpz)
          ((a)localObject).gzI.setEnabled(bool);
        locala = this.mhR;
        localObject = this.mhO.hk(false);
        paramLong = this.mhO.bwc();
        if ((((List)localObject).size() == 0) || (paramLong <= 0L))
          break label218;
        locala.kxJ.setText(locala.kxJ.getContext().getString(2131299572, new Object[] { com.tencent.mm.plugin.fav.a.b.iv(paramLong) }));
        locala.gzI.setEnabled(true);
        AppMethodBeat.o(73972);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label218: locala.bwz();
      AppMethodBeat.o(73972);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(73967);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(73967);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(73971);
    finish();
    super.onBackPressed();
    AppMethodBeat.o(73971);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(73962);
    super.onCreate(paramBundle);
    this.mhT = getIntent().getIntExtra("key_enter_fav_cleanui_from", 0);
    this.mcx = com.tencent.mm.sdk.g.d.anM(getClass().getName() + "_handlerThread_" + System.currentTimeMillis());
    this.mcx.start();
    this.mcy = new com.tencent.mm.sdk.platformtools.ak(this.mcx.getLooper());
    this.mhP = ((ListView)findViewById(2131823882));
    setMMTitle(2131299577);
    this.mhS = true;
    paramBundle = new com.tencent.mm.plugin.fav.a.ak();
    com.tencent.mm.kernel.g.Rg().a(paramBundle, 0);
    com.tencent.mm.kernel.g.Rg().a(438, this.mhV);
    setBackBtn(new FavCleanUI.1(this));
    paramBundle = (ViewStub)findViewById(2131823883);
    if (paramBundle != null);
    for (this.mhv = paramBundle.inflate(); ; this.mhv = findViewById(2131823610))
    {
      this.mhQ = ((TextView)findViewById(2131823609));
      this.mhv.setVisibility(0);
      this.mhQ.setVisibility(8);
      this.mhP.removeFooterView(this.mhu);
      if (this.mhR != null)
        this.mhR.hide();
      this.mhu = v.hu(this).inflate(2130969518, null);
      this.mhP.setOnScrollListener(new FavCleanUI.2(this));
      if (this.mhS)
      {
        this.mhR = new a();
        paramBundle = this.mhR;
        View localView = findViewById(2131823879);
        paramBundle.mpz = false;
        paramBundle.mpA = localView;
        this.mhR.mpB = new FavCleanUI.5(this);
        this.mhS = false;
      }
      com.tencent.mm.plugin.fav.a.d.bur().a(this.mhU);
      AppMethodBeat.o(73962);
      return;
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(73964);
    ab.d("MicroMsg.FavCleanUI", "on create options menu");
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    AppMethodBeat.o(73964);
    return bool;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(73963);
    super.onDestroy();
    com.tencent.mm.plugin.fav.a.d locald = com.tencent.mm.plugin.fav.a.d.bur();
    d.a locala = this.mhU;
    if (locald.meK.contains(locala))
      locald.meK.remove(locala);
    if (this.mhN != null)
    {
      this.mhN.destory();
      this.mhN = null;
    }
    if (this.mhO != null)
      this.mhO.finish();
    this.mcx.quit();
    com.tencent.mm.kernel.g.Rg().b(438, this.mhV);
    AppMethodBeat.o(73963);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(73965);
    boolean bool = super.onOptionsItemSelected(paramMenuItem);
    AppMethodBeat.o(73965);
    return bool;
  }

  public void onResume()
  {
    AppMethodBeat.i(73966);
    super.onResume();
    AppMethodBeat.o(73966);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavCleanUI
 * JD-Core Version:    0.6.2
 */
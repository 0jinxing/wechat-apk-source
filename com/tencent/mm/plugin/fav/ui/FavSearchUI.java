package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.w;
import com.tencent.mm.plugin.fav.ui.gallery.g.a;
import com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel;
import com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class FavSearchUI extends MMActivity
{
  private String cqz;
  private int gaL;
  private ListView jLm;
  private long kGM;
  private ak mHandler;
  private l mhN;
  private com.tencent.mm.plugin.fav.ui.a.b mhO;
  private int miT;
  private String miU;
  private Set<Integer> miV;
  private w miW;
  private com.tencent.mm.plugin.fav.ui.a.c miX;
  private FavSearchActionView miY;
  private ListView miZ;
  private View mja;
  private FavCapacityPanel mjb;
  private Animation mjc;
  private Animation mjd;
  private List<Integer> mje;
  private List<String> mjf;
  private List<String> mjg;
  private Set<String> mjh;
  private View mji;
  private ImageButton mjj;
  private MenuItem mjk;
  private List<Long> mjl;
  FavSearchUI.a mjm;
  private com.tencent.mm.plugin.fav.ui.gallery.c mjn;
  private String query;

  public FavSearchUI()
  {
    AppMethodBeat.i(74085);
    this.miT = -1;
    this.mjh = new HashSet();
    this.mjl = new ArrayList();
    this.query = "";
    AppMethodBeat.o(74085);
  }

  private void U(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(74090);
    this.mjm.actionType = paramInt1;
    if (this.mhO != null)
      this.mjm.jSW = this.mhO.jSW;
    switch (this.gaL)
    {
    default:
      this.mjm.scene = 0;
      this.mjm.position = paramInt2;
      this.mjm.mjx = ((int)(System.currentTimeMillis() - this.kGM) / 1000);
      this.mjm.query = this.query;
      this.mjm.meT = paramInt3;
      if (this.mje != null)
      {
        if (this.mje.size() <= 0)
          break label389;
        switch (((Integer)this.mje.get(0)).intValue())
        {
        case 4:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 19:
        case 20:
        default:
          this.mjm.mjy = 0;
        case 21:
        case 5:
        case 8:
        case 7:
        case 17:
        case 3:
        case 18:
        case 6:
        }
      }
      break;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      this.mjm.IF();
      AppMethodBeat.o(74090);
      return;
      this.mjm.scene = 1;
      break;
      this.mjm.scene = 2;
      break;
      this.mjm.scene = 3;
      break;
      this.mjm.mjy = 1;
      continue;
      this.mjm.mjy = 2;
      continue;
      this.mjm.mjy = 3;
      continue;
      this.mjm.mjy = 4;
      continue;
      this.mjm.mjy = 5;
      continue;
      this.mjm.mjy = 6;
      continue;
      this.mjm.mjy = 7;
      continue;
      this.mjm.mjy = 8;
      continue;
      label389: this.mjm.mjy = 0;
    }
  }

  private boolean bvL()
  {
    if (this.miT == 21);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void bvM()
  {
    AppMethodBeat.i(74089);
    if (this.miY != null)
      AppMethodBeat.o(74089);
    while (true)
    {
      return;
      this.miY = ((FavSearchActionView)View.inflate(this.mController.ylL, 2130969524, null));
      this.mji = this.miY.findViewById(2131820977);
      this.mji.setOnClickListener(new FavSearchUI.7(this));
      this.mjj = ((ImageButton)this.miY.findViewById(2131823967));
      this.mjj.setVisibility(8);
      this.miY.setOnSearchChangedListener(new FavSearchUI.8(this));
      AppMethodBeat.o(74089);
    }
  }

  public final int getLayoutId()
  {
    return 2130969525;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(74093);
    if (paramInt1 == 1)
      if (paramInt2 != -1)
        AppMethodBeat.o(74093);
    while (true)
    {
      return;
      Object localObject1 = this.mjn.mnS;
      Object localObject2 = paramIntent.getStringExtra("Select_Conv_User");
      if (bo.isNullOrNil((String)localObject2))
      {
        AppMethodBeat.o(74093);
      }
      else
      {
        Object localObject3 = bo.P(((String)localObject2).split(","));
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        localObject1 = ((List)localObject1).iterator();
        while (true)
        {
          if (!((Iterator)localObject1).hasNext())
            break label358;
          Object localObject4 = (com.tencent.mm.plugin.fav.ui.gallery.d)((Iterator)localObject1).next();
          if (localObject4 == null)
          {
            ab.d("MicroMsg.FavSearchUI", "select %s, send item null, continute", new Object[] { localObject2 });
          }
          else
          {
            new k();
            if (k.u(((com.tencent.mm.plugin.fav.ui.gallery.d)localObject4).mnW))
            {
              h.bQ(this.mController.ylL, getString(2131296320));
              AppMethodBeat.o(74093);
              break;
            }
            ab.d("MicroMsg.FavSearchUI", "select %s for sending", new Object[] { localObject2 });
            Object localObject5;
            Object localObject6;
            if ((((com.tencent.mm.plugin.fav.ui.gallery.d)localObject4).bws()) || (((com.tencent.mm.plugin.fav.ui.gallery.d)localObject4).bwt()))
            {
              localObject5 = new FavSearchUI.3(this, h.b(this.mController.ylL, getString(2131299643), false, null));
              localObject6 = ((List)localObject3).iterator();
              while (((Iterator)localObject6).hasNext())
                i.a(this, (String)((Iterator)localObject6).next(), ((com.tencent.mm.plugin.fav.ui.gallery.d)localObject4).cAJ, (Runnable)localObject5);
            }
            else
            {
              localObject6 = new ArrayList();
              ((ArrayList)localObject6).add(com.tencent.mm.plugin.fav.a.b.b(((com.tencent.mm.plugin.fav.ui.gallery.d)localObject4).cAJ));
              localObject4 = ((List)localObject3).iterator();
              while (((Iterator)localObject4).hasNext())
              {
                localObject5 = (String)((Iterator)localObject4).next();
                o.ahj().a(r.Yz(), (String)localObject5, (ArrayList)localObject6, 0, false);
              }
            }
          }
        }
        label358: if (!bo.isNullOrNil(paramIntent))
        {
          localObject2 = ((List)localObject3).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (String)((Iterator)localObject2).next();
            com.tencent.mm.plugin.messenger.a.g.bOk().F((String)localObject3, paramIntent, t.nK((String)localObject3));
          }
        }
        AppMethodBeat.o(74093);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74086);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(2131820940), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    this.mHandler = new ak();
    setMMTitle("");
    xE(this.mController.ylL.getResources().getColor(2131690310));
    this.gaL = getIntent().getIntExtra("key_search_type", 0);
    if (1 == this.gaL)
    {
      this.cqz = getIntent().getStringExtra("key_to_user");
      this.miU = getIntent().getStringExtra("key_fav_item_id");
    }
    this.miT = getIntent().getIntExtra("key_preset_search_type", -1);
    this.miZ = ((ListView)findViewById(2131823968));
    this.jLm = ((ListView)findViewById(2131823969));
    this.mja = findViewById(2131823971);
    this.mjc = AnimationUtils.loadAnimation(this.mController.ylL, 2131034214);
    this.mjd = AnimationUtils.loadAnimation(this.mController.ylL, 2131034215);
    this.mjn = new com.tencent.mm.plugin.fav.ui.gallery.c(this, findViewById(2131823970));
    bvM();
    this.mjb = ((FavCapacityPanel)View.inflate(this.mController.ylL, 2130969491, null));
    this.mjb.mpw = getIntent().getIntExtra("key_enter_fav_search_from", 0);
    this.miX = new FavSearchUI.9(this, this.mController.ylL);
    if (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().buE() > 0)
    {
      paramBundle = (TextView)View.inflate(this.mController.ylL, 2130969529, null);
      this.miZ.addHeaderView(paramBundle);
    }
    this.miZ.addFooterView(this.mjb);
    this.miZ.setAdapter(this.miX);
    this.miZ.setOnTouchListener(new FavSearchUI.10(this));
    this.mhN = new l(this.mController.ylL, 16);
    this.mhO = new com.tencent.mm.plugin.fav.ui.a.b(this.mhN, false);
    this.mhO.scene = 2;
    this.mhO.mlr = this.jLm;
    if (1 == this.gaL)
    {
      this.miV = new HashSet();
      this.miW = new k();
      if (!bo.isNullOrNil(this.miU))
      {
        paramBundle = this.miU.split(",");
        int i = paramBundle.length;
        for (int j = 0; j < i; j++)
        {
          int k = bo.getInt(paramBundle[j], 2147483647);
          if (2147483647 != k)
            this.miV.add(Integer.valueOf(k));
        }
      }
      this.mhO.f(this.miV);
      this.mhO.a(this.miW);
    }
    this.jLm.setAdapter(this.mhO);
    this.jLm.setOnItemClickListener(new FavSearchUI.11(this));
    this.jLm.setOnTouchListener(new FavSearchUI.2(this));
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().a(this.miX);
    com.tencent.mm.kernel.g.RS().m(new FavSearchUI.1(this), 1000L);
    this.mjm = new FavSearchUI.a();
    this.kGM = System.currentTimeMillis();
    if (bvL())
    {
      this.miY.S(this.miT, false);
      this.jLm.setVisibility(8);
      this.miZ.setVisibility(8);
      this.mjn.setVisibility(0);
      paramBundle = this.mjn;
      paramBundle.mnI.s(true, paramBundle.mnL);
      AppMethodBeat.o(74086);
    }
    while (true)
    {
      return;
      if (this.miT > 0)
      {
        this.miY.S(this.miT, true);
        this.mjn.setVisibility(8);
        this.jLm.setVisibility(0);
      }
      AppMethodBeat.o(74086);
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(74088);
    ab.d("MicroMsg.FavSearchUI", "on create options menu");
    bvM();
    this.mjk = paramMenu.add(0, 2131820645, 0, 2131296899);
    android.support.v4.view.g.a(this.mjk, this.miY);
    android.support.v4.view.g.a(this.mjk, 9);
    this.miY.post(new FavSearchUI.4(this));
    android.support.v4.view.g.a(this.mjk, new FavSearchUI.5(this));
    this.mHandler.post(new FavSearchUI.6(this));
    AppMethodBeat.o(74088);
    return true;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74087);
    if (!this.mjm.mjz)
    {
      if ((!this.mhO.isEmpty()) && (this.jLm.getVisibility() == 0))
        break label134;
      U(1, 0, 0);
    }
    while (true)
    {
      this.mjn.mnI.onDetach();
      super.onDestroy();
      this.mhN.destory();
      this.mhN = null;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().a(this.miX);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().e(this.mjh);
      if (this.mhO != null)
        this.mhO.finish();
      AppMethodBeat.o(74087);
      return;
      label134: U(2, 0, 0);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(74092);
    com.tencent.mm.plugin.fav.a.i.LL(getClass().getSimpleName());
    com.tencent.mm.plugin.fav.ui.gallery.c localc;
    if (bvL())
    {
      localc = this.mjn;
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcMediaGalleryScrollEnable, localc.ehv);
      localc.ehv = 0;
      if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
      {
        com.tencent.matrix.trace.f.c localc1 = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
        if (localc1 != null)
          localc1.b(localc.mnM);
      }
      if (bo.anT() <= localc.fAq)
        break label154;
    }
    label154: for (long l = bo.anT() - localc.fAq; ; l = 1L)
    {
      localc.fAq = l;
      WXHardCoderJNI.reportFPS(703, WXHardCoderJNI.hcMediaGalleryScrollAction, 1, localc.eEO, localc.fAq);
      localc.eEO = 0L;
      localc.fAq = 0L;
      super.onPause();
      AppMethodBeat.o(74092);
      return;
    }
  }

  public void onResume()
  {
    long l = 0L;
    AppMethodBeat.i(74091);
    this.mhO.bvY();
    this.mhO.notifyDataSetChanged();
    Object localObject1 = this.mjb;
    Object localObject2;
    if (((FavCapacityPanel)localObject1).mpu != com.tencent.mm.plugin.fav.a.b.buh() / 1048576L)
    {
      ((FavCapacityPanel)localObject1).mpu = (com.tencent.mm.plugin.fav.a.b.buh() / 1048576L);
      TextView localTextView = ((FavCapacityPanel)localObject1).mpv;
      localObject2 = ((FavCapacityPanel)localObject1).mpv.getContext();
      if (((FavCapacityPanel)localObject1).mpx - ((FavCapacityPanel)localObject1).mpu > 0L)
        l = ((FavCapacityPanel)localObject1).mpx - ((FavCapacityPanel)localObject1).mpu;
      localTextView.setText(((Context)localObject2).getString(2131299570, new Object[] { Long.valueOf(l), Long.valueOf(((FavCapacityPanel)localObject1).mpu) }));
    }
    com.tencent.mm.plugin.fav.a.i.LK(getClass().getSimpleName());
    if (bvL())
    {
      localObject1 = this.mjn;
      ((com.tencent.mm.plugin.fav.ui.gallery.c)localObject1).fAq = bo.anT();
      if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
      {
        localObject2 = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
        if (localObject2 != null)
          ((com.tencent.matrix.trace.f.c)localObject2).a(((com.tencent.mm.plugin.fav.ui.gallery.c)localObject1).mnM);
      }
      ((com.tencent.mm.plugin.fav.ui.gallery.c)localObject1).mnI.onResume();
      if (((com.tencent.mm.plugin.fav.ui.gallery.c)localObject1).mnK)
      {
        if (!((com.tencent.mm.plugin.fav.ui.gallery.c)localObject1).mnI.bwy())
          break label252;
        ((com.tencent.mm.plugin.fav.ui.gallery.c)localObject1).bwq();
      }
    }
    while (true)
    {
      ((com.tencent.mm.plugin.fav.ui.gallery.c)localObject1).mnK = false;
      super.onResume();
      AppMethodBeat.o(74091);
      return;
      label252: ((com.tencent.mm.plugin.fav.ui.gallery.c)localObject1).bwr();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI
 * JD-Core Version:    0.6.2
 */
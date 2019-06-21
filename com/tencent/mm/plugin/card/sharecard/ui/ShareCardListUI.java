package com.tencent.mm.plugin.card.sharecard.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.ui.CardDetailUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

public class ShareCardListUI extends CardBaseUI
  implements com.tencent.mm.plugin.card.base.d, k.a
{
  private long jOE = 0L;
  private final long jOF = 500L;
  private boolean jOG = false;
  private String kcM = null;
  private b.a kfs = null;
  private boolean khA = false;
  private com.tencent.mm.plugin.card.sharecard.a.b kha;
  private f khj;
  private e khk;
  private i khl;
  private boolean khm = false;
  private boolean khn = true;
  private boolean kho = false;
  private boolean khp = true;
  private boolean khq = true;
  private boolean khr = false;
  private String khs = "";
  private boolean kht = false;
  private boolean khu = false;
  private boolean khv = false;
  private int khw = 0;
  private boolean khx = false;
  private long khy = 0L;
  boolean khz = false;
  private long mStartTime = 0L;

  private void bbN()
  {
    AppMethodBeat.i(88177);
    ab.d("MicroMsg.ShareCardListUI", "initLocation");
    com.tencent.mm.sdk.g.d.xDH.a(new ShareCardListUI.1(this), "MicroMsg.ShareCardListUI");
    AppMethodBeat.o(88177);
  }

  private void bbO()
  {
    AppMethodBeat.i(88181);
    long l = System.currentTimeMillis() - this.jOE;
    if ((this.jOG) && (l < 1000L))
    {
      ab.d("MicroMsg.ShareCardListUI", "DoingUpdateView return");
      AppMethodBeat.o(88181);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.ShareCardListUI", "try2UpdateView isDoingUpdateView %s,interval %s", new Object[] { Boolean.valueOf(this.jOG), Long.valueOf(l) });
      this.jOG = true;
      if (l < 500L)
      {
        al.n(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(88169);
            ShareCardListUI.i(ShareCardListUI.this);
            if (!ShareCardListUI.this.isFinishing())
            {
              ShareCardListUI.j(ShareCardListUI.this);
              AppMethodBeat.o(88169);
            }
            while (true)
            {
              return;
              ab.w("MicroMsg.ShareCardListUI", "Activity is finished!!!");
              AppMethodBeat.o(88169);
            }
          }
        }
        , 500L);
        AppMethodBeat.o(88181);
      }
      else
      {
        cu();
        this.jOE = System.currentTimeMillis();
        this.jOG = false;
        AppMethodBeat.o(88181);
      }
    }
  }

  private void bbP()
  {
    AppMethodBeat.i(88183);
    if (this.kam.getEmptyView() != this.kao)
    {
      this.kam.setEmptyView(this.kao);
      this.kam.invalidate();
    }
    AppMethodBeat.o(88183);
  }

  private void bbQ()
  {
    AppMethodBeat.i(88184);
    if ((!com.tencent.mm.plugin.card.sharecard.a.b.bbw()) && (!com.tencent.mm.plugin.card.sharecard.a.b.bbv()))
    {
      this.khk.bbJ();
      this.kam.setEmptyView(null);
      this.kam.invalidate();
      this.khA = true;
    }
    AppMethodBeat.o(88184);
  }

  private void bbR()
  {
    AppMethodBeat.i(88185);
    if (this.kam.getEmptyView() != null)
    {
      this.kam.setEmptyView(null);
      this.kam.invalidate();
    }
    AppMethodBeat.o(88185);
  }

  private void bbS()
  {
    AppMethodBeat.i(88186);
    if ((this.kan instanceof c))
      ((c)this.kan).sX(this.khw);
    AppMethodBeat.o(88186);
  }

  private void bbT()
  {
    AppMethodBeat.i(88189);
    if ((com.tencent.mm.plugin.card.sharecard.a.b.bby()) && (com.tencent.mm.plugin.card.sharecard.a.b.bbz()))
    {
      ab.i("MicroMsg.ShareCardListUI", "doGetLayout() no data to load");
      this.khq = true;
      AppMethodBeat.o(88189);
    }
    while (true)
    {
      return;
      if ((!com.tencent.mm.plugin.card.sharecard.a.b.bby()) || (!com.tencent.mm.plugin.card.sharecard.a.b.bbz()))
        this.khp = false;
      ab.i("MicroMsg.ShareCardListUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
      bbU();
      am.bbc().s("", "", 4);
      AppMethodBeat.o(88189);
    }
  }

  private void bbU()
  {
    AppMethodBeat.i(88190);
    if (this.khr)
    {
      ab.e("MicroMsg.ShareCardListUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
      AppMethodBeat.o(88190);
    }
    while (true)
    {
      return;
      if ((bo.isNullOrNil(this.khs)) && (!com.tencent.mm.plugin.card.sharecard.a.b.bbw()) && (!com.tencent.mm.plugin.card.sharecard.a.b.bbv()))
        bbQ();
      if ((this.khp) && (!bo.isNullOrNil(this.khs)))
        this.khs = "";
      this.khr = true;
      com.tencent.mm.plugin.card.sharecard.model.b localb = new com.tencent.mm.plugin.card.sharecard.model.b(am.bbc().ecs, am.bbc().ect, this.khs);
      g.RO().eJo.a(localb, 0);
      AppMethodBeat.o(88190);
    }
  }

  private void bbV()
  {
    AppMethodBeat.i(88196);
    if ((this.khw == 0) || (this.khw == 4) || ((this.khw == 2) && ((!com.tencent.mm.plugin.card.sharecard.a.b.bbw()) || (!com.tencent.mm.plugin.card.sharecard.a.b.bbv()))) || ((this.khw == 1) && ((!com.tencent.mm.plugin.card.sharecard.a.b.bbw()) || (com.tencent.mm.plugin.card.sharecard.a.b.bbv()))) || ((this.khw == 3) && ((!com.tencent.mm.plugin.card.sharecard.a.b.bbv()) || (com.tencent.mm.plugin.card.sharecard.a.b.bbw()))))
      this.khw = com.tencent.mm.plugin.card.sharecard.a.b.bbu();
    am.bbb().putValue("key_share_card_show_type", Integer.valueOf(this.khw));
    AppMethodBeat.o(88196);
  }

  private void bbW()
  {
    AppMethodBeat.i(88199);
    int i = getIntent().getIntExtra("key_from_scene", 22);
    boolean bool1 = com.tencent.mm.x.c.PK().bX(262152, 266256);
    boolean bool2 = com.tencent.mm.x.c.PK().bY(262152, 266256);
    boolean bool3 = com.tencent.mm.x.c.PK().a(ac.a.xKd, ac.a.xKf);
    boolean bool4 = com.tencent.mm.x.c.PK().a(ac.a.xKe, ac.a.xKg);
    String str = bo.nullAsNil((String)g.RP().Ry().get(ac.a.xKj, null));
    if (bool1)
    {
      h.pYm.e(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(2), Integer.valueOf(i), "", Integer.valueOf(0), str });
      AppMethodBeat.o(88199);
    }
    while (true)
    {
      return;
      if (bool2)
      {
        h.pYm.e(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88199);
      }
      else if ((bool3) && (!bool4))
      {
        h.pYm.e(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(3), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88199);
      }
      else if ((bool3) && (bool4))
      {
        h.pYm.e(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(4), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88199);
      }
      else if (bool4)
      {
        h.pYm.e(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(5), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88199);
      }
      else
      {
        h.pYm.e(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88199);
      }
    }
  }

  private void cu()
  {
    AppMethodBeat.i(88182);
    bbV();
    ab.i("MicroMsg.ShareCardListUI", "updateView() currentType is %s, canShowLocalCity %s, canShowOtherCity %s", new Object[] { Integer.valueOf(this.khw), Boolean.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.bbw()), Boolean.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.bbv()) });
    this.khj.cu();
    if ((!com.tencent.mm.plugin.card.sharecard.a.b.bbw()) && (!com.tencent.mm.plugin.card.sharecard.a.b.bbv()))
    {
      this.khk.bbM();
      this.khl.bbX();
      bbP();
    }
    while (true)
    {
      bbS();
      AppMethodBeat.o(88182);
      return;
      this.khk.cu();
      this.khl.cu();
      if (this.khw == 4)
        bbR();
    }
  }

  private void fG(boolean paramBoolean)
  {
    AppMethodBeat.i(88173);
    ab.i("MicroMsg.ShareCardListUI", "doRefreshData() >> updateView() shouldGetLayout %s fromOnresume %s", new Object[] { Boolean.valueOf(this.khn), Boolean.valueOf(paramBoolean) });
    if (this.khn)
    {
      this.khn = false;
      this.kht = false;
      this.khp = true;
      this.khs = "";
      ab.d("MicroMsg.ShareCardListUI", "doRefreshData() >> doNetSceneGetCardsHomePageLayout()");
      if (!paramBoolean)
        break label104;
      if ((this.khx) && (this.khz))
        aZu();
    }
    while (true)
    {
      bbO();
      AppMethodBeat.o(88173);
      return;
      label104: bbU();
    }
  }

  public final BaseAdapter Kw()
  {
    AppMethodBeat.i(88175);
    c localc = new c(this.mController.ylL);
    AppMethodBeat.o(88175);
    return localc;
  }

  public final void a(com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88193);
    super.a(paramb);
    AppMethodBeat.o(88193);
  }

  public final void a(com.tencent.mm.plugin.card.base.b paramb, int paramInt)
  {
    AppMethodBeat.i(88194);
    Intent localIntent = new Intent(this, CardDetailUI.class);
    ab.i("MicroMsg.ShareCardListUI", "card tp id:" + paramb.baa());
    ab.i("MicroMsg.ShareCardListUI", "card id:" + paramb.aZZ());
    localIntent.putExtra("key_card_id", am.bbe().GI(paramb.baa()));
    localIntent.putExtra("key_card_tp_id", paramb.baa());
    localIntent.putExtra("key_is_share_card", true);
    localIntent.putExtra("key_from_scene", 3);
    startActivity(localIntent);
    com.tencent.mm.plugin.card.sharecard.a.b.GF(paramb.baa());
    AppMethodBeat.o(88194);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(88198);
    ab.d("MicroMsg.ShareCardListUI", "onNotifyChange");
    this.khn = true;
    AppMethodBeat.o(88198);
  }

  public final void aZp()
  {
    AppMethodBeat.i(88179);
    setMMTitle(2131297966);
    this.kha = new com.tencent.mm.plugin.card.sharecard.a.b(this);
    this.kfs = new b.a()
    {
    };
    this.kha.kfs = this.kfs;
    this.kha.init();
    this.khw = com.tencent.mm.plugin.card.sharecard.a.b.bbu();
    Object localObject;
    if (this.khl == null)
    {
      this.khl = new i(this, this.mController.contentView);
      localObject = this.khl;
      ((i)localObject).khC = View.inflate(((i)localObject).jiE, 2130968976, null);
      ((i)localObject).khD = ((TextView)((i)localObject).khC.findViewById(2131822293));
      ((i)localObject).khE = ((TextView)((i)localObject).khC.findViewById(2131822294));
      ((i)localObject).cu();
    }
    if (this.khj == null)
    {
      this.khj = new f(this, this.mController.contentView);
      localObject = this.khj;
      ((f)localObject).khe = ((ImageView)((f)localObject).jcl.findViewById(2131822187));
      ((f)localObject).khg = ((TextView)((f)localObject).jcl.findViewById(2131821927));
      ((f)localObject).khf = ((TextView)((f)localObject).jcl.findViewById(2131822189));
      this.khj.kha = this.kha;
    }
    if (this.khk == null)
    {
      this.khk = new e(this);
      this.khk.kha = this.kha;
      this.khk.bbH();
      localObject = this.khk;
      ShareCardListUI.3 local3 = new ShareCardListUI.3(this);
      if (((e)localObject).kgZ != null)
        ((e)localObject).kgZ.setOnClickListener(local3);
    }
    if (this.kap != null)
      this.kap.addView(this.khl.khC);
    if (this.kaq != null)
      this.kaq.addView(this.khk.kgZ);
    this.kam.setVisibility(0);
    this.kam.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(88168);
        if ((paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1) && (!ShareCardListUI.g(ShareCardListUI.this)) && (ShareCardListUI.d(ShareCardListUI.this) != 4))
        {
          ab.d("MicroMsg.ShareCardListUI", "onScroll() >> doNetSceneGetCardsHomePageLayout()");
          ShareCardListUI.h(ShareCardListUI.this);
        }
        AppMethodBeat.o(88168);
      }

      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
      }
    });
    if ((getIntent() != null) && (getIntent().getBooleanExtra("KEY_IS_SHOW_SHARE_CARD_ENTRANCE_TIPS", true)))
    {
      localObject = (Integer)g.RP().Ry().get(ac.a.xKv, Integer.valueOf(0));
      if ((localObject == null) || (((Integer)localObject).intValue() != 1))
      {
        g.RP().Ry().set(ac.a.xKv, Integer.valueOf(1));
        com.tencent.mm.plugin.card.d.d.c(this, 2130968983, 2131297976, "");
      }
    }
    while (true)
    {
      this.kcM = getIntent().getStringExtra("KEY_CARD_TP_ID");
      this.khs = getIntent().getStringExtra("key_layout_buff");
      if (!bo.isNullOrNil(this.khs))
        this.khn = false;
      if (!bo.isNullOrNil(this.kcM))
      {
        this.khm = true;
        this.kho = true;
      }
      AppMethodBeat.o(88179);
      return;
      localObject = (Integer)g.RP().Ry().get(ac.a.xKv, Integer.valueOf(0));
      if ((localObject != null) && (((Integer)localObject).intValue() != 1))
        g.RP().Ry().set(ac.a.xKv, Integer.valueOf(1));
    }
  }

  public final boolean aZr()
  {
    AppMethodBeat.i(88191);
    boolean bool = super.aZr();
    AppMethodBeat.o(88191);
    return bool;
  }

  public final boolean aZs()
  {
    return false;
  }

  public final void aZw()
  {
    AppMethodBeat.i(88187);
    this.khv = true;
    if (this.kht)
    {
      ab.e("MicroMsg.ShareCardListUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
      if (this.khx)
        aZv();
      AppMethodBeat.o(88187);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.ShareCardListUI", "onLocationFinish()");
      this.kht = true;
      bbT();
      aZv();
      AppMethodBeat.o(88187);
    }
  }

  public final void aZx()
  {
    AppMethodBeat.i(88188);
    if ((this.khu) || (this.kht))
    {
      aZv();
      AppMethodBeat.o(88188);
    }
    while (true)
    {
      return;
      this.khu = true;
      ab.i("MicroMsg.ShareCardListUI", "onLocationFail()");
      bbT();
      AppMethodBeat.o(88188);
    }
  }

  public final void aZy()
  {
    AppMethodBeat.i(88178);
    ab.i("MicroMsg.ShareCardListUI", "onMPermissionGranted LocationPermissionGranted " + this.khx);
    if (!this.khx)
    {
      this.khx = true;
      bbN();
    }
    AppMethodBeat.o(88178);
  }

  public final void b(com.tencent.mm.plugin.card.base.b paramb, int paramInt)
  {
    AppMethodBeat.i(88192);
    if (paramb != null)
      com.tencent.mm.plugin.card.sharecard.a.b.GA(paramb.baa());
    super.b(paramb, paramInt);
    AppMethodBeat.o(88192);
  }

  public final void bag()
  {
    AppMethodBeat.i(88197);
    com.tencent.mm.plugin.card.sharecard.a.b.bbt();
    this.khn = true;
    ab.i("MicroMsg.ShareCardListUI", "onDBchange() shouldRefreshDataOnDbChange %s  mIsActive %s hasLocationInfo %s", new Object[] { Boolean.valueOf(this.kho), Boolean.valueOf(this.kas), Boolean.valueOf(this.khv) });
    if ((this.kho) && (this.kas) && (this.khv))
      fG(false);
    while (true)
    {
      this.kho = false;
      AppMethodBeat.o(88197);
      return;
      bbO();
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(88176);
    super.initView();
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
    ab.i("MicroMsg.ShareCardListUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
    this.khx = bool;
    if (this.khx)
    {
      bbN();
      AppMethodBeat.o(88176);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.ShareCardListUI", "location permission is denied, doGetLayout");
      bbT();
      AppMethodBeat.o(88176);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88170);
    super.onCreate(paramBundle);
    long l = System.currentTimeMillis();
    this.mStartTime = l;
    this.khy = l;
    initView();
    g.RO().eJo.a(1164, this);
    am.bbd().a(this);
    bbW();
    am.bbe().c(this);
    AppMethodBeat.o(88170);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88171);
    if (this.khx)
      aZv();
    this.khj.kha = null;
    this.khk.kha = null;
    this.kha.kfs = null;
    g.RO().eJo.b(1164, this);
    am.bbd().b(this);
    com.tencent.mm.plugin.card.sharecard.a.b.bbx();
    am.bbe().d(this);
    long l = System.currentTimeMillis() - this.khy;
    if (!TextUtils.isEmpty(this.kcM))
      h.pYm.e(13219, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Long.valueOf(l) });
    while (true)
    {
      super.onDestroy();
      AppMethodBeat.o(88171);
      return;
      h.pYm.e(13219, new Object[] { "ShareCardListUI", Integer.valueOf(1), "", "", Long.valueOf(l) });
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(88180);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    bbW();
    if (paramIntent != null)
    {
      this.kcM = paramIntent.getStringExtra("KEY_CARD_TP_ID");
      if (!bo.isNullOrNil(this.kcM))
      {
        this.khm = true;
        this.kho = true;
      }
    }
    AppMethodBeat.o(88180);
  }

  public void onPause()
  {
    AppMethodBeat.i(88174);
    super.onPause();
    this.khn = false;
    this.kho = true;
    AppMethodBeat.o(88174);
  }

  public void onResume()
  {
    AppMethodBeat.i(88172);
    fG(true);
    long l = System.currentTimeMillis();
    if (this.mStartTime != 0L)
    {
      int i = (int)(l - this.mStartTime);
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(56);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(57);
      localIDKey2.SetValue(i);
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      h.pYm.b(localArrayList, true);
      this.mStartTime = 0L;
    }
    super.onResume();
    AppMethodBeat.o(88172);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(88195);
    super.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramm instanceof com.tencent.mm.plugin.card.sharecard.model.b))
        break label209;
      paramString = (com.tencent.mm.plugin.card.sharecard.model.b)paramm;
      this.khr = false;
      this.khs = paramString.kfA;
      this.kha.at(paramString.kdS, this.khp);
      if ((!com.tencent.mm.plugin.card.sharecard.a.b.bby()) || (!com.tencent.mm.plugin.card.sharecard.a.b.bbz()))
        this.khp = false;
      if ((com.tencent.mm.plugin.card.sharecard.a.b.bby()) && (com.tencent.mm.plugin.card.sharecard.a.b.bbz()))
      {
        this.khq = bool;
        ab.i("MicroMsg.ShareCardListUI", "NetSceneGetShareCardsLayout() >> updateView()");
        bbO();
        AppMethodBeat.o(88195);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.b))
      {
        if (this.khA)
        {
          this.khA = false;
          this.khk.bbK();
          this.kam.setEmptyView(this.kao);
          this.kam.invalidate();
        }
        this.khr = false;
        this.khq = true;
      }
      ab.i("MicroMsg.ShareCardListUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      label209: AppMethodBeat.o(88195);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI
 * JD-Core Version:    0.6.2
 */
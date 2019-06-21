package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.oa;
import com.tencent.mm.protocal.protobuf.ol;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.kernel.i
public class CardHomePageUI extends CardBaseUI
  implements com.tencent.mm.plugin.card.base.d, k.a
{
  private int fromScene = 0;
  private com.tencent.mm.plugin.card.sharecard.a.b kha;
  private boolean khn = false;
  private boolean khp = true;
  private boolean khr = false;
  private String khs = "";
  private boolean kht = false;
  private boolean khu = false;
  private long khy = 0L;
  boolean khz = false;
  private i klI;
  private f klJ;
  private f klK;
  private boolean klL = true;
  private boolean klM = false;
  private TextView klN;
  private LinearLayout klO;
  private long mStartTime = 0L;

  private void a(ol paramol)
  {
    AppMethodBeat.i(88513);
    this.klO.removeAllViews();
    if ((paramol != null) && (paramol.vUN != null) && (!paramol.vUN.isEmpty()))
    {
      Iterator localIterator = paramol.vUN.iterator();
      while (localIterator.hasNext())
      {
        paramol = (oa)localIterator.next();
        View localView = LayoutInflater.from(this.mController.ylL).inflate(2130968928, this.klO, false);
        new f(this, localView, 4, this.kha, paramol).setOnClickListener(new CardHomePageUI.8(this, paramol));
        this.klO.addView(localView);
      }
    }
    AppMethodBeat.o(88513);
  }

  private void bbN()
  {
    AppMethodBeat.i(88498);
    ab.d("MicroMsg.CardHomePageUI", "initLocation");
    g.RS().aa(new CardHomePageUI.4(this));
    AppMethodBeat.o(88498);
  }

  private void bbT()
  {
    AppMethodBeat.i(88506);
    ab.d("MicroMsg.CardHomePageUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
    bbU();
    if (com.tencent.mm.plugin.card.d.l.beC())
      com.tencent.mm.plugin.card.b.b.baj();
    while (true)
    {
      am.bbc().s("", "", 4);
      AppMethodBeat.o(88506);
      return;
      ab.i("MicroMsg.CardHomePageUI", "the card entrance is not open, don't do doNetSceneGetCardsLayout!");
    }
  }

  private void bbU()
  {
    AppMethodBeat.i(88507);
    if (!this.klL)
    {
      ab.i("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, shouldGetHomePage is false");
      AppMethodBeat.o(88507);
    }
    while (true)
    {
      return;
      if (this.khr)
      {
        ab.e("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
        AppMethodBeat.o(88507);
      }
      else
      {
        if ((this.khp) && (!bo.isNullOrNil(this.khs)))
          this.khs = "";
        this.khr = true;
        this.klL = false;
        com.tencent.mm.plugin.card.sharecard.model.b localb = new com.tencent.mm.plugin.card.sharecard.model.b(am.bbc().ecs, am.bbc().ect, this.khs);
        g.RO().eJo.a(localb, 0);
        AppMethodBeat.o(88507);
      }
    }
  }

  private void bbW()
  {
    AppMethodBeat.i(88514);
    int i = getIntent().getIntExtra("key_from_scene", 22);
    boolean bool1 = com.tencent.mm.x.c.PK().bX(262152, 266256);
    boolean bool2 = com.tencent.mm.x.c.PK().bY(262152, 266256);
    boolean bool3 = com.tencent.mm.x.c.PK().a(ac.a.xKd, ac.a.xKf);
    boolean bool4 = com.tencent.mm.x.c.PK().a(ac.a.xKe, ac.a.xKg);
    String str = bo.nullAsNil((String)g.RP().Ry().get(ac.a.xKj, null));
    if (bool1)
    {
      h.pYm.e(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(2), Integer.valueOf(i), "", Integer.valueOf(0), str });
      AppMethodBeat.o(88514);
    }
    while (true)
    {
      return;
      if (bool2)
      {
        h.pYm.e(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88514);
      }
      else if ((bool3) && (!bool4))
      {
        h.pYm.e(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(3), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88514);
      }
      else if ((bool3) && (bool4))
      {
        h.pYm.e(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(4), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88514);
      }
      else if (bool4)
      {
        h.pYm.e(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(5), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88514);
      }
      else
      {
        h.pYm.e(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(i), "", Integer.valueOf(0), str });
        AppMethodBeat.o(88514);
      }
    }
  }

  private void bdf()
  {
    AppMethodBeat.i(88502);
    ab.i("MicroMsg.CardHomePageUI", "updateMemberCardItem()");
    Object localObject = (c)this.kan;
    if (this.klN == null)
    {
      this.klN = ((TextView)findViewById(2131822180));
      this.klN.setOnClickListener(new CardHomePageUI.5(this));
    }
    if (((c)localObject).getCount() > 0)
    {
      this.klN.setVisibility(0);
      this.klN.setText(getString(2131297987, new Object[] { Integer.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.bbs()) }));
    }
    while (true)
    {
      this.klJ.bde();
      AppMethodBeat.o(88502);
      return;
      this.klN.setVisibility(0);
      this.klN.setText(getString(2131297987, new Object[] { Integer.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.bbs()) }));
      LinearLayout localLinearLayout = (LinearLayout)findViewById(2131822179);
      if (localLinearLayout != null)
      {
        localObject = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject).topMargin = com.tencent.mm.bz.a.fromDPToPix(this, 29);
        ((LinearLayout.LayoutParams)localObject).bottomMargin = com.tencent.mm.bz.a.fromDPToPix(this, 29);
        localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
  }

  private static ol bdg()
  {
    AppMethodBeat.i(88512);
    String str = (String)g.RP().Ry().get(ac.a.xKC, null);
    ol localol;
    if (bo.isNullOrNil(str))
    {
      AppMethodBeat.o(88512);
      localol = null;
    }
    while (true)
    {
      return localol;
      localol = new ol();
      try
      {
        localol.parseFrom(str.getBytes("ISO-8859-1"));
        AppMethodBeat.o(88512);
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.CardHomePageUI", localIOException, "", new Object[0]);
        AppMethodBeat.o(88512);
        Object localObject = null;
      }
    }
  }

  private void bdh()
  {
    AppMethodBeat.i(88516);
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    localIntent.putExtra("preferred_tab", 3);
    com.tencent.mm.bp.d.f(this, "com.tencent.mm.ui.LauncherUI", localIntent);
    finish();
    AppMethodBeat.o(88516);
  }

  private void cu()
  {
    AppMethodBeat.i(88501);
    ab.i("MicroMsg.CardHomePageUI", "updateView()");
    this.klI.bdm();
    bdf();
    this.klK.cu();
    AppMethodBeat.o(88501);
  }

  public final void a(com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88510);
    super.a(paramb);
    AppMethodBeat.o(88510);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    this.khn = true;
  }

  public final void aZp()
  {
    AppMethodBeat.i(88497);
    setMMTitle(2131297882);
    addTextOptionMenu(0, getString(2131297930), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(88484);
        com.tencent.mm.plugin.card.d.b.a(CardHomePageUI.this, true);
        h.pYm.e(11582, new Object[] { "CardListMsgMenu", Integer.valueOf(2), Integer.valueOf(0), "", "" });
        AppMethodBeat.o(88484);
        return true;
      }
    });
    this.kha = new com.tencent.mm.plugin.card.sharecard.a.b(this);
    this.kha.init();
    if (this.klI == null)
    {
      this.klI = new i(this, this.mController.contentView);
      localObject = this.klI;
      ((i)localObject).kmK = View.inflate(((i)localObject).jiE, 2130968957, null);
      ((i)localObject).kmK.setVisibility(8);
      ((i)localObject).kmL = ((TextView)((i)localObject).kmK.findViewById(2131822243));
      ((i)localObject).kmM = ((ImageView)((i)localObject).kmK.findViewById(2131822242));
      ((i)localObject).kmK.setOnClickListener(new i.1((i)localObject));
      ((i)localObject).bdm();
      if (((i)localObject).kmN == null)
      {
        ((i)localObject).kmN = ((ViewStub)((i)localObject).jcl.findViewById(2131822177)).inflate();
        ((i)localObject).kmN.setVisibility(8);
        ((i)localObject).kmO = ((TextView)((i)localObject).kmN.findViewById(2131822243));
        ((i)localObject).kmP = ((ImageView)((i)localObject).kmN.findViewById(2131822242));
        ((i)localObject).kmN.setOnClickListener(new i.2((i)localObject));
      }
      this.klI.khF = true;
    }
    if (this.klJ == null)
      this.klJ = new f(this, findViewById(2131822181), 1, this.kha);
    if (this.klK == null)
      this.klK = new f(this, findViewById(2131822182), 3, this.kha);
    if (this.klJ != null)
      this.klJ.setOnClickListener(new CardHomePageUI.6(this));
    if (this.klK != null)
      this.klK.setOnClickListener(new CardHomePageUI.7(this));
    this.klO = ((LinearLayout)findViewById(2131822183));
    Object localObject = bdg();
    if (localObject != null)
      a((ol)localObject);
    setBackBtn(new CardHomePageUI.3(this));
    AppMethodBeat.o(88497);
  }

  public final n.a aZq()
  {
    return n.a.kdP;
  }

  public final boolean aZr()
  {
    AppMethodBeat.i(88508);
    boolean bool = super.aZr();
    AppMethodBeat.o(88508);
    return bool;
  }

  public final boolean aZs()
  {
    return true;
  }

  public final void aZw()
  {
    AppMethodBeat.i(88504);
    if (this.kht)
    {
      ab.e("MicroMsg.CardHomePageUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
      if (this.klM)
        aZv();
      AppMethodBeat.o(88504);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.CardHomePageUI", "onLocationFinish()");
      this.kht = true;
      bbT();
      aZv();
      AppMethodBeat.o(88504);
    }
  }

  public final void aZx()
  {
    AppMethodBeat.i(88505);
    if ((this.khu) || (this.kht))
    {
      aZv();
      AppMethodBeat.o(88505);
    }
    while (true)
    {
      return;
      this.khu = true;
      ab.i("MicroMsg.CardHomePageUI", "onLocationFail()");
      bbT();
      AppMethodBeat.o(88505);
    }
  }

  public final void aZy()
  {
    AppMethodBeat.i(88499);
    ab.i("MicroMsg.CardHomePageUI", "onMPermissionGranted locationPermissionGranted " + this.klM);
    if (!this.klM)
    {
      this.klM = true;
      bbN();
    }
    AppMethodBeat.o(88499);
  }

  public final void aZz()
  {
    AppMethodBeat.i(88503);
    bdf();
    AppMethodBeat.o(88503);
  }

  public final void b(com.tencent.mm.plugin.card.base.b paramb, int paramInt)
  {
    AppMethodBeat.i(88509);
    super.b(paramb, paramInt);
    AppMethodBeat.o(88509);
  }

  public final void bag()
  {
    this.khn = true;
  }

  public final int getLayoutId()
  {
    return 2130968941;
  }

  public final void initView()
  {
    AppMethodBeat.i(88496);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
    ab.i("MicroMsg.CardHomePageUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
    this.klM = bool;
    if (this.klM)
      bbN();
    while (true)
    {
      super.initView();
      AppMethodBeat.o(88496);
      return;
      ab.e("MicroMsg.CardHomePageUI", "location permission is denied, doGetLayout");
      bbT();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88492);
    super.onCreate(paramBundle);
    this.fromScene = getIntent().getIntExtra("key_home_page_from_scene", 0);
    long l = System.currentTimeMillis();
    this.mStartTime = l;
    this.khy = l;
    initView();
    paramBundle = this.klI;
    am.bba().a(paramBundle);
    g.RO().eJo.a(1164, this);
    g.RO().eJo.a(984, this);
    am.bbd().bbr();
    am.baV();
    com.tencent.mm.plugin.card.b.b.sO(1);
    bbW();
    Looper.myQueue().addIdleHandler(new CardHomePageUI.9(this));
    am.bbd().a(this);
    am.baW().c(this);
    ((com.tencent.mm.pluginsdk.wallet.b)g.K(com.tencent.mm.pluginsdk.wallet.b.class)).eA(8, 2);
    AppMethodBeat.o(88492);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88493);
    if (this.klM)
      aZv();
    i locali = this.klI;
    am.bba().b(locali);
    this.kha.kfs = null;
    g.RO().eJo.b(1164, this);
    g.RO().eJo.b(984, this);
    am.bbd().b(this);
    am.baW().d(this);
    k.baK();
    com.tencent.mm.plugin.card.sharecard.a.b.bbx();
    long l1 = System.currentTimeMillis();
    long l2 = this.khy;
    h.pYm.e(13219, new Object[] { "CardHomePageUI", Integer.valueOf(this.fromScene), "", "", Long.valueOf(l1 - l2) });
    super.onDestroy();
    AppMethodBeat.o(88493);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88515);
    if (paramInt == 4)
    {
      if ((this.fromScene != 1) && (this.fromScene != 2))
        break label46;
      bdh();
    }
    while (true)
    {
      boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(88515);
      return bool;
      label46: finish();
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(88500);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    bbW();
    this.khn = true;
    this.klL = true;
    AppMethodBeat.o(88500);
  }

  public void onPause()
  {
    AppMethodBeat.i(88495);
    super.onPause();
    AppMethodBeat.o(88495);
  }

  public void onResume()
  {
    AppMethodBeat.i(88494);
    ab.i("MicroMsg.CardHomePageUI", "onResume locationPermissionGranted %s, hasInitLocation %s, shouldGetLayout %s", new Object[] { Boolean.valueOf(this.klM), Boolean.valueOf(this.khz), Boolean.valueOf(this.khn) });
    if (this.klM)
      if ((this.khz) && (this.khn))
      {
        this.khs = "";
        this.kht = false;
        aZu();
      }
    while (true)
    {
      this.khn = false;
      cu();
      long l = System.currentTimeMillis();
      if (this.mStartTime != 0L)
      {
        int i = (int)(l - this.mStartTime);
        ArrayList localArrayList = new ArrayList();
        IDKey localIDKey1 = new IDKey();
        localIDKey1.SetID(281);
        localIDKey1.SetKey(0);
        localIDKey1.SetValue(1L);
        IDKey localIDKey2 = new IDKey();
        localIDKey2.SetID(281);
        localIDKey2.SetKey(1);
        localIDKey2.SetValue(i);
        localArrayList.add(localIDKey1);
        localArrayList.add(localIDKey2);
        h.pYm.b(localArrayList, true);
        this.mStartTime = 0L;
      }
      g.RS().aa(new CardHomePageUI.1(this));
      super.onResume();
      AppMethodBeat.o(88494);
      return;
      if (this.khn)
      {
        this.khs = "";
        bbT();
      }
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(88511);
    super.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof ad))
      {
        bdf();
        this.kat.ZZ();
        this.klK.cu();
        a(((ad)paramm).kej);
        AppMethodBeat.o(88511);
      }
    while (true)
    {
      return;
      if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.b))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.b)paramm;
        this.khr = false;
        this.khs = paramString.kfA;
        this.kha.at(paramString.kdS, this.khp);
        if ((!com.tencent.mm.plugin.card.sharecard.a.b.bby()) || (!com.tencent.mm.plugin.card.sharecard.a.b.bbz()))
          this.khp = false;
        ab.i("MicroMsg.CardHomePageUI", "NetSceneGetShareCardsLayout() >> updateView()");
        cu();
        AppMethodBeat.o(88511);
        continue;
        if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.b))
          this.khr = false;
        ab.i("MicroMsg.CardHomePageUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      }
      else
      {
        AppMethodBeat.o(88511);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardHomePageUI
 * JD-Core Version:    0.6.2
 */
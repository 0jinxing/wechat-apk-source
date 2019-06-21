package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.e;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.u.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AddressUI$AddressUIFragment extends AbstractTabChildActivity.AbStractTabFragment
  implements com.tencent.mm.ai.f
{
  private final long TIME_INTERVAL;
  private ProgressDialog ehJ;
  com.tencent.mm.pluginsdk.ui.d ein;
  List<String> elZ;
  private TextView gtY;
  private boolean gxV;
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.b.a jMO;
  private n.d lCi;
  private Animation lVH;
  private ListView nIv;
  private com.tencent.mm.sdk.b.c ryK;
  private TextView zjZ;
  private String zjx;
  private String zjy;
  private TextView zka;
  private a zkb;
  private com.tencent.mm.ui.voicesearch.b zkc;
  private String zkd;
  private String zke;
  private int zkf;
  private AlphabetScrollBar zkg;
  private LinearLayout zkh;
  private boolean zki;
  private boolean zkj;
  private k zkk;
  private BizContactEntranceView zkl;
  private b zkm;
  private b zkn;
  private b zko;
  private ContactCountView zkp;
  private u zkq;
  private i zkr;
  boolean zks;
  private boolean zkt;
  private LinearLayout zku;
  private Animation zkv;
  private VerticalScrollBar.a zkw;
  List<String> zkx;
  private Runnable zky;

  public AddressUI$AddressUIFragment()
  {
    AppMethodBeat.i(33507);
    this.ehJ = null;
    this.zke = "";
    this.zkh = null;
    this.zki = false;
    this.gxV = false;
    this.zkj = false;
    this.zkt = true;
    this.TIME_INTERVAL = 180000L;
    this.ryK = new AddressUI.AddressUIFragment.1(this);
    this.lCi = new AddressUI.AddressUIFragment.8(this);
    this.zkw = new VerticalScrollBar.a()
    {
      public final void kp(String paramAnonymousString)
      {
        int i = 0;
        AppMethodBeat.i(33491);
        if (AddressUI.AddressUIFragment.this.getString(2131302792).equals(paramAnonymousString))
        {
          AddressUI.AddressUIFragment.c(AddressUI.AddressUIFragment.this).setSelection(0);
          AppMethodBeat.o(33491);
        }
        while (true)
        {
          return;
          Object localObject = AddressUI.AddressUIFragment.a(AddressUI.AddressUIFragment.this);
          ab.v("MicroMsg.AddressAdapter", "getSections");
          localObject = ((a)localObject).zjD;
          if (localObject == null)
          {
            AppMethodBeat.o(33491);
          }
          else if ("↑".equals(paramAnonymousString))
          {
            AddressUI.AddressUIFragment.c(AddressUI.AddressUIFragment.this).setSelection(0);
            AppMethodBeat.o(33491);
          }
          else if ("☆".equals(paramAnonymousString))
          {
            AddressUI.AddressUIFragment.c(AddressUI.AddressUIFragment.this).setSelection(AddressUI.AddressUIFragment.c(AddressUI.AddressUIFragment.this).getHeaderViewsCount());
            AppMethodBeat.o(33491);
          }
          else
          {
            do
            {
              i++;
              if ((i >= localObject.length) || (localObject[i] == null))
                break;
            }
            while (!localObject[i].equals(paramAnonymousString));
            i = AddressUI.AddressUIFragment.a(AddressUI.AddressUIFragment.this).getPositionForSection(i);
            AddressUI.AddressUIFragment.c(AddressUI.AddressUIFragment.this).setSelection(i + AddressUI.AddressUIFragment.c(AddressUI.AddressUIFragment.this).getHeaderViewsCount());
            AppMethodBeat.o(33491);
            continue;
            AppMethodBeat.o(33491);
          }
        }
      }
    };
    this.ein = new com.tencent.mm.pluginsdk.ui.d(new AddressUI.AddressUIFragment.10(this));
    this.elZ = new LinkedList();
    this.zkx = new LinkedList();
    this.zky = new AddressUI.AddressUIFragment.17(this);
    AppMethodBeat.o(33507);
  }

  private void dHA()
  {
    try
    {
      AppMethodBeat.i(33517);
      long l = System.currentTimeMillis();
      dHz();
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("KEVIN updateBlockList() LAST");
      ab.i("MicroMsg.AddressUI", System.currentTimeMillis() - l);
      l = System.currentTimeMillis();
      if (this.zkb != null)
      {
        ab.v("MicroMsg.AddressUI", "post to do refresh");
        localObject1 = new com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$11;
        ((AddressUI.AddressUIFragment.11)localObject1).<init>(this);
        al.d((Runnable)localObject1);
      }
      if (this.zkc != null)
      {
        localObject1 = new com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$13;
        ((13)localObject1).<init>(this);
        al.d((Runnable)localObject1);
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("KEVIN doRefresh() LAST");
      ab.i("MicroMsg.AddressUI", System.currentTimeMillis() - l);
      AppMethodBeat.o(33517);
      return;
    }
    finally
    {
    }
  }

  private void dHz()
  {
    AppMethodBeat.i(33513);
    this.elZ = new LinkedList();
    this.zkx = new LinkedList();
    com.tencent.mm.bp.d.dlL();
    this.elZ.add("tmessage");
    this.zkx.addAll(this.elZ);
    if (!this.elZ.contains("officialaccounts"))
      this.elZ.add("officialaccounts");
    this.elZ.add("helper_entry");
    if (this.zkb != null)
      this.zkb.fl(this.elZ);
    if (this.zkc != null)
      this.zkc.fl(this.zkx);
    AppMethodBeat.o(33513);
  }

  public final void dHB()
  {
    AppMethodBeat.i(33524);
    if (this.nIv != null)
      this.nIv.setSelection(0);
    AppMethodBeat.o(33524);
  }

  public final void dvY()
  {
    AppMethodBeat.i(33515);
    ab.v("MicroMsg.AddressUI", "address ui on create");
    ab.v("MicroMsg.AddressUI", "on address ui create");
    this.zki = false;
    this.gxV = false;
    this.zkj = false;
    this.zjx = null;
    this.zjy = null;
    this.zkd = null;
    com.tencent.mm.model.aw.Rg().a(138, this);
    this.zjx = "@all.contact.without.chatroom.without.openim";
    this.zjy = getStringExtra("Contact_GroupFilter_Str");
    this.zkd = getString(2131300426);
    this.zkf = getIntExtra("List_Type", 2);
    Object localObject1 = getView().getRootView().findViewById(2131820634);
    int i = ak.de(getContext());
    int j = ak.J(getContext(), -1);
    Object localObject2 = new AddressUI.AddressUIFragment.12(this, (View)localObject1);
    if (j <= 0)
    {
      getView().post((Runnable)localObject2);
      ab.v("MicroMsg.AddressUI", "on address ui init view, %s", new Object[] { getResources().getDisplayMetrics() });
      if (this.nIv != null)
      {
        if (this.zkk != null)
          this.nIv.removeHeaderView(this.zkk);
        if (this.zkl != null)
          this.nIv.removeHeaderView(this.zkl);
        if (this.zkm != null)
          this.nIv.removeHeaderView(this.zkm);
        if (this.zko != null)
          this.nIv.removeHeaderView(this.zko);
      }
      this.nIv = ((ListView)findViewById(2131821054));
      this.nIv.setScrollingCacheEnabled(false);
      this.zjZ = ((TextView)findViewById(2131821056));
      this.zjZ.setText(2131296451);
      this.gtY = ((TextView)findViewById(2131821055));
      this.gtY.setText(2131296453);
      this.zka = ((TextView)findViewById(2131821058));
      this.zka.setOnClickListener(new AddressUI.AddressUIFragment.19(this));
      this.zkb = new a(getContext(), this.zjx, this.zjy, this.zkf);
      this.nIv.setAdapter(null);
      this.zkb.a(new AddressUI.AddressUIFragment.20(this));
      this.zkb.zjK = true;
      this.zkb.setFragment(this);
      this.zkb.setGetViewPositionCallback(new AddressUI.AddressUIFragment.21(this));
      this.zkb.setPerformItemClickListener(new AddressUI.AddressUIFragment.22(this));
      this.zkb.a(new AddressUI.AddressUIFragment.23(this));
      this.zkc = new com.tencent.mm.ui.voicesearch.b(getContext(), 1);
      this.zkc.qV(true);
      this.zku = new LinearLayout(getContext());
      this.zku.setOrientation(1);
      this.nIv.addHeaderView(this.zku);
      this.zkn = new b(getContext(), b.a.zkF);
      this.zku.addView(this.zkn);
      com.tencent.mm.model.aw.ZK();
      ((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLB, Boolean.FALSE)).booleanValue();
      this.zkn.setVisible(false);
      this.zkk = new k(getContext());
      this.zku.addView(this.zkk);
      this.zkm = new b(getContext(), b.a.zkD);
      this.zku.addView(this.zkm);
      this.zkm.setVisible(true);
      this.zko = new b(getContext(), b.a.zkE);
      this.zku.addView(this.zko);
      this.zko.setVisible(true);
      localObject1 = this.nIv;
      localObject2 = new ContactCountView(getContext());
      this.zkp = ((ContactCountView)localObject2);
      ((ListView)localObject1).addFooterView((View)localObject2, null, false);
      if (com.tencent.mm.bp.d.afj("brandservice"))
      {
        this.zkl = new BizContactEntranceView(getContext());
        this.zku.addView(this.zkl);
        this.zkl.setVisible(true);
      }
      localObject1 = new AddressUI.AddressUIFragment.24(this);
      this.zkq = new u(getContext(), new AddressUI.AddressUIFragment.25(this));
      this.zkq.setOnVisibilityChangeListener((u.b)localObject1);
      if (this.zkq.getOpenIMCount() > 0)
        break label1128;
      ((u.b)localObject1).qB(false);
      this.zkq.setVisibility(8);
    }
    while (true)
    {
      this.zku.addView(this.zkq);
      if (com.tencent.mm.bp.d.afj("brandservice"))
      {
        this.zkr = new i(getContext(), new i.a()
        {
          public final void Pl(int paramAnonymousInt)
          {
            AppMethodBeat.i(33485);
            if (AddressUI.AddressUIFragment.f(AddressUI.AddressUIFragment.this) == null)
              AppMethodBeat.o(33485);
            while (true)
            {
              return;
              if (paramAnonymousInt <= 0)
              {
                AddressUI.AddressUIFragment.f(AddressUI.AddressUIFragment.this).setVisibility(8);
                AppMethodBeat.o(33485);
              }
              else
              {
                AddressUI.AddressUIFragment.f(AddressUI.AddressUIFragment.this).setVisibility(0);
                AppMethodBeat.o(33485);
              }
            }
          }
        });
        if (this.zkr.getEnterpriseFriendCount() <= 0)
          this.zkr.setVisibility(8);
        this.zku.addView(this.zkr);
      }
      this.jMO = new com.tencent.mm.ui.widget.b.a(getContext());
      this.zkb.zjI = new AddressUI.AddressUIFragment.3(this);
      this.nIv.setOnItemClickListener(new AddressUI.AddressUIFragment.4(this));
      this.nIv.setOnItemLongClickListener(new AddressUI.AddressUIFragment.5(this));
      this.nIv.setOnTouchListener(new AddressUI.AddressUIFragment.6(this));
      this.nIv.setOnScrollListener(this.ein);
      this.nIv.setDrawingCacheEnabled(false);
      this.zkg = ((AlphabetScrollBar)findViewById(2131821057));
      this.zkg.setOnScrollBarTouchListener(this.zkw);
      com.tencent.mm.model.aw.ZK();
      com.tencent.mm.model.c.XM().a(this.zkb);
      if (this.zkr != null)
        com.tencent.mm.aj.z.aeR().a(this.zkr, null);
      AppMethodBeat.o(33515);
      return;
      getView().setPadding(0, i + j, 0, ((View)localObject1).getHeight());
      ab.i("MicroMsg.AddressUI", "[trySetParentViewPadding] actionBarHeight:%s actionBarHeight:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      getView().postDelayed((Runnable)localObject2, 100L);
      break;
      label1128: ((u.b)localObject1).qB(true);
    }
  }

  public final void dvZ()
  {
    AppMethodBeat.i(33516);
    ab.v("MicroMsg.AddressUI", "address ui on resume");
    long l = System.currentTimeMillis();
    com.tencent.mm.model.aw.ZK();
    if (l - ah.d((Long)com.tencent.mm.model.c.Ry().get(340226, null)) >= 180000L)
      dHB();
    Object localObject;
    if (this.zkt)
    {
      this.zkt = false;
      this.zks = false;
      dHz();
      this.nIv.setAdapter(this.zkb);
      this.nIv.post(new AddressUI.AddressUIFragment.14(this));
      this.zkc.qU(false);
      if (this.zkl != null)
      {
        localObject = this.zkl;
        ((BizContactEntranceView)localObject).dHC();
        ((BizContactEntranceView)localObject).setVisible(true);
      }
      if (this.zkr != null)
      {
        if (this.zkr.getEnterpriseFriendCount() > 0)
          break label405;
        this.zkr.setVisibility(8);
      }
    }
    while (true)
    {
      com.tencent.mm.model.aw.ZK();
      this.zki = ((Boolean)com.tencent.mm.model.c.Ry().get(12296, Boolean.FALSE)).booleanValue();
      if (this.zkf == 2)
      {
        com.tencent.mm.model.aw.ZK();
        localObject = com.tencent.mm.model.c.XM().aoO(r.Yz());
        if ((localObject != null) && ((!com.tencent.mm.n.a.jh(((ap)localObject).field_type)) || (!ah.isNullOrNil(((ap)localObject).field_conRemark)) || (!ah.isNullOrNil(((ap)localObject).field_conRemarkPYFull)) || (!ah.isNullOrNil(((ap)localObject).field_conRemarkPYShort))))
        {
          ((ad)localObject).NB();
          ((ad)localObject).iz("");
          ((ad)localObject).iF("");
          ((ad)localObject).iG("");
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.XM().b(r.Yz(), (ad)localObject);
        }
      }
      if (this.zkc != null)
        this.zkc.onResume();
      this.zkb.ygw = false;
      al.d(new AddressUI.AddressUIFragment.16(this));
      if (this.zkk != null)
      {
        this.zkk.setFrontGround(true);
        k.dHR();
      }
      localObject = (LauncherUI)getContext();
      if (localObject != null)
        ((LauncherUI)localObject).getHomeUI().setTitleBarDoubleClickListener(this.zky);
      AppMethodBeat.o(33516);
      return;
      if (!this.zks)
        break;
      this.zks = false;
      com.tencent.mm.sdk.g.d.f(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(33498);
          Process.setThreadPriority(10);
          AddressUI.AddressUIFragment.p(AddressUI.AddressUIFragment.this);
          AppMethodBeat.o(33498);
        }
      }
      , "AddressUI_updateUIData");
      this.zkp.dHF();
      break;
      label405: this.zkr.setVisibility(0);
    }
  }

  public final void dwa()
  {
  }

  public final void dwb()
  {
    AppMethodBeat.i(33518);
    ab.i("MicroMsg.AddressUI", "AddressUI on Pause");
    com.tencent.mm.model.aw.ZK();
    com.tencent.mm.model.c.Ry().set(340226, Long.valueOf(System.currentTimeMillis()));
    com.tencent.mm.model.aw.ZK();
    com.tencent.mm.model.c.Ry().set(12296, Boolean.valueOf(this.zki));
    if (this.zkc != null)
      this.zkc.onPause();
    this.zkb.dHx();
    al.d(new AddressUI.AddressUIFragment.18(this));
    if (this.zkk != null)
      this.zkk.setFrontGround(false);
    LauncherUI localLauncherUI = (LauncherUI)getContext();
    if (localLauncherUI != null)
      localLauncherUI.getHomeUI().aw(this.zky);
    AppMethodBeat.o(33518);
  }

  public final void dwc()
  {
  }

  public final void dwd()
  {
    AppMethodBeat.i(33519);
    ab.v("MicroMsg.AddressUI", "onDestory");
    if (this.zkg != null)
      this.zkg.yAU = null;
    com.tencent.mm.model.aw.Rg().b(138, this);
    if (this.zkb != null)
    {
      this.zkb.pB(true);
      this.zkb.detach();
      this.zkb.dww();
    }
    if (this.zkc != null)
    {
      this.zkc.detach();
      this.zkc.bIf();
    }
    if ((com.tencent.mm.model.aw.RK()) && (this.zkb != null))
    {
      com.tencent.mm.model.aw.ZK();
      com.tencent.mm.model.c.XM().b(this.zkb);
    }
    if ((com.tencent.mm.model.aw.RK()) && (this.zkr != null))
      com.tencent.mm.aj.z.aeR().a(this.zkr);
    if (this.zkk != null)
    {
      k localk = this.zkk;
      if (com.tencent.mm.model.aw.RK())
        com.tencent.mm.bi.d.akP().d(localk.zmz);
      this.zkk = null;
    }
    if (this.zkl != null)
      this.zkl = null;
    if (this.zkm != null)
      this.zkm = null;
    if (this.zko != null)
      this.zko = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.ryK);
    AppMethodBeat.o(33519);
  }

  public final void dwe()
  {
    AppMethodBeat.i(33522);
    ab.v("MicroMsg.AddressUI", "request to top");
    if (this.nIv != null)
      BackwardSupportUtil.c.a(this.nIv);
    AppMethodBeat.o(33522);
  }

  public final void dwf()
  {
    AppMethodBeat.i(33520);
    if (this.zkb != null)
    {
      a locala = this.zkb;
      locala.zjO.clear();
      locala.zjM.clear();
      locala.zjN = false;
    }
    ab.i("MicroMsg.INIT", "KEVIN Address turnTobg");
    if (this.zkl != null)
      this.zkl.destroyDrawingCache();
    if (this.zkm != null)
      this.zkm.destroyDrawingCache();
    if (this.zko != null)
      this.zko.destroyDrawingCache();
    if (this.zkp != null)
      this.zkp.destroyDrawingCache();
    if (this.zkk != null)
      this.zkk.destroyDrawingCache();
    AppMethodBeat.o(33520);
  }

  public final void dwg()
  {
    AppMethodBeat.i(33521);
    ab.v("MicroMsg.INIT", "KEVIN Address turnTofg");
    AppMethodBeat.o(33521);
  }

  public final void dxc()
  {
    AppMethodBeat.i(33523);
    if (this.zkk != null)
      k.dHR();
    AppMethodBeat.o(33523);
  }

  public final void dxd()
  {
  }

  public int getLayoutId()
  {
    return 2130968638;
  }

  public View getLayoutView()
  {
    AppMethodBeat.i(33508);
    View localView = com.tencent.mm.kiss.a.b.SM().a(getContext(), "R.layout.address", 2130968638);
    AppMethodBeat.o(33508);
    return localView;
  }

  public boolean noActionBar()
  {
    return true;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(33514);
    ab.i("MicroMsg.AddressUI", "onAcvityResult requestCode: %d", new Object[] { Integer.valueOf(paramInt1) });
    if ((paramInt1 == 6) && (paramInt2 == -1))
    {
      setResult(-1);
      finish();
      AppMethodBeat.o(33514);
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
        break;
      AppMethodBeat.o(33514);
    }
    switch (paramInt1)
    {
    default:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(33514);
      break;
      setResult(-1, paramIntent);
      finish();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33509);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.xxA.c(this.ryK);
    AppMethodBeat.o(33509);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(33511);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    com.tencent.mm.model.aw.ZK();
    ad localad = com.tencent.mm.model.c.XM().aoO(this.zke);
    if (localad == null)
    {
      ab.e("MicroMsg.AddressUI", "onCreateContextMenu, contact is null, username = " + this.zke);
      AppMethodBeat.o(33511);
    }
    while (true)
    {
      return;
      if (r.Yz().equals(localad.field_username))
      {
        AppMethodBeat.o(33511);
      }
      else if (t.mW(this.zke))
      {
        paramContextMenu.setHeaderTitle(j.b(paramView.getContext(), localad.Oj()));
        paramContextMenu.add(paramContextMenuInfo.position, 2, 0, 2131296448);
        AppMethodBeat.o(33511);
      }
      else if ((t.nl(this.zke)) || (t.nB(this.zke)))
      {
        AppMethodBeat.o(33511);
      }
      else
      {
        paramContextMenu.setHeaderTitle(j.b(paramView.getContext(), localad.Oj()));
        if ((com.tencent.mm.n.a.jh(localad.field_type)) && (localad.field_deleteFlag != 1))
          paramContextMenu.add(paramContextMenuInfo.position, 7, 0, 2131298589);
        AppMethodBeat.o(33511);
      }
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33512);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (!ah.cv(getContext()))
      AppMethodBeat.o(33512);
    while (true)
    {
      return;
      if (u.a.a(getContext(), paramInt1, paramInt2, paramString, 4))
        AppMethodBeat.o(33512);
      else if ((paramInt1 != 0) || (paramInt2 != 0))
        AppMethodBeat.o(33512);
      else
        AppMethodBeat.o(33512);
    }
  }

  public final void qA(boolean paramBoolean)
  {
    AppMethodBeat.i(33510);
    if (this.zkg != null)
    {
      if (this.lVH == null)
      {
        this.lVH = AnimationUtils.loadAnimation(getContext(), 2131034172);
        this.lVH.setDuration(200L);
      }
      if (this.zkv == null)
      {
        this.zkv = AnimationUtils.loadAnimation(getContext(), 2131034172);
        this.zkv.setDuration(200L);
      }
      if (paramBoolean)
      {
        if (this.zkg.getVisibility() == 0)
          break label146;
        this.zkg.setVisibility(0);
        this.zkg.startAnimation(this.lVH);
        AppMethodBeat.o(33510);
      }
    }
    while (true)
    {
      return;
      if (4 != this.zkg.getVisibility())
      {
        this.zkg.setVisibility(8);
        this.zkg.startAnimation(this.zkv);
      }
      label146: AppMethodBeat.o(33510);
    }
  }

  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.AddressUI.AddressUIFragment
 * JD-Core Version:    0.6.2
 */
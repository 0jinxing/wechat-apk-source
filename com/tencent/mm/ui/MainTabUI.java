package com.tencent.mm.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.ui.contact.AddressUI.AddressUIFragment;
import com.tencent.mm.ui.conversation.ConversationListView;
import com.tencent.mm.ui.conversation.MainUI;
import java.util.HashMap;
import java.util.HashSet;

public class MainTabUI
{
  private static HashMap<String, Integer> ynP;
  private final long TIME_INTERVAL;
  private int bts;
  com.tencent.mm.plugin.appbrand.widget.header.a iVv;
  public int mbt;
  CustomViewPager yeo;
  MMFragmentActivity yhZ;
  public w ynE;
  LauncherUI.d ynF;
  boolean ynG;
  private HashSet<m> ynH;
  MainTabUI.TabsAdapter ynI;
  private int ynJ;
  private int ynK;
  MainTabUI.a ynL;
  c ynM;
  private boolean ynN;
  c ynO;
  public HashMap<Integer, MMFragment> ynQ;

  static
  {
    AppMethodBeat.i(29649);
    HashMap localHashMap = new HashMap();
    ynP = localHashMap;
    localHashMap.put("tab_main", Integer.valueOf(0));
    ynP.put("tab_address", Integer.valueOf(1));
    ynP.put("tab_find_friend", Integer.valueOf(2));
    ynP.put("tab_settings", Integer.valueOf(3));
    AppMethodBeat.o(29649);
  }

  public MainTabUI()
  {
    AppMethodBeat.i(29629);
    this.TIME_INTERVAL = 180000L;
    this.ynE = new w();
    this.ynH = new HashSet();
    this.mbt = -1;
    this.bts = -1;
    this.ynJ = -1;
    this.ynK = -1;
    this.ynM = new MainTabUI.1(this);
    this.ynN = true;
    this.ynO = new MainTabUI.2(this);
    this.ynQ = new HashMap();
    AppMethodBeat.o(29629);
  }

  private MMFragment Nl(int paramInt)
  {
    AppMethodBeat.i(29641);
    MMFragment localMMFragment = null;
    Object localObject1 = new Bundle();
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      ab.v("MicroMsg.LauncherUI.MainTabUI", "createFragment index:%d", new Object[] { Integer.valueOf(paramInt) });
      if (localMMFragment != null)
        localMMFragment.setParent(this.yhZ);
      AppMethodBeat.o(29641);
      return localMMFragment;
      ((Bundle)localObject1).putInt(MainUI.class.getName(), 0);
      localMMFragment = (MMFragment)Fragment.instantiate(this.yhZ, MainUI.class.getName(), (Bundle)localObject1);
      if ((localMMFragment instanceof MainUI))
      {
        localObject1 = (MainUI)localMMFragment;
        Object localObject2 = this.yhZ;
        ((MainUI)localObject1).iWA = ((MMFragmentActivity)localObject2);
        if (((MainUI)localObject1).zuW != null)
          ((MainUI)localObject1).zuW.setActivity((MMFragmentActivity)localObject2);
        localObject2 = (MainUI)localMMFragment;
        localObject1 = this.iVv;
        ((MainUI)localObject2).zve = ((com.tencent.mm.plugin.appbrand.widget.header.a)localObject1);
        if (((MainUI)localObject2).zuW != null)
          ((MainUI)localObject2).zuW.setActionBarUpdateCallback((com.tencent.mm.plugin.appbrand.widget.header.a)localObject1);
      }
      aw.getNotification().bv(true);
      continue;
      ((Bundle)localObject1).putInt(AddressUI.AddressUIFragment.class.getName(), 1);
      ((Bundle)localObject1).putBoolean("Need_Voice_Search", true);
      ((Bundle)localObject1).putBoolean("favour_include_biz", true);
      localMMFragment = (MMFragment)Fragment.instantiate(this.yhZ, AddressUI.AddressUIFragment.class.getName(), (Bundle)localObject1);
      continue;
      ((Bundle)localObject1).putInt(FindMoreFriendsUI.class.getName(), 2);
      localMMFragment = (MMFragment)Fragment.instantiate(this.yhZ, FindMoreFriendsUI.class.getName(), (Bundle)localObject1);
      continue;
      ((Bundle)localObject1).putInt(MoreTabUI.class.getName(), 3);
      localMMFragment = (MMFragment)Fragment.instantiate(this.yhZ, MoreTabUI.class.getName(), (Bundle)localObject1);
    }
  }

  private void dyz()
  {
    AppMethodBeat.i(29633);
    this.ynQ.clear();
    if (this.yeo != null)
    {
      this.yeo.setCanSlide(false);
      this.yeo.setCanSlideBySide(false);
    }
    AppMethodBeat.o(29633);
  }

  public final void Nj(int paramInt)
  {
    AppMethodBeat.i(29631);
    MainUI localMainUI = (MainUI)this.ynQ.get(Integer.valueOf(0));
    if (localMainUI != null)
      localMainUI.Nj(paramInt);
    AppMethodBeat.o(29631);
  }

  public final void Nk(int paramInt)
  {
    AppMethodBeat.i(29637);
    MMFragment localMMFragment = Nn(paramInt);
    if (localMMFragment == null)
      AppMethodBeat.o(29637);
    while (true)
    {
      return;
      if ((localMMFragment instanceof m))
        ((m)localMMFragment).dwl();
      this.ynI.mFragmentResumedFlags[paramInt] = true;
      AppMethodBeat.o(29637);
    }
  }

  public final void Nm(int paramInt)
  {
    AppMethodBeat.i(29642);
    int i = this.mbt;
    boolean bool;
    if (this.yeo != null)
    {
      bool = true;
      ab.i("MicroMsg.LauncherUI.MainTabUI", "change tab to %d, cur tab %d, has init tab %B, tab cache size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Boolean.valueOf(bool), Integer.valueOf(this.ynQ.size()) });
      if ((this.yeo != null) && (paramInt >= 0) && ((this.ynI == null) || (paramInt <= this.ynI.getCount() - 1)))
        break label109;
      AppMethodBeat.o(29642);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label109: if ((this.mbt == paramInt) && (this.ynQ.size() != 0))
      {
        AppMethodBeat.o(29642);
      }
      else
      {
        this.mbt = paramInt;
        this.ynE.Np(this.mbt);
        if (this.yeo != null)
        {
          this.yeo.setCurrentItem(this.mbt, false);
          Nk(this.mbt);
        }
        if ((this.mbt == 0) && (g.RO().eJo.foreground))
        {
          aw.getNotification().bv(true);
          AppMethodBeat.o(29642);
        }
        else
        {
          aw.getNotification().bv(false);
          AppMethodBeat.o(29642);
        }
      }
    }
  }

  public final MMFragment Nn(int paramInt)
  {
    AppMethodBeat.i(29643);
    ab.d("MicroMsg.LauncherUI.MainTabUI", "get tab %d", new Object[] { Integer.valueOf(paramInt) });
    MMFragment localMMFragment;
    if (paramInt < 0)
    {
      localMMFragment = null;
      AppMethodBeat.o(29643);
    }
    while (true)
    {
      return localMMFragment;
      if (this.ynQ.containsKey(Integer.valueOf(paramInt)))
      {
        localMMFragment = (MMFragment)this.ynQ.get(Integer.valueOf(paramInt));
        AppMethodBeat.o(29643);
      }
      else
      {
        localMMFragment = Nl(paramInt);
        this.ynQ.put(Integer.valueOf(paramInt), localMMFragment);
        AppMethodBeat.o(29643);
      }
    }
  }

  public final void aqG(String paramString)
  {
    AppMethodBeat.i(29640);
    if ((paramString == null) || (paramString.equals("")))
      AppMethodBeat.o(29640);
    while (true)
    {
      return;
      Nm(((Integer)ynP.get(paramString)).intValue());
      AppMethodBeat.o(29640);
    }
  }

  public final void dxn()
  {
    AppMethodBeat.i(29638);
    MainUI localMainUI = (MainUI)this.ynQ.get(Integer.valueOf(0));
    ViewGroup localViewGroup = (ViewGroup)this.yhZ.findViewById(2131820633);
    if (localViewGroup != null)
      localViewGroup.setImportantForAccessibility(4);
    if (localMainUI != null)
      localMainUI.onHiddenChanged(true);
    j.a(this.yhZ, 4, this.mbt, "prepareStartChatting");
    dyA();
    this.ynE.dyC();
    AppMethodBeat.o(29638);
  }

  public final void dxr()
  {
    AppMethodBeat.i(29634);
    MainUI localMainUI = (MainUI)this.ynQ.get(Integer.valueOf(0));
    if (localMainUI != null)
    {
      localMainUI.dHz();
      localMainUI.dIT();
    }
    AppMethodBeat.o(29634);
  }

  public final void dyA()
  {
    AppMethodBeat.i(29635);
    MainUI localMainUI = (MainUI)this.ynQ.get(Integer.valueOf(0));
    if (localMainUI != null)
      localMainUI.dIU();
    AppMethodBeat.o(29635);
  }

  public final void dyB()
  {
    AppMethodBeat.i(29639);
    if ((this.mbt == 0) && (g.RO().eJo.foreground))
      aw.getNotification().bv(true);
    while (true)
    {
      Object localObject = (ViewGroup)this.yhZ.findViewById(2131820633);
      if (localObject != null)
        ((ViewGroup)localObject).setImportantForAccessibility(1);
      dxr();
      j.a(this.yhZ, 3, this.mbt, "prepareCloseChatting");
      localObject = (MainUI)this.ynQ.get(Integer.valueOf(0));
      if (localObject != null)
      {
        ((MainUI)localObject).getContentView();
        if (((MainUI)localObject).mController != null)
          ((MainUI)localObject).mController.onResume();
        ((MainUI)localObject).onHiddenChanged(false);
      }
      AppMethodBeat.o(29639);
      return;
      aw.getNotification().bv(false);
    }
  }

  protected final void dyC()
  {
    AppMethodBeat.i(29644);
    this.ynE.dyC();
    AppMethodBeat.o(29644);
  }

  protected final void dyD()
  {
    AppMethodBeat.i(29645);
    this.ynE.dyD();
    AppMethodBeat.o(29645);
  }

  protected final void dyE()
  {
    AppMethodBeat.i(29646);
    this.ynE.dyE();
    AppMethodBeat.o(29646);
  }

  public final int dyF()
  {
    AppMethodBeat.i(29647);
    w localw = this.ynE;
    long l = System.currentTimeMillis();
    int i;
    if (!aw.RK())
    {
      ab.w("MicroMsg.UnreadCountHelper", "getMainTabUnreadCount, but mmcore not ready");
      i = 0;
    }
    while (true)
    {
      localw.No(i);
      ab.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "unreadcheck setConversationTagUnread  last time %d, unread %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(i) });
      AppMethodBeat.o(29647);
      return i;
      i = u.e(t.fkP, af.dzi());
      ab.d("MicroMsg.LauncherUI", "getMainTabUnreadCount  unread : %d", new Object[] { Integer.valueOf(i) });
    }
  }

  public final void dyG()
  {
    AppMethodBeat.i(29648);
    this.ynQ.get(Integer.valueOf(0));
    AppMethodBeat.o(29648);
  }

  public final MMFragment dyx()
  {
    AppMethodBeat.i(29630);
    MMFragment localMMFragment = (MMFragment)this.ynQ.get(Integer.valueOf(this.mbt));
    AppMethodBeat.o(29630);
    return localMMFragment;
  }

  public final void dyy()
  {
    AppMethodBeat.i(29632);
    com.tencent.mm.sdk.b.a.xxA.d(this.ynM);
    com.tencent.mm.sdk.b.a.xxA.d(this.ynO);
    dyz();
    AppMethodBeat.o(29632);
  }

  public final void hc(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(29636);
    if (paramInt1 == paramInt2)
      AppMethodBeat.o(29636);
    while (true)
    {
      return;
      MMFragment localMMFragment = Nn(paramInt1);
      if ((localMMFragment != null) && ((localMMFragment instanceof m)))
        ((m)localMMFragment).dxd();
      localMMFragment = Nn(paramInt2);
      if ((localMMFragment != null) && ((localMMFragment instanceof m)))
        ((m)localMMFragment).dxc();
      j.a(this.yhZ, 4, paramInt1, "deliverOnTabChange");
      j.a(this.yhZ, 3, paramInt2, "deliverOnTabChange");
      AppMethodBeat.o(29636);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MainTabUI
 * JD-Core Version:    0.6.2
 */
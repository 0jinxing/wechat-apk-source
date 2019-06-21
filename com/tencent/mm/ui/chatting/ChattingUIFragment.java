package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.c.b.af;
import com.tencent.mm.ui.chatting.c.b.i;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.c.b.t;
import com.tencent.mm.ui.chatting.c.l;
import com.tencent.mm.ui.chatting.f.b.a;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.view.MMChattingListView;
import com.tencent.mm.ui.widget.SwipeBackLayout;

@SuppressLint({"ValidFragment"})
public class ChattingUIFragment extends BaseChattingUIFragment
{
  public static String xIj;
  private int mScrollState = 0;
  private com.tencent.mm.ui.base.p tipDialog = null;
  public com.tencent.mm.ui.chatting.a.a yLk;
  ListView yLl;
  private Runnable yLm;
  private MMChattingListView yLn;
  private boolean yLo = true;
  protected boolean yLp = true;
  private boolean yLq = false;
  private boolean yLr = false;
  private int yLs = 0;
  private final int yLt = 10;
  private com.tencent.mm.ui.chatting.l.a.a yLu;

  @SuppressLint({"ValidFragment"})
  public ChattingUIFragment()
  {
  }

  @SuppressLint({"ValidFragment"})
  public ChattingUIFragment(byte paramByte)
  {
    super((byte)0);
  }

  private boolean dCG()
  {
    AppMethodBeat.i(30896);
    i locali = (i)this.cgL.aF(i.class);
    com.tencent.mm.ui.chatting.c.b.z localz = (com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class);
    boolean bool;
    if (locali.dDN())
      if (localz.dEQ())
      {
        localz.dEP();
        locali.dDO();
        bool = true;
        AppMethodBeat.o(30896);
      }
    while (true)
    {
      return bool;
      locali.dDL();
      break;
      bool = false;
      AppMethodBeat.o(30896);
    }
  }

  private void qq(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(30855);
    int j = this.yLl.getLastVisiblePosition();
    int k = this.yLl.getFirstVisiblePosition();
    int m = this.yLl.getCount();
    ab.i("MicroMsg.ChattingUIFragment", "[scrollToLastImpl] isFirstScroll:%s [%s:%s] count:%s force:%s", new Object[] { Boolean.valueOf(this.yLo), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(paramBoolean) });
    this.yLo = false;
    int n = i;
    if (paramBoolean)
    {
      n = i;
      if (j == k)
      {
        n = i;
        if (j >= m - 1)
        {
          n = i;
          if (this.yLl.getChildCount() > 0)
            n = this.yLl.getChildAt(this.yLl.getChildCount() - 1).getHeight();
        }
      }
    }
    k.a(this.yLl, m - 1, -n, true);
    this.yLl.post(new ChattingUIFragment.6(this, m, n));
    AppMethodBeat.o(30855);
  }

  public final void Oq(int paramInt)
  {
    AppMethodBeat.i(30858);
    com.tencent.mm.ui.chatting.d.a.dFz().removeCallbacks(this.yLm);
    ab.i("MicroMsg.ChattingUIFragment", "[setSelection] pos:%d isSmooth:%s", new Object[] { Integer.valueOf(paramInt), Boolean.FALSE });
    ListView localListView = this.yLl;
    if (localListView != null)
    {
      ab.i("MicroMsg.ChattingUI.ScrollController", "setSelection position %s smooth %s", new Object[] { Integer.valueOf(paramInt), Boolean.FALSE });
      localListView.setItemChecked(paramInt, true);
      localListView.setSelection(paramInt);
    }
    AppMethodBeat.o(30858);
  }

  public final void Or(int paramInt)
  {
    AppMethodBeat.i(30874);
    this.yLl.setVisibility(paramInt);
    if (ab.getLogLevel() == 2)
      ab.i("MicroMsg.ChattingUIFragment", "[setListViewVisibility] visibility:" + paramInt + " stack:" + bo.dpG().toString());
    AppMethodBeat.o(30874);
  }

  public final void aWv()
  {
    AppMethodBeat.i(30851);
    if (this.yLk == null)
      AppMethodBeat.o(30851);
    while (true)
    {
      return;
      this.yLk.notifyDataSetChanged();
      AppMethodBeat.o(30851);
    }
  }

  protected final void ac(ad paramad)
  {
    AppMethodBeat.i(30879);
    super.ac(paramad);
    xIj = paramad.field_username;
    AppMethodBeat.o(30879);
  }

  @Deprecated
  public final void aj(final boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(30854);
    if (paramBoolean2)
    {
      com.tencent.mm.ui.chatting.d.a.dFz().removeCallbacks(this.yLm);
      ak localak = com.tencent.mm.ui.chatting.d.a.dFz();
      Runnable local1 = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(30829);
          ChattingUIFragment.a(ChattingUIFragment.this, paramBoolean1);
          AppMethodBeat.o(30829);
        }
      };
      this.yLm = local1;
      localak.postDelayed(local1, 10L);
      AppMethodBeat.o(30854);
    }
    while (true)
    {
      return;
      qq(paramBoolean1);
      AppMethodBeat.o(30854);
    }
  }

  public final void aw(Bundle paramBundle)
  {
    AppMethodBeat.i(30869);
    this.yLn.aw(paramBundle);
    AppMethodBeat.o(30869);
  }

  public final void ax(Bundle paramBundle)
  {
    AppMethodBeat.i(30871);
    this.yLn.a(true, paramBundle);
    AppMethodBeat.o(30871);
  }

  public final void bY(int paramInt)
  {
    AppMethodBeat.i(30856);
    com.tencent.mm.ui.chatting.d.a.dFz().removeCallbacks(this.yLm);
    this.yLl.post(new ChattingUIFragment.7(this, paramInt));
    AppMethodBeat.o(30856);
  }

  public final void c(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(30861);
    dismissDialog();
    this.tipDialog = h.b(paramContext, paramString, true, paramOnCancelListener);
    AppMethodBeat.o(30861);
  }

  public void cch()
  {
    AppMethodBeat.i(30900);
    aw.RS().aa(new ChattingUIFragment.5(this));
    AppMethodBeat.o(30900);
  }

  public final void dBL()
  {
    AppMethodBeat.i(30884);
    super.dBL();
    if (this.cgL.getTalkerUserName() == null)
      AppMethodBeat.o(30884);
    while (true)
    {
      return;
      AppMethodBeat.o(30884);
    }
  }

  public final com.tencent.mm.ui.r dBO()
  {
    AppMethodBeat.i(30877);
    com.tencent.mm.ui.r localr;
    if (this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class) == null)
    {
      localr = null;
      AppMethodBeat.o(30877);
    }
    while (true)
    {
      return localr;
      localr = ((com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class)).dBO();
      AppMethodBeat.o(30877);
    }
  }

  public final boolean dBP()
  {
    AppMethodBeat.i(30890);
    if (!isScreenEnable())
    {
      ab.w("MicroMsg.ChattingUIFragment", "Actionbar customView onclick screen not enable");
      AppMethodBeat.o(30890);
      return true;
    }
    hideVKB();
    if (getActivity() != null)
    {
      View localView = getActivity().findViewById(2131820633);
      if (localView == null)
        break label83;
      localView.setVisibility(0);
      localView.post(new ChattingUIFragment.11(this));
    }
    while (true)
    {
      AppMethodBeat.o(30890);
      break;
      label83: dCE();
    }
  }

  public final com.tencent.mm.ui.chatting.l.a.a dBQ()
  {
    return this.yLu;
  }

  public final void dBR()
  {
    AppMethodBeat.i(30898);
    if ((this.yLn == null) || (this.yLk == null))
    {
      AppMethodBeat.o(30898);
      return;
    }
    Object localObject1 = this.cgL;
    Object localObject2 = new com.tencent.mm.ui.chatting.f.a(this.yLk.yNj);
    com.tencent.mm.ui.chatting.f.b localb = new com.tencent.mm.ui.chatting.f.b(this.cgL, this.yLn);
    localObject2 = new com.tencent.mm.ui.chatting.f.e(localb, (com.tencent.mm.ui.chatting.f.c)localObject2);
    if (((com.tencent.mm.ui.chatting.c.b.d)((com.tencent.mm.ui.chatting.d.a)localObject1).aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm())
      localObject1 = new com.tencent.mm.ui.chatting.l.a.b((com.tencent.mm.ui.chatting.d.a)localObject1, (com.tencent.mm.ui.chatting.f.e)localObject2);
    while (true)
    {
      localb.yYr = ((b.a)localObject1);
      ab.i("MicroMsg.ChattingLoader.ChattingDataPresenterFactory", "[ChattingDataPresenterFactory] executor:%s", new Object[] { ((com.tencent.mm.ui.chatting.l.a.a)localObject1).toString() });
      this.yLu = ((com.tencent.mm.ui.chatting.l.a.a)localObject1);
      this.yLk.yNt = this.yLu;
      this.yLn.setLoadExecutor(this.yLu);
      AppMethodBeat.o(30898);
      break;
      if (((com.tencent.mm.ui.chatting.c.b.p)((com.tencent.mm.ui.chatting.d.a)localObject1).aF(com.tencent.mm.ui.chatting.c.b.p.class)).dEi())
        localObject1 = new com.tencent.mm.ui.chatting.l.a.c((com.tencent.mm.ui.chatting.d.a)localObject1, (com.tencent.mm.ui.chatting.f.d)localObject2);
      else if ((((com.tencent.mm.ui.chatting.c.b.z)((com.tencent.mm.ui.chatting.d.a)localObject1).aF(com.tencent.mm.ui.chatting.c.b.z.class)).dEU()) || (((com.tencent.mm.ui.chatting.c.b.z)((com.tencent.mm.ui.chatting.d.a)localObject1).aF(com.tencent.mm.ui.chatting.c.b.z.class)).dEV()) || (((com.tencent.mm.ui.chatting.c.b.z)((com.tencent.mm.ui.chatting.d.a)localObject1).aF(com.tencent.mm.ui.chatting.c.b.z.class)).dES()))
        localObject1 = new com.tencent.mm.ui.chatting.l.a.e((com.tencent.mm.ui.chatting.d.a)localObject1, (com.tencent.mm.ui.chatting.f.d)localObject2);
      else
        localObject1 = new com.tencent.mm.ui.chatting.l.a.d((com.tencent.mm.ui.chatting.d.a)localObject1, (com.tencent.mm.ui.chatting.f.e)localObject2);
    }
  }

  public void dBq()
  {
    AppMethodBeat.i(30881);
    this.yLr = false;
    this.yLo = true;
    this.yLp = true;
    ab.d("MicroMsg.ChattingUIFragment", "isFromSearch  " + getBooleanExtra("finish_direct", false));
    int i;
    String str;
    Object localObject1;
    int j;
    label123: Object localObject2;
    if (this.cgL.sRl == null)
    {
      i = 1;
      ab.i("MicroMsg.ChattingUIFragment", "[doCreate] rawUserName from :%s to :%s ", new Object[] { this.cgL.getTalkerUserName(), getStringExtra("Chat_User") });
      str = getStringExtra("Chat_User");
      aw.ZK();
      localObject1 = com.tencent.mm.model.c.XM().aoO(str);
      if (localObject1 != null)
        break label328;
      j = -1;
      if (localObject1 != null)
        break label338;
      localObject2 = "null";
      label132: ab.w("MicroMsg.ChattingUIFragment", "protectContactNotExist raw:%s contact:%d username:%s", new Object[] { str, Integer.valueOf(j), localObject2 });
      if ((localObject1 != null) && ((int)((com.tencent.mm.n.a)localObject1).ewQ != 0) && (!bo.isNullOrNil(((ap)localObject1).field_username)))
        break label347;
      ad localad = new ad();
      localad.setUsername(str);
      localad.xXc = str;
      localad.NC();
      localad.hz(3);
      aw.ZK();
      com.tencent.mm.model.c.XM().Y(localad);
      aw.ZK();
      localObject1 = com.tencent.mm.model.c.XM().aoO(str);
      localObject2 = localObject1;
      if (localObject1 != null)
        break label350;
      ab.e("MicroMsg.ChattingUIFragment", "protectContactNotExist contact get from db is null!");
      localObject1 = localad;
    }
    while (true)
    {
      ac((ad)localObject1);
      super.dBq();
      if (isSupportNavigationSwipeBack())
      {
        getSwipeBackLayout().setEnableGesture(true);
        getSwipeBackLayout().init();
      }
      if (i != 0)
        com.tencent.mm.ui.chatting.d.a.dFz().post(new ChattingUIFragment.8(this));
      dBs();
      AppMethodBeat.o(30881);
      return;
      i = 0;
      break;
      label328: j = (int)((com.tencent.mm.n.a)localObject1).ewQ;
      break label123;
      label338: localObject2 = ((ap)localObject1).field_username;
      break label132;
      label347: localObject2 = localObject1;
      label350: localObject1 = localObject2;
      if (ad.mR(str))
      {
        ab.i("MicroMsg.ChattingUIFragment", "[protectContactNotExist] isBottleContact userName:".concat(String.valueOf(str)));
        ((ad)localObject2).xXc = str;
        ((ad)localObject2).setUsername(str);
        localObject1 = localObject2;
      }
    }
  }

  public void dBr()
  {
    AppMethodBeat.i(30882);
    super.dBr();
    if (getWindow() != null)
      getWindow().setBackgroundDrawableResource(2131690395);
    boolean bool1;
    boolean bool2;
    label57: boolean bool3;
    if (getContentView() != null)
    {
      bool1 = getContentView().isShown();
      if (getView() == null)
        break label124;
      bool2 = getView().isShown();
      if (this.yLl.getVisibility() != 0)
        break label129;
      bool3 = true;
      label69: if (this.cgL.caA)
        break label134;
      ab.i("MicroMsg.ChattingUIFragment", "onResume fragment not foreground, return,  chatting contentview is show %b, viewShow %b listviewShow:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      AppMethodBeat.o(30882);
    }
    while (true)
    {
      return;
      bool1 = false;
      break;
      label124: bool2 = false;
      break label57;
      label129: bool3 = false;
      break label69;
      label134: if (!aw.RK())
      {
        ab.w("MicroMsg.ChattingUIFragment", "account not ready, mabey not call onDestroy!!!");
        finish();
        AppMethodBeat.o(30882);
      }
      else
      {
        this.yLk.resume();
        AppMethodBeat.o(30882);
      }
    }
  }

  protected void dBs()
  {
    AppMethodBeat.i(30899);
    this.mScrollState = 0;
    this.yLn = ((MMChattingListView)findViewById(2131822378));
    this.yLl = this.yLn.getListView();
    this.yLl.setVisibility(0);
    ((com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class)).dEk();
    if (this.yLn.getBaseAdapter() == null)
    {
      this.yLk = new com.tencent.mm.ui.chatting.a.a(this.cgL, this.yLl);
      this.yLn.setAdapter(this.yLk);
    }
    Object localObject = this.yLn;
    ((MMChattingListView)localObject).qd(false);
    ((MMChattingListView)localObject).qd(false);
    dBR();
    this.yLu.a(d.a.yYv, true, null);
    this.yLl.setOverScrollMode(2);
    if (!((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dES())
      this.yLl.setTranscriptMode(1);
    while (true)
    {
      this.yLl.setOnTouchListener(new ChattingUIFragment.2(this));
      this.yLl.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          try
          {
            AppMethodBeat.i(30832);
            ChattingUIFragment.this.yHi.onScroll(paramAnonymousAbsListView, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
            if (ChattingUIFragment.i(ChattingUIFragment.this))
              if (ChattingUIFragment.a(ChattingUIFragment.this).getLastVisiblePosition() != paramAnonymousInt3 - 1)
                AppMethodBeat.o(30832);
            while (true)
            {
              return;
              ChattingUIFragment.j(ChattingUIFragment.this);
              AppMethodBeat.o(30832);
            }
          }
          finally
          {
          }
          throw paramAnonymousAbsListView;
        }

        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          AppMethodBeat.i(30831);
          ChattingUIFragment.this.yHi.onScrollStateChanged(paramAnonymousAbsListView, paramAnonymousInt);
          ChattingUIFragment.a(ChattingUIFragment.this, paramAnonymousInt);
          if (paramAnonymousInt == 0)
          {
            ab.d("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] [%s:%s]", new Object[] { Integer.valueOf(ChattingUIFragment.a(ChattingUIFragment.this).getFirstVisiblePosition()), Integer.valueOf(ChattingUIFragment.a(ChattingUIFragment.this).getLastVisiblePosition()) });
            if (ChattingUIFragment.a(ChattingUIFragment.this).getFirstVisiblePosition() != 0)
              break label199;
            paramAnonymousAbsListView = ChattingUIFragment.a(ChattingUIFragment.this).getChildAt(0);
            if (paramAnonymousAbsListView != null)
            {
              if (paramAnonymousAbsListView.getTop() != 0)
                break label165;
              ab.i("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] auto load top more!");
              ChattingUIFragment.h(ChattingUIFragment.this).qc(true);
            }
          }
          while (true)
          {
            ChattingUIFragment.this.yLk.dD(ChattingUIFragment.a(ChattingUIFragment.this).getFirstVisiblePosition(), ChattingUIFragment.a(ChattingUIFragment.this).getLastVisiblePosition());
            AppMethodBeat.o(30831);
            return;
            label165: if (paramAnonymousAbsListView.getTop() < 0)
            {
              ab.w("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] exception auto load top more wit reset adapter!");
              ChattingUIFragment.h(ChattingUIFragment.this).setAdapter(ChattingUIFragment.this.yLk);
              continue;
              label199: if (ChattingUIFragment.a(ChattingUIFragment.this).getLastVisiblePosition() == ChattingUIFragment.a(ChattingUIFragment.this).getCount() - 1)
              {
                paramAnonymousAbsListView = ChattingUIFragment.a(ChattingUIFragment.this).getChildAt(ChattingUIFragment.a(ChattingUIFragment.this).getChildCount() - 1);
                if ((paramAnonymousAbsListView != null) && (ChattingUIFragment.a(ChattingUIFragment.this).getBottom() - ChattingUIFragment.h(ChattingUIFragment.this).getBottomHeight() >= paramAnonymousAbsListView.getBottom()))
                {
                  ab.i("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] auto load bottom more!");
                  ChattingUIFragment.h(ChattingUIFragment.this).qd(true);
                }
              }
            }
          }
        }
      });
      this.yLl.addOnLayoutChangeListener(new ChattingUIFragment.4(this));
      if (((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(2))
      {
        localObject = this.cgL;
        if (localObject != null)
        {
          localObject = ((com.tencent.mm.ui.chatting.d.a)localObject).sRl;
          if ((localObject != null) && (((ad)localObject).dsf()))
            ((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rX(0);
        }
      }
      registerForContextMenu(this.yLl);
      aj(false, true);
      AppMethodBeat.o(30899);
      return;
      this.yLl.setTranscriptMode(0);
    }
  }

  public void dBt()
  {
    AppMethodBeat.i(30883);
    super.dBt();
    q.dismiss();
    ab.i("MicroMsg.ChattingUIFragment", "on chatting ui pause  rawuser:%s", new Object[] { this.cgL.getTalkerUserName() });
    if (this.cgL.getTalkerUserName() == null)
      AppMethodBeat.o(30883);
    while (true)
    {
      return;
      this.yLk.pause();
      hideVKB();
      ab.d("MicroMsg.ChattingUIFragment", "chattingui cancel pause auto download logic");
      AppMethodBeat.o(30883);
    }
  }

  public final void dCA()
  {
    AppMethodBeat.i(30866);
    this.yLn.setIsTopShowAll(false);
    AppMethodBeat.o(30866);
  }

  public final void dCB()
  {
    AppMethodBeat.i(30870);
    this.yLn.qc(false);
    AppMethodBeat.o(30870);
  }

  public final void dCC()
  {
    AppMethodBeat.i(30875);
    this.yLl.setTranscriptMode(0);
    AppMethodBeat.o(30875);
  }

  public final void dCD()
  {
    AppMethodBeat.i(30888);
    Object localObject = (com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class);
    int i;
    if ((!((com.tencent.mm.ui.chatting.c.b.z)localObject).dES()) && (!((com.tencent.mm.ui.chatting.c.b.z)localObject).dEU()) && (!((com.tencent.mm.ui.chatting.c.b.z)localObject).dEV()))
    {
      i = this.yLs;
      this.yLs = (i + 1);
      if ((i < 10) && (((thisActivity() instanceof ChattingUI)) || ((thisActivity() instanceof AppBrandServiceChattingUI))))
      {
        ListView localListView = this.yLl;
        localObject = new ChattingUIFragment.9(this);
        if (this.yLs == 1)
        {
          i = 10;
          localListView.postDelayed((Runnable)localObject, i);
          AppMethodBeat.o(30888);
        }
      }
    }
    while (true)
    {
      return;
      i = 100;
      break;
      ab.d("MicroMsg.ChattingUIFragment", "scrollToLastProtect:%s, %s ,%s", new Object[] { Boolean.valueOf(((com.tencent.mm.ui.chatting.c.b.z)localObject).dES()), Boolean.valueOf(((com.tencent.mm.ui.chatting.c.b.z)localObject).dEU()), Integer.valueOf(this.yLs) });
      AppMethodBeat.o(30888);
    }
  }

  protected final void dCE()
  {
    AppMethodBeat.i(30891);
    ((af)this.cgL.aF(af.class)).ax(new ChattingUIFragment.12(this));
    AppMethodBeat.o(30891);
  }

  protected final void dCF()
  {
    AppMethodBeat.i(30895);
    dCG();
    Object localObject = (com.tencent.mm.ui.chatting.c.b.d)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.d.class);
    if (ad.aou(this.cgL.getTalkerUserName()))
    {
      localObject = new Intent();
      ((Intent)localObject).addFlags(67108864);
      com.tencent.mm.bp.d.b(getContext(), "tmessage", ".ui.TConversationUI", (Intent)localObject);
      finish();
      AppMethodBeat.o(30895);
    }
    while (true)
    {
      return;
      if (getIntExtra("chat_from_scene", 0) == 4)
      {
        finish();
        AppMethodBeat.o(30895);
      }
      else if (((getIntExtra("chat_from_scene", 0) == 1) || (getIntExtra("chat_from_scene", 0) == 3)) && (this.cgL.sRl != null) && (this.cgL.sRl.dsf()) && (((com.tencent.mm.ui.chatting.c.b.d)localObject).dDj() != null) && (((com.tencent.mm.ui.chatting.c.b.d)localObject).dDj().adQ()) && (((com.tencent.mm.ui.chatting.c.b.d)localObject).dDj().cJ(false) != null) && (((com.tencent.mm.ui.chatting.c.b.d)localObject).dDj().cJ(false).aer() != null) && (!bo.isNullOrNil(((com.tencent.mm.ui.chatting.c.b.d)localObject).dDj().adX())))
      {
        finish();
        AppMethodBeat.o(30895);
      }
      else
      {
        if (((t)this.cgL.aF(t.class)).dEF())
        {
          finish();
          break;
        }
        if (getBooleanExtra("finish_direct", false).booleanValue())
          break;
        if (!this.isCurrentActivity)
        {
          finish();
          AppMethodBeat.o(30895);
        }
        else
        {
          localObject = new Intent(getContext(), LauncherUI.class);
          ((Intent)localObject).addFlags(67108864);
          startActivity((Intent)localObject);
          overridePendingTransition(MMFragmentActivity.a.yne, MMFragmentActivity.a.ynf);
          finish();
          AppMethodBeat.o(30895);
        }
      }
    }
  }

  public final void dCx()
  {
    AppMethodBeat.i(30852);
    if (Looper.myLooper() != Looper.getMainLooper());
    for (boolean bool = true; ; bool = false)
    {
      aj(false, bool);
      AppMethodBeat.o(30852);
      return;
    }
  }

  public final void dCy()
  {
    AppMethodBeat.i(30857);
    ab.i("MicroMsg.ChattingUIFragment", "[smoothScrollBy] dis:%d duration:%d", new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
    this.yLl.smoothScrollBy(0, 0);
    AppMethodBeat.o(30857);
  }

  public final void dCz()
  {
    AppMethodBeat.i(30865);
    this.yLn.setTopViewVisible(true);
    AppMethodBeat.o(30865);
  }

  public void dealContentView(View paramView)
  {
    AppMethodBeat.i(30845);
    super.dealContentView(paramView);
    ((com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class)).eM(paramView);
    AppMethodBeat.o(30845);
  }

  public final void dismissDialog()
  {
    AppMethodBeat.i(30862);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    AppMethodBeat.o(30862);
  }

  public void finish()
  {
    AppMethodBeat.i(30897);
    int i = 100;
    if (!hideVKB())
      i = 0;
    ChattingUIFragment.13 local13 = new ChattingUIFragment.13(this);
    if (i == 0)
    {
      local13.run();
      AppMethodBeat.o(30897);
    }
    while (true)
    {
      return;
      al.n(local13, 100L);
      AppMethodBeat.o(30897);
    }
  }

  public final int getBottomHeight()
  {
    AppMethodBeat.i(30872);
    int i;
    if (this.yLn == null)
    {
      i = 0;
      AppMethodBeat.o(30872);
    }
    while (true)
    {
      return i;
      i = this.yLn.getBottomHeight();
      AppMethodBeat.o(30872);
    }
  }

  public final int getFirstVisiblePosition()
  {
    AppMethodBeat.i(30876);
    int i = this.yLl.getFirstVisiblePosition();
    AppMethodBeat.o(30876);
    return i;
  }

  public int getLayoutId()
  {
    return 2130969011;
  }

  public final ListView getListView()
  {
    return this.yLl;
  }

  public final int getTopHeight()
  {
    AppMethodBeat.i(30873);
    int i = this.yLn.getTopHeight();
    AppMethodBeat.o(30873);
    return i;
  }

  public boolean getUserVisibleHint()
  {
    return this.cgL.caA;
  }

  public final void hR(Context paramContext)
  {
    AppMethodBeat.i(30880);
    super.hR(paramContext);
    ab.i("MicroMsg.ChattingUIFragment", "[doAttach]:%s#0x%x task:%s hc:%d", new Object[] { thisActivity().getClass().getSimpleName(), Integer.valueOf(thisActivity().hashCode()), bo.gU(thisActivity()), Integer.valueOf(hashCode()) });
    if (this.mController != null)
      this.mController.aC(3, true);
    AppMethodBeat.o(30880);
  }

  public boolean hideVKB()
  {
    AppMethodBeat.i(30860);
    ChatFooter localChatFooter = ((o)this.cgL.aF(o.class)).dDX();
    boolean bool;
    if (localChatFooter != null)
    {
      bool = localChatFooter.hideVKB();
      AppMethodBeat.o(30860);
    }
    while (true)
    {
      return bool;
      bool = super.hideVKB();
      AppMethodBeat.o(30860);
    }
  }

  public final void ho(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(30859);
    com.tencent.mm.ui.chatting.d.a.dFz().removeCallbacks(this.yLm);
    ab.i("MicroMsg.ChattingUIFragment", "[setSelectionFromTop] pos:%d offset:%s isSmooth:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.FALSE });
    k.a(this.yLl, paramInt1, paramInt2, false);
    AppMethodBeat.o(30859);
  }

  public boolean isSupportCustomActionBar()
  {
    AppMethodBeat.i(30878);
    boolean bool = isSupportNavigationSwipeBack();
    AppMethodBeat.o(30878);
    return bool;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30901);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 30763) || (paramInt1 == 30762))
      switch (paramInt1)
      {
      default:
      case 30762:
      case 30763:
      }
    label159: 
    while (true)
    {
      AppMethodBeat.o(30901);
      while (true)
      {
        return;
        if (paramIntent == null)
          break label159;
        paramIntent = paramIntent.getBundleExtra("result_data");
        if ((paramIntent == null) || (!paramIntent.getString("go_next", "").equals("gdpr_auth_location")))
          break;
        g.RP().Ry().set(ac.a.xVP, Boolean.TRUE);
        if (paramInt1 == 30763)
        {
          com.tencent.mm.pluginsdk.permission.b.b(getActivity(), "android.permission.ACCESS_COARSE_LOCATION", 67);
          AppMethodBeat.o(30901);
        }
        else
        {
          com.tencent.mm.pluginsdk.permission.b.b(getActivity(), "android.permission.ACCESS_COARSE_LOCATION", 68);
          break;
          AppMethodBeat.o(30901);
        }
      }
    }
  }

  public void onCancelDrag()
  {
    AppMethodBeat.i(30894);
    if ((isSupportNavigationSwipeBack()) && (this.yLk != null))
      this.yLp = true;
    AppMethodBeat.o(30894);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    AppMethodBeat.i(30844);
    if (!this.cgL.caA)
      AppMethodBeat.o(30844);
    while (true)
    {
      return;
      super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
      AppMethodBeat.o(30844);
    }
  }

  public void onDragBegin()
  {
    AppMethodBeat.i(30893);
    if ((isSupportNavigationSwipeBack()) && (this.yLk != null))
      this.yLp = false;
    AppMethodBeat.o(30893);
  }

  public void onEnterBegin()
  {
    AppMethodBeat.i(30885);
    super.onEnterBegin();
    cch();
    AppMethodBeat.o(30885);
  }

  public final void onExitBegin()
  {
    AppMethodBeat.i(30886);
    super.onExitBegin();
    com.tencent.mm.ui.chatting.a.a locala = this.yLk;
    locala.yNm = -1L;
    locala.yNl.clear();
    this.yLu.zae.cancel();
    cch();
    AppMethodBeat.o(30886);
  }

  public final void onExitEnd()
  {
    AppMethodBeat.i(30887);
    super.onExitEnd();
    dismissDialog();
    AppMethodBeat.o(30887);
  }

  public void onKeyboardStateChanged()
  {
    AppMethodBeat.i(30889);
    if (keyboardState() == 1)
      this.yLl.post(new ChattingUIFragment.10(this));
    AppMethodBeat.o(30889);
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(30892);
    ab.w("MicroMsg.ChattingUIFragment", "onSwipeBack");
    dCF();
    if (isSupportNavigationSwipeBack())
      getSwipeBackLayout().setEnableGesture(false);
    AppMethodBeat.o(30892);
  }

  public final void qd(boolean paramBoolean)
  {
    AppMethodBeat.i(30868);
    this.yLn.qd(paramBoolean);
    AppMethodBeat.o(30868);
  }

  public final void qp(boolean paramBoolean)
  {
    AppMethodBeat.i(30853);
    if (Looper.myLooper() != Looper.getMainLooper());
    for (boolean bool = true; ; bool = false)
    {
      aj(paramBoolean, bool);
      AppMethodBeat.o(30853);
      return;
    }
  }

  public void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    AppMethodBeat.i(30850);
    ((com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class)).setBackBtn(paramOnMenuItemClickListener);
    AppMethodBeat.o(30850);
  }

  public final void setBottomViewVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(30864);
    this.yLn.setBottomViewVisible(paramBoolean);
    AppMethodBeat.o(30864);
  }

  public final void setIsBottomShowAll(boolean paramBoolean)
  {
    AppMethodBeat.i(30867);
    this.yLn.setIsBottomShowAll(paramBoolean);
    AppMethodBeat.o(30867);
  }

  public final void setKeepScreenOn(boolean paramBoolean)
  {
    AppMethodBeat.i(30863);
    this.yLl.setKeepScreenOn(paramBoolean);
    AppMethodBeat.o(30863);
  }

  public void setMMSubTitle(int paramInt)
  {
    AppMethodBeat.i(30849);
    setMMSubTitle(getMMString(paramInt));
    AppMethodBeat.o(30849);
  }

  public void setMMSubTitle(String paramString)
  {
    AppMethodBeat.i(30848);
    ((com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class)).setMMSubTitle(paramString);
    AppMethodBeat.o(30848);
  }

  public void setMMTitle(int paramInt)
  {
    AppMethodBeat.i(30846);
    setMMTitle(getMMString(paramInt));
    AppMethodBeat.o(30846);
  }

  public void setMMTitle(String paramString)
  {
    AppMethodBeat.i(30847);
    ((com.tencent.mm.ui.chatting.c.b.r)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.r.class)).M(paramString);
    AppMethodBeat.o(30847);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUIFragment
 * JD-Core Version:    0.6.2
 */
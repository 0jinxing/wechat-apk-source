package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.bp.d.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.d;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.c.b.k;
import com.tencent.mm.ui.chatting.c.g.a;
import com.tencent.mm.ui.chatting.c.l;
import com.tencent.mm.ui.chatting.c.w;
import com.tencent.mm.ui.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public abstract class BaseChattingUIFragment extends MMFragment
  implements ae, af
{
  public com.tencent.mm.ui.chatting.d.a cgL = new com.tencent.mm.ui.chatting.d.a(this, this, this);
  protected String yHf;
  protected String yHg;
  private com.tencent.mm.ui.chatting.c.h yHh = new com.tencent.mm.ui.chatting.c.h();
  l yHi = new l();
  public boolean yHj = false;
  private int yHk = 0;
  int yHl;
  int yHm;

  public BaseChattingUIFragment()
  {
    dBD();
  }

  public BaseChattingUIFragment(byte paramByte)
  {
    super(true);
    dBD();
  }

  private void Of(int paramInt)
  {
    this.yHk |= paramInt;
  }

  private void Og(int paramInt)
  {
    this.yHk &= (paramInt ^ 0xFFFFFFFF);
  }

  private void bBP()
  {
    d(32, new BaseChattingUIFragment.8(this));
  }

  private void d(int paramInt, Runnable paramRunnable)
  {
    boolean bool1 = isStrict(paramInt);
    boolean bool2 = Oe(paramInt);
    if ((bool2) && (bool1))
    {
      Of(paramInt);
      if (2 == paramInt)
      {
        Og(64);
        paramRunnable.run();
      }
    }
    while (true)
    {
      return;
      if (64 == paramInt)
      {
        Og(2);
        break;
      }
      if (4 == paramInt)
      {
        Og(32);
        break;
      }
      if (32 == paramInt)
      {
        Og(4);
        break;
      }
      if (8 == paramInt)
      {
        Og(16);
        break;
      }
      if (16 == paramInt)
      {
        Og(8);
        break;
      }
      if (128 == paramInt)
      {
        Og(256);
        break;
      }
      if (256 == paramInt)
      {
        Og(128);
        break;
      }
      if (512 == paramInt)
      {
        Og(1024);
        break;
      }
      if (1024 != paramInt)
        break;
      Og(512);
      break;
      ab.w("MicroMsg.BaseChattingUIFragment", "catch! [check] %s flag:%x isNever:%s isStrict:%s", new Object[] { this.yHg, Integer.valueOf(paramInt), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
    }
  }

  private void dBD()
  {
    Bundle localBundle = new Bundle();
    if (!localBundle.containsKey(getClass().getName()))
      localBundle.putInt(getClass().getName(), 2147483647);
    setArguments(localBundle);
  }

  private void dBK()
  {
    d(4, new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(30444);
        ab.i("MicroMsg.BaseChattingUIFragment", "[doStart] activity:%s isPreLoaded:%b", new Object[] { BaseChattingUIFragment.this.yHg, Boolean.valueOf(BaseChattingUIFragment.this.yHj) });
        AppMethodBeat.o(30444);
      }
    });
  }

  private boolean dBN()
  {
    if ((Oe(256)) && (!Oe(128)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void djt()
  {
    d(64, new BaseChattingUIFragment.9(this));
  }

  private boolean isStrict(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2;
    if ((4 == paramInt) && (Oe(2)))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (8 == paramInt)
      {
        bool2 = bool1;
        if (Oe(4));
      }
      else if (16 == paramInt)
      {
        bool2 = bool1;
        if (Oe(8));
      }
      else if (32 == paramInt)
      {
        bool2 = bool1;
        if (Oe(4));
      }
      else if (64 == paramInt)
      {
        bool2 = bool1;
        if (Oe(2));
      }
      else if (512 == paramInt)
      {
        bool2 = bool1;
        if (Oe(256));
      }
      else
      {
        bool2 = true;
      }
    }
  }

  public final boolean Oe(int paramInt)
  {
    if ((this.yHk & paramInt) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void ac(ad paramad)
  {
    this.yHg = String.format(this.yHf, new Object[] { paramad.field_username });
    this.cgL.af(paramad);
  }

  public final void addHeaderView(View paramView)
  {
    getListView().addHeaderView(paramView);
  }

  public void cch()
  {
  }

  public final void dBE()
  {
    dBq();
    if ((this.isCurrentActivity) || (this.yHj))
      onEnterBegin();
  }

  public final void dBF()
  {
    if (this.cgL.caA)
      dBK();
  }

  public final void dBG()
  {
    if (this.cgL.caA)
    {
      dBr();
      if ((this.isCurrentActivity) || (this.yHj))
        onEnterEnd();
    }
  }

  public final void dBH()
  {
    if ((this.cgL.caA) || (isFinishing()))
    {
      if ((Oe(8)) && (!isFinishing()) && (!dBM()))
      {
        ab.w("MicroMsg.BaseChattingUIFragment", "[onPause] is never doResume before doPause! Because while entering ChattingUI, the app back to background.");
        dBr();
        onEnterEnd();
      }
      dBt();
    }
  }

  public final void dBI()
  {
    if (((this.cgL.caA) || (isFinishing())) && (!dBN()))
    {
      if (Oe(16))
      {
        ab.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s is never pause when stop coming!", new Object[] { this.yHg });
        dBt();
      }
      bBP();
    }
  }

  public final void dBJ()
  {
    d(512, new BaseChattingUIFragment.1(this));
    djt();
    onExitEnd();
  }

  public void dBL()
  {
    ab.i("MicroMsg.BaseChattingUIFragment", "[doDetach] activity:%s isPreLoaded:%b", new Object[] { this.yHg, Boolean.valueOf(this.yHj) });
    Iterator localIterator = this.cgL.yTu.yYL.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((localEntry.getValue() instanceof w))
        ((w)localEntry.getValue()).dDh();
    }
  }

  public final boolean dBM()
  {
    if ((Oe(1024)) && (!Oe(512)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract r dBO();

  public abstract boolean dBP();

  public com.tencent.mm.ui.chatting.l.a.a dBQ()
  {
    return null;
  }

  public void dBR()
  {
  }

  public void dBq()
  {
    d(2, new BaseChattingUIFragment.4(this));
  }

  public void dBr()
  {
    d(8, new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(30445);
        ab.i("MicroMsg.BaseChattingUIFragment", "[doResume] activity:%s isPreLoaded:%b", new Object[] { BaseChattingUIFragment.this.yHg, Boolean.valueOf(BaseChattingUIFragment.this.yHj) });
        BaseChattingUIFragment.a(BaseChattingUIFragment.this).dxA();
        AppMethodBeat.o(30445);
      }
    });
  }

  public void dBt()
  {
    d(16, new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(30446);
        ab.i("MicroMsg.BaseChattingUIFragment", "[doPause] activity:%s isPreLoaded:%b", new Object[] { BaseChattingUIFragment.this.yHg, Boolean.valueOf(BaseChattingUIFragment.this.yHj) });
        BaseChattingUIFragment.a(BaseChattingUIFragment.this).dxB();
        AppMethodBeat.o(30446);
      }
    });
  }

  public final View getChildAt(int paramInt)
  {
    return getListView().getChildAt(paramInt);
  }

  public int getFirstVisiblePosition()
  {
    return getListView().getFirstVisiblePosition();
  }

  public final int getHeaderViewsCount()
  {
    return getListView().getHeaderViewsCount();
  }

  public String getIdentityString()
  {
    Object localObject = this.cgL.sRl;
    if ((localObject == null) || ((int)((com.tencent.mm.n.a)localObject).ewQ == 0) || (bo.isNullOrNil(((ap)localObject).field_username)))
      localObject = "";
    while (true)
    {
      return localObject;
      if (com.tencent.mm.kernel.g.RK())
      {
        if (f.kq(((ap)localObject).field_username))
          localObject = "_EnterpriseChat";
        else if (f.rc(((ap)localObject).field_username))
          localObject = "_EnterpriseFatherBiz";
        else if (f.rb(((ap)localObject).field_username))
          localObject = "_EnterpriseChildBiz";
      }
      else if (((ad)localObject).dsf())
        localObject = "_bizContact";
      else if (t.kH(((ap)localObject).field_username))
        localObject = "_chatroom";
      else if (t.mR(((ap)localObject).field_username))
        localObject = "_bottle";
      else if (t.mS(((ap)localObject).field_username))
        localObject = "_QQ";
      else
        localObject = "";
    }
  }

  public final int getLastVisiblePosition()
  {
    return getListView().getLastVisiblePosition();
  }

  public abstract ListView getListView();

  protected void hR(Context paramContext)
  {
    ab.i("MicroMsg.BaseChattingUIFragment", "[doAttach] activity:%s isPreLoaded:%b", new Object[] { this.yHg, Boolean.valueOf(this.yHj) });
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    dBE();
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    if (paramIntent == null)
    {
      bool = true;
      ab.i("MicroMsg.BaseChattingUIFragment", "onActivityResult return, requestCode:%d resultCode:%s data is null? %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (this.cgL.caA)
        break label84;
      ab.w("MicroMsg.BaseChattingUIFragment", "[onActivityResult] not foreground, return, requestCode:%d", new Object[] { Integer.valueOf(paramInt1) });
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label84: Object localObject = this.cgL.yTv.getFragment();
      if (localObject != null)
      {
        localObject = com.tencent.mm.ui.chatting.g.b.b((Fragment)localObject, paramInt1);
        if (localObject != null)
          ((d.a)localObject).onActivityResult(paramInt1, paramInt2, paramIntent);
      }
      this.yHi.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }

  public final void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    this.yHf = (getActivity().getClass().getName() + "@" + hashCode() + " @talker:%s");
    hR(paramContext);
    this.cgL.a(com.tencent.mm.ui.chatting.c.b.g.class, this.yHh);
    this.cgL.a(k.class, this.yHi);
    Iterator localIterator = com.tencent.mm.ui.chatting.c.g.getComponents().iterator();
    while (localIterator.hasNext())
    {
      paramContext = (g.a)localIterator.next();
      this.cgL.a(paramContext.aIl, paramContext.dDK());
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.cgL.caA)
      this.yHi.onConfigurationChanged(paramConfiguration);
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramBundle = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    paramViewGroup = paramBundle.getLayoutParams();
    paramLayoutInflater = paramViewGroup;
    if (paramViewGroup == null)
      paramLayoutInflater = new ViewGroup.LayoutParams(-1, -1);
    paramBundle.setLayoutParams(paramLayoutInflater);
    return paramBundle;
  }

  public final void onDestroy()
  {
    super.onDestroy();
    ab.w("MicroMsg.BaseChattingUIFragment.Sys", "[onDestroy] activity:%s isForeground:%s isFinishing:%s", new Object[] { this.yHg, Boolean.valueOf(this.cgL.caA), Boolean.valueOf(isFinishing()) });
    dBJ();
  }

  public final void onDetach()
  {
    super.onDetach();
    dBL();
  }

  public void onEnterBegin()
  {
    d(128, new BaseChattingUIFragment.10(this));
  }

  public final void onEnterEnd()
  {
    d(256, new BaseChattingUIFragment.11(this));
  }

  public void onExitBegin()
  {
    d(512, new BaseChattingUIFragment.2(this));
  }

  public void onExitEnd()
  {
    d(1024, new BaseChattingUIFragment.3(this));
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return this.yHi.onKeyDown(paramInt, paramKeyEvent);
  }

  public final void onPause()
  {
    super.onPause();
    ab.w("MicroMsg.BaseChattingUIFragment.Sys", "[onPause] activity:%s isForeground:%s isFinishing:%s isExiting:%s", new Object[] { this.yHg, Boolean.valueOf(this.cgL.caA), Boolean.valueOf(isFinishing()), Boolean.valueOf(dBM()) });
    dBH();
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    this.yHi.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }

  public final void onResume()
  {
    super.onResume();
    ab.w("MicroMsg.BaseChattingUIFragment.Sys", "[onResume] activity:%s isForeground:%s isFinishing:%s", new Object[] { this.yHg, Boolean.valueOf(this.cgL.caA), Boolean.valueOf(isFinishing()) });
    dBG();
  }

  public final void onStart()
  {
    super.onStart();
    ab.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStart] activity:%s isForeground:%s isFinishing:%s", new Object[] { this.yHg, Boolean.valueOf(this.cgL.caA), Boolean.valueOf(isFinishing()) });
    dBF();
  }

  public final void onStop()
  {
    super.onStop();
    ab.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s isForeground:%s isFinishing:%s isEntering:%s", new Object[] { this.yHg, Boolean.valueOf(this.cgL.caA), Boolean.valueOf(isFinishing()), Boolean.valueOf(dBN()) });
    dBI();
  }

  public boolean supportNavigationSwipeBack()
  {
    boolean bool;
    if (this.isCurrentActivity)
      bool = false;
    while (true)
    {
      return bool;
      com.tencent.mm.kernel.g.RQ();
      if (com.tencent.mm.compatible.f.b.bD(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).cc))
      {
        ab.w("MicroMsg.BaseChattingUIFragment", "Running on a Chromebook, so we not support swipeback and so on");
        bool = false;
      }
      else
      {
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.BaseChattingUIFragment
 * JD-Core Version:    0.6.2
 */
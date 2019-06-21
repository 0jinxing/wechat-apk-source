package com.tencent.mm.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.contact.AddressUI.AddressUIFragment;
import com.tencent.mm.ui.mogic.WxViewPager;
import com.tencent.mm.x.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MainTabUI$TabsAdapter extends l
  implements ViewPager.OnPageChangeListener, c.a
{
  private AddressUI.AddressUIFragment addressFragment;
  private int clickCount;
  private boolean isTabClicked;
  boolean[] mFragmentResumedFlags;
  private final WxViewPager mViewPager;

  public MainTabUI$TabsAdapter(MainTabUI paramMainTabUI, FragmentActivity paramFragmentActivity, WxViewPager paramWxViewPager)
  {
    super(paramFragmentActivity.getSupportFragmentManager());
    AppMethodBeat.i(29620);
    this.isTabClicked = false;
    this.clickCount = 0;
    this.mFragmentResumedFlags = new boolean[] { 1, 0, 0, 0 };
    this.mViewPager = paramWxViewPager;
    this.mViewPager.setAdapter(this);
    this.mViewPager.setOnPageChangeListener(this);
    AppMethodBeat.o(29620);
  }

  private void fixAndroidOProgressBarOutScreenFlashProblem(int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(29623);
    Object localObject1;
    Object localObject2;
    if (paramInt2 == 0)
    {
      localObject1 = MainTabUI.dyH().values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Integer)((Iterator)localObject1).next();
        if (((Integer)localObject2).intValue() != paramInt1)
          setFragmentLoadingIconVisibility(((Integer)localObject2).intValue(), 8);
        else if (this.mFragmentResumedFlags[localObject2.intValue()] == 0)
          setFragmentLoadingIconVisibility(((Integer)localObject2).intValue(), 0);
      }
      AppMethodBeat.o(29623);
    }
    while (true)
    {
      return;
      localObject2 = MainTabUI.dyH().values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (Integer)((Iterator)localObject2).next();
        if ((((Integer)localObject1).intValue() != paramInt1) && (this.mFragmentResumedFlags[localObject1.intValue()] == 0))
          setFragmentLoadingIconVisibility(((Integer)localObject1).intValue(), 0);
      }
      AppMethodBeat.o(29623);
    }
  }

  private void reportSwitch(int paramInt)
  {
    AppMethodBeat.i(29626);
    ab.v("MicroMsg.LauncherUI.MainTabUI", "reportSwitch clickCount:%d, pos:%d", new Object[] { Integer.valueOf(this.clickCount), Integer.valueOf(paramInt) });
    if (this.clickCount > 0)
    {
      this.clickCount -= 1;
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      this.isTabClicked = false;
      AppMethodBeat.o(29626);
      return;
      h.pYm.X(10957, "1");
      continue;
      h.pYm.X(10957, "2");
      continue;
      h.pYm.X(10957, "3");
      continue;
      h.pYm.X(10957, "4");
      continue;
      switch (paramInt)
      {
      default:
        break;
      case 0:
        h.pYm.X(10957, "5");
        break;
      case 1:
        h.pYm.X(10957, "6");
        break;
      case 2:
        h.pYm.X(10957, "7");
      }
    }
  }

  private void setFragmentLoadingIconVisibility(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(29624);
    if ((this.this$0.Nn(paramInt1) != null) && (this.this$0.Nn(paramInt1).getActivity() != null))
    {
      View localView = this.this$0.Nn(paramInt1).findViewById(2131823316);
      if (localView != null)
        localView.setVisibility(paramInt2);
    }
    AppMethodBeat.o(29624);
  }

  public int getCount()
  {
    return 4;
  }

  public Fragment getItem(int paramInt)
  {
    AppMethodBeat.i(29621);
    MMFragment localMMFragment = this.this$0.Nn(paramInt);
    AppMethodBeat.o(29621);
    return localMMFragment;
  }

  public void onPageScrollStateChanged(int paramInt)
  {
    AppMethodBeat.i(29627);
    ab.d("MicroMsg.LauncherUI.MainTabUI", "onPageScrollStateChanged state %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == 0) && (this.addressFragment != null))
    {
      this.addressFragment.qA(true);
      this.addressFragment = null;
    }
    if (MainTabUI.d(this.this$0) != null)
      MainTabUI.d(this.this$0).MV(paramInt);
    AppMethodBeat.o(29627);
  }

  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(29622);
    w localw = MainTabUI.c(this.this$0);
    if (localw.ynT != null)
      localw.ynT.l(paramInt1, paramFloat);
    if (MainTabUI.d(this.this$0) != null)
      MainTabUI.d(this.this$0).p(paramInt1, paramFloat);
    if (0.0F != paramFloat)
    {
      if (this.addressFragment == null)
        this.addressFragment = ((AddressUI.AddressUIFragment)this.this$0.Nn(1));
      this.addressFragment.qA(false);
    }
    while (true)
    {
      fixAndroidOProgressBarOutScreenFlashProblem(paramInt1, paramFloat, paramInt2);
      AppMethodBeat.o(29622);
      return;
      ab.v("MicroMsg.LauncherUI.MainTabUI", "onPageScrolled, position = %d, mLastIndex = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(MainTabUI.e(this.this$0)) });
      if (-1 == MainTabUI.e(this.this$0))
      {
        this.this$0.hc(MainTabUI.e(this.this$0), MainTabUI.f(this.this$0));
        this.this$0.Nk(paramInt1);
      }
      else
      {
        al.d(new MainTabUI.TabsAdapter.1(this, paramInt1));
      }
    }
  }

  public void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(29625);
    ab.d("MicroMsg.LauncherUI.MainTabUI", "on page selected changed to %d", new Object[] { Integer.valueOf(paramInt) });
    reportSwitch(paramInt);
    MainTabUI.a(this.this$0, MainTabUI.f(this.this$0));
    MainTabUI.b(this.this$0, paramInt);
    MainTabUI.c(this.this$0).Np(paramInt);
    MainTabUI.g(this.this$0).supportInvalidateOptionsMenu();
    if ((MainTabUI.e(this.this$0) == 1) && (MainTabUI.f(this.this$0) != 1))
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(340226, Long.valueOf(System.currentTimeMillis()));
    }
    if (MainTabUI.f(this.this$0) == 1)
    {
      long l = System.currentTimeMillis();
      aw.ZK();
      if (l - ah.d((Long)com.tencent.mm.model.c.Ry().get(340226, null)) >= 180000L)
        ((AddressUI.AddressUIFragment)this.this$0.Nn(MainTabUI.f(this.this$0))).dHB();
    }
    if (MainTabUI.f(this.this$0) == 0)
      aw.getNotification().bv(true);
    while (true)
    {
      if (MainTabUI.d(this.this$0) != null)
        MainTabUI.d(this.this$0).MU(MainTabUI.f(this.this$0));
      AppMethodBeat.o(29625);
      return;
      aw.getNotification().bv(false);
    }
  }

  public void onTabClick(int paramInt)
  {
    AppMethodBeat.i(29628);
    if (!MainTabUI.a(this.this$0))
    {
      ab.i("MicroMsg.LauncherUI.MainTabUI", "alvinluo now cannot change tab");
      AppMethodBeat.o(29628);
    }
    Object localObject;
    while (true)
    {
      return;
      if (paramInt != MainTabUI.f(this.this$0))
        break;
      ab.d("MicroMsg.LauncherUI.MainTabUI", "on click same index");
      localObject = this.this$0.Nn(paramInt);
      if ((localObject instanceof AbstractTabChildActivity.AbStractTabFragment))
        ((AbstractTabChildActivity.AbStractTabFragment)localObject).dwe();
      AppMethodBeat.o(29628);
    }
    this.isTabClicked = true;
    this.clickCount += 1;
    ab.v("MicroMsg.LauncherUI.MainTabUI", "onTabClick count:%d", new Object[] { Integer.valueOf(this.clickCount) });
    this.mViewPager.setCurrentItem(paramInt, false);
    if (paramInt == 3)
    {
      com.tencent.mm.x.c.PK().bZ(262145, 266241);
      com.tencent.mm.x.c.PK().bZ(262156, 266241);
      com.tencent.mm.x.c.PK().bZ(262147, 266241);
      com.tencent.mm.x.c.PK().bZ(262149, 266241);
      com.tencent.mm.x.c.PK().b(ac.a.xUP, 266241);
      com.tencent.mm.x.c.PK().c(ac.a.xUi, ac.a.xUp);
      boolean bool = com.tencent.mm.x.c.PK().bY(262156, 266241);
      localObject = h.pYm;
      if (!bool)
        break label301;
    }
    label301: for (paramInt = 1; ; paramInt = 0)
    {
      ((h)localObject).e(14872, new Object[] { Integer.valueOf(6), Integer.valueOf(paramInt), "", "", Integer.valueOf(0) });
      g.RQ();
      g.RP().Ry().set(ac.a.xUc, Boolean.FALSE);
      AppMethodBeat.o(29628);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MainTabUI.TabsAdapter
 * JD-Core Version:    0.6.2
 */
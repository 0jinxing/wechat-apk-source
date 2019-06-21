package com.tencent.mm.plugin.sns.ui;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.Map;

final class SnsAdNativeLandingPagesUI$14 extends ViewPager.f
{
  SnsAdNativeLandingPagesUI$14(SnsAdNativeLandingPagesUI paramSnsAdNativeLandingPagesUI)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    AppMethodBeat.i(38645);
    super.onPageScrollStateChanged(paramInt);
    SnsAdNativeLandingPagesUI.i(this.roM).rdl = paramInt;
    Object localObject;
    if (paramInt == 1)
    {
      for (paramInt = 0; paramInt < this.roM.rnM.size(); paramInt++)
      {
        localObject = (g)this.roM.rnM.get(paramInt);
        localObject = (Fragment)SnsAdNativeLandingPagesUI.j(this.roM).get(Integer.valueOf(((g)localObject).id));
        if (localObject != null)
          ((ContentFragment)localObject).cqe();
      }
      ad.eQ(this.roM.mController.ylL);
      AppMethodBeat.o(38645);
    }
    while (true)
    {
      return;
      if (paramInt == 0)
      {
        localObject = (Fragment)SnsAdNativeLandingPagesUI.j(this.roM).get(Integer.valueOf(((g)this.roM.rnM.get(SnsAdNativeLandingPagesUI.a(this.roM).getCurrentItem())).id));
        if (localObject != null)
          ((ContentFragment)localObject).cqd();
      }
      AppMethodBeat.o(38645);
    }
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(38644);
    super.onPageScrolled(paramInt1, paramFloat, paramInt2);
    if (SnsAdNativeLandingPagesUI.i(this.roM) != null)
    {
      ContentFragment localContentFragment = SnsAdNativeLandingPagesUI.i(this.roM);
      if ((localContentFragment.caA) && (localContentFragment.rdb != null))
        localContentFragment.rdb.cpX();
    }
    if (this.roM.mController.ymc == 1)
      this.roM.aqX();
    AppMethodBeat.o(38644);
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(38646);
    super.onPageSelected(paramInt);
    int i = 0;
    if (i < this.roM.rnM.size())
    {
      Object localObject = (g)this.roM.rnM.get(i);
      localObject = (Fragment)SnsAdNativeLandingPagesUI.j(this.roM).get(Integer.valueOf(((g)localObject).id));
      if (localObject != null)
      {
        if (i != paramInt)
          break label86;
        ((ContentFragment)localObject).cqd();
      }
      while (true)
      {
        i++;
        break;
        label86: ((ContentFragment)localObject).cqe();
      }
    }
    AppMethodBeat.o(38646);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.14
 * JD-Core Version:    0.6.2
 */
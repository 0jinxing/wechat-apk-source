package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.m;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.q;
import com.tencent.mm.plugin.appbrand.appusage.r;
import com.tencent.mm.plugin.appbrand.appusage.r.d;
import com.tencent.mm.plugin.appbrand.o.a;
import com.tencent.mm.plugin.appbrand.ui.recents.o;
import com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandLauncherRecommendList;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import java.util.Locale;

@com.tencent.mm.kernel.i
public final class AppBrandLauncherUI extends MMActivity
  implements com.tencent.mm.plugin.appbrand.ui.a.b
{
  public static final int iGI = com.tencent.mm.plugin.appbrand.aa.gQs;
  private int cDB;
  private int iGJ = -1;
  private boolean iGK;
  private o iGL;
  public r.d iGM;

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(132980);
    boolean bool;
    if (isFinishing())
    {
      bool = false;
      AppMethodBeat.o(132980);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(132980);
    }
  }

  public final void eE(boolean paramBoolean)
  {
    AppMethodBeat.i(132977);
    if (this.iGL != null)
      this.iGL.eE(paramBoolean);
    if ((paramBoolean) && (this.iGM != null))
      this.iGM.haa[4] = "1";
    AppMethodBeat.o(132977);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(132983);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.iGJ = paramInt1;
    if ((paramInt2 == -1) && (paramInt1 == 1))
    {
      String str = paramIntent.getStringExtra("key_session_id");
      paramInt1 = paramIntent.getIntExtra("ftsbizscene", 0);
      ab.i("MicroMsg.AppBrandLauncherUI", "onActivityResult oreh report weAppSearchClickStream(13929) statSessionId:%s, StatKeyWordId:%s", new Object[] { str, com.tencent.mm.modelappbrand.b.fpE });
      h.pYm.e(13929, new Object[] { str, com.tencent.mm.modelappbrand.b.fpE, Integer.valueOf(2), Integer.valueOf(paramInt1) });
    }
    AppMethodBeat.o(132983);
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(132986);
    finish();
    AppMethodBeat.o(132986);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(132979);
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      AppMethodBeat.o(132979);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.appbrand.appusage.i.axb())
        break;
      finish();
      AppMethodBeat.o(132979);
    }
    this.cDB = getIntent().getIntExtra("extra_enter_scene", -1);
    overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
    this.iGK = getIntent().getBooleanExtra("extra_show_recommend", false);
    boolean bool1 = getIntent().getBooleanExtra("extra_show_recents_from_task_bar", false);
    boolean bool2 = com.tencent.mm.plugin.appbrand.ui.recommend.c.aNF();
    setTitleBarDoubleClickListener(new AppBrandLauncherUI.1(this));
    setMMTitle(getResources().getString(2131296613));
    setBackBtn(new AppBrandLauncherUI.2(this), 2131230737);
    if (a.aLC())
      addIconOptionMenu(a.iGR.ordinal(), 2131304082, 2131230741, new AppBrandLauncherUI.3(this), null);
    xE(-855310);
    findViewById(16908290).setBackgroundColor(-855310);
    ab.i("MicroMsg.AppBrandLauncherUI", "mShowRecommend:%b, recommendDataState:%b", new Object[] { Boolean.valueOf(this.iGK), Boolean.valueOf(bool2) });
    if ((this.iGK) && (bool2) && (!bool1))
      getSupportFragmentManager().beginTransaction().b(16908290, new AppBrandLauncherRecommendList()).commit();
    Object localObject;
    while (true)
    {
      h.pYm.a(465L, 0L, 1L, false);
      if (a.aLC())
        break label339;
      ab.i("MicroMsg.AppBrandSearchLogic", "do not need to update search input hint, shouldShowSearchEntrance is false");
      com.tencent.mm.cj.c.aNX();
      if (r.axv())
        this.iGM = new r.d();
      r.axx();
      com.tencent.mm.plugin.appbrand.appusage.i.axc();
      AppMethodBeat.o(132979);
      break;
      localObject = getLifecycle();
      paramBundle = new o(this);
      this.iGL = paramBundle;
      ((Lifecycle)localObject).addObserver(paramBundle);
    }
    label339: long l1 = System.currentTimeMillis();
    paramBundle = g.RP().Ry().get(ac.a.xQi, null);
    if ((paramBundle != null) && ((paramBundle instanceof Long)));
    for (long l2 = ((Long)paramBundle).longValue(); ; l2 = 0L)
    {
      paramBundle = Locale.getDefault().getLanguage();
      localObject = g.RP().Ry().get(ac.a.xQf, null);
      if ((l1 - l2 >= 3600000L) || (localObject == null) || (!localObject.equals(paramBundle)))
        g.RO().eJo.a(new com.tencent.mm.plugin.appbrand.k.b(), 0);
      ab.v("MicroMsg.AppBrandSearchLogic", "tryToUpdateSearchInputHint, lang(o : %s, c : %s), lastUpdateTime(o : %s, c : %s)", new Object[] { localObject, paramBundle, Long.valueOf(l2), Long.valueOf(l1) });
      break;
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(132978);
    super.onCreateBeforeSetContentView();
    getWindow().setSoftInputMode(3);
    AppMethodBeat.o(132978);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(132982);
    super.onDestroy();
    q.clearData();
    if (this.iGM != null)
    {
      r.d locald = this.iGM;
      h.pYm.e(14113, (Object[])locald.haa);
      this.iGM = null;
    }
    AppMethodBeat.o(132982);
  }

  public final void onResume()
  {
    AppMethodBeat.i(132981);
    int i;
    if (this.iGJ > 0)
    {
      if (this.iGJ != 1)
        break label74;
      i = 7;
    }
    while (true)
    {
      this.iGJ = 0;
      Object localObject = (AppBrandLauncherUI.Fragment)super.getSupportFragmentManager().findFragmentById(16908290);
      if (localObject != null)
        ((AppBrandLauncherUI.Fragment)localObject).setScene(i);
      super.onResume();
      localObject = com.tencent.mm.modelappbrand.b.abv();
      com.tencent.mm.plugin.websearch.api.aa.adH((String)localObject);
      com.tencent.mm.plugin.websearch.api.aa.adI((String)localObject);
      AppMethodBeat.o(132981);
      return;
      label74: if (this.iGJ == 2)
        i = 6;
      else if (this.iGJ == 3)
        i = 9;
      else if (this.iGJ == 4)
        i = 12;
      else
        i = 4;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void setTitle(int paramInt)
  {
    AppMethodBeat.i(132985);
    setMMTitle(paramInt);
    AppMethodBeat.o(132985);
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(132984);
    M(paramCharSequence);
    AppMethodBeat.o(132984);
  }

  static enum a
  {
    static
    {
      AppMethodBeat.i(132976);
      iGR = new a("WebSearch", 0);
      iGS = new a("StarList", 1);
      iGT = new a[] { iGR, iGS };
      AppMethodBeat.o(132976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI
 * JD-Core Version:    0.6.2
 */
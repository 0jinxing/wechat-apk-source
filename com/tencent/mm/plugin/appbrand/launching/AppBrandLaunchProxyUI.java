package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.i;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.launching.precondition.c;
import com.tencent.mm.plugin.appbrand.launching.precondition.e;
import com.tencent.mm.plugin.appbrand.launching.precondition.f;
import com.tencent.mm.plugin.appbrand.launching.precondition.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

@i
@com.tencent.mm.ui.base.a(7)
public final class AppBrandLaunchProxyUI extends MMBaseActivity
  implements o
{
  private p ifC;
  private g ifD;
  private MMActivity.a ifE = null;

  public static boolean D(Intent paramIntent)
  {
    AppMethodBeat.i(131706);
    if (paramIntent != null);
    try
    {
      if ((paramIntent.getComponent() != null) && (paramIntent.getComponent().getShortClassName().equals(".plugin.appbrand.launching.AppBrandLaunchProxyUI")))
      {
        bool = true;
        AppMethodBeat.o(131706);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(131706);
        bool = false;
      }
    }
    catch (Exception paramIntent)
    {
      while (true)
      {
        AppMethodBeat.o(131706);
        boolean bool = false;
      }
    }
  }

  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional)
  {
    AppMethodBeat.i(131707);
    a(paramContext, paramString1, null, paramString2, paramInt1, paramInt2, paramAppBrandStatObject, paramAppBrandLaunchReferrer, paramLaunchParamsOptional);
    AppMethodBeat.o(131707);
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional)
  {
    AppMethodBeat.i(131708);
    boolean bool;
    if ((bo.isNullOrNil(paramString1)) && (bo.isNullOrNil(paramString2)))
    {
      bool = false;
      AppMethodBeat.o(131708);
    }
    while (true)
    {
      return bool;
      bool = f.ijT.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, paramAppBrandLaunchReferrer, paramLaunchParamsOptional);
      AppMethodBeat.o(131708);
    }
  }

  public final void a(MMActivity.a parama, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(131714);
    this.ifE = parama;
    startActivityForResult(paramIntent, paramInt);
    AppMethodBeat.o(131714);
  }

  public final boolean aHa()
  {
    AppMethodBeat.i(131716);
    boolean bool;
    if (!isFinishing())
    {
      bool = true;
      AppMethodBeat.o(131716);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(131716);
    }
  }

  public final void finish()
  {
    AppMethodBeat.i(131713);
    super.finish();
    ab.i("MicroMsg.AppBrandLaunchProxyUI", "finish");
    AppMethodBeat.o(131713);
  }

  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131715);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.ifE != null)
      this.ifE.c(paramInt1, paramInt2, paramIntent);
    this.ifE = null;
    AppMethodBeat.o(131715);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(131709);
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      AppMethodBeat.o(131709);
    }
    while (true)
    {
      return;
      paramBundle = getIntent();
      if (!paramBundle.getBooleanExtra("extra_from_mm", true))
        paramBundle = new c(this);
      while (true)
      {
        this.ifD = paramBundle;
        if (this.ifD == null)
          break label269;
        ab.i("MicroMsg.AppBrandLaunchProxyUI", "onCreate, uiDelegate %s", new Object[] { this.ifD.getClass().getSimpleName() });
        this.ifD.E(getIntent());
        if ((isFinishing()) || (!this.ifD.aHO()))
          break label273;
        getString(2131297061);
        this.ifC = h.b(this, getString(2131300968), true, new AppBrandLaunchProxyUI.1(this));
        if (this.ifC != null)
          break label209;
        ab.e("MicroMsg.AppBrandLaunchProxyUI", "onCreate, get null progress dialog");
        finish();
        AppMethodBeat.o(131709);
        break;
        if (paramBundle.getBooleanExtra("extra_launch_weishi_video", false))
          paramBundle = new com.tencent.mm.plugin.appbrand.weishi.a(this);
        else
          paramBundle = new e(this);
      }
      label209: this.ifC.setOnDismissListener(new AppBrandLaunchProxyUI.2(this));
      if (this.ifC.getWindow() != null)
      {
        paramBundle = this.ifC.getWindow().getAttributes();
        paramBundle.dimAmount = 0.0F;
        this.ifC.getWindow().setAttributes(paramBundle);
        AppMethodBeat.o(131709);
        continue;
        label269: finish();
      }
      else
      {
        label273: AppMethodBeat.o(131709);
      }
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(131712);
    super.onDestroy();
    ab.i("MicroMsg.AppBrandLaunchProxyUI", "onDestroy");
    if (this.ifC != null)
    {
      this.ifC.dismiss();
      this.ifC = null;
    }
    if (this.ifD != null)
      this.ifD.onDestroy();
    AppMethodBeat.o(131712);
  }

  public final void onPause()
  {
    AppMethodBeat.i(131711);
    super.onPause();
    ab.i("MicroMsg.AppBrandLaunchProxyUI", "onPause");
    if (this.ifD != null)
    {
      this.ifD.onPause();
      AppMethodBeat.o(131711);
    }
    while (true)
    {
      return;
      super.finish();
      AppMethodBeat.o(131711);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(131710);
    super.onResume();
    ab.i("MicroMsg.AppBrandLaunchProxyUI", "onResume");
    if (this.ifD != null)
    {
      this.ifD.onResume();
      AppMethodBeat.o(131710);
    }
    while (true)
    {
      return;
      super.finish();
      AppMethodBeat.o(131710);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI
 * JD-Core Version:    0.6.2
 */
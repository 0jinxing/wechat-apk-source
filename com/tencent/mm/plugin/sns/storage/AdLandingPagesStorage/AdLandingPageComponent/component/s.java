package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ce.a;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class s extends k
{
  public s(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k paramk, ViewGroup paramViewGroup)
  {
    super(paramContext, paramk, paramViewGroup);
  }

  protected final void e(Button paramButton)
  {
    AppMethodBeat.i(37237);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k localk = cpI();
    if (g.u(this.context, localk.qWm))
    {
      paramButton.setOnClickListener(new s.1(this, localk));
      AppMethodBeat.o(37237);
    }
    while (true)
    {
      return;
      super.e(paramButton);
      AppMethodBeat.o(37237);
    }
  }

  public final boolean v(Context paramContext, String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(37238);
    if ((paramContext == null) || (TextUtils.isEmpty(paramString1)))
      AppMethodBeat.o(37238);
    while (true)
    {
      return bool;
      try
      {
        Intent localIntent = paramContext.getPackageManager().getLaunchIntentForPackage(paramString1);
        if (localIntent != null)
        {
          paramString1 = paramContext;
          if (!(paramContext instanceof Activity))
            paramString1 = this.context;
          paramContext = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/s$2;
          paramContext.<init>(this, paramString1, localIntent, paramString2);
          a.post(paramContext);
          bool = true;
          AppMethodBeat.o(37238);
        }
      }
      catch (Exception paramContext)
      {
        ab.e("AdLandingPageOpenAppBtnComp", bo.l(paramContext));
        AppMethodBeat.o(37238);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s
 * JD-Core Version:    0.6.2
 */
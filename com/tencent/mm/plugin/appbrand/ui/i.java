package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.s;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.weishi.d;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.ui.MMFragmentActivity.a;

public final class i
  implements u
{
  public static boolean D(com.tencent.mm.plugin.appbrand.i parami)
  {
    boolean bool = false;
    AppMethodBeat.i(133162);
    if ((parami instanceof o))
    {
      parami = (o)parami;
      if ((parami.atD()) || (parami.ya().bQn.scene == 1099))
      {
        bool = true;
        AppMethodBeat.o(133162);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(133162);
      continue;
      AppMethodBeat.o(133162);
    }
  }

  private static int a(AppBrandStatObject paramAppBrandStatObject)
  {
    if (paramAppBrandStatObject == null);
    for (int i = 0; ; i = paramAppBrandStatObject.scene)
      return i;
  }

  private static void a(com.tencent.mm.plugin.appbrand.i parami, int paramInt, Runnable paramRunnable)
  {
    AppMethodBeat.i(133161);
    if (!s.as(parami.gNE))
    {
      parami.gNE.setWillNotDraw(true);
      parami.gNE.post(new i.1(parami, paramInt, paramRunnable));
      AppMethodBeat.o(133161);
    }
    while (true)
    {
      return;
      Animation localAnimation = AnimationUtils.loadAnimation(parami.getContext(), paramInt);
      localAnimation.setAnimationListener(new i.2(paramRunnable, parami));
      parami.gNE.startAnimation(localAnimation);
      AppMethodBeat.o(133161);
    }
  }

  public final void a(Activity paramActivity, AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(133157);
    if ((paramActivity == null) || (paramActivity.getIntent() == null))
      AppMethodBeat.o(133157);
    while (true)
    {
      return;
      if (!(paramAppBrandInitConfig instanceof AppBrandInitConfigWC))
      {
        AppMethodBeat.o(133157);
      }
      else
      {
        AppBrandStatObject localAppBrandStatObject = ((AppBrandInitConfigWC)paramAppBrandInitConfig).bQn;
        try
        {
          boolean bool = k.a(paramActivity, paramAppBrandInitConfig, localAppBrandStatObject);
          if (bool)
            AppMethodBeat.o(133157);
        }
        catch (Throwable localThrowable)
        {
          if (d.b(paramActivity, paramAppBrandInitConfig))
          {
            AppMethodBeat.o(133157);
          }
          else
          {
            if (a(localAppBrandStatObject) == 1023)
            {
              i = 1;
              label97: if (i == 0)
                if ((a(localAppBrandStatObject) != 1113) && (a(localAppBrandStatObject) != 1114))
                  break label152;
            }
            label152: for (int i = 1; ; i = 0)
            {
              if (i == 0)
                break label158;
              paramActivity.overridePendingTransition(2131034143, 2131034130);
              AppMethodBeat.o(133157);
              break;
              i = 0;
              break label97;
            }
            label158: if (1024 == a(localAppBrandStatObject))
              if (localAppBrandStatObject == null)
              {
                i = 0;
                label175: if (6 != i)
                  break label217;
              }
            label217: for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label223;
              paramActivity.overridePendingTransition(MMFragmentActivity.a.yne, MMFragmentActivity.a.ynf);
              AppMethodBeat.o(133157);
              break;
              i = localAppBrandStatObject.cOq;
              break label175;
            }
            label223: paramAppBrandInitConfig = paramActivity.getIntent();
            if ((paramAppBrandInitConfig != null) && (paramAppBrandInitConfig.getBooleanExtra("key_appbrand_bring_ui_to_front_from_task_Base_by_task_top_ui", false)));
            for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label272;
              paramActivity.overridePendingTransition(2131034143, 2131034130);
              AppMethodBeat.o(133157);
              break;
            }
            label272: if (1090 == a(localAppBrandStatObject))
            {
              paramActivity.overridePendingTransition(2131034144, 2131034142);
              AppMethodBeat.o(133157);
            }
            else
            {
              paramActivity.overridePendingTransition(2131034143, 2131034142);
              AppMethodBeat.o(133157);
            }
          }
        }
      }
    }
  }

  public final void a(com.tencent.mm.plugin.appbrand.i parami1, com.tencent.mm.plugin.appbrand.i parami2)
  {
    AppMethodBeat.i(133159);
    if (parami1 == null)
    {
      AppMethodBeat.o(133159);
      return;
    }
    if (D(parami1))
    {
      i = MMFragmentActivity.a.ync;
      label26: a(parami1, i, null);
      if (parami2 != null)
        if (!D(parami1))
          break label67;
    }
    label67: for (int i = MMFragmentActivity.a.ynd; ; i = 2131034130)
    {
      a(parami2, i, null);
      AppMethodBeat.o(133159);
      break;
      i = 2131034143;
      break label26;
    }
  }

  public final void a(com.tencent.mm.plugin.appbrand.i parami1, com.tencent.mm.plugin.appbrand.i parami2, Runnable paramRunnable)
  {
    AppMethodBeat.i(133160);
    if (parami2 == null)
    {
      AppMethodBeat.o(133160);
      return;
    }
    if (D(parami2))
    {
      i = MMFragmentActivity.a.ynf;
      label27: a(parami2, i, paramRunnable);
      if (parami1 != null)
        if (!D(parami2))
          break label72;
    }
    label72: for (int i = MMFragmentActivity.a.yne; ; i = 2131034130)
    {
      a(parami1, i, null);
      AppMethodBeat.o(133160);
      break;
      i = 2131034141;
      break label27;
    }
  }

  public final void k(Activity paramActivity)
  {
    AppMethodBeat.i(133158);
    paramActivity.overridePendingTransition(2131034140, 2131034141);
    AppMethodBeat.o(133158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.i
 * JD-Core Version:    0.6.2
 */
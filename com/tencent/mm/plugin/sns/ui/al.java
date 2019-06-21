package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.aa;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.y;

public final class al
{
  public static h a(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r paramr, ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(38606);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramr != null);
    switch (paramr.type)
    {
    default:
      com.tencent.mm.sdk.platformtools.ab.i("SnsAdNativeLandingPagesLayoutHelper", "unknown comp type " + paramr.type);
      localObject2 = localObject1;
      if (localObject2 != null)
      {
        AppMethodBeat.o(38606);
        paramContext = (Context)localObject2;
      }
      break;
    case 102:
    case 21:
    case 104:
    case 105:
    case 82:
    case 132:
    case 101:
    case 103:
    case 41:
    }
    while (true)
    {
      return paramContext;
      localObject2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)paramr, paramViewGroup);
      break;
      if (paramr.cuu == 2)
      {
        paramContext = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)paramr, paramViewGroup);
        AppMethodBeat.o(38606);
      }
      else if (paramr.cuu == 6)
      {
        paramContext = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)paramr, paramViewGroup);
        AppMethodBeat.o(38606);
      }
      else
      {
        localObject2 = localObject1;
        if (paramr.cuu != 7)
          break;
        paramContext = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t(paramContext, (j)paramr, paramViewGroup);
        AppMethodBeat.o(38606);
        continue;
        localObject2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q)paramr, paramViewGroup);
        break;
        localObject2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p)paramr, paramViewGroup);
        break;
        localObject2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g(paramContext, paramr, paramViewGroup);
        break;
        localObject2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ab)paramr, paramViewGroup);
        break;
        localObject2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x)paramr, paramViewGroup);
        break;
        localObject2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s)paramr, paramViewGroup);
        break;
        switch (paramr.cuu)
        {
        default:
          localObject2 = localObject1;
          break;
        case 0:
          localObject2 = new w(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)paramr, paramViewGroup);
          break;
        case 1:
          localObject2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)paramr, paramViewGroup);
          break;
          if ((paramr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u))
          {
            paramContext = new aa(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u)paramr, paramViewGroup);
            paramContext.setBackgroundColor(paramInt);
            AppMethodBeat.o(38606);
          }
          else if ((paramr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k))
          {
            paramContext = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)paramr, paramViewGroup);
            paramContext.setBackgroundColor(paramInt);
            AppMethodBeat.o(38606);
          }
          else if ((paramr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n))
          {
            paramContext = new w(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)paramr, paramViewGroup);
            AppMethodBeat.o(38606);
          }
          else if ((paramr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m))
          {
            paramContext = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m)paramr, paramViewGroup);
            AppMethodBeat.o(38606);
          }
          else if ((paramr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o))
          {
            paramContext = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)paramr, paramViewGroup);
            AppMethodBeat.o(38606);
          }
          else
          {
            if ((paramr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z))
            {
              paramr = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z)paramr;
              if (AdLandingPagesProxy.getInstance().getStreamVideoPlayerConfig() > 0)
                com.tencent.mm.sdk.platformtools.ab.i("SnsAdNativeLandingPagesLayoutHelper", "use new stream video player component");
              for (paramContext = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z(paramContext, paramr, paramViewGroup); ; paramContext = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r(paramContext, paramr, paramViewGroup))
              {
                AppMethodBeat.o(38606);
                break;
              }
            }
            if ((paramr instanceof y))
            {
              paramContext = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p(paramContext, (y)paramr, paramViewGroup);
              AppMethodBeat.o(38606);
            }
            else if ((paramr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g))
            {
              paramContext = new f(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g)paramr, paramViewGroup);
              AppMethodBeat.o(38606);
            }
            else if ((paramr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d))
            {
              paramContext = new c(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)paramr, paramViewGroup);
              AppMethodBeat.o(38606);
            }
            else if ((paramr instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t))
            {
              paramContext = new v(paramContext, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t)paramr, paramViewGroup);
              AppMethodBeat.o(38606);
            }
            else
            {
              paramContext = new h(paramContext, paramr, paramViewGroup);
              AppMethodBeat.o(38606);
            }
          }
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.al
 * JD-Core Version:    0.6.2
 */
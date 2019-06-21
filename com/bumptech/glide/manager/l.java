package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.i;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class l
  implements Handler.Callback
{
  private static final a aGQ;
  private volatile com.bumptech.glide.j aGJ;
  final Map<FragmentManager, k> aGK;
  final Map<i, SupportRequestManagerFragment> aGL;
  private final a aGM;
  private final android.support.v4.f.a<View, android.support.v4.app.Fragment> aGN;
  private final android.support.v4.f.a<View, android.app.Fragment> aGO;
  private final Bundle aGP;
  private final Handler handler;

  static
  {
    AppMethodBeat.i(92407);
    aGQ = new l.1();
    AppMethodBeat.o(92407);
  }

  public l(a parama)
  {
    AppMethodBeat.i(92395);
    this.aGK = new HashMap();
    this.aGL = new HashMap();
    this.aGN = new android.support.v4.f.a();
    this.aGO = new android.support.v4.f.a();
    this.aGP = new Bundle();
    if (parama != null);
    while (true)
    {
      this.aGM = parama;
      this.handler = new Handler(Looper.getMainLooper(), this);
      AppMethodBeat.o(92395);
      return;
      parama = aGQ;
    }
  }

  @Deprecated
  private com.bumptech.glide.j a(Context paramContext, FragmentManager paramFragmentManager, boolean paramBoolean)
  {
    AppMethodBeat.i(92402);
    k localk = a(paramFragmentManager, paramBoolean);
    com.bumptech.glide.j localj = localk.awX;
    paramFragmentManager = localj;
    if (localj == null)
    {
      paramFragmentManager = c.ae(paramContext);
      paramFragmentManager = this.aGM.a(paramFragmentManager, localk.aGD, localk.aGE, paramContext);
      localk.awX = paramFragmentManager;
    }
    AppMethodBeat.o(92402);
    return paramFragmentManager;
  }

  private com.bumptech.glide.j a(Context paramContext, i parami, boolean paramBoolean)
  {
    AppMethodBeat.i(92405);
    SupportRequestManagerFragment localSupportRequestManagerFragment = a(parami, paramBoolean);
    com.bumptech.glide.j localj = localSupportRequestManagerFragment.awX;
    parami = localj;
    if (localj == null)
    {
      parami = c.ae(paramContext);
      parami = this.aGM.a(parami, localSupportRequestManagerFragment.aGD, localSupportRequestManagerFragment.aGE, paramContext);
      localSupportRequestManagerFragment.awX = parami;
    }
    AppMethodBeat.o(92405);
    return parami;
  }

  private com.bumptech.glide.j a(FragmentActivity paramFragmentActivity)
  {
    AppMethodBeat.i(92398);
    if (com.bumptech.glide.h.j.oo())
    {
      paramFragmentActivity = ah(paramFragmentActivity.getApplicationContext());
      AppMethodBeat.o(92398);
    }
    while (true)
    {
      return paramFragmentActivity;
      i(paramFragmentActivity);
      paramFragmentActivity = a(paramFragmentActivity, paramFragmentActivity.getSupportFragmentManager(), j(paramFragmentActivity));
      AppMethodBeat.o(92398);
    }
  }

  private com.bumptech.glide.j ag(Context paramContext)
  {
    AppMethodBeat.i(92396);
    if (this.aGJ == null);
    try
    {
      if (this.aGJ == null)
      {
        c localc = c.ae(paramContext.getApplicationContext());
        a locala = this.aGM;
        b localb = new com/bumptech/glide/manager/b;
        localb.<init>();
        g localg = new com/bumptech/glide/manager/g;
        localg.<init>();
        this.aGJ = locala.a(localc, localb, localg, paramContext.getApplicationContext());
      }
      paramContext = this.aGJ;
      AppMethodBeat.o(92396);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(92396);
    }
    throw paramContext;
  }

  private com.bumptech.glide.j h(Activity paramActivity)
  {
    AppMethodBeat.i(92399);
    if (com.bumptech.glide.h.j.oo())
    {
      paramActivity = ah(paramActivity.getApplicationContext());
      AppMethodBeat.o(92399);
    }
    while (true)
    {
      return paramActivity;
      i(paramActivity);
      paramActivity = a(paramActivity, paramActivity.getFragmentManager(), j(paramActivity));
      AppMethodBeat.o(92399);
    }
  }

  @TargetApi(17)
  private static void i(Activity paramActivity)
  {
    AppMethodBeat.i(92400);
    if ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed()))
    {
      paramActivity = new IllegalArgumentException("You cannot start a load for a destroyed activity");
      AppMethodBeat.o(92400);
      throw paramActivity;
    }
    AppMethodBeat.o(92400);
  }

  static boolean j(Activity paramActivity)
  {
    AppMethodBeat.i(92403);
    boolean bool;
    if (!paramActivity.isFinishing())
    {
      bool = true;
      AppMethodBeat.o(92403);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92403);
    }
  }

  final SupportRequestManagerFragment a(i parami, boolean paramBoolean)
  {
    AppMethodBeat.i(92404);
    SupportRequestManagerFragment localSupportRequestManagerFragment1 = (SupportRequestManagerFragment)parami.findFragmentByTag("com.bumptech.glide.manager");
    SupportRequestManagerFragment localSupportRequestManagerFragment2 = localSupportRequestManagerFragment1;
    if (localSupportRequestManagerFragment1 == null)
    {
      localSupportRequestManagerFragment1 = (SupportRequestManagerFragment)this.aGL.get(parami);
      localSupportRequestManagerFragment2 = localSupportRequestManagerFragment1;
      if (localSupportRequestManagerFragment1 == null)
      {
        localSupportRequestManagerFragment2 = new SupportRequestManagerFragment();
        localSupportRequestManagerFragment2.aGU = null;
        if (paramBoolean)
          localSupportRequestManagerFragment2.aGD.onStart();
        this.aGL.put(parami, localSupportRequestManagerFragment2);
        parami.beginTransaction().a(localSupportRequestManagerFragment2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.handler.obtainMessage(2, parami).sendToTarget();
      }
    }
    AppMethodBeat.o(92404);
    return localSupportRequestManagerFragment2;
  }

  final k a(FragmentManager paramFragmentManager, boolean paramBoolean)
  {
    AppMethodBeat.i(92401);
    k localk1 = (k)paramFragmentManager.findFragmentByTag("com.bumptech.glide.manager");
    k localk2 = localk1;
    if (localk1 == null)
    {
      localk1 = (k)this.aGK.get(paramFragmentManager);
      localk2 = localk1;
      if (localk1 == null)
      {
        localk2 = new k();
        localk2.aGH = null;
        if (paramBoolean)
          localk2.aGD.onStart();
        this.aGK.put(paramFragmentManager, localk2);
        paramFragmentManager.beginTransaction().add(localk2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.handler.obtainMessage(1, paramFragmentManager).sendToTarget();
      }
    }
    AppMethodBeat.o(92401);
    return localk2;
  }

  public final com.bumptech.glide.j ah(Context paramContext)
  {
    AppMethodBeat.i(92397);
    if (paramContext == null)
    {
      paramContext = new IllegalArgumentException("You cannot start a load on a null Context");
      AppMethodBeat.o(92397);
      throw paramContext;
    }
    if ((com.bumptech.glide.h.j.on()) && (!(paramContext instanceof Application)))
      if ((paramContext instanceof FragmentActivity))
      {
        paramContext = a((FragmentActivity)paramContext);
        AppMethodBeat.o(92397);
      }
    while (true)
    {
      return paramContext;
      if ((paramContext instanceof Activity))
      {
        paramContext = h((Activity)paramContext);
        AppMethodBeat.o(92397);
      }
      else
      {
        if ((paramContext instanceof ContextWrapper))
        {
          paramContext = ((ContextWrapper)paramContext).getBaseContext();
          break;
        }
        paramContext = ag(paramContext);
        AppMethodBeat.o(92397);
      }
    }
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(92406);
    boolean bool = true;
    Object localObject;
    switch (paramMessage.what)
    {
    default:
      bool = false;
      paramMessage = null;
      localObject = null;
    case 1:
    case 2:
    }
    while (true)
    {
      if ((bool) && (localObject == null) && (Log.isLoggable("RMRetriever", 5)))
        new StringBuilder("Failed to remove expected request manager fragment, manager: ").append(paramMessage);
      AppMethodBeat.o(92406);
      return bool;
      paramMessage = (FragmentManager)paramMessage.obj;
      localObject = this.aGK.remove(paramMessage);
      continue;
      paramMessage = (i)paramMessage.obj;
      localObject = this.aGL.remove(paramMessage);
    }
  }

  public static abstract interface a
  {
    public abstract com.bumptech.glide.j a(c paramc, h paramh, m paramm, Context paramContext);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.manager.l
 * JD-Core Version:    0.6.2
 */
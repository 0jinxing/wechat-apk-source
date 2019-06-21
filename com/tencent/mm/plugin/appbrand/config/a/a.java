package com.tencent.mm.plugin.appbrand.config.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.provider.Settings.System;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static final SparseArray<a> hiz;
  public a.d hiA;
  public a.d hiB;
  private WeakReference<Activity> hiC;
  public ContentObserver hiD;
  public a.b hiE;
  private boolean hiF;
  public int hiG;
  public b hiH;
  public boolean mFinished;

  static
  {
    AppMethodBeat.i(86929);
    hiz = new SparseArray();
    AppMethodBeat.o(86929);
  }

  private a(Activity paramActivity)
  {
    AppMethodBeat.i(86913);
    this.mFinished = false;
    this.hiD = null;
    this.hiE = null;
    this.hiH = null;
    ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationHandler construct");
    this.hiG = paramActivity.getResources().getConfiguration().orientation;
    this.hiC = new WeakReference(paramActivity);
    this.hiF = ayQ();
    paramActivity.setRequestedOrientation(dI(this.hiF).hiQ);
    AppMethodBeat.o(86913);
  }

  public static a.b a(com.tencent.mm.plugin.appbrand.config.a parama, com.tencent.mm.plugin.appbrand.config.a.d paramd)
  {
    AppMethodBeat.i(86924);
    a.b localb = null;
    if (paramd != null)
      localb = com.tencent.mm.plugin.appbrand.config.a.d.yV(paramd.hfD);
    paramd = localb;
    if (localb == null)
    {
      paramd = localb;
      if (parama != null)
        paramd = yV(parama.heX.hfh);
    }
    parama = paramd;
    if (paramd == null)
      parama = a.b.hiK;
    AppMethodBeat.o(86924);
    return parama;
  }

  private static void a(a.a parama, a.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(86921);
    if (parama == null)
      AppMethodBeat.o(86921);
    while (true)
    {
      return;
      parama.a(paramb, paramBoolean);
      AppMethodBeat.o(86921);
    }
  }

  private void a(a.b paramb, List<a.c> paramList)
  {
    AppMethodBeat.i(86919);
    if (paramb == this.hiB.hiT)
    {
      if (this.hiB.hiS != null)
        paramList.add(new a.c(this.hiB.hiS, paramb, true, "PendingRequest.Listener orientation equal direct", (byte)0));
      this.hiB = null;
      AppMethodBeat.o(86919);
    }
    while (true)
    {
      return;
      if ((Activity)this.hiC.get() == null)
      {
        ab.e("MicroMsg.AppBrandDeviceOrientationHandler", "No Activity when handle pending request");
        if (this.hiB.hiS != null)
          paramList.add(new a.c(this.hiB.hiS, paramb, false, "PendingRequest.Listener activity == null", (byte)0));
        AppMethodBeat.o(86919);
      }
      else
      {
        this.hiA = this.hiB;
        this.hiB = null;
        a(this.hiA);
        AppMethodBeat.o(86919);
      }
    }
  }

  private void a(a.d paramd)
  {
    AppMethodBeat.i(86916);
    ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationConfig.requestDeviceOrientationImpl setRequestOrientation [%s]", new Object[] { paramd });
    Activity localActivity = (Activity)this.hiC.get();
    if (localActivity == null)
    {
      ab.w("MicroMsg.AppBrandDeviceOrientationHandler", "hy: ui already released!");
      if (paramd.hiS != null)
        paramd.hiS.a(paramd.hiT, false);
      AppMethodBeat.o(86916);
    }
    while (true)
    {
      return;
      localActivity.setRequestedOrientation(paramd.hiT.hiQ);
      this.hiF = ayQ();
      if (b(paramd))
      {
        a(paramd.hiT);
        AppMethodBeat.o(86916);
      }
      else
      {
        if (this.hiH == null)
          this.hiH = new b();
        this.hiH.a(new a.2(this, paramd, localActivity));
        AppMethodBeat.o(86916);
      }
    }
  }

  public static boolean ayQ()
  {
    boolean bool = false;
    AppMethodBeat.i(86915);
    int i = Settings.System.getInt(ah.getContext().getContentResolver(), "accelerometer_rotation", 0);
    ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: systenm orientation %d", new Object[] { Integer.valueOf(i) });
    if (i == 1)
      AppMethodBeat.o(86915);
    while (true)
    {
      return bool;
      AppMethodBeat.o(86915);
      bool = true;
    }
  }

  private boolean b(a.d paramd)
  {
    boolean bool = true;
    AppMethodBeat.i(86917);
    ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "current orientation=" + this.hiG + "  request orientation=" + paramd.hiT);
    if ((this.hiG == 2) && ((paramd.hiT.c(a.b.hiM)) || (paramd.hiT.c(a.b.hiO)) || (paramd.hiT.c(a.b.hiP))))
    {
      ab.d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: same landscape");
      AppMethodBeat.o(86917);
    }
    while (true)
    {
      return bool;
      if ((this.hiG == 1) && (paramd.hiT.c(a.b.hiK)))
      {
        ab.d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: same portrait");
        AppMethodBeat.o(86917);
      }
      else if (this.hiG == 0)
      {
        ab.d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: former is undefined, always return immediately");
        AppMethodBeat.o(86917);
      }
      else if (paramd.hiT == a.b.hiL)
      {
        ab.d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: request is UNSPECIFIED, return true");
        AppMethodBeat.o(86917);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(86917);
      }
    }
  }

  public static a.b g(AppBrandInitConfig paramAppBrandInitConfig)
  {
    AppMethodBeat.i(86923);
    a.b localb = null;
    if (paramAppBrandInitConfig != null)
      localb = yV(paramAppBrandInitConfig.hfh);
    paramAppBrandInitConfig = localb;
    if (localb == null)
      paramAppBrandInitConfig = a.b.hiK;
    AppMethodBeat.o(86923);
    return paramAppBrandInitConfig;
  }

  public static a t(Activity paramActivity)
  {
    AppMethodBeat.i(86912);
    synchronized (hiz)
    {
      a locala1 = (a)hiz.get(paramActivity.hashCode());
      a locala2 = locala1;
      if (locala1 == null)
      {
        locala2 = new com/tencent/mm/plugin/appbrand/config/a/a;
        locala2.<init>(paramActivity);
        hiz.put(paramActivity.hashCode(), locala2);
      }
      AppMethodBeat.o(86912);
      return locala2;
    }
  }

  public static boolean t(i parami)
  {
    boolean bool1 = true;
    AppMethodBeat.i(86925);
    boolean bool3;
    switch (((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getRotation())
    {
    default:
      bool2 = true;
      if (a(parami.getAppConfig(), null) == a.b.hiK)
      {
        bool3 = true;
        label78: ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "[alex] isCurrentPortrait %b, isGameShouldPortrait %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        if (bool2 != bool3)
          break label144;
        AppMethodBeat.o(86925);
      }
      break;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = true;
      break;
      bool2 = false;
      break;
      bool2 = true;
      break;
      bool2 = false;
      break;
      bool3 = false;
      break label78;
      label144: AppMethodBeat.o(86925);
    }
  }

  public static a.b yV(String paramString)
  {
    AppMethodBeat.i(86922);
    if ("landscape".equals(paramString))
    {
      paramString = a.b.hiM;
      AppMethodBeat.o(86922);
    }
    while (true)
    {
      return paramString;
      if ("portrait".equals(paramString))
      {
        paramString = a.b.hiK;
        AppMethodBeat.o(86922);
      }
      else if ("landscapeLeft".equals(paramString))
      {
        paramString = a.b.hiO;
        AppMethodBeat.o(86922);
      }
      else if ("landscapeRight".equals(paramString))
      {
        paramString = a.b.hiP;
        AppMethodBeat.o(86922);
      }
      else if ("auto".equals(paramString))
      {
        paramString = a.b.hiL;
        AppMethodBeat.o(86922);
      }
      else
      {
        paramString = null;
        AppMethodBeat.o(86922);
      }
    }
  }

  public final a.b G(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(86926);
    a.b localb;
    if (paramInt == 2)
    {
      ab.d("MicroMsg.AppBrandDeviceOrientationHandler", "parseConfiguration configuration == landscape ");
      if (paramBoolean)
      {
        ab.d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: parseConfiguration configuration == landscape but screen locked");
        localb = a.b.hiN;
        AppMethodBeat.o(86926);
      }
    }
    while (true)
    {
      return localb;
      if (this.hiE == a.b.hiO)
      {
        localb = a.b.hiO;
        AppMethodBeat.o(86926);
      }
      else if (this.hiE == a.b.hiP)
      {
        localb = a.b.hiP;
        AppMethodBeat.o(86926);
      }
      else
      {
        localb = a.b.hiM;
        AppMethodBeat.o(86926);
        continue;
        if (paramInt == 1)
        {
          ab.d("MicroMsg.AppBrandDeviceOrientationHandler", "parseConfiguration configuration == portrait ");
          localb = a.b.hiK;
          AppMethodBeat.o(86926);
        }
        else
        {
          ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "parseConfiguration configuration == %d", new Object[] { Integer.valueOf(paramInt) });
          localb = null;
          AppMethodBeat.o(86926);
        }
      }
    }
  }

  public final void a(a.b paramb)
  {
    boolean bool1 = false;
    AppMethodBeat.i(86918);
    Object localObject1 = (Activity)this.hiC.get();
    Object localObject2;
    boolean bool2;
    boolean bool3;
    if ((localObject1 == null) || (paramb == null))
    {
      localObject2 = new RuntimeException();
      if (localObject1 == null)
      {
        bool2 = true;
        if (paramb != null)
          break label120;
        bool3 = true;
        label50: ab.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", (Throwable)localObject2, "onConfigurationChanged activity[isNull ? %b] newConfig[isNull ? %b]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      }
    }
    else
    {
      localObject1 = new LinkedList();
    }
    while (true)
    {
      try
      {
        if (this.mFinished)
        {
          ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "onConfigurationChanged Finished = true");
          return;
          bool2 = false;
          break;
          label120: bool3 = false;
          break label50;
        }
        if (this.hiA == null)
        {
          ab.d("MicroMsg.AppBrandDeviceOrientationHandler", "No current request..., dismiss");
          AppMethodBeat.o(86918);
          continue;
        }
        if (paramb == null)
        {
          localObject2 = "null";
          ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationConfig.onConfigurationChanged [%s]", new Object[] { localObject2 });
          if (this.hiA.hiS != null)
          {
            localObject2 = new com/tencent/mm/plugin/appbrand/config/a/a$c;
            a.a locala = this.hiA.hiS;
            bool2 = bool1;
            if (paramb != null)
            {
              bool2 = bool1;
              if (paramb.c(this.hiA.hiT))
                bool2 = true;
            }
            ((a.c)localObject2).<init>(locala, paramb, bool2, "CurrentRequest.listener result received", (byte)0);
            ((List)localObject1).add(localObject2);
          }
          this.hiA = null;
          if (this.hiB != null)
            a(paramb, (List)localObject1);
          paramb = ((List)localObject1).iterator();
          if (paramb.hasNext())
          {
            ((a.c)paramb.next()).execute();
            continue;
          }
        }
        else
        {
          localObject2 = paramb.name();
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(86918);
      }
      AppMethodBeat.o(86918);
    }
  }

  public final void a(a.b paramb, a.a parama)
  {
    AppMethodBeat.i(86914);
    Object localObject = (Activity)this.hiC.get();
    a.b localb = dI(this.hiF);
    ab.c("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation reqOrientation = [%s], listener = [%s] currentOrientation = [%s], latestOrientation = [%s]", new Object[] { paramb, parama, localb, this.hiE });
    if (localObject == null)
    {
      ab.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", new RuntimeException(), "No Activity found when request device orientation", new Object[0]);
      a(parama, localb, false);
      this.hiE = paramb;
      AppMethodBeat.o(86914);
    }
    while (true)
    {
      return;
      if (paramb == null)
      {
        ab.w("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation null");
        a(parama, localb, false);
        this.hiE = paramb;
        AppMethodBeat.o(86914);
      }
      else if ((paramb == localb) && (this.hiE != a.b.hiL))
      {
        ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation currentOrientation hit. [%s]", new Object[] { paramb });
        a(parama, paramb, true);
        this.hiE = paramb;
        AppMethodBeat.o(86914);
      }
      else
      {
        a.d locald = null;
        localObject = null;
        try
        {
          if (this.mFinished)
          {
            ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation mFinished = true");
            this.hiE = paramb;
            AppMethodBeat.o(86914);
          }
          else
          {
            if (this.hiA == null)
            {
              locald = new com/tencent/mm/plugin/appbrand/config/a/a$d;
              locald.<init>(this, paramb, parama, (byte)0);
              this.hiA = locald;
              a(this.hiA);
            }
            while (true)
            {
              if (localObject != null)
              {
                ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "dismissRequest not null");
                a(((a.d)localObject).hiS, localb, false);
              }
              this.hiE = paramb;
              AppMethodBeat.o(86914);
              break;
              localObject = locald;
              if (this.hiB != null)
                localObject = this.hiB;
              locald = new com/tencent/mm/plugin/appbrand/config/a/a$d;
              locald.<init>(this, paramb, parama, (byte)0);
              this.hiB = locald;
            }
          }
        }
        finally
        {
          AppMethodBeat.o(86914);
        }
      }
    }
    throw paramb;
  }

  public final a.b dI(boolean paramBoolean)
  {
    AppMethodBeat.i(86920);
    ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "getCurrentOrientation");
    a.b localb = G(this.hiG, paramBoolean);
    AppMethodBeat.o(86920);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.a
 * JD-Core Version:    0.6.2
 */
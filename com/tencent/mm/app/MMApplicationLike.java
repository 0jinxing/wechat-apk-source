package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.util.ArrayMap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.loader.BuildConfig;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.tinker.entry.ApplicationLifeCycle;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.entry.DefaultApplicationLike;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MMApplicationLike extends DefaultApplicationLike
{
  private static final String TAG = "MicroMsg.MMApplication";
  private static MMApplicationLike sSafeguardInstance = null;
  private static byte[] sSafeguardLock = new byte[0];
  private k mMMApplicationLikeImpl;
  private ApplicationLifeCycle wrapper;

  public MMApplicationLike(Application paramApplication, int paramInt, boolean paramBoolean, long paramLong1, long paramLong2, Intent paramIntent)
  {
    super(paramApplication, paramInt, paramBoolean, paramLong1, paramLong2, paramIntent);
    AppMethodBeat.i(3232);
    this.mMMApplicationLikeImpl = new k(this);
    AppMethodBeat.o(3232);
  }

  public Resources getResources(Resources paramResources)
  {
    AppMethodBeat.i(3237);
    if (ah.getResources() == null)
      AppMethodBeat.o(3237);
    while (true)
    {
      return paramResources;
      paramResources = ah.getResources();
      AppMethodBeat.o(3237);
    }
  }

  public void onBaseContextAttached(Context paramContext)
  {
    AppMethodBeat.i(3233);
    if (safeguard())
      AppMethodBeat.o(3233);
    while (true)
    {
      return;
      Object localObject1 = r.aY(paramContext);
      if (localObject1 == null)
        ab.e("MicroMsg.SetupBaseBuildInfo", "meta bundle is null!!!!");
      while (true)
      {
        f.DEBUG = false;
        f.BUILD_TAG = "MicroMessenger_Android_GIT_RELEASE_GRADLE #9509";
        f.OWNER = "amm_code_helper";
        f.HOSTNAME = "TENCENT64.site";
        f.TIME = "2019-04-16 13:22:42";
        f.COMMAND = "null";
        f.REV = "e6dc86720a5ecc95c09c008b1c4fc3f82baef568";
        f.SVNPATH = "origin/RB-2019-MAR@git";
        f.CLIENT_VERSION = "0x27000435";
        f.xxY = Integer.decode("0x27000435").intValue();
        f.ENABLE_FPS_ANALYSE = false;
        f.ENABLE_MATRIX = true;
        f.ENABLE_MATRIX_TRACE = false;
        f.EX_DEVICE_LOGIN = false;
        f.PRE_RELEASE = false;
        f.REDESIGN_ENTRANCE = false;
        f.IS_FLAVOR_RED = false;
        f.IS_FLAVOR_PURPLE = false;
        localObject1 = new ArrayMap();
        localObject2 = BuildConfig.class.getFields();
        int i = localObject2.length;
        int j = 0;
        label144: if (j < i)
        {
          Object localObject3 = localObject2[j];
          try
          {
            ab.i("MicroMsg.SetupBaseBuildInfo", "Copy BuildConfig field %s %s", new Object[] { localObject3.getName(), localObject3.get(null) });
            ((ArrayMap)localObject1).put(localObject3.getName(), localObject3.get(null));
            j++;
            break label144;
            com.tencent.mm.loader.j.a.m((Bundle)localObject1);
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.SetupBaseBuildInfo", localIllegalAccessException, "", new Object[0]);
          }
        }
      }
      Object localObject2 = f.xxZ;
      if (!((s)localObject2).xyo)
        ((s)localObject2).xyn.putAll((ArrayMap)localObject1);
      f.xxZ.xyo = true;
      com.tencent.e.a.b.a(i.a.cer);
      super.onBaseContextAttached(paramContext);
      localObject1 = this.mMMApplicationLikeImpl;
      v.a.cfp.b(k.cdV);
      v.a.cfp.BA();
      localObject2 = k.cdV;
      if ((localObject2 == null) || (((ApplicationLike)localObject2).getApplication() == null))
      {
        paramContext = new TinkerRuntimeException("tinkerApplication is null");
        AppMethodBeat.o(3233);
        throw paramContext;
      }
      if ((ShareTinkerInternals.Sb(((ApplicationLike)localObject2).getTinkerFlags())) && (com.tencent.tinker.lib.e.b.c(k.cdV)))
      {
        com.tencent.tinker.lib.a.a.a(k.cdV, "armeabi-v7a");
        com.tencent.tinker.lib.a.a.a(k.cdV, "armeabi");
      }
      b.cdW = k.cdV.getApplicationStartMillisTime();
      k.a(k.cdV);
      k.cev = k.cev + "/" + localObject1.hashCode();
      ah.ph(false);
      ah.setContext(k.cdV.getApplication());
      String str = bo.aw(paramContext, Process.myPid());
      ab.LZ(0);
      b.bWa = str;
      if (!f.DEBUG)
      {
        ab.e("MicroMsg.MMApplicationLikeImpl", "befrore initCrash()");
        h.a(k.cdV.getApplication(), str);
      }
      long l1 = System.currentTimeMillis();
      localObject2 = new com.tencent.mm.sdk.e.a(com.tencent.mm.loader.j.b.eSj + "NowRev.ini");
      ((k)localObject1).cew = ((com.tencent.mm.sdk.e.a)localObject2).getValue("NowRev");
      ((k)localObject1).cex = f.CLIENT_VERSION;
      long l2 = System.currentTimeMillis();
      ((k)localObject1).cey = (l2 - l1);
      ((k)localObject1).cez = 0L;
      if (!((k)localObject1).cex.equals(((k)localObject1).cew))
      {
        ah.xzd = true;
        e.u(k.cdV.getApplication().getDir("lib", 0));
        e.u(k.cdV.getApplication().getDir("dex", 0));
        e.u(k.cdV.getApplication().getDir("cache", 0));
        e.u(k.cdV.getApplication().getDir("recover_lib", 0));
        com.tencent.tinker.lib.e.b.e(k.cdV);
        ((com.tencent.mm.sdk.e.a)localObject2).hV("NowRev", ((k)localObject1).cex);
        ((k)localObject1).cez = (System.currentTimeMillis() - l2);
        ab.w("MicroMsg.MMApplicationLikeImpl", "application hash:%s, %s", new Object[] { k.cev, bo.dpG().toString() });
      }
      ab.i("MicroMsg.MMApplicationLikeImpl", "clearOldDirIfNewVersion oldversion:%s, newversion:%s, gettime:%d, settime:%d", new Object[] { ((k)localObject1).cew, ((k)localObject1).cex, Long.valueOf(((k)localObject1).cey), Long.valueOf(((k)localObject1).cez) });
      if ((f.DEBUG) || (f.PRE_RELEASE))
      {
        ab.e("MicroMsg.MMApplicationLikeImpl", "after initCrash()");
        h.a(k.cdV.getApplication(), str);
      }
      localObject1 = b.bWa;
      try
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        this.wrapper = ((ApplicationLifeCycle)Class.forName(ah.getPackageName() + ".app.MMApplicationWrapper").getConstructor(new Class[] { ApplicationLike.class, String.class }).newInstance(new Object[] { this, localObject1 }));
        this.wrapper.onBaseContextAttached(paramContext);
        AppMethodBeat.o(3233);
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.MMApplication", paramContext, "failed to create application wrapper class", new Object[0]);
        paramContext = new RuntimeException("failed to create application wrapper class", paramContext);
        AppMethodBeat.o(3233);
      }
    }
    throw paramContext;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(3236);
    ab.d("MicroMsg.MMApplication", "configuration changed");
    super.onConfigurationChanged(paramConfiguration);
    if (this.wrapper != null)
      this.wrapper.onConfigurationChanged(paramConfiguration);
    AppMethodBeat.o(3236);
  }

  public void onCreate()
  {
    AppMethodBeat.i(3234);
    if (this.wrapper != null)
      this.wrapper.onCreate();
    AppMethodBeat.o(3234);
  }

  public void onLowMemory()
  {
    AppMethodBeat.i(3238);
    super.onLowMemory();
    if (this.wrapper != null)
      this.wrapper.onLowMemory();
    AppMethodBeat.o(3238);
  }

  public void onTerminate()
  {
    AppMethodBeat.i(3235);
    super.onTerminate();
    if (this.wrapper != null)
      this.wrapper.onTerminate();
    AppMethodBeat.o(3235);
  }

  public void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(3239);
    super.onTrimMemory(paramInt);
    if (this.wrapper != null)
      this.wrapper.onTrimMemory(paramInt);
    AppMethodBeat.o(3239);
  }

  public boolean safeguard()
  {
    synchronized (sSafeguardLock)
    {
      if (sSafeguardInstance != this)
      {
        if (sSafeguardInstance == null)
          sSafeguardInstance = this;
      }
      else
      {
        bool = false;
        return bool;
      }
      boolean bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.MMApplicationLike
 * JD-Core Version:    0.6.2
 */
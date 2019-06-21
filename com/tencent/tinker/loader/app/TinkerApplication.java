package com.tencent.tinker.loader.app;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import com.tencent.tinker.loader.TinkerLoader;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.TinkerUncaughtHandler;
import com.tencent.tinker.loader.hotplug.ComponentHotplug;
import com.tencent.tinker.loader.hotplug.UnsupportedEnvironmentException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public abstract class TinkerApplication extends Application
{
  private static final String INTENT_PATCH_EXCEPTION = "intent_patch_exception";
  private static final int TINKER_DISABLE = 0;
  private static final String TINKER_LOADER_METHOD = "tryLoad";
  private Method appLikeGetAssets = null;
  private Method appLikeGetBaseContext = null;
  private Method appLikeGetClassLoader = null;
  private Method appLikeGetResources = null;
  private Method appLikeGetSystemService = null;
  private Method appLikeOnBaseContextAttached = null;
  private Method appLikeOnConfigurationChanged = null;
  private Method appLikeOnCreate = null;
  private Method appLikeOnLowMemory = null;
  private Method appLikeOnTerminate = null;
  private Method appLikeOnTrimMemory = null;
  private Object applicationLike = null;
  private long applicationStartElapsedTime;
  private long applicationStartMillisTime;
  private final String delegateClassName;
  private final String loaderClassName;
  private final int tinkerFlags;
  private final boolean tinkerLoadVerifyFlag;
  private Intent tinkerResultIntent;
  private boolean useSafeMode;

  protected TinkerApplication(int paramInt)
  {
    this(paramInt, "com.tencent.tinker.entry.DefaultApplicationLike", TinkerLoader.class.getName(), false);
  }

  protected TinkerApplication(int paramInt, String paramString)
  {
    this(paramInt, paramString, TinkerLoader.class.getName(), false);
  }

  protected TinkerApplication(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.tinkerFlags = paramInt;
    this.delegateClassName = paramString1;
    this.loaderClassName = paramString2;
    this.tinkerLoadVerifyFlag = paramBoolean;
  }

  private Object createDelegate()
  {
    try
    {
      Object localObject = Class.forName(this.delegateClassName, false, getClassLoader()).getConstructor(new Class[] { Application.class, Integer.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE, Intent.class }).newInstance(new Object[] { this, Integer.valueOf(this.tinkerFlags), Boolean.valueOf(this.tinkerLoadVerifyFlag), Long.valueOf(this.applicationStartElapsedTime), Long.valueOf(this.applicationStartMillisTime), this.tinkerResultIntent });
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      throw new TinkerRuntimeException("createDelegate failed", localThrowable);
    }
  }

  private void ensureDelegate()
  {
    try
    {
      if (this.applicationLike == null)
        this.applicationLike = createDelegate();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private AssetManager invokeAppLikeGetAssets(Object paramObject, AssetManager paramAssetManager)
  {
    try
    {
      if (this.appLikeGetAssets == null)
        this.appLikeGetAssets = ShareReflectUtil.b(this.applicationLike, "getAssets", new Class[] { AssetManager.class });
      paramObject = (AssetManager)this.appLikeGetAssets.invoke(paramObject, new Object[] { paramAssetManager });
      return paramObject;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke getAssets of appLike.", paramObject);
  }

  private Object invokeAppLikeGetBaseContext(Object paramObject, Context paramContext)
  {
    try
    {
      if (this.appLikeGetBaseContext == null)
        this.appLikeGetBaseContext = ShareReflectUtil.b(this.applicationLike, "getBaseContext", new Class[] { Context.class });
      paramObject = this.appLikeGetBaseContext.invoke(paramObject, new Object[] { paramContext });
      return paramObject;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke getBaseContext of appLike.", paramObject);
  }

  private ClassLoader invokeAppLikeGetClassLoader(Object paramObject, ClassLoader paramClassLoader)
  {
    try
    {
      if (this.appLikeGetClassLoader == null)
        this.appLikeGetClassLoader = ShareReflectUtil.b(this.applicationLike, "getClassLoader", new Class[] { ClassLoader.class });
      paramObject = (ClassLoader)this.appLikeGetClassLoader.invoke(paramObject, new Object[] { paramClassLoader });
      return paramObject;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke getClassLoader of appLike.", paramObject);
  }

  private Resources invokeAppLikeGetResources(Object paramObject, Resources paramResources)
  {
    try
    {
      if (this.appLikeGetResources == null)
        this.appLikeGetResources = ShareReflectUtil.b(this.applicationLike, "getResources", new Class[] { Resources.class });
      paramObject = (Resources)this.appLikeGetResources.invoke(paramObject, new Object[] { paramResources });
      return paramObject;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke getResources of appLike.", paramObject);
  }

  private Object invokeAppLikeGetSystemService(Object paramObject1, String paramString, Object paramObject2)
  {
    try
    {
      if (this.appLikeGetSystemService == null)
        this.appLikeGetSystemService = ShareReflectUtil.b(this.applicationLike, "getSystemService", new Class[] { String.class, Object.class });
      paramObject1 = this.appLikeGetSystemService.invoke(paramObject1, new Object[] { paramString, paramObject2 });
      return paramObject1;
    }
    catch (Throwable paramObject1)
    {
    }
    throw new TinkerRuntimeException("fail to invoke getSystemService of appLike.", paramObject1);
  }

  private void invokeAppLikeOnBaseContextAttached(Object paramObject, Context paramContext)
  {
    try
    {
      if (this.appLikeOnBaseContextAttached == null)
        this.appLikeOnBaseContextAttached = ShareReflectUtil.b(this.applicationLike, "onBaseContextAttached", new Class[] { Context.class });
      this.appLikeOnBaseContextAttached.invoke(paramObject, new Object[] { paramContext });
      return;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke onBaseContextAttached of appLike.", paramObject);
  }

  private void invokeAppLikeOnConfigurationChanged(Object paramObject, Configuration paramConfiguration)
  {
    try
    {
      if (this.appLikeOnConfigurationChanged == null)
        this.appLikeOnConfigurationChanged = ShareReflectUtil.b(this.applicationLike, "onConfigurationChanged", new Class[] { Configuration.class });
      this.appLikeOnConfigurationChanged.invoke(paramObject, new Object[] { paramConfiguration });
      return;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke onConfigurationChanged of appLike.", paramObject);
  }

  private void invokeAppLikeOnCreate(Object paramObject)
  {
    try
    {
      if (this.appLikeOnCreate == null)
        this.appLikeOnCreate = ShareReflectUtil.b(this.applicationLike, "onCreate", new Class[0]);
      this.appLikeOnCreate.invoke(paramObject, new Object[0]);
      return;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke onCreate of appLike.", paramObject);
  }

  private void invokeAppLikeOnLowMemory(Object paramObject)
  {
    try
    {
      if (this.appLikeOnLowMemory == null)
        this.appLikeOnLowMemory = ShareReflectUtil.b(this.applicationLike, "onLowMemory", new Class[0]);
      this.appLikeOnLowMemory.invoke(paramObject, new Object[0]);
      return;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke onLowMemory of appLike.", paramObject);
  }

  private void invokeAppLikeOnTerminate(Object paramObject)
  {
    try
    {
      if (this.appLikeOnTerminate == null)
        this.appLikeOnTerminate = ShareReflectUtil.b(this.applicationLike, "onTerminate", new Class[0]);
      this.appLikeOnTerminate.invoke(paramObject, new Object[0]);
      return;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke onTerminate of appLike.", paramObject);
  }

  private void invokeAppLikeOnTrimMemory(Object paramObject, int paramInt)
  {
    try
    {
      if (this.appLikeOnTrimMemory == null)
        this.appLikeOnTrimMemory = ShareReflectUtil.b(this.applicationLike, "onTrimMemory", new Class[] { Integer.TYPE });
      this.appLikeOnTrimMemory.invoke(paramObject, new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    catch (Throwable paramObject)
    {
    }
    throw new TinkerRuntimeException("fail to invoke onTrimMemory of appLike.", paramObject);
  }

  private void loadTinker()
  {
    try
    {
      Class localClass = Class.forName(this.loaderClassName, false, getClassLoader());
      this.tinkerResultIntent = ((Intent)localClass.getMethod("tryLoad", new Class[] { TinkerApplication.class }).invoke(localClass.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[] { this }));
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        this.tinkerResultIntent = new Intent();
        ShareIntentUtil.b(this.tinkerResultIntent, -20);
        this.tinkerResultIntent.putExtra("intent_patch_exception", localThrowable);
      }
    }
  }

  private void onBaseContextAttached(Context paramContext)
  {
    try
    {
      this.applicationStartElapsedTime = SystemClock.elapsedRealtime();
      this.applicationStartMillisTime = System.currentTimeMillis();
      loadTinker();
      ensureDelegate();
      invokeAppLikeOnBaseContextAttached(this.applicationLike, paramContext);
      if (this.useSafeMode)
        ShareTinkerInternals.aD(this, 0);
      return;
    }
    catch (TinkerRuntimeException paramContext)
    {
      throw paramContext;
    }
    catch (Throwable paramContext)
    {
    }
    throw new TinkerRuntimeException(paramContext.getMessage(), paramContext);
  }

  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
    Thread.setDefaultUncaughtExceptionHandler(new TinkerUncaughtHandler(this));
    onBaseContextAttached(paramContext);
  }

  public AssetManager getAssets()
  {
    AssetManager localAssetManager1 = super.getAssets();
    AssetManager localAssetManager2 = localAssetManager1;
    if (this.applicationLike != null)
      localAssetManager2 = invokeAppLikeGetAssets(this.applicationLike, localAssetManager1);
    return localAssetManager2;
  }

  public Context getBaseContext()
  {
    Context localContext1 = super.getBaseContext();
    Context localContext2 = localContext1;
    if (this.applicationLike != null)
      localContext2 = (Context)invokeAppLikeGetBaseContext(this.applicationLike, localContext1);
    return localContext2;
  }

  public ClassLoader getClassLoader()
  {
    ClassLoader localClassLoader1 = super.getClassLoader();
    ClassLoader localClassLoader2 = localClassLoader1;
    if (this.applicationLike != null)
      localClassLoader2 = invokeAppLikeGetClassLoader(this.applicationLike, localClassLoader1);
    return localClassLoader2;
  }

  public Resources getResources()
  {
    Resources localResources1 = super.getResources();
    Resources localResources2 = localResources1;
    if (this.applicationLike != null)
      localResources2 = invokeAppLikeGetResources(this.applicationLike, localResources1);
    return localResources2;
  }

  public Object getSystemService(String paramString)
  {
    Object localObject1 = super.getSystemService(paramString);
    Object localObject2 = localObject1;
    if (this.applicationLike != null)
      localObject2 = invokeAppLikeGetSystemService(this.applicationLike, paramString, localObject1);
    return localObject2;
  }

  public int getTinkerFlags()
  {
    return this.tinkerFlags;
  }

  public boolean isTinkerLoadVerifyFlag()
  {
    return this.tinkerLoadVerifyFlag;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.applicationLike != null)
      invokeAppLikeOnConfigurationChanged(this.applicationLike, paramConfiguration);
  }

  public void onCreate()
  {
    super.onCreate();
    try
    {
      ensureDelegate();
      try
      {
        ComponentHotplug.dSl();
        invokeAppLikeOnCreate(this.applicationLike);
        return;
      }
      catch (UnsupportedEnvironmentException localUnsupportedEnvironmentException)
      {
        TinkerRuntimeException localTinkerRuntimeException1 = new com/tencent/tinker/loader/TinkerRuntimeException;
        localTinkerRuntimeException1.<init>("failed to make sure that ComponentHotplug logic is fine.", localUnsupportedEnvironmentException);
        throw localTinkerRuntimeException1;
      }
    }
    catch (TinkerRuntimeException localTinkerRuntimeException2)
    {
      throw localTinkerRuntimeException2;
    }
    catch (Throwable localThrowable)
    {
      throw new TinkerRuntimeException(localThrowable.getMessage(), localThrowable);
    }
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    if (this.applicationLike != null)
      invokeAppLikeOnLowMemory(this.applicationLike);
  }

  public void onTerminate()
  {
    super.onTerminate();
    if (this.applicationLike != null)
      invokeAppLikeOnTerminate(this.applicationLike);
  }

  @TargetApi(14)
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    if (this.applicationLike != null)
      invokeAppLikeOnTrimMemory(this.applicationLike, paramInt);
  }

  public void setUseSafeMode(boolean paramBoolean)
  {
    this.useSafeMode = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.app.TinkerApplication
 * JD-Core Version:    0.6.2
 */
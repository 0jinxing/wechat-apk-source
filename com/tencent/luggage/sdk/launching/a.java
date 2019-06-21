package com.tencent.luggage.sdk.launching;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Method;

public abstract class a
  implements com.tencent.luggage.sdk.customize.a
{
  public final boolean a(Context paramContext, LaunchParcel paramLaunchParcel)
  {
    boolean bool = false;
    if ((bo.isNullOrNil(paramLaunchParcel.username)) && (bo.isNullOrNil(paramLaunchParcel.appId)))
      return bool;
    paramLaunchParcel.ijA = bo.anU();
    Object localObject1;
    if (paramContext == null)
      localObject1 = ah.getContext();
    while (true)
    {
      bool = b((Context)localObject1, paramLaunchParcel);
      break;
      localObject1 = paramContext;
      if ((paramContext instanceof Activity))
      {
        localObject1 = null;
        Object localObject2 = null;
        try
        {
          TypedArray localTypedArray = paramContext.obtainStyledAttributes(new int[] { 16842840 });
          localObject2 = localTypedArray;
          localObject1 = localTypedArray;
          Activity localActivity;
          if (!localTypedArray.getBoolean(0, false))
          {
            localObject2 = localTypedArray;
            localObject1 = localTypedArray;
            localActivity = (Activity)paramContext;
            localObject2 = localTypedArray;
            localObject1 = localTypedArray;
          }
          try
          {
            Method localMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            localObject2 = localTypedArray;
            localObject1 = localTypedArray;
            localMethod.setAccessible(true);
            localObject2 = localTypedArray;
            localObject1 = localTypedArray;
            localMethod.invoke(localActivity, new Object[0]);
            localObject1 = paramContext;
            if (localTypedArray != null)
            {
              localTypedArray.recycle();
              localObject1 = paramContext;
            }
          }
          catch (Throwable localThrowable)
          {
            while (true)
            {
              localObject2 = localTypedArray;
              localObject1 = localTypedArray;
              ab.printErrStackTrace("MicroMsg.AppBrand.Precondition.AbstractLaunchEntry", localThrowable, "call convertActivityFromTranslucent Fail: %s", new Object[] { localThrowable.getMessage() });
            }
          }
        }
        catch (Exception localException)
        {
          localObject1 = localObject2;
          ab.printErrStackTrace("MicroMsg.AppBrand.Precondition.AbstractLaunchEntry", localException, "convertActivityFromTranslucent %s", new Object[] { paramContext.getClass().getSimpleName() });
          localObject1 = paramContext;
          if (localObject2 != null)
          {
            localObject2.recycle();
            localObject1 = paramContext;
          }
        }
        finally
        {
          if (localObject1 != null)
            ((TypedArray)localObject1).recycle();
        }
      }
    }
    throw paramContext;
  }

  public final boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional)
  {
    LaunchParcel localLaunchParcel = new LaunchParcel();
    localLaunchParcel.username = paramString1;
    localLaunchParcel.appId = paramString2;
    if (paramString3 == null);
    for (paramString1 = null; ; paramString1 = paramString3.trim())
    {
      localLaunchParcel.hgC = paramString1;
      localLaunchParcel.har = paramInt1;
      localLaunchParcel.version = paramInt2;
      localLaunchParcel.ijy = paramAppBrandStatObject;
      localLaunchParcel.hgF = paramAppBrandLaunchReferrer;
      localLaunchParcel.ijz = paramLaunchParamsOptional;
      return a(paramContext, localLaunchParcel);
    }
  }

  protected abstract boolean b(Context paramContext, LaunchParcel paramLaunchParcel);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.launching.a
 * JD-Core Version:    0.6.2
 */
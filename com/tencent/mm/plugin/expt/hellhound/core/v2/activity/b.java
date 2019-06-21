package com.tencent.mm.plugin.expt.hellhound.core.v2.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.hellhound.core.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

final class b
  implements InvocationHandler
{
  static boolean lME = true;
  static int lMF = 0;
  Object lMB;
  private Method lMC;
  private d lMD;

  @SuppressLint({"PrivateApi"})
  b(d paramd)
  {
    AppMethodBeat.i(73392);
    this.lMD = paramd;
    try
    {
      this.lMC = a.bqr().getDeclaredMethod("getActivity", new Class[] { IBinder.class });
      this.lMC.setAccessible(true);
      AppMethodBeat.o(73392);
      return;
    }
    catch (Exception paramd)
    {
      while (true)
      {
        ab.printErrStackTrace("ActivityHijack", paramd, "ActivityHijack", new Object[0]);
        h.pYm.a(932L, 2L, 1L, false);
        AppMethodBeat.o(73392);
      }
    }
  }

  private Intent c(Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73394);
    try
    {
      paramMethod = paramMethod.invoke(this.lMB, paramArrayOfObject);
      if ((paramMethod instanceof Intent))
      {
        paramMethod = (Intent)paramMethod;
        AppMethodBeat.o(73394);
        return paramMethod;
      }
    }
    catch (Exception paramMethod)
    {
      while (true)
      {
        ab.i("ActivityHijack", "AHijack: getIntentForIntentSender: %s", new Object[] { bo.dpG() });
        h.pYm.a(932L, 96L, 1L, false);
        h.pYm.a(932L, 97L, 1L, false);
        paramMethod = new Intent();
        AppMethodBeat.o(73394);
      }
    }
  }

  private static Intent n(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
      paramArrayOfObject = null;
    while (true)
    {
      return paramArrayOfObject;
      for (int i = 0; ; i++)
      {
        if (i >= paramArrayOfObject.length)
          break label52;
        if ((paramArrayOfObject[i] != null) && ((paramArrayOfObject[i] instanceof Intent)))
        {
          paramArrayOfObject = (Intent)paramArrayOfObject[i];
          break;
        }
      }
      label52: paramArrayOfObject = null;
    }
  }

  private Activity o(Object[] paramArrayOfObject)
  {
    int i = 0;
    Object localObject = null;
    AppMethodBeat.i(73395);
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
    {
      AppMethodBeat.o(73395);
      paramArrayOfObject = localObject;
      return paramArrayOfObject;
    }
    do
    {
      i++;
      if (i >= paramArrayOfObject.length)
        break;
    }
    while ((paramArrayOfObject[i] == null) || (!(paramArrayOfObject[i] instanceof IBinder)));
    for (paramArrayOfObject = (IBinder)paramArrayOfObject[i]; ; paramArrayOfObject = null)
      while (true)
      {
        if (paramArrayOfObject == null)
        {
          AppMethodBeat.o(73395);
          paramArrayOfObject = localObject;
          break;
        }
        try
        {
          localObject = a.bqq();
          paramArrayOfObject = (Activity)this.lMC.invoke(localObject, new Object[] { paramArrayOfObject });
          AppMethodBeat.o(73395);
        }
        catch (Exception paramArrayOfObject)
        {
          while (true)
            paramArrayOfObject = null;
        }
      }
  }

  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73393);
    String str = paramMethod.getName();
    try
    {
      if ("moveActivityTaskToBack".equals(str))
      {
        paramObject = o(paramArrayOfObject);
        int i = paramArrayOfObject.length;
        j = 0;
        if (j >= i)
          break label700;
        localObject = paramArrayOfObject[j];
        if ((localObject != null) && ((localObject instanceof Boolean)))
        {
          bool = ((Boolean)localObject).booleanValue();
          this.lMD.a(paramObject, bool);
        }
      }
    }
    catch (Exception paramObject)
    {
      while (true)
      {
        try
        {
          int j;
          paramObject = paramMethod.invoke(this.lMB, paramArrayOfObject);
          AppMethodBeat.o(73393);
          return paramObject;
          j++;
          continue;
          if ("finishActivity".equals(str))
          {
            paramObject = o(paramArrayOfObject);
            this.lMD.F(paramObject);
            continue;
            paramObject = paramObject;
            ab.printErrStackTrace("ActivityHijack", paramObject, "AHijack.invoke-method", new Object[0]);
            h.pYm.a(932L, 0L, 1L, false);
            continue;
          }
        }
        catch (Exception paramObject)
        {
          Object localObject;
          ab.printErrStackTrace("ActivityHijack", paramObject, "AHijack.invoke-new", new Object[0]);
          h.pYm.a(932L, 63L, 1L, false);
          if ("isTopOfTask".equals(str))
            try
            {
              paramObject = (Boolean)paramMethod.invoke(this.lMB, paramArrayOfObject);
              lME = paramObject.booleanValue();
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("AHijack:isTopOfTask: ");
              ab.d("ActivityHijack", lME);
              AppMethodBeat.o(73393);
              continue;
              if (!"getIntentForIntentSender".equals(str))
                continue;
              paramObject = c(paramMethod, paramArrayOfObject);
              AppMethodBeat.o(73393);
            }
            catch (Exception paramObject)
            {
              ab.printErrStackTrace("ActivityHijack", paramObject, "AHijack:isTopOfTask-e1 crash", new Object[0]);
              h.pYm.a(932L, 80L, 1L, false);
              try
              {
                paramObject = o(paramArrayOfObject);
                if (paramObject != null)
                {
                  localObject = Activity.class.getDeclaredMethod("isTopOfTask", new Class[0]);
                  ((Method)localObject).setAccessible(true);
                  paramObject = (Boolean)((Method)localObject).invoke(paramObject, new Object[0]);
                  lME = paramObject.booleanValue();
                  AppMethodBeat.o(73393);
                }
              }
              catch (Exception paramObject)
              {
                ab.printErrStackTrace("ActivityHijack", paramObject, "AHijack:isTopOfTask-e2 crash", new Object[0]);
                h.pYm.a(932L, 85L, 1L, false);
                lME = true;
              }
            }
          try
          {
            if ("startActivity".equals(str))
            {
              paramObject = (Integer)paramMethod.invoke(this.lMB, paramArrayOfObject);
              lMF = paramObject.intValue();
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("AHijack:startActivityRet: ");
              ab.d("ActivityHijack", lMF);
              AppMethodBeat.o(73393);
            }
          }
          catch (Exception paramObject)
          {
            ab.printErrStackTrace("ActivityHijack", paramObject, "AHijack:startActivity crash-3", new Object[0]);
            h.pYm.a(932L, 86L, 1L, false);
            lMF = 0;
            try
            {
              if ("broadcastIntent".equals(str))
              {
                h.pYm.a(932L, 64L, 1L, false);
                paramObject = new java/lang/StringBuilder;
                paramObject.<init>("handleSonyBroadcastIntent Build.MODEL / Build.BRAND: ");
                ab.i("ActivityHijack", Build.MODEL + " / " + Build.BRAND);
                paramObject = n(paramArrayOfObject);
                if (paramObject != null)
                  continue;
                ab.d("ActivityHijack", "handleSonyBroadcastIntent intent == null");
                paramObject = paramMethod.invoke(this.lMB, paramArrayOfObject);
                AppMethodBeat.o(73393);
              }
            }
            catch (Exception paramObject)
            {
              ab.printErrStackTrace("ActivityHijack", paramObject, "AHijack.broadcastIntent", new Object[0]);
              h.pYm.a(932L, 65L, 1L, false);
              paramObject = paramMethod.invoke(this.lMB, paramArrayOfObject);
              AppMethodBeat.o(73393);
            }
          }
          continue;
          paramObject = paramObject.getAction();
          ab.d("ActivityHijack", "handleSonyBroadcastIntent action = ".concat(String.valueOf(paramObject)));
          if ("com.sonymobile.media.AUDIO_MODE_CHANGED_ACTION".equals(paramObject))
          {
            ab.e("ActivityHijack", "Sony-Phone, What the fuck !!!");
            paramObject = Integer.valueOf(0);
            AppMethodBeat.o(73393);
            continue;
          }
          paramObject = paramMethod.invoke(this.lMB, paramArrayOfObject);
          AppMethodBeat.o(73393);
          continue;
        }
        label700: boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.v2.activity.b
 * JD-Core Version:    0.6.2
 */
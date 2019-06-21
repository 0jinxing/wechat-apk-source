package com.tencent.mm.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;

public final class d
{
  private static a yfK;
  private static HashMap<Integer, Long> yfL;
  private static int yfM;
  private static int yfN;
  private static long yfO;

  static
  {
    AppMethodBeat.i(105951);
    yfL = new HashMap();
    yfM = 1100;
    yfN = 2000;
    yfO = 0L;
    AppMethodBeat.o(105951);
  }

  public static void a(a parama)
  {
    yfK = parama;
  }

  public static boolean a(Context paramContext, boolean paramBoolean, Intent[] paramArrayOfIntent, Object[] paramArrayOfObject)
  {
    while (true)
    {
      long l;
      Object localObject;
      Integer localInteger;
      try
      {
        AppMethodBeat.i(105948);
        int i = paramArrayOfIntent.length;
        int j = 0;
        if (j < i)
        {
          if (aO(paramArrayOfIntent[j]))
          {
            paramBoolean = false;
            AppMethodBeat.o(105948);
            return paramBoolean;
          }
          j++;
          continue;
        }
        l = System.currentTimeMillis();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append(paramContext.toString()).append(",");
        i = paramArrayOfIntent.length;
        j = 0;
        if (j < i)
        {
          ((StringBuilder)localObject).append(paramArrayOfIntent[j]);
          ((StringBuilder)localObject).append(",");
          j++;
          continue;
        }
        i = paramArrayOfObject.length;
        j = 0;
        if (j < i)
        {
          ((StringBuilder)localObject).append(paramArrayOfObject[j]);
          ((StringBuilder)localObject).append(",");
          j++;
          continue;
        }
        paramArrayOfObject = ((StringBuilder)localObject).toString();
        localInteger = Integer.valueOf(paramArrayOfObject.hashCode());
        Long localLong = (Long)yfL.get(localInteger);
        localObject = Long.valueOf(System.currentTimeMillis());
        if ((!paramBoolean) || (localLong == null))
          break label362;
        if (((Long)localObject).longValue() - localLong.longValue() <= yfN)
        {
          String str = aqB(paramContext.getClass().toString());
          if (paramArrayOfIntent[0].getComponent() != null)
          {
            paramContext = aqB(paramArrayOfIntent[0].getComponent().getClassName());
            yfK.a(((Long)localObject).longValue() - localLong.longValue(), str, paramContext);
          }
        }
        else
        {
          if (((Long)localObject).longValue() - localLong.longValue() > yfM)
            break label362;
          yfL.put(localInteger, localObject);
          ab.e("MicroMsg.CheckReduplicatedAcitiv", "starting the same activity in %sms, [k:%s, v:%s], curr: %s", new Object[] { Integer.valueOf(yfM), paramArrayOfObject, localLong, localObject });
          paramBoolean = true;
          AppMethodBeat.o(105948);
          continue;
        }
      }
      finally
      {
      }
      paramContext = "None";
      continue;
      label362: if ((yfL.size() > 100) && (yfO != 0L) && (System.currentTimeMillis() - yfO > yfM))
        yfL.clear();
      yfL.put(localInteger, localObject);
      yfO = System.currentTimeMillis();
      ab.i("MicroMsg.CheckReduplicatedAcitiv", "check reduplicated cost %sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      paramBoolean = false;
      AppMethodBeat.o(105948);
    }
  }

  private static boolean aO(Intent paramIntent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(105950);
    if (paramIntent != null);
    try
    {
      if (paramIntent.getComponent() != null)
      {
        boolean bool2 = bo.isNullOrNil(paramIntent.getComponent().getClassName());
        if (!bool2);
      }
      else
      {
        AppMethodBeat.o(105950);
        bool1 = false;
      }
      while (true)
      {
        return bool1;
        if (Class.forName(paramIntent.getComponent().getClassName()).getAnnotation(b.class) == null)
          break;
        AppMethodBeat.o(105950);
      }
    }
    catch (Exception paramIntent)
    {
      while (true)
      {
        ab.e("MicroMsg.CheckReduplicatedAcitiv", "skipReduplicateCheck exception %s", new Object[] { paramIntent });
        AppMethodBeat.o(105950);
        bool1 = false;
        continue;
        AppMethodBeat.o(105950);
        bool1 = false;
      }
    }
  }

  private static String aqB(String paramString)
  {
    AppMethodBeat.i(105949);
    paramString = paramString.split("\\.");
    if (paramString.length > 0)
    {
      paramString = paramString[(paramString.length - 1)];
      AppMethodBeat.o(105949);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(105949);
    }
  }

  public static int dwu()
  {
    return yfM;
  }

  public static abstract interface a
  {
    public abstract void a(long paramLong, String paramString1, String paramString2);
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface b
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.d
 * JD-Core Version:    0.6.2
 */
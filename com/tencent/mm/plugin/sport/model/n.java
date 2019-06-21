package com.tencent.mm.plugin.sport.model;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sport.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.base.t;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONObject;

public final class n
{
  private static o rPQ;
  private static final String[] rPR;
  private static final Uri rPS;

  static
  {
    AppMethodBeat.i(93722);
    rPR = new String[] { "_id", "_begin_time", "_end_time", "_mode", "_steps" };
    rPS = Uri.parse("content://com.miui.providers.steps/item");
    AppMethodBeat.o(93722);
  }

  public static boolean Y(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(93712);
    long l1 = 3600000L;
    try
    {
      JSONObject localJSONObject = h.cwt().optJSONObject("stepCountUploadConfig");
      l2 = l1;
      if (localJSONObject != null)
      {
        int i = localJSONObject.optInt("backgroundTimeInterval", 60);
        l2 = i * 60 * 1000L;
      }
      boolean bool;
      if (paramLong2 - paramLong1 >= l2)
      {
        bool = true;
        AppMethodBeat.o(93712);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(93712);
      }
    }
    catch (Exception localException)
    {
      while (true)
        long l2 = l1;
    }
  }

  public static boolean Z(long paramLong1, long paramLong2)
  {
    int i = 500;
    AppMethodBeat.i(93713);
    boolean bool;
    if ((paramLong1 == 0L) && (paramLong2 > 0L))
    {
      AppMethodBeat.o(93713);
      bool = true;
    }
    while (true)
    {
      return bool;
      try
      {
        JSONObject localJSONObject = h.cwt().optJSONObject("stepCountUploadConfig");
        j = i;
        if (localJSONObject != null)
          j = localJSONObject.optInt("backgroundStepCountInterval", 500);
        if (paramLong2 - paramLong1 >= j)
        {
          AppMethodBeat.o(93713);
          bool = true;
          continue;
        }
        bool = false;
        AppMethodBeat.o(93713);
      }
      catch (Exception localException)
      {
        while (true)
          int j = i;
      }
    }
  }

  public static long[] ZV(String paramString)
  {
    AppMethodBeat.i(93720);
    paramString = paramString.split(",");
    long[] arrayOfLong = new long[paramString.length];
    arrayOfLong[0] = bo.getLong(paramString[0], 0L);
    arrayOfLong[1] = bo.getLong(paramString[1], 0L);
    arrayOfLong[2] = bo.getLong(paramString[2], 0L);
    arrayOfLong[3] = bo.getLong(paramString[3], 0L);
    arrayOfLong[4] = bo.getLong(paramString[4], 0L);
    arrayOfLong[5] = bo.getLong(paramString[5], 0L);
    arrayOfLong[6] = bo.getLong(paramString[6], 0L);
    AppMethodBeat.o(93720);
    return arrayOfLong;
  }

  public static boolean cvY()
  {
    AppMethodBeat.i(93717);
    ad localad = ((j)g.K(j.class)).XM().aoO("gh_43f2581f6fd6");
    if (localad != null);
    for (boolean bool = a.jh(localad.field_type); ; bool = false)
    {
      if (!bool)
        ab.i("MicroMsg.Sport.SportUtil", "checkUserInstallWeSportPlugin %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(93717);
      return bool;
    }
  }

  public static long cwC()
  {
    AppMethodBeat.i(93709);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    long l = localCalendar.getTimeInMillis();
    AppMethodBeat.o(93709);
    return l;
  }

  public static int cwD()
  {
    AppMethodBeat.i(93710);
    TimeZone localTimeZone = TimeZone.getDefault();
    int i = localTimeZone.getRawOffset() / 1000;
    if ((localTimeZone.useDaylightTime()) && (localTimeZone.inDaylightTime(new Date(System.currentTimeMillis()))));
    for (int j = 1; ; j = 0)
    {
      i /= 3600;
      AppMethodBeat.o(93710);
      return j + i;
    }
  }

  public static boolean cwE()
  {
    boolean bool = true;
    AppMethodBeat.i(93715);
    if (h.cwt().optInt("checkWeSportInstall") != 1)
    {
      ab.i("MicroMsg.Sport.SportUtil", "checkPushInstallWeSport is false");
      bool = false;
      AppMethodBeat.o(93715);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(93715);
    }
  }

  public static boolean cwF()
  {
    boolean bool = true;
    AppMethodBeat.i(93716);
    if (h.cwt().optInt("extStepApiSwitch") != 1)
    {
      ab.i("MicroMsg.Sport.SportUtil", "Not Support extStepApiSwitch is off");
      bool = false;
      AppMethodBeat.o(93716);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(93716);
    }
  }

  public static void cwG()
  {
    AppMethodBeat.i(93719);
    if (rPQ != null)
    {
      rPQ.dismiss();
      rPQ = null;
    }
    AppMethodBeat.o(93719);
  }

  // ERROR //
  public static int cwH()
  {
    // Byte code:
    //   0: ldc 220
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_0
    //   7: aconst_null
    //   8: astore_1
    //   9: invokestatic 225	com/tencent/mm/sdk/h/b:dqw	()Z
    //   12: ifeq +295 -> 307
    //   15: ldc 227
    //   17: invokestatic 233	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   20: astore_2
    //   21: aload_2
    //   22: invokevirtual 237	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   25: astore_3
    //   26: aload_2
    //   27: ldc 239
    //   29: iconst_2
    //   30: anewarray 229	java/lang/Class
    //   33: dup
    //   34: iconst_0
    //   35: ldc 21
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: getstatic 243	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   43: aastore
    //   44: invokevirtual 247	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   47: astore_2
    //   48: aload_2
    //   49: iconst_1
    //   50: invokevirtual 253	java/lang/reflect/Method:setAccessible	(Z)V
    //   53: aload_2
    //   54: aload_3
    //   55: iconst_2
    //   56: anewarray 4	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: ldc 255
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: getstatic 259	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   69: aastore
    //   70: invokevirtual 263	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   73: astore_3
    //   74: aload_3
    //   75: instanceof 136
    //   78: ifeq +229 -> 307
    //   81: aload_3
    //   82: checkcast 136	java/lang/Boolean
    //   85: invokevirtual 266	java/lang/Boolean:booleanValue	()Z
    //   88: ifeq +219 -> 307
    //   91: invokestatic 268	com/tencent/mm/plugin/sport/model/n:cwC	()J
    //   94: lstore 4
    //   96: invokestatic 274	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   99: invokevirtual 280	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   102: astore_3
    //   103: aload_3
    //   104: ifnull +203 -> 307
    //   107: aload_3
    //   108: getstatic 43	com/tencent/mm/plugin/sport/model/n:rPS	Landroid/net/Uri;
    //   111: getstatic 33	com/tencent/mm/plugin/sport/model/n:rPR	[Ljava/lang/String;
    //   114: ldc_w 282
    //   117: iconst_2
    //   118: anewarray 21	java/lang/String
    //   121: dup
    //   122: iconst_0
    //   123: lload 4
    //   125: invokestatic 285	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   128: aastore
    //   129: dup
    //   130: iconst_1
    //   131: lload 4
    //   133: ldc2_w 286
    //   136: ladd
    //   137: invokestatic 285	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   140: aastore
    //   141: ldc_w 289
    //   144: invokevirtual 295	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   147: astore_1
    //   148: aload_1
    //   149: ifnull +152 -> 301
    //   152: iconst_0
    //   153: istore 6
    //   155: aload_1
    //   156: astore_0
    //   157: aload_1
    //   158: invokeinterface 300 1 0
    //   163: ifeq +24 -> 187
    //   166: aload_1
    //   167: astore_0
    //   168: aload_1
    //   169: iconst_4
    //   170: invokeinterface 304 2 0
    //   175: istore 7
    //   177: iload 6
    //   179: iload 7
    //   181: iadd
    //   182: istore 6
    //   184: goto -29 -> 155
    //   187: iload 6
    //   189: istore 7
    //   191: aload_1
    //   192: ifnull +13 -> 205
    //   195: aload_1
    //   196: invokeinterface 307 1 0
    //   201: iload 6
    //   203: istore 7
    //   205: ldc 132
    //   207: ldc_w 309
    //   210: iconst_1
    //   211: anewarray 4	java/lang/Object
    //   214: dup
    //   215: iconst_0
    //   216: iload 7
    //   218: invokestatic 314	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   221: aastore
    //   222: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: ldc 220
    //   227: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   230: iload 7
    //   232: ireturn
    //   233: astore_3
    //   234: aconst_null
    //   235: astore_1
    //   236: iconst_0
    //   237: istore 6
    //   239: aload_1
    //   240: astore_0
    //   241: ldc 132
    //   243: aload_3
    //   244: ldc_w 316
    //   247: iconst_0
    //   248: anewarray 4	java/lang/Object
    //   251: invokestatic 320	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: iload 6
    //   256: istore 7
    //   258: aload_1
    //   259: ifnull -54 -> 205
    //   262: aload_1
    //   263: invokeinterface 307 1 0
    //   268: iload 6
    //   270: istore 7
    //   272: goto -67 -> 205
    //   275: astore_1
    //   276: aload_0
    //   277: ifnull +9 -> 286
    //   280: aload_0
    //   281: invokeinterface 307 1 0
    //   286: ldc 220
    //   288: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   291: aload_1
    //   292: athrow
    //   293: astore_1
    //   294: goto -18 -> 276
    //   297: astore_3
    //   298: goto -59 -> 239
    //   301: iconst_0
    //   302: istore 6
    //   304: goto -117 -> 187
    //   307: iconst_0
    //   308: istore 6
    //   310: goto -123 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   9	103	233	java/lang/Exception
    //   107	148	233	java/lang/Exception
    //   9	103	275	finally
    //   107	148	275	finally
    //   157	166	293	finally
    //   168	177	293	finally
    //   241	254	293	finally
    //   157	166	297	java/lang/Exception
    //   168	177	297	java/lang/Exception
  }

  public static void d(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(93718);
    if ((rPQ != null) && (rPQ.isShowing()))
      AppMethodBeat.o(93718);
    while (true)
    {
      return;
      if (k.aa(5, 1L) == 0L)
      {
        AppMethodBeat.o(93718);
      }
      else
      {
        if ((r.Yz().equals(paramString)) && (!((b)g.K(b.class)).eU(ah.getContext())))
          rPQ = t.a(paramActivity, ah.getContext().getString(2131303892), new n.1());
        AppMethodBeat.o(93718);
      }
    }
  }

  public static boolean eU(Context paramContext)
  {
    AppMethodBeat.i(93714);
    boolean bool;
    if (d.fP(19))
    {
      ab.i("MicroMsg.Sport.SportUtil", "Not Support SDK VERSION");
      AppMethodBeat.o(93714);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!paramContext.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter"))
      {
        ab.i("MicroMsg.Sport.SportUtil", "Not Support FEATURE_SENSOR_STEP_COUNTER");
        AppMethodBeat.o(93714);
        bool = false;
      }
      else if (((SensorManager)paramContext.getSystemService("sensor")).getDefaultSensor(19) == null)
      {
        ab.i("MicroMsg.Sport.SportUtil", "Not Support can not get sensor");
        AppMethodBeat.o(93714);
        bool = false;
      }
      else if (h.cwt().optInt("deviceStepSwitch") != 1)
      {
        ab.i("MicroMsg.Sport.SportUtil", "Not Support deviceStepSwitch is off");
        AppMethodBeat.o(93714);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(93714);
        bool = true;
      }
    }
  }

  public static final String fQ(long paramLong)
  {
    AppMethodBeat.i(93711);
    String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(paramLong));
    AppMethodBeat.o(93711);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.n
 * JD-Core Version:    0.6.2
 */
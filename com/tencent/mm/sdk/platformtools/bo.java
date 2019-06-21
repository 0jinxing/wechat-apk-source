package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RecentTaskInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashMap<Ljava.lang.String;Ljava.lang.String;>;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import junit.framework.Assert;

public final class bo
{
  private static final TimeZone GMT;
  public static final long[] gjH;
  private static final char[] iRk;
  private static final String[] iRl;
  private static final long[] xCg;
  private static final BigInteger xCh;

  static
  {
    AppMethodBeat.i(52439);
    gjH = new long[] { 300L, 200L, 300L, 200L };
    xCg = new long[] { 300L, 50L, 300L, 50L };
    GMT = TimeZone.getTimeZone("GMT");
    xCh = BigInteger.ONE.shiftLeft(64);
    iRk = new char[] { 60, 62, 34, 39, 38, 13, 10, 32, 9 };
    iRl = new String[] { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&#x0D;", "&#x0A;", "&#x20;", "&#x09;" };
    AppMethodBeat.o(52439);
  }

  public static boolean A(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9'));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean B(Object paramObject1, Object paramObject2)
  {
    boolean bool = true;
    AppMethodBeat.i(52421);
    if (paramObject1 == paramObject2);
    while (true)
    {
      AppMethodBeat.o(52421);
      return bool;
      if ((paramObject1 == null) || (paramObject2 == null) || (!paramObject1.equals(paramObject2)))
        bool = false;
    }
  }

  public static boolean C(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(52432);
    boolean bool;
    if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2))))
    {
      bool = true;
      AppMethodBeat.o(52432);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52432);
    }
  }

  public static String F(double paramDouble)
  {
    AppMethodBeat.i(52438);
    String str = String.format("%.2f", new Object[] { Double.valueOf(paramDouble) });
    AppMethodBeat.o(52438);
    return str;
  }

  public static List<ResolveInfo> H(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(52341);
    if ((paramContext == null) || (paramIntent == null))
    {
      paramContext = null;
      AppMethodBeat.o(52341);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536);
      AppMethodBeat.o(52341);
    }
  }

  public static Intent I(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(52435);
    paramContext = paramContext.getPackageManager().queryIntentServices(paramIntent, 0);
    if ((paramContext == null) || (paramContext.size() != 1))
    {
      paramContext = null;
      AppMethodBeat.o(52435);
    }
    while (true)
    {
      return paramContext;
      Object localObject = (ResolveInfo)paramContext.get(0);
      paramContext = ((ResolveInfo)localObject).serviceInfo.packageName;
      localObject = ((ResolveInfo)localObject).serviceInfo.name;
      ab.d("MicroMsg.Util", "createExplicitFromImplicitIntent pa:%s, cl:%s", new Object[] { paramContext, localObject });
      localObject = new ComponentName(paramContext, (String)localObject);
      paramContext = new Intent(paramIntent);
      paramContext.setComponent((ComponentName)localObject);
      AppMethodBeat.o(52435);
    }
  }

  public static String I(InputStream paramInputStream)
  {
    AppMethodBeat.i(52399);
    if (paramInputStream == null)
    {
      paramInputStream = null;
      AppMethodBeat.o(52399);
    }
    while (true)
    {
      return paramInputStream;
      StringBuffer localStringBuffer = new StringBuffer();
      try
      {
        byte[] arrayOfByte = new byte[4096];
        while (true)
        {
          int i = paramInputStream.read(arrayOfByte);
          if (i == -1)
            break;
          String str = new java/lang/String;
          str.<init>(arrayOfByte, 0, i);
          localStringBuffer.append(str);
        }
      }
      catch (Exception localException)
      {
        localException = localException;
        try
        {
          paramInputStream.close();
          while (true)
          {
            paramInputStream = localStringBuffer.toString();
            AppMethodBeat.o(52399);
            break;
            try
            {
              paramInputStream.close();
            }
            catch (IOException paramInputStream)
            {
              ab.printErrStackTrace("MicroMsg.Util", paramInputStream, "", new Object[0]);
            }
          }
        }
        catch (IOException paramInputStream)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.Util", paramInputStream, "", new Object[0]);
        }
      }
      finally
      {
      }
    }
    try
    {
      paramInputStream.close();
      AppMethodBeat.o(52399);
      throw localObject;
    }
    catch (IOException paramInputStream)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Util", paramInputStream, "", new Object[0]);
    }
  }

  public static boolean L(long paramLong1, long paramLong2)
  {
    boolean bool = true;
    AppMethodBeat.i(52329);
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTimeInMillis(paramLong1);
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.setTimeInMillis(paramLong2);
    if ((localCalendar1.get(1) == localCalendar2.get(1)) && (localCalendar1.get(5) == localCalendar2.get(5)) && (localCalendar1.get(2) == localCalendar2.get(2)))
      AppMethodBeat.o(52329);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52329);
    }
  }

  public static boolean M(Context paramContext, String paramString)
  {
    AppMethodBeat.i(52374);
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    boolean bool;
    if (!k(paramContext, localIntent))
    {
      ab.e("MicroMsg.Util", "jump to url failed, ".concat(String.valueOf(paramString)));
      bool = false;
      AppMethodBeat.o(52374);
    }
    while (true)
    {
      return bool;
      paramContext.startActivity(localIntent);
      bool = true;
      AppMethodBeat.o(52374);
    }
  }

  public static String Mb(int paramInt)
  {
    AppMethodBeat.i(52423);
    Random localRandom = new Random();
    Object localObject = new StringBuffer();
    for (int i = 0; i < paramInt; i++)
      ((StringBuffer)localObject).append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(localRandom.nextInt(62)));
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(52423);
    return localObject;
  }

  public static ArrayList<String> P(String[] paramArrayOfString)
  {
    AppMethodBeat.i(52297);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      paramArrayOfString = null;
      AppMethodBeat.o(52297);
    }
    while (true)
    {
      return paramArrayOfString;
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramArrayOfString.length; i++)
        localArrayList.add(paramArrayOfString[i]);
      AppMethodBeat.o(52297);
      paramArrayOfString = localArrayList;
    }
  }

  public static String PA(String paramString)
  {
    AppMethodBeat.i(52396);
    paramString = paramString.replaceAll("[\\.\\-]", "").trim();
    AppMethodBeat.o(52396);
    return paramString;
  }

  public static boolean Q(String[] paramArrayOfString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(52355);
    int i = paramArrayOfString.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (isNullOrNil(paramArrayOfString[j]))
          bool2 = true;
      }
      else
      {
        AppMethodBeat.o(52355);
        return bool2;
      }
    }
  }

  public static String W(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(52317);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = "(null)";
      AppMethodBeat.o(52317);
      return paramArrayOfByte;
    }
    int i = paramInt;
    if (paramInt <= 0)
      i = paramArrayOfByte.length;
    char[] arrayOfChar1 = new char[16];
    char[] tmp37_36 = arrayOfChar1;
    tmp37_36[0] = 48;
    char[] tmp43_37 = tmp37_36;
    tmp43_37[1] = 49;
    char[] tmp49_43 = tmp43_37;
    tmp49_43[2] = 50;
    char[] tmp55_49 = tmp49_43;
    tmp55_49[3] = 51;
    char[] tmp61_55 = tmp55_49;
    tmp61_55[4] = 52;
    char[] tmp67_61 = tmp61_55;
    tmp67_61[5] = 53;
    char[] tmp73_67 = tmp67_61;
    tmp73_67[6] = 54;
    char[] tmp80_73 = tmp73_67;
    tmp80_73[7] = 55;
    char[] tmp87_80 = tmp80_73;
    tmp87_80[8] = 56;
    char[] tmp94_87 = tmp87_80;
    tmp94_87[9] = 57;
    char[] tmp101_94 = tmp94_87;
    tmp101_94[10] = 97;
    char[] tmp108_101 = tmp101_94;
    tmp108_101[11] = 98;
    char[] tmp115_108 = tmp108_101;
    tmp115_108[12] = 99;
    char[] tmp122_115 = tmp115_108;
    tmp122_115[13] = 100;
    char[] tmp129_122 = tmp122_115;
    tmp129_122[14] = 101;
    char[] tmp136_129 = tmp129_122;
    tmp136_129[15] = 102;
    tmp136_129;
    char[] arrayOfChar2 = new char[i * 3 + i / 16];
    int j = 0;
    paramInt = 0;
    label161: if (j < i + 0)
    {
      int k = paramArrayOfByte[j];
      int m = paramInt + 1;
      arrayOfChar2[paramInt] = ((char)32);
      int n = m + 1;
      arrayOfChar2[m] = ((char)arrayOfChar1[(k >>> 4 & 0xF)]);
      paramInt = n + 1;
      arrayOfChar2[n] = ((char)arrayOfChar1[(k & 0xF)]);
      if ((j % 16 != 0) || (j <= 0))
        break label279;
      k = paramInt + 1;
      arrayOfChar2[paramInt] = ((char)10);
      paramInt = k;
    }
    label279: 
    while (true)
    {
      j++;
      break label161;
      paramArrayOfByte = new String(arrayOfChar2);
      AppMethodBeat.o(52317);
      break;
    }
  }

  public static int a(Integer paramInteger, int paramInt)
  {
    AppMethodBeat.i(52347);
    if (paramInteger == null)
      AppMethodBeat.o(52347);
    while (true)
    {
      return paramInt;
      paramInt = paramInteger.intValue();
      AppMethodBeat.o(52347);
    }
  }

  private static int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(52377);
    if (paramInt2 <= 0)
    {
      AppMethodBeat.o(52377);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      if (paramArrayOfChar[paramInt1] == '#')
      {
        String str;
        if ((paramInt2 > 1) && ((paramArrayOfChar[(paramInt1 + 1)] == 'x') || (paramArrayOfChar[(paramInt1 + 1)] == 'X')))
          try
          {
            str = new java/lang/String;
            str.<init>(paramArrayOfChar, paramInt1 + 2, paramInt2 - 2);
            paramInt1 = Integer.parseInt(str, 16);
            AppMethodBeat.o(52377);
          }
          catch (NumberFormatException paramArrayOfChar)
          {
            AppMethodBeat.o(52377);
            paramInt1 = i;
          }
        else
          try
          {
            str = new java/lang/String;
            str.<init>(paramArrayOfChar, paramInt1 + 1, paramInt2 - 1);
            paramInt1 = Integer.parseInt(str, 10);
            AppMethodBeat.o(52377);
          }
          catch (NumberFormatException paramArrayOfChar)
          {
            AppMethodBeat.o(52377);
            paramInt1 = i;
          }
      }
      else
      {
        new String(paramArrayOfChar, paramInt1, paramInt2);
        AppMethodBeat.o(52377);
        paramInt1 = i;
      }
    }
  }

  public static long a(Long paramLong, long paramLong1)
  {
    AppMethodBeat.i(52348);
    if (paramLong == null)
      AppMethodBeat.o(52348);
    while (true)
    {
      return paramLong1;
      paramLong1 = paramLong.longValue();
      AppMethodBeat.o(52348);
    }
  }

  // ERROR //
  private static String a(Context paramContext, Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc_w 381
    //   6: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokevirtual 385	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   13: aload_1
    //   14: iconst_1
    //   15: anewarray 74	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: ldc_w 387
    //   23: aastore
    //   24: aload_2
    //   25: aload_3
    //   26: aconst_null
    //   27: invokevirtual 393	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore_0
    //   31: aload_0
    //   32: ifnull +95 -> 127
    //   35: aload_0
    //   36: invokeinterface 399 1 0
    //   41: ifeq +86 -> 127
    //   44: aload_0
    //   45: ldc_w 387
    //   48: invokeinterface 403 2 0
    //   53: istore 5
    //   55: iload 5
    //   57: iconst_m1
    //   58: if_icmpne +37 -> 95
    //   61: ldc 175
    //   63: ldc_w 405
    //   66: invokestatic 280	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   69: aload_0
    //   70: invokeinterface 406 1 0
    //   75: aload_0
    //   76: ifnull +9 -> 85
    //   79: aload_0
    //   80: invokeinterface 406 1 0
    //   85: ldc_w 381
    //   88: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   91: aconst_null
    //   92: astore_0
    //   93: aload_0
    //   94: areturn
    //   95: aload_0
    //   96: iload 5
    //   98: invokeinterface 409 2 0
    //   103: astore_2
    //   104: aload_2
    //   105: astore_1
    //   106: aload_0
    //   107: ifnull +9 -> 116
    //   110: aload_0
    //   111: invokeinterface 406 1 0
    //   116: ldc_w 381
    //   119: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload_1
    //   123: astore_0
    //   124: goto -31 -> 93
    //   127: aload_0
    //   128: ifnull +9 -> 137
    //   131: aload_0
    //   132: invokeinterface 406 1 0
    //   137: ldc_w 381
    //   140: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aconst_null
    //   144: astore_0
    //   145: goto -52 -> 93
    //   148: astore_0
    //   149: aload 4
    //   151: astore_0
    //   152: aload_1
    //   153: invokevirtual 412	android/net/Uri:getPath	()Ljava/lang/String;
    //   156: astore_2
    //   157: aload_2
    //   158: astore_1
    //   159: bipush 24
    //   161: invokestatic 418	com/tencent/mm/compatible/util/d:iW	(I)Z
    //   164: ifeq +13 -> 177
    //   167: aload_2
    //   168: ldc_w 420
    //   171: ldc 230
    //   173: invokevirtual 424	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   176: astore_1
    //   177: aload_0
    //   178: ifnull +9 -> 187
    //   181: aload_0
    //   182: invokeinterface 406 1 0
    //   187: ldc_w 381
    //   190: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   193: aload_1
    //   194: astore_0
    //   195: goto -102 -> 93
    //   198: astore_1
    //   199: aconst_null
    //   200: astore_0
    //   201: aload_0
    //   202: ifnull +9 -> 211
    //   205: aload_0
    //   206: invokeinterface 406 1 0
    //   211: ldc_w 381
    //   214: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: aload_1
    //   218: athrow
    //   219: astore_1
    //   220: goto -19 -> 201
    //   223: astore_1
    //   224: goto -23 -> 201
    //   227: astore_2
    //   228: goto -76 -> 152
    //
    // Exception table:
    //   from	to	target	type
    //   9	31	148	java/lang/Exception
    //   9	31	198	finally
    //   35	55	219	finally
    //   61	75	219	finally
    //   95	104	219	finally
    //   152	157	223	finally
    //   159	177	223	finally
    //   35	55	227	java/lang/Exception
    //   61	75	227	java/lang/Exception
    //   95	104	227	java/lang/Exception
  }

  public static String a(LinkedHashMap<String, String> paramLinkedHashMap)
  {
    AppMethodBeat.i(52378);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<key>");
    Iterator localIterator = paramLinkedHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramLinkedHashMap = (Map.Entry)localIterator.next();
      Object localObject1 = paramLinkedHashMap.getKey();
      Object localObject2 = paramLinkedHashMap.getValue();
      paramLinkedHashMap = (LinkedHashMap<String, String>)localObject1;
      if (localObject1 == null)
        paramLinkedHashMap = "unknow";
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = "unknow";
      localStringBuilder.append("<" + paramLinkedHashMap + ">");
      localStringBuilder.append(localObject1);
      localStringBuilder.append("</" + paramLinkedHashMap + ">");
    }
    localStringBuilder.append("</key>");
    paramLinkedHashMap = localStringBuilder.toString();
    AppMethodBeat.o(52378);
    return paramLinkedHashMap;
  }

  public static boolean a(Boolean paramBoolean, boolean paramBoolean1)
  {
    AppMethodBeat.i(52349);
    if (paramBoolean == null)
      AppMethodBeat.o(52349);
    while (true)
    {
      return paramBoolean1;
      paramBoolean1 = paramBoolean.booleanValue();
      AppMethodBeat.o(52349);
    }
  }

  public static String aC(float paramFloat)
  {
    AppMethodBeat.i(52419);
    String str;
    if (paramFloat < 1024.0F)
    {
      str = String.format("%.1fB", new Object[] { Float.valueOf(paramFloat) });
      AppMethodBeat.o(52419);
    }
    while (true)
    {
      return str;
      if (paramFloat < 1048576.0F)
      {
        str = String.format("%.1fKB", new Object[] { Float.valueOf(paramFloat / 1024.0F) });
        AppMethodBeat.o(52419);
      }
      else if (paramFloat < 1.073742E+009F)
      {
        str = String.format("%.1fMB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F) });
        AppMethodBeat.o(52419);
      }
      else
      {
        str = String.format("%.1fGB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F / 1024.0F) });
        AppMethodBeat.o(52419);
      }
    }
  }

  public static boolean ac(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(52354);
    boolean bool;
    if ((paramCharSequence == null) || (paramCharSequence.length() <= 0))
    {
      bool = true;
      AppMethodBeat.o(52354);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52354);
    }
  }

  public static CharSequence ad(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(52395);
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramCharSequence.length(); i++)
    {
      char c = paramCharSequence.charAt(i);
      if ((c >= '0') && (c <= '9'))
        localStringBuffer.append(c);
    }
    paramCharSequence = localStringBuffer.toString();
    AppMethodBeat.o(52395);
    return paramCharSequence;
  }

  public static boolean af(long paramLong1, long paramLong2)
  {
    if (paramLong1 == paramLong2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String amS(String paramString)
  {
    AppMethodBeat.i(52294);
    String str = paramString;
    if (paramString != null)
      str = paramString.replace("../", "");
    AppMethodBeat.o(52294);
    return str;
  }

  public static boolean amT(String paramString)
  {
    AppMethodBeat.i(52305);
    boolean bool;
    if (isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(52305);
    }
    while (true)
    {
      return bool;
      bool = Pattern.compile("[\\u4e00-\\u9fa5]+").matcher(paramString).find();
      AppMethodBeat.o(52305);
    }
  }

  public static boolean amU(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(52306);
    paramString = paramString.toCharArray();
    int i = paramString.length;
    int j = 0;
    if (j < i)
    {
      int k = paramString[j];
      if (((k < 97) || (k > 122)) && ((k < 65) || (k > 90)))
        AppMethodBeat.o(52306);
    }
    while (true)
    {
      return bool;
      j++;
      break;
      bool = true;
      AppMethodBeat.o(52306);
    }
  }

  public static boolean amV(String paramString)
  {
    AppMethodBeat.i(52307);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(52307);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramString = paramString.trim();
      try
      {
        long l = Long.valueOf(paramString).longValue();
        if ((l <= 0L) || (l > 4294967295L))
          break label89;
        bool = true;
        AppMethodBeat.o(52307);
      }
      catch (NumberFormatException paramString)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(52307);
        bool = false;
      }
      continue;
      label89: AppMethodBeat.o(52307);
      bool = false;
    }
  }

  public static boolean amW(String paramString)
  {
    AppMethodBeat.i(52308);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(52308);
    }
    while (true)
    {
      return bool;
      bool = paramString.trim().matches("^[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
      AppMethodBeat.o(52308);
    }
  }

  public static boolean amX(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(52310);
    if (paramString == null)
      AppMethodBeat.o(52310);
    while (true)
    {
      return bool;
      paramString = paramString.trim();
      if ((paramString.length() < 6) || (paramString.length() > 20))
      {
        AppMethodBeat.o(52310);
      }
      else if (!z(paramString.charAt(0)))
      {
        AppMethodBeat.o(52310);
      }
      else
      {
        for (int i = 0; ; i++)
        {
          if (i >= paramString.length())
            break label129;
          char c = paramString.charAt(i);
          if ((!z(c)) && (!A(c)) && (c != '-') && (c != '_'))
          {
            AppMethodBeat.o(52310);
            break;
          }
        }
        label129: bool = true;
        AppMethodBeat.o(52310);
      }
    }
  }

  public static boolean amY(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(52311);
    if (paramString == null)
      AppMethodBeat.o(52311);
    while (true)
    {
      return bool;
      if (paramString.length() < 8)
        AppMethodBeat.o(52311);
      else
        try
        {
          Long.parseLong(paramString);
          AppMethodBeat.o(52311);
        }
        catch (NumberFormatException paramString)
        {
          bool = true;
          AppMethodBeat.o(52311);
        }
    }
  }

  public static int amZ(String paramString)
  {
    AppMethodBeat.i(52356);
    int i;
    if (paramString == null)
    {
      i = -1;
      AppMethodBeat.o(52356);
    }
    while (true)
    {
      return i;
      i = paramString.length();
      AppMethodBeat.o(52356);
    }
  }

  public static byte[] an(Bitmap paramBitmap)
  {
    AppMethodBeat.i(52309);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    ab.i("MicroMsg.Util", "recycle bitmap:%s", new Object[] { paramBitmap });
    paramBitmap.recycle();
    paramBitmap = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      AppMethodBeat.o(52309);
      return paramBitmap;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Util", localException, "", new Object[0]);
    }
  }

  public static String anA(String paramString)
  {
    AppMethodBeat.i(52425);
    if (isNullOrNil(paramString))
      AppMethodBeat.o(52425);
    while (true)
    {
      return paramString;
      paramString = paramString.replaceAll("‮", "");
      AppMethodBeat.o(52425);
    }
  }

  public static final String anB(String paramString)
  {
    AppMethodBeat.i(52427);
    if (isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(52427);
    }
    while (true)
    {
      return paramString;
      paramString = Uri.parse(paramString).getHost();
      AppMethodBeat.o(52427);
    }
  }

  public static long anT()
  {
    AppMethodBeat.i(52322);
    long l = System.currentTimeMillis() / 1000L;
    AppMethodBeat.o(52322);
    return l;
  }

  public static long anU()
  {
    AppMethodBeat.i(138337);
    long l = System.currentTimeMillis();
    AppMethodBeat.o(138337);
    return l;
  }

  public static int ana(String paramString)
  {
    AppMethodBeat.i(52357);
    int i;
    if (paramString == null)
    {
      i = -1;
      AppMethodBeat.o(52357);
    }
    while (true)
    {
      return i;
      i = paramString.getBytes(Charset.forName("UTF-8")).length;
      AppMethodBeat.o(52357);
    }
  }

  public static int anb(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(52358);
    if (isNullOrNil(paramString))
      AppMethodBeat.o(52358);
    while (true)
    {
      return i;
      try
      {
        SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
        localSimpleDateFormat.<init>("yyyy-MM-dd");
        long l = localSimpleDateFormat.parse(paramString).getTime() / 1000L;
        i = (int)l;
        AppMethodBeat.o(52358);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(52358);
      }
    }
  }

  public static int anc(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(52365);
    if (paramString == null)
      AppMethodBeat.o(52365);
    while (true)
    {
      return i;
      try
      {
        long l = Long.decode(paramString).longValue();
        i = (int)(l & 0xFFFFFFFF);
        AppMethodBeat.o(52365);
      }
      catch (NumberFormatException paramString)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(52365);
      }
    }
  }

  public static String and(String paramString)
  {
    AppMethodBeat.i(52367);
    String str = paramString;
    if (paramString == null)
      str = "";
    if (str.length() <= 16)
    {
      paramString = g.x(str.getBytes());
      AppMethodBeat.o(52367);
    }
    while (true)
    {
      return paramString;
      paramString = g.x(str.substring(0, 16).getBytes());
      AppMethodBeat.o(52367);
    }
  }

  public static String ane(String paramString)
  {
    AppMethodBeat.i(138335);
    paramString = g.x(paramString.getBytes());
    AppMethodBeat.o(138335);
    return paramString;
  }

  public static byte[] anf(String paramString)
  {
    AppMethodBeat.i(52370);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = new byte[0];
      AppMethodBeat.o(52370);
    }
    while (true)
    {
      return paramString;
      try
      {
        byte[] arrayOfByte = new byte[paramString.length() / 2];
        for (int i = 0; i < arrayOfByte.length; i++)
          arrayOfByte[i] = ((byte)(byte)(Integer.parseInt(paramString.substring(i * 2, i * 2 + 2), 16) & 0xFF));
        AppMethodBeat.o(52370);
        paramString = arrayOfByte;
      }
      catch (NumberFormatException paramString)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        paramString = new byte[0];
        AppMethodBeat.o(52370);
      }
    }
  }

  public static int[] ang(String paramString)
  {
    AppMethodBeat.i(52371);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(52371);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.split(":");
      ArrayList localArrayList = new ArrayList();
      int i = paramString.length;
      int j = 0;
      while (true)
        if (j < i)
        {
          String str = paramString[j];
          if ((str != null) && (str.length() > 0));
          try
          {
            localArrayList.add(Integer.valueOf(Integer.valueOf(str).intValue()));
            j++;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.Util", localException, "", new Object[0]);
              ab.e("MicroMsg.Util", "invalid port num, ignore");
            }
          }
        }
      paramString = new int[localArrayList.size()];
      for (j = 0; j < paramString.length; j++)
        paramString[j] = ((Integer)localArrayList.get(j)).intValue();
      AppMethodBeat.o(52371);
    }
  }

  public static final String anh(String paramString)
  {
    AppMethodBeat.i(52373);
    if (isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(52373);
    }
    while (true)
    {
      return paramString;
      try
      {
        Object localObject = new java/net/URL;
        ((URL)localObject).<init>(paramString);
        localObject = ((URL)localObject).getHost();
        paramString = (String)localObject;
        AppMethodBeat.o(52373);
      }
      catch (MalformedURLException localMalformedURLException)
      {
        ab.printErrStackTrace("MicroMsg.Util", localMalformedURLException, "", new Object[0]);
        ab.w("MicroMsg.Util", "get host error");
        AppMethodBeat.o(52373);
      }
    }
  }

  public static String ani(String paramString)
  {
    AppMethodBeat.i(52375);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(52375);
    }
    while (true)
    {
      return paramString;
      StringBuffer localStringBuffer = new StringBuffer();
      int i = paramString.length();
      int j = 0;
      if (j < i)
      {
        char c = paramString.charAt(j);
        int k = 1;
        for (int m = iRk.length - 1; ; m--)
        {
          int n = k;
          if (m >= 0)
          {
            if (iRk[m] == c)
            {
              localStringBuffer.append(iRl[m]);
              n = 0;
            }
          }
          else
          {
            m = n;
            if (j == i - 1)
            {
              m = n;
              if (Character.isHighSurrogate(c))
                m = 0;
            }
            if (m != 0)
              localStringBuffer.append(c);
            j++;
            break;
          }
        }
      }
      paramString = localStringBuffer.toString();
      AppMethodBeat.o(52375);
    }
  }

  public static String anj(String paramString)
  {
    AppMethodBeat.i(52376);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(52376);
      return paramString;
    }
    char[] arrayOfChar;
    int j;
    int k;
    int m;
    label50: char c;
    int n;
    if (Build.VERSION.SDK_INT < 8)
    {
      int i = paramString.length();
      arrayOfChar = new char[i];
      j = 0;
      k = 0;
      m = -1;
      if (j < i)
      {
        c = paramString.charAt(j);
        n = k + 1;
        arrayOfChar[k] = c;
        if ((c == '&') && (m == -1))
        {
          k = n;
          m = n;
          n = k;
        }
      }
    }
    while (true)
    {
      label99: j++;
      k = n;
      break label50;
      if ((m != -1) && (!Character.isLetter(c)) && (!Character.isDigit(c)) && (c != '#'))
      {
        if (c == ';')
        {
          k = a(arrayOfChar, m, n - m - 1);
          if (k > 65535)
          {
            n = k - 65536;
            arrayOfChar[(m - 1)] = ((char)(char)((n >> 10) + 55296));
            arrayOfChar[m] = ((char)(char)((n & 0x3FF) + 56320));
            m++;
          }
        }
        while (true)
        {
          n = m;
          m = -1;
          break label99;
          if (k != 0)
          {
            arrayOfChar[(m - 1)] = ((char)(char)k);
            continue;
            m = -1;
            break label99;
            paramString = new String(arrayOfChar, 0, k);
            AppMethodBeat.o(52376);
            break;
            AppMethodBeat.o(52376);
            break;
          }
          m = n;
        }
      }
    }
  }

  public static int ank(String paramString)
  {
    AppMethodBeat.i(52379);
    int i = 0;
    try
    {
      j = Integer.parseInt(paramString);
      AppMethodBeat.o(52379);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        int j = i;
        if (paramString != null)
        {
          ab.e("MicroMsg.Util", "parserInt error ".concat(String.valueOf(paramString)));
          j = i;
        }
      }
    }
  }

  public static long anl(String paramString)
  {
    AppMethodBeat.i(52380);
    long l1 = 0L;
    try
    {
      l2 = Long.parseLong(paramString);
      AppMethodBeat.o(52380);
      return l2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l2 = l1;
        if (paramString != null)
        {
          ab.e("MicroMsg.Util", "parseLong error ".concat(String.valueOf(paramString)));
          l2 = l1;
        }
      }
    }
  }

  public static double anm(String paramString)
  {
    AppMethodBeat.i(52381);
    double d1 = 0.0D;
    try
    {
      d2 = Double.parseDouble(paramString);
      AppMethodBeat.o(52381);
      return d2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        double d2 = d1;
        if (paramString != null)
        {
          ab.e("MicroMsg.Util", "parseDouble error ".concat(String.valueOf(paramString)));
          d2 = d1;
        }
      }
    }
  }

  public static float ann(String paramString)
  {
    AppMethodBeat.i(52382);
    float f1 = 0.0F;
    try
    {
      f2 = Float.parseFloat(paramString);
      AppMethodBeat.o(52382);
      return f2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        float f2 = f1;
        if (paramString != null)
        {
          ab.e("MicroMsg.Util", "parseFloat error ".concat(String.valueOf(paramString)));
          f2 = f1;
        }
      }
    }
  }

  public static byte[] ano(String paramString)
  {
    AppMethodBeat.i(52391);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.Util", "httpGet, url is null");
      paramString = null;
      AppMethodBeat.o(52391);
    }
    while (true)
    {
      return paramString;
      if (URLUtil.isDataUrl(paramString))
      {
        paramString = anr(paramString);
        AppMethodBeat.o(52391);
      }
      else if (URLUtil.isHttpsUrl(paramString))
      {
        paramString = anq(paramString);
        AppMethodBeat.o(52391);
      }
      else
      {
        paramString = anp(paramString);
        AppMethodBeat.o(52391);
      }
    }
  }

  private static byte[] anp(String paramString)
  {
    AppMethodBeat.i(52392);
    try
    {
      Object localObject = new java/net/URL;
      ((URL)localObject).<init>(paramString);
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)((URL)localObject).openConnection();
      localHttpURLConnection.setRequestMethod("GET");
      int i = localHttpURLConnection.getResponseCode();
      if (i != 200)
      {
        ab.e("MicroMsg.Util", "http get response code = %d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(52392);
        paramString = null;
      }
      while (true)
      {
        return paramString;
        localObject = new java/io/BufferedInputStream;
        ((BufferedInputStream)localObject).<init>(localHttpURLConnection.getInputStream());
        ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        paramString = new byte[4096];
        for (i = ((BufferedInputStream)localObject).read(paramString); i > 0; i = ((BufferedInputStream)localObject).read(paramString))
          localByteArrayOutputStream.write(paramString, 0, i);
        paramString = localByteArrayOutputStream.toByteArray();
        ((BufferedInputStream)localObject).close();
        localByteArrayOutputStream.close();
        localHttpURLConnection.disconnect();
        AppMethodBeat.o(52392);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Util", "http download failed : %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(52392);
        paramString = null;
      }
    }
  }

  private static byte[] anq(String paramString)
  {
    AppMethodBeat.i(52393);
    try
    {
      Object localObject = new java/net/URL;
      ((URL)localObject).<init>(paramString);
      paramString = (HttpsURLConnection)((URL)localObject).openConnection();
      paramString.setRequestMethod("GET");
      int i = paramString.getResponseCode();
      if (i != 200)
      {
        ab.e("MicroMsg.Util", "https get response code = %d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(52393);
        paramString = null;
      }
      while (true)
      {
        return paramString;
        localObject = new java/io/BufferedInputStream;
        ((BufferedInputStream)localObject).<init>(paramString.getInputStream());
        ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        paramString = new byte[4096];
        for (i = ((BufferedInputStream)localObject).read(paramString); i > 0; i = ((BufferedInputStream)localObject).read(paramString))
          localByteArrayOutputStream.write(paramString, 0, i);
        paramString = localByteArrayOutputStream.toByteArray();
        ((BufferedInputStream)localObject).close();
        localByteArrayOutputStream.close();
        AppMethodBeat.o(52393);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Util", "getHttpsData failed : %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(52393);
        paramString = null;
      }
    }
  }

  private static byte[] anr(String paramString)
  {
    AppMethodBeat.i(52394);
    try
    {
      int i = paramString.indexOf("base64");
      String str = paramString;
      if (i > 0)
        str = paramString.substring(i + 7);
      paramString = Base64.decode(str, 0);
      AppMethodBeat.o(52394);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Util", "decode base64 url failed : %s", new Object[] { paramString.getMessage() });
        paramString = null;
        AppMethodBeat.o(52394);
      }
    }
  }

  public static String ans(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(52397);
    if ((isNullOrNil(paramString)) || (paramString.startsWith("+")))
    {
      paramString = "";
      AppMethodBeat.o(52397);
    }
    while (true)
    {
      return paramString;
      if (paramString.length() > 5)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append(paramString.subSequence(0, 3));
        if (i < paramString.length() - 5)
        {
          char c = paramString.charAt(i + 3);
          if ((c >= '0') && (c <= '9'))
            localStringBuffer.append('*');
          while (true)
          {
            i++;
            break;
            localStringBuffer.append(c);
          }
        }
        localStringBuffer.append(paramString.charAt(paramString.length() - 2));
        localStringBuffer.append(paramString.charAt(paramString.length() - 1));
        paramString = localStringBuffer.toString();
        AppMethodBeat.o(52397);
      }
      else
      {
        AppMethodBeat.o(52397);
      }
    }
  }

  public static Boolean ant(String paramString)
  {
    AppMethodBeat.i(52398);
    Matcher localMatcher = Pattern.compile("^[+][0-9]{10,13}$").matcher(paramString);
    paramString = Pattern.compile("^1[0-9]{10}$").matcher(paramString);
    if ((localMatcher.matches()) || (paramString.matches()));
    for (boolean bool = true; ; bool = false)
    {
      AppMethodBeat.o(52398);
      return Boolean.valueOf(bool);
    }
  }

  public static String anu(String paramString)
  {
    AppMethodBeat.i(52400);
    if ((paramString != null) && (paramString.length() > 0))
    {
      int i = paramString.lastIndexOf("@");
      if (i != -1)
      {
        paramString = paramString.substring(0, i);
        AppMethodBeat.o(52400);
      }
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(52400);
    }
  }

  public static String anv(String paramString)
  {
    AppMethodBeat.i(52401);
    if (isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(52401);
    }
    while (true)
    {
      return paramString;
      int i = paramString.length();
      if (i < 4)
      {
        paramString = "*~".concat(String.valueOf(i));
        AppMethodBeat.o(52401);
      }
      else if (i < 8)
      {
        paramString = paramString.substring(0, 1) + "*" + paramString.substring(i - 2, i - 1) + "~" + i;
        AppMethodBeat.o(52401);
      }
      else
      {
        paramString = paramString.substring(0, 2) + "*" + paramString.substring(i - 3, i - 1) + "~" + i;
        AppMethodBeat.o(52401);
      }
    }
  }

  public static boolean anw(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(52407);
    if (isNullOrNil(paramString))
      AppMethodBeat.o(52407);
    while (true)
    {
      return bool;
      try
      {
        File localFile = new java/io/File;
        localFile.<init>(paramString);
        paramString = localFile.getCanonicalPath();
        if (!paramString.contains("/com.tencent.mm/cache/"))
          break label68;
        AppMethodBeat.o(52407);
        bool = true;
      }
      catch (IOException paramString)
      {
        AppMethodBeat.o(52407);
      }
      continue;
      label68: if (!paramString.contains("/com.tencent.mm/"))
      {
        AppMethodBeat.o(52407);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(52407);
      }
    }
  }

  public static boolean anx(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(52408);
    if (isNullOrNil(paramString))
      AppMethodBeat.o(52408);
    while (true)
    {
      return bool;
      int i = paramString.lastIndexOf(".");
      if (i == -1)
      {
        AppMethodBeat.o(52408);
      }
      else
      {
        bool = any(paramString.substring(i + 1));
        AppMethodBeat.o(52408);
      }
    }
  }

  public static boolean any(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(52409);
    if (isNullOrNil(paramString))
      AppMethodBeat.o(52409);
    while (true)
    {
      return bool;
      paramString = paramString.toLowerCase();
      if ((paramString.equals("webp")) && (Build.VERSION.SDK_INT >= 14))
      {
        AppMethodBeat.o(52409);
        bool = true;
      }
      else if ((paramString.equals("heic")) && (Build.VERSION.SDK_INT >= 28))
      {
        AppMethodBeat.o(52409);
        bool = true;
      }
      else if ((paramString.equals("jpg")) || (paramString.equals("gif")) || (paramString.equals("bmp")) || (paramString.equals("jpeg")) || (paramString.equals("png")))
      {
        AppMethodBeat.o(52409);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(52409);
      }
    }
  }

  public static String anz(String paramString)
  {
    AppMethodBeat.i(52420);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(52420);
    }
    while (true)
    {
      return paramString;
      for (int i = paramString.length(); ; i--)
      {
        if (i <= 0)
          break label75;
        if ((paramString.charAt(i - 1) != '\n') && (paramString.charAt(i - 1) != '\r'))
        {
          paramString = paramString.substring(0, i);
          AppMethodBeat.o(52420);
          break;
        }
      }
      label75: AppMethodBeat.o(52420);
    }
  }

  public static ActivityManager.RunningTaskInfo av(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(52413);
    Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1000).iterator();
    while (localIterator.hasNext())
    {
      paramContext = (ActivityManager.RunningTaskInfo)localIterator.next();
      if (paramContext.id == paramInt)
        AppMethodBeat.o(52413);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(52413);
    }
  }

  // ERROR //
  public static String aw(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: ldc_w 964
    //   3: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnull +7 -> 14
    //   10: iload_1
    //   11: ifgt +14 -> 25
    //   14: ldc 230
    //   16: astore_0
    //   17: ldc_w 964
    //   20: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: aload_0
    //   24: areturn
    //   25: aload_0
    //   26: ldc_w 945
    //   29: invokevirtual 949	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   32: checkcast 951	android/app/ActivityManager
    //   35: invokevirtual 968	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   38: invokeinterface 956 1 0
    //   43: astore_0
    //   44: aload_0
    //   45: invokeinterface 451 1 0
    //   50: ifeq +67 -> 117
    //   53: aload_0
    //   54: invokeinterface 455 1 0
    //   59: checkcast 970	android/app/ActivityManager$RunningAppProcessInfo
    //   62: astore_2
    //   63: aload_2
    //   64: getfield 973	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   67: iload_1
    //   68: if_icmpne -24 -> 44
    //   71: aload_2
    //   72: getfield 976	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   75: ifnull -31 -> 44
    //   78: aload_2
    //   79: getfield 976	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   82: ldc 230
    //   84: invokevirtual 926	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   87: ifne -43 -> 44
    //   90: aload_2
    //   91: getfield 976	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   94: astore_0
    //   95: ldc_w 964
    //   98: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: goto -78 -> 23
    //   104: astore_0
    //   105: ldc 175
    //   107: aload_0
    //   108: ldc 230
    //   110: iconst_0
    //   111: anewarray 4	java/lang/Object
    //   114: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: sipush 128
    //   120: newarray byte
    //   122: astore_3
    //   123: new 978	java/io/FileInputStream
    //   126: astore_2
    //   127: new 428	java/lang/StringBuilder
    //   130: astore_0
    //   131: aload_0
    //   132: ldc_w 980
    //   135: invokespecial 470	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   138: aload_2
    //   139: aload_0
    //   140: iload_1
    //   141: invokevirtual 897	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   144: ldc_w 982
    //   147: invokevirtual 434	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 476	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokespecial 983	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   156: aload_2
    //   157: astore_0
    //   158: aload_2
    //   159: aload_3
    //   160: invokevirtual 984	java/io/FileInputStream:read	([B)I
    //   163: istore 4
    //   165: iload 4
    //   167: ifle +73 -> 240
    //   170: iconst_0
    //   171: istore_1
    //   172: iload 4
    //   174: istore 5
    //   176: iload_1
    //   177: iload 4
    //   179: if_icmpge +21 -> 200
    //   182: aload_3
    //   183: iload_1
    //   184: baload
    //   185: sipush 128
    //   188: if_icmpgt +9 -> 197
    //   191: aload_3
    //   192: iload_1
    //   193: baload
    //   194: ifgt +40 -> 234
    //   197: iload_1
    //   198: istore 5
    //   200: aload_2
    //   201: astore_0
    //   202: new 74	java/lang/String
    //   205: astore 6
    //   207: aload_2
    //   208: astore_0
    //   209: aload 6
    //   211: aload_3
    //   212: iconst_0
    //   213: iload 5
    //   215: invokespecial 217	java/lang/String:<init>	([BII)V
    //   218: aload_2
    //   219: invokevirtual 985	java/io/FileInputStream:close	()V
    //   222: ldc_w 964
    //   225: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: aload 6
    //   230: astore_0
    //   231: goto -208 -> 23
    //   234: iinc 1 1
    //   237: goto -65 -> 172
    //   240: aload_2
    //   241: invokevirtual 985	java/io/FileInputStream:close	()V
    //   244: ldc 230
    //   246: astore_0
    //   247: ldc_w 964
    //   250: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   253: goto -230 -> 23
    //   256: astore 6
    //   258: aconst_null
    //   259: astore_2
    //   260: aload_2
    //   261: astore_0
    //   262: ldc 175
    //   264: aload 6
    //   266: ldc 230
    //   268: iconst_0
    //   269: anewarray 4	java/lang/Object
    //   272: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   275: aload_2
    //   276: ifnull -32 -> 244
    //   279: aload_2
    //   280: invokevirtual 985	java/io/FileInputStream:close	()V
    //   283: goto -39 -> 244
    //   286: astore_0
    //   287: goto -43 -> 244
    //   290: astore_2
    //   291: aconst_null
    //   292: astore_0
    //   293: aload_0
    //   294: ifnull +7 -> 301
    //   297: aload_0
    //   298: invokevirtual 985	java/io/FileInputStream:close	()V
    //   301: ldc_w 964
    //   304: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   307: aload_2
    //   308: athrow
    //   309: astore_0
    //   310: goto -88 -> 222
    //   313: astore_0
    //   314: goto -70 -> 244
    //   317: astore_0
    //   318: goto -17 -> 301
    //   321: astore_2
    //   322: goto -29 -> 293
    //   325: astore 6
    //   327: goto -67 -> 260
    //
    // Exception table:
    //   from	to	target	type
    //   25	44	104	java/lang/Exception
    //   44	95	104	java/lang/Exception
    //   123	156	256	java/lang/Exception
    //   279	283	286	java/lang/Exception
    //   123	156	290	finally
    //   218	222	309	java/lang/Exception
    //   240	244	313	java/lang/Exception
    //   297	301	317	java/lang/Exception
    //   158	165	321	finally
    //   202	207	321	finally
    //   209	218	321	finally
    //   262	275	321	finally
    //   158	165	325	java/lang/Exception
    //   202	207	325	java/lang/Exception
    //   209	218	325	java/lang/Exception
  }

  public static long az(long paramLong)
  {
    AppMethodBeat.i(52325);
    long l = SystemClock.elapsedRealtime();
    AppMethodBeat.o(52325);
    return l - paramLong;
  }

  public static String b(long paramLong, double paramDouble)
  {
    AppMethodBeat.i(52313);
    paramDouble = Math.round(paramLong * paramDouble / 1048576.0D) / paramDouble;
    String str = paramDouble + " MB";
    AppMethodBeat.o(52313);
    return str;
  }

  public static void b(Closeable paramCloseable)
  {
    AppMethodBeat.i(52422);
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(52422);
      return;
    }
    catch (IOException paramCloseable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramCloseable, "qualityClose", new Object[0]);
        AppMethodBeat.o(52422);
      }
    }
  }

  public static boolean bH(Context paramContext, String paramString)
  {
    AppMethodBeat.i(52336);
    Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(2147483647).iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      paramContext = (ActivityManager.RunningServiceInfo)localIterator.next();
      if ((paramContext != null) && (paramContext.service != null) && (paramContext.service.getClassName().toString().equals(paramString)))
      {
        ab.w("MicroMsg.Util", "service " + paramString + " is running");
        bool = true;
        AppMethodBeat.o(52336);
      }
    }
    while (true)
    {
      return bool;
      ab.w("MicroMsg.Util", "service " + paramString + " is not running");
      bool = false;
      AppMethodBeat.o(52336);
    }
  }

  public static boolean bI(Context paramContext, String paramString)
  {
    AppMethodBeat.i(52337);
    try
    {
      boolean bool;
      if ((paramString.equals("com.tencent.mm")) || (paramString.startsWith("com.tencent.mm:")) || (Build.VERSION.SDK_INT < 21))
      {
        ab.i("MicroMsg.Util", "isProcessRunning, use ActivityManager. process = %s", new Object[] { paramString });
        paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
        if (paramContext == null)
        {
          AppMethodBeat.o(52337);
          bool = false;
        }
      }
      while (true)
      {
        return bool;
        paramContext = paramContext.iterator();
        while (true)
          if (paramContext.hasNext())
          {
            Object localObject = (ActivityManager.RunningAppProcessInfo)paramContext.next();
            if ((localObject != null) && (((ActivityManager.RunningAppProcessInfo)localObject).processName != null) && (((ActivityManager.RunningAppProcessInfo)localObject).processName.equals(paramString)))
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>("process ");
              ab.w("MicroMsg.Util", paramString + " is running");
              AppMethodBeat.o(52337);
              bool = true;
              break;
              ab.i("MicroMsg.Util", "isProcessRunning, use ps command. process = %s", new Object[] { paramString });
              paramContext = dpI().iterator();
              label299: 
              while (true)
              {
                if (!paramContext.hasNext())
                  break label301;
                localObject = (String)paramContext.next();
                ab.d("MicroMsg.Util", "isProcessRunning, process command line = %s", new Object[] { localObject });
                if ((localObject != null) && (((String)localObject).contains(paramString)))
                {
                  localObject = ((String)localObject).split("\\s+");
                  for (int i = 0; ; i++)
                  {
                    if (i >= localObject.length)
                      break label299;
                    if (paramString.equals(localObject[i]))
                    {
                      ab.i("MicroMsg.Util", "process %s is running", new Object[] { paramString });
                      AppMethodBeat.o(52337);
                      bool = true;
                      break;
                    }
                  }
                }
              }
            }
          }
        label301: paramContext = new java/lang/StringBuilder;
        paramContext.<init>("process ");
        ab.w("MicroMsg.Util", paramString + " is not running");
        AppMethodBeat.o(52337);
        bool = false;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Util", paramContext, "", new Object[0]);
    }
  }

  public static int bS(String paramString, int paramInt)
  {
    AppMethodBeat.i(52436);
    try
    {
      int i = Color.parseColor(paramString);
      paramInt = i;
      AppMethodBeat.o(52436);
      return paramInt;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", localException, "colorString:%s", new Object[] { paramString });
        AppMethodBeat.o(52436);
      }
    }
  }

  public static String bZ(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(52316);
    paramArrayOfByte = W(paramArrayOfByte, 0);
    AppMethodBeat.o(52316);
    return paramArrayOfByte;
  }

  public static String bc(String paramString1, String paramString2)
  {
    if (paramString1 == null);
    while (true)
    {
      return paramString2;
      paramString2 = paramString1;
    }
  }

  public static int bf(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(52426);
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.nativeOrder());
    int i = paramArrayOfByte.getInt();
    AppMethodBeat.o(52426);
    return i;
  }

  public static long c(Long paramLong)
  {
    AppMethodBeat.i(52344);
    long l;
    if (paramLong == null)
    {
      l = 0L;
      AppMethodBeat.o(52344);
    }
    while (true)
    {
      return l;
      l = paramLong.longValue();
      AppMethodBeat.o(52344);
    }
  }

  public static String c(long paramLong, double paramDouble)
  {
    AppMethodBeat.i(52315);
    paramDouble = Math.round(paramLong * paramDouble / 1073741824.0D) / paramDouble;
    String str = paramDouble + " GB";
    AppMethodBeat.o(52315);
    return str;
  }

  public static String c(List<String> paramList, String paramString)
  {
    AppMethodBeat.i(52295);
    if (paramList == null)
    {
      paramList = "";
      AppMethodBeat.o(52295);
    }
    while (true)
    {
      return paramList;
      StringBuilder localStringBuilder = new StringBuilder("");
      int i = 0;
      if (i < paramList.size())
      {
        if (i == paramList.size() - 1)
          localStringBuilder.append(((String)paramList.get(i)).trim());
        while (true)
        {
          i++;
          break;
          localStringBuilder.append(((String)paramList.get(i)).trim() + paramString);
        }
      }
      paramList = localStringBuilder.toString();
      AppMethodBeat.o(52295);
    }
  }

  public static String cD(Object paramObject)
  {
    AppMethodBeat.i(52342);
    if (paramObject != null)
    {
      paramObject = paramObject.toString();
      AppMethodBeat.o(52342);
    }
    while (true)
    {
      return paramObject;
      paramObject = "null";
      AppMethodBeat.o(52342);
    }
  }

  public static long cE(Object paramObject)
  {
    long l = 0L;
    AppMethodBeat.i(52351);
    if (paramObject == null)
      AppMethodBeat.o(52351);
    while (true)
    {
      return l;
      if ((paramObject instanceof Long))
      {
        l = ((Long)paramObject).longValue();
        AppMethodBeat.o(52351);
      }
      else
      {
        AppMethodBeat.o(52351);
      }
    }
  }

  public static String ca(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(52318);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = "(null)";
      AppMethodBeat.o(52318);
    }
    while (true)
    {
      return paramArrayOfByte;
      char[] arrayOfChar1 = new char[16];
      char[] tmp28_27 = arrayOfChar1;
      tmp28_27[0] = 48;
      char[] tmp34_28 = tmp28_27;
      tmp34_28[1] = 49;
      char[] tmp40_34 = tmp34_28;
      tmp40_34[2] = 50;
      char[] tmp46_40 = tmp40_34;
      tmp46_40[3] = 51;
      char[] tmp52_46 = tmp46_40;
      tmp52_46[4] = 52;
      char[] tmp58_52 = tmp52_46;
      tmp58_52[5] = 53;
      char[] tmp64_58 = tmp58_52;
      tmp64_58[6] = 54;
      char[] tmp71_64 = tmp64_58;
      tmp71_64[7] = 55;
      char[] tmp78_71 = tmp71_64;
      tmp78_71[8] = 56;
      char[] tmp85_78 = tmp78_71;
      tmp85_78[9] = 57;
      char[] tmp92_85 = tmp85_78;
      tmp92_85[10] = 97;
      char[] tmp99_92 = tmp92_85;
      tmp99_92[11] = 98;
      char[] tmp106_99 = tmp99_92;
      tmp106_99[12] = 99;
      char[] tmp113_106 = tmp106_99;
      tmp113_106[13] = 100;
      char[] tmp120_113 = tmp113_106;
      tmp120_113[14] = 101;
      char[] tmp127_120 = tmp120_113;
      tmp127_120[15] = 102;
      tmp127_120;
      int i = paramArrayOfByte.length;
      char[] arrayOfChar2 = new char[i * 3];
      int j = 0;
      for (int k = 0; j < i; k++)
      {
        int m = paramArrayOfByte[j];
        int n = k + 1;
        arrayOfChar2[k] = ((char)32);
        k = n + 1;
        arrayOfChar2[n] = ((char)arrayOfChar1[(m >>> 4 & 0xF)]);
        arrayOfChar2[k] = ((char)arrayOfChar1[(m & 0xF)]);
        j++;
      }
      paramArrayOfByte = new String(arrayOfChar2);
      AppMethodBeat.o(52318);
    }
  }

  public static boolean cb(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int cc(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    for (int i = -1; ; i = paramArrayOfByte.length)
      return i;
  }

  public static String cc(Context paramContext)
  {
    AppMethodBeat.i(52338);
    try
    {
      paramContext = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      AppMethodBeat.o(52338);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramContext, "", new Object[0]);
        paramContext = "(null)";
        AppMethodBeat.o(52338);
      }
    }
  }

  public static String cd(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(52369);
    StringBuilder localStringBuilder = new StringBuilder("");
    if (paramArrayOfByte != null)
      for (int i = 0; i < paramArrayOfByte.length; i++)
        localStringBuilder.append(String.format("%02x", new Object[] { Integer.valueOf(paramArrayOfByte[i] & 0xFF) }));
    paramArrayOfByte = localStringBuilder.toString();
    AppMethodBeat.o(52369);
    return paramArrayOfByte;
  }

  public static String convertStreamToString(InputStream paramInputStream)
  {
    AppMethodBeat.i(52418);
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    StringBuilder localStringBuilder1 = new StringBuilder();
    try
    {
      while (true)
      {
        String str = localBufferedReader.readLine();
        if (str == null)
          break;
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        localStringBuilder2.<init>();
        localStringBuilder1.append(str + "\n");
      }
    }
    catch (IOException localIOException)
    {
      localIOException = localIOException;
      ab.printErrStackTrace("MicroMsg.Util", localIOException, "", new Object[0]);
      try
      {
        paramInputStream.close();
        while (true)
        {
          paramInputStream = localStringBuilder1.toString();
          AppMethodBeat.o(52418);
          return paramInputStream;
          try
          {
            paramInputStream.close();
          }
          catch (IOException paramInputStream)
          {
            ab.printErrStackTrace("MicroMsg.Util", paramInputStream, "", new Object[0]);
          }
        }
      }
      catch (IOException paramInputStream)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Util", paramInputStream, "", new Object[0]);
      }
    }
    finally
    {
    }
    try
    {
      paramInputStream.close();
      AppMethodBeat.o(52418);
      throw localObject;
    }
    catch (IOException paramInputStream)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Util", paramInputStream, "", new Object[0]);
    }
  }

  public static boolean cv(Context paramContext)
  {
    AppMethodBeat.i(52335);
    String str = paramContext.getClass().getName();
    paramContext = cc(paramContext);
    ab.d("MicroMsg.Util", "top activity=" + paramContext + ", context=" + str);
    boolean bool = paramContext.equalsIgnoreCase(str);
    AppMethodBeat.o(52335);
    return bool;
  }

  public static boolean d(Boolean paramBoolean)
  {
    AppMethodBeat.i(52345);
    boolean bool;
    if (paramBoolean == null)
    {
      bool = true;
      AppMethodBeat.o(52345);
    }
    while (true)
    {
      return bool;
      bool = paramBoolean.booleanValue();
      AppMethodBeat.o(52345);
    }
  }

  public static boolean deleteFile(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(52383);
    if (isNullOrNil(paramString))
      AppMethodBeat.o(52383);
    while (true)
    {
      return bool;
      paramString = new File(paramString);
      if (!paramString.exists())
      {
        bool = true;
        AppMethodBeat.o(52383);
      }
      else if (paramString.isDirectory())
      {
        AppMethodBeat.o(52383);
      }
      else
      {
        bool = paramString.delete();
        AppMethodBeat.o(52383);
      }
    }
  }

  public static String dpA()
  {
    AppMethodBeat.i(52301);
    Object localObject = TimeZone.getDefault();
    int i = ((TimeZone)localObject).getRawOffset() / 1000;
    if ((((TimeZone)localObject).useDaylightTime()) && (((TimeZone)localObject).inDaylightTime(new java.sql.Date(System.currentTimeMillis()))));
    for (int j = 1; ; j = 0)
    {
      localObject = String.format("%.2f", new Object[] { Double.valueOf(i / 3600.0D + j) });
      AppMethodBeat.o(52301);
      return localObject;
    }
  }

  public static long dpB()
  {
    AppMethodBeat.i(52327);
    long l = System.currentTimeMillis() / 86400000L;
    AppMethodBeat.o(52327);
    return l * 86400000L;
  }

  public static long dpC()
  {
    AppMethodBeat.i(52328);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    long l = localCalendar.getTimeInMillis();
    AppMethodBeat.o(52328);
    return l;
  }

  public static long dpD()
  {
    AppMethodBeat.i(52331);
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(Environment.getDataDirectory().getPath());
      if (Build.VERSION.SDK_INT < 18)
      {
        l1 = localStatFs.getBlockSize();
        int i = localStatFs.getAvailableBlocks();
        l1 = i * l1;
        AppMethodBeat.o(52331);
      }
      while (true)
      {
        return l1;
        long l2 = localStatFs.getBlockSizeLong();
        l1 = localStatFs.getAvailableBlocksLong();
        l1 *= l2;
        AppMethodBeat.o(52331);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.Util", "getDataAvailableSize exception:%s", new Object[] { localException.getMessage() });
        long l1 = 0L;
        AppMethodBeat.o(52331);
      }
    }
  }

  public static View.OnTouchListener dpE()
  {
    AppMethodBeat.i(52390);
    View.OnTouchListener local1 = new View.OnTouchListener()
    {
      public final boolean onTouch(final View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(52290);
        switch (paramAnonymousMotionEvent.getAction())
        {
        case 2:
        default:
        case 1:
        case 3:
        case 4:
        case 0:
        }
        while (true)
        {
          AppMethodBeat.o(52290);
          return false;
          paramAnonymousView.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(52289);
              paramAnonymousView.setPressed(false);
              AppMethodBeat.o(52289);
            }
          });
          continue;
          paramAnonymousView.setPressed(true);
        }
      }
    };
    AppMethodBeat.o(52390);
    return local1;
  }

  public static int dpF()
  {
    AppMethodBeat.i(52403);
    int i = new Random().nextInt();
    AppMethodBeat.o(52403);
    return i;
  }

  public static an dpG()
  {
    AppMethodBeat.i(52415);
    an localan = new an();
    AppMethodBeat.o(52415);
    return localan;
  }

  public static boolean dpH()
  {
    AppMethodBeat.i(52428);
    String str = System.getProperty("java.vm.version");
    boolean bool;
    if ((!isNullOrNil(str)) && (str.startsWith("2")))
    {
      bool = true;
      AppMethodBeat.o(52428);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52428);
    }
  }

  // ERROR //
  private static List<String> dpI()
  {
    // Byte code:
    //   0: ldc_w 1263
    //   3: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 306	java/util/ArrayList
    //   9: dup
    //   10: invokespecial 307	java/util/ArrayList:<init>	()V
    //   13: astore_0
    //   14: invokestatic 1269	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   17: ldc_w 1271
    //   20: invokevirtual 1275	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   23: astore_1
    //   24: new 1277	java/io/LineNumberReader
    //   27: astore_2
    //   28: new 1133	java/io/InputStreamReader
    //   31: astore_3
    //   32: aload_3
    //   33: aload_1
    //   34: invokevirtual 1280	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   37: invokespecial 1134	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   40: aload_2
    //   41: aload_3
    //   42: invokespecial 1281	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
    //   45: aload_2
    //   46: astore_3
    //   47: aload_2
    //   48: invokevirtual 1282	java/io/LineNumberReader:readLine	()Ljava/lang/String;
    //   51: astore 4
    //   53: aload 4
    //   55: ifnull +89 -> 144
    //   58: aload_2
    //   59: astore_3
    //   60: aload 4
    //   62: invokevirtual 552	java/lang/String:length	()I
    //   65: ifle -20 -> 45
    //   68: aload_2
    //   69: astore_3
    //   70: aload_0
    //   71: aload 4
    //   73: invokeinterface 698 2 0
    //   78: pop
    //   79: goto -34 -> 45
    //   82: astore_1
    //   83: aload_2
    //   84: astore_3
    //   85: ldc 175
    //   87: ldc_w 1284
    //   90: iconst_1
    //   91: anewarray 4	java/lang/Object
    //   94: dup
    //   95: iconst_0
    //   96: aload_1
    //   97: invokevirtual 826	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   100: aastore
    //   101: invokestatic 804	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: aload_2
    //   105: ifnull +7 -> 112
    //   108: aload_2
    //   109: invokevirtual 1285	java/io/LineNumberReader:close	()V
    //   112: ldc 175
    //   114: ldc_w 1287
    //   117: iconst_1
    //   118: anewarray 4	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload_0
    //   124: invokeinterface 154 1 0
    //   129: invokestatic 697	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   132: aastore
    //   133: invokestatic 601	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: ldc_w 1263
    //   139: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   142: aload_0
    //   143: areturn
    //   144: aload_2
    //   145: astore_3
    //   146: aload_1
    //   147: invokevirtual 1290	java/lang/Process:waitFor	()I
    //   150: pop
    //   151: aload_2
    //   152: astore_3
    //   153: aload_1
    //   154: invokevirtual 1293	java/lang/Process:destroy	()V
    //   157: aload_2
    //   158: invokevirtual 1285	java/io/LineNumberReader:close	()V
    //   161: goto -49 -> 112
    //   164: astore_3
    //   165: ldc 175
    //   167: ldc_w 1295
    //   170: iconst_1
    //   171: anewarray 4	java/lang/Object
    //   174: dup
    //   175: iconst_0
    //   176: aload_3
    //   177: invokevirtual 826	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   180: aastore
    //   181: invokestatic 804	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   184: goto -72 -> 112
    //   187: astore_3
    //   188: ldc 175
    //   190: ldc_w 1295
    //   193: iconst_1
    //   194: anewarray 4	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: aload_3
    //   200: invokevirtual 826	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   203: aastore
    //   204: invokestatic 804	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   207: goto -95 -> 112
    //   210: astore_2
    //   211: aconst_null
    //   212: astore_3
    //   213: aload_3
    //   214: ifnull +7 -> 221
    //   217: aload_3
    //   218: invokevirtual 1285	java/io/LineNumberReader:close	()V
    //   221: ldc_w 1263
    //   224: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   227: aload_2
    //   228: athrow
    //   229: astore_3
    //   230: ldc 175
    //   232: ldc_w 1295
    //   235: iconst_1
    //   236: anewarray 4	java/lang/Object
    //   239: dup
    //   240: iconst_0
    //   241: aload_3
    //   242: invokevirtual 826	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   245: aastore
    //   246: invokestatic 804	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   249: goto -28 -> 221
    //   252: astore_2
    //   253: goto -40 -> 213
    //   256: astore_1
    //   257: aconst_null
    //   258: astore_2
    //   259: goto -176 -> 83
    //
    // Exception table:
    //   from	to	target	type
    //   47	53	82	java/lang/Exception
    //   60	68	82	java/lang/Exception
    //   70	79	82	java/lang/Exception
    //   146	151	82	java/lang/Exception
    //   153	157	82	java/lang/Exception
    //   157	161	164	java/lang/Exception
    //   108	112	187	java/lang/Exception
    //   14	45	210	finally
    //   217	221	229	java/lang/Exception
    //   47	53	252	finally
    //   60	68	252	finally
    //   70	79	252	finally
    //   85	104	252	finally
    //   146	151	252	finally
    //   153	157	252	finally
    //   14	45	256	java/lang/Exception
  }

  public static byte[] dpz()
  {
    AppMethodBeat.i(52300);
    try
    {
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      localFileInputStream.<init>("/dev/urandom");
      byte[] arrayOfByte = new byte[16];
      int i = localFileInputStream.read(arrayOfByte);
      localFileInputStream.close();
      if (i == 16)
      {
        AppMethodBeat.o(52300);
        return arrayOfByte;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", localException, "", new Object[0]);
        Object localObject = UUID.randomUUID();
        localObject = g.y((((UUID)localObject).toString() + System.currentTimeMillis()).getBytes());
        AppMethodBeat.o(52300);
      }
    }
  }

  public static boolean e(Boolean paramBoolean)
  {
    AppMethodBeat.i(52346);
    boolean bool;
    if (paramBoolean == null)
    {
      bool = false;
      AppMethodBeat.o(52346);
    }
    while (true)
    {
      return bool;
      bool = paramBoolean.booleanValue();
      AppMethodBeat.o(52346);
    }
  }

  public static String[] ej(List<String> paramList)
  {
    AppMethodBeat.i(52298);
    String[] arrayOfString = new String[paramList.size()];
    for (int i = 0; i < paramList.size(); i++)
      arrayOfString[i] = ((String)paramList.get(i));
    AppMethodBeat.o(52298);
    return arrayOfString;
  }

  public static boolean ek(List paramList)
  {
    AppMethodBeat.i(52352);
    boolean bool;
    if ((paramList == null) || (paramList.size() == 0))
    {
      bool = true;
      AppMethodBeat.o(52352);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52352);
    }
  }

  public static long fp(long paramLong)
  {
    AppMethodBeat.i(52324);
    long l = System.currentTimeMillis() / 1000L;
    AppMethodBeat.o(52324);
    return l - paramLong;
  }

  public static int g(Object paramObject, int paramInt)
  {
    AppMethodBeat.i(52350);
    if (paramObject == null)
      AppMethodBeat.o(52350);
    while (true)
    {
      return paramInt;
      if ((paramObject instanceof Integer))
      {
        paramInt = ((Integer)paramObject).intValue();
        AppMethodBeat.o(52350);
      }
      else if ((paramObject instanceof Long))
      {
        paramInt = ((Long)paramObject).intValue();
        AppMethodBeat.o(52350);
      }
      else
      {
        AppMethodBeat.o(52350);
      }
    }
  }

  public static void gM(Context paramContext)
  {
    AppMethodBeat.i(52321);
    paramContext = (Vibrator)paramContext.getSystemService("vibrator");
    if (paramContext == null)
      AppMethodBeat.o(52321);
    while (true)
    {
      return;
      paramContext.vibrate(xCg, -1);
      AppMethodBeat.o(52321);
    }
  }

  public static String gN(Context paramContext)
  {
    AppMethodBeat.i(52330);
    if (paramContext == null)
    {
      AppMethodBeat.o(52330);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext == null)
        {
          AppMethodBeat.o(52330);
          paramContext = null;
          continue;
        }
        paramContext = paramContext.getDeviceId();
        if (paramContext == null)
        {
          AppMethodBeat.o(52330);
          paramContext = null;
          continue;
        }
        paramContext = paramContext.trim();
        AppMethodBeat.o(52330);
      }
      catch (SecurityException paramContext)
      {
        ab.e("MicroMsg.Util", "summerdeviceid getDeviceId failed, security exception[%s]", new Object[] { paramContext });
        AppMethodBeat.o(52330);
        paramContext = null;
      }
      catch (Exception paramContext)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Util", paramContext, "summerdeviceid", new Object[0]);
      }
    }
  }

  public static long gO(Context paramContext)
  {
    AppMethodBeat.i(52332);
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    long l;
    if (localActivityManager == null)
    {
      l = 0L;
      AppMethodBeat.o(52332);
    }
    while (true)
    {
      return l;
      paramContext = new ActivityManager.MemoryInfo();
      localActivityManager.getMemoryInfo(paramContext);
      l = paramContext.availMem / 1024L / 1024L;
      AppMethodBeat.o(52332);
    }
  }

  public static String gP(Context paramContext)
  {
    AppMethodBeat.i(52333);
    if (paramContext == null)
    {
      AppMethodBeat.o(52333);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext == null)
        {
          ab.e("MicroMsg.Util", "getLine1Number failed, null tm");
          AppMethodBeat.o(52333);
          paramContext = null;
        }
        else
        {
          paramContext = paramContext.getLine1Number();
          AppMethodBeat.o(52333);
        }
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.Util", "getLine1Number failed:%s ", new Object[] { an.l(paramContext) });
        AppMethodBeat.o(52333);
        paramContext = null;
      }
    }
  }

  public static String gQ(Context paramContext)
  {
    AppMethodBeat.i(52334);
    if (paramContext == null)
    {
      ab.w("MicroMsg.Util", "getSimCountryCode context is null.");
      paramContext = "";
      AppMethodBeat.o(52334);
    }
    while (true)
    {
      return paramContext;
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        paramContext = paramContext.getSimCountryIso();
        if (isNullOrNil(paramContext))
        {
          paramContext = "";
          AppMethodBeat.o(52334);
        }
        else
        {
          paramContext = paramContext.toUpperCase().trim();
          AppMethodBeat.o(52334);
        }
      }
      else
      {
        paramContext = "";
        AppMethodBeat.o(52334);
      }
    }
  }

  public static boolean gR(Context paramContext)
  {
    AppMethodBeat.i(52339);
    try
    {
      String str = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      paramContext = paramContext.getPackageName();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("top activity=");
      ab.d("MicroMsg.Util", str + ", context=" + paramContext);
      bool = str.contains(paramContext);
      AppMethodBeat.o(52339);
      return bool;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramContext, "", new Object[0]);
        AppMethodBeat.o(52339);
        boolean bool = false;
      }
    }
  }

  public static String gS(Context paramContext)
  {
    AppMethodBeat.i(52387);
    if (paramContext == null)
    {
      paramContext = null;
      AppMethodBeat.o(52387);
    }
    while (true)
    {
      return paramContext;
      paramContext = l(paramContext.getPackageName(), paramContext);
      AppMethodBeat.o(52387);
    }
  }

  public static boolean gT(Context paramContext)
  {
    AppMethodBeat.i(52389);
    boolean bool;
    if (!Locale.getDefault().getCountry().equalsIgnoreCase("CN"))
    {
      AppMethodBeat.o(52389);
      bool = true;
    }
    while (true)
    {
      return bool;
      TimeZone localTimeZone1 = TimeZone.getDefault();
      TimeZone localTimeZone2 = TimeZone.getTimeZone("GMT+08:00");
      if (localTimeZone1.getRawOffset() != localTimeZone2.getRawOffset())
      {
        AppMethodBeat.o(52389);
        bool = true;
      }
      else if (paramContext == null)
      {
        ab.w("MicroMsg.Util", "isOverseasUser context is null");
        AppMethodBeat.o(52389);
        bool = false;
      }
      else
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext != null)
        {
          paramContext = paramContext.getNetworkCountryIso();
          if ((!isNullOrNil(paramContext)) && (!paramContext.contains("cn")) && (!paramContext.contains("CN")))
          {
            AppMethodBeat.o(52389);
            bool = true;
          }
        }
        else
        {
          AppMethodBeat.o(52389);
          bool = false;
        }
      }
    }
  }

  public static a gU(Context paramContext)
  {
    AppMethodBeat.i(52410);
    paramContext = new a(paramContext);
    AppMethodBeat.o(52410);
    return paramContext;
  }

  public static int gV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(52299);
    if (paramInt1 > paramInt2);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      paramInt1 = new Random(System.currentTimeMillis()).nextInt(paramInt1 - paramInt2 + 1);
      AppMethodBeat.o(52299);
      return paramInt1 + paramInt2;
    }
  }

  public static ComponentName gV(Context paramContext)
  {
    AppMethodBeat.i(52411);
    try
    {
      paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
      if ((paramContext != null) && (paramContext.size() > 0))
      {
        paramContext = ((ActivityManager.RunningTaskInfo)paramContext.get(0)).topActivity;
        AppMethodBeat.o(52411);
      }
      while (true)
      {
        return paramContext;
        AppMethodBeat.o(52411);
        paramContext = null;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.Util", "get Top Activity Exception:%s", new Object[] { paramContext.getMessage() });
        AppMethodBeat.o(52411);
        paramContext = null;
      }
    }
  }

  public static String gW(Context paramContext)
  {
    AppMethodBeat.i(52412);
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      if (Build.VERSION.SDK_INT >= 23)
      {
        paramContext = paramContext.getAppTasks();
        if ((paramContext == null) || (paramContext.size() <= 0))
        {
          paramContext = "";
          AppMethodBeat.o(52412);
        }
      }
      while (true)
      {
        return paramContext;
        paramContext = paramContext.iterator();
        if (!paramContext.hasNext())
          break;
        paramContext = ((ActivityManager.AppTask)paramContext.next()).getTaskInfo().topActivity;
        if (paramContext == null)
        {
          paramContext = null;
          AppMethodBeat.o(52412);
        }
        else
        {
          String str = paramContext.getClassName();
          paramContext = str;
          if (str.contains("."))
            paramContext = str.substring(str.lastIndexOf(".") + 1);
          AppMethodBeat.o(52412);
          continue;
          str = ((ActivityManager.RunningTaskInfo)paramContext.getRunningTasks(1).get(0)).topActivity.getClassName();
          paramContext = str;
          if (str.contains("."))
            paramContext = str.substring(str.lastIndexOf(".") + 1);
          AppMethodBeat.o(52412);
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.Util", "getTopActivityName Exception:%s stack:%s", new Object[] { paramContext.getMessage(), an.l(paramContext) });
        paramContext = "";
        AppMethodBeat.o(52412);
      }
    }
  }

  public static boolean gW(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int gX(Context paramContext)
  {
    AppMethodBeat.i(52433);
    int i;
    if (paramContext == null)
    {
      ab.i("MicroMsg.Util", "getSelfMemInMB context is null.");
      i = -1;
      AppMethodBeat.o(52433);
    }
    while (true)
    {
      return i;
      paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getProcessMemoryInfo(new int[] { Process.myPid() });
      if ((paramContext != null) && (paramContext.length > 0))
      {
        i = paramContext[0].getTotalPss() / 1024;
        AppMethodBeat.o(52433);
      }
      else
      {
        AppMethodBeat.o(52433);
        i = 0;
      }
    }
  }

  public static String ga(long paramLong)
  {
    AppMethodBeat.i(52312);
    String str;
    if (paramLong >> 30 > 0L)
    {
      str = c(paramLong, 10.0D);
      AppMethodBeat.o(52312);
    }
    while (true)
    {
      return str;
      if (paramLong >> 20 > 0L)
      {
        str = b(paramLong, 10.0D);
        AppMethodBeat.o(52312);
      }
      else if (paramLong >> 9 > 0L)
      {
        double d = Math.round(paramLong * 10.0D / 1024.0D) / 10.0D;
        str = d + " KB";
        AppMethodBeat.o(52312);
      }
      else
      {
        str = paramLong + " B";
        AppMethodBeat.o(52312);
      }
    }
  }

  public static long gb(long paramLong)
  {
    AppMethodBeat.i(52417);
    long l = System.currentTimeMillis();
    AppMethodBeat.o(52417);
    return l - paramLong;
  }

  public static boolean getBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(52362);
    if (paramString == null);
    try
    {
      AppMethodBeat.o(52362);
      while (true)
      {
        return paramBoolean;
        boolean bool = Boolean.parseBoolean(paramString);
        paramBoolean = bool;
        AppMethodBeat.o(52362);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(52362);
      }
    }
  }

  public static double getDouble(String paramString, double paramDouble)
  {
    AppMethodBeat.i(52364);
    if (paramString == null);
    try
    {
      AppMethodBeat.o(52364);
      while (true)
      {
        return paramDouble;
        double d = Double.parseDouble(paramString);
        paramDouble = d;
        AppMethodBeat.o(52364);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(52364);
      }
    }
  }

  public static float getFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(52363);
    if (paramString == null);
    try
    {
      AppMethodBeat.o(52363);
      while (true)
      {
        return paramFloat;
        float f = Float.parseFloat(paramString);
        paramFloat = f;
        AppMethodBeat.o(52363);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(52363);
      }
    }
  }

  public static int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(52359);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
        AppMethodBeat.o(52359);
      while (true)
      {
        return paramInt;
        int i = Integer.decode(paramString).intValue();
        paramInt = i;
        AppMethodBeat.o(52359);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(52359);
      }
    }
  }

  public static long getLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(52360);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
        AppMethodBeat.o(52360);
      while (true)
      {
        return paramLong;
        long l = Long.decode(paramString).longValue();
        paramLong = l;
        AppMethodBeat.o(52360);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(52360);
      }
    }
  }

  public static int h(Integer paramInteger)
  {
    AppMethodBeat.i(52343);
    int i;
    if (paramInteger == null)
    {
      i = 0;
      AppMethodBeat.o(52343);
    }
    while (true)
    {
      return i;
      i = paramInteger.intValue();
      AppMethodBeat.o(52343);
    }
  }

  @TargetApi(19)
  public static String h(Context paramContext, Uri paramUri)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(52405);
    if ((paramContext == null) || (paramUri == null))
    {
      ab.e("MicroMsg.Util", "getFilePath : context is null or uri is null");
      AppMethodBeat.o(52405);
      paramContext = localObject2;
    }
    while (true)
    {
      return paramContext;
      String str = paramUri.getScheme();
      if (isNullOrNil(str))
      {
        ab.e("MicroMsg.Util", "input uri error. %s", new Object[] { paramUri });
        AppMethodBeat.o(52405);
        paramContext = localObject2;
      }
      else if (str.equalsIgnoreCase("file"))
      {
        ab.i("MicroMsg.Util", "getFilePath : scheme is SCHEME_FILE");
        paramContext = paramUri.getPath();
        AppMethodBeat.o(52405);
      }
      else if (str.equalsIgnoreCase("content"))
      {
        ab.i("MicroMsg.Util", "getFilePath : scheme is SCHEME_CONTENT: " + paramUri.toString());
        if ("com.google.android.apps.photos.content".equals(paramUri.getAuthority()))
        {
          paramContext = paramUri.getLastPathSegment();
          AppMethodBeat.o(52405);
        }
        else
        {
          String[] arrayOfString;
          try
          {
            paramContext.grantUriPermission(paramUri.getAuthority(), paramUri, 1);
            str = a(paramContext, paramUri, null, null);
            if (!isNullOrNil(str))
            {
              AppMethodBeat.o(52405);
              paramContext = str;
            }
          }
          catch (SecurityException localSecurityException)
          {
            while (true)
            {
              ab.e("MicroMsg.Util", "getFilePath : exception = ".concat(String.valueOf(localSecurityException)));
              arrayOfString = null;
            }
            if (Build.VERSION.SDK_INT < 19)
              break label496;
          }
          if (DocumentsContract.isDocumentUri(paramContext, paramUri))
          {
            if ("com.android.externalstorage.documents".equals(paramUri.getAuthority()))
            {
              paramContext = DocumentsContract.getDocumentId(paramUri).split(":");
              if ("primary".equalsIgnoreCase(paramContext[0]))
              {
                paramContext = Environment.getExternalStorageDirectory() + "/" + paramContext[1];
                AppMethodBeat.o(52405);
                continue;
              }
              AppMethodBeat.o(52405);
              paramContext = localObject2;
              continue;
            }
            if ("com.android.providers.downloads.documents".equals(paramUri.getAuthority()))
            {
              paramUri = DocumentsContract.getDocumentId(paramUri);
              paramContext = a(paramContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(paramUri).longValue()), null, null);
              AppMethodBeat.o(52405);
              continue;
            }
            if ("com.android.providers.media.documents".equals(paramUri.getAuthority()))
            {
              arrayOfString = DocumentsContract.getDocumentId(paramUri).split(":");
              localObject2 = arrayOfString[0];
              if ("image".equals(localObject2))
                paramUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
              while (true)
              {
                paramContext = a(paramContext, paramUri, "_id=?", new String[] { arrayOfString[1] });
                AppMethodBeat.o(52405);
                break;
                if ("video".equals(localObject2))
                {
                  paramUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                }
                else
                {
                  paramUri = localObject1;
                  if ("audio".equals(localObject2))
                    paramUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
              }
            }
          }
        }
      }
      else
      {
        label496: ab.e("MicroMsg.Util", "unknown scheme");
        AppMethodBeat.o(52405);
        paramContext = localObject2;
      }
    }
  }

  public static List<String> hT(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52296);
    if (TextUtils.isEmpty(paramString1))
    {
      paramString1 = Collections.EMPTY_LIST;
      AppMethodBeat.o(52296);
    }
    while (true)
    {
      return paramString1;
      paramString1 = paramString1.split(paramString2);
      if (paramString1 == null)
      {
        paramString1 = Collections.EMPTY_LIST;
        AppMethodBeat.o(52296);
      }
      else
      {
        paramString1 = Arrays.asList(paramString1);
        AppMethodBeat.o(52296);
      }
    }
  }

  // ERROR //
  public static int hU(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 1636
    //   5: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 1638	java/util/zip/ZipInputStream
    //   11: astore_3
    //   12: new 978	java/io/FileInputStream
    //   15: astore 4
    //   17: aload 4
    //   19: aload_0
    //   20: invokespecial 983	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   23: aload_3
    //   24: aload 4
    //   26: invokespecial 1639	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   29: aload_3
    //   30: astore_0
    //   31: aload_3
    //   32: invokevirtual 1643	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   35: astore 4
    //   37: aload 4
    //   39: ifnull +342 -> 381
    //   42: aload_3
    //   43: astore_0
    //   44: aload 4
    //   46: invokevirtual 1646	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   49: astore 5
    //   51: aload_3
    //   52: astore_0
    //   53: aload 5
    //   55: ldc_w 524
    //   58: invokevirtual 910	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   61: ifne -32 -> 29
    //   64: aload_3
    //   65: astore_0
    //   66: aload 5
    //   68: ldc_w 1648
    //   71: invokevirtual 910	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   74: ifne -45 -> 29
    //   77: aload_3
    //   78: astore_0
    //   79: aload 4
    //   81: invokevirtual 1649	java/util/zip/ZipEntry:isDirectory	()Z
    //   84: ifeq +112 -> 196
    //   87: aload_3
    //   88: astore_0
    //   89: aload 5
    //   91: iconst_0
    //   92: aload 5
    //   94: invokevirtual 552	java/lang/String:length	()I
    //   97: iconst_1
    //   98: isub
    //   99: invokevirtual 677	java/lang/String:substring	(II)Ljava/lang/String;
    //   102: astore 5
    //   104: aload_3
    //   105: astore_0
    //   106: new 901	java/io/File
    //   109: astore 6
    //   111: aload_3
    //   112: astore_0
    //   113: new 428	java/lang/StringBuilder
    //   116: astore 4
    //   118: aload_3
    //   119: astore_0
    //   120: aload 4
    //   122: invokespecial 429	java/lang/StringBuilder:<init>	()V
    //   125: aload_3
    //   126: astore_0
    //   127: aload 6
    //   129: aload 4
    //   131: aload_1
    //   132: invokevirtual 434	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: getstatic 1652	java/io/File:separator	Ljava/lang/String;
    //   138: invokevirtual 434	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload 5
    //   143: invokevirtual 434	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 476	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokespecial 902	java/io/File:<init>	(Ljava/lang/String;)V
    //   152: aload_3
    //   153: astore_0
    //   154: aload 6
    //   156: invokevirtual 1655	java/io/File:mkdirs	()Z
    //   159: pop
    //   160: goto -131 -> 29
    //   163: astore_1
    //   164: aload_3
    //   165: astore_0
    //   166: ldc 175
    //   168: aload_1
    //   169: ldc 230
    //   171: iconst_0
    //   172: anewarray 4	java/lang/Object
    //   175: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: aload_3
    //   179: ifnull +7 -> 186
    //   182: aload_3
    //   183: invokevirtual 1656	java/util/zip/ZipInputStream:close	()V
    //   186: ldc_w 1636
    //   189: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: iconst_m1
    //   193: istore_2
    //   194: iload_2
    //   195: ireturn
    //   196: aload_3
    //   197: astore_0
    //   198: new 901	java/io/File
    //   201: astore 4
    //   203: aload_3
    //   204: astore_0
    //   205: new 428	java/lang/StringBuilder
    //   208: astore 6
    //   210: aload_3
    //   211: astore_0
    //   212: aload 6
    //   214: invokespecial 429	java/lang/StringBuilder:<init>	()V
    //   217: aload_3
    //   218: astore_0
    //   219: aload 4
    //   221: aload 6
    //   223: aload_1
    //   224: invokevirtual 434	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: getstatic 1652	java/io/File:separator	Ljava/lang/String;
    //   230: invokevirtual 434	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: aload 5
    //   235: invokevirtual 434	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: invokevirtual 476	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: invokespecial 902	java/io/File:<init>	(Ljava/lang/String;)V
    //   244: aload_3
    //   245: astore_0
    //   246: aload 4
    //   248: invokevirtual 1659	java/io/File:createNewFile	()Z
    //   251: pop
    //   252: aload_3
    //   253: astore_0
    //   254: new 1661	java/io/FileOutputStream
    //   257: astore 5
    //   259: aload_3
    //   260: astore_0
    //   261: aload 5
    //   263: aload 4
    //   265: invokespecial 1664	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   268: aload_3
    //   269: astore_0
    //   270: sipush 1024
    //   273: newarray byte
    //   275: astore 4
    //   277: aload_3
    //   278: astore_0
    //   279: aload_3
    //   280: aload 4
    //   282: invokevirtual 1665	java/util/zip/ZipInputStream:read	([B)I
    //   285: istore 7
    //   287: iload 7
    //   289: iconst_m1
    //   290: if_icmpeq +60 -> 350
    //   293: aload_3
    //   294: astore_0
    //   295: aload 5
    //   297: aload 4
    //   299: iconst_0
    //   300: iload 7
    //   302: invokevirtual 1666	java/io/FileOutputStream:write	([BII)V
    //   305: aload_3
    //   306: astore_0
    //   307: aload 5
    //   309: invokevirtual 1669	java/io/FileOutputStream:flush	()V
    //   312: goto -35 -> 277
    //   315: astore_1
    //   316: aload_3
    //   317: astore_0
    //   318: ldc 175
    //   320: aload_1
    //   321: ldc 230
    //   323: iconst_0
    //   324: anewarray 4	java/lang/Object
    //   327: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   330: aload_3
    //   331: ifnull +7 -> 338
    //   334: aload_3
    //   335: invokevirtual 1656	java/util/zip/ZipInputStream:close	()V
    //   338: bipush 254
    //   340: istore_2
    //   341: ldc_w 1636
    //   344: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   347: goto -153 -> 194
    //   350: aload_3
    //   351: astore_0
    //   352: aload 5
    //   354: invokevirtual 1670	java/io/FileOutputStream:close	()V
    //   357: goto -328 -> 29
    //   360: astore_3
    //   361: aload_0
    //   362: astore_1
    //   363: aload_3
    //   364: astore_0
    //   365: aload_1
    //   366: ifnull +7 -> 373
    //   369: aload_1
    //   370: invokevirtual 1656	java/util/zip/ZipInputStream:close	()V
    //   373: ldc_w 1636
    //   376: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   379: aload_0
    //   380: athrow
    //   381: aload_3
    //   382: invokevirtual 1656	java/util/zip/ZipInputStream:close	()V
    //   385: ldc_w 1636
    //   388: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   391: goto -197 -> 194
    //   394: astore_0
    //   395: ldc 175
    //   397: ldc_w 1672
    //   400: invokestatic 280	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   403: goto -18 -> 385
    //   406: astore_0
    //   407: ldc 175
    //   409: ldc_w 1672
    //   412: invokestatic 280	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   415: goto -229 -> 186
    //   418: astore_0
    //   419: ldc 175
    //   421: ldc_w 1672
    //   424: invokestatic 280	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   427: goto -89 -> 338
    //   430: astore_1
    //   431: ldc 175
    //   433: ldc_w 1672
    //   436: invokestatic 280	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   439: goto -66 -> 373
    //   442: astore_0
    //   443: aconst_null
    //   444: astore_1
    //   445: goto -80 -> 365
    //   448: astore_1
    //   449: aconst_null
    //   450: astore_3
    //   451: goto -135 -> 316
    //   454: astore_1
    //   455: aconst_null
    //   456: astore_3
    //   457: goto -293 -> 164
    //
    // Exception table:
    //   from	to	target	type
    //   31	37	163	java/io/FileNotFoundException
    //   44	51	163	java/io/FileNotFoundException
    //   53	64	163	java/io/FileNotFoundException
    //   66	77	163	java/io/FileNotFoundException
    //   79	87	163	java/io/FileNotFoundException
    //   89	104	163	java/io/FileNotFoundException
    //   106	111	163	java/io/FileNotFoundException
    //   113	118	163	java/io/FileNotFoundException
    //   120	125	163	java/io/FileNotFoundException
    //   127	152	163	java/io/FileNotFoundException
    //   154	160	163	java/io/FileNotFoundException
    //   198	203	163	java/io/FileNotFoundException
    //   205	210	163	java/io/FileNotFoundException
    //   212	217	163	java/io/FileNotFoundException
    //   219	244	163	java/io/FileNotFoundException
    //   246	252	163	java/io/FileNotFoundException
    //   254	259	163	java/io/FileNotFoundException
    //   261	268	163	java/io/FileNotFoundException
    //   270	277	163	java/io/FileNotFoundException
    //   279	287	163	java/io/FileNotFoundException
    //   295	305	163	java/io/FileNotFoundException
    //   307	312	163	java/io/FileNotFoundException
    //   352	357	163	java/io/FileNotFoundException
    //   31	37	315	java/io/IOException
    //   44	51	315	java/io/IOException
    //   53	64	315	java/io/IOException
    //   66	77	315	java/io/IOException
    //   79	87	315	java/io/IOException
    //   89	104	315	java/io/IOException
    //   106	111	315	java/io/IOException
    //   113	118	315	java/io/IOException
    //   120	125	315	java/io/IOException
    //   127	152	315	java/io/IOException
    //   154	160	315	java/io/IOException
    //   198	203	315	java/io/IOException
    //   205	210	315	java/io/IOException
    //   212	217	315	java/io/IOException
    //   219	244	315	java/io/IOException
    //   246	252	315	java/io/IOException
    //   254	259	315	java/io/IOException
    //   261	268	315	java/io/IOException
    //   270	277	315	java/io/IOException
    //   279	287	315	java/io/IOException
    //   295	305	315	java/io/IOException
    //   307	312	315	java/io/IOException
    //   352	357	315	java/io/IOException
    //   31	37	360	finally
    //   44	51	360	finally
    //   53	64	360	finally
    //   66	77	360	finally
    //   79	87	360	finally
    //   89	104	360	finally
    //   106	111	360	finally
    //   113	118	360	finally
    //   120	125	360	finally
    //   127	152	360	finally
    //   154	160	360	finally
    //   166	178	360	finally
    //   198	203	360	finally
    //   205	210	360	finally
    //   212	217	360	finally
    //   219	244	360	finally
    //   246	252	360	finally
    //   254	259	360	finally
    //   261	268	360	finally
    //   270	277	360	finally
    //   279	287	360	finally
    //   295	305	360	finally
    //   307	312	360	finally
    //   318	330	360	finally
    //   352	357	360	finally
    //   381	385	394	java/io/IOException
    //   182	186	406	java/io/IOException
    //   334	338	418	java/io/IOException
    //   369	373	430	java/io/IOException
    //   8	29	442	finally
    //   8	29	448	java/io/IOException
    //   8	29	454	java/io/FileNotFoundException
  }

  public static boolean hideVKB(View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(52366);
    try
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)paramView.getContext().getSystemService("input_method");
      if (localInputMethodManager == null)
        AppMethodBeat.o(52366);
      while (true)
      {
        return bool;
        bool = localInputMethodManager.hideSoftInputFromWindow(paramView.getApplicationWindowToken(), 0);
        ab.v("MicroMsg.Util", "hide VKB result %B", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(52366);
      }
    }
    catch (Exception paramView)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramView, "", new Object[0]);
        ab.e("MicroMsg.Util", "hide VKB exception %s", new Object[] { paramView });
        bool = false;
      }
    }
  }

  public static boolean isEqual(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(52430);
    if ((isNullOrNil(paramString1)) && (isNullOrNil(paramString2)))
    {
      bool = true;
      AppMethodBeat.o(52430);
    }
    while (true)
    {
      return bool;
      if ((isNullOrNil(paramString1)) && (!isNullOrNil(paramString2)))
      {
        AppMethodBeat.o(52430);
      }
      else if ((!isNullOrNil(paramString1)) && (isNullOrNil(paramString2)))
      {
        AppMethodBeat.o(52430);
      }
      else
      {
        bool = paramString1.equals(paramString2);
        AppMethodBeat.o(52430);
      }
    }
  }

  public static boolean isEqual(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(52431);
    boolean bool = Arrays.equals(paramArrayOfByte1, paramArrayOfByte2);
    AppMethodBeat.o(52431);
    return bool;
  }

  public static boolean isNullOrNil(String paramString)
  {
    AppMethodBeat.i(52353);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = true;
      AppMethodBeat.o(52353);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52353);
    }
  }

  public static void k(String paramString, Context paramContext)
  {
    AppMethodBeat.i(52319);
    if ((paramString != null) && (!paramString.equals("")));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addFlags(268435456);
      localIntent.setDataAndType(Uri.fromFile(new File(paramString)), "application/vnd.android.package-archive");
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(52319);
      return;
    }
  }

  public static boolean k(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(52340);
    paramContext = paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536);
    boolean bool;
    if ((paramContext != null) && (paramContext.size() > 0))
    {
      bool = true;
      AppMethodBeat.o(52340);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52340);
    }
  }

  public static String l(String paramString, Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(52388);
    if ((paramContext == null) || (isNullOrNil(paramString)))
    {
      AppMethodBeat.o(52388);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramContext = paramContext.getPackageManager();
      try
      {
        paramString = paramContext.getPackageInfo(paramString, 64).signatures[0].toByteArray();
        paramString = g.x(paramString);
        AppMethodBeat.o(52388);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(52388);
        paramString = localObject;
      }
    }
  }

  public static String l(Throwable paramThrowable)
  {
    AppMethodBeat.i(138336);
    paramThrowable = an.l(paramThrowable);
    AppMethodBeat.o(138336);
    return paramThrowable;
  }

  public static byte[] l(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 == null);
    while (true)
    {
      return paramArrayOfByte2;
      paramArrayOfByte2 = paramArrayOfByte1;
    }
  }

  public static int mA(long paramLong)
  {
    AppMethodBeat.i(52437);
    int i = Math.round((float)paramLong / 1000.0F);
    AppMethodBeat.o(52437);
    return i;
  }

  public static String mK(int paramInt)
  {
    AppMethodBeat.i(52323);
    String str = String.format("%d:%02d", new Object[] { Long.valueOf(paramInt / 60L), Long.valueOf(paramInt % 60L) });
    AppMethodBeat.o(52323);
    return str;
  }

  public static String mw(long paramLong)
  {
    AppMethodBeat.i(52302);
    String str = new SimpleDateFormat("HH:mm:ss").format(new java.util.Date(paramLong));
    AppMethodBeat.o(52302);
    return str;
  }

  public static String mx(long paramLong)
  {
    AppMethodBeat.i(52303);
    String str = new SimpleDateFormat("[yy-MM-dd HH:mm:ss]").format(new java.util.Date(1000L * paramLong));
    AppMethodBeat.o(52303);
    return str;
  }

  public static String my(long paramLong)
  {
    AppMethodBeat.i(52314);
    String str = b(paramLong, 10.0D);
    AppMethodBeat.o(52314);
    return str;
  }

  public static String mz(long paramLong)
  {
    AppMethodBeat.i(52361);
    BigInteger localBigInteger = BigInteger.valueOf(paramLong);
    Object localObject = localBigInteger;
    if (localBigInteger.signum() < 0)
      localObject = localBigInteger.add(xCh);
    localObject = ((BigInteger)localObject).toString();
    AppMethodBeat.o(52361);
    return localObject;
  }

  public static void n(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(52424);
    Object localObject = new Rect();
    paramView.getHitRect((Rect)localObject);
    ((Rect)localObject).top -= paramInt2;
    ((Rect)localObject).bottom += paramInt4;
    ((Rect)localObject).left -= paramInt1;
    ((Rect)localObject).right += paramInt3;
    localObject = new TouchDelegate((Rect)localObject, paramView);
    if (View.class.isInstance(paramView.getParent()))
      ((View)paramView.getParent()).setTouchDelegate((TouchDelegate)localObject);
    AppMethodBeat.o(52424);
  }

  public static String nullAsNil(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  public static void o(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(52384);
    if (isNullOrNil(paramString1))
      AppMethodBeat.o(52384);
    while (true)
    {
      return;
      paramString1 = new File(paramString1);
      if ((!paramString1.exists()) || (!paramString1.isDirectory()))
      {
        AppMethodBeat.o(52384);
      }
      else
      {
        File[] arrayOfFile = paramString1.listFiles();
        if ((arrayOfFile == null) || (arrayOfFile.length == 0))
        {
          AppMethodBeat.o(52384);
        }
        else
        {
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
          {
            paramString1 = arrayOfFile[j];
            if ((paramString1.isFile()) && (paramString1.getName().startsWith(paramString2)) && (System.currentTimeMillis() - paramString1.lastModified() - paramLong >= 0L))
              paramString1.delete();
          }
          AppMethodBeat.o(52384);
        }
      }
    }
  }

  // ERROR //
  public static byte[] readFromFile(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 1839
    //   5: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokestatic 329	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   12: ifeq +21 -> 33
    //   15: ldc 175
    //   17: ldc_w 1841
    //   20: invokestatic 713	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc_w 1839
    //   26: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_1
    //   30: astore_0
    //   31: aload_0
    //   32: areturn
    //   33: new 901	java/io/File
    //   36: dup
    //   37: aload_0
    //   38: invokespecial 902	java/io/File:<init>	(Ljava/lang/String;)V
    //   41: astore_2
    //   42: aload_2
    //   43: invokevirtual 1172	java/io/File:exists	()Z
    //   46: ifne +30 -> 76
    //   49: ldc 175
    //   51: ldc_w 1843
    //   54: iconst_1
    //   55: anewarray 4	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_0
    //   61: aastore
    //   62: invokestatic 1845	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: ldc_w 1839
    //   68: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: aload_1
    //   72: astore_0
    //   73: goto -42 -> 31
    //   76: aload_2
    //   77: invokevirtual 1847	java/io/File:length	()J
    //   80: l2i
    //   81: istore_3
    //   82: new 978	java/io/FileInputStream
    //   85: astore 4
    //   87: aload 4
    //   89: aload_2
    //   90: invokespecial 1848	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   93: aload 4
    //   95: astore_2
    //   96: iload_3
    //   97: newarray byte
    //   99: astore 5
    //   101: aload 4
    //   103: astore_2
    //   104: aload 4
    //   106: aload 5
    //   108: invokevirtual 984	java/io/FileInputStream:read	([B)I
    //   111: istore 6
    //   113: iload 6
    //   115: iload_3
    //   116: if_icmpeq +69 -> 185
    //   119: aload 4
    //   121: astore_2
    //   122: ldc 175
    //   124: ldc_w 1850
    //   127: iconst_3
    //   128: anewarray 4	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: aload_0
    //   134: aastore
    //   135: dup
    //   136: iconst_1
    //   137: iload_3
    //   138: invokestatic 697	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   141: aastore
    //   142: dup
    //   143: iconst_2
    //   144: iload 6
    //   146: invokestatic 697	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   149: aastore
    //   150: invokestatic 1845	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: aload 4
    //   155: invokevirtual 985	java/io/FileInputStream:close	()V
    //   158: ldc_w 1839
    //   161: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: aload_1
    //   165: astore_0
    //   166: goto -135 -> 31
    //   169: astore_0
    //   170: ldc 175
    //   172: aload_0
    //   173: ldc 230
    //   175: iconst_0
    //   176: anewarray 4	java/lang/Object
    //   179: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: goto -24 -> 158
    //   185: aload 4
    //   187: astore_2
    //   188: ldc 175
    //   190: ldc_w 1852
    //   193: invokestatic 1162	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   196: aload 4
    //   198: invokevirtual 985	java/io/FileInputStream:close	()V
    //   201: ldc_w 1839
    //   204: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: aload 5
    //   209: astore_0
    //   210: goto -179 -> 31
    //   213: astore_0
    //   214: ldc 175
    //   216: aload_0
    //   217: ldc 230
    //   219: iconst_0
    //   220: anewarray 4	java/lang/Object
    //   223: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   226: goto -25 -> 201
    //   229: astore 5
    //   231: aconst_null
    //   232: astore_0
    //   233: aload_0
    //   234: astore_2
    //   235: ldc 175
    //   237: aload 5
    //   239: ldc 230
    //   241: iconst_0
    //   242: anewarray 4	java/lang/Object
    //   245: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: aload_0
    //   249: ifnull +7 -> 256
    //   252: aload_0
    //   253: invokevirtual 985	java/io/FileInputStream:close	()V
    //   256: ldc_w 1839
    //   259: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   262: aload_1
    //   263: astore_0
    //   264: goto -233 -> 31
    //   267: astore_0
    //   268: ldc 175
    //   270: aload_0
    //   271: ldc 230
    //   273: iconst_0
    //   274: anewarray 4	java/lang/Object
    //   277: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   280: goto -24 -> 256
    //   283: astore_0
    //   284: aconst_null
    //   285: astore_2
    //   286: aload_2
    //   287: ifnull +7 -> 294
    //   290: aload_2
    //   291: invokevirtual 985	java/io/FileInputStream:close	()V
    //   294: ldc_w 1839
    //   297: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   300: aload_0
    //   301: athrow
    //   302: astore_2
    //   303: ldc 175
    //   305: aload_2
    //   306: ldc 230
    //   308: iconst_0
    //   309: anewarray 4	java/lang/Object
    //   312: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   315: goto -21 -> 294
    //   318: astore_0
    //   319: goto -33 -> 286
    //   322: astore 5
    //   324: aload 4
    //   326: astore_0
    //   327: goto -94 -> 233
    //
    // Exception table:
    //   from	to	target	type
    //   153	158	169	java/io/IOException
    //   196	201	213	java/io/IOException
    //   76	93	229	java/lang/Exception
    //   252	256	267	java/io/IOException
    //   76	93	283	finally
    //   290	294	302	java/io/IOException
    //   96	101	318	finally
    //   104	113	318	finally
    //   122	153	318	finally
    //   188	196	318	finally
    //   235	248	318	finally
    //   96	101	322	java/lang/Exception
    //   104	113	322	java/lang/Exception
    //   122	153	322	java/lang/Exception
    //   188	196	322	java/lang/Exception
  }

  public static String t(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(52434);
    try
    {
      paramArrayOfObject = String.format(paramString, paramArrayOfObject);
      paramString = paramArrayOfObject;
      AppMethodBeat.o(52434);
      return paramString;
    }
    catch (Exception paramArrayOfObject)
    {
      while (true)
        ab.i("MicroMsg.Util", "error safeFormatString %s", new Object[] { paramArrayOfObject.getMessage() });
    }
  }

  public static boolean v(Uri paramUri)
  {
    AppMethodBeat.i(52406);
    boolean bool;
    if (paramUri == null)
    {
      bool = false;
      AppMethodBeat.o(52406);
    }
    while (true)
    {
      return bool;
      if (!"file".equalsIgnoreCase(paramUri.getScheme()))
      {
        bool = true;
        AppMethodBeat.o(52406);
      }
      else
      {
        bool = anw(paramUri.getPath());
        AppMethodBeat.o(52406);
      }
    }
  }

  public static String vA(String paramString)
  {
    AppMethodBeat.i(52293);
    String str = paramString;
    if (paramString != null)
      str = paramString.replace("\\[", "[[]").replace("%", "").replace("\\^", "").replace("'", "").replace("\\{", "").replace("\\}", "").replace("\"", "");
    AppMethodBeat.o(52293);
    return str;
  }

  public static boolean y(char paramChar)
  {
    AppMethodBeat.i(52304);
    Character.UnicodeBlock localUnicodeBlock = Character.UnicodeBlock.of(paramChar);
    boolean bool;
    if ((localUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || (localUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || (localUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || (localUnicodeBlock == Character.UnicodeBlock.GENERAL_PUNCTUATION) || (localUnicodeBlock == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION) || (localUnicodeBlock == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS))
    {
      bool = true;
      AppMethodBeat.o(52304);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52304);
    }
  }

  public static long yz()
  {
    AppMethodBeat.i(52326);
    long l = SystemClock.elapsedRealtime();
    AppMethodBeat.o(52326);
    return l;
  }

  public static void z(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(52320);
    paramContext = (Vibrator)paramContext.getSystemService("vibrator");
    if (paramContext == null)
    {
      ab.w("MicroMsg.Util", "shake:vibrator is null!");
      AppMethodBeat.o(52320);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        paramContext.vibrate(gjH, -1);
        AppMethodBeat.o(52320);
      }
      else
      {
        paramContext.cancel();
        AppMethodBeat.o(52320);
      }
    }
  }

  public static boolean z(char paramChar)
  {
    if (((paramChar >= 'a') && (paramChar <= 'z')) || ((paramChar >= 'A') && (paramChar <= 'Z')));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  // ERROR //
  public static boolean z(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 1915
    //   5: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokestatic 329	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   12: ifne +10 -> 22
    //   15: aload_1
    //   16: invokestatic 1917	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   19: ifeq +19 -> 38
    //   22: ldc 175
    //   24: ldc_w 1919
    //   27: invokestatic 713	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: ldc_w 1915
    //   33: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: iload_2
    //   37: ireturn
    //   38: new 1661	java/io/FileOutputStream
    //   41: astore_3
    //   42: aload_3
    //   43: aload_0
    //   44: invokespecial 1920	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   47: aload_3
    //   48: astore_0
    //   49: aload_3
    //   50: aload_1
    //   51: invokevirtual 1923	java/io/FileOutputStream:write	([B)V
    //   54: aload_3
    //   55: astore_0
    //   56: aload_3
    //   57: invokevirtual 1669	java/io/FileOutputStream:flush	()V
    //   60: aload_3
    //   61: invokevirtual 1670	java/io/FileOutputStream:close	()V
    //   64: ldc 175
    //   66: ldc_w 1925
    //   69: invokestatic 1162	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: iconst_1
    //   73: istore_2
    //   74: ldc_w 1915
    //   77: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: goto -44 -> 36
    //   83: astore_0
    //   84: ldc 175
    //   86: aload_0
    //   87: ldc 230
    //   89: iconst_0
    //   90: anewarray 4	java/lang/Object
    //   93: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: goto -32 -> 64
    //   99: astore 4
    //   101: aconst_null
    //   102: astore_1
    //   103: aload_1
    //   104: astore_0
    //   105: ldc 175
    //   107: aload 4
    //   109: ldc 230
    //   111: iconst_0
    //   112: anewarray 4	java/lang/Object
    //   115: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: aload_1
    //   119: astore_0
    //   120: ldc 175
    //   122: ldc_w 1927
    //   125: invokestatic 713	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload_1
    //   129: ifnull +7 -> 136
    //   132: aload_1
    //   133: invokevirtual 1670	java/io/FileOutputStream:close	()V
    //   136: ldc_w 1915
    //   139: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   142: goto -106 -> 36
    //   145: astore_0
    //   146: ldc 175
    //   148: aload_0
    //   149: ldc 230
    //   151: iconst_0
    //   152: anewarray 4	java/lang/Object
    //   155: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: goto -22 -> 136
    //   161: astore_1
    //   162: aconst_null
    //   163: astore_0
    //   164: aload_0
    //   165: ifnull +7 -> 172
    //   168: aload_0
    //   169: invokevirtual 1670	java/io/FileOutputStream:close	()V
    //   172: ldc_w 1915
    //   175: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: aload_1
    //   179: athrow
    //   180: astore_0
    //   181: ldc 175
    //   183: aload_0
    //   184: ldc 230
    //   186: iconst_0
    //   187: anewarray 4	java/lang/Object
    //   190: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: goto -21 -> 172
    //   196: astore_1
    //   197: goto -33 -> 164
    //   200: astore 4
    //   202: aload_3
    //   203: astore_1
    //   204: goto -101 -> 103
    //
    // Exception table:
    //   from	to	target	type
    //   60	64	83	java/io/IOException
    //   38	47	99	java/lang/Exception
    //   132	136	145	java/io/IOException
    //   38	47	161	finally
    //   168	172	180	java/io/IOException
    //   49	54	196	finally
    //   56	60	196	finally
    //   105	118	196	finally
    //   120	128	196	finally
    //   49	54	200	java/lang/Exception
    //   56	60	200	java/lang/Exception
  }

  public static final class a
  {
    private Context context;

    public a(Context paramContext)
    {
      this.context = paramContext;
    }

    private static String gY(Context paramContext)
    {
      AppMethodBeat.i(52292);
      if (paramContext == null)
      {
        AppMethodBeat.o(52292);
        paramContext = null;
      }
      while (true)
      {
        return paramContext;
        Object localObject1 = (ActivityManager)paramContext.getSystemService("activity");
        paramContext = paramContext.getPackageName();
        if ((localObject1 == null) || (bo.isNullOrNil(paramContext)))
        {
          AppMethodBeat.o(52292);
          paramContext = null;
        }
        else
        {
          try
          {
            Object localObject2 = ((ActivityManager)localObject1).getRunningTasks(100);
            localObject1 = new StringBuffer();
            localObject2 = ((List)localObject2).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              ActivityManager.RunningTaskInfo localRunningTaskInfo = (ActivityManager.RunningTaskInfo)((Iterator)localObject2).next();
              if ((localRunningTaskInfo.baseActivity.getClassName().startsWith(paramContext)) || (localRunningTaskInfo.topActivity.getClassName().startsWith(paramContext)))
                ((StringBuffer)localObject1).append(String.format("{id:%d num:%d/%d top:%s base:%s}", new Object[] { Integer.valueOf(localRunningTaskInfo.id), Integer.valueOf(localRunningTaskInfo.numRunning), Integer.valueOf(localRunningTaskInfo.numActivities), localRunningTaskInfo.topActivity.getShortClassName(), localRunningTaskInfo.baseActivity.getShortClassName() }));
            }
          }
          catch (Exception paramContext)
          {
            ab.printErrStackTrace("MicroMsg.Util", paramContext, "", new Object[0]);
            paramContext = "";
            AppMethodBeat.o(52292);
          }
          continue;
          paramContext = ((StringBuffer)localObject1).toString();
          AppMethodBeat.o(52292);
        }
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(52291);
      String str = gY(this.context);
      AppMethodBeat.o(52291);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bo
 * JD-Core Version:    0.6.2
 */
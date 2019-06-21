package com.tencent.mm.plugin.sns.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Vibrator;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.g.a.of;
import com.tencent.mm.g.a.qw;
import com.tencent.mm.modelsfs.f;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.o;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.List<Lcom.tencent.mm.protocal.protobuf.bau;>;
import java.util.TimeZone;

public final class i
{
  public static String jrk = "<TimelineObject>";
  public static String jrl = "</TimelineObject>";
  private static Vibrator kgA;
  public static int qGd = 2147483647;
  public static String qGe = "/";
  private static String qGf = "snsb";
  private static int qGg = -1;
  private static int qGh = -1;
  public static int qGi = 4194304;
  public static int qGj = 1048576;

  public static boolean B(Bitmap paramBitmap)
  {
    AppMethodBeat.i(35831);
    boolean bool;
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      bool = false;
      AppMethodBeat.o(35831);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(35831);
    }
  }

  public static boolean CM(int paramInt)
  {
    AppMethodBeat.i(35847);
    ah.getContext().getSharedPreferences(ah.doA(), 0).edit().putInt("sns_control_flag", paramInt).commit();
    AppMethodBeat.o(35847);
    return true;
  }

  public static boolean CN(int paramInt)
  {
    AppMethodBeat.i(35849);
    ah.getContext().getSharedPreferences(ah.doA(), 0).edit().putInt("sns_respone_count", paramInt).commit();
    AppMethodBeat.o(35849);
    return true;
  }

  public static String K(CharSequence paramCharSequence)
  {
    int i = 0;
    AppMethodBeat.i(35851);
    if (paramCharSequence == null)
    {
      paramCharSequence = "";
      AppMethodBeat.o(35851);
    }
    while (true)
    {
      return paramCharSequence;
      paramCharSequence = new SpannableString(paramCharSequence);
      o[] arrayOfo = (o[])paramCharSequence.getSpans(0, paramCharSequence.length(), o.class);
      ab.d("MicroMsg.SnsUtil", "removeClickSpanInString, clickSpans.length:%d", new Object[] { Integer.valueOf(arrayOfo.length) });
      while (i < arrayOfo.length)
      {
        paramCharSequence.removeSpan(arrayOfo[i]);
        i++;
      }
      paramCharSequence = paramCharSequence.toString();
      AppMethodBeat.o(35851);
    }
  }

  private static Rect W(Bitmap paramBitmap)
  {
    AppMethodBeat.i(35841);
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    paramBitmap = new Rect(i / 4, 0, (int)(i * 3 / 4.0D), j);
    AppMethodBeat.o(35841);
    return paramBitmap;
  }

  private static Rect X(Bitmap paramBitmap)
  {
    AppMethodBeat.i(35842);
    paramBitmap = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    AppMethodBeat.o(35842);
    return paramBitmap;
  }

  public static String Xa(String paramString)
  {
    AppMethodBeat.i(35807);
    paramString = "snst_" + Xm(paramString);
    AppMethodBeat.o(35807);
    return paramString;
  }

  public static String Xb(String paramString)
  {
    AppMethodBeat.i(35808);
    paramString = "snsu_" + Xm(paramString);
    AppMethodBeat.o(35808);
    return paramString;
  }

  public static String Xc(String paramString)
  {
    AppMethodBeat.i(35809);
    paramString = "snsb_" + Xm(paramString);
    AppMethodBeat.o(35809);
    return paramString;
  }

  public static String Xd(String paramString)
  {
    AppMethodBeat.i(35812);
    paramString = "snsu_" + Xm(paramString);
    AppMethodBeat.o(35812);
    return paramString;
  }

  public static String Xe(String paramString)
  {
    AppMethodBeat.i(35821);
    paramString = "sns_tmpb_" + Xm(paramString);
    AppMethodBeat.o(35821);
    return paramString;
  }

  public static String Xf(String paramString)
  {
    AppMethodBeat.i(35823);
    paramString = "sns_tmpt_" + Xm(paramString);
    AppMethodBeat.o(35823);
    return paramString;
  }

  public static String Xg(String paramString)
  {
    AppMethodBeat.i(35826);
    paramString = "sns_tmps_" + Xm(paramString);
    AppMethodBeat.o(35826);
    return paramString;
  }

  public static String Xh(String paramString)
  {
    AppMethodBeat.i(35829);
    paramString = "9_".concat(String.valueOf(paramString));
    AppMethodBeat.o(35829);
    return paramString;
  }

  public static com.tencent.mm.memory.n Xi(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(35834);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("decodeFileToBlurThumbBitmap ");
      ab.i("MicroMsg.SnsUtil", com.tencent.mm.vfs.e.ct(paramString));
      boolean bool = com.tencent.mm.vfs.e.ct(paramString);
      if (!bool)
      {
        AppMethodBeat.o(35834);
        paramString = localObject;
      }
      while (true)
      {
        return paramString;
        paramString = Xk(paramString);
        AppMethodBeat.o(35834);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsUtil", paramString, "snsdecode error", new Object[0]);
        AppMethodBeat.o(35834);
        paramString = localObject;
      }
    }
  }

  // ERROR //
  public static Bitmap Xj(String paramString)
  {
    // Byte code:
    //   0: ldc_w 258
    //   3: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokestatic 236	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   10: istore_1
    //   11: iload_1
    //   12: ifne +13 -> 25
    //   15: ldc_w 258
    //   18: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aconst_null
    //   22: astore_0
    //   23: aload_0
    //   24: areturn
    //   25: new 260	android/graphics/BitmapFactory$Options
    //   28: astore_2
    //   29: aload_2
    //   30: invokespecial 262	android/graphics/BitmapFactory$Options:<init>	()V
    //   33: invokestatic 267	com/tencent/mm/sdk/platformtools/d:dnX	()V
    //   36: aload_2
    //   37: iconst_1
    //   38: putfield 270	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   41: aload_2
    //   42: getfield 270	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   45: istore_3
    //   46: iload_3
    //   47: bipush 10
    //   49: if_icmple +14 -> 63
    //   52: ldc_w 258
    //   55: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aconst_null
    //   59: astore_0
    //   60: goto -37 -> 23
    //   63: aload_0
    //   64: invokestatic 274	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   67: astore 4
    //   69: invokestatic 280	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   72: lstore 5
    //   74: aload 4
    //   76: aconst_null
    //   77: aload_2
    //   78: invokestatic 286	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   81: astore 7
    //   83: lload 5
    //   85: invokestatic 290	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   88: lstore 5
    //   90: aload_2
    //   91: getfield 270	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   94: iconst_1
    //   95: if_icmple +33 -> 128
    //   98: new 176	java/lang/StringBuilder
    //   101: astore 8
    //   103: aload 8
    //   105: ldc_w 292
    //   108: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   111: ldc 132
    //   113: aload 8
    //   115: aload_2
    //   116: getfield 270	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   119: invokevirtual 295	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   122: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: invokestatic 298	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload 7
    //   130: astore 8
    //   132: aload 7
    //   134: ifnull +17 -> 151
    //   137: aload_0
    //   138: aload 7
    //   140: invokestatic 302	com/tencent/mm/plugin/sns/data/i:s	(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   143: astore 8
    //   145: aload_0
    //   146: lload 5
    //   148: invokestatic 308	com/tencent/mm/plugin/sns/i/c:an	(Ljava/lang/String;J)V
    //   151: aload 4
    //   153: ifnull +8 -> 161
    //   156: aload 4
    //   158: invokevirtual 313	java/io/InputStream:close	()V
    //   161: ldc_w 258
    //   164: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: aload 8
    //   169: astore_0
    //   170: goto -147 -> 23
    //   173: astore 8
    //   175: aconst_null
    //   176: astore 8
    //   178: aload_2
    //   179: aload_2
    //   180: getfield 270	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   183: iconst_1
    //   184: iadd
    //   185: putfield 270	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   188: aload 8
    //   190: ifnull -149 -> 41
    //   193: aload 8
    //   195: invokevirtual 313	java/io/InputStream:close	()V
    //   198: goto -157 -> 41
    //   201: astore 8
    //   203: goto -162 -> 41
    //   206: astore_0
    //   207: aconst_null
    //   208: astore 8
    //   210: aload 8
    //   212: ifnull +8 -> 220
    //   215: aload 8
    //   217: invokevirtual 313	java/io/InputStream:close	()V
    //   220: ldc_w 258
    //   223: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: aload_0
    //   227: athrow
    //   228: astore_0
    //   229: ldc 132
    //   231: aload_0
    //   232: ldc 247
    //   234: iconst_0
    //   235: anewarray 4	java/lang/Object
    //   238: invokestatic 251	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   241: ldc_w 258
    //   244: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   247: aconst_null
    //   248: astore_0
    //   249: goto -226 -> 23
    //   252: astore_0
    //   253: goto -92 -> 161
    //   256: astore 8
    //   258: goto -38 -> 220
    //   261: astore_0
    //   262: aload 4
    //   264: astore 8
    //   266: goto -56 -> 210
    //   269: astore_0
    //   270: goto -60 -> 210
    //   273: astore 8
    //   275: aload 4
    //   277: astore 8
    //   279: goto -101 -> 178
    //
    // Exception table:
    //   from	to	target	type
    //   63	69	173	java/lang/OutOfMemoryError
    //   193	198	201	java/io/IOException
    //   63	69	206	finally
    //   6	11	228	java/lang/Exception
    //   25	41	228	java/lang/Exception
    //   41	46	228	java/lang/Exception
    //   156	161	228	java/lang/Exception
    //   193	198	228	java/lang/Exception
    //   215	220	228	java/lang/Exception
    //   220	228	228	java/lang/Exception
    //   156	161	252	java/io/IOException
    //   215	220	256	java/io/IOException
    //   69	128	261	finally
    //   137	151	261	finally
    //   178	188	269	finally
    //   69	128	273	java/lang/OutOfMemoryError
    //   137	151	273	java/lang/OutOfMemoryError
  }

  public static com.tencent.mm.memory.n Xk(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(35836);
    try
    {
      boolean bool = com.tencent.mm.vfs.e.ct(paramString);
      if (!bool)
      {
        AppMethodBeat.o(35836);
        paramString = localObject;
        return paramString;
      }
      BitmapFactory.Options localOptions = new android/graphics/BitmapFactory$Options;
      localOptions.<init>();
      d.dnX();
      localOptions.inSampleSize = 1;
      while (true)
        while (true)
        {
          int i = localOptions.inSampleSize;
          if (i > 10)
          {
            AppMethodBeat.o(35836);
            paramString = localObject;
            break;
          }
          try
          {
            long l = bo.yz();
            com.tencent.mm.memory.n localn = com.tencent.mm.plugin.sns.d.a.c(paramString, localOptions);
            l = bo.az(l);
            if (localn != null)
              c.an(paramString, l);
            AppMethodBeat.o(35836);
            paramString = localn;
          }
          catch (OutOfMemoryError localOutOfMemoryError)
          {
            localOptions.inSampleSize += 1;
          }
        }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsUtil", paramString, "snsdecode error", new Object[0]);
        AppMethodBeat.o(35836);
        paramString = localObject;
      }
    }
  }

  public static String Xl(String paramString)
  {
    AppMethodBeat.i(35837);
    paramString = new StringBuffer(paramString);
    while (paramString.length() < 25)
      paramString.insert(0, "0");
    paramString = paramString.toString();
    AppMethodBeat.o(35837);
    return paramString;
  }

  private static String Xm(String paramString)
  {
    AppMethodBeat.i(35840);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(35840);
    }
    while (true)
    {
      return paramString;
      int i = paramString.length();
      for (int j = 0; (j < i) && (paramString.charAt(j) == '0'); j++);
      paramString = paramString.substring(j);
      AppMethodBeat.o(35840);
    }
  }

  public static boolean Xn(String paramString)
  {
    AppMethodBeat.i(35844);
    boolean bool = paramString.startsWith(com.tencent.mm.compatible.util.e.eSl);
    AppMethodBeat.o(35844);
    return bool;
  }

  public static boolean Xo(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(35845);
    try
    {
      BitmapFactory.Options localOptions = new android/graphics/BitmapFactory$Options;
      localOptions.<init>();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(paramString, localOptions);
      int i = localOptions.outWidth;
      int j = localOptions.outHeight;
      if ((j >= i * 2) || (i >= j * 2))
      {
        AppMethodBeat.o(35845);
        bool = true;
        return bool;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.SnsUtil", "get error setImageExtInfo");
        AppMethodBeat.o(35845);
        continue;
        AppMethodBeat.o(35845);
      }
    }
  }

  public static boolean Xp(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(35846);
    int i = qGi;
    try
    {
      paramString = d.amj(paramString);
      j = paramString.outWidth;
      k = paramString.outHeight;
      if ((k <= 0) && (j <= 0))
      {
        AppMethodBeat.o(35846);
        return bool;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        int j;
        int k;
        ab.e("MicroMsg.SnsUtil", "get error setImageExtInfo");
        AppMethodBeat.o(35846);
        continue;
        if ((k >= j * 2) || (j >= k * 2))
        {
          AppMethodBeat.o(35846);
        }
        else if (k * j > i)
        {
          bool = true;
          AppMethodBeat.o(35846);
        }
        else
        {
          AppMethodBeat.o(35846);
        }
      }
    }
  }

  public static long Xq(String paramString)
  {
    long l1 = 0L;
    AppMethodBeat.i(35857);
    long l2;
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(35857);
      l2 = l1;
    }
    while (true)
    {
      return l2;
      l2 = l1;
      try
      {
        BigInteger localBigInteger = new java/math/BigInteger;
        l2 = l1;
        localBigInteger.<init>(paramString);
        l2 = l1;
        l1 = localBigInteger.longValue();
        l2 = l1;
        ab.i("MicroMsg.SnsUtil", "seq %s to snsId %d ", new Object[] { paramString, Long.valueOf(l1) });
        l2 = l1;
        label75: AppMethodBeat.o(35857);
      }
      catch (Exception paramString)
      {
        break label75;
      }
    }
  }

  // ERROR //
  public static int Xr(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 411
    //   5: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokestatic 414	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   12: istore_2
    //   13: iload_2
    //   14: ifeq +11 -> 25
    //   17: ldc_w 411
    //   20: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: iload_1
    //   24: ireturn
    //   25: ldc 132
    //   27: ldc_w 416
    //   30: iconst_1
    //   31: anewarray 4	java/lang/Object
    //   34: dup
    //   35: iconst_0
    //   36: aload_0
    //   37: aastore
    //   38: invokestatic 406	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: new 418	android/media/MediaMetadataRetriever
    //   44: astore_3
    //   45: aload_3
    //   46: invokespecial 419	android/media/MediaMetadataRetriever:<init>	()V
    //   49: aload_3
    //   50: astore 4
    //   52: aload_3
    //   53: aload_0
    //   54: invokevirtual 422	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   57: aload_3
    //   58: astore 4
    //   60: aload_3
    //   61: bipush 9
    //   63: invokevirtual 425	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   66: iconst_0
    //   67: invokestatic 429	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   70: i2l
    //   71: invokestatic 433	com/tencent/mm/sdk/platformtools/bo:mA	(J)I
    //   74: istore 5
    //   76: iload 5
    //   78: istore_1
    //   79: aload_3
    //   80: invokevirtual 436	android/media/MediaMetadataRetriever:release	()V
    //   83: ldc_w 411
    //   86: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: goto -66 -> 23
    //   92: astore 4
    //   94: aconst_null
    //   95: astore_3
    //   96: aload_3
    //   97: astore 4
    //   99: ldc 132
    //   101: ldc_w 438
    //   104: iconst_1
    //   105: anewarray 4	java/lang/Object
    //   108: dup
    //   109: iconst_0
    //   110: aload_0
    //   111: aastore
    //   112: invokestatic 440	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload_3
    //   116: ifnull +7 -> 123
    //   119: aload_3
    //   120: invokevirtual 436	android/media/MediaMetadataRetriever:release	()V
    //   123: ldc_w 411
    //   126: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: goto -106 -> 23
    //   132: astore_0
    //   133: aconst_null
    //   134: astore 4
    //   136: aload 4
    //   138: ifnull +8 -> 146
    //   141: aload 4
    //   143: invokevirtual 436	android/media/MediaMetadataRetriever:release	()V
    //   146: ldc_w 411
    //   149: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: aload_0
    //   153: athrow
    //   154: astore_0
    //   155: goto -19 -> 136
    //   158: astore 4
    //   160: goto -64 -> 96
    //
    // Exception table:
    //   from	to	target	type
    //   8	13	92	java/lang/Throwable
    //   25	49	92	java/lang/Throwable
    //   8	13	132	finally
    //   25	49	132	finally
    //   52	57	154	finally
    //   60	76	154	finally
    //   99	115	154	finally
    //   52	57	158	java/lang/Throwable
    //   60	76	158	java/lang/Throwable
  }

  public static List<PointF> Xs(String paramString)
  {
    AppMethodBeat.i(35860);
    ArrayList localArrayList = new ArrayList();
    int j;
    float f1;
    float f2;
    if (!bo.isNullOrNil(paramString))
    {
      String[] arrayOfString1 = paramString.split("[|]");
      int i = arrayOfString1.length;
      j = 0;
      if (j < i)
      {
        String[] arrayOfString2 = arrayOfString1[j].split("[_]");
        if (arrayOfString2.length != 2)
          break label156;
        f1 = bo.getFloat(arrayOfString2[0], -1.0F);
        f2 = bo.getFloat(arrayOfString2[1], -1.0F);
        if ((f1 != -1.0F) && (f2 != -1.0F))
          break label132;
        ab.e("MicroMsg.SnsUtil", "invalid gesture str! %s", new Object[] { paramString });
        localArrayList.clear();
      }
    }
    while (true)
    {
      AppMethodBeat.o(35860);
      return localArrayList;
      label132: localArrayList.add(new PointF(f1, f2));
      j++;
      break;
      label156: ab.e("MicroMsg.SnsUtil", "invalid gesture str! %s", new Object[] { paramString });
      localArrayList.clear();
    }
  }

  public static SpannableString a(String paramString, Context paramContext, TextView paramTextView)
  {
    AppMethodBeat.i(35855);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(35855);
    }
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder("<img src=\"original_label.png\"/>  ");
      localStringBuilder.append(paramString);
      paramString = new SpannableString(j.e(paramContext, localStringBuilder.toString(), (int)paramTextView.getTextSize()));
      AppMethodBeat.o(35855);
    }
  }

  public static void a(SnsAdClick paramSnsAdClick)
  {
    AppMethodBeat.i(35859);
    of localof = new of();
    localof.cKy.cKz = paramSnsAdClick;
    com.tencent.mm.sdk.b.a.xxA.m(localof);
    AppMethodBeat.o(35859);
  }

  public static long afB()
  {
    AppMethodBeat.i(35854);
    long l = (int)(TimeZone.getDefault().getRawOffset() / 60000L) / 60L;
    AppMethodBeat.o(35854);
    return l;
  }

  public static void am(String paramString, long paramLong)
  {
    AppMethodBeat.i(35830);
    long l = System.currentTimeMillis();
    ab.d("MicroMsg.SnsUtil", " name " + paramString + " allTime " + (l - paramLong));
    AppMethodBeat.o(35830);
  }

  public static void b(View paramView, Context paramContext)
  {
    AppMethodBeat.i(35852);
    ViewGroup.LayoutParams localLayoutParams;
    int i;
    int k;
    if ((paramView != null) && (com.tencent.mm.bz.a.dm(paramContext) > 1.0F))
    {
      float f = com.tencent.mm.bz.a.dm(paramContext);
      localLayoutParams = paramView.getLayoutParams();
      i = com.tencent.mm.bz.a.fromDPToPix(paramContext, 60);
      if ((localLayoutParams.width >= 0) && (localLayoutParams.height >= 0))
      {
        int j = (int)(localLayoutParams.width * f);
        k = (int)(f * localLayoutParams.height);
        int m = j;
        if (j > i)
          m = i;
        localLayoutParams.width = m;
        if (k <= i)
          break label117;
      }
    }
    while (true)
    {
      localLayoutParams.height = i;
      paramView.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(35852);
      return;
      label117: i = k;
    }
  }

  public static boolean b(com.tencent.mm.memory.n paramn)
  {
    AppMethodBeat.i(35832);
    boolean bool;
    if ((paramn == null) || (paramn.isRecycled()))
    {
      bool = false;
      AppMethodBeat.o(35832);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(35832);
    }
  }

  public static String bc(int paramInt, String paramString)
  {
    AppMethodBeat.i(35804);
    paramString = paramInt + "-" + paramString;
    AppMethodBeat.o(35804);
    return paramString;
  }

  public static String bd(int paramInt, String paramString)
  {
    AppMethodBeat.i(35828);
    paramString = paramInt + "-" + paramString;
    AppMethodBeat.o(35828);
    return paramString;
  }

  private static String c(bau parambau)
  {
    AppMethodBeat.i(35806);
    if (!bo.isNullOrNil(parambau.wEV))
    {
      parambau = parambau.wEV;
      AppMethodBeat.o(35806);
    }
    while (true)
    {
      return parambau;
      String str = "";
      try
      {
        parambau = g.x(parambau.toByteArray());
        AppMethodBeat.o(35806);
      }
      catch (Exception parambau)
      {
        while (true)
          parambau = str;
      }
    }
  }

  public static int cmq()
  {
    AppMethodBeat.i(35848);
    int i = ah.getContext().getSharedPreferences(ah.doA(), 0).getInt("sns_control_flag", 0);
    AppMethodBeat.o(35848);
    return i;
  }

  public static int cmr()
  {
    AppMethodBeat.i(35850);
    int i = ah.getContext().getSharedPreferences(ah.doA(), 0).getInt("sns_respone_count", 20);
    AppMethodBeat.o(35850);
    return i;
  }

  public static int cms()
  {
    AppMethodBeat.i(35853);
    Context localContext = ah.getContext();
    int i;
    if (at.is2G(localContext))
    {
      i = 1;
      AppMethodBeat.o(35853);
    }
    while (true)
    {
      return i;
      if (at.is3G(localContext))
      {
        i = 2;
        AppMethodBeat.o(35853);
      }
      else if (at.is4G(localContext))
      {
        i = 3;
        AppMethodBeat.o(35853);
      }
      else if (at.isWifi(localContext))
      {
        i = 4;
        AppMethodBeat.o(35853);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(35853);
      }
    }
  }

  public static String d(bau parambau)
  {
    AppMethodBeat.i(35810);
    String str = "snsb_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35810);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35810);
      parambau = str;
    }
  }

  public static String dc(List<bau> paramList)
  {
    AppMethodBeat.i(35805);
    if ((paramList == null) || (paramList.size() == 0))
    {
      localObject = "";
      AppMethodBeat.o(35805);
      return localObject;
    }
    Object localObject = "";
    Iterator localIterator = paramList.iterator();
    int i = 0;
    paramList = (List<bau>)localObject;
    while (true)
    {
      localObject = paramList;
      if (localIterator.hasNext())
      {
        bau localbau = (bau)localIterator.next();
        localObject = paramList;
        if (paramList.length() > 0)
          localObject = paramList + "-";
        paramList = (String)localObject + localbau.Id;
        i++;
        if (i >= 4)
          localObject = paramList;
      }
      else
      {
        AppMethodBeat.o(35805);
        break;
      }
    }
  }

  public static String dd(List<PointF> paramList)
  {
    AppMethodBeat.i(35862);
    StringBuilder localStringBuilder = new StringBuilder("");
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      PointF localPointF = (PointF)localIterator.next();
      localStringBuilder.append(localPointF.x);
      localStringBuilder.append("_");
      localStringBuilder.append(localPointF.y);
      localStringBuilder.append("|");
    }
    if (paramList.size() > 0)
      localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    paramList = localStringBuilder.toString();
    AppMethodBeat.o(35862);
    return paramList;
  }

  public static String e(bau parambau)
  {
    AppMethodBeat.i(35811);
    String str = "snst_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35811);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35811);
      parambau = str;
    }
  }

  public static void e(long[] paramArrayOfLong)
  {
    AppMethodBeat.i(35863);
    try
    {
      if (kgA == null)
        kgA = (Vibrator)ah.getContext().getSystemService("vibrator");
      kgA.vibrate(paramArrayOfLong, -1);
      AppMethodBeat.o(35863);
      return;
    }
    catch (Exception paramArrayOfLong)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsUtil", paramArrayOfLong, "vibrate error!", new Object[0]);
        AppMethodBeat.o(35863);
      }
    }
  }

  public static String f(bau parambau)
  {
    AppMethodBeat.i(35813);
    String str = "snsu_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35813);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35813);
      parambau = str;
    }
  }

  public static String g(bau parambau)
  {
    AppMethodBeat.i(35814);
    String str = "snsblurt_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35814);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35814);
      parambau = str;
    }
  }

  public static String h(bau parambau)
  {
    AppMethodBeat.i(35815);
    String str = "snsblurs_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35815);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35815);
      parambau = str;
    }
  }

  public static String i(bau parambau)
  {
    AppMethodBeat.i(35816);
    String str = "snstblur_src_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35816);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35816);
      parambau = str;
    }
  }

  public static boolean i(com.tencent.mm.plugin.sns.storage.n paramn)
  {
    if ((paramn.field_type == 3) || (paramn.field_type == 4) || (paramn.field_type == 5) || (paramn.field_type == 6) || (paramn.field_type == 9) || (paramn.field_type == 10) || (paramn.field_type == 11) || (paramn.field_type == 12) || (paramn.field_type == 13) || (paramn.field_type == 14) || (paramn.field_type == 17) || (paramn.field_type == 22) || (paramn.field_type == 23));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String j(com.tencent.mm.plugin.sns.storage.n paramn)
  {
    AppMethodBeat.i(35856);
    if (paramn == null)
    {
      paramn = "0";
      AppMethodBeat.o(35856);
    }
    while (true)
    {
      return paramn;
      paramn = jV(paramn.field_snsId);
      AppMethodBeat.o(35856);
    }
  }

  public static String j(bau parambau)
  {
    AppMethodBeat.i(35817);
    String str = "sight_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35817);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35817);
      parambau = str;
    }
  }

  public static String jV(long paramLong)
  {
    AppMethodBeat.i(35838);
    String str = new BigInteger(Long.toBinaryString(paramLong), 2).toString();
    AppMethodBeat.o(35838);
    return str;
  }

  public static String jW(long paramLong)
  {
    AppMethodBeat.i(35839);
    String str;
    if (paramLong == 0L)
    {
      str = "";
      AppMethodBeat.o(35839);
    }
    while (true)
    {
      return str;
      str = Xl(new BigInteger(Long.toBinaryString(paramLong), 2).toString());
      AppMethodBeat.o(35839);
    }
  }

  public static String k(bau parambau)
  {
    AppMethodBeat.i(35818);
    String str = "sightad_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str, parambau.wEU);
      AppMethodBeat.o(35818);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35818);
      parambau = str;
    }
  }

  public static void kI(boolean paramBoolean)
  {
    AppMethodBeat.i(35861);
    qw localqw = new qw();
    localqw.cNc.enable = paramBoolean;
    com.tencent.mm.sdk.b.a.xxA.m(localqw);
    AppMethodBeat.o(35861);
  }

  public static String l(bau parambau)
  {
    AppMethodBeat.i(35819);
    String str = "snsb_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35819);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35819);
      parambau = str;
    }
  }

  public static String m(bau parambau)
  {
    AppMethodBeat.i(35820);
    String str = "sns_tmpb_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35820);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35820);
      parambau = str;
    }
  }

  public static String n(bau parambau)
  {
    AppMethodBeat.i(35822);
    String str = "sns_tmpt_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35822);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35822);
      parambau = str;
    }
  }

  public static String o(bau parambau)
  {
    AppMethodBeat.i(35824);
    String str = "sns_tmpu_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35824);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35824);
      parambau = str;
    }
  }

  public static Bitmap p(List<com.tencent.mm.memory.n> paramList, int paramInt)
  {
    AppMethodBeat.i(35843);
    Object localObject1 = paramList.iterator();
    while (((Iterator)localObject1).hasNext())
      if (!b((com.tencent.mm.memory.n)((Iterator)localObject1).next()))
      {
        AppMethodBeat.o(35843);
        paramList = null;
      }
    while (true)
    {
      return paramList;
      if (paramInt <= 0)
      {
        AppMethodBeat.o(35843);
        paramList = null;
      }
      else
      {
        Bitmap localBitmap = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
        int i = paramList.size();
        LinkedList localLinkedList = new LinkedList();
        int j = paramInt >> 1;
        int k = j + 2;
        j -= 2;
        Object localObject2;
        Object localObject3;
        label175: Rect localRect;
        if (i == 2)
        {
          localObject2 = new Rect(0, 0, j, paramInt);
          localObject1 = new Rect(k, 0, paramInt, paramInt);
          localLinkedList.add(localObject2);
          localLinkedList.add(localObject1);
          localObject3 = new Canvas(localBitmap);
          ((Canvas)localObject3).drawColor(-1);
          i = 0;
          paramInt = 0;
          if ((paramInt >= paramList.size()) || (i >= 4))
            break label506;
          localObject2 = ((com.tencent.mm.memory.n)paramList.get(paramInt)).Xi();
          localRect = (Rect)localLinkedList.get(paramInt);
          switch (paramList.size())
          {
          default:
            localObject1 = X((Bitmap)localObject2);
          case 1:
          case 2:
          case 3:
          }
        }
        while (true)
        {
          ((Canvas)localObject3).drawBitmap((Bitmap)localObject2, (Rect)localObject1, localRect, null);
          i++;
          paramInt++;
          break label175;
          if (i == 3)
          {
            localObject3 = new Rect(0, 0, j, paramInt);
            localObject2 = new Rect(k, 0, paramInt, j);
            localObject1 = new Rect(k, k, paramInt, paramInt);
            localLinkedList.add(localObject3);
            localLinkedList.add(localObject2);
            localLinkedList.add(localObject1);
            break;
          }
          if (i < 4)
            break;
          localObject3 = new Rect(0, 0, j, j);
          localObject2 = new Rect(0, k, j, paramInt);
          localRect = new Rect(k, 0, paramInt, j);
          localObject1 = new Rect(k, k, paramInt, paramInt);
          localLinkedList.add(localObject3);
          localLinkedList.add(localObject2);
          localLinkedList.add(localRect);
          localLinkedList.add(localObject1);
          break;
          localObject1 = X((Bitmap)localObject2);
          continue;
          localObject1 = W((Bitmap)localObject2);
          continue;
          if (paramInt == 0)
            localObject1 = W((Bitmap)localObject2);
          else
            localObject1 = X((Bitmap)localObject2);
        }
        label506: ((Canvas)localObject3).save();
        ((Canvas)localObject3).restore();
        AppMethodBeat.o(35843);
        paramList = localBitmap;
      }
    }
  }

  public static String p(bau parambau)
  {
    AppMethodBeat.i(35825);
    String str = "sns_tmps_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35825);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35825);
      parambau = str;
    }
  }

  public static String q(bau parambau)
  {
    AppMethodBeat.i(35827);
    String str = "sns_tmpsad_" + Xm(parambau.Id);
    if (parambau.wET == 1)
    {
      parambau = f.s(str + c(parambau), parambau.wEU);
      AppMethodBeat.o(35827);
    }
    while (true)
    {
      return parambau;
      AppMethodBeat.o(35827);
      parambau = str;
    }
  }

  public static Bitmap s(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(35833);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(35833);
      return paramBitmap;
    }
    String str;
    if (bo.isNullOrNil(paramString))
      str = "";
    int i;
    while (true)
    {
      if (!bo.isNullOrNil(str))
        break label129;
      AppMethodBeat.o(35833);
      break;
      i = paramString.lastIndexOf(qGe);
      if ((i > 0) && (i + 1 < paramString.length()))
      {
        str = paramString.substring(i + 1);
        if ((str.startsWith(qGf)) || (str.startsWith("sns_tmpb_")))
          str = paramString;
        else if ((str.startsWith("snst_")) || (str.startsWith("snsu_")))
          str = "";
      }
      else
      {
        str = paramString;
      }
    }
    while (true)
    {
      try
      {
        label129: ab.i("MicroMsg.SnsUtil", "[changes below by tomys]parsing jpg, path: %s, size: %s", new Object[] { paramString, Long.valueOf(com.tencent.mm.vfs.e.asZ(paramString)) });
        paramString = Exif.fromFile(paramString);
        if (paramString != null)
        {
          i = paramString.getOrientationInDegree() % 360;
          ab.d("MicroMsg.SnsUtil", "exifPath : %s degree : %d", new Object[] { str, Integer.valueOf(i) });
          paramBitmap = d.b(paramBitmap, i);
          AppMethodBeat.o(35833);
          break;
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.SnsUtil", paramString, "Failed parsing JPEG file: ".concat(String.valueOf(str)), new Object[0]);
        i = 0;
        continue;
      }
      finally
      {
        AppMethodBeat.o(35833);
      }
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.data.i
 * JD-Core Version:    0.6.2
 */
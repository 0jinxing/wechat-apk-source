package com.tencent.ttpic.baseutils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@SuppressLint({"NewApi"})
public class BitmapUtils
{
  public static final int JPEG_QUALITY = 99;
  public static final String RES_PREFIX_ASSETS = "assets://";
  public static final String RES_PREFIX_HTTP = "http://";
  public static final String RES_PREFIX_HTTPS = "https://";
  public static final String RES_PREFIX_STORAGE = "/";
  private static final String TAG;

  static
  {
    AppMethodBeat.i(49652);
    TAG = BitmapUtils.class.getSimpleName();
    AppMethodBeat.o(49652);
  }

  private static boolean IsSupportImgType(String paramString)
  {
    AppMethodBeat.i(49645);
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramString != null)
      if ((!paramString.equalsIgnoreCase("image/jpeg")) && (!paramString.equalsIgnoreCase("image/png")))
      {
        bool2 = bool1;
        if (!paramString.equalsIgnoreCase("image/gif"));
      }
      else
      {
        bool2 = true;
      }
    AppMethodBeat.o(49645);
    return bool2;
  }

  public static boolean bmpIsExists(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(49600);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(49600);
    while (true)
    {
      return bool;
      if ((paramString.startsWith("assets://")) || (new File(paramString).exists()))
      {
        bool = true;
        AppMethodBeat.o(49600);
      }
      else
      {
        AppMethodBeat.o(49600);
      }
    }
  }

  public static byte[] bmpToByteArray(Bitmap paramBitmap, boolean paramBoolean)
  {
    AppMethodBeat.i(49605);
    if (!isLegal(paramBitmap))
    {
      paramBitmap = null;
      AppMethodBeat.o(49605);
    }
    while (true)
    {
      return paramBitmap;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 80, localByteArrayOutputStream);
      if (paramBoolean)
        paramBitmap.recycle();
      paramBitmap = localByteArrayOutputStream.toByteArray();
      try
      {
        localByteArrayOutputStream.close();
        AppMethodBeat.o(49605);
      }
      catch (Exception localException)
      {
        while (true)
          LogUtils.e(localException);
      }
    }
  }

  private static BitmapUtils.Size calcNewSize(BitmapUtils.Size paramSize, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49646);
    int i;
    if (paramSize.height / paramSize.width >= 1.0D)
      i = paramSize.height;
    for (int j = paramSize.width; ; j = paramSize.height)
    {
      paramSize = getNewSize(j, i, paramInt1, paramInt2);
      AppMethodBeat.o(49646);
      return paramSize;
      i = paramSize.width;
    }
  }

  public static int calculateInSampleSize(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(49650);
    int i = paramOptions.outHeight;
    int j = paramOptions.outWidth;
    int k = 1;
    int m;
    float f1;
    float f2;
    if ((paramInt2 <= 0) || (i <= paramInt2))
    {
      m = k;
      if (paramInt1 > 0)
      {
        m = k;
        if (j <= paramInt1);
      }
    }
    else
    {
      m = Math.round(i / paramInt2);
      k = Math.round(j / paramInt1);
      if (paramBoolean)
      {
        if (m < k);
        while (true)
        {
          f1 = j * i;
          f2 = paramInt1 * paramInt2 * 2;
          k = m;
          if (!ApiHelper.hasNougat())
            break label304;
          for (k = m; f1 / (k * k) >= f2; k++);
          m = k;
        }
      }
      if (m < k)
        m = k;
      while (true)
        break;
      m = k;
      if (paramBoolean)
        if (j / k <= paramInt1 * 1.5D)
        {
          m = k;
          if (i / k <= paramInt2 * 1.5D);
        }
        else
        {
          m = j / paramInt1;
          k = i / paramInt2;
          if (m <= k)
            break label297;
        }
    }
    while (true)
    {
      LogUtils.d(TAG, "[calculateInSampleSize] source size = " + j + " * " + i + ", request size = " + paramInt1 + " * " + paramInt2 + ", inSampleSize = " + m + ", preferLarge = " + paramBoolean);
      AppMethodBeat.o(49650);
      return m;
      label297: m = k;
      continue;
      label304: 
      while (f1 / (k * k) > f2)
        k++;
      if (!isPowerOf2(k))
        for (m = k; ; m--)
        {
          n = m;
          if (m <= 2)
            break;
          n = m;
          if (isPowerOf2(m))
            break;
        }
      int n = k;
      m = k;
      if (paramBoolean)
        if (j / n <= paramInt1 * 1.5D)
        {
          m = k;
          if (i / n <= paramInt2 * 1.5D);
        }
        else
        {
          m = n * 2;
        }
    }
  }

  public static int calculateInSampleSizeNew(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(49651);
    int i = paramOptions.outHeight;
    int j = paramOptions.outWidth;
    float f1 = Math.max(j, i);
    float f2 = Math.min(j, i);
    float f3 = Math.max(paramInt1, paramInt2);
    if ((Math.min(paramInt1, paramInt2) <= 0.0F) || (f1 <= f3))
    {
      AppMethodBeat.o(49651);
      paramInt1 = 1;
    }
    while (true)
    {
      return paramInt1;
      if (f1 / f2 <= 2.0F)
        break;
      f3 = i * j;
      f2 = paramInt1 * paramInt2;
      if (!ApiHelper.hasNougat())
        break label277;
      for (paramInt2 = 1; f3 / (paramInt2 * paramInt2) >= f2; paramInt2++);
      paramInt1 = paramInt2;
      if (paramBoolean)
      {
        paramInt1 = paramInt2;
        if (paramInt2 > 1)
          paramInt1 = paramInt2 - 1;
      }
      AppMethodBeat.o(49651);
    }
    while (true)
      if (f3 / (paramInt2 * paramInt2) >= f2)
      {
        paramInt2 *= 2;
      }
      else
      {
        paramInt1 = paramInt2;
        if (!paramBoolean)
          break;
        paramInt1 = paramInt2;
        if (paramInt2 <= 1)
          break;
        paramInt1 = paramInt2 / 2;
        break;
        if (ApiHelper.hasNougat())
        {
          for (paramInt2 = 1; f1 / paramInt2 >= f3; paramInt2++);
          paramInt1 = paramInt2;
          if (!paramBoolean)
            break;
          paramInt1 = paramInt2;
          if (paramInt2 <= 1)
            break;
          paramInt1 = paramInt2 - 1;
          break;
        }
        while (true)
          if (f1 / paramInt2 >= f3)
          {
            paramInt2 *= 2;
          }
          else
          {
            paramInt1 = paramInt2;
            if (!paramBoolean)
              break;
            paramInt1 = paramInt2;
            if (paramInt2 <= 1)
              break;
            paramInt1 = paramInt2 / 2;
            break;
            paramInt2 = 1;
          }
        label277: paramInt2 = 1;
      }
  }

  public static String compressImage(String paramString, BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49642);
    try
    {
      paramOptions = getScaledOpt(paramOptions, paramInt1, paramInt2);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separatorChar + "Pitu";
      File localFile = new java/io/File;
      localFile.<init>((String)localObject);
      paramString = compressImageFile(paramString, paramOptions, localFile);
      AppMethodBeat.o(49642);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        LogUtils.e(paramString);
        paramString = null;
        AppMethodBeat.o(49642);
      }
    }
  }

  // ERROR //
  private static String compressImageFile(String paramString, BitmapFactory.Options paramOptions, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 241
    //   4: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: getstatic 45	com/tencent/ttpic/baseutils/BitmapUtils:TAG	Ljava/lang/String;
    //   10: ldc 243
    //   12: iconst_3
    //   13: anewarray 4	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: aload_0
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: aload_1
    //   23: aastore
    //   24: dup
    //   25: iconst_2
    //   26: aload_2
    //   27: invokevirtual 223	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   30: aastore
    //   31: invokestatic 246	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: aload_2
    //   35: invokevirtual 86	java/io/File:exists	()Z
    //   38: ifne +8 -> 46
    //   41: aload_2
    //   42: invokevirtual 249	java/io/File:mkdirs	()Z
    //   45: pop
    //   46: new 165	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 214	java/lang/StringBuilder:<init>	()V
    //   53: aload_2
    //   54: invokevirtual 223	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   57: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: getstatic 252	java/io/File:separator	Ljava/lang/String;
    //   63: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: ldc 254
    //   68: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: new 256	java/util/Date
    //   74: dup
    //   75: invokespecial 257	java/util/Date:<init>	()V
    //   78: invokevirtual 261	java/util/Date:getTime	()J
    //   81: invokevirtual 264	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   84: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: astore 4
    //   89: new 79	java/io/File
    //   92: dup
    //   93: aload 4
    //   95: invokespecial 82	java/io/File:<init>	(Ljava/lang/String;)V
    //   98: astore_2
    //   99: aload_2
    //   100: invokevirtual 86	java/io/File:exists	()Z
    //   103: ifne +8 -> 111
    //   106: aload_2
    //   107: invokevirtual 267	java/io/File:createNewFile	()Z
    //   110: pop
    //   111: new 269	java/io/FileOutputStream
    //   114: astore 5
    //   116: aload 5
    //   118: aload_2
    //   119: invokespecial 272	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   122: aload 5
    //   124: astore_2
    //   125: aload_1
    //   126: getfield 275	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   129: invokestatic 277	com/tencent/ttpic/baseutils/BitmapUtils:IsSupportImgType	(Ljava/lang/String;)Z
    //   132: ifne +64 -> 196
    //   135: aload 5
    //   137: astore_2
    //   138: aload_1
    //   139: getstatic 283	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   142: putfield 286	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   145: aload 5
    //   147: astore_2
    //   148: aload_1
    //   149: iconst_1
    //   150: putfield 290	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   153: aload 5
    //   155: astore_2
    //   156: aload_1
    //   157: iconst_1
    //   158: putfield 293	android/graphics/BitmapFactory$Options:inInputShareable	Z
    //   161: aload 5
    //   163: astore_2
    //   164: aload_0
    //   165: aload_1
    //   166: invokestatic 299	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   169: astore_0
    //   170: aload_0
    //   171: ifnull +61 -> 232
    //   174: aload 5
    //   176: astore_2
    //   177: aload_0
    //   178: getstatic 104	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   181: bipush 90
    //   183: aload 5
    //   185: invokevirtual 110	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   188: pop
    //   189: aload 5
    //   191: astore_2
    //   192: aload_0
    //   193: invokevirtual 113	android/graphics/Bitmap:recycle	()V
    //   196: aload 5
    //   198: astore_2
    //   199: aload 5
    //   201: invokevirtual 302	java/io/OutputStream:close	()V
    //   204: aload 5
    //   206: invokevirtual 302	java/io/OutputStream:close	()V
    //   209: ldc 241
    //   211: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   214: aload 4
    //   216: astore_0
    //   217: aload_0
    //   218: areturn
    //   219: astore_0
    //   220: aload 5
    //   222: astore_2
    //   223: aload_0
    //   224: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   227: aconst_null
    //   228: astore_0
    //   229: goto -59 -> 170
    //   232: aload 5
    //   234: invokevirtual 302	java/io/OutputStream:close	()V
    //   237: ldc 241
    //   239: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: aload_3
    //   243: astore_0
    //   244: goto -27 -> 217
    //   247: astore_1
    //   248: aconst_null
    //   249: astore_0
    //   250: aload_0
    //   251: astore_2
    //   252: aload_1
    //   253: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   256: aload_0
    //   257: ifnull +7 -> 264
    //   260: aload_0
    //   261: invokevirtual 302	java/io/OutputStream:close	()V
    //   264: ldc 241
    //   266: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   269: aload_3
    //   270: astore_0
    //   271: goto -54 -> 217
    //   274: astore_0
    //   275: aconst_null
    //   276: astore_2
    //   277: aload_2
    //   278: ifnull +7 -> 285
    //   281: aload_2
    //   282: invokevirtual 302	java/io/OutputStream:close	()V
    //   285: ldc 241
    //   287: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   290: aload_0
    //   291: athrow
    //   292: astore_0
    //   293: goto -56 -> 237
    //   296: astore_0
    //   297: goto -88 -> 209
    //   300: astore_0
    //   301: goto -37 -> 264
    //   304: astore_1
    //   305: goto -20 -> 285
    //   308: astore_0
    //   309: goto -32 -> 277
    //   312: astore_1
    //   313: aload 5
    //   315: astore_0
    //   316: goto -66 -> 250
    //
    // Exception table:
    //   from	to	target	type
    //   164	170	219	java/lang/OutOfMemoryError
    //   99	111	247	java/lang/Exception
    //   111	122	247	java/lang/Exception
    //   99	111	274	finally
    //   111	122	274	finally
    //   232	237	292	java/io/IOException
    //   204	209	296	java/io/IOException
    //   260	264	300	java/io/IOException
    //   281	285	304	java/io/IOException
    //   125	135	308	finally
    //   138	145	308	finally
    //   148	153	308	finally
    //   156	161	308	finally
    //   164	170	308	finally
    //   177	189	308	finally
    //   192	196	308	finally
    //   199	204	308	finally
    //   223	227	308	finally
    //   252	256	308	finally
    //   125	135	312	java/lang/Exception
    //   138	145	312	java/lang/Exception
    //   148	153	312	java/lang/Exception
    //   156	161	312	java/lang/Exception
    //   164	170	312	java/lang/Exception
    //   177	189	312	java/lang/Exception
    //   192	196	312	java/lang/Exception
    //   199	204	312	java/lang/Exception
    //   223	227	312	java/lang/Exception
  }

  public static Bitmap convertToSRGB(Bitmap paramBitmap)
  {
    AppMethodBeat.i(49604);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(49604);
    }
    while (true)
    {
      return paramBitmap;
      try
      {
        Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
        Canvas localCanvas = new android/graphics/Canvas;
        localCanvas.<init>(localBitmap);
        Paint localPaint = new android/graphics/Paint;
        localPaint.<init>();
        localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
        paramBitmap.recycle();
        AppMethodBeat.o(49604);
        paramBitmap = localBitmap;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        LogUtils.e(localOutOfMemoryError);
        AppMethodBeat.o(49604);
      }
    }
  }

  public static Bitmap copy(Bitmap paramBitmap, boolean paramBoolean)
  {
    AppMethodBeat.i(49603);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    try
    {
      if (isLegal(paramBitmap))
        localObject2 = paramBitmap.copy(paramBitmap.getConfig(), paramBoolean);
      AppMethodBeat.o(49603);
      return localObject2;
    }
    catch (OutOfMemoryError paramBitmap)
    {
      while (true)
      {
        LogUtils.e(TAG, "bitmap copy OOM!");
        localObject2 = localObject1;
      }
    }
  }

  public static Bitmap correctImageToFitIn(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49638);
    Bitmap localBitmap = null;
    int i;
    int j;
    if (paramBitmap != null)
    {
      i = paramBitmap.getWidth();
      j = paramBitmap.getHeight();
      if ((i > paramInt1) || (j > paramInt2))
        break label54;
      localBitmap = Bitmap.createScaledBitmap(paramBitmap, i, j, true);
    }
    while (true)
    {
      AppMethodBeat.o(49638);
      return localBitmap;
      label54: double d;
      if (paramInt2 * 1.0D / j > paramInt1 * 1.0D / i)
      {
        d = paramInt1 * 1.0D / i;
        localBitmap = Bitmap.createScaledBitmap(paramBitmap, paramInt1, (int)(j * d), true);
      }
      else
      {
        d = paramInt2 * 1.0D / j;
        localBitmap = Bitmap.createScaledBitmap(paramBitmap, (int)(i * d), paramInt2, true);
      }
    }
  }

  public static Bitmap createBitmap(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Matrix paramMatrix)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(49617);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      AppMethodBeat.o(49617);
      paramBitmap = (Bitmap)localObject2;
    }
    while (true)
    {
      return paramBitmap;
      Canvas localCanvas = new Canvas();
      if ((paramMatrix == null) || (paramMatrix.isIdentity()));
      while (true)
      {
        try
        {
          paramMatrix = Bitmap.createBitmap(paramInt3, paramInt4, paramBitmap.getConfig());
          localObject2 = paramMatrix;
          ((Bitmap)localObject2).setDensity(paramBitmap.getDensity());
          localCanvas.setBitmap((Bitmap)localObject2);
          localCanvas.drawBitmap(paramBitmap, new Rect(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4), new RectF(0.0F, 0.0F, paramInt3, paramInt4), (Paint)localObject1);
          AppMethodBeat.o(49617);
          paramBitmap = (Bitmap)localObject2;
        }
        catch (OutOfMemoryError paramBitmap)
        {
          LogUtils.e(paramBitmap);
          AppMethodBeat.o(49617);
          paramBitmap = (Bitmap)localObject2;
        }
        catch (NullPointerException paramBitmap)
        {
          LogUtils.e(paramBitmap);
          AppMethodBeat.o(49617);
          paramBitmap = (Bitmap)localObject2;
        }
        break;
        localObject1 = new RectF(0.0F, 0.0F, paramInt3, paramInt4);
        paramMatrix.mapRect((RectF)localObject1);
        try
        {
          Bitmap localBitmap = Bitmap.createBitmap(Math.round(((RectF)localObject1).width()), Math.round(((RectF)localObject1).height()), paramBitmap.getConfig());
          localCanvas.translate(-((RectF)localObject1).left, -((RectF)localObject1).top);
          localCanvas.concat(paramMatrix);
          Paint localPaint = new Paint(2);
          localObject1 = localPaint;
          localObject2 = localBitmap;
          if (!paramMatrix.rectStaysRect())
          {
            localPaint.setAntiAlias(true);
            localObject1 = localPaint;
            localObject2 = localBitmap;
          }
        }
        catch (OutOfMemoryError paramBitmap)
        {
          LogUtils.e(paramBitmap);
          AppMethodBeat.o(49617);
          paramBitmap = (Bitmap)localObject2;
        }
      }
    }
  }

  public static Bitmap decodeBitmapFromFileExtForShare(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    AppMethodBeat.i(49641);
    LogUtils.d(TAG, "decodeBitmapFromFileExtForShare(%s, %d, %d, %d)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(49641);
    for (paramString = null; ; paramString = null)
    {
      return paramString;
      if (new File(paramString).exists())
        break;
      AppMethodBeat.o(49641);
    }
    int i = getDegreeByExif(paramString);
    int j;
    if (paramInt1 < paramInt2)
    {
      j = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = j;
    }
    while (true)
      while (true)
      {
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(paramString, localOptions);
        label150: int k;
        if (localOptions.outWidth > localOptions.outHeight)
        {
          j = localOptions.outWidth;
          if (localOptions.outWidth >= localOptions.outHeight)
            break label269;
          k = localOptions.outWidth;
          localOptions.inJustDecodeBounds = false;
          localOptions.inSampleSize = 1;
        }
        try
        {
          Bitmap localBitmap;
          do
          {
            localBitmap = BitmapFactory.decodeFile(paramString, localOptions);
            if ((localBitmap != null) || ((j / localOptions.inSampleSize < paramInt1) && (k / localOptions.inSampleSize < paramInt2)))
              break;
            localObject1 = localBitmap;
          }
          while (localOptions.inSampleSize <= paramInt3);
          if ((localBitmap != null) && (i != 0))
          {
            paramString = rotateBitmap(localBitmap, i);
            AppMethodBeat.o(49641);
            break;
            j = localOptions.outHeight;
            break label150;
            label269: k = localOptions.outHeight;
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          while (true)
          {
            localOptions.inSampleSize *= 2;
            LogUtils.w(TAG, "[decodeBitmapFromFileExtForShare] " + localOutOfMemoryError.getMessage());
            Object localObject2 = localObject1;
            continue;
            paramString = localObject2;
          }
        }
      }
  }

  public static Bitmap decodeBitmapFromFileForShare(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    Object localObject = null;
    int i = 1;
    AppMethodBeat.i(49640);
    LogUtils.d(TAG, "decodeBitmapFromFileForShare(%s, %d, %d, %s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramArrayOfInt });
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(49640);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (!new File(paramString).exists())
      {
        AppMethodBeat.o(49640);
        paramString = localObject;
      }
      else
      {
        int j = getDegreeByExif(paramString);
        try
        {
          BitmapFactory.Options localOptions = new android/graphics/BitmapFactory$Options;
          localOptions.<init>();
          localOptions.inJustDecodeBounds = true;
          BitmapFactory.decodeFile(paramString, localOptions);
          BitmapUtils.Size localSize = new com/tencent/ttpic/baseutils/BitmapUtils$Size;
          localSize.<init>(localOptions.outWidth, localOptions.outHeight);
          String str = TAG;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("decodeBitmapFromFileForShare(), outer width = ");
          LogUtils.v(str, localOptions.outWidth + ", height = " + localOptions.outHeight);
          if ((paramArrayOfInt != null) && (paramArrayOfInt.length == 2))
          {
            paramArrayOfInt[0] = localOptions.outWidth;
            paramArrayOfInt[1] = localOptions.outHeight;
          }
          boolean bool = shouldResize(localSize, paramInt1, paramInt2);
          paramArrayOfInt = localSize;
          if (bool)
            paramArrayOfInt = calcNewSize(localSize, paramInt1, paramInt2);
          localOptions.inJustDecodeBounds = false;
          if (bool)
            i = calculateInSampleSizeNew(localOptions, paramArrayOfInt.width, paramArrayOfInt.height, true);
          LogUtils.v(TAG, "decodeBitmapFromFileForShare(), inSampleSize = ".concat(String.valueOf(i)));
          localOptions.inSampleSize = i;
          paramArrayOfInt = BitmapFactory.decodeFile(paramString, localOptions);
          paramString = paramArrayOfInt;
          if (j != 0)
            paramString = rotateBitmap(paramArrayOfInt, j);
          if (paramString != null)
          {
            paramString = getFinalBitmap(paramString, paramInt1, paramInt2);
            AppMethodBeat.o(49640);
          }
          else
          {
            AppMethodBeat.o(49640);
            paramString = localObject;
          }
        }
        catch (Exception paramString)
        {
          LogUtils.e(paramString);
          AppMethodBeat.o(49640);
          paramString = localObject;
        }
        catch (OutOfMemoryError paramString)
        {
          LogUtils.e(paramString);
          AppMethodBeat.o(49640);
          paramString = localObject;
        }
      }
    }
  }

  public static Bitmap decodeSampleBitmap(Context paramContext, String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(49624);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(49624);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      if (paramString.startsWith("assets://"))
      {
        paramContext = decodeSampleBitmapFromAssets(paramContext, getRealPath(paramString), paramInt);
        AppMethodBeat.o(49624);
      }
      else if (bmpIsExists(paramString))
      {
        paramContext = decodeSampledBitmapFromFile(paramString, paramInt);
        AppMethodBeat.o(49624);
      }
      else
      {
        AppMethodBeat.o(49624);
        paramContext = localObject;
      }
    }
  }

  public static Bitmap decodeSampleBitmap(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = null;
    AppMethodBeat.i(49623);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(49623);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      if (paramString.startsWith("assets://"))
      {
        paramContext = decodeSampledBitmapFromAssets(paramContext, getRealPath(paramString), paramInt1, paramInt2);
        AppMethodBeat.o(49623);
      }
      else if (bmpIsExists(paramString))
      {
        paramContext = decodeSampledBitmapFromFile(paramString, paramInt1, paramInt2);
        AppMethodBeat.o(49623);
      }
      else
      {
        AppMethodBeat.o(49623);
        paramContext = localObject;
      }
    }
  }

  // ERROR //
  public static Bitmap decodeSampleBitmapFromAssets(Context paramContext, String paramString, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: ldc_w 509
    //   11: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   14: aload_1
    //   15: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   18: ifeq +14 -> 32
    //   21: ldc_w 509
    //   24: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: aload 5
    //   29: astore_0
    //   30: aload_0
    //   31: areturn
    //   32: aload_0
    //   33: invokevirtual 515	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   36: astore_0
    //   37: aload_0
    //   38: aload_1
    //   39: invokevirtual 521	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   42: astore 6
    //   44: new 144	android/graphics/BitmapFactory$Options
    //   47: dup
    //   48: invokespecial 433	android/graphics/BitmapFactory$Options:<init>	()V
    //   51: astore_0
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield 436	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   57: aload_0
    //   58: iload_2
    //   59: putfield 439	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   62: aload 6
    //   64: aconst_null
    //   65: aload_0
    //   66: invokestatic 525	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   69: astore_1
    //   70: aload_1
    //   71: astore_0
    //   72: aload 6
    //   74: ifnull +10 -> 84
    //   77: aload 6
    //   79: invokevirtual 528	java/io/InputStream:close	()V
    //   82: aload_1
    //   83: astore_0
    //   84: ldc_w 509
    //   87: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: goto -60 -> 30
    //   93: astore_0
    //   94: ldc_w 509
    //   97: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload 5
    //   102: astore_0
    //   103: goto -73 -> 30
    //   106: astore_0
    //   107: aload_3
    //   108: astore_0
    //   109: aload 6
    //   111: ifnull -27 -> 84
    //   114: aload 6
    //   116: invokevirtual 528	java/io/InputStream:close	()V
    //   119: aload_3
    //   120: astore_0
    //   121: goto -37 -> 84
    //   124: astore_0
    //   125: aload_3
    //   126: astore_0
    //   127: goto -43 -> 84
    //   130: astore_1
    //   131: aload_0
    //   132: aload_0
    //   133: getfield 439	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   136: iconst_1
    //   137: ishl
    //   138: putfield 439	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   141: aload 6
    //   143: invokevirtual 531	java/io/InputStream:reset	()V
    //   146: aload 6
    //   148: aconst_null
    //   149: aload_0
    //   150: invokestatic 525	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   153: astore_1
    //   154: aload_1
    //   155: astore_0
    //   156: aload 6
    //   158: ifnull -74 -> 84
    //   161: aload 6
    //   163: invokevirtual 528	java/io/InputStream:close	()V
    //   166: aload_1
    //   167: astore_0
    //   168: goto -84 -> 84
    //   171: astore_0
    //   172: aload_1
    //   173: astore_0
    //   174: goto -90 -> 84
    //   177: astore_0
    //   178: aload 6
    //   180: ifnull +8 -> 188
    //   183: aload 6
    //   185: invokevirtual 528	java/io/InputStream:close	()V
    //   188: ldc_w 509
    //   191: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: aload_0
    //   195: athrow
    //   196: astore_0
    //   197: aload_1
    //   198: astore_0
    //   199: goto -115 -> 84
    //   202: astore_1
    //   203: goto -15 -> 188
    //   206: astore_0
    //   207: aload 4
    //   209: astore_1
    //   210: goto -56 -> 154
    //   213: astore_0
    //   214: aload 4
    //   216: astore_1
    //   217: goto -63 -> 154
    //
    // Exception table:
    //   from	to	target	type
    //   37	44	93	java/io/IOException
    //   62	70	106	java/lang/Exception
    //   114	119	124	java/io/IOException
    //   62	70	130	java/lang/OutOfMemoryError
    //   161	166	171	java/io/IOException
    //   62	70	177	finally
    //   131	141	177	finally
    //   141	154	177	finally
    //   77	82	196	java/io/IOException
    //   183	188	202	java/io/IOException
    //   141	154	206	java/lang/OutOfMemoryError
    //   141	154	213	java/io/IOException
  }

  // ERROR //
  public static Bitmap decodeSampledBitmapFromAssets(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc_w 532
    //   6: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   13: ifeq +14 -> 27
    //   16: ldc_w 532
    //   19: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: aload 4
    //   24: astore_0
    //   25: aload_0
    //   26: areturn
    //   27: aload_0
    //   28: invokevirtual 515	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   31: astore 5
    //   33: aload 5
    //   35: aload_1
    //   36: invokevirtual 521	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   39: astore_0
    //   40: aload_0
    //   41: astore_1
    //   42: new 144	android/graphics/BitmapFactory$Options
    //   45: dup
    //   46: invokespecial 433	android/graphics/BitmapFactory$Options:<init>	()V
    //   49: astore 4
    //   51: aload 4
    //   53: iconst_1
    //   54: putfield 436	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   57: aload_1
    //   58: aconst_null
    //   59: aload 4
    //   61: invokestatic 525	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   64: pop
    //   65: aload 4
    //   67: aload 4
    //   69: iload_2
    //   70: iload_3
    //   71: iconst_1
    //   72: invokestatic 474	com/tencent/ttpic/baseutils/BitmapUtils:calculateInSampleSizeNew	(Landroid/graphics/BitmapFactory$Options;IIZ)I
    //   75: putfield 439	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   78: aload 4
    //   80: iconst_0
    //   81: putfield 436	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   84: aload_1
    //   85: invokevirtual 531	java/io/InputStream:reset	()V
    //   88: aload_1
    //   89: aconst_null
    //   90: aload 4
    //   92: invokestatic 525	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   95: astore_0
    //   96: aload_1
    //   97: invokestatic 538	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   100: ldc_w 532
    //   103: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: goto -81 -> 25
    //   109: astore_0
    //   110: new 165	java/lang/StringBuilder
    //   113: astore_0
    //   114: aload_0
    //   115: invokespecial 214	java/lang/StringBuilder:<init>	()V
    //   118: aload 5
    //   120: aload_0
    //   121: aload_1
    //   122: iconst_0
    //   123: aload_1
    //   124: bipush 46
    //   126: invokevirtual 542	java/lang/String:lastIndexOf	(I)I
    //   129: iconst_1
    //   130: iadd
    //   131: invokevirtual 546	java/lang/String:substring	(II)Ljava/lang/String;
    //   134: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: ldc_w 548
    //   140: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokevirtual 521	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   149: astore_1
    //   150: goto -108 -> 42
    //   153: astore_0
    //   154: getstatic 45	com/tencent/ttpic/baseutils/BitmapUtils:TAG	Ljava/lang/String;
    //   157: aload_0
    //   158: invokestatic 551	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   161: ldc_w 532
    //   164: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: aload 4
    //   169: astore_0
    //   170: goto -145 -> 25
    //   173: astore_0
    //   174: getstatic 45	com/tencent/ttpic/baseutils/BitmapUtils:TAG	Ljava/lang/String;
    //   177: aload_0
    //   178: invokestatic 551	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   181: aconst_null
    //   182: astore_0
    //   183: goto -87 -> 96
    //   186: astore_0
    //   187: aload 4
    //   189: aload 4
    //   191: getfield 439	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   194: iconst_1
    //   195: ishl
    //   196: putfield 439	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   199: aload_1
    //   200: invokevirtual 531	java/io/InputStream:reset	()V
    //   203: aload_1
    //   204: aconst_null
    //   205: aload 4
    //   207: invokestatic 525	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   210: astore_0
    //   211: goto -115 -> 96
    //   214: astore_0
    //   215: getstatic 45	com/tencent/ttpic/baseutils/BitmapUtils:TAG	Ljava/lang/String;
    //   218: aload_0
    //   219: invokestatic 551	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   222: aconst_null
    //   223: astore_0
    //   224: goto -128 -> 96
    //   227: astore_0
    //   228: goto -13 -> 215
    //
    // Exception table:
    //   from	to	target	type
    //   33	40	109	java/io/IOException
    //   110	150	153	java/io/IOException
    //   84	96	173	java/io/IOException
    //   84	96	186	java/lang/OutOfMemoryError
    //   199	211	214	java/lang/OutOfMemoryError
    //   199	211	227	java/io/IOException
  }

  public static Bitmap decodeSampledBitmapFromDescriptor(FileDescriptor paramFileDescriptor, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(49630);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, localOptions);
    localOptions.inSampleSize = calculateInSampleSizeNew(localOptions, paramInt1, paramInt2, true);
    localOptions.inJustDecodeBounds = false;
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, localOptions);
      paramFileDescriptor = localBitmap;
      AppMethodBeat.o(49630);
      return paramFileDescriptor;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        localOptions.inSampleSize <<= 1;
        try
        {
          paramFileDescriptor = BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, localOptions);
        }
        catch (OutOfMemoryError paramFileDescriptor)
        {
          LogUtils.e(localOutOfMemoryError);
          paramFileDescriptor = localObject;
        }
      }
    }
    catch (Exception paramFileDescriptor)
    {
      while (true)
        paramFileDescriptor = localObject;
    }
  }

  public static Bitmap decodeSampledBitmapFromFile(String paramString, int paramInt)
  {
    AppMethodBeat.i(49626);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inSampleSize = paramInt;
    localOptions.inJustDecodeBounds = false;
    Object localObject = null;
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeFile(paramString, localOptions);
      paramString = localBitmap;
      AppMethodBeat.o(49626);
      return paramString;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        localOptions.inSampleSize <<= 1;
        try
        {
          paramString = BitmapFactory.decodeFile(paramString, localOptions);
        }
        catch (OutOfMemoryError paramString)
        {
          paramString = localObject;
        }
      }
    }
  }

  public static Bitmap decodeSampledBitmapFromFile(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49625);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inSampleSize = calculateInSampleSizeNew(localOptions, paramInt1, paramInt2, true);
    localOptions.inJustDecodeBounds = false;
    ApiHelper.hasHoneycomb();
    Object localObject = null;
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeFile(paramString, localOptions);
      paramString = localBitmap;
      AppMethodBeat.o(49625);
      return paramString;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        localOptions.inSampleSize <<= 1;
        try
        {
          paramString = BitmapFactory.decodeFile(paramString, localOptions);
        }
        catch (OutOfMemoryError paramString)
        {
          LogUtils.e(paramString);
          paramString = localObject;
        }
      }
    }
  }

  public static Bitmap decodeSampledBitmapFromFileCheckExif(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49627);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inSampleSize = calculateInSampleSizeNew(localOptions, paramInt1, paramInt2, true);
    localOptions.inJustDecodeBounds = false;
    paramInt1 = getDegreeByExif(paramString) % 360;
    Object localObject = null;
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeFile(paramString, localOptions);
      localObject = localBitmap;
      if (paramInt1 != 0)
      {
        localObject = localBitmap;
        localBitmap = rotateBitmap(localBitmap, paramInt1);
        localObject = localBitmap;
      }
      AppMethodBeat.o(49627);
      return localObject;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        localOptions.inSampleSize <<= 1;
        try
        {
          paramString = BitmapFactory.decodeFile(paramString, localOptions);
          localObject = paramString;
          if (paramInt1 != 0)
          {
            localObject = paramString;
            paramString = rotateBitmap(paramString, paramInt1);
            localObject = paramString;
          }
        }
        catch (OutOfMemoryError paramString)
        {
          LogUtils.e(paramString);
        }
      }
    }
  }

  public static Bitmap decodeSampledBitmapFromResource(Resources paramResources, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(49629);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeResource(paramResources, paramInt1, localOptions);
    localOptions.inSampleSize = calculateInSampleSizeNew(localOptions, paramInt2, paramInt3, true);
    localOptions.inJustDecodeBounds = false;
    Object localObject = null;
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeResource(paramResources, paramInt1, localOptions);
      paramResources = localBitmap;
      AppMethodBeat.o(49629);
      return paramResources;
    }
    catch (Exception paramResources)
    {
      while (true)
      {
        LogUtils.e(paramResources);
        paramResources = localObject;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        LogUtils.e(localOutOfMemoryError);
        try
        {
          localOptions.inSampleSize *= 2;
          paramResources = BitmapFactory.decodeResource(paramResources, paramInt1, localOptions);
        }
        catch (OutOfMemoryError paramResources)
        {
          paramResources = localObject;
        }
      }
    }
  }

  // ERROR //
  public static Bitmap decodeSampledBitmapFromUri(Uri paramUri, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc_w 575
    //   3: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnull +208 -> 215
    //   10: aload_0
    //   11: invokevirtual 580	android/net/Uri:getScheme	()Ljava/lang/String;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnull +117 -> 133
    //   19: aload_3
    //   20: invokevirtual 583	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   23: ldc_w 585
    //   26: invokevirtual 77	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   29: ifeq +104 -> 133
    //   32: aload_0
    //   33: invokevirtual 586	android/net/Uri:toString	()Ljava/lang/String;
    //   36: invokestatic 589	android/net/Uri:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   39: bipush 7
    //   41: invokevirtual 591	java/lang/String:substring	(I)Ljava/lang/String;
    //   44: astore_0
    //   45: getstatic 45	com/tencent/ttpic/baseutils/BitmapUtils:TAG	Ljava/lang/String;
    //   48: ldc_w 593
    //   51: aload_0
    //   52: invokestatic 596	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   55: invokevirtual 482	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   58: invokestatic 466	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: aload_0
    //   62: iload_1
    //   63: iload_2
    //   64: invokestatic 598	com/tencent/ttpic/baseutils/BitmapUtils:decodeSampledBitmapFromFileCheckExif	(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   67: astore_0
    //   68: aload_0
    //   69: ifnull +48 -> 117
    //   72: getstatic 45	com/tencent/ttpic/baseutils/BitmapUtils:TAG	Ljava/lang/String;
    //   75: astore 4
    //   77: new 165	java/lang/StringBuilder
    //   80: astore_3
    //   81: aload_3
    //   82: ldc_w 600
    //   85: invokespecial 168	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   88: aload 4
    //   90: aload_3
    //   91: aload_0
    //   92: invokevirtual 309	android/graphics/Bitmap:getWidth	()I
    //   95: invokevirtual 172	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   98: ldc_w 463
    //   101: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: aload_0
    //   105: invokevirtual 312	android/graphics/Bitmap:getHeight	()I
    //   108: invokevirtual 172	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   111: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 466	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: aconst_null
    //   118: invokestatic 538	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   121: aconst_null
    //   122: invokestatic 538	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   125: ldc_w 575
    //   128: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: aload_0
    //   132: areturn
    //   133: aload_0
    //   134: ifnull +76 -> 210
    //   137: aload_0
    //   138: invokevirtual 586	android/net/Uri:toString	()Ljava/lang/String;
    //   141: invokestatic 589	android/net/Uri:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   144: astore_0
    //   145: getstatic 45	com/tencent/ttpic/baseutils/BitmapUtils:TAG	Ljava/lang/String;
    //   148: ldc_w 602
    //   151: aload_0
    //   152: invokestatic 596	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   155: invokevirtual 482	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   158: invokestatic 466	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   161: aload_0
    //   162: iload_1
    //   163: iload_2
    //   164: invokestatic 598	com/tencent/ttpic/baseutils/BitmapUtils:decodeSampledBitmapFromFileCheckExif	(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   167: astore_0
    //   168: goto -100 -> 68
    //   171: astore_3
    //   172: aconst_null
    //   173: astore_0
    //   174: aload_3
    //   175: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   178: aconst_null
    //   179: invokestatic 538	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   182: aconst_null
    //   183: invokestatic 538	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   186: goto -61 -> 125
    //   189: astore_0
    //   190: aconst_null
    //   191: invokestatic 538	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   194: aconst_null
    //   195: invokestatic 538	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   198: ldc_w 575
    //   201: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: aload_0
    //   205: athrow
    //   206: astore_3
    //   207: goto -33 -> 174
    //   210: aconst_null
    //   211: astore_0
    //   212: goto -144 -> 68
    //   215: aconst_null
    //   216: astore_3
    //   217: goto -202 -> 15
    //
    // Exception table:
    //   from	to	target	type
    //   10	15	171	java/lang/Exception
    //   19	68	171	java/lang/Exception
    //   137	168	171	java/lang/Exception
    //   10	15	189	finally
    //   19	68	189	finally
    //   72	117	189	finally
    //   137	168	189	finally
    //   174	178	189	finally
    //   72	117	206	java/lang/Exception
  }

  public static void drawRepeatBitmap(Bitmap paramBitmap, Rect paramRect1, Rect paramRect2, Canvas paramCanvas, float paramFloat, Paint paramPaint)
  {
    AppMethodBeat.i(49649);
    int i = paramRect2.top;
    int j = paramRect2.bottom;
    int k = paramRect2.left;
    int m = paramRect2.right;
    int n = (int)(paramRect2.width() / paramFloat / paramRect1.width() + 1.0F);
    int i1 = (int)(paramRect2.height() / paramFloat / paramRect1.height() + 1.0F);
    paramCanvas.save();
    paramCanvas.clipRect(paramRect2);
    for (int i2 = 0; i2 < i1; i2++)
      for (int i3 = 0; i3 < n; i3++)
      {
        paramRect2.set((int)(k + paramRect1.width() * i3 * paramFloat), (int)(i + paramRect1.height() * i2 * paramFloat), (int)(k + paramRect1.width() * i3 * paramFloat + paramRect1.width() * paramFloat), (int)(i + paramRect1.height() * i2 * paramFloat + paramRect1.height() * paramFloat));
        paramCanvas.drawBitmap(paramBitmap, paramRect1, paramRect2, paramPaint);
      }
    paramCanvas.restore();
    paramRect2.set(k, i, m, j);
    AppMethodBeat.o(49649);
  }

  public static void fixBgRepeatY(View paramView)
  {
    AppMethodBeat.i(49606);
    paramView = paramView.getBackground();
    if ((paramView != null) && ((paramView instanceof BitmapDrawable)))
    {
      paramView = (BitmapDrawable)paramView;
      paramView.mutate();
      paramView.setTileModeY(Shader.TileMode.REPEAT);
    }
    AppMethodBeat.o(49606);
  }

  public static Bitmap flipBitmap(Bitmap paramBitmap, boolean paramBoolean)
  {
    AppMethodBeat.i(49621);
    Object localObject = paramBitmap;
    if (paramBitmap != null)
    {
      localObject = new Matrix();
      if (!paramBoolean)
        break label70;
      ((Matrix)localObject).setScale(1.0F, -1.0F);
    }
    try
    {
      while (true)
      {
        Bitmap localBitmap2 = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
        localObject = paramBitmap;
        if (paramBitmap != localBitmap2)
        {
          paramBitmap.recycle();
          localObject = localBitmap2;
        }
        AppMethodBeat.o(49621);
        return localObject;
        label70: ((Matrix)localObject).setScale(-1.0F, 1.0F);
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        LogUtils.e(TAG, "OutOfMemoryError. ".concat(String.valueOf(localOutOfMemoryError)));
        Bitmap localBitmap1 = paramBitmap;
      }
    }
  }

  // ERROR //
  public static String getBase64FromBitmap(Bitmap paramBitmap, int paramInt)
  {
    // Byte code:
    //   0: ldc_w 674
    //   3: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnonnull +24 -> 31
    //   10: getstatic 45	com/tencent/ttpic/baseutils/BitmapUtils:TAG	Ljava/lang/String;
    //   13: ldc_w 676
    //   16: invokestatic 193	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: ldc_w 678
    //   22: astore_0
    //   23: ldc_w 674
    //   26: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_0
    //   30: areturn
    //   31: ldc_w 678
    //   34: astore_2
    //   35: new 97	java/io/ByteArrayOutputStream
    //   38: astore_3
    //   39: aload_3
    //   40: invokespecial 98	java/io/ByteArrayOutputStream:<init>	()V
    //   43: aload_0
    //   44: getstatic 104	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   47: bipush 100
    //   49: aload_3
    //   50: invokevirtual 110	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   53: pop
    //   54: aload_3
    //   55: invokevirtual 117	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   58: iload_1
    //   59: invokestatic 684	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   62: astore_0
    //   63: aload_3
    //   64: invokevirtual 120	java/io/ByteArrayOutputStream:close	()V
    //   67: ldc_w 674
    //   70: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: goto -44 -> 29
    //   76: astore_3
    //   77: aload_3
    //   78: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   81: goto -14 -> 67
    //   84: astore_0
    //   85: aconst_null
    //   86: astore_3
    //   87: aload_3
    //   88: ifnull +7 -> 95
    //   91: aload_3
    //   92: invokevirtual 120	java/io/ByteArrayOutputStream:close	()V
    //   95: ldc_w 674
    //   98: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: aload_2
    //   102: astore_0
    //   103: goto -74 -> 29
    //   106: astore_0
    //   107: aload_0
    //   108: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   111: goto -16 -> 95
    //   114: astore_0
    //   115: aconst_null
    //   116: astore_3
    //   117: aload_3
    //   118: ifnull +7 -> 125
    //   121: aload_3
    //   122: invokevirtual 120	java/io/ByteArrayOutputStream:close	()V
    //   125: ldc_w 674
    //   128: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: aload_2
    //   132: astore_0
    //   133: goto -104 -> 29
    //   136: astore_0
    //   137: aload_0
    //   138: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   141: goto -16 -> 125
    //   144: astore_0
    //   145: goto -28 -> 117
    //   148: astore_0
    //   149: goto -62 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   63	67	76	java/io/IOException
    //   35	43	84	java/lang/Exception
    //   91	95	106	java/io/IOException
    //   35	43	114	finally
    //   121	125	136	java/io/IOException
    //   43	63	144	finally
    //   43	63	148	java/lang/Exception
  }

  public static Bitmap getBitmapFromURL(String paramString)
  {
    AppMethodBeat.i(49634);
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(paramString);
      paramString = (HttpURLConnection)localURL.openConnection();
      paramString.setDoInput(true);
      paramString.connect();
      paramString = BitmapFactory.decodeStream(paramString.getInputStream());
      AppMethodBeat.o(49634);
      return paramString;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(49634);
      }
    }
  }

  public static BitmapFactory.Options getBitmapOptionsFromAssets(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49615);
    AssetManager localAssetManager = paramContext.getAssets();
    try
    {
      paramContext = localAssetManager.open(paramString);
      paramString = new BitmapFactory.Options();
      paramString.inJustDecodeBounds = true;
      BitmapFactory.decodeStream(paramContext, null, paramString);
    }
    catch (IOException paramContext)
    {
      try
      {
        paramContext.reset();
        if (paramContext != null)
          IOUtils.closeQuietly(paramContext);
        AppMethodBeat.o(49615);
        paramContext = paramString;
        while (true)
          while (true)
          {
            return paramContext;
            paramContext = paramContext;
            try
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>();
              paramContext = localAssetManager.open(paramString.substring(0, paramString.lastIndexOf('.') + 1) + "webp");
            }
            catch (IOException paramContext)
            {
              LogUtils.e(TAG, paramContext);
              AppMethodBeat.o(49615);
              paramContext = null;
            }
          }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          LogUtils.e(TAG, localIOException);
          if (paramContext != null)
            IOUtils.closeQuietly(paramContext);
        }
      }
      finally
      {
        if (paramContext != null)
          IOUtils.closeQuietly(paramContext);
        AppMethodBeat.o(49615);
      }
    }
    throw paramString;
  }

  public static BitmapFactory.Options getBitmapOptionsFromFile(String paramString)
  {
    BitmapFactory.Options localOptions = null;
    AppMethodBeat.i(49613);
    if (paramString == null)
    {
      AppMethodBeat.o(49613);
      paramString = localOptions;
    }
    while (true)
    {
      return paramString;
      if (!new File(paramString).exists())
      {
        AppMethodBeat.o(49613);
        paramString = localOptions;
      }
      else
      {
        localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(paramString, localOptions);
        AppMethodBeat.o(49613);
        paramString = localOptions;
      }
    }
  }

  public static BitmapFactory.Options getBitmapOptionsFromResource(Resources paramResources, int paramInt)
  {
    AppMethodBeat.i(49614);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeResource(paramResources, paramInt, localOptions);
    AppMethodBeat.o(49614);
    return localOptions;
  }

  public static BitmapFactory.Options getBitmapOptionsFromUri(Context paramContext, Uri paramUri)
  {
    Object localObject = null;
    AppMethodBeat.i(49616);
    if (paramUri != null);
    for (paramContext = paramUri.getScheme(); ; paramContext = null)
    {
      if ((paramContext != null) && (paramContext.toLowerCase().startsWith("file")))
      {
        paramContext = Uri.decode(paramUri.toString()).substring(7);
        LogUtils.v(TAG, "[getBitmapOptionsFromUri] file = ".concat(String.valueOf(paramContext)));
        paramContext = getBitmapOptionsFromFile(paramContext);
        AppMethodBeat.o(49616);
      }
      while (true)
      {
        return paramContext;
        if (paramUri == null)
        {
          AppMethodBeat.o(49616);
          paramContext = localObject;
        }
        else
        {
          paramContext = Uri.decode(paramUri.toString());
          LogUtils.v(TAG, "[getBitmapOptionsFromUri] in else , file = ".concat(String.valueOf(paramContext)));
          paramContext = getBitmapOptionsFromFile(paramContext);
          AppMethodBeat.o(49616);
        }
      }
    }
  }

  public static Point getBitmapSize(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49609);
    if (paramString.startsWith("assets://"))
    {
      paramContext = getBitmapSizeFromAssets(paramContext, getRealPath(paramString));
      AppMethodBeat.o(49609);
    }
    while (true)
    {
      return paramContext;
      paramContext = getBitmapSizeFromFile(paramString);
      AppMethodBeat.o(49609);
    }
  }

  // ERROR //
  private static Point getBitmapSizeFromAssets(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 738
    //   5: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 740	android/graphics/Point
    //   11: dup
    //   12: iconst_0
    //   13: iconst_0
    //   14: invokespecial 741	android/graphics/Point:<init>	(II)V
    //   17: astore_3
    //   18: aload_1
    //   19: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   22: ifeq +13 -> 35
    //   25: ldc_w 738
    //   28: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   31: aload_3
    //   32: astore_0
    //   33: aload_0
    //   34: areturn
    //   35: aload_0
    //   36: invokevirtual 515	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   39: astore_0
    //   40: aload_0
    //   41: aload_1
    //   42: invokevirtual 521	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   45: astore_0
    //   46: new 144	android/graphics/BitmapFactory$Options
    //   49: astore_2
    //   50: aload_2
    //   51: invokespecial 433	android/graphics/BitmapFactory$Options:<init>	()V
    //   54: aload_2
    //   55: iconst_1
    //   56: putfield 436	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   59: aload_0
    //   60: aconst_null
    //   61: aload_2
    //   62: invokestatic 525	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   65: pop
    //   66: new 740	android/graphics/Point
    //   69: astore_1
    //   70: aload_1
    //   71: aload_2
    //   72: getfield 150	android/graphics/BitmapFactory$Options:outWidth	I
    //   75: aload_2
    //   76: getfield 147	android/graphics/BitmapFactory$Options:outHeight	I
    //   79: invokespecial 741	android/graphics/Point:<init>	(II)V
    //   82: aload_0
    //   83: ifnull +7 -> 90
    //   86: aload_0
    //   87: invokevirtual 528	java/io/InputStream:close	()V
    //   90: ldc_w 738
    //   93: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: aload_1
    //   97: astore_0
    //   98: goto -65 -> 33
    //   101: astore_0
    //   102: aload_2
    //   103: astore_0
    //   104: aload_0
    //   105: ifnull +7 -> 112
    //   108: aload_0
    //   109: invokevirtual 528	java/io/InputStream:close	()V
    //   112: ldc_w 738
    //   115: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: aload_3
    //   119: astore_0
    //   120: goto -87 -> 33
    //   123: astore_1
    //   124: aconst_null
    //   125: astore_0
    //   126: aload_0
    //   127: ifnull +7 -> 134
    //   130: aload_0
    //   131: invokevirtual 528	java/io/InputStream:close	()V
    //   134: ldc_w 738
    //   137: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: aload_1
    //   141: athrow
    //   142: astore_0
    //   143: goto -53 -> 90
    //   146: astore_0
    //   147: goto -35 -> 112
    //   150: astore_0
    //   151: goto -17 -> 134
    //   154: astore_1
    //   155: goto -29 -> 126
    //   158: astore_1
    //   159: goto -55 -> 104
    //
    // Exception table:
    //   from	to	target	type
    //   40	46	101	java/io/IOException
    //   40	46	123	finally
    //   86	90	142	java/io/IOException
    //   108	112	146	java/io/IOException
    //   130	134	150	java/io/IOException
    //   46	82	154	finally
    //   46	82	158	java/io/IOException
  }

  private static Point getBitmapSizeFromFile(String paramString)
  {
    AppMethodBeat.i(49610);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    paramString = new Point(localOptions.outWidth, localOptions.outHeight);
    AppMethodBeat.o(49610);
    return paramString;
  }

  @SuppressLint({"NewApi"})
  public static int getBitmapSizeInBytes(Bitmap paramBitmap)
  {
    AppMethodBeat.i(49608);
    int i;
    if (paramBitmap == null)
    {
      i = 0;
      AppMethodBeat.o(49608);
    }
    while (true)
    {
      return i;
      if (Build.VERSION.SDK_INT > 19)
      {
        try
        {
          i = paramBitmap.getAllocationByteCount();
          AppMethodBeat.o(49608);
        }
        catch (NullPointerException localNullPointerException)
        {
        }
      }
      else if (Build.VERSION.SDK_INT >= 12)
      {
        i = paramBitmap.getByteCount();
        AppMethodBeat.o(49608);
      }
      else
      {
        i = paramBitmap.getWidth() * paramBitmap.getRowBytes();
        AppMethodBeat.o(49608);
      }
    }
  }

  public static int getDegreeByExif(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(49628);
    int j;
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(49628);
      j = i;
    }
    while (true)
    {
      return j;
      try
      {
        ExifInterface localExifInterface = new android/media/ExifInterface;
        localExifInterface.<init>(paramString);
        j = getDegreeByOrientation(localExifInterface.getAttributeInt("Orientation", 0));
        AppMethodBeat.o(49628);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(49628);
        j = i;
      }
    }
  }

  public static int getDegreeByOrientation(int paramInt)
  {
    int i = 0;
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case 4:
    case 5:
    case 7:
    case 6:
    case 3:
    case 8:
    }
    while (true)
    {
      return j;
      j = 90;
      continue;
      j = 180;
      continue;
      j = 270;
    }
  }

  private static Bitmap getFinalBitmap(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49648);
    int i = Math.max(paramBitmap.getWidth(), paramBitmap.getHeight());
    int j = Math.min(paramBitmap.getWidth(), paramBitmap.getHeight());
    if ((i > paramInt2) || (j > paramInt1))
    {
      float f = Math.min(paramInt2 / i, paramInt1 / j);
      Matrix localMatrix = new Matrix();
      localMatrix.setScale(f, f);
      Bitmap localBitmap = Bitmap.createBitmap((int)(paramBitmap.getWidth() * f), (int)(f * paramBitmap.getHeight()), Bitmap.Config.ARGB_8888);
      Paint localPaint = new Paint();
      localPaint.setAntiAlias(true);
      localPaint.setDither(true);
      localPaint.setFilterBitmap(true);
      new Canvas(localBitmap).drawBitmap(paramBitmap, localMatrix, localPaint);
      recycle(paramBitmap);
      AppMethodBeat.o(49648);
      paramBitmap = localBitmap;
    }
    while (true)
    {
      return paramBitmap;
      AppMethodBeat.o(49648);
    }
  }

  public static int[] getImageSize(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49612);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    paramInt2 = calculateInSampleSize(localOptions, paramInt1, paramInt2, true);
    for (paramInt1 = 1; Math.pow(2.0D, paramInt1) < paramInt2; paramInt1++);
    paramInt2 = (int)Math.pow(2.0D, paramInt1 - 1);
    paramInt1 = localOptions.outWidth / paramInt2;
    paramInt2 = localOptions.outHeight / paramInt2;
    int i = getDegreeByExif(paramString);
    if ((i == 90) || (i == 270))
    {
      i = paramInt1;
      paramInt1 = paramInt2;
    }
    while (true)
    {
      AppMethodBeat.o(49612);
      return new int[] { paramInt1, i };
      i = paramInt2;
    }
  }

  private static BitmapUtils.Size getNewSize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(49647);
    float f = Math.min(paramInt3 / paramInt1, paramInt4 / paramInt2);
    BitmapUtils.Size localSize;
    if (f < 1.0D)
    {
      localSize = new BitmapUtils.Size((int)(paramInt1 * f), (int)(f * paramInt2));
      AppMethodBeat.o(49647);
    }
    while (true)
    {
      return localSize;
      localSize = new BitmapUtils.Size(paramInt1, paramInt2);
      AppMethodBeat.o(49647);
    }
  }

  public static String getRealPath(String paramString)
  {
    AppMethodBeat.i(49599);
    if ((!TextUtils.isEmpty(paramString)) && (paramString.startsWith("assets://")))
    {
      paramString = paramString.substring(9);
      AppMethodBeat.o(49599);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(49599);
    }
  }

  private static BitmapFactory.Options getScaledOpt(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49644);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inSampleSize = calculateInSampleSizeNew(paramOptions, paramInt1, paramInt2, false);
    localOptions.inJustDecodeBounds = false;
    AppMethodBeat.o(49644);
    return localOptions;
  }

  public static boolean isLegal(Bitmap paramBitmap)
  {
    AppMethodBeat.i(49601);
    boolean bool;
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      bool = true;
      AppMethodBeat.o(49601);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49601);
    }
  }

  private static boolean isPowerOf2(int paramInt)
  {
    if ((paramInt - 1 & paramInt) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean recycle(Bitmap paramBitmap)
  {
    AppMethodBeat.i(49602);
    boolean bool;
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      paramBitmap.recycle();
      bool = true;
      AppMethodBeat.o(49602);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49602);
    }
  }

  public static Bitmap rotateBitmap(Bitmap paramBitmap, int paramInt)
  {
    AppMethodBeat.i(49620);
    Object localObject = paramBitmap;
    if (paramBitmap != null)
    {
      localObject = new Matrix();
      ((Matrix)localObject).setRotate(paramInt, paramBitmap.getWidth() / 2.0F, paramBitmap.getHeight() / 2.0F);
    }
    try
    {
      Bitmap localBitmap2 = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
      localObject = paramBitmap;
      if (paramBitmap != localBitmap2)
      {
        paramBitmap.recycle();
        localObject = localBitmap2;
      }
      AppMethodBeat.o(49620);
      return localObject;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
        Bitmap localBitmap1 = paramBitmap;
    }
  }

  public static Bitmap roundRectBitmap(Bitmap paramBitmap, int paramInt)
  {
    AppMethodBeat.i(49622);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setFilterBitmap(true);
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    RectF localRectF = new RectF(0.0F, 0.0F, i, j);
    Rect localRect = new Rect(0, 0, i, j);
    Canvas localCanvas = new Canvas(paramBitmap);
    localPaint.setXfermode(null);
    localCanvas.drawRoundRect(localRectF, paramInt, paramInt, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect, localRectF, localPaint);
    AppMethodBeat.o(49622);
    return paramBitmap;
  }

  // ERROR //
  public static BitmapUtils.SAVE_STATUS saveBitmap(Bitmap paramBitmap, String paramString)
  {
    // Byte code:
    //   0: ldc_w 836
    //   3: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aconst_null
    //   7: astore_2
    //   8: aconst_null
    //   9: astore_3
    //   10: aconst_null
    //   11: astore 4
    //   13: aload_3
    //   14: astore 5
    //   16: new 79	java/io/File
    //   19: astore 6
    //   21: aload_3
    //   22: astore 5
    //   24: aload 6
    //   26: aload_1
    //   27: invokespecial 82	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: aload_3
    //   31: astore 5
    //   33: aload 6
    //   35: invokevirtual 839	java/io/File:getParentFile	()Ljava/io/File;
    //   38: astore 7
    //   40: aload_3
    //   41: astore 5
    //   43: aload 7
    //   45: invokevirtual 86	java/io/File:exists	()Z
    //   48: ifne +12 -> 60
    //   51: aload_3
    //   52: astore 5
    //   54: aload 7
    //   56: invokevirtual 249	java/io/File:mkdirs	()Z
    //   59: pop
    //   60: aload_3
    //   61: astore 5
    //   63: aload 6
    //   65: invokevirtual 86	java/io/File:exists	()Z
    //   68: ifne +12 -> 80
    //   71: aload_3
    //   72: astore 5
    //   74: aload 6
    //   76: invokevirtual 267	java/io/File:createNewFile	()Z
    //   79: pop
    //   80: aload_3
    //   81: astore 5
    //   83: new 269	java/io/FileOutputStream
    //   86: astore 7
    //   88: aload_3
    //   89: astore 5
    //   91: aload 7
    //   93: aload_1
    //   94: invokespecial 840	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   97: aload_0
    //   98: ifnull +20 -> 118
    //   101: aload_0
    //   102: getstatic 104	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   105: bipush 99
    //   107: aload 7
    //   109: invokevirtual 110	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   112: pop
    //   113: aload 7
    //   115: invokevirtual 843	java/io/FileOutputStream:flush	()V
    //   118: aload 7
    //   120: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   123: getstatic 850	com/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS:SAVE_SUCCESS	Lcom/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS;
    //   126: astore_0
    //   127: ldc_w 836
    //   130: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: aload_0
    //   134: areturn
    //   135: astore_1
    //   136: aload 4
    //   138: astore_0
    //   139: aload_0
    //   140: astore 5
    //   142: aload_1
    //   143: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   146: aload_0
    //   147: astore 5
    //   149: getstatic 853	com/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS:SAVE_FAILED	Lcom/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS;
    //   152: astore_1
    //   153: aload_0
    //   154: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   157: ldc_w 836
    //   160: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: aload_1
    //   164: astore_0
    //   165: goto -32 -> 133
    //   168: astore_1
    //   169: aload_2
    //   170: astore_0
    //   171: aload_0
    //   172: astore 5
    //   174: aload_1
    //   175: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   178: aload_0
    //   179: astore 5
    //   181: getstatic 856	com/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS:SAVE_OOM	Lcom/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS;
    //   184: astore_1
    //   185: aload_0
    //   186: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   189: ldc_w 836
    //   192: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: aload_1
    //   196: astore_0
    //   197: goto -64 -> 133
    //   200: astore_0
    //   201: aload 5
    //   203: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   206: ldc_w 836
    //   209: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: aload_0
    //   213: athrow
    //   214: astore_0
    //   215: aload 7
    //   217: astore 5
    //   219: goto -18 -> 201
    //   222: astore_1
    //   223: aload 7
    //   225: astore_0
    //   226: goto -55 -> 171
    //   229: astore_1
    //   230: aload 7
    //   232: astore_0
    //   233: goto -94 -> 139
    //
    // Exception table:
    //   from	to	target	type
    //   16	21	135	java/lang/Exception
    //   24	30	135	java/lang/Exception
    //   33	40	135	java/lang/Exception
    //   43	51	135	java/lang/Exception
    //   54	60	135	java/lang/Exception
    //   63	71	135	java/lang/Exception
    //   74	80	135	java/lang/Exception
    //   83	88	135	java/lang/Exception
    //   91	97	135	java/lang/Exception
    //   16	21	168	java/lang/OutOfMemoryError
    //   24	30	168	java/lang/OutOfMemoryError
    //   33	40	168	java/lang/OutOfMemoryError
    //   43	51	168	java/lang/OutOfMemoryError
    //   54	60	168	java/lang/OutOfMemoryError
    //   63	71	168	java/lang/OutOfMemoryError
    //   74	80	168	java/lang/OutOfMemoryError
    //   83	88	168	java/lang/OutOfMemoryError
    //   91	97	168	java/lang/OutOfMemoryError
    //   16	21	200	finally
    //   24	30	200	finally
    //   33	40	200	finally
    //   43	51	200	finally
    //   54	60	200	finally
    //   63	71	200	finally
    //   74	80	200	finally
    //   83	88	200	finally
    //   91	97	200	finally
    //   142	146	200	finally
    //   149	153	200	finally
    //   174	178	200	finally
    //   181	185	200	finally
    //   101	118	214	finally
    //   101	118	222	java/lang/OutOfMemoryError
    //   101	118	229	java/lang/Exception
  }

  // ERROR //
  public static File saveBitmap(Context paramContext, Bitmap paramBitmap, String paramString1, String paramString2, Bitmap.CompressFormat paramCompressFormat, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: ldc_w 858
    //   6: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_2
    //   10: ifnonnull +142 -> 152
    //   13: aload_2
    //   14: astore 7
    //   16: aload_0
    //   17: ifnull +21 -> 38
    //   20: aload_0
    //   21: invokevirtual 861	android/content/Context:getCacheDir	()Ljava/io/File;
    //   24: astore_0
    //   25: aload_2
    //   26: astore 7
    //   28: aload_0
    //   29: ifnull +9 -> 38
    //   32: aload_0
    //   33: invokevirtual 223	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   36: astore 7
    //   38: iconst_0
    //   39: istore 8
    //   41: iconst_0
    //   42: istore 9
    //   44: aload 4
    //   46: getstatic 864	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   49: if_acmpne +143 -> 192
    //   52: new 165	java/lang/StringBuilder
    //   55: astore_0
    //   56: aload_0
    //   57: invokespecial 214	java/lang/StringBuilder:<init>	()V
    //   60: aload_0
    //   61: aload_3
    //   62: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: ldc_w 866
    //   68: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: astore_0
    //   75: new 79	java/io/File
    //   78: astore_3
    //   79: aload_3
    //   80: aload 7
    //   82: aload_0
    //   83: invokespecial 868	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   86: new 269	java/io/FileOutputStream
    //   89: astore_0
    //   90: aload_0
    //   91: aload_3
    //   92: invokespecial 272	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   95: aload_0
    //   96: astore_2
    //   97: aload 4
    //   99: getstatic 104	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   102: if_acmpne +18 -> 120
    //   105: aload 5
    //   107: ifnull +13 -> 120
    //   110: aload_0
    //   111: astore_2
    //   112: aload 5
    //   114: invokevirtual 871	java/lang/String:length	()I
    //   117: ifgt +16 -> 133
    //   120: aload_0
    //   121: astore_2
    //   122: aload_1
    //   123: aload 4
    //   125: bipush 99
    //   127: aload_0
    //   128: invokevirtual 110	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   131: istore 9
    //   133: aload_0
    //   134: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   137: aload_3
    //   138: astore_0
    //   139: iload 9
    //   141: ifeq +117 -> 258
    //   144: ldc_w 858
    //   147: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: aload_0
    //   151: areturn
    //   152: new 79	java/io/File
    //   155: dup
    //   156: aload_2
    //   157: invokespecial 82	java/io/File:<init>	(Ljava/lang/String;)V
    //   160: astore_0
    //   161: aload_2
    //   162: astore 7
    //   164: aload_0
    //   165: invokevirtual 874	java/io/File:isDirectory	()Z
    //   168: ifne -130 -> 38
    //   171: aload_2
    //   172: astore 7
    //   174: aload_0
    //   175: invokevirtual 249	java/io/File:mkdirs	()Z
    //   178: ifne -140 -> 38
    //   181: ldc_w 858
    //   184: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: aconst_null
    //   188: astore_0
    //   189: goto -39 -> 150
    //   192: new 165	java/lang/StringBuilder
    //   195: astore_0
    //   196: aload_0
    //   197: invokespecial 214	java/lang/StringBuilder:<init>	()V
    //   200: aload_0
    //   201: aload_3
    //   202: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: ldc_w 876
    //   208: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: astore_0
    //   215: goto -140 -> 75
    //   218: astore_1
    //   219: aconst_null
    //   220: astore_0
    //   221: aconst_null
    //   222: astore_3
    //   223: aload_0
    //   224: astore_2
    //   225: aload_1
    //   226: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   229: aload_0
    //   230: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   233: aload_3
    //   234: astore_0
    //   235: iload 8
    //   237: istore 9
    //   239: goto -100 -> 139
    //   242: astore_0
    //   243: aload 6
    //   245: astore_2
    //   246: aload_2
    //   247: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   250: ldc_w 858
    //   253: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: aload_0
    //   257: athrow
    //   258: ldc_w 858
    //   261: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   264: aconst_null
    //   265: astore_0
    //   266: goto -116 -> 150
    //   269: astore_0
    //   270: goto -24 -> 246
    //   273: astore_1
    //   274: aconst_null
    //   275: astore_0
    //   276: goto -53 -> 223
    //   279: astore_1
    //   280: goto -57 -> 223
    //
    // Exception table:
    //   from	to	target	type
    //   44	75	218	java/lang/Exception
    //   75	86	218	java/lang/Exception
    //   192	215	218	java/lang/Exception
    //   44	75	242	finally
    //   75	86	242	finally
    //   86	95	242	finally
    //   192	215	242	finally
    //   97	105	269	finally
    //   112	120	269	finally
    //   122	133	269	finally
    //   225	229	269	finally
    //   86	95	273	java/lang/Exception
    //   97	105	279	java/lang/Exception
    //   112	120	279	java/lang/Exception
    //   122	133	279	java/lang/Exception
  }

  // ERROR //
  public static BitmapUtils.SAVE_STATUS saveBitmap2PNG(Bitmap paramBitmap, String paramString)
  {
    // Byte code:
    //   0: ldc_w 878
    //   3: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aconst_null
    //   7: astore_2
    //   8: aconst_null
    //   9: astore_3
    //   10: aconst_null
    //   11: astore 4
    //   13: aload_3
    //   14: astore 5
    //   16: new 79	java/io/File
    //   19: astore 6
    //   21: aload_3
    //   22: astore 5
    //   24: aload 6
    //   26: aload_1
    //   27: invokespecial 82	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: aload_3
    //   31: astore 5
    //   33: aload 6
    //   35: invokevirtual 839	java/io/File:getParentFile	()Ljava/io/File;
    //   38: astore 7
    //   40: aload_3
    //   41: astore 5
    //   43: aload 7
    //   45: invokevirtual 86	java/io/File:exists	()Z
    //   48: ifne +12 -> 60
    //   51: aload_3
    //   52: astore 5
    //   54: aload 7
    //   56: invokevirtual 249	java/io/File:mkdirs	()Z
    //   59: pop
    //   60: aload_3
    //   61: astore 5
    //   63: aload 6
    //   65: invokevirtual 86	java/io/File:exists	()Z
    //   68: ifne +12 -> 80
    //   71: aload_3
    //   72: astore 5
    //   74: aload 6
    //   76: invokevirtual 267	java/io/File:createNewFile	()Z
    //   79: pop
    //   80: aload_3
    //   81: astore 5
    //   83: new 269	java/io/FileOutputStream
    //   86: astore 7
    //   88: aload_3
    //   89: astore 5
    //   91: aload 7
    //   93: aload_1
    //   94: invokespecial 840	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   97: aload_0
    //   98: ifnull +20 -> 118
    //   101: aload_0
    //   102: getstatic 864	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   105: bipush 99
    //   107: aload 7
    //   109: invokevirtual 110	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   112: pop
    //   113: aload 7
    //   115: invokevirtual 843	java/io/FileOutputStream:flush	()V
    //   118: aload 7
    //   120: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   123: getstatic 850	com/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS:SAVE_SUCCESS	Lcom/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS;
    //   126: astore_0
    //   127: ldc_w 878
    //   130: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: aload_0
    //   134: areturn
    //   135: astore_1
    //   136: aload 4
    //   138: astore_0
    //   139: aload_0
    //   140: astore 5
    //   142: aload_1
    //   143: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   146: aload_0
    //   147: astore 5
    //   149: getstatic 853	com/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS:SAVE_FAILED	Lcom/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS;
    //   152: astore_1
    //   153: aload_0
    //   154: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   157: ldc_w 878
    //   160: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: aload_1
    //   164: astore_0
    //   165: goto -32 -> 133
    //   168: astore_1
    //   169: aload_2
    //   170: astore_0
    //   171: aload_0
    //   172: astore 5
    //   174: aload_1
    //   175: invokestatic 126	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   178: aload_0
    //   179: astore 5
    //   181: getstatic 856	com/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS:SAVE_OOM	Lcom/tencent/ttpic/baseutils/BitmapUtils$SAVE_STATUS;
    //   184: astore_1
    //   185: aload_0
    //   186: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   189: ldc_w 878
    //   192: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: aload_1
    //   196: astore_0
    //   197: goto -64 -> 133
    //   200: astore_0
    //   201: aload 5
    //   203: invokestatic 846	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   206: ldc_w 878
    //   209: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: aload_0
    //   213: athrow
    //   214: astore_0
    //   215: aload 7
    //   217: astore 5
    //   219: goto -18 -> 201
    //   222: astore_1
    //   223: aload 7
    //   225: astore_0
    //   226: goto -55 -> 171
    //   229: astore_1
    //   230: aload 7
    //   232: astore_0
    //   233: goto -94 -> 139
    //
    // Exception table:
    //   from	to	target	type
    //   16	21	135	java/lang/Exception
    //   24	30	135	java/lang/Exception
    //   33	40	135	java/lang/Exception
    //   43	51	135	java/lang/Exception
    //   54	60	135	java/lang/Exception
    //   63	71	135	java/lang/Exception
    //   74	80	135	java/lang/Exception
    //   83	88	135	java/lang/Exception
    //   91	97	135	java/lang/Exception
    //   16	21	168	java/lang/OutOfMemoryError
    //   24	30	168	java/lang/OutOfMemoryError
    //   33	40	168	java/lang/OutOfMemoryError
    //   43	51	168	java/lang/OutOfMemoryError
    //   54	60	168	java/lang/OutOfMemoryError
    //   63	71	168	java/lang/OutOfMemoryError
    //   74	80	168	java/lang/OutOfMemoryError
    //   83	88	168	java/lang/OutOfMemoryError
    //   91	97	168	java/lang/OutOfMemoryError
    //   16	21	200	finally
    //   24	30	200	finally
    //   33	40	200	finally
    //   43	51	200	finally
    //   54	60	200	finally
    //   63	71	200	finally
    //   74	80	200	finally
    //   83	88	200	finally
    //   91	97	200	finally
    //   142	146	200	finally
    //   149	153	200	finally
    //   174	178	200	finally
    //   181	185	200	finally
    //   101	118	214	finally
    //   101	118	222	java/lang/OutOfMemoryError
    //   101	118	229	java/lang/Exception
  }

  public static Bitmap scaleBitmap(Bitmap paramBitmap, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(49618);
    Object localObject;
    if (isLegal(paramBitmap))
    {
      localObject = new Matrix();
      ((Matrix)localObject).postScale(paramFloat, paramFloat);
    }
    while (true)
    {
      try
      {
        localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
        if ((localObject != paramBitmap) && (paramBoolean))
          recycle(paramBitmap);
        paramBitmap = (Bitmap)localObject;
        AppMethodBeat.o(49618);
        return paramBitmap;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        continue;
      }
      paramBitmap = null;
    }
  }

  public static void scaleBitmap(Bitmap paramBitmap, Canvas paramCanvas, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, Point paramPoint, Paint paramPaint)
  {
    AppMethodBeat.i(49619);
    if (!isLegal(paramBitmap))
      AppMethodBeat.o(49619);
    while (true)
    {
      return;
      Matrix localMatrix = new Matrix();
      int i = (int)(paramInt1 - paramPoint.x * paramDouble2);
      int j = (int)(paramInt2 - paramPoint.y * paramDouble2);
      localMatrix.postScale((float)paramDouble2, (float)paramDouble2);
      if ((i != 0) || (j != 0))
        localMatrix.postTranslate(i, j);
      if (paramDouble1 != 0.0D)
        localMatrix.postRotate((float)paramDouble1, paramInt1, paramInt2);
      if (paramPaint == null)
      {
        AppMethodBeat.o(49619);
      }
      else
      {
        paramCanvas.drawBitmap(paramBitmap, localMatrix, paramPaint);
        AppMethodBeat.o(49619);
      }
    }
  }

  public static Bitmap scaleBitmapUnderLimit(Bitmap paramBitmap, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(49639);
    float f = 1.0F;
    while (i == 0)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      Bitmap localBitmap = paramBitmap;
      try
      {
        paramBitmap = scaleBitmap(paramBitmap, f, false);
        localBitmap = paramBitmap;
        paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
        localBitmap = paramBitmap;
        j = localByteArrayOutputStream.toByteArray().length;
        if (j <= paramInt)
          i = 1;
        f *= 0.7F;
      }
      catch (OutOfMemoryError paramBitmap)
      {
        int j;
        if (localBitmap.getHeight() >= 10)
        {
          j = localBitmap.getWidth();
          if (j >= 10);
        }
        else
        {
          i = 1;
        }
        f *= 0.7F;
        paramBitmap = localBitmap;
      }
      finally
      {
        AppMethodBeat.o(49639);
      }
    }
    AppMethodBeat.o(49639);
    return paramBitmap;
  }

  private static boolean shouldResize(BitmapUtils.Size paramSize, int paramInt1, int paramInt2)
  {
    int i;
    int j;
    if (paramSize.height / paramSize.width >= 1.0D)
    {
      i = paramSize.height;
      j = paramSize.width;
      if ((j >= paramInt1) || (i >= paramInt2))
        break label59;
    }
    label59: for (boolean bool = false; ; bool = true)
    {
      return bool;
      i = paramSize.width;
      j = paramSize.height;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.BitmapUtils
 * JD-Core Version:    0.6.2
 */
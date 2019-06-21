package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.tencent.map.lib.b;
import com.tencent.map.lib.gl.JNICallback.IconImageInfo;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.map.lib.util.SystemUtil;
import com.tencent.map.lib.util.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class gv
{
  private WeakReference<Context> a;
  private fn b;
  private gx c;
  private float d;
  private b e;
  private Lock f;
  private Lock g;

  public gv(Context paramContext, fn paramfn, gx paramgx, b paramb)
  {
    AppMethodBeat.i(99488);
    this.d = 1.0F;
    this.f = new ReentrantLock();
    this.g = new ReentrantLock();
    this.a = new WeakReference(paramContext);
    this.b = paramfn;
    this.c = paramgx;
    this.e = paramb;
    this.d = SystemUtil.getDensity(paramContext);
    AppMethodBeat.o(99488);
  }

  private int a(int paramInt)
  {
    return (0xFF0000 & paramInt) >> 16 | ((paramInt & 0xFF) << 16 | 0xFF00FFFF & paramInt & 0xFFFFFF00);
  }

  private Bitmap a(String paramString, Bitmap.Config paramConfig, boolean paramBoolean)
  {
    AppMethodBeat.i(99496);
    if ((!new File(paramString).exists()) || (this.a == null) || (this.a.get() == null))
    {
      AppMethodBeat.o(99496);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inPreferredConfig = paramConfig;
      if (paramBoolean)
      {
        localOptions.inDensity = 320;
        localOptions.inTargetDensity = ((Context)this.a.get()).getResources().getDisplayMetrics().densityDpi;
      }
      try
      {
        paramString = BitmapFactory.decodeFile(paramString, localOptions);
        AppMethodBeat.o(99496);
      }
      catch (OutOfMemoryError paramString)
      {
        AppMethodBeat.o(99496);
        paramString = null;
      }
    }
  }

  private boolean a(File paramFile, String paramString, byte[] paramArrayOfByte, Lock paramLock)
  {
    boolean bool1 = false;
    AppMethodBeat.i(99497);
    if ((paramFile == null) || (StringUtil.isEmpty(paramString)) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(99497);
    while (true)
    {
      return bool1;
      Object localObject = paramString + "_" + paramArrayOfByte.hashCode();
      try
      {
        if (!paramFile.exists())
          paramFile.mkdirs();
        File localFile1 = new java/io/File;
        localFile1.<init>(paramFile, (String)localObject);
        if (localFile1.exists())
          localFile1.delete();
        localFile1.createNewFile();
        localObject = new java/io/FileOutputStream;
        ((FileOutputStream)localObject).<init>(localFile1);
        ((OutputStream)localObject).write(paramArrayOfByte);
        ((OutputStream)localObject).flush();
        ((OutputStream)localObject).close();
        paramArrayOfByte = a.a(paramArrayOfByte);
        try
        {
          boolean bool2 = paramArrayOfByte.equals(a.a(localFile1));
          if (!bool2)
            AppMethodBeat.o(99497);
        }
        catch (FileNotFoundException paramArrayOfByte)
        {
          File localFile2 = new java/io/File;
          localFile2.<init>(paramFile, paramString);
          localObject = new java/io/File;
          paramArrayOfByte = new java/lang/StringBuilder;
          paramArrayOfByte.<init>();
          ((File)localObject).<init>(paramFile, paramString + ".bak");
          if ((((File)localObject).exists()) && (!((File)localObject).delete()))
          {
            ((File)localObject).deleteOnExit();
            AppMethodBeat.o(99497);
          }
          else
          {
            try
            {
              paramLock.lock();
              if ((localFile2.exists()) && (!localFile2.renameTo((File)localObject)))
              {
                if (!localFile1.delete())
                  localFile1.deleteOnExit();
                paramLock.unlock();
                AppMethodBeat.o(99497);
              }
              else if (!localFile1.renameTo(localFile2))
              {
                ((File)localObject).renameTo(localFile2);
                if (!localFile1.delete())
                  localFile1.deleteOnExit();
                paramLock.unlock();
                AppMethodBeat.o(99497);
              }
              else
              {
                if (!((File)localObject).delete())
                  ((File)localObject).deleteOnExit();
                paramLock.unlock();
                bool1 = true;
                AppMethodBeat.o(99497);
              }
            }
            finally
            {
              paramLock.unlock();
              AppMethodBeat.o(99497);
            }
          }
        }
      }
      catch (Exception paramFile)
      {
        AppMethodBeat.o(99497);
      }
    }
  }

  private Bitmap c(String paramString)
  {
    Canvas localCanvas = null;
    AppMethodBeat.i(99498);
    paramString = paramString.substring(14);
    if (StringUtil.isEmpty(paramString))
    {
      AppMethodBeat.o(99498);
      paramString = localCanvas;
    }
    while (true)
    {
      return paramString;
      paramString = paramString.split(", ");
      if ((paramString == null) || (paramString.length < 5))
      {
        AppMethodBeat.o(99498);
        paramString = localCanvas;
      }
      else
      {
        int i = Integer.parseInt(paramString[0]);
        int j = Integer.parseInt(paramString[1]);
        long l1 = Long.parseLong(paramString[2]);
        long l2 = Long.parseLong(paramString[3]);
        float f1 = Float.parseFloat(paramString[4]);
        if ((i < 0) || (j < 0))
        {
          AppMethodBeat.o(99498);
          paramString = localCanvas;
        }
        else
        {
          Paint localPaint = new Paint();
          localPaint.setAntiAlias(true);
          localPaint.setStrokeWidth(f1);
          localPaint.setStyle(Paint.Style.STROKE);
          localPaint.setColor(a((int)l2));
          paramString = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
          localCanvas = new Canvas(paramString);
          localCanvas.drawColor(a((int)l1));
          RectF localRectF = new RectF();
          localRectF.left = 0.0F;
          localRectF.top = 0.0F;
          localRectF.right = i;
          localRectF.bottom = j;
          localCanvas.drawRoundRect(localRectF, i >> 3, j >> 3, localPaint);
          AppMethodBeat.o(99498);
        }
      }
    }
  }

  public JNICallback.IconImageInfo a(String paramString)
  {
    AppMethodBeat.i(99489);
    JNICallback.IconImageInfo localIconImageInfo = new JNICallback.IconImageInfo();
    localIconImageInfo.scale = this.d;
    localIconImageInfo.anchorPointX1 = 0.5F;
    localIconImageInfo.anchorPointY1 = 0.5F;
    localIconImageInfo.bitmap = a(paramString, Bitmap.Config.RGB_565, false);
    AppMethodBeat.o(99489);
    return localIconImageInfo;
  }

  public void a()
  {
    AppMethodBeat.i(99491);
    this.f.lock();
    AppMethodBeat.o(99491);
  }

  public boolean a(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(99493);
    boolean bool;
    if (this.c == null)
    {
      bool = false;
      AppMethodBeat.o(99493);
    }
    while (true)
    {
      return bool;
      bool = a(new File(this.c.c()), paramString, paramArrayOfByte, this.f);
      AppMethodBeat.o(99493);
    }
  }

  // ERROR //
  public JNICallback.IconImageInfo b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 339
    //   5: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 52	com/tencent/tencentmap/mapsdk/maps/a/gv:e	Lcom/tencent/map/lib/b;
    //   12: ifnonnull +13 -> 25
    //   15: ldc_w 339
    //   18: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_2
    //   22: astore_1
    //   23: aload_1
    //   24: areturn
    //   25: new 309	com/tencent/map/lib/gl/JNICallback$IconImageInfo
    //   28: dup
    //   29: invokespecial 310	com/tencent/map/lib/gl/JNICallback$IconImageInfo:<init>	()V
    //   32: astore_3
    //   33: aload_3
    //   34: ldc_w 314
    //   37: putfield 317	com/tencent/map/lib/gl/JNICallback$IconImageInfo:anchorPointX1	F
    //   40: aload_3
    //   41: ldc_w 314
    //   44: putfield 320	com/tencent/map/lib/gl/JNICallback$IconImageInfo:anchorPointY1	F
    //   47: aload_1
    //   48: ifnull +38 -> 86
    //   51: aload_1
    //   52: ldc_w 340
    //   55: invokevirtual 343	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   58: ifeq +28 -> 86
    //   61: aload_3
    //   62: fconst_1
    //   63: putfield 313	com/tencent/map/lib/gl/JNICallback$IconImageInfo:scale	F
    //   66: aload_3
    //   67: aload_0
    //   68: aload_1
    //   69: invokespecial 345	com/tencent/tencentmap/mapsdk/maps/a/gv:c	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   72: putfield 329	com/tencent/map/lib/gl/JNICallback$IconImageInfo:bitmap	Landroid/graphics/Bitmap;
    //   75: ldc_w 339
    //   78: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: aload_3
    //   82: astore_1
    //   83: goto -60 -> 23
    //   86: aload_0
    //   87: getfield 39	com/tencent/tencentmap/mapsdk/maps/a/gv:g	Ljava/util/concurrent/locks/Lock;
    //   90: invokeinterface 204 1 0
    //   95: aload_0
    //   96: getfield 52	com/tencent/tencentmap/mapsdk/maps/a/gv:e	Lcom/tencent/map/lib/b;
    //   99: aload_1
    //   100: invokeinterface 349 2 0
    //   105: astore 4
    //   107: aload_0
    //   108: getfield 39	com/tencent/tencentmap/mapsdk/maps/a/gv:g	Ljava/util/concurrent/locks/Lock;
    //   111: invokeinterface 211 1 0
    //   116: aload_3
    //   117: aload_0
    //   118: getfield 32	com/tencent/tencentmap/mapsdk/maps/a/gv:d	F
    //   121: putfield 313	com/tencent/map/lib/gl/JNICallback$IconImageInfo:scale	F
    //   124: aload_3
    //   125: aload 4
    //   127: putfield 329	com/tencent/map/lib/gl/JNICallback$IconImageInfo:bitmap	Landroid/graphics/Bitmap;
    //   130: aload 4
    //   132: ifnonnull +26 -> 158
    //   135: aload_1
    //   136: ldc_w 351
    //   139: invokevirtual 194	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   142: ifne +16 -> 158
    //   145: ldc_w 353
    //   148: aload_1
    //   149: invokestatic 357	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   152: invokevirtual 361	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   155: invokestatic 365	com/tencent/map/lib/d:b	(Ljava/lang/String;)V
    //   158: ldc_w 339
    //   161: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: aload_3
    //   165: astore_1
    //   166: goto -143 -> 23
    //   169: astore_1
    //   170: aload_0
    //   171: getfield 39	com/tencent/tencentmap/mapsdk/maps/a/gv:g	Ljava/util/concurrent/locks/Lock;
    //   174: invokeinterface 211 1 0
    //   179: ldc_w 339
    //   182: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: aload_1
    //   186: athrow
    //   187: astore_1
    //   188: ldc_w 339
    //   191: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: aload_2
    //   195: astore_1
    //   196: goto -173 -> 23
    //
    // Exception table:
    //   from	to	target	type
    //   86	107	169	finally
    //   107	130	187	java/lang/Exception
    //   135	158	187	java/lang/Exception
    //   170	187	187	java/lang/Exception
  }

  public void b()
  {
    AppMethodBeat.i(99492);
    this.f.unlock();
    AppMethodBeat.o(99492);
  }

  public boolean b(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(99494);
    boolean bool;
    if (this.c == null)
    {
      bool = false;
      AppMethodBeat.o(99494);
    }
    while (true)
    {
      return bool;
      bool = a(new File(this.c.d()), paramString, paramArrayOfByte, this.g);
      AppMethodBeat.o(99494);
    }
  }

  public void c()
  {
    AppMethodBeat.i(99495);
    this.b.f().b("");
    AppMethodBeat.o(99495);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gv
 * JD-Core Version:    0.6.2
 */
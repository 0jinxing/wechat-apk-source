package com.tencent.mm.plugin.mmsight;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Point;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.MediaMetadataRetriever;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.i;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import com.tencent.mm.vfs.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class d
{
  private static float ost;
  private static boolean osu;
  private static int osv;
  private static int osw;
  private static ConcurrentHashMap<String, Long> osx;

  static
  {
    AppMethodBeat.i(76424);
    ost = 0.01F;
    osu = false;
    osv = 0;
    osw = 0;
    osx = new ConcurrentHashMap();
    AppMethodBeat.o(76424);
  }

  public static String RJ(String paramString)
  {
    AppMethodBeat.i(76401);
    paramString = new b(String.format("%s/%s.mp4", new Object[] { paramString, Long.valueOf(System.currentTimeMillis()) }));
    if (paramString.exists())
      paramString.delete();
    paramString = com.tencent.mm.vfs.j.w(paramString.dMD());
    AppMethodBeat.o(76401);
    return paramString;
  }

  public static String RK(String paramString)
  {
    AppMethodBeat.i(76412);
    try
    {
      paramString = com.tencent.mm.plugin.sight.base.d.RK(paramString);
      AppMethodBeat.o(76412);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightUtil", "getMediaInfo error: %s", new Object[] { paramString.getMessage() });
        paramString = null;
        AppMethodBeat.o(76412);
      }
    }
  }

  public static String RL(String paramString)
  {
    AppMethodBeat.i(76413);
    paramString = com.tencent.mm.compatible.util.e.euR + String.format("%s%d.%s", new Object[] { "wx_camera_", Long.valueOf(System.currentTimeMillis()), paramString });
    AppMethodBeat.o(76413);
    return paramString;
  }

  public static void RM(String paramString)
  {
    AppMethodBeat.i(76414);
    ab.i("MicroMsg.MMSightUtil", "setTime key %s %s", new Object[] { paramString, bo.dpG().toString() });
    osx.put(paramString, Long.valueOf(System.currentTimeMillis()));
    AppMethodBeat.o(76414);
  }

  public static long RN(String paramString)
  {
    AppMethodBeat.i(76415);
    long l;
    if (osx.containsKey(paramString))
    {
      l = ((Long)osx.get(paramString)).longValue();
      l = System.currentTimeMillis() - l;
      AppMethodBeat.o(76415);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(76415);
    }
  }

  public static Point a(Point paramPoint1, Point paramPoint2, boolean paramBoolean)
  {
    AppMethodBeat.i(76405);
    paramPoint1 = a(paramPoint1, paramPoint2, paramBoolean, false);
    AppMethodBeat.o(76405);
    return paramPoint1;
  }

  public static Point a(Point paramPoint1, Point paramPoint2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(76406);
    int i = paramPoint2.x;
    int j = paramPoint2.y;
    int k;
    int m;
    label37: int i1;
    if (paramBoolean1)
    {
      k = paramPoint1.y;
      if (!paramBoolean1)
        break label206;
      m = paramPoint1.x;
      int n = (int)(i * (m / k));
      i1 = n;
      if (n % 2 != 0)
        i1 = n - 1;
      float f = j;
      k = (int)(k / m * f);
      if (!paramBoolean2)
        break label232;
      i1 = ev(i1, paramPoint2.y);
    }
    label206: label232: 
    while (true)
    {
      ab.i("MicroMsg.MMSightUtil", "getCropPreviewSizeWithHeight, previewSize: %s, displaySize: %s, width: %s, newHeight: %s makeMediaCodecHappy %s, newWidth: %s, isRoate: %s", new Object[] { paramPoint2, paramPoint1, Integer.valueOf(i), Integer.valueOf(i1), Boolean.valueOf(paramBoolean2), Integer.valueOf(k), Boolean.valueOf(paramBoolean1) });
      if ((i1 <= paramPoint2.y) && (i <= paramPoint2.x))
      {
        paramPoint1 = new Point(i, i1);
        AppMethodBeat.o(76406);
      }
      while (true)
      {
        return paramPoint1;
        k = paramPoint1.x;
        break;
        m = paramPoint1.y;
        break label37;
        ab.i("MicroMsg.MMSightUtil", "can not adapt to screen");
        paramPoint1 = null;
        AppMethodBeat.o(76406);
      }
    }
  }

  public static void a(com.tencent.mm.plugin.mmsight.model.a.d paramd, SightParams paramSightParams)
  {
    AppMethodBeat.i(76400);
    Object localObject1 = paramSightParams.osM;
    Object localObject2 = paramSightParams.osK;
    paramSightParams = paramSightParams.osL;
    if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil((String)localObject2)) && (!bo.isNullOrNil(paramSightParams)))
    {
      ab.i("MicroMsg.MMSightUtil", "setMMSightRecorderPathByTalker, fileName: %s, filePath: %s, thumbPath: %s", new Object[] { localObject1, localObject2, paramSightParams });
      paramd.setFilePath((String)localObject2);
      paramd.mb(paramSightParams);
    }
    while (true)
    {
      paramSightParams = CaptureMMProxy.getInstance().getSubCoreImageFullPath("capture_" + System.currentTimeMillis());
      ab.i("MicroMsg.MMSightUtil", "captureImagePath %s", new Object[] { paramSightParams });
      paramd.mc(paramSightParams);
      AppMethodBeat.o(76400);
      return;
      paramSightParams = CaptureMMProxy.getInstance().getAccVideoPath();
      int i = osv;
      osv = i + 1;
      localObject1 = new b(String.format("%s/tempvideo%s.mp4", new Object[] { paramSightParams, Integer.valueOf(i) }));
      if (((b)localObject1).exists())
        ((b)localObject1).delete();
      localObject2 = new b(com.tencent.mm.vfs.j.w(((b)localObject1).dMD()) + ".remux");
      if (((b)localObject2).exists())
        ((b)localObject2).delete();
      localObject2 = new b(((b)localObject1).dME() + ".thumb");
      if (((b)localObject2).exists())
        ((b)localObject2).delete();
      localObject2 = new b(((b)localObject1).dME() + ".soundmp4");
      if (((b)localObject2).exists())
        ((b)localObject2).delete();
      i.R(new d.1(osv - 3, paramSightParams));
      localObject1 = com.tencent.mm.vfs.j.w(((b)localObject1).dMD());
      paramSightParams = bo.bc((String)localObject1, "") + ".thumb";
      ab.i("MicroMsg.MMSightUtil", "setMMSightRecorderPathDefault, filePath: %s, thumbPath: %s", new Object[] { localObject1, paramSightParams });
      paramd.setFilePath((String)localObject1);
      paramd.mb(paramSightParams);
    }
  }

  public static boolean a(int paramInt1, int paramInt2, int paramInt3, PInt paramPInt1, PInt paramPInt2)
  {
    AppMethodBeat.i(76421);
    float f;
    int i;
    int j;
    if ((paramInt3 > 0) && (Math.min(paramInt1, paramInt2) > paramInt3))
      if (paramInt1 < paramInt2)
      {
        f = paramInt1 * 1.0F / paramInt3;
        i = (int)(paramInt2 / f);
        j = paramInt3;
      }
    for (boolean bool = true; ; bool = false)
    {
      paramPInt1.value = j;
      paramPInt2.value = i;
      ab.d("MicroMsg.MMSightUtil", "check bitmap size result[%b] raw[%d %d] minSize[%d] out[%d %d]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value) });
      AppMethodBeat.o(76421);
      return bool;
      f = paramInt2 * 1.0F / paramInt3;
      j = (int)(paramInt1 / f);
      i = paramInt3;
      break;
      i = paramInt2;
      j = paramInt1;
    }
  }

  public static boolean a(Context paramContext, Point paramPoint, boolean paramBoolean)
  {
    AppMethodBeat.i(76404);
    paramContext = eu(paramContext);
    float f1 = paramContext.y / paramContext.x;
    float f2;
    if (paramBoolean)
    {
      f2 = paramPoint.x / paramPoint.y;
      float f3 = Math.abs(f1 - f2);
      ab.i("MicroMsg.MMSightUtil", "checkIfNeedUsePreviewLarge: previewSize: %s, displaySize: %s, displayRatio: %s, previewRatio: %s, diff: %s", new Object[] { paramPoint, paramContext, Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3) });
      if (f3 <= ost)
        break label127;
      AppMethodBeat.o(76404);
    }
    for (paramBoolean = true; ; paramBoolean = false)
    {
      return paramBoolean;
      f2 = paramPoint.y / paramPoint.x;
      break;
      label127: AppMethodBeat.o(76404);
    }
  }

  public static Bitmap ag(String paramString, long paramLong)
  {
    AppMethodBeat.i(76418);
    if ((bo.isNullOrNil(paramString)) || (!com.tencent.mm.vfs.e.ct(paramString)))
    {
      ab.e("MicroMsg.MMSightUtil", "getVideoThumb, %s not exist!!", new Object[] { paramString });
      AppMethodBeat.o(76418);
      paramString = null;
      return paramString;
    }
    ab.i("MicroMsg.MMSightUtil", "getVideoThumb, %s", new Object[] { paramString });
    label353: 
    while (true)
    {
      try
      {
        Object localObject1 = new android/media/MediaMetadataRetriever;
        ((MediaMetadataRetriever)localObject1).<init>();
        ((MediaMetadataRetriever)localObject1).setDataSource(paramString);
        int i = bo.getInt(((MediaMetadataRetriever)localObject1).extractMetadata(18), -1);
        int j = bo.getInt(((MediaMetadataRetriever)localObject1).extractMetadata(19), -1);
        int k = SightVideoJNI.getMp4Rotate(paramString);
        ab.i("MicroMsg.MMSightUtil", "getVideoThumb, width: %s, height: %s, rotate: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        Object localObject2 = ((MediaMetadataRetriever)localObject1).getFrameAtTime(paramLong, 2);
        ((MediaMetadataRetriever)localObject1).release();
        if (localObject2 != null)
        {
          AppMethodBeat.o(76418);
          paramString = (String)localObject2;
          break;
        }
        ab.i("MicroMsg.MMSightUtil", "use MediaMetadataRetriever failed, try ffmpeg");
        if ((i > 0) && (j > 0))
          break label353;
        localObject1 = SightVideoJNI.getSimpleMp4Info(paramString);
        ab.i("MicroMsg.MMSightUtil", "getSimpleMp4Info: %s", new Object[] { localObject1 });
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        i = ((JSONObject)localObject2).getInt("videoWidth");
        j = ((JSONObject)localObject2).getInt("videoHeight");
        paramString = MP4MuxerJNI.getVideoThumb(paramString, i, j);
        if (paramString == null)
        {
          ab.e("MicroMsg.MMSightUtil", "getVideoThumb, error, can not get rgb byte!!");
          AppMethodBeat.o(76418);
          paramString = null;
          break;
        }
        paramString = ByteBuffer.wrap(paramString);
        localObject2 = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
        ((Bitmap)localObject2).copyPixelsFromBuffer(paramString);
        paramString = (String)localObject2;
        if (k > 0)
          paramString = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject2, k);
        AppMethodBeat.o(76418);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.MMSightUtil", paramString, "get video thumb error! %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(76418);
        paramString = null;
      }
      break;
    }
  }

  public static Point b(Point paramPoint1, Point paramPoint2, boolean paramBoolean)
  {
    AppMethodBeat.i(76407);
    paramPoint1 = b(paramPoint1, paramPoint2, paramBoolean, false);
    AppMethodBeat.o(76407);
    return paramPoint1;
  }

  public static Point b(Point paramPoint1, Point paramPoint2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(76408);
    int i = paramPoint2.x;
    int j = paramPoint2.y;
    int k;
    int m;
    if (paramBoolean1)
    {
      k = paramPoint1.y;
      if (!paramBoolean1)
        break label181;
      m = paramPoint1.x;
      label38: float f = j;
      m = (int)(k / m * f);
      k = m;
      if (m % 2 != 0)
        k = m + 1;
      m = k;
      if (paramBoolean2)
        m = ev(k, paramPoint2.y);
      ab.i("MicroMsg.MMSightUtil", "getCropPreviewSizeWithHeight, previewSize: %s, displaySize: %s, width: %s, newWidth: %s, makeMediaCodecHappy %s, , isRoate: %s", new Object[] { paramPoint2, paramPoint1, Integer.valueOf(i), Integer.valueOf(m), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1) });
      if (m > paramPoint2.x)
        break label190;
      paramPoint1 = new Point(m, j);
      AppMethodBeat.o(76408);
    }
    while (true)
    {
      return paramPoint1;
      k = paramPoint1.x;
      break;
      label181: m = paramPoint1.y;
      break label38;
      label190: ab.i("MicroMsg.MMSightUtil", "can not adapt to screen");
      paramPoint1 = null;
      AppMethodBeat.o(76408);
    }
  }

  public static Point bPg()
  {
    AppMethodBeat.i(76403);
    Point localPoint = ae.hy(ah.getContext());
    AppMethodBeat.o(76403);
    return localPoint;
  }

  public static ArrayList<Camera.Size> c(Camera.Parameters paramParameters)
  {
    AppMethodBeat.i(76411);
    paramParameters = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort(paramParameters, new d.a((byte)0));
    AppMethodBeat.o(76411);
    return paramParameters;
  }

  public static byte[] c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(76420);
    if (paramInt3 == 0)
      AppMethodBeat.o(76420);
    while (true)
    {
      return paramArrayOfByte;
      byte[] arrayOfByte = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(paramArrayOfByte.length));
      int i = paramInt1 * paramInt2;
      int j;
      int k;
      label58: int m;
      if (paramInt3 % 180 != 0)
      {
        j = 1;
        if (paramInt3 % 270 == 0)
          break label258;
        k = 1;
        if (paramInt3 < 180)
          break label264;
        m = 1;
      }
      label68: for (paramInt3 = 0; ; paramInt3++)
      {
        if (paramInt3 >= paramInt2)
          break label301;
        int n = 0;
        label78: if (n < paramInt1)
        {
          int i1 = (paramInt3 >> 1) * paramInt1 + i + (n & 0xFFFFFFFE);
          int i2;
          label108: int i3;
          label116: int i4;
          if (j != 0)
          {
            i2 = paramInt2;
            if (j == 0)
              break label276;
            i3 = paramInt1;
            if (j == 0)
              break label282;
            i4 = paramInt3;
            label124: if (j == 0)
              break label289;
          }
          for (int i5 = n; ; i5 = paramInt3)
          {
            int i6 = i4;
            if (k != 0)
              i6 = i2 - i4 - 1;
            i4 = i5;
            if (m != 0)
              i4 = i3 - i5 - 1;
            i5 = (i4 >> 1) * i2 + i + (i6 & 0xFFFFFFFE);
            arrayOfByte[(i4 * i2 + i6)] = ((byte)(byte)(paramArrayOfByte[(paramInt3 * paramInt1 + n)] & 0xFF));
            arrayOfByte[i5] = ((byte)(byte)(paramArrayOfByte[i1] & 0xFF));
            arrayOfByte[(i5 + 1)] = ((byte)(byte)(paramArrayOfByte[(i1 + 1)] & 0xFF));
            n++;
            break label78;
            j = 0;
            break;
            k = 0;
            break label58;
            m = 0;
            break label68;
            i2 = paramInt1;
            break label108;
            i3 = paramInt2;
            break label116;
            i4 = n;
            break label124;
          }
        }
      }
      label258: label264: label276: label282: label289: label301: com.tencent.mm.plugin.mmsight.model.a.j.owk.g(paramArrayOfByte);
      AppMethodBeat.o(76420);
      paramArrayOfByte = arrayOfByte;
    }
  }

  public static String cp(List<Camera.Size> paramList)
  {
    AppMethodBeat.i(76409);
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (Camera.Size)localIterator.next();
      localStringBuffer.append("size: " + paramList.height + "," + paramList.width + ";");
    }
    paramList = localStringBuffer.toString();
    AppMethodBeat.o(76409);
    return paramList;
  }

  public static String cq(List<Camera.Size> paramList)
  {
    AppMethodBeat.i(76410);
    StringBuffer localStringBuffer = new StringBuffer();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Camera.Size localSize = (Camera.Size)paramList.next();
      localStringBuffer.append("size: " + localSize.height + "," + localSize.width + " " + localSize.height * 1.0D / localSize.width + "||");
    }
    paramList = localStringBuffer.toString();
    AppMethodBeat.o(76410);
    return paramList;
  }

  private static int e(String paramString, InputStream paramInputStream)
  {
    AppMethodBeat.i(76417);
    byte[] arrayOfByte = new byte[1024];
    try
    {
      int i = paramInputStream.read(arrayOfByte);
      int k;
      for (int j = 0; j < i; j = k + 1)
        if (arrayOfByte[j] != 10)
        {
          k = j;
          if (j != 0);
        }
        else
        {
          m = j;
          if (arrayOfByte[j] == 10)
            m = j + 1;
          for (j = m; ; j++)
          {
            k = m;
            if (j >= i)
              break;
            int n = j - m;
            k = m;
            if (arrayOfByte[j] != paramString.charAt(n))
              break;
            if (n == paramString.length() - 1)
            {
              if ((j < 1024) && (arrayOfByte[j] != 10))
                if (Character.isDigit(arrayOfByte[j]))
                {
                  for (m = j + 1; (m < 1024) && (Character.isDigit(arrayOfByte[m])); m++);
                  paramString = new java/lang/String;
                  paramString.<init>(arrayOfByte, 0, j, m - j);
                  m = bo.ank(paramString);
                  AppMethodBeat.o(76417);
                }
              while (true)
              {
                return m;
                j++;
                break;
                AppMethodBeat.o(76417);
                m = 0;
              }
            }
          }
        }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        AppMethodBeat.o(76417);
        int m = 0;
      }
    }
    catch (IOException paramString)
    {
      label236: break label236;
    }
  }

  public static Point eu(Context paramContext)
  {
    AppMethodBeat.i(76402);
    Point localPoint = ae.hy(paramContext);
    if ((!osu) && (ae.hw(paramContext)))
      localPoint.y -= ae.fr(paramContext);
    AppMethodBeat.o(76402);
    return localPoint;
  }

  public static int ev(int paramInt1, int paramInt2)
  {
    int i = paramInt1 % 16;
    if (i == 0);
    while (true)
    {
      return paramInt1;
      int j = 16 - i + paramInt1;
      if (j < paramInt2)
        paramInt1 = j;
      else
        paramInt1 -= i;
    }
  }

  // ERROR //
  public static int ev(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 582
    //   3: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 587	android/os/Build$VERSION:SDK_INT	I
    //   9: bipush 16
    //   11: if_icmplt +44 -> 55
    //   14: new 589	android/app/ActivityManager$MemoryInfo
    //   17: dup
    //   18: invokespecial 590	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   21: astore_1
    //   22: aload_0
    //   23: ldc_w 592
    //   26: invokevirtual 598	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   29: checkcast 600	android/app/ActivityManager
    //   32: aload_1
    //   33: invokevirtual 604	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   36: aload_1
    //   37: getfield 608	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   40: l2d
    //   41: ldc2_w 609
    //   44: ddiv
    //   45: d2i
    //   46: istore_2
    //   47: ldc_w 582
    //   50: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: iload_2
    //   54: ireturn
    //   55: new 612	java/io/FileInputStream
    //   58: astore_1
    //   59: aload_1
    //   60: ldc_w 614
    //   63: invokespecial 615	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   66: ldc_w 617
    //   69: aload_1
    //   70: invokestatic 619	com/tencent/mm/plugin/mmsight/d:e	(Ljava/lang/String;Ljava/io/InputStream;)I
    //   73: istore_2
    //   74: iload_2
    //   75: i2d
    //   76: dstore_3
    //   77: dload_3
    //   78: dstore 5
    //   80: dload_3
    //   81: dconst_0
    //   82: dcmpl
    //   83: ifle +10 -> 93
    //   86: dload_3
    //   87: ldc2_w 609
    //   90: ddiv
    //   91: dstore 5
    //   93: aload_1
    //   94: invokevirtual 622	java/io/InputStream:close	()V
    //   97: dload 5
    //   99: d2i
    //   100: istore_2
    //   101: ldc_w 582
    //   104: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: goto -54 -> 53
    //   110: astore_0
    //   111: aload_1
    //   112: invokevirtual 622	java/io/InputStream:close	()V
    //   115: ldc_w 582
    //   118: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: aload_0
    //   122: athrow
    //   123: astore_0
    //   124: dconst_0
    //   125: dstore 5
    //   127: goto -30 -> 97
    //   130: astore_0
    //   131: goto -34 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   66	74	110	finally
    //   55	66	123	java/io/IOException
    //   111	123	123	java/io/IOException
    //   93	97	130	java/io/IOException
  }

  public static void iV(boolean paramBoolean)
  {
    osu = paramBoolean;
  }

  public static Bitmap tv(String paramString)
  {
    AppMethodBeat.i(76419);
    paramString = ag(paramString, 0L);
    AppMethodBeat.o(76419);
    return paramString;
  }

  public static int yN(int paramInt)
  {
    int i = paramInt;
    if (paramInt % 16 == 0)
      return paramInt;
    while (true)
    {
      paramInt = i;
      if (i % 16 == 0)
        break;
      i++;
    }
  }

  public static boolean yO(int paramInt)
  {
    if (paramInt % 16 == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int yP(int paramInt)
  {
    AppMethodBeat.i(76422);
    paramInt = ev(paramInt, 2147483647);
    AppMethodBeat.o(76422);
    return paramInt;
  }

  public static int yQ(int paramInt)
  {
    AppMethodBeat.i(76423);
    int i = paramInt % 32;
    if (i == 0)
      AppMethodBeat.o(76423);
    while (true)
    {
      return paramInt;
      int j = paramInt - Math.min(32, i);
      if (j < 2147483647)
      {
        AppMethodBeat.o(76423);
        paramInt = j;
      }
      else
      {
        paramInt -= i;
        AppMethodBeat.o(76423);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.d
 * JD-Core Version:    0.6.2
 */
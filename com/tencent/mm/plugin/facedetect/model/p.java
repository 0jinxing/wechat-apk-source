package com.tencent.mm.plugin.facedetect.model;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Base64;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.av;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.pluginsdk.g.a.a.m;
import com.tencent.mm.protocal.protobuf.ju;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;

public final class p
{
  public static Bitmap Lr(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(266);
    try
    {
      if (bo.isNullOrNil(paramString))
      {
        ab.i("MicroMsg.FaceUtils", "hy: username is null or nil. return");
        AppMethodBeat.o(266);
        paramString = localObject1;
      }
      while (true)
      {
        return paramString;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = a.a.lTy + ag.ck(paramString);
        localObject2 = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject2).<init>(str);
        if (!((com.tencent.mm.vfs.b)localObject2).exists())
        {
          ab.w("MicroMsg.FaceUtils", "hy: no last file. return");
          AppMethodBeat.o(266);
          paramString = localObject1;
        }
        else
        {
          localObject2 = e.e(str, 0, -1);
          if (localObject2 != null)
          {
            paramString = p.a.e((byte[])localObject2, Ls(paramString));
            if (paramString.length <= 0)
            {
              ab.w("MicroMsg.FaceUtils", "hy: decrypt err. return null");
              AppMethodBeat.o(266);
              paramString = localObject1;
            }
            else
            {
              paramString = com.tencent.mm.compatible.g.a.decodeByteArray(paramString, 0, paramString.length);
              AppMethodBeat.o(266);
            }
          }
          else
          {
            ab.w("MicroMsg.FaceUtils", "hy: nothing in file");
            AppMethodBeat.o(266);
            paramString = localObject1;
          }
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceUtils", paramString, "hy: err in encrypt", new Object[0]);
        AppMethodBeat.o(266);
        paramString = localObject1;
      }
    }
  }

  private static String Ls(String paramString)
  {
    AppMethodBeat.i(268);
    paramString = Base64.encodeToString((paramString + paramString.hashCode()).getBytes(), 0);
    AppMethodBeat.o(268);
    return paramString;
  }

  public static String Lt(String paramString)
  {
    AppMethodBeat.i(282);
    paramString = com.tencent.mm.a.g.x((bo.yz() + ", " + paramString).getBytes());
    AppMethodBeat.o(282);
    return paramString;
  }

  public static boolean M(Activity paramActivity)
  {
    boolean bool1 = true;
    AppMethodBeat.i(269);
    boolean bool2 = com.tencent.mm.pluginsdk.permission.b.o(paramActivity, "android.permission.CAMERA");
    boolean bool3 = com.tencent.mm.pluginsdk.permission.b.o(paramActivity, "android.permission.RECORD_AUDIO");
    ab.d("MicroMsg.FaceUtils", "summerper checkPermission checkCamera[%b], checkAudio[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), bo.dpG(), paramActivity });
    ArrayList localArrayList = new ArrayList();
    if (!bool2)
      localArrayList.add("android.permission.CAMERA");
    if (!bool3)
      localArrayList.add("android.permission.RECORD_AUDIO");
    if ((!bool2) || (!bool3))
    {
      ab.i("MicroMsg.FaceUtils", "hy: above 23 and no permission. requesting...");
      android.support.v4.app.a.a(paramActivity, (String[])localArrayList.toArray(new String[localArrayList.size()]), 23);
      AppMethodBeat.o(269);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(269);
    }
  }

  public static void N(Activity paramActivity)
  {
    AppMethodBeat.i(270);
    paramActivity.getWindow().setFlags(1024, 1024);
    AppMethodBeat.o(270);
  }

  public static String a(FaceProNative.FaceResult paramFaceResult)
  {
    AppMethodBeat.i(265);
    if ((paramFaceResult == null) || (paramFaceResult.result != 0))
    {
      ab.e("MicroMsg.FaceUtils", "alvinluo face result is null or result code not 0");
      AppMethodBeat.o(265);
      paramFaceResult = null;
    }
    while (true)
    {
      return paramFaceResult;
      try
      {
        String str = bsS();
        ju localju = new com/tencent/mm/protocal/protobuf/ju;
        localju.<init>();
        localju.vMj = com.tencent.mm.bt.b.bI(paramFaceResult.sidedata);
        localju.vMk = com.tencent.mm.bt.b.bI(paramFaceResult.data);
        d(localju.toByteArray(), str);
        AppMethodBeat.o(265);
        paramFaceResult = str;
      }
      catch (Exception paramFaceResult)
      {
        ab.printErrStackTrace("MicroMsg.FaceUtils", paramFaceResult, "", new Object[0]);
        AppMethodBeat.o(265);
        paramFaceResult = null;
      }
    }
  }

  public static boolean b(Bitmap paramBitmap, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(267);
    if (paramBitmap == null);
    try
    {
      ab.w("MicroMsg.FaceUtils", "hy: bm is null. abort");
      AppMethodBeat.o(267);
      while (true)
      {
        return bool;
        if (bo.isNullOrNil(paramString))
        {
          ab.i("MicroMsg.FaceUtils", "hy: username is null or nil. return");
          AppMethodBeat.o(267);
        }
        else
        {
          Object localObject1 = new com/tencent/mm/vfs/b;
          ((com.tencent.mm.vfs.b)localObject1).<init>(a.a.lTy);
          if (!((com.tencent.mm.vfs.b)localObject1).exists())
            ((com.tencent.mm.vfs.b)localObject1).mkdirs();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = a.a.lTy + ag.ck(paramString);
          Object localObject2 = new com/tencent/mm/vfs/b;
          ((com.tencent.mm.vfs.b)localObject2).<init>((String)localObject1);
          if (!((com.tencent.mm.vfs.b)localObject2).exists())
          {
            ab.i("MicroMsg.FaceUtils", "hy: last file already exists. del");
            ((com.tencent.mm.vfs.b)localObject2).createNewFile();
          }
          localObject2 = new java/io/ByteArrayOutputStream;
          ((ByteArrayOutputStream)localObject2).<init>();
          paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, (OutputStream)localObject2);
          paramBitmap = ((ByteArrayOutputStream)localObject2).toByteArray();
          ((ByteArrayOutputStream)localObject2).close();
          if (paramBitmap != null)
          {
            paramBitmap = p.a.e(paramBitmap, Ls(paramString));
            if (paramBitmap.length <= 0)
            {
              ab.w("MicroMsg.FaceUtils", "hy: enc err. return null");
              AppMethodBeat.o(267);
            }
            else
            {
              e.b((String)localObject1, paramBitmap, paramBitmap.length);
              bool = true;
              AppMethodBeat.o(267);
            }
          }
          else
          {
            ab.w("MicroMsg.FaceUtils", "hy: nothing in stream");
            AppMethodBeat.o(267);
          }
        }
      }
    }
    catch (Exception paramBitmap)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceUtils", paramBitmap, "hy: err in encrypt", new Object[0]);
        AppMethodBeat.o(267);
      }
    }
  }

  private static void bsM()
  {
    AppMethodBeat.i(271);
    ab.i("MicroMsg.FaceUtils", "hy: trigger start download model file");
    com.tencent.mm.kernel.g.Rg().a(new m(42), 0);
    AppMethodBeat.o(271);
  }

  public static boolean bsN()
  {
    boolean bool1 = false;
    AppMethodBeat.i(272);
    Object localObject1 = bsP();
    Object localObject2 = bsQ();
    if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil((String)localObject2)))
    {
      ab.w("MicroMsg.FaceUtils", "hy: not valid model path. start ");
      bool2 = bool1;
      if (!bool2)
        bsM();
      AppMethodBeat.o(272);
      return bool2;
    }
    localObject1 = new com.tencent.mm.vfs.b((String)localObject1);
    localObject2 = new com.tencent.mm.vfs.b((String)localObject2);
    if ((!((com.tencent.mm.vfs.b)localObject1).exists()) && (!vn(0)))
      ab.e("MicroMsg.FaceUtils", "hy: no detect model in storage and sdcard");
    for (boolean bool2 = false; ; bool2 = true)
    {
      if ((!((com.tencent.mm.vfs.b)localObject2).exists()) && (!vn(1)))
      {
        ab.e("MicroMsg.FaceUtils", "hy: no alignment model in storage and sdcard");
        bool2 = bool1;
        break;
      }
      break;
    }
  }

  public static String bsO()
  {
    AppMethodBeat.i(273);
    if (a.lTw);
    for (String str = h.getExternalStorageDirectory().getAbsolutePath() + "/face_detect"; ; str = ah.getContext().getFilesDir().getParent() + "/face_detect")
    {
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(str);
      if (!localb.exists())
      {
        ab.i("MicroMsg.FaceUtils", "hy: face dir not exist. mk dir");
        localb.mkdirs();
      }
      AppMethodBeat.o(273);
      return str;
    }
  }

  public static String bsP()
  {
    AppMethodBeat.i(274);
    String str = bsO() + "/ufdmtcc.bin";
    AppMethodBeat.o(274);
    return str;
  }

  public static String bsQ()
  {
    AppMethodBeat.i(275);
    String str = bsO() + "/ufat.bin";
    AppMethodBeat.o(275);
    return str;
  }

  public static String bsR()
  {
    AppMethodBeat.i(276);
    String str = bsO() + "/PE.dat";
    AppMethodBeat.o(276);
    return str;
  }

  public static String bsS()
  {
    AppMethodBeat.i(277);
    String str = bsO() + "/release_out.fd";
    AppMethodBeat.o(277);
    return str;
  }

  public static void d(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(264);
    try
    {
      e.b(paramString, paramArrayOfByte, paramArrayOfByte.length);
      AppMethodBeat.o(264);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceUtils", paramArrayOfByte, "hy: err in save debug jpeg", new Object[0]);
        AppMethodBeat.o(264);
      }
    }
  }

  public static Bitmap n(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(281);
    long l1 = System.currentTimeMillis();
    if (paramBitmap == null)
      paramBitmap = null;
    while (true)
    {
      ab.i("MicroMsg.FaceUtils", "hy: blur using %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
      int i = 1;
      Object localObject = paramBitmap;
      int j;
      if (paramBitmap == null)
      {
        ab.w("MicroMsg.FaceUtils", "hy: null on blur. use default");
        j = 0;
        paramBitmap = Lr(paramString);
        localObject = paramBitmap;
        i = j;
        if (paramBitmap == null)
        {
          localObject = com.tencent.mm.sdk.platformtools.d.LV(2130838625);
          i = j;
        }
      }
      if (i != 0)
        com.tencent.mm.sdk.g.d.post(new p.1((Bitmap)localObject, paramString), "FaceUtils_SaveFile");
      AppMethodBeat.o(281);
      return localObject;
      long l2 = System.currentTimeMillis();
      paramBitmap = Bitmap.createScaledBitmap(paramBitmap, Math.round(paramBitmap.getWidth() * 0.1F), Math.round(paramBitmap.getHeight() * 0.1F), false);
      paramBitmap = paramBitmap.copy(paramBitmap.getConfig(), true);
      int k = paramBitmap.getWidth();
      int m = paramBitmap.getHeight();
      int[] arrayOfInt1 = new int[k * m];
      ab.e("pix", k + " " + m + " " + arrayOfInt1.length);
      paramBitmap.getPixels(arrayOfInt1, 0, k, 0, 0, k, m);
      int n = k - 1;
      int i1 = m - 1;
      int i2 = k * m;
      int[] arrayOfInt2 = new int[i2];
      int[] arrayOfInt3 = new int[i2];
      int[] arrayOfInt4 = new int[i2];
      int[] arrayOfInt5 = new int[Math.max(k, m)];
      localObject = new int[246016];
      for (i = 0; i < 246016; i++)
        localObject[i] = (i / 961);
      int[][] arrayOfInt = new int[61][3];
      int i3 = 0;
      int i4 = 0;
      int i5 = 0;
      int i6;
      int i7;
      int i8;
      int i9;
      int i10;
      int i11;
      int i12;
      int i13;
      int i14;
      int[] arrayOfInt6;
      int i16;
      int i17;
      int i18;
      while (true)
      {
        if (i3 >= m)
          break label976;
        if (b.ik(l2))
        {
          paramBitmap = null;
          break;
        }
        i6 = -30;
        i7 = 0;
        i8 = 0;
        i9 = 0;
        i10 = 0;
        i11 = 0;
        i12 = 0;
        i13 = 0;
        i = 0;
        j = 0;
        if (i6 <= 30)
        {
          i14 = arrayOfInt1[(Math.min(n, Math.max(i6, 0)) + i5)];
          arrayOfInt6 = arrayOfInt[(i6 + 30)];
          arrayOfInt6[0] = ((0xFF0000 & i14) >> 16);
          arrayOfInt6[1] = ((0xFF00 & i14) >> 8);
          arrayOfInt6[2] = (i14 & 0xFF);
          i14 = 31 - Math.abs(i6);
          i13 += arrayOfInt6[0] * i14;
          i += arrayOfInt6[1] * i14;
          j += i14 * arrayOfInt6[2];
          if (i6 > 0)
          {
            i7 += arrayOfInt6[0];
            i8 += arrayOfInt6[1];
            i9 += arrayOfInt6[2];
          }
          while (true)
          {
            i6++;
            break;
            i10 += arrayOfInt6[0];
            i11 += arrayOfInt6[1];
            i12 += arrayOfInt6[2];
          }
        }
        int i15 = 30;
        if (b.ik(l2))
        {
          paramBitmap = null;
          break;
        }
        i16 = 0;
        i14 = i7;
        i6 = i8;
        i7 = i9;
        i17 = i10;
        i18 = i11;
        i11 = i12;
        i12 = i15;
        i9 = j;
        i10 = i;
        i8 = i13;
        i = i18;
        j = i17;
        i13 = i16;
        while (i13 < k)
        {
          arrayOfInt2[i5] = localObject[i8];
          arrayOfInt3[i5] = localObject[i10];
          arrayOfInt4[i5] = localObject[i9];
          arrayOfInt6 = arrayOfInt[((i12 - 30 + 61) % 61)];
          i18 = arrayOfInt6[0];
          i17 = arrayOfInt6[1];
          int i19 = arrayOfInt6[2];
          if (i3 == 0)
            arrayOfInt5[i13] = Math.min(i13 + 30 + 1, n);
          i16 = arrayOfInt1[(arrayOfInt5[i13] + i4)];
          arrayOfInt6[0] = ((0xFF0000 & i16) >> 16);
          arrayOfInt6[1] = ((0xFF00 & i16) >> 8);
          arrayOfInt6[2] = (i16 & 0xFF);
          i14 += arrayOfInt6[0];
          i6 += arrayOfInt6[1];
          i7 = arrayOfInt6[2] + i7;
          i8 = i8 - j + i14;
          i10 = i10 - i + i6;
          i9 = i9 - i11 + i7;
          i12 = (i12 + 1) % 61;
          arrayOfInt6 = arrayOfInt[(i12 % 61)];
          i15 = arrayOfInt6[0];
          i16 = arrayOfInt6[1];
          i11 = i11 - i19 + arrayOfInt6[2];
          int i20 = arrayOfInt6[0];
          int i21 = arrayOfInt6[1];
          i19 = arrayOfInt6[2];
          i5++;
          i13++;
          i14 -= i20;
          i6 -= i21;
          i7 -= i19;
          j = j - i18 + i15;
          i = i - i17 + i16;
        }
        i3++;
        i4 += k;
      }
      label976: for (i = 0; ; i++)
      {
        if (i >= k)
          break label1561;
        i5 = k * -30;
        if (b.ik(l2))
        {
          paramBitmap = null;
          break;
        }
        i3 = -30;
        i4 = 0;
        i13 = 0;
        j = 0;
        i12 = 0;
        i11 = 0;
        i9 = 0;
        i10 = 0;
        i7 = 0;
        i8 = 0;
        if (i3 <= 30)
        {
          i14 = Math.max(0, i5) + i;
          arrayOfInt6 = arrayOfInt[(i3 + 30)];
          arrayOfInt6[0] = arrayOfInt2[i14];
          arrayOfInt6[1] = arrayOfInt3[i14];
          arrayOfInt6[2] = arrayOfInt4[i14];
          i17 = 31 - Math.abs(i3);
          i6 = i10 + arrayOfInt2[i14] * i17;
          i7 += arrayOfInt3[i14] * i17;
          i8 += arrayOfInt4[i14] * i17;
          if (i3 > 0)
          {
            i4 += arrayOfInt6[0];
            i13 += arrayOfInt6[1];
            j += arrayOfInt6[2];
          }
          while (true)
          {
            i10 = i5;
            if (i3 < i1)
              i10 = i5 + k;
            i3++;
            i5 = i10;
            i10 = i6;
            break;
            i12 += arrayOfInt6[0];
            i11 += arrayOfInt6[1];
            i9 += arrayOfInt6[2];
          }
        }
        i5 = 30;
        if (b.ik(l2))
        {
          paramBitmap = null;
          break;
        }
        i3 = 0;
        i6 = i4;
        i4 = i;
        while (i3 < m)
        {
          arrayOfInt1[i4] = (0xFF000000 & arrayOfInt1[i4] | localObject[i10] << 16 | localObject[i7] << 8 | localObject[i8]);
          arrayOfInt6 = arrayOfInt[((i5 - 30 + 61) % 61)];
          i18 = arrayOfInt6[0];
          i17 = arrayOfInt6[1];
          i14 = arrayOfInt6[2];
          if (i == 0)
            arrayOfInt5[i3] = (Math.min(i3 + 31, i1) * k);
          i16 = arrayOfInt5[i3] + i;
          arrayOfInt6[0] = arrayOfInt2[i16];
          arrayOfInt6[1] = arrayOfInt3[i16];
          arrayOfInt6[2] = arrayOfInt4[i16];
          i6 += arrayOfInt6[0];
          i13 += arrayOfInt6[1];
          j += arrayOfInt6[2];
          i10 = i10 - i12 + i6;
          i7 = i7 - i11 + i13;
          i8 = i8 - i9 + j;
          i5 = (i5 + 1) % 61;
          arrayOfInt6 = arrayOfInt[i5];
          i12 = i12 - i18 + arrayOfInt6[0];
          i11 = i11 - i17 + arrayOfInt6[1];
          i9 = i9 - i14 + arrayOfInt6[2];
          i6 -= arrayOfInt6[0];
          i14 = arrayOfInt6[1];
          j -= arrayOfInt6[2];
          i4 += k;
          i3++;
          i13 -= i14;
        }
      }
      label1561: ab.e("pix", k + " " + m + " " + i2);
      paramBitmap.setPixels(arrayOfInt1, 0, k, 0, 0, k, m);
    }
  }

  // ERROR //
  public static void p(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: sipush 280
    //   3: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 24
    //   8: ldc_w 475
    //   11: iconst_2
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_1
    //   18: aastore
    //   19: dup
    //   20: iconst_1
    //   21: aload_2
    //   22: aastore
    //   23: invokestatic 388	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   26: new 62	com/tencent/mm/vfs/b
    //   29: astore_3
    //   30: aload_3
    //   31: aload_2
    //   32: invokespecial 65	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   35: aload_0
    //   36: invokevirtual 479	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   39: aload_1
    //   40: invokevirtual 485	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   43: astore_0
    //   44: new 487	com/tencent/mm/vfs/f
    //   47: astore 4
    //   49: aload 4
    //   51: aload_3
    //   52: invokespecial 490	com/tencent/mm/vfs/f:<init>	(Lcom/tencent/mm/vfs/b;)V
    //   55: aload 4
    //   57: astore 5
    //   59: aload_0
    //   60: astore_2
    //   61: sipush 1024
    //   64: newarray byte
    //   66: astore 6
    //   68: aload 4
    //   70: astore 5
    //   72: aload_0
    //   73: astore_2
    //   74: aload_0
    //   75: aload 6
    //   77: invokevirtual 496	java/io/InputStream:read	([B)I
    //   80: istore 7
    //   82: iload 7
    //   84: iconst_m1
    //   85: if_icmpeq +71 -> 156
    //   88: aload 4
    //   90: astore 5
    //   92: aload_0
    //   93: astore_2
    //   94: aload 4
    //   96: aload 6
    //   98: iconst_0
    //   99: iload 7
    //   101: invokevirtual 502	java/io/OutputStream:write	([BII)V
    //   104: goto -36 -> 68
    //   107: astore_2
    //   108: aload 4
    //   110: astore_1
    //   111: aload_2
    //   112: astore 4
    //   114: aload_1
    //   115: astore 5
    //   117: aload_0
    //   118: astore_2
    //   119: ldc 24
    //   121: aload 4
    //   123: ldc_w 504
    //   126: iconst_0
    //   127: anewarray 4	java/lang/Object
    //   130: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: aload_0
    //   134: ifnull +7 -> 141
    //   137: aload_0
    //   138: invokevirtual 505	java/io/InputStream:close	()V
    //   141: aload_1
    //   142: ifnull +7 -> 149
    //   145: aload_1
    //   146: invokevirtual 506	java/io/OutputStream:close	()V
    //   149: sipush 280
    //   152: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: return
    //   156: aload 4
    //   158: astore 5
    //   160: aload_0
    //   161: astore_2
    //   162: aload 4
    //   164: invokevirtual 509	java/io/OutputStream:flush	()V
    //   167: aload 4
    //   169: astore 5
    //   171: aload_0
    //   172: astore_2
    //   173: ldc 24
    //   175: ldc_w 511
    //   178: iconst_2
    //   179: anewarray 4	java/lang/Object
    //   182: dup
    //   183: iconst_0
    //   184: aload_1
    //   185: aastore
    //   186: dup
    //   187: iconst_1
    //   188: aload_3
    //   189: invokevirtual 514	com/tencent/mm/vfs/b:length	()J
    //   192: invokestatic 386	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   195: aastore
    //   196: invokestatic 388	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: aload_0
    //   200: ifnull +7 -> 207
    //   203: aload_0
    //   204: invokevirtual 505	java/io/InputStream:close	()V
    //   207: aload 4
    //   209: invokevirtual 506	java/io/OutputStream:close	()V
    //   212: sipush 280
    //   215: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   218: goto -63 -> 155
    //   221: astore_0
    //   222: sipush 280
    //   225: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: goto -73 -> 155
    //   231: astore_0
    //   232: sipush 280
    //   235: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: goto -83 -> 155
    //   241: astore_1
    //   242: aconst_null
    //   243: astore 5
    //   245: aconst_null
    //   246: astore_0
    //   247: aload_0
    //   248: ifnull +7 -> 255
    //   251: aload_0
    //   252: invokevirtual 505	java/io/InputStream:close	()V
    //   255: aload 5
    //   257: ifnull +8 -> 265
    //   260: aload 5
    //   262: invokevirtual 506	java/io/OutputStream:close	()V
    //   265: sipush 280
    //   268: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   271: aload_1
    //   272: athrow
    //   273: astore_0
    //   274: goto -9 -> 265
    //   277: astore_1
    //   278: aconst_null
    //   279: astore 5
    //   281: goto -34 -> 247
    //   284: astore_1
    //   285: aload_2
    //   286: astore_0
    //   287: goto -40 -> 247
    //   290: astore 4
    //   292: aconst_null
    //   293: astore_1
    //   294: aconst_null
    //   295: astore_0
    //   296: goto -182 -> 114
    //   299: astore 4
    //   301: aconst_null
    //   302: astore_1
    //   303: goto -189 -> 114
    //
    // Exception table:
    //   from	to	target	type
    //   61	68	107	java/lang/Exception
    //   74	82	107	java/lang/Exception
    //   94	104	107	java/lang/Exception
    //   162	167	107	java/lang/Exception
    //   173	199	107	java/lang/Exception
    //   203	207	221	java/lang/Exception
    //   207	212	221	java/lang/Exception
    //   137	141	231	java/lang/Exception
    //   145	149	231	java/lang/Exception
    //   26	44	241	finally
    //   251	255	273	java/lang/Exception
    //   260	265	273	java/lang/Exception
    //   44	55	277	finally
    //   61	68	284	finally
    //   74	82	284	finally
    //   94	104	284	finally
    //   119	133	284	finally
    //   162	167	284	finally
    //   173	199	284	finally
    //   26	44	290	java/lang/Exception
    //   44	55	299	java/lang/Exception
  }

  public static boolean vn(int paramInt)
  {
    AppMethodBeat.i(278);
    String str = "";
    boolean bool;
    switch (paramInt)
    {
    default:
      if (bo.isNullOrNil(str))
      {
        ab.w("MicroMsg.FaceUtils", "hy: no such path for type: %d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(278);
        bool = false;
      }
      break;
    case 0:
    case 1:
    }
    while (true)
    {
      return bool;
      str = av.fly.T("LAST_LOGIN_FACE_MODEL_SDCARD_PATH_DETECT", "");
      break;
      str = av.fly.T("LAST_LOGIN_FACE_MODEL_SDCARD_PATH_ALIGNMENT", "");
      break;
      if (new com.tencent.mm.vfs.b(str).exists())
      {
        com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(vo(paramInt));
        if (localb.exists())
          localb.delete();
        e.y(str, vo(paramInt));
        AppMethodBeat.o(278);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.FaceUtils", "originFile file not exist");
        AppMethodBeat.o(278);
        bool = false;
      }
    }
  }

  public static String vo(int paramInt)
  {
    AppMethodBeat.i(279);
    String str;
    switch (paramInt)
    {
    default:
      str = "";
      AppMethodBeat.o(279);
    case 0:
    case 1:
    }
    while (true)
    {
      return str;
      str = bsP();
      AppMethodBeat.o(279);
      continue;
      str = bsQ();
      AppMethodBeat.o(279);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.p
 * JD-Core Version:    0.6.2
 */
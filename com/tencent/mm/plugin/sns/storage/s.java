package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.al.f;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.memory.l;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.protobuf.bar;
import com.tencent.mm.protocal.protobuf.bax;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s extends k
{
  public static final String[] fnj;
  private static int qDU;
  private static int qDc;
  private static Point qLw;
  public com.tencent.mm.cd.h fni;

  static
  {
    AppMethodBeat.i(38001);
    fnj = new String[] { "CREATE TABLE IF NOT EXISTS SnsMedia ( local_id INTEGER PRIMARY KEY, seqId LONG, type INT, createTime LONG, userName VARCHAR(40), totallen INT, offset INT, local_flag INT, tmp_path TEXT, nums INT, try_times INT, StrId VARCHAR(40), upload_buf TEXT, reserved1 INT, reserved2 TEXT, reserved3 TEXT, reserved4 TEXT, reserved5 TEXT )", "CREATE INDEX IF NOT EXISTS serverSnsMediaTimeIndex ON SnsMedia ( createTime )" };
    qDU = 0;
    qDc = 0;
    qLw = new Point();
    AppMethodBeat.o(38001);
  }

  public s(com.tencent.mm.cd.h paramh)
  {
    this.fni = paramh;
  }

  private static String Zh(String paramString)
  {
    AppMethodBeat.i(37979);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(37979);
    }
    while (true)
    {
      return paramString;
      String str1 = g.x(paramString.getBytes());
      paramString = "";
      String str2 = "";
      if (str1.length() > 0)
        paramString = str1.charAt(0) + "/";
      if (str1.length() >= 2)
        str2 = str1.charAt(1) + "/";
      paramString = af.getAccSnsPath() + paramString + str2;
      AppMethodBeat.o(37979);
    }
  }

  // ERROR //
  public static boolean Zj(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: ldc 100
    //   6: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokestatic 106	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   13: astore_0
    //   14: aload_0
    //   15: astore_1
    //   16: new 108	android/graphics/BitmapFactory$Options
    //   19: astore_3
    //   20: aload_0
    //   21: astore_1
    //   22: aload_3
    //   23: invokespecial 109	android/graphics/BitmapFactory$Options:<init>	()V
    //   26: aload_0
    //   27: astore_1
    //   28: aload_3
    //   29: iconst_1
    //   30: putfield 113	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   33: aload_0
    //   34: astore_1
    //   35: aload_0
    //   36: aconst_null
    //   37: aload_3
    //   38: invokestatic 119	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   41: pop
    //   42: aload_0
    //   43: astore_1
    //   44: aload_3
    //   45: getfield 123	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   48: astore_3
    //   49: aload_0
    //   50: astore_1
    //   51: ldc 125
    //   53: ldc 127
    //   55: aload_3
    //   56: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   59: invokevirtual 134	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   62: invokestatic 140	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: aload_0
    //   66: astore_1
    //   67: aload_3
    //   68: invokevirtual 143	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   71: ldc 145
    //   73: invokevirtual 149	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   76: istore 4
    //   78: iload 4
    //   80: iflt +18 -> 98
    //   83: aload_0
    //   84: ifnull +7 -> 91
    //   87: aload_0
    //   88: invokevirtual 154	java/io/InputStream:close	()V
    //   91: ldc 100
    //   93: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: iload_2
    //   97: ireturn
    //   98: aload_0
    //   99: ifnull +7 -> 106
    //   102: aload_0
    //   103: invokevirtual 154	java/io/InputStream:close	()V
    //   106: ldc 100
    //   108: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: iconst_0
    //   112: istore_2
    //   113: goto -17 -> 96
    //   116: astore_0
    //   117: aconst_null
    //   118: astore_0
    //   119: aload_0
    //   120: ifnull +7 -> 127
    //   123: aload_0
    //   124: invokevirtual 154	java/io/InputStream:close	()V
    //   127: ldc 100
    //   129: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: iconst_0
    //   133: istore_2
    //   134: goto -38 -> 96
    //   137: astore_0
    //   138: aload_1
    //   139: ifnull +7 -> 146
    //   142: aload_1
    //   143: invokevirtual 154	java/io/InputStream:close	()V
    //   146: ldc 100
    //   148: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   151: aload_0
    //   152: athrow
    //   153: astore_0
    //   154: goto -63 -> 91
    //   157: astore_0
    //   158: goto -52 -> 106
    //   161: astore_0
    //   162: goto -35 -> 127
    //   165: astore_1
    //   166: goto -20 -> 146
    //   169: astore_1
    //   170: goto -51 -> 119
    //
    // Exception table:
    //   from	to	target	type
    //   9	14	116	java/lang/Exception
    //   9	14	137	finally
    //   16	20	137	finally
    //   22	26	137	finally
    //   28	33	137	finally
    //   35	42	137	finally
    //   44	49	137	finally
    //   51	65	137	finally
    //   67	78	137	finally
    //   87	91	153	java/io/IOException
    //   102	106	157	java/io/IOException
    //   123	127	161	java/io/IOException
    //   142	146	165	java/io/IOException
    //   16	20	169	java/lang/Exception
    //   22	26	169	java/lang/Exception
    //   28	33	169	java/lang/Exception
    //   35	42	169	java/lang/Exception
    //   44	49	169	java/lang/Exception
    //   51	65	169	java/lang/Exception
    //   67	78	169	java/lang/Exception
  }

  public static Bitmap Zk(String paramString)
  {
    int i = 640;
    AppMethodBeat.i(38000);
    Object localObject = com.tencent.mm.sdk.platformtools.d.amj(paramString);
    int j;
    if (((BitmapFactory.Options)localObject).outWidth >= ((BitmapFactory.Options)localObject).outHeight)
    {
      j = 960;
      if (((BitmapFactory.Options)localObject).outWidth < ((BitmapFactory.Options)localObject).outHeight)
        break label68;
      label40: localObject = com.tencent.mm.sdk.platformtools.d.d(paramString, i, j, false);
      if (localObject != null)
        break label75;
      paramString = null;
      AppMethodBeat.o(38000);
    }
    while (true)
    {
      return paramString;
      j = 640;
      break;
      label68: i = 960;
      break label40;
      label75: paramString = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject, Exif.fromFile(paramString).getOrientationInDegree());
      AppMethodBeat.o(38000);
    }
  }

  private int a(com.tencent.mm.plugin.sns.data.h paramh)
  {
    AppMethodBeat.i(37988);
    Object localObject1 = af.getAccSnsPath();
    String str1 = af.getAccSnsTmpPath();
    ab.i("MicroMsg.snsMediaStorage", "SnsMediaStorage %s %s", new Object[] { localObject1, str1 });
    long l = System.currentTimeMillis();
    Object localObject2 = paramh.path;
    int i = paramh.type;
    if (!e.ct((String)localObject2))
    {
      i = -1;
      AppMethodBeat.o(37988);
    }
    while (true)
    {
      return i;
      String str2 = g.x(((String)localObject2 + System.currentTimeMillis()).getBytes());
      String str3 = i.Xe(str2);
      ab.d("MicroMsg.snsMediaStorage", "insert : original img path = ".concat(String.valueOf(localObject2)));
      if (!e.ct(str1))
      {
        ab.i("MicroMsg.snsMediaStorage", "create snstmp path ".concat(String.valueOf(str1)));
        e.tf(str1);
      }
      if (!e.ct((String)localObject1))
      {
        ab.i("MicroMsg.snsMediaStorage", "create snsPath ".concat(String.valueOf(localObject1)));
        e.tf((String)localObject1);
      }
      localObject1 = new com.tencent.mm.plugin.i.a();
      paramh = a(paramh, (String)localObject2);
      int j = paramh.width;
      int k = paramh.height;
      int m = paramh.fileSize;
      ((com.tencent.mm.plugin.i.a)localObject1).nuw = ((String)localObject2);
      ((com.tencent.mm.plugin.i.a)localObject1).nuy = j;
      ((com.tencent.mm.plugin.i.a)localObject1).nuz = k;
      ((com.tencent.mm.plugin.i.a)localObject1).nuA = m;
      if (!e(str1, (String)localObject2, str3, true))
      {
        i = -1;
        AppMethodBeat.o(37988);
        continue;
      }
      ab.d("MicroMsg.snsMediaStorage", "insert0 " + (System.currentTimeMillis() - l));
      ab.d("MicroMsg.snsMediaStorage", "insert: compressed bigMediaPath = ".concat(String.valueOf(str3)));
      j = (int)e.asZ(str1 + str3);
      Object localObject3;
      if ((((String)localObject2).toLowerCase().contains("jpg")) || (((String)localObject2).toLowerCase().contains("jpeg")))
      {
        localObject3 = com.tencent.mm.sdk.platformtools.d.bR(e.e((String)localObject2, 0, j));
        if (localObject3 != null)
          ab.i("MicroMsg.snsMediaStorage", "insert yuvInfo:%s", new Object[] { localObject3 });
      }
      try
      {
        localObject2 = new android/media/ExifInterface;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((ExifInterface)localObject2).<init>(str1 + str3);
        ((ExifInterface)localObject2).setAttribute("UserComment", (String)localObject3);
        ((ExifInterface)localObject2).saveAttributes();
        m = (int)e.asZ(str1 + str3);
        localObject4 = a(paramh, str1 + str3);
        k = ((com.tencent.mm.plugin.sns.data.h)localObject4).width;
        j = ((com.tencent.mm.plugin.sns.data.h)localObject4).height;
        ((com.tencent.mm.plugin.i.a)localObject1).nuB = k;
        ((com.tencent.mm.plugin.i.a)localObject1).nuC = j;
        ((com.tencent.mm.plugin.i.a)localObject1).nuD = m;
        localObject2 = new r();
        ((r)localObject2).rfE = str2;
        ((r)localObject2).createTime = ((int)bo.anT());
        ((r)localObject2).type = i;
        paramh = new bax();
        paramh.wEJ = ((com.tencent.mm.plugin.sns.data.h)localObject4).qFY;
        paramh.wFe = ((com.tencent.mm.plugin.sns.data.h)localObject4).qFX;
        paramh.token = ((com.tencent.mm.plugin.sns.data.h)localObject4).qFZ;
        paramh.wFn = ((com.tencent.mm.plugin.sns.data.h)localObject4).qGa;
        paramh.wFB = 0;
        paramh.wFA = new bar();
        paramh.eRu = 0;
        paramh.Desc = ((com.tencent.mm.plugin.sns.data.h)localObject4).desc;
        ab.d("MicroMsg.snsMediaStorage", "upload.filterId " + ((com.tencent.mm.plugin.sns.data.h)localObject4).filterId);
        paramh.wFd = ((com.tencent.mm.plugin.sns.data.h)localObject4).filterId;
        paramh.wFD = 2;
        paramh.cvZ = e.atg(str1 + str3);
      }
      catch (Exception localException1)
      {
        try
        {
          ((r)localObject2).rfI = paramh.toByteArray();
          ((r)localObject2).crp();
          ((r)localObject2).rfD = m;
          ab.i("MicroMsg.snsMediaStorage", "insert a local snsMedia  totallen  :" + m + " filepath: " + str1 + str3);
          j = (int)this.fni.insert("SnsMedia", "local_id", ((r)localObject2).cro());
          ab.d("MicroMsg.snsMediaStorage", "insert localId ".concat(String.valueOf(j)));
          str2 = "Locall_path".concat(String.valueOf(j));
          ((com.tencent.mm.plugin.i.a)localObject1).nux = String.valueOf(j);
          ((com.tencent.mm.plugin.i.a)localObject1).cvZ = paramh.cvZ;
          Object localObject4 = Exif.fromFile(((com.tencent.mm.plugin.i.a)localObject1).nuw);
          i = com.tencent.mm.plugin.i.a.tF(((com.tencent.mm.plugin.i.a)localObject1).nuw);
          if (((com.tencent.mm.plugin.i.a)localObject1).nuw.indexOf("png") >= 0)
          {
            i = 1;
            paramh = ((Exif)localObject4).dateTimeOriginal;
            localObject3 = ((com.tencent.mm.plugin.i.a)localObject1).nuw;
            if (bo.isNullOrNil(paramh))
              break label1974;
            paramh = com.tencent.mm.plugin.i.a.OK(paramh);
            localObject3 = new com.tencent.mm.modelsns.d();
            ((com.tencent.mm.modelsns.d)localObject3).l("20 localID", ((com.tencent.mm.plugin.i.a)localObject1).nux + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("21 MediaType", i + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("22 OriginWidth", ((com.tencent.mm.plugin.i.a)localObject1).nuy + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("23 OriginHeight", ((com.tencent.mm.plugin.i.a)localObject1).nuz + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("24 CompressedWidth", ((com.tencent.mm.plugin.i.a)localObject1).nuB + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("25 CompressedHeight", ((com.tencent.mm.plugin.i.a)localObject1).nuC + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("26 OriginSize", ((com.tencent.mm.plugin.i.a)localObject1).nuA + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("27 CompressedSize", ((com.tencent.mm.plugin.i.a)localObject1).nuD + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("28 FNumber", ((Exif)localObject4).fNumber + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("29 ExposureTime", ((Exif)localObject4).exposureTime + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("30 ISO", ((Exif)localObject4).isoSpeedRatings + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("31 Flash", ((Exif)localObject4).flash + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("32 LensModel", com.tencent.mm.plugin.i.a.OK(((Exif)localObject4).model) + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("33 CreatTime", paramh + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("34 IsFromWeChat", "0,");
            ((com.tencent.mm.modelsns.d)localObject3).l("35 Scene", ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("36 sceneType", ((Exif)localObject4).sceneType + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("37 fileSource", ((Exif)localObject4).fileSource + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("38 make", ((Exif)localObject4).make + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("39 software", ((Exif)localObject4).software + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("40 fileExt", com.tencent.mm.plugin.i.a.cv(((com.tencent.mm.plugin.i.a)localObject1).nuw) + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("41 faceCount", "0,");
            ((com.tencent.mm.modelsns.d)localObject3).l("42 YCbCrSubSampling", ((Exif)localObject4).yCbCrSubSampling + ",");
            ((com.tencent.mm.modelsns.d)localObject3).l("43 md5", ((com.tencent.mm.plugin.i.a)localObject1).cvZ + ',');
            ab.v("MicroMsg.ImgExtInfoReport", "report logbuffer MMImageExifInfo(14525): %s, orgPath:%s", new Object[] { ((com.tencent.mm.modelsns.d)localObject3).Fk(), ((com.tencent.mm.plugin.i.a)localObject1).nuw });
            com.tencent.mm.plugin.report.service.h.pYm.e(14525, new Object[] { localObject3 });
            paramh = ((com.tencent.mm.modelsns.d)localObject3).toString();
            com.tencent.mm.plugin.sns.i.d.coE().qSY.put(Integer.valueOf(j), paramh);
            localObject1 = i.Xe(str2);
            paramh = Zh(str2);
            e.tf(paramh);
            ab.i("MicroMsg.snsMediaStorage", "checkcntpath ".concat(String.valueOf(paramh)));
            e.y(str1 + str3, paramh + (String)localObject1);
            str1 = paramh + i.Xa(str2);
            str3 = paramh + i.Xb(str2);
            e.deleteFile(str1);
            e.deleteFile(str3);
            ab.i("MicroMsg.snsMediaStorage", "insert done " + (System.currentTimeMillis() - l) + " targetPath : " + paramh + (String)localObject1 + " totalLen:" + e.asZ(new StringBuilder().append(paramh).append((String)localObject1).toString()) + "  now delete...:" + str1 + " & " + str3);
            ((r)localObject2).rfE = str2;
            a(j, (r)localObject2);
            AppMethodBeat.o(37988);
            i = j;
            continue;
            localException1 = localException1;
            ab.printErrStackTrace("MicroMsg.snsMediaStorage", localException1, "", new Object[0]);
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            ab.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
            continue;
            if ((((com.tencent.mm.plugin.i.a)localObject1).nuw.indexOf("jpg") >= 0) || (((com.tencent.mm.plugin.i.a)localObject1).nuw.indexOf("jpeg") >= 0))
            {
              i = 2;
            }
            else if (((com.tencent.mm.plugin.i.a)localObject1).nuw.indexOf("mp3") >= 0)
            {
              i = 3;
              continue;
              label1974: paramh = com.tencent.mm.plugin.i.a.OK(new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date(new File((String)localObject3).lastModified())));
            }
          }
        }
      }
    }
  }

  // ERROR //
  private static com.tencent.mm.plugin.sns.data.h a(com.tencent.mm.plugin.sns.data.h paramh, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: iconst_0
    //   5: istore 4
    //   7: ldc_w 650
    //   10: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   13: aload_3
    //   14: astore 5
    //   16: aload_2
    //   17: astore 6
    //   19: new 108	android/graphics/BitmapFactory$Options
    //   22: astore 7
    //   24: aload_3
    //   25: astore 5
    //   27: aload_2
    //   28: astore 6
    //   30: aload 7
    //   32: invokespecial 109	android/graphics/BitmapFactory$Options:<init>	()V
    //   35: aload_3
    //   36: astore 5
    //   38: aload_2
    //   39: astore 6
    //   41: aload 7
    //   43: iconst_1
    //   44: putfield 113	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   47: aload_3
    //   48: astore 5
    //   50: aload_2
    //   51: astore 6
    //   53: aload_1
    //   54: invokestatic 106	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   57: astore_2
    //   58: aload_2
    //   59: astore_3
    //   60: aload_2
    //   61: astore 5
    //   63: aload_2
    //   64: astore 6
    //   66: aload_2
    //   67: invokevirtual 654	java/io/InputStream:markSupported	()Z
    //   70: ifne +24 -> 94
    //   73: aload_2
    //   74: astore 5
    //   76: aload_2
    //   77: astore 6
    //   79: new 656	java/io/BufferedInputStream
    //   82: astore_3
    //   83: aload_2
    //   84: astore 5
    //   86: aload_2
    //   87: astore 6
    //   89: aload_3
    //   90: aload_2
    //   91: invokespecial 659	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   94: aload_3
    //   95: astore 5
    //   97: aload_3
    //   98: astore 6
    //   100: aload_3
    //   101: ldc_w 660
    //   104: invokevirtual 663	java/io/InputStream:mark	(I)V
    //   107: aload_3
    //   108: astore 5
    //   110: aload_3
    //   111: astore 6
    //   113: aload_3
    //   114: aconst_null
    //   115: aload 7
    //   117: invokestatic 666	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   120: pop
    //   121: aload_3
    //   122: astore 5
    //   124: aload_3
    //   125: astore 6
    //   127: aload_3
    //   128: invokevirtual 669	java/io/InputStream:reset	()V
    //   131: aload_3
    //   132: astore 5
    //   134: aload_3
    //   135: astore 6
    //   137: new 174	com/tencent/mm/compatible/util/Exif
    //   140: astore_2
    //   141: aload_3
    //   142: astore 5
    //   144: aload_3
    //   145: astore 6
    //   147: aload_2
    //   148: invokespecial 670	com/tencent/mm/compatible/util/Exif:<init>	()V
    //   151: aload_3
    //   152: astore 5
    //   154: aload_3
    //   155: astore 6
    //   157: aload_2
    //   158: aload_3
    //   159: invokevirtual 674	com/tencent/mm/compatible/util/Exif:parseFromStream	(Ljava/io/InputStream;)I
    //   162: pop
    //   163: aload_3
    //   164: astore 5
    //   166: aload_3
    //   167: astore 6
    //   169: aload_2
    //   170: invokevirtual 181	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   173: istore 8
    //   175: iload 8
    //   177: bipush 90
    //   179: if_icmpeq +11 -> 190
    //   182: iload 8
    //   184: sipush 270
    //   187: if_icmpne +87 -> 274
    //   190: aload_3
    //   191: astore 5
    //   193: aload_3
    //   194: astore 6
    //   196: aload 7
    //   198: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   201: istore 9
    //   203: aload_3
    //   204: astore 6
    //   206: iload 9
    //   208: istore 8
    //   210: aload 7
    //   212: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   215: istore 10
    //   217: iload 10
    //   219: istore 8
    //   221: iload 9
    //   223: istore 10
    //   225: iload 8
    //   227: istore 11
    //   229: aload_3
    //   230: ifnull +15 -> 245
    //   233: aload_3
    //   234: invokevirtual 154	java/io/InputStream:close	()V
    //   237: iload 8
    //   239: istore 11
    //   241: iload 9
    //   243: istore 10
    //   245: aload_0
    //   246: iload 11
    //   248: putfield 243	com/tencent/mm/plugin/sns/data/h:width	I
    //   251: aload_0
    //   252: iload 10
    //   254: putfield 246	com/tencent/mm/plugin/sns/data/h:height	I
    //   257: aload_0
    //   258: aload_1
    //   259: invokestatic 276	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   262: l2i
    //   263: putfield 249	com/tencent/mm/plugin/sns/data/h:fileSize	I
    //   266: ldc_w 650
    //   269: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   272: aload_0
    //   273: areturn
    //   274: aload_3
    //   275: astore 5
    //   277: aload_3
    //   278: astore 6
    //   280: aload 7
    //   282: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   285: istore 9
    //   287: aload_3
    //   288: astore 6
    //   290: iload 9
    //   292: istore 8
    //   294: aload 7
    //   296: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   299: istore 10
    //   301: iload 10
    //   303: istore 8
    //   305: goto -84 -> 221
    //   308: astore 6
    //   310: iconst_0
    //   311: istore 8
    //   313: aload 5
    //   315: astore_3
    //   316: aload 6
    //   318: astore 5
    //   320: aload_3
    //   321: astore 6
    //   323: ldc 125
    //   325: aload 5
    //   327: ldc_w 676
    //   330: aload_1
    //   331: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   334: invokevirtual 134	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   337: iconst_0
    //   338: anewarray 195	java/lang/Object
    //   341: invokestatic 623	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: iload 8
    //   346: istore 10
    //   348: iload 4
    //   350: istore 11
    //   352: aload_3
    //   353: ifnull -108 -> 245
    //   356: aload_3
    //   357: invokevirtual 154	java/io/InputStream:close	()V
    //   360: iload 8
    //   362: istore 10
    //   364: iload 4
    //   366: istore 11
    //   368: goto -123 -> 245
    //   371: astore_3
    //   372: iload 8
    //   374: istore 10
    //   376: iload 4
    //   378: istore 11
    //   380: goto -135 -> 245
    //   383: astore_0
    //   384: aload 6
    //   386: ifnull +8 -> 394
    //   389: aload 6
    //   391: invokevirtual 154	java/io/InputStream:close	()V
    //   394: ldc_w 650
    //   397: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   400: aload_0
    //   401: athrow
    //   402: astore_3
    //   403: iload 9
    //   405: istore 10
    //   407: iload 8
    //   409: istore 11
    //   411: goto -166 -> 245
    //   414: astore_1
    //   415: goto -21 -> 394
    //   418: astore 5
    //   420: goto -100 -> 320
    //
    // Exception table:
    //   from	to	target	type
    //   19	24	308	java/lang/Exception
    //   30	35	308	java/lang/Exception
    //   41	47	308	java/lang/Exception
    //   53	58	308	java/lang/Exception
    //   66	73	308	java/lang/Exception
    //   79	83	308	java/lang/Exception
    //   89	94	308	java/lang/Exception
    //   100	107	308	java/lang/Exception
    //   113	121	308	java/lang/Exception
    //   127	131	308	java/lang/Exception
    //   137	141	308	java/lang/Exception
    //   147	151	308	java/lang/Exception
    //   157	163	308	java/lang/Exception
    //   169	175	308	java/lang/Exception
    //   196	203	308	java/lang/Exception
    //   280	287	308	java/lang/Exception
    //   356	360	371	java/io/IOException
    //   19	24	383	finally
    //   30	35	383	finally
    //   41	47	383	finally
    //   53	58	383	finally
    //   66	73	383	finally
    //   79	83	383	finally
    //   89	94	383	finally
    //   100	107	383	finally
    //   113	121	383	finally
    //   127	131	383	finally
    //   137	141	383	finally
    //   147	151	383	finally
    //   157	163	383	finally
    //   169	175	383	finally
    //   196	203	383	finally
    //   210	217	383	finally
    //   280	287	383	finally
    //   294	301	383	finally
    //   323	344	383	finally
    //   233	237	402	java/io/IOException
    //   389	394	414	java/io/IOException
    //   210	217	418	java/lang/Exception
    //   294	301	418	java/lang/Exception
  }

  private boolean a(r paramr)
  {
    boolean bool = false;
    AppMethodBeat.i(37980);
    ab.d("MicroMsg.snsMediaStorage", "snsMedia Insert");
    if (paramr == null)
      AppMethodBeat.o(37980);
    while (true)
    {
      return bool;
      paramr = paramr.cro();
      if ((int)this.fni.insert("SnsMedia", "local_id", paramr) != -1)
      {
        bool = true;
        AppMethodBeat.o(37980);
      }
      else
      {
        AppMethodBeat.o(37980);
      }
    }
  }

  private static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Bitmap.CompressFormat paramCompressFormat, int paramInt5, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(37998);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    while (true)
    {
      Object localObject3;
      double d1;
      double d2;
      double d3;
      try
      {
        ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, srcWidth: %s, srcHeight: %s, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt3) });
        localObject2 = localObject1;
        localObject3 = new android/graphics/BitmapFactory$Options;
        localObject2 = localObject1;
        ((BitmapFactory.Options)localObject3).<init>();
        d1 = paramInt2 * 1.0D / paramInt3;
        d2 = paramInt1 * 1.0D / paramInt4;
        if ((paramInt1 == paramInt4) && (paramInt2 == paramInt3))
        {
          localObject2 = localObject1;
          localObject3 = com.tencent.mm.plugin.sns.d.a.b(paramString1, (BitmapFactory.Options)localObject3);
          localObject2 = localObject1;
          ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, result bm: %s", new Object[] { localObject3 });
          if (localObject3 == null)
          {
            paramBoolean = false;
            AppMethodBeat.o(37998);
            return paramBoolean;
          }
        }
        else
        {
          localObject2 = localObject1;
          ((BitmapFactory.Options)localObject3).inSampleSize = 1;
          if ((paramInt2 > paramInt3) || (paramInt1 > paramInt4))
          {
            if (d1 >= d2)
              break label305;
            d3 = d2;
            localObject2 = localObject1;
            ((BitmapFactory.Options)localObject3).inSampleSize = ((int)d3);
            localObject2 = localObject1;
            if (((BitmapFactory.Options)localObject3).inSampleSize <= 1)
            {
              localObject2 = localObject1;
              ((BitmapFactory.Options)localObject3).inSampleSize = 1;
            }
          }
          localObject2 = localObject1;
          if (paramInt2 * paramInt1 / ((BitmapFactory.Options)localObject3).inSampleSize / ((BitmapFactory.Options)localObject3).inSampleSize > 2764800)
          {
            localObject2 = localObject1;
            ((BitmapFactory.Options)localObject3).inSampleSize += 1;
            continue;
          }
        }
      }
      catch (IOException paramString1)
      {
        ab.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "create thumbnail from orig failed: %s", new Object[] { paramString3 });
        if (localObject2 == null);
      }
      try
      {
        ((OutputStream)localObject2).close();
        paramBoolean = false;
        AppMethodBeat.o(37998);
        continue;
        label305: d3 = d1;
        continue;
        localObject2 = localObject1;
        ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, sampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject3).inSampleSize) });
        localObject2 = localObject1;
        localObject3 = com.tencent.mm.plugin.sns.d.a.b(paramString1, (BitmapFactory.Options)localObject3);
        continue;
        localObject2 = localObject1;
        ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject3).getWidth()), Integer.valueOf(((Bitmap)localObject3).getHeight()) });
        Object localObject4 = localObject3;
        if (paramBoolean)
        {
          if (d1 >= d2)
            break label622;
          localObject2 = localObject1;
          paramInt1 = (int)Math.ceil(paramInt4 * 1.0D * paramInt2 / paramInt1);
          paramInt2 = paramInt4;
        }
        while (true)
        {
          localObject2 = localObject1;
          paramInt3 = BackwardSupportUtil.ExifHelper.bJ(paramString1);
          if ((paramInt3 != 90) && (paramInt3 != 270))
            break label658;
          paramInt3 = paramInt1;
          localObject2 = localObject1;
          localObject4 = Bitmap.createScaledBitmap((Bitmap)localObject3, paramInt3, paramInt2, true);
          paramString1 = (String)localObject3;
          if (localObject4 != null)
          {
            if (localObject3 != localObject4)
            {
              localObject2 = localObject1;
              l.Xf().v((Bitmap)localObject3);
            }
            paramString1 = (String)localObject4;
          }
          localObject2 = localObject1;
          ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScalebyUpload, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()) });
          localObject4 = paramString1;
          localObject2 = localObject1;
          paramString1 = new java/lang/StringBuilder;
          localObject2 = localObject1;
          paramString1.<init>();
          localObject2 = localObject1;
          paramString1 = e.L(paramString2 + paramString3, false);
          localObject2 = paramString1;
          com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject4, paramInt5, paramCompressFormat, paramString1, false);
          localObject2 = paramString1;
          l.Xf().v((Bitmap)localObject4);
          localObject2 = paramString1;
          paramString1.close();
          paramBoolean = true;
          AppMethodBeat.o(37998);
          break;
          label622: d3 = paramInt3 * 1.0D * paramInt1 / paramInt2;
          localObject2 = localObject1;
          d3 = Math.ceil(d3);
          paramInt2 = (int)d3;
          paramInt1 = paramInt3;
        }
      }
      catch (IOException paramString1)
      {
        while (true)
        {
          continue;
          label658: paramInt3 = paramInt2;
          paramInt2 = paramInt1;
        }
      }
    }
  }

  private static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, Bitmap.CompressFormat paramCompressFormat, int paramInt4, String paramString2, String paramString3)
  {
    AppMethodBeat.i(37995);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    while (true)
    {
      Object localObject3;
      int i;
      boolean bool;
      try
      {
        ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, srcWidth: %d, srcHeight: %d, fixShort: %d, quality:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
        localObject2 = localObject1;
        localObject3 = new android/graphics/BitmapFactory$Options;
        localObject2 = localObject1;
        ((BitmapFactory.Options)localObject3).<init>();
        if (paramInt2 > paramInt1)
        {
          i = paramInt1;
          if (i == paramInt3)
          {
            localObject2 = localObject1;
            localObject3 = com.tencent.mm.plugin.sns.d.a.b(paramString1, (BitmapFactory.Options)localObject3);
            localObject2 = localObject1;
            ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, result bm: %s", new Object[] { localObject3 });
            if (localObject3 != null)
              break label321;
            bool = false;
            AppMethodBeat.o(37995);
            return bool;
          }
        }
        else
        {
          i = paramInt2;
          continue;
        }
        localObject2 = localObject1;
        ((BitmapFactory.Options)localObject3).inSampleSize = 1;
        if (i > paramInt3)
        {
          localObject2 = localObject1;
          ((BitmapFactory.Options)localObject3).inSampleSize = (i / paramInt3);
          localObject2 = localObject1;
          if (((BitmapFactory.Options)localObject3).inSampleSize <= 1)
          {
            localObject2 = localObject1;
            ((BitmapFactory.Options)localObject3).inSampleSize = 1;
          }
        }
        localObject2 = localObject1;
        if (paramInt2 * paramInt1 / ((BitmapFactory.Options)localObject3).inSampleSize / ((BitmapFactory.Options)localObject3).inSampleSize > 5529600)
        {
          localObject2 = localObject1;
          ((BitmapFactory.Options)localObject3).inSampleSize += 1;
          continue;
        }
      }
      catch (IOException paramString1)
      {
        ab.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "create thumbnail from orig failed: %s", new Object[] { paramString3 });
        if (localObject2 == null);
      }
      try
      {
        ((OutputStream)localObject2).close();
        bool = false;
        AppMethodBeat.o(37995);
        continue;
        localObject2 = localObject1;
        ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, sampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject3).inSampleSize) });
        localObject2 = localObject1;
        localObject3 = com.tencent.mm.plugin.sns.d.a.b(paramString1, (BitmapFactory.Options)localObject3);
        continue;
        label321: localObject2 = localObject1;
        j = paramInt1 * paramInt3 / i;
        localObject2 = localObject1;
        paramInt3 = paramInt2 * paramInt3 / i;
        localObject2 = localObject1;
        int k = BackwardSupportUtil.ExifHelper.bJ(paramString1);
        if ((k == 90) || (k == 270))
        {
          localObject2 = localObject1;
          ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScale, bm.width: %s, bm.height: %s, new:[%d,%d], src:[%d, %d], shortEdge:%d,degree:%d", new Object[] { Integer.valueOf(((Bitmap)localObject3).getWidth()), Integer.valueOf(((Bitmap)localObject3).getHeight()), Integer.valueOf(paramInt3), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(k) });
          localObject2 = localObject1;
          Bitmap localBitmap = Bitmap.createScaledBitmap((Bitmap)localObject3, paramInt3, j, true);
          if (localBitmap != null)
          {
            paramString1 = localBitmap;
            if (localObject3 != localBitmap)
            {
              localObject2 = localObject1;
              l.Xf().v((Bitmap)localObject3);
              paramString1 = localBitmap;
            }
            localObject2 = localObject1;
            ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScaleFixShort, bm.width: %s, bm.height: %s, quality:%d", new Object[] { Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()), Integer.valueOf(paramInt4) });
            localObject2 = localObject1;
            localObject3 = new java/lang/StringBuilder;
            localObject2 = localObject1;
            ((StringBuilder)localObject3).<init>();
            localObject2 = localObject1;
            localObject3 = e.L(paramString2 + paramString3, false);
            localObject2 = localObject3;
            com.tencent.mm.sdk.platformtools.d.a(paramString1, paramInt4, paramCompressFormat, (OutputStream)localObject3, false);
            localObject2 = localObject3;
            l.Xf().v(paramString1);
            localObject2 = localObject3;
            ((OutputStream)localObject3).close();
            paramString1 = null;
            localObject2 = paramString1;
            paramCompressFormat = new java/lang/StringBuilder;
            localObject2 = paramString1;
            paramCompressFormat.<init>();
            localObject2 = paramString1;
            localObject3 = paramString2 + paramString3;
            localObject2 = paramString1;
            paramCompressFormat = new java/lang/StringBuilder;
            localObject2 = paramString1;
            paramCompressFormat.<init>();
            localObject2 = paramString1;
            ab.i("MicroMsg.snsMediaStorage", "createThumbNailUnScaleFixShort saving to %s, size:%d", new Object[] { localObject3, Long.valueOf(e.asZ(paramString2 + paramString3)) });
            bool = true;
            AppMethodBeat.o(37995);
          }
        }
      }
      catch (IOException paramString1)
      {
        while (true)
        {
          continue;
          paramString1 = (String)localObject3;
          continue;
          int m = paramInt3;
          paramInt3 = j;
          int j = m;
        }
      }
    }
  }

  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(37994);
    BitmapFactory.Options localOptions = com.tencent.mm.sdk.platformtools.d.amj(paramString1);
    if ((localOptions == null) || (localOptions.outWidth <= 0) || (localOptions.outHeight <= 0))
    {
      paramBoolean = false;
      AppMethodBeat.o(37994);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = a(paramString1, localOptions.outWidth, localOptions.outHeight, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, paramString3, paramBoolean);
      AppMethodBeat.o(37994);
    }
  }

  public static boolean a(String paramString1, String paramString2, String paramString3, float paramFloat)
  {
    AppMethodBeat.i(37997);
    double d1 = 0.0D;
    int i = 1;
    int j = 1;
    try
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = e.openRead(paramString1 + paramString2);
    }
    catch (Exception localException3)
    {
      try
      {
        localObject3 = new android/graphics/BitmapFactory$Options;
        ((BitmapFactory.Options)localObject3).<init>();
        ((BitmapFactory.Options)localObject3).inJustDecodeBounds = true;
        MMBitmapFactory.decodeStream((InputStream)localObject1, null, (BitmapFactory.Options)localObject3);
        ((InputStream)localObject1).close();
        localObject1 = null;
      }
      catch (Exception localException3)
      {
        try
        {
          d2 = ((BitmapFactory.Options)localObject3).outWidth;
          k = ((BitmapFactory.Options)localObject3).outHeight;
          d1 = k;
          if ((d2 > 120.0D) || (d1 > 120.0D))
            j = 0;
        }
        catch (Exception localException3)
        {
          try
          {
            Object localObject1;
            int k;
            Object localObject3 = ((BitmapFactory.Options)localObject3).outMimeType;
            if ((d2 < 0.0D) || (d1 < 0.0D))
            {
              d3 = 240.0D;
              d4 = 240.0D;
              double d5 = paramFloat;
              double d6 = paramFloat / 200.0F * 44.0F;
              d7 = paramFloat / 200.0F * 160.0F;
              if ((d4 > 0.0D) && (d3 > 0.0D))
              {
                double d8 = Math.min(d5 / d4, d5 / d3);
                d7 = d4 * d8;
                d8 *= d3;
                d3 = d8;
                d4 = d7;
                if (d7 < d6)
                {
                  d3 = 1.0D * d6 / d7;
                  d4 = d7 * d3;
                  d3 = d8 * d3;
                }
                d7 = d3;
                d8 = d4;
                if (d3 < d6)
                {
                  d7 = 1.0D * d6 / d3;
                  d8 = d4 * d7;
                  d7 = d3 * d7;
                }
                d4 = d8;
                if (d8 > d5)
                  d4 = d5;
                if (d7 > d5)
                  d3 = d5;
              }
              else
              {
                while (true)
                {
                  localObject1 = paramString1 + paramString2;
                  k = (int)d2;
                  i = (int)d1;
                  int m = (int)d3;
                  int n = (int)d4;
                  if (j == 0)
                    break;
                  paramString2 = Bitmap.CompressFormat.PNG;
                  label374: boolean bool = a((String)localObject1, k, i, m, n, paramString2, 70, paramString1, paramString3, false);
                  AppMethodBeat.o(37997);
                  return bool;
                  d3 = d7;
                  d4 = d7;
                }
                localException1 = localException1;
                Object localObject2 = null;
                d2 = 0.0D;
                j = i;
                while (true)
                {
                  while (true)
                    if (localObject2 != null)
                      try
                      {
                        localObject2.close();
                        d3 = 240.0D;
                        d4 = 240.0D;
                      }
                      catch (IOException localIOException)
                      {
                      }
                  d3 = 240.0D;
                  d4 = 240.0D;
                  break;
                  paramString2 = Bitmap.CompressFormat.JPEG;
                  break label374;
                  localException2 = localException2;
                  d2 = 0.0D;
                  j = i;
                  continue;
                  localException3 = localException3;
                  d2 = 0.0D;
                  j = i;
                }
              }
            }
          }
          catch (Exception localException4)
          {
            while (true)
            {
              double d2;
              double d7;
              continue;
              double d3 = d7;
              continue;
              d3 = d1;
              double d4 = d2;
            }
          }
        }
      }
    }
  }

  public static boolean aj(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(138384);
    boolean bool = e(paramString1, paramString2, paramString3, true);
    AppMethodBeat.o(138384);
    return bool;
  }

  private boolean b(String paramString, r paramr)
  {
    boolean bool = true;
    AppMethodBeat.i(37982);
    paramr = paramr.cro();
    if (this.fni.update("SnsMedia", paramr, "StrId=?", new String[] { String.valueOf(paramString) }) > 0)
      AppMethodBeat.o(37982);
    while (true)
    {
      return bool;
      AppMethodBeat.o(37982);
      bool = false;
    }
  }

  public static boolean b(String paramString1, String paramString2, String paramString3, float paramFloat)
  {
    AppMethodBeat.i(37999);
    Object localObject1;
    Object localObject2;
    while (true)
    {
      int i;
      int j;
      int k;
      int m;
      try
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        e.deleteFile(paramString1 + paramString3);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = com.tencent.mm.sdk.platformtools.d.amj(paramString1 + paramString2);
        if (localObject1 == null)
        {
          ab.e("MicroMsg.snsMediaStorage", "createUserAlbum, getImageOptions error");
          bool = false;
          AppMethodBeat.o(37999);
          return bool;
        }
        if ((((BitmapFactory.Options)localObject1).outMimeType != null) && ((((BitmapFactory.Options)localObject1).outMimeType.toLowerCase().endsWith("png")) || (((BitmapFactory.Options)localObject1).outMimeType.toLowerCase().endsWith("vcodec"))))
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = com.tencent.mm.sdk.platformtools.d.d(paramString1 + paramString2, (int)paramFloat, (int)paramFloat, true);
          if (localObject1 != null)
            break;
          paramString3 = new java/lang/StringBuilder;
          paramString3.<init>("bitmap error ");
          ab.i("MicroMsg.snsMediaStorage", paramString1 + paramString2);
          paramString3 = new java/lang/StringBuilder;
          paramString3.<init>();
          e.deleteFile(paramString1 + paramString2);
          bool = false;
          AppMethodBeat.o(37999);
          continue;
        }
        i = ((BitmapFactory.Options)localObject1).outWidth;
        j = ((BitmapFactory.Options)localObject1).outHeight;
        k = (int)paramFloat;
        m = (int)paramFloat;
        ((BitmapFactory.Options)localObject1).inJustDecodeBounds = false;
        ab.i("MicroMsg.snsMediaStorage", "createUserAlbum, srcWidth: %s, srcHeight: %s, dstWidth: %s, dstHeight: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
        if ((i == k) && (j == m))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject1 = com.tencent.mm.plugin.sns.d.a.b(paramString1 + paramString2, (BitmapFactory.Options)localObject1);
          continue;
        }
        if (j * 1.0D / m <= i * 1.0D / k)
          break label601;
        n = (int)Math.ceil(k * 1.0D * j / i);
        i1 = k;
        ab.d("MicroMsg.snsMediaStorage", "createUserAlbum, newWidth: %s, newHeight: %s", new Object[] { Integer.valueOf(i1), Integer.valueOf(n) });
        ((BitmapFactory.Options)localObject1).inSampleSize = 1;
        if ((j <= n) && (i <= i1))
          break label634;
        ((BitmapFactory.Options)localObject1).inSampleSize = 1;
        if ((j > n) || (i > i1))
        {
          d1 = j * 1.0D / n;
          double d2 = i * 1.0D / i1;
          if (d1 >= d2)
            break label631;
          d1 = d2;
          ((BitmapFactory.Options)localObject1).inSampleSize = ((int)d1);
          if (((BitmapFactory.Options)localObject1).inSampleSize <= 1)
            ((BitmapFactory.Options)localObject1).inSampleSize = 1;
        }
        if (j * i / ((BitmapFactory.Options)localObject1).inSampleSize / ((BitmapFactory.Options)localObject1).inSampleSize <= 2764800)
          break label634;
        ((BitmapFactory.Options)localObject1).inSampleSize += 1;
        continue;
      }
      catch (Exception paramString1)
      {
        ab.e("MicroMsg.snsMediaStorage", "createUserAlbum error: %s", new Object[] { paramString1.getMessage() });
        ab.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "", new Object[0]);
      }
      boolean bool = true;
      AppMethodBeat.o(37999);
      continue;
      label601: double d1 = m * 1.0D * i / j;
      i1 = (int)Math.ceil(d1);
      int n = m;
      continue;
      label631: continue;
      label634: ab.i("MicroMsg.snsMediaStorage", "createUserAlbum, inSampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject1).inSampleSize) });
      if (j / i == m / k)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = com.tencent.mm.plugin.sns.d.a.b(paramString1 + paramString2, (BitmapFactory.Options)localObject1);
        ab.i("MicroMsg.snsMediaStorage", "createUserAlbum, directly use inSampleSize");
      }
      else
      {
        paramFloat = Math.max(i1 / i, n / j);
        i1 = (int)(k / paramFloat);
        n = (int)(m / paramFloat);
        i1 = Math.min(i, i1);
        n = Math.min(j, n);
        m = Math.max(0, i - i1 >> 1);
        k = Math.max(0, j - n >> 1);
        localObject2 = new android/graphics/Rect;
        ((Rect)localObject2).<init>();
        ((Rect)localObject2).left = m;
        ((Rect)localObject2).right = (m + i1);
        ((Rect)localObject2).top = k;
        ((Rect)localObject2).bottom = (k + n);
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = paramString1 + paramString2;
        long l = System.currentTimeMillis();
        localObject2 = l.Xf().a((String)localObject3, (Rect)localObject2, (BitmapFactory.Options)localObject1);
        localObject1 = localObject2;
        if (localObject2 != null)
          localObject1 = i.s((String)localObject3, (Bitmap)localObject2);
        ab.d("MicroMsg.SnsBitmapUtil", "regionDecodeWithRotateByExif used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        ab.i("MicroMsg.snsMediaStorage", "createUserAlbum, dstWidth: %s, dstHeight: %s, startX: %s, startY: %s, scaleFactor: %s", new Object[] { Integer.valueOf(i1), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(k), Float.valueOf(paramFloat) });
      }
    }
    ab.i("MicroMsg.snsMediaStorage", "createUserAlbum, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject1).getWidth()), Integer.valueOf(((Bitmap)localObject1).getHeight()) });
    int i1 = 1;
    if ((((Bitmap)localObject1).getHeight() > 120) || (((Bitmap)localObject1).getWidth() > 120))
      i1 = 0;
    if (i1 != 0);
    for (paramString2 = Bitmap.CompressFormat.PNG; ; paramString2 = Bitmap.CompressFormat.JPEG)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject1, 100, paramString2, paramString1 + paramString3, false);
      l.Xf().v((Bitmap)localObject1);
      break;
    }
  }

  public static boolean crr()
  {
    AppMethodBeat.i(37990);
    boolean bool;
    if ("hevc".equals(ae.gjm))
    {
      bool = true;
      AppMethodBeat.o(37990);
    }
    while (true)
    {
      return bool;
      bool = af.cnP();
      AppMethodBeat.o(37990);
    }
  }

  public static boolean crs()
  {
    AppMethodBeat.i(37991);
    boolean bool;
    if ("wxpc".equals(ae.gjm))
    {
      bool = true;
      AppMethodBeat.o(37991);
    }
    while (true)
    {
      return bool;
      bool = af.cnQ();
      AppMethodBeat.o(37991);
    }
  }

  public static boolean crt()
  {
    if ((qDc >= 1080) && (qDU >= 1080));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  // ERROR //
  public static boolean e(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 897
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 163	com/tencent/mm/sdk/platformtools/d:amj	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   10: astore 4
    //   12: aload 4
    //   14: ifnull +957 -> 971
    //   17: aload 4
    //   19: getfield 123	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   22: astore 5
    //   24: ldc 125
    //   26: ldc_w 899
    //   29: aload 5
    //   31: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   34: invokevirtual 134	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   37: invokestatic 140	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: aload 5
    //   42: ifnull +929 -> 971
    //   45: aload 5
    //   47: invokevirtual 143	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   50: astore 5
    //   52: aload 5
    //   54: ldc_w 278
    //   57: invokevirtual 149	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   60: iflt +877 -> 937
    //   63: iconst_1
    //   64: istore 6
    //   66: aload 4
    //   68: ifnull +926 -> 994
    //   71: aload 4
    //   73: getfield 123	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   76: astore 5
    //   78: aload 5
    //   80: ifnull +914 -> 994
    //   83: aload 5
    //   85: invokevirtual 143	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   88: astore 5
    //   90: aload 5
    //   92: ldc_w 278
    //   95: invokevirtual 149	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   98: iflt +879 -> 977
    //   101: iconst_1
    //   102: istore 7
    //   104: iconst_m1
    //   105: istore 8
    //   107: bipush 100
    //   109: istore 9
    //   111: iload 8
    //   113: istore 10
    //   115: iload_3
    //   116: ifeq +236 -> 352
    //   119: invokestatic 905	com/tencent/mm/al/f:afx	()Lcom/tencent/mm/al/b;
    //   122: pop
    //   123: bipush 64
    //   125: invokestatic 911	com/tencent/mm/al/b:lg	(I)Z
    //   128: ifne +15 -> 143
    //   131: invokestatic 913	com/tencent/mm/plugin/sns/storage/s:crr	()Z
    //   134: ifne +9 -> 143
    //   137: invokestatic 915	com/tencent/mm/plugin/sns/storage/s:crs	()Z
    //   140: ifeq +935 -> 1075
    //   143: invokestatic 921	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   146: invokestatic 927	com/tencent/mm/sdk/platformtools/at:isWifi	(Landroid/content/Context;)Z
    //   149: ifeq +851 -> 1000
    //   152: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   155: ldc_w 935
    //   158: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   161: bipush 70
    //   163: invokestatic 944	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   166: istore 11
    //   168: ldc 125
    //   170: ldc_w 946
    //   173: bipush 7
    //   175: anewarray 195	java/lang/Object
    //   178: dup
    //   179: iconst_0
    //   180: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   183: ldc_w 935
    //   186: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   189: aastore
    //   190: dup
    //   191: iconst_1
    //   192: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   195: ldc_w 948
    //   198: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   201: aastore
    //   202: dup
    //   203: iconst_2
    //   204: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   207: ldc_w 950
    //   210: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   213: aastore
    //   214: dup
    //   215: iconst_3
    //   216: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   219: ldc_w 952
    //   222: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   225: aastore
    //   226: dup
    //   227: iconst_4
    //   228: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   231: ldc_w 954
    //   234: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   237: aastore
    //   238: dup
    //   239: iconst_5
    //   240: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   243: ldc_w 956
    //   246: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   249: aastore
    //   250: dup
    //   251: bipush 6
    //   253: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   256: ldc_w 958
    //   259: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   262: aastore
    //   263: invokestatic 814	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: ldc 125
    //   268: ldc_w 960
    //   271: iconst_2
    //   272: anewarray 195	java/lang/Object
    //   275: dup
    //   276: iconst_0
    //   277: iload 11
    //   279: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   282: aastore
    //   283: dup
    //   284: iconst_1
    //   285: iload_3
    //   286: invokestatic 965	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   289: aastore
    //   290: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: iload 11
    //   295: bipush 10
    //   297: if_icmple +10 -> 307
    //   300: iload 11
    //   302: bipush 100
    //   304: if_icmple +2960 -> 3264
    //   307: bipush 60
    //   309: istore 11
    //   311: iload 8
    //   313: istore 10
    //   315: iload 11
    //   317: istore 9
    //   319: iload 7
    //   321: ifeq +31 -> 352
    //   324: aload_1
    //   325: invokestatic 970	com/tencent/mm/sdk/platformtools/MMNativeJpeg:queryQuality	(Ljava/lang/String;)I
    //   328: istore 8
    //   330: iload 8
    //   332: iload 11
    //   334: if_icmpge +2919 -> 3253
    //   337: iload 8
    //   339: bipush 25
    //   341: if_icmple +2912 -> 3253
    //   344: iload 8
    //   346: istore 9
    //   348: iload 8
    //   350: istore 10
    //   352: aload_1
    //   353: invokestatic 276	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   356: l2i
    //   357: istore 12
    //   359: sipush 1080
    //   362: istore 8
    //   364: aload_1
    //   365: invokestatic 975	com/tencent/mm/plugin/facedetect/FaceProNative:detectFaceCnt	(Ljava/lang/String;)I
    //   368: istore 11
    //   370: ldc 125
    //   372: ldc_w 977
    //   375: iconst_1
    //   376: anewarray 195	java/lang/Object
    //   379: dup
    //   380: iconst_0
    //   381: iload 11
    //   383: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   386: aastore
    //   387: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   390: iload 11
    //   392: iconst_5
    //   393: if_icmplt +8 -> 401
    //   396: sipush 1440
    //   399: istore 8
    //   401: iconst_0
    //   402: istore 13
    //   404: iload 11
    //   406: iconst_5
    //   407: if_icmplt +746 -> 1153
    //   410: iload 13
    //   412: istore 11
    //   414: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   417: ldc_w 979
    //   420: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   423: astore 5
    //   425: iload 13
    //   427: istore 11
    //   429: aload 5
    //   431: ldc_w 981
    //   434: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   437: iconst_0
    //   438: aaload
    //   439: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   442: invokevirtual 991	java/lang/Integer:intValue	()I
    //   445: istore 13
    //   447: iload 13
    //   449: istore 11
    //   451: aload 5
    //   453: ldc_w 981
    //   456: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   459: iconst_1
    //   460: aaload
    //   461: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   464: invokevirtual 991	java/lang/Integer:intValue	()I
    //   467: istore 14
    //   469: iload 14
    //   471: istore 8
    //   473: iload 13
    //   475: istore 11
    //   477: ldc 125
    //   479: ldc_w 993
    //   482: bipush 6
    //   484: anewarray 195	java/lang/Object
    //   487: dup
    //   488: iconst_0
    //   489: iload 11
    //   491: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   494: aastore
    //   495: dup
    //   496: iconst_1
    //   497: iload 8
    //   499: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   502: aastore
    //   503: dup
    //   504: iconst_2
    //   505: getstatic 34	com/tencent/mm/plugin/sns/storage/s:qDc	I
    //   508: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   511: aastore
    //   512: dup
    //   513: iconst_3
    //   514: getstatic 32	com/tencent/mm/plugin/sns/storage/s:qDU	I
    //   517: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   520: aastore
    //   521: dup
    //   522: iconst_4
    //   523: iload 9
    //   525: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   528: aastore
    //   529: dup
    //   530: iconst_5
    //   531: iload_3
    //   532: invokestatic 965	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   535: aastore
    //   536: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   539: iload 11
    //   541: ifgt +931 -> 1472
    //   544: iload 8
    //   546: ifgt +926 -> 1472
    //   549: iconst_0
    //   550: istore 11
    //   552: sipush 1080
    //   555: istore 8
    //   557: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   560: ldc_w 995
    //   563: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   566: bipush 100
    //   568: invokestatic 944	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   571: istore 14
    //   573: iload 14
    //   575: istore 13
    //   577: iload 14
    //   579: ifgt +7 -> 586
    //   582: bipush 100
    //   584: istore 13
    //   586: iload 13
    //   588: sipush 1024
    //   591: imul
    //   592: istore 15
    //   594: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   597: ldc_w 997
    //   600: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   603: sipush 200
    //   606: invokestatic 944	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   609: istore 14
    //   611: iload 14
    //   613: istore 13
    //   615: iload 14
    //   617: ifgt +8 -> 625
    //   620: sipush 200
    //   623: istore 13
    //   625: iload 13
    //   627: sipush 1024
    //   630: imul
    //   631: istore 16
    //   633: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   636: ldc_w 999
    //   639: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   642: bipush 10
    //   644: invokestatic 944	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   647: istore 13
    //   649: iload 13
    //   651: ifle +10 -> 661
    //   654: iload 13
    //   656: bipush 100
    //   658: if_icmplt +2589 -> 3247
    //   661: bipush 10
    //   663: istore 13
    //   665: iconst_0
    //   666: istore 14
    //   668: iload 7
    //   670: ifeq +873 -> 1543
    //   673: aload_1
    //   674: invokestatic 178	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   677: astore 5
    //   679: iload 14
    //   681: istore 7
    //   683: aload 5
    //   685: ifnull +14 -> 699
    //   688: aload 5
    //   690: invokevirtual 181	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   693: sipush 360
    //   696: irem
    //   697: istore 7
    //   699: ldc 125
    //   701: new 70	java/lang/StringBuilder
    //   704: dup
    //   705: ldc_w 1001
    //   708: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   711: aload 4
    //   713: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   716: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   719: ldc_w 1003
    //   722: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   725: aload 4
    //   727: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   730: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   733: ldc_w 1003
    //   736: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   739: iload 6
    //   741: invokevirtual 1006	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   744: ldc_w 1008
    //   747: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   750: iload 10
    //   752: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   755: ldc_w 1010
    //   758: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   761: iload 7
    //   763: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   766: ldc_w 1012
    //   769: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: iload 12
    //   774: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   777: ldc_w 1014
    //   780: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   783: iload 11
    //   785: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   788: ldc_w 1003
    //   791: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   794: iload 8
    //   796: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   799: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   802: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   805: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   808: ldc_w 1016
    //   811: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   814: bipush 10
    //   816: invokestatic 944	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   819: pop
    //   820: aload 4
    //   822: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   825: aload 4
    //   827: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   830: iconst_2
    //   831: imul
    //   832: if_icmpge +18 -> 850
    //   835: aload 4
    //   837: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   840: aload 4
    //   842: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   845: iconst_2
    //   846: imul
    //   847: if_icmplt +1564 -> 2411
    //   850: aload 4
    //   852: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   855: aload 4
    //   857: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   860: imul
    //   861: ldc_w 1017
    //   864: if_icmpgt +1303 -> 2167
    //   867: iload 12
    //   869: iload 16
    //   871: if_icmpge +689 -> 1560
    //   874: iload 6
    //   876: ifeq +684 -> 1560
    //   879: iload 7
    //   881: ifne +679 -> 1560
    //   884: ldc 125
    //   886: ldc_w 1019
    //   889: iload 16
    //   891: invokestatic 430	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   894: invokevirtual 134	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   897: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   900: aload_1
    //   901: new 70	java/lang/StringBuilder
    //   904: dup
    //   905: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   908: aload_0
    //   909: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   912: aload_2
    //   913: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   916: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   919: invokestatic 597	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   922: lconst_0
    //   923: lcmp
    //   924: iflt +625 -> 1549
    //   927: iconst_1
    //   928: istore_3
    //   929: ldc_w 897
    //   932: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   935: iload_3
    //   936: ireturn
    //   937: aload 5
    //   939: ldc_w 284
    //   942: invokevirtual 149	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   945: iflt +9 -> 954
    //   948: iconst_1
    //   949: istore 6
    //   951: goto -885 -> 66
    //   954: aload 5
    //   956: ldc_w 441
    //   959: invokevirtual 149	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   962: iflt +9 -> 971
    //   965: iconst_1
    //   966: istore 6
    //   968: goto -902 -> 66
    //   971: iconst_0
    //   972: istore 6
    //   974: goto -908 -> 66
    //   977: aload 5
    //   979: ldc_w 284
    //   982: invokevirtual 149	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   985: iflt +9 -> 994
    //   988: iconst_1
    //   989: istore 7
    //   991: goto -887 -> 104
    //   994: iconst_0
    //   995: istore 7
    //   997: goto -893 -> 104
    //   1000: invokestatic 921	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1003: invokestatic 1022	com/tencent/mm/sdk/platformtools/at:is2G	(Landroid/content/Context;)Z
    //   1006: ifeq +22 -> 1028
    //   1009: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1012: ldc_w 948
    //   1015: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1018: bipush 70
    //   1020: invokestatic 944	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   1023: istore 11
    //   1025: goto -857 -> 168
    //   1028: invokestatic 921	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1031: invokestatic 1025	com/tencent/mm/sdk/platformtools/at:is3G	(Landroid/content/Context;)Z
    //   1034: ifeq +22 -> 1056
    //   1037: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1040: ldc_w 950
    //   1043: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1046: bipush 60
    //   1048: invokestatic 944	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   1051: istore 11
    //   1053: goto -885 -> 168
    //   1056: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1059: ldc_w 952
    //   1062: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1065: bipush 60
    //   1067: invokestatic 944	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   1070: istore 11
    //   1072: goto -904 -> 168
    //   1075: invokestatic 921	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1078: invokestatic 927	com/tencent/mm/sdk/platformtools/at:isWifi	(Landroid/content/Context;)Z
    //   1081: ifeq +23 -> 1104
    //   1084: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1087: ldc_w 954
    //   1090: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1093: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1096: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1099: istore 11
    //   1101: goto -933 -> 168
    //   1104: invokestatic 921	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1107: invokestatic 1022	com/tencent/mm/sdk/platformtools/at:is2G	(Landroid/content/Context;)Z
    //   1110: ifeq +23 -> 1133
    //   1113: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1116: ldc_w 956
    //   1119: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1122: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1125: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1128: istore 11
    //   1130: goto -962 -> 168
    //   1133: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1136: ldc_w 958
    //   1139: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1142: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1145: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1148: istore 11
    //   1150: goto -982 -> 168
    //   1153: iload 13
    //   1155: istore 11
    //   1157: invokestatic 921	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1160: invokestatic 927	com/tencent/mm/sdk/platformtools/at:isWifi	(Landroid/content/Context;)Z
    //   1163: ifeq +73 -> 1236
    //   1166: iload 13
    //   1168: istore 11
    //   1170: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1173: ldc_w 1027
    //   1176: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1179: astore 5
    //   1181: iload 13
    //   1183: istore 11
    //   1185: aload 5
    //   1187: ldc_w 981
    //   1190: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1193: iconst_0
    //   1194: aaload
    //   1195: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1198: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1201: istore 13
    //   1203: iload 13
    //   1205: istore 11
    //   1207: aload 5
    //   1209: ldc_w 981
    //   1212: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1215: iconst_1
    //   1216: aaload
    //   1217: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1220: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1223: istore 14
    //   1225: iload 14
    //   1227: istore 8
    //   1229: iload 13
    //   1231: istore 11
    //   1233: goto -756 -> 477
    //   1236: iload 13
    //   1238: istore 11
    //   1240: invokestatic 921	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1243: invokestatic 1022	com/tencent/mm/sdk/platformtools/at:is2G	(Landroid/content/Context;)Z
    //   1246: ifeq +73 -> 1319
    //   1249: iload 13
    //   1251: istore 11
    //   1253: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1256: ldc_w 1029
    //   1259: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1262: astore 5
    //   1264: iload 13
    //   1266: istore 11
    //   1268: aload 5
    //   1270: ldc_w 981
    //   1273: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1276: iconst_0
    //   1277: aaload
    //   1278: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1281: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1284: istore 13
    //   1286: iload 13
    //   1288: istore 11
    //   1290: aload 5
    //   1292: ldc_w 981
    //   1295: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1298: iconst_1
    //   1299: aaload
    //   1300: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1303: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1306: istore 14
    //   1308: iload 14
    //   1310: istore 8
    //   1312: iload 13
    //   1314: istore 11
    //   1316: goto -839 -> 477
    //   1319: iload 13
    //   1321: istore 11
    //   1323: invokestatic 921	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1326: invokestatic 1025	com/tencent/mm/sdk/platformtools/at:is3G	(Landroid/content/Context;)Z
    //   1329: ifeq +73 -> 1402
    //   1332: iload 13
    //   1334: istore 11
    //   1336: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1339: ldc_w 1031
    //   1342: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1345: astore 5
    //   1347: iload 13
    //   1349: istore 11
    //   1351: aload 5
    //   1353: ldc_w 981
    //   1356: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1359: iconst_0
    //   1360: aaload
    //   1361: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1364: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1367: istore 13
    //   1369: iload 13
    //   1371: istore 11
    //   1373: aload 5
    //   1375: ldc_w 981
    //   1378: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1381: iconst_1
    //   1382: aaload
    //   1383: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1386: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1389: istore 14
    //   1391: iload 14
    //   1393: istore 8
    //   1395: iload 13
    //   1397: istore 11
    //   1399: goto -922 -> 477
    //   1402: iload 13
    //   1404: istore 11
    //   1406: invokestatic 933	com/tencent/mm/m/g:Nu	()Lcom/tencent/mm/m/e;
    //   1409: ldc_w 1033
    //   1412: invokevirtual 940	com/tencent/mm/m/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   1415: astore 5
    //   1417: iload 13
    //   1419: istore 11
    //   1421: aload 5
    //   1423: ldc_w 981
    //   1426: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1429: iconst_0
    //   1430: aaload
    //   1431: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1434: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1437: istore 13
    //   1439: iload 13
    //   1441: istore 11
    //   1443: aload 5
    //   1445: ldc_w 981
    //   1448: invokevirtual 985	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1451: iconst_1
    //   1452: aaload
    //   1453: invokestatic 988	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1456: invokevirtual 991	java/lang/Integer:intValue	()I
    //   1459: istore 14
    //   1461: iload 14
    //   1463: istore 8
    //   1465: iload 13
    //   1467: istore 11
    //   1469: goto -992 -> 477
    //   1472: iload 8
    //   1474: sipush 2160
    //   1477: if_icmplt +14 -> 1491
    //   1480: iconst_0
    //   1481: istore 11
    //   1483: sipush 1080
    //   1486: istore 8
    //   1488: goto -931 -> 557
    //   1491: iload 8
    //   1493: ifgt +1757 -> 3250
    //   1496: iload 11
    //   1498: sipush 3240
    //   1501: if_icmple +1749 -> 3250
    //   1504: sipush 1620
    //   1507: istore 11
    //   1509: iconst_0
    //   1510: istore 8
    //   1512: goto -955 -> 557
    //   1515: astore 5
    //   1517: ldc 125
    //   1519: new 70	java/lang/StringBuilder
    //   1522: dup
    //   1523: ldc_w 1035
    //   1526: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1529: aload 5
    //   1531: invokevirtual 819	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1534: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1537: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1540: invokestatic 627	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1543: iconst_0
    //   1544: istore 7
    //   1546: goto -847 -> 699
    //   1549: iconst_0
    //   1550: istore_3
    //   1551: ldc_w 897
    //   1554: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1557: goto -622 -> 935
    //   1560: new 108	android/graphics/BitmapFactory$Options
    //   1563: dup
    //   1564: invokespecial 109	android/graphics/BitmapFactory$Options:<init>	()V
    //   1567: astore 17
    //   1569: invokestatic 1038	com/tencent/mm/sdk/platformtools/d:dnX	()V
    //   1572: aconst_null
    //   1573: astore 4
    //   1575: aconst_null
    //   1576: astore 5
    //   1578: aload_1
    //   1579: invokestatic 106	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   1582: astore 18
    //   1584: aload 18
    //   1586: astore 19
    //   1588: aload 18
    //   1590: astore 5
    //   1592: aload 18
    //   1594: astore 4
    //   1596: aload 18
    //   1598: invokevirtual 654	java/io/InputStream:markSupported	()Z
    //   1601: ifne +31 -> 1632
    //   1604: aload 18
    //   1606: astore 5
    //   1608: aload 18
    //   1610: astore 4
    //   1612: new 656	java/io/BufferedInputStream
    //   1615: astore 19
    //   1617: aload 18
    //   1619: astore 5
    //   1621: aload 18
    //   1623: astore 4
    //   1625: aload 19
    //   1627: aload 18
    //   1629: invokespecial 659	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   1632: aload 19
    //   1634: astore 5
    //   1636: aload 19
    //   1638: astore 4
    //   1640: aload 19
    //   1642: ldc_w 660
    //   1645: invokevirtual 663	java/io/InputStream:mark	(I)V
    //   1648: aload 19
    //   1650: astore 5
    //   1652: aload 19
    //   1654: astore 4
    //   1656: aload 19
    //   1658: aconst_null
    //   1659: aload 17
    //   1661: invokestatic 119	com/tencent/mm/graphics/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   1664: astore 18
    //   1666: aload 19
    //   1668: astore 5
    //   1670: aload 19
    //   1672: astore 4
    //   1674: aload 19
    //   1676: invokevirtual 669	java/io/InputStream:reset	()V
    //   1679: aload 18
    //   1681: ifnonnull +24 -> 1705
    //   1684: aload 19
    //   1686: ifnull +8 -> 1694
    //   1689: aload 19
    //   1691: invokevirtual 154	java/io/InputStream:close	()V
    //   1694: iconst_0
    //   1695: istore_3
    //   1696: ldc_w 897
    //   1699: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1702: goto -767 -> 935
    //   1705: iload 7
    //   1707: i2f
    //   1708: fstore 20
    //   1710: aload 19
    //   1712: astore 5
    //   1714: aload 19
    //   1716: astore 4
    //   1718: aload 18
    //   1720: fload 20
    //   1722: invokestatic 185	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    //   1725: astore 17
    //   1727: aload 19
    //   1729: astore 5
    //   1731: aload 19
    //   1733: astore 4
    //   1735: getstatic 787	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1738: astore 18
    //   1740: aload 19
    //   1742: astore 5
    //   1744: aload 19
    //   1746: astore 4
    //   1748: new 70	java/lang/StringBuilder
    //   1751: astore 21
    //   1753: aload 19
    //   1755: astore 5
    //   1757: aload 19
    //   1759: astore 4
    //   1761: aload 21
    //   1763: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   1766: aload 19
    //   1768: astore 5
    //   1770: aload 19
    //   1772: astore 4
    //   1774: aload 17
    //   1776: iload 9
    //   1778: aload 18
    //   1780: aload 21
    //   1782: aload_0
    //   1783: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1786: aload_2
    //   1787: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1790: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1793: iconst_1
    //   1794: invokestatic 872	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   1797: iload 6
    //   1799: ifeq +282 -> 2081
    //   1802: iload 7
    //   1804: ifne +277 -> 2081
    //   1807: aload 19
    //   1809: astore 5
    //   1811: aload 19
    //   1813: astore 4
    //   1815: new 70	java/lang/StringBuilder
    //   1818: astore 18
    //   1820: aload 19
    //   1822: astore 5
    //   1824: aload 19
    //   1826: astore 4
    //   1828: aload 18
    //   1830: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   1833: aload 19
    //   1835: astore 5
    //   1837: aload 19
    //   1839: astore 4
    //   1841: aload 18
    //   1843: aload_0
    //   1844: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1847: aload_2
    //   1848: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1851: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1854: invokestatic 276	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   1857: lstore 22
    //   1859: aload 19
    //   1861: astore 5
    //   1863: aload 19
    //   1865: astore 4
    //   1867: ldc 125
    //   1869: ldc_w 1040
    //   1872: iconst_3
    //   1873: anewarray 195	java/lang/Object
    //   1876: dup
    //   1877: iconst_0
    //   1878: iload 12
    //   1880: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1883: aastore
    //   1884: dup
    //   1885: iconst_1
    //   1886: lload 22
    //   1888: invokestatic 761	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1891: aastore
    //   1892: dup
    //   1893: iconst_2
    //   1894: iload 13
    //   1896: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1899: aastore
    //   1900: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1903: iload 12
    //   1905: i2l
    //   1906: lload 22
    //   1908: lsub
    //   1909: ldc2_w 1041
    //   1912: lmul
    //   1913: iload 13
    //   1915: iload 12
    //   1917: imul
    //   1918: i2l
    //   1919: lcmp
    //   1920: ifge +140 -> 2060
    //   1923: aload 19
    //   1925: astore 5
    //   1927: aload 19
    //   1929: astore 4
    //   1931: new 70	java/lang/StringBuilder
    //   1934: astore 18
    //   1936: aload 19
    //   1938: astore 5
    //   1940: aload 19
    //   1942: astore 4
    //   1944: aload 18
    //   1946: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   1949: aload 19
    //   1951: astore 5
    //   1953: aload 19
    //   1955: astore 4
    //   1957: aload 18
    //   1959: aload_0
    //   1960: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1963: aload_2
    //   1964: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1967: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1970: invokestatic 606	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   1973: pop
    //   1974: aload 19
    //   1976: astore 5
    //   1978: aload 19
    //   1980: astore 4
    //   1982: new 70	java/lang/StringBuilder
    //   1985: astore 18
    //   1987: aload 19
    //   1989: astore 5
    //   1991: aload 19
    //   1993: astore 4
    //   1995: aload 18
    //   1997: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   2000: aload 19
    //   2002: astore 5
    //   2004: aload 19
    //   2006: astore 4
    //   2008: aload_1
    //   2009: aload 18
    //   2011: aload_0
    //   2012: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2015: aload_2
    //   2016: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2019: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2022: invokestatic 597	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   2025: lstore 22
    //   2027: lload 22
    //   2029: lconst_0
    //   2030: lcmp
    //   2031: iflt +24 -> 2055
    //   2034: iconst_1
    //   2035: istore_3
    //   2036: aload 19
    //   2038: ifnull +8 -> 2046
    //   2041: aload 19
    //   2043: invokevirtual 154	java/io/InputStream:close	()V
    //   2046: ldc_w 897
    //   2049: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2052: goto -1117 -> 935
    //   2055: iconst_0
    //   2056: istore_3
    //   2057: goto -21 -> 2036
    //   2060: aload 19
    //   2062: ifnull +8 -> 2070
    //   2065: aload 19
    //   2067: invokevirtual 154	java/io/InputStream:close	()V
    //   2070: iconst_1
    //   2071: istore_3
    //   2072: ldc_w 897
    //   2075: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2078: goto -1143 -> 935
    //   2081: aload 19
    //   2083: ifnull +8 -> 2091
    //   2086: aload 19
    //   2088: invokevirtual 154	java/io/InputStream:close	()V
    //   2091: iconst_1
    //   2092: istore_3
    //   2093: ldc_w 897
    //   2096: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2099: goto -1164 -> 935
    //   2102: astore_0
    //   2103: aload 5
    //   2105: astore 4
    //   2107: ldc 125
    //   2109: aload_0
    //   2110: ldc_w 1044
    //   2113: aload_1
    //   2114: invokestatic 131	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   2117: invokevirtual 134	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   2120: iconst_0
    //   2121: anewarray 195	java/lang/Object
    //   2124: invokestatic 623	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2127: aload 5
    //   2129: ifnull +8 -> 2137
    //   2132: aload 5
    //   2134: invokevirtual 154	java/io/InputStream:close	()V
    //   2137: iconst_0
    //   2138: istore_3
    //   2139: ldc_w 897
    //   2142: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2145: goto -1210 -> 935
    //   2148: astore_0
    //   2149: aload 4
    //   2151: ifnull +8 -> 2159
    //   2154: aload 4
    //   2156: invokevirtual 154	java/io/InputStream:close	()V
    //   2159: ldc_w 897
    //   2162: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2165: aload_0
    //   2166: athrow
    //   2167: ldc 125
    //   2169: new 70	java/lang/StringBuilder
    //   2172: dup
    //   2173: ldc_w 1046
    //   2176: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2179: aload 4
    //   2181: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2184: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2187: ldc_w 1003
    //   2190: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2193: aload 4
    //   2195: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2198: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2201: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2204: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2207: aload 4
    //   2209: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2212: ifgt +9 -> 2221
    //   2215: aload 4
    //   2217: iconst_1
    //   2218: putfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2221: aload 4
    //   2223: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2226: ifgt +9 -> 2235
    //   2229: aload 4
    //   2231: iconst_1
    //   2232: putfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2235: aload 4
    //   2237: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2240: aload 4
    //   2242: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2245: if_icmple +140 -> 2385
    //   2248: aload 4
    //   2250: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2253: aload 4
    //   2255: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2258: idiv
    //   2259: istore 11
    //   2261: iload 11
    //   2263: istore 8
    //   2265: iload 11
    //   2267: ifne +6 -> 2273
    //   2270: iconst_1
    //   2271: istore 8
    //   2273: ldc_w 1017
    //   2276: iload 8
    //   2278: idiv
    //   2279: i2d
    //   2280: invokestatic 1049	java/lang/Math:sqrt	(D)D
    //   2283: d2i
    //   2284: istore 11
    //   2286: aload 4
    //   2288: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2291: aload 4
    //   2293: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2296: if_icmple +105 -> 2401
    //   2299: iload 11
    //   2301: iload 8
    //   2303: imul
    //   2304: istore 10
    //   2306: iload 11
    //   2308: istore 7
    //   2310: iload 10
    //   2312: istore 11
    //   2314: ldc 125
    //   2316: new 70	java/lang/StringBuilder
    //   2319: dup
    //   2320: ldc_w 1051
    //   2323: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2326: iload 11
    //   2328: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2331: ldc_w 1003
    //   2334: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2337: iload 7
    //   2339: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2342: ldc_w 1003
    //   2345: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2348: iload 8
    //   2350: invokevirtual 382	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2353: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2356: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2359: aload_1
    //   2360: iload 7
    //   2362: iload 11
    //   2364: getstatic 787	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2367: iload 9
    //   2369: aload_0
    //   2370: aload_2
    //   2371: iload_3
    //   2372: invokestatic 1053	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2375: istore_3
    //   2376: ldc_w 897
    //   2379: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2382: goto -1447 -> 935
    //   2385: aload 4
    //   2387: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2390: aload 4
    //   2392: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2395: idiv
    //   2396: istore 11
    //   2398: goto -137 -> 2261
    //   2401: iload 11
    //   2403: iload 8
    //   2405: imul
    //   2406: istore 7
    //   2408: goto -94 -> 2314
    //   2411: iload 12
    //   2413: iload 15
    //   2415: if_icmpge +78 -> 2493
    //   2418: iload 6
    //   2420: ifeq +73 -> 2493
    //   2423: iload 7
    //   2425: ifne +68 -> 2493
    //   2428: ldc 125
    //   2430: ldc_w 1055
    //   2433: iload 15
    //   2435: invokestatic 430	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   2438: invokevirtual 134	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   2441: invokestatic 229	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2444: aload_1
    //   2445: new 70	java/lang/StringBuilder
    //   2448: dup
    //   2449: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   2452: aload_0
    //   2453: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2456: aload_2
    //   2457: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2460: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2463: invokestatic 597	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   2466: lconst_0
    //   2467: lcmp
    //   2468: iflt +14 -> 2482
    //   2471: iconst_1
    //   2472: istore_3
    //   2473: ldc_w 897
    //   2476: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2479: goto -1544 -> 935
    //   2482: iconst_0
    //   2483: istore_3
    //   2484: ldc_w 897
    //   2487: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2490: goto -1555 -> 935
    //   2493: aload 4
    //   2495: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2498: aload 4
    //   2500: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2503: if_icmple +166 -> 2669
    //   2506: aload 4
    //   2508: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2511: istore 10
    //   2513: aload 4
    //   2515: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2518: aload 4
    //   2520: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2523: if_icmpge +156 -> 2679
    //   2526: aload 4
    //   2528: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2531: istore 14
    //   2533: iload 8
    //   2535: ifle +10 -> 2545
    //   2538: iload 14
    //   2540: iload 8
    //   2542: if_icmple +15 -> 2557
    //   2545: iload 8
    //   2547: ifgt +408 -> 2955
    //   2550: iload 10
    //   2552: iload 11
    //   2554: if_icmpgt +401 -> 2955
    //   2557: ldc 125
    //   2559: ldc_w 1057
    //   2562: iconst_3
    //   2563: anewarray 195	java/lang/Object
    //   2566: dup
    //   2567: iconst_0
    //   2568: iload 12
    //   2570: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2573: aastore
    //   2574: dup
    //   2575: iconst_1
    //   2576: aload 4
    //   2578: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2581: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2584: aastore
    //   2585: dup
    //   2586: iconst_2
    //   2587: aload 4
    //   2589: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2592: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2595: aastore
    //   2596: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2599: aload_1
    //   2600: invokestatic 276	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   2603: ldc2_w 1058
    //   2606: lcmp
    //   2607: ifge +147 -> 2754
    //   2610: iload 6
    //   2612: ifeq +88 -> 2700
    //   2615: ldc 125
    //   2617: ldc_w 1061
    //   2620: iconst_1
    //   2621: anewarray 195	java/lang/Object
    //   2624: dup
    //   2625: iconst_0
    //   2626: aload_1
    //   2627: aastore
    //   2628: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2631: aload_1
    //   2632: new 70	java/lang/StringBuilder
    //   2635: dup
    //   2636: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   2639: aload_0
    //   2640: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2643: aload_2
    //   2644: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2647: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2650: invokestatic 597	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   2653: lconst_0
    //   2654: lcmp
    //   2655: iflt +34 -> 2689
    //   2658: iconst_1
    //   2659: istore_3
    //   2660: ldc_w 897
    //   2663: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2666: goto -1731 -> 935
    //   2669: aload 4
    //   2671: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2674: istore 10
    //   2676: goto -163 -> 2513
    //   2679: aload 4
    //   2681: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2684: istore 14
    //   2686: goto -153 -> 2533
    //   2689: iconst_0
    //   2690: istore_3
    //   2691: ldc_w 897
    //   2694: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2697: goto -1762 -> 935
    //   2700: aload 4
    //   2702: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2705: sipush 150
    //   2708: if_icmpge +46 -> 2754
    //   2711: aload 4
    //   2713: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2716: sipush 150
    //   2719: if_icmpge +35 -> 2754
    //   2722: aload_1
    //   2723: aload 4
    //   2725: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2728: aload 4
    //   2730: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2733: getstatic 784	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   2736: iload 9
    //   2738: aload_0
    //   2739: aload_2
    //   2740: iload_3
    //   2741: invokestatic 1053	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2744: istore_3
    //   2745: ldc_w 897
    //   2748: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2751: goto -1816 -> 935
    //   2754: aload_1
    //   2755: aload 4
    //   2757: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2760: aload 4
    //   2762: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2765: getstatic 787	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2768: iload 9
    //   2770: aload_0
    //   2771: aload_2
    //   2772: iload_3
    //   2773: invokestatic 1053	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   2776: istore_3
    //   2777: iload 6
    //   2779: ifeq +167 -> 2946
    //   2782: iload 7
    //   2784: ifne +162 -> 2946
    //   2787: new 70	java/lang/StringBuilder
    //   2790: dup
    //   2791: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   2794: aload_0
    //   2795: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2798: aload_2
    //   2799: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2802: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2805: invokestatic 276	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   2808: lstore 22
    //   2810: ldc 125
    //   2812: ldc_w 1040
    //   2815: iconst_3
    //   2816: anewarray 195	java/lang/Object
    //   2819: dup
    //   2820: iconst_0
    //   2821: iload 12
    //   2823: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2826: aastore
    //   2827: dup
    //   2828: iconst_1
    //   2829: lload 22
    //   2831: invokestatic 761	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2834: aastore
    //   2835: dup
    //   2836: iconst_2
    //   2837: iload 13
    //   2839: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2842: aastore
    //   2843: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2846: iload 12
    //   2848: i2l
    //   2849: lload 22
    //   2851: lsub
    //   2852: ldc2_w 1041
    //   2855: lmul
    //   2856: iload 13
    //   2858: iload 12
    //   2860: imul
    //   2861: i2l
    //   2862: lcmp
    //   2863: ifge +74 -> 2937
    //   2866: new 70	java/lang/StringBuilder
    //   2869: dup
    //   2870: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   2873: aload_0
    //   2874: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2877: aload_2
    //   2878: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2881: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2884: invokestatic 606	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   2887: pop
    //   2888: aload_1
    //   2889: new 70	java/lang/StringBuilder
    //   2892: dup
    //   2893: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   2896: aload_0
    //   2897: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2900: aload_2
    //   2901: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2904: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2907: invokestatic 597	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   2910: lconst_0
    //   2911: lcmp
    //   2912: iflt +14 -> 2926
    //   2915: iconst_1
    //   2916: istore_3
    //   2917: ldc_w 897
    //   2920: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2923: goto -1988 -> 935
    //   2926: iconst_0
    //   2927: istore_3
    //   2928: ldc_w 897
    //   2931: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2934: goto -1999 -> 935
    //   2937: ldc_w 897
    //   2940: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2943: goto -2008 -> 935
    //   2946: ldc_w 897
    //   2949: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2952: goto -2017 -> 935
    //   2955: iload 8
    //   2957: ifle +176 -> 3133
    //   2960: aload_1
    //   2961: aload 4
    //   2963: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   2966: aload 4
    //   2968: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   2971: iload 8
    //   2973: getstatic 787	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   2976: iload 9
    //   2978: aload_0
    //   2979: aload_2
    //   2980: invokestatic 1063	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IIILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;)Z
    //   2983: istore_3
    //   2984: iload 6
    //   2986: ifeq +209 -> 3195
    //   2989: iload 7
    //   2991: ifne +204 -> 3195
    //   2994: new 70	java/lang/StringBuilder
    //   2997: dup
    //   2998: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   3001: aload_0
    //   3002: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3005: aload_2
    //   3006: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3009: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3012: invokestatic 276	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   3015: lstore 22
    //   3017: ldc 125
    //   3019: ldc_w 1040
    //   3022: iconst_3
    //   3023: anewarray 195	java/lang/Object
    //   3026: dup
    //   3027: iconst_0
    //   3028: iload 12
    //   3030: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3033: aastore
    //   3034: dup
    //   3035: iconst_1
    //   3036: lload 22
    //   3038: invokestatic 761	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3041: aastore
    //   3042: dup
    //   3043: iconst_2
    //   3044: iload 13
    //   3046: invokestatic 583	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3049: aastore
    //   3050: invokestatic 198	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3053: iload 12
    //   3055: i2l
    //   3056: lload 22
    //   3058: lsub
    //   3059: ldc2_w 1041
    //   3062: lmul
    //   3063: iload 13
    //   3065: iload 12
    //   3067: imul
    //   3068: i2l
    //   3069: lcmp
    //   3070: ifge +125 -> 3195
    //   3073: new 70	java/lang/StringBuilder
    //   3076: dup
    //   3077: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   3080: aload_0
    //   3081: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3084: aload_2
    //   3085: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3088: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3091: invokestatic 606	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   3094: pop
    //   3095: aload_1
    //   3096: new 70	java/lang/StringBuilder
    //   3099: dup
    //   3100: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   3103: aload_0
    //   3104: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3107: aload_2
    //   3108: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3111: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3114: invokestatic 597	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   3117: lconst_0
    //   3118: lcmp
    //   3119: iflt +65 -> 3184
    //   3122: iconst_1
    //   3123: istore_3
    //   3124: ldc_w 897
    //   3127: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   3130: goto -2195 -> 935
    //   3133: iload 10
    //   3135: i2d
    //   3136: dconst_1
    //   3137: dmul
    //   3138: iload 11
    //   3140: i2d
    //   3141: ddiv
    //   3142: dstore 24
    //   3144: aload 4
    //   3146: getfield 166	android/graphics/BitmapFactory$Options:outWidth	I
    //   3149: i2d
    //   3150: dload 24
    //   3152: ddiv
    //   3153: d2i
    //   3154: istore 11
    //   3156: aload_1
    //   3157: aload 4
    //   3159: getfield 169	android/graphics/BitmapFactory$Options:outHeight	I
    //   3162: i2d
    //   3163: dload 24
    //   3165: ddiv
    //   3166: d2i
    //   3167: iload 11
    //   3169: getstatic 787	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   3172: iload 9
    //   3174: aload_0
    //   3175: aload_2
    //   3176: iload_3
    //   3177: invokestatic 1053	com/tencent/mm/plugin/sns/storage/s:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Z)Z
    //   3180: istore_3
    //   3181: goto -197 -> 2984
    //   3184: iconst_0
    //   3185: istore_3
    //   3186: ldc_w 897
    //   3189: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   3192: goto -2257 -> 935
    //   3195: ldc_w 897
    //   3198: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   3201: goto -2266 -> 935
    //   3204: astore_0
    //   3205: goto -1511 -> 1694
    //   3208: astore_0
    //   3209: goto -1163 -> 2046
    //   3212: astore_0
    //   3213: goto -1143 -> 2070
    //   3216: astore_0
    //   3217: goto -1126 -> 2091
    //   3220: astore_0
    //   3221: goto -1084 -> 2137
    //   3224: astore_1
    //   3225: goto -1066 -> 2159
    //   3228: astore 5
    //   3230: goto -2753 -> 477
    //   3233: astore 5
    //   3235: bipush 100
    //   3237: istore 11
    //   3239: goto -2973 -> 266
    //   3242: astore 5
    //   3244: goto -2978 -> 266
    //   3247: goto -2582 -> 665
    //   3250: goto -2693 -> 557
    //   3253: iload 8
    //   3255: istore 10
    //   3257: iload 11
    //   3259: istore 9
    //   3261: goto -2909 -> 352
    //   3264: goto -2953 -> 311
    //
    // Exception table:
    //   from	to	target	type
    //   673	679	1515	java/lang/Exception
    //   688	699	1515	java/lang/Exception
    //   1578	1584	2102	java/io/IOException
    //   1596	1604	2102	java/io/IOException
    //   1612	1617	2102	java/io/IOException
    //   1625	1632	2102	java/io/IOException
    //   1640	1648	2102	java/io/IOException
    //   1656	1666	2102	java/io/IOException
    //   1674	1679	2102	java/io/IOException
    //   1718	1727	2102	java/io/IOException
    //   1735	1740	2102	java/io/IOException
    //   1748	1753	2102	java/io/IOException
    //   1761	1766	2102	java/io/IOException
    //   1774	1797	2102	java/io/IOException
    //   1815	1820	2102	java/io/IOException
    //   1828	1833	2102	java/io/IOException
    //   1841	1859	2102	java/io/IOException
    //   1867	1903	2102	java/io/IOException
    //   1931	1936	2102	java/io/IOException
    //   1944	1949	2102	java/io/IOException
    //   1957	1974	2102	java/io/IOException
    //   1982	1987	2102	java/io/IOException
    //   1995	2000	2102	java/io/IOException
    //   2008	2027	2102	java/io/IOException
    //   1578	1584	2148	finally
    //   1596	1604	2148	finally
    //   1612	1617	2148	finally
    //   1625	1632	2148	finally
    //   1640	1648	2148	finally
    //   1656	1666	2148	finally
    //   1674	1679	2148	finally
    //   1718	1727	2148	finally
    //   1735	1740	2148	finally
    //   1748	1753	2148	finally
    //   1761	1766	2148	finally
    //   1774	1797	2148	finally
    //   1815	1820	2148	finally
    //   1828	1833	2148	finally
    //   1841	1859	2148	finally
    //   1867	1903	2148	finally
    //   1931	1936	2148	finally
    //   1944	1949	2148	finally
    //   1957	1974	2148	finally
    //   1982	1987	2148	finally
    //   1995	2000	2148	finally
    //   2008	2027	2148	finally
    //   2107	2127	2148	finally
    //   1689	1694	3204	java/io/IOException
    //   2041	2046	3208	java/io/IOException
    //   2065	2070	3212	java/io/IOException
    //   2086	2091	3216	java/io/IOException
    //   2132	2137	3220	java/io/IOException
    //   2154	2159	3224	java/io/IOException
    //   414	425	3228	java/lang/Exception
    //   429	447	3228	java/lang/Exception
    //   451	469	3228	java/lang/Exception
    //   1157	1166	3228	java/lang/Exception
    //   1170	1181	3228	java/lang/Exception
    //   1185	1203	3228	java/lang/Exception
    //   1207	1225	3228	java/lang/Exception
    //   1240	1249	3228	java/lang/Exception
    //   1253	1264	3228	java/lang/Exception
    //   1268	1286	3228	java/lang/Exception
    //   1290	1308	3228	java/lang/Exception
    //   1323	1332	3228	java/lang/Exception
    //   1336	1347	3228	java/lang/Exception
    //   1351	1369	3228	java/lang/Exception
    //   1373	1391	3228	java/lang/Exception
    //   1406	1417	3228	java/lang/Exception
    //   1421	1439	3228	java/lang/Exception
    //   1443	1461	3228	java/lang/Exception
    //   119	143	3233	java/lang/Exception
    //   143	168	3233	java/lang/Exception
    //   1000	1025	3233	java/lang/Exception
    //   1028	1053	3233	java/lang/Exception
    //   1056	1072	3233	java/lang/Exception
    //   1075	1101	3233	java/lang/Exception
    //   1104	1130	3233	java/lang/Exception
    //   1133	1150	3233	java/lang/Exception
    //   168	266	3242	java/lang/Exception
  }

  public static void fs(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37978);
    qDU = paramInt1;
    qDc = paramInt2;
    ab.i("MicroMsg.snsMediaStorage", "SCREEN %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(37978);
  }

  public static int getScreenWidth()
  {
    if (qDU > qDc);
    for (int i = qDc; ; i = qDU)
      return i;
  }

  public final r Zi(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(37984);
    r localr = new r();
    paramString = this.fni.a("SnsMedia", null, "StrId=?", new String[] { String.valueOf(paramString) }, null, null, null, 2);
    if (paramString.moveToFirst())
    {
      localr.d(paramString);
      paramString.close();
      AppMethodBeat.o(37984);
    }
    for (paramString = localr; ; paramString = localObject)
    {
      return paramString;
      paramString.close();
      AppMethodBeat.o(37984);
    }
  }

  public final int a(int paramInt, r paramr)
  {
    AppMethodBeat.i(37983);
    paramr = paramr.cro();
    paramInt = this.fni.update("SnsMedia", paramr, "local_id=?", new String[] { String.valueOf(paramInt) });
    AppMethodBeat.o(37983);
    return paramInt;
  }

  public final com.tencent.mm.plugin.sns.data.h a(com.tencent.mm.plugin.sns.data.h paramh, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(37989);
    r localr = new r();
    localr.createTime = ((int)bo.anT());
    localr.type = paramh.type;
    bax localbax = new bax();
    localbax.wEJ = paramh.qFY;
    localbax.wFe = paramh.qFX;
    localbax.token = paramh.qFZ;
    localbax.wFn = paramh.qGa;
    localbax.wFB = 0;
    localbax.wFA = new bar();
    localbax.eRu = 0;
    localbax.Desc = paramh.desc;
    ab.d("MicroMsg.snsMediaStorage", "upload.filterId " + paramh.filterId);
    localbax.wFd = paramh.filterId;
    localbax.wFD = 2;
    localbax.videoPath = paramString1;
    localbax.wFF = paramString2;
    localbax.cvZ = paramh.qGb;
    while (true)
    {
      try
      {
        localr.rfI = localbax.toByteArray();
        localr.crp();
        i = (int)this.fni.insert("SnsMedia", "local_id", localr.cro());
        str1 = "Locall_path".concat(String.valueOf(i));
        ab.d("MicroMsg.snsMediaStorage", "insert localId ".concat(String.valueOf(i)));
        String str2 = i.Xe(str1);
        String str3 = i.Xf(str1);
        String str4 = i.Xd(str1);
        String str5 = i.Xg(str1);
        String str6 = Zh(str1);
        e.tf(str6);
        e.y(paramString2, str6 + str2);
        e.y(paramString2, str6 + str3);
        e.y(paramString2, str6 + str4);
        e.y(paramString1, str6 + str5);
        localbax.videoPath = (str6 + str5);
        localbax.wFF = (str6 + str3);
        localbax.cvZ = paramh.qGb;
      }
      catch (Exception localException)
      {
        try
        {
          int i;
          String str1;
          localr.rfI = localbax.toByteArray();
          localr.rfE = str1;
          if ((TextUtils.isEmpty(paramString3)) || (TextUtils.isEmpty(paramString4)))
          {
            a(i, localr);
            paramh = a(paramh, localbax.wFF);
            paramh.cNE = i;
            AppMethodBeat.o(37989);
            return paramh;
            localException = localException;
            ab.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
          }
        }
        catch (Exception paramString2)
        {
          ab.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
          continue;
          paramString2 = new bar();
          paramString2.jCt = 1;
          paramString2.Url = paramString3;
          localbax.wFA = paramString2;
          localbax.wFD = 0;
          f.afy();
          localbax.wFc = com.tencent.mm.al.a.rJ(paramString1);
          if (!bo.isNullOrNil(paramString4))
          {
            paramString1 = new bar();
            paramString1.jCt = 1;
            paramString1.Url = paramString4;
            localbax.wFC.add(paramString1);
          }
        }
      }
      try
      {
        localr.rfI = localbax.toByteArray();
        localr.crq();
      }
      catch (Exception paramString1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.snsMediaStorage", paramString1, "", new Object[0]);
      }
    }
  }

  public final boolean a(String paramString, r paramr)
  {
    AppMethodBeat.i(37981);
    ab.d("MicroMsg.snsMediaStorage", "replace AlbumLikeList ".concat(String.valueOf(paramString)));
    Cursor localCursor = this.fni.a("SnsMedia", null, "StrId=?", new String[] { String.valueOf(paramString) }, null, null, null, 2);
    boolean bool;
    if (localCursor.moveToFirst())
    {
      localCursor.close();
      bool = a(paramr);
      AppMethodBeat.o(37981);
    }
    while (true)
    {
      return bool;
      localCursor.close();
      bool = b(paramString, paramr);
      AppMethodBeat.o(37981);
    }
  }

  public final List<com.tencent.mm.plugin.sns.data.h> dn(List<com.tencent.mm.plugin.sns.data.h> paramList)
  {
    AppMethodBeat.i(37986);
    LinkedList localLinkedList = new LinkedList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      AppMethodBeat.o(37986);
      paramList = null;
    }
    while (true)
    {
      return paramList;
      paramList = paramList.iterator();
      while (true)
      {
        if (!paramList.hasNext())
          break label141;
        com.tencent.mm.plugin.sns.data.h localh1 = (com.tencent.mm.plugin.sns.data.h)paramList.next();
        int i = a(localh1);
        if (i == -1)
        {
          AppMethodBeat.o(37986);
          paramList = null;
          break;
        }
        com.tencent.mm.plugin.sns.data.h localh2 = new com.tencent.mm.plugin.sns.data.h(i, localh1.type);
        localh2.height = localh1.height;
        localh2.width = localh1.width;
        localh2.fileSize = localh1.fileSize;
        localLinkedList.add(localh2);
      }
      label141: AppMethodBeat.o(37986);
      paramList = localLinkedList;
    }
  }

  public final r kE(long paramLong)
  {
    Object localObject = null;
    AppMethodBeat.i(37985);
    r localr = new r();
    Cursor localCursor = this.fni.a("SnsMedia", null, "local_id=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      AppMethodBeat.o(37985);
    }
    while (true)
    {
      return localObject;
      localr.d(localCursor);
      localCursor.close();
      AppMethodBeat.o(37985);
      localObject = localr;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.s
 * JD-Core Version:    0.6.2
 */
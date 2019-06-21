package com.tencent.ttpic.util;

import android.graphics.Point;
import android.graphics.PointF;
import com.tencent.faceBeauty.FaceParam;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.util.youtu.TTpicBitmapFaceDetect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FaceDetectUtil
{
  public static final List<PointF> EMPTY_LIST;
  public static final int ILLEGAL_BIG_FACE = 2;
  public static final int ILLEGAL_SMALL_FACE = 1;
  public static final int LEGAL_NORMAL_FACE = 0;

  static
  {
    AppMethodBeat.i(83874);
    EMPTY_LIST = new ArrayList();
    AppMethodBeat.o(83874);
  }

  public static List<PointF> array2List(PointF[] paramArrayOfPointF)
  {
    AppMethodBeat.i(83872);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfPointF == null)
      AppMethodBeat.o(83872);
    while (true)
    {
      return localArrayList;
      int i = paramArrayOfPointF.length;
      for (int j = 0; j < i; j++)
        localArrayList.add(paramArrayOfPointF[j]);
      AppMethodBeat.o(83872);
    }
  }

  public static int checkLegalFace(FaceParam paramFaceParam, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(83868);
    if (paramFaceParam == null)
    {
      AppMethodBeat.o(83868);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      int j = distance(paramFaceParam.bJn, paramFaceParam.bJo);
      if (j < 40)
      {
        AppMethodBeat.o(83868);
        paramInt = i;
      }
      else if (j > paramInt)
      {
        paramInt = 2;
        AppMethodBeat.o(83868);
      }
      else
      {
        paramInt = 0;
        AppMethodBeat.o(83868);
      }
    }
  }

  // ERROR //
  public static List<FaceParam> cosFunDetect(android.graphics.Bitmap paramBitmap, int paramInt, HashMap<FaceParam, float[]> paramHashMap)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 65
    //   4: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 25	java/util/ArrayList
    //   10: dup
    //   11: invokespecial 28	java/util/ArrayList:<init>	()V
    //   14: astore 4
    //   16: aload_0
    //   17: ifnull +10 -> 27
    //   20: aload_0
    //   21: invokevirtual 71	android/graphics/Bitmap:isRecycled	()Z
    //   24: ifeq +11 -> 35
    //   27: ldc 65
    //   29: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload 4
    //   34: areturn
    //   35: new 73	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect
    //   38: astore 5
    //   40: aload 5
    //   42: invokespecial 74	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:<init>	()V
    //   45: aload 5
    //   47: iconst_1
    //   48: invokevirtual 78	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:needDetectFaceFeatures	(Z)V
    //   51: aload 5
    //   53: iconst_1
    //   54: invokevirtual 81	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:needDetectFaceGender	(Z)V
    //   57: aload 5
    //   59: aload_0
    //   60: invokevirtual 85	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:detectFace	(Landroid/graphics/Bitmap;)V
    //   63: aload 5
    //   65: invokevirtual 88	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:detectedFace	()Z
    //   68: ifeq +41 -> 109
    //   71: aload 4
    //   73: aload 5
    //   75: iload_1
    //   76: aload_2
    //   77: invokestatic 92	com/tencent/ttpic/util/FaceDetectUtil:pickAvailableFaces	(Lcom/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect;ILjava/util/HashMap;)Ljava/util/List;
    //   80: invokeinterface 96 2 0
    //   85: pop
    //   86: aload_3
    //   87: astore_0
    //   88: aload 5
    //   90: invokevirtual 99	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:destroy	()V
    //   93: aload_0
    //   94: ifnull +7 -> 101
    //   97: aload_0
    //   98: invokevirtual 104	com/tencent/faceBeauty/b:release	()V
    //   101: ldc 65
    //   103: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: goto -74 -> 32
    //   109: new 106	com/tencent/faceBeauty/a
    //   112: dup
    //   113: invokespecial 107	com/tencent/faceBeauty/a:<init>	()V
    //   116: astore_3
    //   117: aload_3
    //   118: aload_0
    //   119: invokevirtual 108	com/tencent/faceBeauty/b:detectFace	(Landroid/graphics/Bitmap;)V
    //   122: aload_3
    //   123: invokevirtual 109	com/tencent/faceBeauty/b:detectedFace	()Z
    //   126: istore 6
    //   128: aload_3
    //   129: iconst_0
    //   130: invokevirtual 113	com/tencent/faceBeauty/b:getFaceParams	(I)Lcom/tencent/faceBeauty/FaceParam;
    //   133: astore 7
    //   135: iload 6
    //   137: ifeq +65 -> 202
    //   140: aload 7
    //   142: ifnull +60 -> 202
    //   145: aload 5
    //   147: aload_0
    //   148: aload 7
    //   150: getfield 117	com/tencent/faceBeauty/FaceParam:bJk	Landroid/graphics/Rect;
    //   153: aload 7
    //   155: getfield 55	com/tencent/faceBeauty/FaceParam:bJn	Landroid/graphics/Point;
    //   158: aload 7
    //   160: getfield 58	com/tencent/faceBeauty/FaceParam:bJo	Landroid/graphics/Point;
    //   163: invokevirtual 121	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:detectFaceByManual	(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/graphics/Point;)V
    //   166: aload 5
    //   168: iconst_0
    //   169: invokevirtual 122	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:getFaceParams	(I)Lcom/tencent/faceBeauty/FaceParam;
    //   172: astore_0
    //   173: aload_0
    //   174: ifnull +28 -> 202
    //   177: aload 4
    //   179: aload_0
    //   180: invokeinterface 44 2 0
    //   185: pop
    //   186: aload_2
    //   187: ifnull +15 -> 202
    //   190: aload_2
    //   191: aload_0
    //   192: aload 5
    //   194: iconst_0
    //   195: invokevirtual 126	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:getFaceAngles	(I)[F
    //   198: invokevirtual 132	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   201: pop
    //   202: aload_3
    //   203: astore_0
    //   204: goto -116 -> 88
    //   207: astore_0
    //   208: aconst_null
    //   209: astore_2
    //   210: aconst_null
    //   211: astore_3
    //   212: aload_3
    //   213: ifnull +7 -> 220
    //   216: aload_3
    //   217: invokevirtual 99	com/tencent/ttpic/util/youtu/TTpicBitmapFaceDetect:destroy	()V
    //   220: aload_2
    //   221: ifnull +7 -> 228
    //   224: aload_2
    //   225: invokevirtual 104	com/tencent/faceBeauty/b:release	()V
    //   228: ldc 65
    //   230: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   233: aload_0
    //   234: athrow
    //   235: astore_0
    //   236: aconst_null
    //   237: astore_2
    //   238: aload 5
    //   240: astore_3
    //   241: goto -29 -> 212
    //   244: astore_0
    //   245: aload_3
    //   246: astore_2
    //   247: aload 5
    //   249: astore_3
    //   250: goto -38 -> 212
    //
    // Exception table:
    //   from	to	target	type
    //   35	45	207	finally
    //   45	86	235	finally
    //   109	117	235	finally
    //   117	135	244	finally
    //   145	173	244	finally
    //   177	186	244	finally
    //   190	202	244	finally
  }

  private static int distance(Point paramPoint1, Point paramPoint2)
  {
    AppMethodBeat.i(83869);
    int i = (int)Math.sqrt(Math.abs(paramPoint1.x - paramPoint2.x) * Math.abs(paramPoint1.x - paramPoint2.x) + Math.abs(paramPoint1.y - paramPoint2.y) * Math.abs(paramPoint1.y - paramPoint2.y));
    AppMethodBeat.o(83869);
    return i;
  }

  public static List<PointF> facePointf83to90(List<PointF> paramList)
  {
    AppMethodBeat.i(83873);
    if ((paramList == null) || (paramList.size() < 83))
      AppMethodBeat.o(83873);
    while (true)
    {
      return paramList;
      while (paramList.size() < 90)
        paramList.add(new PointF());
      while (paramList.size() > 90)
        paramList.remove(paramList.size() - 1);
      PointF localPointF = (PointF)paramList.get(83);
      float f = ((PointF)paramList.get(55)).x;
      localPointF.x = ((((PointF)paramList.get(63)).x - ((PointF)paramList.get(55)).x) / 2.0F + f);
      localPointF = (PointF)paramList.get(83);
      f = ((PointF)paramList.get(55)).y;
      localPointF.y = ((((PointF)paramList.get(63)).y - ((PointF)paramList.get(55)).y) / 2.0F + f);
      localPointF = (PointF)paramList.get(84);
      f = ((PointF)paramList.get(23)).x;
      localPointF.x = ((((PointF)paramList.get(31)).x - ((PointF)paramList.get(23)).x) / 2.0F + f);
      localPointF = (PointF)paramList.get(84);
      f = ((PointF)paramList.get(23)).y;
      localPointF.y = ((((PointF)paramList.get(31)).y - ((PointF)paramList.get(23)).y) / 2.0F + f);
      localPointF = (PointF)paramList.get(85);
      f = ((PointF)paramList.get(59)).x;
      localPointF.x = ((((PointF)paramList.get(77)).x - ((PointF)paramList.get(59)).x) / 2.0F + f);
      localPointF = (PointF)paramList.get(85);
      f = ((PointF)paramList.get(59)).y;
      localPointF.y = ((((PointF)paramList.get(77)).y - ((PointF)paramList.get(59)).y) / 2.0F + f);
      localPointF = (PointF)paramList.get(86);
      f = ((PointF)paramList.get(35)).x;
      localPointF.x = (((PointF)paramList.get(35)).x - ((PointF)paramList.get(6)).x + f);
      localPointF = (PointF)paramList.get(86);
      f = ((PointF)paramList.get(35)).y;
      localPointF.y = (((PointF)paramList.get(35)).y - ((PointF)paramList.get(6)).y + f);
      localPointF = (PointF)paramList.get(87);
      f = ((PointF)paramList.get(64)).x;
      localPointF.x = ((((PointF)paramList.get(64)).x - ((PointF)paramList.get(9)).x) * 1.4F + f);
      localPointF = (PointF)paramList.get(87);
      f = ((PointF)paramList.get(64)).y;
      localPointF.y = ((((PointF)paramList.get(64)).y - ((PointF)paramList.get(9)).y) * 1.4F + f);
      localPointF = (PointF)paramList.get(88);
      f = ((PointF)paramList.get(45)).x;
      localPointF.x = (((PointF)paramList.get(45)).x - ((PointF)paramList.get(12)).x + f);
      localPointF = (PointF)paramList.get(88);
      f = ((PointF)paramList.get(45)).y;
      localPointF.y = (((PointF)paramList.get(45)).y - ((PointF)paramList.get(12)).y + f);
      localPointF = (PointF)paramList.get(89);
      f = ((PointF)paramList.get(83)).x;
      localPointF.x = (((PointF)paramList.get(83)).x - ((PointF)paramList.get(59)).x + f);
      localPointF = (PointF)paramList.get(89);
      f = ((PointF)paramList.get(83)).y;
      localPointF.y = (((PointF)paramList.get(83)).y - ((PointF)paramList.get(59)).y + f);
      AppMethodBeat.o(83873);
    }
  }

  public static PointF[] flatArray2Points(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(83870);
    if (paramArrayOfFloat == null)
    {
      paramArrayOfFloat = null;
      AppMethodBeat.o(83870);
    }
    while (true)
    {
      return paramArrayOfFloat;
      PointF[] arrayOfPointF = new PointF[paramArrayOfFloat.length / 2];
      for (int i = 0; i < paramArrayOfFloat.length / 2; i++)
        arrayOfPointF[i] = new PointF(paramArrayOfFloat[(i * 2)], paramArrayOfFloat[(i * 2 + 1)]);
      AppMethodBeat.o(83870);
      paramArrayOfFloat = arrayOfPointF;
    }
  }

  private static List<FaceParam> pickAvailableFaces(TTpicBitmapFaceDetect paramTTpicBitmapFaceDetect, int paramInt, HashMap<FaceParam, float[]> paramHashMap)
  {
    AppMethodBeat.i(83867);
    ArrayList localArrayList = new ArrayList();
    if ((paramTTpicBitmapFaceDetect.mFaceParams != null) && (paramTTpicBitmapFaceDetect.mFaceParams.size() > 0))
    {
      FaceParam localFaceParam;
      for (int i = 0; i < paramTTpicBitmapFaceDetect.mFaceParams.size(); i++)
      {
        localFaceParam = (FaceParam)paramTTpicBitmapFaceDetect.mFaceParams.get(i);
        if (checkLegalFace(localFaceParam, paramInt) != 1)
        {
          localArrayList.add(localFaceParam);
          if (paramHashMap != null)
            paramHashMap.put(localFaceParam, paramTTpicBitmapFaceDetect.getFaceAngles(i));
        }
      }
      if (localArrayList.isEmpty())
      {
        localFaceParam = (FaceParam)paramTTpicBitmapFaceDetect.mFaceParams.get(0);
        localArrayList.add(localFaceParam);
        if (paramHashMap != null)
          paramHashMap.put(localFaceParam, paramTTpicBitmapFaceDetect.getFaceAngles(0));
      }
    }
    AppMethodBeat.o(83867);
    return localArrayList;
  }

  public static PointF[] ulsee2Orig(PointF[] paramArrayOfPointF)
  {
    AppMethodBeat.i(83871);
    if (paramArrayOfPointF == null)
    {
      paramArrayOfPointF = null;
      AppMethodBeat.o(83871);
    }
    while (true)
    {
      return paramArrayOfPointF;
      PointF[] arrayOfPointF = new PointF[83];
      arrayOfPointF[0] = paramArrayOfPointF[0];
      arrayOfPointF[1] = AlgoUtils.middlePoint(paramArrayOfPointF[1], paramArrayOfPointF[2]);
      arrayOfPointF[2] = paramArrayOfPointF[3];
      arrayOfPointF[3] = AlgoUtils.middlePoint(paramArrayOfPointF[4], paramArrayOfPointF[5]);
      arrayOfPointF[4] = paramArrayOfPointF[6];
      arrayOfPointF[5] = paramArrayOfPointF[8];
      arrayOfPointF[6] = paramArrayOfPointF[10];
      arrayOfPointF[7] = paramArrayOfPointF[12];
      arrayOfPointF[8] = paramArrayOfPointF[14];
      arrayOfPointF[9] = paramArrayOfPointF[16];
      arrayOfPointF[10] = paramArrayOfPointF[18];
      arrayOfPointF[11] = paramArrayOfPointF[20];
      arrayOfPointF[12] = paramArrayOfPointF[22];
      arrayOfPointF[13] = paramArrayOfPointF[24];
      arrayOfPointF[14] = paramArrayOfPointF[26];
      arrayOfPointF[15] = AlgoUtils.middlePoint(paramArrayOfPointF[27], paramArrayOfPointF[28]);
      arrayOfPointF[16] = paramArrayOfPointF[29];
      arrayOfPointF[17] = AlgoUtils.middlePoint(paramArrayOfPointF[30], paramArrayOfPointF[31]);
      arrayOfPointF[18] = paramArrayOfPointF[32];
      arrayOfPointF[19] = paramArrayOfPointF[33];
      arrayOfPointF[20] = paramArrayOfPointF[64];
      arrayOfPointF[21] = paramArrayOfPointF[65];
      arrayOfPointF[22] = paramArrayOfPointF[66];
      arrayOfPointF[23] = paramArrayOfPointF[67];
      arrayOfPointF[24] = paramArrayOfPointF[36];
      arrayOfPointF[25] = paramArrayOfPointF[35];
      arrayOfPointF[26] = paramArrayOfPointF[34];
      arrayOfPointF[27] = paramArrayOfPointF[42];
      arrayOfPointF[28] = paramArrayOfPointF[71];
      arrayOfPointF[29] = paramArrayOfPointF[70];
      arrayOfPointF[30] = paramArrayOfPointF[69];
      arrayOfPointF[31] = paramArrayOfPointF[68];
      arrayOfPointF[32] = paramArrayOfPointF[39];
      arrayOfPointF[33] = paramArrayOfPointF[40];
      arrayOfPointF[34] = paramArrayOfPointF[41];
      arrayOfPointF[35] = paramArrayOfPointF[52];
      arrayOfPointF[36] = paramArrayOfPointF[57];
      arrayOfPointF[37] = paramArrayOfPointF[73];
      arrayOfPointF[38] = paramArrayOfPointF[56];
      arrayOfPointF[39] = paramArrayOfPointF[55];
      arrayOfPointF[40] = paramArrayOfPointF[54];
      arrayOfPointF[41] = paramArrayOfPointF[72];
      arrayOfPointF[42] = paramArrayOfPointF[53];
      arrayOfPointF[43] = paramArrayOfPointF[74];
      arrayOfPointF[44] = paramArrayOfPointF[104];
      arrayOfPointF[45] = paramArrayOfPointF[61];
      arrayOfPointF[46] = paramArrayOfPointF[62];
      arrayOfPointF[47] = paramArrayOfPointF[76];
      arrayOfPointF[48] = paramArrayOfPointF[63];
      arrayOfPointF[49] = paramArrayOfPointF[58];
      arrayOfPointF[50] = paramArrayOfPointF[59];
      arrayOfPointF[51] = paramArrayOfPointF[75];
      arrayOfPointF[52] = paramArrayOfPointF[60];
      arrayOfPointF[53] = paramArrayOfPointF[77];
      arrayOfPointF[54] = paramArrayOfPointF[105];
      arrayOfPointF[55] = paramArrayOfPointF[78];
      arrayOfPointF[56] = paramArrayOfPointF[80];
      arrayOfPointF[57] = paramArrayOfPointF[82];
      arrayOfPointF[58] = AlgoUtils.middlePoint(paramArrayOfPointF[47], paramArrayOfPointF[48]);
      arrayOfPointF[59] = paramArrayOfPointF[49];
      arrayOfPointF[60] = AlgoUtils.middlePoint(paramArrayOfPointF[50], paramArrayOfPointF[51]);
      arrayOfPointF[61] = paramArrayOfPointF[83];
      arrayOfPointF[62] = paramArrayOfPointF[81];
      arrayOfPointF[63] = paramArrayOfPointF[79];
      arrayOfPointF[64] = paramArrayOfPointF[46];
      arrayOfPointF[65] = paramArrayOfPointF[84];
      arrayOfPointF[66] = paramArrayOfPointF[90];
      arrayOfPointF[67] = paramArrayOfPointF[95];
      arrayOfPointF[68] = paramArrayOfPointF[94];
      arrayOfPointF[69] = paramArrayOfPointF[93];
      arrayOfPointF[70] = paramArrayOfPointF[92];
      arrayOfPointF[71] = paramArrayOfPointF[91];
      arrayOfPointF[72] = paramArrayOfPointF[101];
      arrayOfPointF[73] = paramArrayOfPointF[102];
      arrayOfPointF[74] = paramArrayOfPointF[103];
      arrayOfPointF[75] = paramArrayOfPointF[85];
      arrayOfPointF[76] = paramArrayOfPointF[86];
      arrayOfPointF[77] = paramArrayOfPointF[87];
      arrayOfPointF[78] = paramArrayOfPointF[88];
      arrayOfPointF[79] = paramArrayOfPointF[89];
      arrayOfPointF[80] = paramArrayOfPointF[99];
      arrayOfPointF[81] = paramArrayOfPointF[98];
      arrayOfPointF[82] = paramArrayOfPointF[97];
      AppMethodBeat.o(83871);
      paramArrayOfPointF = arrayOfPointF;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.FaceDetectUtil
 * JD-Core Version:    0.6.2
 */
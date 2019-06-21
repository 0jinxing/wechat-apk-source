package com.tencent.ttpic.util.youtu.bodydetector;

import android.graphics.PointF;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.manager.FeatureManager;
import com.tencent.ttpic.thread.FaceGestureDetGLThread.OnBodyDetListener;
import java.util.ArrayList;
import java.util.List;

public class BodyDetector
{
  private static int[] leftIndex;
  private static BodyDetector mInstance;
  private static int[] rightIndex;
  private final int DETECT_INTERVAL;
  private final int KEY_POINT_NUM_17;
  private final int KEY_POINT_NUM_59;
  boolean bodyDetected;
  private final Object dataLock;
  private Handler detectHandler;
  private int detectIndex;
  private float[] detector_confidence;
  private float[] detector_xmax;
  private float[] detector_xmin;
  private float[] detector_ymax;
  private float[] detector_ymin;
  private float[] fscore;
  private float[] fscore17;
  private volatile boolean inited;
  private boolean mHasRect;
  private float mPConfidence;
  private float mPxmax;
  private float mPxmin;
  private float mPymax;
  private float mPymin;
  private float[] ptX;
  private float[] ptX17;
  private float[] ptY;
  private float[] ptY17;

  static
  {
    AppMethodBeat.i(84427);
    leftIndex = new int[] { 13, 14, 15, 16, 17 };
    rightIndex = new int[] { 41, 42, 43, 44, 45 };
    if (FeatureManager.isBodyDetectionReady());
    while (true)
    {
      try
      {
        if (Build.VERSION.SDK_INT <= 17)
        {
          System.load("/data/data/com.tencent.xnet/lib/libxnet.so");
          FeatureManager.loadLibrary("bodydetector");
          AppMethodBeat.o(84427);
          return;
        }
        FeatureManager.loadLibrary("xnet");
        continue;
      }
      catch (Exception localException)
      {
        LogUtils.e(localException);
      }
      AppMethodBeat.o(84427);
    }
  }

  public BodyDetector()
  {
    AppMethodBeat.i(84420);
    this.DETECT_INTERVAL = 10;
    this.KEY_POINT_NUM_59 = 59;
    this.KEY_POINT_NUM_17 = 17;
    this.detectIndex = 0;
    this.inited = false;
    this.ptX17 = new float[17];
    this.ptY17 = new float[17];
    this.fscore17 = new float[17];
    this.bodyDetected = false;
    this.dataLock = new Object();
    this.mHasRect = false;
    this.ptX = new float[59];
    this.ptY = new float[59];
    this.fscore = new float[59];
    this.detector_xmin = new float[59];
    this.detector_ymin = new float[59];
    this.detector_xmax = new float[59];
    this.detector_ymax = new float[59];
    this.detector_confidence = new float[59];
    AppMethodBeat.o(84420);
  }

  public static BodyDetector getInstance()
  {
    try
    {
      AppMethodBeat.i(84421);
      if (mInstance == null)
      {
        localBodyDetector = new com/tencent/ttpic/util/youtu/bodydetector/BodyDetector;
        localBodyDetector.<init>();
        mInstance = localBodyDetector;
      }
      BodyDetector localBodyDetector = mInstance;
      AppMethodBeat.o(84421);
      return localBodyDetector;
    }
    finally
    {
    }
  }

  private void updatePreviousRect(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    int i = leftIndex.length;
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    while (j < i)
    {
      f4 = (paramArrayOfFloat1[rightIndex[j]] + paramArrayOfFloat1[leftIndex[j]]) / 2.0F;
      f1 += (paramArrayOfFloat2[rightIndex[j]] + paramArrayOfFloat2[leftIndex[j]]) / 2.0F;
      f3 += paramArrayOfFloat1[rightIndex[j]] - paramArrayOfFloat1[leftIndex[j]];
      j++;
      f2 = f4 + f2;
    }
    f2 /= i;
    f1 /= i;
    float f4 = (float)(f3 / i * 1.5D);
    f3 = 4.0F * f4;
    this.mPxmin = (f2 - f4 / 2.0F);
    this.mPxmax = (f2 + f4 / 2.0F);
    this.mPymin = (f1 - f3 / 2.0F);
    this.mPymax = (f3 / 2.0F + f1);
  }

  public void destroy()
  {
    AppMethodBeat.i(84423);
    if (this.inited)
    {
      nativeDestroy();
      this.inited = false;
    }
    if (this.detectHandler != null)
      this.detectHandler.getLooper().quit();
    AppMethodBeat.o(84423);
  }

  public List<BodyDetectResult> detectBody(byte[] arg1, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84424);
    ArrayList localArrayList = new ArrayList();
    if (!this.inited)
      AppMethodBeat.o(84424);
    while (true)
    {
      return localArrayList;
      if (this.detectIndex % 10 == 0)
        this.detectHandler.post(new BodyDetector.1(this, ???, paramInt1, paramInt2));
      synchronized (this.dataLock)
      {
        if (this.bodyDetected)
        {
          BodyDetectResult localBodyDetectResult = new com/tencent/ttpic/util/youtu/bodydetector/BodyDetectResult;
          localBodyDetectResult.<init>();
          Object localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          localBodyDetectResult.bodyPoints = ((List)localObject2);
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          localBodyDetectResult.bodyPointScores = ((List)localObject2);
          for (paramInt1 = 0; paramInt1 < 59; paramInt1++)
          {
            localObject2 = new android/graphics/PointF;
            ((PointF)localObject2).<init>(this.ptX[paramInt1], this.ptY[paramInt1]);
            localBodyDetectResult.bodyPoints.add(localObject2);
            localBodyDetectResult.bodyPointScores.add(Float.valueOf(this.fscore[paramInt1]));
          }
          localArrayList.add(localBodyDetectResult);
        }
        this.detectIndex += 1;
        AppMethodBeat.o(84424);
      }
    }
  }

  public void detectBody(FaceGestureDetGLThread.OnBodyDetListener paramOnBodyDetListener, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84425);
    if (!this.inited)
    {
      paramOnBodyDetListener.onBodyDataReady(new ArrayList());
      AppMethodBeat.o(84425);
    }
    while (true)
    {
      return;
      this.detectHandler.post(new BodyDetector.2(this, paramArrayOfByte, paramInt1, paramInt2, paramOnBodyDetListener));
      AppMethodBeat.o(84425);
    }
  }

  // ERROR //
  public void init()
  {
    // Byte code:
    //   0: ldc_w 266
    //   3: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 61	com/tencent/ttpic/manager/FeatureManager:isBodyDetectionReady	()Z
    //   9: ifeq +10 -> 19
    //   12: aload_0
    //   13: getfield 105	com/tencent/ttpic/util/youtu/bodydetector/BodyDetector:inited	Z
    //   16: ifeq +10 -> 26
    //   19: ldc_w 266
    //   22: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: return
    //   26: ldc_w 268
    //   29: invokestatic 272	com/tencent/ttpic/manager/FeatureManager:getModelStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   32: astore_1
    //   33: aload_1
    //   34: invokevirtual 278	java/io/InputStream:available	()I
    //   37: newarray byte
    //   39: astore_2
    //   40: aload_1
    //   41: aload_2
    //   42: invokevirtual 282	java/io/InputStream:read	([B)I
    //   45: pop
    //   46: aload_1
    //   47: invokevirtual 285	java/io/InputStream:close	()V
    //   50: aload_2
    //   51: astore_1
    //   52: ldc_w 287
    //   55: invokestatic 272	com/tencent/ttpic/manager/FeatureManager:getModelStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   58: astore_3
    //   59: aload_3
    //   60: invokevirtual 278	java/io/InputStream:available	()I
    //   63: newarray byte
    //   65: astore_2
    //   66: aload_3
    //   67: aload_2
    //   68: invokevirtual 282	java/io/InputStream:read	([B)I
    //   71: pop
    //   72: aload_3
    //   73: invokevirtual 285	java/io/InputStream:close	()V
    //   76: aload_2
    //   77: astore_3
    //   78: ldc_w 289
    //   81: invokestatic 272	com/tencent/ttpic/manager/FeatureManager:getModelStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   84: astore 4
    //   86: aload 4
    //   88: invokevirtual 278	java/io/InputStream:available	()I
    //   91: newarray byte
    //   93: astore_2
    //   94: aload 4
    //   96: aload_2
    //   97: invokevirtual 282	java/io/InputStream:read	([B)I
    //   100: pop
    //   101: aload 4
    //   103: invokevirtual 285	java/io/InputStream:close	()V
    //   106: aload_2
    //   107: astore 4
    //   109: ldc_w 291
    //   112: invokestatic 272	com/tencent/ttpic/manager/FeatureManager:getModelStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   115: astore 5
    //   117: aload 5
    //   119: invokevirtual 278	java/io/InputStream:available	()I
    //   122: newarray byte
    //   124: astore_2
    //   125: aload 5
    //   127: aload_2
    //   128: invokevirtual 282	java/io/InputStream:read	([B)I
    //   131: pop
    //   132: aload 5
    //   134: invokevirtual 285	java/io/InputStream:close	()V
    //   137: aload_2
    //   138: astore 5
    //   140: ldc_w 293
    //   143: invokestatic 272	com/tencent/ttpic/manager/FeatureManager:getModelStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   146: astore 6
    //   148: aload 6
    //   150: invokevirtual 278	java/io/InputStream:available	()I
    //   153: newarray byte
    //   155: astore_2
    //   156: aload 6
    //   158: aload_2
    //   159: invokevirtual 282	java/io/InputStream:read	([B)I
    //   162: pop
    //   163: aload 6
    //   165: invokevirtual 285	java/io/InputStream:close	()V
    //   168: aload_2
    //   169: astore 6
    //   171: ldc_w 295
    //   174: invokestatic 272	com/tencent/ttpic/manager/FeatureManager:getModelStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   177: astore 7
    //   179: aload 7
    //   181: invokevirtual 278	java/io/InputStream:available	()I
    //   184: newarray byte
    //   186: astore_2
    //   187: aload 7
    //   189: aload_2
    //   190: invokevirtual 282	java/io/InputStream:read	([B)I
    //   193: pop
    //   194: aload 7
    //   196: invokevirtual 285	java/io/InputStream:close	()V
    //   199: new 297	android/os/HandlerThread
    //   202: dup
    //   203: ldc_w 299
    //   206: invokespecial 301	android/os/HandlerThread:<init>	(Ljava/lang/String;)V
    //   209: astore 7
    //   211: aload 7
    //   213: invokevirtual 304	android/os/HandlerThread:start	()V
    //   216: aload_0
    //   217: new 198	android/os/Handler
    //   220: dup
    //   221: aload 7
    //   223: invokevirtual 305	android/os/HandlerThread:getLooper	()Landroid/os/Looper;
    //   226: invokespecial 308	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   229: putfield 196	com/tencent/ttpic/util/youtu/bodydetector/BodyDetector:detectHandler	Landroid/os/Handler;
    //   232: aload_0
    //   233: aload_0
    //   234: aload_1
    //   235: aload_3
    //   236: aload 4
    //   238: aload 5
    //   240: aconst_null
    //   241: aconst_null
    //   242: aload 6
    //   244: aload_2
    //   245: invokevirtual 312	com/tencent/ttpic/util/youtu/bodydetector/BodyDetector:nativeInit	([B[B[B[B[B[B[B[B)Z
    //   248: putfield 105	com/tencent/ttpic/util/youtu/bodydetector/BodyDetector:inited	Z
    //   251: ldc_w 266
    //   254: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: goto -232 -> 25
    //   260: astore_1
    //   261: aconst_null
    //   262: astore_2
    //   263: aload_1
    //   264: invokestatic 90	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   267: aload_2
    //   268: astore_1
    //   269: goto -217 -> 52
    //   272: astore_3
    //   273: aconst_null
    //   274: astore_2
    //   275: aload_3
    //   276: invokestatic 90	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   279: aload_2
    //   280: astore_3
    //   281: goto -203 -> 78
    //   284: astore 4
    //   286: aconst_null
    //   287: astore_2
    //   288: aload 4
    //   290: invokestatic 90	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   293: aload_2
    //   294: astore 4
    //   296: goto -187 -> 109
    //   299: astore 5
    //   301: aconst_null
    //   302: astore_2
    //   303: aload 5
    //   305: invokestatic 90	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   308: aload_2
    //   309: astore 5
    //   311: goto -171 -> 140
    //   314: astore 6
    //   316: aconst_null
    //   317: astore_2
    //   318: aload 6
    //   320: invokestatic 90	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   323: aload_2
    //   324: astore 6
    //   326: goto -155 -> 171
    //   329: astore 7
    //   331: aconst_null
    //   332: astore_2
    //   333: aload 7
    //   335: invokestatic 90	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   338: goto -139 -> 199
    //   341: astore 7
    //   343: goto -10 -> 333
    //   346: astore 6
    //   348: goto -30 -> 318
    //   351: astore 5
    //   353: goto -50 -> 303
    //   356: astore 4
    //   358: goto -70 -> 288
    //   361: astore_3
    //   362: goto -87 -> 275
    //   365: astore_1
    //   366: goto -103 -> 263
    //
    // Exception table:
    //   from	to	target	type
    //   26	40	260	java/lang/Exception
    //   52	66	272	java/lang/Exception
    //   78	94	284	java/lang/Exception
    //   109	125	299	java/lang/Exception
    //   140	156	314	java/lang/Exception
    //   171	187	329	java/lang/Exception
    //   187	199	341	java/lang/Exception
    //   156	168	346	java/lang/Exception
    //   125	137	351	java/lang/Exception
    //   94	106	356	java/lang/Exception
    //   66	76	361	java/lang/Exception
    //   40	50	365	java/lang/Exception
  }

  public boolean isInited()
  {
    return this.inited;
  }

  public native boolean nativeBodyDetect(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, float[] paramArrayOfFloat4, float[] paramArrayOfFloat5, int[] paramArrayOfInt);

  public native boolean nativeBodyKeypoint(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3);

  public native boolean nativeDestroy();

  public native boolean nativeDetectBody(byte[] paramArrayOfByte, int paramInt1, int paramInt2, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, float[] paramArrayOfFloat4, float[] paramArrayOfFloat5, float[] paramArrayOfFloat6, int paramInt3, int paramInt4, int paramInt5);

  public native boolean nativeInit(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8);

  public void reset()
  {
    this.detectIndex = 0;
    this.bodyDetected = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.bodydetector.BodyDetector
 * JD-Core Version:    0.6.2
 */
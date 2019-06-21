package com.tencent.mm.plugin.facedetectlight.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.TextureView.SurfaceTextureListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.memory.a;
import com.tencent.mm.plugin.facedetect.model.d.b;
import com.tencent.mm.plugin.facedetectaction.b.a.a;
import com.tencent.mm.plugin.facedetectaction.ui.FaceActionMask;
import com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMTextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class b
  implements TextureView.SurfaceTextureListener
{
  public String edV;
  private Bitmap faceBitmap;
  private d.a.a fbb;
  private boolean isFrontCamera;
  private Point lUF;
  private Point lUG;
  private Point lUH;
  private boolean lUI;
  private int lUJ;
  private Point lUM;
  public byte[] lWX;
  public boolean lXB;
  public String mAppId;
  private Context mContext;
  int mDesiredPreviewHeight;
  int mDesiredPreviewWidth;
  private boolean mIsCameraOpened;
  private Camera.PreviewCallback man;
  d.b mao;
  public int mbW;
  public String mbX;
  private FaceActionUI mbY;
  public FaceActionMask mcP;
  private a.a mca;
  public PreviewFrameLayout mdA;
  private int mdB;
  public String mdC;
  public ImageView mdD;
  public ImageView mdE;
  private boolean mdF;
  private int mdG;
  private al mdH;
  private com.tencent.mm.plugin.facedetectlight.ui.a.b mdI;
  private MMTextureView mdt;
  private HandlerThread mdu;
  private ak mdv;
  public t mdw;
  public boolean mdx;
  public TextView mdy;
  public FaceReflectMask mdz;

  public b(Context paramContext, com.tencent.mm.plugin.facedetectlight.ui.a.b paramb)
  {
    AppMethodBeat.i(772);
    this.lUF = null;
    this.lUG = null;
    this.lUH = null;
    this.lUM = null;
    this.mdB = 0;
    this.mdH = new al("mPreviewHandlerThread");
    this.mao = new d.b()
    {
      public final void aT(byte[] paramAnonymousArrayOfByte)
      {
        AppMethodBeat.i(771);
        com.tencent.mm.plugin.facedetect.model.c.lTA.g(paramAnonymousArrayOfByte);
        AppMethodBeat.o(771);
      }

      public final a<byte[]> bsr()
      {
        return com.tencent.mm.plugin.facedetect.model.c.lTA;
      }
    };
    this.man = new b.2(this);
    this.mdI = paramb;
    this.mdG = 1;
    this.mContext = paramContext;
    this.mIsCameraOpened = false;
    this.lXB = false;
    this.mdu = null;
    this.mIsCameraOpened = false;
    AppMethodBeat.o(772);
  }

  public b(FaceActionUI paramFaceActionUI, a.a parama)
  {
    AppMethodBeat.i(773);
    this.lUF = null;
    this.lUG = null;
    this.lUH = null;
    this.lUM = null;
    this.mdB = 0;
    this.mdH = new al("mPreviewHandlerThread");
    this.mao = new d.b()
    {
      public final void aT(byte[] paramAnonymousArrayOfByte)
      {
        AppMethodBeat.i(771);
        com.tencent.mm.plugin.facedetect.model.c.lTA.g(paramAnonymousArrayOfByte);
        AppMethodBeat.o(771);
      }

      public final a<byte[]> bsr()
      {
        return com.tencent.mm.plugin.facedetect.model.c.lTA;
      }
    };
    this.man = new b.2(this);
    this.mdG = 2;
    this.mbY = paramFaceActionUI;
    this.mIsCameraOpened = false;
    this.lXB = false;
    this.mdu = null;
    this.mIsCameraOpened = false;
    this.mdF = false;
    this.mca = parama;
    AppMethodBeat.o(773);
  }

  private static Point a(Camera.Parameters paramParameters, Point paramPoint)
  {
    AppMethodBeat.i(782);
    Object localObject = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject, new b.a((byte)0));
    Point localPoint = null;
    float f1 = paramPoint.x / paramPoint.y;
    ab.d("MicroMsg.FaceReflectCam", "screen.x: %d, screen.y: %d, ratio: %f", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f1) });
    long l = bo.gO(ah.getContext());
    ab.d("MicroMsg.FaceReflectCam", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(l) });
    int i = paramPoint.x;
    i = paramPoint.y;
    float f2 = (1.0F / 1.0F);
    localObject = ((List)localObject).iterator();
    int j;
    label235: float f3;
    while (((Iterator)localObject).hasNext())
    {
      Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
      j = localSize.width;
      i = localSize.height;
      ab.i("MicroMsg.FaceReflectCam", "realWidth: %d, realHeight: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      int k = j * i;
      if ((k >= 150400) && (k <= 983040))
      {
        if (j > i)
        {
          m = 1;
          if (m == 0)
            break label342;
          k = i;
          if (m == 0)
            break label349;
        }
        label342: label349: for (int m = j; ; m = i)
        {
          ab.d("MicroMsg.FaceReflectCam", "maybeFlippedWidth: %d, maybeFlippedHeight: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
          if ((k != paramPoint.x) || (m != paramPoint.y) || (!f(k, m, l)))
            break label356;
          paramPoint = new Point(j, i);
          ab.i("MicroMsg.FaceReflectCam", "Found preview size exactly matching screen size: ".concat(String.valueOf(paramPoint)));
          AppMethodBeat.o(782);
          return paramPoint;
          m = 0;
          break;
          k = j;
          break label235;
        }
        label356: f3 = Math.abs(k / m - f1);
        if (j % 10 == 0)
        {
          if ((f3 >= f2) || (!f(j, i, l)))
            break label545;
          localPoint = new Point(j, i);
          f2 = f3;
        }
      }
    }
    label532: label545: 
    while (true)
    {
      ab.i("MicroMsg.FaceReflectCam", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", new Object[] { Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(j), Integer.valueOf(i) });
      break;
      paramPoint = localPoint;
      if (localPoint == null)
      {
        paramParameters = paramParameters.getPreviewSize();
        if (paramParameters == null)
          break label532;
        paramPoint = new Point(paramParameters.width, paramParameters.height);
        ab.i("MicroMsg.FaceReflectCam", "No suitable preview sizes, using default: ".concat(String.valueOf(paramPoint)));
      }
      while (true)
      {
        ab.i("MicroMsg.FaceReflectCam", "Found best approximate preview size: ".concat(String.valueOf(paramPoint)));
        AppMethodBeat.o(782);
        break;
        ab.e("MicroMsg.FaceReflectCam", "hy: can not find default size!!");
        paramPoint = localPoint;
      }
    }
  }

  private static void b(Camera.Parameters paramParameters)
  {
    AppMethodBeat.i(783);
    if (q.etc.eri > 0)
    {
      ab.i("MicroMsg.FaceReflectCam", "set frame rate > 0, do not try set preview fps range");
      AppMethodBeat.o(783);
    }
    List localList;
    while (true)
    {
      return;
      localList = paramParameters.getSupportedPreviewFpsRange();
      if ((localList != null) && (localList.size() != 0))
        break;
      AppMethodBeat.o(783);
    }
    int i = -2147483648;
    int j = -2147483648;
    int k = 0;
    int m = localList.size();
    int n = 0;
    label79: int i1;
    int i2;
    int i5;
    if (n < m)
    {
      int[] arrayOfInt = (int[])localList.get(n);
      i1 = j;
      i2 = i;
      if (arrayOfInt == null)
        break label398;
      i1 = j;
      i2 = i;
      if (arrayOfInt.length <= 1)
        break label398;
      int i3 = arrayOfInt[0];
      int i4 = arrayOfInt[1];
      ab.i("MicroMsg.FaceReflectCam", "dkfps %d:[%d %d]", new Object[] { Integer.valueOf(n), Integer.valueOf(i3), Integer.valueOf(i4) });
      i1 = j;
      i2 = i;
      if (i3 < 0)
        break label398;
      i1 = j;
      i2 = i;
      if (i4 < i3)
        break label398;
      i5 = j;
      int i6 = i;
      if (i4 >= j)
      {
        i5 = j;
        i6 = i;
        if (k == 0)
        {
          i5 = i4;
          i6 = i3;
        }
      }
      i1 = i5;
      i2 = i6;
      if (i4 < 30000)
        break label398;
      k = 1;
      i = i6;
      j = i5;
      i5 = k;
    }
    while (true)
    {
      while (true)
      {
        n++;
        k = i5;
        break label79;
        ab.i("MicroMsg.FaceReflectCam", "dkfps get fit  [%d %d], max target fps %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(30) });
        if ((i == 2147483647) || (j == 2147483647))
        {
          AppMethodBeat.o(783);
          break;
        }
        try
        {
          paramParameters.setPreviewFpsRange(i, j);
          ab.i("MicroMsg.FaceReflectCam", "set fps range %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          AppMethodBeat.o(783);
        }
        catch (Exception paramParameters)
        {
          ab.i("MicroMsg.FaceReflectCam", "trySetPreviewFpsRangeParameters Exception, %s, %s", new Object[] { Looper.myLooper(), paramParameters.getMessage() });
          AppMethodBeat.o(783);
        }
      }
      break;
      label398: i5 = k;
      j = i1;
      i = i2;
    }
  }

  // ERROR //
  private boolean btV()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: sipush 778
    //   5: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 177
    //   10: ldc_w 403
    //   13: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield 125	com/tencent/mm/plugin/facedetectlight/ui/b:mIsCameraOpened	Z
    //   21: aload_0
    //   22: iconst_1
    //   23: putfield 405	com/tencent/mm/plugin/facedetectlight/ui/b:isFrontCamera	Z
    //   26: invokestatic 410	android/hardware/Camera:getNumberOfCameras	()I
    //   29: istore_2
    //   30: iconst_0
    //   31: istore_3
    //   32: iload_3
    //   33: iload_2
    //   34: if_icmpge +1369 -> 1403
    //   37: new 412	android/hardware/Camera$CameraInfo
    //   40: dup
    //   41: invokespecial 413	android/hardware/Camera$CameraInfo:<init>	()V
    //   44: astore 4
    //   46: iload_3
    //   47: aload 4
    //   49: invokestatic 417	android/hardware/Camera:getCameraInfo	(ILandroid/hardware/Camera$CameraInfo;)V
    //   52: aload 4
    //   54: getfield 420	android/hardware/Camera$CameraInfo:facing	I
    //   57: iconst_1
    //   58: if_icmpne +166 -> 224
    //   61: aload_0
    //   62: getfield 405	com/tencent/mm/plugin/facedetectlight/ui/b:isFrontCamera	Z
    //   65: ifeq +159 -> 224
    //   68: ldc 177
    //   70: ldc_w 422
    //   73: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: invokestatic 428	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   79: lstore 5
    //   81: ldc 177
    //   83: new 300	java/lang/StringBuilder
    //   86: dup
    //   87: ldc_w 430
    //   90: invokespecial 303	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: aload_0
    //   94: getfield 432	com/tencent/mm/plugin/facedetectlight/ui/b:fbb	Lcom/tencent/mm/compatible/e/d$a$a;
    //   97: invokevirtual 435	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: aload_0
    //   107: getfield 432	com/tencent/mm/plugin/facedetectlight/ui/b:fbb	Lcom/tencent/mm/compatible/e/d$a$a;
    //   110: ifnonnull +40 -> 150
    //   113: ldc 177
    //   115: ldc_w 437
    //   118: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   121: aload_0
    //   122: getfield 121	com/tencent/mm/plugin/facedetectlight/ui/b:mdG	I
    //   125: iconst_1
    //   126: if_icmpne +130 -> 256
    //   129: ldc 177
    //   131: ldc_w 439
    //   134: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: aload_0
    //   138: aload_0
    //   139: getfield 123	com/tencent/mm/plugin/facedetectlight/ui/b:mContext	Landroid/content/Context;
    //   142: iload_3
    //   143: aconst_null
    //   144: invokestatic 444	com/tencent/mm/compatible/e/d:a	(Landroid/content/Context;ILandroid/os/Looper;)Lcom/tencent/mm/compatible/e/d$a$a;
    //   147: putfield 432	com/tencent/mm/plugin/facedetectlight/ui/b:fbb	Lcom/tencent/mm/compatible/e/d$a$a;
    //   150: aload_0
    //   151: getfield 432	com/tencent/mm/plugin/facedetectlight/ui/b:fbb	Lcom/tencent/mm/compatible/e/d$a$a;
    //   154: ifnonnull +132 -> 286
    //   157: ldc 177
    //   159: ldc_w 446
    //   162: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   165: new 296	java/io/IOException
    //   168: astore 4
    //   170: aload 4
    //   172: invokespecial 447	java/io/IOException:<init>	()V
    //   175: sipush 778
    //   178: invokestatic 132	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: aload 4
    //   183: athrow
    //   184: astore 4
    //   186: ldc 177
    //   188: new 300	java/lang/StringBuilder
    //   191: dup
    //   192: ldc_w 449
    //   195: invokespecial 303	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   198: aload 4
    //   200: invokevirtual 345	java/io/IOException:getMessage	()Ljava/lang/String;
    //   203: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   212: sipush 778
    //   215: invokestatic 132	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   218: iload_1
    //   219: istore 7
    //   221: iload 7
    //   223: ireturn
    //   224: aload 4
    //   226: getfield 420	android/hardware/Camera$CameraInfo:facing	I
    //   229: ifne +21 -> 250
    //   232: aload_0
    //   233: getfield 405	com/tencent/mm/plugin/facedetectlight/ui/b:isFrontCamera	Z
    //   236: ifne +14 -> 250
    //   239: ldc 177
    //   241: ldc_w 422
    //   244: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   247: goto -171 -> 76
    //   250: iinc 3 1
    //   253: goto -221 -> 32
    //   256: ldc 177
    //   258: ldc_w 451
    //   261: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   264: aload_0
    //   265: aload_0
    //   266: getfield 136	com/tencent/mm/plugin/facedetectlight/ui/b:mbY	Lcom/tencent/mm/plugin/facedetectaction/ui/FaceActionUI;
    //   269: getfield 457	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   272: getfield 463	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   275: iload_3
    //   276: aconst_null
    //   277: invokestatic 444	com/tencent/mm/compatible/e/d:a	(Landroid/content/Context;ILandroid/os/Looper;)Lcom/tencent/mm/compatible/e/d$a$a;
    //   280: putfield 432	com/tencent/mm/plugin/facedetectlight/ui/b:fbb	Lcom/tencent/mm/compatible/e/d$a$a;
    //   283: goto -133 -> 150
    //   286: aload_0
    //   287: iload_3
    //   288: putfield 98	com/tencent/mm/plugin/facedetectlight/ui/b:mdB	I
    //   291: aload_0
    //   292: iconst_1
    //   293: putfield 125	com/tencent/mm/plugin/facedetectlight/ui/b:mIsCameraOpened	Z
    //   296: ldc 177
    //   298: ldc_w 465
    //   301: iconst_2
    //   302: anewarray 4	java/lang/Object
    //   305: dup
    //   306: iconst_0
    //   307: iload_3
    //   308: invokestatic 185	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   311: aastore
    //   312: dup
    //   313: iconst_1
    //   314: lload 5
    //   316: invokestatic 469	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   319: invokestatic 215	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   322: aastore
    //   323: invokestatic 196	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: aload_0
    //   327: aload_0
    //   328: getfield 432	com/tencent/mm/plugin/facedetectlight/ui/b:fbb	Lcom/tencent/mm/compatible/e/d$a$a;
    //   331: getfield 474	com/tencent/mm/compatible/e/d$a$a:rotate	I
    //   334: putfield 476	com/tencent/mm/plugin/facedetectlight/ui/b:lUJ	I
    //   337: aload_0
    //   338: getfield 432	com/tencent/mm/plugin/facedetectlight/ui/b:fbb	Lcom/tencent/mm/compatible/e/d$a$a;
    //   341: getfield 474	com/tencent/mm/compatible/e/d$a$a:rotate	I
    //   344: sipush 180
    //   347: irem
    //   348: ifeq +740 -> 1088
    //   351: iconst_1
    //   352: istore 7
    //   354: aload_0
    //   355: iload 7
    //   357: putfield 478	com/tencent/mm/plugin/facedetectlight/ui/b:lUI	Z
    //   360: aload_0
    //   361: aload_0
    //   362: getfield 432	com/tencent/mm/plugin/facedetectlight/ui/b:fbb	Lcom/tencent/mm/compatible/e/d$a$a;
    //   365: getfield 481	com/tencent/mm/compatible/e/d$a$a:erH	Lcom/tencent/mm/compatible/e/t;
    //   368: putfield 313	com/tencent/mm/plugin/facedetectlight/ui/b:mdw	Lcom/tencent/mm/compatible/e/t;
    //   371: aload_0
    //   372: getfield 313	com/tencent/mm/plugin/facedetectlight/ui/b:mdw	Lcom/tencent/mm/compatible/e/t;
    //   375: ifnonnull +72 -> 447
    //   378: ldc 177
    //   380: ldc_w 483
    //   383: iconst_1
    //   384: anewarray 4	java/lang/Object
    //   387: dup
    //   388: iconst_0
    //   389: aload_0
    //   390: getfield 478	com/tencent/mm/plugin/facedetectlight/ui/b:lUI	Z
    //   393: invokestatic 488	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   396: aastore
    //   397: invokestatic 490	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   400: new 296	java/io/IOException
    //   403: astore 4
    //   405: aload 4
    //   407: invokespecial 447	java/io/IOException:<init>	()V
    //   410: sipush 778
    //   413: invokestatic 132	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   416: aload 4
    //   418: athrow
    //   419: astore 4
    //   421: ldc 177
    //   423: new 300	java/lang/StringBuilder
    //   426: dup
    //   427: ldc_w 492
    //   430: invokespecial 303	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   433: aload 4
    //   435: invokevirtual 345	java/io/IOException:getMessage	()Ljava/lang/String;
    //   438: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   444: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   447: aload_0
    //   448: getfield 313	com/tencent/mm/plugin/facedetectlight/ui/b:mdw	Lcom/tencent/mm/compatible/e/t;
    //   451: invokevirtual 496	com/tencent/mm/compatible/e/t:getParameters	()Landroid/hardware/Camera$Parameters;
    //   454: astore 8
    //   456: aload_0
    //   457: getfield 121	com/tencent/mm/plugin/facedetectlight/ui/b:mdG	I
    //   460: iconst_1
    //   461: if_icmpne +669 -> 1130
    //   464: aload_0
    //   465: getfield 123	com/tencent/mm/plugin/facedetectlight/ui/b:mContext	Landroid/content/Context;
    //   468: invokevirtual 502	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   471: invokevirtual 508	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   474: getfield 513	android/util/DisplayMetrics:widthPixels	I
    //   477: istore_3
    //   478: aload_0
    //   479: getfield 123	com/tencent/mm/plugin/facedetectlight/ui/b:mContext	Landroid/content/Context;
    //   482: invokevirtual 502	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   485: invokevirtual 508	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   488: getfield 516	android/util/DisplayMetrics:heightPixels	I
    //   491: istore_2
    //   492: aload_0
    //   493: new 169	android/graphics/Point
    //   496: dup
    //   497: iload_3
    //   498: iload_2
    //   499: invokespecial 255	android/graphics/Point:<init>	(II)V
    //   502: putfield 92	com/tencent/mm/plugin/facedetectlight/ui/b:lUG	Landroid/graphics/Point;
    //   505: aload_0
    //   506: getfield 92	com/tencent/mm/plugin/facedetectlight/ui/b:lUG	Landroid/graphics/Point;
    //   509: astore 9
    //   511: aload_0
    //   512: getfield 94	com/tencent/mm/plugin/facedetectlight/ui/b:lUH	Landroid/graphics/Point;
    //   515: astore 10
    //   517: aload 8
    //   519: ldc_w 518
    //   522: invokevirtual 520	android/hardware/Camera$Parameters:get	(Ljava/lang/String;)Ljava/lang/String;
    //   525: astore 11
    //   527: aload 11
    //   529: astore 4
    //   531: aload 11
    //   533: ifnonnull +13 -> 546
    //   536: aload 8
    //   538: ldc_w 522
    //   541: invokevirtual 520	android/hardware/Camera$Parameters:get	(Ljava/lang/String;)Ljava/lang/String;
    //   544: astore 4
    //   546: aload 4
    //   548: ifnull +849 -> 1397
    //   551: ldc 177
    //   553: ldc_w 524
    //   556: aload 4
    //   558: invokestatic 262	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   561: invokevirtual 266	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   564: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   567: aload 8
    //   569: aload 9
    //   571: invokestatic 526	com/tencent/mm/plugin/facedetectlight/ui/b:a	(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;)Landroid/graphics/Point;
    //   574: astore 4
    //   576: aload 4
    //   578: astore 11
    //   580: aload 4
    //   582: ifnonnull +30 -> 612
    //   585: new 169	android/graphics/Point
    //   588: dup
    //   589: aload 10
    //   591: getfield 172	android/graphics/Point:x	I
    //   594: iconst_3
    //   595: ishr
    //   596: iconst_3
    //   597: ishl
    //   598: aload 10
    //   600: getfield 175	android/graphics/Point:y	I
    //   603: iconst_3
    //   604: ishr
    //   605: iconst_3
    //   606: ishl
    //   607: invokespecial 255	android/graphics/Point:<init>	(II)V
    //   610: astore 11
    //   612: aload_0
    //   613: aload 11
    //   615: putfield 90	com/tencent/mm/plugin/facedetectlight/ui/b:lUF	Landroid/graphics/Point;
    //   618: aload_0
    //   619: new 169	android/graphics/Point
    //   622: dup
    //   623: aload_0
    //   624: getfield 90	com/tencent/mm/plugin/facedetectlight/ui/b:lUF	Landroid/graphics/Point;
    //   627: invokespecial 529	android/graphics/Point:<init>	(Landroid/graphics/Point;)V
    //   630: putfield 96	com/tencent/mm/plugin/facedetectlight/ui/b:lUM	Landroid/graphics/Point;
    //   633: ldc 177
    //   635: new 300	java/lang/StringBuilder
    //   638: dup
    //   639: ldc_w 531
    //   642: invokespecial 303	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   645: aload_0
    //   646: getfield 92	com/tencent/mm/plugin/facedetectlight/ui/b:lUG	Landroid/graphics/Point;
    //   649: invokevirtual 435	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   652: ldc_w 533
    //   655: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   658: aload_0
    //   659: getfield 90	com/tencent/mm/plugin/facedetectlight/ui/b:lUF	Landroid/graphics/Point;
    //   662: invokevirtual 435	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   665: ldc_w 535
    //   668: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: aload_0
    //   672: getfield 96	com/tencent/mm/plugin/facedetectlight/ui/b:lUM	Landroid/graphics/Point;
    //   675: invokevirtual 435	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   678: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   681: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   684: aload_0
    //   685: aload_0
    //   686: getfield 90	com/tencent/mm/plugin/facedetectlight/ui/b:lUF	Landroid/graphics/Point;
    //   689: getfield 172	android/graphics/Point:x	I
    //   692: putfield 321	com/tencent/mm/plugin/facedetectlight/ui/b:mDesiredPreviewWidth	I
    //   695: aload_0
    //   696: aload_0
    //   697: getfield 90	com/tencent/mm/plugin/facedetectlight/ui/b:lUF	Landroid/graphics/Point;
    //   700: getfield 175	android/graphics/Point:y	I
    //   703: putfield 323	com/tencent/mm/plugin/facedetectlight/ui/b:mDesiredPreviewHeight	I
    //   706: aload 8
    //   708: aload_0
    //   709: getfield 321	com/tencent/mm/plugin/facedetectlight/ui/b:mDesiredPreviewWidth	I
    //   712: aload_0
    //   713: getfield 323	com/tencent/mm/plugin/facedetectlight/ui/b:mDesiredPreviewHeight	I
    //   716: invokevirtual 538	android/hardware/Camera$Parameters:setPreviewSize	(II)V
    //   719: ldc 177
    //   721: new 300	java/lang/StringBuilder
    //   724: dup
    //   725: ldc_w 540
    //   728: invokespecial 303	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   731: aload_0
    //   732: getfield 321	com/tencent/mm/plugin/facedetectlight/ui/b:mDesiredPreviewWidth	I
    //   735: invokevirtual 543	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   738: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   741: invokestatic 290	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   744: ldc 177
    //   746: new 300	java/lang/StringBuilder
    //   749: dup
    //   750: ldc_w 545
    //   753: invokespecial 303	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   756: aload_0
    //   757: getfield 323	com/tencent/mm/plugin/facedetectlight/ui/b:mDesiredPreviewHeight	I
    //   760: invokevirtual 543	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   763: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   766: invokestatic 290	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   769: aload 8
    //   771: iconst_0
    //   772: invokevirtual 548	android/hardware/Camera$Parameters:setZoom	(I)V
    //   775: aload 8
    //   777: ldc_w 550
    //   780: invokevirtual 553	android/hardware/Camera$Parameters:setSceneMode	(Ljava/lang/String;)V
    //   783: aload 8
    //   785: invokevirtual 556	android/hardware/Camera$Parameters:getSupportedFocusModes	()Ljava/util/List;
    //   788: ifnull +373 -> 1161
    //   791: aload 8
    //   793: invokevirtual 556	android/hardware/Camera$Parameters:getSupportedFocusModes	()Ljava/util/List;
    //   796: ldc_w 550
    //   799: invokeinterface 560 2 0
    //   804: ifeq +357 -> 1161
    //   807: ldc 177
    //   809: ldc_w 562
    //   812: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   815: aload 8
    //   817: ldc_w 550
    //   820: invokevirtual 565	android/hardware/Camera$Parameters:setFocusMode	(Ljava/lang/String;)V
    //   823: aload 8
    //   825: invokevirtual 568	android/hardware/Camera$Parameters:getSupportedPreviewFormats	()Ljava/util/List;
    //   828: astore 11
    //   830: aload 11
    //   832: invokeinterface 222 1 0
    //   837: astore 4
    //   839: iconst_0
    //   840: istore_3
    //   841: aload 4
    //   843: invokeinterface 228 1 0
    //   848: ifeq +544 -> 1392
    //   851: aload 4
    //   853: invokeinterface 232 1 0
    //   858: checkcast 181	java/lang/Integer
    //   861: invokevirtual 571	java/lang/Integer:intValue	()I
    //   864: istore_2
    //   865: ldc 177
    //   867: ldc_w 573
    //   870: iload_2
    //   871: invokestatic 576	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   874: invokevirtual 266	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   877: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   880: iload_2
    //   881: bipush 17
    //   883: if_icmpne +314 -> 1197
    //   886: iconst_1
    //   887: istore_2
    //   888: iload_2
    //   889: ifeq +320 -> 1209
    //   892: aload 8
    //   894: bipush 17
    //   896: invokevirtual 579	android/hardware/Camera$Parameters:setPreviewFormat	(I)V
    //   899: aload_0
    //   900: getfield 478	com/tencent/mm/plugin/facedetectlight/ui/b:lUI	Z
    //   903: ifeq +12 -> 915
    //   906: aload 8
    //   908: aload_0
    //   909: getfield 476	com/tencent/mm/plugin/facedetectlight/ui/b:lUJ	I
    //   912: invokevirtual 582	android/hardware/Camera$Parameters:setRotation	(I)V
    //   915: aload_0
    //   916: getfield 584	com/tencent/mm/plugin/facedetectlight/ui/b:mdA	Lcom/tencent/mm/plugin/facedetectlight/ui/PreviewFrameLayout;
    //   919: invokevirtual 590	com/tencent/mm/plugin/facedetectlight/ui/PreviewFrameLayout:getmAspectRatio	()D
    //   922: dstore 12
    //   924: ldc 177
    //   926: ldc_w 592
    //   929: dload 12
    //   931: invokestatic 595	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   934: invokevirtual 266	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   937: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   940: aload_0
    //   941: getfield 321	com/tencent/mm/plugin/facedetectlight/ui/b:mDesiredPreviewWidth	I
    //   944: i2d
    //   945: aload_0
    //   946: getfield 323	com/tencent/mm/plugin/facedetectlight/ui/b:mDesiredPreviewHeight	I
    //   949: i2d
    //   950: ddiv
    //   951: dstore 14
    //   953: ldc 177
    //   955: ldc_w 597
    //   958: dload 14
    //   960: invokestatic 595	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   963: invokevirtual 266	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   966: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   969: dload 12
    //   971: dload 14
    //   973: dcmpl
    //   974: ifne +303 -> 1277
    //   977: ldc 177
    //   979: ldc_w 599
    //   982: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   985: aload 8
    //   987: invokestatic 601	com/tencent/mm/plugin/facedetectlight/ui/b:b	(Landroid/hardware/Camera$Parameters;)V
    //   990: aload 8
    //   992: invokevirtual 370	android/hardware/Camera$Parameters:getSupportedPreviewFpsRange	()Ljava/util/List;
    //   995: astore 11
    //   997: ldc 177
    //   999: new 300	java/lang/StringBuilder
    //   1002: dup
    //   1003: ldc_w 603
    //   1006: invokespecial 303	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1009: aload 11
    //   1011: invokeinterface 374 1 0
    //   1016: invokevirtual 543	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1019: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1022: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1025: iconst_0
    //   1026: istore_3
    //   1027: iload_3
    //   1028: aload 11
    //   1030: invokeinterface 374 1 0
    //   1035: if_icmpge +272 -> 1307
    //   1038: aload 11
    //   1040: iload_3
    //   1041: invokeinterface 379 2 0
    //   1046: checkcast 381	[I
    //   1049: astore 4
    //   1051: iconst_0
    //   1052: istore_2
    //   1053: iload_2
    //   1054: aload 4
    //   1056: arraylength
    //   1057: if_icmpge +244 -> 1301
    //   1060: ldc 177
    //   1062: ldc_w 605
    //   1065: iconst_1
    //   1066: anewarray 4	java/lang/Object
    //   1069: dup
    //   1070: iconst_0
    //   1071: aload 4
    //   1073: iload_2
    //   1074: iaload
    //   1075: invokestatic 185	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1078: aastore
    //   1079: invokestatic 244	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1082: iinc 2 1
    //   1085: goto -32 -> 1053
    //   1088: iconst_0
    //   1089: istore 7
    //   1091: goto -737 -> 354
    //   1094: astore 4
    //   1096: ldc 177
    //   1098: aload 4
    //   1100: ldc_w 607
    //   1103: iconst_1
    //   1104: anewarray 4	java/lang/Object
    //   1107: dup
    //   1108: iconst_0
    //   1109: aload 4
    //   1111: invokevirtual 400	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1114: aastore
    //   1115: invokestatic 611	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1118: sipush 778
    //   1121: invokestatic 132	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1124: iload_1
    //   1125: istore 7
    //   1127: goto -906 -> 221
    //   1130: aload_0
    //   1131: getfield 136	com/tencent/mm/plugin/facedetectlight/ui/b:mbY	Lcom/tencent/mm/plugin/facedetectaction/ui/FaceActionUI;
    //   1134: invokevirtual 614	com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI:getResources	()Landroid/content/res/Resources;
    //   1137: invokevirtual 508	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   1140: getfield 513	android/util/DisplayMetrics:widthPixels	I
    //   1143: istore_3
    //   1144: aload_0
    //   1145: getfield 136	com/tencent/mm/plugin/facedetectlight/ui/b:mbY	Lcom/tencent/mm/plugin/facedetectaction/ui/FaceActionUI;
    //   1148: invokevirtual 614	com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI:getResources	()Landroid/content/res/Resources;
    //   1151: invokevirtual 508	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   1154: getfield 516	android/util/DisplayMetrics:heightPixels	I
    //   1157: istore_2
    //   1158: goto -666 -> 492
    //   1161: ldc 177
    //   1163: ldc_w 616
    //   1166: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1169: goto -346 -> 823
    //   1172: astore 4
    //   1174: ldc 177
    //   1176: ldc_w 618
    //   1179: iconst_1
    //   1180: anewarray 4	java/lang/Object
    //   1183: dup
    //   1184: iconst_0
    //   1185: aload 4
    //   1187: invokevirtual 400	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1190: aastore
    //   1191: invokestatic 490	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1194: goto -371 -> 823
    //   1197: iload_2
    //   1198: ldc_w 619
    //   1201: if_icmpne +188 -> 1389
    //   1204: iconst_1
    //   1205: istore_3
    //   1206: goto -365 -> 841
    //   1209: iload_3
    //   1210: ifeq +22 -> 1232
    //   1213: ldc 177
    //   1215: ldc_w 621
    //   1218: invokestatic 290	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1221: aload 8
    //   1223: ldc_w 619
    //   1226: invokevirtual 579	android/hardware/Camera$Parameters:setPreviewFormat	(I)V
    //   1229: goto -330 -> 899
    //   1232: ldc 177
    //   1234: ldc_w 623
    //   1237: iconst_1
    //   1238: anewarray 4	java/lang/Object
    //   1241: dup
    //   1242: iconst_0
    //   1243: aload 11
    //   1245: iconst_0
    //   1246: invokeinterface 379 2 0
    //   1251: aastore
    //   1252: invokestatic 490	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1255: aload 8
    //   1257: aload 11
    //   1259: iconst_0
    //   1260: invokeinterface 379 2 0
    //   1265: checkcast 181	java/lang/Integer
    //   1268: invokevirtual 571	java/lang/Integer:intValue	()I
    //   1271: invokevirtual 579	android/hardware/Camera$Parameters:setPreviewFormat	(I)V
    //   1274: goto -375 -> 899
    //   1277: ldc 177
    //   1279: ldc_w 625
    //   1282: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1285: new 627	com/tencent/mm/plugin/facedetectlight/ui/b$6
    //   1288: dup
    //   1289: aload_0
    //   1290: dload 14
    //   1292: invokespecial 630	com/tencent/mm/plugin/facedetectlight/ui/b$6:<init>	(Lcom/tencent/mm/plugin/facedetectlight/ui/b;D)V
    //   1295: invokestatic 633	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   1298: goto -313 -> 985
    //   1301: iinc 3 1
    //   1304: goto -277 -> 1027
    //   1307: ldc 177
    //   1309: new 300	java/lang/StringBuilder
    //   1312: dup
    //   1313: ldc_w 635
    //   1316: invokespecial 303	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1319: aload 8
    //   1321: ldc_w 637
    //   1324: invokevirtual 520	android/hardware/Camera$Parameters:get	(Ljava/lang/String;)Ljava/lang/String;
    //   1327: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1330: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1333: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1336: ldc 177
    //   1338: new 300	java/lang/StringBuilder
    //   1341: dup
    //   1342: ldc_w 635
    //   1345: invokespecial 303	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1348: aload 8
    //   1350: ldc_w 639
    //   1353: invokevirtual 520	android/hardware/Camera$Parameters:get	(Ljava/lang/String;)Ljava/lang/String;
    //   1356: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1359: invokevirtual 311	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1362: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1365: aload_0
    //   1366: getfield 313	com/tencent/mm/plugin/facedetectlight/ui/b:mdw	Lcom/tencent/mm/compatible/e/t;
    //   1369: aload 8
    //   1371: invokevirtual 642	com/tencent/mm/compatible/e/t:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   1374: aload_0
    //   1375: getfield 125	com/tencent/mm/plugin/facedetectlight/ui/b:mIsCameraOpened	Z
    //   1378: istore 7
    //   1380: sipush 778
    //   1383: invokestatic 132	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1386: goto -1165 -> 221
    //   1389: goto -183 -> 1206
    //   1392: iconst_0
    //   1393: istore_2
    //   1394: goto -506 -> 888
    //   1397: aconst_null
    //   1398: astore 4
    //   1400: goto -824 -> 576
    //   1403: iconst_m1
    //   1404: istore_3
    //   1405: goto -1329 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   165	184	184	java/io/IOException
    //   400	419	419	java/io/IOException
    //   447	456	1094	java/lang/Exception
    //   783	823	1172	java/lang/Exception
    //   1161	1169	1172	java/lang/Exception
  }

  private static boolean f(int paramInt1, int paramInt2, long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(784);
    double d = paramInt1 * paramInt2 * 3.0D / 2.0D / 1024.0D / 1024.0D;
    ab.d("MicroMsg.FaceReflectCam", "dataSizeInMB: %f, availableMemInMb: %d", new Object[] { Double.valueOf(d), Long.valueOf(paramLong) });
    if (paramLong / d >= 5.0D)
      AppMethodBeat.o(784);
    while (true)
    {
      return bool;
      AppMethodBeat.o(784);
      bool = false;
    }
  }

  private void g(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(775);
    ab.i("MicroMsg.FaceReflectCam", "openCameraForSurfaceTexture");
    if (this.mdG == 1)
    {
      this.mdz.setVisibility(0);
      btX();
      if (this.mdv == null)
        break label92;
      this.mdv.post(new b.3(this));
      this.mdv.post(new b.4(this, paramSurfaceTexture));
      AppMethodBeat.o(775);
    }
    while (true)
    {
      return;
      this.mcP.setVisibility(0);
      break;
      label92: ab.i("MicroMsg.FaceReflectCam", "back thread is not running");
      AppMethodBeat.o(775);
    }
  }

  public final void a(MMTextureView paramMMTextureView)
  {
    AppMethodBeat.i(774);
    this.mdt = paramMMTextureView;
    if (this.mdt.isAvailable())
      g(paramMMTextureView.getSurfaceTexture());
    this.mdt.setSurfaceTextureListener(this);
    this.mdt.setVisibility(0);
    this.mdt.setAlpha(0.0F);
    if ((this.mdG == 2) && (!this.mdF))
      al.n(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(758);
          b.a(b.this).setVisibility(8);
          b.b(b.this).setVisibility(8);
          b.c(b.this);
          AppMethodBeat.o(758);
        }
      }
      , 700L);
    AppMethodBeat.o(774);
  }

  public final void btW()
  {
    AppMethodBeat.i(780);
    ab.i("MicroMsg.FaceReflectCam", "closeCamera start");
    if (this.mdw != null);
    try
    {
      if (this.lXB)
      {
        this.lXB = false;
        this.mdw.stopPreview();
        this.mdw.setPreviewCallback(null);
        ab.i("MicroMsg.FaceReflectCam", "stop preview, not previewing");
      }
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          this.mdw.release();
          this.mdw = null;
          this.mdw = null;
          ab.i("MicroMsg.FaceReflectCam", "closeCamera end");
          AppMethodBeat.o(780);
          return;
          localException1 = localException1;
          ab.i("MicroMsg.FaceReflectCam", "Error setting camera preview: " + localException1.getMessage());
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Error setting camera preview: ");
          ab.i("MicroMsg.FaceReflectCam", localException2.getMessage());
          this.mdw = null;
        }
      }
      finally
      {
        this.mdw = null;
        AppMethodBeat.o(780);
      }
    }
  }

  public final void btX()
  {
    AppMethodBeat.i(781);
    if (this.mdu == null)
    {
      ab.i("MicroMsg.FaceReflectCam", "start camera thread");
      this.mdu = d.anM("cameraBackground");
      this.mdu.start();
      this.mdv = new ak(this.mdu.getLooper());
    }
    AppMethodBeat.o(781);
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(777);
    ab.i("MicroMsg.FaceReflectCam", "onSurfaceTextureAvailable, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g(paramSurfaceTexture);
    AppMethodBeat.o(777);
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(776);
    ab.i("MicroMsg.FaceReflectCam", "surfaceDestroyed");
    if (this.mdv != null)
    {
      this.mdv.post(new b.5(this));
      if (this.mdu != null)
        ab.i("MicroMsg.FaceReflectCam", "stop camera thread");
    }
    while (true)
    {
      try
      {
        Thread.sleep(500L, 0);
        if (Build.VERSION.SDK_INT >= 18)
          this.mdu.quitSafely();
      }
      catch (InterruptedException paramSurfaceTexture)
      {
        try
        {
          this.mdu.join();
          this.mdu = null;
          this.mdv = null;
          ab.i("MicroMsg.FaceReflectCam", "stop camera thread finish");
          AppMethodBeat.o(776);
          return false;
          paramSurfaceTexture = paramSurfaceTexture;
          ab.i("MicroMsg.FaceReflectCam", "background thread sleep error：" + paramSurfaceTexture.getMessage());
          continue;
          this.mdu.quit();
          continue;
        }
        catch (InterruptedException paramSurfaceTexture)
        {
          ab.i("MicroMsg.FaceReflectCam", "stop background thread error：" + paramSurfaceTexture.getMessage());
          continue;
        }
      }
      ab.i("MicroMsg.FaceReflectCam", "back thread is not running");
    }
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  public final void stopPreview()
  {
    AppMethodBeat.i(779);
    ab.i("MicroMsg.FaceReflectCam", "stopPreview, isPreviewing: %s", new Object[] { Boolean.valueOf(this.mdx) });
    if (this.mdw != null)
    {
      this.mdw.stopPreview();
      this.mdx = false;
      com.tencent.mm.plugin.facedetect.model.c.lTA.WY();
    }
    AppMethodBeat.o(779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.b
 * JD-Core Version:    0.6.2
 */
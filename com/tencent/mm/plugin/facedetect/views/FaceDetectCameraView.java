package com.tencent.mm.plugin.facedetect.views;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

public class FaceDetectCameraView extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private static FaceDetectCameraView.a mad = null;
  private ActivityManager aDn;
  private boolean hGM;
  private int height;
  private boolean jER;
  private long lTJ;
  b lZO;
  private long lZP;
  private long lZQ;
  private int lZR;
  private boolean lZS;
  private boolean lZT;
  private final Object lZU;
  private boolean lZV;
  private boolean lZW;
  private final Object lZX;
  private final Object lZY;
  private Rect lZZ;
  private SurfaceTexture mSurfaceTexture;
  private c maa;
  private boolean mab;
  public FaceDetectCameraView.b mae;
  private byte[] maf;
  private boolean mag;
  private long mah;
  private int width;

  public FaceDetectCameraView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FaceDetectCameraView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(594);
    this.lZO = null;
    this.mSurfaceTexture = null;
    this.lZP = FaceDetectView.maQ;
    this.lZQ = -1L;
    this.lTJ = -1L;
    this.lZR = 1;
    this.hGM = false;
    this.lZS = false;
    this.lZT = false;
    this.lZU = new Object();
    this.lZV = false;
    this.lZW = false;
    this.jER = false;
    this.lZX = new Object();
    this.lZY = new Object();
    this.lZZ = null;
    this.width = 324;
    this.height = 576;
    this.maa = null;
    this.mab = false;
    this.mae = null;
    this.maf = null;
    this.mag = false;
    this.mah = -1L;
    this.aDn = ((ActivityManager)getContext().getSystemService("activity"));
    ab.i("MicroMsg.FaceDetectCameraView", "hy: face vedio debug: %b", new Object[] { Boolean.valueOf(this.mab) });
    this.mae = new FaceDetectCameraView.c(this, (byte)0);
    mad = new FaceDetectCameraView.a(this, (byte)0);
    setOpaque(false);
    setSurfaceTextureListener(this);
    AppMethodBeat.o(594);
  }

  private static void btB()
  {
    AppMethodBeat.i(598);
    ab.i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
    f.bsz();
    AppMethodBeat.o(598);
  }

  private void btE()
  {
    try
    {
      AppMethodBeat.i(602);
      ab.i("MicroMsg.FaceDetectCameraView", "alvinluo capture face");
      f.lTL.bsC();
      g localg = f.lTL.lTM.lVR;
      if (localg.lTP == null)
        ab.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
      while (true)
      {
        int i = f.lTL.bsD();
        long l = System.currentTimeMillis();
        ab.i("MicroMsg.FaceDetectCameraView", "alvinluo start motion time: %d", new Object[] { Long.valueOf(l) });
        FaceDetectReporter.bsJ().H(i, l);
        AppMethodBeat.o(602);
        return;
        ab.i("MicroMsg.FaceDetectNativeManager", "hy: start init motion");
        localg.lTP.engineGetCurrMotion();
      }
    }
    finally
    {
    }
  }

  public final void a(Rect paramRect, long paramLong)
  {
    try
    {
      AppMethodBeat.i(597);
      btB();
      this.lZZ = paramRect;
      btE();
      this.mae.im(paramLong);
      AppMethodBeat.o(597);
      return;
    }
    finally
    {
      paramRect = finally;
    }
    throw paramRect;
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(596);
    this.mae.a(paramc);
    this.lTJ = -1L;
    AppMethodBeat.o(596);
  }

  public final void btC()
  {
    AppMethodBeat.i(600);
    btD();
    f.lTL.lTM.lVR.bsH();
    AppMethodBeat.o(600);
  }

  public final void btD()
  {
    AppMethodBeat.i(601);
    this.jER = false;
    this.mae.btr();
    btB();
    int i = f.lTL.bsD();
    long l = System.currentTimeMillis();
    ab.i("MicroMsg.FaceDetectCameraView", "alvinluo pause motion time: %d", new Object[] { Long.valueOf(l) });
    FaceDetectReporter.bsJ().I(i, l);
    AppMethodBeat.o(601);
  }

  final FaceProNative.FaceResult btF()
  {
    try
    {
      AppMethodBeat.i(606);
      f.bsz();
      int i = f.lTL.bsC();
      FaceProNative.FaceResult localFaceResult = f.lTL.lTM.lVR.bsG();
      if (localFaceResult != null);
      for (int j = localFaceResult.result; ; j = -10000)
      {
        ab.i("MicroMsg.FaceDetectCameraView", "hy: motionResult: %d, finalResult: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        AppMethodBeat.o(606);
        return localFaceResult;
      }
    }
    finally
    {
    }
  }

  public final int getCameraRotation()
  {
    AppMethodBeat.i(609);
    int i = this.mae.getRotation();
    AppMethodBeat.o(609);
    return i;
  }

  public final Point getEncodeVideoBestSize()
  {
    AppMethodBeat.i(595);
    Point localPoint = this.mae.btH();
    AppMethodBeat.o(595);
    return localPoint;
  }

  public final Bitmap getPreviewBm()
  {
    AppMethodBeat.i(607);
    Bitmap localBitmap = getBitmap();
    AppMethodBeat.o(607);
    return localBitmap;
  }

  public final int getPreviewHeight()
  {
    AppMethodBeat.i(611);
    int i = this.mae.getPreviewHeight();
    AppMethodBeat.o(611);
    return i;
  }

  public final int getPreviewWidth()
  {
    AppMethodBeat.i(610);
    int i = this.mae.getPreviewWidth();
    AppMethodBeat.o(610);
    return i;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(605);
    super.onAttachedToWindow();
    ab.i("MicroMsg.FaceDetectCameraView", "hy: attached");
    AppMethodBeat.o(605);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(608);
    super.onMeasure(paramInt1, paramInt2);
    this.width = getMeasuredWidth();
    this.height = getMeasuredHeight();
    ab.i("MicroMsg.FaceDetectCameraView", "hy: camera view on measure to %d, %d", new Object[] { Integer.valueOf(this.width), Integer.valueOf(this.height) });
    AppMethodBeat.o(608);
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(599);
    ab.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureAvailable");
    dAh();
    this.hGM = true;
    this.mSurfaceTexture = paramSurfaceTexture;
    if (this.lZW)
      a(this.maa);
    AppMethodBeat.o(599);
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(604);
    ab.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureDestroyed");
    this.hGM = false;
    AppMethodBeat.o(604);
    return false;
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(603);
    ab.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureSizeChanged");
    this.mSurfaceTexture = paramSurfaceTexture;
    AppMethodBeat.o(603);
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  final void setCallback(b paramb)
  {
    this.lZO = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView
 * JD-Core Version:    0.6.2
 */
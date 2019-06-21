package com.tencent.ttpic.filter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.opengl.GLES20;
import com.microrapid.opencv.CosmeticsHandle;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.h;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.manager.FeatureManager;
import com.tencent.ttpic.model.FaceActionCounter;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.view.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public class LipsCosFilter
{
  public static final String FRAGMENT_SHADER;
  float[] cords;
  int[][] fPoints;
  private BaseFilter mCropFilter;
  private h mCropFrame;
  byte[] mData;
  private BaseFilter mFilter;
  private h mFrame;
  private int mHeight;
  private Bitmap mLut;
  private float mScale;
  private int mTex;
  private int mType;
  private int mWidth;

  static
  {
    AppMethodBeat.i(82649);
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/LipsCosFragment.dat");
    if (FeatureManager.isSegmentationReady());
    while (true)
    {
      try
      {
        FeatureManager.loadLibrary("algo_rithm_jni");
        AppMethodBeat.o(82649);
        return;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        LogUtils.e(localUnsatisfiedLinkError);
        AppMethodBeat.o(82649);
        continue;
      }
      catch (RuntimeException localRuntimeException)
      {
        LogUtils.e(localRuntimeException);
        AppMethodBeat.o(82649);
        continue;
      }
      catch (Exception localException)
      {
        LogUtils.e(localException);
      }
      AppMethodBeat.o(82649);
    }
  }

  public LipsCosFilter()
  {
    AppMethodBeat.i(82642);
    this.mCropFilter = null;
    this.mFilter = null;
    this.mType = 1;
    this.mScale = 1.0F;
    this.mWidth = 0;
    this.mHeight = 0;
    this.mCropFrame = new h();
    this.mFrame = new h();
    this.mTex = 0;
    this.cords = new float[8];
    this.mData = null;
    this.fPoints = new int[83][2];
    AppMethodBeat.o(82642);
  }

  public static Bitmap getBitmapFromAsset(Context paramContext, String paramString)
  {
    AppMethodBeat.i(82647);
    AssetManager localAssetManager = paramContext.getAssets();
    paramContext = null;
    try
    {
      paramString = BitmapFactory.decodeStream(localAssetManager.open(paramString));
      paramContext = paramString;
      label23: AppMethodBeat.o(82647);
      return paramContext;
    }
    catch (IOException paramString)
    {
      break label23;
    }
  }

  private void initData(int paramInt1, int paramInt2)
  {
    try
    {
      if ((this.mData == null) || (this.mData.length < paramInt1 * paramInt2 * 4))
        this.mData = new byte[paramInt1 * paramInt2 * 4];
      label31: return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      break label31;
    }
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82643);
    this.mFilter = new BaseFilter(FRAGMENT_SHADER);
    this.mFilter.addParam(new m.i("type", this.mType));
    this.mFilter.addParam(new m.k("inputImageTexture2", this.mLut, 33986, true));
    this.mFilter.addParam(new m.f("adjustAlpha", 1.0F));
    this.mFilter.ApplyGLSLFilter(true, 0.0F, 0.0F);
    AppMethodBeat.o(82643);
  }

  public void clear()
  {
    AppMethodBeat.i(82644);
    this.mFilter.ClearGLSL();
    this.mFilter = null;
    this.mCropFrame.clear();
    this.mFrame.clear();
    AppMethodBeat.o(82644);
  }

  public void setCosAlpha(float paramFloat)
  {
    AppMethodBeat.i(82646);
    this.mFilter.addParam(new m.f("adjustAlpha", paramFloat));
    AppMethodBeat.o(82646);
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(82648);
    if (this.mFilter != null)
      this.mFilter.setRenderMode(paramInt);
    AppMethodBeat.o(82648);
  }

  public void setTypeAndLut(int paramInt, Bitmap paramBitmap)
  {
    this.mType = paramInt;
    this.mLut = paramBitmap;
    if (this.mLut == null)
      this.mType = 0;
  }

  public h updateAndRender(h paramh, int paramInt1, int paramInt2, List<PointF> paramList, float[] paramArrayOfFloat, Map<Integer, FaceActionCounter> paramMap)
  {
    AppMethodBeat.i(82645);
    int i;
    int j;
    int k;
    int m;
    int n;
    try
    {
      initData(paramh.width, paramh.height);
      i = 2147483647;
      j = -2147483648;
      k = 65;
      m = -2147483648;
      n = 2147483647;
      while (k <= 82)
      {
        i = (int)Math.min(i, ((PointF)paramList.get(k)).x);
        j = (int)Math.max(j, ((PointF)paramList.get(k)).x);
        n = (int)Math.min(n, ((PointF)paramList.get(k)).y);
        m = (int)Math.max(m, ((PointF)paramList.get(k)).y);
        k++;
      }
    }
    catch (OutOfMemoryError paramList)
    {
      AppMethodBeat.o(82645);
    }
    float f1;
    float f2;
    while (true)
    {
      return paramh;
      k = j - i + 1;
      i -= (int)(k * 0.3D);
      n -= (int)(k * 0.25D);
      j = (int)(k * 0.3D) + j;
      k = (int)(k * 0.25D) + m;
      f1 = paramInt1 * this.mScale;
      f2 = paramInt2;
      f2 = this.mScale * f2;
      if ((i < f1) && (j >= 0) && (n < f2) && (k >= 0))
        break;
      AppMethodBeat.o(82645);
    }
    if (i < 0);
    for (paramInt1 = 0; ; paramInt1 = i)
    {
      if (j >= f1);
      for (m = (int)f1 - 1; ; m = j)
      {
        if (n < 0);
        for (paramInt2 = 0; ; paramInt2 = n)
        {
          j = k;
          if (k >= f2)
            j = (int)f2 - 1;
          this.cords[0] = (paramInt1 / f1);
          this.cords[1] = (paramInt2 / f2);
          this.cords[2] = (paramInt1 / f1);
          this.cords[3] = (j / f2);
          this.cords[4] = (m / f1);
          this.cords[5] = (j / f2);
          this.cords[6] = (m / f1);
          this.cords[7] = (paramInt2 / f2);
          m = (int)((m - paramInt1) / this.mScale);
          j = (int)((j - paramInt2) / this.mScale);
          k = (int)(paramInt1 / this.mScale);
          paramInt2 = (int)(paramInt2 / this.mScale);
          GlUtil.saveTextureToRgbaBuffer(paramh.texture[0], k, paramInt2, m, j, this.mData, paramh.bJz[0]);
          for (paramInt1 = 0; paramInt1 < this.fPoints.length; paramInt1++)
          {
            this.fPoints[paramInt1][0] = ((int)(((PointF)paramList.get(paramInt1)).x / this.mScale - k));
            this.fPoints[paramInt1][1] = ((int)(((PointF)paramList.get(paramInt1)).y / this.mScale - paramInt2));
          }
          CosmeticsHandle.a(this.mData, this.fPoints, m, j);
          this.mTex = GlUtil.createImageTexture(ByteBuffer.wrap(this.mData), m, j, 6408);
          GLES20.glBindFramebuffer(36160, paramh.bJz[0]);
          GLES20.glViewport(0, 0, paramh.width, paramh.height);
          for (paramInt1 = 0; paramInt1 < 8; paramInt1++)
          {
            paramList = this.cords;
            paramList[paramInt1] = (paramList[paramInt1] * 2.0F - 1.0F);
          }
          this.mFilter.setPositions(this.cords);
          this.mFilter.OnDrawFrameGLSL();
          this.mFilter.renderTexture(this.mTex, m, j);
          g.Sk(this.mTex);
          AppMethodBeat.o(82645);
          break;
        }
      }
    }
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    this.mScale = ((float)paramDouble);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.LipsCosFilter
 * JD-Core Version:    0.6.2
 */
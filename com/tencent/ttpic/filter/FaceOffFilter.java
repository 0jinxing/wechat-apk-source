package com.tencent.ttpic.filter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.tencent.filter.m.b;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.filter.m.k;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.cache.VideoMemoryManager;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.model.FaceItem;
import com.tencent.ttpic.model.TRIGGERED_STATUS;
import com.tencent.ttpic.model.TriggerCtrlItem;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.FaceOffUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.io.File;
import java.util.List;

public class FaceOffFilter extends VideoFilterBase
{
  public static final String FRAGMENT_SHADER;
  private static final String TAG;
  public static final String VERTEX_SHADER;
  private byte[] data;
  protected int faceImageHeight;
  protected int faceImageWidth;
  private float[] faceVertices;
  private int grayImageHeight;
  private int grayImageWidth;
  private float[] grayVertices;
  protected boolean isFaceImageReady;
  private boolean isGrayImageReady;
  protected FaceItem item;
  private int lastIndex;
  public float level1;
  public float level2;
  public int levelCount;
  byte[] mData;
  float percent1;
  float percent2;
  private boolean sequenceMode;
  public double sumg;
  public double sumr;
  private float[] texVertices;
  protected int[] texture;
  private TriggerCtrlItem triggerCtrlItem;
  private boolean triggered;

  static
  {
    AppMethodBeat.i(82434);
    TAG = FaceOffFilter.class.getSimpleName();
    VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/FaceOffVertexShader.dat");
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/FaceOffFragmentShader.dat");
    AppMethodBeat.o(82434);
  }

  public FaceOffFilter(FaceItem paramFaceItem, String paramString)
  {
    super(ShaderCreateFactory.PROGRAM_TYPE.FACEOFF);
    AppMethodBeat.i(82413);
    this.faceVertices = new float[1380];
    this.texVertices = new float[1380];
    this.grayVertices = new float[1380];
    this.texture = new int[2];
    this.lastIndex = -1;
    this.mData = null;
    this.data = null;
    this.level1 = 0.0F;
    this.level2 = 0.0F;
    this.percent1 = 0.05F;
    this.percent2 = 0.15F;
    this.sumg = 0.0D;
    this.sumr = 0.0D;
    this.levelCount = 0;
    this.item = paramFaceItem;
    this.dataPath = paramString;
    this.sequenceMode = TextUtils.isEmpty(paramFaceItem.faceExchangeImage);
    this.triggerCtrlItem = new TriggerCtrlItem(paramFaceItem);
    initParams();
    AppMethodBeat.o(82413);
  }

  private float getAverageGreen(List<PointF> paramList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82428);
    float f;
    if ((this.data == null) || (this.data.length < paramInt2 * paramInt1 * 4))
    {
      f = 0.0F;
      AppMethodBeat.o(82428);
    }
    int i;
    int j;
    int k;
    int m;
    while (true)
    {
      return f;
      i = (int)(((PointF)paramList.get(66)).x - ((PointF)paramList.get(65)).x);
      j = (int)(((PointF)paramList.get(69)).y - ((PointF)paramList.get(78)).y);
      k = (int)((PointF)paramList.get(65)).x;
      m = (int)((PointF)paramList.get(78)).y;
      if ((k < paramInt1) && (m < paramInt2) && (i > 0) && (j > 0))
        break;
      f = 0.0F;
      AppMethodBeat.o(82428);
    }
    if (k < 0)
      k = 0;
    while (true)
    {
      if (m < 0)
        m = 0;
      while (true)
      {
        if (k + i > paramInt1)
          i = paramInt1 - k;
        while (true)
        {
          if (m + j > paramInt2)
            paramInt2 -= m;
          while (true)
          {
            byte[] arrayOfByte = new byte[i * paramInt2 * 4];
            for (j = 0; j < paramInt2; j++)
              for (int n = 0; n < i; n++)
              {
                int i1 = (j * i + n) * 4;
                int i2 = ((j + m) * paramInt1 + n + k) * 4;
                arrayOfByte[i1] = ((byte)this.data[i2]);
                arrayOfByte[(i1 + 1)] = ((byte)this.data[(i2 + 1)]);
                arrayOfByte[(i1 + 2)] = ((byte)this.data[(i2 + 2)]);
                arrayOfByte[(i1 + 3)] = ((byte)this.data[(i2 + 3)]);
              }
            paramList = new int[256];
            this.sumg = 0.0D;
            this.sumr = 0.0D;
            for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
              for (k = 0; k < i; k++)
              {
                m = arrayOfByte[((paramInt1 * i + k) * 4)] & 0xFF;
                this.sumr += m;
                j = arrayOfByte[((paramInt1 * i + k) * 4 + 1)];
                this.sumg += (j & 0xFF);
                paramList[m] += 1;
              }
            this.sumg /= i * paramInt2;
            this.sumr /= i * paramInt2;
            this.levelCount = 0;
            paramInt1 = 255;
            label500: if (paramInt1 >= 0)
            {
              this.levelCount += paramList[paramInt1];
              if (this.levelCount >= paramInt2 * i * this.percent1)
                this.level1 = paramInt1;
            }
            else
            {
              this.levelCount = 0;
            }
            for (paramInt1 = 255; ; paramInt1--)
              if (paramInt1 >= 0)
              {
                this.levelCount += paramList[paramInt1];
                if (this.levelCount >= paramInt2 * i * this.percent2)
                  this.level2 = paramInt1;
              }
              else
              {
                f = (float)this.sumr;
                AppMethodBeat.o(82428);
                break;
                paramInt1--;
                break label500;
              }
            paramInt2 = j;
          }
        }
      }
    }
  }

  private void initGrayTexCoords()
  {
    AppMethodBeat.i(82419);
    setGrayCords(FaceOffUtil.initMaterialFaceTexCoords(FaceOffUtil.getFullCoordsForFaceOffFilter(FaceOffUtil.getGrayCoords(this.item.featureType), 2.0F), this.grayImageWidth, this.grayImageHeight, this.grayVertices));
    AppMethodBeat.o(82419);
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82429);
    super.ApplyGLSLFilter();
    GLES20.glGenTextures(this.texture.length, this.texture, 0);
    AppMethodBeat.o(82429);
  }

  public boolean canUseBlendMode()
  {
    if ((this.item != null) && (this.item.blendMode < 2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(82430);
    GLES20.glDeleteTextures(this.texture.length, this.texture, 0);
    super.clearGLSLSelf();
    AppMethodBeat.o(82430);
  }

  public FaceItem getFaceOffItem()
  {
    return this.item;
  }

  public int getNextFrame(int paramInt)
  {
    AppMethodBeat.i(82426);
    Bitmap localBitmap = VideoMemoryManager.getInstance().loadImage(this.item.id, paramInt);
    if (BitmapUtils.isLegal(localBitmap))
    {
      GlUtil.loadTexture(this.texture[0], localBitmap);
      this.isFaceImageReady = true;
      paramInt = this.texture[0];
      AppMethodBeat.o(82426);
    }
    while (true)
    {
      return paramInt;
      paramInt = -1;
      AppMethodBeat.o(82426);
    }
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(82417);
    super.initAttribParams();
    initFaceTexCoords();
    initGrayTexCoords();
    setDrawMode(GlUtil.DRAW_MODE.TRIANGLES);
    setCoordNum(690);
    AppMethodBeat.o(82417);
  }

  protected boolean initFaceImage()
  {
    boolean bool = true;
    AppMethodBeat.i(82423);
    if (this.isFaceImageReady)
      AppMethodBeat.o(82423);
    while (true)
    {
      return bool;
      Bitmap localBitmap = VideoMemoryManager.getInstance().loadImage(this.item.faceExchangeImage, this.item.faceExchangeImage);
      int i = VideoMemoryManager.getInstance().getSampleSize();
      if (BitmapUtils.isLegal(localBitmap))
      {
        GlUtil.loadTexture(this.texture[0], localBitmap);
        this.faceImageWidth = (localBitmap.getWidth() * i);
        this.faceImageHeight = (localBitmap.getHeight() * i);
        initFaceTexCoords();
        addParam(new m.n("inputImageTexture2", this.texture[0], 33986));
        this.isFaceImageReady = true;
      }
      bool = this.isFaceImageReady;
      AppMethodBeat.o(82423);
    }
  }

  protected void initFaceTexCoords()
  {
    AppMethodBeat.i(82418);
    setTexCords(FaceOffUtil.initMaterialFaceTexCoords(FaceOffUtil.getFullCoordsForFaceOffFilter(FaceOffUtil.genPoints(this.item.facePoints), 2.0F), this.faceImageWidth, this.faceImageHeight, this.texVertices));
    AppMethodBeat.o(82418);
  }

  protected boolean initGrayImage()
  {
    boolean bool = true;
    AppMethodBeat.i(82424);
    if (this.isGrayImageReady)
      AppMethodBeat.o(82424);
    while (true)
    {
      return bool;
      Bitmap localBitmap = VideoMemoryManager.getInstance().loadImage(this.item.featureType);
      int i = VideoMemoryManager.getInstance().getSampleSize();
      if (BitmapUtils.isLegal(localBitmap))
      {
        GlUtil.loadTexture(this.texture[1], localBitmap);
        this.grayImageWidth = (localBitmap.getWidth() * i);
        this.grayImageHeight = (localBitmap.getHeight() * i);
        initGrayTexCoords();
        addParam(new m.n("inputImageTexture3", this.texture[1], 33987));
        this.isGrayImageReady = true;
      }
      bool = this.isGrayImageReady;
      AppMethodBeat.o(82424);
    }
  }

  public void initParams()
  {
    AppMethodBeat.i(82414);
    this.faceImageWidth = this.item.width;
    this.faceImageHeight = this.item.height;
    addParam(new m.n("inputImageTexture2", 0, 33986));
    addParam(new m.n("inputImageTexture3", 0, 33987));
    addParam(new m.i("enableFaceOff", 1));
    addParam(new m.f("alpha", this.item.blendAlpha));
    addParam(new m.b("canvasSize", 0.0F, 0.0F));
    addParam(new m.f("positionRotate", 0.0F));
    addParam(new m.i("enableAlphaFromGray", this.item.grayScale));
    addParam(new m.i("blendMode", this.item.blendMode));
    if (this.item.blendMode == 13)
    {
      addParam(new m.f("level1", 0.0F));
      addParam(new m.f("level2", 0.0F));
    }
    if (this.item.blendMode == 14)
    {
      addParam(new m.k("inputImageTexture4", FaceOffUtil.getFaceBitmap(this.dataPath + File.separator + this.item.irisImage), 33988, true));
      float[] arrayOfFloat = new float[2];
      float[] tmp286_285 = arrayOfFloat;
      tmp286_285[0] = 0.0F;
      float[] tmp290_286 = tmp286_285;
      tmp290_286[1] = 0.0F;
      tmp290_286;
      addParam(new m.g("center1", arrayOfFloat));
      addParam(new m.g("center2", arrayOfFloat));
      addParam(new m.g("size", arrayOfFloat));
      addParam(new m.f("radius1", 0.0F));
      addParam(new m.f("radius2", 0.0F));
      addParam(new m.f("leftEyeClosed", 0.0F));
      addParam(new m.f("rightEyeClosed", 0.0F));
    }
    AppMethodBeat.o(82414);
  }

  public boolean isRenderReady()
  {
    if ((this.triggered) && (this.isFaceImageReady) && (this.isGrayImageReady));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void reset()
  {
    AppMethodBeat.i(82432);
    this.triggerCtrlItem.reset();
    AppMethodBeat.o(82432);
  }

  public void setCosAlpha(float paramFloat)
  {
    AppMethodBeat.i(82415);
    addParam(new m.f("alpha", paramFloat));
    AppMethodBeat.o(82415);
  }

  public void setImageData(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    while (true)
    {
      return;
      this.data = paramArrayOfByte;
    }
  }

  public void setRenderForBitmap(boolean paramBoolean)
  {
    AppMethodBeat.i(82431);
    this.triggerCtrlItem.setRenderForBitmap(paramBoolean);
    AppMethodBeat.o(82431);
  }

  public void setTriggerWords(String paramString)
  {
    AppMethodBeat.i(82433);
    this.triggerCtrlItem.setTriggerWords(paramString);
    AppMethodBeat.o(82433);
  }

  public TRIGGERED_STATUS updateActionTriggered(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(82421);
    paramPTDetectInfo = this.triggerCtrlItem.getTriggeredStatus(paramPTDetectInfo);
    AppMethodBeat.o(82421);
    return paramPTDetectInfo;
  }

  public void updatePointParams(List<PointF> paramList)
  {
    float f1 = 1.0F;
    int i = 1;
    AppMethodBeat.i(82425);
    setPositions(FaceOffUtil.initFacePositions(FaceOffUtil.getFullCoordsForFaceOffFilter(VideoMaterialUtil.copyList(paramList), 2.0F), (int)(this.width * this.mFaceDetScale), (int)(this.height * this.mFaceDetScale), this.faceVertices));
    setCoordNum(690);
    if (this.item.blendMode == 13)
    {
      getAverageGreen(paramList, (int)(this.width * this.mFaceDetScale), (int)(this.height * this.mFaceDetScale));
      addParam(new m.f("level1", this.level1 / 255.0F));
      addParam(new m.f("level2", this.level2 / 255.0F));
    }
    float f2;
    float f3;
    float f4;
    float f5;
    float f6;
    float f7;
    float f8;
    float f9;
    if (this.item.blendMode == 14)
    {
      f2 = AlgoUtils.getDistance((PointF)paramList.get(35), (PointF)paramList.get(39));
      f3 = AlgoUtils.getDistance((PointF)paramList.get(45), (PointF)paramList.get(49));
      f4 = Math.max(((PointF)paramList.get(44)).x - ((PointF)paramList.get(43)).x, ((PointF)paramList.get(54)).x - ((PointF)paramList.get(53)).x);
      f3 = ((float)Math.pow(Math.abs(f4) / Math.max(f2, f3), 1.0D) * 20.0F + 1.0F) * f4;
      f4 = (float)((((PointF)paramList.get(44)).x + f3) / this.mFaceDetScale);
      f2 = (float)(((PointF)paramList.get(44)).y / this.mFaceDetScale);
      f5 = (float)((((PointF)paramList.get(54)).x + f3) / this.mFaceDetScale);
      f6 = (float)(((PointF)paramList.get(54)).y / this.mFaceDetScale);
      f3 = this.width;
      f7 = this.height;
      f8 = (float)(AlgoUtils.getDistance((PointF)paramList.get(39), (PointF)paramList.get(35)) / this.mFaceDetScale / 4.0D) * 0.9F;
      f9 = (float)(AlgoUtils.getDistance((PointF)paramList.get(49), (PointF)paramList.get(45)) / this.mFaceDetScale / 4.0D) * 0.9F;
      if (AlgoUtils.getDistance((PointF)paramList.get(41), (PointF)paramList.get(37)) / f8 >= 0.1F)
        break label756;
    }
    label745: label756: for (int j = 1; ; j = 0)
    {
      if (AlgoUtils.getDistance((PointF)paramList.get(51), (PointF)paramList.get(47)) / f9 < 0.1F);
      while (true)
      {
        addParam(new m.g("center1", new float[] { f4, f2 }));
        addParam(new m.g("center2", new float[] { f5, f6 }));
        addParam(new m.g("size", new float[] { f3, f7 }));
        addParam(new m.f("radius1", f8));
        addParam(new m.f("radius2", f9));
        if (j != 0)
        {
          f4 = 1.0F;
          addParam(new m.f("leftEyeClosed", f4));
          if (i == 0)
            break label745;
        }
        for (f4 = f1; ; f4 = 0.0F)
        {
          addParam(new m.f("rightEyeClosed", f4));
          AppMethodBeat.o(82425);
          return;
          f4 = 0.0F;
          break;
        }
        i = 0;
      }
    }
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(82416);
    List localList = VideoMaterialUtil.copyList(paramPTDetectInfo.facePoints);
    updateActionTriggered(paramPTDetectInfo);
    this.triggered = this.triggerCtrlItem.isTriggered();
    if (!this.triggered)
    {
      this.lastIndex = -1;
      AppMethodBeat.o(82416);
    }
    while (true)
    {
      return;
      updatePointParams(localList);
      updateTextureParams(paramPTDetectInfo.timestamp);
      AppMethodBeat.o(82416);
    }
  }

  public void updateRandomGroupValue(int paramInt)
  {
    AppMethodBeat.i(82427);
    this.triggerCtrlItem.setRandomGroupValue(paramInt);
    AppMethodBeat.o(82427);
  }

  public void updateTextureParams(long paramLong)
  {
    AppMethodBeat.i(82422);
    if (!initGrayImage())
      AppMethodBeat.o(82422);
    while (true)
    {
      return;
      if (this.sequenceMode)
      {
        this.triggerCtrlItem.updateFrameIndex(paramLong);
        int i = this.triggerCtrlItem.getFrameIndex();
        if (i == this.lastIndex)
        {
          AppMethodBeat.o(82422);
        }
        else
        {
          int j = getNextFrame(i);
          if (j <= 0)
          {
            AppMethodBeat.o(82422);
          }
          else
          {
            addParam(new m.n("inputImageTexture2", j, 33986));
            this.lastIndex = i;
            AppMethodBeat.o(82422);
          }
        }
      }
      else
      {
        initFaceImage();
        AppMethodBeat.o(82422);
      }
    }
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82420);
    super.updateVideoSize(paramInt1, paramInt2, paramDouble);
    addParam(new m.b("canvasSize", paramInt1, paramInt2));
    AppMethodBeat.o(82420);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FaceOffFilter
 * JD-Core Version:    0.6.2
 */
package com.tencent.ttpic.particle;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.tencent.filter.m.i;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.filter.VideoFilterBase;
import com.tencent.ttpic.gles.AttributeParam;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.model.ParticleParam;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.TRIGGERED_STATUS;
import com.tencent.ttpic.model.TriggerCtrlItem;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.VideoFilterFactory.POSITION_TYPE;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.List;

public class ParticleFilter extends VideoFilterBase
{
  private static final String FRAGMENT_SHADER;
  private static final String TAG;
  private static final String VERTEX_SHADER;
  protected StickerItem item;
  private boolean mHasBodyDetected;
  private boolean mHasSeenValid;
  private List<PointF> mPreviousBodyPoints;
  private long mPreviousLostTime;
  private long mTimesForLostProtect;
  private ParticleEmitter particleEmitter;
  private ParticleParam particleParam;
  protected TriggerCtrlItem triggerCtrlItem;
  protected boolean triggered;

  static
  {
    AppMethodBeat.i(83631);
    TAG = ParticleFilter.class.getSimpleName();
    VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ParticleVertexShader.dat");
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ParticleFragmentShader.dat");
    AppMethodBeat.o(83631);
  }

  public ParticleFilter(String paramString, StickerItem paramStickerItem)
  {
    super(VERTEX_SHADER, FRAGMENT_SHADER);
    AppMethodBeat.i(83619);
    this.particleParam = new ParticleParam();
    this.triggered = false;
    this.mPreviousBodyPoints = null;
    this.mHasBodyDetected = false;
    this.mHasSeenValid = false;
    this.mTimesForLostProtect = 2000L;
    this.mPreviousLostTime = System.currentTimeMillis();
    this.item = paramStickerItem;
    this.particleEmitter = new ParticleEmitter();
    this.particleEmitter.initEmitter(paramString, paramStickerItem.particleConfig);
    this.triggerCtrlItem = new TriggerCtrlItem(paramStickerItem);
    initParams();
    setDrawMode(GlUtil.DRAW_MODE.TRIANGLES);
    AppMethodBeat.o(83619);
  }

  private void avoidBodyPointsShake(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(83630);
    if ((paramPTDetectInfo.bodyPoints == null) || (paramPTDetectInfo.bodyPoints.isEmpty()))
    {
      this.mHasBodyDetected = false;
      if (this.mHasSeenValid)
      {
        if (System.currentTimeMillis() - this.mPreviousLostTime < this.mTimesForLostProtect)
          paramPTDetectInfo.bodyPoints = this.mPreviousBodyPoints;
        AppMethodBeat.o(83630);
      }
    }
    while (true)
    {
      return;
      this.mHasSeenValid = false;
      AppMethodBeat.o(83630);
      continue;
      this.mHasBodyDetected = true;
      this.mHasSeenValid = true;
      this.mPreviousLostTime = System.currentTimeMillis();
      this.mPreviousBodyPoints = paramPTDetectInfo.bodyPoints;
      AppMethodBeat.o(83630);
    }
  }

  private float[] normalizePosition(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    float[] arrayOfFloat = new float[paramArrayOfFloat.length];
    for (int i = 0; i < arrayOfFloat.length / 3; i++)
    {
      arrayOfFloat[(i * 3)] = (paramArrayOfFloat[(i * 3)] / paramInt1 * 2.0F - 1.0F);
      arrayOfFloat[(i * 3 + 1)] = (paramArrayOfFloat[(i * 3 + 1)] / paramInt2 * 2.0F - 1.0F);
      arrayOfFloat[(i * 3 + 2)] = paramArrayOfFloat[(i * 3 + 2)];
    }
    return arrayOfFloat;
  }

  private void resetParams()
  {
    int i = 1;
    AppMethodBeat.i(83620);
    addParam(new m.i("isPartical2", 1));
    if (this.particleEmitter.opacityModifyRGB);
    while (true)
    {
      addParam(new m.i("u_opacityModifyRGB", i));
      addParam(new m.n("inputImageTexture2", 0, 33986));
      setCoordNum(6);
      addAttribParam(new AttributeParam("position", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 3));
      addAttribParam(new AttributeParam("inputTextureCoordinate", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 2));
      addAttribParam(new AttributeParam("aColor", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 4));
      this.mHasSeenValid = false;
      this.mPreviousBodyPoints = null;
      this.particleParam.needRender = false;
      AppMethodBeat.o(83620);
      return;
      i = 0;
    }
  }

  private ParticleFilter.ParticleEmitterParam updateEmitterParam(List<PointF> paramList, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(83625);
    ParticleFilter.ParticleEmitterParam localParticleEmitterParam = new ParticleFilter.ParticleEmitterParam(this, null);
    PointF localPointF1 = null;
    PointF localPointF2 = localPointF1;
    switch (this.item.type)
    {
    default:
      localPointF2 = localPointF1;
    case 3:
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
    }
    int j;
    do
    {
      do
      {
        while (true)
        {
          localParticleEmitterParam.emitPosition = localPointF2;
          localParticleEmitterParam.extraScale *= (float)this.triggerCtrlItem.getAudioScaleFactor();
          localParticleEmitterParam.extraScale *= this.width * 1.0F / 720.0F;
          AppMethodBeat.o(83625);
          return localParticleEmitterParam;
          localPointF2 = new PointF();
          int k;
          if (this.width / this.height >= 0.75D)
          {
            int i = (int)(this.width / 0.75D);
            j = (int)(i * this.item.position[1]);
            k = (int)(this.width * this.item.position[0]);
            i = (i - this.height) / 2;
            localPointF2.x = k;
            localPointF2.y = (j - i);
          }
          else
          {
            k = (int)(this.height * 0.75D);
            j = (int)(this.height * this.item.position[1]);
            localPointF2.x = ((int)(k * this.item.position[0]) - (k - this.width) / 2);
            localPointF2.y = j;
          }
        }
        localPointF2 = localPointF1;
      }
      while (paramList == null);
      localPointF2 = localPointF1;
    }
    while (paramList.isEmpty());
    localPointF2 = new PointF();
    PointF localPointF3 = (PointF)paramList.get(this.item.alignFacePoints[0]);
    if (this.item.alignFacePoints.length == 1)
    {
      j = this.item.alignFacePoints[0];
      label371: localPointF1 = (PointF)paramList.get(j);
      localPointF1 = new PointF((localPointF3.x + localPointF1.x) / 2.0F, (localPointF3.y + localPointF1.y) / 2.0F);
      localPointF1.x = ((float)(localPointF1.x / this.mFaceDetScale));
      localPointF1.y = ((float)(localPointF1.y / this.mFaceDetScale));
      localPointF2.x = localPointF1.x;
      localPointF2.y = localPointF1.y;
      localPointF1 = new PointF(((PointF)paramList.get(this.item.scalePivots[0])).x, ((PointF)paramList.get(this.item.scalePivots[0])).y);
      localPointF1.x = ((float)(localPointF1.x / this.mFaceDetScale));
      localPointF1.y = ((float)(localPointF1.y / this.mFaceDetScale));
      paramList = new PointF(((PointF)paramList.get(this.item.scalePivots[1])).x, ((PointF)paramList.get(this.item.scalePivots[1])).y);
      paramList.x = ((float)(paramList.x / this.mFaceDetScale));
      paramList.y = ((float)(paramList.y / this.mFaceDetScale));
      double d = Math.pow(localPointF1.x - paramList.x, 2.0D);
      d = Math.sqrt(Math.pow(localPointF1.y - paramList.y, 2.0D) + d) / this.item.scaleFactor;
      if (this.item.type == 2)
        localParticleEmitterParam.extraScale = ((float)d);
      if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < 3))
        break label747;
    }
    label747: for (float f = paramArrayOfFloat[2]; ; f = 0.0F)
    {
      localParticleEmitterParam.extraRotate = f;
      break;
      j = this.item.alignFacePoints[1];
      break label371;
    }
  }

  private void updateParticle(ParticleFilter.ParticleEmitterParam paramParticleEmitterParam)
  {
    AppMethodBeat.i(83626);
    Object localObject1 = paramParticleEmitterParam.emitPosition;
    float f1 = paramParticleEmitterParam.extraScale;
    float f2 = paramParticleEmitterParam.extraRotate;
    Object localObject2;
    int i;
    float[] arrayOfFloat;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    if (this.particleEmitter.totalFinished())
    {
      this.particleEmitter.reset();
      this.particleEmitter.startTime = -1L;
      localObject2 = this.particleEmitter;
      if (localObject1 != null)
      {
        paramParticleEmitterParam = new Vector2(((PointF)localObject1).x, this.height - ((PointF)localObject1).y);
        ((ParticleEmitter)localObject2).setSourcePosition(paramParticleEmitterParam);
        this.particleEmitter.setExtraRotate(0.0F);
        this.particleEmitter.setExtraScale(1.0F);
        this.particleEmitter.startTime = System.currentTimeMillis();
        i = this.particleEmitter.activeParticleCount();
        if (i <= 0)
          break label933;
        arrayOfFloat = new float[i * 18];
        paramParticleEmitterParam = new float[i * 12];
        localObject2 = new float[i * 24];
        j = 0;
        k = 0;
        m = 0;
        n = 0;
        i1 = 0;
        i2 = 0;
        BenchUtil.benchStart("setValue");
      }
    }
    for (int i3 = 0; ; i3++)
    {
      if (i3 >= this.particleEmitter.activeParticleCount())
        break label561;
      int i4 = 0;
      float f3;
      while (true)
        if (i4 < 24)
        {
          localObject2[(i1 + i4)] = this.particleEmitter.particleColors[(i2 + i4)];
          i4++;
          continue;
          paramParticleEmitterParam = new Vector2();
          break;
          f3 = (float)this.triggerCtrlItem.getAudioScaleFactor();
          LogUtils.e(TAG, "AudioScaleFactor = ".concat(String.valueOf(f3)));
          this.particleEmitter.setExtraScale(f3);
          localObject2 = this.particleEmitter;
          label308: long l;
          if (localObject1 != null)
          {
            paramParticleEmitterParam = new Vector2(((PointF)localObject1).x, this.height - ((PointF)localObject1).y);
            ((ParticleEmitter)localObject2).setSourcePosition(paramParticleEmitterParam);
            this.particleEmitter.setExtraScale(f1);
            this.particleEmitter.setExtraRotate((float)Math.toDegrees(f2));
            BenchUtil.benchStart("updateWithCurrentTime");
            paramParticleEmitterParam = this.particleEmitter;
            l = System.currentTimeMillis();
            if (localObject1 == null)
              break label388;
          }
          label388: for (boolean bool = true; ; bool = false)
          {
            paramParticleEmitterParam.updateWithCurrentTime(l, bool);
            BenchUtil.benchEnd("updateWithCurrentTime");
            break;
            paramParticleEmitterParam = new Vector2();
            break label308;
          }
        }
      i4 = 0;
      if (i4 < 18)
      {
        if ((i4 + 2) % 3 == 0)
          arrayOfFloat[(j + i4)] = (this.height - this.particleEmitter.particleVertices[(k + i4)]);
        while (true)
        {
          i4++;
          break;
          arrayOfFloat[(j + i4)] = this.particleEmitter.particleVertices[(k + i4)];
        }
      }
      i4 = 0;
      if (i4 < 12)
      {
        if (i4 % 2 != 0);
        for (f3 = 1.0F - this.particleEmitter.particleTextureCoordinates[(n + i4)]; ; f3 = this.particleEmitter.particleTextureCoordinates[(n + i4)])
        {
          paramParticleEmitterParam[(m + i4)] = f3;
          i4++;
          break;
        }
      }
      i2 += 24;
      k += 18;
      n += 12;
      i1 += 24;
      j += 18;
      m += 12;
    }
    label561: BenchUtil.benchEnd("setValue");
    setCoordNum(i * 6);
    addParam(new m.n("inputImageTexture2", this.particleEmitter.texture, 33986));
    addParam(new m.i("isPartical2", 1));
    addAttribParam(new AttributeParam("aColor", (float[])localObject2, 4));
    addAttribParam(new AttributeParam("position", normalizePosition(arrayOfFloat, this.width, this.height), 3));
    setTexCords(paramParticleEmitterParam);
    if (this.particleEmitter.opacityModifyRGB)
    {
      j = 1;
      addParam(new m.i("u_opacityModifyRGB", j));
      if (VideoMaterialUtil.isBodyDetectItem(this.item))
      {
        if (this.particleParam == null)
          this.particleParam = new ParticleParam();
        this.particleParam.id = (this.item.id + this.item.alignFacePoints[0]);
        this.particleParam.needRender = true;
        this.particleParam.coordNum = (i * 6);
        this.particleParam.blendFuncSrc = this.particleEmitter.blendFuncSource;
        this.particleParam.blendFuncDst = this.particleEmitter.blendFuncDestination;
        this.particleParam.texture = this.particleEmitter.texture;
        this.particleParam.isPartical2 = 1;
        localObject1 = this.particleParam;
        if (!this.particleEmitter.opacityModifyRGB)
          break label927;
        j = 1;
        label847: ((ParticleParam)localObject1).u_opacityModifyRGB = j;
        this.particleParam.maxParticleNum = this.item.particleConfig.getParticleEmitterConfig().getMaxParticles().getValue();
        this.particleParam.aColor = ((float[])localObject2);
        this.particleParam.position = normalizePosition(arrayOfFloat, this.width, this.height);
        this.particleParam.inputTextureCoordinate = paramParticleEmitterParam;
      }
      AppMethodBeat.o(83626);
    }
    while (true)
    {
      return;
      j = 0;
      break;
      label927: j = 0;
      break label847;
      label933: resetParams();
      AppMethodBeat.o(83626);
    }
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(83629);
    super.clearGLSLSelf();
    this.particleEmitter.clear();
    AppMethodBeat.o(83629);
  }

  public ParticleParam getParticleParam()
  {
    return this.particleParam;
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(83622);
    super.initAttribParams();
    addAttribParam(new AttributeParam("position", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 3));
    addAttribParam(new AttributeParam("inputTextureCoordinate", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 2));
    addAttribParam(new AttributeParam("aColor", new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F }, 4));
    AppMethodBeat.o(83622);
  }

  public void initParams()
  {
    int i = 1;
    AppMethodBeat.i(83621);
    addParam(new m.i("isPartical2", 1));
    if (this.particleEmitter.opacityModifyRGB);
    while (true)
    {
      addParam(new m.i("u_opacityModifyRGB", i));
      addParam(new m.n("inputImageTexture2", 0, 33986));
      setCoordNum(6);
      this.particleParam.needRender = false;
      AppMethodBeat.o(83621);
      return;
      i = 0;
    }
  }

  public boolean isBodyNeeded()
  {
    if (this.item.type == VideoFilterFactory.POSITION_TYPE.BODY.type);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isStatic()
  {
    if ((this.item.type == VideoFilterFactory.POSITION_TYPE.STATIC.type) || (this.item.type == VideoFilterFactory.POSITION_TYPE.RELATIVE.type));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(83628);
    boolean bool1 = GlUtil.curBlendModeEnabled;
    GLES20.glEnable(3042);
    GLES20.glBlendFunc(this.particleEmitter.blendFuncSource, this.particleEmitter.blendFuncDestination);
    boolean bool2 = super.renderTexture(paramInt1, paramInt2, paramInt3);
    GlUtil.setBlendMode(bool1);
    AppMethodBeat.o(83628);
    return bool2;
  }

  protected void update(List<PointF> paramList, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(83624);
    updateParticle(updateEmitterParam(paramList, paramArrayOfFloat));
    AppMethodBeat.o(83624);
  }

  protected TRIGGERED_STATUS updateActionTriggered(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(83627);
    paramPTDetectInfo = this.triggerCtrlItem.getTriggeredStatus(paramPTDetectInfo);
    AppMethodBeat.o(83627);
    return paramPTDetectInfo;
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(83623);
    if (VideoMaterialUtil.isBodyDetectItem(this.item))
      avoidBodyPointsShake(paramPTDetectInfo);
    updateActionTriggered(paramPTDetectInfo);
    if (!this.triggerCtrlItem.isTriggered())
    {
      resetParams();
      AppMethodBeat.o(83623);
    }
    while (true)
    {
      return;
      if (VideoMaterialUtil.isGestureItem(this.item))
      {
        update(paramPTDetectInfo.handPoints, paramPTDetectInfo.faceAngles);
        AppMethodBeat.o(83623);
      }
      else if (VideoMaterialUtil.isBodyDetectItem(this.item))
      {
        update(paramPTDetectInfo.bodyPoints, paramPTDetectInfo.faceAngles);
        if (!this.mHasBodyDetected)
        {
          paramPTDetectInfo.bodyPoints = null;
          AppMethodBeat.o(83623);
        }
      }
      else
      {
        update(paramPTDetectInfo.facePoints, paramPTDetectInfo.faceAngles);
        AppMethodBeat.o(83623);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.particle.ParticleFilter
 * JD-Core Version:    0.6.2
 */
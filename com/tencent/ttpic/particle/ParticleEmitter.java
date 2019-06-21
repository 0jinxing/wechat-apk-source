package com.tencent.ttpic.particle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.io.File;

public class ParticleEmitter
{
  private static final String TAG;
  public boolean active;
  public float angle;
  public float angleVariance;
  private float audioColorDelta;
  public int blendFuncDestination;
  public int blendFuncSource;
  public float duration;
  public float elapsedTime;
  public float emissionRate;
  public float emitCounter;
  public int emitterType;
  public Vector4 finishColor;
  public Vector4 finishColorVariance;
  public float finishParticleSize;
  public float finishParticleSizeVariance;
  public Vector2 gravity;
  public int maxParticles;
  public float maxRadius;
  public float maxRadiusVariance;
  public float minRadius;
  public float minRadiusVariance;
  public boolean opacityModifyRGB;
  public float[] particleColors;
  public int particleCount;
  private int particleIndex;
  public int[] particleIndices;
  public float particleLifespan;
  public float particleLifespanVariance;
  public float[] particleTextureCoordinates;
  public float[] particleVertices;
  private Particle[] particles;
  private ParticleQuad[] quads;
  public float radialAccelVariance;
  public float radialAcceleration;
  public float radiusSpeed;
  private float rotateParticle = 0.0F;
  public float rotatePerSecond;
  public float rotatePerSecondVariance;
  public float rotationEnd;
  public float rotationEndVariance;
  public float rotationStart;
  public float rotationStartVariance;
  private float scaleParticle = 1.0F;
  public Vector2 sourcePosition;
  public Vector2 sourcePositionVariance;
  public float speed;
  public float speedVariance;
  public Vector4 startColor;
  public Vector4 startColorVariance;
  public float startParticleSize;
  public float startParticleSizeVariance;
  public long startTime;
  public float tangentialAccelVariance;
  public float tangentialAcceleration;
  public int texture;

  static
  {
    AppMethodBeat.i(83618);
    TAG = ParticleEmitter.class.getSimpleName();
    AppMethodBeat.o(83618);
  }

  private boolean addParticle()
  {
    AppMethodBeat.i(83611);
    boolean bool;
    if (this.particleCount == this.maxParticles)
    {
      bool = false;
      AppMethodBeat.o(83611);
    }
    while (true)
    {
      return bool;
      initParticle(this.particles[this.particleCount]);
      this.particleCount += 1;
      bool = true;
      AppMethodBeat.o(83611);
    }
  }

  public static Bitmap base64ToBitmap(String paramString)
  {
    AppMethodBeat.i(83616);
    try
    {
      paramString = Base64.decode(paramString, 0);
      paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
      AppMethodBeat.o(83616);
      return paramString;
    }
    catch (OutOfMemoryError paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(83616);
      }
    }
  }

  private void initParticle(Particle paramParticle)
  {
    AppMethodBeat.i(83614);
    paramParticle.position.x = (this.sourcePosition.x + this.sourcePositionVariance.x * ParticleUtil.randomMinus1to1());
    paramParticle.position.y = (this.sourcePosition.y + this.sourcePositionVariance.y * ParticleUtil.randomMinus1to1());
    paramParticle.startPos.x = this.sourcePosition.x;
    paramParticle.startPos.y = this.sourcePosition.y;
    float f1 = (float)Math.toRadians(this.angle + this.angleVariance * ParticleUtil.randomMinus1to1() + this.rotateParticle);
    paramParticle.direction = ParticleUtil.vectorMultiplyScalar(new Vector2((float)Math.cos(f1), (float)Math.sin(f1)), this.speed + this.speedVariance * ParticleUtil.randomMinus1to1());
    paramParticle.timeToLive = Math.max(0.0F, this.particleLifespan + this.particleLifespanVariance * ParticleUtil.randomMinus1to1());
    f1 = this.maxRadius + this.maxRadiusVariance * ParticleUtil.randomMinus1to1();
    float f2 = this.minRadius;
    float f3 = this.minRadiusVariance;
    float f4 = ParticleUtil.randomMinus1to1();
    paramParticle.radius = f1;
    paramParticle.radiusDelta = ((f2 + f3 * f4 - f1) / paramParticle.timeToLive);
    paramParticle.angle = ((float)Math.toRadians(this.angle + this.angleVariance * ParticleUtil.randomMinus1to1() + this.rotateParticle));
    paramParticle.degreesPerSecond = ((float)Math.toRadians(this.rotatePerSecond + this.rotatePerSecondVariance * ParticleUtil.randomMinus1to1()));
    paramParticle.radialAcceleration = (this.radialAcceleration + this.radialAccelVariance * ParticleUtil.randomMinus1to1());
    paramParticle.tangentialAcceleration = (this.tangentialAcceleration + this.tangentialAccelVariance * ParticleUtil.randomMinus1to1());
    f1 = this.startParticleSize + this.startParticleSizeVariance * ParticleUtil.randomMinus1to1();
    paramParticle.particleSizeDelta = ((this.finishParticleSize + this.finishParticleSizeVariance * ParticleUtil.randomMinus1to1() - f1) / paramParticle.timeToLive);
    paramParticle.particleSize = Math.max(0.0F, f1);
    Vector4 localVector41 = new Vector4(0.0F, 0.0F, 0.0F, 0.0F);
    localVector41.r = (this.startColor.r + this.startColorVariance.r * ParticleUtil.randomMinus1to1());
    localVector41.g = (this.startColor.g + this.startColorVariance.g * ParticleUtil.randomMinus1to1());
    localVector41.b = (this.startColor.b + this.startColorVariance.b * ParticleUtil.randomMinus1to1());
    localVector41.a = (this.startColor.a + this.startColorVariance.a * ParticleUtil.randomMinus1to1());
    Vector4 localVector42 = new Vector4(0.0F, 0.0F, 0.0F, 0.0F);
    localVector42.r = (this.finishColor.r + this.finishColorVariance.r * ParticleUtil.randomMinus1to1());
    localVector42.g = (this.finishColor.g + this.finishColorVariance.g * ParticleUtil.randomMinus1to1());
    localVector42.b = (this.finishColor.b + this.finishColorVariance.b * ParticleUtil.randomMinus1to1());
    localVector42.a = (this.finishColor.a + this.finishColorVariance.a * ParticleUtil.randomMinus1to1());
    paramParticle.color = localVector41;
    paramParticle.deltaColor.r = ((localVector42.r - localVector41.r) / paramParticle.timeToLive);
    paramParticle.deltaColor.g = ((localVector42.g - localVector41.g) / paramParticle.timeToLive);
    paramParticle.deltaColor.b = ((localVector42.b - localVector41.b) / paramParticle.timeToLive);
    paramParticle.deltaColor.a = ((localVector42.a - localVector41.a) / paramParticle.timeToLive);
    f2 = this.rotationStart + this.rotationStartVariance * ParticleUtil.randomMinus1to1();
    f1 = this.rotationEnd;
    f4 = this.rotationEndVariance;
    f3 = ParticleUtil.randomMinus1to1();
    paramParticle.rotation = f2;
    paramParticle.rotationDelta = ((f1 + f4 * f3 - f2) / paramParticle.timeToLive);
    AppMethodBeat.o(83614);
  }

  private void setParticleConfig(String paramString, ParticleConfig paramParticleConfig)
  {
    String str = null;
    AppMethodBeat.i(83612);
    ParticleConfig.ParticleEmitterConfigBean localParticleEmitterConfigBean = paramParticleConfig.getParticleEmitterConfig();
    int i;
    label70: label107: float f;
    if (localParticleEmitterConfigBean.emitterType != null)
    {
      i = localParticleEmitterConfigBean.emitterType.getValue();
      this.emitterType = i;
      if (localParticleEmitterConfigBean.sourcePosition == null)
        break label1154;
      paramParticleConfig = new Vector2(localParticleEmitterConfigBean.sourcePosition.x, localParticleEmitterConfigBean.sourcePosition.y);
      this.sourcePosition = paramParticleConfig;
      if (localParticleEmitterConfigBean.sourcePositionVariance == null)
        break label1159;
      paramParticleConfig = new Vector2(localParticleEmitterConfigBean.sourcePositionVariance.x, localParticleEmitterConfigBean.sourcePositionVariance.y);
      this.sourcePositionVariance = paramParticleConfig;
      if (localParticleEmitterConfigBean.speed == null)
        break label1164;
      f = localParticleEmitterConfigBean.speed.getValue();
      label130: this.speed = f;
      if (localParticleEmitterConfigBean.speedVariance == null)
        break label1170;
      f = localParticleEmitterConfigBean.speedVariance.getValue();
      label154: this.speedVariance = f;
      if (localParticleEmitterConfigBean.particleLifeSpan == null)
        break label1176;
      f = localParticleEmitterConfigBean.particleLifeSpan.getValue();
      label178: this.particleLifespan = f;
      if (localParticleEmitterConfigBean.particleLifespanVariance == null)
        break label1182;
      f = localParticleEmitterConfigBean.particleLifespanVariance.getValue();
      label202: this.particleLifespanVariance = f;
      if (localParticleEmitterConfigBean.angle == null)
        break label1188;
      f = localParticleEmitterConfigBean.angle.getValue();
      label226: this.angle = f;
      if (localParticleEmitterConfigBean.angleVariance == null)
        break label1194;
      f = localParticleEmitterConfigBean.angleVariance.getValue();
      label250: this.angleVariance = f;
      if (localParticleEmitterConfigBean.gravity == null)
        break label1200;
      paramParticleConfig = new Vector2(localParticleEmitterConfigBean.gravity.x, localParticleEmitterConfigBean.gravity.y);
      label288: this.gravity = paramParticleConfig;
      if (localParticleEmitterConfigBean.radialAcceleration == null)
        break label1205;
      f = localParticleEmitterConfigBean.radialAcceleration.getValue();
      label311: this.radialAcceleration = f;
      if (localParticleEmitterConfigBean.tangentialAcceleration == null)
        break label1211;
      f = localParticleEmitterConfigBean.tangentialAcceleration.getValue();
      label335: this.tangentialAcceleration = f;
      if (localParticleEmitterConfigBean.tangentialAccelVariance == null)
        break label1217;
      f = localParticleEmitterConfigBean.tangentialAccelVariance.getValue();
      label359: this.tangentialAccelVariance = f;
      if (localParticleEmitterConfigBean.startColor == null)
        break label1223;
      paramParticleConfig = new Vector4(localParticleEmitterConfigBean.startColor.red, localParticleEmitterConfigBean.startColor.green, localParticleEmitterConfigBean.startColor.blue, localParticleEmitterConfigBean.startColor.alpha);
      label413: this.startColor = paramParticleConfig;
      if (localParticleEmitterConfigBean.startColorVariance == null)
        break label1228;
      paramParticleConfig = new Vector4(localParticleEmitterConfigBean.startColorVariance.red, localParticleEmitterConfigBean.startColorVariance.green, localParticleEmitterConfigBean.startColorVariance.blue, localParticleEmitterConfigBean.startColorVariance.alpha);
      label466: this.startColorVariance = paramParticleConfig;
      if (localParticleEmitterConfigBean.finishColor == null)
        break label1233;
      paramParticleConfig = new Vector4(localParticleEmitterConfigBean.finishColor.red, localParticleEmitterConfigBean.finishColor.green, localParticleEmitterConfigBean.finishColor.blue, localParticleEmitterConfigBean.finishColor.alpha);
      label519: this.finishColor = paramParticleConfig;
      if (localParticleEmitterConfigBean.finishColorVariance == null)
        break label1238;
      paramParticleConfig = new Vector4(localParticleEmitterConfigBean.finishColorVariance.red, localParticleEmitterConfigBean.finishColorVariance.green, localParticleEmitterConfigBean.finishColorVariance.blue, localParticleEmitterConfigBean.finishColorVariance.alpha);
      label572: this.finishColorVariance = paramParticleConfig;
      if (localParticleEmitterConfigBean.maxParticles == null)
        break label1243;
      i = localParticleEmitterConfigBean.maxParticles.getValue();
      label595: this.maxParticles = i;
      if (localParticleEmitterConfigBean.startParticleSize == null)
        break label1249;
      f = localParticleEmitterConfigBean.startParticleSize.getValue();
      label619: this.startParticleSize = f;
      if (localParticleEmitterConfigBean.startParticleSizeVariance == null)
        break label1255;
      f = localParticleEmitterConfigBean.startParticleSizeVariance.getValue();
      label643: this.startParticleSizeVariance = f;
      if (localParticleEmitterConfigBean.finishParticleSize == null)
        break label1261;
      f = localParticleEmitterConfigBean.finishParticleSize.getValue();
      label667: this.finishParticleSize = f;
      if (localParticleEmitterConfigBean.finishParticleSizeVariance == null)
        break label1267;
      f = localParticleEmitterConfigBean.finishParticleSizeVariance.getValue();
      label691: this.finishParticleSizeVariance = f;
      if (localParticleEmitterConfigBean.duration == null)
        break label1273;
      f = localParticleEmitterConfigBean.duration.getValue();
      label715: this.duration = f;
      if (localParticleEmitterConfigBean.blendFuncSource == null)
        break label1279;
      i = localParticleEmitterConfigBean.blendFuncSource.getValue();
      label739: this.blendFuncSource = i;
      if (localParticleEmitterConfigBean.blendFuncDestination == null)
        break label1285;
      i = localParticleEmitterConfigBean.blendFuncDestination.getValue();
      label763: this.blendFuncDestination = i;
      if (localParticleEmitterConfigBean.maxRadius == null)
        break label1291;
      f = localParticleEmitterConfigBean.maxRadius.getValue();
      label787: this.maxRadius = f;
      if (localParticleEmitterConfigBean.maxRadiusVariance == null)
        break label1297;
      f = localParticleEmitterConfigBean.maxRadiusVariance.getValue();
      label811: this.maxRadiusVariance = f;
      if (localParticleEmitterConfigBean.minRadius == null)
        break label1303;
      f = localParticleEmitterConfigBean.minRadius.getValue();
      label835: this.minRadius = f;
      if (localParticleEmitterConfigBean.minRadiusVariance == null)
        break label1309;
      f = localParticleEmitterConfigBean.minRadiusVariance.getValue();
      label859: this.minRadiusVariance = f;
      if (localParticleEmitterConfigBean.rotatePerSecond == null)
        break label1315;
      f = localParticleEmitterConfigBean.rotatePerSecond.getValue();
      label883: this.rotatePerSecond = f;
      if (localParticleEmitterConfigBean.rotatePerSecondVariance == null)
        break label1321;
      f = localParticleEmitterConfigBean.rotatePerSecondVariance.getValue();
      label907: this.rotatePerSecondVariance = f;
      if (localParticleEmitterConfigBean.rotationStart == null)
        break label1327;
      f = localParticleEmitterConfigBean.rotationStart.getValue();
      label931: this.rotationStart = f;
      if (localParticleEmitterConfigBean.rotationStartVariance == null)
        break label1333;
      f = localParticleEmitterConfigBean.rotationStartVariance.getValue();
      label955: this.rotationStartVariance = f;
      if (localParticleEmitterConfigBean.rotationEnd == null)
        break label1339;
      f = localParticleEmitterConfigBean.rotationEnd.getValue();
      label979: this.rotationEnd = f;
      if (localParticleEmitterConfigBean.rotationEndVariance == null)
        break label1345;
      f = localParticleEmitterConfigBean.rotationEndVariance.getValue();
      label1003: this.rotationEndVariance = f;
      this.emissionRate = (this.maxParticles / this.particleLifespan);
      this.emitCounter = 0.0F;
      if (localParticleEmitterConfigBean.texture == null)
        break label1351;
      paramParticleConfig = localParticleEmitterConfigBean.texture.name;
      label1045: if (localParticleEmitterConfigBean.texture != null)
        str = localParticleEmitterConfigBean.texture.data;
      if (TextUtils.isEmpty(paramParticleConfig))
        break label1356;
    }
    label1154: label1159: label1164: label1170: label1176: label1182: label1188: label1194: label1200: label1205: label1211: label1217: label1223: label1356: for (paramString = BitmapUtils.decodeSampleBitmap(VideoGlobalContext.getContext(), paramString + File.separator + paramParticleConfig, 1); ; paramString = base64ToBitmap(str))
    {
      if ((paramString != null) && (!paramString.isRecycled()))
      {
        paramParticleConfig = new int[1];
        GLES20.glGenTextures(1, paramParticleConfig, 0);
        this.texture = paramParticleConfig[0];
        GlUtil.loadTexture(this.texture, paramString);
        paramString.recycle();
      }
      AppMethodBeat.o(83612);
      return;
      i = 0;
      break;
      paramParticleConfig = null;
      break label70;
      paramParticleConfig = null;
      break label107;
      f = 0.0F;
      break label130;
      f = 0.0F;
      break label154;
      f = 0.0F;
      break label178;
      f = 0.0F;
      break label202;
      f = 0.0F;
      break label226;
      f = 0.0F;
      break label250;
      paramParticleConfig = null;
      break label288;
      f = 0.0F;
      break label311;
      f = 0.0F;
      break label335;
      f = 0.0F;
      break label359;
      paramParticleConfig = null;
      break label413;
      label1228: paramParticleConfig = null;
      break label466;
      label1233: paramParticleConfig = null;
      break label519;
      label1238: paramParticleConfig = null;
      break label572;
      label1243: i = 0;
      break label595;
      label1249: f = 0.0F;
      break label619;
      label1255: f = 0.0F;
      break label643;
      label1261: f = 0.0F;
      break label667;
      label1267: f = 0.0F;
      break label691;
      label1273: f = 0.0F;
      break label715;
      label1279: i = 0;
      break label739;
      i = 0;
      break label763;
      f = 0.0F;
      break label787;
      f = 0.0F;
      break label811;
      f = 0.0F;
      break label835;
      f = 0.0F;
      break label859;
      f = 0.0F;
      break label883;
      f = 0.0F;
      break label907;
      f = 0.0F;
      break label931;
      f = 0.0F;
      break label955;
      f = 0.0F;
      break label979;
      f = 0.0F;
      break label1003;
      paramParticleConfig = null;
      break label1045;
    }
  }

  private void setupArrays()
  {
    AppMethodBeat.i(83613);
    this.particles = new Particle[this.maxParticles];
    for (int i = 0; i < this.particles.length; i++)
      this.particles[i] = new Particle();
    this.quads = new ParticleQuad[this.maxParticles];
    for (i = 0; i < this.quads.length; i++)
      this.quads[i] = new ParticleQuad();
    this.particleIndices = new int[this.maxParticles * 6];
    this.particleVertices = new float[this.maxParticles * 18];
    this.particleTextureCoordinates = new float[this.maxParticles * 12];
    this.particleColors = new float[this.maxParticles * 24];
    for (i = 0; i < this.maxParticles; i++)
    {
      this.quads[i].bl.texture.x = 0.0F;
      this.quads[i].bl.texture.y = 0.0F;
      this.quads[i].br.texture.x = 1.0F;
      this.quads[i].br.texture.y = 0.0F;
      this.quads[i].tl.texture.x = 0.0F;
      this.quads[i].tl.texture.y = 1.0F;
      this.quads[i].tr.texture.x = 1.0F;
      this.quads[i].tr.texture.y = 1.0F;
    }
    for (i = 0; i < this.maxParticles; i++)
    {
      this.particleIndices[(i * 6 + 0)] = (i * 4 + 0);
      this.particleIndices[(i * 6 + 1)] = (i * 4 + 1);
      this.particleIndices[(i * 6 + 2)] = (i * 4 + 2);
      this.particleIndices[(i * 6 + 5)] = (i * 4 + 2);
      this.particleIndices[(i * 6 + 4)] = (i * 4 + 3);
      this.particleIndices[(i * 6 + 3)] = (i * 4 + 1);
    }
    this.active = true;
    this.particleCount = 0;
    this.elapsedTime = 0.0F;
    AppMethodBeat.o(83613);
  }

  private void stopParticleEmitter()
  {
    this.active = false;
    this.elapsedTime = 0.0F;
    this.emitCounter = 0.0F;
  }

  public int activeParticleCount()
  {
    return this.particleCount;
  }

  public void clear()
  {
    AppMethodBeat.i(83617);
    GLES20.glDeleteTextures(1, new int[] { this.texture }, 0);
    AppMethodBeat.o(83617);
  }

  public void initEmitter(String paramString, ParticleConfig paramParticleConfig)
  {
    AppMethodBeat.i(83609);
    setParticleConfig(paramString, paramParticleConfig);
    setupArrays();
    AppMethodBeat.o(83609);
  }

  public void reset()
  {
    this.active = true;
    this.elapsedTime = 0.0F;
    for (int i = 0; i < this.particleCount; i++)
      this.particles[i].timeToLive = 0.0F;
    this.emitCounter = 0.0F;
    this.emissionRate = (this.maxParticles / this.particleLifespan);
  }

  public void setExtraRotate(float paramFloat)
  {
    this.rotateParticle = paramFloat;
  }

  public void setExtraScale(float paramFloat)
  {
    this.scaleParticle = paramFloat;
  }

  public void setSourcePosition(Vector2 paramVector2)
  {
    this.sourcePosition.x = paramVector2.x;
    this.sourcePosition.y = paramVector2.y;
  }

  public boolean totalFinished()
  {
    if ((!this.active) && (this.particleCount == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void updateWithCurrentTime(long paramLong, boolean paramBoolean)
  {
    long l = 0L;
    AppMethodBeat.i(83610);
    if (this.startTime > 0L)
      l = paramLong - this.startTime;
    this.startTime = paramLong;
    updateWithDelta((float)l * 1.0F / 1000.0F, paramBoolean);
    AppMethodBeat.o(83610);
  }

  public void updateWithDelta(float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(83615);
    float f1;
    if ((paramBoolean) && (this.active) && (this.emissionRate > 0.0F))
    {
      f1 = 1.0F / this.emissionRate;
      if (this.particleCount < this.maxParticles)
        this.emitCounter += paramFloat;
      if ((this.particleCount == 0) && (this.particleLifespanVariance < 0.01D) && (this.emitCounter >= this.maxParticles * f1));
      for (this.emitCounter = (this.maxParticles * f1 * ParticleUtil.random0to1()); (this.particleCount < this.maxParticles) && (this.emitCounter > f1); this.emitCounter -= f1)
        addParticle();
      this.elapsedTime += paramFloat;
      if ((this.duration != -1.0F) && (this.duration < this.elapsedTime))
        stopParticleEmitter();
    }
    this.particleIndex = 0;
    LogUtils.e(TAG, "updateWithDelta() - particleCount = " + this.particleCount);
    while (this.particleIndex < this.particleCount)
    {
      Particle localParticle = this.particles[this.particleIndex];
      localParticle.timeToLive -= paramFloat;
      int i = this.particleIndex * 18;
      if (localParticle.timeToLive > 0.0F)
      {
        Object localObject;
        label514: float f2;
        if (this.emitterType == ParticleEmitter.kParticleTypes.kParticleTypeRadial.value)
        {
          localParticle.angle += localParticle.degreesPerSecond * paramFloat;
          localParticle.radius += localParticle.radiusDelta * paramFloat;
          localObject = new Vector2();
          ((Vector2)localObject).x = ((float)(this.sourcePosition.x - Math.cos(localParticle.angle) * localParticle.radius));
          ((Vector2)localObject).y = ((float)(this.sourcePosition.y - Math.sin(localParticle.angle) * localParticle.radius));
          localParticle.position = ((Vector2)localObject);
          if (this.audioColorDelta <= 0.0F)
            break label1835;
          localParticle.color.r = (this.startColor.r + localParticle.deltaColor.r * this.audioColorDelta);
          localParticle.color.g = (this.startColor.g + localParticle.deltaColor.g * this.audioColorDelta);
          localParticle.color.b = (this.startColor.b + localParticle.deltaColor.b * this.audioColorDelta);
          localParticle.color.a = (this.startColor.a + localParticle.deltaColor.a * this.audioColorDelta);
          localParticle.particleSize += localParticle.particleSizeDelta * paramFloat;
          localParticle.particleSize = Math.max(0.0F, localParticle.particleSize);
          localParticle.rotation += localParticle.rotationDelta * paramFloat;
          f2 = localParticle.particleSize * 0.5F * this.scaleParticle;
          if (localParticle.rotation == 0.0F)
            break label1950;
          float f3 = -f2;
          float f4 = -f2;
          float f5 = localParticle.position.x;
          float f6 = localParticle.position.y;
          float f7 = (float)Math.toRadians(localParticle.rotation);
          f1 = (float)Math.cos(f7);
          f7 = (float)Math.sin(f7);
          this.quads[this.particleIndex].bl.vertex.x = (f3 * f1 - f4 * f7 + f5);
          this.quads[this.particleIndex].bl.vertex.y = (f3 * f7 + f4 * f1 + f6);
          this.quads[this.particleIndex].bl.color = localParticle.color;
          this.quads[this.particleIndex].br.vertex.x = (f2 * f1 - f4 * f7 + f5);
          this.quads[this.particleIndex].br.vertex.y = (f4 * f1 + f2 * f7 + f6);
          this.quads[this.particleIndex].br.color = localParticle.color;
          this.quads[this.particleIndex].tl.vertex.x = (f5 + (f3 * f1 - f2 * f7));
          this.quads[this.particleIndex].tl.vertex.y = (f2 * f1 + f3 * f7 + f6);
          this.quads[this.particleIndex].tl.color = localParticle.color;
          this.quads[this.particleIndex].tr.vertex.x = (f2 * f1 - f2 * f7 + f5);
          this.quads[this.particleIndex].tr.vertex.y = (f2 * f7 + f2 * f1 + f6);
          this.quads[this.particleIndex].tr.color = localParticle.color;
          this.particleVertices[i] = this.quads[this.particleIndex].bl.vertex.x;
          this.particleVertices[(i + 1)] = this.quads[this.particleIndex].bl.vertex.y;
          this.particleVertices[(i + 2)] = 0.0F;
          this.particleVertices[(i + 3)] = this.quads[this.particleIndex].br.vertex.x;
          this.particleVertices[(i + 4)] = this.quads[this.particleIndex].br.vertex.y;
          this.particleVertices[(i + 5)] = 0.0F;
          this.particleVertices[(i + 6)] = this.quads[this.particleIndex].tl.vertex.x;
          this.particleVertices[(i + 7)] = this.quads[this.particleIndex].tl.vertex.y;
          this.particleVertices[(i + 8)] = 0.0F;
          this.particleVertices[(i + 9)] = this.quads[this.particleIndex].br.vertex.x;
          this.particleVertices[(i + 10)] = this.quads[this.particleIndex].br.vertex.y;
          this.particleVertices[(i + 11)] = 0.0F;
          this.particleVertices[(i + 12)] = this.quads[this.particleIndex].tl.vertex.x;
          this.particleVertices[(i + 13)] = this.quads[this.particleIndex].tl.vertex.y;
          this.particleVertices[(i + 14)] = 0.0F;
          this.particleVertices[(i + 15)] = this.quads[this.particleIndex].tr.vertex.x;
          this.particleVertices[(i + 16)] = this.quads[this.particleIndex].tr.vertex.y;
          this.particleVertices[(i + 17)] = 0.0F;
        }
        while (true)
        {
          i = this.particleIndex * 12;
          this.particleTextureCoordinates[i] = 0.0F;
          this.particleTextureCoordinates[(i + 1)] = 0.0F;
          this.particleTextureCoordinates[(i + 2)] = 1.0F;
          this.particleTextureCoordinates[(i + 3)] = 0.0F;
          this.particleTextureCoordinates[(i + 4)] = 0.0F;
          this.particleTextureCoordinates[(i + 5)] = 1.0F;
          this.particleTextureCoordinates[(i + 6)] = this.particleTextureCoordinates[(i + 2)];
          this.particleTextureCoordinates[(i + 7)] = this.particleTextureCoordinates[(i + 3)];
          this.particleTextureCoordinates[(i + 8)] = this.particleTextureCoordinates[(i + 4)];
          this.particleTextureCoordinates[(i + 9)] = this.particleTextureCoordinates[(i + 5)];
          this.particleTextureCoordinates[(i + 10)] = 1.0F;
          this.particleTextureCoordinates[(i + 11)] = 1.0F;
          for (i = 0; i < 6; i++)
          {
            int j = this.particleIndex * 24 + i * 4;
            this.particleColors[j] = localParticle.color.r;
            this.particleColors[(j + 1)] = localParticle.color.g;
            this.particleColors[(j + 2)] = localParticle.color.b;
            this.particleColors[(j + 3)] = localParticle.color.a;
          }
          localObject = new Vector2(0.0F, 0.0F);
          Vector2 localVector21 = ParticleUtil.vectorSubtract(localParticle.startPos, new Vector2(0.0F, 0.0F));
          localParticle.position = ParticleUtil.vectorSubtract(localParticle.position, localVector21);
          if ((localParticle.position.x != 0.0F) || (localParticle.position.y != 0.0F))
            localObject = ParticleUtil.vectorNormalize(localParticle.position);
          Vector2 localVector22 = ParticleUtil.vectorMultiplyScalar((Vector2)localObject, localParticle.radialAcceleration);
          f1 = ((Vector2)localObject).x;
          ((Vector2)localObject).x = (-((Vector2)localObject).y);
          ((Vector2)localObject).y = f1;
          localObject = ParticleUtil.vectorMultiplyScalar(ParticleUtil.vectorAdd(ParticleUtil.vectorAdd(localVector22, ParticleUtil.vectorMultiplyScalar((Vector2)localObject, localParticle.tangentialAcceleration)), this.gravity), paramFloat);
          localParticle.direction = ParticleUtil.vectorAdd(localParticle.direction, (Vector2)localObject);
          localObject = ParticleUtil.vectorMultiplyScalar(localParticle.direction, paramFloat);
          localParticle.position = ParticleUtil.vectorAdd(localParticle.position, (Vector2)localObject);
          localParticle.position = ParticleUtil.vectorAdd(localParticle.position, localVector21);
          break;
          label1835: localObject = localParticle.color;
          ((Vector4)localObject).r += localParticle.deltaColor.r * paramFloat;
          localObject = localParticle.color;
          ((Vector4)localObject).g += localParticle.deltaColor.g * paramFloat;
          localObject = localParticle.color;
          ((Vector4)localObject).b += localParticle.deltaColor.b * paramFloat;
          localObject = localParticle.color;
          ((Vector4)localObject).a += localParticle.deltaColor.a * paramFloat;
          break label514;
          label1950: this.quads[this.particleIndex].bl.vertex.x = (localParticle.position.x - f2);
          this.quads[this.particleIndex].bl.vertex.y = (localParticle.position.y - f2);
          this.quads[this.particleIndex].bl.color = localParticle.color;
          this.quads[this.particleIndex].br.vertex.x = (localParticle.position.x + f2);
          this.quads[this.particleIndex].br.vertex.y = (localParticle.position.y - f2);
          this.quads[this.particleIndex].br.color = localParticle.color;
          this.quads[this.particleIndex].tl.vertex.x = (localParticle.position.x - f2);
          this.quads[this.particleIndex].tl.vertex.y = (localParticle.position.y + f2);
          this.quads[this.particleIndex].tl.color = localParticle.color;
          this.quads[this.particleIndex].tr.vertex.x = (localParticle.position.x + f2);
          this.quads[this.particleIndex].tr.vertex.y = (f2 + localParticle.position.y);
          this.quads[this.particleIndex].tr.color = localParticle.color;
          this.particleVertices[i] = this.quads[this.particleIndex].bl.vertex.x;
          this.particleVertices[(i + 1)] = this.quads[this.particleIndex].bl.vertex.y;
          this.particleVertices[(i + 2)] = 0.0F;
          this.particleVertices[(i + 3)] = this.quads[this.particleIndex].br.vertex.x;
          this.particleVertices[(i + 4)] = this.quads[this.particleIndex].br.vertex.y;
          this.particleVertices[(i + 5)] = 0.0F;
          this.particleVertices[(i + 6)] = this.quads[this.particleIndex].tl.vertex.x;
          this.particleVertices[(i + 7)] = this.quads[this.particleIndex].tl.vertex.y;
          this.particleVertices[(i + 8)] = 0.0F;
          this.particleVertices[(i + 9)] = this.quads[this.particleIndex].br.vertex.x;
          this.particleVertices[(i + 10)] = this.quads[this.particleIndex].br.vertex.y;
          this.particleVertices[(i + 11)] = 0.0F;
          this.particleVertices[(i + 12)] = this.quads[this.particleIndex].tl.vertex.x;
          this.particleVertices[(i + 13)] = this.quads[this.particleIndex].tl.vertex.y;
          this.particleVertices[(i + 14)] = 0.0F;
          this.particleVertices[(i + 15)] = this.quads[this.particleIndex].tr.vertex.x;
          this.particleVertices[(i + 16)] = this.quads[this.particleIndex].tr.vertex.y;
          this.particleVertices[(i + 17)] = 0.0F;
        }
        this.particleIndex += 1;
      }
      else
      {
        if (this.particleIndex != this.particleCount - 1)
          this.particles[this.particleIndex].copy(this.particles[(this.particleCount - 1)]);
        this.particleCount -= 1;
      }
    }
    AppMethodBeat.o(83615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.particle.ParticleEmitter
 * JD-Core Version:    0.6.2
 */
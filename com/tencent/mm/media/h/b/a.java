package com.tencent.mm.media.h.b;

import a.f.b.j;
import a.l;
import a.y;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.mm.media.i.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "", "textureWidth", "", "textureHeight", "drawWidth", "drawHeight", "renderOutputType", "scaleType", "(IIIIII)V", "cubeBuffer", "Ljava/nio/FloatBuffer;", "getCubeBuffer", "()Ljava/nio/FloatBuffer;", "setCubeBuffer", "(Ljava/nio/FloatBuffer;)V", "getDrawHeight", "()I", "setDrawHeight", "(I)V", "getDrawWidth", "setDrawWidth", "flip", "", "mirror", "onFBOAvailableListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "texture", "", "getOnFBOAvailableListener", "()Lkotlin/jvm/functions/Function1;", "setOnFBOAvailableListener", "(Lkotlin/jvm/functions/Function1;)V", "onRGBDataAvailableListener", "Ljava/nio/IntBuffer;", "buffer", "getOnRGBDataAvailableListener", "setOnRGBDataAvailableListener", "renderOutputBuffer", "renderOutputTexture", "renderOutputTextureFbo", "getRenderOutputType", "rotateDegree", "getScaleType", "textureCoordBuff", "getTextureCoordBuff", "setTextureCoordBuff", "textureCropRect", "Landroid/graphics/Rect;", "getTextureHeight", "setTextureHeight", "getTextureWidth", "setTextureWidth", "transformMatrix", "", "getTransformMatrix", "()[F", "setTransformMatrix", "([F)V", "afterRender", "beforeRender", "checkInitRenderOutputBuffer", "flipUpsideDown", "frameMirror", "getOutputBuffer", "getOutputTexture", "getRotate", "initMatrix", "isMirror", "release", "render", "renderImpl", "setFrame", "frame", "", "setInputTexture", "setRotate", "degree", "setTextureCropRect", "rect", "updateDrawViewSize", "width", "height", "updateTextureSize", "Companion", "plugin-mediaeditor_release"})
public abstract class a
{
  public static final a.a eZq = new a.a((byte)0);
  public int eYR;
  public boolean eYS;
  public int eYW;
  public int eYX;
  protected int eYY;
  protected int eYZ;
  private final int eZa;
  public Rect eZd;
  FloatBuffer eZh;
  FloatBuffer eZi;
  private int eZj;
  private int eZk;
  public IntBuffer eZl;
  float[] eZm;
  private boolean eZn;
  private a.f.a.b<? super Integer, y> eZo;
  private a.f.a.b<? super IntBuffer, y> eZp;
  private final int scaleType;

  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.eYW = paramInt1;
    this.eYX = paramInt2;
    this.eYY = paramInt3;
    this.eYZ = paramInt4;
    this.eZa = paramInt5;
    this.scaleType = paramInt6;
    Object localObject = ByteBuffer.allocateDirect(com.tencent.mm.media.i.b.eZZ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    j.o(localObject, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
    this.eZh = ((FloatBuffer)localObject);
    localObject = ByteBuffer.allocateDirect(com.tencent.mm.media.i.b.eZY.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    j.o(localObject, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
    this.eZi = ((FloatBuffer)localObject);
    this.eZm = new float[16];
    if (this.eZa == 2)
    {
      localObject = com.tencent.mm.media.i.b.fad;
      this.eZj = b.a.Vh();
      localObject = com.tencent.mm.media.i.b.fad;
      this.eZk = b.a.Vi();
    }
    while (true)
    {
      return;
      if (this.eZa == 3)
        Ve();
    }
  }

  private final void Ve()
  {
    if ((this.eYY > 0) && (this.eYZ > 0))
      this.eZl = IntBuffer.allocate(this.eYY * this.eYZ);
  }

  public void M(byte[] paramArrayOfByte)
  {
    j.p(paramArrayOfByte, "frame");
    ab.c("MicroMsg.GLTextureRenderProc", "call super err :ByteArray", new Object[0]);
  }

  public final void Vd()
  {
    Matrix.setIdentityM(this.eZm, 0);
    Matrix.setRotateM(this.eZm, 0, this.eYR, 0.0F, 0.0F, -1.0F);
    if ((this.eZn) || (this.eZa == 3))
      if ((this.eYR == 90) || (this.eYR == 270))
        Matrix.scaleM(this.eZm, 0, -1.0F, 1.0F, 1.0F);
    Object localObject1;
    int i;
    int j;
    int k;
    int m;
    Object localObject2;
    while (true)
    {
      if (this.eYS)
        Matrix.scaleM(this.eZm, 0, 1.0F, -1.0F, 1.0F);
      if (this.scaleType != 1)
        break;
      this.eZh.position(0);
      this.eZh.put(com.tencent.mm.media.i.b.eZZ);
      this.eZh.position(0);
      this.eZi.position(0);
      this.eZi.put(com.tencent.mm.media.i.b.eZY);
      this.eZi.position(0);
      localObject1 = com.tencent.mm.media.i.b.fad;
      b.a.Vj();
      GLES20.glViewport(0, 0, this.eYY, this.eYZ);
      if (this.eZa == 2)
      {
        if (this.eZj == 0)
        {
          localObject1 = com.tencent.mm.media.i.b.fad;
          this.eZj = b.a.Vh();
          localObject1 = com.tencent.mm.media.i.b.fad;
          this.eZk = b.a.Vi();
        }
        localObject1 = com.tencent.mm.media.i.b.fad;
        i = this.eZk;
        j = this.eZj;
        k = this.eYW;
        m = this.eYX;
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glBindTexture(3553, j);
        GLES20.glTexImage2D(3553, 0, 6408, k, m, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glViewport(0, 0, this.eYW, this.eYX);
      }
      Vf();
      if (this.eZa != 3)
        break label1088;
      if (this.eZl == null)
        Ve();
      localObject1 = this.eZl;
      if (localObject1 == null)
        j.dWJ();
      ((IntBuffer)localObject1).position(0);
      GLES20.glReadPixels(0, 0, this.eYY, this.eYZ, 6408, 5121, (Buffer)this.eZl);
      localObject2 = this.eZp;
      if (localObject2 != null)
      {
        localObject1 = this.eZl;
        if (localObject1 == null)
          j.dWJ();
        ((a.f.a.b)localObject2).am(localObject1);
      }
      label408: localObject1 = com.tencent.mm.media.i.b.fad;
      b.a.Vj();
      return;
      Matrix.scaleM(this.eZm, 0, 1.0F, -1.0F, 1.0F);
      continue;
      Matrix.scaleM(this.eZm, 0, 1.0F, 1.0F, 1.0F);
    }
    label486: label496: int n;
    label507: float f1;
    float f2;
    if (this.scaleType == 2)
    {
      localObject1 = com.tencent.mm.media.i.b.eZZ;
      localObject1 = Arrays.copyOf((float[])localObject1, localObject1.length);
      if ((this.eYR == 90) || (this.eYR == 270))
      {
        m = 1;
        if (m == 0)
          break label688;
        i = this.eYX;
        if (m == 0)
          break label696;
        n = this.eYW;
        f1 = this.eYY / i;
        f2 = this.eYZ / n;
        if (f1 >= f2)
          break label705;
        j = (int)(this.eYY / f2);
        k = 0;
        j = i - j;
      }
    }
    while (true)
    {
      label553: float f3;
      float f4;
      if (m != 0)
      {
        f3 = k / 2.0F / n;
        f2 = 1.0F - f3;
        f1 = j / 2.0F / i;
        f4 = 1.0F - f1;
      }
      while (true)
      {
        localObject1[0] = f3;
        localObject1[1] = f4;
        localObject1[2] = f2;
        localObject1[3] = f4;
        localObject1[4] = f3;
        localObject1[5] = f1;
        localObject1[6] = f2;
        localObject1[7] = f1;
        this.eZh.put(com.tencent.mm.media.i.b.eZZ);
        this.eZh.position(0);
        this.eZh.put((float[])localObject1);
        this.eZh.position(0);
        this.eZi.position(0);
        break;
        m = 0;
        break label486;
        label688: i = this.eYW;
        break label496;
        label696: n = this.eYX;
        break label507;
        label705: if (f1 <= f2)
          break label1122;
        k = n - (int)(this.eYZ / f1);
        j = 0;
        break label553;
        f3 = j / 2.0F / i;
        f1 = k / 2.0F / n;
        f4 = 1.0F - f1;
        f2 = 1.0F - f3;
      }
      if ((this.scaleType != 3) || (this.eZd == null))
        break;
      localObject1 = com.tencent.mm.media.i.b.eZZ;
      localObject2 = Arrays.copyOf((float[])localObject1, localObject1.length);
      localObject1 = this.eZd;
      if (localObject1 != null)
      {
        localObject1 = Integer.valueOf(((Rect)localObject1).width());
        label811: if (localObject1 == null)
          j.dWJ();
        k = ((Integer)localObject1).intValue();
        localObject1 = this.eZd;
        if (localObject1 == null)
          break label1034;
        localObject1 = Integer.valueOf(((Rect)localObject1).height());
        label841: if (localObject1 == null)
          j.dWJ();
        j = ((Integer)localObject1).intValue();
        localObject1 = this.eZd;
        if ((localObject1 == null) || (((Rect)localObject1).left != 0))
          break label1039;
        f1 = (this.eYW - k) / this.eYW;
        f2 = 1.0F - f1;
        label891: localObject1 = this.eZd;
        if ((localObject1 == null) || (((Rect)localObject1).top != 0))
          break label1064;
        f4 = (this.eYX - j) / this.eYX;
        f3 = 1.0F - f4;
      }
      while (true)
      {
        localObject2[0] = f1;
        localObject2[1] = f4;
        localObject2[2] = f2;
        localObject2[3] = f4;
        localObject2[4] = f1;
        localObject2[5] = f3;
        localObject2[6] = f2;
        localObject2[7] = f3;
        this.eZh.put(com.tencent.mm.media.i.b.eZZ);
        this.eZh.position(0);
        this.eZh.put((float[])localObject2);
        this.eZh.position(0);
        this.eZi.position(0);
        break;
        localObject1 = null;
        break label811;
        label1034: localObject1 = null;
        break label841;
        label1039: f2 = (this.eYW - k) / this.eYW;
        f1 = 1.0F - f2;
        break label891;
        label1064: f3 = (this.eYX - j) / this.eYX;
        f4 = 1.0F - f3;
      }
      label1088: if (this.eZa != 2)
        break label408;
      localObject1 = this.eZo;
      if (localObject1 == null)
        break label408;
      ((a.f.a.b)localObject1).am(Integer.valueOf(this.eZj));
      break label408;
      label1122: k = 0;
      j = 0;
    }
  }

  protected abstract void Vf();

  public final void ci(int paramInt1, int paramInt2)
  {
    this.eYZ = paramInt2;
    this.eYY = paramInt1;
    if (this.eZa == 3)
      Ve();
  }

  public void kb(int paramInt)
  {
    ab.c("MicroMsg.GLTextureRenderProc", "call super err :texture", new Object[0]);
  }

  public void release()
  {
    if (this.eZj != 0)
      GLES20.glDeleteTextures(1, new int[] { this.eZj }, 0);
    if (this.eZk != 0)
      GLES20.glDeleteFramebuffers(1, new int[] { this.eZk }, 0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.h.b.a
 * JD-Core Version:    0.6.2
 */
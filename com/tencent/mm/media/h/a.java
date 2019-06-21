package com.tencent.mm.media.h;

import a.l;
import a.y;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import com.tencent.mm.media.i.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "Landroid/opengl/GLSurfaceView$Renderer;", "textureWidth", "", "textureHeight", "drawWidth", "drawHeight", "renderOutputType", "scaleType", "(IIIIII)V", "clearFrame", "", "getClearFrame", "()Z", "setClearFrame", "(Z)V", "createSurfaceTexture", "currentDrawFrame", "", "getDrawHeight", "()I", "setDrawHeight", "(I)V", "getDrawWidth", "setDrawWidth", "externalTexture", "getExternalTexture", "setExternalTexture", "frameDrawCallback", "Lkotlin/Function0;", "", "getFrameDrawCallback", "()Lkotlin/jvm/functions/Function0;", "setFrameDrawCallback", "(Lkotlin/jvm/functions/Function0;)V", "glTextureRenderProc", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "getGlTextureRenderProc", "()Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "setGlTextureRenderProc", "(Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;)V", "inputTexture", "getInputTexture", "setInputTexture", "mirror", "getMirror", "setMirror", "onFrameAvailableListener", "Lkotlin/Function1;", "Landroid/graphics/SurfaceTexture;", "Lkotlin/ParameterName;", "name", "surfaceTexture", "getOnFrameAvailableListener", "()Lkotlin/jvm/functions/Function1;", "setOnFrameAvailableListener", "(Lkotlin/jvm/functions/Function1;)V", "getRenderOutputType", "setRenderOutputType", "renderProcInited", "getRenderProcInited", "setRenderProcInited", "rotateDegree", "getRotateDegree", "setRotateDegree", "getScaleType", "setScaleType", "getSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "setSurfaceTexture", "(Landroid/graphics/SurfaceTexture;)V", "getTextureHeight", "setTextureHeight", "getTextureWidth", "setTextureWidth", "checkHasInit", "doInitRenderProc", "flip", "getOutputBuffer", "Ljava/nio/IntBuffer;", "getTexture", "initGLTextureRender", "initRenderProcInGlesThread", "input", "frame", "copyFrame", "texture", "onDrawFrame", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "onSurfaceChanged", "width", "height", "onSurfaceCreated", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "release", "render", "resetRender", "setOnFBOAvailableListener", "listener", "setOnRGBDataAvailableListener", "buffer", "setRotate", "degree", "updateDrawViewSize", "updateTextureSize", "Companion", "plugin-mediaeditor_release"})
public abstract class a
  implements GLSurfaceView.Renderer
{
  public static final a eZb = new a((byte)0);
  public SurfaceTexture bsb;
  public com.tencent.mm.media.h.b.a eYL;
  private byte[] eYM;
  public int eYN;
  public boolean eYO;
  private boolean eYP;
  private int eYQ;
  public int eYR;
  private boolean eYS;
  public a.f.a.b<? super SurfaceTexture, y> eYT;
  public a.f.a.a<y> eYU;
  public boolean eYV;
  protected int eYW;
  protected int eYX;
  protected int eYY;
  protected int eYZ;
  protected int eZa;
  protected int scaleType;

  public a()
  {
    this(0, 0, 0, 0, 63);
  }

  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.eYW = paramInt1;
    this.eYX = paramInt2;
    this.eYY = paramInt3;
    this.eYZ = paramInt4;
    this.eZa = paramInt5;
    this.scaleType = paramInt6;
    this.eYN = -1;
    this.eYQ = -1;
  }

  protected abstract com.tencent.mm.media.h.b.a Vc();

  public void Vd()
  {
    com.tencent.mm.media.h.b.a locala = this.eYL;
    if (locala != null)
      locala.Vd();
  }

  public void ch(int paramInt1, int paramInt2)
  {
    ab.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " updateTextureSize ,width : " + paramInt1 + " , height : " + paramInt2, new Object[0]);
    this.eYW = paramInt1;
    this.eYX = paramInt2;
    com.tencent.mm.media.h.b.a locala = this.eYL;
    if (locala != null)
    {
      locala.eYW = paramInt1;
      locala.eYX = paramInt2;
    }
  }

  public final void ci(int paramInt1, int paramInt2)
  {
    ab.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " updateDrawViewSize ,width : " + paramInt1 + " , height : " + paramInt2, new Object[0]);
    this.eYY = paramInt1;
    this.eYZ = paramInt2;
    com.tencent.mm.media.h.b.a locala = this.eYL;
    if (locala != null)
      locala.ci(paramInt1, paramInt2);
  }

  public final void cs(boolean paramBoolean)
  {
    if (this.eYV)
    {
      ab.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " initRenderProcInGlesThread, already init", new Object[0]);
      return;
    }
    this.eYP = paramBoolean;
    this.eYL = Vc();
    ab.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " exec func initGLTextureRender  mirror : " + this.eYS);
    ci(this.eYY, this.eYZ);
    ch(this.eYW, this.eYX);
    ka(this.eYR);
    ct(this.eYS);
    Object localObject;
    SurfaceTexture localSurfaceTexture;
    if ((this.eYP) && ((this.bsb == null) || (this.eYQ <= 0)))
    {
      localObject = com.tencent.mm.media.i.b.fad;
      localObject = new int[1];
      GLES20.glGenTextures(1, (int[])localObject, 0);
      GLES20.glBindTexture(36197, localObject[0]);
      GLES20.glTexParameteri(36197, 10241, 9729);
      GLES20.glTexParameteri(36197, 10240, 9728);
      GLES20.glTexParameteri(36197, 10242, 33071);
      GLES20.glTexParameteri(36197, 10243, 33071);
      GLES20.glBindTexture(36197, 0);
      b.a.ma("glGenTextures");
      this.eYN = localObject[0];
      localSurfaceTexture = new SurfaceTexture(this.eYN);
      localObject = this.eYT;
      if (localObject == null)
        break label387;
      localObject = new b((a.f.a.b)localObject);
    }
    label387: 
    while (true)
    {
      localSurfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener)localObject);
      this.bsb = localSurfaceTexture;
      ab.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " createSurfaceTexture:" + this.eYN, new Object[0]);
      input(this.eYN);
      ab.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " createSurfaceTexture:" + paramBoolean + ", surfaceTexture:" + this.bsb, new Object[0]);
      this.eYV = true;
      break;
    }
  }

  public void ct(boolean paramBoolean)
  {
    ab.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " set mirror: " + paramBoolean);
    this.eYS = paramBoolean;
    com.tencent.mm.media.h.b.a locala = this.eYL;
    if (locala != null)
      locala.eYS = paramBoolean;
  }

  public final void input(int paramInt)
  {
    this.eYQ = paramInt;
    com.tencent.mm.media.h.b.a locala = this.eYL;
    if (locala != null)
      locala.kb(paramInt);
  }

  public void ka(int paramInt)
  {
    ab.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " change rotate ,old degree : " + this.eYR + " , new degree : " + paramInt, new Object[0]);
    this.eYR = paramInt;
    com.tencent.mm.media.h.b.a locala = this.eYL;
    if (locala != null)
      locala.eYR = paramInt;
  }

  public void onDrawFrame(GL10 paramGL10)
  {
    if (this.eYO)
    {
      ab.i("MicroMsg.Media.AbsSurfaceRenderer", "do clear frame");
      this.eYO = false;
    }
    while (true)
    {
      return;
      if ((this.eYM == null) && (this.eYQ == -1))
      {
        ab.e("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " there is no input ,do you dismiss setting input");
      }
      else
      {
        Vd();
        paramGL10 = this.eYU;
        if (paramGL10 != null)
          paramGL10.invoke();
      }
    }
  }

  public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    ab.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " onSurfaceChanged width:" + paramInt1 + ", height:" + paramInt2);
    ci(paramInt1, paramInt2);
  }

  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    ab.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " onSurfaceCreated");
    paramGL10 = com.tencent.mm.media.i.b.fad;
    b.a.Vj();
  }

  public void release()
  {
    Object localObject = this.eYL;
    if (localObject != null)
      ((com.tencent.mm.media.h.b.a)localObject).release();
    localObject = this.bsb;
    if (localObject != null)
      ((SurfaceTexture)localObject).release();
    if (this.eYN >= 0)
    {
      GLES20.glDeleteTextures(1, new int[] { this.eYN }, 0);
      this.eYN = -1;
    }
    this.bsb = null;
    this.eYV = false;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/AbsSurfaceRenderer$Companion;", "", "()V", "TAG", "", "plugin-mediaeditor_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.h.a
 * JD-Core Version:    0.6.2
 */
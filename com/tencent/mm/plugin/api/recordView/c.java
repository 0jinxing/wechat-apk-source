package com.tencent.mm.plugin.api.recordView;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

final class c extends Thread
{
  private SurfaceTexture fcm;
  private d gLH;
  private EGL10 mEgl;
  private EGLContext mEglContext = EGL10.EGL_NO_CONTEXT;
  private EGLDisplay mEglDisplay = EGL10.EGL_NO_DISPLAY;
  private EGLSurface mEglSurface = EGL10.EGL_NO_SURFACE;
  volatile boolean needRender;

  public c(SurfaceTexture paramSurfaceTexture, d paramd)
  {
    this.fcm = paramSurfaceTexture;
    this.gLH = paramd;
  }

  public final void run()
  {
    AppMethodBeat.i(76333);
    ab.i("MicroMsg.MMSightRecordTextureViewRenderThread", "start render thread");
    this.mEgl = ((EGL10)EGLContext.getEGL());
    this.mEglDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    int i;
    if (this.mEglDisplay == EGL10.EGL_NO_DISPLAY)
    {
      ab.e("MicroMsg.MMSightRecordTextureViewRenderThread", "egl get display error: %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
      i = -1;
      if (i >= 0)
        break label461;
      ab.e("MicroMsg.MMSightRecordTextureViewRenderThread", "init gl failed");
      AppMethodBeat.o(76333);
    }
    while (true)
    {
      return;
      ??? = new int[2];
      if (!this.mEgl.eglInitialize(this.mEglDisplay, (int[])???))
      {
        ab.e("MicroMsg.MMSightRecordTextureViewRenderThread", "egl init error: %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
        i = -1;
        break;
      }
      Object localObject3 = new int[1];
      ??? = new EGLConfig[1];
      if (!this.mEgl.eglChooseConfig(this.mEglDisplay, new int[] { 12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344 }, (EGLConfig[])???, 1, (int[])localObject3))
      {
        ab.e("MicroMsg.MMSightRecordTextureViewRenderThread", "egl choose config failed: %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
        i = -1;
        break;
      }
      this.mEglContext = this.mEgl.eglCreateContext(this.mEglDisplay, ???[0], EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
      this.mEglSurface = this.mEgl.eglCreateWindowSurface(this.mEglDisplay, ???[0], this.fcm, null);
      if ((this.mEglSurface == EGL10.EGL_NO_SURFACE) || (this.mEglContext == EGL10.EGL_NO_CONTEXT))
      {
        if (this.mEgl.eglGetError() == 12299)
        {
          ab.e("MicroMsg.MMSightRecordTextureViewRenderThread", "eglCreateWindowSurface returned EGL_BAD_NATIVE_WINDOW. ");
          i = -1;
          break;
        }
        ab.e("MicroMsg.MMSightRecordTextureViewRenderThread", "eglCreateWindowSurface failed : %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
        i = -1;
        break;
      }
      if (!this.mEgl.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEglContext))
        ab.e("MicroMsg.MMSightRecordTextureViewRenderThread", "eglMakeCurrent failed : %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
      i = 0;
      break;
      label461: if (this.gLH != null)
        localObject3 = this.gLH;
      while (true)
      {
        synchronized (d.lock)
        {
          ab.i("MicroMsg.MMSightRecordTextureViewRenderer", "init this %s", new Object[] { localObject3 });
          GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
          GLES20.glDisable(2929);
          ((d)localObject3).eZH = b.U("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
          if (((d)localObject3).eZH == 0)
            ab.e("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceCreated, load program failed!");
          ((d)localObject3).eZI = GLES20.glGetAttribLocation(((d)localObject3).eZH, "a_position");
          ((d)localObject3).eZJ = GLES20.glGetAttribLocation(((d)localObject3).eZH, "a_texCoord");
          ((d)localObject3).eZR = GLES20.glGetUniformLocation(((d)localObject3).eZH, "y_texture");
          ((d)localObject3).eZS = GLES20.glGetUniformLocation(((d)localObject3).eZH, "uv_texture");
          ((d)localObject3).gLy = GLES20.glGetUniformLocation(((d)localObject3).eZH, "uMatrix");
          ((d)localObject3).eZM = b.Vh();
          ((d)localObject3).eZN = b.Vh();
          ((d)localObject3).eZi = ByteBuffer.allocateDirect(((d)localObject3).gLB.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
          ((d)localObject3).eZi.put(((d)localObject3).gLB);
          ((d)localObject3).eZi.position(0);
          ((d)localObject3).eZh = ByteBuffer.allocateDirect(d.eZZ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
          ((d)localObject3).eZh.put(d.eZZ);
          ((d)localObject3).eZh.position(0);
          ab.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", new Object[] { Integer.valueOf(((d)localObject3).eZM), Integer.valueOf(((d)localObject3).eZN), localObject3 });
          ab.i("MicroMsg.MMSightRecordTextureViewRenderThread", "init renderer finish");
          if (!this.needRender)
            break;
          if (this.gLH != null)
            if (this.gLH.gLJ);
        }
        try
        {
          Thread.sleep(10L);
          localObject3 = this.gLH;
          bo.yz();
          ((d)localObject3).gLv = true;
          GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
          GLES20.glClear(16640);
        }
        catch (InterruptedException localInterruptedException)
        {
          synchronized (d.lock)
          {
            if ((((d)localObject3).eZH != -1) && (((d)localObject3).eZM != -1) && (((d)localObject3).eZN != -1) && (((d)localObject3).gLw > 0) && (((d)localObject3).gLx > 0) && (((d)localObject3).eZV != null) && (((d)localObject3).eZU != null) && (((d)localObject3).eZV.limit() > 0) && (((d)localObject3).eZU.limit() > 0) && (((d)localObject3).eZV.position() == 0) && (((d)localObject3).eZU.position() == 0))
            {
              GLES20.glUseProgram(((d)localObject3).eZH);
              GLES20.glActiveTexture(33984);
              GLES20.glBindTexture(3553, ((d)localObject3).eZM);
              GLES20.glTexImage2D(3553, 0, 6409, ((d)localObject3).gLw, ((d)localObject3).gLx, 0, 6409, 5121, ((d)localObject3).eZU);
              GLES20.glTexParameterf(3553, 10241, 9729.0F);
              GLES20.glTexParameterf(3553, 10240, 9729.0F);
              GLES20.glTexParameterf(3553, 10242, 33071.0F);
              GLES20.glTexParameterf(3553, 10243, 33071.0F);
              GLES20.glUniform1i(((d)localObject3).eZR, 0);
              GLES20.glActiveTexture(33985);
              GLES20.glBindTexture(3553, ((d)localObject3).eZN);
              GLES20.glTexImage2D(3553, 0, 6410, ((d)localObject3).gLw / 2, ((d)localObject3).gLx / 2, 0, 6410, 5121, ((d)localObject3).eZV);
              GLES20.glTexParameterf(3553, 10241, 9729.0F);
              GLES20.glTexParameterf(3553, 10240, 9729.0F);
              GLES20.glTexParameterf(3553, 10242, 33071.0F);
              GLES20.glTexParameterf(3553, 10243, 33071.0F);
              GLES20.glUniform1i(((d)localObject3).eZS, 1);
              Matrix.setIdentityM(((d)localObject3).gLz, 0);
              Matrix.setRotateM(((d)localObject3).gLz, 0, ((d)localObject3).rotate, 0.0F, 0.0F, -1.0F);
              GLES20.glUniformMatrix4fv(((d)localObject3).gLy, 1, false, ((d)localObject3).gLz, 0);
              ((d)localObject3).eZi.position(0);
              GLES20.glVertexAttribPointer(((d)localObject3).eZI, 2, 5126, false, 0, ((d)localObject3).eZi);
              GLES20.glEnableVertexAttribArray(((d)localObject3).eZI);
              ((d)localObject3).eZh.position(0);
              GLES20.glVertexAttribPointer(((d)localObject3).eZJ, 2, 5126, false, 0, ((d)localObject3).eZh);
              GLES20.glEnableVertexAttribArray(((d)localObject3).eZJ);
              GLES20.glDrawArrays(5, 0, 4);
              GLES20.glDisableVertexAttribArray(((d)localObject3).eZI);
              GLES20.glDisableVertexAttribArray(((d)localObject3).eZJ);
              GLES20.glBindTexture(3553, 0);
            }
            ((d)localObject3).gLv = false;
            if (this.mEgl != null)
            {
              this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface);
              continue;
              localObject4 = finally;
              AppMethodBeat.o(76333);
              throw localObject4;
              localInterruptedException = localInterruptedException;
              ab.printErrStackTrace("MicroMsg.MMSightRecordTextureViewRenderThread", localInterruptedException, "", new Object[0]);
            }
          }
        }
      }
      ab.i("MicroMsg.MMSightRecordTextureViewRenderThread", "finish render loop, start destroy gl");
      d locald;
      if (this.gLH != null)
        locald = this.gLH;
      synchronized (d.lock)
      {
        if (locald.eZH >= 0)
        {
          GLES20.glDeleteProgram(locald.eZH);
          locald.eZH = -1;
        }
        if (locald.eZN >= 0)
        {
          GLES20.glDeleteTextures(1, new int[] { locald.eZN }, 0);
          locald.eZN = -1;
        }
        if (locald.eZM >= 0)
        {
          GLES20.glDeleteTextures(1, new int[] { locald.eZM }, 0);
          locald.eZM = -1;
        }
        locald.gLx = -1;
        locald.gLw = -1;
        locald.eWi = true;
        locald.eZU = null;
        locald.eZV = null;
        if ((this.mEgl != null) && (this.mEglContext != null) && (this.mEglSurface != null))
        {
          this.mEgl.eglDestroyContext(this.mEglDisplay, this.mEglContext);
          this.mEgl.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
          this.mEglContext = EGL10.EGL_NO_CONTEXT;
          this.mEglSurface = EGL10.EGL_NO_SURFACE;
        }
        if (this.fcm != null)
          this.fcm.release();
        ab.i("MicroMsg.MMSightRecordTextureViewRenderThread", "finish render loop, finish destroy gl");
        AppMethodBeat.o(76333);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.c
 * JD-Core Version:    0.6.2
 */
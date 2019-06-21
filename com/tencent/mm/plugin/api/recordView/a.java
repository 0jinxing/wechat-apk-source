package com.tencent.mm.plugin.api.recordView;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

final class a
  implements GLSurfaceView.Renderer
{
  static float[] eZY = { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
  private static final float[] eZZ = { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
  static float[] gLu = { -1.0F, -0.5F, 1.0F, -0.5F, -1.0F, 0.5F, 1.0F, 0.5F };
  private int eZH;
  private int eZI;
  private int eZJ;
  private int eZM;
  private int eZN;
  private int eZR;
  private int eZS;
  ByteBuffer eZU;
  ByteBuffer eZV;
  private FloatBuffer eZh;
  FloatBuffer eZi;
  private int fcn;
  private int fco;
  boolean fdb;
  byte[] frameData;
  private boolean gLA;
  float[] gLB;
  private float[] gLC;
  int gLD;
  boolean gLv;
  int gLw;
  int gLx;
  private int gLy;
  private float[] gLz;
  int rotate;

  public a()
  {
    AppMethodBeat.i(76308);
    this.fcn = 0;
    this.fco = 0;
    this.gLv = false;
    this.frameData = null;
    this.gLw = 0;
    this.gLx = 0;
    this.rotate = 0;
    this.gLz = new float[16];
    this.gLA = false;
    this.gLB = eZY;
    float[] arrayOfFloat = eZZ;
    this.gLC = Arrays.copyOf(arrayOfFloat, arrayOfFloat.length);
    this.fdb = false;
    this.gLD = 0;
    AppMethodBeat.o(76308);
  }

  public final void onDrawFrame(GL10 paramGL10)
  {
    AppMethodBeat.i(76311);
    bo.yz();
    this.gLv = true;
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    GLES20.glClear(16640);
    if (this.gLA)
    {
      ab.i("MicroMsg.MMSightCameraGLRenderer", "clearFrameRequest");
      this.gLA = false;
      this.gLv = false;
      this.frameData = null;
      this.gLw = -1;
      this.gLx = -1;
      AppMethodBeat.o(76311);
      return;
    }
    int i;
    if ((this.eZH != 0) && (this.eZM != -1) && (this.eZN != -1) && (this.gLw > 0) && (this.gLx > 0) && (this.frameData != null))
    {
      GLES20.glUseProgram(this.eZH);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.eZM);
      GLES20.glTexImage2D(3553, 0, 6409, this.gLw, this.gLx, 0, 6409, 5121, this.eZU);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glUniform1i(this.eZR, 0);
      GLES20.glActiveTexture(33985);
      GLES20.glBindTexture(3553, this.eZN);
      GLES20.glTexImage2D(3553, 0, 6410, this.gLw / 2, this.gLx / 2, 0, 6410, 5121, this.eZV);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glUniform1i(this.eZS, 1);
      Matrix.setIdentityM(this.gLz, 0);
      i = this.rotate;
      if ((this.gLD != 90) && (this.gLD != 270))
        break label507;
      i = (this.rotate - this.gLD + 360) % 360;
    }
    label507: 
    while (true)
    {
      if (i > 0)
        Matrix.setRotateM(this.gLz, 0, i, 0.0F, 0.0F, -1.0F);
      GLES20.glUniformMatrix4fv(this.gLy, 1, false, this.gLz, 0);
      this.eZi.position(0);
      GLES20.glVertexAttribPointer(this.eZI, 2, 5126, false, 0, this.eZi);
      GLES20.glEnableVertexAttribArray(this.eZI);
      this.eZh.position(0);
      GLES20.glVertexAttribPointer(this.eZJ, 2, 5126, false, 0, this.eZh);
      GLES20.glEnableVertexAttribArray(this.eZJ);
      GLES20.glDrawArrays(5, 0, 4);
      GLES20.glDisableVertexAttribArray(this.eZI);
      GLES20.glDisableVertexAttribArray(this.eZJ);
      GLES20.glBindTexture(3553, 0);
      this.gLv = false;
      AppMethodBeat.o(76311);
      break;
    }
  }

  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76310);
    ab.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this });
    if ((paramInt1 != this.fcn) || (paramInt2 != this.fco))
    {
      ab.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged change viewpoint");
      GLES20.glViewport(0, 0, paramInt1, paramInt2);
      this.fcn = paramInt1;
      this.fco = paramInt2;
      float f = this.fcn / this.fco / 2.0F;
      gLu = new float[] { -1.0F, -f, 1.0F, -f, -1.0F, f, 1.0F, f };
    }
    AppMethodBeat.o(76310);
  }

  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    AppMethodBeat.i(76309);
    ab.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated this %s", new Object[] { this });
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLES20.glDisable(2929);
    this.eZH = b.U("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
    if (this.eZH == 0)
      ab.e("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, load program failed!");
    this.eZI = GLES20.glGetAttribLocation(this.eZH, "a_position");
    this.eZJ = GLES20.glGetAttribLocation(this.eZH, "a_texCoord");
    this.eZR = GLES20.glGetUniformLocation(this.eZH, "y_texture");
    this.eZS = GLES20.glGetUniformLocation(this.eZH, "uv_texture");
    this.gLy = GLES20.glGetUniformLocation(this.eZH, "uMatrix");
    this.eZM = b.Vh();
    this.eZN = b.Vh();
    this.eZi = ByteBuffer.allocateDirect(this.gLB.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.eZi.put(this.gLB);
    this.eZi.position(0);
    this.eZh = ByteBuffer.allocateDirect(eZZ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.eZh.put(eZZ);
    this.eZh.position(0);
    ab.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", new Object[] { Integer.valueOf(this.eZM), Integer.valueOf(this.eZN), this });
    AppMethodBeat.o(76309);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.a
 * JD-Core Version:    0.6.2
 */
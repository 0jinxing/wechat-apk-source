package com.tencent.mm.plugin.emojicapture.ui.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.text.TextUtils;
import com.tencent.filter.BaseFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.d.a;
import com.tencent.mm.plugin.emojicapture.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.ttpic.PTFaceDetector;
import com.tencent.ttpic.PTSegmentor;
import com.tencent.ttpic.PTSticker;
import com.tencent.ttpic.config.BeautyRealConfig.TYPE;
import com.tencent.ttpic.filter.BeautyFaceList;
import com.tencent.ttpic.filter.BeautyParam;
import com.tencent.ttpic.filter.BeautyTransformList;
import com.tencent.ttpic.filter.BrightnessAdjustmentFilter;
import com.tencent.ttpic.filter.RemodelFilter;
import com.tencent.ttpic.filter.SmoothBFilters;
import com.tencent.ttpic.model.VideoMaterial;
import com.tencent.ttpic.util.VideoFilterUtil;
import com.tencent.ttpic.util.VideoTemplateParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

public final class h
{
  private boolean eNa;
  private boolean eYS;
  private int eZM;
  private int eZN;
  private int eZO;
  private int eZP;
  private int eZQ;
  private int eZR;
  private int eZS;
  private int eZT;
  private ByteBuffer eZU;
  private ByteBuffer eZV;
  private FloatBuffer eZh;
  private FloatBuffer eZi;
  private float[] gLB;
  private int gLw;
  private int gLx;
  private float[] gLz;
  private int iZn;
  private int iZo;
  private int lpA;
  private int lpB;
  private int lpC;
  private int lpD;
  private int lpE;
  private int lpF;
  private int lpG;
  private int lpH;
  private int lpI;
  private int lpJ;
  private FloatBuffer lpK;
  private FloatBuffer lpL;
  private FloatBuffer lpM;
  private float[] lpN;
  private float[] lpO;
  private float[] lpP;
  private int lpQ;
  private int lpR;
  private int lpS;
  private a lpT;
  private int lpU;
  private byte[] lpV;
  private IntBuffer lpW;
  private int lpu;
  private int lpv;
  private int lpw;
  private int lpx;
  private int lpy;
  private int lpz;
  private int rotate;

  public h()
  {
    AppMethodBeat.i(2560);
    com.tencent.mm.plugin.emojicapture.model.c.a locala = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    this.lpu = com.tencent.mm.plugin.emojicapture.model.c.bmM();
    locala = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    this.lpv = com.tencent.mm.plugin.emojicapture.model.c.bmM();
    this.gLz = new float[16];
    this.gLB = c.eZY;
    this.lpO = c.eZY;
    this.lpW = IntBuffer.allocate(this.lpu * this.lpv);
    this.eNa = false;
    AppMethodBeat.o(2560);
  }

  private static void clearStatus()
  {
    AppMethodBeat.i(2566);
    GLES20.glBindFramebuffer(36160, 0);
    GLES20.glBindTexture(3553, 0);
    AppMethodBeat.o(2566);
  }

  private void uH(int paramInt)
  {
    AppMethodBeat.i(2565);
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    GLES20.glClear(16640);
    if (this.lpM == null)
      this.lpM = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder()).asFloatBuffer();
    GLES20.glViewport(0, 0, this.iZn, this.iZo);
    GLES20.glUseProgram(this.lpB);
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(3553, paramInt);
    GLES20.glTexParameterf(3553, 10241, 9729.0F);
    GLES20.glTexParameterf(3553, 10240, 9729.0F);
    GLES20.glTexParameterf(3553, 10242, 33071.0F);
    GLES20.glTexParameterf(3553, 10243, 33071.0F);
    GLES20.glUniform1i(this.lpF, 0);
    Matrix.setIdentityM(this.gLz, 0);
    GLES20.glUniformMatrix4fv(this.lpG, 1, false, this.gLz, 0);
    this.lpM.put(this.iZn);
    this.lpM.put(this.iZo);
    this.lpM.position(0);
    GLES20.glUniform2fv(this.lpH, 1, this.lpM);
    GLES20.glUniform1f(this.lpI, com.tencent.mm.plugin.emojicapture.model.c.us(Math.max(this.iZn, this.iZo)));
    GLES20.glUniform1i(this.lpJ, 1);
    this.lpL.put(c.eZY);
    this.lpL.position(0);
    GLES20.glVertexAttribPointer(this.lpE, 2, 5126, false, 0, this.lpL);
    GLES20.glEnableVertexAttribArray(this.lpE);
    this.lpK.put(c.eZZ);
    this.lpK.position(0);
    GLES20.glVertexAttribPointer(this.lpD, 2, 5126, false, 0, this.lpK);
    GLES20.glEnableVertexAttribArray(this.lpD);
    GLES20.glDrawArrays(5, 0, 4);
    GLES20.glDisableVertexAttribArray(this.lpE);
    GLES20.glDisableVertexAttribArray(this.lpD);
    GLES20.glBindTexture(3553, 0);
    GLES20.glUseProgram(0);
    GLES20.glBindFramebuffer(36160, 0);
    AppMethodBeat.o(2565);
  }

  public final void a(com.tencent.mm.plugin.emojicapture.model.a.b paramb)
  {
    Object localObject = null;
    AppMethodBeat.i(2564);
    a locala = this.lpT;
    if (locala.mPTSticker != null)
      locala.mPTSticker.destroy();
    if (paramb == null)
    {
      locala.mPTSticker = null;
      ab.i("MicroMsg.EmojiFilterProcess", "changeSticker: null");
      AppMethodBeat.o(2564);
    }
    while (true)
    {
      return;
      locala.mPTSticker = null;
      ab.i("MicroMsg.EmojiFilterProcess", "changeSticker: %s", new Object[] { paramb });
      String str = paramb.lhL;
      PTFaceDetector localPTFaceDetector = locala.lhm.xtP;
      paramb = localObject;
      if (localPTFaceDetector != null)
        paramb = localPTFaceDetector.getFaceDetector();
      if (paramb != null)
      {
        locala.mPTSticker = new PTSticker(str, paramb);
        locala.mPTSticker.init();
      }
      if (!TextUtils.isEmpty(str))
        ab.i("MicroMsg.EmojiFilterProcess", "changeVideoFilter: %s", new Object[] { VideoTemplateParser.parseVideoMaterial(str).getTipsText() });
      AppMethodBeat.o(2564);
    }
  }

  public final void a(byte[] paramArrayOfByte, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(2562);
    if (this.lpT == null)
    {
      ab.e("MicroMsg.FilterRenderer", "drawFrame, emojiFilterProcessTex is null!!");
      AppMethodBeat.o(2562);
    }
    while (true)
    {
      return;
      this.gLw = paramInt1;
      this.gLx = paramInt2;
      this.eYS = paramBoolean;
      this.rotate = paramInt3;
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GLES20.glClear(16640);
      float f1;
      float f2;
      if ((this.eZO != 0) && (this.eZM != -1) && (this.eZN != -1) && (this.gLw > 0) && (this.gLx > 0) && (paramArrayOfByte != null) && (paramArrayOfByte.length == this.gLw * this.gLx / 2 * 3))
      {
        if ((this.eZU == null) || (this.eZV == null) || (this.eZU.capacity() != this.gLx * this.gLw) || (this.eZV.capacity() != this.gLw * this.gLx / 2))
        {
          this.eZU = ByteBuffer.allocateDirect(this.gLx * this.gLw);
          this.eZV = ByteBuffer.allocateDirect(this.gLw * this.gLx / 2);
          this.eZU.order(ByteOrder.nativeOrder());
          this.eZV.order(ByteOrder.nativeOrder());
        }
        this.eZU.position(0);
        this.eZU.put(paramArrayOfByte, 0, this.gLw * this.gLx);
        this.eZU.position(0);
        this.eZV.position(0);
        this.eZV.put(paramArrayOfByte, this.gLw * this.gLx, this.gLw * this.gLx / 2);
        this.eZV.position(0);
        paramInt1 = Math.min(this.gLw, this.gLx);
        c.y(this.lpQ, this.lpS, this.lpu, this.lpv);
        GLES20.glViewport(0, 0, this.lpu, this.lpv);
        GLES20.glUseProgram(this.eZO);
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
        if (this.rotate > 0)
        {
          Matrix.setRotateM(this.gLz, 0, this.rotate, 0.0F, 0.0F, -1.0F);
          Matrix.scaleM(this.gLz, 0, -1.0F, 1.0F, 1.0F);
        }
        if (this.eYS)
          Matrix.scaleM(this.gLz, 0, 1.0F, -1.0F, 1.0F);
        GLES20.glUniformMatrix4fv(this.eZT, 1, false, this.gLz, 0);
        this.eZi.position(0);
        GLES20.glVertexAttribPointer(this.eZQ, 2, 5126, false, 0, this.eZi);
        GLES20.glEnableVertexAttribArray(this.eZQ);
        if ((this.rotate == 90) || (this.rotate == 270))
        {
          f1 = (this.gLw - paramInt1) / 2.0F / this.gLw;
          f2 = 1.0F - f1;
          this.lpN[0] = f1;
          this.lpN[2] = f2;
          this.lpN[4] = f1;
          this.lpN[6] = f2;
          this.eZh.put(this.lpN);
          this.eZh.position(0);
          GLES20.glVertexAttribPointer(this.eZP, 2, 5126, false, 0, this.eZh);
          GLES20.glEnableVertexAttribArray(this.eZP);
          GLES20.glDrawArrays(5, 0, 4);
          GLES20.glDisableVertexAttribArray(this.eZQ);
          GLES20.glDisableVertexAttribArray(this.eZP);
          GLES20.glBindTexture(3553, 0);
          GLES20.glBindFramebuffer(36160, 0);
          GLES20.glUseProgram(0);
        }
      }
      else
      {
        this.lpT.ch(this.lpu, this.lpv);
        this.lpT.eYQ = this.lpS;
      }
      try
      {
        this.lpT.bmD();
        uH(this.lpU);
        clearStatus();
        AppMethodBeat.o(2562);
        continue;
        f1 = (this.gLx - paramInt1) / 2.0F / this.gLx;
        f2 = 1.0F - f1;
        this.lpN[1] = f1;
        this.lpN[3] = f2;
        this.lpN[5] = f1;
        this.lpN[7] = f2;
      }
      catch (Exception paramArrayOfByte)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.FilterRenderer", paramArrayOfByte, "filterProcess error: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }

  public final void b(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(2563);
    if (this.lpT == null)
    {
      ab.e("MicroMsg.FilterRenderer", "drawFrame, emojiFilterProcessTex is null!!");
      AppMethodBeat.o(2563);
    }
    while (true)
    {
      return;
      if (paramInt1 <= 0)
      {
        ab.e("MicroMsg.FilterRenderer", "drawFrame, externalTextureId error:%s", new Object[] { Integer.valueOf(paramInt1) });
        AppMethodBeat.o(2563);
        continue;
      }
      this.gLw = paramInt2;
      this.gLx = paramInt3;
      this.eYS = paramBoolean;
      this.rotate = paramInt4;
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GLES20.glClear(16640);
      float f1;
      label284: float f2;
      if ((this.lpB != 0) && (this.gLw > 0) && (this.gLx > 0))
      {
        paramInt2 = Math.min(this.gLw, this.gLx);
        c.y(this.lpQ, this.lpS, this.lpu, this.lpv);
        GLES20.glViewport(0, 0, this.lpu, this.lpv);
        GLES20.glUseProgram(this.lpw);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, paramInt1);
        GLES20.glTexParameterf(36197, 10241, 9729.0F);
        GLES20.glTexParameterf(36197, 10240, 9729.0F);
        GLES20.glTexParameterf(36197, 10242, 33071.0F);
        GLES20.glTexParameterf(36197, 10243, 33071.0F);
        GLES20.glUniform1i(this.lpz, 0);
        Matrix.setIdentityM(this.gLz, 0);
        if (this.rotate > 0)
        {
          Matrix.setRotateM(this.gLz, 0, this.rotate, 0.0F, 0.0F, -1.0F);
          float[] arrayOfFloat = this.gLz;
          if (this.eYS)
          {
            f1 = -1.0F;
            Matrix.scaleM(arrayOfFloat, 0, -1.0F, f1, 1.0F);
          }
        }
        else
        {
          GLES20.glUniformMatrix4fv(this.lpA, 1, false, this.gLz, 0);
          this.eZi.position(0);
          GLES20.glVertexAttribPointer(this.lpy, 2, 5126, false, 0, this.eZi);
          GLES20.glEnableVertexAttribArray(this.lpy);
          if ((this.rotate != 90) && (this.rotate != 270))
            break label562;
          f1 = (this.gLw - paramInt2) / 2.0F / this.gLw;
          f2 = 1.0F - f1;
          this.lpN[0] = f1;
          this.lpN[2] = f2;
          this.lpN[4] = f1;
          this.lpN[6] = f2;
          label418: this.eZh.put(this.lpN);
          this.eZh.position(0);
          GLES20.glVertexAttribPointer(this.lpx, 2, 5126, false, 0, this.eZh);
          GLES20.glEnableVertexAttribArray(this.lpx);
          GLES20.glDrawArrays(5, 0, 4);
          GLES20.glDisableVertexAttribArray(this.lpy);
          GLES20.glDisableVertexAttribArray(this.lpx);
          GLES20.glBindTexture(36197, 0);
          GLES20.glBindFramebuffer(36160, 0);
          GLES20.glUseProgram(0);
          GLES20.glFinish();
          this.lpT.ch(this.lpu, this.lpv);
          this.lpT.eYQ = this.lpS;
        }
      }
      try
      {
        this.lpT.bmD();
        uH(this.lpU);
        clearStatus();
        AppMethodBeat.o(2563);
        continue;
        f1 = 1.0F;
        break label284;
        label562: f2 = (this.gLx - paramInt2) / 2.0F / this.gLx;
        f1 = 1.0F - f2;
        this.lpN[1] = f2;
        this.lpN[3] = f1;
        this.lpN[5] = f2;
        this.lpN[7] = f1;
        break label418;
        ab.i("MicroMsg.FilterRenderer", "skip %s, %s, %s", new Object[] { Integer.valueOf(this.lpB), Integer.valueOf(this.gLw), Integer.valueOf(this.gLx) });
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.FilterRenderer", localException, "filterProcess error: %s", new Object[] { localException.getMessage() });
      }
    }
  }

  public final void boi()
  {
    AppMethodBeat.i(2561);
    if (this.eNa)
      AppMethodBeat.o(2561);
    while (true)
    {
      return;
      long l = bo.yz();
      Object localObject1 = c.loN;
      this.eZO = c.a.U("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D y_texture;\n        uniform sampler2D uv_texture;\n\n        void main () {\n           float r, g, b, y, u, v;\n\n        //We had put the Y values of each pixel to the R,G,B components by GL_LUMINANCE,\n        //that's why we're pulling it from the R component, we could also use G or B\n           y = texture2D(y_texture, v_texCoord).r;\n\n        //We had put the U and V values of each pixel to the A and R,G,B components of the\n        //texture respectively using GL_LUMINANCE_ALPHA. Since U,V bytes are interspread\n        //in the texture, this is probably the fastest way to use them in the shader\n        //GL_LUMINANCE_ALPHA is a luminance/alpha pair, so r correspond to v, and\n        //a correspond to u\n        //NV21 is a VUVU pair\n           u = texture2D(uv_texture, v_texCoord).a;\n           v = texture2D(uv_texture, v_texCoord).r;\n           u = u - 0.5;\n           v = v - 0.5;\n\n        //The numbers are just YUV to RGB conversion constants\n        //https://en.wikipedia.org/wiki/YUV#Y.E2.80.B2UV420sp_.28NV21.29_to_RGB_conversion_.28Android.29\n           r = y + 1.370705 * v;\n           g = y - 0.337633 * u - 0.698001 * v;\n           b = y + 1.732446 * u;\n\n        //We finally set the RGB color of our pixel\n           gl_FragColor = vec4(r, g, b, 1.0);\n        }\n        ");
      if (this.eZO == 0)
        ab.e("MicroMsg.FilterRenderer", "checkInit, load yuvProgramId failed!");
      this.eZQ = GLES20.glGetAttribLocation(this.eZO, "a_position");
      this.eZP = GLES20.glGetAttribLocation(this.eZO, "a_texCoord");
      this.eZR = GLES20.glGetUniformLocation(this.eZO, "y_texture");
      this.eZS = GLES20.glGetUniformLocation(this.eZO, "uv_texture");
      this.eZT = GLES20.glGetUniformLocation(this.eZO, "uMatrix");
      localObject1 = c.loN;
      this.eZM = c.a.Vh();
      localObject1 = c.loN;
      this.eZN = c.a.Vh();
      localObject1 = c.loN;
      this.lpB = c.a.U("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n        uniform vec2 size;\n        uniform float radius;\n        uniform int calcRoundCorner;\n\n        void main () {\n            if (calcRoundCorner == 1) {\n                // round corner\n                vec2 bottomLeftCenter = vec2(radius, radius);\n                vec2 bottomRightCenter = vec2(size.x - radius, radius);\n                vec2 topLeftCenter = vec2(radius, size.y - radius);\n                vec2 topRightCenter = vec2(size.x - radius, size.y - radius);\n                if ((gl_FragCoord.x < bottomLeftCenter.x && gl_FragCoord.y < bottomLeftCenter.x && distance(gl_FragCoord.xy, bottomLeftCenter) > radius) ||\n                    (gl_FragCoord.x > bottomRightCenter.x && gl_FragCoord.y < bottomRightCenter.y && distance(gl_FragCoord.xy, bottomRightCenter) > radius) ||\n                    (gl_FragCoord.x < topLeftCenter.x && gl_FragCoord.y > topLeftCenter.y && distance(gl_FragCoord.xy, topLeftCenter) > radius) ||\n                    (gl_FragCoord.x > topRightCenter.x && gl_FragCoord.y > topRightCenter.y && distance(gl_FragCoord.xy, topRightCenter) > radius))  {\n//                   gl_FragColor = vec4(0.95, 0.95, 0.95, 1.0);\n                    discard;\n                } else {\n                   gl_FragColor = vec4(texture2D(texture, v_texCoord).rgb, 1.0);\n                }\n            } else {\n                gl_FragColor = texture2D(texture, v_texCoord);\n            }\n        }\n        ");
      this.lpE = GLES20.glGetAttribLocation(this.lpB, "a_position");
      this.lpD = GLES20.glGetAttribLocation(this.lpB, "a_texCoord");
      this.lpH = GLES20.glGetUniformLocation(this.lpB, "size");
      this.lpI = GLES20.glGetUniformLocation(this.lpB, "radius");
      this.lpF = GLES20.glGetUniformLocation(this.lpB, "texture");
      this.lpG = GLES20.glGetUniformLocation(this.lpB, "uMatrix");
      this.lpJ = GLES20.glGetUniformLocation(this.lpB, "calcRoundCorner");
      localObject1 = c.loN;
      this.lpC = c.a.Vh();
      localObject1 = c.loN;
      this.lpw = c.a.U("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
      if (this.lpw == 0)
        ab.e("MicroMsg.FilterRenderer", "checkInit, load externalProgramId failed");
      this.lpy = GLES20.glGetAttribLocation(this.lpw, "a_position");
      this.lpx = GLES20.glGetAttribLocation(this.lpw, "a_texCoord");
      this.lpz = GLES20.glGetUniformLocation(this.lpw, "texture");
      this.lpA = GLES20.glGetUniformLocation(this.lpw, "uMatrix");
      localObject1 = c.loN;
      this.lpS = c.a.Vh();
      localObject1 = c.eZY;
      this.gLB = Arrays.copyOf((float[])localObject1, localObject1.length);
      this.eZi = ByteBuffer.allocateDirect(this.gLB.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      this.eZi.put(this.gLB);
      this.eZi.position(0);
      localObject1 = c.eZZ;
      this.lpN = Arrays.copyOf((float[])localObject1, localObject1.length);
      this.eZh = ByteBuffer.allocateDirect(c.eZZ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      this.eZh.put(this.lpN);
      this.eZh.position(0);
      localObject1 = c.eZZ;
      this.lpP = Arrays.copyOf((float[])localObject1, localObject1.length);
      this.lpK = ByteBuffer.allocateDirect(this.lpP.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      this.lpK.put(this.lpP);
      this.lpK.position(0);
      localObject1 = c.eZY;
      this.lpO = Arrays.copyOf((float[])localObject1, localObject1.length);
      this.lpL = ByteBuffer.allocateDirect(this.lpO.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      this.lpL.put(this.lpO);
      this.lpL.position(0);
      localObject1 = c.loN;
      this.lpQ = c.a.Vi();
      localObject1 = c.loN;
      this.lpR = c.a.Vi();
      localObject1 = c.loN;
      this.lpU = c.a.Vh();
      if (this.lpT != null)
        this.lpT.clear();
      this.lpT = new a();
      localObject1 = this.lpT;
      int i = this.lpS;
      int j = this.lpU;
      try
      {
        ab.i("MicroMsg.EmojiFilterProcess", "initial %s, %d", new Object[] { localObject1, Long.valueOf(Thread.currentThread().getId()) });
        ((a)localObject1).lhm.init();
        PTSegmentor.getInstance().init();
        ((a)localObject1).lhj.ApplyGLSLFilter(true, ((a)localObject1).eYW, ((a)localObject1).eYX);
        ((a)localObject1).mSwapCopyFilter.ApplyGLSLFilter(true, ((a)localObject1).eYW, ((a)localObject1).eYX);
        ((a)localObject1).lhh.ApplyGLSLFilter(true, ((a)localObject1).eYW, ((a)localObject1).eYX);
        ((a)localObject1).mSmoothBFilters.initial();
        ((a)localObject1).mSmoothBFilters.updateBlurAlpha(0.4F);
        ((a)localObject1).mBeautyFaceList.initial();
        ((a)localObject1).mBeautyParam.changeFaceMeshSet(1);
        ((a)localObject1).mBeautyTransformList.initial();
        ((a)localObject1).mCopyFilter.ApplyGLSLFilter(true, ((a)localObject1).eYW, ((a)localObject1).eYX);
        VideoFilterUtil.setRenderMode(((a)localObject1).lhj, 1);
        VideoFilterUtil.setRenderMode(((a)localObject1).lhh, 1);
        VideoFilterUtil.setRenderMode(((a)localObject1).mCopyFilter, 1);
        ((a)localObject1).mBeautyTransformList.setRenderMode(1);
        ((a)localObject1).mBeautyFaceList.setRenderMode(1);
        ((a)localObject1).mSmoothBFilters.setRenderMode(1);
        ((a)localObject1).mRemodelFilter.setRenderMode(1);
        if (((a)localObject1).mPTSticker != null)
          ((a)localObject1).mPTSticker.setRenderMode(1);
        int k = 50;
        int m = 20;
        int n = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        if (bp.dpL())
        {
          localObject2 = ah.getContext().getSharedPreferences("EmojiCaptureDebugBeautyPara", 0);
          k = ((SharedPreferences)localObject2).getInt("skin", 50);
          m = ((SharedPreferences)localObject2).getInt("shape", 20);
          n = ((SharedPreferences)localObject2).getInt("faceV", 0);
          i1 = ((SharedPreferences)localObject2).getInt("eye", 0);
          i2 = ((SharedPreferences)localObject2).getInt("nose", 0);
          i3 = ((SharedPreferences)localObject2).getInt("chin", 0);
        }
        ((a)localObject1).a(BeautyRealConfig.TYPE.BEAUTY, k);
        ((a)localObject1).a(BeautyRealConfig.TYPE.BASIC3, m);
        ((a)localObject1).a(BeautyRealConfig.TYPE.FACE_V, n);
        ((a)localObject1).a(BeautyRealConfig.TYPE.EYE, i1);
        ((a)localObject1).a(BeautyRealConfig.TYPE.NOSE, i2);
        ((a)localObject1).a(BeautyRealConfig.TYPE.CHIN, i3);
        ((a)localObject1).eYQ = i;
        ((a)localObject1).lhn = j;
        Object localObject2 = c.loN;
        ((a)localObject1).lhp = c.a.Vi();
        for (m = 0; m < ((a)localObject1).mSwapFrames.length; m++)
          ((a)localObject1).mSwapFrames[m] = new com.tencent.filter.h();
        ab.d("MicroMsg.EmojiFilterProcess", "initial end %s", new Object[] { localObject1 });
        this.eNa = true;
        ab.i("MicroMsg.FilterRenderer", "init cost %s", new Object[] { Long.valueOf(bo.az(l)) });
        AppMethodBeat.o(2561);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.EmojiFilterProcess", localException, "initial error", new Object[0]);
          d locald = d.lhz;
          d.bmX();
        }
      }
    }
  }

  public final int boj()
  {
    return this.lpU;
  }

  public final void destroy()
  {
    AppMethodBeat.i(2567);
    ab.i("MicroMsg.FilterRenderer", "destroy, init:%s", new Object[] { Boolean.valueOf(this.eNa) });
    if (!this.eNa)
      AppMethodBeat.o(2567);
    while (true)
    {
      return;
      if (this.lpT != null)
      {
        this.lpT.clear();
        this.lpT = null;
      }
      GLES20.glDeleteTextures(5, new int[] { this.eZM, this.eZN, this.lpC, this.lpS, this.lpU }, 0);
      GLES20.glDeleteFramebuffers(2, new int[] { this.lpQ, this.lpR }, 0);
      GLES20.glDeleteProgram(this.eZO);
      GLES20.glDeleteProgram(this.lpB);
      GLES20.glDeleteProgram(this.lpw);
      this.lpV = null;
      this.eNa = false;
      AppMethodBeat.o(2567);
    }
  }

  public final void updateSize(int paramInt1, int paramInt2)
  {
    this.iZn = paramInt1;
    this.iZo = paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.h
 * JD-Core Version:    0.6.2
 */
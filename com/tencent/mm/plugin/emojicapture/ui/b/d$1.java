package com.tencent.mm.plugin.emojicapture.ui.b;

import a.f.b.j;
import a.l;
import a.v;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.view.Surface;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bu.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.ttpic.PTSegment;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class d$1
  implements Runnable
{
  d$1(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3155);
    d locald = this.loZ;
    locald.loP = locald.loO.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    if (locald.loP == EGL10.EGL_NO_DISPLAY)
      ab.e(locald.TAG, "egl get display error: %s", new Object[] { GLUtils.getEGLErrorString(locald.loO.eglGetError()) });
    Object localObject1 = new int[2];
    if (!locald.loO.eglInitialize(locald.loP, (int[])localObject1))
    {
      ab.e(locald.TAG, "egl init error: %s", new Object[] { GLUtils.getEGLErrorString(locald.loO.eglGetError()) });
      localObject1 = com.tencent.mm.plugin.emojicapture.model.d.lhz;
      com.tencent.mm.plugin.emojicapture.model.d.bna();
    }
    while (true)
    {
      locald.loU = new e();
      localObject1 = locald.loU;
      if (localObject1 == null)
        j.avw("renderer");
      Object localObject2;
      if (!((e)localObject1).bZi)
      {
        ab.i(((e)localObject1).TAG, "init: ");
        localObject2 = c.loN;
        ((e)localObject1).lpc = c.a.bof();
        ((e)localObject1).lpd = new SurfaceTexture(((e)localObject1).lpc);
        localObject2 = c.loN;
        ((e)localObject1).eZu = c.a.Vh();
        localObject2 = c.loN;
        ((e)localObject1).eZv = c.a.U("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES videoExternalTexture;\n        uniform sampler2D videoNormalTexture;\n        uniform sampler2D emojiTexture;\n        uniform vec2 size;\n        uniform float radius;\n        uniform int hasEmojiTexture;\n        uniform int useNormalVideoTexture;\n\n        vec4 blendTexture(vec4 source, vec4 blend) {\n            if (blend.a <= 0.0) {\n                return source;\n            }\n            float sourceAlpha = 1.0 - blend.a;\n            float alpha = max(source.a, blend.a);\n            float r = max(0.0, min(sourceAlpha * source.r + blend.r, 1.0));\n            float g = max(0.0, min(sourceAlpha * source.g + blend.g, 1.0));\n            float b = max(0.0, min(sourceAlpha * source.b + blend.b, 1.0));\n            vec4 result = vec4(r, g, b, alpha);\n            if (alpha != 1.0) {\n                r = r + (1.0 - alpha) * 0.95;\n                g = g + (1.0 - alpha) * 0.95;\n                b = b + (1.0 - alpha) * 0.95;\n                r = max(0.0, min(r, 1.0));\n                g = max(0.0, min(g, 1.0));\n                b = max(0.0, min(b, 1.0));\n                return vec4(r, g, b, 1.0);\n            } else {\n                return vec4(r, g, b, alpha);\n            }\n        }\n\n        void main () {\n            vec2 bottomLeftCenter = vec2(radius, radius);\n            vec2 bottomRightCenter = vec2(size.x - radius, radius);\n            vec2 topLeftCenter = vec2(radius, size.y - radius);\n            vec2 topRightCenter = vec2(size.x - radius, size.y - radius);\n            if ((gl_FragCoord.x < bottomLeftCenter.x && gl_FragCoord.y < bottomLeftCenter.x && distance(gl_FragCoord.xy, bottomLeftCenter) > radius) ||\n                    (gl_FragCoord.x > bottomRightCenter.x && gl_FragCoord.y < bottomRightCenter.y && distance(gl_FragCoord.xy, bottomRightCenter) > radius) ||\n                    (gl_FragCoord.x < topLeftCenter.x && gl_FragCoord.y > topLeftCenter.y && distance(gl_FragCoord.xy, topLeftCenter) > radius) ||\n                    (gl_FragCoord.x > topRightCenter.x && gl_FragCoord.y > topRightCenter.y && distance(gl_FragCoord.xy, topRightCenter) > radius))  {\n                gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n            } else {\n                vec4 videoColor;\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texCoord);\n                }\n                if (videoColor.a != 1.0) {\n                    videoColor.a = 0.0;\n                }\n                if (hasEmojiTexture == 1) {\n                    gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texCoord));\n                } else {\n                    gl_FragColor = videoColor;\n                }\n            }\n        }\n        ");
        ((e)localObject1).eZw = GLES20.glGetAttribLocation(((e)localObject1).eZv, "a_position");
        ((e)localObject1).eZx = GLES20.glGetAttribLocation(((e)localObject1).eZv, "a_texCoord");
        ((e)localObject1).eZy = GLES20.glGetUniformLocation(((e)localObject1).eZv, "videoExternalTexture");
        ((e)localObject1).eZz = GLES20.glGetUniformLocation(((e)localObject1).eZv, "videoNormalTexture");
        ((e)localObject1).eZA = GLES20.glGetUniformLocation(((e)localObject1).eZv, "emojiTexture");
        ((e)localObject1).lpe = GLES20.glGetUniformLocation(((e)localObject1).eZv, "size");
        ((e)localObject1).lpf = GLES20.glGetUniformLocation(((e)localObject1).eZv, "radius");
        ((e)localObject1).eZB = GLES20.glGetUniformLocation(((e)localObject1).eZv, "hasEmojiTexture");
        ((e)localObject1).eZD = GLES20.glGetUniformLocation(((e)localObject1).eZv, "uMatrix");
        ((e)localObject1).eZC = GLES20.glGetUniformLocation(((e)localObject1).eZv, "useNormalVideoTexture");
        localObject2 = c.loN;
        ((e)localObject1).lpg = c.a.U("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        ((e)localObject1).lph = GLES20.glGetAttribLocation(((e)localObject1).lpg, "a_position");
        ((e)localObject1).lpi = GLES20.glGetAttribLocation(((e)localObject1).lpg, "a_texCoord");
        ((e)localObject1).lpj = GLES20.glGetUniformLocation(((e)localObject1).lpg, "texture");
        localObject2 = c.loN;
        ((e)localObject1).lpl = c.a.Vh();
        localObject2 = c.loN;
        ((e)localObject1).lpk = c.a.Vi();
        localObject2 = c.loN;
        ((e)localObject1).lpr = c.a.Vh();
        ((e)localObject1).eZi.put(c.eZY);
        ((e)localObject1).lps.put(c.eZZ);
        ((e)localObject1).lpo.init();
        ((e)localObject1).lpp.init();
      }
      try
      {
        localObject2 = new com/tencent/filter/h;
        ((h)localObject2).<init>(((e)localObject1).lpk, ((e)localObject1).lpl, ((e)localObject1).lpm, ((e)localObject1).lpm);
        ((e)localObject1).lpq = ((h)localObject2);
        ((e)localObject1).bZi = true;
        localObject1 = locald.loU;
        if (localObject1 == null)
          j.avw("renderer");
        ((e)localObject1).boh().setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener)new d.c(locald));
        localObject1 = locald.loU;
        if (localObject1 == null)
          j.avw("renderer");
        locald.loV = new Surface(((e)localObject1).boh());
        AppMethodBeat.o(3155);
        return;
        localObject1 = c.loN;
        EGL10 localEGL10 = locald.loO;
        EGLDisplay localEGLDisplay = locald.loP;
        j.o(localEGLDisplay, "eGLDisplay");
        j.p(localEGL10, "eGL");
        j.p(localEGLDisplay, "eGLDisplay");
        int[] arrayOfInt = new int[15];
        int[] tmp617_615 = arrayOfInt;
        tmp617_615[0] = 12324;
        int[] tmp623_617 = tmp617_615;
        tmp623_617[1] = 8;
        int[] tmp628_623 = tmp623_617;
        tmp628_623[2] = 12323;
        int[] tmp634_628 = tmp628_623;
        tmp634_628[3] = 8;
        int[] tmp639_634 = tmp634_628;
        tmp639_634[4] = 12322;
        int[] tmp645_639 = tmp639_634;
        tmp645_639[5] = 8;
        int[] tmp650_645 = tmp645_639;
        tmp650_645[6] = 12321;
        int[] tmp657_650 = tmp650_645;
        tmp657_650[7] = 8;
        int[] tmp663_657 = tmp657_650;
        tmp663_657[8] = 12325;
        int[] tmp670_663 = tmp663_657;
        tmp670_663[9] = 0;
        int[] tmp675_670 = tmp670_663;
        tmp675_670[10] = 12326;
        int[] tmp682_675 = tmp675_670;
        tmp682_675[11] = 0;
        int[] tmp687_682 = tmp682_675;
        tmp687_682[12] = 12352;
        int[] tmp694_687 = tmp687_682;
        tmp694_687[13] = 4;
        int[] tmp699_694 = tmp694_687;
        tmp699_694[14] = 12344;
        tmp699_694;
        localObject2 = new int[1];
        localEGL10.eglChooseConfig(localEGLDisplay, arrayOfInt, null, 0, (int[])localObject2);
        int i = localObject2[0];
        localObject1 = new EGLConfig[i];
        if (!localEGL10.eglChooseConfig(localEGLDisplay, arrayOfInt, (EGLConfig[])localObject1, i, (int[])localObject2))
        {
          ab.e("MicroMsg.EmojiCaptureGLUtil", "egl choose config failed: %s", new Object[] { GLUtils.getEGLErrorString(localEGL10.eglGetError()) });
          localObject1 = null;
          label783: locald.loS = ((EGLConfig)localObject1);
          localObject1 = locald.loS;
          if (localObject1 == null)
            continue;
          locald.loQ = locald.loO.eglCreateContext(locald.loP, (EGLConfig)localObject1, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
          i = locald.width;
          int j = locald.height;
          locald.loR = locald.loO.eglCreatePbufferSurface(locald.loP, (EGLConfig)localObject1, new int[] { 12375, i, 12374, j, 12344 });
          if ((locald.loR != EGL10.EGL_NO_SURFACE) && (locald.loQ != EGL10.EGL_NO_CONTEXT))
            break label1013;
          if (locald.loO.eglGetError() != 12299)
            break label978;
          ab.e(locald.TAG, "eglCreateWindowSurface returned EGL_BAD_NATIVE_WINDOW. ");
          i = -1;
        }
        while (true)
        {
          if (i >= 0)
            break label1019;
          ab.e(locald.TAG, "createEGLContext failed -1");
          localObject1 = com.tencent.mm.plugin.emojicapture.model.d.lhz;
          com.tencent.mm.plugin.emojicapture.model.d.bna();
          break;
          localObject1 = localObject1[0];
          break label783;
          label978: ab.e(locald.TAG, "eglCreateWindowSurface failed : %s", new Object[] { GLUtils.getEGLErrorString(locald.loO.eglGetError()) });
          i = -1;
          continue;
          label1013: i = 0;
        }
        label1019: if (!locald.loO.eglMakeCurrent(locald.loP, locald.loR, locald.loR, locald.loQ))
        {
          ab.e(locald.TAG, "eglMakeCurrent failed : " + GLUtils.getEGLErrorString(locald.loO.eglGetError()));
          localObject1 = com.tencent.mm.plugin.emojicapture.model.d.lhz;
          com.tencent.mm.plugin.emojicapture.model.d.bna();
        }
        localObject1 = locald.loQ;
        j.o(localObject1, "eGLContext");
        localObject1 = ((EGLContext)localObject1).getGL();
        if (localObject1 == null)
        {
          localObject1 = new v("null cannot be cast to non-null type javax.microedition.khronos.opengles.GL10");
          AppMethodBeat.o(3155);
          throw ((Throwable)localObject1);
        }
        locald.loT = ((GL10)localObject1);
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.plugin.emojicapture.model.d locald1 = com.tencent.mm.plugin.emojicapture.model.d.lhz;
          com.tencent.mm.plugin.emojicapture.model.d.bnh();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.d.1
 * JD-Core Version:    0.6.2
 */
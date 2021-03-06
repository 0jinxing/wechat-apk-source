package com.tencent.mm.media.h.a;

import a.f.b.j;
import a.l;
import android.opengl.GLSurfaceView.EGLContextFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/config/RenderContextFactory;", "Landroid/opengl/GLSurfaceView$EGLContextFactory;", "()V", "EGL_CONTEXT_CLIENT_VERSION", "", "TAG", "", "createContext", "Ljavax/microedition/khronos/egl/EGLContext;", "egl", "Ljavax/microedition/khronos/egl/EGL10;", "display", "Ljavax/microedition/khronos/egl/EGLDisplay;", "eglConfig", "Ljavax/microedition/khronos/egl/EGLConfig;", "destroyContext", "", "context", "plugin-mediaeditor_release"})
public final class b
  implements GLSurfaceView.EGLContextFactory
{
  private final int EGL_CONTEXT_CLIENT_VERSION = 12440;
  private final String TAG = "MicroMsg.RenderContextFactory";

  public final EGLContext createContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig)
  {
    AppMethodBeat.i(13098);
    j.p(paramEGL10, "egl");
    j.p(paramEGLDisplay, "display");
    j.p(paramEGLConfig, "eglConfig");
    ab.w(this.TAG, "creating OpenGL ES 2.0 context");
    int i = this.EGL_CONTEXT_CLIENT_VERSION;
    paramEGL10 = paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] { i, 2, 12344 });
    j.o(paramEGL10, "egl.eglCreateContext(dis…_NO_CONTEXT, attrib_list)");
    AppMethodBeat.o(13098);
    return paramEGL10;
  }

  public final void destroyContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
  {
    AppMethodBeat.i(13099);
    j.p(paramEGL10, "egl");
    j.p(paramEGLDisplay, "display");
    j.p(paramEGLContext, "context");
    ab.w(this.TAG, "destroyContext OpenGL ES 2.0 Context");
    paramEGL10.eglDestroyContext(paramEGLDisplay, paramEGLContext);
    AppMethodBeat.o(13099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.h.a.b
 * JD-Core Version:    0.6.2
 */
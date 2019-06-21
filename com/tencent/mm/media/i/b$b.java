package com.tencent.mm.media.i;

import a.l;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/util/GLEnvironmentUtil$EGLEnvironment;", "", "disPlay", "Landroid/opengl/EGLDisplay;", "eglSurface", "Landroid/opengl/EGLSurface;", "eglContext", "Landroid/opengl/EGLContext;", "(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)V", "getDisPlay", "()Landroid/opengl/EGLDisplay;", "setDisPlay", "(Landroid/opengl/EGLDisplay;)V", "getEglContext", "()Landroid/opengl/EGLContext;", "setEglContext", "(Landroid/opengl/EGLContext;)V", "getEglSurface", "()Landroid/opengl/EGLSurface;", "setEglSurface", "(Landroid/opengl/EGLSurface;)V", "plugin-mediaeditor_release"})
public final class b$b
{
  public EGLDisplay fae;
  public EGLSurface faf;
  public EGLContext fag;

  public b$b(EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface, EGLContext paramEGLContext)
  {
    AppMethodBeat.i(13125);
    this.fae = paramEGLDisplay;
    this.faf = paramEGLSurface;
    this.fag = paramEGLContext;
    AppMethodBeat.o(13125);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.i.b.b
 * JD-Core Version:    0.6.2
 */
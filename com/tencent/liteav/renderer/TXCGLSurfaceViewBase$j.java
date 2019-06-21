package com.tencent.liteav.renderer;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

class TXCGLSurfaceViewBase$j
{
  private static String a = "GLThreadManager";
  private boolean b;
  private int c;
  private boolean d;
  private boolean e;
  private boolean f;
  private TXCGLSurfaceViewBase.i g;

  private void c()
  {
    this.c = 131072;
    this.e = true;
    this.b = true;
  }

  public void a(TXCGLSurfaceViewBase.i parami)
  {
    try
    {
      AppMethodBeat.i(67300);
      TXCGLSurfaceViewBase.i.a(parami, true);
      if (this.g == parami)
        this.g = null;
      notifyAll();
      AppMethodBeat.o(67300);
      return;
    }
    finally
    {
    }
    throw parami;
  }

  public void a(GL10 paramGL10)
  {
    boolean bool1 = true;
    try
    {
      AppMethodBeat.i(67304);
      if (!this.d)
      {
        c();
        paramGL10 = paramGL10.glGetString(7937);
        if (this.c < 131072)
        {
          if (paramGL10.startsWith("Q3Dimension MSM7500 "))
            break label86;
          bool2 = true;
          this.e = bool2;
          notifyAll();
        }
        if (this.e)
          break label91;
      }
      label86: label91: for (boolean bool2 = bool1; ; bool2 = false)
      {
        this.f = bool2;
        this.d = true;
        AppMethodBeat.o(67304);
        return;
        bool2 = false;
        break;
      }
    }
    finally
    {
    }
    throw paramGL10;
  }

  public boolean a()
  {
    try
    {
      boolean bool = this.f;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean b()
  {
    try
    {
      AppMethodBeat.i(67303);
      c();
      boolean bool;
      if (!this.e)
      {
        bool = true;
        AppMethodBeat.o(67303);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(67303);
      }
    }
    finally
    {
    }
  }

  public boolean b(TXCGLSurfaceViewBase.i parami)
  {
    boolean bool = true;
    AppMethodBeat.i(67301);
    if ((this.g == parami) || (this.g == null))
    {
      this.g = parami;
      notifyAll();
      AppMethodBeat.o(67301);
    }
    while (true)
    {
      return bool;
      c();
      if (this.e)
      {
        AppMethodBeat.o(67301);
      }
      else
      {
        if (this.g != null)
          this.g.h();
        bool = false;
        AppMethodBeat.o(67301);
      }
    }
  }

  public void c(TXCGLSurfaceViewBase.i parami)
  {
    AppMethodBeat.i(67302);
    if (this.g == parami)
      this.g = null;
    notifyAll();
    AppMethodBeat.o(67302);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.TXCGLSurfaceViewBase.j
 * JD-Core Version:    0.6.2
 */
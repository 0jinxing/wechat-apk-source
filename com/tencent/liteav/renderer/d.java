package com.tencent.liteav.renderer;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Handler;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class d
{
  private TextureView a;
  private Handler b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private float k;
  private int l;

  public d(TextureView paramTextureView)
  {
    AppMethodBeat.i(67252);
    this.c = 0;
    this.d = 0;
    this.e = 640;
    this.f = 480;
    this.g = 0;
    this.h = 0;
    this.i = 1;
    this.j = 0;
    this.k = 1.0F;
    this.l = 0;
    this.a = paramTextureView;
    this.c = paramTextureView.getWidth();
    this.d = paramTextureView.getHeight();
    this.b = new Handler(paramTextureView.getContext().getMainLooper());
    AppMethodBeat.o(67252);
  }

  private void a()
  {
    AppMethodBeat.i(67257);
    try
    {
      Handler localHandler = this.b;
      d.3 local3 = new com/tencent/liteav/renderer/d$3;
      local3.<init>(this);
      localHandler.post(local3);
      AppMethodBeat.o(67257);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67257);
    }
  }

  private void c(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67258);
    if ((this.a == null) || (paramInt1 == 0) || (paramInt2 == 0))
      AppMethodBeat.o(67258);
    while (true)
    {
      return;
      if ((this.c != 0) && (this.d != 0))
        break;
      AppMethodBeat.o(67258);
    }
    double d1 = paramInt2 / paramInt1;
    if (this.d > (int)(this.c * d1))
      this.g = this.c;
    for (this.h = ((int)(d1 * this.c)); ; this.h = this.d)
    {
      float f1 = (this.c - this.g) / 2.0F;
      float f2 = (this.d - this.h) / 2.0F;
      float f3 = this.g / this.c;
      float f4 = this.h / this.d;
      Matrix localMatrix = new Matrix();
      this.a.getTransform(localMatrix);
      localMatrix.setScale(f3, f4);
      localMatrix.postTranslate(f1, f2);
      this.a.setTransform(localMatrix);
      this.a.requestLayout();
      AppMethodBeat.o(67258);
      break;
      this.g = ((int)(this.d / d1));
    }
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(67253);
    try
    {
      Handler localHandler = this.b;
      d.1 local1 = new com/tencent/liteav/renderer/d$1;
      local1.<init>(this, paramInt);
      localHandler.post(local1);
      AppMethodBeat.o(67253);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67253);
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67259);
    TXCLog.w("TXCTextureViewWrapper", "vrender: set view size:" + paramInt1 + "," + paramInt2);
    this.c = paramInt1;
    this.d = paramInt2;
    a();
    AppMethodBeat.o(67259);
  }

  public void b(int paramInt)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(67254);
    this.i = paramInt;
    float f2;
    if (this.a != null)
    {
      if (paramInt != 1)
        break label172;
      f2 = f1;
      if (this.j != 0)
      {
        if (this.j != 180)
          break label89;
        f2 = f1;
      }
    }
    while (true)
    {
      f1 = f2;
      if (this.k < 0.0F)
        f1 = -f2;
      this.a.setScaleX(f1);
      this.a.setScaleY(Math.abs(f1));
      this.k = f1;
      AppMethodBeat.o(67254);
      label89: float f3;
      while (true)
      {
        return;
        if (this.j != 270)
        {
          f2 = f1;
          if (this.j != 90)
            break;
        }
        if ((this.g == 0) || (this.h == 0))
        {
          AppMethodBeat.o(67254);
        }
        else
        {
          f3 = this.d / this.g;
          f1 = this.c / this.h;
          f2 = f1;
          if (f3 > f1)
            break;
          f2 = f3;
          break;
          label172: f2 = f1;
          if (paramInt != 0)
            break;
          if ((this.g != 0) && (this.h != 0))
            break label200;
          AppMethodBeat.o(67254);
        }
      }
      label200: if ((this.j == 0) || (this.j == 180))
      {
        f3 = this.d / this.h;
        f1 = this.c / this.g;
        f2 = f1;
        if (f3 >= f1)
          f2 = f3;
      }
      else if (this.j != 270)
      {
        f2 = f1;
        if (this.j != 90);
      }
      else
      {
        f3 = this.d / this.g;
        f1 = this.c / this.h;
        f2 = f1;
        if (f3 >= f1)
          f2 = f3;
      }
    }
  }

  public void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67260);
    TXCLog.w("TXCTextureViewWrapper", "vrender: set video size:" + paramInt1 + "," + paramInt2);
    this.e = paramInt1;
    this.f = paramInt2;
    a();
    AppMethodBeat.o(67260);
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(67255);
    try
    {
      Handler localHandler = this.b;
      d.2 local2 = new com/tencent/liteav/renderer/d$2;
      local2.<init>(this, paramInt);
      localHandler.post(local2);
      AppMethodBeat.o(67255);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67255);
    }
  }

  public void d(int paramInt)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(67256);
    paramInt %= 360;
    this.j = paramInt;
    float f2;
    if (this.a != null)
    {
      if ((paramInt != 0) && (paramInt != 180))
        break label180;
      this.a.setRotation(360 - paramInt);
      if (this.i != 1)
        break label108;
      f2 = 1.0F;
    }
    while (true)
    {
      float f3 = f2;
      if (this.k < 0.0F)
        f3 = -f2;
      this.a.setScaleX(f3);
      this.a.setScaleY(Math.abs(f3));
      this.k = f3;
      AppMethodBeat.o(67256);
      while (true)
      {
        return;
        label108: f2 = f1;
        if (this.i != 0)
          break;
        if ((this.g == 0) || (this.h == 0))
        {
          AppMethodBeat.o(67256);
        }
        else
        {
          f2 = this.d / this.h;
          f3 = this.c / this.g;
          if (f2 < f3)
            f2 = f3;
          while (true)
            break;
          label180: if (paramInt != 270)
          {
            f2 = f1;
            if (paramInt != 90)
              break;
          }
          if ((this.g != 0) && (this.h != 0))
            break label217;
          AppMethodBeat.o(67256);
        }
      }
      label217: this.a.setRotation(360 - paramInt);
      f3 = this.d / this.g;
      float f4 = this.c / this.h;
      if (this.i == 1)
      {
        if (f3 > f4);
        for (f2 = f4; ; f2 = f3)
          break;
      }
      f2 = f1;
      if (this.i == 0)
      {
        f2 = f4;
        if (f3 >= f4)
          f2 = f3;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.d
 * JD-Core Version:    0.6.2
 */
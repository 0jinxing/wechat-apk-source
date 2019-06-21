package com.tencent.liteav.beauty;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.liteav.basic.e.i;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c extends com.tencent.liteav.basic.module.a
  implements d
{
  protected Context a;
  protected boolean b;
  protected boolean c;
  protected int d;
  protected int e;
  protected int f;
  protected com.tencent.liteav.basic.e.a g;
  protected b h;
  protected b i;
  protected c.c j;
  e k;
  private boolean l;
  private long m;
  private long n;
  private long o;
  private c.a p;

  public c(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(67059);
    this.b = true;
    this.c = false;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = null;
    this.i = new b();
    this.j = null;
    this.l = false;
    this.m = 0L;
    this.n = 0L;
    this.o = 0L;
    this.p = new c.a(this);
    Object localObject = (ActivityManager)paramContext.getSystemService("activity");
    TXCLog.i("TXCVideoPreprocessor", "TXCVideoPreprocessor version: VideoPreprocessor-v1.1");
    localObject = ((ActivityManager)localObject).getDeviceConfigurationInfo();
    if (localObject != null)
    {
      TXCLog.i("TXCVideoPreprocessor", "opengl es version " + ((ConfigurationInfo)localObject).reqGlEsVersion);
      TXCLog.i("TXCVideoPreprocessor", "set GLContext ".concat(String.valueOf(paramBoolean)));
      if (((ConfigurationInfo)localObject).reqGlEsVersion > 131072)
      {
        TXCLog.i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_3");
        i.a(3);
      }
    }
    while (true)
    {
      this.a = paramContext;
      this.b = paramBoolean;
      this.h = new b(this.a, this.b);
      a.a().a(paramContext);
      AppMethodBeat.o(67059);
      return;
      TXCLog.i("TXCVideoPreprocessor", "This devices is OpenGlUtils.OPENGL_ES_2");
      i.a(2);
      continue;
      TXCLog.e("TXCVideoPreprocessor", "getDeviceConfigurationInfo opengl Info failed!");
    }
  }

  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(67068);
    if (this.j == null)
    {
      this.j = new c.c(null);
      this.n = 0L;
      this.o = System.currentTimeMillis();
    }
    int i1;
    int i2;
    if ((paramInt1 != this.j.b) || (paramInt2 != this.j.c) || (paramInt3 != this.j.f) || ((this.d > 0) && (this.d != this.j.h)) || ((this.e > 0) && (this.e != this.j.i)) || ((this.f > 0) && (this.f != this.j.j)) || ((this.g != null) && (((this.g.c > 0) && ((this.j.m == null) || (this.g.c != this.j.m.c))) || ((this.g.d > 0) && ((this.j.m == null) || (this.g.d != this.j.m.d))) || ((this.g.a >= 0) && ((this.j.m == null) || (this.g.a != this.j.m.a))) || ((this.g.b >= 0) && ((this.j.m == null) || (this.g.b != this.j.m.b))))) || (this.c != this.j.g))
    {
      TXCLog.i("TXCVideoPreprocessor", "Init sdk");
      TXCLog.i("TXCVideoPreprocessor", "Input widht " + paramInt1 + " height " + paramInt2);
      this.j.b = paramInt1;
      this.j.c = paramInt2;
      i1 = paramInt1;
      i2 = paramInt2;
      if (this.g != null)
      {
        i1 = paramInt1;
        i2 = paramInt2;
        if (this.g.a >= 0)
        {
          i1 = paramInt1;
          i2 = paramInt2;
          if (this.g.b >= 0)
          {
            i1 = paramInt1;
            i2 = paramInt2;
            if (this.g.c > 0)
            {
              i1 = paramInt1;
              i2 = paramInt2;
              if (this.g.d > 0)
              {
                TXCLog.i("TXCVideoPreprocessor", "set Crop Rect; init ");
                if (paramInt1 - this.g.a <= this.g.c)
                  break label894;
                paramInt1 = this.g.c;
                if (paramInt2 - this.g.b <= this.g.d)
                  break label907;
                paramInt2 = this.g.d;
                label504: this.g.c = paramInt1;
                this.g.d = paramInt2;
                i1 = this.g.c;
                i2 = this.g.d;
                this.j.m = this.g;
              }
            }
          }
        }
      }
      this.j.f = paramInt3;
      this.j.a = this.b;
      this.j.k = paramInt4;
      this.j.l = paramInt5;
      if (true == this.l)
      {
        this.j.h = this.d;
        this.j.i = this.e;
        label616: this.j.j = this.f;
        if (this.j.j <= 0)
          this.j.j = 0;
        if ((this.j.h <= 0) || (this.j.i <= 0))
        {
          if ((90 != this.j.j) && (270 != this.j.j))
            break label939;
          this.j.h = i2;
          this.j.i = i1;
        }
        label708: if ((90 != this.j.j) && (270 != this.j.j))
          break label960;
        this.j.d = this.j.i;
        this.j.e = this.j.h;
        label761: if (true != this.l)
        {
          this.j.h = this.d;
          this.j.i = this.e;
          if ((this.j.h <= 0) || (this.j.i <= 0))
          {
            if ((90 != this.j.j) && (270 != this.j.j))
              break label991;
            this.j.h = i2;
            this.j.i = i1;
          }
        }
        label854: this.j.g = this.c;
        if (a(this.j))
          break label1081;
        TXCLog.e("TXCVideoPreprocessor", "init failed!");
        AppMethodBeat.o(67068);
      }
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      label894: paramInt1 -= this.g.a;
      break;
      label907: paramInt2 -= this.g.b;
      break label504;
      this.j.h = 0;
      this.j.i = 0;
      break label616;
      label939: this.j.h = i1;
      this.j.i = i2;
      break label708;
      label960: this.j.d = this.j.h;
      this.j.e = this.j.i;
      break label761;
      label991: this.j.h = i1;
      this.j.i = i2;
      break label854;
      if ((paramInt4 != this.j.k) || (paramInt5 != this.j.l))
      {
        this.j.k = paramInt4;
        this.i.k = paramInt4;
        this.j.l = paramInt5;
        this.i.l = paramInt5;
        this.h.a(paramInt5);
      }
      label1081: AppMethodBeat.o(67068);
    }
  }

  private boolean a(c.c paramc)
  {
    AppMethodBeat.i(67069);
    this.i.d = paramc.b;
    this.i.e = paramc.c;
    this.i.m = paramc.m;
    this.i.g = paramc.d;
    this.i.f = paramc.e;
    this.i.h = ((paramc.f + 360) % 360);
    this.i.b = paramc.h;
    this.i.c = paramc.i;
    this.i.a = paramc.j;
    this.i.j = paramc.a;
    this.i.i = paramc.g;
    this.i.k = paramc.k;
    this.i.l = paramc.l;
    if (this.h == null)
      this.h = new b(this.a, paramc.a);
    boolean bool = this.h.a(this.i);
    AppMethodBeat.o(67069);
    return bool;
  }

  private void b()
  {
    AppMethodBeat.i(67058);
    if (this.m != 0L)
      setStatusValue(3002, Long.valueOf(System.currentTimeMillis() - this.m));
    this.n += 1L;
    long l1 = System.currentTimeMillis();
    if (l1 > this.o + 2000L)
    {
      setStatusValue(3003, Double.valueOf(this.n * 1000.0D / (l1 - this.o)));
      this.n = 0L;
      this.o = l1;
    }
    AppMethodBeat.o(67058);
  }

  private int m(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return paramInt;
      paramInt = 90;
      continue;
      paramInt = 180;
      continue;
      paramInt = 270;
    }
  }

  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 0;
    boolean bool = false;
    AppMethodBeat.i(67055);
    if (this.k != null)
    {
      com.tencent.liteav.basic.g.c localc = new com.tencent.liteav.basic.g.c();
      localc.d = paramInt2;
      localc.e = paramInt3;
      if (this.j != null)
      {
        paramInt2 = this.j.j;
        localc.i = paramInt2;
        if (this.j != null)
          bool = this.j.g;
        localc.h = bool;
        localc.a = paramInt1;
        paramInt1 = this.k.a(localc);
        AppMethodBeat.o(67055);
      }
    }
    while (true)
    {
      return paramInt1;
      paramInt2 = 0;
      break;
      AppMethodBeat.o(67055);
      paramInt1 = i1;
    }
  }

  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    try
    {
      AppMethodBeat.i(67062);
      a(paramInt2, paramInt3, m(paramInt4), paramInt5, paramInt6);
      this.h.b(this.i);
      paramInt1 = this.h.a(paramInt1, paramInt5);
      AppMethodBeat.o(67062);
      return paramInt1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int a(com.tencent.liteav.basic.g.c paramc, int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(67063);
      this.m = System.currentTimeMillis();
      a(paramc.k);
      a(paramc.f, paramc.g);
      a(paramc.h);
      a(paramc.i);
      a(paramc.c);
      paramInt1 = a(paramc.a, paramc.d, paramc.e, paramc.i, paramInt1, paramInt2);
      AppMethodBeat.o(67063);
      return paramInt1;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }

  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    try
    {
      AppMethodBeat.i(67061);
      a(paramInt1, paramInt2, m(paramInt3), paramInt4, paramInt5);
      this.h.b(this.i);
      paramInt1 = this.h.a(paramArrayOfByte, paramInt4);
      AppMethodBeat.o(67061);
      return paramInt1;
    }
    finally
    {
      paramArrayOfByte = finally;
    }
    throw paramArrayOfByte;
  }

  public void a()
  {
    try
    {
      AppMethodBeat.i(67070);
      if (this.h != null)
        this.h.a();
      this.j = null;
      AppMethodBeat.o(67070);
      return;
    }
    finally
    {
    }
  }

  public void a(float paramFloat)
  {
    try
    {
      AppMethodBeat.i(67085);
      if (this.h != null)
        this.h.a(paramFloat);
      AppMethodBeat.o(67085);
      return;
    }
    finally
    {
    }
  }

  public void a(int paramInt)
  {
    try
    {
      this.f = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    try
    {
      this.d = paramInt1;
      this.e = paramInt2;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(67056);
    b();
    com.tencent.liteav.basic.g.c localc;
    if (this.k != null)
    {
      localc = new com.tencent.liteav.basic.g.c();
      localc.d = paramInt2;
      localc.e = paramInt3;
      if (this.j == null)
        break label111;
    }
    label111: for (paramInt2 = this.j.j; ; paramInt2 = 0)
    {
      localc.i = paramInt2;
      if (this.j != null)
        bool = this.j.g;
      localc.h = bool;
      localc.a = paramInt1;
      this.k.a(localc, paramLong);
      AppMethodBeat.o(67056);
      return;
    }
  }

  public void a(Bitmap paramBitmap)
  {
    try
    {
      AppMethodBeat.i(67086);
      if (this.h != null)
        this.h.a(paramBitmap);
      AppMethodBeat.o(67086);
      return;
    }
    finally
    {
    }
    throw paramBitmap;
  }

  public void a(Bitmap paramBitmap, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    try
    {
      AppMethodBeat.i(67064);
      if ((paramFloat1 < 0.0F) || (paramFloat2 < 0.0F) || (paramFloat3 < 0.0D))
      {
        TXCLog.e("TXCVideoPreprocessor", "WaterMark param is Error!");
        AppMethodBeat.o(67064);
      }
      while (true)
      {
        return;
        if (this.h != null)
          this.h.a(paramBitmap, paramFloat1, paramFloat2, paramFloat3);
        AppMethodBeat.o(67064);
      }
    }
    finally
    {
    }
    throw paramBitmap;
  }

  public void a(com.tencent.liteav.basic.d.a parama)
  {
    try
    {
      AppMethodBeat.i(67067);
      if (this.h == null)
      {
        TXCLog.e("TXCVideoPreprocessor", "setListener mDrawer is null!");
        AppMethodBeat.o(67067);
      }
      while (true)
      {
        return;
        this.h.a(parama);
        AppMethodBeat.o(67067);
      }
    }
    finally
    {
    }
    throw parama;
  }

  public void a(com.tencent.liteav.basic.e.a parama)
  {
    try
    {
      this.g = parama;
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public void a(d paramd)
  {
    try
    {
      AppMethodBeat.i(67065);
      if (this.h == null)
      {
        TXCLog.e("TXCVideoPreprocessor", "setListener mDrawer is null!");
        AppMethodBeat.o(67065);
      }
      while (true)
      {
        return;
        this.h.a(paramd);
        AppMethodBeat.o(67065);
      }
    }
    finally
    {
    }
    throw paramd;
  }

  public void a(e parame)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(67066);
        if (this.h == null)
        {
          TXCLog.e("TXCVideoPreprocessor", "setListener mDrawer is null!");
          AppMethodBeat.o(67066);
          return;
        }
        this.k = parame;
        if (parame == null)
        {
          this.h.a(null);
          AppMethodBeat.o(67066);
          continue;
        }
      }
      finally
      {
      }
      this.h.a(this);
      AppMethodBeat.o(67066);
    }
  }

  public void a(String paramString)
  {
    try
    {
      AppMethodBeat.i(67076);
      if (this.h != null)
        this.h.a(paramString);
      AppMethodBeat.o(67076);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public void a(boolean paramBoolean)
  {
    try
    {
      this.c = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(67057);
    if (this.k != null)
      this.k.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramLong);
    AppMethodBeat.o(67057);
  }

  public void a(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(67060);
    if (this.h != null)
      this.h.a(paramArrayOfFloat);
    AppMethodBeat.o(67060);
  }

  @TargetApi(18)
  public boolean a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(67078);
    if (Build.VERSION.SDK_INT < 18)
    {
      paramBoolean = false;
      AppMethodBeat.o(67078);
    }
    while (true)
    {
      return paramBoolean;
      if (this.h != null)
        this.h.a(paramString, paramBoolean);
      paramBoolean = true;
      AppMethodBeat.o(67078);
    }
  }

  public void b(int paramInt)
  {
    try
    {
      AppMethodBeat.i(67071);
      if (this.h != null)
        this.h.c(paramInt);
      this.p.a("beautyStyle", paramInt);
      AppMethodBeat.o(67071);
      return;
    }
    finally
    {
    }
  }

  public void b(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(67077);
      if (this.h != null)
        this.h.a(paramBoolean);
      AppMethodBeat.o(67077);
      return;
    }
    finally
    {
    }
  }

  public void c(int paramInt)
  {
    try
    {
      AppMethodBeat.i(67072);
      int i1;
      if (paramInt > 9)
      {
        TXCLog.e("TXCVideoPreprocessor", "Beauty value too large! set max value 9");
        i1 = 9;
      }
      while (true)
      {
        if (this.h != null)
          this.h.b(i1);
        this.p.a("beautyLevel", i1);
        AppMethodBeat.o(67072);
        return;
        i1 = paramInt;
        if (paramInt < 0)
        {
          TXCLog.e("TXCVideoPreprocessor", "Beauty < 0; set 0");
          i1 = 0;
        }
      }
    }
    finally
    {
    }
  }

  public void d(int paramInt)
  {
    try
    {
      AppMethodBeat.i(67073);
      int i1;
      if (paramInt > 9)
      {
        TXCLog.e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
        i1 = 9;
      }
      while (true)
      {
        if (this.h != null)
          this.h.d(i1);
        this.p.a("whiteLevel", i1);
        AppMethodBeat.o(67073);
        return;
        i1 = paramInt;
        if (paramInt < 0)
        {
          TXCLog.e("TXCVideoPreprocessor", "Brightness < 0; set 0");
          i1 = 0;
        }
      }
    }
    finally
    {
    }
  }

  public void e(int paramInt)
  {
    try
    {
      AppMethodBeat.i(67074);
      int i1;
      if (paramInt > 9)
      {
        TXCLog.e("TXCVideoPreprocessor", "Ruddy value too large! set max value 9");
        i1 = 9;
      }
      while (true)
      {
        if (this.h != null)
          this.h.f(i1);
        this.p.a("ruddyLevel", i1);
        AppMethodBeat.o(67074);
        return;
        i1 = paramInt;
        if (paramInt < 0)
        {
          TXCLog.e("TXCVideoPreprocessor", "Ruddy < 0; set 0");
          i1 = 0;
        }
      }
    }
    finally
    {
    }
  }

  public void f(int paramInt)
  {
    AppMethodBeat.i(67075);
    int i1;
    if (paramInt > 9)
    {
      TXCLog.e("TXCVideoPreprocessor", "Brightness value too large! set max value 9");
      i1 = 9;
    }
    while (true)
    {
      if (this.h != null)
        this.h.e(i1);
      AppMethodBeat.o(67075);
      return;
      i1 = paramInt;
      if (paramInt < 0)
      {
        TXCLog.e("TXCVideoPreprocessor", "Brightness < 0; set 0");
        i1 = 0;
      }
    }
  }

  public void g(int paramInt)
  {
    try
    {
      AppMethodBeat.i(67079);
      if (this.h != null)
        this.h.g(paramInt);
      this.p.a("eyeBigScale", paramInt);
      AppMethodBeat.o(67079);
      return;
    }
    finally
    {
    }
  }

  public void h(int paramInt)
  {
    try
    {
      AppMethodBeat.i(67080);
      if (this.h != null)
        this.h.h(paramInt);
      this.p.a("faceSlimLevel", paramInt);
      AppMethodBeat.o(67080);
      return;
    }
    finally
    {
    }
  }

  public void i(int paramInt)
  {
    AppMethodBeat.i(67081);
    if (this.h != null)
      this.h.i(paramInt);
    this.p.a("faceVLevel", paramInt);
    AppMethodBeat.o(67081);
  }

  public void j(int paramInt)
  {
    AppMethodBeat.i(67082);
    if (this.h != null)
      this.h.j(paramInt);
    this.p.a("faceShortLevel", paramInt);
    AppMethodBeat.o(67082);
  }

  public void k(int paramInt)
  {
    AppMethodBeat.i(67083);
    if (this.h != null)
      this.h.k(paramInt);
    this.p.a("chinLevel", paramInt);
    AppMethodBeat.o(67083);
  }

  public void l(int paramInt)
  {
    AppMethodBeat.i(67084);
    if (this.h != null)
      this.h.l(paramInt);
    this.p.a("noseSlimLevel", paramInt);
    AppMethodBeat.o(67084);
  }

  public void setID(String paramString)
  {
    AppMethodBeat.i(67087);
    super.setID(paramString);
    setStatusValue(3001, this.p.a());
    AppMethodBeat.o(67087);
  }

  static class b
  {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    boolean j;
    public int k = 5;
    public int l = 0;
    com.tencent.liteav.basic.e.a m = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.c
 * JD-Core Version:    0.6.2
 */
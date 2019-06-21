package com.tencent.map.lib.gl;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.tencent.map.lib.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.fk;
import com.tencent.tencentmap.mapsdk.maps.a.gv;
import java.util.Arrays;
import java.util.Hashtable;

public class JNICallback
{
  public JNICallback.i a;
  private gv b;
  private JNICallback.a c;
  private JNICallback.h d;
  private JNICallback.e e;
  private JNICallback.d f;
  private JNICallback.j g;
  private JNICallback.b h;
  private JNICallback.c i;
  private JNICallback.k j;
  private JNICallback.g k;
  private JNICallback.f l;
  private fk m;
  private Hashtable<Long, Paint> n;
  private Hashtable<Long, PointF> o;
  private Bitmap p;

  public JNICallback(gv paramgv, JNICallback.a parama, JNICallback.h paramh, JNICallback.e parame, JNICallback.g paramg, fk paramfk)
  {
    AppMethodBeat.i(98027);
    this.n = new Hashtable();
    this.o = new Hashtable();
    this.p = null;
    this.a = null;
    this.b = paramgv;
    this.c = parama;
    this.d = paramh;
    this.e = parame;
    this.k = paramg;
    this.m = paramfk;
    this.p = Bitmap.createBitmap(800, 400, Bitmap.Config.ALPHA_8);
    this.a = new JNICallback.i(null);
    AppMethodBeat.o(98027);
  }

  private Bitmap a(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98036);
    if (this.p == null)
      this.p = Bitmap.createBitmap(800, 400, Bitmap.Config.ALPHA_8);
    if (this.p == null)
    {
      paramString = null;
      AppMethodBeat.o(98036);
    }
    while (true)
    {
      return paramString;
      this.a.a(paramArrayOfByte);
      Paint localPaint = a(paramInt);
      this.p.eraseColor(0);
      paramArrayOfByte = new Canvas(this.p);
      float f1 = (localPaint.descent() + localPaint.ascent()) / 2.0F;
      localPaint.setFakeBoldText(this.a.e);
      paramArrayOfByte.drawText(paramString, 400.0F, 200.0F - f1, localPaint);
      paramString = this.p;
      AppMethodBeat.o(98036);
    }
  }

  private Paint a(int paramInt)
  {
    AppMethodBeat.i(98035);
    Paint localPaint1 = c();
    Paint localPaint2 = localPaint1;
    if (localPaint1 == null)
    {
      localPaint2 = new Paint();
      localPaint2.setTypeface(Typeface.DEFAULT);
      localPaint2.setAntiAlias(true);
      localPaint2.setStyle(Paint.Style.FILL);
      localPaint2.setTextAlign(Paint.Align.CENTER);
      localPaint2.setLinearText(true);
      a(localPaint2);
    }
    localPaint2.setTextAlign(Paint.Align.CENTER);
    localPaint2.setTextSize(paramInt);
    AppMethodBeat.o(98035);
    return localPaint2;
  }

  private PointF a(String paramString, int paramInt)
  {
    AppMethodBeat.i(98037);
    float f1 = a(paramInt).measureText(paramString);
    PointF localPointF = d();
    paramString = localPointF;
    if (localPointF == null)
    {
      paramString = new PointF();
      a(paramString);
    }
    paramString.x = (1.0F + f1);
    paramString.y = (paramInt + 2);
    AppMethodBeat.o(98037);
    return paramString;
  }

  private IconImageInfo a(int paramInt, byte[] paramArrayOfByte)
  {
    Object localObject = null;
    AppMethodBeat.i(98038);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      AppMethodBeat.o(98038);
      paramArrayOfByte = localObject;
    }
    while (true)
    {
      return paramArrayOfByte;
      try
      {
        String str = new java/lang/String;
        str.<init>(paramArrayOfByte);
        if (paramInt == 1)
        {
          paramArrayOfByte = this.b.a(str);
          AppMethodBeat.o(98038);
        }
        else
        {
          paramArrayOfByte = this.b.b(str);
          AppMethodBeat.o(98038);
        }
      }
      catch (Exception paramArrayOfByte)
      {
        AppMethodBeat.o(98038);
        paramArrayOfByte = localObject;
      }
    }
  }

  private void a(Paint paramPaint)
  {
    AppMethodBeat.i(98032);
    if (this.n != null)
      this.n.put(Long.valueOf(Thread.currentThread().getId()), paramPaint);
    AppMethodBeat.o(98032);
  }

  private void a(PointF paramPointF)
  {
    AppMethodBeat.i(98034);
    if (this.o != null)
      this.o.put(Long.valueOf(Thread.currentThread().getId()), paramPointF);
    AppMethodBeat.o(98034);
  }

  private void a(String paramString)
  {
    AppMethodBeat.i(98039);
    if (this.c != null)
    {
      d.a("Engine callback download:".concat(String.valueOf(paramString)));
      this.c.d(paramString);
    }
    AppMethodBeat.o(98039);
  }

  private void a(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98040);
    if (paramArrayOfByte == null)
      AppMethodBeat.o(98040);
    while (true)
    {
      return;
      new JNICallback.1(this, paramString, paramArrayOfByte).execute(new Void[0]);
      AppMethodBeat.o(98040);
    }
  }

  private Paint c()
  {
    AppMethodBeat.i(98031);
    Paint localPaint;
    if (this.n == null)
    {
      localPaint = null;
      AppMethodBeat.o(98031);
    }
    while (true)
    {
      return localPaint;
      localPaint = (Paint)this.n.get(Long.valueOf(Thread.currentThread().getId()));
      AppMethodBeat.o(98031);
    }
  }

  private PointF d()
  {
    AppMethodBeat.i(98033);
    PointF localPointF;
    if (this.o == null)
    {
      localPointF = null;
      AppMethodBeat.o(98033);
    }
    while (true)
    {
      return localPointF;
      localPointF = (PointF)this.o.get(Long.valueOf(Thread.currentThread().getId()));
      AppMethodBeat.o(98033);
    }
  }

  public Object a(int paramInt1, int paramInt2, String paramString, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(98029);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 13:
    case 14:
    case 12:
    }
    while (true)
    {
      paramString = null;
      label82: byte[] arrayOfByte;
      while (true)
      {
        AppMethodBeat.o(98029);
        while (true)
        {
          return paramString;
          paramString = a(paramInt2, paramString, paramArrayOfByte);
          break label82;
          paramString = a(paramString, paramInt2);
          break label82;
          a(paramString);
          paramString = null;
          break label82;
          paramString = a(paramInt2, paramArrayOfByte);
          break label82;
          a(paramString, paramArrayOfByte);
          paramString = null;
          break label82;
          if (this.d == null)
            break;
          this.d.h(paramInt2);
          paramString = null;
          break label82;
          if (this.m == null)
            break;
          this.m.a(paramString);
          paramString = null;
          break label82;
          if (this.e == null)
            break;
          this.e.z();
          paramString = null;
          break label82;
          if (this.f == null)
            break;
          paramString = this.f.a(paramArrayOfByte);
          AppMethodBeat.o(98029);
          continue;
          if (this.k == null)
            break;
          paramString = this.k;
          if (paramInt2 > 0)
            bool = true;
          paramString.b(bool);
          paramString = null;
          break label82;
          if (this.g == null)
            break;
          paramString = this.g.a(paramArrayOfByte);
          AppMethodBeat.o(98029);
          continue;
          if (this.h == null)
            break;
          paramString = this.h.a(paramArrayOfByte);
          AppMethodBeat.o(98029);
        }
        if (this.i == null)
          break;
        arrayOfByte = Arrays.copyOfRange(paramArrayOfByte, 0, 12);
        paramArrayOfByte = Arrays.copyOfRange(paramArrayOfByte, 12, paramArrayOfByte.length);
        this.i.a(paramString, arrayOfByte, paramArrayOfByte);
        paramString = null;
      }
      if (this.j != null)
      {
        arrayOfByte = Arrays.copyOfRange(paramArrayOfByte, 0, 12);
        paramArrayOfByte = Arrays.copyOfRange(paramArrayOfByte, 12, paramArrayOfByte.length);
        this.j.a(paramString, arrayOfByte, paramArrayOfByte);
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(98028);
    this.p = null;
    this.a = null;
    if (this.n != null)
    {
      this.n.clear();
      this.n = null;
    }
    if (this.o != null)
    {
      this.o.clear();
      this.o = null;
    }
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.j = null;
    AppMethodBeat.o(98028);
  }

  public void a(JNICallback.b paramb)
  {
    this.h = paramb;
  }

  public void a(JNICallback.c paramc)
  {
    this.i = paramc;
  }

  public void a(JNICallback.d paramd)
  {
    this.f = paramd;
  }

  public void a(JNICallback.f paramf)
  {
    this.l = paramf;
  }

  public void a(JNICallback.j paramj)
  {
    this.g = paramj;
  }

  public void a(JNICallback.k paramk)
  {
    this.j = paramk;
  }

  public int b()
  {
    AppMethodBeat.i(98030);
    int i1;
    if (this.l != null)
    {
      i1 = this.l.getEGLContextHash();
      AppMethodBeat.o(98030);
    }
    while (true)
    {
      return i1;
      i1 = 0;
      AppMethodBeat.o(98030);
    }
  }

  public static class IconImageInfo
  {
    public float anchorPointX1;
    public float anchorPointY1;
    public Bitmap bitmap;
    public float scale;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.JNICallback
 * JD-Core Version:    0.6.2
 */
package com.bumptech.glide.f;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c.d.e.c;
import com.bumptech.glide.c.d.e.f;
import com.bumptech.glide.c.h;
import com.bumptech.glide.c.m;
import com.bumptech.glide.g;
import com.bumptech.glide.g.a;
import com.bumptech.glide.h.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class e
  implements Cloneable
{
  public h aAb;
  public com.bumptech.glide.c.j aAd;
  public Class<?> aAf;
  public Map<Class<?>, m<?>> aAh;
  public g aAk;
  public com.bumptech.glide.c.b.i aAl;
  public boolean aAm;
  public boolean aAn;
  public boolean aAz;
  public boolean aBK;
  public boolean aCf;
  public int aHi;
  public float aHj;
  public Drawable aHk;
  public int aHl;
  public Drawable aHm;
  public int aHn;
  public int aHo;
  public int aHp;
  public boolean aHq;
  public Drawable aHr;
  public int aHs;
  public Resources.Theme aHt;
  public boolean aHu;
  public boolean aHv;
  public boolean azQ;

  public e()
  {
    AppMethodBeat.i(92467);
    this.aHj = 1.0F;
    this.aAl = com.bumptech.glide.c.b.i.aBm;
    this.aAk = g.awJ;
    this.azQ = true;
    this.aHo = -1;
    this.aHp = -1;
    this.aAb = a.oj();
    this.aHq = true;
    this.aAd = new com.bumptech.glide.c.j();
    this.aAh = new b();
    this.aAf = Object.class;
    this.aAn = true;
    AppMethodBeat.o(92467);
  }

  public static e a(com.bumptech.glide.c.b.i parami)
  {
    AppMethodBeat.i(92468);
    parami = new e().b(parami);
    AppMethodBeat.o(92468);
    return parami;
  }

  private <T> e a(Class<T> paramClass, m<T> paramm)
  {
    AppMethodBeat.i(92479);
    for (e locale = this; locale.aHu; locale = locale.nR());
    com.bumptech.glide.h.i.d(paramClass, "Argument must not be null");
    com.bumptech.glide.h.i.d(paramm, "Argument must not be null");
    locale.aAh.put(paramClass, paramm);
    locale.aHi |= 2048;
    locale.aHq = true;
    locale.aHi |= 65536;
    locale.aAn = false;
    locale.aHi |= 131072;
    locale.aAm = true;
    paramClass = locale.nT();
    AppMethodBeat.o(92479);
    return paramClass;
  }

  public static boolean aT(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & paramInt2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static e e(h paramh)
  {
    AppMethodBeat.i(92469);
    for (e locale = new e(); locale.aHu; locale = locale.nR());
    locale.aAb = ((h)com.bumptech.glide.h.i.d(paramh, "Argument must not be null"));
    locale.aHi |= 1024;
    paramh = locale.nT();
    AppMethodBeat.o(92469);
    return paramh;
  }

  public static e w(Class<?> paramClass)
  {
    AppMethodBeat.i(92470);
    for (e locale = new e(); locale.aHu; locale = locale.nR());
    locale.aAf = ((Class)com.bumptech.glide.h.i.d(paramClass, "Argument must not be null"));
    locale.aHi |= 4096;
    paramClass = locale.nT();
    AppMethodBeat.o(92470);
    return paramClass;
  }

  public final e M(float paramFloat)
  {
    AppMethodBeat.i(92471);
    for (Object localObject = this; ((e)localObject).aHu; localObject = ((e)localObject).nR());
    if ((paramFloat < 0.0F) || (paramFloat > 1.0F))
    {
      localObject = new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
      AppMethodBeat.o(92471);
      throw ((Throwable)localObject);
    }
    ((e)localObject).aHj = paramFloat;
    ((e)localObject).aHi |= 2;
    localObject = ((e)localObject).nT();
    AppMethodBeat.o(92471);
    return localObject;
  }

  public final e a(m<Bitmap> paramm)
  {
    AppMethodBeat.i(92478);
    for (e locale = this; locale.aHu; locale = locale.nR());
    com.bumptech.glide.c.d.a.j localj = new com.bumptech.glide.c.d.a.j(paramm);
    locale.a(Bitmap.class, paramm);
    locale.a(Drawable.class, localj);
    locale.a(BitmapDrawable.class, localj);
    locale.a(c.class, new f(paramm));
    paramm = locale.nT();
    AppMethodBeat.o(92478);
    return paramm;
  }

  public final e aU(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92476);
    for (e locale = this; locale.aHu; locale = locale.nR());
    locale.aHp = paramInt1;
    locale.aHo = paramInt2;
    locale.aHi |= 512;
    locale = locale.nT();
    AppMethodBeat.o(92476);
    return locale;
  }

  public final e b(com.bumptech.glide.c.b.i parami)
  {
    AppMethodBeat.i(92473);
    for (e locale = this; locale.aHu; locale = locale.nR());
    locale.aAl = ((com.bumptech.glide.c.b.i)com.bumptech.glide.h.i.d(parami, "Argument must not be null"));
    locale.aHi |= 4;
    parami = locale.nT();
    AppMethodBeat.o(92473);
    return parami;
  }

  public final e b(g paramg)
  {
    AppMethodBeat.i(92474);
    for (e locale = this; locale.aHu; locale = locale.nR());
    locale.aAk = ((g)com.bumptech.glide.h.i.d(paramg, "Argument must not be null"));
    locale.aHi |= 8;
    paramg = locale.nT();
    AppMethodBeat.o(92474);
    return paramg;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(92480);
    if ((paramObject instanceof e))
    {
      paramObject = (e)paramObject;
      if ((Float.compare(paramObject.aHj, this.aHj) == 0) && (this.aHl == paramObject.aHl) && (com.bumptech.glide.h.j.h(this.aHk, paramObject.aHk)) && (this.aHn == paramObject.aHn) && (com.bumptech.glide.h.j.h(this.aHm, paramObject.aHm)) && (this.aHs == paramObject.aHs) && (com.bumptech.glide.h.j.h(this.aHr, paramObject.aHr)) && (this.azQ == paramObject.azQ) && (this.aHo == paramObject.aHo) && (this.aHp == paramObject.aHp) && (this.aAm == paramObject.aAm) && (this.aHq == paramObject.aHq) && (this.aHv == paramObject.aHv) && (this.aAz == paramObject.aAz) && (this.aAl.equals(paramObject.aAl)) && (this.aAk == paramObject.aAk) && (this.aAd.equals(paramObject.aAd)) && (this.aAh.equals(paramObject.aAh)) && (this.aAf.equals(paramObject.aAf)) && (com.bumptech.glide.h.j.h(this.aAb, paramObject.aAb)) && (com.bumptech.glide.h.j.h(this.aHt, paramObject.aHt)))
      {
        bool = true;
        AppMethodBeat.o(92480);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(92480);
      continue;
      AppMethodBeat.o(92480);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(92481);
    int i = com.bumptech.glide.h.j.hashCode(this.aHj);
    i = com.bumptech.glide.h.j.hashCode(this.aHl, i);
    i = com.bumptech.glide.h.j.b(this.aHk, i);
    i = com.bumptech.glide.h.j.hashCode(this.aHn, i);
    i = com.bumptech.glide.h.j.b(this.aHm, i);
    i = com.bumptech.glide.h.j.hashCode(this.aHs, i);
    i = com.bumptech.glide.h.j.b(this.aHr, i);
    i = com.bumptech.glide.h.j.b(this.azQ, i);
    i = com.bumptech.glide.h.j.hashCode(this.aHo, i);
    i = com.bumptech.glide.h.j.hashCode(this.aHp, i);
    i = com.bumptech.glide.h.j.b(this.aAm, i);
    i = com.bumptech.glide.h.j.b(this.aHq, i);
    i = com.bumptech.glide.h.j.b(this.aHv, i);
    i = com.bumptech.glide.h.j.b(this.aAz, i);
    i = com.bumptech.glide.h.j.b(this.aAl, i);
    i = com.bumptech.glide.h.j.b(this.aAk, i);
    i = com.bumptech.glide.h.j.b(this.aAd, i);
    i = com.bumptech.glide.h.j.b(this.aAh, i);
    i = com.bumptech.glide.h.j.b(this.aAf, i);
    i = com.bumptech.glide.h.j.b(this.aAb, i);
    i = com.bumptech.glide.h.j.b(this.aHt, i);
    AppMethodBeat.o(92481);
    return i;
  }

  public final e nP()
  {
    AppMethodBeat.i(92472);
    for (e locale = this; locale.aHu; locale = locale.nR());
    locale.aBK = true;
    locale.aHi |= 1048576;
    locale = locale.nT();
    AppMethodBeat.o(92472);
    return locale;
  }

  public final e nQ()
  {
    AppMethodBeat.i(92475);
    for (e locale = this; locale.aHu; locale = locale.nR());
    locale.azQ = false;
    locale.aHi |= 256;
    locale = locale.nT();
    AppMethodBeat.o(92475);
    return locale;
  }

  public final e nR()
  {
    AppMethodBeat.i(92477);
    try
    {
      e locale = (e)super.clone();
      Object localObject = new com/bumptech/glide/c/j;
      ((com.bumptech.glide.c.j)localObject).<init>();
      locale.aAd = ((com.bumptech.glide.c.j)localObject);
      locale.aAd.a(this.aAd);
      localObject = new com/bumptech/glide/h/b;
      ((b)localObject).<init>();
      locale.aAh = ((Map)localObject);
      locale.aAh.putAll(this.aAh);
      locale.aCf = false;
      locale.aHu = false;
      AppMethodBeat.o(92477);
      return locale;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      RuntimeException localRuntimeException = new RuntimeException(localCloneNotSupportedException);
      AppMethodBeat.o(92477);
      throw localRuntimeException;
    }
  }

  public final e nS()
  {
    AppMethodBeat.i(92482);
    if ((this.aCf) && (!this.aHu))
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
      AppMethodBeat.o(92482);
      throw localIllegalStateException;
    }
    this.aHu = true;
    this.aCf = true;
    AppMethodBeat.o(92482);
    return this;
  }

  public final e nT()
  {
    AppMethodBeat.i(92483);
    if (this.aCf)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
      AppMethodBeat.o(92483);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(92483);
    return this;
  }

  public final boolean nU()
  {
    AppMethodBeat.i(92484);
    boolean bool = com.bumptech.glide.h.j.aW(this.aHp, this.aHo);
    AppMethodBeat.o(92484);
    return bool;
  }

  public final boolean nV()
  {
    AppMethodBeat.i(92485);
    boolean bool = aT(this.aHi, 8);
    AppMethodBeat.o(92485);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.f.e
 * JD-Core Version:    0.6.2
 */
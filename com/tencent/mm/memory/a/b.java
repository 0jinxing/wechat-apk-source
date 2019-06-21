package com.tencent.mm.memory.a;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.a.f.b;
import com.tencent.mm.a.f.c;
import com.tencent.mm.memory.a.a.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b<V> extends a<String, V, V, com.tencent.mm.memory.a.a.a>
{
  private static ConcurrentHashMap<Class<?>, a> fdX;
  String fdV;
  f<String, Object> fdW;
  private f.b<String, com.tencent.mm.memory.a.a.a> fdY;
  private f.c<String, com.tencent.mm.memory.a.a.a> fdZ;

  static
  {
    AppMethodBeat.i(115442);
    fdX = new ConcurrentHashMap();
    a(Bitmap.class, new b.1());
    a(WeakReference.class, new b.2());
    AppMethodBeat.o(115442);
  }

  private b(int paramInt, f.b<String, V> paramb, com.tencent.mm.memory.a.a.a.a parama, Class<?> paramClass)
  {
    super(paramInt, paramb, parama);
    AppMethodBeat.i(115425);
    this.fdV = "";
    this.fdW = null;
    this.fdY = new b.4(this);
    this.fdZ = new b.5(this);
    W(paramClass);
    AppMethodBeat.o(115425);
  }

  public b(int paramInt, f.b<String, V> paramb, Class<?> paramClass)
  {
    this(paramInt, paramb, com.tencent.mm.memory.a.a.a.a.Xw(), paramClass);
    AppMethodBeat.i(115424);
    W(paramClass);
    AppMethodBeat.o(115424);
  }

  public b(int paramInt, Class<?> paramClass)
  {
    this(paramInt, null, paramClass);
    AppMethodBeat.i(115423);
    W(paramClass);
    AppMethodBeat.o(115423);
  }

  private void W(Class<?> paramClass)
  {
    AppMethodBeat.i(115426);
    this.fdV = paramClass.getSimpleName();
    this.fdW = com.tencent.mm.memory.a.a.b.d(this.fey);
    AppMethodBeat.o(115426);
  }

  public static void a(Class<?> paramClass, a parama)
  {
    AppMethodBeat.i(115422);
    fdX.put(paramClass, parama);
    AppMethodBeat.o(115422);
  }

  private int aU(V paramV)
  {
    AppMethodBeat.i(115428);
    int i;
    if (paramV != null)
    {
      a locala = (a)fdX.get(paramV.getClass());
      if (locala != null)
      {
        i = locala.aU(paramV);
        AppMethodBeat.o(115428);
      }
    }
    while (true)
    {
      return i;
      i = this.feD.sizeOf("", paramV);
      AppMethodBeat.o(115428);
    }
  }

  private boolean aW(V paramV)
  {
    AppMethodBeat.i(115431);
    boolean bool;
    if (aU(paramV) * 2 >= com.tencent.mm.memory.a.a.b.e(this.fey))
    {
      bool = true;
      AppMethodBeat.o(115431);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115431);
    }
  }

  public final d<String, com.tencent.mm.memory.a.a.a> a(com.tencent.mm.memory.a.a.a.a parama)
  {
    AppMethodBeat.i(115429);
    parama = com.tencent.mm.memory.a.a.b.c(parama);
    AppMethodBeat.o(115429);
    return parama;
  }

  public final V aV(V paramV)
  {
    return paramV;
  }

  public final V get(String paramString)
  {
    AppMethodBeat.i(115433);
    Object localObject = this.feD.get(paramString);
    if ((localObject == null) && (this.fdW != null))
      localObject = this.fdW.get(paramString);
    while (true)
    {
      com.tencent.mm.memory.a.a.a locala = null;
      if (this.feE != null)
        locala = (com.tencent.mm.memory.a.a.a)this.feE.t(this.fdV, paramString);
      if (com.tencent.mm.memory.a.a.a.a.feq)
        ab.v("MicroMsg.BitmapResource", "bitmap get key %s value %s bbvalue %s stack [%s]", new Object[] { paramString, localObject, locala, bo.dpG().toString() });
      AppMethodBeat.o(115433);
      return localObject;
    }
  }

  public final void init()
  {
    AppMethodBeat.i(115427);
    super.init();
    AppMethodBeat.o(115427);
  }

  public final V put(String paramString, V paramV)
  {
    AppMethodBeat.i(115434);
    if ((aW(paramV)) && (this.fdW != null))
    {
      this.fdW.put(paramString, paramV);
      paramString = null;
      AppMethodBeat.o(115434);
    }
    while (true)
    {
      return paramString;
      paramString = super.put(paramString, paramV);
      AppMethodBeat.o(115434);
    }
  }

  public final V remove(String paramString)
  {
    AppMethodBeat.i(115432);
    if (this.fdW != null)
      this.fdW.remove(paramString);
    paramString = super.remove(paramString);
    AppMethodBeat.o(115432);
    return paramString;
  }

  public final Map<String, V> snapshot()
  {
    AppMethodBeat.i(115430);
    Map localMap = this.feD.snapshot();
    AppMethodBeat.o(115430);
    return localMap;
  }

  public static abstract interface a<T>
  {
    public abstract int aU(T paramT);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a.b
 * JD-Core Version:    0.6.2
 */
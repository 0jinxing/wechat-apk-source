package com.bumptech.glide;

import android.support.v4.f.k.a;
import com.bumptech.glide.c.a.e.a;
import com.bumptech.glide.c.b.s;
import com.bumptech.glide.c.c.n;
import com.bumptech.glide.c.c.o;
import com.bumptech.glide.c.c.p;
import com.bumptech.glide.c.k;
import com.bumptech.glide.c.l;
import com.bumptech.glide.e.b;
import com.bumptech.glide.e.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class h
{
  private final p awM;
  public final com.bumptech.glide.e.a awN;
  private final com.bumptech.glide.e.e awO;
  public final com.bumptech.glide.e.f awP;
  public final com.bumptech.glide.c.a.f awQ;
  private final com.bumptech.glide.c.d.f.f awR;
  final b awS;
  private final com.bumptech.glide.e.d awT;
  private final c awU;
  private final k.a<List<Throwable>> awV;

  public h()
  {
    AppMethodBeat.i(91625);
    this.awT = new com.bumptech.glide.e.d();
    this.awU = new c();
    this.awV = com.bumptech.glide.h.a.a.op();
    this.awM = new p(this.awV);
    this.awN = new com.bumptech.glide.e.a();
    this.awO = new com.bumptech.glide.e.e();
    this.awP = new com.bumptech.glide.e.f();
    this.awQ = new com.bumptech.glide.c.a.f();
    this.awR = new com.bumptech.glide.c.d.f.f();
    this.awS = new b();
    ArrayList localArrayList = new ArrayList(Arrays.asList(new String[] { "Gif", "Bitmap", "BitmapDrawable" }));
    localArrayList.add(0, "legacy_prepend_all");
    localArrayList.add("legacy_append");
    this.awO.s(localArrayList);
    AppMethodBeat.o(91625);
  }

  public final <Model> List<n<Model, ?>> P(Model paramModel)
  {
    AppMethodBeat.i(91635);
    List localList = this.awM.P(paramModel);
    if (localList.isEmpty())
    {
      paramModel = new h.c(paramModel);
      AppMethodBeat.o(91635);
      throw paramModel;
    }
    AppMethodBeat.o(91635);
    return localList;
  }

  public final <Data, TResource, Transcode> s<Data, TResource, Transcode> a(Class<Data> paramClass, Class<TResource> paramClass1, Class<Transcode> paramClass2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(91633);
    ??? = this.awU.c(paramClass, paramClass1, paramClass2);
    if (c.a((s)???))
      AppMethodBeat.o(91633);
    while (true)
    {
      return localObject1;
      localObject1 = ???;
      ArrayList localArrayList;
      Object localObject3;
      Object localObject4;
      if (??? == null)
      {
        localArrayList = new ArrayList();
        ??? = this.awO.h(paramClass, paramClass1).iterator();
        while (((Iterator)???).hasNext())
        {
          localObject3 = (Class)((Iterator)???).next();
          localObject4 = this.awR.d((Class)localObject3, paramClass2).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject1 = (Class)((Iterator)localObject4).next();
            localArrayList.add(new com.bumptech.glide.c.b.h(paramClass, (Class)localObject3, (Class)localObject1, this.awO.g(paramClass, (Class)localObject3), this.awR.c((Class)localObject3, (Class)localObject1), this.awV));
          }
        }
        if (!localArrayList.isEmpty())
          break label256;
        localObject1 = null;
        label192: localObject4 = this.awU;
      }
      synchronized (((c)localObject4).aGZ)
      {
        localObject3 = ((c)localObject4).aGZ;
        localObject4 = new com/bumptech/glide/h/h;
        ((com.bumptech.glide.h.h)localObject4).<init>(paramClass, paramClass1, paramClass2);
        if (localObject1 != null)
        {
          paramClass = (Class<Data>)localObject1;
          ((android.support.v4.f.a)localObject3).put(localObject4, paramClass);
          AppMethodBeat.o(91633);
          continue;
          label256: localObject1 = new s(paramClass, paramClass1, paramClass2, localArrayList, this.awV);
          break label192;
        }
        paramClass = c.aGY;
      }
    }
  }

  public final h a(e.a<?> parama)
  {
    AppMethodBeat.i(91630);
    this.awQ.b(parama);
    AppMethodBeat.o(91630);
    return this;
  }

  public final <Data> h a(Class<Data> paramClass, com.bumptech.glide.c.d<Data> paramd)
  {
    AppMethodBeat.i(91626);
    this.awN.b(paramClass, paramd);
    AppMethodBeat.o(91626);
    return this;
  }

  public final <TResource> h a(Class<TResource> paramClass, l<TResource> paraml)
  {
    AppMethodBeat.i(91629);
    this.awP.b(paramClass, paraml);
    AppMethodBeat.o(91629);
    return this;
  }

  public final <Model, Data> h a(Class<Model> paramClass, Class<Data> paramClass1, o<Model, Data> paramo)
  {
    AppMethodBeat.i(91632);
    this.awM.b(paramClass, paramClass1, paramo);
    AppMethodBeat.o(91632);
    return this;
  }

  public final <TResource, Transcode> h a(Class<TResource> paramClass, Class<Transcode> paramClass1, com.bumptech.glide.c.d.f.e<TResource, Transcode> parame)
  {
    AppMethodBeat.i(91631);
    this.awR.b(paramClass, paramClass1, parame);
    AppMethodBeat.o(91631);
    return this;
  }

  public final <Data, TResource> h a(Class<Data> paramClass, Class<TResource> paramClass1, k<Data, TResource> paramk)
  {
    AppMethodBeat.i(91627);
    a("legacy_append", paramClass, paramClass1, paramk);
    AppMethodBeat.o(91627);
    return this;
  }

  public final <Data, TResource> h a(String paramString, Class<Data> paramClass, Class<TResource> paramClass1, k<Data, TResource> paramk)
  {
    AppMethodBeat.i(91628);
    this.awO.a(paramString, paramk, paramClass, paramClass1);
    AppMethodBeat.o(91628);
    return this;
  }

  public final <Model, TResource, Transcode> List<Class<?>> b(Class<Model> paramClass, Class<TResource> paramClass1, Class<Transcode> arg3)
  {
    AppMethodBeat.i(91634);
    Object localObject1 = this.awT.f(paramClass, paramClass1);
    Object localObject2 = localObject1;
    Object localObject3;
    Object localObject4;
    if (localObject1 == null)
    {
      localObject2 = new ArrayList();
      localObject1 = this.awM.r(paramClass).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (Class)((Iterator)localObject1).next();
        localObject4 = this.awO.h((Class)localObject3, paramClass1).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject3 = (Class)((Iterator)localObject4).next();
          if ((!this.awR.d((Class)localObject3, ???).isEmpty()) && (!((List)localObject2).contains(localObject3)))
            ((List)localObject2).add(localObject3);
        }
      }
      localObject3 = this.awT;
      localObject1 = Collections.unmodifiableList((List)localObject2);
    }
    synchronized (((com.bumptech.glide.e.d)localObject3).aHc)
    {
      localObject3 = ((com.bumptech.glide.e.d)localObject3).aHc;
      localObject4 = new com/bumptech/glide/h/h;
      ((com.bumptech.glide.h.h)localObject4).<init>(paramClass, paramClass1);
      ((android.support.v4.f.a)localObject3).put(localObject4, localObject1);
      AppMethodBeat.o(91634);
      return localObject2;
    }
  }

  public final List<com.bumptech.glide.c.f> lF()
  {
    AppMethodBeat.i(91636);
    Object localObject = this.awS.nK();
    if (((List)localObject).isEmpty())
    {
      localObject = new h.b();
      AppMethodBeat.o(91636);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(91636);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h
 * JD-Core Version:    0.6.2
 */
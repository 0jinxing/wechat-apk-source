package com.bumptech.glide.c.b;

import com.bumptech.glide.c.b.b.a;
import com.bumptech.glide.c.c.n;
import com.bumptech.glide.c.c.n.a;
import com.bumptech.glide.c.d.b;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.m;
import com.bumptech.glide.e;
import com.bumptech.glide.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class f<Transcode>
{
  com.bumptech.glide.c.h aAb;
  j aAd;
  private final List<n.a<?>> aAe;
  Class<?> aAf;
  g.d aAg;
  Map<Class<?>, m<?>> aAh;
  private boolean aAi;
  private boolean aAj;
  g aAk;
  i aAl;
  boolean aAm;
  boolean aAn;
  Class<Transcode> awY;
  e awi;
  Object axb;
  private final List<com.bumptech.glide.c.h> azS;
  int height;
  int width;

  f()
  {
    AppMethodBeat.i(91763);
    this.aAe = new ArrayList();
    this.azS = new ArrayList();
    AppMethodBeat.o(91763);
  }

  final void clear()
  {
    AppMethodBeat.i(91764);
    this.awi = null;
    this.axb = null;
    this.aAb = null;
    this.aAf = null;
    this.awY = null;
    this.aAd = null;
    this.aAk = null;
    this.aAh = null;
    this.aAl = null;
    this.aAe.clear();
    this.aAi = false;
    this.azS.clear();
    this.aAj = false;
    AppMethodBeat.o(91764);
  }

  final boolean l(Class<?> paramClass)
  {
    AppMethodBeat.i(91766);
    boolean bool;
    if (m(paramClass) != null)
    {
      bool = true;
      AppMethodBeat.o(91766);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91766);
    }
  }

  final <Data> s<Data, ?, Transcode> m(Class<Data> paramClass)
  {
    AppMethodBeat.i(91767);
    paramClass = this.awi.awj.a(paramClass, this.aAf, this.awY);
    AppMethodBeat.o(91767);
    return paramClass;
  }

  final a mn()
  {
    AppMethodBeat.i(91765);
    a locala = this.aAg.mn();
    AppMethodBeat.o(91765);
    return locala;
  }

  final List<n.a<?>> mo()
  {
    AppMethodBeat.i(91770);
    if (!this.aAi)
    {
      this.aAi = true;
      this.aAe.clear();
      localList = this.awi.awj.P(this.axb);
      int i = localList.size();
      for (int j = 0; j < i; j++)
      {
        n.a locala = ((n)localList.get(j)).b(this.axb, this.width, this.height, this.aAd);
        if (locala != null)
          this.aAe.add(locala);
      }
    }
    List localList = this.aAe;
    AppMethodBeat.o(91770);
    return localList;
  }

  final List<com.bumptech.glide.c.h> mp()
  {
    AppMethodBeat.i(91771);
    if (!this.aAj)
    {
      this.aAj = true;
      this.azS.clear();
      List localList = mo();
      int i = localList.size();
      for (int j = 0; j < i; j++)
      {
        localObject = (n.a)localList.get(j);
        if (!this.azS.contains(((n.a)localObject).azW))
          this.azS.add(((n.a)localObject).azW);
        for (int k = 0; k < ((n.a)localObject).aEp.size(); k++)
          if (!this.azS.contains(((n.a)localObject).aEp.get(k)))
            this.azS.add(((n.a)localObject).aEp.get(k));
      }
    }
    Object localObject = this.azS;
    AppMethodBeat.o(91771);
    return localObject;
  }

  final <Z> m<Z> n(Class<Z> paramClass)
  {
    AppMethodBeat.i(91768);
    m localm = (m)this.aAh.get(paramClass);
    Object localObject = localm;
    if (localm == null)
    {
      Iterator localIterator = this.aAh.entrySet().iterator();
      do
      {
        localObject = localm;
        if (!localIterator.hasNext())
          break;
        localObject = (Map.Entry)localIterator.next();
      }
      while (!((Class)((Map.Entry)localObject).getKey()).isAssignableFrom(paramClass));
      localObject = (m)((Map.Entry)localObject).getValue();
    }
    if (localObject == null)
    {
      if ((this.aAh.isEmpty()) && (this.aAm))
      {
        paramClass = new IllegalArgumentException("Missing transformation for " + paramClass + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        AppMethodBeat.o(91768);
        throw paramClass;
      }
      localObject = b.nm();
      AppMethodBeat.o(91768);
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(91768);
    }
  }

  final List<n<File, ?>> n(File paramFile)
  {
    AppMethodBeat.i(91769);
    paramFile = this.awi.awj.P(paramFile);
    AppMethodBeat.o(91769);
    return paramFile;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.f
 * JD-Core Version:    0.6.2
 */
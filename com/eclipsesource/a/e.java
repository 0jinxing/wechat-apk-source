package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e extends h
  implements Iterable<e.b>
{
  public final List<h> aCy;
  public final List<String> aLq;
  public transient e.a aLr;

  public e()
  {
    AppMethodBeat.i(70539);
    this.aLq = new ArrayList();
    this.aCy = new ArrayList();
    this.aLr = new e.a();
    AppMethodBeat.o(70539);
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    try
    {
      AppMethodBeat.i(70554);
      paramObjectInputStream.defaultReadObject();
      paramObjectInputStream = new com/eclipsesource/a/e$a;
      paramObjectInputStream.<init>();
      this.aLr = paramObjectInputStream;
      int i = this.aLq.size();
      for (int j = 0; j < i; j++)
        this.aLr.h((String)this.aLq.get(j), j);
      AppMethodBeat.o(70554);
      return;
    }
    finally
    {
    }
    throw paramObjectInputStream;
  }

  public final e a(String paramString, h paramh)
  {
    AppMethodBeat.i(70540);
    if (paramString == null)
    {
      paramString = new NullPointerException("name is null");
      AppMethodBeat.o(70540);
      throw paramString;
    }
    if (paramh == null)
    {
      paramString = new NullPointerException("value is null");
      AppMethodBeat.o(70540);
      throw paramString;
    }
    this.aLr.h(paramString, this.aLq.size());
    this.aLq.add(paramString);
    this.aCy.add(paramh);
    AppMethodBeat.o(70540);
    return this;
  }

  final void a(i parami)
  {
    AppMethodBeat.i(70550);
    parami.pu();
    Iterator localIterator1 = this.aLq.iterator();
    Iterator localIterator2 = this.aCy.iterator();
    for (int i = 1; localIterator1.hasNext(); i = 0)
    {
      if (i == 0)
        parami.px();
      parami.ap((String)localIterator1.next());
      parami.pw();
      ((h)localIterator2.next()).a(parami);
    }
    parami.pv();
    AppMethodBeat.o(70550);
  }

  public final h ak(String paramString)
  {
    AppMethodBeat.i(70548);
    if (paramString == null)
    {
      paramString = new NullPointerException("name is null");
      AppMethodBeat.o(70548);
      throw paramString;
    }
    int i = indexOf(paramString);
    if (i != -1)
    {
      paramString = (h)this.aCy.get(i);
      AppMethodBeat.o(70548);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(70548);
    }
  }

  public final e b(String paramString, double paramDouble)
  {
    AppMethodBeat.i(70544);
    b(paramString, a.m(paramDouble));
    AppMethodBeat.o(70544);
    return this;
  }

  public final e b(String paramString, long paramLong)
  {
    AppMethodBeat.i(70542);
    b(paramString, a.t(paramLong));
    AppMethodBeat.o(70542);
    return this;
  }

  public final e b(String paramString, h paramh)
  {
    AppMethodBeat.i(70547);
    if (paramString == null)
    {
      paramString = new NullPointerException("name is null");
      AppMethodBeat.o(70547);
      throw paramString;
    }
    if (paramh == null)
    {
      paramString = new NullPointerException("value is null");
      AppMethodBeat.o(70547);
      throw paramString;
    }
    int i = indexOf(paramString);
    if (i != -1)
      this.aCy.set(i, paramh);
    while (true)
    {
      AppMethodBeat.o(70547);
      return this;
      this.aLr.h(paramString, this.aLq.size());
      this.aLq.add(paramString);
      this.aCy.add(paramh);
    }
  }

  public final e d(String paramString, float paramFloat)
  {
    AppMethodBeat.i(70543);
    b(paramString, a.T(paramFloat));
    AppMethodBeat.o(70543);
    return this;
  }

  public final e d(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(70545);
    b(paramString, a.aB(paramBoolean));
    AppMethodBeat.o(70545);
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(70552);
    if (this == paramObject)
      AppMethodBeat.o(70552);
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        AppMethodBeat.o(70552);
        bool = false;
      }
      else if (getClass() != paramObject.getClass())
      {
        AppMethodBeat.o(70552);
        bool = false;
      }
      else
      {
        paramObject = (e)paramObject;
        if ((this.aLq.equals(paramObject.aLq)) && (this.aCy.equals(paramObject.aCy)))
        {
          AppMethodBeat.o(70552);
        }
        else
        {
          AppMethodBeat.o(70552);
          bool = false;
        }
      }
    }
  }

  public final e g(String paramString, int paramInt)
  {
    AppMethodBeat.i(70541);
    b(paramString, a.dr(paramInt));
    AppMethodBeat.o(70541);
    return this;
  }

  public final e h(String paramString1, String paramString2)
  {
    AppMethodBeat.i(70546);
    b(paramString1, a.ag(paramString2));
    AppMethodBeat.o(70546);
    return this;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70551);
    int i = this.aLq.hashCode();
    int j = this.aCy.hashCode();
    AppMethodBeat.o(70551);
    return (i + 31) * 31 + j;
  }

  public final int indexOf(String paramString)
  {
    AppMethodBeat.i(70553);
    int i = this.aLr.get(paramString);
    if ((i != -1) && (paramString.equals(this.aLq.get(i))))
      AppMethodBeat.o(70553);
    while (true)
    {
      return i;
      i = this.aLq.lastIndexOf(paramString);
      AppMethodBeat.o(70553);
    }
  }

  public final boolean isObject()
  {
    return true;
  }

  public final Iterator<e.b> iterator()
  {
    AppMethodBeat.i(70549);
    e.1 local1 = new e.1(this, this.aLq.iterator(), this.aCy.iterator());
    AppMethodBeat.o(70549);
    return local1;
  }

  public final e oS()
  {
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.e
 * JD-Core Version:    0.6.2
 */
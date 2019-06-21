package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bw$a
{
  Integer a;
  String b;
  String c;
  String d;
  private String e;
  private List<bu> f;
  private List<bu> g;
  private List<bu> h;
  private List<bu> i;

  public bw$a(String paramString)
  {
    this.e = paramString;
  }

  public final List<bu> a()
  {
    AppMethodBeat.i(98588);
    ArrayList localArrayList = new ArrayList();
    List localList = this.f;
    if ((localList != null) && (localList.size() > 0))
      localArrayList.addAll(localList);
    localList = this.g;
    if ((localList != null) && (localList.size() > 0))
      localArrayList.addAll(localList);
    localList = this.h;
    if ((localList != null) && (localList.size() > 0))
      localArrayList.addAll(localList);
    localList = this.i;
    if ((localList != null) && (localList.size() > 0))
      localArrayList.addAll(localList);
    AppMethodBeat.o(98588);
    return localArrayList;
  }

  public final void a(bu parambu)
  {
    AppMethodBeat.i(98589);
    if (parambu == null)
      AppMethodBeat.o(98589);
    while (true)
    {
      return;
      if (parambu.b() == 1)
      {
        if (this.f == null)
          this.f = new ArrayList();
        this.f.add(parambu);
        AppMethodBeat.o(98589);
      }
      else if (parambu.b() == 2)
      {
        if (this.g == null)
          this.g = new ArrayList();
        this.g.add(parambu);
        AppMethodBeat.o(98589);
      }
      else if (parambu.b() == 3)
      {
        if (this.h == null)
          this.h = new ArrayList();
        this.h.add(parambu);
        AppMethodBeat.o(98589);
      }
      else if (parambu.b() == 4)
      {
        if (this.i == null)
          this.i = new ArrayList();
        this.i.add(parambu);
        AppMethodBeat.o(98589);
      }
      else
      {
        if (this.f == null)
          this.f = new ArrayList();
        this.f.add(parambu);
        AppMethodBeat.o(98589);
      }
    }
  }

  public final void b(bu parambu)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(98590);
        if (parambu == null)
        {
          AppMethodBeat.o(98590);
          return;
        }
        if (parambu.b() == 1)
        {
          if ((this.f == null) || (this.f.isEmpty()) || (!parambu.a((bu)this.f.get(0))))
            break label148;
          this.f.remove(0);
          AppMethodBeat.o(98590);
          continue;
        }
      }
      finally
      {
      }
      if ((parambu.b() == 2) && (this.g != null) && (!this.g.isEmpty()) && (parambu.a((bu)this.g.get(0))))
        this.g.remove(0);
      label148: AppMethodBeat.o(98590);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(98591);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Appid：" + this.a + " domain：" + this.b + "\r\n");
    ((StringBuilder)localObject).append("apn：" + this.e + " ckIP：" + this.c + "\r\n");
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext())
    {
      bu localbu = (bu)localIterator.next();
      ((StringBuilder)localObject).append("accessIP：" + localbu.toString() + "\r\n");
    }
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(98591);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bw.a
 * JD-Core Version:    0.6.2
 */
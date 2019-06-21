package com.tencent.mm.plugin.appbrand.appstorage;

import android.os.Environment;
import com.tencent.luggage.g.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class s
  implements p
{
  public final LinkedList<p> gYd;
  private final p gYe;

  public s(String paramString)
  {
    AppMethodBeat.i(105390);
    this.gYe = new g();
    this.gYd = new LinkedList();
    Object localObject1 = new File(Environment.getExternalStorageDirectory(), "luggage/".concat(String.valueOf(paramString)));
    paramString = this.gYd;
    Object localObject2 = ((File)localObject1).getAbsolutePath();
    localObject1 = new m(new File((String)localObject2, "objects/").getAbsolutePath(), "default_obfuscation_key", "wxfile://");
    w localw = new w(new File((String)localObject2, "files/").getAbsolutePath());
    localObject2 = new LinkedList();
    ((LinkedList)localObject2).add(localObject1);
    ((LinkedList)localObject2).add(localw);
    paramString.addAll((Collection)localObject2);
    AppMethodBeat.o(105390);
  }

  public final j X(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105396);
    paramString = ym(paramString).X(paramString, paramBoolean);
    AppMethodBeat.o(105396);
    return paramString;
  }

  public final j Y(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105397);
    paramString = ym(paramString).Y(paramString, paramBoolean);
    AppMethodBeat.o(105397);
    return paramString;
  }

  public final File Z(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105406);
    paramString = ym(paramString).Z(paramString, paramBoolean);
    AppMethodBeat.o(105406);
    return paramString;
  }

  public final j a(com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    AppMethodBeat.i(105412);
    Iterator localIterator = this.gYd.iterator();
    while (localIterator.hasNext())
    {
      j localj = ((p)localIterator.next()).a(paramj);
      if (localj != j.gXO)
      {
        AppMethodBeat.o(105412);
        paramj = localj;
      }
    }
    while (true)
    {
      return paramj;
      paramj = j.gXO;
      AppMethodBeat.o(105412);
    }
  }

  public final j a(File paramFile, String paramString, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    AppMethodBeat.i(105414);
    Iterator localIterator = this.gYd.iterator();
    while (localIterator.hasNext())
    {
      j localj = ((p)localIterator.next()).a(paramFile, paramString, paramj);
      if (localj != j.gXO)
      {
        AppMethodBeat.o(105414);
        paramFile = localj;
      }
    }
    while (true)
    {
      return paramFile;
      paramFile = j.gXO;
      AppMethodBeat.o(105414);
    }
  }

  public j a(File paramFile, String paramString, boolean paramBoolean, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    AppMethodBeat.i(105413);
    Iterator localIterator = this.gYd.iterator();
    while (localIterator.hasNext())
    {
      j localj = ((p)localIterator.next()).a(paramFile, paramString, paramBoolean, paramj);
      if (localj != j.gXO)
      {
        AppMethodBeat.o(105413);
        paramFile = localj;
      }
    }
    while (true)
    {
      return paramFile;
      paramFile = j.gXO;
      AppMethodBeat.o(105413);
    }
  }

  public final j a(String paramString, k paramk)
  {
    AppMethodBeat.i(105402);
    paramString = ym(paramString).a(paramString, paramk);
    AppMethodBeat.o(105402);
    return paramString;
  }

  public j a(String paramString, com.tencent.mm.plugin.appbrand.r.j<List<h>> paramj)
  {
    AppMethodBeat.i(105398);
    paramString = ym(paramString).a(paramString, paramj);
    AppMethodBeat.o(105398);
    return paramString;
  }

  public final j a(String paramString, File paramFile, boolean paramBoolean)
  {
    AppMethodBeat.i(105404);
    paramString = ym(paramString).a(paramString, paramFile, paramBoolean);
    AppMethodBeat.o(105404);
    return paramString;
  }

  public final j a(String paramString, InputStream paramInputStream, boolean paramBoolean)
  {
    AppMethodBeat.i(105400);
    paramString = ym(paramString).a(paramString, paramInputStream, paramBoolean);
    AppMethodBeat.o(105400);
    return paramString;
  }

  public final <T extends p> T ae(Class<T> paramClass)
  {
    AppMethodBeat.i(105392);
    Iterator localIterator = this.gYd.iterator();
    while (localIterator.hasNext())
    {
      p localp = (p)localIterator.next();
      if (paramClass.isInstance(localp))
      {
        AppMethodBeat.o(105392);
        paramClass = localp;
      }
    }
    while (true)
    {
      return paramClass;
      paramClass = null;
      AppMethodBeat.o(105392);
    }
  }

  public List<? extends p.a> awQ()
  {
    AppMethodBeat.i(105415);
    List localList = ((m)ae(m.class)).gXT.awR();
    AppMethodBeat.o(105415);
    return localList;
  }

  public final j b(String paramString, com.tencent.mm.plugin.appbrand.r.j<ByteBuffer> paramj)
  {
    AppMethodBeat.i(105399);
    paramString = ym(paramString).b(paramString, paramj);
    AppMethodBeat.o(105399);
    return paramString;
  }

  public final j b(String paramString, File paramFile)
  {
    AppMethodBeat.i(105407);
    paramString = ym(paramString).b(paramString, paramFile);
    AppMethodBeat.o(105407);
    return paramString;
  }

  public final boolean ca(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(105408);
    int i = 0;
    if (i < 3)
      if (com.tencent.luggage.g.h.t(paramString, new String[] { "file://", "http://", "https://" }[i]))
        AppMethodBeat.o(105408);
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(105408);
      bool = true;
    }
  }

  public final j g(String paramString, List<u> paramList)
  {
    AppMethodBeat.i(105403);
    paramString = ym(paramString).g(paramString, paramList);
    AppMethodBeat.o(105403);
    return paramString;
  }

  public final void initialize()
  {
    AppMethodBeat.i(105409);
    Iterator localIterator = this.gYd.iterator();
    while (localIterator.hasNext())
      ((p)localIterator.next()).initialize();
    this.gYe.initialize();
    AppMethodBeat.o(105409);
  }

  public final void release()
  {
    AppMethodBeat.i(105410);
    Iterator localIterator = this.gYd.iterator();
    while (localIterator.hasNext())
      ((p)localIterator.next()).release();
    this.gYd.clear();
    this.gYe.release();
    AppMethodBeat.o(105410);
  }

  public final InputStream xt(String paramString)
  {
    AppMethodBeat.i(105391);
    com.tencent.mm.plugin.appbrand.r.j localj = new com.tencent.mm.plugin.appbrand.r.j();
    if (b(paramString, localj) == j.gXA)
    {
      paramString = new a((ByteBuffer)localj.value);
      AppMethodBeat.o(105391);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(105391);
    }
  }

  public final j yd(String paramString)
  {
    AppMethodBeat.i(105394);
    paramString = ym(paramString).yd(paramString);
    AppMethodBeat.o(105394);
    return paramString;
  }

  public final j ye(String paramString)
  {
    AppMethodBeat.i(105395);
    paramString = ym(paramString).ye(paramString);
    AppMethodBeat.o(105395);
    return paramString;
  }

  public final j yf(String paramString)
  {
    AppMethodBeat.i(105401);
    paramString = ym(paramString).yf(paramString);
    AppMethodBeat.o(105401);
    return paramString;
  }

  public final File yg(String paramString)
  {
    AppMethodBeat.i(105405);
    paramString = Z(paramString, false);
    AppMethodBeat.o(105405);
    return paramString;
  }

  public b yh(String paramString)
  {
    AppMethodBeat.i(105411);
    paramString = ((m)ae(m.class)).yh(paramString);
    AppMethodBeat.o(105411);
    return paramString;
  }

  public final boolean yi(String paramString)
  {
    AppMethodBeat.i(105416);
    boolean bool = ((m)ae(m.class)).yi(paramString);
    AppMethodBeat.o(105416);
    return bool;
  }

  protected final p ym(String paramString)
  {
    AppMethodBeat.i(105393);
    if (bo.isNullOrNil(paramString))
    {
      paramString = this.gYe;
      AppMethodBeat.o(105393);
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = this.gYd.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          p localp = (p)localIterator.next();
          if (localp.ca(paramString))
          {
            AppMethodBeat.o(105393);
            paramString = localp;
            break;
          }
        }
      paramString = this.gYe;
      AppMethodBeat.o(105393);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.s
 * JD-Core Version:    0.6.2
 */
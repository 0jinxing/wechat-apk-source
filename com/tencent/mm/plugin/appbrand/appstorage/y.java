package com.tencent.mm.plugin.appbrand.appstorage;

import android.text.TextUtils;
import com.tencent.luggage.g.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.appcache.ao.a;
import com.tencent.mm.plugin.appbrand.appcache.w;
import com.tencent.mm.plugin.appbrand.r.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class y extends g
{
  public final ao gTI;

  public y(ao paramao)
  {
    this.gTI = paramao;
  }

  public final File Z(String paramString, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(86873);
    int i;
    if (!paramBoolean)
      if (ye(paramString) == j.gXA)
      {
        i = 1;
        if (i == 0)
          break label45;
        AppMethodBeat.o(86873);
        paramString = localObject;
      }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label45: paramString = w.a(this.gTI, paramString);
      if (!TextUtils.isEmpty(paramString))
      {
        paramString = new File(paramString);
        AppMethodBeat.o(86873);
      }
      else
      {
        AppMethodBeat.o(86873);
        paramString = localObject;
      }
    }
  }

  public final j a(String paramString, k paramk)
  {
    AppMethodBeat.i(86872);
    InputStream localInputStream = this.gTI.xy(paramString);
    if (localInputStream == null)
    {
      paramString = j.gXG;
      AppMethodBeat.o(86872);
    }
    while (true)
    {
      return paramString;
      ao localao = this.gTI;
      k localk1 = localao.gUj;
      k localk2 = localk1;
      if (localk1 == null)
      {
        localk2 = new k();
        FileStat.stat(localao.gUc.getAbsolutePath(), localk2);
        localao.gUj = localk2;
      }
      if (paramk != null)
      {
        paramk.st_mode = localk2.st_mode;
        paramk.st_size = localk2.st_size;
        paramk.st_atime = localk2.st_atime;
        paramk.st_mtime = localk2.st_mtime;
        paramk.st_ctime = localk2.st_ctime;
      }
      try
      {
        paramk.st_size = localInputStream.available();
        bo.b(localInputStream);
        paramString = j.gXA;
        AppMethodBeat.o(86872);
      }
      catch (Exception paramk)
      {
        while (true)
          ab.e("MicroMsg.WxaPkgFileSystem", "stat(), %s stream.available fail", new Object[] { paramString });
      }
    }
  }

  public final j a(String paramString, com.tencent.mm.plugin.appbrand.r.j<List<h>> paramj)
  {
    AppMethodBeat.i(86869);
    if (yd(paramString) == j.gXA)
    {
      paramString = j.gXI;
      AppMethodBeat.o(86869);
    }
    while (true)
    {
      return paramString;
      String str = l.yk(paramString);
      Object localObject = this.gTI;
      paramString = new LinkedList();
      localObject = ((ao)localObject).gUi.values().iterator();
      while (((Iterator)localObject).hasNext())
        paramString.add((ao.a)((Iterator)localObject).next());
      localObject = Pattern.quote(str);
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        paramString = (ao.a)localIterator.next();
        if (paramString.fileName.startsWith(str))
        {
          paramString = paramString.fileName.replaceFirst((String)localObject, "");
          if (paramString.split("/").length <= 1)
          {
            h localh = new h();
            localh.fileName = paramString;
            if (paramj.value == null);
            for (paramString = new LinkedList(); ; paramString = (List)paramj.value)
            {
              paramj.value = paramString;
              ((List)paramj.value).add(localh);
              break;
            }
          }
        }
      }
      if (paramj.value == null)
      {
        paramString = j.gXG;
        AppMethodBeat.o(86869);
      }
      else
      {
        paramString = j.gXA;
        AppMethodBeat.o(86869);
      }
    }
  }

  public final j b(String paramString, com.tencent.mm.plugin.appbrand.r.j<ByteBuffer> paramj)
  {
    AppMethodBeat.i(86871);
    InputStream localInputStream = this.gTI.xy(paramString);
    if (localInputStream == null)
    {
      paramString = j.gXG;
      AppMethodBeat.o(86871);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = ByteBuffer.allocateDirect(localInputStream.available());
        if ((localInputStream instanceof a))
          paramString.put(((a)localInputStream).bRy);
        while (true)
        {
          paramString.rewind();
          paramj.value = paramString;
          paramString = j.gXA;
          bo.b(localInputStream);
          AppMethodBeat.o(86871);
          break;
          paramString.put(ByteBuffer.wrap(d.k(localInputStream)));
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.WxaPkgFileSystem", paramString, "readFile", new Object[0]);
        bo.b(localInputStream);
        paramString = j.gXB;
        AppMethodBeat.o(86871);
      }
      finally
      {
        bo.b(localInputStream);
        AppMethodBeat.o(86871);
      }
    }
    throw paramString;
  }

  public final boolean ca(String paramString)
  {
    return true;
  }

  public final void initialize()
  {
    AppMethodBeat.i(86874);
    this.gTI.avW();
    AppMethodBeat.o(86874);
  }

  public final void release()
  {
    AppMethodBeat.i(86875);
    this.gTI.close();
    AppMethodBeat.o(86875);
  }

  public final j yd(String paramString)
  {
    AppMethodBeat.i(86868);
    paramString = this.gTI.xy(paramString);
    if (paramString == null)
    {
      paramString = j.gXG;
      AppMethodBeat.o(86868);
    }
    while (true)
    {
      return paramString;
      bo.b(paramString);
      paramString = j.gXA;
      AppMethodBeat.o(86868);
    }
  }

  public final j ye(String paramString)
  {
    AppMethodBeat.i(86870);
    paramString = a(paramString, new com.tencent.mm.plugin.appbrand.r.j());
    AppMethodBeat.o(86870);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.y
 * JD-Core Version:    0.6.2
 */
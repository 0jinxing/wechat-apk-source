package com.tencent.mm.plugin.appbrand.appstorage;

import android.text.TextUtils;
import com.tencent.luggage.g.c;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class m extends g
{
  public final String gXQ;
  private final String gXR;
  private final String gXS;
  public final LuggageLocalFileObjectManager gXT;
  public volatile long gXU;

  public m(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(105374);
    this.gXU = -1L;
    this.gXQ = new File(paramString1).getAbsolutePath();
    this.gXR = paramString2;
    this.gXS = paramString3;
    this.gXT = new LuggageLocalFileObjectManager(this.gXQ, this.gXR, this.gXS);
    AppMethodBeat.o(105374);
  }

  public final File Z(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105380);
    paramString = yg(paramString);
    AppMethodBeat.o(105380);
    return paramString;
  }

  public final j a(com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    paramj.value = this.gXQ;
    return j.gXA;
  }

  public final j a(File paramFile, String paramString, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    long l1 = 0L;
    AppMethodBeat.i(105386);
    if ((paramFile == null) || (!paramFile.exists()))
    {
      paramFile = j.gXB;
      AppMethodBeat.o(105386);
    }
    while (true)
    {
      return paramFile;
      if ((!TextUtils.isEmpty(paramString)) || (paramj == null))
      {
        paramFile = j.gXO;
        AppMethodBeat.o(105386);
      }
      else if (this.gXU > 0L)
      {
        paramString = this.gXT.awS();
        long l2 = l1;
        if (paramString != null)
        {
          if (paramString.length <= 0)
            l2 = l1;
        }
        else
        {
          if (l2 + paramFile.length() <= this.gXU)
            break label150;
          paramFile = j.gXN;
          AppMethodBeat.o(105386);
          continue;
        }
        int i = paramString.length;
        for (int j = 0; ; j++)
        {
          l2 = l1;
          if (j >= i)
            break;
          l1 += paramString[j].length();
        }
      }
      else
      {
        label150: paramString = this.gXT.yn(paramFile.getName());
        if (paramString != null)
        {
          if (paramString.gXl)
          {
            paramj.value = paramString.czD;
            paramFile = j.gXA;
            AppMethodBeat.o(105386);
          }
          else
          {
            paramj.value = this.gXT.a(paramString).czD;
            paramFile = j.gXA;
            AppMethodBeat.o(105386);
          }
        }
        else
        {
          paramFile = this.gXT.k(paramFile.getAbsolutePath(), null, false);
          paramj.value = this.gXT.a(paramFile).czD;
          paramFile = j.gXA;
          AppMethodBeat.o(105386);
        }
      }
    }
  }

  public final j a(File paramFile, String paramString, boolean paramBoolean, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    AppMethodBeat.i(105385);
    paramFile = this.gXT.k(paramFile.getAbsolutePath(), paramString, paramBoolean);
    if (paramFile == null)
    {
      paramFile = j.gXB;
      AppMethodBeat.o(105385);
    }
    while (true)
    {
      return paramFile;
      paramj.value = paramFile.czD;
      paramFile = j.gXA;
      AppMethodBeat.o(105385);
    }
  }

  public final j a(String paramString, k paramk)
  {
    AppMethodBeat.i(105378);
    paramString = this.gXT.yo(paramString);
    if ((paramString == null) || (!com.tencent.mm.a.e.ct(paramString.fnQ)))
    {
      paramString = j.gXG;
      AppMethodBeat.o(105378);
    }
    while (true)
    {
      return paramString;
      if (paramk == null)
      {
        paramString = j.gXB;
        AppMethodBeat.o(105378);
      }
      else if (FileStat.stat(paramString.fnQ, paramk) == 0)
      {
        paramString = j.gXA;
        AppMethodBeat.o(105378);
      }
      else
      {
        paramString = j.gXB;
        AppMethodBeat.o(105378);
      }
    }
  }

  public final j a(String paramString, com.tencent.mm.plugin.appbrand.r.j<List<h>> paramj)
  {
    AppMethodBeat.i(105379);
    Object localObject = new LinkedList();
    c.c((List)localObject, this.gXT.awR());
    c.c((List)localObject, this.gXT.awT());
    paramString = new LinkedList();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      v localv = (v)localIterator.next();
      localObject = new h();
      ((h)localObject).fileName = localv.czD;
      paramString.add(localObject);
    }
    paramj.value = paramString;
    paramString = j.gXA;
    AppMethodBeat.o(105379);
    return paramString;
  }

  public final List<v> awQ()
  {
    AppMethodBeat.i(105387);
    List localList = this.gXT.awR();
    AppMethodBeat.o(105387);
    return localList;
  }

  public final j b(String paramString, com.tencent.mm.plugin.appbrand.r.j<ByteBuffer> paramj)
  {
    AppMethodBeat.i(105377);
    paramString = this.gXT.yo(paramString);
    if ((paramString == null) || (!com.tencent.mm.a.e.ct(paramString.fnQ)))
    {
      paramString = j.gXG;
      AppMethodBeat.o(105377);
    }
    while (true)
    {
      return paramString;
      paramj.value = l.D(new File(paramString.fnQ));
      paramString = j.gXA;
      AppMethodBeat.o(105377);
    }
  }

  public final boolean ca(String paramString)
  {
    AppMethodBeat.i(105375);
    boolean bool = bo.nullAsNil(paramString).startsWith(this.gXS);
    AppMethodBeat.o(105375);
    return bool;
  }

  public final void initialize()
  {
    AppMethodBeat.i(105383);
    if (!com.tencent.mm.vfs.e.tf(this.gXQ))
      d.e("MicroMsg.Luggage.FlattenFileSystem", "Initialization Failed");
    AppMethodBeat.o(105383);
  }

  public final j yd(String paramString)
  {
    AppMethodBeat.i(105376);
    paramString = this.gXT.yo(paramString);
    if ((paramString == null) || (!com.tencent.mm.a.e.ct(paramString.fnQ)))
    {
      paramString = j.gXG;
      AppMethodBeat.o(105376);
    }
    while (true)
    {
      return paramString;
      paramString = j.gXA;
      AppMethodBeat.o(105376);
    }
  }

  public final j yf(String paramString)
  {
    AppMethodBeat.i(105389);
    v localv = this.gXT.yo(paramString);
    if (localv != null)
    {
      com.tencent.mm.vfs.e.deleteFile(localv.fnQ);
      if (com.tencent.mm.vfs.e.ct(localv.fnQ))
      {
        d.e("MicroMsg.Luggage.FlattenFileSystem", "delete file failed, id %s, path %s", new Object[] { paramString, localv.fnQ });
        paramString = j.gXB;
        AppMethodBeat.o(105389);
      }
    }
    while (true)
    {
      return paramString;
      paramString = j.gXA;
      AppMethodBeat.o(105389);
    }
  }

  public final File yg(String paramString)
  {
    AppMethodBeat.i(105381);
    paramString = this.gXT.yo(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(105381);
    }
    while (true)
    {
      return paramString;
      paramString = new File(paramString.fnQ);
      AppMethodBeat.o(105381);
    }
  }

  public final b yh(String paramString)
  {
    AppMethodBeat.i(105384);
    com.tencent.mm.vfs.e.tf(this.gXQ);
    paramString = new b(this.gXQ + "/" + paramString);
    AppMethodBeat.o(105384);
    return paramString;
  }

  public final boolean yi(String paramString)
  {
    AppMethodBeat.i(105388);
    paramString = this.gXT.yo(paramString);
    boolean bool;
    if ((paramString != null) && (paramString.gXl))
    {
      bool = true;
      AppMethodBeat.o(105388);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105388);
    }
  }

  public final String yl(String paramString)
  {
    AppMethodBeat.i(105382);
    paramString = this.gXT.yo(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(105382);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.fnQ;
      AppMethodBeat.o(105382);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.m
 * JD-Core Version:    0.6.2
 */
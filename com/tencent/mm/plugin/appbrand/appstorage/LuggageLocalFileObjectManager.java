package com.tencent.mm.plugin.appbrand.appstorage;

import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.m;
import com.tencent.mm.vending.j.a;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class LuggageLocalFileObjectManager
{
  private static final v gYh;
  private final String gXQ;
  private final String gXR;
  private final String gXS;
  private final Collection<LuggageLocalFileObjectManager.a> gYg;

  static
  {
    AppMethodBeat.i(105438);
    gYh = new LuggageLocalFileObjectManager.3();
    AppMethodBeat.o(105438);
  }

  LuggageLocalFileObjectManager(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(105423);
    this.gXQ = (new File(paramString1).getAbsolutePath() + "/");
    this.gXR = paramString2;
    this.gXS = paramString3;
    paramString1 = new LinkedList();
    paramString1.add(new LuggageLocalFileObjectManager.b(this, (byte)0));
    this.gYg = Collections.unmodifiableCollection(paramString1);
    AppMethodBeat.o(105423);
  }

  private <T extends v> T a(String paramString1, Class<T> paramClass, String paramString2, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(105428);
    if (!e.ct(paramString1))
    {
      AppMethodBeat.o(105428);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      String str = org.apache.commons.a.b.awJ(paramString1);
      if (bo.isNullOrNil(str))
      {
        str = paramString2;
        label42: Iterator localIterator = this.gYg.iterator();
        paramString2 = null;
        while (localIterator.hasNext())
        {
          a locala = ((LuggageLocalFileObjectManager.a)localIterator.next()).bC(paramString1, str);
          paramString2 = locala;
          if (locala != null)
            paramString2 = locala;
        }
        if ((paramString2 != null) && (paramString2.size() >= 2))
          break label157;
        if (paramString2 != null)
          break label148;
      }
      label148: for (int i = -1; ; i = paramString2.size())
      {
        ab.e("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "attachCast, no handler return correct info, attach.size = %d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(105428);
        paramString1 = localObject;
        break;
        break label42;
      }
      try
      {
        label157: paramClass = (v)paramClass.newInstance();
        paramClass.czD = ((String)paramString2.get(0));
        paramClass.mimeType = com.tencent.mm.sdk.f.b.anI(str);
        paramClass.fnQ = ((String)paramString2.get(1));
        if (bo.isNullOrNil(paramClass.fnQ))
        {
          ab.e("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "attachCast appId %s, Null Or Nil fileFullPath");
          AppMethodBeat.o(105428);
          paramString1 = localObject;
        }
        else
        {
          paramClass.eov = bo.bc((String)paramString2.get(3), bo.bc(str, "unknown"));
          paramString2 = paramClass.fnQ;
          if ((paramBoolean) && (i.bx(paramString1, paramString2)))
            i = 1;
          while (true)
          {
            if (i == 0)
              break label354;
            paramString1 = new java/io/File;
            paramString1.<init>(paramClass.fnQ);
            paramClass.gjQ = paramString1.length();
            paramClass.gXm = paramString1.lastModified();
            AppMethodBeat.o(105428);
            paramString1 = paramClass;
            break;
            if (!paramBoolean)
            {
              paramBoolean = m.copyFile(paramString1, paramString2);
              if (paramBoolean)
                i = 1;
            }
            else
            {
              i = 0;
            }
          }
        }
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.LuggageLocalFileObjectManager", paramString1, "", new Object[0]);
        label354: AppMethodBeat.o(105428);
        paramString1 = localObject;
      }
    }
  }

  private String awU()
  {
    AppMethodBeat.i(105430);
    j.aih(this.gXQ);
    try
    {
      Object localObject = new java/io/File;
      ((File)localObject).<init>(this.gXQ, ".nomedia");
      ((File)localObject).createNewFile();
      label32: localObject = this.gXQ;
      AppMethodBeat.o(105430);
      return localObject;
    }
    catch (Exception localException)
    {
      break label32;
    }
  }

  public final v a(v paramv)
  {
    AppMethodBeat.i(105431);
    Object localObject = null;
    Iterator localIterator = this.gYg.iterator();
    while (localIterator.hasNext())
    {
      v localv = ((LuggageLocalFileObjectManager.a)localIterator.next()).a(paramv);
      localObject = localv;
      if (localv != null)
        localObject = localv;
    }
    AppMethodBeat.o(105431);
    return localObject;
  }

  public final List<v> awR()
  {
    AppMethodBeat.i(105425);
    File[] arrayOfFile = awS();
    Object localObject;
    if ((arrayOfFile == null) || (arrayOfFile.length <= 0))
    {
      localObject = null;
      AppMethodBeat.o(105425);
    }
    while (true)
    {
      return localObject;
      localObject = new LinkedList();
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
      {
        v localv = yn(arrayOfFile[j].getName());
        if (localv != null)
          ((List)localObject).add(localv);
      }
      AppMethodBeat.o(105425);
    }
  }

  final File[] awS()
  {
    AppMethodBeat.i(105426);
    Object localObject = new File(awU());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      localObject = null;
      AppMethodBeat.o(105426);
    }
    while (true)
    {
      return localObject;
      localObject = ((File)localObject).listFiles(new LuggageLocalFileObjectManager.1(this));
      AppMethodBeat.o(105426);
    }
  }

  public final List<v> awT()
  {
    LinkedList localLinkedList = null;
    AppMethodBeat.i(105427);
    Object localObject = new File(awU());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      localObject = null;
      if ((localObject != null) && (localObject.length > 0))
        break label71;
      AppMethodBeat.o(105427);
    }
    for (localObject = localLinkedList; ; localObject = localLinkedList)
    {
      return localObject;
      localObject = ((File)localObject).listFiles(new LuggageLocalFileObjectManager.2(this));
      break;
      label71: localLinkedList = new LinkedList();
      int i = localObject.length;
      for (int j = 0; j < i; j++)
      {
        v localv = yn(localObject[j].getName());
        if (localv != null)
          localLinkedList.add(localv);
      }
      AppMethodBeat.o(105427);
    }
  }

  @Keep
  public final String genMediaFilePath(String paramString)
  {
    AppMethodBeat.i(105424);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(105424);
    }
    while (true)
    {
      return paramString;
      paramString = awU() + paramString;
      AppMethodBeat.o(105424);
    }
  }

  public final v k(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(105429);
    paramString1 = a(paramString1, v.class, paramString2, paramBoolean);
    AppMethodBeat.o(105429);
    return paramString1;
  }

  final v yn(String paramString)
  {
    Object localObject = null;
    v localv = null;
    AppMethodBeat.i(105432);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(105432);
      localObject = localv;
    }
    while (true)
    {
      return localObject;
      Iterator localIterator = this.gYg.iterator();
      while (localIterator.hasNext())
      {
        localv = ((LuggageLocalFileObjectManager.a)localIterator.next()).yr(paramString);
        localObject = localv;
        if (localv != null)
          localObject = localv;
      }
      AppMethodBeat.o(105432);
    }
  }

  @Deprecated
  public final v yo(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(105433);
    if ((bo.isNullOrNil(paramString)) || (!paramString.startsWith(this.gXS)))
    {
      ab.e("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, invalid args, localId(%s)", new Object[] { paramString });
      AppMethodBeat.o(105433);
      paramString = localObject;
      return paramString;
    }
    String str = paramString.substring(this.gXS.length());
    Iterator localIterator = this.gYg.iterator();
    paramString = null;
    label77: if (localIterator.hasNext())
    {
      LuggageLocalFileObjectManager.a locala = (LuggageLocalFileObjectManager.a)localIterator.next();
      paramString = locala.yq(str);
      if (paramString != null)
        ab.i("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, handled by %s, result = %s", new Object[] { locala.toString(), paramString });
    }
    while (true)
    {
      if (gYh == paramString)
      {
        AppMethodBeat.o(105433);
        paramString = localObject;
        break;
        break label77;
      }
      AppMethodBeat.o(105433);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager
 * JD-Core Version:    0.6.2
 */
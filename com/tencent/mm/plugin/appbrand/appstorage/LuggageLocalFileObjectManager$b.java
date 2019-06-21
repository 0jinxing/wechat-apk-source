package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.j.a;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

final class LuggageLocalFileObjectManager$b
  implements LuggageLocalFileObjectManager.a
{
  private LuggageLocalFileObjectManager$b(LuggageLocalFileObjectManager paramLuggageLocalFileObjectManager)
  {
  }

  public final v a(v paramv)
  {
    v localv = null;
    AppMethodBeat.i(105420);
    if (paramv == null)
    {
      AppMethodBeat.o(105420);
      paramv = localv;
    }
    while (true)
    {
      return paramv;
      String str = paramv.fnQ.replaceFirst("tmp_", "store_");
      if (i.bx(paramv.fnQ, str))
      {
        localv = new v();
        localv.fnQ = str;
        localv.czD = paramv.czD.replaceFirst("tmp_", "store_");
        localv.gjQ = paramv.gjQ;
        localv.eov = paramv.eov;
        localv.gXm = new File(localv.fnQ).lastModified();
        localv.mimeType = paramv.mimeType;
        localv.gXl = true;
        AppMethodBeat.o(105420);
        paramv = localv;
      }
      else
      {
        AppMethodBeat.o(105420);
        paramv = localv;
      }
    }
  }

  public final a bC(String paramString1, String paramString2)
  {
    String str = null;
    AppMethodBeat.i(105421);
    paramString2 = bo.bc(paramString2, "unknown");
    StringBuilder localStringBuilder;
    try
    {
      long l = LuggageLocalFileObjectManager.yp(paramString1);
      paramString1 = String.format(Locale.US, "%d|%s", new Object[] { Long.valueOf(l), paramString2 });
    }
    catch (Exception paramString1)
    {
      try
      {
        paramString1 = LuggageLocalFileObjectManager.bB(paramString1, LuggageLocalFileObjectManager.a(this.gYi));
        if (bo.isNullOrNil(paramString1))
        {
          AppMethodBeat.o(105421);
          for (paramString1 = str; ; paramString1 = str)
          {
            return paramString1;
            paramString1 = paramString1;
            ab.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, get crc exp = %s", new Object[] { bo.l(paramString1) });
            AppMethodBeat.o(105421);
          }
        }
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", paramString1, "attachMediaObject, enc exp = ", new Object[0]);
          paramString1 = null;
        }
        paramString1 = "tmp_".concat(String.valueOf(paramString1));
        str = LuggageLocalFileObjectManager.b(this.gYi) + paramString1;
        localStringBuilder = new StringBuilder().append(LuggageLocalFileObjectManager.c(this.gYi)).append(paramString1);
        if (!bo.isNullOrNil(paramString2));
      }
    }
    for (paramString1 = ""; ; paramString1 = ".".concat(String.valueOf(paramString2)))
    {
      paramString1 = paramString1;
      ab.d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, return localId = %s, filePath = %s", new Object[] { paramString1, str });
      paramString1 = a.i(paramString1, str, paramString2);
      AppMethodBeat.o(105421);
      break;
    }
  }

  public final String toString()
  {
    return "V2MediaObjectInfoHandler";
  }

  public final v yq(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(105419);
    if ((!paramString.startsWith("store_")) && (!paramString.startsWith("tmp_")))
    {
      AppMethodBeat.o(105419);
      paramString = (String)localObject2;
    }
    while (true)
    {
      return paramString;
      String str1 = org.apache.commons.a.b.awJ(paramString);
      String str2 = paramString.replaceFirst("store_", "").replaceFirst("tmp_", "");
      localObject2 = str2;
      if (!bo.isNullOrNil(str1))
        localObject2 = str2.replaceFirst(".".concat(String.valueOf(str1)), "");
      if (bo.isNullOrNil((String)localObject2))
      {
        paramString = LuggageLocalFileObjectManager.awV();
        AppMethodBeat.o(105419);
      }
      else
      {
        Object localObject3;
        String str3;
        try
        {
          str2 = LuggageLocalFileObjectManager.bA((String)localObject2, LuggageLocalFileObjectManager.a(this.gYi));
          localObject1 = str2;
          if (bo.isNullOrNil((String)localObject1))
          {
            ab.d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, get empty decrypted string");
            paramString = LuggageLocalFileObjectManager.awV();
            AppMethodBeat.o(105419);
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", localException, "retrieveMediaObject, decrypt exp ", new Object[0]);
          localObject3 = ((String)localObject1).split("\\|");
          if ((localObject3 == null) || (localObject3.length != 2))
          {
            paramString = LuggageLocalFileObjectManager.awV();
            AppMethodBeat.o(105419);
            continue;
          }
          if (paramString.startsWith("store_"));
          long l1;
          for (localObject1 = "store_"; ; localObject1 = "tmp_")
          {
            str3 = LuggageLocalFileObjectManager.b(this.gYi) + (String)localObject1 + (String)localObject2;
            l1 = bo.getLong(localObject3[0], 0L);
            localObject3 = localObject3[1];
            if (((String)localObject3).equalsIgnoreCase(str1))
              break label285;
            paramString = LuggageLocalFileObjectManager.awV();
            AppMethodBeat.o(105419);
            break;
          }
          try
          {
            label285: long l2 = LuggageLocalFileObjectManager.yp(str3);
            if (l1 == l2)
              break label374;
            ab.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, exactCRC32(%d) != fileCRC32(%d), localId(%s)", new Object[] { Long.valueOf(l2), Long.valueOf(l1), paramString });
            paramString = LuggageLocalFileObjectManager.awV();
            AppMethodBeat.o(105419);
          }
          catch (IOException paramString)
          {
            ab.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, getCRC exp = %s", new Object[] { bo.l(paramString) });
            paramString = LuggageLocalFileObjectManager.awV();
            AppMethodBeat.o(105419);
          }
        }
        continue;
        label374: localObject2 = new v();
        ((v)localObject2).czD = (LuggageLocalFileObjectManager.c(this.gYi) + paramString);
        ((v)localObject2).fnQ = str3;
        ((v)localObject2).mimeType = com.tencent.mm.sdk.f.b.anI((String)localObject3);
        ((v)localObject2).gXl = ((String)localObject1).equalsIgnoreCase("store_");
        paramString = new File(((v)localObject2).fnQ);
        ((v)localObject2).gXm = paramString.lastModified();
        ((v)localObject2).gjQ = paramString.length();
        AppMethodBeat.o(105419);
        paramString = (String)localObject2;
      }
    }
  }

  public final v yr(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(105422);
    String str1 = paramString.replaceFirst("store_", "").replaceFirst("tmp_", "");
    try
    {
      String str2 = LuggageLocalFileObjectManager.bA(str1, LuggageLocalFileObjectManager.a(this.gYi));
      if (bo.isNullOrNil(str2))
      {
        AppMethodBeat.o(105422);
        paramString = (String)localObject1;
        return paramString;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", localException, "retrieveMediaObjectByRealFileName, dec exp = ", new Object[0]);
        localObject2 = null;
        continue;
        localObject2 = ((String)localObject2).split("\\|");
        if ((localObject2 != null) && (localObject2.length == 2))
          break;
        AppMethodBeat.o(105422);
        paramString = (String)localObject1;
      }
      localObject2 = localObject2[1];
      localObject1 = new StringBuilder().append(LuggageLocalFileObjectManager.c(this.gYi)).append(paramString);
      if (!bo.isNullOrNil((String)localObject2));
    }
    for (Object localObject2 = ""; ; localObject2 = ".".concat(String.valueOf(localObject2)))
    {
      localObject1 = (String)localObject2;
      localObject2 = new v();
      ((v)localObject2).czD = ((String)localObject1);
      ((v)localObject2).fnQ = (LuggageLocalFileObjectManager.b(this.gYi) + paramString);
      ((v)localObject2).eov = str1;
      ((v)localObject2).gXl = paramString.startsWith("store_");
      paramString = new File(((v)localObject2).fnQ);
      ((v)localObject2).gXm = paramString.lastModified();
      ((v)localObject2).gjQ = paramString.length();
      AppMethodBeat.o(105422);
      paramString = (String)localObject2;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.b
 * JD-Core Version:    0.6.2
 */
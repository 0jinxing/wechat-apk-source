package com.tencent.mm.plugin.appbrand.appstorage;

import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.m;
import com.tencent.mm.vending.j.a;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

@Deprecated
public final class AppBrandLocalMediaObjectManager
{
  public static final String gXn;
  private static final Collection<a> gXo;
  private static final AppBrandLocalMediaObject gXp;

  static
  {
    AppMethodBeat.i(105359);
    String str = com.tencent.mm.compatible.util.e.eSn;
    Object localObject = str;
    if (!str.endsWith("/"))
      localObject = str + "/";
    gXn = (String)localObject + "wxafiles/";
    localObject = new LinkedList();
    ((Collection)localObject).add(new b((byte)0));
    gXo = Collections.unmodifiableCollection((Collection)localObject);
    gXp = new AppBrandLocalMediaObjectManager.3();
    AppMethodBeat.o(105359);
  }

  private static <T extends AppBrandLocalMediaObject> T a(String paramString1, String paramString2, Class<T> paramClass, String paramString3, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(105350);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(105350);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      if (!com.tencent.mm.a.e.ct(paramString2))
      {
        AppMethodBeat.o(105350);
        paramString1 = localObject;
      }
      else
      {
        String str = org.apache.commons.a.b.awJ(paramString2);
        if (bo.isNullOrNil(str))
        {
          str = paramString3;
          label60: Iterator localIterator = gXo.iterator();
          paramString3 = null;
          while (localIterator.hasNext())
          {
            a locala = ((a)localIterator.next()).B(paramString1, paramString2, str);
            paramString3 = locala;
            if (locala != null)
              paramString3 = locala;
          }
          if ((paramString3 != null) && (paramString3.size() >= 2))
            break label175;
          if (paramString3 != null)
            break label166;
        }
        label166: for (int i = -1; ; i = paramString3.size())
        {
          ab.e("MicroMsg.AppBrand.LocalMediaObjectManager", "attachCast, no handler return correct info, attach.size = %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(105350);
          paramString1 = localObject;
          break;
          break label60;
        }
        try
        {
          label175: paramString1 = (AppBrandLocalMediaObject)paramClass.newInstance();
          paramString1.czD = ((String)paramString3.get(0));
          paramString1.mimeType = com.tencent.mm.sdk.f.b.anI(str);
          paramString1.fnQ = ((String)paramString3.get(1));
          if (bo.isNullOrNil(paramString1.fnQ))
          {
            ab.e("MicroMsg.AppBrand.LocalMediaObjectManager", "attachCast appId %s, Null Or Nil fileFullPath");
            AppMethodBeat.o(105350);
            paramString1 = localObject;
          }
          else
          {
            paramString1.eov = bo.bc((String)paramString3.get(3), bo.bc(str, "unknown"));
            paramClass = paramString1.fnQ;
            if ((paramBoolean) && (i.bx(paramString2, paramClass)))
              i = 1;
            while (true)
            {
              if (i == 0)
                break label370;
              paramString2 = new java/io/File;
              paramString2.<init>(paramString1.fnQ);
              paramString1.gjQ = paramString2.length();
              paramString1.gXm = paramString2.lastModified();
              AppMethodBeat.o(105350);
              break;
              if (!paramBoolean)
              {
                paramBoolean = m.copyFile(paramString2, paramClass);
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
          ab.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager", paramString1, "", new Object[0]);
          label370: AppMethodBeat.o(105350);
          paramString1 = localObject;
        }
      }
    }
  }

  public static AppBrandLocalVideoObject bs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(105349);
    paramString1 = (AppBrandLocalVideoObject)a(paramString1, paramString2, AppBrandLocalVideoObject.class, "mp4", false);
    AppMethodBeat.o(105349);
    return paramString1;
  }

  @Deprecated
  public static AppBrandLocalMediaObject bt(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(105354);
    if ((bo.isNullOrNil(paramString2)) || (!paramString2.startsWith("wxfile://")) || (bo.isNullOrNil(paramString1)))
    {
      ab.e("MicroMsg.AppBrand.LocalMediaObjectManager", "getItemByLocalId, invalid args, localId(%s), appId(%s) ", new Object[] { paramString2, paramString1 });
      AppMethodBeat.o(105354);
      paramString1 = localObject;
      return paramString1;
    }
    String str = paramString2.substring(9);
    Iterator localIterator = gXo.iterator();
    paramString2 = null;
    label77: if (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      paramString2 = locala.bw(paramString1, str);
      if (paramString2 != null)
        ab.i("MicroMsg.AppBrand.LocalMediaObjectManager", "getItemByLocalId, handled by %s, result = %s", new Object[] { locala.toString(), paramString2 });
    }
    for (paramString1 = paramString2; ; paramString1 = paramString2)
    {
      if (gXp == paramString1)
      {
        AppMethodBeat.o(105354);
        paramString1 = localObject;
        break;
        break label77;
      }
      AppMethodBeat.o(105354);
      break;
    }
  }

  public static AppBrandLocalMediaObject c(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(105352);
    paramString1 = a(paramString1, paramString2, AppBrandLocalMediaObject.class, paramString3, paramBoolean);
    AppMethodBeat.o(105352);
    return paramString1;
  }

  @Keep
  public static String genMediaFilePath(String paramString1, String paramString2)
  {
    AppMethodBeat.i(105346);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = null;
      AppMethodBeat.o(105346);
    }
    while (true)
    {
      return paramString1;
      paramString1 = xY(paramString1) + paramString2;
      AppMethodBeat.o(105346);
    }
  }

  public static AppBrandLocalMediaObject j(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(105351);
    paramString1 = c(paramString1, paramString2, null, paramBoolean);
    AppMethodBeat.o(105351);
    return paramString1;
  }

  public static long xW(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(105347);
    paramString = new File(xY(paramString));
    if ((!paramString.exists()) || (!paramString.isDirectory()))
    {
      paramString = null;
      if ((paramString != null) && (paramString.length > 0))
        break label68;
      AppMethodBeat.o(105347);
    }
    while (true)
    {
      return l;
      paramString = paramString.listFiles(new AppBrandLocalMediaObjectManager.2());
      break;
      label68: int i = paramString.length;
      for (int j = 0; j < i; j++)
        l += paramString[j].length();
      AppMethodBeat.o(105347);
    }
  }

  public static long xX(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(105348);
    paramString = new File(xY(paramString));
    if ((!paramString.exists()) || (!paramString.isDirectory()))
    {
      paramString = null;
      if ((paramString != null) && (paramString.length > 0))
        break label68;
      AppMethodBeat.o(105348);
    }
    while (true)
    {
      return l;
      paramString = paramString.listFiles(new AppBrandLocalMediaObjectManager.1());
      break;
      label68: int i = paramString.length;
      for (int j = 0; j < i; j++)
        l += paramString[j].length();
      AppMethodBeat.o(105348);
    }
  }

  private static String xY(String paramString)
  {
    AppMethodBeat.i(105353);
    paramString = gXn + paramString + "/";
    j.aih(paramString);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString, ".nomedia");
      localFile.createNewFile();
      label54: AppMethodBeat.o(105353);
      return paramString;
    }
    catch (Exception localException)
    {
      break label54;
    }
  }

  static abstract interface a
  {
    public abstract a B(String paramString1, String paramString2, String paramString3);

    public abstract AppBrandLocalMediaObject bw(String paramString1, String paramString2);
  }

  static final class b
    implements AppBrandLocalMediaObjectManager.a
  {
    public final a B(String paramString1, String paramString2, String paramString3)
    {
      Object localObject = null;
      AppMethodBeat.i(105345);
      paramString3 = bo.bc(paramString3, "unknown");
      try
      {
        long l = AppBrandLocalMediaObjectManager.ya(paramString2);
        paramString2 = String.format(Locale.US, "%d|%s", new Object[] { Long.valueOf(l), paramString3 });
      }
      catch (Exception paramString1)
      {
        try
        {
          paramString2 = AppBrandLocalMediaObjectManager.bv(paramString2, paramString1);
          if (bo.isNullOrNil(paramString2))
          {
            AppMethodBeat.o(105345);
            for (paramString1 = (String)localObject; ; paramString1 = (String)localObject)
            {
              return paramString1;
              paramString1 = paramString1;
              ab.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, get crc exp = %s", new Object[] { bo.l(paramString1) });
              AppMethodBeat.o(105345);
            }
          }
        }
        catch (Exception paramString2)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", paramString2, "attachMediaObject, enc exp = ", new Object[0]);
            paramString2 = null;
          }
          localObject = "tmp_".concat(String.valueOf(paramString2));
          paramString2 = AppBrandLocalMediaObjectManager.xZ(paramString1) + (String)localObject;
          localObject = new StringBuilder("wxfile://").append((String)localObject);
          if (!bo.isNullOrNil(paramString3));
        }
      }
      for (paramString1 = ""; ; paramString1 = ".".concat(String.valueOf(paramString3)))
      {
        paramString1 = paramString1;
        ab.d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, return localId = %s, filePath = %s", new Object[] { paramString1, paramString2 });
        paramString1 = a.i(paramString1, paramString2, paramString3);
        AppMethodBeat.o(105345);
        break;
      }
    }

    public final AppBrandLocalMediaObject bw(String paramString1, String paramString2)
    {
      Object localObject1 = null;
      Object localObject2 = null;
      AppMethodBeat.i(105344);
      if ((!paramString2.startsWith("store_")) && (!paramString2.startsWith("tmp_")))
      {
        AppMethodBeat.o(105344);
        paramString1 = (String)localObject2;
      }
      while (true)
      {
        return paramString1;
        String str1 = org.apache.commons.a.b.awJ(paramString2);
        String str2 = paramString2.replaceFirst("store_", "").replaceFirst("tmp_", "");
        localObject2 = str2;
        if (!bo.isNullOrNil(str1))
          localObject2 = str2.replaceFirst(".".concat(String.valueOf(str1)), "");
        if (bo.isNullOrNil((String)localObject2))
        {
          paramString1 = AppBrandLocalMediaObjectManager.awM();
          AppMethodBeat.o(105344);
        }
        else
        {
          Object localObject3;
          try
          {
            str2 = AppBrandLocalMediaObjectManager.bu((String)localObject2, paramString1);
            localObject1 = str2;
            if (bo.isNullOrNil((String)localObject1))
            {
              ab.d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, get empty decrypted string");
              paramString1 = AppBrandLocalMediaObjectManager.awM();
              AppMethodBeat.o(105344);
            }
          }
          catch (Exception localException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", localException, "retrieveMediaObject, decrypt exp ", new Object[0]);
            localObject3 = ((String)localObject1).split("\\|");
            if ((localObject3 == null) || (localObject3.length != 2))
            {
              paramString1 = AppBrandLocalMediaObjectManager.awM();
              AppMethodBeat.o(105344);
              continue;
            }
            if (paramString2.startsWith("store_"));
            long l1;
            for (localObject1 = "store_"; ; localObject1 = "tmp_")
            {
              localObject2 = AppBrandLocalMediaObjectManager.xZ(paramString1) + (String)localObject1 + (String)localObject2;
              l1 = bo.getLong(localObject3[0], 0L);
              localObject3 = localObject3[1];
              if (((String)localObject3).equalsIgnoreCase(str1))
                break label283;
              paramString1 = AppBrandLocalMediaObjectManager.awM();
              AppMethodBeat.o(105344);
              break;
            }
            try
            {
              label283: long l2 = AppBrandLocalMediaObjectManager.ya((String)localObject2);
              if (l1 == l2)
                break label376;
              ab.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, exactCRC32(%d) != fileCRC32(%d), localId(%s), appId(%s)", new Object[] { Long.valueOf(l2), Long.valueOf(l1), paramString2, paramString1 });
              paramString1 = AppBrandLocalMediaObjectManager.awM();
              AppMethodBeat.o(105344);
            }
            catch (IOException paramString1)
            {
              ab.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, getCRC exp = %s", new Object[] { bo.l(paramString1) });
              paramString1 = AppBrandLocalMediaObjectManager.awM();
              AppMethodBeat.o(105344);
            }
          }
          continue;
          label376: paramString1 = new AppBrandLocalMediaObject();
          paramString1.czD = "wxfile://".concat(String.valueOf(paramString2));
          paramString1.fnQ = ((String)localObject2);
          paramString1.mimeType = com.tencent.mm.sdk.f.b.anI((String)localObject3);
          paramString1.gXl = ((String)localObject1).equalsIgnoreCase("store_");
          paramString2 = new File(paramString1.fnQ);
          paramString1.gXm = paramString2.lastModified();
          paramString1.gjQ = paramString2.length();
          AppMethodBeat.o(105344);
        }
      }
    }

    public final String toString()
    {
      return "V2MediaObjectInfoHandler";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager
 * JD-Core Version:    0.6.2
 */
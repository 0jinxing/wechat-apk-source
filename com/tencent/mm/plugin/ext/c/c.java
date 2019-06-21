package com.tencent.mm.plugin.ext.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi;
import com.tencent.mm.pluginsdk.g.a.a.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class c
{
  private static com.tencent.mm.sdk.b.c gyU;
  private static HashSet<String> lQS;
  private static HashSet<String> lQT;
  private static ArrayList<a> lQU;
  private static HashMap<String, e.a> lQV;

  static
  {
    AppMethodBeat.i(20411);
    lQS = new HashSet();
    lQT = new HashSet();
    lQU = new ArrayList();
    gyU = new c.1();
    lQV = new HashMap();
    AppMethodBeat.o(20411);
  }

  public static void Lh(String paramString)
  {
    AppMethodBeat.i(20401);
    lQS.add(paramString);
    AppMethodBeat.o(20401);
  }

  public static void Li(String paramString)
  {
    AppMethodBeat.i(20402);
    lQT.add(paramString);
    AppMethodBeat.o(20402);
  }

  public static e.a Lj(String paramString)
  {
    AppMethodBeat.i(20404);
    paramString = (e.a)lQV.get(paramString);
    AppMethodBeat.o(20404);
    return paramString;
  }

  public static boolean Lk(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(20406);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.ExtQbarDataManager", "hy: null in fastJudgeInWhitelist");
      AppMethodBeat.o(20406);
    }
    while (true)
    {
      return bool;
      if (lQS.contains(paramString))
      {
        ab.i("MicroMsg.ExtQbarDataManager", "hy: %s already in whitelist", new Object[] { paramString });
        AppMethodBeat.o(20406);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(20406);
      }
    }
  }

  public static boolean Ll(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(20407);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.ExtQbarDataManager", "hy: null in fastJudgeInBlacklist");
      AppMethodBeat.o(20407);
    }
    while (true)
    {
      return bool;
      if (lQT.contains(paramString))
      {
        ab.i("MicroMsg.ExtQbarDataManager", "hy: %s already in blacklist", new Object[] { paramString });
        AppMethodBeat.o(20407);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(20407);
      }
    }
  }

  public static b.b Lm(String paramString)
  {
    AppMethodBeat.i(20408);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.ExtQbarDataManager", "hy: url is null when get config");
      paramString = b.b.lQQ;
      AppMethodBeat.o(20408);
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = lQU.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label392;
        a locala = (a)localIterator.next();
        if (locala.lQI == b.a.lQK)
        {
          if (!paramString.startsWith(locala.url))
            continue;
          ab.i("MicroMsg.ExtQbarDataManager", "hy: match prefix: %s", new Object[] { locala.url });
          paramString = locala.lQJ;
          AppMethodBeat.o(20408);
          break;
        }
        Object localObject1;
        Object localObject2;
        try
        {
          localObject1 = new java/net/URL;
          ((URL)localObject1).<init>(paramString);
          localObject2 = ((URL)localObject1).getHost();
          ab.d("MicroMsg.ExtQbarDataManager", "hy: host is %s", new Object[] { localObject2 });
          if (!bo.Q(new String[0]))
            break label182;
          ab.w("MicroMsg.ExtQbarDataManager", "hy: no valid host");
        }
        catch (MalformedURLException localMalformedURLException)
        {
          ab.printErrStackTrace("MicroMsg.ExtQbarDataManager", localMalformedURLException, "hy: error in url convert: %s", new Object[] { paramString });
        }
        continue;
        label182: b.b localb;
        if (localMalformedURLException.lQI == b.a.lQM)
        {
          if (!localMalformedURLException.url.equals(localObject2))
            continue;
          ab.i("MicroMsg.ExtQbarDataManager", "hy: match domain: %s", new Object[] { localMalformedURLException.lQI });
          localb = localMalformedURLException.lQJ;
          AppMethodBeat.o(20408);
          paramString = localb;
          break;
        }
        if (localb.lQI == b.a.lQL)
        {
          localObject1 = localb.url.split("\\.");
          localObject2 = ((String)localObject2).split("\\.");
          if ((localObject1.length <= 0) || (localObject2.length <= 0) || (localObject1.length > localObject2.length))
            continue;
          int i = localObject1.length - 1;
          int j = localObject2.length - 1;
          int k = 1;
          while ((i >= 0) && (j >= 0))
          {
            if (!localObject1[i].equals(localObject2[j]))
              k = 0;
            i--;
            j--;
          }
          if (k == 0)
            continue;
          ab.i("MicroMsg.ExtQbarDataManager", "hy: match %s subdomain: %s", new Object[] { paramString, localb.url });
          localb = localb.lQJ;
          AppMethodBeat.o(20408);
          paramString = localb;
          break;
        }
        ab.e("MicroMsg.ExtQbarDataManager", "hy: damn it impossible!");
      }
      label392: paramString = b.b.lQQ;
      AppMethodBeat.o(20408);
    }
  }

  public static void a(String paramString, e.a parama)
  {
    AppMethodBeat.i(20403);
    lQV.put(paramString, parama);
    AppMethodBeat.o(20403);
  }

  private static String brR()
  {
    AppMethodBeat.i(20397);
    if (ExtControlProviderOpenApi.lPG);
    for (String str = h.getExternalStorageDirectory().getAbsolutePath() + File.separator + "extqbar"; ; str = ah.getContext().getFilesDir().getParent() + File.separator + "extqbar")
    {
      File localFile = new File(str);
      if (!localFile.exists())
      {
        ab.i("MicroMsg.ExtQbarDataManager", "hy: face dir not exist. mk dir");
        localFile.mkdirs();
      }
      str = str + File.separator + "ext_qbar_config.csv";
      AppMethodBeat.o(20397);
      return str;
    }
  }

  private static void brS()
  {
    AppMethodBeat.i(20398);
    if (!e.ct(brR()))
    {
      ab.w("MicroMsg.ExtQbarDataManager", "hy: not found csv file");
      g.Rg().a(new m(46), 0);
      AppMethodBeat.o(20398);
      return;
    }
    while (true)
    {
      Object localObject1;
      Object localObject2;
      int i;
      try
      {
        localObject1 = e.cy(brR());
        ab.i("MicroMsg.ExtQbarDataManager", "hy: found qrcode config");
        ab.v("MicroMsg.ExtQbarDataManager", "hy: qrcode config is %s", new Object[] { localObject1 });
        if (bo.isNullOrNil((String)localObject1))
          ab.w("MicroMsg.ExtQbarDataManager", "hy: no preset black/white config");
        BufferedReader localBufferedReader = new java/io/BufferedReader;
        localObject2 = new java/io/StringReader;
        ((StringReader)localObject2).<init>((String)localObject1);
        localBufferedReader.<init>((Reader)localObject2);
        long l = bo.yz();
        try
        {
          localObject2 = localBufferedReader.readLine();
          if (localObject2 != null)
          {
            ab.d("MicroMsg.ExtQbarDataManager", "hy: retrieving line");
            localObject1 = ((String)localObject2).split(",");
            if (localObject1.length >= 3)
              continue;
            ab.w("MicroMsg.ExtQbarDataManager", "hy: line %s not qualified length!", new Object[] { localObject2 });
            continue;
          }
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.ExtQbarDataManager", localException, "hy: exception when parse config!", new Object[0]);
          ab.i("MicroMsg.ExtQbarDataManager", "hy: qrcode config retrieved using %d ms", new Object[] { Long.valueOf(bo.az(l)) });
          AppMethodBeat.o(20398);
        }
        break;
        localObject2 = new com/tencent/mm/plugin/ext/c/a;
        ((a)localObject2).<init>();
        ((a)localObject2).url = localObject1[2].toUpperCase();
        if (!"white".equalsIgnoreCase(localObject1[0]))
          break label382;
        ((a)localObject2).lQJ = b.b.lQP;
        if (!"prefix".equalsIgnoreCase(localObject1[1]))
          break label308;
        ((a)localObject2).lQI = b.a.lQK;
        i = 1;
        if (i == 0)
          continue;
        lQU.add(localObject2);
        continue;
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.ExtQbarDataManager", localIOException, "hy: read config file failed!", new Object[0]);
        AppMethodBeat.o(20398);
      }
      break;
      label308: if ("subdomain".equalsIgnoreCase(localObject1[1]))
      {
        ((a)localObject2).lQI = b.a.lQL;
        i = 1;
      }
      else if ("domain".equalsIgnoreCase(localObject1[1]))
      {
        ((a)localObject2).lQI = b.a.lQM;
        i = 1;
      }
      else
      {
        ab.w("MicroMsg.ExtQbarDataManager", "hy: [white] 2nd not qualified! %s", new Object[] { localObject1[1] });
        i = 0;
        continue;
        label382: if ("black".equalsIgnoreCase(localObject1[0]))
        {
          ((a)localObject2).lQJ = b.b.lQO;
          if ("prefix".equalsIgnoreCase(localObject1[1]))
          {
            ((a)localObject2).lQI = b.a.lQK;
            i = 1;
          }
          else if ("subdomain".equalsIgnoreCase(localObject1[1]))
          {
            ((a)localObject2).lQI = b.a.lQL;
            i = 1;
          }
          else if ("domain".equalsIgnoreCase(localObject1[1]))
          {
            ((a)localObject2).lQI = b.a.lQM;
            i = 1;
          }
          else
          {
            ab.w("MicroMsg.ExtQbarDataManager", "hy: [black] 2nd not qualified! %s", new Object[] { localObject1[1] });
            i = 0;
          }
        }
        else
        {
          ab.w("MicroMsg.ExtQbarDataManager", "hy: 1st not qualified! %s", new Object[] { localObject1[0] });
          i = 0;
        }
      }
    }
  }

  public static void brT()
  {
    AppMethodBeat.i(20399);
    brS();
    com.tencent.mm.sdk.b.a.xxA.c(gyU);
    AppMethodBeat.o(20399);
  }

  public static void brU()
  {
    AppMethodBeat.i(20400);
    com.tencent.mm.sdk.b.a.xxA.d(gyU);
    AppMethodBeat.o(20400);
  }

  public static void clearCache()
  {
    AppMethodBeat.i(20405);
    lQV.clear();
    AppMethodBeat.o(20405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.c
 * JD-Core Version:    0.6.2
 */
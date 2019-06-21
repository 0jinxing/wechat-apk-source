package com.tencent.mm.plugin.appbrand.launching;

import android.database.Cursor;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.appcache.as;
import com.tencent.mm.plugin.appbrand.appcache.as.a;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.b;
import com.tencent.mm.plugin.appbrand.appcache.y;
import com.tencent.mm.plugin.appbrand.r.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
{
  static at a(y paramy, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(131810);
    Object localObject1 = com.tencent.mm.plugin.appbrand.app.f.auV();
    Object localObject2;
    if ((paramy == null) || (bo.isNullOrNil(paramString)))
    {
      paramy = null;
      if (paramy == null)
        break label274;
      localObject2 = paramy.iterator();
    }
    while (true)
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          paramy = (at)((Iterator)localObject2).next();
          if (paramy.field_version == paramInt2);
        }
        else
        {
          try
          {
            if (paramString.equals(paramy.field_versionMd5))
            {
              boolean bool = paramString.equals(g.b(e.openRead(paramy.field_pkgPath), 4096));
              if (bool)
              {
                AppMethodBeat.o(131810);
                while (true)
                {
                  return paramy;
                  localObject2 = String.format(Locale.US, "select * from %s where %s=? and %s=? and %s=? order by %s desc", new Object[] { "AppBrandWxaPkgManifestRecord", "appId", "debugType", "versionMd5", "version" });
                  localObject2 = ((ax)localObject1).gVj.rawQuery((String)localObject2, new String[] { paramy.toString(), String.valueOf(paramInt1), paramString });
                  if ((localObject2 == null) || (((Cursor)localObject2).isClosed()))
                  {
                    paramy = null;
                    break;
                  }
                  if (!((Cursor)localObject2).moveToFirst())
                  {
                    ((Cursor)localObject2).close();
                    paramy = null;
                    break;
                  }
                  paramy = new LinkedList();
                  do
                  {
                    localObject1 = new at();
                    ((at)localObject1).d((Cursor)localObject2);
                    paramy.add(localObject1);
                  }
                  while (((Cursor)localObject2).moveToNext());
                  ((Cursor)localObject2).close();
                  break;
                  label274: AppMethodBeat.o(131810);
                  paramy = null;
                }
              }
            }
          }
          catch (FileNotFoundException paramy)
          {
          }
        }
  }

  public static WxaPkgWrappingInfo bm(String paramString, int paramInt)
  {
    AppMethodBeat.i(131808);
    int[] arrayOfInt = com.tencent.mm.plugin.appbrand.app.f.auV().xG(paramString);
    if ((arrayOfInt != null) && (arrayOfInt.length > paramInt));
    while (true)
    {
      int i = paramInt + 1;
      Pair localPair = as.v(paramString, 0, arrayOfInt[paramInt]);
      if ((localPair.first == as.a.gUI) && (localPair.second != null))
      {
        paramString = (WxaPkgWrappingInfo)localPair.second;
        AppMethodBeat.o(131808);
      }
      while (true)
      {
        return paramString;
        if (i < arrayOfInt.length)
          break;
        paramString = null;
        AppMethodBeat.o(131808);
      }
      paramInt = i;
    }
  }

  static boolean cw(String paramString1, String paramString2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(131809);
    if ((bo.isNullOrNil(paramString1)) || (!e.ct(paramString1)))
    {
      AppMethodBeat.o(131809);
      bool1 = bool2;
    }
    ao localao;
    while (true)
    {
      return bool1;
      localao = new ao(paramString1);
      if (!localao.avW())
      {
        localao.close();
        AppMethodBeat.o(131809);
        bool1 = bool2;
      }
      else
      {
        if (!bo.isNullOrNil(paramString2))
          break;
        localao.close();
        AppMethodBeat.o(131809);
        bool1 = bool2;
      }
    }
    paramString2 = b.xm(com.tencent.luggage.g.h.bO(paramString2));
    Object localObject = localao.xy(paramString2);
    if (localObject != null)
      bo.b((Closeable)localObject);
    while (true)
    {
      while (true)
      {
        localao.close();
        AppMethodBeat.o(131809);
        break;
        localObject = d.convertStreamToString(localao.xy("app-config.json"));
        if (!bo.isNullOrNil((String)localObject))
          try
          {
            JSONArray localJSONArray = com.tencent.mm.aa.h.lw((String)localObject).getJSONArray("pages");
            for (int i = 0; ; i++)
            {
              if (i >= localJSONArray.length())
                break label218;
              localObject = localJSONArray.getString(i);
              if (!bo.isNullOrNil((String)localObject))
              {
                bool1 = paramString2.startsWith(b.xm((String)localObject));
                if (bool1)
                {
                  AppMethodBeat.o(131809);
                  bool1 = true;
                  break;
                }
              }
            }
            label218: bool1 = false;
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.AppBrand.Launching.CheckPkgLogic", "isFilePathExistsInPkg, parse app-config.json, pkgPath(%s), queryPath(%s), e = %s", new Object[] { paramString1, paramString2, localException });
          }
      }
      bool1 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.h
 * JD-Core Version:    0.6.2
 */
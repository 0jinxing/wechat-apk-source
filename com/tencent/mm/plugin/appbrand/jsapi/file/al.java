package com.tencent.mm.plugin.appbrand.jsapi.file;

import android.net.Uri;
import com.tencent.luggage.g.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.a.p;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.appcache.ar;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing;
import com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager;
import com.tencent.mm.plugin.appbrand.appstorage.h;
import com.tencent.mm.plugin.appbrand.appstorage.m;
import com.tencent.mm.plugin.appbrand.appstorage.s;
import com.tencent.mm.plugin.appbrand.appstorage.t;
import com.tencent.mm.plugin.appbrand.appstorage.v;
import com.tencent.mm.plugin.appbrand.appstorage.w;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public final class al extends t
{
  public al(o paramo, a parama)
  {
    super(paramo);
    AppMethodBeat.i(131077);
    this.gYd.clear();
    IWxaFileSystemWithModularizing localIWxaFileSystemWithModularizing = ar.o(paramo);
    m localm = new m(AppBrandLocalMediaObjectManager.gXn + paramo.mAppId + "/", paramo.mAppId, "wxfile://");
    localm.gXU = (parama.bQD * 1048576L);
    w localw = cg(p.getString(paramo.atI().uin), paramo.mAppId);
    localw.gYk = (parama.bQD * 1048576L);
    paramo = ch(p.getString(paramo.atI().uin), paramo.mAppId);
    paramo.gYk = (parama.hgg * 1048576L);
    this.gYd.add(paramo);
    this.gYd.add(localw);
    this.gYd.add(localm);
    this.gYd.add(localIWxaFileSystemWithModularizing);
    initialize();
    AppMethodBeat.o(131077);
  }

  public static w cg(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131082);
    paramString1 = new w(l(new String[] { paramString1, paramString2 }), "wxfile://usr");
    AppMethodBeat.o(131082);
    return paramString1;
  }

  public static w ch(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131083);
    paramString1 = new w(l(new String[] { paramString1, paramString2, "opendata" }), "wxfile://opendata");
    AppMethodBeat.o(131083);
    return paramString1;
  }

  private static String l(String[] paramArrayOfString)
  {
    AppMethodBeat.i(131084);
    Object localObject = new StringBuilder(";");
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
      ((StringBuilder)localObject).append(bo.nullAsNil(paramArrayOfString[j])).append(';');
    String str = g.x(((StringBuilder)localObject).toString().getBytes());
    if (!f.Mn())
    {
      paramArrayOfString = null;
      if (paramArrayOfString != null)
        break label152;
      ab.e("MicroMsg.AppBrand.LuggageFileSystemRegistryWC", "getIndependentRootPath, extRoot NULL");
      AppMethodBeat.o(131084);
      paramArrayOfString = null;
    }
    while (true)
    {
      return paramArrayOfString;
      localObject = com.tencent.mm.loader.j.b.eSn;
      paramArrayOfString = (String[])localObject;
      if (!((String)localObject).endsWith("/"))
        paramArrayOfString = (String)localObject + "/";
      paramArrayOfString = new File(paramArrayOfString + "wxanewfiles/");
      break;
      label152: paramArrayOfString = new File(paramArrayOfString.getPath() + "/" + str).getPath();
      AppMethodBeat.o(131084);
    }
  }

  public final com.tencent.mm.plugin.appbrand.appstorage.j a(File paramFile, String paramString, boolean paramBoolean, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    AppMethodBeat.i(131079);
    paramFile = ((m)ae(m.class)).a(paramFile, paramString, paramBoolean, paramj);
    AppMethodBeat.o(131079);
    return paramFile;
  }

  public final com.tencent.mm.plugin.appbrand.appstorage.j a(String paramString, com.tencent.mm.plugin.appbrand.r.j<List<h>> paramj)
  {
    AppMethodBeat.i(131078);
    Object localObject = Uri.parse(paramString);
    if (("wxfile".equals(((Uri)localObject).getScheme())) && (bo.isNullOrNil(((Uri)localObject).getAuthority())))
    {
      LinkedList localLinkedList = new LinkedList();
      ((m)ae(m.class)).a("", paramj);
      if (!bo.ek((List)paramj.value))
      {
        localObject = ((List)paramj.value).iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramString = (h)((Iterator)localObject).next();
          paramString.fileName = paramString.fileName.replaceFirst(Pattern.quote("wxfile://"), "");
        }
      }
      c.c(localLinkedList, (List)paramj.value);
      ((w)ym("wxfile://usr")).a("wxfile://usr", paramj);
      c.c(localLinkedList, (List)paramj.value);
      paramj.value = localLinkedList;
      paramString = com.tencent.mm.plugin.appbrand.appstorage.j.gXA;
      AppMethodBeat.o(131078);
    }
    while (true)
    {
      return paramString;
      paramString = super.a(paramString, paramj);
      AppMethodBeat.o(131078);
    }
  }

  public final List<v> awQ()
  {
    AppMethodBeat.i(131081);
    List localList = ((m)ae(m.class)).gXT.awR();
    AppMethodBeat.o(131081);
    return localList;
  }

  public final com.tencent.mm.vfs.b yh(String paramString)
  {
    AppMethodBeat.i(131080);
    paramString = ((m)ae(m.class)).yh(paramString);
    AppMethodBeat.o(131080);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.al
 * JD-Core Version:    0.6.2
 */
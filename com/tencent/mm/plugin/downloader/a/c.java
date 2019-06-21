package com.tencent.mm.plugin.downloader.a;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  private static final String[] kKf;
  private static final Map<String, String> kKg;

  static
  {
    AppMethodBeat.i(67892);
    kKf = new String[] { "dlied4.myapp.com", "dlied5.myapp.com" };
    kKg = new ConcurrentHashMap();
    AppMethodBeat.o(67892);
  }

  public static String Ij(String paramString)
  {
    AppMethodBeat.i(67890);
    if (bo.isNullOrNil(paramString));
    for (Object localObject = ""; (bo.isNullOrNil((String)localObject)) || (!Arrays.asList(kKf).contains(localObject)); localObject = Uri.parse(paramString).getHost())
    {
      ab.i("MicroMsg.GameDownloadExtension", "domain is not dlied4/dlied5");
      AppMethodBeat.o(67890);
      return paramString;
    }
    localObject = (IPCString)f.a("com.tencent.mm", new IPCString(paramString), c.a.class);
    if (localObject != null);
    for (localObject = ((IPCString)localObject).value; ; localObject = "")
    {
      paramString = dC(dC(paramString, String.format("openid=%s", new Object[] { localObject })), "p=wechat");
      ab.i("MicroMsg.GameDownloadExtension", "after openid added, url: %s", new Object[] { paramString });
      AppMethodBeat.o(67890);
      break;
    }
  }

  public static void clearCache()
  {
    AppMethodBeat.i(67889);
    kKg.clear();
    AppMethodBeat.o(67889);
  }

  private static String dC(String paramString1, String paramString2)
  {
    AppMethodBeat.i(67891);
    try
    {
      URI localURI = new java/net/URI;
      localURI.<init>(paramString1);
      Object localObject = localURI.getQuery();
      if (localObject == null);
      while (true)
      {
        localObject = new java/net/URI;
        ((URI)localObject).<init>(localURI.getScheme(), localURI.getAuthority(), localURI.getPath(), paramString2, localURI.getFragment());
        paramString2 = ((URI)localObject).toString();
        paramString1 = paramString2;
        AppMethodBeat.o(67891);
        return paramString1;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramString2 = (String)localObject + "&" + paramString2;
      }
    }
    catch (URISyntaxException paramString2)
    {
      while (true)
        AppMethodBeat.o(67891);
    }
  }

  public static void h(String paramString, String[] paramArrayOfString)
  {
    try
    {
      AppMethodBeat.i(67887);
      if (!bo.isNullOrNil(paramString))
        for (int i = 0; i < 2; i++)
          if (!bo.isNullOrNil(paramArrayOfString[i]))
            kKg.put(paramArrayOfString[i], paramString);
      AppMethodBeat.o(67887);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public static void o(String[] paramArrayOfString)
  {
    try
    {
      AppMethodBeat.i(67888);
      for (int i = 0; i < 2; i++)
        if (!bo.isNullOrNil(paramArrayOfString[i]))
          kKg.remove(paramArrayOfString[i]);
      AppMethodBeat.o(67888);
      return;
    }
    finally
    {
    }
    throw paramArrayOfString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.a.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.webview.modeltools;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView;
import com.tencent.xweb.b;
import com.tencent.xweb.c.g;
import com.tencent.xweb.q;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.xwalk.core.Log;

public final class c
{
  public static final String uoy;
  private static ArrayList<String> uoz;

  static
  {
    AppMethodBeat.i(6925);
    uoy = Integer.toString(100028);
    AppMethodBeat.o(6925);
  }

  private static void a(String paramString, List<String> paramList, b paramb)
  {
    AppMethodBeat.i(6921);
    if (!bo.ek(paramList))
    {
      String str = Uri.parse(paramString).getHost();
      Object localObject = str.split("\\.");
      if (localObject.length <= 1);
      for (localObject = ""; ; localObject = localObject[(localObject.length - 2)] + "." + localObject[(localObject.length - 1)])
      {
        ab.d("MicroMsg.WebView.CookiesCleanup", "host(%s)", new Object[] { str });
        ab.d("MicroMsg.WebView.CookiesCleanup", "domain(%s)", new Object[] { localObject });
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          str = (String)paramList.next();
          if (!bo.isNullOrNil(str))
          {
            paramb.setCookie(paramString, str + "=");
            paramb.setCookie(paramString, str + "=;path=/");
            if (!bo.isNullOrNil((String)localObject))
              paramb.setCookie((String)localObject, str + "=;domain=." + (String)localObject + ";path=/");
          }
        }
      }
    }
    AppMethodBeat.o(6921);
  }

  private static String aeR(String paramString)
  {
    StringBuilder localStringBuilder = null;
    AppMethodBeat.i(6924);
    URI localURI;
    try
    {
      localURI = new java/net/URI;
      localURI.<init>(paramString);
      paramString = localURI.getScheme();
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(6924);
        paramString = localStringBuilder;
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.WebView.CookiesCleanup", "getOrigin fail %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(6924);
        paramString = localStringBuilder;
      }
      localStringBuilder = new StringBuilder(paramString);
      localStringBuilder.append("://");
      localStringBuilder.append(localURI.getHost());
      i = localURI.getPort();
      if (i == -1)
        break label135;
    }
    if (((paramString.equalsIgnoreCase("http")) && (i == 80)) || ((paramString.equalsIgnoreCase("https")) && (i == 443)));
    label135: for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        localStringBuilder.append(":");
        localStringBuilder.append(localURI.getPort());
      }
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(6924);
      break;
    }
  }

  public static void bF(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(6923);
    if (!paramBoolean)
      AppMethodBeat.o(6923);
    while (true)
    {
      return;
      if (uoz == null)
        uoz = new ArrayList();
      if (uoz.contains(paramString))
      {
        AppMethodBeat.o(6923);
      }
      else
      {
        uoz.add(paramString);
        AppMethodBeat.o(6923);
      }
    }
  }

  public static void c(d paramd)
  {
    AppMethodBeat.i(6919);
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>(0);
      paramd = paramd.g(24, localBundle);
      if (paramd == null)
      {
        ab.i("MicroMsg.WebView.CookiesCleanup", "bundle is null, skip cookies cleanup");
        AppMethodBeat.o(6919);
        return;
      }
    }
    catch (RemoteException paramd)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WebView.CookiesCleanup", paramd, "", new Object[0]);
        paramd = null;
        continue;
        paramd = paramd.getStringArrayList("cookies_cleanup_url_list");
        if (bo.ek(paramd))
        {
          ab.i("MicroMsg.WebView.CookiesCleanup", "url list is empty, skip cookies cleanup");
          AppMethodBeat.o(6919);
        }
        else
        {
          eb(paramd);
          com.tencent.xweb.c.jx(ah.getContext());
          com.tencent.xweb.c.sync();
          ab.i("MicroMsg.WebView.CookiesCleanup", "cleanup cookies end");
          AppMethodBeat.o(6919);
        }
      }
    }
  }

  public static void cYw()
  {
    AppMethodBeat.i(6922);
    int i;
    if (uoz != null)
    {
      i = uoz.size();
      ab.i("MicroMsg.WebView.CookiesCleanup", "clearWebViewData url list size %d", new Object[] { Integer.valueOf(i) });
      if (!bo.ek(uoz))
        break label58;
      AppMethodBeat.o(6922);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label58: if (!bo.ek(uoz))
      {
        eb(uoz);
        com.tencent.xweb.c.jx(ah.getContext());
        com.tencent.xweb.c.sync();
        ab.i("MicroMsg.WebView.CookiesCleanup", "clearHostCookies end");
      }
      Iterator localIterator = uoz.iterator();
      while (localIterator.hasNext())
      {
        String str = aeR((String)localIterator.next());
        q localq = q.dUk();
        if (localq.AMK == null)
          Log.e("WebStorage", "deleteOrigin failed webStg is null, cur core kind is " + WebView.getCurWebType());
        else
          localq.AMK.deleteOrigin(str);
      }
      uoz.clear();
      AppMethodBeat.o(6922);
    }
  }

  private static void eb(List<String> paramList)
  {
    AppMethodBeat.i(6920);
    b localb = b.dTR();
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ab.i("MicroMsg.WebView.CookiesCleanup", "cookies cleanup: url(%s)", new Object[] { str });
      paramList = localb.getCookie(str);
      if (bo.isNullOrNil(paramList))
        paramList = null;
      while (true)
      {
        a(str, paramList, localb);
        break;
        String[] arrayOfString = paramList.split(";");
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
          arrayOfString[j] = arrayOfString[j].trim();
        LinkedList localLinkedList = new LinkedList();
        i = arrayOfString.length;
        for (j = 0; j < i; j++)
        {
          paramList = arrayOfString[j];
          if ((!bo.isNullOrNil(paramList)) && (paramList.contains("=")))
            localLinkedList.add(paramList.split("=")[0]);
        }
        paramList = localLinkedList;
        if (localLinkedList.isEmpty())
          paramList = null;
      }
    }
    AppMethodBeat.o(6920);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.c
 * JD-Core Version:    0.6.2
 */
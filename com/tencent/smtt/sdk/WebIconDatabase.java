package com.tencent.smtt.sdk;

import android.content.ContentResolver;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public class WebIconDatabase
{
  private static WebIconDatabase a;

  private static WebIconDatabase a()
  {
    try
    {
      AppMethodBeat.i(64708);
      if (a == null)
      {
        localWebIconDatabase = new com/tencent/smtt/sdk/WebIconDatabase;
        localWebIconDatabase.<init>();
        a = localWebIconDatabase;
      }
      WebIconDatabase localWebIconDatabase = a;
      AppMethodBeat.o(64708);
      return localWebIconDatabase;
    }
    finally
    {
    }
  }

  public static WebIconDatabase getInstance()
  {
    AppMethodBeat.i(64707);
    WebIconDatabase localWebIconDatabase = a();
    AppMethodBeat.o(64707);
    return localWebIconDatabase;
  }

  public void bulkRequestIconForPageUrl(ContentResolver paramContentResolver, String paramString, WebIconDatabase.a parama)
  {
  }

  public void close()
  {
    AppMethodBeat.i(64702);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().m();
      AppMethodBeat.o(64702);
    }
    while (true)
    {
      return;
      android.webkit.WebIconDatabase.getInstance().close();
      AppMethodBeat.o(64702);
    }
  }

  public void open(String paramString)
  {
    AppMethodBeat.i(64701);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().b(paramString);
      AppMethodBeat.o(64701);
    }
    while (true)
    {
      return;
      android.webkit.WebIconDatabase.getInstance().open(paramString);
      AppMethodBeat.o(64701);
    }
  }

  public void releaseIconForPageUrl(String paramString)
  {
    AppMethodBeat.i(64706);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().d(paramString);
      AppMethodBeat.o(64706);
    }
    while (true)
    {
      return;
      android.webkit.WebIconDatabase.getInstance().releaseIconForPageUrl(paramString);
      AppMethodBeat.o(64706);
    }
  }

  public void removeAllIcons()
  {
    AppMethodBeat.i(64703);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().l();
      AppMethodBeat.o(64703);
    }
    while (true)
    {
      return;
      android.webkit.WebIconDatabase.getInstance().removeAllIcons();
      AppMethodBeat.o(64703);
    }
  }

  public void requestIconForPageUrl(String paramString, WebIconDatabase.a parama)
  {
    AppMethodBeat.i(64704);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().a(paramString, new bk(this, parama));
      AppMethodBeat.o(64704);
    }
    while (true)
    {
      return;
      android.webkit.WebIconDatabase.getInstance().requestIconForPageUrl(paramString, new bl(this, parama));
      AppMethodBeat.o(64704);
    }
  }

  public void retainIconForPageUrl(String paramString)
  {
    AppMethodBeat.i(64705);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      localbv.c().c(paramString);
      AppMethodBeat.o(64705);
    }
    while (true)
    {
      return;
      android.webkit.WebIconDatabase.getInstance().retainIconForPageUrl(paramString);
      AppMethodBeat.o(64705);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebIconDatabase
 * JD-Core Version:    0.6.2
 */
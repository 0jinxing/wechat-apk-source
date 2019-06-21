package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebHistoryItem;

public class WebHistoryItem
{
  private IX5WebHistoryItem a = null;
  private android.webkit.WebHistoryItem b = null;

  static WebHistoryItem a(android.webkit.WebHistoryItem paramWebHistoryItem)
  {
    AppMethodBeat.i(64694);
    if (paramWebHistoryItem == null)
    {
      paramWebHistoryItem = null;
      AppMethodBeat.o(64694);
    }
    while (true)
    {
      return paramWebHistoryItem;
      WebHistoryItem localWebHistoryItem = new WebHistoryItem();
      localWebHistoryItem.b = paramWebHistoryItem;
      AppMethodBeat.o(64694);
      paramWebHistoryItem = localWebHistoryItem;
    }
  }

  static WebHistoryItem a(IX5WebHistoryItem paramIX5WebHistoryItem)
  {
    AppMethodBeat.i(64693);
    if (paramIX5WebHistoryItem == null)
    {
      paramIX5WebHistoryItem = null;
      AppMethodBeat.o(64693);
    }
    while (true)
    {
      return paramIX5WebHistoryItem;
      WebHistoryItem localWebHistoryItem = new WebHistoryItem();
      localWebHistoryItem.a = paramIX5WebHistoryItem;
      AppMethodBeat.o(64693);
      paramIX5WebHistoryItem = localWebHistoryItem;
    }
  }

  public Bitmap getFavicon()
  {
    AppMethodBeat.i(64698);
    Bitmap localBitmap;
    if (this.a != null)
    {
      localBitmap = this.a.getFavicon();
      AppMethodBeat.o(64698);
    }
    while (true)
    {
      return localBitmap;
      localBitmap = this.b.getFavicon();
      AppMethodBeat.o(64698);
    }
  }

  public String getOriginalUrl()
  {
    AppMethodBeat.i(64696);
    String str;
    if (this.a != null)
    {
      str = this.a.getOriginalUrl();
      AppMethodBeat.o(64696);
    }
    while (true)
    {
      return str;
      str = this.b.getOriginalUrl();
      AppMethodBeat.o(64696);
    }
  }

  public String getTitle()
  {
    AppMethodBeat.i(64697);
    String str;
    if (this.a != null)
    {
      str = this.a.getTitle();
      AppMethodBeat.o(64697);
    }
    while (true)
    {
      return str;
      str = this.b.getTitle();
      AppMethodBeat.o(64697);
    }
  }

  public String getUrl()
  {
    AppMethodBeat.i(64695);
    String str;
    if (this.a != null)
    {
      str = this.a.getUrl();
      AppMethodBeat.o(64695);
    }
    while (true)
    {
      return str;
      str = this.b.getUrl();
      AppMethodBeat.o(64695);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebHistoryItem
 * JD-Core Version:    0.6.2
 */
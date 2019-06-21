package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebBackForwardList;

public class WebBackForwardList
{
  private IX5WebBackForwardList a = null;
  private android.webkit.WebBackForwardList b = null;

  static WebBackForwardList a(android.webkit.WebBackForwardList paramWebBackForwardList)
  {
    AppMethodBeat.i(64684);
    if (paramWebBackForwardList == null)
    {
      paramWebBackForwardList = null;
      AppMethodBeat.o(64684);
    }
    while (true)
    {
      return paramWebBackForwardList;
      WebBackForwardList localWebBackForwardList = new WebBackForwardList();
      localWebBackForwardList.b = paramWebBackForwardList;
      AppMethodBeat.o(64684);
      paramWebBackForwardList = localWebBackForwardList;
    }
  }

  static WebBackForwardList a(IX5WebBackForwardList paramIX5WebBackForwardList)
  {
    AppMethodBeat.i(64683);
    if (paramIX5WebBackForwardList == null)
    {
      paramIX5WebBackForwardList = null;
      AppMethodBeat.o(64683);
    }
    while (true)
    {
      return paramIX5WebBackForwardList;
      WebBackForwardList localWebBackForwardList = new WebBackForwardList();
      localWebBackForwardList.a = paramIX5WebBackForwardList;
      AppMethodBeat.o(64683);
      paramIX5WebBackForwardList = localWebBackForwardList;
    }
  }

  public int getCurrentIndex()
  {
    AppMethodBeat.i(64686);
    int i;
    if (this.a != null)
    {
      i = this.a.getCurrentIndex();
      AppMethodBeat.o(64686);
    }
    while (true)
    {
      return i;
      i = this.b.getCurrentIndex();
      AppMethodBeat.o(64686);
    }
  }

  public WebHistoryItem getCurrentItem()
  {
    AppMethodBeat.i(64685);
    WebHistoryItem localWebHistoryItem;
    if (this.a != null)
    {
      localWebHistoryItem = WebHistoryItem.a(this.a.getCurrentItem());
      AppMethodBeat.o(64685);
    }
    while (true)
    {
      return localWebHistoryItem;
      localWebHistoryItem = WebHistoryItem.a(this.b.getCurrentItem());
      AppMethodBeat.o(64685);
    }
  }

  public WebHistoryItem getItemAtIndex(int paramInt)
  {
    AppMethodBeat.i(64687);
    WebHistoryItem localWebHistoryItem;
    if (this.a != null)
    {
      localWebHistoryItem = WebHistoryItem.a(this.a.getItemAtIndex(paramInt));
      AppMethodBeat.o(64687);
    }
    while (true)
    {
      return localWebHistoryItem;
      localWebHistoryItem = WebHistoryItem.a(this.b.getItemAtIndex(paramInt));
      AppMethodBeat.o(64687);
    }
  }

  public int getSize()
  {
    AppMethodBeat.i(64688);
    int i;
    if (this.a != null)
    {
      i = this.a.getSize();
      AppMethodBeat.o(64688);
    }
    while (true)
    {
      return i;
      i = this.b.getSize();
      AppMethodBeat.o(64688);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebBackForwardList
 * JD-Core Version:    0.6.2
 */
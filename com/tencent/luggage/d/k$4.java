package com.tencent.luggage.d;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.tencent.luggage.bridge.o;
import com.tencent.luggage.bridge.p;
import com.tencent.luggage.webview.a.a;
import com.tencent.luggage.webview.a.b;
import com.tencent.luggage.webview.a.d;
import com.tencent.luggage.webview.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class k$4
  implements a.a
{
  private boolean bPL = false;

  k$4(k paramk)
  {
  }

  public final WebResourceResponse a(WebResourceRequest paramWebResourceRequest, Bundle paramBundle)
  {
    AppMethodBeat.i(90820);
    if (this.bPI.bPz != null)
    {
      paramBundle = this.bPI.bPz.a(paramWebResourceRequest, paramBundle);
      if (paramBundle != null)
      {
        AppMethodBeat.o(90820);
        paramWebResourceRequest = paramBundle;
      }
    }
    while (true)
    {
      return paramWebResourceRequest;
      paramWebResourceRequest = this.bPI.bPD.bR(paramWebResourceRequest.getUrl().toString());
      AppMethodBeat.o(90820);
    }
  }

  public final boolean bD(String paramString)
  {
    AppMethodBeat.i(90816);
    Iterator localIterator = this.bPI.bPE.bRO.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      Object localObject = (Pair)localIterator.next();
      e locale = (e)((Pair)localObject).first;
      localObject = (Pattern)((Pair)localObject).second;
      if ((localObject != null) && (((Pattern)localObject).matcher(paramString).matches()))
      {
        bool = locale.yl();
        AppMethodBeat.o(90816);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90816);
    }
  }

  public final void bE(String paramString)
  {
    AppMethodBeat.i(90817);
    this.bPL = false;
    this.bPI.mUrl = paramString;
    this.bPI.bOA.bOI.wO();
    if (this.bPI.bPz != null)
      this.bPI.bPz.bE(paramString);
    AppMethodBeat.o(90817);
  }

  public final void bF(String paramString)
  {
    AppMethodBeat.i(90818);
    this.bPI.mUrl = paramString;
    this.bPI.bOA.bOI.onReady();
    if (this.bPI.bPz != null)
    {
      this.bPI.bOA.bw(this.bPI.bPz.xt());
      this.bPI.bPz.bF(paramString);
    }
    AppMethodBeat.o(90818);
  }

  public final WebResourceResponse bG(String paramString)
  {
    AppMethodBeat.i(90819);
    paramString = this.bPI.bPD.bR(paramString);
    AppMethodBeat.o(90819);
    return paramString;
  }

  public final String bH(String paramString)
  {
    AppMethodBeat.i(90821);
    paramString = this.bPI.bOA.bOI.bx(paramString);
    AppMethodBeat.o(90821);
    return paramString;
  }

  public final void bI(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(90822);
    int j;
    if (!this.bPL)
    {
      j = i;
      if (paramString != null)
      {
        if (paramString.length() == 0)
          j = i;
      }
      else
      {
        if (j == 0)
          break label72;
        AppMethodBeat.o(90822);
      }
    }
    while (true)
    {
      return;
      paramString = Uri.parse(paramString).getPath();
      j = i;
      if (paramString == null)
        break;
      j = i;
      if (!paramString.trim().endsWith("html"))
        break;
      j = 1;
      break;
      label72: this.bPI.bOA.bOI.onReady();
      if (this.bPI.bPz != null)
        this.bPI.bOA.bw(this.bPI.bPz.xt());
      this.bPL = true;
      AppMethodBeat.o(90822);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.k.4
 * JD-Core Version:    0.6.2
 */
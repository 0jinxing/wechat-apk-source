package com.tencent.luggage.webview.a;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  private final LinkedList<Pair<c, Pattern>> bRO;

  public b()
  {
    AppMethodBeat.i(90944);
    this.bRO = new LinkedList();
    AppMethodBeat.o(90944);
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(90945);
    Object localObject = paramc.yk();
    if (TextUtils.isEmpty((CharSequence)localObject));
    for (localObject = null; ; localObject = Pattern.compile((String)localObject))
    {
      this.bRO.add(new Pair(paramc, localObject));
      AppMethodBeat.o(90945);
      return;
    }
  }

  public final WebResourceResponse bR(String paramString)
  {
    AppMethodBeat.i(90946);
    Iterator localIterator = this.bRO.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (Pair)localIterator.next();
      Object localObject2 = (c)((Pair)localObject1).first;
      localObject1 = (Pattern)((Pair)localObject1).second;
      if ((localObject1 != null) && (((Pattern)localObject1).matcher(paramString).matches()))
      {
        localObject2 = ((c)localObject2).bG(paramString);
        if (localObject2 != null)
        {
          AppMethodBeat.o(90946);
          paramString = (String)localObject2;
        }
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(90946);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.webview.a.b
 * JD-Core Version:    0.6.2
 */
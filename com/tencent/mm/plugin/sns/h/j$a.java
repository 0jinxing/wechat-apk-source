package com.tencent.mm.plugin.sns.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class j$a
{
  StringBuffer jvt;

  j$a()
  {
    AppMethodBeat.i(36834);
    this.jvt = new StringBuffer();
    AppMethodBeat.o(36834);
  }

  public final void Fi(String paramString)
  {
    AppMethodBeat.i(36835);
    this.jvt.append("<" + paramString + ">");
    AppMethodBeat.o(36835);
  }

  public final void Fj(String paramString)
  {
    AppMethodBeat.i(36836);
    this.jvt.append("</" + paramString + ">");
    AppMethodBeat.o(36836);
  }

  public final void m(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(36839);
    this.jvt.append("<".concat(String.valueOf(paramString)));
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      paramString = (String)localIterator.next();
      String str = (String)paramMap.get(paramString);
      this.jvt.append(" " + paramString + "=\"" + str + "\" ");
    }
    this.jvt.append(">");
    paramMap.clear();
    AppMethodBeat.o(36839);
  }

  public final void setText(int paramInt)
  {
    AppMethodBeat.i(36838);
    this.jvt.append(paramInt);
    AppMethodBeat.o(36838);
  }

  public final void setText(String paramString)
  {
    AppMethodBeat.i(36837);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(36837);
    while (true)
    {
      return;
      if (paramString.contains(j.jvr))
      {
        this.jvt.append("<![CDATA[" + bo.ani(paramString) + "]]>");
        AppMethodBeat.o(36837);
      }
      else
      {
        this.jvt.append("<![CDATA[" + paramString + "]]>");
        AppMethodBeat.o(36837);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.h.j.a
 * JD-Core Version:    0.6.2
 */
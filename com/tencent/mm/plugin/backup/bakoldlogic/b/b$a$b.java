package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class b$a$b
{
  StringBuffer jvt;

  b$a$b()
  {
    AppMethodBeat.i(17769);
    this.jvt = new StringBuffer();
    AppMethodBeat.o(17769);
  }

  private void setText(int paramInt)
  {
    AppMethodBeat.i(17773);
    this.jvt.append(paramInt);
    AppMethodBeat.o(17773);
  }

  private void setText(String paramString)
  {
    AppMethodBeat.i(17772);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(17772);
    while (true)
    {
      return;
      if (paramString.contains(b.a.jvr))
      {
        this.jvt.append("<![CDATA[" + bo.ani(paramString) + "]]>");
        AppMethodBeat.o(17772);
      }
      else
      {
        this.jvt.append("<![CDATA[" + paramString + "]]>");
        AppMethodBeat.o(17772);
      }
    }
  }

  public final void Fi(String paramString)
  {
    AppMethodBeat.i(17770);
    this.jvt.append("<" + paramString + ">");
    AppMethodBeat.o(17770);
  }

  public final void Fj(String paramString)
  {
    AppMethodBeat.i(17771);
    this.jvt.append("</" + paramString + ">");
    AppMethodBeat.o(17771);
  }

  public final void bE(String paramString, int paramInt)
  {
    AppMethodBeat.i(17775);
    Fi(paramString);
    setText(paramInt);
    Fj(paramString);
    AppMethodBeat.o(17775);
  }

  public final void cY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(17774);
    Fi(paramString1);
    setText(paramString2);
    Fj(paramString1);
    AppMethodBeat.o(17774);
  }

  public final void m(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(17776);
    this.jvt.append("<".concat(String.valueOf(paramString)));
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramString = (String)paramMap.get(str);
      this.jvt.append(" " + str + " =  \"" + paramString + "\" ");
    }
    this.jvt.append(">");
    paramMap.clear();
    AppMethodBeat.o(17776);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.b.a.b
 * JD-Core Version:    0.6.2
 */
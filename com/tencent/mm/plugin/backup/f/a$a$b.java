package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class a$a$b
{
  StringBuffer jvt;

  a$a$b()
  {
    AppMethodBeat.i(17437);
    this.jvt = new StringBuffer();
    AppMethodBeat.o(17437);
  }

  private void setText(int paramInt)
  {
    AppMethodBeat.i(17441);
    this.jvt.append(paramInt);
    AppMethodBeat.o(17441);
  }

  private void setText(String paramString)
  {
    AppMethodBeat.i(17440);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(17440);
    while (true)
    {
      return;
      if (paramString.contains(a.a.jvr))
      {
        this.jvt.append("<![CDATA[" + bo.ani(paramString) + "]]>");
        AppMethodBeat.o(17440);
      }
      else
      {
        this.jvt.append("<![CDATA[" + paramString + "]]>");
        AppMethodBeat.o(17440);
      }
    }
  }

  public final void Fi(String paramString)
  {
    AppMethodBeat.i(17438);
    this.jvt.append("<" + paramString + ">");
    AppMethodBeat.o(17438);
  }

  public final void Fj(String paramString)
  {
    AppMethodBeat.i(17439);
    this.jvt.append("</" + paramString + ">");
    AppMethodBeat.o(17439);
  }

  public final void bE(String paramString, int paramInt)
  {
    AppMethodBeat.i(17443);
    Fi(paramString);
    setText(paramInt);
    Fj(paramString);
    AppMethodBeat.o(17443);
  }

  public final void cY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(17442);
    Fi(paramString1);
    setText(paramString2);
    Fj(paramString1);
    AppMethodBeat.o(17442);
  }

  public final void m(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(17444);
    this.jvt.append("<".concat(String.valueOf(paramString)));
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      paramString = (String)localIterator.next();
      String str = (String)paramMap.get(paramString);
      this.jvt.append(" " + paramString + " =  \"" + str + "\" ");
    }
    this.jvt.append(">");
    paramMap.clear();
    AppMethodBeat.o(17444);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.a.a.b
 * JD-Core Version:    0.6.2
 */
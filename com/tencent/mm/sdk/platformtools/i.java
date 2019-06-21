package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i
{
  public static String jvr = "]]>";
  public StringBuffer jvt;
  public String xyh;

  public i()
  {
    AppMethodBeat.i(51972);
    this.xyh = "";
    this.jvt = new StringBuffer();
    AppMethodBeat.o(51972);
  }

  public i(String paramString)
  {
    AppMethodBeat.i(51973);
    this.xyh = "";
    this.jvt = new StringBuffer();
    this.xyh = paramString;
    Fi(this.xyh);
    AppMethodBeat.o(51973);
  }

  private void Fi(String paramString)
  {
    AppMethodBeat.i(51974);
    this.jvt.append("<" + paramString + ">");
    AppMethodBeat.o(51974);
  }

  private void setText(String paramString)
  {
    AppMethodBeat.i(51976);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(51976);
    while (true)
    {
      return;
      if (paramString.contains(jvr))
      {
        this.jvt.append("<![CDATA[" + bo.ani(paramString) + "]]>");
        AppMethodBeat.o(51976);
      }
      else
      {
        this.jvt.append("<![CDATA[" + paramString + "]]>");
        AppMethodBeat.o(51976);
      }
    }
  }

  public final void Fj(String paramString)
  {
    AppMethodBeat.i(51975);
    this.jvt.append("</" + paramString + ">");
    AppMethodBeat.o(51975);
  }

  public final void cY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(51977);
    Fi(paramString1);
    setText(paramString2);
    Fj(paramString1);
    AppMethodBeat.o(51977);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.i
 * JD-Core Version:    0.6.2
 */
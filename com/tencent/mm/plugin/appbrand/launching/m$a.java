package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public final class m$a extends Error
{
  final String ihb;

  m$a(String paramString1, String paramString2)
  {
    super(paramString1);
    this.ihb = paramString2;
  }

  static final class a
  {
    String errorMessage;
    String ihb;

    final m.a aHl()
    {
      AppMethodBeat.i(131816);
      m.a locala = new m.a(this.errorMessage, this.ihb);
      AppMethodBeat.o(131816);
      return locala;
    }

    final a n(String paramString, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(131814);
      this.ihb = String.format(Locale.US, paramString, paramArrayOfObject);
      AppMethodBeat.o(131814);
      return this;
    }

    final a o(String paramString, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(131815);
      this.errorMessage = String.format(Locale.US, paramString, paramArrayOfObject);
      AppMethodBeat.o(131815);
      return this;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.m.a
 * JD-Core Version:    0.6.2
 */
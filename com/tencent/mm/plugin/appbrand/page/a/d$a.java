package com.tencent.mm.plugin.appbrand.page.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum d$a
{
  public final int ivl;

  static
  {
    AppMethodBeat.i(87351);
    ivj = new a("BLACK", 0, -16777216);
    ivk = new a("WHITE", 1, -1);
    ivm = new a[] { ivj, ivk };
    AppMethodBeat.o(87351);
  }

  private d$a(int paramInt)
  {
    this.ivl = paramInt;
  }

  public static a Dk(String paramString)
  {
    AppMethodBeat.i(87350);
    int j;
    if (!TextUtils.isEmpty(paramString))
    {
      a[] arrayOfa = values();
      int i = arrayOfa.length;
      j = 0;
      if (j < i)
      {
        a locala = arrayOfa[j];
        if (locala.name().equalsIgnoreCase(paramString))
        {
          AppMethodBeat.o(87350);
          paramString = locala;
        }
      }
    }
    while (true)
    {
      return paramString;
      j++;
      break;
      paramString = ivk;
      AppMethodBeat.o(87350);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.a.d.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.emoji;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.f;
import com.tencent.mm.cb.f.a;
import com.tencent.mm.cb.g;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
  implements com.tencent.mm.plugin.emoji.b.a
{
  public final boolean G(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(62303);
    boolean bool = g.dqQ().G(paramCharSequence);
    AppMethodBeat.o(62303);
    return bool;
  }

  public final boolean H(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(62304);
    boolean bool = g.dqQ().H(paramCharSequence);
    AppMethodBeat.o(62304);
    return bool;
  }

  public final SpannableString a(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    AppMethodBeat.i(62300);
    paramContext = g.dqQ().b(paramCharSequence, paramFloat);
    AppMethodBeat.o(62300);
    return paramContext;
  }

  public final SpannableString b(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    AppMethodBeat.i(62301);
    paramContext = j.b(paramContext, paramCharSequence, paramFloat);
    AppMethodBeat.o(62301);
    return paramContext;
  }

  public final String dE(String paramString1, String paramString2)
  {
    AppMethodBeat.i(62302);
    g.dqQ();
    f localf = f.dqL();
    ah.getContext();
    int i = 0;
    int j = paramString1.length();
    StringBuilder localStringBuilder = new StringBuilder(j);
    while (i < j)
    {
      char c = paramString1.charAt(i);
      if ((c == '/') || (c == '['))
      {
        f.a locala = localf.anW(paramString1.substring(i));
        if (locala != null)
        {
          localStringBuilder.append(paramString2);
          i += locala.text.length();
        }
      }
      else
      {
        localStringBuilder.append(c);
        i++;
      }
    }
    paramString1 = localStringBuilder.toString();
    AppMethodBeat.o(62302);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.StyleSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends e<Boolean, BoldSpan>
{
  public final boolean cs(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(26931);
    if (((paramObject instanceof BoldSpan)) || (((paramObject instanceof StyleSpan)) && (((StyleSpan)paramObject).getStyle() == 1)))
      AppMethodBeat.o(26931);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(26931);
    }
  }

  public final int dfy()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.b
 * JD-Core Version:    0.6.2
 */
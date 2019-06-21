package com.tencent.mm.plugin.sns.data;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cat;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  public ConcurrentHashMap<String, CharSequence> qFP;

  public d()
  {
    AppMethodBeat.i(35794);
    this.qFP = new ConcurrentHashMap();
    AppMethodBeat.o(35794);
  }

  public final void a(cat paramcat, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(35795);
    this.qFP.put(paramcat.wZG + "-" + paramcat.wZJ + "-" + paramcat.ncM, paramCharSequence);
    AppMethodBeat.o(35795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.data.d
 * JD-Core Version:    0.6.2
 */
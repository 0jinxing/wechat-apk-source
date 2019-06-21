package com.tencent.mm.plugin.topstory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a
  implements d
{
  Map<String, List<Object>> sAl;

  public a()
  {
    AppMethodBeat.i(65452);
    this.sAl = Collections.synchronizedMap(new HashMap());
    AppMethodBeat.o(65452);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a
 * JD-Core Version:    0.6.2
 */
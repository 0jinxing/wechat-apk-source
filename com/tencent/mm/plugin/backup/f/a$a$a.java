package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class a$a$a
{
  boolean bYN;
  Map<String, String> jvs;

  public a$a$a(String paramString)
  {
    AppMethodBeat.i(17435);
    this.jvs = null;
    this.bYN = true;
    this.jvs = be.amR(paramString);
    if (this.jvs == null)
    {
      this.bYN = false;
      this.jvs = new HashMap();
    }
    AppMethodBeat.o(17435);
  }

  final int getInt(String paramString)
  {
    AppMethodBeat.i(17436);
    int i;
    if (!this.jvs.containsKey(paramString))
    {
      AppMethodBeat.o(17436);
      i = 0;
    }
    while (true)
    {
      return i;
      i = bo.getInt((String)this.jvs.get(paramString), 0);
      AppMethodBeat.o(17436);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.a.a.a
 * JD-Core Version:    0.6.2
 */
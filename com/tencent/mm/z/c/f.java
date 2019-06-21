package com.tencent.mm.z.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.z.b.d;
import com.tencent.mm.z.d.a;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONObject;

public final class f
{
  a eIi;
  d eIt;
  g eIw;

  public f(d paramd, g paramg, a parama)
  {
    AppMethodBeat.i(115317);
    Assert.assertNotNull(paramd);
    Assert.assertNotNull(paramg);
    Assert.assertNotNull(parama);
    this.eIt = paramd;
    this.eIw = paramg;
    this.eIi = parama;
    AppMethodBeat.o(115317);
  }

  static String QB()
  {
    AppMethodBeat.i(115318);
    Object localObject = new HashMap();
    ((HashMap)localObject).put("nativeTime", Long.valueOf(System.currentTimeMillis()));
    localObject = new JSONObject((Map)localObject).toString();
    AppMethodBeat.o(115318);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.c.f
 * JD-Core Version:    0.6.2
 */
package org.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
  implements d
{
  public final String a(org.b.d.c paramc)
  {
    AppMethodBeat.i(77237);
    org.b.g.d.r(paramc, "Cannot extract a header from a null object");
    if ((paramc.BYN == null) || (paramc.BYN.size() <= 0))
    {
      paramc = new org.b.b.c(paramc);
      AppMethodBeat.o(77237);
      throw paramc;
    }
    Map localMap = paramc.BYN;
    StringBuffer localStringBuffer = new StringBuffer(localMap.size() * 20);
    localStringBuffer.append("OAuth ");
    Iterator localIterator = localMap.keySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        paramc = localStringBuffer.toString();
        AppMethodBeat.o(77237);
        return paramc;
      }
      paramc = (String)localIterator.next();
      if (localStringBuffer.length() > 6)
        localStringBuffer.append(", ");
      localStringBuffer.append(String.format("%s=\"%s\"", new Object[] { paramc, org.b.g.c.encode((String)localMap.get(paramc)) }));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.b.c.e
 * JD-Core Version:    0.6.2
 */
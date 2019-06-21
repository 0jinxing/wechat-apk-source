package org.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Map;
import org.b.d.e;
import org.b.d.j;
import org.b.g.d;

public final class c
  implements b
{
  public final String a(org.b.d.c paramc)
  {
    AppMethodBeat.i(77241);
    d.r(paramc, "Cannot extract base string from null object");
    if ((paramc.BYN == null) || (paramc.BYN.size() <= 0))
    {
      paramc = new org.b.b.c(paramc);
      AppMethodBeat.o(77241);
      throw paramc;
    }
    String str1 = org.b.g.c.encode(paramc.emZ().name());
    String str2 = org.b.g.c.encode(paramc.enf());
    e locale = new e();
    locale.a(paramc.emY());
    locale.a(paramc.ene());
    locale.a(new e(paramc.BYN));
    paramc = new e(locale.BYO);
    Collections.sort(paramc.BYO);
    paramc = String.format("%s&%s&%s", new Object[] { str1, str2, org.b.g.c.encode(paramc.enh()) });
    AppMethodBeat.o(77241);
    return paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.b.c.c
 * JD-Core Version:    0.6.2
 */
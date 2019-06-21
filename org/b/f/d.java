package org.b.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Random;

public final class d
  implements c
{
  private d.a BZm;

  public d()
  {
    AppMethodBeat.i(77301);
    this.BZm = new d.a();
    AppMethodBeat.o(77301);
  }

  private static Long enn()
  {
    AppMethodBeat.i(77304);
    long l = System.currentTimeMillis() / 1000L;
    AppMethodBeat.o(77304);
    return Long.valueOf(l);
  }

  public final String enm()
  {
    AppMethodBeat.i(77303);
    String str = String.valueOf(enn());
    AppMethodBeat.o(77303);
    return str;
  }

  public final String getNonce()
  {
    AppMethodBeat.i(77302);
    long l1 = enn().longValue();
    long l2 = new Random().nextInt();
    AppMethodBeat.o(77302);
    return String.valueOf(l1 + l2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.b.f.d
 * JD-Core Version:    0.6.2
 */
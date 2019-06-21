package org.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;
import org.b.b.b;
import org.b.d.h;
import org.b.g.d;

public final class a
{
  public String BYE;
  public String BYF;
  public String BYG = "oob";
  public org.b.a.a.a BYH;
  public h BYI = h.BYX;
  public OutputStream BYJ = null;
  public String scope;

  public static org.b.a.a.a bg(Class<? extends org.b.a.a.a> paramClass)
  {
    AppMethodBeat.i(77233);
    d.r(paramClass, "Api class cannot be null");
    try
    {
      paramClass = (org.b.a.a.a)paramClass.newInstance();
      AppMethodBeat.o(77233);
      return paramClass;
    }
    catch (Exception paramClass)
    {
      paramClass = new b("Error while creating the Api object", paramClass);
      AppMethodBeat.o(77233);
    }
    throw paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.b.a.a
 * JD-Core Version:    0.6.2
 */
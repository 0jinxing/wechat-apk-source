package org.apache.commons.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.io.PrintWriter;

public class d extends RuntimeException
  implements b
{
  protected c BYB;
  private Throwable cause;

  public d(Throwable paramThrowable)
  {
    AppMethodBeat.i(116948);
    this.BYB = new c(this);
    this.cause = null;
    this.cause = paramThrowable;
    AppMethodBeat.o(116948);
  }

  public final void b(PrintWriter paramPrintWriter)
  {
    AppMethodBeat.i(116953);
    super.printStackTrace(paramPrintWriter);
    AppMethodBeat.o(116953);
  }

  public Throwable getCause()
  {
    return this.cause;
  }

  public String getMessage()
  {
    AppMethodBeat.i(116949);
    String str;
    if (super.getMessage() != null)
    {
      str = super.getMessage();
      AppMethodBeat.o(116949);
    }
    while (true)
    {
      return str;
      if (this.cause != null)
      {
        str = this.cause.toString();
        AppMethodBeat.o(116949);
      }
      else
      {
        str = null;
        AppMethodBeat.o(116949);
      }
    }
  }

  public void printStackTrace()
  {
    AppMethodBeat.i(116950);
    this.BYB.printStackTrace(System.err);
    AppMethodBeat.o(116950);
  }

  public void printStackTrace(PrintStream paramPrintStream)
  {
    AppMethodBeat.i(116951);
    this.BYB.printStackTrace(paramPrintStream);
    AppMethodBeat.o(116951);
  }

  public void printStackTrace(PrintWriter paramPrintWriter)
  {
    AppMethodBeat.i(116952);
    this.BYB.printStackTrace(paramPrintWriter);
    AppMethodBeat.o(116952);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.a.d
 * JD-Core Version:    0.6.2
 */
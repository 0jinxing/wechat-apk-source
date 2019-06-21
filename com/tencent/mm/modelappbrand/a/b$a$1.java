package com.tencent.mm.modelappbrand.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.e;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

final class b$a$1 extends BufferedOutputStream
{
  b$a$1(b.a parama, OutputStream paramOutputStream, String paramString)
  {
    super(paramOutputStream);
  }

  public final void flush()
  {
    try
    {
      AppMethodBeat.i(77320);
      super.flush();
      e.deleteFile(this.fqm);
      AppMethodBeat.o(77320);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.a.1
 * JD-Core Version:    0.6.2
 */
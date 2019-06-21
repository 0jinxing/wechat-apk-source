package com.bumptech.glide.c.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class d
  implements a.a
{
  private final long aDc = 262144000L;
  private final d.a aDd;

  public d(d.a parama)
  {
    this.aDd = parama;
  }

  public final a mU()
  {
    Object localObject = null;
    AppMethodBeat.i(91980);
    File localFile = this.aDd.mW();
    if (localFile == null)
      AppMethodBeat.o(91980);
    while (true)
    {
      return localObject;
      if ((!localFile.mkdirs()) && ((!localFile.exists()) || (!localFile.isDirectory())))
      {
        AppMethodBeat.o(91980);
      }
      else
      {
        localObject = new e(localFile, this.aDc);
        AppMethodBeat.o(91980);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.d
 * JD-Core Version:    0.6.2
 */
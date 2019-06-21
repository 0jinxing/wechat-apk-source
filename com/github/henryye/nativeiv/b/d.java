package com.github.henryye.nativeiv.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import junit.framework.Assert;

public final class d
{
  public static InputStream h(InputStream paramInputStream)
  {
    AppMethodBeat.i(115777);
    Object localObject = paramInputStream;
    if (!paramInputStream.markSupported())
      if (!(paramInputStream instanceof FileInputStream))
        break label40;
    label40: for (localObject = new b((FileInputStream)paramInputStream); ; localObject = new BufferedInputStream(paramInputStream))
    {
      AppMethodBeat.o(115777);
      return localObject;
    }
  }

  public static void i(InputStream paramInputStream)
  {
    AppMethodBeat.i(115778);
    Assert.assertTrue(paramInputStream.markSupported());
    paramInputStream.mark(8388608);
    AppMethodBeat.o(115778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.b.d
 * JD-Core Version:    0.6.2
 */
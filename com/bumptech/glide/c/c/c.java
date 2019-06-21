package com.bumptech.glide.c.c;

import android.util.Log;
import com.bumptech.glide.c.d;
import com.bumptech.glide.h.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class c
  implements d<ByteBuffer>
{
  private static boolean a(ByteBuffer paramByteBuffer, File paramFile)
  {
    AppMethodBeat.i(92043);
    boolean bool = false;
    try
    {
      a.b(paramByteBuffer, paramFile);
      bool = true;
      AppMethodBeat.o(92043);
      return bool;
    }
    catch (IOException paramByteBuffer)
    {
      while (true)
        Log.isLoggable("ByteBufferEncoder", 3);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.c
 * JD-Core Version:    0.6.2
 */
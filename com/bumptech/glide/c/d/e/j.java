package com.bumptech.glide.c.d.e;

import android.util.Log;
import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.c.f;
import com.bumptech.glide.c.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class j
  implements k<InputStream, c>
{
  private final k<ByteBuffer, c> aGo;
  private final List<f> azH;
  private final b azx;

  public j(List<f> paramList, k<ByteBuffer, c> paramk, b paramb)
  {
    this.azH = paramList;
    this.aGo = paramk;
    this.azx = paramb;
  }

  private static byte[] d(InputStream paramInputStream)
  {
    AppMethodBeat.i(92357);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(16384);
    try
    {
      byte[] arrayOfByte = new byte[16384];
      while (true)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
    }
    catch (IOException paramInputStream)
    {
      Log.isLoggable("StreamGifDecoder", 5);
      paramInputStream = null;
      AppMethodBeat.o(92357);
    }
    while (true)
    {
      return paramInputStream;
      localByteArrayOutputStream.flush();
      paramInputStream = localByteArrayOutputStream.toByteArray();
      AppMethodBeat.o(92357);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.j
 * JD-Core Version:    0.6.2
 */
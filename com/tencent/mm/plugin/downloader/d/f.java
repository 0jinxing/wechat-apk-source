package com.tencent.mm.plugin.downloader.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.c.l;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public final class f
{
  private static final l kMe;
  Properties kMf;
  byte[] kMg;

  static
  {
    AppMethodBeat.i(2320);
    kMe = new l(38650);
    AppMethodBeat.o(2320);
  }

  public f()
  {
    AppMethodBeat.i(2315);
    this.kMf = new Properties();
    AppMethodBeat.o(2315);
  }

  public final byte[] AL()
  {
    AppMethodBeat.i(2318);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      localByteArrayOutputStream.write(kMe.getBytes());
      Object localObject1 = this.kMf.keySet().iterator();
      Object localObject3;
      StringBuilder localStringBuilder;
      for (Object localObject2 = ""; ((Iterator)localObject1).hasNext(); localObject2 = (String)localObject2 + localObject3 + "=" + this.kMf.getProperty((String)localObject3) + "\r\n")
      {
        localObject3 = ((Iterator)localObject1).next();
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
      }
      localObject1 = ((String)localObject2).getBytes("UTF-8");
      localObject2 = new com/tencent/mm/c/l;
      ((l)localObject2).<init>(localObject1.length);
      localByteArrayOutputStream.write(((l)localObject2).getBytes());
      localByteArrayOutputStream.write((byte[])localObject1);
      if (this.kMg != null)
        localByteArrayOutputStream.write(this.kMg);
      localObject2 = localByteArrayOutputStream.toByteArray();
      AppMethodBeat.o(2318);
      return localObject2;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.Channel.GameComment", "encode, error: %s", new Object[] { localIOException.getMessage() });
    }
  }

  public final void E(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(2317);
    if (paramArrayOfByte == null)
    {
      ab.w("MicroMsg.Channel.GameComment", "decode, data is null");
      AppMethodBeat.o(2317);
    }
    while (true)
    {
      return;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
      Object localObject = new byte[2];
      localByteBuffer.get((byte[])localObject);
      if (!kMe.equals(new l((byte[])localObject)))
        ab.e("MicroMsg.Channel.GameComment", "decode, unknow protocol");
      if (paramArrayOfByte.length - 2 <= 2)
      {
        ab.e("MicroMsg.Channel.GameComment", "decode, data.length - headLength <= 2");
        AppMethodBeat.o(2317);
        continue;
      }
      localObject = new byte[2];
      localByteBuffer.get((byte[])localObject);
      int i = new l((byte[])localObject).value;
      if (paramArrayOfByte.length - 2 - 2 < i)
      {
        ab.e("MicroMsg.Channel.GameComment", "decode, cooment content is empty");
        AppMethodBeat.o(2317);
        continue;
      }
      byte[] arrayOfByte = new byte[i];
      localByteBuffer.get(arrayOfByte);
      try
      {
        localObject = this.kMf;
        InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
        ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
        localByteArrayInputStream.<init>(arrayOfByte);
        localInputStreamReader.<init>(localByteArrayInputStream, "UTF-8");
        ((Properties)localObject).load(localInputStreamReader);
        label187: i = paramArrayOfByte.length - 2 - i - 2;
        if (i > 0)
        {
          this.kMg = new byte[i];
          localByteBuffer.get(this.kMg);
        }
        AppMethodBeat.o(2317);
      }
      catch (IOException localIOException)
      {
        break label187;
      }
    }
  }

  public final void F(Map<String, String> paramMap)
  {
    AppMethodBeat.i(2316);
    this.kMf.putAll(paramMap);
    AppMethodBeat.o(2316);
  }

  public final String toString()
  {
    AppMethodBeat.i(2319);
    StringBuilder localStringBuilder = new StringBuilder("GameComment [p=").append(this.kMf).append(", otherData=");
    if (this.kMg == null);
    for (String str = ""; ; str = new String(this.kMg))
    {
      str = str + "]";
      AppMethodBeat.o(2319);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.f
 * JD-Core Version:    0.6.2
 */
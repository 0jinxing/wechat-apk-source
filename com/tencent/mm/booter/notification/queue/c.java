package com.tencent.mm.booter.notification.queue;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URLDecoder;
import java.net.URLEncoder;

public final class c
{
  public static String a(Serializable paramSerializable)
  {
    AppMethodBeat.i(16002);
    long l = System.currentTimeMillis();
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
    localObjectOutputStream.writeObject(paramSerializable);
    paramSerializable = URLEncoder.encode(localByteArrayOutputStream.toString("ISO-8859-1"), "UTF-8");
    localObjectOutputStream.close();
    localByteArrayOutputStream.close();
    ab.d("MicroMsg.NotificationQueueTool", "serialize consume: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(16002);
    return paramSerializable;
  }

  public static Serializable jQ(String paramString)
  {
    AppMethodBeat.i(16003);
    if (ah.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(16003);
    }
    while (true)
    {
      return paramString;
      long l = System.currentTimeMillis();
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(URLDecoder.decode(paramString, "UTF-8").getBytes("ISO-8859-1"));
      ObjectInputStream localObjectInputStream = new ObjectInputStream(localByteArrayInputStream);
      paramString = (Serializable)localObjectInputStream.readObject();
      localObjectInputStream.close();
      localByteArrayInputStream.close();
      ab.d("MicroMsg.NotificationQueueTool", "de serialize consume: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(16003);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.queue.c
 * JD-Core Version:    0.6.2
 */
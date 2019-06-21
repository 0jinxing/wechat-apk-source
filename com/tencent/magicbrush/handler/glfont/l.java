package com.tencent.magicbrush.handler.glfont;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public final class l
{
  public static int VERSION = 5;
  public static int bTK = 0;
  public static int bTL = 1;
  public static int bTM = 2;
  public static int bTN = 3;
  public static int bTO = 4;
  public static int bTP = 6;
  Map<Integer, String> bTQ;

  public l()
  {
    AppMethodBeat.i(115960);
    this.bTQ = new HashMap();
    AppMethodBeat.o(115960);
  }

  final void b(RandomAccessFile paramRandomAccessFile)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(115961);
    int k = paramRandomAccessFile.readShort();
    int m = paramRandomAccessFile.readShort();
    int n = paramRandomAccessFile.readShort();
    if ((k != 1) || (m != 0))
    {
      AppMethodBeat.o(115961);
      return;
    }
    paramRandomAccessFile.seek(12L);
    Object localObject1 = new byte[4];
    l.c localc = new l.c((byte)0);
    m = 0;
    label69: if (m < n)
    {
      paramRandomAccessFile.read((byte[])localObject1);
      localc.name = new String((byte[])localObject1);
      localc.bUa = paramRandomAccessFile.readInt();
      localc.offset = paramRandomAccessFile.readInt();
      localc.length = paramRandomAccessFile.readInt();
      if (!"name".equalsIgnoreCase(localc.name));
    }
    for (m = i; ; m = 0)
    {
      if (m == 0)
      {
        AppMethodBeat.o(115961);
        break;
        if ((localc.name == null) || (localc.name.length() == 0))
          continue;
        m++;
        break label69;
      }
      paramRandomAccessFile.seek(localc.offset);
      l.b localb = new l.b((byte)0);
      localb.bTX = paramRandomAccessFile.readShort();
      localb.bTY = paramRandomAccessFile.readShort();
      localb.bTZ = paramRandomAccessFile.readShort();
      localObject1 = new l.a((byte)0);
      for (m = j; m < localb.bTY; m++)
      {
        ((l.a)localObject1).bTR = paramRandomAccessFile.readShort();
        ((l.a)localObject1).bTS = paramRandomAccessFile.readShort();
        ((l.a)localObject1).bTT = paramRandomAccessFile.readShort();
        ((l.a)localObject1).bTU = paramRandomAccessFile.readShort();
        ((l.a)localObject1).bTV = paramRandomAccessFile.readShort();
        ((l.a)localObject1).bTW = paramRandomAccessFile.readShort();
        long l = paramRandomAccessFile.getFilePointer();
        Object localObject2 = new byte[((l.a)localObject1).bTV];
        paramRandomAccessFile.seek(localc.offset + ((l.a)localObject1).bTW + localb.bTZ);
        paramRandomAccessFile.read((byte[])localObject2);
        localObject2 = new String((byte[])localObject2, Charset.forName("utf-16"));
        this.bTQ.put(Integer.valueOf(((l.a)localObject1).bTU), localObject2);
        paramRandomAccessFile.seek(l);
      }
      AppMethodBeat.o(115961);
      break;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(115962);
    String str = this.bTQ.toString();
    AppMethodBeat.o(115962);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.l
 * JD-Core Version:    0.6.2
 */
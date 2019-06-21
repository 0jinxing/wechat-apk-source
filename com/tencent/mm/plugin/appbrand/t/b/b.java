package com.tencent.mm.plugin.appbrand.t.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.t.d.d.a;
import com.tencent.mm.plugin.appbrand.t.d.e;
import com.tencent.mm.plugin.appbrand.t.e.f;
import com.tencent.mm.plugin.appbrand.t.e.h;
import com.tencent.mm.plugin.appbrand.t.e.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class b extends a
{
  private ByteBuffer iTj;
  private com.tencent.mm.plugin.appbrand.t.d.d iTk;
  private final Random iTl;

  public b()
  {
    AppMethodBeat.i(73233);
    this.iTk = null;
    this.iTl = new Random();
    AppMethodBeat.o(73233);
  }

  private static String En(String paramString)
  {
    AppMethodBeat.i(73240);
    paramString = paramString.trim();
    String str = paramString + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    try
    {
      paramString = MessageDigest.getInstance("SHA1");
      paramString = com.tencent.mm.plugin.appbrand.t.f.a.an(paramString.digest(str.getBytes()));
      AppMethodBeat.o(73240);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandNetWork.Draft_10", "not such algorithm " + paramString.toString());
        paramString = "";
        AppMethodBeat.o(73240);
      }
    }
  }

  public static int g(f paramf)
  {
    int i = -1;
    AppMethodBeat.i(73234);
    paramf = paramf.Eq("Sec-WebSocket-Version");
    if (paramf.length() > 0);
    while (true)
    {
      try
      {
        Integer localInteger = new java/lang/Integer;
        localInteger.<init>(paramf.trim());
        j = localInteger.intValue();
        AppMethodBeat.o(73234);
        return j;
      }
      catch (NumberFormatException paramf)
      {
        AppMethodBeat.o(73234);
        j = i;
        continue;
      }
      AppMethodBeat.o(73234);
      int j = i;
    }
  }

  private static byte[] i(long paramLong, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = 0; i < paramInt; i++)
      arrayOfByte[i] = ((byte)(byte)(int)(paramLong >>> paramInt * 8 - 8 - i * 8));
    return arrayOfByte;
  }

  private com.tencent.mm.plugin.appbrand.t.d.d z(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(73244);
    int i = paramByteBuffer.remaining();
    int j = 2;
    if (i < 2)
    {
      paramByteBuffer = new b.a(this, 2);
      AppMethodBeat.o(73244);
      throw paramByteBuffer;
    }
    int k = paramByteBuffer.get();
    if (k >> 8 != 0);
    for (boolean bool = true; ; bool = false)
    {
      m = (byte)((k & 0x7F) >> 4);
      if (m == 0)
        break;
      paramByteBuffer = new com.tencent.mm.plugin.appbrand.t.c.c("bad rsv ".concat(String.valueOf(m)));
      AppMethodBeat.o(73244);
      throw paramByteBuffer;
    }
    int m = paramByteBuffer.get();
    if ((m & 0xFFFFFF80) != 0);
    for (int n = 1; ; n = 0)
    {
      m = (byte)(m & 0x7F);
      k = (byte)(k & 0xF);
      switch (k)
      {
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      default:
        paramByteBuffer = new com.tencent.mm.plugin.appbrand.t.c.c("unknow optcode " + (short)k);
        AppMethodBeat.o(73244);
        throw paramByteBuffer;
      case 0:
      case 1:
      case 2:
      case 8:
      case 9:
      case 10:
      }
    }
    d.a locala = d.a.iTr;
    while ((!bool) && ((locala == d.a.iTu) || (locala == d.a.iTv) || (locala == d.a.iTw)))
    {
      paramByteBuffer = new com.tencent.mm.plugin.appbrand.t.c.c("control frames may no be fragmented");
      AppMethodBeat.o(73244);
      throw paramByteBuffer;
      locala = d.a.iTs;
      continue;
      locala = d.a.iTt;
      continue;
      locala = d.a.iTw;
      continue;
      locala = d.a.iTu;
      continue;
      locala = d.a.iTv;
    }
    Object localObject;
    if ((m < 0) || (m > 125))
    {
      if ((locala == d.a.iTu) || (locala == d.a.iTv) || (locala == d.a.iTw))
      {
        paramByteBuffer = new com.tencent.mm.plugin.appbrand.t.c.c("more than 125 octets");
        AppMethodBeat.o(73244);
        throw paramByteBuffer;
      }
      if (m == 126)
      {
        j = 4;
        if (i < 4)
        {
          paramByteBuffer = new b.a(this, 4);
          AppMethodBeat.o(73244);
          throw paramByteBuffer;
        }
        localObject = new byte[3];
        localObject[1] = paramByteBuffer.get();
        localObject[2] = paramByteBuffer.get();
        m = new BigInteger((byte[])localObject).intValue();
      }
    }
    while (true)
    {
      if (n != 0);
      for (k = 4; ; k = 0)
      {
        j = k + j + m;
        if (i >= j)
          break label588;
        paramByteBuffer = new b.a(this, j);
        AppMethodBeat.o(73244);
        throw paramByteBuffer;
        k = 10;
        if (i < 10)
        {
          paramByteBuffer = new b.a(this, 10);
          AppMethodBeat.o(73244);
          throw paramByteBuffer;
        }
        localObject = new byte[8];
        for (j = 0; j < 8; j++)
          localObject[j] = paramByteBuffer.get();
        long l = new BigInteger((byte[])localObject).longValue();
        if (l > 2147483647L)
        {
          ab.e("MicroMsg.AppBrandNetWork.Draft_10", "Payloadsize is to big...");
          j = k;
          break;
        }
        m = (int)l;
        j = k;
        break;
      }
      label588: localObject = ByteBuffer.allocate(qe(m));
      if (n != 0)
      {
        byte[] arrayOfByte = new byte[4];
        paramByteBuffer.get(arrayOfByte);
        for (j = 0; j < m; j++)
          ((ByteBuffer)localObject).put((byte)(paramByteBuffer.get() ^ arrayOfByte[(j % 4)]));
      }
      ((ByteBuffer)localObject).put(paramByteBuffer.array(), paramByteBuffer.position(), ((ByteBuffer)localObject).limit());
      paramByteBuffer.position(paramByteBuffer.position() + ((ByteBuffer)localObject).limit());
      if (locala == d.a.iTw)
        paramByteBuffer = new com.tencent.mm.plugin.appbrand.t.d.b();
      while (true)
      {
        ((ByteBuffer)localObject).flip();
        paramByteBuffer.A((ByteBuffer)localObject);
        AppMethodBeat.o(73244);
        return paramByteBuffer;
        paramByteBuffer = new e();
        paramByteBuffer.eM(bool);
        paramByteBuffer.a(locala);
      }
    }
  }

  public final a.b a(com.tencent.mm.plugin.appbrand.t.e.a parama, h paramh)
  {
    int i = 1;
    AppMethodBeat.i(73235);
    Object localObject = parama.Eq("Sec-WebSocket-Protocol");
    String str = paramh.Eq("Sec-WebSocket-Protocol");
    if ((!bo.isNullOrNil((String)localObject)) && (!bo.isNullOrNil(str)))
    {
      ab.d("MicroMsg.AppBrandNetWork.Draft_10", "respProtocol is %s", new Object[] { str });
      localObject = ((String)localObject).split(", ");
      int j = localObject.length;
      k = 0;
      if (k >= j)
        break label212;
      if (!str.equals(localObject[k]));
    }
    label212: for (int k = i; ; k = 0)
    {
      if (k == 0)
      {
        parama = a.b.iTh;
        AppMethodBeat.o(73235);
      }
      while (true)
      {
        return parama;
        k++;
        break;
        if ((!parama.Er("Sec-WebSocket-Key")) || (!paramh.Er("Sec-WebSocket-Accept")))
        {
          parama = a.b.iTh;
          AppMethodBeat.o(73235);
        }
        else
        {
          paramh = paramh.Eq("Sec-WebSocket-Accept");
          if (En(parama.Eq("Sec-WebSocket-Key")).equals(paramh))
          {
            parama = a.b.iTg;
            AppMethodBeat.o(73235);
          }
          else
          {
            parama = a.b.iTh;
            AppMethodBeat.o(73235);
          }
        }
      }
    }
  }

  public com.tencent.mm.plugin.appbrand.t.e.b a(com.tencent.mm.plugin.appbrand.t.e.b paramb)
  {
    AppMethodBeat.i(73241);
    paramb.put("Upgrade", "websocket");
    paramb.put("Connection", "Upgrade");
    paramb.put("Sec-WebSocket-Version", "8");
    byte[] arrayOfByte = new byte[16];
    this.iTl.nextBytes(arrayOfByte);
    paramb.put("Sec-WebSocket-Key", com.tencent.mm.plugin.appbrand.t.f.a.an(arrayOfByte));
    AppMethodBeat.o(73241);
    return paramb;
  }

  public com.tencent.mm.plugin.appbrand.t.e.c a(com.tencent.mm.plugin.appbrand.t.e.a parama, i parami)
  {
    AppMethodBeat.i(73242);
    parami.put("Upgrade", "websocket");
    parami.put("Connection", parama.Eq("Connection"));
    parami.Ep("Switching Protocols");
    parama = parama.Eq("Sec-WebSocket-Key");
    if (parama == null)
    {
      parama = new com.tencent.mm.plugin.appbrand.t.c.d("missing Sec-WebSocket-Key");
      AppMethodBeat.o(73242);
      throw parama;
    }
    parami.put("Sec-WebSocket-Accept", En(parama));
    AppMethodBeat.o(73242);
    return parami;
  }

  public final List<com.tencent.mm.plugin.appbrand.t.d.d> a(ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    AppMethodBeat.i(73238);
    e locale = new e();
    try
    {
      locale.A(paramByteBuffer);
      locale.eM(true);
      locale.a(d.a.iTt);
      locale.eN(paramBoolean);
      paramByteBuffer = Collections.singletonList(locale);
      AppMethodBeat.o(73238);
      return paramByteBuffer;
    }
    catch (com.tencent.mm.plugin.appbrand.t.c.b paramByteBuffer)
    {
      while (true)
        ab.e("MicroMsg.AppBrandNetWork.Draft_10", "createFrames setPayload exception" + paramByteBuffer.toString());
    }
  }

  public final a.a aOl()
  {
    return a.a.iTe;
  }

  public a aOm()
  {
    AppMethodBeat.i(73245);
    b localb = new b();
    AppMethodBeat.o(73245);
    return localb;
  }

  public final List<com.tencent.mm.plugin.appbrand.t.d.d> ar(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(73239);
    e locale = new e();
    try
    {
      locale.A(ByteBuffer.wrap(com.tencent.mm.plugin.appbrand.t.f.b.Es(paramString)));
      locale.eM(true);
      locale.a(d.a.iTs);
      locale.eN(paramBoolean);
      paramString = Collections.singletonList(locale);
      AppMethodBeat.o(73239);
      return paramString;
    }
    catch (com.tencent.mm.plugin.appbrand.t.c.b paramString)
    {
      while (true)
        ab.e("MicroMsg.AppBrandNetWork.Draft_10", "createFrames setPayload exception" + paramString.toString());
    }
  }

  public a.b c(com.tencent.mm.plugin.appbrand.t.e.a parama)
  {
    AppMethodBeat.i(73236);
    int i = g(parama);
    if ((i == 7) || (i == 8))
      if ((parama.Eq("Upgrade").equalsIgnoreCase("websocket")) && (parama.Eq("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")))
      {
        i = 1;
        if (i == 0)
          break label88;
        parama = a.b.iTg;
        AppMethodBeat.o(73236);
      }
    while (true)
    {
      return parama;
      i = 0;
      break;
      label88: parama = a.b.iTh;
      AppMethodBeat.o(73236);
      continue;
      parama = a.b.iTh;
      AppMethodBeat.o(73236);
    }
  }

  public final ByteBuffer d(com.tencent.mm.plugin.appbrand.t.d.d paramd)
  {
    int i = -128;
    int j = 0;
    AppMethodBeat.i(73237);
    ByteBuffer localByteBuffer1 = paramd.aOq();
    int k;
    int m;
    label45: int n;
    label57: int i1;
    label65: ByteBuffer localByteBuffer2;
    d.a locala;
    if (this.iSF == com.tencent.mm.plugin.appbrand.t.a.b.iSq)
    {
      k = 1;
      if (localByteBuffer1.remaining() > 125)
        break label243;
      m = 1;
      if (m <= 1)
        break label267;
      n = m + 1;
      if (k == 0)
        break label274;
      i1 = 4;
      localByteBuffer2 = ByteBuffer.allocate(i1 + (n + 1) + localByteBuffer1.remaining());
      locala = paramd.aOt();
      if (locala != d.a.iTr)
        break label280;
      n = 0;
      label102: if (!paramd.aOr())
        break label386;
      i1 = -128;
      label115: localByteBuffer2.put((byte)(n | (byte)i1));
      paramd = i(localByteBuffer1.remaining(), m);
      if (m != 1)
        break label397;
      n = paramd[0];
      if (k == 0)
        break label392;
      label156: localByteBuffer2.put((byte)(n | i));
    }
    while (true)
    {
      if (k == 0)
        break label483;
      paramd = ByteBuffer.allocate(4);
      paramd.putInt(this.iTl.nextInt());
      localByteBuffer2.put(paramd.array());
      for (n = j; localByteBuffer1.hasRemaining(); n++)
        localByteBuffer2.put((byte)(localByteBuffer1.get() ^ paramd.get(n % 4)));
      k = 0;
      break;
      label243: if (localByteBuffer1.remaining() <= 65535)
      {
        m = 2;
        break label45;
      }
      m = 8;
      break label45;
      label267: n = m;
      break label57;
      label274: i1 = 0;
      break label65;
      label280: if (locala == d.a.iTs)
      {
        n = 1;
        break label102;
      }
      if (locala == d.a.iTt)
      {
        n = 2;
        break label102;
      }
      if (locala == d.a.iTw)
      {
        n = 8;
        break label102;
      }
      if (locala == d.a.iTu)
      {
        n = 9;
        break label102;
      }
      if (locala == d.a.iTv)
      {
        n = 10;
        break label102;
      }
      ab.e("MicroMsg.AppBrandNetWork.Draft_10", "Don't know how to handle force close" + locala.toString());
      n = 8;
      break label102;
      label386: i1 = 0;
      break label115;
      label392: i = 0;
      break label156;
      label397: if (m == 2)
      {
        if (k != 0);
        while (true)
        {
          localByteBuffer2.put((byte)(i | 0x7E));
          localByteBuffer2.put(paramd);
          break;
          i = 0;
        }
      }
      if (m == 8)
      {
        if (k != 0);
        while (true)
        {
          localByteBuffer2.put((byte)(i | 0x7F));
          localByteBuffer2.put(paramd);
          break;
          i = 0;
        }
      }
      ab.e("MicroMsg.AppBrandNetWork.Draft_10", "Size representation not supported/specified");
    }
    label483: localByteBuffer2.put(localByteBuffer1);
    localByteBuffer2.flip();
    AppMethodBeat.o(73237);
    return localByteBuffer2;
  }

  public final void reset()
  {
    this.iTj = null;
  }

  public final List<com.tencent.mm.plugin.appbrand.t.d.d> x(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(73243);
    while (true)
    {
      Object localObject = new LinkedList();
      if (this.iTj != null);
      try
      {
        paramByteBuffer.mark();
        int i = paramByteBuffer.remaining();
        int j = this.iTj.remaining();
        if (j > i)
        {
          this.iTj.put(paramByteBuffer.array(), paramByteBuffer.position(), i);
          paramByteBuffer.position(i + paramByteBuffer.position());
          localObject = Collections.emptyList();
          paramByteBuffer = (ByteBuffer)localObject;
          AppMethodBeat.o(73243);
        }
        while (true)
        {
          return paramByteBuffer;
          this.iTj.put(paramByteBuffer.array(), paramByteBuffer.position(), j);
          paramByteBuffer.position(paramByteBuffer.position() + j);
          ((List)localObject).add(z((ByteBuffer)this.iTj.duplicate().position(0)));
          this.iTj = null;
          while (paramByteBuffer.hasRemaining())
          {
            paramByteBuffer.mark();
            try
            {
              ((List)localObject).add(z(paramByteBuffer));
            }
            catch (b.a locala2)
            {
              paramByteBuffer.reset();
              this.iTj = ByteBuffer.allocate(qe(locala2.iTm));
              this.iTj.put(paramByteBuffer);
            }
          }
          AppMethodBeat.o(73243);
          paramByteBuffer = (ByteBuffer)localObject;
        }
      }
      catch (b.a locala1)
      {
        this.iTj.limit();
        ByteBuffer localByteBuffer = ByteBuffer.allocate(qe(locala1.iTm));
        this.iTj.rewind();
        localByteBuffer.put(this.iTj);
        this.iTj = localByteBuffer;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.b.b
 * JD-Core Version:    0.6.2
 */
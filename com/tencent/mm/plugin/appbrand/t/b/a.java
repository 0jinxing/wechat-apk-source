package com.tencent.mm.plugin.appbrand.t.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.t.d.d.a;
import com.tencent.mm.plugin.appbrand.t.e.c;
import com.tencent.mm.plugin.appbrand.t.e.e;
import com.tencent.mm.plugin.appbrand.t.e.f;
import com.tencent.mm.plugin.appbrand.t.e.h;
import com.tencent.mm.plugin.appbrand.t.e.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class a
{
  public static int iSY = 1000;
  public static int iSZ = 64;
  public static final byte[] iTa = com.tencent.mm.plugin.appbrand.t.f.b.Es("");
  protected com.tencent.mm.plugin.appbrand.t.a.b iSF = null;
  protected d.a iTb = null;

  public static List<ByteBuffer> e(f paramf)
  {
    return f(paramf);
  }

  public static List<ByteBuffer> f(f paramf)
  {
    StringBuilder localStringBuilder = new StringBuilder(100);
    if ((paramf instanceof com.tencent.mm.plugin.appbrand.t.e.a))
    {
      localStringBuilder.append("GET ");
      localStringBuilder.append(((com.tencent.mm.plugin.appbrand.t.e.a)paramf).aOu());
      localStringBuilder.append(" HTTP/1.1");
    }
    while (true)
    {
      localStringBuilder.append("\r\n");
      localObject1 = paramf.aOx();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        String str = paramf.Eq((String)localObject2);
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append(": ");
        localStringBuilder.append(str);
        localStringBuilder.append("\r\n");
      }
      if ((paramf instanceof h))
      {
        localStringBuilder.append("HTTP/1.1 101 " + ((h)paramf).aOv());
      }
      else
      {
        localStringBuilder.append("GET ");
        localStringBuilder.append(((com.tencent.mm.plugin.appbrand.t.e.a)paramf).aOu());
        localStringBuilder.append(" HTTP/1.1");
        ab.e("MicroMsg.AppBrandNetWork.Draft", "unknow role");
      }
    }
    localStringBuilder.append("\r\n");
    Object localObject1 = com.tencent.mm.plugin.appbrand.t.f.b.Et(localStringBuilder.toString());
    Object localObject2 = paramf.aOy();
    if (localObject2 == null);
    for (int i = 0; ; i = localObject2.length)
    {
      paramf = ByteBuffer.allocate(i + localObject1.length);
      paramf.put((byte[])localObject1);
      if (localObject2 != null)
        paramf.put((byte[])localObject2);
      paramf.flip();
      return Collections.singletonList(paramf);
    }
  }

  public static int qe(int paramInt)
  {
    if (paramInt < 0)
      throw new com.tencent.mm.plugin.appbrand.t.c.b("Negative count");
    return paramInt;
  }

  private static String w(ByteBuffer paramByteBuffer)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramByteBuffer.remaining());
    byte b;
    for (int i = 48; ; i = b)
    {
      if (paramByteBuffer.hasRemaining())
      {
        b = paramByteBuffer.get();
        localByteBuffer.put(b);
        if ((i != 13) || (b != 10))
          continue;
        localByteBuffer.limit(localByteBuffer.position() - 2);
        localByteBuffer.position(0);
        paramByteBuffer = localByteBuffer;
        if (paramByteBuffer != null)
          break label87;
      }
      label87: for (paramByteBuffer = null; ; paramByteBuffer = com.tencent.mm.plugin.appbrand.t.f.b.H(paramByteBuffer.array(), paramByteBuffer.limit()))
      {
        return paramByteBuffer;
        paramByteBuffer.position(paramByteBuffer.position() - localByteBuffer.position());
        paramByteBuffer = null;
        break;
      }
    }
  }

  public abstract a.b a(com.tencent.mm.plugin.appbrand.t.e.a parama, h paramh);

  public abstract com.tencent.mm.plugin.appbrand.t.e.b a(com.tencent.mm.plugin.appbrand.t.e.b paramb);

  public abstract c a(com.tencent.mm.plugin.appbrand.t.e.a parama, i parami);

  public abstract List<com.tencent.mm.plugin.appbrand.t.d.d> a(ByteBuffer paramByteBuffer, boolean paramBoolean);

  public final void a(com.tencent.mm.plugin.appbrand.t.a.b paramb)
  {
    this.iSF = paramb;
  }

  public abstract a aOl();

  public abstract a aOm();

  public abstract List<com.tencent.mm.plugin.appbrand.t.d.d> ar(String paramString, boolean paramBoolean);

  public abstract a.b c(com.tencent.mm.plugin.appbrand.t.e.a parama);

  public abstract ByteBuffer d(com.tencent.mm.plugin.appbrand.t.d.d paramd);

  public abstract void reset();

  public abstract List<com.tencent.mm.plugin.appbrand.t.d.d> x(ByteBuffer paramByteBuffer);

  public final f y(ByteBuffer paramByteBuffer)
  {
    Object localObject1 = this.iSF;
    Object localObject2 = w(paramByteBuffer);
    if (localObject2 == null)
      throw new com.tencent.mm.plugin.appbrand.t.c.a(paramByteBuffer.capacity() + 128);
    localObject2 = ((String)localObject2).split(" ", 3);
    if (localObject2.length != 3)
      throw new com.tencent.mm.plugin.appbrand.t.c.d();
    if (localObject1 == com.tencent.mm.plugin.appbrand.t.a.b.iSq)
    {
      localObject1 = new e();
      i locali = (i)localObject1;
      locali.a(Short.parseShort(localObject2[1]));
      locali.Ep(localObject2[2]);
    }
    while (true)
    {
      localObject2 = w(paramByteBuffer);
      if ((localObject2 == null) || (((String)localObject2).length() <= 0))
        break;
      localObject2 = ((String)localObject2).split(":", 2);
      if (localObject2.length != 2)
      {
        throw new com.tencent.mm.plugin.appbrand.t.c.d("not an http header");
        localObject1 = new com.tencent.mm.plugin.appbrand.t.e.d();
        ((com.tencent.mm.plugin.appbrand.t.e.b)localObject1).Eo(localObject2[1]);
      }
      else
      {
        ((c)localObject1).put(localObject2[0], localObject2[1].replaceFirst("^ +", ""));
      }
    }
    if (localObject2 == null)
      throw new com.tencent.mm.plugin.appbrand.t.c.a();
    return localObject1;
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(73229);
      iTc = new a("NONE", 0);
      iTd = new a("ONEWAY", 1);
      iTe = new a("TWOWAY", 2);
      iTf = new a[] { iTc, iTd, iTe };
      AppMethodBeat.o(73229);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.b.a
 * JD-Core Version:    0.6.2
 */
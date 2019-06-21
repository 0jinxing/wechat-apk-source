package a.i.b.a.c.g;

import java.io.IOException;
import java.io.InputStream;

public abstract class b<MessageType extends q>
  implements s<MessageType>
{
  private static final g Bzm = g.eif();

  private MessageType a(d paramd, g paramg)
  {
    try
    {
      e locale = paramd.ehR();
      paramd = (q)a(locale, paramg);
      try
      {
        locale.fm(0);
        return paramd;
      }
      catch (k paramg)
      {
        paramg.BzY = paramd;
        throw paramg;
      }
    }
    catch (k paramd)
    {
    }
    throw paramd;
  }

  private static MessageType a(MessageType paramMessageType)
  {
    if ((paramMessageType != null) && (!paramMessageType.isInitialized()))
    {
      if ((paramMessageType instanceof a));
      for (Object localObject = new w(); ; localObject = new w())
      {
        localObject = new k(((w)localObject).getMessage());
        ((k)localObject).BzY = paramMessageType;
        throw ((Throwable)localObject);
      }
    }
    return paramMessageType;
  }

  private MessageType f(InputStream paramInputStream, g paramg)
  {
    e locale = e.S(paramInputStream);
    paramInputStream = (q)a(locale, paramg);
    try
    {
      locale.fm(0);
      return paramInputStream;
    }
    catch (k paramg)
    {
      paramg.BzY = paramInputStream;
    }
    throw paramg;
  }

  private MessageType g(InputStream paramInputStream, g paramg)
  {
    return a(f(paramInputStream, paramg));
  }

  private MessageType h(InputStream paramInputStream, g paramg)
  {
    while (true)
    {
      int j;
      int m;
      try
      {
        i = paramInputStream.read();
        if (i == -1)
        {
          paramInputStream = null;
          return paramInputStream;
        }
        if ((i & 0x80) == 0)
        {
          paramInputStream = f(new a.a.a(paramInputStream, i), paramg);
          continue;
        }
        i &= 127;
        j = 7;
        k = j;
        if (j >= 32)
          break label125;
        m = paramInputStream.read();
        if (m == -1)
          throw k.eiq();
      }
      catch (IOException paramInputStream)
      {
        throw new k(paramInputStream.getMessage());
      }
      int k = i | (m & 0x7F) << j;
      int i = k;
      if ((m & 0x80) != 0)
      {
        j += 7;
        i = k;
        continue;
        label125: 
        do
        {
          k += 7;
          if (k >= 64)
            break;
          j = paramInputStream.read();
          if (j == -1)
            throw k.eiq();
        }
        while ((j & 0x80) != 0);
      }
    }
    throw k.eis();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.b
 * JD-Core Version:    0.6.2
 */
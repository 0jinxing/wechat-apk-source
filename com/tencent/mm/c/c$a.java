package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

final class c$a
{
  Properties cdr;
  byte[] cds;

  private c$a()
  {
    AppMethodBeat.i(125710);
    this.cdr = new Properties();
    AppMethodBeat.o(125710);
  }

  final byte[] AL()
  {
    AppMethodBeat.i(125712);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    Iterator localIterator;
    if (this.cdr.size() > 0)
    {
      localByteArrayOutputStream.write(c.AJ().getBytes());
      localIterator = this.cdr.keySet().iterator();
    }
    Object localObject2;
    for (Object localObject1 = ""; ; localObject1 = localObject1 + localObject2 + "=" + this.cdr.getProperty((String)localObject2) + "\r\n")
    {
      if (!localIterator.hasNext())
      {
        localObject1 = ((String)localObject1).getBytes();
        localByteArrayOutputStream.write(new l(localObject1.length).getBytes());
        localByteArrayOutputStream.write((byte[])localObject1);
        if ((this.cds != null) && (this.cds.length > 0))
        {
          localByteArrayOutputStream.write(c.AK().getBytes());
          localByteArrayOutputStream.write(new l(this.cds.length).getBytes());
          localByteArrayOutputStream.write(this.cds);
        }
        localObject1 = localByteArrayOutputStream.toByteArray();
        AppMethodBeat.o(125712);
        return localObject1;
      }
      localObject2 = localIterator.next();
    }
  }

  final void E(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(125711);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(125711);
    while (true)
    {
      return;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
      c.AJ();
      byte[] arrayOfByte = new byte[4];
      localByteBuffer.get(arrayOfByte);
      System.out.println("securityPart: " + new k(arrayOfByte).value);
      int i;
      if (c.AJ().equals(new k(arrayOfByte)))
      {
        if (paramArrayOfByte.length - 4 <= 2)
        {
          System.err.println("data.length - securityMarkLength <= 2");
          AppMethodBeat.o(125711);
        }
        else
        {
          arrayOfByte = new byte[2];
          localByteBuffer.get(arrayOfByte);
          i = new l(arrayOfByte).value;
          if (paramArrayOfByte.length - 4 - 2 < i)
          {
            System.err.println("data.length - securityMarkLength - 2 < len");
            System.err.println("exit");
            AppMethodBeat.o(125711);
          }
          else
          {
            arrayOfByte = new byte[i];
            localByteBuffer.get(arrayOfByte);
            this.cdr.load(new ByteArrayInputStream(arrayOfByte));
            i = paramArrayOfByte.length - 4 - i - 2;
            if (i > 0)
            {
              c.AK();
              paramArrayOfByte = new byte[4];
              localByteBuffer.get(paramArrayOfByte);
              if (c.AK().equals(new k(paramArrayOfByte)))
              {
                if (i - 4 <= 2)
                {
                  System.err.println("data.length - oriMarkLength <= 2");
                  AppMethodBeat.o(125711);
                  continue;
                }
                paramArrayOfByte = new byte[2];
                localByteBuffer.get(paramArrayOfByte);
                int j = new l(paramArrayOfByte).value;
                if (i - 4 - 2 < j)
                {
                  System.err.println("data.length - oriMarkLength - 2 < len");
                  System.err.println("exit");
                  AppMethodBeat.o(125711);
                  continue;
                }
                this.cds = new byte[j];
                localByteBuffer.get(this.cds);
                AppMethodBeat.o(125711);
              }
            }
          }
        }
      }
      else if (c.AK().equals(new k(arrayOfByte)))
      {
        c.AK();
        if (paramArrayOfByte.length - 4 <= 2)
        {
          System.err.println("data.length - oriMarkLength <= 2");
          AppMethodBeat.o(125711);
        }
        else
        {
          arrayOfByte = new byte[2];
          localByteBuffer.get(arrayOfByte);
          i = new l(arrayOfByte).value;
          if (paramArrayOfByte.length - 4 - 2 < i)
          {
            System.err.println("data.length - oriMarkLength - 2 < len");
            System.err.println("exit");
            AppMethodBeat.o(125711);
          }
          else
          {
            this.cds = new byte[i];
            localByteBuffer.get(this.cds);
            AppMethodBeat.o(125711);
          }
        }
      }
      else
      {
        paramArrayOfByte = new ProtocolException("unknow protocl [" + Arrays.toString(paramArrayOfByte) + "]");
        AppMethodBeat.o(125711);
        throw paramArrayOfByte;
        AppMethodBeat.o(125711);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.c.a
 * JD-Core Version:    0.6.2
 */
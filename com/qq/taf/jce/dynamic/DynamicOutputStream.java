package com.qq.taf.jce.dynamic;

import com.qq.taf.jce.JceDecodeException;
import com.qq.taf.jce.JceOutputStream;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public final class DynamicOutputStream extends JceOutputStream
{
  public DynamicOutputStream()
  {
  }

  public DynamicOutputStream(int paramInt)
  {
    super(paramInt);
  }

  public DynamicOutputStream(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }

  public final void write(JceField paramJceField)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(117019);
    int k = paramJceField.getTag();
    if ((paramJceField instanceof ZeroField))
    {
      write(0, k);
      AppMethodBeat.o(117019);
    }
    while (true)
    {
      return;
      if ((paramJceField instanceof IntField))
      {
        write(((IntField)paramJceField).get(), k);
        AppMethodBeat.o(117019);
      }
      else if ((paramJceField instanceof ShortField))
      {
        write(((ShortField)paramJceField).get(), k);
        AppMethodBeat.o(117019);
      }
      else if ((paramJceField instanceof ByteField))
      {
        write(((ByteField)paramJceField).get(), k);
        AppMethodBeat.o(117019);
      }
      else if ((paramJceField instanceof StringField))
      {
        write(((StringField)paramJceField).get(), k);
        AppMethodBeat.o(117019);
      }
      else if ((paramJceField instanceof ByteArrayField))
      {
        write(((ByteArrayField)paramJceField).get(), k);
        AppMethodBeat.o(117019);
      }
      else
      {
        if ((paramJceField instanceof ListField))
        {
          paramJceField = (ListField)paramJceField;
          reserve(8);
          writeHead((byte)9, k);
          write(paramJceField.size(), 0);
          paramJceField = paramJceField.get();
          i = paramJceField.length;
          while (true)
          {
            if (j >= i)
            {
              AppMethodBeat.o(117019);
              break;
            }
            write(paramJceField[j]);
            j++;
          }
        }
        if ((paramJceField instanceof MapField))
        {
          paramJceField = (MapField)paramJceField;
          reserve(8);
          writeHead((byte)8, k);
          k = paramJceField.size();
          write(k, 0);
          for (j = i; ; j++)
          {
            if (j >= k)
            {
              AppMethodBeat.o(117019);
              break;
            }
            write(paramJceField.getKey(j));
            write(paramJceField.getValue(j));
          }
        }
        if ((paramJceField instanceof StructField))
        {
          paramJceField = (StructField)paramJceField;
          reserve(2);
          writeHead((byte)10, k);
          paramJceField = paramJceField.get();
          i = paramJceField.length;
          for (j = 0; ; j++)
          {
            if (j >= i)
            {
              reserve(2);
              writeHead((byte)11, 0);
              AppMethodBeat.o(117019);
              break;
            }
            write(paramJceField[j]);
          }
        }
        if ((paramJceField instanceof LongField))
        {
          write(((LongField)paramJceField).get(), k);
          AppMethodBeat.o(117019);
        }
        else if ((paramJceField instanceof FloatField))
        {
          write(((FloatField)paramJceField).get(), k);
          AppMethodBeat.o(117019);
        }
        else
        {
          if (!(paramJceField instanceof DoubleField))
            break;
          write(((DoubleField)paramJceField).get(), k);
          AppMethodBeat.o(117019);
        }
      }
    }
    paramJceField = new JceDecodeException("unknow JceField type: " + paramJceField.getClass().getName());
    AppMethodBeat.o(117019);
    throw paramJceField;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.DynamicOutputStream
 * JD-Core Version:    0.6.2
 */
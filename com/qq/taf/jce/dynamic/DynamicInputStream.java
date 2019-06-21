package com.qq.taf.jce.dynamic;

import com.qq.taf.jce.JceDecodeException;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceInputStream.HeadData;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class DynamicInputStream
{
  private ByteBuffer bs;
  private String sServerEncoding;

  public DynamicInputStream(ByteBuffer paramByteBuffer)
  {
    this.sServerEncoding = "GBK";
    this.bs = paramByteBuffer;
  }

  public DynamicInputStream(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(117033);
    this.sServerEncoding = "GBK";
    this.bs = ByteBuffer.wrap(paramArrayOfByte);
    AppMethodBeat.o(117033);
  }

  private JceField readString(JceInputStream.HeadData paramHeadData, int paramInt)
  {
    AppMethodBeat.i(117035);
    byte[] arrayOfByte = new byte[paramInt];
    this.bs.get(arrayOfByte);
    try
    {
      String str1 = new java/lang/String;
      str1.<init>(arrayOfByte, this.sServerEncoding);
      paramHeadData = JceField.create(str1, paramHeadData.tag);
      AppMethodBeat.o(117035);
      return paramHeadData;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        String str2 = new String(arrayOfByte);
    }
  }

  public final JceField read()
  {
    int i = 0;
    AppMethodBeat.i(117034);
    try
    {
      Object localObject1 = new com/qq/taf/jce/JceInputStream$HeadData;
      ((JceInputStream.HeadData)localObject1).<init>();
      JceInputStream.readHead((JceInputStream.HeadData)localObject1, this.bs);
      int j = ((JceInputStream.HeadData)localObject1).type;
      switch (j)
      {
      default:
        AppMethodBeat.o(117034);
        localObject1 = null;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        while (true)
        {
          return localObject1;
          localObject1 = JceField.create(this.bs.get(), ((JceInputStream.HeadData)localObject1).tag);
          AppMethodBeat.o(117034);
          continue;
          localObject1 = JceField.create(this.bs.getShort(), ((JceInputStream.HeadData)localObject1).tag);
          AppMethodBeat.o(117034);
          continue;
          localObject1 = JceField.create(this.bs.getInt(), ((JceInputStream.HeadData)localObject1).tag);
          AppMethodBeat.o(117034);
          continue;
          localObject1 = JceField.create(this.bs.getLong(), ((JceInputStream.HeadData)localObject1).tag);
          AppMethodBeat.o(117034);
          continue;
          localObject1 = JceField.create(this.bs.getFloat(), ((JceInputStream.HeadData)localObject1).tag);
          AppMethodBeat.o(117034);
          continue;
          localObject1 = JceField.create(this.bs.getDouble(), ((JceInputStream.HeadData)localObject1).tag);
          AppMethodBeat.o(117034);
          continue;
          j = this.bs.get();
          i = j;
          if (j < 0)
            i = j + 256;
          localObject1 = readString((JceInputStream.HeadData)localObject1, i);
          AppMethodBeat.o(117034);
          continue;
          localObject1 = readString((JceInputStream.HeadData)localObject1, this.bs.getInt());
          AppMethodBeat.o(117034);
        }
      case 9:
        j = ((NumberField)read()).intValue();
        localObject3 = new JceField[j];
        while (true)
        {
          if (i >= j)
          {
            localObject1 = JceField.createList((JceField[])localObject3, ((JceInputStream.HeadData)localObject1).tag);
            AppMethodBeat.o(117034);
            break;
          }
          localObject3[i] = read();
          i++;
        }
      case 8:
        j = ((NumberField)read()).intValue();
        localObject4 = new JceField[j];
        localObject3 = new JceField[j];
        for (i = 0; ; i++)
        {
          if (i >= j)
          {
            localObject1 = JceField.createMap((JceField[])localObject4, (JceField[])localObject3, ((JceInputStream.HeadData)localObject1).tag);
            AppMethodBeat.o(117034);
            break;
          }
          localObject4[i] = read();
          localObject3[i] = read();
        }
      case 10:
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        while (true)
        {
          localObject4 = read();
          if (localObject4 == null)
            break;
          ((List)localObject3).add(localObject4);
        }
      case 11:
      case 12:
      case 13:
      }
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      while (true)
      {
        Object localObject3;
        Object localObject4;
        AppMethodBeat.o(117034);
        Object localObject2 = null;
        continue;
        localObject2 = JceField.createStruct((JceField[])((List)localObject3).toArray(new JceField[0]), ((JceInputStream.HeadData)localObject2).tag);
        AppMethodBeat.o(117034);
        continue;
        AppMethodBeat.o(117034);
        localObject2 = null;
        continue;
        localObject2 = JceField.createZero(((JceInputStream.HeadData)localObject2).tag);
        AppMethodBeat.o(117034);
        continue;
        i = ((JceInputStream.HeadData)localObject2).tag;
        JceInputStream.readHead((JceInputStream.HeadData)localObject2, this.bs);
        if (((JceInputStream.HeadData)localObject2).type != 0)
        {
          localObject4 = new com/qq/taf/jce/JceDecodeException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("type mismatch, simple_list only support byte, tag: ");
          ((JceDecodeException)localObject4).<init>(i + ", type: " + ((JceInputStream.HeadData)localObject2).type);
          AppMethodBeat.o(117034);
          throw ((Throwable)localObject4);
        }
        localObject2 = new byte[((NumberField)read()).intValue()];
        this.bs.get((byte[])localObject2);
        localObject2 = JceField.create((byte[])localObject2, i);
        AppMethodBeat.o(117034);
      }
    }
  }

  public final int setServerEncoding(String paramString)
  {
    this.sServerEncoding = paramString;
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.DynamicInputStream
 * JD-Core Version:    0.6.2
 */
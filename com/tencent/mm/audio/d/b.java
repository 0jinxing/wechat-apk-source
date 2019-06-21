package com.tencent.mm.audio.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b
{
  private OutputStream crl;
  private int crm;
  public String mFilePath;

  public b(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55762);
    this.mFilePath = paramString;
    try
    {
      this.crl = e.L(paramString, false);
      paramString = ByteBuffer.allocate(44);
      paramString.order(ByteOrder.LITTLE_ENDIAN);
      paramString.putInt(1179011410);
      paramString.putInt(0);
      paramString.putInt(1163280727);
      paramString.putInt(544501094);
      paramString.putInt(16);
      paramString.putShort((short)1);
      paramString.putShort((short)paramInt1);
      paramString.putInt(paramInt2);
      paramString.putInt(paramInt2 * paramInt1 * 2);
      paramString.putShort((short)(paramInt1 * 2));
      paramString.putShort((short)16);
      paramString.putInt(1635017060);
      paramString.putInt(0);
      this.crm = 44;
      this.crl.write(paramString.array());
      AppMethodBeat.o(55762);
      return;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.PcmWriter", "create file failed: " + paramString.getMessage());
        AppMethodBeat.o(55762);
      }
    }
  }

  public final void Fg()
  {
    AppMethodBeat.i(55764);
    try
    {
      this.crl.close();
      localObject1 = null;
      localObject2 = null;
      localObject4 = null;
    }
    catch (IOException localIOException1)
    {
      try
      {
        while (true)
        {
          RandomAccessFile localRandomAccessFile = e.ck(this.mFilePath, true);
          localObject4 = localRandomAccessFile;
          Object localObject1 = localRandomAccessFile;
          Object localObject2 = localRandomAccessFile;
          localRandomAccessFile.seek(4L);
          localObject4 = localRandomAccessFile;
          localObject1 = localRandomAccessFile;
          localObject2 = localRandomAccessFile;
          ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
          localObject4 = localRandomAccessFile;
          localObject1 = localRandomAccessFile;
          localObject2 = localRandomAccessFile;
          localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
          localObject4 = localRandomAccessFile;
          localObject1 = localRandomAccessFile;
          localObject2 = localRandomAccessFile;
          localByteBuffer.putInt(this.crm - 8);
          localObject4 = localRandomAccessFile;
          localObject1 = localRandomAccessFile;
          localObject2 = localRandomAccessFile;
          localRandomAccessFile.write(localByteBuffer.array());
          localObject4 = localRandomAccessFile;
          localObject1 = localRandomAccessFile;
          localObject2 = localRandomAccessFile;
          localByteBuffer.rewind();
          localObject4 = localRandomAccessFile;
          localObject1 = localRandomAccessFile;
          localObject2 = localRandomAccessFile;
          localByteBuffer.putInt(this.crm - 42);
          localObject4 = localRandomAccessFile;
          localObject1 = localRandomAccessFile;
          localObject2 = localRandomAccessFile;
          localRandomAccessFile.seek(40L);
          localObject4 = localRandomAccessFile;
          localObject1 = localRandomAccessFile;
          localObject2 = localRandomAccessFile;
          localRandomAccessFile.write(localByteBuffer.array());
          if (localRandomAccessFile != null)
            try
            {
              localRandomAccessFile.close();
              AppMethodBeat.o(55764);
              return;
              localIOException1 = localIOException1;
              ab.e("MicroMsg.PcmWriter", "close file failed: " + localIOException1.getMessage());
            }
            catch (IOException localIOException2)
            {
              while (true)
              {
                ab.printErrStackTrace("MicroMsg.PcmWriter", localIOException2, "", new Object[0]);
                AppMethodBeat.o(55764);
              }
            }
        }
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        while (true)
        {
          Object localObject4;
          Object localObject3 = localObject4;
          ab.printErrStackTrace("MicroMsg.PcmWriter", localFileNotFoundException1, "", new Object[0]);
          if (localObject4 == null)
            break;
          try
          {
            localObject4.close();
            AppMethodBeat.o(55764);
          }
          catch (IOException localIOException3)
          {
            ab.printErrStackTrace("MicroMsg.PcmWriter", localIOException3, "", new Object[0]);
            AppMethodBeat.o(55764);
          }
        }
      }
      catch (IOException localIOException6)
      {
        while (true)
        {
          FileNotFoundException localFileNotFoundException2 = localFileNotFoundException1;
          ab.printErrStackTrace("MicroMsg.PcmWriter", localIOException6, "", new Object[0]);
          if (localFileNotFoundException1 == null)
            break;
          try
          {
            localFileNotFoundException1.close();
            AppMethodBeat.o(55764);
          }
          catch (IOException localIOException4)
          {
            ab.printErrStackTrace("MicroMsg.PcmWriter", localIOException4, "", new Object[0]);
            AppMethodBeat.o(55764);
          }
        }
      }
      finally
      {
        while (true)
        {
          if (localIOException4 != null);
          try
          {
            localIOException4.close();
            AppMethodBeat.o(55764);
            throw localObject5;
          }
          catch (IOException localIOException5)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.PcmWriter", localIOException5, "", new Object[0]);
          }
          AppMethodBeat.o(55764);
        }
      }
    }
  }

  public final boolean y(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(55763);
    if (this.crl == null)
      AppMethodBeat.o(55763);
    while (true)
    {
      return bool;
      try
      {
        this.crl.write(paramArrayOfByte, 0, paramInt);
        this.crm += paramInt;
        bool = true;
        AppMethodBeat.o(55763);
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.PcmWriter", "write to file failed: " + paramArrayOfByte.getMessage());
        AppMethodBeat.o(55763);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.d.b
 * JD-Core Version:    0.6.2
 */
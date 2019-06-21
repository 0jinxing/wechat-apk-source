package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WaveWriter
{
  private static final int OUTPUT_STREAM_BUFFER = 16384;
  private static final String TAG = "WaveWriter";
  private int mBytesWritten;
  private int mChannels;
  private File mOutFile;
  private BufferedOutputStream mOutStream;
  private int mSampleBits;
  private int mSampleRate;
  private ByteArrayOutputStream mTmpStream;

  public WaveWriter(File paramFile, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mOutFile = paramFile;
    this.mSampleRate = paramInt1;
    this.mChannels = paramInt2;
    this.mSampleBits = paramInt3;
    this.mBytesWritten = 0;
  }

  public WaveWriter(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(104700);
    this.mOutFile = new File(paramString1 + File.separator + paramString2);
    this.mSampleRate = paramInt1;
    this.mChannels = paramInt2;
    this.mSampleBits = paramInt3;
    this.mBytesWritten = 0;
    AppMethodBeat.o(104700);
  }

  private short[] interpolate(int paramInt1, int paramInt2, short[] paramArrayOfShort)
  {
    AppMethodBeat.i(104711);
    if (paramInt1 == paramInt2)
      AppMethodBeat.o(104711);
    while (true)
    {
      return paramArrayOfShort;
      int i = Math.round(paramArrayOfShort.length / paramInt1 * paramInt2);
      float f1 = i / paramArrayOfShort.length;
      short[] arrayOfShort = new short[i];
      for (paramInt1 = 0; paramInt1 < i; paramInt1++)
      {
        float f2 = paramInt1 / f1;
        int j = (int)f2;
        int k = j + 1;
        paramInt2 = k;
        if (k >= paramArrayOfShort.length)
          paramInt2 = paramArrayOfShort.length - 1;
        arrayOfShort[paramInt1] = ((short)(short)(int)((paramArrayOfShort[paramInt2] - paramArrayOfShort[j]) * (f2 - j) + paramArrayOfShort[j]));
      }
      AppMethodBeat.o(104711);
      paramArrayOfShort = arrayOfShort;
    }
  }

  private byte[] reSample(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(104710);
    int k = paramInt1 / 8;
    if (k <= 0)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(104710);
      return paramArrayOfByte;
    }
    int m = paramArrayOfByte.length / k;
    short[] arrayOfShort = new short[m];
    paramInt1 = 0;
    int n = 0;
    while (paramInt1 < m)
    {
      int i1 = 0;
      int i2 = 0;
      while (i1 < k)
      {
        i2 = (short)(i2 | (short)((paramArrayOfByte[n] & 0xFF) << i1 * 8));
        i1++;
        n++;
      }
      arrayOfShort[paramInt1] = ((short)i2);
      paramInt1++;
    }
    arrayOfShort = interpolate(paramInt2, paramInt3, arrayOfShort);
    paramInt2 = arrayOfShort.length;
    if (k == 1)
    {
      paramArrayOfByte = new byte[paramInt2];
      for (paramInt1 = j; paramInt1 < paramInt2; paramInt1++)
        paramArrayOfByte[paramInt1] = ((byte)(byte)arrayOfShort[paramInt1]);
    }
    while (true)
    {
      this.mSampleRate = paramInt3;
      AppMethodBeat.o(104710);
      break;
      paramArrayOfByte = new byte[paramInt2 * 2];
      for (paramInt1 = i; paramInt1 < arrayOfShort.length; paramInt1++)
      {
        paramArrayOfByte[(paramInt1 * 2)] = ((byte)(byte)(arrayOfShort[paramInt1] & 0xFF));
        paramArrayOfByte[(paramInt1 * 2 + 1)] = ((byte)(byte)(arrayOfShort[paramInt1] >> 8 & 0xFF));
      }
    }
  }

  private static void writeUnsignedShortLE(ByteArrayOutputStream paramByteArrayOutputStream, short paramShort)
  {
    AppMethodBeat.i(104701);
    paramByteArrayOutputStream.write(paramShort);
    paramByteArrayOutputStream.write(paramShort >> 8);
    AppMethodBeat.o(104701);
  }

  private void writeWaveHeader()
  {
    AppMethodBeat.i(104706);
    RandomAccessFile localRandomAccessFile = new RandomAccessFile(this.mOutFile, "rw");
    localRandomAccessFile.seek(0L);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    int i = (this.mSampleBits + 7) / 8;
    try
    {
      localDataOutputStream.writeBytes("RIFF");
      localDataOutputStream.writeInt(Integer.reverseBytes(this.mBytesWritten + 36));
      localDataOutputStream.writeBytes("WAVE");
      localDataOutputStream.writeBytes("fmt ");
      localDataOutputStream.writeInt(Integer.reverseBytes(16));
      localDataOutputStream.writeShort(Short.reverseBytes((short)1));
      localDataOutputStream.writeShort(Short.reverseBytes((short)this.mChannels));
      localDataOutputStream.writeInt(Integer.reverseBytes(this.mSampleRate));
      localDataOutputStream.writeInt(Integer.reverseBytes(this.mSampleRate * this.mChannels * i));
      localDataOutputStream.writeShort(Short.reverseBytes((short)(i * this.mChannels)));
      localDataOutputStream.writeShort(Short.reverseBytes((short)this.mSampleBits));
      localDataOutputStream.writeBytes("data");
      localDataOutputStream.writeInt(Integer.reverseBytes(this.mBytesWritten));
      localByteArrayOutputStream.flush();
      localRandomAccessFile.write(localByteArrayOutputStream.toByteArray());
      return;
    }
    finally
    {
      localByteArrayOutputStream.close();
      localDataOutputStream.close();
      localRandomAccessFile.close();
      AppMethodBeat.o(104706);
    }
  }

  public byte[] changeStereoToMono(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (this.mChannels == 2)
    {
      int i = this.mSampleBits / 8;
      long l = paramArrayOfByte.length / this.mChannels / i;
      arrayOfByte = new byte[(int)(i * l)];
      for (int j = 0; j < l; j++)
        for (int k = 0; k < i; k++)
          arrayOfByte[(j * i + k)] = ((byte)(byte)((paramArrayOfByte[(this.mChannels * j * i + k)] + paramArrayOfByte[((this.mChannels * j + 1) * i + k)]) / 2));
      this.mChannels = 1;
    }
    return arrayOfByte;
  }

  public void closeWaveFile()
  {
    AppMethodBeat.i(104705);
    if (this.mOutStream != null)
    {
      this.mOutStream.flush();
      this.mOutStream.close();
    }
    if (this.mTmpStream != null)
    {
      this.mTmpStream.flush();
      this.mTmpStream.close();
    }
    writeWaveHeader();
    AppMethodBeat.o(104705);
  }

  public boolean createWaveFile()
  {
    AppMethodBeat.i(104702);
    if (this.mOutFile.exists())
      this.mOutFile.delete();
    this.mOutFile.getParentFile().mkdirs();
    boolean bool;
    if (this.mOutFile.createNewFile())
    {
      this.mOutStream = new BufferedOutputStream(new FileOutputStream(this.mOutFile), 16384);
      this.mTmpStream = new ByteArrayOutputStream();
      this.mOutStream.write(new byte[44]);
      bool = true;
      AppMethodBeat.o(104702);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104702);
    }
  }

  public int getChannels()
  {
    return this.mChannels;
  }

  public boolean reSampler()
  {
    boolean bool = false;
    AppMethodBeat.i(104708);
    try
    {
      Object localObject1 = reSample(this.mTmpStream.toByteArray(), this.mSampleBits, this.mSampleRate, 8000);
      if (localObject1 == null)
        AppMethodBeat.o(104708);
      while (true)
      {
        return bool;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("mTmpStream length = ");
        Logger.d("WaveWriter", this.mTmpStream.toByteArray().length);
        localObject1 = changeStereoToMono((byte[])localObject1);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("monoData length = ");
        Logger.d("WaveWriter", localObject1.length);
        localObject2 = reSample((byte[])localObject1, this.mSampleBits, 8000, 4000);
        if (localObject2 == null)
        {
          AppMethodBeat.o(104708);
        }
        else
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("resultData length = ");
          Logger.d("WaveWriter", localObject2.length);
          this.mBytesWritten = localObject2.length;
          this.mOutStream.write((byte[])localObject2);
          bool = true;
          AppMethodBeat.o(104708);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Logger.e("WaveWriter", localThrowable);
        AppMethodBeat.o(104708);
      }
    }
  }

  public boolean reSamplerTo8K()
  {
    boolean bool = false;
    AppMethodBeat.i(104709);
    try
    {
      byte[] arrayOfByte = reSample(this.mTmpStream.toByteArray(), this.mSampleBits, this.mSampleRate, 8000);
      if (arrayOfByte == null)
        AppMethodBeat.o(104709);
      while (true)
      {
        return bool;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("mTmpStream length = ");
        Logger.d("WaveWriter", this.mTmpStream.toByteArray().length);
        arrayOfByte = changeStereoToMono(arrayOfByte);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("resultData length = ");
        Logger.d("WaveWriter", arrayOfByte.length);
        this.mBytesWritten = arrayOfByte.length;
        this.mOutStream.write(arrayOfByte);
        bool = true;
        AppMethodBeat.o(104709);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Logger.e("WaveWriter", localThrowable);
        AppMethodBeat.o(104709);
      }
    }
  }

  public void setSampleByte(int paramInt)
  {
    this.mSampleBits = paramInt;
  }

  public void write(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104703);
    int i = paramInt1;
    if (paramInt1 > paramInt2)
    {
      paramArrayOfShort = new IndexOutOfBoundsException(String.format("offset %d is greater than length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
      AppMethodBeat.o(104703);
      throw paramArrayOfShort;
    }
    while (i < paramInt2)
    {
      writeUnsignedShortLE(this.mTmpStream, paramArrayOfShort[i]);
      this.mBytesWritten += 2;
      i++;
    }
    AppMethodBeat.o(104703);
  }

  public void write(short[] paramArrayOfShort1, short[] paramArrayOfShort2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104704);
    if (this.mChannels != 2)
      AppMethodBeat.o(104704);
    while (true)
    {
      return;
      int i = paramInt1;
      if (paramInt1 > paramInt2)
      {
        paramArrayOfShort1 = new IndexOutOfBoundsException(String.format("offset %d is greater than length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
        AppMethodBeat.o(104704);
        throw paramArrayOfShort1;
      }
      while (i < paramInt2)
      {
        writeUnsignedShortLE(this.mTmpStream, paramArrayOfShort1[i]);
        writeUnsignedShortLE(this.mTmpStream, paramArrayOfShort2[i]);
        this.mBytesWritten += 4;
        i++;
      }
      AppMethodBeat.o(104704);
    }
  }

  public void writeDone()
  {
    AppMethodBeat.i(104707);
    try
    {
      this.mOutStream.write(this.mTmpStream.toByteArray());
      AppMethodBeat.o(104707);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        Logger.e("WaveWriter", localIOException);
        AppMethodBeat.o(104707);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.WaveWriter
 * JD-Core Version:    0.6.2
 */
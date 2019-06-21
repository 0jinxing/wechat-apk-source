package com.tencent.qqmusic.mediaplayer.codec.mp3;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public class MP3FileCheck
{
  private static final String TAG = "MP3FileCheck";
  private byte[] buf;
  private int endPos;
  private boolean eof;
  private int frameCount;
  private boolean hasCheck;
  private boolean hasID3V2;
  private MP3Header header;
  private int headerMask;
  private boolean isMP3;
  private String mFilePath;
  private int mID3V2Size;
  private RandomAccessFile mRandomAccessFile;
  private int pos;
  private int skipped;
  private boolean sync;

  public MP3FileCheck(String paramString)
  {
    AppMethodBeat.i(128565);
    this.hasCheck = false;
    this.mFilePath = null;
    this.mRandomAccessFile = null;
    this.mID3V2Size = -1;
    this.hasID3V2 = false;
    this.header = new MP3Header();
    this.buf = new byte[8192];
    this.isMP3 = false;
    this.mFilePath = paramString;
    AppMethodBeat.o(128565);
  }

  private boolean available(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    if (((paramInt1 & paramInt2) == paramInt2) && ((paramInt1 >> 19 & 0x3) != 1) && ((paramInt1 >> 17 & 0x3) != 0) && ((paramInt1 >> 12 & 0xF) != 15) && ((paramInt1 >> 12 & 0xF) != 0) && ((paramInt1 >> 10 & 0x3) != 3));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private int byte2int(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] << 24 | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 3)] & 0xFF;
  }

  private boolean checkAndSeekID3V2Tag()
  {
    boolean bool = false;
    AppMethodBeat.i(128568);
    byte[] arrayOfByte = new byte[10];
    int i = fillBuffer(arrayOfByte, 0, 10);
    if (i <= 0)
    {
      AppMethodBeat.o(128568);
      return bool;
    }
    if ((arrayOfByte[0] == 73) && (arrayOfByte[1] == 68) && (arrayOfByte[2] == 51))
    {
      this.mID3V2Size = ((arrayOfByte[6] << 21) + (arrayOfByte[7] << 14) + (arrayOfByte[8] << 7) + arrayOfByte[9]);
      this.hasID3V2 = true;
      seekTo(this.mID3V2Size - i);
      Logger.d("MP3FileCheck", "有ID3V2，ID3V2大小 = " + this.mID3V2Size);
    }
    while (true)
    {
      bool = this.hasID3V2;
      AppMethodBeat.o(128568);
      break;
      closeFileStream();
      Logger.d("MP3FileCheck", "没有有ID3V2");
    }
  }

  private void closeFileStream()
  {
    AppMethodBeat.i(128569);
    if (this.mRandomAccessFile != null);
    try
    {
      this.mRandomAccessFile.close();
      this.mRandomAccessFile = null;
      AppMethodBeat.o(128569);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        Logger.e("MP3FileCheck", localIOException);
    }
  }

  private int fillBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(128575);
    try
    {
      if (this.mRandomAccessFile == null)
      {
        RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
        localRandomAccessFile.<init>(this.mFilePath, "r");
        this.mRandomAccessFile = localRandomAccessFile;
      }
      paramInt1 = this.mRandomAccessFile.read(paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(128575);
      return paramInt1;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        paramInt1 = -1;
        AppMethodBeat.o(128575);
      }
    }
  }

  private boolean isMp3File()
  {
    AppMethodBeat.i(128567);
    if (!this.hasCheck)
      fileCheck();
    boolean bool = this.isMP3;
    AppMethodBeat.o(128567);
    return bool;
  }

  public static boolean isMp3File(String paramString)
  {
    AppMethodBeat.i(128566);
    boolean bool = new MP3FileCheck(paramString).isMp3File();
    AppMethodBeat.o(128566);
    return bool;
  }

  private void nextFrameHeader()
  {
    AppMethodBeat.i(128573);
    int k;
    for (int i = 0; (!this.eof) && (!syncFrame()); i = k)
    {
      int j = this.endPos - this.pos;
      if (j > 0)
        System.arraycopy(this.buf, this.pos, this.buf, 0, j);
      this.endPos = (fillBuffer(this.buf, j, this.pos) + j);
      k = i;
      if (this.endPos > j)
      {
        i += this.pos;
        k = i;
        if (i > 65536)
          k = i;
      }
      else
      {
        this.eof = true;
      }
      this.pos = 0;
    }
    AppMethodBeat.o(128573);
  }

  private void seekTo(int paramInt)
  {
    AppMethodBeat.i(128570);
    try
    {
      this.mRandomAccessFile.seek(paramInt);
      AppMethodBeat.o(128570);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Logger.e("MP3FileCheck", localException);
        AppMethodBeat.o(128570);
      }
    }
  }

  private boolean syncFrame()
  {
    AppMethodBeat.i(128574);
    int i = this.pos;
    boolean bool;
    if (this.endPos - this.pos <= 4)
    {
      AppMethodBeat.o(128574);
      bool = false;
      return bool;
    }
    int j = byte2int(this.buf, this.pos);
    this.pos += 4;
    System.out.println(this.frameCount);
    while (true)
    {
      if (!this.eof)
      {
        while (true)
          if (!available(j, this.headerMask))
          {
            arrayOfByte = this.buf;
            k = this.pos;
            this.pos = (k + 1);
            j = j << 8 | arrayOfByte[k] & 0xFF;
            if (this.pos == this.endPos)
            {
              j = this.skipped;
              k = this.pos - 4;
              this.pos = k;
              this.skipped = (j + (k - i));
              AppMethodBeat.o(128574);
              bool = false;
              break;
            }
          }
        if (this.pos > i + 4)
        {
          this.sync = false;
          this.skipped += this.pos - 4 - i;
        }
        this.header.decode(j);
        k = this.header.getFrameSize();
        if (this.pos + k > this.endPos + 4)
        {
          k = this.skipped;
          j = this.pos - 4;
          this.pos = j;
          this.skipped = (k + (j - i));
          AppMethodBeat.o(128574);
          bool = false;
          break;
        }
        if (!this.sync)
        {
          if (this.pos + k > this.endPos)
          {
            k = this.skipped;
            j = this.pos - 4;
            this.pos = j;
            this.skipped = (k + (j - i));
            AppMethodBeat.o(128574);
            bool = false;
            break;
          }
          int m = 0x180000 & j | 0xFFE00000 | 0x60000 & j | j & 0xC00;
          if (!available(byte2int(this.buf, k + (this.pos - 4)), m))
            break label468;
          if (this.headerMask == -2097152)
            this.headerMask = m;
          this.sync = true;
        }
      }
      if (this.header.isProtected())
        this.pos += 2;
      this.frameCount += 1;
      if ((this.skipped > 0) || ((this.skipped == 0) && (this.sync)))
      {
        this.isMP3 = true;
        this.skipped = 0;
      }
      AppMethodBeat.o(128574);
      bool = true;
      break;
      label468: byte[] arrayOfByte = this.buf;
      int k = this.pos;
      this.pos = (k + 1);
      j = j << 8 | arrayOfByte[k] & 0xFF;
    }
  }

  public void fileCheck()
  {
    AppMethodBeat.i(128571);
    try
    {
      this.hasCheck = true;
      checkAndSeekID3V2Tag();
      this.headerMask = -2097152;
      this.sync = false;
      this.eof = false;
      this.frameCount = 0;
      int i = this.buf.length;
      this.pos = i;
      this.endPos = i;
      this.header.initialize();
      nextFrameHeader();
      if (this.mRandomAccessFile != null)
        try
        {
          this.mRandomAccessFile.close();
          AppMethodBeat.o(128571);
          return;
        }
        catch (Exception localException1)
        {
          while (true)
          {
            Logger.e("MP3FileCheck", localException1);
            AppMethodBeat.o(128571);
          }
        }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        Logger.e("MP3FileCheck", localException2);
        if (this.mRandomAccessFile == null)
          break;
        try
        {
          this.mRandomAccessFile.close();
          AppMethodBeat.o(128571);
        }
        catch (Exception localException3)
        {
          Logger.e("MP3FileCheck", localException3);
          AppMethodBeat.o(128571);
        }
      }
    }
    finally
    {
      while (true)
      {
        if (this.mRandomAccessFile != null);
        try
        {
          this.mRandomAccessFile.close();
          AppMethodBeat.o(128571);
          throw localObject;
        }
        catch (Exception localException4)
        {
          while (true)
            Logger.e("MP3FileCheck", localException4);
        }
        AppMethodBeat.o(128571);
      }
    }
  }

  public int getFrameSize()
  {
    AppMethodBeat.i(128572);
    int i;
    if (this.header != null)
    {
      i = this.header.getFrameSize();
      AppMethodBeat.o(128572);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(128572);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.mp3.MP3FileCheck
 * JD-Core Version:    0.6.2
 */
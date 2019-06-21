package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioRecognition;
import com.tencent.qqmusic.mediaplayer.util.StreamUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileDataSource
  implements IDataSource
{
  private long currentPosition;
  private File file;
  private FileInputStream fileInputStream;
  private final String filePath;
  private boolean opened = false;
  private BufferedInputStream readingStream;

  public FileDataSource(String paramString)
  {
    this.filePath = paramString;
  }

  public void close()
  {
    AppMethodBeat.i(128359);
    if (!this.opened)
      AppMethodBeat.o(128359);
    while (true)
    {
      return;
      if (this.fileInputStream != null)
        this.fileInputStream.close();
      if (this.readingStream != null)
        this.readingStream.close();
      this.opened = false;
      AppMethodBeat.o(128359);
    }
  }

  public AudioFormat.AudioType getAudioType()
  {
    AppMethodBeat.i(128358);
    AudioFormat.AudioType localAudioType = AudioRecognition.recognitionAudioFormatExactly(this.filePath);
    AppMethodBeat.o(128358);
    return localAudioType;
  }

  public String getFilePath()
  {
    return this.filePath;
  }

  public long getSize()
  {
    AppMethodBeat.i(128357);
    long l = this.file.length();
    AppMethodBeat.o(128357);
    return l;
  }

  public void open()
  {
    AppMethodBeat.i(128355);
    if (this.opened)
      AppMethodBeat.o(128355);
    while (true)
    {
      return;
      this.opened = true;
      this.file = new File(this.filePath);
      this.fileInputStream = new FileInputStream(this.filePath);
      this.readingStream = new BufferedInputStream(this.fileInputStream);
      this.currentPosition = 0L;
      AppMethodBeat.o(128355);
    }
  }

  public int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(128356);
    long l;
    if (this.currentPosition != paramLong)
      if (this.currentPosition > paramLong)
      {
        this.readingStream.close();
        this.fileInputStream.close();
        this.fileInputStream = new FileInputStream(this.filePath);
        this.readingStream = new BufferedInputStream(this.fileInputStream);
        l = StreamUtils.skipForBufferStream(this.readingStream, paramLong);
        if (l == paramLong)
          break label118;
        paramInt1 = -1;
        AppMethodBeat.o(128356);
      }
    while (true)
    {
      return paramInt1;
      l = this.currentPosition + StreamUtils.skipForBufferStream(this.readingStream, paramLong - this.currentPosition);
      break;
      label118: this.currentPosition = paramLong;
      paramInt1 = this.readingStream.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 >= 0)
        this.currentPosition += paramInt1;
      AppMethodBeat.o(128356);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(128360);
    String str = "(fd)" + this.filePath;
    AppMethodBeat.o(128360);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.FileDataSource
 * JD-Core Version:    0.6.2
 */
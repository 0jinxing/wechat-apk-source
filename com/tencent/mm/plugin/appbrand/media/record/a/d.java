package com.tencent.mm.plugin.appbrand.media.record.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni;
import com.tencent.mm.plugin.appbrand.media.record.h;
import com.tencent.mm.plugin.appbrand.media.record.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class d extends b
{
  private int fQw = 2;
  private byte[] ime;
  private FileOutputStream mFileOutputStream;
  private String mFilePath = "";

  public final boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = true;
    paramBoolean = false;
    AppMethodBeat.i(105653);
    if (this.ima <= 0)
    {
      ab.e("MicroMsg.Record.MP3AudioEncoder", "mMinBufferSize %d is invalid", new Object[] { Integer.valueOf(this.ima) });
      AppMethodBeat.o(105653);
    }
    while (true)
    {
      return paramBoolean;
      if (this.mFileOutputStream != null)
        break;
      ab.e("MicroMsg.Record.MP3AudioEncoder", "mFileOutputStream is null");
      AppMethodBeat.o(105653);
    }
    if (this.ime == null)
    {
      i = (int)(7200.0D + this.ima * this.fQw * 1.25D);
      ab.i("MicroMsg.Record.MP3AudioEncoder", "channelCnt:%d, mMinBufferSize:%d, size:%d, ", new Object[] { Integer.valueOf(this.fQw), Integer.valueOf(this.ima), Integer.valueOf(i) });
      this.ime = new byte[i];
    }
    paramArrayOfByte = h.D(paramArrayOfByte, paramInt);
    int i = Mp3EncodeJni.encode(paramArrayOfByte, paramArrayOfByte, paramInt / 2, this.ime);
    ab.d("MicroMsg.Record.MP3AudioEncoder", "len:%d, shorts.len:%d, encodedSize:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(i) });
    if (i > 0)
      ab.d("MicroMsg.Record.MP3AudioEncoder", "encodeSize:%d, len:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    while (true)
    {
      try
      {
        this.mFileOutputStream.write(this.ime, 0, i);
        e(this.ime, i, false);
        paramBoolean = bool;
        AppMethodBeat.o(105653);
      }
      catch (IOException paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", paramArrayOfByte, "encode write", new Object[0]);
        j.pk(20);
        paramBoolean = false;
        continue;
      }
      ab.e("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni encode fail, encodedSize:%d", new Object[] { Integer.valueOf(i) });
      paramBoolean = false;
    }
  }

  public final void close()
  {
    AppMethodBeat.i(105655);
    ab.i("MicroMsg.Record.MP3AudioEncoder", "close");
    Mp3EncodeJni.close();
    if (this.mFileOutputStream != null);
    try
    {
      this.mFileOutputStream.close();
      this.mFileOutputStream = null;
      AppMethodBeat.o(105655);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", localIOException, "close", new Object[0]);
        j.pk(20);
      }
    }
  }

  public final void flush()
  {
    AppMethodBeat.i(105654);
    ab.i("MicroMsg.Record.MP3AudioEncoder", "flush");
    if ((this.mFileOutputStream == null) || (this.ime == null))
    {
      ab.e("MicroMsg.Record.MP3AudioEncoder", "flush, mFileOutputStream or mMp3Buffer is null");
      AppMethodBeat.o(105654);
    }
    while (true)
    {
      return;
      int i = Mp3EncodeJni.flush(this.ime);
      if (i > 0)
      {
        try
        {
          this.mFileOutputStream.write(this.ime, 0, i);
          e(this.ime, i, true);
          AppMethodBeat.o(105654);
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", localIOException, "flush write", new Object[0]);
          j.pk(20);
          AppMethodBeat.o(105654);
        }
      }
      else
      {
        ab.e("MicroMsg.Record.MP3AudioEncoder", "flush fail, flushResult:%d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(105654);
      }
    }
  }

  public final boolean h(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(105652);
    ab.i("MicroMsg.Record.MP3AudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mFilePath = paramString;
    this.fQw = paramInt2;
    paramInt1 = Mp3EncodeJni.init(paramInt1, paramInt2, paramInt1, paramInt3 / 1000, 5);
    ab.i("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni.init ret :%d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt1 == -1)
    {
      j.pk(17);
      AppMethodBeat.o(105652);
    }
    while (true)
    {
      return bool2;
      ab.i("MicroMsg.Record.MP3AudioEncoder", "lame MPEG version:%d", new Object[] { Integer.valueOf(Mp3EncodeJni.getVersion()) });
      try
      {
        FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
        localFileOutputStream.<init>(paramString);
        this.mFileOutputStream = localFileOutputStream;
        bool2 = bool1;
        AppMethodBeat.o(105652);
      }
      catch (FileNotFoundException paramString)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", paramString, "init", new Object[0]);
          j.pk(18);
          bool2 = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.a.d
 * JD-Core Version:    0.6.2
 */
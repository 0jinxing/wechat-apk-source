package com.tencent.mm.plugin.appbrand.media.a;

import com.tencent.luggage.g.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ag.e;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class d
  implements e
{
  private long currentPosition;
  private String filePath;
  private String gSP;
  public a ikJ;

  public d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137805);
    this.ikJ = null;
    this.filePath = paramString1;
    this.gSP = paramString2;
    this.ikJ = cA(paramString1, paramString2);
    AppMethodBeat.o(137805);
  }

  private static a cA(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137807);
    long l = System.nanoTime();
    if (bo.isNullOrNil(paramString2))
    {
      ab.e("MicroMsg.WxaAudioDataSource", "pkgpath is null, return");
      AppMethodBeat.o(137807);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      ao localao = new ao(new File(paramString2));
      if (!localao.gUe)
      {
        localao.close();
        ab.e("MicroMsg.WxaAudioDataSource", "pkg invalid");
        AppMethodBeat.o(137807);
        paramString1 = null;
      }
      else if (!localao.avW())
      {
        localao.close();
        ab.e("MicroMsg.WxaAudioDataSource", "pkg readInfo failed");
        AppMethodBeat.o(137807);
        paramString1 = null;
      }
      else
      {
        paramString2 = localao.xy(paramString1);
        if (paramString2 == null)
        {
          localao.close();
          ab.e("MicroMsg.WxaAudioDataSource", "inputstream for %s is null", new Object[] { paramString1 });
          AppMethodBeat.o(137807);
          paramString1 = null;
        }
        else
        {
          localao.close();
          ab.d("MicroMsg.WxaAudioDataSource", "time:%d", new Object[] { Long.valueOf(System.nanoTime() - l) });
          paramString1 = (a)paramString2;
          AppMethodBeat.o(137807);
        }
      }
    }
  }

  public final int acc()
  {
    int i = 0;
    AppMethodBeat.i(137810);
    if (this.ikJ == null)
      this.ikJ = cA(this.filePath, this.gSP);
    if (this.ikJ == null)
    {
      ab.e("MicroMsg.WxaAudioDataSource", "[getAudioType] inputStream is null");
      AppMethodBeat.o(137810);
    }
    while (true)
    {
      return i;
      if (this.filePath.toLowerCase().endsWith(".mp3"))
      {
        ab.d("MicroMsg.WxaAudioDataSource", "[getAudioType] mp3");
        i = 2;
        AppMethodBeat.o(137810);
      }
      else if (this.filePath.toLowerCase().contains(".wav"))
      {
        ab.d("MicroMsg.WxaAudioDataSource", "[getAudioType] wav");
        i = 3;
        AppMethodBeat.o(137810);
      }
      else if (this.filePath.toLowerCase().contains(".ogg"))
      {
        ab.d("MicroMsg.WxaAudioDataSource", "[getAudioType] ogg");
        i = 4;
        AppMethodBeat.o(137810);
      }
      else
      {
        try
        {
          byte[] arrayOfByte = new byte[64];
          this.ikJ.seek(0);
          this.ikJ.read(arrayOfByte);
          String str = new java/lang/String;
          str.<init>(arrayOfByte);
          this.ikJ.seek(0);
          if ((str != null) && (str.contains("ftyp")))
          {
            ab.d("MicroMsg.WxaAudioDataSource", "[getAudioType] aac");
            AppMethodBeat.o(137810);
            i = 1;
            continue;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.WxaAudioDataSource", "getAudioType", new Object[] { localException });
            this.ikJ.seek(0);
            Object localObject1 = null;
          }
        }
        finally
        {
          this.ikJ.seek(0);
          AppMethodBeat.o(137810);
        }
        AppMethodBeat.o(137810);
      }
    }
  }

  public final void close()
  {
    AppMethodBeat.i(137811);
    a locala = this.ikJ;
    if (locala != null)
    {
      ab.i("MicroMsg.WxaAudioDataSource", "close");
      locala.close();
      this.ikJ = null;
    }
    AppMethodBeat.o(137811);
  }

  public final long getSize()
  {
    AppMethodBeat.i(137809);
    long l;
    if (this.ikJ == null)
    {
      ab.e("MicroMsg.WxaAudioDataSource", "[getSize] inputStream is null");
      l = 0L;
      AppMethodBeat.o(137809);
    }
    while (true)
    {
      return l;
      l = this.ikJ.getLength();
      AppMethodBeat.o(137809);
    }
  }

  public final boolean isOpen()
  {
    if (this.ikJ != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void open()
  {
    AppMethodBeat.i(137806);
    ab.i("MicroMsg.WxaAudioDataSource", "open");
    if (this.ikJ == null)
      this.ikJ = cA(this.filePath, this.gSP);
    this.currentPosition = 0L;
    if (this.ikJ != null)
      this.ikJ.seek(0);
    AppMethodBeat.o(137806);
  }

  public final int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(137808);
    if (this.ikJ == null)
    {
      ab.e("MicroMsg.WxaAudioDataSource", "[readAt]inputstream is null");
      AppMethodBeat.o(137808);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        ab.e("MicroMsg.WxaAudioDataSource", "[readAt]bytes is null");
        AppMethodBeat.o(137808);
        paramInt1 = i;
      }
      else if ((paramLong < 0L) || (paramInt1 < 0) || (paramInt2 <= 0))
      {
        ab.e("MicroMsg.WxaAudioDataSource", "position:%d, offset:%d, size:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(137808);
        paramInt1 = i;
      }
      else if ((paramArrayOfByte != null) && (paramInt1 + paramInt2 > paramArrayOfByte.length))
      {
        ab.e("MicroMsg.WxaAudioDataSource", "offset:%d, size:%d, bytes.length:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfByte.length) });
        AppMethodBeat.o(137808);
        paramInt1 = i;
      }
      else
      {
        if (paramInt2 + paramLong > getSize())
          ab.e("MicroMsg.WxaAudioDataSource", "position:%d, size:%d, getSize():%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt2), Long.valueOf(getSize()) });
        if (this.currentPosition != paramLong)
        {
          this.ikJ.seek((int)paramLong);
          this.currentPosition = paramLong;
        }
        paramInt1 = this.ikJ.read(paramArrayOfByte, paramInt1, paramInt2);
        if (paramInt1 >= 0)
          this.currentPosition += paramInt1;
        AppMethodBeat.o(137808);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.a.d
 * JD-Core Version:    0.6.2
 */
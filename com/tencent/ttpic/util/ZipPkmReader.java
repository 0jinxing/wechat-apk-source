package com.tencent.ttpic.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.opengl.ETC1;
import android.opengl.ETC1Util.ETC1Texture;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.etc.ETC1File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipPkmReader
{
  private ByteBuffer headerBuffer;
  private ZipEntry mZipEntry;
  private ZipInputStream mZipStream;
  private String path;

  public ZipPkmReader(String paramString)
  {
    this.path = paramString;
  }

  private ETC1Util.ETC1Texture createTexture(InputStream paramInputStream)
  {
    AppMethodBeat.i(84314);
    byte[] arrayOfByte = new byte[4096];
    if (paramInputStream.read(arrayOfByte, 0, 16) != 16)
    {
      paramInputStream = new IOException("Unable to read PKM file header.");
      AppMethodBeat.o(84314);
      throw paramInputStream;
    }
    if (this.headerBuffer == null)
      this.headerBuffer = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder());
    this.headerBuffer.put(arrayOfByte, 0, 16).position(0);
    if (!ETC1.isValid(this.headerBuffer))
    {
      paramInputStream = new IOException("Not a PKM file.");
      AppMethodBeat.o(84314);
      throw paramInputStream;
    }
    int i = ETC1.getWidth(this.headerBuffer);
    int j = ETC1.getHeight(this.headerBuffer);
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(ETC1.getEncodedDataSize(i, j)).order(ByteOrder.nativeOrder());
    while (true)
    {
      int k = paramInputStream.read(arrayOfByte);
      if (k == -1)
        break;
      localByteBuffer.put(arrayOfByte, 0, k);
    }
    localByteBuffer.position(0);
    paramInputStream = new ETC1Util.ETC1Texture(i, j, localByteBuffer);
    AppMethodBeat.o(84314);
    return paramInputStream;
  }

  private boolean hasElements()
  {
    AppMethodBeat.i(84310);
    try
    {
      if (this.mZipStream != null)
      {
        this.mZipEntry = this.mZipStream.getNextEntry();
        ZipEntry localZipEntry = this.mZipEntry;
        if (localZipEntry != null)
        {
          bool = true;
          AppMethodBeat.o(84310);
          return bool;
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(84310);
      }
    }
  }

  public void close()
  {
    AppMethodBeat.i(84309);
    if (this.mZipStream != null);
    try
    {
      this.mZipStream.closeEntry();
      this.mZipStream.close();
      label26: if (this.headerBuffer != null)
      {
        this.headerBuffer.clear();
        this.headerBuffer = null;
      }
      AppMethodBeat.o(84309);
      return;
    }
    catch (Exception localException)
    {
      break label26;
    }
  }

  public ETC1File getNextEntry()
  {
    AppMethodBeat.i(84313);
    Object localObject = getNextTexture();
    if ((localObject != null) && (!this.mZipEntry.getName().contains("../")))
    {
      localObject = new ETC1File(this.mZipEntry.getName(), (ETC1Util.ETC1Texture)localObject);
      AppMethodBeat.o(84313);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(84313);
    }
  }

  public InputStream getNextStream()
  {
    AppMethodBeat.i(84311);
    ZipInputStream localZipInputStream;
    if (hasElements())
    {
      localZipInputStream = this.mZipStream;
      AppMethodBeat.o(84311);
    }
    while (true)
    {
      return localZipInputStream;
      localZipInputStream = null;
      AppMethodBeat.o(84311);
    }
  }

  public ETC1Util.ETC1Texture getNextTexture()
  {
    AppMethodBeat.i(84312);
    if (hasElements());
    while (true)
    {
      try
      {
        ETC1Util.ETC1Texture localETC1Texture = createTexture(this.mZipStream);
        AppMethodBeat.o(84312);
        return localETC1Texture;
      }
      catch (IOException localIOException)
      {
      }
      Object localObject = null;
      AppMethodBeat.o(84312);
    }
  }

  public boolean open()
  {
    boolean bool = false;
    AppMethodBeat.i(84308);
    if (this.path == null)
      AppMethodBeat.o(84308);
    while (true)
    {
      return bool;
      try
      {
        Object localObject;
        ZipInputStream localZipInputStream;
        if (this.path.startsWith("assets://"))
        {
          localObject = VideoGlobalContext.getContext().getAssets().open(FileUtils.getRealPath(this.path));
          localZipInputStream = new java/util/zip/ZipInputStream;
          localZipInputStream.<init>((InputStream)localObject);
          this.mZipStream = localZipInputStream;
        }
        while (true)
        {
          bool = true;
          AppMethodBeat.o(84308);
          break;
          localZipInputStream = new java/util/zip/ZipInputStream;
          localObject = new java/io/FileInputStream;
          ((FileInputStream)localObject).<init>(this.path);
          localZipInputStream.<init>((InputStream)localObject);
          this.mZipStream = localZipInputStream;
          this.mZipStream.reset();
        }
      }
      catch (IOException localIOException)
      {
        AppMethodBeat.o(84308);
      }
    }
  }

  public void reset()
  {
    AppMethodBeat.i(84315);
    close();
    open();
    AppMethodBeat.o(84315);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.ZipPkmReader
 * JD-Core Version:    0.6.2
 */
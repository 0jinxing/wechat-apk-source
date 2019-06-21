package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXFileObject
  implements WXMediaMessage.IMediaObject
{
  private static final int CONTENT_LENGTH_LIMIT = 10485760;
  private static final String TAG = "MicroMsg.SDK.WXFileObject";
  private int contentLengthLimit = 10485760;
  public byte[] fileData;
  public String filePath;

  public WXFileObject()
  {
    this.fileData = null;
    this.filePath = null;
  }

  public WXFileObject(String paramString)
  {
    this.filePath = paramString;
  }

  public WXFileObject(byte[] paramArrayOfByte)
  {
    this.fileData = paramArrayOfByte;
  }

  private int getFileSize(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(128307);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(128307);
    while (true)
    {
      return i;
      paramString = new File(paramString);
      if (!paramString.exists())
      {
        AppMethodBeat.o(128307);
      }
      else
      {
        i = (int)paramString.length();
        AppMethodBeat.o(128307);
      }
    }
  }

  public boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128306);
    if (((this.fileData == null) || (this.fileData.length == 0)) && ((this.filePath == null) || (this.filePath.length() == 0)))
    {
      Log.e("MicroMsg.SDK.WXFileObject", "checkArgs fail, both arguments is null");
      AppMethodBeat.o(128306);
    }
    while (true)
    {
      return bool;
      if ((this.fileData != null) && (this.fileData.length > this.contentLengthLimit))
      {
        Log.e("MicroMsg.SDK.WXFileObject", "checkArgs fail, fileData is too large");
        AppMethodBeat.o(128306);
      }
      else if ((this.filePath != null) && (getFileSize(this.filePath) > this.contentLengthLimit))
      {
        Log.e("MicroMsg.SDK.WXFileObject", "checkArgs fail, fileSize is too large");
        AppMethodBeat.o(128306);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128306);
      }
    }
  }

  public void serialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128304);
    paramBundle.putByteArray("_wxfileobject_fileData", this.fileData);
    paramBundle.putString("_wxfileobject_filePath", this.filePath);
    AppMethodBeat.o(128304);
  }

  public void setContentLengthLimit(int paramInt)
  {
    this.contentLengthLimit = paramInt;
  }

  public void setFileData(byte[] paramArrayOfByte)
  {
    this.fileData = paramArrayOfByte;
  }

  public void setFilePath(String paramString)
  {
    this.filePath = paramString;
  }

  public int type()
  {
    return 6;
  }

  public void unserialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128305);
    this.fileData = paramBundle.getByteArray("_wxfileobject_fileData");
    this.filePath = paramBundle.getString("_wxfileobject_filePath");
    AppMethodBeat.o(128305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXFileObject
 * JD-Core Version:    0.6.2
 */
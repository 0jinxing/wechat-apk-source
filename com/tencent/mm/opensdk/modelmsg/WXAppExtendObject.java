package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXAppExtendObject
  implements WXMediaMessage.IMediaObject
{
  private static final int CONTENT_LENGTH_LIMIT = 10485760;
  private static final int EXTINFO_LENGTH_LIMIT = 2048;
  private static final int PATH_LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXAppExtendObject";
  public String extInfo;
  public byte[] fileData;
  public String filePath;

  public WXAppExtendObject()
  {
  }

  public WXAppExtendObject(String paramString1, String paramString2)
  {
    this.extInfo = paramString1;
    this.filePath = paramString2;
  }

  public WXAppExtendObject(String paramString, byte[] paramArrayOfByte)
  {
    this.extInfo = paramString;
    this.fileData = paramArrayOfByte;
  }

  private int getFileSize(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(128256);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(128256);
    while (true)
    {
      return i;
      paramString = new File(paramString);
      if (!paramString.exists())
      {
        AppMethodBeat.o(128256);
      }
      else
      {
        i = (int)paramString.length();
        AppMethodBeat.o(128256);
      }
    }
  }

  public boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128255);
    if (((this.extInfo == null) || (this.extInfo.length() == 0)) && ((this.filePath == null) || (this.filePath.length() == 0)) && ((this.fileData == null) || (this.fileData.length == 0)))
    {
      Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, all arguments is null");
      AppMethodBeat.o(128255);
    }
    while (true)
    {
      return bool;
      if ((this.extInfo != null) && (this.extInfo.length() > 2048))
      {
        Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, extInfo is invalid");
        AppMethodBeat.o(128255);
      }
      else if ((this.filePath != null) && (this.filePath.length() > 10240))
      {
        Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, filePath is invalid");
        AppMethodBeat.o(128255);
      }
      else if ((this.filePath != null) && (getFileSize(this.filePath) > 10485760))
      {
        Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, fileSize is too large");
        AppMethodBeat.o(128255);
      }
      else if ((this.fileData != null) && (this.fileData.length > 10485760))
      {
        Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, fileData is too large");
        AppMethodBeat.o(128255);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128255);
      }
    }
  }

  public void serialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128253);
    paramBundle.putString("_wxappextendobject_extInfo", this.extInfo);
    paramBundle.putByteArray("_wxappextendobject_fileData", this.fileData);
    paramBundle.putString("_wxappextendobject_filePath", this.filePath);
    AppMethodBeat.o(128253);
  }

  public int type()
  {
    return 7;
  }

  public void unserialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128254);
    this.extInfo = paramBundle.getString("_wxappextendobject_extInfo");
    this.fileData = paramBundle.getByteArray("_wxappextendobject_fileData");
    this.filePath = paramBundle.getString("_wxappextendobject_filePath");
    AppMethodBeat.o(128254);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXAppExtendObject
 * JD-Core Version:    0.6.2
 */
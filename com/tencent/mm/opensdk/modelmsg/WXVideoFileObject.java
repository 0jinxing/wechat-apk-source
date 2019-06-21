package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXVideoFileObject
  implements WXMediaMessage.IMediaObject
{
  private static final int FILE_SIZE_LIMIT = 10485760;
  private static final String TAG = "MicroMsg.SDK.WXVideoFileObject";
  public static final int WXVideoFileShareSceneCommon = 0;
  public static final int WXVideoFileShareSceneFromWX = 1;
  public String filePath;
  public int shareScene = 0;
  public String shareTicket;

  public WXVideoFileObject()
  {
    this.filePath = null;
  }

  public WXVideoFileObject(String paramString)
  {
    this.filePath = paramString;
  }

  private int getFileSize(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(128261);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(128261);
    while (true)
    {
      return i;
      paramString = new File(paramString);
      if (!paramString.exists())
      {
        AppMethodBeat.o(128261);
      }
      else
      {
        i = (int)paramString.length();
        AppMethodBeat.o(128261);
      }
    }
  }

  public boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128260);
    if ((this.filePath == null) || (this.filePath.length() == 0))
    {
      Log.e("MicroMsg.SDK.WXVideoFileObject", "checkArgs fail, filePath is null");
      AppMethodBeat.o(128260);
    }
    while (true)
    {
      return bool;
      if (getFileSize(this.filePath) > 10485760)
      {
        Log.e("MicroMsg.SDK.WXVideoFileObject", "checkArgs fail, video file size is too large");
        AppMethodBeat.o(128260);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128260);
      }
    }
  }

  public void serialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128258);
    paramBundle.putString("_wxvideofileobject_filePath", this.filePath);
    paramBundle.putInt("_wxvideofileobject_shareScene", this.shareScene);
    paramBundle.putString("_wxvideofileobject_shareTicketh", this.shareTicket);
    AppMethodBeat.o(128258);
  }

  public int type()
  {
    return 38;
  }

  public void unserialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128259);
    this.filePath = paramBundle.getString("_wxvideofileobject_filePath");
    this.shareScene = paramBundle.getInt("_wxvideofileobject_shareScene", 0);
    this.shareTicket = paramBundle.getString("_wxvideofileobject_shareTicketh");
    AppMethodBeat.o(128259);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXVideoFileObject
 * JD-Core Version:    0.6.2
 */
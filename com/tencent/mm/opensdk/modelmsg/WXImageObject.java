package com.tencent.mm.opensdk.modelmsg;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class WXImageObject
  implements WXMediaMessage.IMediaObject
{
  private static final int CONTENT_LENGTH_LIMIT = 26214400;
  private static final int PATH_LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXImageObject";
  public byte[] imageData;
  public String imagePath;

  public WXImageObject()
  {
  }

  public WXImageObject(Bitmap paramBitmap)
  {
    AppMethodBeat.i(128286);
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
      this.imageData = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      AppMethodBeat.o(128286);
      return;
    }
    catch (Exception paramBitmap)
    {
      while (true)
      {
        Log.e("MicroMsg.SDK.WXImageObject", "WXImageObject <init>, exception:" + paramBitmap.getMessage());
        AppMethodBeat.o(128286);
      }
    }
  }

  public WXImageObject(byte[] paramArrayOfByte)
  {
    this.imageData = paramArrayOfByte;
  }

  private int getFileSize(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(128290);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(128290);
    while (true)
    {
      return i;
      paramString = new File(paramString);
      if (!paramString.exists())
      {
        AppMethodBeat.o(128290);
      }
      else
      {
        i = (int)paramString.length();
        AppMethodBeat.o(128290);
      }
    }
  }

  public boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128289);
    if (((this.imageData == null) || (this.imageData.length == 0)) && ((this.imagePath == null) || (this.imagePath.length() == 0)))
    {
      Log.e("MicroMsg.SDK.WXImageObject", "checkArgs fail, all arguments are null");
      AppMethodBeat.o(128289);
    }
    while (true)
    {
      return bool;
      if ((this.imageData != null) && (this.imageData.length > 26214400))
      {
        Log.e("MicroMsg.SDK.WXImageObject", "checkArgs fail, content is too large");
        AppMethodBeat.o(128289);
      }
      else if ((this.imagePath != null) && (this.imagePath.length() > 10240))
      {
        Log.e("MicroMsg.SDK.WXImageObject", "checkArgs fail, path is invalid");
        AppMethodBeat.o(128289);
      }
      else if ((this.imagePath != null) && (getFileSize(this.imagePath) > 26214400))
      {
        Log.e("MicroMsg.SDK.WXImageObject", "checkArgs fail, image content is too large");
        AppMethodBeat.o(128289);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128289);
      }
    }
  }

  public void serialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128287);
    paramBundle.putByteArray("_wximageobject_imageData", this.imageData);
    paramBundle.putString("_wximageobject_imagePath", this.imagePath);
    AppMethodBeat.o(128287);
  }

  public void setImagePath(String paramString)
  {
    this.imagePath = paramString;
  }

  public int type()
  {
    return 2;
  }

  public void unserialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128288);
    this.imageData = paramBundle.getByteArray("_wximageobject_imageData");
    this.imagePath = paramBundle.getString("_wximageobject_imagePath");
    AppMethodBeat.o(128288);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXImageObject
 * JD-Core Version:    0.6.2
 */
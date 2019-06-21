package com.tencent.mm.opensdk.modelmsg;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;
import java.io.ByteArrayOutputStream;

public final class WXMediaMessage
{
  public static final String ACTION_WXAPPMESSAGE = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE";
  public static final int DESCRIPTION_LENGTH_LIMIT = 1024;
  public static final int MEDIA_TAG_NAME_LENGTH_LIMIT = 64;
  public static final int MESSAGE_ACTION_LENGTH_LIMIT = 2048;
  public static final int MESSAGE_EXT_LENGTH_LIMIT = 2048;
  public static final int MINI_PROGRAM__THUMB_LENGHT = 131072;
  private static final String TAG = "MicroMsg.SDK.WXMediaMessage";
  public static final int THUMB_LENGTH_LIMIT = 65536;
  public static final int TITLE_LENGTH_LIMIT = 512;
  public String description;
  public WXMediaMessage.IMediaObject mediaObject;
  public String mediaTagName;
  public String messageAction;
  public String messageExt;
  public int sdkVer;
  public byte[] thumbData;
  public String title;

  public WXMediaMessage()
  {
    this(null);
  }

  public WXMediaMessage(WXMediaMessage.IMediaObject paramIMediaObject)
  {
    this.mediaObject = paramIMediaObject;
  }

  final boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128293);
    if ((getType() == 8) && ((this.thumbData == null) || (this.thumbData.length == 0)))
    {
      Log.e("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, thumbData should not be null when send emoji");
      AppMethodBeat.o(128293);
    }
    while (true)
    {
      return bool;
      if ((d.a(getType())) && ((this.thumbData == null) || (this.thumbData.length > 131072)))
      {
        Log.e("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, thumbData should not be null or exceed 128kb");
        AppMethodBeat.o(128293);
      }
      else if ((!d.a(getType())) && (this.thumbData != null) && (this.thumbData.length > 65536))
      {
        Log.e("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, thumbData is invalid");
        AppMethodBeat.o(128293);
      }
      else if ((this.title != null) && (this.title.length() > 512))
      {
        Log.e("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, title is invalid");
        AppMethodBeat.o(128293);
      }
      else if ((this.description != null) && (this.description.length() > 1024))
      {
        Log.e("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, description is invalid");
        AppMethodBeat.o(128293);
      }
      else if (this.mediaObject == null)
      {
        Log.e("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, mediaObject is null");
        AppMethodBeat.o(128293);
      }
      else if ((this.mediaTagName != null) && (this.mediaTagName.length() > 64))
      {
        Log.e("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, mediaTagName is too long");
        AppMethodBeat.o(128293);
      }
      else if ((this.messageAction != null) && (this.messageAction.length() > 2048))
      {
        Log.e("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, messageAction is too long");
        AppMethodBeat.o(128293);
      }
      else if ((this.messageExt != null) && (this.messageExt.length() > 2048))
      {
        Log.e("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, messageExt is too long");
        AppMethodBeat.o(128293);
      }
      else
      {
        bool = this.mediaObject.checkArgs();
        AppMethodBeat.o(128293);
      }
    }
  }

  public final int getType()
  {
    AppMethodBeat.i(128291);
    int i;
    if (this.mediaObject == null)
    {
      i = 0;
      AppMethodBeat.o(128291);
    }
    while (true)
    {
      return i;
      i = this.mediaObject.type();
      AppMethodBeat.o(128291);
    }
  }

  public final void setThumbImage(Bitmap paramBitmap)
  {
    AppMethodBeat.i(128292);
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
      this.thumbData = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      AppMethodBeat.o(128292);
      return;
    }
    catch (Exception paramBitmap)
    {
      while (true)
      {
        Log.e("MicroMsg.SDK.WXMediaMessage", "setThumbImage exception:" + paramBitmap.getMessage());
        AppMethodBeat.o(128292);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXMediaMessage
 * JD-Core Version:    0.6.2
 */
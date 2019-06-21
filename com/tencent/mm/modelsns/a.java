package com.tencent.mm.modelsns;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ri;
import com.tencent.mm.g.a.ri.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.e.k;
import com.tencent.mm.vfs.e;
import java.util.Set;

public final class a
{
  public static Set<String> fPS;

  public static Intent a(int paramInt, WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(16607);
    ab.d("MicroMsg.ShareSnsImpl", "appmsg.description " + paramWXMediaMessage.description);
    ab.d("MicroMsg.ShareSnsImpl", "appmsg.title " + paramWXMediaMessage.title);
    Object localObject1 = paramWXMediaMessage.mediaObject;
    int i;
    Intent localIntent;
    switch (((WXMediaMessage.IMediaObject)localObject1).type())
    {
    default:
      i = -1;
      localIntent = new Intent();
      localIntent.putExtra("KThrid_app", true);
      ab.d("MicroMsg.ShareSnsImpl", "TimeLineType " + i + " " + ((WXMediaMessage.IMediaObject)localObject1).type());
      localIntent.putExtra("Ksnsupload_appid", paramString1);
      localIntent.putExtra("Ksnsupload_appname", paramString2);
      localIntent.putExtra("Ksnsupload_open_sdk_version", paramInt);
      localIntent.putExtra("KSnsAction", true);
      localIntent.putExtra("need_result", true);
      localIntent.putExtra("Ksnsupload_app_is_game", paramBoolean);
      paramString2 = new Bundle();
      paramString1 = new SendMessageToWX.Req();
      paramString1.message = paramWXMediaMessage;
      paramString1.toBundle(paramString2);
      localIntent.putExtra("Ksnsupload_timeline", paramString2);
      if (i == -1)
      {
        ab.d("MicroMsg.ShareSnsImpl", "timeLineType is invalid");
        paramWXMediaMessage = null;
        AppMethodBeat.o(16607);
      }
      break;
    case 1:
    case 3:
    case 2:
    case 5:
    case 6:
    case 4:
    case 7:
    case 38:
    case 39:
    }
    while (true)
    {
      return paramWXMediaMessage;
      i = 2;
      break;
      i = 4;
      break;
      i = 1;
      break;
      i = 3;
      break;
      i = 5;
      break;
      i = 3;
      break;
      i = 15;
      break;
      switch (((WXMediaMessage.IMediaObject)localObject1).type())
      {
      default:
        ab.e("MicroMsg.ShareSnsImpl", "none type not support!");
        paramWXMediaMessage = null;
        AppMethodBeat.o(16607);
        break;
      case 1:
        paramWXMediaMessage = (WXTextObject)localObject1;
        localIntent.putExtra(e.k.ygd, paramWXMediaMessage.text);
        localIntent.putExtra("Ksnsupload_type", 8);
        AppMethodBeat.o(16607);
        paramWXMediaMessage = localIntent;
        break;
      case 3:
        paramString1 = (WXMusicObject)localObject1;
        if (!bo.isNullOrNil(paramString1.musicUrl))
        {
          paramWXMediaMessage = paramString1.musicUrl;
          paramString2 = bo.bc(paramWXMediaMessage, "");
          if (bo.isNullOrNil(paramString1.musicDataUrl))
            break label640;
          paramWXMediaMessage = paramString1.musicDataUrl;
          bo.bc(paramWXMediaMessage, "");
          if (bo.isNullOrNil(paramString1.musicLowBandDataUrl))
            break label648;
        }
        for (paramWXMediaMessage = paramString1.musicLowBandDataUrl; ; paramWXMediaMessage = paramString1.musicLowBandUrl)
        {
          bo.bc(paramWXMediaMessage, "");
          localIntent.putExtra("Ksnsupload_link", paramString2);
          localIntent.putExtra("Ksnsupload_title", "");
          localIntent.putExtra("Ksnsupload_type", 2);
          localIntent.putExtra("ksnsis_music", true);
          AppMethodBeat.o(16607);
          paramWXMediaMessage = localIntent;
          break;
          paramWXMediaMessage = paramString1.musicLowBandUrl;
          break label532;
          paramWXMediaMessage = paramString1.musicUrl;
          break label554;
        }
      case 2:
        paramWXMediaMessage = (WXImageObject)localObject1;
        localIntent.putExtra("KBlockAdd", true);
        localIntent.putExtra("Ksnsupload_type", 0);
        localIntent.putExtra("sns_kemdia_path", paramWXMediaMessage.imagePath);
        AppMethodBeat.o(16607);
        paramWXMediaMessage = localIntent;
        break;
      case 5:
        localIntent.putExtra("Ksnsupload_link", ((WXWebpageObject)localObject1).webpageUrl);
        localIntent.putExtra("Ksnsupload_title", bo.bc(paramWXMediaMessage.title, ""));
        localIntent.putExtra("Ksnsupload_imgbuf", paramWXMediaMessage.thumbData);
        localIntent.putExtra("Ksnsupload_type", 1);
        AppMethodBeat.o(16607);
        paramWXMediaMessage = localIntent;
        break;
      case 6:
        ab.e("MicroMsg.ShareSnsImpl", "file is not support!");
        paramWXMediaMessage = null;
        AppMethodBeat.o(16607);
        break;
      case 4:
        paramWXMediaMessage = (WXVideoObject)localObject1;
        if (!bo.isNullOrNil(paramWXMediaMessage.videoUrl));
        for (paramWXMediaMessage = paramWXMediaMessage.videoUrl; ; paramWXMediaMessage = paramWXMediaMessage.videoLowBandUrl)
        {
          localIntent.putExtra("Ksnsupload_link", bo.bc(paramWXMediaMessage, ""));
          localIntent.putExtra("Ksnsupload_title", "");
          localIntent.putExtra("Ksnsupload_type", 1);
          localIntent.putExtra("ksnsis_video", true);
          AppMethodBeat.o(16607);
          paramWXMediaMessage = localIntent;
          break;
        }
      case 38:
        label532: label554: paramWXMediaMessage = (WXVideoFileObject)localObject1;
        label640: label648: localIntent.putExtra("KBlockAdd", true);
        localIntent.putExtra("Ksnsupload_type", 14);
        paramString1 = paramWXMediaMessage.filePath;
        paramWXMediaMessage = "";
        paramString2 = e.atg(paramString1);
        if ((bo.isNullOrNil("")) || (!e.ct("")))
        {
          paramWXMediaMessage = new StringBuilder();
          aw.ZK();
          paramWXMediaMessage = c.getAccSnsTmpPath() + paramString2;
        }
        try
        {
          localObject1 = tv(paramString1);
          if (localObject1 != null)
          {
            ab.i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", new Object[] { Integer.valueOf(((Bitmap)localObject1).getWidth()), Integer.valueOf(((Bitmap)localObject1).getHeight()) });
            d.a((Bitmap)localObject1, 80, Bitmap.CompressFormat.JPEG, paramWXMediaMessage, true);
            localObject1 = d.amj(paramWXMediaMessage);
            ab.i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject1).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject1).outHeight) });
            localIntent.putExtra("KSightPath", paramString1);
            localIntent.putExtra("KSightThumbPath", paramWXMediaMessage);
            localIntent.putExtra("sight_md5", paramString2);
            AppMethodBeat.o(16607);
            paramWXMediaMessage = localIntent;
          }
          else
          {
            ab.e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", new Object[] { paramString1 });
            paramWXMediaMessage = null;
            AppMethodBeat.o(16607);
          }
        }
        catch (Exception localException1)
        {
          while (true)
            ab.e("MicroMsg.ShareSnsImpl", "savebitmap error %s", new Object[] { localException1.getMessage() });
        }
      case 39:
      case 7:
      }
    }
    paramWXMediaMessage = (WXGameVideoFileObject)localException1;
    localIntent.putExtra("KBlockAdd", true);
    localIntent.putExtra("Ksnsupload_type", 14);
    paramString1 = paramWXMediaMessage.filePath;
    paramString2 = paramWXMediaMessage.videoUrl;
    String str2 = paramWXMediaMessage.thumbUrl;
    ab.i("MicroMsg.ShareSnsImpl", "videoPath %s,thumbPath %s,cdnUrl %s,cdnThumbUrl %s", new Object[] { paramString1, "", paramString2, str2 });
    String str1 = e.atg(paramString1);
    if ((bo.isNullOrNil("")) || (!e.ct("")))
    {
      paramWXMediaMessage = new StringBuilder();
      aw.ZK();
    }
    for (paramWXMediaMessage = c.getAccSnsTmpPath() + str1; ; paramWXMediaMessage = "")
    {
      try
      {
        Object localObject2 = tv(paramString1);
        if (localObject2 != null)
        {
          ab.i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()) });
          d.a((Bitmap)localObject2, 80, Bitmap.CompressFormat.JPEG, paramWXMediaMessage, true);
          localObject2 = d.amj(paramWXMediaMessage);
          ab.i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject2).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject2).outHeight) });
          localIntent.putExtra("KSightPath", paramString1);
          localIntent.putExtra("KSightThumbPath", paramWXMediaMessage);
          localIntent.putExtra("sight_md5", str1);
          localIntent.putExtra("KSightCdnUrl", paramString2);
          localIntent.putExtra("KSightCdnThumbUrl", str2);
          AppMethodBeat.o(16607);
          paramWXMediaMessage = localIntent;
          break;
        }
        ab.e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", new Object[] { paramString1 });
        paramWXMediaMessage = null;
        AppMethodBeat.o(16607);
      }
      catch (Exception localException2)
      {
        while (true)
          ab.e("MicroMsg.ShareSnsImpl", "savebitmap error %s", new Object[] { localException2.getMessage() });
      }
      paramWXMediaMessage = null;
      AppMethodBeat.o(16607);
      break;
    }
  }

  private static Bitmap tv(String paramString)
  {
    AppMethodBeat.i(16608);
    ri localri = new ri();
    localri.cNn.cNp = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localri);
    paramString = (Bitmap)localri.cNo.result;
    AppMethodBeat.o(16608);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsns.a
 * JD-Core Version:    0.6.2
 */
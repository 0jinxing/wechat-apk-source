package com.tencent.mm.plugin.webview.modeltools;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ak;
import org.json.JSONObject;

public final class j
{
  private static long upy = 0L;

  public static String a(String paramString, String[] paramArrayOfString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(138037);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramString == null))
      AppMethodBeat.o(138037);
    Object localObject;
    while (true)
    {
      return paramString;
      localObject = paramJSONObject.optString("data");
      if (!bo.isNullOrNil((String)localObject))
        break;
      AppMethodBeat.o(138037);
    }
    paramJSONObject = q.v(paramString, 0, "@T");
    if (!com.tencent.mm.vfs.e.ct(paramJSONObject));
    while (true)
    {
      int i;
      try
      {
        localObject = Base64.decode(((String)localObject).substring(((String)localObject).indexOf(',') + 1), 2);
        com.tencent.mm.vfs.e.b(paramJSONObject, (byte[])localObject, localObject.length);
        i = 0;
        if (i < paramArrayOfString.length)
        {
          if (!paramString.equals(paramArrayOfString[i]))
            break label165;
          paramArrayOfString[i] = paramJSONObject;
        }
        ab.i("MicroMsg.WebViewPreviewImgHelper", "use base64 data: %s", new Object[] { paramJSONObject });
        AppMethodBeat.o(138037);
        paramString = paramJSONObject;
      }
      catch (Exception paramArrayOfString)
      {
        ab.w("MicroMsg.WebViewPreviewImgHelper", "decode file fail: %s", new Object[] { paramArrayOfString.getMessage() });
        AppMethodBeat.o(138037);
      }
      break;
      label165: i++;
    }
  }

  public static void a(Bundle paramBundle, com.tencent.mm.plugin.webview.stub.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(7023);
    if (System.currentTimeMillis() - upy < 1000L)
      AppMethodBeat.o(7023);
    while (true)
    {
      return;
      Object localObject1 = paramBundle.getString("url");
      Object localObject3 = paramBundle.getString("filePath");
      Object localObject4 = new String[1];
      Object localObject5;
      if (!bo.isNullOrNil((String)localObject3))
      {
        localObject5 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject5).inJustDecodeBounds = true;
        localObject5 = com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject3, (BitmapFactory.Options)localObject5);
        if (localObject5 != null)
        {
          ab.i("MicroMsg.WebViewPreviewImgHelper", "recycle bitmap:%s", new Object[] { localObject5.toString() });
          ((Bitmap)localObject5).recycle();
          localObject4[0] = localObject3;
          label115: if ((!bo.isNullOrNil((String)localObject3)) || (bo.isNullOrNil((String)localObject1)))
            break label734;
          localObject4[0] = localObject1;
          localObject5 = new Intent();
          ((Intent)localObject5).putExtra("nowUrl", (String)localObject1);
          ((Intent)localObject5).putExtra("urlList", (String[])localObject4);
          ((Intent)localObject5).putExtra("type", -255);
          ((Intent)localObject5).putExtra("isFromWebView", true);
          ((Intent)localObject5).putExtra("isOuntLink", true);
          localObject1 = "";
          localObject3 = localObject1;
        }
      }
      try
      {
        localObject4 = new android/os/Bundle;
        localObject3 = localObject1;
        ((Bundle)localObject4).<init>();
        localObject3 = localObject1;
        localObject4 = parame.g(90001, (Bundle)localObject4);
        if (localObject4 != null)
        {
          localObject3 = localObject1;
          localObject4 = ((Bundle)localObject4).getString("cookie", null);
          localObject3 = localObject1;
          if (!bo.isNullOrNil((String)localObject4))
          {
            localObject3 = localObject1;
            ((Intent)localObject5).putExtra("cookie", (String)localObject4);
          }
        }
        localObject3 = localObject1;
        localObject6 = parame.g(18, null);
        if (localObject6 != null)
        {
          localObject3 = localObject1;
          String str1 = ((Bundle)localObject6).getString("preChatName");
          localObject3 = localObject1;
          String str2 = ((Bundle)localObject6).getString("preUsername");
          localObject3 = localObject1;
          localObject4 = ((Bundle)localObject6).getString("rawUrl");
          localObject3 = localObject1;
          parame = ((Bundle)localObject6).getString("url");
          localObject3 = parame;
          i = ((Bundle)localObject6).getInt("getA8KeyScene");
          localObject3 = parame;
          localObject6 = v.nW("ImgPreview");
          localObject3 = parame;
          localObject1 = v.Zp().y((String)localObject6, true);
          localObject3 = parame;
          ((v.b)localObject1).j("preUsername", str1);
          localObject3 = parame;
          ((v.b)localObject1).j("preChatName", str2);
          localObject3 = parame;
          ((v.b)localObject1).j("url", parame);
          localObject3 = parame;
          ((v.b)localObject1).j("rawUrl", localObject4);
          if ((i == 53) || (i == 52))
          {
            localObject3 = parame;
            ab.i("MicroMsg.WebViewPreviewImgHelper", "not allow to ScanQRCode");
            bool = false;
          }
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          label734: Object localObject2;
          try
          {
            Object localObject6;
            ((Intent)localObject5).putExtra("img_gallery_session_id", (String)localObject6);
            ((Intent)localObject5).putExtra("shouldShowScanQrCodeMenu", bool);
            localObject3 = new Bundle();
            ((Bundle)localObject3).putInt("stat_scene", 4);
            ((Bundle)localObject3).putString("stat_url", parame);
            ((Intent)localObject5).putExtra("_stat_obj", (Bundle)localObject3);
            parame = ah.getContext();
            int j;
            if (cYM())
            {
              j = ak.de(parame);
              i = ak.hF(parame);
              int k = (int)paramBundle.getFloat("width");
              int m = (int)paramBundle.getFloat("height");
              int n = (int)paramBundle.getFloat("left");
              float f = paramBundle.getFloat("top");
              if (!paramBoolean)
                continue;
              i = 0;
              i = (int)(i + f);
              j = com.tencent.mm.bz.a.ge(parame);
              ab.d("MicroMsg.WebViewPreviewImgHelper", "doPreviewImg left %d, top %d, w %d, h %d", new Object[] { Integer.valueOf(n), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m) });
              ((Intent)localObject5).putExtra("img_gallery_width", k).putExtra("img_gallery_height", m).putExtra("img_gallery_left", n).putExtra("img_gallery_top", i);
              if ((k > 0) && (m > 0) && (m < j))
                ((Intent)localObject5).putExtra("shouldRunDragAnimation", true);
            }
            com.tencent.mm.bp.d.b(ah.getContext(), "subapp", ".ui.gallery.GestureGalleryUI", (Intent)localObject5);
            AppMethodBeat.o(7023);
            break;
            ab.i("MicroMsg.WebViewPreviewImgHelper", "decode fail %s", new Object[] { localObject3 });
            localObject3 = "";
            break label115;
            ab.w("MicroMsg.WebViewPreviewImgHelper", "imagePreview failed url is null");
            AppMethodBeat.o(7023);
            break;
            localException1 = localException1;
            bool = true;
            parame = (com.tencent.mm.plugin.webview.stub.e)localObject3;
            ab.e("MicroMsg.WebViewPreviewImgHelper", "getCookie fail : %s", new Object[] { localException1.getMessage() });
            continue;
            int i = j + i;
            continue;
          }
          catch (Exception localException2)
          {
            localObject2 = localException2;
            continue;
          }
          boolean bool = true;
          continue;
          bool = true;
          parame = localObject2;
        }
      }
    }
  }

  public static void cYL()
  {
    AppMethodBeat.i(7022);
    upy = System.currentTimeMillis();
    AppMethodBeat.o(7022);
  }

  public static boolean cYM()
  {
    AppMethodBeat.i(7025);
    int i = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIc, 1);
    ab.i("MicroMsg.WebViewPreviewImgHelper", "shouldShowAnimation %d", new Object[] { Integer.valueOf(i) });
    if (i == 1)
      AppMethodBeat.o(7025);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(7025);
    }
  }

  public static void d(com.tencent.mm.plugin.webview.stub.d paramd)
  {
    AppMethodBeat.i(7024);
    if (paramd == null)
      AppMethodBeat.o(7024);
    while (true)
    {
      return;
      try
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        paramd.g(108, localBundle);
        AppMethodBeat.o(7024);
      }
      catch (RemoteException paramd)
      {
        AppMethodBeat.o(7024);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.j
 * JD-Core Version:    0.6.2
 */
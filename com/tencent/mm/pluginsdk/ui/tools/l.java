package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.model.t;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
{
  public static int vvk = 2;

  public static void a(int paramInt, f paramf, WXMediaMessage paramWXMediaMessage, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(79951);
    paramLinkedList = paramLinkedList.iterator();
    if (paramLinkedList.hasNext())
    {
      String str1 = (String)paramLinkedList.next();
      String str2 = paramf.field_appId;
      String str3 = paramf.field_appName;
      int i;
      label52: int j;
      if (paramf.xy())
      {
        i = 1;
        j = paramWXMediaMessage.getType();
        if (!t.kH(str1))
          break label381;
      }
      label381: for (int k = 1; ; k = 0)
      {
        try
        {
          String str4 = q.encode(bo.nullAsNil(b(paramWXMediaMessage)), "UTF-8");
          String str5 = q.encode(bo.nullAsNil(paramWXMediaMessage.title), "UTF-8");
          String str6 = q.encode(bo.nullAsNil(paramWXMediaMessage.description), "UTF-8");
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          ab.i("MicroMsg.ShareReport", paramInt + "," + str2 + "," + str3 + "," + i + "," + j + "," + k + ",1," + str1 + "," + str5 + "," + str6 + "," + str4 + "," + "" + "," + "" + "," + "");
          h.pYm.e(16492, new Object[] { Integer.valueOf(paramInt), str2, str3, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(1), str1, str5, str6, str4, "", "", "" });
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          ab.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
        }
        break;
        i = 0;
        break label52;
      }
    }
    AppMethodBeat.o(79951);
  }

  public static void a(int paramInt, f paramf, WxaAttributes paramWxaAttributes, WXMediaMessage paramWXMediaMessage, WXMiniProgramObject paramWXMiniProgramObject, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(79950);
    paramLinkedList = paramLinkedList.iterator();
    if (paramLinkedList.hasNext())
    {
      String str1 = (String)paramLinkedList.next();
      String str2 = paramf.field_appId;
      String str3 = paramf.field_appName;
      int i;
      label56: int j;
      if (paramf.xy())
      {
        i = 1;
        j = paramWXMediaMessage.getType();
        if (!t.kH(str1))
          break label417;
      }
      label417: for (int k = 1; ; k = 0)
      {
        try
        {
          String str4 = q.encode(bo.nullAsNil(paramWXMiniProgramObject.webpageUrl), "UTF-8");
          String str5 = q.encode(bo.nullAsNil(paramWXMediaMessage.title), "UTF-8");
          String str6 = q.encode(bo.nullAsNil(paramWXMediaMessage.description), "UTF-8");
          String str7 = paramWxaAttributes.field_appId;
          String str8 = q.encode(bo.nullAsNil(paramWXMiniProgramObject.path), "UTF-8");
          int m = paramWXMiniProgramObject.miniprogramType;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          ab.i("MicroMsg.ShareReport", paramInt + "," + str2 + "," + str3 + "," + i + "," + j + "," + k + ",1," + str1 + "," + str5 + "," + str6 + "," + str4 + "," + str7 + "," + str8 + "," + m);
          h.pYm.e(16492, new Object[] { Integer.valueOf(paramInt), str2, str3, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(1), str1, str5, str6, str4, str7, str8, Integer.valueOf(m) });
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          ab.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
        }
        break;
        i = 0;
        break label56;
      }
    }
    AppMethodBeat.o(79950);
  }

  public static void a(int paramInt, String paramString, WXMediaMessage paramWXMediaMessage)
  {
    AppMethodBeat.i(79954);
    Object localObject = g.bT(paramString, true);
    if (localObject == null)
      AppMethodBeat.o(79954);
    while (true)
    {
      return;
      paramString = ((f)localObject).field_appId;
      String str1 = ((f)localObject).field_appName;
      int i;
      int j;
      if (((f)localObject).xy())
      {
        i = 1;
        j = paramWXMediaMessage.getType();
      }
      try
      {
        localObject = q.encode(bo.nullAsNil(b(paramWXMediaMessage)), "UTF-8");
        String str2 = q.encode(bo.nullAsNil(paramWXMediaMessage.title), "UTF-8");
        String str3 = q.encode(bo.nullAsNil(paramWXMediaMessage.description), "UTF-8");
        paramWXMediaMessage = new java/lang/StringBuilder;
        paramWXMediaMessage.<init>();
        ab.i("MicroMsg.ShareReport", paramInt + "," + paramString + "," + str1 + "," + i + "," + j + ",3,1," + "" + "," + str2 + "," + str3 + "," + (String)localObject);
        h.pYm.e(16492, new Object[] { Integer.valueOf(paramInt), paramString, str1, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(3), Integer.valueOf(1), "", localObject, str2, str3 });
        AppMethodBeat.o(79954);
        continue;
        i = 0;
      }
      catch (UnsupportedEncodingException paramString)
      {
        ab.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
        AppMethodBeat.o(79954);
      }
    }
  }

  public static void aG(Intent paramIntent)
  {
    AppMethodBeat.i(79953);
    Object localObject1 = paramIntent.getBundleExtra("Ksnsupload_timeline");
    if (localObject1 == null)
      AppMethodBeat.o(79953);
    while (true)
    {
      return;
      String str1 = w.n(paramIntent, "Ksnsupload_appid");
      String str2 = w.n(paramIntent, "Ksnsupload_appname");
      int i = w.a(paramIntent, "Ksnsupload_open_sdk_version", 0);
      boolean bool1 = w.a(paramIntent, "KThrid_app", false);
      boolean bool2 = w.a(paramIntent, "Ksnsupload_app_is_game", false);
      paramIntent = new SendMessageToWX.Req();
      paramIntent.fromBundle((Bundle)localObject1);
      WXMediaMessage localWXMediaMessage = paramIntent.message;
      if (localWXMediaMessage == null)
        AppMethodBeat.o(79953);
      else
        try
        {
          String str3 = q.encode(bo.nullAsNil(b(localWXMediaMessage)), "UTF-8");
          localObject1 = q.encode(bo.nullAsNil(localWXMediaMessage.title), "UTF-8");
          paramIntent = q.encode(bo.nullAsNil(localWXMediaMessage.description), "UTF-8");
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append(i).append(",").append(str1).append(",").append(str2).append(",");
          int j;
          label188: label223: int k;
          if (bool2)
          {
            j = 1;
            localObject2 = ((StringBuilder)localObject2).append(j).append(",").append(localWXMediaMessage.getType()).append(",2,");
            if (!bool1)
              break label391;
            j = 1;
            ab.i("MicroMsg.ShareReport", j + ",," + (String)localObject1 + "," + paramIntent + "," + str3);
            localObject2 = h.pYm;
            if (!bool2)
              break label397;
            j = 1;
            label279: k = localWXMediaMessage.getType();
            if (!bool1)
              break label403;
          }
          label391: label397: label403: for (int m = 1; ; m = 2)
          {
            ((h)localObject2).e(16492, new Object[] { Integer.valueOf(i), str1, str2, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(2), Integer.valueOf(m), "", localObject1, paramIntent, str3 });
            AppMethodBeat.o(79953);
            break;
            j = 0;
            break label188;
            j = 2;
            break label223;
            j = 0;
            break label279;
          }
        }
        catch (UnsupportedEncodingException paramIntent)
        {
          ab.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
          AppMethodBeat.o(79953);
        }
    }
  }

  private static String b(WXMediaMessage paramWXMediaMessage)
  {
    AppMethodBeat.i(79955);
    if (paramWXMediaMessage == null)
    {
      ab.w("MicroMsg.ShareReport", "sendImgMsg msg not img");
      paramWXMediaMessage = null;
      AppMethodBeat.o(79955);
    }
    while (true)
    {
      return paramWXMediaMessage;
      if ((paramWXMediaMessage.mediaObject instanceof WXImageObject))
      {
        paramWXMediaMessage = ((WXImageObject)paramWXMediaMessage.mediaObject).imagePath;
        AppMethodBeat.o(79955);
      }
      else if ((paramWXMediaMessage.mediaObject instanceof WXVideoFileObject))
      {
        paramWXMediaMessage = ((WXVideoFileObject)paramWXMediaMessage.mediaObject).filePath;
        AppMethodBeat.o(79955);
      }
      else if ((paramWXMediaMessage.mediaObject instanceof WXMusicObject))
      {
        paramWXMediaMessage = ((WXMusicObject)paramWXMediaMessage.mediaObject).musicUrl;
        AppMethodBeat.o(79955);
      }
      else if ((paramWXMediaMessage.mediaObject instanceof WXVideoObject))
      {
        paramWXMediaMessage = ((WXVideoObject)paramWXMediaMessage.mediaObject).videoUrl;
        AppMethodBeat.o(79955);
      }
      else if ((paramWXMediaMessage.mediaObject instanceof WXWebpageObject))
      {
        paramWXMediaMessage = ((WXWebpageObject)paramWXMediaMessage.mediaObject).webpageUrl;
        AppMethodBeat.o(79955);
      }
      else
      {
        paramWXMediaMessage = "";
        AppMethodBeat.o(79955);
      }
    }
  }

  public static void hK(String paramString1, String paramString2)
  {
    AppMethodBeat.i(79952);
    Object localObject1 = j.b.md(bo.anj(paramString1));
    if (localObject1 == null)
      AppMethodBeat.o(79952);
    while (true)
    {
      return;
      Object localObject2 = g.bT(((j.b)localObject1).appId, true);
      if (localObject2 == null)
      {
        AppMethodBeat.o(79952);
      }
      else
      {
        paramString1 = ((f)localObject2).field_appId;
        String str1 = ((f)localObject2).field_appName;
        int i;
        label65: int j;
        int k;
        int m;
        if (((f)localObject2).xy())
        {
          i = 1;
          j = ((j.b)localObject1).type;
          if (!t.kH(paramString2))
            break label404;
          k = 1;
          m = vvk;
        }
        try
        {
          String str2 = q.encode(bo.nullAsNil(((j.b)localObject1).url), "UTF-8");
          String str3 = q.encode(bo.nullAsNil(((j.b)localObject1).title), "UTF-8");
          String str4 = q.encode(bo.nullAsNil(((j.b)localObject1).description), "UTF-8");
          localObject2 = ((j.b)localObject1).fiQ;
          String str5 = ((j.b)localObject1).fiO;
          int n = ((j.b)localObject1).fiZ;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>(",");
          ab.i("MicroMsg.ShareReport", paramString1 + "," + str1 + "," + i + "," + j + "," + k + "," + m + "," + paramString2 + "," + str3 + "," + str4 + "," + str2 + "," + (String)localObject2 + "," + str5 + "," + n);
          h.pYm.e(16492, new Object[] { "", paramString1, str1, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), paramString2, str3, str4, str2, localObject2, str5, Integer.valueOf(n) });
          AppMethodBeat.o(79952);
          continue;
          i = 0;
          break label65;
          label404: k = 0;
        }
        catch (UnsupportedEncodingException paramString1)
        {
          ab.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
          AppMethodBeat.o(79952);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.l
 * JD-Core Version:    0.6.2
 */
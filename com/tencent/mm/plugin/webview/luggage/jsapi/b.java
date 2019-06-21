package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.e.h;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.File;
import org.json.JSONObject;

public class b extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  private static void a(Context paramContext, String paramString1, String paramString2, bc.a parama)
  {
    AppMethodBeat.i(6275);
    String str = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", paramString1);
    EmojiInfo localEmojiInfo1 = j.getEmojiStorageMgr().xYn.aqi(paramString1);
    EmojiInfo localEmojiInfo2 = localEmojiInfo1;
    int i;
    if (localEmojiInfo1 == null)
    {
      localEmojiInfo2 = localEmojiInfo1;
      if (e.ct(str))
      {
        if (!com.tencent.mm.sdk.platformtools.r.amo(str))
          break label185;
        i = EmojiInfo.yan;
        localEmojiInfo2 = new EmojiInfo();
        localEmojiInfo2.field_md5 = paramString1;
        localEmojiInfo2.field_catalog = EmojiInfo.yaf;
        localEmojiInfo2.field_type = i;
        localEmojiInfo2.field_size = e.cs(str);
        localEmojiInfo2.field_temp = 1;
        localEmojiInfo2.field_thumbUrl = paramString2;
        j.getEmojiStorageMgr().xYn.E(localEmojiInfo2);
      }
    }
    if (localEmojiInfo2 != null)
    {
      boolean bool = j.bki().a(paramContext, localEmojiInfo2, 18, com.tencent.mm.model.r.Yz());
      ab.i("MicroMsg.JsApiAddToEmotion", "doAddAction %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        parama.d(null, null);
        AppMethodBeat.o(6275);
      }
    }
    while (true)
    {
      return;
      label185: i = EmojiInfo.yam;
      break;
      parama.d("fail", null);
      AppMethodBeat.o(6275);
      continue;
      parama.d("fail", null);
      AppMethodBeat.o(6275);
    }
  }

  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6274);
    ab.i("MicroMsg.JsApiAddToEmotion", "invoke");
    paramString = c.AI(paramString);
    if (paramString == null)
    {
      ab.e("MicroMsg.JsApiAddToEmotion", "bundle is null");
      parama.d("null_data", null);
      AppMethodBeat.o(6274);
    }
    while (true)
    {
      return;
      Object localObject1 = paramString.optString("base64DataString");
      String str = paramString.optString("thumbUrl");
      Object localObject2 = paramString.optString("url");
      if (!bo.isNullOrNil((String)localObject1))
      {
        ab.i("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon use base64DataString");
        int i = ((String)localObject1).indexOf(";base64,");
        paramString = "";
        if (i != -1)
          paramString = ((String)localObject1).substring(i + 8, ((String)localObject1).length());
        try
        {
          localObject2 = Base64.decode(paramString, 0);
          if (!bo.cb((byte[])localObject2))
            break label188;
          parama.d("fail", null);
          AppMethodBeat.o(6274);
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon error:" + paramContext.getMessage());
          parama.d("fail", null);
          AppMethodBeat.o(6274);
        }
        continue;
        label188: localObject1 = g.x((byte[])localObject2);
        paramString = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", (String)localObject1);
        if ((!e.ct(paramString)) || (!g.cz(paramString).equalsIgnoreCase((String)localObject1)))
          e.b(paramString, (byte[])localObject2, localObject2.length);
        a(paramContext, (String)localObject1, str, parama);
        AppMethodBeat.o(6274);
      }
      else if (!bo.isNullOrNil((String)localObject2))
      {
        ab.i("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon use url:%s", new Object[] { localObject2 });
        paramString = new File(paramContext.getCacheDir(), g.x(((String)localObject2).getBytes()));
        if (paramString.exists())
        {
          localObject2 = g.v(paramString);
          localObject1 = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", (String)localObject2);
          if (!FileOp.ct((String)localObject1))
            FileOp.y(paramString.getAbsolutePath(), (String)localObject1);
          a(paramContext, (String)localObject2, str, parama);
          AppMethodBeat.o(6274);
        }
        else
        {
          localObject1 = new c.a();
          ((c.a)localObject1).ePH = true;
          ((c.a)localObject1).ePJ = paramString.getAbsolutePath();
          ((c.a)localObject1).eQd = new Object[] { paramString.getAbsolutePath() };
          paramString = ((c.a)localObject1).ahG();
          j.bjW().a((String)localObject2, null, paramString, new b.1(this, (String)localObject2, paramContext, str, parama));
          AppMethodBeat.o(6274);
        }
      }
      else
      {
        ab.e("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon base64DataString is null and url is null");
        parama.d("base64DataString_and_url_is_null", null);
        AppMethodBeat.o(6274);
      }
    }
  }

  public final void b(com.tencent.luggage.d.a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "addToEmoticon";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.b
 * JD-Core Version:    0.6.2
 */
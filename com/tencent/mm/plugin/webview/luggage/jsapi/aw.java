package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.io.File;
import org.json.JSONObject;

public class aw extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  private void b(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6380);
    Intent localIntent = new Intent();
    localIntent.putExtra("scene_from", 4);
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("Retr_Msg_Type", 5);
    localIntent.putExtra("Retr_Msg_thumb_path", paramString);
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
    if ((paramContext instanceof MMActivity))
    {
      ((MMActivity)paramContext).ifE = new aw.2(this, paramContext, parama);
      com.tencent.mm.bp.d.b(paramContext, ".ui.transmit.SelectConversationUI", localIntent, hashCode() & 0xFFFF);
    }
    AppMethodBeat.o(6380);
  }

  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6379);
    ab.i("MicroMsg.JsApiShareEmotion", "invoke");
    paramString = c.AI(paramString);
    if (paramString == null)
    {
      ab.e("MicroMsg.JsApiShareEmotion", "data is null");
      parama.d("null_data", null);
      AppMethodBeat.o(6379);
    }
    while (true)
    {
      return;
      Object localObject = paramString.optString("base64DataString");
      String str = paramString.optString("url");
      if (!bo.isNullOrNil((String)localObject))
      {
        ab.i("MicroMsg.JsApiShareEmotion", "use base64DataString");
        int i = ((String)localObject).indexOf(";base64,");
        paramString = "";
        if (i != -1)
          paramString = ((String)localObject).substring(i + 8, ((String)localObject).length());
        try
        {
          localObject = Base64.decode(paramString, 0);
          if (!bo.cb((byte[])localObject))
            break label180;
          parama.d("fail", null);
          AppMethodBeat.o(6379);
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.JsApiShareEmotion", "doShareEmoticon error:" + paramContext.getMessage());
          parama.d("base64_decode_fail", null);
          AppMethodBeat.o(6379);
        }
        continue;
        label180: paramString = g.x((byte[])localObject);
        str = EmojiLogic.L(b.Yb(), "", paramString);
        if ((!e.ct(str)) || (!g.cz(str).equalsIgnoreCase(paramString)))
          e.b(str, (byte[])localObject, localObject.length);
        b(paramContext, paramString, parama);
        AppMethodBeat.o(6379);
      }
      else
      {
        ab.i("MicroMsg.JsApiShareEmotion", "doShareEmoticon use url:%s", new Object[] { str });
        paramString = new File(paramContext.getCacheDir(), g.x(str.getBytes()));
        if (paramString.exists())
        {
          str = g.v(paramString);
          localObject = EmojiLogic.L(b.Yb(), "", str);
          if (!FileOp.ct((String)localObject))
            FileOp.y(paramString.getAbsolutePath(), (String)localObject);
          b(paramContext, str, parama);
          AppMethodBeat.o(6379);
        }
        else
        {
          localObject = new c.a();
          ((c.a)localObject).ePH = true;
          ((c.a)localObject).ePJ = paramString.getAbsolutePath();
          ((c.a)localObject).eQd = new Object[] { paramString.getAbsolutePath() };
          paramString = ((c.a)localObject).ahG();
          j.bjW().a(str, null, paramString, new aw.1(this, str, paramContext, parama));
          AppMethodBeat.o(6379);
        }
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
    return "shareEmoticon";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aw
 * JD-Core Version:    0.6.2
 */
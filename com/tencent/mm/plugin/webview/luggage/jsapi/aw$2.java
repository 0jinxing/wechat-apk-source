package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.ui.MMActivity.a;
import java.util.Iterator;
import java.util.List;

final class aw$2
  implements MMActivity.a
{
  aw$2(aw paramaw, Context paramContext, bc.a parama)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6378);
    ab.i("MicroMsg.JsApiShareEmotion", "mmOnActivityResult, %d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt1 == (this.ukw.hashCode() & 0xFFFF))
      ab.i("MicroMsg.JsApiShareEmotion", "share emmotion resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
    label95: String str1;
    String str2;
    Object localObject1;
    Object localObject2;
    switch (paramInt2)
    {
    default:
      this.kOx.d(null, null);
      AppMethodBeat.o(6378);
      return;
    case -1:
      str1 = bo.bc(paramIntent.getStringExtra("Select_Conv_User"), "");
      str2 = bo.bc(paramIntent.getStringExtra("emoji_thumb_path"), "");
      localObject1 = j.getEmojiStorageMgr().xYn.aqi(str2);
      if (localObject1 == null)
      {
        localObject2 = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", str2);
        if (e.ct((String)localObject2))
          if (r.amo((String)localObject2))
          {
            paramInt1 = EmojiInfo.yan;
            localObject1 = j.getEmojiStorageMgr().xYn.b(str2, "", EmojiInfo.yaf, paramInt1, e.cs((String)localObject2), null, "");
          }
      }
      break;
    case 0:
    }
    while (true)
    {
      localObject2 = bo.P(bo.bc(str1, "").split(",")).iterator();
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          str2 = (String)((Iterator)localObject2).next();
          if (localObject1 != null)
          {
            j.bki().a(str2, (EmojiInfo)localObject1, null);
            continue;
            paramInt1 = EmojiInfo.yam;
            break;
          }
        }
      paramIntent = paramIntent.getStringExtra("custom_send_text");
      if (!bo.isNullOrNil(paramIntent))
      {
        localObject1 = new qb();
        ((qb)localObject1).cMq.cMr = str1;
        ((qb)localObject1).cMq.content = paramIntent;
        ((qb)localObject1).cMq.type = t.nK(str1);
        ((qb)localObject1).cMq.flags = 0;
        a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      }
      com.tencent.mm.ui.base.h.bQ(this.val$context, this.val$context.getResources().getString(2131297050));
      break;
      this.kOx.d(null, null);
      AppMethodBeat.o(6378);
      break label95;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aw.2
 * JD-Core Version:    0.6.2
 */
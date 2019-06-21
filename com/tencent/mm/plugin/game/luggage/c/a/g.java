package com.tencent.mm.plugin.game.luggage.c.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.d.k;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.fav.ui.c;
import com.tencent.mm.plugin.webview.luggage.FavUrlTask;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.jsapi.ap;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.snackbar.a.b;

public final class g extends a
{
  private a.b mUw;

  public g()
  {
    super(4);
    AppMethodBeat.i(135906);
    this.mUw = new g.2(this);
    AppMethodBeat.o(135906);
  }

  public final void a(Context paramContext, d paramd, bbb parambbb)
  {
    AppMethodBeat.i(135907);
    parambbb = new Bundle();
    parambbb.putLong("msg_id", paramd.bPP.getLong("msg_id", -9223372036854775808L));
    parambbb.putString("sns_local_id", paramd.bPP.getString("sns_local_id"));
    parambbb.putInt("news_svr_id", paramd.bPP.getInt("news_svr_id", 0));
    parambbb.putString("news_svr_tweetid", paramd.bPP.getString("news_svr_tweetid"));
    parambbb.putInt("message_index", paramd.bPP.getInt("message_index", 0));
    Object localObject = paramd.getUrl();
    String str = paramd.cWL();
    parambbb.putString("rawUrl", str);
    if ((!bo.isNullOrNil(str)) && (str.endsWith("#rd")))
    {
      str = str.substring(0, str.length() - 3);
      if ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).startsWith(str)))
      {
        parambbb.putString("rawUrl", (String)localObject);
        parambbb.putLong("msg_id", -9223372036854775808L);
      }
    }
    label370: 
    while (true)
    {
      parambbb.putString("preChatName", paramd.bPP.getString("preChatName"));
      parambbb.putInt("preMsgIndex", paramd.bPP.getInt("preMsgIndex", 0));
      parambbb.putString("prePublishId", paramd.bPP.getString("prePublishId"));
      parambbb.putString("preUsername", paramd.bPP.getString("preUsername"));
      localObject = new FavUrlTask();
      ((FavUrlTask)localObject).actionType = 1;
      ((FavUrlTask)localObject).mqu = parambbb;
      AppBrandMainProcessService.b((MainProcessTask)localObject);
      if (((FavUrlTask)localObject).uhJ)
      {
        ap.IF(1);
        paramd.bPN.a(new g.1(this));
        AppMethodBeat.o(135907);
      }
      while (true)
      {
        return;
        if ((bo.isNullOrNil((String)localObject)) || (((String)localObject).startsWith(str)))
          break label370;
        parambbb.putString("rawUrl", (String)localObject);
        parambbb.putLong("msg_id", -9223372036854775808L);
        parambbb.putString("sns_local_id", "");
        break;
        c.a(((FavUrlTask)localObject).ret, (Activity)paramContext, this.mUw);
        AppMethodBeat.o(135907);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.g
 * JD-Core Version:    0.6.2
 */
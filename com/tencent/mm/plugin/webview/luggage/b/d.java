package com.tencent.mm.plugin.webview.luggage.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.d.k;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.webview.luggage.FavUrlTask;
import com.tencent.mm.plugin.webview.luggage.jsapi.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.widget.snackbar.a.b;

public final class d extends a
{
  private a.b mUw;

  public d()
  {
    super(3);
    AppMethodBeat.i(6428);
    this.mUw = new d.3(this);
    AppMethodBeat.o(6428);
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.webview.luggage.d paramd)
  {
    AppMethodBeat.i(6430);
    Bundle localBundle;
    Object localObject;
    String str;
    if (!paramd.bPP.getBoolean("is_favorite_item", false))
    {
      localBundle = new Bundle();
      localBundle.putLong("msg_id", paramd.bPP.getLong("msg_id", -9223372036854775808L));
      localBundle.putString("sns_local_id", paramd.bPP.getString("sns_local_id"));
      localBundle.putInt("news_svr_id", paramd.bPP.getInt("news_svr_id", 0));
      localBundle.putString("news_svr_tweetid", paramd.bPP.getString("news_svr_tweetid"));
      localBundle.putInt("message_index", paramd.bPP.getInt("message_index", 0));
      localObject = paramd.getUrl();
      str = paramd.cWL();
      localBundle.putString("rawUrl", str);
      if ((!bo.isNullOrNil(str)) && (str.endsWith("#rd")))
      {
        str = str.substring(0, str.length() - 3);
        if ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).startsWith(str)))
        {
          localBundle.putString("rawUrl", (String)localObject);
          localBundle.putLong("msg_id", -9223372036854775808L);
        }
      }
    }
    label319: label452: 
    while (true)
    {
      localBundle.putString("preChatName", paramd.bPP.getString("preChatName"));
      localBundle.putInt("preMsgIndex", paramd.bPP.getInt("preMsgIndex", 0));
      localBundle.putString("prePublishId", paramd.bPP.getString("prePublishId"));
      localBundle.putString("preUsername", paramd.bPP.getString("preUsername"));
      localObject = new FavUrlTask();
      ((FavUrlTask)localObject).actionType = 1;
      ((FavUrlTask)localObject).mqu = localBundle;
      AppBrandMainProcessService.b((MainProcessTask)localObject);
      if (((FavUrlTask)localObject).uhJ)
      {
        ap.IF(1);
        paramd.cWN().aen("sendAppMessage");
        paramd.bPN.a(new d.1(this));
        com.tencent.mm.plugin.report.service.h.pYm.k(982L, 2L, 1L);
        AppMethodBeat.o(6430);
      }
      while (true)
      {
        return;
        if ((bo.isNullOrNil((String)localObject)) || (((String)localObject).startsWith(str)))
          break label452;
        localBundle.putString("rawUrl", (String)localObject);
        localBundle.putLong("msg_id", -9223372036854775808L);
        localBundle.putString("sns_local_id", "");
        break;
        com.tencent.mm.plugin.fav.ui.c.a(((FavUrlTask)localObject).ret, (Activity)paramContext, this.mUw);
        break label319;
        com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(2131296882), null, null, paramContext.getString(2131296881), new d.2(this, paramd));
        com.tencent.mm.plugin.report.service.h.pYm.k(982L, 3L, 1L);
        AppMethodBeat.o(6430);
      }
    }
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.webview.luggage.d paramd, l paraml)
  {
    AppMethodBeat.i(6429);
    boolean bool1 = paramd.bPP.getBoolean("is_favorite_item", false);
    boolean bool2 = paramd.bPP.getBoolean("key_detail_can_delete", true);
    if (!bool1)
    {
      paraml.a(3, paramContext.getString(2131301955), 2131230996);
      AppMethodBeat.o(6429);
    }
    while (true)
    {
      return;
      if (bool2)
        paraml.a(3, paramContext.getString(2131296881), 2131230990);
      AppMethodBeat.o(6429);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.d
 * JD-Core Version:    0.6.2
 */
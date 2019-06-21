package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.f;
import com.tencent.mm.at.g;
import com.tencent.mm.at.l;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;

final class am$5
  implements n.d
{
  am$5(bi parambi, Context paramContext, boolean paramBoolean, String paramString)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(31014);
    String str = paramMenuItem.getTitle();
    paramMenuItem = null;
    if (this.fku.field_msgId > 0L)
      paramMenuItem = o.ahl().fJ(this.fku.field_msgId);
    if (((paramMenuItem == null) || (paramMenuItem.fDy <= 0L)) && (this.fku.field_msgSvrId > 0L))
      paramMenuItem = o.ahl().fI(this.fku.field_msgSvrId);
    while (true)
    {
      if (paramMenuItem == null)
      {
        ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: try get imgInfo fail");
        AppMethodBeat.o(31014);
        return;
      }
      if ((paramMenuItem.offset >= paramMenuItem.frO) && (paramMenuItem.frO != 0))
      {
        if (this.fku.field_isSend == 1)
          if (paramMenuItem.agQ())
            paramInt = 1;
        while (true)
        {
          localObject = r.Yz();
          paramMenuItem = o.ahl().q(f.c(paramMenuItem), "", "");
          if (!bo.isNullOrNil(paramMenuItem))
          {
            ab.i("MicroMsg.LongClickBrandServiceHelper", "connector click[img]: to[%s] fileName[%s]", new Object[] { str, paramMenuItem });
            paramMenuItem = new l(4, (String)localObject, str, paramMenuItem, paramInt, null, 0, "", "", true, 2130838182);
            aw.Rg().a(paramMenuItem, 0);
            bv.aaq().c(bv.fnv, null);
          }
          com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(3), Integer.valueOf(4), str });
          com.tencent.mm.ui.base.h.bQ(this.val$context, this.val$context.getString(2131297039));
          AppMethodBeat.o(31014);
          break;
          paramInt = 0;
          continue;
          if (!paramMenuItem.agQ())
            paramInt = 0;
          else if (!com.tencent.mm.vfs.e.ct(f.a(paramMenuItem).fDz))
            paramInt = 0;
          else
            paramInt = 1;
        }
      }
      paramMenuItem = new Intent(this.val$context, ImageGalleryUI.class);
      paramMenuItem.putExtra("img_gallery_msg_id", this.fku.field_msgId);
      paramMenuItem.putExtra("img_gallery_msg_svr_id", this.fku.field_msgSvrId);
      paramMenuItem.putExtra("img_gallery_talker", this.fku.field_talker);
      paramMenuItem.putExtra("img_gallery_chatroom_name", this.fku.field_talker);
      paramMenuItem.putExtra("img_gallery_is_restransmit_after_download", true);
      paramMenuItem.putExtra("img_gallery_directly_send_name", str);
      paramMenuItem.putExtra("start_chatting_ui", false);
      str = this.fku.field_talker;
      Object localObject = new Bundle();
      if (this.yMl)
        paramInt = 2;
      while (true)
      {
        ((Bundle)localObject).putInt("stat_scene", paramInt);
        ((Bundle)localObject).putString("stat_msg_id", "msg_" + Long.toString(this.fku.field_msgSvrId));
        ((Bundle)localObject).putString("stat_chat_talker_username", str);
        ((Bundle)localObject).putString("stat_send_msg_user", this.inm);
        paramMenuItem.putExtra("_stat_obj", (Bundle)localObject);
        this.val$context.startActivity(paramMenuItem);
        AppMethodBeat.o(31014);
        break;
        if (t.mZ(str))
          paramInt = 7;
        else
          paramInt = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am.5
 * JD-Core Version:    0.6.2
 */
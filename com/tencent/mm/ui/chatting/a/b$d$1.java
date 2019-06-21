package com.tencent.mm.ui.chatting.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.platformtools.ab;

final class b$d$1
  implements View.OnClickListener
{
  b$d$1(b.d paramd, b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31135);
    Object localObject = this.yNH.yND.Ox(((Integer)paramView.getTag()).intValue());
    if (localObject == null)
      AppMethodBeat.o(31135);
    b localb;
    Intent localIntent;
    while (true)
    {
      return;
      localb = this.yNH.yND;
      localIntent = new Intent();
      localIntent.putExtra("key_biz_chat_id", localb.yNB);
      localIntent.putExtra("key_is_biz_chat", localb.mgP);
      if (localObject == null)
      {
        ab.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] item == null");
        AppMethodBeat.o(31135);
      }
      else
      {
        localObject = ((b.c)localObject).cKd;
        if (localObject != null)
          break;
        ab.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] msg == null");
        AppMethodBeat.o(31135);
      }
    }
    int i = localb.mContext.getResources().getConfiguration().orientation;
    int[] arrayOfInt = new int[2];
    int j;
    int k;
    if (paramView != null)
    {
      j = paramView.getWidth();
      k = paramView.getHeight();
      paramView.getLocationInWindow(arrayOfInt);
    }
    while (true)
    {
      localIntent.addFlags(536870912);
      localIntent.putExtra("img_gallery_msg_id", ((cy)localObject).field_msgId).putExtra("img_gallery_msg_svr_id", ((cy)localObject).field_msgSvrId).putExtra("img_gallery_talker", ((cy)localObject).field_talker).putExtra("img_gallery_chatroom_name", ((cy)localObject).field_talker).putExtra("img_gallery_orientation", i);
      if (paramView != null)
        localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", k).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]).putExtra("img_gallery_enter_from_grid", true);
      while (true)
      {
        d.f(localb.mContext, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", localIntent);
        ((Activity)localb.mContext).overridePendingTransition(0, 0);
        AppMethodBeat.o(31135);
        break;
        localIntent.putExtra("img_gallery_back_from_grid", true);
      }
      k = 0;
      j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.b.d.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a.b;

final class SelectConversationUI$8
  implements c.a.b
{
  SelectConversationUI$8(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(35132);
    Intent localIntent = new Intent(this.zKj.mController.ylL, ImageGalleryUI.class);
    localIntent.putExtra("img_gallery_msg_id", SelectConversationUI.i(this.zKj));
    localIntent.putExtra("img_gallery_msg_svr_id", SelectConversationUI.j(this.zKj).field_msgSvrId);
    localIntent.putExtra("img_gallery_talker", SelectConversationUI.j(this.zKj).field_talker);
    localIntent.putExtra("img_gallery_chatroom_name", SelectConversationUI.j(this.zKj).field_talker);
    localIntent.putExtra("img_preview_only", true);
    this.zKj.startActivity(localIntent);
    b.hL(this.zKj.mController.ylL);
    AppMethodBeat.o(35132);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.8
 * JD-Core Version:    0.6.2
 */
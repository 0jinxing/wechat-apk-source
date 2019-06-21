package com.tencent.mm.ui.conversation;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;

final class AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$9
  implements AdapterView.OnItemClickListener
{
  AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$9(AppBrandServiceConversationUI.AppBrandServiceConversationFmUI paramAppBrandServiceConversationFmUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33994);
    AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$402(this.zqn, (ak)AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$100(this.zqn).getItem(paramInt));
    paramView = AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$400(this.zqn);
    if (paramView == null)
    {
      ab.e("MicroMsg.AppBrandServiceConversationFmUI", "user should not be null. position:%d, size:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$100(this.zqn).getCount()) });
      AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$100(this.zqn).notifyDataSetChanged();
      AppMethodBeat.o(33994);
    }
    while (true)
    {
      return;
      AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$502(this.zqn, paramView.field_username);
      paramAdapterView = new Bundle();
      paramAdapterView.putBoolean("finish_direct", false);
      paramAdapterView.putBoolean("key_need_send_video", false);
      paramAdapterView.putString("key_scene_id", AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$000(this.zqn));
      paramAdapterView.putInt("app_brand_chatting_from_scene", AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$600(this.zqn));
      this.zqn.ui.startChatting(paramView.field_username, paramAdapterView, true);
      this.zqn.entryCustomerMsgDialogReport(paramView.field_username, AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$600(this.zqn));
      AppMethodBeat.o(33994);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.9
 * JD-Core Version:    0.6.2
 */
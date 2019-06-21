package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.d;

public class CreateChatroom$Req extends BaseReq
{
  public String chatroomName;
  public String chatroomNickName;
  public String extMsg;
  public String groupId = "";

  public boolean checkArgs()
  {
    AppMethodBeat.i(128162);
    boolean bool;
    if (d.b(this.groupId))
    {
      bool = false;
      AppMethodBeat.o(128162);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(128162);
    }
  }

  public int getType()
  {
    return 14;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128163);
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_create_chatroom_group_id", this.groupId);
    paramBundle.putString("_wxapi_create_chatroom_chatroom_name", this.chatroomName);
    paramBundle.putString("_wxapi_create_chatroom_chatroom_nickname", this.chatroomNickName);
    paramBundle.putString("_wxapi_create_chatroom_ext_msg", this.extMsg);
    paramBundle.putString("_wxapi_basereq_openid", this.openId);
    AppMethodBeat.o(128163);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.CreateChatroom.Req
 * JD-Core Version:    0.6.2
 */
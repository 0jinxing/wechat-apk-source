package com.tencent.mm.plugin.wear.model.e;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class f extends a
{
  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26397);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11016));
    localArrayList.add(Integer.valueOf(11017));
    localArrayList.add(Integer.valueOf(11018));
    AppMethodBeat.o(26397);
    return localArrayList;
  }

  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26398);
    try
    {
      localObject = new java/lang/String;
      ((String)localObject).<init>(paramArrayOfByte, "utf8");
      paramArrayOfByte = (byte[])localObject;
      if (bo.isNullOrNil(paramArrayOfByte))
      {
        ab.i("MicroMsg.Wear.HttpFriendServer", "error to get username");
        AppMethodBeat.o(26398);
        return null;
      }
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = "";
      ab.i("MicroMsg.Wear.HttpFriendServer", "handle friend request %s", new Object[] { paramArrayOfByte });
      if (paramInt != 11016)
        break label152;
    }
    Object localObject = new Intent();
    ((Intent)localObject).setClassName(ah.getPackageName(), ah.getPackageName() + ".plugin.subapp.ui.friend.FMessageTransferUI");
    ((Intent)localObject).putExtra("friend_message_transfer_username", paramArrayOfByte);
    ((Intent)localObject).setAction("friend_message_accept_".concat(String.valueOf(paramArrayOfByte)));
    ((Intent)localObject).setFlags(335544320);
    ah.getContext().startActivity((Intent)localObject);
    while (true)
    {
      AppMethodBeat.o(26398);
      break;
      label152: if (paramInt == 11017)
      {
        localObject = new Intent();
        ((Intent)localObject).setClassName(ah.getPackageName(), ah.getPackageName() + ".plugin.subapp.ui.friend.FMessageTransferUI");
        ((Intent)localObject).putExtra("friend_message_transfer_username", paramArrayOfByte);
        ((Intent)localObject).setAction("friend_message_ignore_".concat(String.valueOf(paramArrayOfByte)));
        ((Intent)localObject).setFlags(335544320);
        ah.getContext().startActivity((Intent)localObject);
      }
      else if (paramInt == 11018)
      {
        paramArrayOfByte = new Intent();
        paramArrayOfByte.setClassName(ah.getPackageName(), ah.getPackageName() + ".plugin.subapp.ui.friend.FMessageConversationUI");
        paramArrayOfByte.setFlags(335544320);
        ah.getContext().startActivity(paramArrayOfByte);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.f
 * JD-Core Version:    0.6.2
 */
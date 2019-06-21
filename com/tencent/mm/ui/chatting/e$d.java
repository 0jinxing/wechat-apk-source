package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.transmit.SelectConversationUI;

final class e$d
  implements e.c
{
  public static boolean ara(String paramString)
  {
    AppMethodBeat.i(30454);
    boolean bool;
    if ((paramString != null) && ((paramString.startsWith("weixin://wesport/recommend")) || (paramString.startsWith("weixin://openNativeUrl/rankMyHomepage")) || (paramString.startsWith("weixin://openNativeUrl/rankSetting"))))
    {
      bool = true;
      AppMethodBeat.o(30454);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30454);
    }
  }

  public final boolean a(String paramString1, Context paramContext, MMFragment paramMMFragment, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(30455);
    if (bo.isNullOrNil(paramString1))
    {
      ab.d("MicroMsg.BizNativeUrlDispatcher", "nativeUrl is null.");
      AppMethodBeat.o(30455);
    }
    while (true)
    {
      return bool;
      if ((paramString1.startsWith("weixin://wesport/recommend")) && (paramMMFragment != null))
      {
        paramString1 = new Intent(paramContext, SelectConversationUI.class);
        paramString1.putExtra("Select_Talker_Name", paramString2);
        paramString1.putExtra("Select_block_List", paramString2);
        paramString1.putExtra("Select_Conv_Type", 3);
        paramString1.putExtra("Select_Send_Card", true);
        paramMMFragment.startActivityForResult(paramString1, 224);
        AppMethodBeat.o(30455);
        bool = true;
      }
      else if (paramString1.startsWith("weixin://openNativeUrl/rankMyHomepage"))
      {
        paramString1 = r.Yz();
        if (bo.isNullOrNil(paramString1))
        {
          ab.e("MicroMsg.BizNativeUrlDispatcher", "Get username from UserInfo return null or nil.");
          AppMethodBeat.o(30455);
        }
        else
        {
          paramMMFragment = new Intent();
          paramMMFragment.putExtra("username", paramString1);
          d.b(paramContext, "exdevice", ".ui.ExdeviceProfileUI", paramMMFragment);
          ab.i("MicroMsg.BizNativeUrlDispatcher", "Jump to ExdeviceProfileUI.");
          AppMethodBeat.o(30455);
          bool = true;
        }
      }
      else if (paramString1.startsWith("weixin://openNativeUrl/rankSetting"))
      {
        d.H(paramContext, "exdevice", ".ui.ExdeviceSettingUI");
        AppMethodBeat.o(30455);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(30455);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.e.d
 * JD-Core Version:    0.6.2
 */
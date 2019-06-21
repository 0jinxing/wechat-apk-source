package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMFragment;

final class e$a
  implements e.c
{
  public final boolean a(String paramString1, Context paramContext, MMFragment paramMMFragment, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(30451);
    if (paramString1.startsWith("weixin://openNativeUrl/weixinHB/startsendnormalhbrequest"))
    {
      paramString1 = new Intent();
      paramString1.putExtra("key_type", 0);
      d.b(paramContext, "luckymoney", ".ui.LuckyMoneyPrepareUI", paramString1);
      AppMethodBeat.o(30451);
    }
    while (true)
    {
      return bool;
      if (paramString1.startsWith("weixin://openNativeUrl/weixinHB/startsendrandomhbrequest"))
      {
        paramString1 = new Intent();
        paramString1.putExtra("key_type", 1);
        d.b(paramContext, "luckymoney", ".ui.LuckyMoneyPrepareUI", paramString1);
        AppMethodBeat.o(30451);
      }
      else if (paramString1.startsWith("weixin://openNativeUrl/weixinHB/startsendhblistrequest"))
      {
        paramString1 = new Intent();
        paramString1.putExtra("key_type", 1);
        d.b(paramContext, "luckymoney", ".ui.LuckyMoneyMyRecordUI", paramString1);
        AppMethodBeat.o(30451);
      }
      else if (paramString1.startsWith("weixin://openNativeUrl/weixinHB/startreceivehblistrequest"))
      {
        paramString1 = new Intent();
        paramString1.putExtra("key_type", 2);
        d.b(paramContext, "luckymoney", ".ui.LuckyMoneyMyRecordUI", paramString1);
        AppMethodBeat.o(30451);
      }
      else if (paramString1.startsWith("weixin://openNativeUrl/weixinHB/openDetail"))
      {
        paramMMFragment = new Intent();
        paramMMFragment.putExtra("key_native_url", paramString1);
        d.b(paramContext, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", paramMMFragment);
        AppMethodBeat.o(30451);
      }
      else if (paramString1.startsWith("weixin://openNativeUrl/weixinHB/startreceivebizhbrequest"))
      {
        paramMMFragment = new Intent();
        paramMMFragment.putExtra("key_way", 5);
        paramMMFragment.putExtra("key_native_url", paramString1);
        paramMMFragment.putExtra("key_static_from_scene", 1);
        d.b(paramContext, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", paramMMFragment);
        AppMethodBeat.o(30451);
      }
      else
      {
        AppMethodBeat.o(30451);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.e.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.emoji.h;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.emoji.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  private final String TAG = "MicroMsg.emoji.UseSmileyTool";
  public int iGJ;
  public String lgK;

  public c(int paramInt)
  {
    this.iGJ = paramInt;
  }

  public static void a(Intent paramIntent, String paramString, Activity paramActivity)
  {
    AppMethodBeat.i(53868);
    if (paramIntent == null)
      AppMethodBeat.o(53868);
    while (true)
    {
      return;
      a(paramIntent.getStringExtra("Select_Conv_User"), paramString, paramActivity);
      AppMethodBeat.o(53868);
    }
  }

  public static void a(String paramString1, String paramString2, Activity paramActivity)
  {
    AppMethodBeat.i(53869);
    if (bo.isNullOrNil(paramString1))
    {
      ab.d("MicroMsg.emoji.UseSmileyTool", "talker name is invalid so can't go to chat room use.");
      AppMethodBeat.o(53869);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("Chat_User", paramString1);
      localIntent.putExtra("smiley_product_id", paramString2);
      b.gkE.d(localIntent, paramActivity);
      AppMethodBeat.o(53869);
    }
  }

  public final void A(Activity paramActivity)
  {
    AppMethodBeat.i(53870);
    ab.d("MicroMsg.emoji.UseSmileyTool", "jacks sendToFriend emoji");
    Intent localIntent = new Intent();
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
    localIntent.putExtra("MMActivity.OverrideExitAnimation", 2131034227);
    d.b(paramActivity, ".ui.transmit.SelectConversationUI", localIntent, this.iGJ);
    paramActivity.overridePendingTransition(2131034229, 2131034181);
    AppMethodBeat.o(53870);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.h.c
 * JD-Core Version:    0.6.2
 */
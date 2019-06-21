package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMWizardActivity;

public final class b
{
  public static void a(Activity paramActivity, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(104219);
    Intent localIntent;
    if (paramBoolean)
    {
      localIntent = new Intent(paramActivity, RoomUpgradeUI.class);
      localIntent.setFlags(603979776);
      localIntent.putExtra("room_name", paramString);
      paramString = new Intent();
      paramString.setClassName(paramActivity, "com.tencent.mm.plugin.account.ui.bind.BindMobileUI");
      paramString.putExtra("is_bind_for_chatroom_upgrade", true);
      MMWizardActivity.b(paramActivity, paramString, localIntent);
      AppMethodBeat.o(104219);
    }
    while (true)
    {
      return;
      localIntent = new Intent(paramActivity, RoomUpgradeUI.class);
      localIntent.setFlags(603979776);
      localIntent.putExtra("room_name", paramString);
      localIntent.putExtra("announce_ok", true);
      paramActivity.startActivity(localIntent);
      AppMethodBeat.o(104219);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.b
 * JD-Core Version:    0.6.2
 */
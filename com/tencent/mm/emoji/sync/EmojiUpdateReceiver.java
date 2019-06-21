package com.tencent.mm.emoji.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class EmojiUpdateReceiver extends BroadcastReceiver
{
  public static String ACTION = "com.tencent.mm.Emoji_Update";
  public static String ezN = "type";
  public static String ezO = "update_all_custom_emoji";
  public static String ezP = "update_download_custom_emoji";
  public static String ezQ = "update_store_emoji";
  public static String ezR = "update_group_info";
  public static String ezS = "update_capture_emoji";
  public static String ezT = "update_emoji_download";

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(62269);
    String str = paramIntent.getAction();
    if (ACTION.equals(str))
    {
      paramContext = paramIntent.getStringExtra(ezN);
      ab.i("MicroMsg.EmojiUpdateReceiver", "receive %s, %s", new Object[] { str, paramContext });
      if (ezO.equals(paramContext))
      {
        com.tencent.mm.emoji.a.a.OB().ca(false);
        AppMethodBeat.o(62269);
      }
    }
    while (true)
    {
      return;
      if (ezP.equals(paramContext))
      {
        com.tencent.mm.emoji.a.a.OB().cb(false);
        AppMethodBeat.o(62269);
      }
      else if (ezQ.equals(paramContext))
      {
        com.tencent.mm.emoji.a.a.OB().eyx = true;
        AppMethodBeat.o(62269);
      }
      else if (ezR.equals(paramContext))
      {
        com.tencent.mm.emoji.a.a.OB().cc(false);
        AppMethodBeat.o(62269);
      }
      else if (ezS.equals(paramContext))
      {
        com.tencent.mm.emoji.a.a.OB().cd(false);
        AppMethodBeat.o(62269);
      }
      else
      {
        if (ezT.equals(paramContext))
        {
          paramContext = paramIntent.getStringExtra("md5");
          boolean bool = paramIntent.getBooleanExtra("result", false);
          paramIntent = com.tencent.mm.emoji.loader.a.exs;
          com.tencent.mm.emoji.loader.a.q(paramContext, bool);
        }
        AppMethodBeat.o(62269);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.sync.EmojiUpdateReceiver
 * JD-Core Version:    0.6.2
 */
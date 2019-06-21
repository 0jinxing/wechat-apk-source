package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class b
  implements View.OnClickListener
{
  protected int lSl;
  protected Context mContext;
  protected int mXC;

  public b(Context paramContext)
  {
    this.mContext = paramContext;
    this.lSl = 1301;
    if (paramContext == null)
      throw new IllegalArgumentException("context is null.");
  }

  protected static int a(Context paramContext, n paramn)
  {
    int i = 0;
    if (paramn == null)
      ab.e("MicroMsg.GameMessageOnClickListener", "game message is null.");
    while (true)
    {
      return i;
      if (!bo.isNullOrNil(paramn.field_appId))
      {
        Bundle localBundle = new Bundle();
        localBundle.putCharSequence("game_app_id", paramn.field_appId);
        localBundle.putInt("game_report_from_scene", 1301);
        i = c.b(paramContext, paramn.field_appId, null, localBundle);
      }
      else
      {
        ab.e("MicroMsg.GameMessageOnClickListener", "message type : " + paramn.field_msgType + " ,message.field_appId is null.");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.b
 * JD-Core Version:    0.6.2
 */
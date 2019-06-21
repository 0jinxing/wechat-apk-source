package com.tencent.mm.plugin.game;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lw;
import com.tencent.mm.g.a.lw.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.ui.GameCenterUI;
import com.tencent.mm.plugin.game.ui.GameDetailUI;
import com.tencent.mm.plugin.game.ui.GameLibraryUI;
import com.tencent.mm.plugin.game.ui.GameMessageUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

final class c$14 extends com.tencent.mm.sdk.b.c<lw>
{
  c$14(c paramc)
  {
    AppMethodBeat.i(111157);
    this.xxI = lw.class.getName().hashCode();
    AppMethodBeat.o(111157);
  }

  private static boolean a(lw paramlw)
  {
    AppMethodBeat.i(111158);
    String str1 = "";
    Object localObject1 = str1;
    String str2 = str1;
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localObject1 = str1;
      str2 = str1;
      localJSONObject.<init>(paramlw.cHK.extraInfo);
      localObject1 = str1;
      str2 = str1;
      str1 = localJSONObject.optString("appId");
      localObject1 = str1;
      str2 = str1;
      i = bo.getInt(localJSONObject.optString("ssid"), 0);
      str2 = str1;
      localObject1 = new Intent();
      switch (paramlw.cHK.cHL)
      {
      default:
        AppMethodBeat.o(111158);
        return false;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.e("MicroMsg.OpenGameJsapiProcessor", "JSONException : %s", new Object[] { localJSONException.getMessage() });
        i = 0;
        localObject2 = localObject1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2;
        ab.e("MicroMsg.OpenGameJsapiProcessor", "JSONException : %s", new Object[] { localException.getMessage() });
        int i = 0;
        continue;
        localException.setClass(paramlw.cHK.context, GameCenterUI.class);
        if (paramlw.cHK.jumpType == 1)
          localException.putExtra("jump_find_more_friends", "jump_find_more_friends");
        localException.putExtra("game_report_from_scene", 5);
        paramlw.cHK.context.startActivity(localException);
        b.a(paramlw.cHK.context, 5, 5, 1, 6, i, null);
        continue;
        localException.setClass(paramlw.cHK.context, GameLibraryUI.class);
        if (paramlw.cHK.jumpType == 1)
          localException.putExtra("jump_game_center", "jump_game_center");
        localException.putExtra("game_report_from_scene", 5);
        paramlw.cHK.context.startActivity(localException);
        b.a(paramlw.cHK.context, 5, 5, 1, 6, i, null);
        continue;
        if (!bo.isNullOrNil(localObject2))
        {
          localException.setClass(paramlw.cHK.context, GameDetailUI.class);
          localException.putExtra("game_app_id", localObject2);
          if (paramlw.cHK.jumpType == 1)
            localException.putExtra("jump_game_center", "jump_game_center");
          localException.putExtra("game_report_from_scene", 5);
          paramlw.cHK.context.startActivity(localException);
          b.a(paramlw.cHK.context, 5, 5, 1, 6, i, null);
          continue;
          localException.setClass(paramlw.cHK.context, GameMessageUI.class);
          localException.putExtra("game_report_from_scene", 5);
          paramlw.cHK.context.startActivity(localException);
          b.a(paramlw.cHK.context, 5, 5, 1, 6, i, null);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.c.14
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static final List<bbb> uEt;

  static
  {
    AppMethodBeat.i(8804);
    uEt = new LinkedList();
    bbb localbbb = new bbb();
    localbbb.Title = ah.getResources().getString(2131300308);
    localbbb.ThumbUrl = "game_menu_icon_share_to_friend";
    localbbb.wFR = 1;
    localbbb.wFQ = 1;
    localbbb.wkB = c.a.uEA.code;
    uEt.add(localbbb);
    localbbb = new bbb();
    localbbb.Title = ah.getResources().getString(2131300306);
    localbbb.ThumbUrl = "game_menu_icon_exit";
    localbbb.wFR = 2;
    localbbb.wFQ = 2;
    localbbb.wkB = c.a.uEz.code;
    uEt.add(localbbb);
    localbbb = new bbb();
    localbbb.Title = ah.getResources().getString(2131300307);
    localbbb.ThumbUrl = "game_menu_icon_refresh";
    localbbb.wFR = 4;
    localbbb.wFQ = 5;
    localbbb.wkB = c.a.uEC.code;
    uEt.add(localbbb);
    localbbb = new bbb();
    localbbb.Title = ah.getResources().getString(2131300304);
    localbbb.ThumbUrl = "game_menu_icon_collect";
    localbbb.wFR = 3;
    localbbb.wFQ = 6;
    localbbb.wkB = c.a.uEB.code;
    uEt.add(localbbb);
    localbbb = new bbb();
    localbbb.Title = ah.getResources().getString(2131300305);
    localbbb.ThumbUrl = "game_menu_icon_complaint";
    localbbb.wFR = 6;
    localbbb.wFQ = 7;
    localbbb.wkB = c.a.uEE.code;
    uEt.add(localbbb);
    localbbb = new bbb();
    localbbb.Title = ah.getResources().getString(2131300303);
    localbbb.ThumbUrl = "game_menu_icon_add_to_desktop";
    localbbb.wFR = 5;
    localbbb.wFQ = 8;
    localbbb.wkB = c.a.uED.code;
    uEt.add(localbbb);
    AppMethodBeat.o(8804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.a
 * JD-Core Version:    0.6.2
 */
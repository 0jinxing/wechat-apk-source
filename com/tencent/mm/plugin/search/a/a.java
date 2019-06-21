package com.tencent.mm.plugin.search.a;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.topstory.ui.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMWizardActivity;

public final class a
{
  public static final SparseArray<a.a> qiX;

  static
  {
    AppMethodBeat.i(24402);
    SparseArray localSparseArray = new SparseArray();
    qiX = localSparseArray;
    localSparseArray.put(19, new a.a(19, -1, ".ui.SnsTimeLineUI", "sns", ""));
    qiX.put(30, new a.a(19, -1, ".ui.BaseScanUI", "scanner", "", (byte)0));
    qiX.put(18, new a.a(18, -1, ".ui.ShakeReportUI", "shake", ""));
    qiX.put(17, new a.a(17, -1, ".ui.NearbyFriendsIntroUI", "nearby", ""));
    qiX.put(16, new a.a(16, -1, ".ui.BottleBeachUI", "bottle", ""));
    qiX.put(31, new a.a(31, -1, ".ui.GameCenterUI", "game", ""));
    qiX.put(20, new a.a(20, -1, ".plugin.profile.ui.ContactInfoUI", "", "voiceinputapp"));
    qiX.put(21, new a.a(21, -1, ".plugin.profile.ui.ContactInfoUI", "", "linkedinplugin"));
    qiX.put(26, new a.a(26, -1, ".plugin.profile.ui.ContactInfoUI", "", "qqfriend"));
    qiX.put(29, new a.a(29, -1, ".plugin.profile.ui.ContactInfoUI", "", "voipapp"));
    qiX.put(23, new a.a(23, 1, ".ui.chatting.ChattingUI", "", "qqmail"));
    qiX.put(1, new a.a(1, -1, ".ui.MallIndexUI", "mall", ""));
    qiX.put(24, new a.a(24, 8, ".ui.chatting.ChattingUI", "", "weibo"));
    qiX.put(27, new a.a(27, 65536, ".ui.MassSendHistoryUI", "masssend", "masssendapp"));
    qiX.put(28, new a.a(28, 524288, ".ui.ReaderAppUI", "readerapp", "newsapp"));
    qiX.put(32, new a.a(32, -1, ".ui.v2.EmojiStoreV2UI", "emoji", ""));
    qiX.put(33, new a.a(33, -1, ".ui.FavoriteIndexUI", "favorite", ""));
    qiX.put(34, new a.a(34, -1, ".ui.MallIndexUI", "mall", ""));
    qiX.put(35, new a.a(35, -1, ".backupmoveui.BackupUI", "backup", ""));
    qiX.put(38, new a.a(38, 16, ".ui.chatting.ChattingUI", "", "medianote"));
    qiX.put(39, new a.a(39, -1, ".ui.chatting.ChattingUI", "", "filehelper"));
    qiX.put(6, new a.a(6, -1, ".ui.LuckyMoneyIndexUI", "luckymoney", ""));
    qiX.put(41, new a.a(41, -1, ".ui.WalletOfflineEntranceUI", "offline", ""));
    qiX.put(42, new a.a(42, -1, ".ui.CollectAdapterUI", "collect", ""));
    qiX.put(40, new a.a(40, -1, ".balance.ui.WalletBalanceManagerUI", "wallet", ""));
    qiX.put(43, new a.a(43, -1, ".ui.chatting.ChattingUI", "", "gh_43f2581f6fd6"));
    qiX.put(50, new a.a(50, -1, ".ui.conversation.BizConversationUI", "app", ""));
    qiX.put(51, new a.a(51, -1, ".ui.setting.SettingsPrivacyUI", "setting", ""));
    qiX.put(66, new a.a(66, -1, ".ui.AppBrandLauncherUI", "appbrand", ""));
    qiX.put(63, new a.a(63, -1, ".ui.conversation.BizConversationUI", "app", ""));
    qiX.put(64, new a.a(64, -1, ".plugin.setting.ui.fixtools.FixToolsUI", "app", ""));
    qiX.put(65, new a.a(65, -1, "", "", ""));
    qiX.put(67, new a.a(67, -1, ".plugin.brandservice.ui.timeline.BizTimeLineUI", "app", ""));
    AppMethodBeat.o(24402);
  }

  public static boolean U(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(24401);
    boolean bool;
    if (qiX.indexOfKey(paramInt) < 0)
    {
      AppMethodBeat.o(24401);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramInt == 30) && ((com.tencent.mm.r.a.bI(paramContext)) || (com.tencent.mm.r.a.bH(paramContext))))
      {
        AppMethodBeat.o(24401);
        bool = false;
      }
      else
      {
        Object localObject = (a.a)qiX.get(paramInt);
        if ((((a.a)localObject).qiY != -1) && ((r.YK() & ((a.a)localObject).qiY) != 0))
        {
          bool = aR(paramContext, ((a.a)localObject).username);
          AppMethodBeat.o(24401);
        }
        else
        {
          Intent localIntent;
          if (!bo.isNullOrNil(((a.a)localObject).qiZ))
          {
            localIntent = new Intent();
            if (paramInt == 28)
              localIntent.putExtra("type", 20);
            if (paramInt == 1)
              localIntent.putExtra("key_native_url", "wxpay://bizmall/mobile_recharge");
            localIntent.putExtra("animation_pop_in", ((a.a)localObject).qja);
            if (paramInt == 32)
              h.pYm.e(12065, new Object[] { Integer.valueOf(6) });
            if (paramInt == 6)
              localIntent.putExtra("pay_channel", 15);
            if (paramInt == 31)
              localIntent.putExtra("game_report_from_scene", 4);
            if (paramInt == 41)
              localIntent.putExtra("key_from_scene", 5);
            if (paramInt == 42)
              localIntent.putExtra("key_from_scene", 4);
            if (paramInt == 64)
              localIntent.putExtra("entry_fix_tools", 1);
            if ((paramInt == 63) || (paramInt == 67))
              localIntent.putExtra("biz_enter_source", 2);
            if (paramInt == 33)
              com.tencent.mm.plugin.fav.a.b.b(paramContext, ".ui.FavoriteIndexUI", new Intent());
            while (true)
            {
              com.tencent.mm.ui.base.b.K(paramContext, localIntent);
              AppMethodBeat.o(24401);
              bool = true;
              break;
              if (paramInt == 35)
              {
                localIntent.setClassName(paramContext, "com.tencent.mm.plugin.backup.backupmoveui.BackupUI");
                MMWizardActivity.J(paramContext, localIntent);
              }
              else if (paramInt == 66)
              {
                ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).b(paramContext, 16, false);
              }
              else if (!((a.a)localObject).qiZ.equals("app"))
              {
                d.b(paramContext, ((a.a)localObject).qiZ, ((a.a)localObject).uri, localIntent);
              }
              else
              {
                d.f(paramContext, ((a.a)localObject).uri, localIntent);
              }
            }
          }
          if (paramInt == 65)
          {
            c.W(paramContext, 21);
            AppMethodBeat.o(24401);
            bool = true;
          }
          else
          {
            if (((a.a)localObject).uri.equals(".ui.chatting.ChattingUI"))
            {
              localObject = ((a.a)localObject).username;
              if (com.tencent.mm.n.a.jh(((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO((String)localObject).field_type))
              {
                localIntent = new Intent();
                localIntent.putExtra("Chat_User", (String)localObject);
                localIntent.putExtra("finish_direct", true);
                d.f(paramContext, ".ui.chatting.ChattingUI", localIntent);
              }
              while (true)
              {
                AppMethodBeat.o(24401);
                bool = true;
                break;
                aR(paramContext, (String)localObject);
              }
            }
            if (((a.a)localObject).uri.equals(".plugin.profile.ui.ContactInfoUI"))
            {
              bool = aR(paramContext, ((a.a)localObject).username);
              AppMethodBeat.o(24401);
            }
            else
            {
              ab.e("MicroMsg.Feature", "Error URI of android feature");
              AppMethodBeat.o(24401);
              bool = false;
            }
          }
        }
      }
    }
  }

  private static boolean aR(Context paramContext, String paramString)
  {
    AppMethodBeat.i(24400);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramString);
    d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
    AppMethodBeat.o(24400);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.search.a.a
 * JD-Core Version:    0.6.2
 */
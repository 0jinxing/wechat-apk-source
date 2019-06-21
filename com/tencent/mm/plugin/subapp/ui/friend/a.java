package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.u;
import junit.framework.Assert;

public final class a
  implements AdapterView.OnItemClickListener
{
  private Context context;
  private boolean fsN = false;
  private b stw;

  public a(Context paramContext, b paramb, boolean paramBoolean)
  {
    this.context = paramContext;
    this.stw = paramb;
    this.fsN = paramBoolean;
  }

  private static void a(Context paramContext, ax paramax)
  {
    AppMethodBeat.i(25343);
    com.tencent.mm.model.aw.ZK();
    bi.a locala = c.XO().Rn(paramax.field_msgContent);
    if (locala == null)
      AppMethodBeat.o(25343);
    while (true)
    {
      return;
      if (locala.svN.length() <= 0)
      {
        AppMethodBeat.o(25343);
      }
      else
      {
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("Contact_ShowFMessageList", true);
        localBundle.putInt("Contact_Source_FMessage", locala.scene);
        com.tencent.mm.model.aw.ZK();
        ad localad = c.XM().aoO(locala.svN);
        if ((localad != null) && ((int)localad.ewQ > 0) && (com.tencent.mm.n.a.jh(localad.field_type)))
        {
          com.tencent.mm.plugin.subapp.b.gkF.a(paramContext, localad, locala, localBundle, "");
          AppMethodBeat.o(25343);
        }
        else if (locala.pnz > 0L)
        {
          if ((bo.isNullOrNil(locala.gwK)) && (bo.isNullOrNil(locala.gwH)) && (!bo.isNullOrNil(locala.nickname)))
            localBundle.putString("Contact_QQNick", locala.nickname);
          com.tencent.mm.plugin.subapp.b.gkF.a(paramContext, locala, localBundle);
          AppMethodBeat.o(25343);
        }
        else if ((!bo.isNullOrNil(locala.xZi)) || (!bo.isNullOrNil(locala.xZj)))
        {
          com.tencent.mm.plugin.account.friend.a.a locala1 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW(locala.xZi);
          if ((locala1 != null) && (locala1.Aq() != null))
          {
            paramax = locala1;
            if (locala1.Aq().length() > 0);
          }
          else
          {
            locala1 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW(locala.xZj);
            if ((locala1 != null) && (locala1.Aq() != null))
            {
              paramax = locala1;
              if (locala1.Aq().length() > 0);
            }
            else
            {
              if ((localad != null) && ((int)localad.ewQ > 0))
                com.tencent.mm.plugin.subapp.b.gkF.a(paramContext, localad, locala, localBundle, "");
              while (true)
              {
                ab.e("MicroMsg.FConversationOnItemClickListener", "error : this is not the mobile contact, MD5 = " + locala.xZi + " fullMD5:" + locala.xZj);
                AppMethodBeat.o(25343);
                break;
                com.tencent.mm.plugin.subapp.b.gkF.a(paramContext, locala, localBundle);
              }
            }
          }
          if ((paramax.getUsername() == null) || (paramax.getUsername().length() <= 0))
          {
            paramax.username = locala.svN;
            paramax.bJt = 128;
            if (com.tencent.mm.plugin.account.a.getAddrUploadStg().a(paramax.Aq(), paramax) == -1)
            {
              ab.e("MicroMsg.FConversationOnItemClickListener", "update mobile contact username failed");
              AppMethodBeat.o(25343);
            }
          }
          else
          {
            com.tencent.mm.plugin.subapp.b.gkF.a(paramContext, locala, localBundle);
            AppMethodBeat.o(25343);
          }
        }
        else
        {
          com.tencent.mm.plugin.subapp.b.gkF.a(paramContext, locala, localBundle);
          AppMethodBeat.o(25343);
        }
      }
    }
  }

  public static void a(Context paramContext, ax paramax, boolean paramBoolean)
  {
    AppMethodBeat.i(25344);
    String str = paramax.field_msgContent;
    ab.w("MicroMsg.FConversationOnItemClickListener", "dealClickVerifyMsgEvent : ".concat(String.valueOf(str)));
    if ((str == null) || (str.length() <= 0))
    {
      AppMethodBeat.o(25344);
      return;
    }
    com.tencent.mm.model.aw.ZK();
    bi.d locald = c.XO().Rm(str);
    boolean bool;
    label88: ad localad;
    Intent localIntent;
    if ((locald != null) && (!bo.isNullOrNil(locald.svN)))
    {
      if (locald.svN.length() <= 0)
        break label634;
      bool = true;
      Assert.assertTrue(bool);
      com.tencent.mm.model.aw.ZK();
      localad = c.XM().aoO(locald.svN);
      localIntent = new Intent();
      if (paramBoolean == true)
        localIntent.putExtra("Accept_NewFriend_FromOutside", true);
      localIntent.putExtra("Contact_ShowUserName", false);
      localIntent.putExtra("Contact_ShowFMessageList", true);
      localIntent.putExtra("Contact_Scene", locald.scene);
      localIntent.putExtra("Verify_ticket", locald.mGZ);
      localIntent.putExtra("Contact_Source_FMessage", locald.scene);
      if ((localad == null) || ((int)localad.ewQ <= 0) || (!com.tencent.mm.n.a.jh(localad.field_type)))
        break label640;
      localIntent.putExtra("Contact_User", localad.field_username);
      com.tencent.mm.plugin.subapp.b.gkF.a(localIntent, localad.field_username);
      label247: str = locald.content;
      paramax = str;
      if (bo.nullAsNil(str).length() <= 0)
        switch (locald.scene)
        {
        case 19:
        case 20:
        case 21:
        default:
        case 18:
        case 22:
        case 23:
        case 24:
        case 25:
        case 26:
        case 27:
        case 28:
        case 29:
        }
    }
    for (paramax = paramContext.getString(2131298108); ; paramax = paramContext.getString(2131298112))
    {
      localIntent.putExtra("Contact_Content", paramax);
      if ((locald.xZy == 1) && (!bo.isNullOrNil(locald.xZA)))
        localIntent.putExtra("Safety_Warning_Detail", locald.xZA);
      localIntent.putExtra("Contact_verify_Scene", locald.scene);
      if (((locald.scene == 14) || (locald.scene == 8)) && (!bo.isNullOrNil(locald.chatroomName)))
      {
        com.tencent.mm.model.aw.ZK();
        paramax = c.XV().oa(locald.chatroomName);
        if (paramax != null)
          localIntent.putExtra("Contact_RoomNickname", paramax.mJ(locald.svN));
      }
      localIntent.putExtra("Contact_Uin", locald.pnz);
      localIntent.putExtra("Contact_QQNick", locald.gwH);
      localIntent.putExtra("Contact_Mobile_MD5", locald.xZi);
      localIntent.putExtra("User_From_Fmessage", true);
      localIntent.putExtra("Contact_from_msgType", 37);
      if ((localad == null) || (!com.tencent.mm.n.a.jh(localad.field_type)))
        localIntent.putExtra("Contact_KSnsIFlag", 0);
      localIntent.putExtra("Contact_KSnsBgUrl", locald.xZw);
      localIntent.putExtra("verify_gmail", locald.gta);
      localIntent.putExtra("source_from_user_name", locald.ijx);
      localIntent.putExtra("source_from_nick_name", locald.vjM);
      com.tencent.mm.bp.d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
      AppMethodBeat.o(25344);
      break;
      label634: bool = false;
      break label88;
      label640: if ((paramax.field_type == 1) || (paramax.field_type == 2))
        localIntent.putExtra("User_Verify", true);
      localIntent.putExtra("Contact_User", locald.svN);
      localIntent.putExtra("Contact_Alias", locald.dFl);
      localIntent.putExtra("Contact_Nick", locald.nickname);
      localIntent.putExtra("Contact_QuanPin", locald.gwG);
      localIntent.putExtra("Contact_PyInitial", locald.gwF);
      localIntent.putExtra("Contact_Sex", locald.dtS);
      localIntent.putExtra("Contact_Signature", locald.signature);
      localIntent.putExtra("Contact_FMessageCard", true);
      localIntent.putExtra("Contact_City", locald.getCity());
      localIntent.putExtra("Contact_Province", locald.getProvince());
      localIntent.putExtra("Contact_Mobile_MD5", locald.xZi);
      localIntent.putExtra("Contact_full_Mobile_MD5", locald.xZj);
      localIntent.putExtra("Contact_KSnsBgUrl", locald.xZw);
      break label247;
    }
  }

  public static void h(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(25342);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.FConversationOnItemClickListener", "dealOnClick fail, talker is null");
      AppMethodBeat.o(25342);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.FConversationOnItemClickListener", "dealOnClick, talker = ".concat(String.valueOf(paramString)));
      com.tencent.mm.bi.d.akP().apt(paramString);
      ax localax = com.tencent.mm.bi.d.akO().apx(paramString);
      if (localax == null)
      {
        ab.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, lastRecvFmsg is null, talker = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(25342);
      }
      else if (localax.field_type == 0)
      {
        a(paramContext, localax);
        AppMethodBeat.o(25342);
      }
      else
      {
        a(paramContext, localax, paramBoolean);
        AppMethodBeat.o(25342);
      }
    }
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(25341);
    int i = paramInt;
    if (this.fsN)
      i = paramInt - 2;
    paramAdapterView = (av)this.stw.getItem(i);
    if (paramAdapterView == null)
    {
      ab.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, item is null, pos = ".concat(String.valueOf(i)));
      AppMethodBeat.o(25341);
    }
    while (true)
    {
      return;
      h(this.context, paramAdapterView.field_talker, false);
      AppMethodBeat.o(25341);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.a
 * JD-Core Version:    0.6.2
 */
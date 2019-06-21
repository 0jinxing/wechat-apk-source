package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi.a;

public final class e
{
  public static void a(Context paramContext, ad paramad, bi.a parama)
  {
    AppMethodBeat.i(33611);
    a(paramContext, paramad, parama, false, false, null, parama.gta);
    AppMethodBeat.o(33611);
  }

  public static void a(Context paramContext, ad paramad, bi.a parama, boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(33612);
    if ((paramad == null) || (parama == null))
      AppMethodBeat.o(33612);
    while (true)
    {
      return;
      if ((paramad.field_username == null) || (paramad.field_username.length() <= 0))
      {
        AppMethodBeat.o(33612);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_User", paramad.field_username);
        localIntent.putExtra("Contact_Alias", paramad.Hq());
        localIntent.putExtra("Contact_Nick", paramad.Oi());
        localIntent.putExtra("Contact_QuanPin", paramad.Hu());
        localIntent.putExtra("Contact_PyInitial", paramad.Ht());
        localIntent.putExtra("Contact_Sex", parama.dtS);
        localIntent.putExtra("Contact_Province", parama.getProvince());
        localIntent.putExtra("Contact_City", parama.getCity());
        localIntent.putExtra("Contact_Signature", parama.signature);
        localIntent.putExtra("Contact_Uin", parama.pnz);
        localIntent.putExtra("Contact_Mobile_MD5", parama.xZi);
        localIntent.putExtra("Contact_full_Mobile_MD5", parama.xZj);
        localIntent.putExtra("Contact_QQNick", parama.dtZ());
        localIntent.putExtra("User_From_Fmessage", true);
        localIntent.putExtra("Contact_Scene", parama.scene);
        localIntent.putExtra("Contact_from_msgType", 40);
        if (paramBoolean1)
          localIntent.putExtra("Contact_ShowUserName", false);
        if (paramBoolean2)
          localIntent.putExtra("Contact_KSnsIFlag", 0);
        if (paramBundle != null)
          localIntent.putExtras(paramBundle);
        if (!TextUtils.isEmpty(paramString))
          localIntent.putExtra("verify_gmail", paramString);
        d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
        AppMethodBeat.o(33612);
      }
    }
  }

  public static void a(Context paramContext, bi.a parama)
  {
    AppMethodBeat.i(33609);
    a(paramContext, parama, false, false, null);
    AppMethodBeat.o(33609);
  }

  public static void a(Context paramContext, bi.a parama, boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    AppMethodBeat.i(33610);
    if ((paramContext == null) || (parama == null))
      AppMethodBeat.o(33610);
    while (true)
    {
      return;
      ad localad = new ad();
      localad.setUsername(parama.svN);
      localad.iB(parama.getDisplayName());
      localad.iC(parama.gwF);
      localad.iD(parama.gwG);
      a(paramContext, localad, parama, paramBoolean1, paramBoolean2, paramBundle, parama.gta);
      AppMethodBeat.o(33610);
    }
  }

  public static void a(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(33608);
    if ((paramIntent == null) || (paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.ContactInfoUtil", "setLocalQQMobile fail, intent = " + paramIntent + ", username = " + paramString);
      AppMethodBeat.o(33608);
    }
    while (true)
    {
      return;
      ao localao = com.tencent.mm.plugin.account.a.getQQListStg().wj(paramString);
      if (localao != null)
      {
        paramIntent.putExtra("Contact_Uin", localao.gwC);
        paramIntent.putExtra("Contact_QQNick", localao.getDisplayName());
      }
      paramString = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(paramString);
      if (paramString != null)
        paramIntent.putExtra("Contact_Mobile_MD5", paramString.Aq());
      AppMethodBeat.o(33608);
    }
  }

  public static void r(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(33607);
    paramIntent.putExtra("Contact_User", paramString);
    AppMethodBeat.o(33607);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.e
 * JD-Core Version:    0.6.2
 */
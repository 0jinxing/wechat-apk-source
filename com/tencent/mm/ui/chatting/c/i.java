package com.tencent.mm.ui.chatting.c;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewStub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.m;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.vfs.e;
import java.util.List;

public final class i
{
  public static ViewStub a(MMFragment paramMMFragment, int paramInt)
  {
    AppMethodBeat.i(31303);
    paramMMFragment = (ViewStub)paramMMFragment.findViewById(paramInt);
    if (paramMMFragment != null)
      paramMMFragment.inflate();
    AppMethodBeat.o(31303);
    return paramMMFragment;
  }

  public static void a(a parama, bi parambi, Intent paramIntent)
  {
    AppMethodBeat.i(31299);
    if ((parama == null) || (parambi == null))
    {
      AppMethodBeat.o(31299);
      return;
    }
    String str1 = parama.getTalkerUserName();
    String str2 = b(parama, parambi);
    Bundle localBundle = new Bundle();
    int i;
    if (parama.dFw())
      i = 2;
    while (true)
    {
      localBundle.putInt("stat_scene", i);
      localBundle.putString("stat_msg_id", "msg_" + Long.toString(parambi.field_msgSvrId));
      localBundle.putString("stat_chat_talker_username", str1);
      localBundle.putString("stat_send_msg_user", str2);
      paramIntent.putExtra("_stat_obj", localBundle);
      AppMethodBeat.o(31299);
      break;
      if (t.mZ(str1))
        i = 7;
      else
        i = 1;
    }
  }

  public static boolean ad(ad paramad)
  {
    AppMethodBeat.i(31302);
    boolean bool;
    if ((paramad.field_username.equals("medianote")) && ((r.YD() & 0x4000) == 0))
    {
      bool = true;
      AppMethodBeat.o(31302);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31302);
    }
  }

  public static String ark(String paramString)
  {
    AppMethodBeat.i(31304);
    aw.ZK();
    u localu = c.XV().oa(paramString);
    int j;
    if ((localu != null) && (localu.afg().size() == 2))
    {
      int i = localu.afg().size();
      j = 0;
      if (j < i)
      {
        paramString = (String)localu.afg().get(j);
        if (arl(paramString))
          AppMethodBeat.o(31304);
      }
    }
    while (true)
    {
      return paramString;
      j++;
      break;
      paramString = null;
      AppMethodBeat.o(31304);
    }
  }

  public static boolean arl(String paramString)
  {
    AppMethodBeat.i(31305);
    int i;
    int j;
    if ((!t.mY(paramString)) && (m.mo(paramString)) && (!r.mG(paramString)))
    {
      aw.ZK();
      ad localad = c.XM().aoO(paramString);
      if (localad == null)
        break label134;
      i = localad.field_type;
      aw.ZK();
      localad = c.XM().aoO(localad.field_encryptUsername);
      if (localad == null)
        break label129;
      j = localad.field_type;
    }
    while (true)
    {
      ab.i("MicroMsg.ChattingUI.ChattingLogic", "isStranger:%s type:%d etype:%d", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(j) });
      AppMethodBeat.o(31305);
      for (boolean bool = true; ; bool = false)
      {
        return bool;
        AppMethodBeat.o(31305);
      }
      label129: j = -1;
      continue;
      label134: j = -1;
      i = -1;
    }
  }

  private static String b(a parama, bi parambi)
  {
    AppMethodBeat.i(31300);
    Object localObject = parama.sRl.field_username;
    boolean bool = ((d)parama.aF(d.class)).dDm();
    if ((!parama.dFw()) && (!bool))
    {
      AppMethodBeat.o(31300);
      return localObject;
    }
    if (parama.dFw())
    {
      parama = bf.oy(parambi.field_content);
      if ((localObject == null) || (parama == null) || (parama.length() <= 0))
        break label101;
    }
    while (true)
    {
      AppMethodBeat.o(31300);
      localObject = parama;
      break;
      if (parambi != null)
        parama = parambi.field_bizChatUserId;
      else
        label101: parama = (a)localObject;
    }
  }

  public static boolean e(bi parambi, String paramString)
  {
    AppMethodBeat.i(31301);
    boolean bool;
    if ((System.currentTimeMillis() - parambi.field_createTime > 259200000L) && ((bo.isNullOrNil(paramString)) || (!e.ct(paramString))))
    {
      bool = true;
      AppMethodBeat.o(31301);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31301);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.i
 * JD-Core Version:    0.6.2
 */
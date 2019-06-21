package com.tencent.mm.storage;

import android.content.Context;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.a.kz;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class aw extends com.tencent.mm.sdk.e.j<av>
  implements d, k.a
{
  public static final String[] fnj;
  private static final String[] xIq;
  public com.tencent.mm.sdk.e.e bSd;
  private final int cfQ;
  protected Context mContext;
  private Runnable xYK;

  static
  {
    AppMethodBeat.i(1293);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(av.ccO, "fmessage_conversation") };
    xIq = new String[] { "CREATE INDEX IF NOT EXISTS  fmessageConversationTalkerIndex ON fmessage_conversation ( talker )", "CREATE INDEX IF NOT EXISTS  fmconversation_isnew_Index ON fmessage_conversation ( isNew )" };
    AppMethodBeat.o(1293);
  }

  public aw(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, av.ccO, "fmessage_conversation", xIq);
    AppMethodBeat.i(1280);
    this.mContext = null;
    this.cfQ = 1;
    this.xYK = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(1279);
        int i = aw.this.dtd();
        ab.v("MicroMsg.FMessageConversationStorage", "onNotifyChange, newCount update to = %d", new Object[] { Integer.valueOf(i) });
        g.RP().Ry().set(143618, Integer.valueOf(i));
        AppMethodBeat.o(1279);
      }
    };
    this.bSd = parame;
    this.mContext = ah.getContext();
    AppMethodBeat.o(1280);
  }

  public final av QR(String paramString)
  {
    AppMethodBeat.i(1288);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.w("MicroMsg.FMessageConversationStorage", "get fail, talker is null");
      AppMethodBeat.o(1288);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      av localav = new av();
      localav.field_talker = paramString;
      if (super.b(localav, new String[0]))
      {
        AppMethodBeat.o(1288);
        paramString = localav;
      }
      else
      {
        ab.i("MicroMsg.FMessageConversationStorage", "get fail, maybe not exist, talker = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(1288);
        paramString = null;
      }
    }
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(1290);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.FMessageConversationStorage", "onNotifyChange, id is null");
      AppMethodBeat.o(1290);
    }
    long l;
    while (true)
    {
      return;
      try
      {
        l = bo.getLong(paramString, 0L);
        if (l == 0L)
        {
          ab.w("MicroMsg.FMessageConversationStorage", "onNotifyChange fail, sysRowId is invalid");
          AppMethodBeat.o(1290);
        }
      }
      catch (Exception paramm)
      {
        while (true)
        {
          ab.w("MicroMsg.FMessageConversationStorage", "onNotifyChange, id = " + paramString + ", ex = " + paramm.getMessage());
          l = 0L;
        }
        if (!g.RN().QY())
        {
          ab.e("MicroMsg.FMessageConversationStorage", "onNotifyChange, account not ready, can not insert fmessageconversation");
          AppMethodBeat.o(1290);
          continue;
        }
        paramm = new ax();
        if (!((ay)((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOq()).b(l, paramm))
        {
          ab.w("MicroMsg.FMessageConversationStorage", "onNotifyChange, get fail, id = ".concat(String.valueOf(l)));
          AppMethodBeat.o(1290);
          continue;
        }
        ab.d("MicroMsg.FMessageConversationStorage", "onNotifyChange succ, sysRowId = ".concat(String.valueOf(l)));
        paramString = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOp().QR(paramm.field_talker);
        if (paramString != null)
          break label664;
      }
      ab.i("MicroMsg.FMessageConversationStorage", "onNotifyChange, fmessage conversation does not exist, insert a new one, talker = " + paramm.field_talker);
      if (!bo.isNullOrNil(paramm.field_talker))
        break;
      ab.i("MicroMsg.FMessageConversationStorage", "onNotifyChange, fmessage info talker is null, quit insert fmessage conversation.");
      AppMethodBeat.o(1290);
    }
    paramString = new av();
    Object localObject;
    if (paramm.field_type == 0)
    {
      localObject = bi.a.apC(paramm.field_msgContent);
      paramString.field_displayName = ((bi.a)localObject).getDisplayName();
      if ((((bi.a)localObject).scene == 4) && (((bi.a)localObject).dtZ() != null))
        paramString.field_displayName = ((bi.a)localObject).dtZ();
      paramString.field_addScene = ((bi.a)localObject).scene;
      paramString.field_isNew = 1;
      paramString.field_contentFromUsername = ((bi.a)localObject).svN;
      paramString.field_contentNickname = ((bi.a)localObject).nickname;
      paramString.field_contentPhoneNumMD5 = ((bi.a)localObject).xZi;
      paramString.field_contentFullPhoneNumMD5 = ((bi.a)localObject).xZj;
      ab.i("MicroMsg.FMessageConversationStorage", "push, new friend Username: " + paramString.field_contentFromUsername + "new friend Nickname: " + paramString.field_contentNickname);
      label416: paramString.field_lastModifiedTime = System.currentTimeMillis();
      paramString.field_state = 0;
      paramString.field_talker = paramm.field_talker;
      paramString.field_encryptTalker = paramm.field_encryptTalker;
      paramString.field_fmsgSysRowId = l;
      paramString.field_fmsgIsSend = paramm.field_isSend;
      paramString.field_fmsgType = paramm.field_type;
      paramString.field_fmsgContent = paramm.field_msgContent;
      if (!paramm.dtf())
        break label658;
    }
    label658: for (int i = paramm.field_type; ; i = 0)
    {
      paramString.field_recvFmsgType = i;
      ab.i("MicroMsg.FMessageConversationStorage", "field_fmsgContent: " + paramString.field_fmsgContent);
      ((aw)((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOp()).b(paramString);
      dte();
      AppMethodBeat.o(1290);
      break;
      if (!paramm.dtf())
        break label416;
      localObject = bi.d.apF(paramm.field_msgContent);
      paramString.field_displayName = ((bi.d)localObject).getDisplayName();
      paramString.field_addScene = ((bi.d)localObject).scene;
      paramString.field_isNew = 1;
      paramString.field_contentFromUsername = ((bi.d)localObject).svN;
      paramString.field_contentNickname = ((bi.d)localObject).nickname;
      paramString.field_contentVerifyContent = ((bi.d)localObject).content;
      ab.i("MicroMsg.FMessageConversationStorage", "receive, new friend Username: " + paramString.field_contentFromUsername + "new friend Nickname: " + paramString.field_contentNickname);
      break label416;
    }
    label664: ab.d("MicroMsg.FMessageConversationStorage", "onNotifyChange, fmessage conversation has existed, talker = " + paramm.field_talker);
    if (paramm.dtf())
      paramString.field_isNew = 1;
    paramString.field_lastModifiedTime = System.currentTimeMillis();
    paramString.field_encryptTalker = paramm.field_encryptTalker;
    paramString.field_fmsgSysRowId = l;
    paramString.field_fmsgIsSend = paramm.field_isSend;
    paramString.field_fmsgType = paramm.field_type;
    paramString.field_fmsgContent = paramm.field_msgContent;
    if (paramm.dtf())
    {
      paramString.field_recvFmsgType = paramm.field_type;
      ab.i("MicroMsg.FMessageConversationStorage", "field_recvFmsgType: " + paramString.field_recvFmsgType);
    }
    if (paramm.field_type == 0)
    {
      paramm = bi.a.apC(paramm.field_msgContent);
      paramString.field_contentFromUsername = paramm.svN;
      paramString.field_contentNickname = paramm.nickname;
      paramString.field_contentPhoneNumMD5 = paramm.xZi;
      paramString.field_contentFullPhoneNumMD5 = paramm.xZj;
      ab.i("MicroMsg.FMessageConversationStorage", "TYPE_SYSTEM_PUSH, new friend Username: " + paramString.field_contentFromUsername + "new friend Nickname: " + paramString.field_contentNickname);
    }
    label1093: 
    while (true)
    {
      ((aw)((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOp()).c(paramString, new String[0]);
      if (dtd() != 0)
        break;
      g.RP().Ry().set(340225, Long.valueOf(System.currentTimeMillis()));
      break;
      if (paramm.dtf())
      {
        if (paramm.field_isSend >= 2);
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label1093;
          paramm = bi.d.apF(paramm.field_msgContent);
          paramString.field_contentVerifyContent = paramm.content;
          paramString.field_contentFromUsername = paramm.svN;
          paramString.field_contentNickname = paramm.nickname;
          ab.i("MicroMsg.FMessageConversationStorage", "field_contentVerifyContent: " + paramString.field_contentVerifyContent + " receive, new friend Username: " + paramString.field_contentFromUsername + " new friend Nickname: " + paramString.field_contentNickname);
          localObject = paramString.field_contentFromUsername;
          paramm = paramString.field_contentNickname;
          kz localkz = new kz();
          localkz.cGR.userName = ((String)localObject);
          localkz.cGR.bCu = paramm;
          localkz.cGR.type = 1;
          com.tencent.mm.sdk.b.a.xxA.m(localkz);
          break;
        }
      }
    }
  }

  public final boolean apt(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(1287);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, talker is null");
      AppMethodBeat.o(1287);
    }
    while (true)
    {
      return bool;
      av localav = QR(paramString);
      if ((localav == null) || (!paramString.equals(localav.field_talker)))
      {
        ab.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, conversation does not exist, talker = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(1287);
      }
      else
      {
        localav.field_isNew = 0;
        bool = super.c(localav, new String[0]);
        AppMethodBeat.o(1287);
      }
    }
  }

  public final av apu(String paramString)
  {
    Object localObject = null;
    Cursor localCursor = null;
    AppMethodBeat.i(1289);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.w("MicroMsg.FMessageConversationStorage", "get fail, encryptTalker is null");
      AppMethodBeat.o(1289);
      paramString = localCursor;
    }
    while (true)
    {
      return paramString;
      paramString = "select * from fmessage_conversation  where encryptTalker=" + h.escape(paramString);
      localCursor = this.bSd.a(paramString, null, 2);
      paramString = localObject;
      if (localCursor.moveToFirst())
      {
        paramString = new av();
        paramString.d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(1289);
    }
  }

  public final Cursor baR()
  {
    AppMethodBeat.i(1281);
    Cursor localCursor = this.bSd.rawQuery("select * from fmessage_conversation  ORDER BY lastModifiedTime DESC", null);
    AppMethodBeat.o(1281);
    return localCursor;
  }

  public final List<av> dtb()
  {
    AppMethodBeat.i(1282);
    ab.v("MicroMsg.FMessageConversationStorage", "getNewLimit, limit = %d", new Object[] { Integer.valueOf(4) });
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.bSd.a("select * from fmessage_conversation  where isNew = 1 ORDER BY lastModifiedTime DESC limit 4", null, 2);
    while (localCursor.moveToNext())
    {
      av localav = new av();
      localav.d(localCursor);
      if (!bo.isNullOrNil(localav.field_talker))
        localArrayList.add(localav);
    }
    localCursor.close();
    AppMethodBeat.o(1282);
    return localArrayList;
  }

  public final boolean dtc()
  {
    AppMethodBeat.i(1285);
    boolean bool;
    if (this.bSd.hY("fmessage_conversation", "update fmessage_conversation set isNew = 0"))
    {
      ab.d("MicroMsg.FMessageConversationStorage", "clearAllNew success");
      doNotify();
      bool = true;
      AppMethodBeat.o(1285);
    }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.FMessageConversationStorage", "clearAllNew fail");
      bool = false;
      AppMethodBeat.o(1285);
    }
  }

  public final int dtd()
  {
    int i = 0;
    AppMethodBeat.i(1286);
    Object localObject = String.format("select count(*) from %s where %s = 1 and %s < 2", new Object[] { "fmessage_conversation", "isNew", "fmsgIsSend" });
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
      i = ((Cursor)localObject).getInt(0);
    ((Cursor)localObject).close();
    ab.d("MicroMsg.FMessageConversationStorage", "getNewCount = ".concat(String.valueOf(i)));
    AppMethodBeat.o(1286);
    return i;
  }

  public final void dte()
  {
    AppMethodBeat.i(1291);
    al.af(this.xYK);
    al.n(this.xYK, 500L);
    AppMethodBeat.o(1291);
  }

  public final boolean ep(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(1284);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.w("MicroMsg.FMessageConversationStorage", "updateState fail, talker is null");
      AppMethodBeat.o(1284);
    }
    while (true)
    {
      return bool;
      av localav = QR(paramString);
      if (localav == null)
      {
        ab.w("MicroMsg.FMessageConversationStorage", "updateState fail, get fail, talker = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(1284);
      }
      else if (paramInt == localav.field_state)
      {
        ab.d("MicroMsg.FMessageConversationStorage", "updateState, no need to update");
        AppMethodBeat.o(1284);
        bool = true;
      }
      else
      {
        localav.field_state = paramInt;
        localav.field_lastModifiedTime = System.currentTimeMillis();
        if (super.c(localav, new String[0]))
        {
          anF(paramString);
          AppMethodBeat.o(1284);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(1284);
        }
      }
    }
  }

  public final int getCount()
  {
    int i = 0;
    AppMethodBeat.i(1283);
    Cursor localCursor = this.bSd.a("select count(*) from fmessage_conversation", null, 2);
    if (localCursor.moveToFirst())
      i = localCursor.getInt(0);
    localCursor.close();
    ab.d("MicroMsg.FMessageConversationStorage", "getCount = ".concat(String.valueOf(i)));
    AppMethodBeat.o(1283);
    return i;
  }

  public final boolean p(long paramLong, String paramString)
  {
    AppMethodBeat.i(1292);
    ab.i("MicroMsg.FMessageConversationStorage", "deleteByTalker rowId: %d, talker: %s", new Object[] { Long.valueOf(paramLong), paramString });
    String str;
    boolean bool;
    if (bo.isNullOrNil(paramString))
      if (paramLong > 0L)
      {
        str = "delete from fmessage_conversation where fmsgSysRowId = '" + paramLong + "'";
        if (!this.bSd.hY("fmessage_conversation", str))
          break label166;
        ab.i("MicroMsg.FMessageConversationStorage", "deleteByTalker success, rowId: %d, talker: %s", new Object[] { Long.valueOf(paramLong), paramString });
        anF(paramString);
        AppMethodBeat.o(1292);
        bool = true;
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(1292);
      bool = false;
      continue;
      str = "delete from fmessage_conversation where talker = '" + bo.vA(paramString) + "'";
      break;
      label166: AppMethodBeat.o(1292);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.aw
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.p;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class j
{
  static void a(Context paramContext, com.tencent.mm.at.e parame, bi parambi, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(30566);
    Object localObject1 = com.tencent.mm.at.o.ahl().q(com.tencent.mm.at.f.c(parame), "", "");
    Object localObject2 = new PString();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    ((PString)localObject2).value = ((String)localObject1);
    int i = parame.fDC;
    long l1 = com.tencent.mm.at.o.ahl().a((String)localObject1, i, paramInt, (PString)localObject2, localPInt1, localPInt2);
    com.tencent.mm.at.e locale = com.tencent.mm.at.o.ahl().b(Long.valueOf(l1));
    locale.lw(1);
    localObject1 = new bi();
    ((bi)localObject1).setType(com.tencent.mm.model.t.nL(paramString1));
    ((bi)localObject1).ju(paramString1);
    ((bi)localObject1).hO(1);
    ((bi)localObject1).setStatus(1);
    ((bi)localObject1).jv(((PString)localObject2).value);
    ((bi)localObject1).hZ(localPInt1.value);
    ((bi)localObject1).ia(localPInt2.value);
    ((bi)localObject1).eJ(bf.oC(((cy)localObject1).field_talker));
    if (com.tencent.mm.aj.f.kq(((cy)localObject1).field_talker))
      parambi.ix(com.tencent.mm.aj.a.e.aae());
    aw.ZK();
    long l2 = com.tencent.mm.model.c.XO().Z((bi)localObject1);
    if (l2 >= 0L);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ab.i("MicroMsg.ChattingEditModeLogic", "NetSceneUploadMsgImg: local msgId = ".concat(String.valueOf(l2)));
      locale.fG((int)l2);
      com.tencent.mm.at.o.ahl().a(Long.valueOf(l1), locale);
      localObject2 = new HashMap();
      ((HashMap)localObject2).put(Long.valueOf(l2), parame);
      com.tencent.mm.at.o.ahm().a(parame.fDy, parambi.field_msgId, i, localObject2, 2130838182, new j.3(paramContext, paramString1, parame, paramString2));
      AppMethodBeat.o(30566);
      return;
    }
  }

  public static void a(Context paramContext, String paramString, bi parambi)
  {
    AppMethodBeat.i(30564);
    if (!a(paramContext, paramString, parambi, "emoji"))
    {
      AppMethodBeat.o(30564);
      return;
    }
    String str = ap.aps(parambi.field_content).cvZ;
    if ((str == null) || (str.endsWith("-1")));
    for (parambi = parambi.field_imgPath; ; parambi = str)
    {
      if (parambi == null)
      {
        ab.w("MicroMsg.ChattingEditModeLogic", "showAcceptEmojiConnector: filePath is null");
        AppMethodBeat.o(30564);
        break;
      }
      ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().r(paramContext, paramString, parambi);
      AppMethodBeat.o(30564);
      break;
    }
  }

  public static void a(Context paramContext, String paramString, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(30569);
    if (!a(paramContext, paramString, parambi, "text"))
      AppMethodBeat.o(30569);
    while (true)
    {
      return;
      String str = v(parambi.field_content, parambi.field_isSend, paramBoolean);
      paramContext = str;
      if (parambi.dtM())
      {
        paramContext = v(parambi.field_transContent, parambi.field_isSend, paramBoolean);
        paramContext = str + "\n\n" + paramContext;
      }
      if ((paramContext == null) || (paramContext.equals("")))
      {
        ab.e("MicroMsg.ChattingEditModeLogic", "Transfer text erro: content null");
        AppMethodBeat.o(30569);
      }
      else
      {
        com.tencent.mm.plugin.messenger.a.g.bOk().F(paramString, paramContext, com.tencent.mm.model.t.nK(paramString));
        AppMethodBeat.o(30569);
      }
    }
  }

  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(30572);
    try
    {
      bi localbi = new com/tencent/mm/storage/bi;
      localbi.<init>();
      localbi.setContent(paramString2);
      localbi.hO(paramInt);
      paramInt = paramString2.indexOf("<msg>");
      String str = paramString2;
      if (paramInt > 0)
      {
        str = paramString2;
        if (paramInt < paramString2.length())
          str = paramString2.substring(paramInt).trim();
      }
      paramString2 = br.z(str, "msg");
      if ((paramString2 != null) && (paramString2.size() > 0))
        localbi.jw(be.aS(paramString2));
      b(paramContext, paramString1, localbi, paramBoolean);
      AppMethodBeat.o(30572);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ChattingEditModeLogic", paramContext, "", new Object[0]);
        ab.e("MicroMsg.ChattingEditModeLogic", "retransmit sigle app msg error : %s", new Object[] { paramContext.getLocalizedMessage() });
        AppMethodBeat.o(30572);
      }
    }
  }

  static boolean a(Context paramContext, String paramString1, bi parambi, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(30563);
    if (paramContext == null)
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "send %s fail, context is null", new Object[] { paramString2 });
      AppMethodBeat.o(30563);
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString1))
      {
        ab.w("MicroMsg.ChattingEditModeLogic", "send %s fail, username is null", new Object[] { paramString2 });
        AppMethodBeat.o(30563);
      }
      else if (parambi == null)
      {
        ab.w("MicroMsg.ChattingEditModeLogic", "send %s fail, msg is null", new Object[] { paramString2 });
        AppMethodBeat.o(30563);
      }
      else
      {
        AppMethodBeat.o(30563);
        bool = true;
      }
    }
  }

  public static boolean a(boolean paramBoolean, List<bi> paramList, ah paramah)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(30546);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to friend msg error, select item empty");
      AppMethodBeat.o(30546);
      bool2 = false;
    }
    while (true)
    {
      return bool2;
      if ((paramList.size() != 1) || (((paramah == null) || (!paramah.dCJ())) && (!paramBoolean)))
        break;
      paramList = (bi)paramList.get(0);
      if ((aG(paramList)) || (paramList.drD()) || (av(paramList)) || (ax(paramList)) || (ay(paramList)) || (paramList.getType() == -1879048186) || (paramList.getType() == 318767153) || (aF(paramList)) || (az(paramList)) || (aH(paramList)) || (aE(paramList)) || (aA(paramList)))
      {
        AppMethodBeat.o(30546);
        bool2 = false;
      }
      else
      {
        AppMethodBeat.o(30546);
      }
    }
    Iterator localIterator = paramList.iterator();
    bool2 = bool1;
    label204: 
    while (localIterator.hasNext())
    {
      paramList = (bi)localIterator.next();
      if (((paramah != null) && (paramah.dCJ())) || (paramBoolean))
      {
        if ((!paramList.drD()) && (!av(paramList)) && (!ax(paramList)) && (!ay(paramList)) && (paramList.getType() != -1879048186) && (!aF(paramList)) && (!az(paramList)) && ((!aB(paramList)) || ((paramah != null) && (paramah.dCJ()))) && ((!aC(paramList)) || ((paramah != null) && (paramah.dCJ()))) && (paramList.getType() != 318767153) && (!aG(paramList)) && (!aH(paramList)) && (!aE(paramList)) && (!aA(paramList)))
          break label421;
        localIterator.remove();
        bool2 = false;
      }
      else
      {
        if ((!aB(paramList)) && (!aC(paramList)))
          break label421;
        localIterator.remove();
        bool2 = false;
      }
    }
    label421: 
    while (true)
    {
      break label204;
      AppMethodBeat.o(30546);
      break;
    }
  }

  public static boolean aA(bi parambi)
  {
    AppMethodBeat.i(30544);
    boolean bool;
    if (parambi == null)
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, check msg error, msg is null");
      AppMethodBeat.o(30544);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (parambi.field_isSend == 0);
      for (parambi = bf.oz(parambi.field_content); ; parambi = parambi.field_content)
      {
        parambi = j.b.me(parambi);
        if (parambi != null)
          break label79;
        ab.w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, parse app message content fail");
        AppMethodBeat.o(30544);
        bool = false;
        break;
      }
      label79: if (((parambi.type == 33) && (parambi.fiR == 3)) || ((parambi.type == 46) && (parambi.fiR == 3)) || ((parambi.type == 44) && ((parambi.fiR == 3) || (parambi.fiY != 0) || (!parambi.cw(false)))))
      {
        AppMethodBeat.o(30544);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(30544);
        bool = false;
      }
    }
  }

  private static boolean aB(bi parambi)
  {
    AppMethodBeat.i(30547);
    boolean bool;
    if (parambi != null)
    {
      parambi = j.b.me(parambi.field_content);
      if ((parambi != null) && (parambi.type == 19))
      {
        Object localObject = new nt();
        ((nt)localObject).cJY.type = 0;
        ((nt)localObject).cJY.cKa = parambi.fgU;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        localObject = ((nt)localObject).cJZ.cKi;
        if (localObject != null)
        {
          Iterator localIterator = ((com.tencent.mm.protocal.b.a.c)localObject).fjr.iterator();
          while (localIterator.hasNext())
          {
            localObject = (aar)localIterator.next();
            if (!bo.isNullOrNil(((aar)localObject).whr))
            {
              ab.e("MicroMsg.ChattingEditModeLogic", "record type subDataItem contain tpurl, type:%d", new Object[] { Integer.valueOf(((aar)localObject).dataType) });
              AppMethodBeat.o(30547);
              bool = true;
            }
          }
        }
      }
    }
    while (true)
    {
      return bool;
      if ((parambi.fgU != null) && (parambi.fgU.contains("<recordxml>")))
      {
        AppMethodBeat.o(30547);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(30547);
        bool = false;
        continue;
        AppMethodBeat.o(30547);
        bool = false;
      }
    }
  }

  private static boolean aC(bi parambi)
  {
    AppMethodBeat.i(30548);
    boolean bool;
    if (parambi != null)
    {
      parambi = j.b.me(parambi.field_content);
      if ((parambi != null) && (parambi.type == 24))
      {
        bool = true;
        AppMethodBeat.o(30548);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30548);
    }
  }

  public static boolean aD(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(30549);
    if (parambi != null)
    {
      parambi = j.b.me(parambi.field_content);
      if (parambi == null)
        AppMethodBeat.o(30549);
    }
    while (true)
    {
      return bool;
      if ((parambi.type == 6) || (parambi.type == 5) || (parambi.type == 19))
      {
        bool = true;
        AppMethodBeat.o(30549);
      }
      else
      {
        AppMethodBeat.o(30549);
      }
    }
  }

  public static boolean aE(bi parambi)
  {
    AppMethodBeat.i(30550);
    boolean bool;
    if ((parambi == null) || (!parambi.drC()))
    {
      bool = false;
      AppMethodBeat.o(30550);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.af.l.c(parambi.field_msgId, parambi.field_content);
      AppMethodBeat.o(30550);
    }
  }

  static boolean aF(bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(30551);
    if (parambi != null)
    {
      parambi = j.b.me(parambi.field_content);
      if ((parambi != null) && (parambi.type == 16))
        AppMethodBeat.o(30551);
    }
    while (true)
    {
      return bool;
      if ((parambi != null) && (parambi.type == 34))
      {
        AppMethodBeat.o(30551);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(30551);
      }
    }
  }

  static boolean aG(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(30552);
    if (!parambi.dtw())
      AppMethodBeat.o(30552);
    while (true)
    {
      return bool;
      aw.ZK();
      parambi = com.tencent.mm.model.c.XO().Rn(parambi.field_content);
      if ((parambi == null) || (bo.isNullOrNil(parambi.svN)))
      {
        AppMethodBeat.o(30552);
        bool = true;
      }
      else if (com.tencent.mm.model.t.mZ(parambi.svN))
      {
        AppMethodBeat.o(30552);
      }
      else
      {
        AppMethodBeat.o(30552);
        bool = true;
      }
    }
  }

  private static boolean aH(bi parambi)
  {
    AppMethodBeat.i(30553);
    boolean bool;
    if ((parambi != null) && (parambi.bAA()))
    {
      parambi = j.b.me(parambi.field_content);
      if ((parambi != null) && (parambi.type == 6) && ((parambi.fgs != 0) || (parambi.fgo > 26214400)))
      {
        bool = true;
        AppMethodBeat.o(30553);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30553);
    }
  }

  public static boolean aI(bi parambi)
  {
    AppMethodBeat.i(30554);
    boolean bool;
    if ((parambi != null) && (parambi.bAA()))
    {
      parambi = j.b.me(parambi.field_content);
      if ((parambi != null) && (parambi.type == 6))
      {
        bool = true;
        AppMethodBeat.o(30554);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30554);
    }
  }

  public static boolean av(bi parambi)
  {
    AppMethodBeat.i(30539);
    boolean bool;
    if (parambi == null)
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "check is store emoji error, msg is null");
      AppMethodBeat.o(30539);
      bool = true;
      return bool;
    }
    if (parambi.dty())
    {
      ap localap = new ap(parambi.field_content);
      parambi = j.b.X(parambi.field_content, parambi.field_reserved);
      if (parambi != null)
        break label221;
      parambi = new j.b();
      parambi.fgq = localap.cvZ;
    }
    label188: label221: 
    while (true)
    {
      for (parambi = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.fgq); ; parambi = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.field_imgPath))
      {
        if ((parambi == null) || ((parambi.field_catalog != EmojiInfo.yal) && ((bo.isNullOrNil(parambi.field_groupId)) || (!((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Ji(parambi.field_groupId)))))
          break label188;
        AppMethodBeat.o(30539);
        bool = false;
        break;
      }
      if ((parambi != null) && (parambi.duU()))
      {
        AppMethodBeat.o(30539);
        bool = true;
        break;
      }
      AppMethodBeat.o(30539);
      bool = false;
      break;
    }
  }

  public static boolean aw(bi parambi)
  {
    AppMethodBeat.i(30540);
    if (parambi.dty())
    {
      ap localap = new ap(parambi.field_content);
      parambi = j.b.X(parambi.field_content, parambi.field_reserved);
      if (parambi != null)
        break label103;
      parambi = new j.b();
      parambi.fgq = localap.cvZ;
    }
    label103: 
    while (true)
    {
      boolean bool;
      if (((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(parambi.fgq) == null)
      {
        bool = false;
        AppMethodBeat.o(30540);
      }
      while (true)
      {
        return bool;
        bool = true;
        AppMethodBeat.o(30540);
      }
    }
  }

  public static boolean ax(bi parambi)
  {
    AppMethodBeat.i(30541);
    boolean bool;
    if (parambi == null)
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "check is game msg error, msg is null");
      AppMethodBeat.o(30541);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (parambi.field_isSend == 0);
      for (parambi = bf.oz(parambi.field_content); ; parambi = parambi.field_content)
      {
        parambi = j.b.me(parambi);
        if (parambi != null)
          break label79;
        ab.w("MicroMsg.ChattingEditModeLogic", "parse app message content fail");
        AppMethodBeat.o(30541);
        bool = false;
        break;
      }
      label79: parambi = com.tencent.mm.pluginsdk.model.app.g.bT(parambi.appId, false);
      if ((parambi != null) && (parambi.xy()))
      {
        AppMethodBeat.o(30541);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(30541);
        bool = false;
      }
    }
  }

  public static boolean ay(bi parambi)
  {
    AppMethodBeat.i(30542);
    boolean bool;
    if (parambi.getType() == 419430449)
    {
      bool = true;
      AppMethodBeat.o(30542);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30542);
    }
  }

  public static boolean az(bi parambi)
  {
    AppMethodBeat.i(30543);
    boolean bool;
    if ((parambi.getType() == 436207665) || (parambi.getType() == 469762097))
    {
      bool = true;
      AppMethodBeat.o(30543);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30543);
    }
  }

  public static void b(Context paramContext, String paramString, bi parambi)
  {
    AppMethodBeat.i(30565);
    if (!a(paramContext, paramString, parambi, "image"))
      AppMethodBeat.o(30565);
    while (true)
    {
      return;
      Object localObject1 = null;
      if (parambi.field_msgId > 0L)
        localObject1 = com.tencent.mm.at.o.ahl().fJ(parambi.field_msgId);
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((com.tencent.mm.at.e)localObject1).fDy > 0L);
      }
      else
      {
        localObject2 = localObject1;
        if (parambi.field_msgSvrId > 0L)
          localObject2 = com.tencent.mm.at.o.ahl().fI(parambi.field_msgSvrId);
      }
      if (localObject2 == null)
      {
        AppMethodBeat.o(30565);
      }
      else
      {
        int i = 0;
        int j = i;
        if (((com.tencent.mm.at.e)localObject2).agQ())
        {
          j = i;
          if (!com.tencent.mm.at.f.a((com.tencent.mm.at.e)localObject2).fDz.startsWith("SERVERID://"))
            j = 1;
        }
        localObject1 = com.tencent.mm.at.o.ahl().q(com.tencent.mm.at.f.c((com.tencent.mm.at.e)localObject2), "", "");
        String str1 = com.tencent.mm.at.o.ahl().q(((com.tencent.mm.at.e)localObject2).fDB, "th_", "");
        if ((((com.tencent.mm.at.e)localObject2).offset < ((com.tencent.mm.at.e)localObject2).frO) || (((com.tencent.mm.at.e)localObject2).frO == 0))
        {
          String str2 = r.Yz();
          String str3 = ((com.tencent.mm.at.e)localObject2).fDK;
          Object localObject3 = br.z(((com.tencent.mm.at.e)localObject2).fDK, "msg");
          if (localObject3 == null)
          {
            ab.e("MicroMsg.ChattingEditModeLogic", "parse cdnInfo failed. [%s]", new Object[] { ((com.tencent.mm.at.e)localObject2).fDK });
            j = 0;
          }
          while (true)
          {
            if (j == 0)
              a(paramContext, (com.tencent.mm.at.e)localObject2, parambi, 4, paramString, str1);
            AppMethodBeat.o(30565);
            break;
            i = ((com.tencent.mm.at.e)localObject2).fDC;
            if (i != 1)
              localObject1 = (String)((Map)localObject3).get(".msg.img.$cdnmidimgurl");
            for (j = 2; ; j = 1)
            {
              ab.d("MicroMsg.ChattingEditModeLogic", "cdntra read xml  comptype:%d url:[%s]", new Object[] { Integer.valueOf(i), localObject1 });
              if (!bo.isNullOrNil((String)localObject1))
                break label368;
              ab.e("MicroMsg.ChattingEditModeLogic", "cdntra get cdnUrlfailed.");
              j = 0;
              break;
              localObject1 = (String)((Map)localObject3).get(".msg.img.$cdnbigimgurl");
            }
            label368: String str4 = (String)((Map)localObject3).get(".msg.img.$aeskey");
            if (bo.isNullOrNil(str4))
            {
              ab.e("MicroMsg.ChattingEditModeLogic", "cdntra get aes key failed.");
              j = 0;
            }
            else if (bo.isNullOrNil(com.tencent.mm.al.c.a("downimg", ((com.tencent.mm.at.e)localObject2).fDG, parambi.field_talker, parambi.field_msgId)))
            {
              ab.w("MicroMsg.ChattingEditModeLogic", "cdntra genClientId failed not use cdn imgLocalId:%d", new Object[] { Long.valueOf(parambi.field_msgSvrId) });
              j = 0;
            }
            else
            {
              localObject3 = (String)((Map)localObject3).get(".msg.img.$md5");
              com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
              localg.egl = new j.1(parambi, j, paramString, str2, str3, (String)localObject3, i, (com.tencent.mm.at.e)localObject2, paramContext);
              localg.field_mediaId = com.tencent.mm.al.c.a("checkExist", bo.anU(), paramString, parambi.field_msgId);
              localg.field_fileId = ((String)localObject1);
              localg.field_aesKey = str4;
              localg.field_filemd5 = ((String)localObject3);
              localg.field_fileType = j;
              localg.field_talker = paramString;
              localg.field_priority = com.tencent.mm.i.a.efC;
              localg.field_svr_signature = "";
              localg.field_onlycheckexist = true;
              localg.field_trysafecdn = true;
              if (!com.tencent.mm.al.f.afx().e(localg))
              {
                ab.e("MicroMsg.ChattingEditModeLogic", "check exist fail! download img before retransmit");
                j = 0;
              }
              else
              {
                j = 1;
              }
            }
          }
        }
        if (!bo.isNullOrNil((String)localObject1))
          com.tencent.mm.plugin.messenger.a.g.bOk().a(paramContext, paramString, (String)localObject1, j, ((com.tencent.mm.at.e)localObject2).fDK, str1);
        AppMethodBeat.o(30565);
      }
    }
  }

  public static void b(Context paramContext, String paramString, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(30570);
    if (!a(paramContext, paramString, parambi, "appmsg"))
      AppMethodBeat.o(30570);
    while (true)
    {
      return;
      if (paramContext == null)
      {
        ab.w("MicroMsg.ChattingEditModeLogic", "getReaderAppMsgContent: context is null");
        AppMethodBeat.o(30570);
      }
      else if (parambi == null)
      {
        ab.w("MicroMsg.ChattingEditModeLogic", "getReaderAppMsgContent: msg is null");
        AppMethodBeat.o(30570);
      }
      else
      {
        aw.ZK();
        if (com.tencent.mm.model.c.isSDCardAvailable())
          break;
        AppMethodBeat.o(30570);
      }
    }
    paramContext = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, false);
    if ((!com.tencent.mm.platformtools.ah.isNullOrNil(paramContext)) && (!paramContext.endsWith("hd")) && (com.tencent.mm.vfs.e.ct(paramContext + "hd")))
      paramContext = paramContext + "hd";
    while (true)
    {
      Object localObject2;
      Object localObject3;
      try
      {
        localObject1 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).b(parambi.field_msgId, parambi.field_content);
        localObject2 = ((com.tencent.mm.af.o)localObject1).fjr;
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
          break label445;
        if ((parambi == null) || ((!parambi.bAA()) && (!parambi.drC())))
          break label773;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = v.nW(parambi.field_msgSvrId);
        localObject3 = v.Zp().y((String)localObject1, true);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("msg_");
        ((v.b)localObject3).j("prePublishId", parambi.field_msgSvrId);
        ((v.b)localObject3).j("preUsername", com.tencent.mm.ui.chatting.viewitems.c.a(parambi, paramBoolean, false));
        ((v.b)localObject3).j("preChatName", parambi.field_talker);
        ((v.b)localObject3).j("preMsgIndex", Integer.valueOf(0));
        ((v.b)localObject3).j("sendAppMsgScene", Integer.valueOf(1));
        ((com.tencent.mm.plugin.sns.b.i)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.sns.b.i.class)).a("adExtStr", (v.b)localObject3, parambi);
        com.tencent.mm.plugin.messenger.a.g.bOk().a(paramString, bo.readFromFile(paramContext), bo.anj(parambi.field_content), (String)localObject1);
        AppMethodBeat.o(30570);
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.ChattingEditModeLogic", paramContext, "", new Object[0]);
        ab.e("MicroMsg.ChattingEditModeLogic", "send app msg error : %s", new Object[] { paramContext.getLocalizedMessage() });
        AppMethodBeat.o(30570);
      }
      break;
      label445: parambi = ((List)localObject2).iterator();
      while (parambi.hasNext())
      {
        localObject3 = (p)parambi.next();
        localObject2 = new com/tencent/mm/af/j$b;
        ((j.b)localObject2).<init>();
        if (com.tencent.mm.af.l.mg(((p)localObject3).fjC))
        {
          l.b(paramString, l.a(paramString, (p)localObject3), ((p)localObject3).fjH);
        }
        else
        {
          ((j.b)localObject2).title = ((p)localObject3).title;
          ((j.b)localObject2).description = ((p)localObject3).fjz;
          ((j.b)localObject2).action = "view";
          ((j.b)localObject2).type = 5;
          ((j.b)localObject2).url = ((p)localObject3).url;
          ((j.b)localObject2).cMg = ((com.tencent.mm.af.o)localObject1).cMg;
          ((j.b)localObject2).cMh = ((com.tencent.mm.af.o)localObject1).cMh;
          ((j.b)localObject2).dJv = ((com.tencent.mm.af.o)localObject1).dJv;
          ((j.b)localObject2).thumburl = com.tencent.mm.af.l.a((p)localObject3);
          com.tencent.mm.af.e locale = new com/tencent/mm/af/e;
          locale.<init>();
          locale.ffZ = ((p)localObject3).type;
          if (((p)localObject3).type == 5)
          {
            locale.fgd = ((p)localObject3).fgd;
            locale.fga = ((int)((p)localObject3).time);
            locale.duration = ((p)localObject3).fjB;
            locale.videoWidth = ((p)localObject3).videoWidth;
            locale.videoHeight = ((p)localObject3).videoHeight;
          }
          ((j.b)localObject2).a(locale);
          if ((bo.isNullOrNil(((j.b)localObject2).thumburl)) && (!bo.isNullOrNil(((j.b)localObject2).cMg)))
          {
            localObject3 = com.tencent.mm.ah.o.act().qo(((j.b)localObject2).cMg);
            if (localObject3 != null)
              ((j.b)localObject2).thumburl = ((com.tencent.mm.ah.h)localObject3).ack();
          }
          localObject2 = j.b.a((j.b)localObject2, null, null);
          com.tencent.mm.plugin.messenger.a.g.bOk().a(paramString, bo.readFromFile(paramContext), bo.anj((String)localObject2), null);
        }
      }
      AppMethodBeat.o(30570);
      break;
      label773: Object localObject1 = null;
    }
  }

  public static void b(EmojiInfo paramEmojiInfo, String paramString)
  {
    AppMethodBeat.i(30573);
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = com.tencent.mm.model.c.Yb() + paramEmojiInfo.Aq();
    if (com.tencent.mm.vfs.e.asZ((String)localObject + "_thumb") > 0L)
    {
      int i = (int)com.tencent.mm.vfs.e.asZ((String)localObject + "_thumb");
      localWXMediaMessage.thumbData = com.tencent.mm.vfs.e.e((String)localObject + "_thumb", 0, i);
    }
    while (true)
    {
      localWXMediaMessage.mediaObject = new WXEmojiObject((String)localObject);
      com.tencent.mm.pluginsdk.model.app.l.a(localWXMediaMessage, paramEmojiInfo.field_app_id, null, paramString, 1, paramEmojiInfo.Aq());
      AppMethodBeat.o(30573);
      return;
      try
      {
        InputStream localInputStream = com.tencent.mm.vfs.e.openRead((String)localObject);
        localWXMediaMessage.setThumbImage(BackwardSupportUtil.b.b(localInputStream, 1.0F));
        localInputStream.close();
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.ChattingEditModeLogic", localException, "", new Object[0]);
        ab.e("MicroMsg.ChattingEditModeLogic", "sendAppMsgEmoji Fail cause there is no thumb");
      }
    }
  }

  public static void c(Context paramContext, String paramString, bi parambi)
  {
    AppMethodBeat.i(30568);
    if ((!a(paramContext, paramString, parambi, "video")) || (parambi == null))
      AppMethodBeat.o(30568);
    while (true)
    {
      return;
      if ((parambi != null) && (parambi.bwt()) && (u.uv(parambi.field_imgPath)))
      {
        AppMethodBeat.o(30568);
      }
      else
      {
        paramContext = u.ut(parambi.field_imgPath);
        if ((paramContext == null) || (paramContext.status != 199))
          break;
        c(parambi.field_imgPath, paramString, paramContext.fXh, paramContext.fXd, paramContext.alw(), parambi.getType());
        AppMethodBeat.o(30568);
      }
    }
    Object localObject = br.z(paramContext.alw(), "msg");
    int i;
    if (localObject == null)
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "%s cdntra parse video recv xml failed");
      i = 0;
    }
    while (true)
    {
      if (i == 0)
        e(paramString, parambi);
      AppMethodBeat.o(30568);
      break;
      paramContext = (String)((Map)localObject).get(".msg.videomsg.$cdnvideourl");
      if (bo.isNullOrNil(paramContext))
      {
        i = 0;
      }
      else
      {
        String str1 = (String)((Map)localObject).get(".msg.videomsg.$aeskey");
        String str2 = (String)((Map)localObject).get(".msg.videomsg.$md5");
        String str3 = (String)((Map)localObject).get(".msg.videomsg.$newmd5");
        int j = Integer.valueOf((String)((Map)localObject).get(".msg.videomsg.$length")).intValue();
        i = bo.getInt((String)((Map)localObject).get(".msg.videomsg.$playlength"), 0);
        int k = bo.getInt((String)((Map)localObject).get(".msg.videomsg.$cdnthumblength"), 0);
        localObject = new com.tencent.mm.i.g();
        ((com.tencent.mm.i.g)localObject).egl = new j.4(paramContext, str1, k, j, paramString, str2, str3, parambi, i);
        ((com.tencent.mm.i.g)localObject).field_mediaId = com.tencent.mm.al.c.a("checkExist", bo.anU(), paramString, parambi.field_msgId);
        ((com.tencent.mm.i.g)localObject).field_fileId = paramContext;
        ((com.tencent.mm.i.g)localObject).field_aesKey = str1;
        ((com.tencent.mm.i.g)localObject).field_filemd5 = str2;
        ((com.tencent.mm.i.g)localObject).field_fileType = com.tencent.mm.i.a.MediaType_VIDEO;
        ((com.tencent.mm.i.g)localObject).field_talker = paramString;
        ((com.tencent.mm.i.g)localObject).field_priority = com.tencent.mm.i.a.efC;
        ((com.tencent.mm.i.g)localObject).field_svr_signature = "";
        ((com.tencent.mm.i.g)localObject).field_onlycheckexist = true;
        ((com.tencent.mm.i.g)localObject).field_trysafecdn = true;
        if (!com.tencent.mm.al.f.afx().e((com.tencent.mm.i.g)localObject))
        {
          ab.e("MicroMsg.ChattingEditModeLogic", "check exist fail! download video before retransmit");
          i = 0;
        }
        else
        {
          i = 1;
        }
      }
    }
  }

  public static void c(Context paramContext, String paramString, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(30571);
    if (!a(paramContext, paramString, parambi, "location"))
      AppMethodBeat.o(30571);
    while (true)
    {
      return;
      paramContext = v(parambi.field_content, parambi.field_isSend, paramBoolean);
      com.tencent.mm.plugin.messenger.a.g.bOk().F(paramString, paramContext, 48);
      AppMethodBeat.o(30571);
    }
  }

  public static void c(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, int paramInt3)
  {
    AppMethodBeat.i(30562);
    ab.d("MicroMsg.ChattingEditModeLogic", "copy video fileName %s userName %s export %d videoLength %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    String str1 = com.tencent.mm.modelvideo.t.ug(r.Yz());
    com.tencent.mm.modelvideo.o.all();
    String str2 = com.tencent.mm.modelvideo.t.uh(paramString1);
    String str3 = com.tencent.mm.modelvideo.t.uh(str1);
    paramString1 = com.tencent.mm.modelvideo.t.ui(paramString1);
    String str4 = com.tencent.mm.modelvideo.t.ui(str1);
    ab.d("MicroMsg.ChattingEditModeLogic", "copy video: srcFullPath[%s] destFullPath[%s] srcThumbPath[%s] destThumbPath[%s]", new Object[] { str2, str3, paramString1, str4 });
    com.tencent.mm.vfs.e.y(str2, str3);
    com.tencent.mm.vfs.e.y(paramString1, str4);
    u.a(str1, paramInt2, paramString2, null, paramInt1, paramString3, paramInt3);
    u.uo(str1);
    AppMethodBeat.o(30562);
  }

  public static List<String> dBY()
  {
    AppMethodBeat.i(30560);
    Object localObject1 = z.aeR().le(25);
    Object localObject2 = z.aeR();
    Object localObject3 = new ArrayList();
    Object localObject4 = new StringBuilder();
    com.tencent.mm.aj.e.a((StringBuilder)localObject4);
    com.tencent.mm.aj.e.c((StringBuilder)localObject4);
    com.tencent.mm.aj.e.d((StringBuilder)localObject4);
    com.tencent.mm.aj.e.a((StringBuilder)localObject4, true);
    ((StringBuilder)localObject4).append(" order by ");
    ((StringBuilder)localObject4).append(com.tencent.mm.aj.e.aet());
    localObject4 = ((StringBuilder)localObject4).toString();
    ab.i("MicroMsg.BizInfoStorage", "getEnterpriseBizChatLst sql %s", new Object[] { localObject4 });
    localObject2 = ((com.tencent.mm.aj.e)localObject2).rawQuery((String)localObject4, new String[0]);
    if (localObject2 != null)
    {
      if (((Cursor)localObject2).moveToFirst())
        do
          ((ArrayList)localObject3).add(((Cursor)localObject2).getString(0));
        while (((Cursor)localObject2).moveToNext());
      ((Cursor)localObject2).close();
    }
    localObject2 = new HashMap();
    localObject3 = ((List)localObject3).iterator();
    String str;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (String)((Iterator)localObject3).next();
      str = com.tencent.mm.aj.f.qX((String)localObject4).adX();
      if (!bo.isNullOrNil(str))
        ((HashMap)localObject2).put(str, localObject4);
    }
    localObject3 = new LinkedList();
    localObject4 = new LinkedList();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      str = (String)((Iterator)localObject1).next();
      if (com.tencent.mm.aj.f.ra(str))
      {
        if (com.tencent.mm.aj.f.re(str))
        {
          str = com.tencent.mm.aj.f.qX(str).field_enterpriseFather;
          if ((!((List)localObject4).contains(str)) && (com.tencent.mm.aj.f.rc(str)))
          {
            ((List)localObject4).add(str);
            str = (String)((HashMap)localObject2).get(str);
            if (!bo.isNullOrNil(str))
              ((List)localObject4).add(str);
          }
        }
      }
      else
        ((List)localObject3).add(str);
    }
    localObject2 = ((HashMap)localObject2).values().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      if ((!bo.isNullOrNil((String)localObject1)) && (!((List)localObject4).contains(localObject1)))
        ((List)localObject4).add(localObject1);
    }
    ((List)localObject3).addAll((Collection)localObject4);
    ab.d("MicroMsg.ChattingEditModeLogic", "get selected accept list, size %d", new Object[] { Integer.valueOf(((List)localObject3).size()) });
    AppMethodBeat.o(30560);
    return localObject3;
  }

  public static List<String> dBZ()
  {
    AppMethodBeat.i(30561);
    Object localObject = z.aeR().le(25);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      if (!com.tencent.mm.aj.f.ra((String)localObject))
        localLinkedList.add(localObject);
    }
    ab.d("MicroMsg.ChattingEditModeLogic", "get selected accept list without enterprise, size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    AppMethodBeat.o(30561);
    return localLinkedList;
  }

  static void e(String paramString, bi parambi)
  {
    AppMethodBeat.i(30567);
    aw.RS().aa(new j.5(parambi, paramString));
    AppMethodBeat.o(30567);
  }

  public static boolean eP(List<bi> paramList)
  {
    AppMethodBeat.i(30545);
    boolean bool;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to brand msg error, selected item empty");
      AppMethodBeat.o(30545);
      bool = true;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = paramList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramList = (bi)localIterator.next();
          if ((paramList.drD()) || (av(paramList)) || (paramList.dtw()) || (ax(paramList)) || (ay(paramList)) || (paramList.getType() == -1879048186) || (aF(paramList)) || (az(paramList)) || (aE(paramList)) || (aA(paramList)) || (aI(paramList)))
          {
            AppMethodBeat.o(30545);
            bool = true;
            break;
          }
        }
      bool = false;
      AppMethodBeat.o(30545);
    }
  }

  public static int eQ(List<bi> paramList)
  {
    int i = 0;
    AppMethodBeat.i(30555);
    if (paramList == null)
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "get invalid send to friend msg num error, select item empty");
      AppMethodBeat.o(30555);
      return i;
    }
    paramList = paramList.iterator();
    i = 0;
    label37: if (paramList.hasNext())
    {
      bi localbi = (bi)paramList.next();
      if ((!localbi.drD()) && (!av(localbi)) && (!localbi.bAC()) && (!ax(localbi)) && (!ay(localbi)) && (!az(localbi)))
        break label113;
      i++;
    }
    label113: 
    while (true)
    {
      break label37;
      AppMethodBeat.o(30555);
      break;
    }
  }

  public static boolean eR(List<bi> paramList)
  {
    AppMethodBeat.i(30556);
    boolean bool;
    if (paramList == null)
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "check contain undownload file, select item empty");
      AppMethodBeat.o(30556);
      bool = false;
      label26: return bool;
    }
    Iterator localIterator = paramList.iterator();
    label410: label411: 
    while (true)
    {
      label35: bi localbi;
      if (localIterator.hasNext())
      {
        localbi = (bi)localIterator.next();
        if ((localbi.drE()) || (localbi.dtA()))
        {
          paramList = null;
          if (localbi.field_msgId > 0L)
            paramList = com.tencent.mm.at.o.ahl().fJ(localbi.field_msgId);
          if (((paramList != null) && (paramList.fDy > 0L)) || (localbi.field_msgSvrId <= 0L))
            break label410;
          paramList = com.tencent.mm.at.o.ahl().fI(localbi.field_msgSvrId);
        }
      }
      while (true)
      {
        if ((paramList == null) || ((paramList.offset >= paramList.frO) && (paramList.frO != 0)))
          break label411;
        AppMethodBeat.o(30556);
        bool = true;
        break;
        if (localbi.bws())
        {
          paramList = com.tencent.mm.modelvideo.o.all().uf(localbi.field_imgPath);
          if ((paramList == null) || (paramList.status == 199) || (paramList.status == 199))
            break label35;
          AppMethodBeat.o(30556);
          bool = true;
          break;
        }
        if (localbi.dty())
        {
          if (aw(localbi))
            break label35;
          AppMethodBeat.o(30556);
          bool = true;
          break;
        }
        if (localbi.bAA())
        {
          paramList = j.b.X(localbi.field_content, localbi.field_content);
          if (paramList == null)
          {
            AppMethodBeat.o(30556);
            bool = true;
            break;
          }
          switch (paramList.type)
          {
          default:
            break;
          case 6:
            paramList = am.aUq().aiE(paramList.csD);
            if (paramList == null)
            {
              AppMethodBeat.o(30556);
              bool = true;
              break label26;
            }
            if (new com.tencent.mm.vfs.b(paramList.field_fileFullPath).exists())
              break;
            AppMethodBeat.o(30556);
            bool = true;
            break;
          }
        }
        if (!localbi.bwt())
          break label35;
        paramList = u.ut(localbi.field_imgPath);
        if ((paramList == null) || (paramList.status == 199) || (paramList.status == 199))
          break label35;
        AppMethodBeat.o(30556);
        bool = true;
        break;
        AppMethodBeat.o(30556);
        bool = false;
        break;
      }
    }
  }

  public static boolean eS(List<bi> paramList)
  {
    AppMethodBeat.i(30557);
    boolean bool;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      AppMethodBeat.o(30557);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = paramList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramList = (bi)localIterator.next();
          if ((paramList.bws()) && (com.tencent.mm.pluginsdk.model.j.aiB(paramList.field_imgPath)))
          {
            bool = true;
            AppMethodBeat.o(30557);
            break;
          }
        }
      AppMethodBeat.o(30557);
      bool = false;
    }
  }

  public static boolean eT(List<bi> paramList)
  {
    AppMethodBeat.i(30558);
    boolean bool;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      AppMethodBeat.o(30558);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramList = paramList.iterator();
      while (true)
        if (paramList.hasNext())
          if (((bi)paramList.next()).bwt())
          {
            bool = true;
            AppMethodBeat.o(30558);
            break;
          }
      AppMethodBeat.o(30558);
      bool = false;
    }
  }

  public static String v(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(30559);
    String str = paramString;
    if (paramBoolean)
    {
      str = paramString;
      if (paramString != null)
      {
        str = paramString;
        if (paramInt == 0)
          str = bf.oz(paramString);
      }
    }
    AppMethodBeat.o(30559);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j
 * JD-Core Version:    0.6.2
 */
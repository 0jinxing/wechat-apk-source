package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.viewitems.c;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
{
  private static k.a yIH;

  static
  {
    AppMethodBeat.i(30589);
    yIH = new k.a((byte)0);
    AppMethodBeat.o(30589);
  }

  public static void a(Context paramContext, List<bi> paramList, boolean paramBoolean, String paramString, ah paramah)
  {
    AppMethodBeat.i(30580);
    dCa();
    if (paramContext == null)
    {
      ab.w("MicroMsg.ChattingEditModeRetransmitMsg", "do retransmit fail, context is null");
      AppMethodBeat.o(30580);
    }
    while (true)
    {
      return;
      if ((paramList == null) || (paramList.isEmpty()))
      {
        ab.w("MicroMsg.ChattingEditModeRetransmitMsg", "do retransmit fail, select item empty");
        AppMethodBeat.o(30580);
      }
      else
      {
        Object localObject1 = paramList.iterator();
        while (true)
          if (((Iterator)localObject1).hasNext())
            if (!ac.aO((bi)((Iterator)localObject1).next()))
            {
              com.tencent.mm.ui.base.t.makeText(paramContext, 2131301876, 0).show();
              AppMethodBeat.o(30580);
              break;
            }
        if (!j.a(false, paramList, paramah))
        {
          com.tencent.mm.ui.base.h.d(paramContext, paramContext.getString(2131300631), "", paramContext.getString(2131297041), paramContext.getString(2131296868), new k.1(paramList, paramah, paramContext, paramBoolean, paramString), null);
          AppMethodBeat.o(30580);
        }
        else
        {
          if ((paramList == null) || (paramList.isEmpty()))
            ab.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to friend msg error, select item empty");
          label407: label584: label588: label589: 
          while (true)
          {
            int i = 1;
            if (i == 0)
              break label590;
            ab.i("MicroMsg.ChattingEditModeRetransmitMsg", "slected msg is all expired or clean!!!");
            if ((paramah == null) || ((!paramah.dCJ()) && (paramList.size() != 1)))
              break label599;
            com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(2131299405), paramContext.getString(2131297061), new k.2());
            AppMethodBeat.o(30580);
            break;
            Iterator localIterator = paramList.iterator();
            while (true)
            {
              if (!localIterator.hasNext())
                break label589;
              bi localbi = (bi)localIterator.next();
              Object localObject2 = null;
              if (localbi.dtH())
                break;
              Object localObject3;
              if (localbi.drE())
              {
                localObject1 = null;
                if (localbi.field_msgId > 0L)
                  localObject1 = com.tencent.mm.at.o.ahl().fJ(localbi.field_msgId);
                if (localObject1 != null)
                {
                  localObject3 = localObject1;
                  if (((com.tencent.mm.at.e)localObject1).fDy > 0L);
                }
                else
                {
                  localObject3 = localObject1;
                  if (localbi.field_msgSvrId > 0L)
                    localObject3 = com.tencent.mm.at.o.ahl().fI(localbi.field_msgSvrId);
                }
                localObject1 = localObject2;
                if (localObject3 != null)
                  localObject1 = com.tencent.mm.at.o.ahl().q(com.tencent.mm.at.f.c((com.tencent.mm.at.e)localObject3), "", "");
                if ((localbi.drE()) || (localbi.bws()) || (localbi.bwt()) || (j.aI(localbi)))
                  if ((System.currentTimeMillis() - localbi.field_createTime <= 259200000L) || ((!bo.isNullOrNil((String)localObject1)) && (com.tencent.mm.vfs.e.ct((String)localObject1))))
                    break label584;
              }
              for (i = 1; ; i = 0)
              {
                if (i != 0)
                  break label588;
                i = 0;
                break;
                if ((localbi.bwt()) || (localbi.bws()))
                {
                  com.tencent.mm.modelvideo.o.all();
                  localObject1 = com.tencent.mm.modelvideo.t.uh(localbi.field_imgPath);
                  break label407;
                }
                if (localbi.bAA())
                {
                  localObject3 = j.b.me(localbi.field_content);
                  localObject1 = localObject2;
                  if (localObject3 == null)
                    break label407;
                  localObject3 = com.tencent.mm.pluginsdk.model.app.l.aiM(((j.b)localObject3).csD);
                  localObject1 = localObject2;
                  if (localObject3 == null)
                    break label407;
                  localObject1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath;
                  break label407;
                }
                localObject1 = localbi.field_imgPath;
                break label407;
              }
            }
          }
          label590: b(paramContext, paramList, paramBoolean, paramString, paramah);
          label599: AppMethodBeat.o(30580);
        }
      }
    }
  }

  private static void b(Context paramContext, List<bi> paramList, boolean paramBoolean, String paramString, ah paramah)
  {
    AppMethodBeat.i(30582);
    if (j.eS(paramList))
    {
      com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(2131298777), "", paramContext.getString(2131296322), new k.3(paramah));
      AppMethodBeat.o(30582);
      return;
    }
    e(paramContext, paramList);
    yIH.yIP = new LinkedList(paramList);
    yIH.yFW = paramBoolean;
    yIH.yIw = paramah;
    yIH.cKf = paramString;
    Intent localIntent = new Intent(paramContext, MsgRetransmitUI.class);
    bi localbi;
    Object localObject;
    label283: String str;
    int i;
    if (paramList.size() == 1)
    {
      localbi = (bi)paramList.get(0);
      if ((localbi.bAA()) || (localbi.drC()))
      {
        localObject = v.nW(localbi.field_msgSvrId);
        paramList = v.Zp().y((String)localObject, true);
        paramList.j("prePublishId", "msg_" + localbi.field_msgSvrId);
        paramList.j("preUsername", c.a(localbi, paramBoolean, false));
        paramList.j("preChatName", localbi.field_talker);
        paramList.j("preMsgIndex", Integer.valueOf(0));
        paramList.j("sendAppMsgScene", Integer.valueOf(1));
        paramList.j("moreRetrAction", Boolean.TRUE);
        if (paramBoolean)
        {
          paramList.j("fromScene", Integer.valueOf(2));
          ((i)com.tencent.mm.kernel.g.K(i.class)).a("adExtStr", paramList, localbi);
          localIntent.putExtra("reportSessionId", (String)localObject);
        }
      }
      else
      {
        str = localbi.field_content;
        i = 12;
        if (!localbi.bAC())
          break label485;
        i = 9;
        paramList = str;
        label340: if (!localbi.drC())
          break label1054;
      }
    }
    label387: label1054: for (int j = 1; ; j = 2)
    {
      if ((paramah != null) && (!paramah.dCJ()))
      {
        localIntent.putExtra("Retr_Msg_Type", 13);
        localIntent.putExtra("Retr_Multi_Msg_List_from", paramString);
        localIntent.putExtra("Retr_Msg_Id", localbi.field_msgId);
        localIntent.putExtra("Retr_Msg_content", paramList);
        localIntent.putExtra("Edit_Mode_Sigle_Msg", true);
        i = j;
      }
      while (true)
      {
        localIntent.putExtra("Retr_MsgFromScene", i);
        localIntent.putExtra("Retr_show_success_tips", true);
        paramContext.startActivity(localIntent);
        l.eU(yIH.yIP);
        AppMethodBeat.o(30582);
        break;
        paramList.j("fromScene", Integer.valueOf(1));
        break label283;
        label485: if (localbi.dtx())
        {
          i = 5;
          localIntent.putExtra("Retr_File_Name", localbi.field_imgPath);
          paramList = str;
          break label340;
        }
        if (localbi.dtw())
        {
          i = 8;
          paramList = str;
          break label340;
        }
        if (localbi.isText())
        {
          j = 4;
          i = j;
          paramList = str;
          if (!paramBoolean)
            break label340;
          i = j;
          paramList = str;
          if (localbi.field_isSend != 0)
            break label340;
          paramList = bf.oz(str);
          i = j;
          break label340;
        }
        if (localbi.drE())
        {
          paramList = null;
          if (localbi.field_msgId > 0L)
            paramList = com.tencent.mm.at.o.ahl().fJ(localbi.field_msgId);
          if (paramList != null)
          {
            localObject = paramList;
            if (paramList.fDy > 0L);
          }
          else
          {
            localObject = paramList;
            if (localbi.field_msgSvrId > 0L)
              localObject = com.tencent.mm.at.o.ahl().fI(localbi.field_msgSvrId);
          }
          if ((((com.tencent.mm.at.e)localObject).offset >= ((com.tencent.mm.at.e)localObject).frO) && (((com.tencent.mm.at.e)localObject).frO != 0));
          for (paramList = com.tencent.mm.at.o.ahl().q(com.tencent.mm.at.f.c((com.tencent.mm.at.e)localObject), "", ""); ; paramList = com.tencent.mm.at.o.ahl().I(localbi.field_imgPath, true))
          {
            localIntent.putExtra("Retr_File_Name", paramList);
            i = 0;
            paramList = str;
            break;
          }
        }
        if (localbi.bwt())
        {
          paramList = u.ut(localbi.field_imgPath);
          if (paramList != null)
            localIntent.putExtra("Retr_length", paramList.fXd);
          i = 11;
          localIntent.putExtra("Retr_File_Name", localbi.field_imgPath);
          paramList = str;
          break label340;
        }
        if (localbi.bws())
        {
          paramList = u.ut(localbi.field_imgPath);
          if (paramList != null)
            localIntent.putExtra("Retr_length", paramList.fXd);
          i = 1;
          localIntent.putExtra("Retr_File_Name", localbi.field_imgPath);
          paramList = str;
          break label340;
        }
        paramList = str;
        if (!localbi.bAA())
          break label340;
        paramList = j.b.me(str);
        if ((paramList != null) && (19 == paramList.type))
          j = 10;
        while (true)
        {
          i = j;
          paramList = str;
          if (!localbi.drC())
            break;
          localIntent.putExtra("is_group_chat", paramBoolean);
          i = j;
          paramList = str;
          break;
          if ((paramList != null) && (24 == paramList.type))
            j = 10;
          else if ((paramList != null) && (16 == paramList.type))
            j = 14;
          else
            j = 2;
        }
        localIntent.putExtra("Retr_Msg_Type", i);
        break label387;
        if (((paramah != null) && (paramah.dCJ())) || ((com.tencent.mm.model.t.mZ(paramString)) && (!com.tencent.mm.aj.f.kq(paramString))) || (com.tencent.mm.model.t.nJ(paramString)))
        {
          localIntent.putExtra("Retr_Msg_Type", 12);
          i = 2;
        }
        else
        {
          localIntent.putExtra("Retr_Msg_Type", 13);
          localIntent.putExtra("Retr_Multi_Msg_List_from", paramString);
          i = 2;
        }
      }
    }
  }

  public static void dCa()
  {
    yIH.yIP = null;
    yIH.yFW = false;
    yIH.yIw = null;
    yIH.cKf = null;
    yIH.cJy = null;
    yIH.yIQ = null;
  }

  private static void e(Context paramContext, List<bi> paramList)
  {
    AppMethodBeat.i(30581);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (bi)localIterator.next();
      if (bh.o(paramList))
      {
        switch (paramList.getType() & 0xFFFF)
        {
        default:
        case 1:
        case 3:
        case 43:
        case 49:
        }
        while (true)
        {
          bh.p(paramList);
          break;
          paramList.setContent(paramContext.getString(2131297059));
          continue;
          paramList.setContent(paramContext.getString(2131297012));
          paramList.setType(1);
          continue;
          paramList.setContent(paramContext.getString(2131297076));
          paramList.setType(1);
          continue;
          paramList.setContent(paramContext.getString(2131297069));
          paramList.setType(1);
        }
      }
    }
    AppMethodBeat.o(30581);
  }

  public static nt hS(Context paramContext)
  {
    AppMethodBeat.i(30585);
    nt localnt = new nt();
    localnt.cJY.type = 6;
    localnt.cJY.cKe = yIH.yIP;
    localnt.cJY.cKf = yIH.cKf;
    localnt.cJY.context = paramContext;
    a.xxA.m(localnt);
    yIH.cJy = localnt.cJZ.cJy;
    yIH.yIQ = localnt.cJZ.cKh;
    AppMethodBeat.o(30585);
    return localnt;
  }

  public static void l(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(30583);
    Object localObject = new nt();
    ((nt)localObject).cJY.type = 5;
    ((nt)localObject).cJY.cKe = yIH.yIP;
    ((nt)localObject).cJY.toUser = paramString;
    ((nt)localObject).cJY.cKf = yIH.cKf;
    ((nt)localObject).cJY.context = paramContext;
    ((nt)localObject).cJY.cJy = yIH.cJy;
    ((nt)localObject).cJY.cKh = yIH.yIQ;
    a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    long l;
    j.b localb;
    if (yIH.yIP != null)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(10811, new Object[] { Integer.valueOf(8), Integer.valueOf(yIH.yIP.size()), Integer.valueOf(yIH.yIP.size() - j.eQ(yIH.yIP)) });
      localObject = yIH.yIP.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramContext = (bi)((Iterator)localObject).next();
        l = bo.anT();
        localb = j.b.me(bo.anj(paramContext.field_content));
        if ((localb != null) && (localb.type == 5) && (!bo.isNullOrNil(localb.url)))
          if (!paramContext.drC())
            break label432;
      }
    }
    label432: for (int i = 1; ; i = 2)
    {
      while (true)
      {
        paramContext = "";
        try
        {
          paramString = URLEncoder.encode(localb.url, "UTF-8");
          paramContext = paramString;
          ab.d("MicroMsg.ChattingEditModeRetransmitMsg", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), localb.url, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(1) });
          com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { paramContext, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(1) });
        }
        catch (UnsupportedEncodingException paramString)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.ChattingEditModeRetransmitMsg", paramString, "", new Object[0]);
        }
      }
      if ((paramBoolean) && (yIH.yIw != null))
        yIH.yIw.b(ah.a.yLP);
      AppMethodBeat.o(30583);
      return;
    }
  }

  public static void m(Context paramContext, final String paramString, final boolean paramBoolean)
  {
    AppMethodBeat.i(30586);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, username is empty");
      AppMethodBeat.o(30586);
    }
    while (true)
    {
      return;
      if ((yIH.yIP == null) || (yIH.yIP.isEmpty()))
      {
        ab.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, select items empty");
        AppMethodBeat.o(30586);
      }
      else
      {
        ab.v("MicroMsg.ChattingEditModeRetransmitMsg", "post to do job, send to %s", new Object[] { paramString });
        com.tencent.mm.ui.chatting.c.j.yOM.e(new az.a()
        {
          public final boolean acf()
          {
            AppMethodBeat.i(30576);
            boolean bool;
            if (k.dCb().yIP == null)
            {
              bool = false;
              AppMethodBeat.o(30576);
            }
            while (true)
            {
              return bool;
              Iterator localIterator = k.dCb().yIP.iterator();
              while (localIterator.hasNext())
              {
                bi localbi = (bi)localIterator.next();
                k.d(this.val$context, paramString, localbi, k.dCb().yFW);
              }
              bool = true;
              AppMethodBeat.o(30576);
            }
          }

          public final boolean acg()
          {
            AppMethodBeat.i(30577);
            if (k.dCb().yIP != null)
              com.tencent.mm.plugin.report.service.h.pYm.e(10811, new Object[] { Integer.valueOf(5), Integer.valueOf(k.dCb().yIP.size()), Integer.valueOf(k.dCb().yIP.size() - j.eQ(k.dCb().yIP)) });
            if (paramBoolean)
            {
              if (this.cfC != null)
              {
                ab.v("MicroMsg.ChattingEditModeRetransmitMsg", "call back is not null, do call back");
                this.cfC.run();
              }
              if (k.dCb().yIw != null)
                k.dCb().yIw.b(ah.a.yLP);
              k.dCa();
            }
            AppMethodBeat.o(30577);
            return true;
          }
        });
        AppMethodBeat.o(30586);
      }
    }
  }

  public static void qo(boolean paramBoolean)
  {
    AppMethodBeat.i(30584);
    if ((paramBoolean) && (yIH.yIw != null))
      yIH.yIw.b(ah.a.yLP);
    AppMethodBeat.o(30584);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.k
 * JD-Core Version:    0.6.2
 */
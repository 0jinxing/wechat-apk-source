package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.at.e;
import com.tencent.mm.at.g;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.bizchat.BizChatSelectConversationUI;
import com.tencent.mm.ui.chatting.c.b.i;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m
{
  private static m.a yIR;
  private static com.tencent.mm.ui.base.p yIv = null;

  public static void a(com.tencent.mm.ui.chatting.d.a parama, String paramString, long paramLong)
  {
    AppMethodBeat.i(30616);
    Activity localActivity = parama.yTx.getContext();
    if ((!ah.isNullOrNil(paramString)) && (paramString.length() > 0))
    {
      localActivity.getString(2131297061);
      yIv = h.b(localActivity, localActivity.getString(2131302958), false, null);
      com.tencent.mm.ui.chatting.c.j.yOM.e(new m.b(parama, localActivity, paramString, paramLong, yIR));
    }
    ((i)parama.aF(i.class)).dDL();
    AppMethodBeat.o(30616);
  }

  public static void a(final com.tencent.mm.ui.chatting.d.a parama, List<bi> paramList, boolean paramBoolean, final com.tencent.mm.ui.chatting.c.j paramj, final ad paramad)
  {
    AppMethodBeat.i(30612);
    if (parama == null)
    {
      ab.w("MicroMsg.ChattingEditModeSendToBrand", "do send to brand fail, fragment is null");
      AppMethodBeat.o(30612);
    }
    final Activity localActivity;
    while (true)
    {
      return;
      if ((paramList == null) || (paramList.isEmpty()))
      {
        ab.w("MicroMsg.ChattingEditModeSendToBrand", "do send to brand fail, select item empty");
        AppMethodBeat.o(30612);
      }
      else
      {
        localObject = new m.a((byte)0);
        yIR = (m.a)localObject;
        ((m.a)localObject).yIP = new LinkedList(paramList);
        yIR.yFW = paramBoolean;
        yIR.cKf = paramad.field_username;
        yIR.yIY = true;
        localActivity = parama.yTx.getContext();
        if (localActivity != null)
          break;
        AppMethodBeat.o(30612);
      }
    }
    com.tencent.mm.ui.tools.j localj = new com.tencent.mm.ui.tools.j(localActivity);
    localj.zFT = new m.1();
    localj.zFU = new m.2(localActivity);
    if (com.tencent.mm.pluginsdk.model.app.p.u(localActivity, "com.tencent.wework"));
    for (Object localObject = j.dBZ(); ; localObject = j.dBY())
    {
      localj.rBl = new m.3((List)localObject);
      localj.rBm = new n.d()
      {
        public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          AppMethodBeat.i(30603);
          if (paramAnonymousMenuItem.getItemId() == 1193046)
            if (j.eS(this.yII))
            {
              h.a(localActivity, localActivity.getString(2131298777), "", localActivity.getString(2131296322), new m.4.1(this));
              AppMethodBeat.o(30603);
            }
          while (true)
          {
            return;
            if (j.eT(this.yII))
            {
              h.a(localActivity, localActivity.getString(2131298778), "", localActivity.getString(2131296322), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                }
              });
              AppMethodBeat.o(30603);
            }
            else if (j.eR(this.yII))
            {
              h.a(localActivity, localActivity.getString(2131298779), "", new m.4.3(this), null);
              AppMethodBeat.o(30603);
            }
            else
            {
              if ((n.a(parama, this.yII, paramad)) && (paramj != null))
                paramj.dDL();
              AppMethodBeat.o(30603);
              continue;
              if (j.eS(this.yII))
              {
                h.a(localActivity, localActivity.getString(2131298777), "", localActivity.getString(2131296322), new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                  }
                });
                AppMethodBeat.o(30603);
              }
              else
              {
                if (!j.eT(this.yII))
                  break;
                h.a(localActivity, localActivity.getString(2131298778), "", localActivity.getString(2131296322), new m.4.5(this));
                AppMethodBeat.o(30603);
              }
            }
          }
          Object localObject = this.yII;
          if (localObject == null)
          {
            ab.w("MicroMsg.ChattingEditModeLogic", "check contain undownload image or video error, select item empty");
            label338: break label400;
            break label400;
          }
          label341: bi localbi;
          label400: 
          do
          {
            Iterator localIterator;
            do
            {
              paramAnonymousInt = 0;
              if ((paramAnonymousInt == 0) && (!j.eR(this.yII)))
                break label644;
              h.a(localActivity, localActivity.getString(2131298779), "", new m.4.6(this), null);
              AppMethodBeat.o(30603);
              break;
              localIterator = ((List)localObject).iterator();
            }
            while (!localIterator.hasNext());
            localbi = (bi)localIterator.next();
          }
          while (localbi.field_isSend == 1);
          if (localbi.drE())
            if (localbi.field_msgId <= 0L)
              break label914;
          label644: label912: label914: for (localObject = com.tencent.mm.at.o.ahl().fJ(localbi.field_msgId); ; localObject = null)
          {
            if (((localObject == null) || (((e)localObject).fDy <= 0L)) && (localbi.field_msgSvrId > 0L))
              localObject = com.tencent.mm.at.o.ahl().fI(localbi.field_msgSvrId);
            while (true)
            {
              if ((localObject == null) || ((((e)localObject).offset >= ((e)localObject).frO) && (((e)localObject).frO != 0)))
                break label912;
              paramAnonymousInt = 1;
              break label341;
              if (localbi.bws())
              {
                localObject = com.tencent.mm.modelvideo.o.all().uf(localbi.field_imgPath);
                if ((localObject == null) || (((s)localObject).status == 199) || (((s)localObject).status == 199))
                  break label338;
                paramAnonymousInt = 1;
                break label341;
              }
              if (localbi.bwt())
              {
                localObject = u.ut(localbi.field_imgPath);
                if ((localObject == null) || (((s)localObject).status == 199) || (((s)localObject).status == 199))
                  break label338;
                paramAnonymousInt = 1;
                break label341;
              }
              if (!localbi.dty())
                break label338;
              if (!j.aw(localbi))
              {
                paramAnonymousInt = 1;
                break label341;
              }
              paramAnonymousInt = 0;
              break label341;
              localObject = (String)paramAnonymousMenuItem.getTitle();
              if (f.ra((String)localObject))
              {
                if (this.yII.size() <= 1)
                {
                  m.dCc().yIY = true;
                  m.a((String)localObject, parama, this.yII);
                  AppMethodBeat.o(30603);
                  break;
                }
                paramAnonymousMenuItem = new com.tencent.mm.ui.widget.a.d(localActivity, 1, false);
                paramAnonymousMenuItem.rBl = new m.4.7(this);
                paramAnonymousMenuItem.rBm = new m.4.8(this, (String)localObject);
                paramAnonymousMenuItem.cpD();
                AppMethodBeat.o(30603);
                break;
              }
              if (j.eP(this.yII))
              {
                localObject = localActivity.getString(2131300630);
                h.a(localActivity, (String)localObject, "", new m.4.9(this, paramAnonymousMenuItem), null);
                AppMethodBeat.o(30603);
                break;
              }
              localObject = localActivity;
              localActivity.getString(2131297061);
              m.a(h.b((Context)localObject, localActivity.getString(2131302958), false, null));
              com.tencent.mm.ui.chatting.c.j.yOM.e(new m.b(parama, localActivity, paramAnonymousMenuItem.getTitle(), -1L, m.dCc()));
              if (paramj != null)
                paramj.dDL();
              AppMethodBeat.o(30603);
              break;
            }
            break label400;
          }
        }
      };
      localj.cuu();
      AppMethodBeat.o(30612);
      break;
    }
  }

  public static void a(String paramString, com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(30614);
    Object localObject = f.qX(paramString);
    if (localObject == null)
      AppMethodBeat.o(30614);
    while (true)
    {
      return;
      if (((com.tencent.mm.aj.d)localObject).adR())
      {
        localObject = new Intent(parama.yTx.getContext(), BizChatSelectConversationUI.class);
        ((Intent)localObject).putExtra("enterprise_biz_name", paramString);
        ((Intent)localObject).putExtra("biz_chat_scene", 2);
        ((Intent)localObject).putExtra("enterprise_extra_params", yIR.yIY);
        parama.a((Intent)localObject, 225, new m.6(parama));
        AppMethodBeat.o(30614);
      }
      else
      {
        if (((com.tencent.mm.aj.d)localObject).adP())
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("enterprise_biz_name", paramString);
          ((Intent)localObject).putExtra("enterprise_scene", 1);
          com.tencent.mm.bp.d.a(parama.yTx, "brandservice", ".ui.EnterpriseBizContactPlainListUI", (Intent)localObject, 225);
        }
        AppMethodBeat.o(30614);
      }
    }
  }

  public static void a(String paramString, com.tencent.mm.ui.chatting.d.a parama, List<bi> paramList)
  {
    AppMethodBeat.i(30613);
    Activity localActivity = parama.yTx.getContext();
    if (localActivity == null)
      AppMethodBeat.o(30613);
    Object localObject;
    while (true)
    {
      return;
      localObject = f.qX(paramString);
      if (localObject != null)
        break;
      AppMethodBeat.o(30613);
    }
    boolean bool1 = ((com.tencent.mm.aj.d)localObject).adR();
    boolean bool2;
    int i;
    if (yIR.yIY)
    {
      bool2 = j.eP(paramList);
      if (bool1)
        if ((paramList == null) || (paramList.isEmpty()))
        {
          ab.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to bizchat msg error, selected item empty");
          i = 1;
          label97: yIR.yIP = new LinkedList(paramList);
          if ((!bool2) && (i == 0))
            break label273;
          paramList = localActivity.getString(2131299224);
        }
    }
    while (true)
    {
      if (paramList != null)
      {
        h.a(localActivity, paramList, "", new m.5(paramString, parama), null);
        AppMethodBeat.o(30613);
        break;
        localObject = paramList.iterator();
        while (true)
          if (((Iterator)localObject).hasNext())
          {
            bi localbi = (bi)((Iterator)localObject).next();
            if ((!localbi.isText()) && (!localbi.drD()) && (!localbi.drE()) && (!localbi.bAC()) && (!j.aD(localbi)))
            {
              i = 1;
              break;
            }
          }
        i = 0;
        break label97;
        if (!bool2)
          break label273;
        paramList = localActivity.getString(2131299225);
        continue;
      }
      a(paramString, parama);
      AppMethodBeat.o(30613);
      break;
      label273: paramList = null;
    }
  }

  public static nt bR(Context paramContext, String paramString)
  {
    AppMethodBeat.i(30615);
    nt localnt = new nt();
    localnt.cJY.type = 6;
    localnt.cJY.cKe = yIR.yIP;
    localnt.cJY.toUser = paramString;
    localnt.cJY.cKf = yIR.cKf;
    localnt.cJY.context = paramContext;
    com.tencent.mm.sdk.b.a.xxA.m(localnt);
    yIR.cJy = localnt.cJZ.cJy;
    yIR.yIQ = localnt.cJZ.cKh;
    AppMethodBeat.o(30615);
    return localnt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m
 * JD-Core Version:    0.6.2
 */
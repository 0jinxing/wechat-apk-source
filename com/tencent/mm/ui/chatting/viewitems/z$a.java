package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.contact.e;
import junit.framework.Assert;

public final class z$a extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33203);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969064);
      ((View)localObject).setTag(new z.b().fe((View)localObject));
    }
    AppMethodBeat.o(33203);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33204);
    this.yJI = parama1;
    z.b localb = (z.b)parama;
    if (parambi.getType() == 37)
    {
      aw.ZK();
      paramString = com.tencent.mm.model.c.XO().Rm(parambi.field_content);
      if ((paramString == null) || (paramString.svN == null) || (paramString.svN.length() <= 0))
      {
        ab.e("MicroMsg.ChattingItemFMessageFrom", "getView : parse verify msg failed");
        AppMethodBeat.o(33204);
        return;
      }
      com.tencent.mm.ah.b.U(paramString.svN, paramString.xZh);
      label266: if (t.mY(paramString.svN))
      {
        localb.zfE.setVisibility(8);
        localb.zfF.setVisibility(8);
        localb.zfG.setVisibility(0);
        localb.zfD.setBackgroundColor(16777215);
        localb.zfG.setText(parama1.yTx.getMMResources().getString(2131300086));
        label166: switch (paramString.scene)
        {
        case 14:
        case 15:
        case 16:
        case 17:
        case 19:
        case 20:
        case 21:
        default:
          localb.zeH.setText(2131298107);
          localb.gGA.setText(j.b(parama1.yTx.getContext(), paramString.getDisplayName(), localb.gGA.getTextSize()));
          v(localb.zbv, paramString.svN);
          localb.zfC.setVisibility(0);
          if ((paramString.content != null) && (!paramString.content.trim().equals("")))
            localb.zfC.setText(paramString.content);
          break;
        case 18:
        case 22:
        case 23:
        case 24:
        case 26:
        case 27:
        case 28:
        case 29:
        case 30:
        case 25:
        case 13:
        }
      }
    }
    while (true)
    {
      localb.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, null, '\000'));
      localb.jPL.setOnClickListener(d(parama1));
      localb.jPL.setOnLongClickListener(c(parama1));
      localb.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
      AppMethodBeat.o(33204);
      break;
      localb.zfE.setVisibility(0);
      localb.zfF.setVisibility(0);
      localb.zfG.setVisibility(0);
      localb.zfD.setBackgroundResource(2130838288);
      localb.zfG.setText(parama1.yTx.getMMResources().getString(2131300085));
      break label166;
      localb.zeH.setText(2131298111);
      break label266;
      localb.zeH.setText(2131298113);
      break label266;
      localb.zeH.setText(2131302101);
      break label266;
      localb.zeH.setText(2131298106);
      break label266;
      parama = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(paramString.svN);
      if ((parama != null) && (parama.apA() != null) && (!parama.apA().equals("")))
      {
        localb.zfH.setVisibility(0);
        localb.zfH.setText(parama1.yTx.getMMResources().getString(2131298099, new Object[] { parama.apA() }));
        break label266;
      }
      localb.zfH.setVisibility(8);
      break label266;
      localb.zfC.setText(parama1.yTx.getMMResources().getString(2131298112));
      continue;
      if (parambi.getType() == 40)
      {
        aw.ZK();
        bi.a locala = com.tencent.mm.model.c.XO().Rn(parambi.field_content);
        if ((locala == null) || (locala.svN == null) || (locala.svN.length() <= 0))
        {
          ab.e("MicroMsg.ChattingItemFMessageFrom", "getView : parse possible friend msg failed");
          AppMethodBeat.o(33204);
          break;
        }
        com.tencent.mm.ah.b.U(locala.svN, locala.xZh);
        if (t.mY(locala.svN))
        {
          localb.zfE.setVisibility(8);
          localb.zfF.setVisibility(8);
          localb.zfG.setVisibility(0);
          localb.zfD.setBackgroundColor(16777215);
          localb.zfG.setText(parama1.yTx.getMMResources().getString(2131300086));
          label823: switch (locala.scene)
          {
          default:
            ab.d("MicroMsg.ChattingItemFMessageFrom", "prossible friend sceneType:%d", new Object[] { Integer.valueOf(locala.scene) });
            localb.zeH.setText(2131298102);
            localb.zfC.setText(2131298103);
            localb.gGA.setText(j.b(parama1.yTx.getContext(), locala.getDisplayName(), localb.gGA.getTextSize()));
          case 4:
          case 10:
          case 11:
          case 31:
          case 32:
          }
        }
        while (true)
        {
          v(localb.zbv, locala.svN);
          break;
          localb.zfE.setVisibility(0);
          localb.zfF.setVisibility(0);
          localb.zfG.setVisibility(0);
          localb.zfD.setBackgroundResource(2130838288);
          localb.zfG.setText(parama1.yTx.getMMResources().getString(2131300085));
          break label823;
          localb.zeH.setText(2131298093);
          localb.zfC.setText(2131298094);
          paramString = locala.dtZ();
          parama = paramString;
          if (paramString == null)
            parama = locala.getDisplayName();
          localb.gGA.setText(j.b(parama1.yTx.getContext(), parama, localb.gGA.getTextSize()));
          continue;
          localb.zeH.setText(2131298098);
          paramString = l.wf(locala.xZi);
          parama = paramString;
          if (ah.isNullOrNil(paramString))
            parama = l.wf(locala.xZj);
          localb.zfC.setText(parama1.yTx.getMMResources().getString(2131298099, new Object[] { parama }));
          localb.gGA.setText(j.b(parama1.yTx.getContext(), locala.getDisplayName(), localb.gGA.getTextSize()));
          continue;
          localb.zeH.setText(2131298109);
          localb.zfC.setText(2131298110);
          localb.gGA.setText(j.b(parama1.yTx.getContext(), locala.getDisplayName(), localb.gGA.getTextSize()));
          continue;
          localb.zeH.setText(2131298105);
          localb.zfC.setText(2131298104);
          localb.gGA.setText(j.b(parama1.yTx.getContext(), locala.getDisplayName(), localb.gGA.getTextSize()));
        }
      }
      ab.w("MicroMsg.ChattingItemFMessageFrom", "FROM_FMESSAGE did not include this type, msgType = " + parambi.getType());
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 37) || (paramInt == 40));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33205);
    if (parambi.getType() == 37)
    {
      paramView = parambi.field_content;
      ab.w("MicroMsg.ChattingItemFMessageFrom", "dealClickVerifyMsgEvent : ".concat(String.valueOf(paramView)));
      if ((paramView != null) && (paramView.length() > 0));
    }
    while (true)
    {
      AppMethodBeat.o(33205);
      return true;
      aw.ZK();
      parambi = com.tencent.mm.model.c.XO().Rm(paramView);
      if (parambi != null)
      {
        boolean bool;
        label85: Object localObject;
        if (parambi.svN.length() > 0)
        {
          bool = true;
          Assert.assertTrue(bool);
          aw.ZK();
          paramView = com.tencent.mm.model.c.XM().aoO(parambi.svN);
          localObject = new Intent();
          if ((paramView == null) || ((int)paramView.ewQ <= 0) || (!com.tencent.mm.n.a.jh(paramView.field_type)))
            break label407;
          ((Intent)localObject).putExtra("Contact_User", paramView.field_username);
          e.a((Intent)localObject, paramView.field_username);
          label160: parama = parambi.content;
          paramView = parama;
          if (ah.nullAsNil(parama).length() <= 0)
            switch (parambi.scene)
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
        for (paramView = this.yJI.yTx.getMMResources().getString(2131298108); ; paramView = this.yJI.yTx.getMMResources().getString(2131298112))
        {
          ((Intent)localObject).putExtra("Contact_Content", paramView);
          ((Intent)localObject).putExtra("Contact_verify_Scene", parambi.scene);
          ((Intent)localObject).putExtra("Contact_Uin", parambi.pnz);
          ((Intent)localObject).putExtra("Contact_QQNick", parambi.gwH);
          ((Intent)localObject).putExtra("Contact_Mobile_MD5", parambi.xZi);
          ((Intent)localObject).putExtra("User_From_Fmessage", true);
          ((Intent)localObject).putExtra("Contact_from_msgType", 37);
          ((Intent)localObject).putExtra("Contact_KSnsIFlag", parambi.xZv);
          ((Intent)localObject).putExtra("Contact_KSnsBgUrl", parambi.xZw);
          d.b(this.yJI.yTx.getContext(), "profile", ".ui.ContactInfoUI", (Intent)localObject);
          com.tencent.mm.bq.a.Lu(parambi.scene);
          break;
          bool = false;
          break label85;
          label407: ((Intent)localObject).putExtra("Verify_ticket", parambi.mGZ);
          ((Intent)localObject).putExtra("User_Verify", true);
          ((Intent)localObject).putExtra("Contact_User", parambi.svN);
          ((Intent)localObject).putExtra("Contact_Alias", parambi.dFl);
          ((Intent)localObject).putExtra("Contact_Nick", parambi.nickname);
          ((Intent)localObject).putExtra("Contact_QuanPin", parambi.gwG);
          ((Intent)localObject).putExtra("Contact_PyInitial", parambi.gwF);
          ((Intent)localObject).putExtra("Contact_Sex", parambi.dtS);
          ((Intent)localObject).putExtra("Contact_Signature", parambi.signature);
          ((Intent)localObject).putExtra("Contact_Scene", parambi.scene);
          ((Intent)localObject).putExtra("Contact_FMessageCard", true);
          ((Intent)localObject).putExtra("Contact_City", parambi.getCity());
          ((Intent)localObject).putExtra("Contact_Province", parambi.getProvince());
          ((Intent)localObject).putExtra("Contact_Mobile_MD5", parambi.xZi);
          ((Intent)localObject).putExtra("Contact_full_Mobile_MD5", parambi.xZj);
          ((Intent)localObject).putExtra("Contact_KSnsIFlag", parambi.xZv);
          ((Intent)localObject).putExtra("Contact_KSnsBgUrl", parambi.xZw);
          break label160;
        }
        if (parambi.getType() == 40)
        {
          paramView = parambi.field_content;
          aw.ZK();
          parambi = com.tencent.mm.model.c.XO().Rn(paramView);
          if ((parambi != null) && (parambi.svN.length() > 0))
          {
            com.tencent.mm.bq.a.Lu(parambi.scene);
            aw.ZK();
            localObject = com.tencent.mm.model.c.XM().aoO(parambi.svN);
            if ((localObject != null) && ((int)((com.tencent.mm.n.a)localObject).ewQ > 0) && (com.tencent.mm.n.a.jh(((ap)localObject).field_type)))
            {
              e.a(this.yJI.yTx.getContext(), (ad)localObject, parambi);
            }
            else if ((parambi.pnz <= 0L) && ((!ah.isNullOrNil(parambi.xZi)) || (!ah.isNullOrNil(parambi.xZj))))
            {
              parama = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW(parambi.xZi);
              if ((parama != null) && (parama.Aq() != null))
              {
                paramView = parama;
                if (parama.Aq().length() > 0);
              }
              else
              {
                parama = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW(parambi.xZj);
                if ((parama != null) && (parama.Aq() != null))
                {
                  paramView = parama;
                  if (parama.Aq().length() > 0);
                }
                else
                {
                  if ((localObject != null) && ((int)((com.tencent.mm.n.a)localObject).ewQ > 0))
                    e.a(this.yJI.yTx.getContext(), (ad)localObject, parambi);
                  while (true)
                  {
                    ab.e("MicroMsg.ChattingItemFMessageFrom", "error : this is not the mobile contact, MD5 = " + parambi.xZi + " fullMD5:" + parambi.xZj);
                    break;
                    e.a(this.yJI.yTx.getContext(), parambi);
                  }
                }
              }
              if ((paramView.getUsername() == null) || (paramView.getUsername().length() <= 0))
              {
                paramView.username = parambi.svN;
                paramView.bJt = 128;
                if (com.tencent.mm.plugin.account.a.getAddrUploadStg().a(paramView.Aq(), paramView) == -1)
                  ab.e("MicroMsg.ChattingItemFMessageFrom", "update mobile contact username failed");
              }
              else
              {
                e.a(this.yJI.yTx.getContext(), parambi);
              }
            }
            else
            {
              e.a(this.yJI.yTx.getContext(), parambi);
            }
          }
        }
      }
    }
  }

  protected final boolean dHj()
  {
    return false;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.z.a
 * JD-Core Version:    0.6.2
 */
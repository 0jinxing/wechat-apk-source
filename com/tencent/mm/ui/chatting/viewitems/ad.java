package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.n;
import com.tencent.mm.at.n.d;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelstat.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.aa;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.chatting.s.e;
import com.tencent.mm.ui.chatting.s.n;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ad
{
  public static final class b extends c
    implements s.n
  {
    private com.tencent.mm.ui.chatting.d.a yJI;
    private ad.c zfW;

    public static void a(c.a parama, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(33239);
      if (paramInt2 > 0)
        if (paramInt1 >= paramInt2)
          paramInt1 = 100;
      while (true)
      {
        parama = (ad.d)parama;
        if ((paramInt1 < 100) || (parama.zfY.getVisibility() == 0))
          break;
        AppMethodBeat.o(33239);
        return;
        paramInt1 = (int)(paramInt1 * 100L / paramInt2);
        continue;
        paramInt1 = 0;
      }
      parama.zfY.setText(paramInt1 + "%");
      if (dHm())
        parama.pyf.setVisibility(8);
      while (true)
      {
        parama.zfY.setVisibility(0);
        parama.zfZ.setVisibility(0);
        AppMethodBeat.o(33239);
        break;
        parama.pyf.setVisibility(0);
      }
    }

    public static void a(c.a parama, boolean paramBoolean)
    {
      AppMethodBeat.i(33240);
      if ((paramBoolean == true) && ((parama instanceof ad.d)))
      {
        parama = (ad.d)parama;
        parama.pyf.setVisibility(4);
        parama.zfY.setVisibility(4);
        parama.zfZ.setVisibility(4);
      }
      AppMethodBeat.o(33240);
    }

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(33235);
      Object localObject;
      if (paramView != null)
      {
        localObject = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localObject = new v(paramLayoutInflater, 2130969103);
        ((View)localObject).setTag(new ad.d().z((View)localObject, false));
      }
      AppMethodBeat.o(33235);
      return localObject;
    }

    public final void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33241);
      parambi.dtJ();
      aw.ZK();
      com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
      ((aa)parama.aF(aa.class)).bb(parambi);
      AppMethodBeat.o(33241);
    }

    public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(33236);
      this.yJI = parama1;
      paramString = (ad.d)parama;
      parama = n.ahb();
      long l = parambi.field_msgId;
      boolean bool1 = parama.fFO.containsKey(Long.valueOf(l));
      Object localObject1 = o.ahl().w(parambi);
      int i;
      int j;
      boolean bool2;
      Object localObject2;
      Object localObject3;
      label168: int k;
      if ((localObject1 != null) && (!bool1))
        if (n.ahb().fL(((com.tencent.mm.at.e)localObject1).fDy))
        {
          parama = n.ahb().fM(((com.tencent.mm.at.e)localObject1).fDy);
          i = (int)parama.cET;
          j = (int)parama.xb;
          if (i == 0)
          {
            bool2 = true;
            localObject2 = o.ahl();
            localObject3 = paramString.zdN;
            String str = parambi.field_imgPath;
            float f = com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext());
            j = parambi.dJw;
            i = parambi.dJx;
            ImageView localImageView = paramString.zeh;
            if (!bool2)
              break label624;
            parama = null;
            if ((!((com.tencent.mm.at.g)localObject2).a((ImageView)localObject3, str, f, j, i, localImageView, 2130838177, 0, parama)) || (!this.kuU))
              paramString.zdN.setImageDrawable(com.tencent.mm.bz.a.g(parama1.yTx.getContext(), 2130838177));
            if ((localObject1 == null) && (!bool1))
              break label874;
            if ((!bool2) && (parambi.field_status != 5))
              break label633;
            k = 1;
            label246: if (!bool1)
              break label639;
            paramString.zfY.setText("0%");
            parama = paramString.pyf;
            if (k == 0)
              break label856;
            i = 8;
            label277: parama.setVisibility(i);
            parama = paramString.zfY;
            if (k == 0)
              break label862;
            i = 8;
            label298: parama.setVisibility(i);
            parama = paramString.zfZ;
            if (k == 0)
              break label868;
            i = 8;
            label319: parama.setVisibility(i);
            label325: paramString.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, parambi.field_talker, '\000'));
            parama = paramString.jPL;
            if (this.zfW == null)
              this.zfW = new ad.c(this.yJI, this);
            parama.setOnClickListener(this.zfW);
            paramString.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
            paramString.jPL.setOnLongClickListener(c(parama1));
            paramString.zdN.setContentDescription(parama1.yTx.getMMResources().getString(2131298119));
            if (dHm())
            {
              paramString.pyf.setVisibility(8);
              ab.d("MicroMsg.ContactInfoUI", "[oneliang]%s,%s", new Object[] { Long.valueOf(parambi.field_msgId), Integer.valueOf(parambi.field_status) });
              if (dHm())
              {
                if ((parambi.field_status != 2) || (!a((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class), parambi.field_msgId)))
                  break label907;
                if (paramString.zci != null)
                  paramString.zci.setVisibility(0);
              }
            }
          }
        }
      while (true)
      {
        a(paramInt, paramString, parambi, parama1.dFu(), parama1.dFx(), parama1, this);
        ad.a(parambi, parama1, paramString);
        AppMethodBeat.o(33236);
        return;
        if ((j == i) && (i != 0))
        {
          bool2 = true;
          break;
        }
        bool2 = false;
        break;
        bool2 = com.tencent.mm.at.f.b((com.tencent.mm.at.e)localObject1);
        break;
        bool2 = false;
        break;
        label624: parama = paramString.zfZ;
        break label168;
        label633: k = 0;
        break label246;
        label639: localObject2 = paramString.zfY;
        parama = new StringBuilder();
        if (localObject1 != null)
        {
          i = ((com.tencent.mm.at.e)localObject1).frO;
          j = ((com.tencent.mm.at.e)localObject1).offset;
          if (n.ahb().fL(((com.tencent.mm.at.e)localObject1).fDy))
          {
            localObject3 = n.ahb().fM(((com.tencent.mm.at.e)localObject1).fDy);
            i = (int)((n.d)localObject3).cET;
            j = (int)((n.d)localObject3).xb;
          }
          if (((com.tencent.mm.at.e)localObject1).agQ())
          {
            localObject3 = o.ahl().ly(((com.tencent.mm.at.e)localObject1).fDJ);
            if (n.ahb().fL(((com.tencent.mm.at.e)localObject1).fDJ))
            {
              localObject1 = n.ahb().fM(((com.tencent.mm.at.e)localObject1).fDJ);
              i = (int)((n.d)localObject1).cET;
              j = (int)((n.d)localObject1).xb;
            }
          }
          else
          {
            label782: if (i <= 0)
              break label850;
            if (j < i)
              break label837;
            i = 100;
          }
        }
        while (true)
        {
          ((TextView)localObject2).setText(i + "%");
          break;
          i = ((com.tencent.mm.at.e)localObject3).frO;
          j = ((com.tencent.mm.at.e)localObject3).offset;
          break label782;
          label837: i = j * 100 / i;
          continue;
          label850: i = 0;
        }
        label856: i = 0;
        break label277;
        label862: i = 0;
        break label298;
        label868: i = 0;
        break label319;
        label874: paramString.zfZ.setVisibility(8);
        paramString.pyf.setVisibility(8);
        paramString.zfY.setVisibility(8);
        break label325;
        label907: if (paramString.zci != null)
          paramString.zci.setVisibility(8);
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(33237);
      aw.ZK();
      int i;
      Object localObject1;
      Object localObject2;
      MenuItem localMenuItem;
      int j;
      int k;
      if ((com.tencent.mm.model.c.isSDCardAvailable()) && (paramView != null))
      {
        i = ((ay)paramView.getTag()).position;
        localObject1 = null;
        if (parambi.field_msgId > 0L)
          localObject1 = o.ahl().fJ(parambi.field_msgId);
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          if (((com.tencent.mm.at.e)localObject1).fDy > 0L);
        }
        else
        {
          localObject2 = localObject1;
          if (parambi.field_msgSvrId > 0L)
            localObject2 = o.ahl().fI(parambi.field_msgSvrId);
        }
        localObject1 = localObject2;
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((com.tencent.mm.at.e)localObject2).agQ())
          {
            localObject1 = localObject2;
            if (((com.tencent.mm.at.e)localObject2).frO == 0)
              localObject1 = o.ahl().ly(((com.tencent.mm.at.e)localObject2).fDJ);
          }
        }
        paramContextMenu.add(i, 110, 0, paramView.getContext().getString(2131302491));
        if (parambi.field_status == 5)
          paramContextMenu.add(i, 103, 0, paramView.getContext().getString(2131298217));
        if ((com.tencent.mm.aj.f.aey()) && (!this.yJI.dFy()))
          paramContextMenu.add(i, 114, 0, paramView.getContext().getString(2131298150));
        if (com.tencent.mm.bp.d.afj("favorite"))
          paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
        localObject2 = new dq();
        ((dq)localObject2).cxc.cvx = parambi.field_msgId;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        if ((((dq)localObject2).cxd.cwB) || (com.tencent.mm.pluginsdk.model.app.g.ad(this.yJI.yTx.getContext(), parambi.getType())))
          paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
        if (((com.tencent.mm.at.e)localObject1).status != -1)
        {
          localMenuItem = paramContextMenu.add(i, 131, 0, paramView.getContext().getString(2131298118));
          localObject1 = new int[2];
          if (paramView == null)
            break label595;
          j = paramView.getWidth();
          k = paramView.getHeight();
          paramView.getLocationInWindow((int[])localObject1);
        }
      }
      while (true)
      {
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("img_gallery_width", j).putExtra("img_gallery_height", k).putExtra("img_gallery_left", localObject1[0]).putExtra("img_gallery_top", localObject1[1]);
        localMenuItem.setIntent((Intent)localObject2);
        if ((!parambi.drC()) && (parambi.drE()) && ((parambi.field_status == 2) || (parambi.dJz == 1)) && (a(parambi, this.yJI)) && (arB(parambi.field_talker)) && (!com.tencent.mm.storage.ad.mg(this.yJI.getTalkerUserName())))
          paramContextMenu.add(i, 123, 0, paramView.getContext().getString(2131298166));
        if (!this.yJI.dFy())
          paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298153));
        AppMethodBeat.o(33237);
        return true;
        label595: k = 0;
        j = 0;
      }
    }

    public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33238);
      if (100 == paramMenuItem.getItemId())
        ad.b(parambi, parama);
      while (true)
      {
        AppMethodBeat.o(33238);
        return false;
        if (131 == paramMenuItem.getItemId())
          ad.b(parama, paramMenuItem, parambi);
        else
          ((aa)parama.aF(aa.class)).a(paramMenuItem, parambi);
      }
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if ((paramBoolean) && ((paramInt == 3) || (paramInt == 23) || (paramInt == 13) || (paramInt == 39) || (paramInt == 33)));
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      return false;
    }

    public final boolean dHk()
    {
      return true;
    }
  }

  public static final class c extends s.e
  {
    private c zfX;

    public c(com.tencent.mm.ui.chatting.d.a parama, c paramc)
    {
      super();
      this.zfX = paramc;
    }

    private void a(long paramLong1, long paramLong2, String paramString1, String paramString2, int[] paramArrayOfInt, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(33243);
      Intent localIntent = new Intent(this.yJI.yTx.getContext(), ImageGalleryUI.class);
      localIntent.putExtra("img_gallery_msg_id", paramLong1);
      localIntent.putExtra("show_search_chat_content_result", ((z)this.yJI.aF(z.class)).dES());
      localIntent.putExtra("img_gallery_msg_svr_id", paramLong2);
      localIntent.putExtra("key_is_biz_chat", ((com.tencent.mm.ui.chatting.c.b.d)this.yJI.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm());
      localIntent.putExtra("key_biz_chat_id", ((com.tencent.mm.ui.chatting.c.b.d)this.yJI.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDz());
      localIntent.putExtra("img_gallery_talker", paramString1);
      localIntent.putExtra("img_gallery_chatroom_name", paramString2);
      localIntent.putExtra("img_gallery_left", paramArrayOfInt[0]);
      localIntent.putExtra("img_gallery_top", paramArrayOfInt[1]);
      localIntent.putExtra("img_gallery_width", paramInt1);
      localIntent.putExtra("img_gallery_height", paramInt2);
      localIntent.putExtra("img_gallery_enter_from_chatting_ui", ((z)this.yJI.aF(z.class)).dEN());
      localIntent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", com.tencent.mm.storage.ad.mg(paramString1));
      paramString2 = this.yJI.getTalkerUserName();
      paramArrayOfInt = new Bundle();
      if (this.yJI.dFx())
        paramInt1 = 2;
      while (true)
      {
        paramArrayOfInt.putInt("stat_scene", paramInt1);
        paramArrayOfInt.putString("stat_msg_id", "msg_" + Long.toString(paramLong2));
        paramArrayOfInt.putString("stat_chat_talker_username", paramString2);
        paramArrayOfInt.putString("stat_send_msg_user", paramString1);
        localIntent.putExtra("_stat_obj", paramArrayOfInt);
        localIntent.putExtra("img_gallery_session_id", c(paramLong2, paramString1, paramString2));
        this.yJI.startActivity(localIntent);
        this.yJI.yTx.overridePendingTransition(0, 0);
        AppMethodBeat.o(33243);
        return;
        if (com.tencent.mm.model.t.mZ(paramString2))
          paramInt1 = 7;
        else
          paramInt1 = 1;
      }
    }

    public static void a(com.tencent.mm.ui.chatting.d.a parama, bi parambi, long paramLong1, long paramLong2, String paramString1, String paramString2, int[] paramArrayOfInt, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      AppMethodBeat.i(33244);
      Intent localIntent = new Intent(parama.yTx.getContext(), ImageGalleryUI.class);
      localIntent.putExtra("img_gallery_msg_id", paramLong1);
      localIntent.putExtra("img_gallery_msg_svr_id", paramLong2);
      localIntent.putExtra("show_search_chat_content_result", ((z)parama.aF(z.class)).dES());
      localIntent.putExtra("key_is_biz_chat", ((com.tencent.mm.ui.chatting.c.b.d)parama.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm());
      localIntent.putExtra("key_biz_chat_id", ((com.tencent.mm.ui.chatting.c.b.d)parama.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDz());
      localIntent.putExtra("img_gallery_talker", paramString1);
      localIntent.putExtra("img_gallery_chatroom_name", paramString2);
      localIntent.putExtra("img_gallery_left", paramArrayOfInt[0]);
      localIntent.putExtra("img_gallery_top", paramArrayOfInt[1]);
      localIntent.putExtra("img_gallery_width", paramInt1);
      localIntent.putExtra("img_gallery_height", paramInt2);
      localIntent.putExtra("img_gallery_enter_from_chatting_ui", ((z)parama.aF(z.class)).dEN());
      localIntent.putExtra("img_gallery_enter_PhotoEditUI", paramBoolean);
      localIntent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", com.tencent.mm.storage.ad.mg(paramString1));
      paramString2 = parama.getTalkerUserName();
      if (parambi.field_isSend == 1)
        paramString1 = parama.dFu();
      parambi = new Bundle();
      if (parama.dFw())
        paramInt1 = 2;
      while (true)
      {
        parambi.putInt("stat_scene", paramInt1);
        parambi.putString("stat_msg_id", "msg_" + Long.toString(paramLong2));
        parambi.putString("stat_chat_talker_username", paramString2);
        parambi.putString("stat_send_msg_user", paramString1);
        localIntent.putExtra("_stat_obj", parambi);
        localIntent.putExtra("img_gallery_session_id", c(paramLong2, paramString1, paramString2));
        parama.yTx.startActivity(localIntent);
        parama.yTx.overridePendingTransition(0, 0);
        AppMethodBeat.o(33244);
        return;
        if (com.tencent.mm.model.t.mZ(paramString2))
          paramInt1 = 7;
        else
          paramInt1 = 1;
      }
    }

    private static String c(long paramLong, String paramString1, String paramString2)
    {
      AppMethodBeat.i(33245);
      String str = com.tencent.mm.model.v.nW(String.valueOf(paramLong));
      v.b localb = com.tencent.mm.model.v.Zp().y(str, true);
      localb.j("preUsername", paramString1);
      localb.j("preChatName", paramString2);
      AppMethodBeat.o(33245);
      return str;
    }

    public final void a(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33242);
      ay localay = (ay)paramView.getTag();
      com.tencent.mm.modelstat.b.fRa.F(localay.cKd);
      bi localbi = localay.cKd;
      com.tencent.mm.modelstat.a.a(localbi, a.a.fQX);
      int[] arrayOfInt = new int[2];
      int i = 0;
      int j = 0;
      if (paramView != null)
      {
        paramView.getLocationInWindow(arrayOfInt);
        i = paramView.getWidth();
        j = paramView.getHeight();
      }
      if (localbi.field_isSend == 1)
      {
        paramView = o.ahl().fJ(localbi.field_msgId);
        if (paramView.fDy != 0L);
      }
      else
      {
        paramView = o.ahl().fI(localbi.field_msgSvrId);
      }
      while (true)
      {
        Object localObject1 = br.z(localbi.field_content, "msg");
        if (localObject1 != null)
          bo.getLong((String)((Map)localObject1).get(".msg.img.$hdlength"), 0L);
        aw.ZK();
        Object localObject2;
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          com.tencent.mm.ui.base.t.hO(this.yJI.yTx.getContext());
          localObject1 = j.b.md(parambi.field_content);
          if ((localObject1 != null) && (!bo.isNullOrNil(((j.b)localObject1).appId)) && (this.zfX != null))
          {
            localObject2 = com.tencent.mm.pluginsdk.model.app.g.bT(((j.b)localObject1).appId, false);
            if (localObject2 != null)
              if (!(this.zfX instanceof ad.a))
                break label771;
          }
        }
        label771: for (paramView = c.d(parama, parambi); ; paramView = r.Yz())
        {
          c.a(parama, (j.b)localObject1, paramView, (com.tencent.mm.pluginsdk.model.app.f)localObject2, parambi.field_msgSvrId, parama.getTalkerUserName());
          AppMethodBeat.o(33242);
          return;
          if (localbi.field_isSend == 1)
          {
            localObject1 = com.tencent.mm.at.f.c(paramView);
            if (com.tencent.mm.vfs.e.ct(o.ahl().q((String)localObject1, "", "")))
            {
              a(this.yJI, localbi, paramView.fDH, paramView.cKK, localay.userName, localay.chatroomName, arrayOfInt, i, j, false);
              break;
            }
            localObject1 = paramView.fDz;
            if (com.tencent.mm.vfs.e.ct(o.ahl().q((String)localObject1, "", "")))
            {
              a(this.yJI, localbi, paramView.fDH, paramView.cKK, localay.userName, localay.chatroomName, arrayOfInt, i, j, false);
              break;
            }
            a(localbi.field_msgId, localbi.field_msgSvrId, localay.userName, localay.chatroomName, arrayOfInt, i, j);
            break;
          }
          if (paramView.agP())
          {
            localObject2 = paramView.fDz;
            localObject1 = localObject2;
            if (paramView.agQ())
            {
              com.tencent.mm.at.e locale = com.tencent.mm.at.f.a(paramView);
              localObject1 = localObject2;
              if (locale != null)
              {
                localObject1 = localObject2;
                if (locale.fDy > 0L)
                {
                  localObject1 = localObject2;
                  if (locale.agP())
                  {
                    localObject1 = localObject2;
                    if (com.tencent.mm.vfs.e.ct(o.ahl().q(locale.fDz, "", "")))
                      localObject1 = locale.fDz;
                  }
                }
              }
            }
            if (com.tencent.mm.vfs.e.ct(o.ahl().q((String)localObject1, "", "")))
            {
              a(this.yJI, localbi, paramView.fDH, paramView.cKK, localay.userName, localay.chatroomName, arrayOfInt, i, j, false);
              break;
            }
            ab.i("MicroMsg.DesignerClickListener", "retry downloadImg, %d", new Object[] { Long.valueOf(paramView.fDy) });
            paramView.sb("SERVERID://" + localbi.field_msgSvrId);
            paramView.bJt = 16;
            paramView.lt(0);
            paramView.bJt = 8;
            paramView.setStatus(0);
            paramView.bJt = 256;
            o.ahl().a(Long.valueOf(paramView.fDy), paramView);
          }
          while (true)
          {
            a(localbi.field_msgId, localbi.field_msgSvrId, localay.userName, localay.chatroomName, arrayOfInt, i, j);
            break;
            if (paramView.status == -1)
            {
              ab.i("MicroMsg.DesignerClickListener", "retry downloadImg, %d", new Object[] { Long.valueOf(paramView.fDy) });
              paramView.setStatus(0);
              paramView.bJt = 256;
              o.ahl().a(Long.valueOf(paramView.fDy), paramView);
            }
          }
        }
      }
    }
  }

  static final class d extends c.a
  {
    TextView moL;
    ProgressBar pyf;
    ImageView zci;
    ImageView zdN;
    ImageView zeh;
    TextView zfY;
    View zfZ;

    public final c.a z(View paramView, boolean paramBoolean)
    {
      AppMethodBeat.i(33246);
      super.eP(paramView);
      this.enf = ((TextView)paramView.findViewById(2131820587));
      this.zdN = ((ImageView)paramView.findViewById(2131822578));
      this.moo = ((CheckBox)paramView.findViewById(2131820580));
      this.iVh = paramView.findViewById(2131820586);
      this.zfZ = paramView.findViewById(2131822616);
      if (paramBoolean)
      {
        this.qkY = ((TextView)paramView.findViewById(2131821102));
        this.pyf = ((ProgressBar)paramView.findViewById(2131822617));
      }
      while (true)
      {
        this.zeh = ((ImageView)paramView.findViewById(2131822553));
        this.moL = ((TextView)paramView.findViewById(2131822543));
        AppMethodBeat.o(33246);
        return this;
        this.pyf = ((ProgressBar)paramView.findViewById(2131822660));
        this.zfY = ((TextView)paramView.findViewById(2131822668));
        this.qkY = ((TextView)paramView.findViewById(2131821102));
        this.zci = ((ImageView)paramView.findViewById(2131822661));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ad
 * JD-Core Version:    0.6.2
 */
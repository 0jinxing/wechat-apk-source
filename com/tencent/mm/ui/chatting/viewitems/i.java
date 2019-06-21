package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.d.b;
import com.tencent.mm.g.a.ii;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

public final class i
{
  public static final class b extends c
  {
    private com.tencent.mm.ui.chatting.d.a yJI;

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(32919);
      Object localObject;
      if (paramView != null)
      {
        localObject = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localObject = new v(paramLayoutInflater, 2130969061);
        ((View)localObject).setTag(new i.a().A((View)localObject, true));
      }
      AppMethodBeat.o(32919);
      return localObject;
    }

    public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(32920);
      this.yJI = parama1;
      i.a locala = (i.a)parama;
      paramString = parambi.field_content;
      if (paramString != null);
      for (paramString = j.b.X(paramString, parambi.field_reserved); ; paramString = null)
      {
        if ((locala != null) && (paramString != null))
          locala.a(parama1.yTx.getContext(), paramString, parambi.field_imgPath, this.kuU);
        parambi = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
        if (parama.jPL != null)
        {
          parama.jPL.setTag(parambi);
          parama.jPL.setOnClickListener(d(parama1));
          if (this.kuU)
          {
            parama.jPL.setOnLongClickListener(c(parama1));
            parama.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
          }
        }
        AppMethodBeat.o(32920);
        return;
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(32921);
      int i = ((ay)paramView.getTag()).position;
      boolean bool;
      if (parambi.field_content == null)
      {
        AppMethodBeat.o(32921);
        bool = true;
      }
      while (true)
      {
        return bool;
        paramView = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
        if (paramView == null)
        {
          AppMethodBeat.o(32921);
          bool = true;
        }
        else
        {
          switch (paramView.type)
          {
          default:
          case 16:
            do
            {
              AppMethodBeat.o(32921);
              bool = true;
              break;
            }
            while ((paramView.fhD != 5) && (paramView.fhD != 6) && (paramView.fhD != 2));
            if (paramView.fhD != 2)
              paramContextMenu.clear();
            paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
            AppMethodBeat.o(32921);
            bool = false;
            break;
          case 34:
            paramContextMenu.clear();
            paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
            AppMethodBeat.o(32921);
            bool = false;
          }
        }
      }
    }

    public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(32922);
      switch (paramMenuItem.getItemId())
      {
      default:
      case 111:
      case 103:
      }
      while (true)
      {
        AppMethodBeat.o(32922);
        while (true)
        {
          return false;
          Object localObject = bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend);
          paramMenuItem = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
          paramMenuItem.putExtra("Retr_Msg_content", (String)localObject);
          localObject = j.b.me((String)localObject);
          if ((localObject != null) && (16 == ((j.b)localObject).type))
            paramMenuItem.putExtra("Retr_Msg_Type", 14);
          while (true)
          {
            paramMenuItem.putExtra("Retr_Msg_Id", parambi.field_msgId);
            parama.startActivity(paramMenuItem);
            AppMethodBeat.o(32922);
            break;
            paramMenuItem.putExtra("Retr_Msg_Type", 2);
          }
          paramMenuItem = parambi.field_content;
          if (paramMenuItem != null)
            break;
          AppMethodBeat.o(32922);
        }
        paramMenuItem = j.b.me(paramMenuItem);
        if (paramMenuItem != null)
          switch (paramMenuItem.type)
          {
          default:
            break;
          case 16:
            parama = new ii();
            parama.cDs.cDt = paramMenuItem.cDt;
            parama.cDs.cuQ = parambi.field_msgId;
            parama.cDs.cDu = parambi.field_talker;
            com.tencent.mm.sdk.b.a.xxA.m(parama);
          }
      }
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if ((!paramBoolean) && ((paramInt == 452984881) || (paramInt == 520093745)));
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(32923);
      paramView = parambi.field_content;
      boolean bool;
      if (paramView == null)
      {
        bool = false;
        AppMethodBeat.o(32923);
      }
      Object localObject;
      while (true)
      {
        return bool;
        localObject = j.b.me(paramView);
        if (localObject == null)
        {
          bool = false;
          AppMethodBeat.o(32923);
        }
        else
        {
          switch (((j.b)localObject).type)
          {
          default:
            bool = false;
            AppMethodBeat.o(32923);
            break;
          case 16:
            if (bo.isNullOrNil(((j.b)localObject).cDt))
            {
              bool = false;
              AppMethodBeat.o(32923);
            }
            else
            {
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_card_app_msg", ((j.b)localObject).cDt);
              paramView.putExtra("key_from_scene", ((j.b)localObject).fhD);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "card", ".ui.CardDetailUI", paramView);
              bool = true;
              AppMethodBeat.o(32923);
            }
            break;
          case 34:
          }
        }
      }
      paramView = com.tencent.mm.plugin.card.b.h.b((j.b)localObject);
      PackageInfo localPackageInfo;
      label237: int i;
      if (1 < paramView.ver)
      {
        String str = p.B(((j.b)localObject).fgn, "message");
        localPackageInfo = getPackageInfo(parama.yTx.getContext(), ((j.b)localObject).appId);
        if (localPackageInfo == null)
        {
          paramView = null;
          if (localPackageInfo != null)
            break label293;
          i = 0;
          label245: a(parama, str, str, paramView, i, ((j.b)localObject).appId, true, parambi.field_msgId, parambi.field_msgSvrId, parambi);
        }
      }
      while (true)
      {
        bool = true;
        AppMethodBeat.o(32923);
        break;
        paramView = localPackageInfo.versionName;
        break label237;
        label293: i = localPackageInfo.versionCode;
        break label245;
        localObject = new Intent();
        ((Intent)localObject).putExtra("key_from_user_name", b(parama, parambi));
        ((Intent)localObject).putExtra("key_biz_uin", paramView.fhF);
        ((Intent)localObject).putExtra("key_order_id", paramView.fhG);
        if ((parambi.field_talker != null) && (!parambi.field_talker.equals("")) && (t.kH(parambi.field_talker)))
          ((Intent)localObject).putExtra("key_chatroom_name", parambi.field_talker);
        com.tencent.mm.bp.d.b(parama.yTx.getContext(), "card", ".ui.CardGiftAcceptUI", (Intent)localObject);
      }
    }

    public final boolean dHk()
    {
      return false;
    }
  }

  public static final class c extends c
  {
    private com.tencent.mm.ui.chatting.d.a yJI;

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(32924);
      Object localObject;
      if (paramView != null)
      {
        localObject = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localObject = new v(paramLayoutInflater, 2130969098);
        ((View)localObject).setTag(new i.a().A((View)localObject, false));
      }
      AppMethodBeat.o(32924);
      return localObject;
    }

    public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(32925);
      this.yJI = parama1;
      i.a locala = (i.a)parama;
      paramString = parambi.field_content;
      if (paramString != null);
      for (paramString = j.b.X(paramString, parambi.field_reserved); ; paramString = null)
      {
        if ((locala != null) && (paramString != null))
          locala.a(parama1.yTx.getContext(), paramString, parambi.field_imgPath, this.kuU);
        parambi = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
        parama.jPL.setTag(parambi);
        parama.jPL.setOnClickListener(d(parama1));
        if (this.kuU)
        {
          parama.jPL.setOnLongClickListener(c(parama1));
          parama.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
        }
        AppMethodBeat.o(32925);
        return;
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(32926);
      int i = ((ay)paramView.getTag()).position;
      boolean bool;
      if (parambi.field_content == null)
      {
        AppMethodBeat.o(32926);
        bool = true;
      }
      while (true)
      {
        return bool;
        paramView = j.b.me(bf.b(this.yJI.dFx(), parambi.field_content, parambi.field_isSend));
        if (paramView == null)
        {
          AppMethodBeat.o(32926);
          bool = true;
        }
        else
        {
          switch (paramView.type)
          {
          default:
          case 16:
            do
            {
              AppMethodBeat.o(32926);
              bool = true;
              break;
            }
            while ((paramView.fhD != 5) && (paramView.fhD != 6) && (paramView.fhD != 2));
            if (paramView.fhD != 2)
              paramContextMenu.clear();
            paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
            AppMethodBeat.o(32926);
            bool = false;
            break;
          case 34:
            paramContextMenu.clear();
            paramContextMenu.add(i, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
            AppMethodBeat.o(32926);
            bool = false;
          }
        }
      }
    }

    public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(32927);
      switch (paramMenuItem.getItemId())
      {
      default:
      case 111:
      case 103:
      }
      while (true)
      {
        AppMethodBeat.o(32927);
        while (true)
        {
          return false;
          Object localObject = bf.b(parama.dFx(), parambi.field_content, parambi.field_isSend);
          paramMenuItem = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
          paramMenuItem.putExtra("Retr_Msg_content", (String)localObject);
          localObject = j.b.me((String)localObject);
          if ((localObject != null) && (16 == ((j.b)localObject).type))
            paramMenuItem.putExtra("Retr_Msg_Type", 14);
          while (true)
          {
            paramMenuItem.putExtra("Retr_Msg_Id", parambi.field_msgId);
            parama.startActivity(paramMenuItem);
            AppMethodBeat.o(32927);
            break;
            paramMenuItem.putExtra("Retr_Msg_Type", 2);
          }
          paramMenuItem = parambi.field_content;
          if (paramMenuItem != null)
            break;
          AppMethodBeat.o(32927);
        }
        parama = j.b.me(paramMenuItem);
        if (parama != null)
          switch (parama.type)
          {
          default:
            break;
          case 16:
            paramMenuItem = new ii();
            paramMenuItem.cDs.cDt = parama.cDt;
            paramMenuItem.cDs.cuQ = parambi.field_msgId;
            paramMenuItem.cDs.cDu = parambi.field_talker;
            com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
          }
      }
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if ((paramBoolean) && ((paramInt == 452984881) || (paramInt == 520093745)));
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(32928);
      paramView = parambi.field_content;
      boolean bool;
      if (paramView == null)
      {
        bool = false;
        AppMethodBeat.o(32928);
      }
      Object localObject;
      while (true)
      {
        return bool;
        localObject = j.b.me(paramView);
        if (localObject == null)
        {
          bool = false;
          AppMethodBeat.o(32928);
        }
        else
        {
          switch (((j.b)localObject).type)
          {
          default:
            bool = false;
            AppMethodBeat.o(32928);
            break;
          case 16:
            if (bo.isNullOrNil(((j.b)localObject).cDt))
            {
              bool = false;
              AppMethodBeat.o(32928);
            }
            else
            {
              paramView = new Intent();
              paramView.setFlags(65536);
              paramView.putExtra("key_card_app_msg", ((j.b)localObject).cDt);
              paramView.putExtra("key_from_scene", ((j.b)localObject).fhD);
              com.tencent.mm.bp.d.b(parama.yTx.getContext(), "card", ".ui.CardDetailUI", paramView);
              bool = true;
              AppMethodBeat.o(32928);
            }
            break;
          case 34:
          }
        }
      }
      paramView = com.tencent.mm.plugin.card.b.h.b((j.b)localObject);
      PackageInfo localPackageInfo;
      label237: int i;
      if (1 < paramView.ver)
      {
        String str = p.B(((j.b)localObject).fgn, "message");
        localPackageInfo = getPackageInfo(parama.yTx.getContext(), ((j.b)localObject).appId);
        if (localPackageInfo == null)
        {
          paramView = null;
          if (localPackageInfo != null)
            break label293;
          i = 0;
          label245: a(parama, str, str, paramView, i, ((j.b)localObject).appId, true, parambi.field_msgId, parambi.field_msgSvrId, parambi);
        }
      }
      while (true)
      {
        bool = true;
        AppMethodBeat.o(32928);
        break;
        paramView = localPackageInfo.versionName;
        break label237;
        label293: i = localPackageInfo.versionCode;
        break label245;
        localObject = new Intent();
        ((Intent)localObject).putExtra("key_from_user_name", b(parama, parambi));
        ((Intent)localObject).putExtra("key_biz_uin", paramView.fhF);
        ((Intent)localObject).putExtra("key_order_id", paramView.fhG);
        if ((parambi.field_talker != null) && (!parambi.field_talker.equals("")) && (t.kH(parambi.field_talker)))
          ((Intent)localObject).putExtra("key_chatroom_name", parambi.field_talker);
        com.tencent.mm.bp.d.b(parama.yTx.getContext(), "card", ".ui.CardGiftAcceptUI", (Intent)localObject);
      }
    }

    public final boolean dHk()
    {
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.i
 * JD-Core Version:    0.6.2
 */
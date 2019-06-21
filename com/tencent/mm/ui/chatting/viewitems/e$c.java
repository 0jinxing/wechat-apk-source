package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.va;
import com.tencent.mm.g.a.va.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.f;

public final class e$c extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32870);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969086);
      ((View)localObject).setTag(new e.a().eS((View)localObject));
    }
    AppMethodBeat.o(32870);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32871);
    this.yJI = parama1;
    e.a locala = (e.a)parama;
    if (locala.zdk == parambi.field_msgId)
    {
      locala.zdl = true;
      locala.zdk = parambi.field_msgId;
      paramString = parambi.field_content;
      if (paramString == null)
        break label1320;
    }
    label272: label400: label416: label1314: label1320: for (j.b localb = j.b.X(paramString, parambi.field_reserved); ; localb = null)
    {
      com.tencent.mm.af.c localc;
      va localva;
      label191: Object localObject;
      label305: label378: int i;
      int j;
      if (localb != null)
      {
        localc = (com.tencent.mm.af.c)localb.X(com.tencent.mm.af.c.class);
        boolean bool1 = "1001".equals(localb.fhY);
        localva = new va();
        if ((!bo.isNullOrNil(localb.fhZ)) && (!bool1))
        {
          localva.cRQ.cRS = localb.fhZ;
          com.tencent.mm.sdk.b.a.xxA.m(localva);
        }
        e.a.an(locala.jPL, locala.zcJ);
        if (!"1001".equals(localb.fhY))
          break label859;
        paramString = locala.jPL;
        if (parambi.field_isSend != 1)
          break label853;
        bool2 = true;
        paramString.setBackgroundResource(f.c(localb, bool2));
        locala.zde.setTypeface(Typeface.defaultFromStyle(1));
        com.tencent.mm.bz.a.fromDPToPix(parama1.yTx.getContext(), 13);
        parama1.yTx.getContext().getResources().getDimensionPixelSize(2131427796);
        locala.jPL.setPadding(0, 0, 0, 0);
        if (parambi.field_isSend != 1)
          break label970;
        paramString = localb.fhT;
        if (!bo.isNullOrNil(paramString))
          break label980;
        paramString = localb.description;
        locala.zde.setSingleLine(false);
        locala.zde.setMaxLines(3);
        locala.zde.setText(j.b(parama1.yTx.getContext(), paramString, locala.zdj));
        locala.zde.setTextSize(0, locala.zdj);
        if (!bool1)
          break label998;
        localObject = locala.zdf;
        paramString = parama1.yTx.getContext();
        if (parambi.field_isSend != 1)
          break label992;
        bool2 = true;
        paramString = j.b(paramString, f.b(localb, bool2), locala.zdf.getTextSize());
        ((TextView)localObject).setText(paramString);
        locala.zdf.setVisibility(0);
        localObject = localb.fhW;
        paramString = (String)localObject;
        if (bo.isNullOrNil((String)localObject))
          paramString = localb.title;
        locala.zdg.setText(paramString);
        i = 0;
        if (!bo.isNullOrNil(localc.ffN))
        {
          o.ahp().a("", locala.zdd);
          j = parama1.yTx.getMMResources().getIdentifier(localc.ffN, "drawable", ah.getPackageName());
          i = j;
          if (j <= 0)
            i = parama1.yTx.getMMResources().getIdentifier(localc.ffN, "raw", ah.getPackageName());
        }
        ab.v("MicroMsg.ChattingItemAppMsgC2CTo", "c2c localResId: %s", new Object[] { Integer.valueOf(i) });
        if (i > 0)
        {
          ab.v("MicroMsg.ChattingItemAppMsgC2CTo", "set c2cIcon from localRes");
          locala.zdd.setImageResource(i);
        }
        if (!"1001".equals(localb.fhY))
          break label1147;
        if (parambi.field_isSend != 1)
          break label1141;
        bool2 = true;
        label605: j = f.a(localb, bool2);
        if (j <= 0)
          break label1199;
        ab.i("MicroMsg.ChattingItemAppMsgC2CTo", "set c2cIcon from iconRes");
        locala.zdd.setImageResource(j);
        label638: i = -1;
        if (!bo.isNullOrNil(localc.ffO))
          i = parama1.yTx.getMMResources().getIdentifier(localc.ffO, "drawable", ah.getPackageName());
        ab.i("MicroMsg.ChattingItemAppMsgC2CTo", "backgroundResId: %s", new Object[] { Integer.valueOf(i) });
        if (i > 0)
          locala.jPL.setBackgroundResource(i);
        i = localva.cRR.cRU;
        j = localva.cRR.cRV;
        if (parambi.field_isSend != 1)
          break label1314;
      }
      for (boolean bool2 = true; ; bool2 = false)
      {
        e.a(locala, localc, false, f.x(i, j, bool2), parama1.getTalkerUserName());
        parama.jPL.setOnClickListener(d(parama1));
        parama.jPL.setOnLongClickListener(c(parama1));
        parama.jPL.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
        parama1 = new ay(parambi, this.yJI.dFx(), paramInt, null, '\000');
        parama.jPL.setTag(parama1);
        AppMethodBeat.o(32871);
        return;
        locala.zdl = false;
        break;
        label853: bool2 = false;
        break label191;
        label859: paramString = locala.jPL;
        j = localva.cRR.cRU;
        i = localva.cRR.cRV;
        if (parambi.field_isSend == 1)
        {
          bool2 = true;
          paramString.setBackgroundResource(f.v(j, i, bool2));
          locala.zde.setTypeface(Typeface.defaultFromStyle(1));
          if (locala.zdj <= locala.maxSize)
            break label960;
        }
        label960: for (i = locala.maxSize; ; i = locala.zdj)
        {
          locala.zdj = i;
          break;
          bool2 = false;
          break label898;
        }
        label970: paramString = localb.fhS;
        break label272;
        label980: locala.zde.setSingleLine(true);
        break label305;
        label992: bool2 = false;
        break label378;
        label998: if (!bo.isNullOrNil(localb.fhZ))
        {
          j = localva.cRR.cRT;
          i = localva.cRR.cRU;
          k = localva.cRR.cRV;
          if (parambi.field_isSend == 1);
          for (bool2 = true; ; bool2 = false)
          {
            paramString = f.a(j, i, k, bool2, parama1.dFx());
            if (bo.isNullOrNil(paramString))
              break label1092;
            localObject = locala.zdf;
            break;
          }
          locala.zdf.setVisibility(8);
          break label416;
        }
        label1092: localObject = locala.zdf;
        if (parambi.field_isSend == 1)
        {
          paramString = localb.fhU;
          break label400;
        }
        paramString = localb.fhV;
        break label400;
        label1141: bool2 = false;
        break label605;
        label1147: j = localva.cRR.cRU;
        int k = localva.cRR.cRV;
        if (parambi.field_isSend == 1);
        for (bool2 = true; ; bool2 = false)
        {
          j = f.w(j, k, bool2);
          break;
        }
        label1199: if (i > 0)
          break label638;
        ab.i("MicroMsg.ChattingItemAppMsgC2CTo", "set c2cIcon from iconUrl");
        localObject = localb.fhR;
        paramString = (String)localObject;
        if (bo.isNullOrNil((String)localObject))
          paramString = localb.thumburl;
        locala.zdd.setImageBitmap(null);
        if (bo.isNullOrNil(paramString))
          break label638;
        localObject = new com.tencent.mm.at.a.a.c.a();
        aw.ZK();
        ((com.tencent.mm.at.a.a.c.a)localObject).ePK = com.tencent.mm.model.c.XX();
        ((com.tencent.mm.at.a.a.c.a)localObject).ePH = true;
        ((com.tencent.mm.at.a.a.c.a)localObject).ePZ = true;
        localObject = ((com.tencent.mm.at.a.a.c.a)localObject).ahG();
        o.ahp().a(paramString, locala.zdd, (com.tencent.mm.at.a.a.c)localObject);
        break label638;
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(32872);
    paramContextMenu.add(((ay)paramView.getTag()).position, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(32872);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32873);
    boolean bool;
    switch (paramMenuItem.getItemId())
    {
    default:
      bool = false;
      AppMethodBeat.o(32873);
    case 103:
    }
    while (true)
    {
      return bool;
      String str1 = parambi.field_content;
      paramMenuItem = null;
      if (str1 != null)
        paramMenuItem = j.b.X(str1, parambi.field_reserved);
      if (paramMenuItem != null)
      {
        String str2 = parambi.field_talker;
        String str3 = paramMenuItem.fhS;
        String str4 = paramMenuItem.fhT;
        String str5 = paramMenuItem.fhU;
        str1 = paramMenuItem.fhV;
        String str6 = paramMenuItem.fhQ;
        parambi = paramMenuItem.fhX;
        paramMenuItem = paramMenuItem.fhY;
        com.tencent.mm.ui.base.h.d(parama.yTx.getContext(), parama.yTx.getMMResources().getString(2131298216), parama.yTx.getMMResources().getString(2131297031), parama.yTx.getMMResources().getString(2131298217), parama.yTx.getMMResources().getString(2131296868), new e.c.1(this, str2, str3, str4, str5, str1, str6, parambi, paramMenuItem, parama), new e.c.2(this));
      }
      bool = true;
      AppMethodBeat.o(32873);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramInt == 436207665));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(32874);
    paramView = parambi.field_content;
    if (paramView != null);
    for (paramView = j.b.X(paramView, parambi.field_reserved); ; paramView = null)
    {
      if (paramView != null)
      {
        if (!bo.isNullOrNil(paramView.fhQ))
          break label179;
        parambi = paramView.url;
        ab.i("MicroMsg.ChattingItemAppMsgC2CTo", "url==null: %s, billNo==null: %s", new Object[] { Boolean.valueOf(bo.isNullOrNil(parambi)), Boolean.valueOf(bo.isNullOrNil(paramView.fih)) });
        if (bo.isNullOrNil(paramView.fhZ))
          break label386;
        if (!paramView.fhZ.startsWith("weixin://openNativeUrl/weixinHB/startreceivebizhbrequest"))
          break label187;
        parambi = new Intent();
        parambi.putExtra("key_way", 1);
        parambi.putExtra("key_native_url", paramView.fhZ);
        parambi.putExtra("key_username", parama.getTalkerUserName());
        parambi.putExtra("key_static_from_scene", 100002);
        com.tencent.mm.bp.d.b(parama.yTx.getContext(), "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", parambi);
      }
      while (true)
      {
        AppMethodBeat.o(32874);
        return true;
        label179: parambi = paramView.fhQ;
        break;
        label187: if (paramView.fhZ.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao"))
        {
          parambi = new Intent();
          paramView.X(com.tencent.mm.af.d.class);
          if (parama.dFx());
          for (int i = 0; ; i = 1)
          {
            parambi.putExtra("key_way", i);
            parambi.putExtra("key_native_url", paramView.fhZ);
            parambi.putExtra("key_username", parama.getTalkerUserName());
            parambi.putExtra("key_cropname", ((com.tencent.mm.af.c)paramView.X(com.tencent.mm.af.c.class)).ffQ);
            com.tencent.mm.bp.d.b(parama.yTx.getContext(), "luckymoney", ".ui.LuckyMoneyNotHookReceiveUI", parambi);
            break;
          }
        }
        ab.i("MicroMsg.ChattingItemAppMsgC2CTo", "native url not match:" + paramView.fhZ + ", go webview:" + parambi);
        if (!bo.isNullOrNil(parambi))
        {
          paramView = new Intent();
          paramView.putExtra("rawUrl", parambi);
          com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramView);
          continue;
          label386: if (!bo.isNullOrNil(paramView.fih))
          {
            ab.i("MicroMsg.ChattingItemAppMsgC2CTo", "tofuliu billNo: %s, c2cNewAAType: %s, fromUser: %s", new Object[] { paramView.fih, Integer.valueOf(paramView.fii), paramView.cEV });
            parambi = new Intent();
            parambi.putExtra("bill_no", paramView.fih);
            parambi.putExtra("launcher_user_name", paramView.cEV);
            parambi.putExtra("enter_scene", 1);
            parambi.putExtra("chatroom", parama.getTalkerUserName());
            com.tencent.mm.bp.d.b(parama.yTx.getContext(), "aa", ".ui.PaylistAAUI", parambi);
            com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
          }
          else if ((!bo.isNullOrNil(parambi)) && (!bo.isNullOrNil(parambi)))
          {
            paramView = new Intent();
            paramView.putExtra("rawUrl", parambi);
            com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramView);
          }
        }
      }
    }
  }

  public final boolean dHk()
  {
    return true;
  }

  final boolean dHl()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.e.c
 * JD-Core Version:    0.6.2
 */
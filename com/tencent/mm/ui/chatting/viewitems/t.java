package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.l;
import com.tencent.mm.af.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.u;
import com.tencent.mm.model.v.b;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.brandservice.a.b;
import com.tencent.mm.pluginsdk.ui.applet.e;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.applet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.am;
import com.tencent.mm.ui.chatting.ao;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.r;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.widget.MMNeat7extView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class t
{
  static class b
  {
    TextView gsf;
    View jOR;
    ImageView jPd;

    public void fc(View paramView)
    {
    }
  }

  public static final class j extends c
  {
    private static int jNf;
    private static int jNg = 0;
    private static int jNh;
    private static int jNi = 0;
    private static int jNj;
    private static int pFp;
    private long jPG = 0L;
    private boolean jPH = false;
    private com.tencent.mm.ui.chatting.d.a yJI;
    private boolean zeB = false;
    private int zeC = 0;

    static
    {
      jNh = 0;
    }

    private static void M(View paramView, int paramInt)
    {
      AppMethodBeat.i(33091);
      ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
      localLayoutParams.width = paramInt;
      localLayoutParams.height = paramInt;
      paramView.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(33091);
    }

    private static void O(View paramView, int paramInt)
    {
      AppMethodBeat.i(33092);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.rightMargin = paramInt;
      paramView.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(33092);
    }

    private static String a(bi parambi, Context paramContext, int paramInt)
    {
      Object localObject = null;
      AppMethodBeat.i(33102);
      if (paramContext == null)
      {
        ab.w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: context is null");
        AppMethodBeat.o(33102);
        parambi = localObject;
      }
      while (true)
      {
        return parambi;
        if (parambi == null)
        {
          ab.w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: msg is null");
          AppMethodBeat.o(33102);
          parambi = localObject;
        }
        else
        {
          parambi = l.a(paramContext, paramInt, parambi.field_content, parambi.field_talker, parambi.field_msgId);
          AppMethodBeat.o(33102);
        }
      }
    }

    private static void a(View paramView, t.b paramb, boolean paramBoolean)
    {
      AppMethodBeat.i(33095);
      if (paramBoolean)
      {
        if (paramb.jOR == null)
          paramb.fc(paramView);
        if (paramb.jOR == null)
          break label58;
        paramb.jOR.setVisibility(0);
        AppMethodBeat.o(33095);
      }
      while (true)
      {
        return;
        if (paramb.jOR != null)
          paramb.jOR.setVisibility(8);
        label58: AppMethodBeat.o(33095);
      }
    }

    private void a(ImageView paramImageView, bi parambi, int paramInt)
    {
      AppMethodBeat.i(33094);
      d.f localf = new d.f();
      localf.cvx = parambi.field_msgId;
      localf.zcZ = paramInt;
      localf.cHz = parambi.field_content;
      paramImageView.setTag(localf);
      paramImageView.setOnClickListener(((h)this.yJI.aF(h.class)).dDa());
      AppMethodBeat.o(33094);
    }

    private void a(p paramp, View paramView)
    {
      AppMethodBeat.i(33103);
      r.a(paramp, paramView, this.yJI.getTalkerUserName());
      AppMethodBeat.o(33103);
    }

    private void a(p paramp, View paramView, long paramLong1, long paramLong2, int paramInt)
    {
      AppMethodBeat.i(33104);
      if ((paramp.type == 5) && (((b)g.K(b.class)).aVP()))
        paramView.setOnClickListener(new t.j.7(this, paramInt, paramLong1, paramLong2));
      AppMethodBeat.o(33104);
    }

    private void a(p paramp, bi parambi, int paramInt, com.tencent.mm.af.o paramo, View paramView)
    {
      AppMethodBeat.i(33089);
      String str = ((com.tencent.mm.ui.chatting.c.b.d)this.yJI.aF(com.tencent.mm.ui.chatting.c.b.d.class)).ari(paramp.url);
      if (!TextUtils.isEmpty(str))
      {
        ab.d("MicroMsg.ChattingItemBizFrom", "productId:%s", new Object[] { str });
        paramo = new ay(parambi, false, paramInt, paramp.url, false, this.yJI.dDw(), paramo.cMg, paramo.cMh, paramp.title, str, null, false, false);
        paramView.setOnClickListener(i(this.yJI));
      }
      while (true)
      {
        paramo.unn = parambi.field_msgSvrId;
        paramo.uno = 0;
        paramo.ziA = paramp.type;
        paramView.setTag(paramo);
        if (l.mg(paramp.fjC))
          a(paramp, paramView);
        a(paramp, paramView, parambi.field_msgId, parambi.field_msgSvrId, 0);
        paramView.setOnLongClickListener(c(this.yJI));
        paramView.setOnTouchListener(((h)this.yJI.aF(h.class)).dCZ());
        AppMethodBeat.o(33089);
        return;
        paramo = new ay(parambi, false, paramInt, paramp.url, false, this.yJI.dDw(), paramo.cMg, paramo.cMh, paramp.title);
        a(paramo, paramp, parambi);
        paramView.setOnClickListener(h(this.yJI));
      }
    }

    private void a(ay paramay, p paramp, bi parambi)
    {
      AppMethodBeat.i(33098);
      Bundle localBundle = new Bundle();
      int i;
      switch (u.ad(b(this.yJI, parambi), this.yJI.getTalkerUserName()))
      {
      case 3:
      case 4:
      case 5:
      default:
        i = 0;
      case 2:
      case 1:
      case 6:
      case 7:
      }
      while (true)
      {
        localBundle.putString("share_report_pre_msg_url", paramp.url);
        localBundle.putString("share_report_pre_msg_title", paramp.title);
        localBundle.putString("share_report_pre_msg_desc", paramp.fjz);
        localBundle.putString("share_report_pre_msg_icon_url", l.a(paramp));
        localBundle.putString("share_report_pre_msg_appid", "");
        localBundle.putInt("share_report_from_scene", i);
        if (i == 5)
          localBundle.putString("share_report_biz_username", this.yJI.getTalkerUserName());
        paramay.ziy = localBundle;
        AppMethodBeat.o(33098);
        return;
        i = 2;
        continue;
        i = 3;
        continue;
        i = 5;
      }
    }

    private static void a(t.c paramc, int paramInt1, int paramInt2)
    {
      boolean bool1 = true;
      AppMethodBeat.i(33096);
      boolean bool2;
      if (paramInt1 == 5)
      {
        bool2 = true;
        a(paramc.jPr, paramc.zew, bool2);
        if (!bool2)
          break label235;
      }
      label46: label76: label106: label235: for (int i = 1; ; i = 0)
      {
        if (paramInt1 == 8)
        {
          bool2 = true;
          a(paramc.jPr, paramc.zex, bool2);
          if (bool2)
            i = 1;
          if (paramInt1 != 7)
            break label205;
          bool2 = true;
          a(paramc.jPr, paramc.zey, bool2);
          if (bool2)
            i = 1;
          if (paramInt1 != 6)
            break label211;
          bool2 = true;
          a(paramc.jPr, paramc.zez, bool2);
          if (bool2)
            i = 1;
          if (paramInt1 != 10)
            break label217;
          bool2 = true;
          a(paramc.jPr, paramc.zeA, bool2);
          if (!bool2)
            break label229;
        }
        for (paramInt1 = 1; ; paramInt1 = i)
        {
          LinearLayout localLinearLayout = paramc.jPr;
          paramc = paramc.zev;
          if ((paramInt1 == 0) && (paramInt2 > 0));
          for (bool2 = bool1; ; bool2 = false)
          {
            a(localLinearLayout, paramc, bool2);
            AppMethodBeat.o(33096);
            return;
            bool2 = false;
            break;
            bool2 = false;
            break label46;
            bool2 = false;
            break label76;
            bool2 = false;
            break label106;
            bool2 = false;
            break label136;
          }
        }
      }
    }

    private void a(t.c paramc, t.a parama, p paramp, bi parambi, int paramInt, boolean paramBoolean)
    {
      AppMethodBeat.i(33093);
      if (paramp.type == 5)
      {
        parama.jOY.setVisibility(0);
        parama.jOY.setImageResource(2130837925);
        parama.jOY.setOnClickListener(new t.j.6(this, parama));
      }
      while (true)
      {
        paramInt = com.tencent.mm.bz.a.fromDPToPix(this.yJI.yTx.getContext(), 26);
        if (paramp.type == 7)
          paramInt = com.tencent.mm.bz.a.fromDPToPix(this.yJI.yTx.getContext(), 32);
        M(parama.jOY, paramInt);
        AppMethodBeat.o(33093);
        return;
        if (paramp.type == 6)
        {
          parama.jOY.setVisibility(0);
          if (paramBoolean)
            if ((parambi.field_msgId + "_" + paramInt).equals(paramc.zbz))
              parama.jOY.setImageResource(2130838268);
          while (true)
          {
            a(parama.jOY, parambi, paramInt);
            break;
            parama.jOY.setImageResource(2130838269);
            continue;
            if ((parambi.field_msgId + "_" + paramInt).equals(paramc.zbz))
              parama.jOY.setImageResource(2131231092);
            else
              parama.jOY.setImageResource(2131231095);
          }
        }
        if (paramp.type == 7)
        {
          parama.jOY.setVisibility(0);
          Drawable localDrawable = parama.jOY.getDrawable();
          if (((localDrawable instanceof AnimationDrawable)) && (((AnimationDrawable)localDrawable).isRunning()))
            ((AnimationDrawable)localDrawable).stop();
          if ((parambi.field_msgId + "_" + paramInt).equals(paramc.zbz))
          {
            parama.jOY.setImageResource(2130838272);
            if ((parama.jOY.getDrawable() instanceof AnimationDrawable))
              ((AnimationDrawable)parama.jOY.getDrawable()).start();
          }
          while (true)
          {
            a(parama.jOY, parambi, paramInt);
            break;
            parama.jOY.setImageResource(2130838271);
          }
        }
        parama.jOY.setVisibility(8);
      }
    }

    private static void a(String paramString1, ImageView paramImageView, int paramInt1, int paramInt2, int paramInt3, String paramString2, e.a parama)
    {
      AppMethodBeat.i(33099);
      if (com.tencent.mm.at.q.ahs())
        paramString1 = com.tencent.mm.at.q.sy(paramString1);
      while (true)
      {
        com.tencent.mm.at.a.a locala = com.tencent.mm.at.o.ahp();
        com.tencent.mm.at.a.a.c.a locala1 = new com.tencent.mm.at.a.a.c.a();
        locala1.ePV = 2131689876;
        locala1.ePH = true;
        locala1 = locala1.ct(paramInt2, paramInt3);
        locala1.fGV = new f();
        locala1.ePJ = com.tencent.mm.pluginsdk.model.q.v(paramString1, paramInt1, paramString2);
        locala.a(paramString1, paramImageView, locala1.ahG(), null, new e(0, 0, 0, parama));
        AppMethodBeat.o(33099);
        return;
      }
    }

    private void a(String paramString, ImageView paramImageView, int paramInt1, boolean paramBoolean, int paramInt2, e.a parama)
    {
      AppMethodBeat.i(33100);
      if (com.tencent.mm.at.q.ahs())
        paramString = com.tencent.mm.at.q.sy(paramString);
      while (true)
      {
        int i;
        int j;
        if (paramBoolean)
        {
          i = 2130837909;
          if (!paramBoolean)
            break label207;
          j = 2130837915;
          label37: if (!((h)this.yJI.aF(h.class)).isInEditMode())
            break label215;
        }
        label207: label215: for (int k = 72; ; k = 32)
        {
          int m = com.tencent.mm.bz.a.gd(paramImageView.getContext());
          float f = com.tencent.mm.bz.a.getDensity(paramImageView.getContext());
          k = m - (int)(k * f);
          com.tencent.mm.at.a.a locala = com.tencent.mm.at.o.ahp();
          com.tencent.mm.at.a.a.c.a locala1 = new com.tencent.mm.at.a.a.c.a();
          locala1.ePV = j;
          locala1.ePH = true;
          locala1.ePX = String.valueOf(i);
          locala1 = locala1.ct(k, paramInt2);
          locala1.fGV = new f();
          locala1.ePJ = com.tencent.mm.pluginsdk.model.q.v(paramString, paramInt1, "@T");
          locala.a(paramString, paramImageView, locala1.ahG(), null, new e(i, k, paramInt2, parama));
          AppMethodBeat.o(33100);
          return;
          i = 2130837907;
          break;
          j = 2130837913;
          break label37;
        }
      }
    }

    private static void ds(View paramView)
    {
      AppMethodBeat.i(33090);
      ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
      localLayoutParams.height = pFp;
      paramView.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(33090);
    }

    private static void hW(Context paramContext)
    {
      AppMethodBeat.i(33087);
      int j;
      if (jNi == 0)
      {
        jNi = paramContext.getResources().getDimensionPixelSize(2131427858);
        jNh = paramContext.getResources().getDimensionPixelSize(2131427796);
        jNg = paramContext.getResources().getDimensionPixelSize(2131427776);
        jNf = paramContext.getResources().getDimensionPixelSize(2131428210);
        jNj = paramContext.getResources().getDimensionPixelSize(2131428208);
        int i = com.tencent.mm.bz.a.gd(paramContext);
        j = com.tencent.mm.bz.a.ge(paramContext);
        if (i >= j)
          break label121;
        j = i;
      }
      label121: 
      while (true)
      {
        pFp = (int)((j - (int)(com.tencent.mm.bz.a.getDensity(paramContext) * 32.0F)) / 2.35D);
        AppMethodBeat.o(33087);
        return;
      }
    }

    public final View a(LayoutInflater paramLayoutInflater, View paramView)
    {
      AppMethodBeat.i(33086);
      Object localObject;
      if (paramView != null)
      {
        localObject = paramView;
        if (paramView.getTag() != null);
      }
      else
      {
        localObject = new v(paramLayoutInflater, 2130969033);
        paramView = new t.c();
        paramView.enf = ((TextView)((View)localObject).findViewById(2131820587));
        paramView.zbx = ((View)localObject).findViewById(2131820583);
        paramView.jPr = ((LinearLayout)((View)localObject).findViewById(2131822453));
        paramView.moo = ((CheckBox)((View)localObject).findViewById(2131820580));
        paramView.iVh = ((View)localObject).findViewById(2131820586);
        paramView.zbU = ((TextView)((View)localObject).findViewById(2131822454));
        ((View)localObject).setTag(paramView);
      }
      hW(paramLayoutInflater.getContext());
      AppMethodBeat.o(33086);
      return localObject;
    }

    public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
    {
      AppMethodBeat.i(33088);
      this.yJI = parama1;
      hW(parama1.yTx.getContext());
      final t.c localc = (t.c)parama;
      paramString = localc.jPu.iterator();
      if (paramString.hasNext())
      {
        parama = (t.a)paramString.next();
        if (localc.jPu.indexOf(parama) != localc.jPu.size() - 1)
          ao.aj(parama.jOR, 1);
        while (true)
        {
          localc.jPr.removeView(parama.jOR);
          break;
          ao.aj(parama.jOR, 2);
        }
      }
      localc.jPu.clear();
      com.tencent.mm.af.o localo = ((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).b(parambi.field_msgId, parambi.field_content);
      parama = localo.dJv;
      LinkedList localLinkedList;
      int i;
      if ((parama == null) || (parama.length() == 0))
      {
        localc.zbU.setVisibility(8);
        localLinkedList = localo.fjr;
        i = localLinkedList.size();
        if (i != 0)
          break label254;
        localc.jPr.setVisibility(8);
        a(localc, -1, 0);
        AppMethodBeat.o(33088);
      }
      while (true)
      {
        return;
        localc.zbU.setVisibility(0);
        b(parama1, localc.zbU, ay.arL(parama));
        break;
        label254: localc.jPr.setVisibility(0);
        a(localc, ((p)localLinkedList.get(0)).type, i);
        Object localObject1 = parama1.yTx.getActivityLayoutInflater();
        for (int j = localc.jPu.size() + 2; j < i; j++)
        {
          paramString = ao.Ot(1);
          parama = paramString;
          if (paramString == null)
            parama = ((LayoutInflater)localObject1).inflate(2130969034, null);
          localc.fd(parama);
        }
        if (i > 1)
        {
          paramString = ao.Ot(2);
          parama = paramString;
          if (paramString == null)
            parama = ((LayoutInflater)localObject1).inflate(2130969035, null);
          localc.fd(parama);
        }
        for (this.zeB = true; ; this.zeB = false)
          for (j = 0; j < localc.jPu.size(); j++)
            ((t.a)localc.jPu.get(j)).jOR.setVisibility(8);
        paramString = (p)localLinkedList.get(0);
        label550: label620: boolean bool;
        label684: label740: label743: t.a locala;
        int k;
        if (paramString.type == 5)
        {
          ds(localc.zew.jPQ);
          ds(localc.zew.jPe);
          if (ah.isNullOrNil(paramString.title))
          {
            localc.zew.jPi.setVisibility(8);
            if (i != 1)
              break label1351;
            localc.zew.jPd.setBackgroundResource(2130837959);
            localc.zew.jPe.setBackgroundResource(2130838305);
            parama = l.kr(paramString.fjB);
            if (TextUtils.isEmpty(parama))
              break label1382;
            localc.zew.timeTv.setVisibility(0);
            localc.zew.timeTv.setText(parama);
            localc.zew.timeTv.setTextColor(this.yJI.yTx.getContext().getResources().getColor(2131690202));
            a(paramString, parambi, paramInt, localo, localc.zew.jOR);
            localc.zew.jPd.setVisibility(8);
            localObject1 = paramString.fjx;
            parama = localc.zew.jOX;
            j = parambi.getType();
            if (i <= 1)
              break label1398;
            bool = true;
            a((String)localObject1, parama, j, bool, pFp, new t.j.3(this, localc));
            if (com.tencent.mm.bz.a.dm(this.yJI.yTx.getContext()) <= 1.375F)
              break label1404;
            localc.zew.jPi.setMaxLines(1);
            j = 1;
            if (j >= i)
              break label3850;
            localObject1 = (p)localLinkedList.get(j);
            locala = (t.a)localc.jPu.get(j - 1);
            k = paramString.type;
            if ((j != 1) || ((k != 5) && (k != 8) && (k != 0)))
              break label3326;
            if ((k != 0) || (!ah.isNullOrNil(((p)localLinkedList.get(0)).fjx)))
              break label3313;
            locala.jOS.setVisibility(0);
            label848: O(locala.jOS, jNg);
            label859: if (j != 1)
              break label3493;
            if (j != i - 1)
              break label3474;
            locala.jOT.setPadding(0, jNg, 0, jNg);
            label890: a(localc, locala, (p)localObject1, parambi, j, false);
            locala.gsf.setText(((p)localObject1).title);
            locala.gsf.setTextColor(parama1.yTx.getMMResources().getColor(2131689761));
            if ((((p)localObject1).fjA != 0) && (((p)localObject1).fjA != 1))
              break label3743;
            locala.jOW.setVisibility(0);
            locala.gsf.setTextColor(parama1.yTx.getMMResources().getColor(2131689761));
            if (((p)localObject1).type != 7)
              break label3540;
            locala.jOX.setVisibility(8);
            label1006: if ((ah.isNullOrNil(((p)localObject1).fjz)) || (((p)localObject1).type != 3))
              break label3777;
            locala.jOV.setText(((p)localObject1).fjz);
            locala.jOV.setVisibility(0);
            label1048: locala.jOR.setVisibility(0);
            parama = ((com.tencent.mm.ui.chatting.c.b.d)parama1.aF(com.tencent.mm.ui.chatting.c.b.d.class)).ari(((p)localObject1).url);
            if (TextUtils.isEmpty(parama))
              break label3790;
            ab.d("MicroMsg.ChattingItemBizFrom", "productId:%s", new Object[] { parama });
            parama = new ay(parambi, false, paramInt, ((p)localObject1).url, this.zeB, parama1.dDw(), localo.cMg, localo.cMh, ((p)localObject1).title, parama, null, false, true);
            locala.jOR.setOnClickListener(i(parama1));
          }
        }
        while (true)
        {
          parama.unn = parambi.field_msgSvrId;
          parama.uno = j;
          parama.ziA = ((p)localObject1).type;
          locala.jOR.setTag(parama);
          if (l.mg(((p)localObject1).fjC))
            a((p)localObject1, locala.jOR);
          a((p)localObject1, locala.jOR, parambi.field_msgId, parambi.field_msgSvrId, j);
          locala.jOR.setOnLongClickListener(c(parama1));
          locala.jOR.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
          j++;
          break label743;
          localc.zew.jPi.ah(paramString.title);
          localc.zew.jPi.getPaint().setFakeBoldText(true);
          localc.zew.jPi.setVisibility(0);
          localc.zew.jPi.setTextColor(this.yJI.yTx.getContext().getResources().getColor(2131690202));
          break;
          label1351: localc.zew.jPd.setBackgroundResource(2130837916);
          localc.zew.jPe.setBackgroundResource(2130838307);
          break label550;
          label1382: localc.zew.timeTv.setVisibility(8);
          break label620;
          label1398: bool = false;
          break label684;
          label1404: localc.zew.jPi.setMaxLines(2);
          break label740;
          if (paramString.type == 8)
          {
            ds(localc.zex.jPQ);
            ds(localc.zex.jPe);
            if (i == 1)
            {
              localc.zex.jPd.setBackgroundResource(2130837940);
              localc.zex.jPe.setBackgroundResource(2130838305);
              localc.zex.pFw.setBackgroundResource(2130837908);
              label1499: localc.zex.jPd.setVisibility(8);
              localc.zex.pFw.setVisibility(8);
              localc.zex.iNr.setBackgroundResource(2131231097);
              localObject1 = paramString.fjx;
              parama = localc.zex.jOX;
              j = parambi.getType();
              if (i <= 1)
                break label1662;
            }
            label1662: for (bool = true; ; bool = false)
            {
              a((String)localObject1, parama, j, bool, pFp, new e.a()
              {
                public final void onFinish()
                {
                  AppMethodBeat.i(33083);
                  localc.zex.jPd.setVisibility(0);
                  localc.zex.pFw.setVisibility(0);
                  localc.zex.iNr.setBackgroundResource(2131231096);
                  AppMethodBeat.o(33083);
                }
              });
              a(paramString, parambi, paramInt, localo, localc.zex.jOR);
              break;
              localc.zex.jPd.setBackgroundResource(2130837917);
              localc.zex.jPe.setBackgroundResource(2130838307);
              localc.zex.pFw.setBackgroundResource(2130837941);
              break label1499;
            }
          }
          if (paramString.type == 7)
          {
            if (ah.isNullOrNil(paramString.title))
            {
              localc.zey.gsf.setVisibility(8);
              label1702: if (i <= 1)
                break label1949;
              localc.zey.jOR.setBackgroundResource(2130838290);
              label1722: parama = l.kr(paramString.fjB);
              if (TextUtils.isEmpty(parama))
                break label1966;
              localc.zey.ngD.setVisibility(0);
              localc.zey.ngD.setText(parama);
              label1762: parama = localc.zey.jOY.getDrawable();
              if (((parama instanceof AnimationDrawable)) && (((AnimationDrawable)parama).isRunning()))
                ((AnimationDrawable)parama).stop();
              if (!(parambi.field_msgId + "_0").equals(localc.zbz))
                break label1981;
              localc.zey.jOY.setImageResource(2130838272);
              if ((localc.zey.jOY.getDrawable() instanceof AnimationDrawable))
                ((AnimationDrawable)localc.zey.jOY.getDrawable()).start();
            }
            while (true)
            {
              a(localc.zey.jOY, parambi, 0);
              a(paramString, parambi, paramInt, localo, localc.zey.jOR);
              break;
              localc.zey.gsf.setVisibility(0);
              localc.zey.gsf.setText(paramString.title);
              break label1702;
              label1949: localc.zey.jOR.setBackgroundResource(2130838291);
              break label1722;
              label1966: localc.zey.ngD.setVisibility(4);
              break label1762;
              label1981: localc.zey.jOY.setImageResource(2130838271);
            }
          }
          if (paramString.type == 6)
          {
            parama = (p)localLinkedList.get(0);
            if (ah.isNullOrNil(parama.title))
            {
              localc.zez.gsf.setVisibility(8);
              label2043: if (i <= 1)
                break label2304;
              localc.zez.jOR.setBackgroundResource(2130838290);
              label2063: if (TextUtils.isEmpty(parama.fjL))
                break label2321;
              localc.zez.jPN.setVisibility(0);
              localc.zez.jPN.setText(parama.fjL);
              label2100: if (parama.fjM != 2)
                break label2337;
              localc.zez.jPO.setImageResource(2131231089);
              label2122: a(localc.zez.jOY, parambi, 0);
              a(parama, parambi, paramInt, localo, localc.zez.jOR);
              if (!(parambi.field_msgId + "_0").equals(localc.zbz))
                break label2354;
              localc.zez.jOY.setImageResource(2131231092);
            }
            while (true)
            {
              localc.zez.jPd.setVisibility(8);
              localObject1 = parama.fjx;
              parama = localc.zez.jOX;
              j = parambi.getType();
              k = jNf;
              a((String)localObject1, parama, j, k, k, "@S", new t.j.4(this, localc, parambi));
              break;
              localc.zez.gsf.setVisibility(0);
              localc.zez.gsf.setText(parama.title);
              break label2043;
              label2304: localc.zez.jOR.setBackgroundResource(2130838291);
              break label2063;
              label2321: localc.zez.jPN.setVisibility(8);
              break label2100;
              label2337: localc.zez.jPO.setImageResource(2131231098);
              break label2122;
              label2354: localc.zez.jOY.setImageResource(2131231095);
            }
          }
          if (paramString.type == 10)
          {
            if (ah.isNullOrNil(paramString.title))
            {
              localc.zeA.jPi.setVisibility(8);
              if (i <= 1)
                break label2634;
              localc.zeA.jOR.setBackgroundResource(2130838290);
              localc.zeA.jPU.setVisibility(8);
            }
            while (true)
            {
              a(paramString, parambi, paramInt, localo, localc.zeA.jOR);
              break;
              localc.zeA.jPi.setVisibility(0);
              localc.zeA.jPi.ah(com.tencent.mm.pluginsdk.ui.e.j.a(this.yJI.yTx.getContext(), paramString.title, (int)localc.zeA.jPi.getTextSize()));
              j = com.tencent.mm.bz.a.gd(this.yJI.yTx.getContext());
              k = (int)(com.tencent.mm.bz.a.getDensity(this.yJI.yTx.getContext()) * 80.0F);
              parama = localc.zeA.jPi.QV(j - k);
              if (parama != null)
              {
                j = parama.dPe();
                label2577: parama = (LinearLayout.LayoutParams)localc.zeA.jPi.getLayoutParams();
                if (j != 1)
                  break label2625;
              }
              label2625: for (parama.gravity = 17; ; parama.gravity = 19)
              {
                localc.zeA.jPi.setLayoutParams(parama);
                break;
                j = 0;
                break label2577;
              }
              label2634: localc.zeA.jOR.setBackgroundResource(2130838291);
              localc.zeA.jPU.setVisibility(0);
            }
          }
          parama = localc.zev.gsf;
          if (i > 1)
          {
            j = 8;
            label2682: parama.setVisibility(j);
            parama = localc.zev.pFH;
            if ((i <= 1) && (!ah.isNullOrNil(paramString.fjz)))
              break label3043;
            j = 8;
            label2718: parama.setVisibility(j);
            parama = localc.zev.pFv;
            if (i <= 1)
              break label3049;
          }
          int m;
          label3043: label3049: for (j = 0; ; j = 8)
          {
            parama.setVisibility(j);
            localc.zev.pFw.setVisibility(8);
            if (i != 1)
              break label3056;
            localc.zev.jPe.setBackgroundResource(2130838305);
            localc.zev.gCY.setVisibility(0);
            ds(localc.zev.jPQ);
            ds(localc.zev.jPe);
            if (ah.isNullOrNil(paramString.fjx))
              break label3168;
            localc.zev.jPQ.setVisibility(0);
            a(paramString.fjx, localc.zev.jOX, parambi.getType(), true, pFp, new t.j.2(this, i, localc));
            localc.zev.gCY.setBackgroundResource(2130838282);
            parama = localc.zev.gCY;
            m = jNg;
            k = jNh;
            j = jNg;
            parama.setPadding(m, k, j, j);
            localc.zev.jPe.setVisibility(0);
            localc.zev.pFH.setText(paramString.fjz);
            localc.zev.gsf.setText(paramString.title);
            localc.zev.pFv.ah(paramString.title);
            if ((paramString.fjA != 0) && (paramString.fjA != 1))
              localc.zev.pFv.setVisibility(4);
            a(paramString, parambi, paramInt, localo, localc.zev.jOR);
            break;
            j = 0;
            break label2682;
            j = 0;
            break label2718;
          }
          label3056: parama = localc.zev.gCY;
          if (ah.isNullOrNil(paramString.fjx));
          for (j = 0; ; j = 8)
          {
            parama.setVisibility(j);
            localc.zev.jPe.setBackgroundResource(2130838307);
            localc.zev.pFv.setTextColor(this.yJI.yTx.getContext().getResources().getColor(2131690202));
            localc.zev.pFv.setBackgroundResource(2130839563);
            localc.zev.pFv.getPaint().setFakeBoldText(true);
            break;
          }
          label3168: localc.zev.jPQ.setVisibility(8);
          localc.zev.gsf.setVisibility(0);
          parama = localc.zev.pFH;
          if (ah.isNullOrNil(paramString.fjz))
          {
            j = 8;
            label3217: parama.setVisibility(j);
            if (i != 1)
              break label3296;
            localc.zev.gCY.setBackgroundResource(2130838291);
          }
          while (true)
          {
            parama = localc.zev.gCY;
            k = jNg;
            j = jNg;
            parama.setPadding(k, k, j, j);
            localc.zev.jPe.setVisibility(8);
            break;
            j = 0;
            break label3217;
            label3296: localc.zev.gCY.setBackgroundResource(2130838290);
          }
          label3313: locala.jOS.setVisibility(8);
          break label859;
          label3326: locala.jOS.setVisibility(0);
          if (j <= 1)
            break label848;
          Object localObject2 = (p)localLinkedList.get(j - 1);
          parama = (p)localLinkedList.get(j);
          if (((((p)localObject2).type != 7) && (((p)localObject2).type != 5) && (((p)localObject2).type != 6) && (ah.isNullOrNil(((p)localObject2).fjx))) || ((parama.type != 7) && (parama.type != 5) && (parama.type != 6) && (ah.isNullOrNil(parama.fjx))))
          {
            O(locala.jOS, jNg);
            break label859;
          }
          O(locala.jOS, jNj);
          break label859;
          label3474: locala.jOT.setPadding(0, jNg, 0, jNi);
          break label890;
          label3493: if (j == i - 1)
          {
            locala.jOT.setPadding(0, jNi, 0, jNg);
            break label890;
          }
          locala.jOT.setPadding(0, jNi, 0, jNi);
          break label890;
          label3540: if (!ah.isNullOrNil(((p)localObject1).fjx))
          {
            locala.jOX.setVisibility(0);
            parama = ((p)localObject1).fjx;
            localObject2 = locala.jOX;
            m = parambi.getType();
            k = jNf;
            a(parama, (ImageView)localObject2, m, k, k, "@S", new t.j.1(this, localc, locala, (p)localObject1, parambi, j));
            break label1006;
          }
          if ((((p)localObject1).type == 5) || (((p)localObject1).type == 6))
          {
            locala.jOX.setVisibility(0);
            parama = locala.jOX;
            k = jNf;
            localObject2 = com.tencent.mm.at.o.ahp();
            com.tencent.mm.at.a.a.c.a locala1 = new com.tencent.mm.at.a.a.c.a();
            locala1.ePF = true;
            locala1.ePT = 2131689876;
            locala1 = locala1.ct(k, k);
            locala1.fHe = 4;
            ((com.tencent.mm.at.a.a)localObject2).a("2130838270", parama, locala1.ahG(), null, new e());
            break label1006;
          }
          locala.jOW.setVisibility(8);
          break label1006;
          label3743: locala.jOW.setVisibility(8);
          locala.gsf.setTextColor(parama1.yTx.getMMResources().getColor(2131690164));
          break label1006;
          label3777: locala.jOV.setVisibility(8);
          break label1048;
          label3790: parama = new ay(parambi, false, paramInt, ((p)localObject1).url, this.zeB, parama1.dDw(), localo.cMg, localo.cMh);
          a(parama, (p)localObject1, parambi);
          locala.jOR.setOnClickListener(h(parama1));
        }
        label3850: if (((b)g.K(b.class)).rW(2))
          for (paramInt = 0; paramInt < localLinkedList.size(); paramInt++)
          {
            parama = (p)localLinkedList.get(0);
            ((b)g.K(b.class)).a(parama.url, parama.type, 0, new Object[0]);
          }
        AppMethodBeat.o(33088);
      }
    }

    public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
    {
      AppMethodBeat.i(33097);
      Object localObject = (ay)paramView.getTag();
      boolean bool;
      if (localObject == null)
      {
        AppMethodBeat.o(33097);
        bool = false;
      }
      while (true)
      {
        return bool;
        this.zeC = ((ay)localObject).uno;
        int i = ((ay)localObject).position;
        localObject = ((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).b(parambi.field_msgId, parambi.field_content);
        if (localObject == null)
        {
          ab.w("MicroMsg.ChattingItemBizFrom", "onCreateContextMenu reader is null");
          AppMethodBeat.o(33097);
          bool = false;
        }
        else
        {
          this.jPH = false;
          if ((this.zeC >= 0) && (this.zeC < ((com.tencent.mm.af.o)localObject).fjr.size()) && (l.mg(((p)((com.tencent.mm.af.o)localObject).fjr.get(this.zeC)).fjC)))
            this.jPH = true;
          if ((!this.yJI.dFy()) && (!com.tencent.mm.ui.chatting.j.aE(parambi)))
            paramContextMenu.add(i, 111, 0, paramView.getContext().getString(2131302491));
          if ((com.tencent.mm.bp.d.afj("favorite")) && (!this.jPH))
            paramContextMenu.add(i, 126, 0, paramView.getContext().getString(2131301955));
          AppMethodBeat.o(33097);
          bool = true;
        }
      }
    }

    public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      AppMethodBeat.i(33101);
      this.jPG = ah.anT();
      switch (paramMenuItem.getItemId())
      {
      default:
      case 111:
      case 114:
      case 126:
      }
      while (true)
      {
        AppMethodBeat.o(33101);
        return false;
        if (this.jPH)
        {
          if (!this.jPH)
            ab.w("MicroMsg.ChattingItemBizFrom", "transmitAppBrandMsg not AppBrandMsg!");
          while (true)
          {
            AppMethodBeat.o(33101);
            break;
            r.a(this.zeC, parama.yTx.getContext(), parambi.field_content, parambi.field_talker, parambi.field_msgId, parambi.field_msgSvrId);
          }
        }
        String str = a(parambi, parama.yTx.getContext(), this.zeC);
        if (!ah.isNullOrNil(str))
        {
          paramMenuItem = new Intent(parama.yTx.getContext(), MsgRetransmitUI.class);
          paramMenuItem.putExtra("Retr_Msg_content", str);
          paramMenuItem.putExtra("Retr_Msg_Type", 2);
          paramMenuItem.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.zeC);
          paramMenuItem.putExtra("Retr_Msg_Id", parambi.field_msgId);
          paramMenuItem.putExtra("Retr_MsgFromScene", 1);
          str = parambi.field_talker;
          Object localObject = com.tencent.mm.model.v.nW(parambi.field_msgSvrId);
          paramMenuItem.putExtra("reportSessionId", (String)localObject);
          localObject = com.tencent.mm.model.v.Zp().y((String)localObject, true);
          ((v.b)localObject).j("prePublishId", "msg_" + parambi.field_msgSvrId);
          ((v.b)localObject).j("preUsername", str);
          ((v.b)localObject).j("preChatName", str);
          ((v.b)localObject).j("preMsgIndex", Integer.valueOf(this.zeC));
          ((v.b)localObject).j("sendAppMsgScene", Integer.valueOf(1));
          parama.startActivity(paramMenuItem);
          continue;
          paramMenuItem = a(parambi, parama.yTx.getContext(), 0);
          if (!ah.isNullOrNil(paramMenuItem))
          {
            am.c(parambi, paramMenuItem, parama.yTx.getContext());
            continue;
            r.a(this.jPG, this.zeC, parama.yTx.getContext(), parama.yTx, null, parambi);
          }
        }
      }
    }

    public final boolean aH(int paramInt, boolean paramBoolean)
    {
      if (paramInt == 285212721);
      for (paramBoolean = true; ; paramBoolean = false)
        return paramBoolean;
    }

    public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
    {
      return false;
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
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t
 * JD-Core Version:    0.6.2
 */
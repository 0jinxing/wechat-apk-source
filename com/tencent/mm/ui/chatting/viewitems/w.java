package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.lo;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.wallet.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.f;
import com.tencent.mm.ui.chatting.s.o;
import com.tencent.mm.ui.chatting.view.AvatarImageView;
import com.tencent.mm.ui.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class w extends c
{
  static int zeU;
  static int zeV;
  private View.OnClickListener lBl;
  private String mAppId;
  private p sfa;
  private com.tencent.mm.ui.chatting.d.a yJI;
  private com.tencent.mm.sdk.b.c<lo> yTn;
  private com.tencent.mm.at.a.a.c yqf;
  private View.OnClickListener zeM;
  private View.OnClickListener zeN;
  private View.OnClickListener zeO;
  private View.OnClickListener zeP;
  private l zeQ;
  private View.OnClickListener zeR;
  private String zeS;
  private int zeT;

  static
  {
    AppMethodBeat.i(33177);
    zeU = Color.parseColor("#888888");
    zeV = Color.parseColor("#888888");
    AppMethodBeat.o(33177);
  }

  public w()
  {
    AppMethodBeat.i(33157);
    com.tencent.mm.at.a.a.c.a locala = new com.tencent.mm.at.a.a.c.a();
    locala.eQf = true;
    locala.ePT = 2130837985;
    this.yqf = locala.ahG();
    this.zeN = new w.a(this, (byte)0);
    this.zeM = new w.1(this);
    this.zeR = new w.11(this);
    this.zeO = new w.12(this);
    this.yTn = new w.13(this);
    this.zeQ = new w.14(this);
    this.zeP = new w.15(this);
    this.lBl = new w.16(this);
    AppMethodBeat.o(33157);
  }

  private static void L(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(33168);
    ab.d("MicroMsg.ChattingItemDyeingTemplate", "stev report(%s), eventId : %d, appId %s, templateId %s", new Object[] { Integer.valueOf(13796), Integer.valueOf(paramInt), paramString1, paramString2 });
    com.tencent.mm.plugin.report.service.h.pYm.e(13796, new Object[] { Integer.valueOf(paramInt), paramString1, paramString2, Integer.valueOf(0), Long.valueOf(bo.anT()) });
    AppMethodBeat.o(33168);
  }

  private void a(ImageView paramImageView, com.tencent.mm.ui.chatting.d.a parama, String paramString1, bi parambi, String paramString2)
  {
    AppMethodBeat.i(33163);
    if (paramImageView == null)
      AppMethodBeat.o(33163);
    while (true)
    {
      return;
      if (t.nI(paramString1))
      {
        paramImageView.setVisibility(8);
        AppMethodBeat.o(33163);
      }
      else
      {
        paramImageView.setVisibility(0);
        if (!((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).mg(paramString1))
          break;
        o.ahp().a(paramString2, paramImageView, this.yqf);
        paramImageView.setTag(new ay(parambi, paramString1));
        paramImageView.setOnClickListener(this.zeO);
        paramImageView.setOnLongClickListener(f(parama));
        paramImageView.setContentDescription(s.mJ(paramString1) + parama.yTx.getContext().getString(2131297186));
        AppMethodBeat.o(33163);
      }
    }
    a.b.r(paramImageView, paramString1);
    if (parama.dFx());
    for (parambi = parama.getTalkerUserName(); ; parambi = null)
    {
      paramImageView.setTag(new ay(paramString1, parambi));
      paramImageView.setOnClickListener(e(parama));
      break;
    }
  }

  private void a(bd parambd, bi parambi, Map<String, String> paramMap)
  {
    AppMethodBeat.i(33166);
    LinearLayout localLinearLayout = parambd.zjg;
    int i = localLinearLayout.getChildCount();
    int j = 0;
    label38: String str1;
    String str2;
    if (j < 10)
      if (j == 0)
      {
        parambd = ".msg.appmsg.mmreader.template_detail.opitems.opitem";
        str1 = (String)paramMap.get(parambd + ".word");
        str2 = (String)paramMap.get(parambd + ".hint_word");
        if (!bo.isNullOrNil(str1))
          break label195;
        ab.i("MicroMsg.ChattingItemDyeingTemplate", "fillingVerticalButtons: count=%d", new Object[] { Integer.valueOf(j) });
        i = localLinearLayout.getChildCount();
        if (i <= j)
          break label1025;
        if (j != 0)
          break label174;
        localLinearLayout.removeAllViews();
        AppMethodBeat.o(33166);
      }
    while (true)
    {
      return;
      parambd = ".msg.appmsg.mmreader.template_detail.opitems.opitem".concat(String.valueOf(j));
      break label38;
      label174: localLinearLayout.removeViews(j, i - j);
      AppMethodBeat.o(33166);
      continue;
      label195: Object localObject1;
      label214: Object localObject2;
      int k;
      label360: String str3;
      label400: int m;
      if (j < i)
      {
        localObject1 = (LinearLayout)localLinearLayout.getChildAt(j);
        localObject1 = (a)((LinearLayout)localObject1).getTag();
        localObject2 = (String)paramMap.get(parambd + ".icon");
        k = e(paramMap, parambd + ".color", -16777216);
        ((a)localObject1).gsf.setTextColor(k);
        if (bo.getInt((String)paramMap.get(parambd + ".is_rich_text"), 0) != 0)
          break label826;
        ((a)localObject1).gsf.setSingleLine(true);
        ((a)localObject1).gsf.setEllipsize(TextUtils.TruncateAt.END);
        ((a)localObject1).gsf.setText(str1);
        ((a)localObject1).grM.setText(str2);
        if (!bo.isNullOrNil((String)localObject2))
          break label924;
        ((a)localObject1).iNr.setVisibility(8);
        ((a)localObject1).gsf.setPadding(0, 0, 0, 0);
        str3 = (String)paramMap.get(parambd + ".url");
        str1 = bo.nullAsNil((String)paramMap.get(".msg.fromusername"));
        m = bo.getInt((String)paramMap.get(parambd + ".op_type"), 0);
        str2 = (String)paramMap.get(parambd + ".weapp_username");
        localObject2 = new ay(parambi, str1, str3);
        ((a)localObject1).zbb.setTag(localObject2);
        k = j + 1;
        if ((m != 1) || (TextUtils.isEmpty(str2)))
          break label972;
        localObject2 = (String)paramMap.get(parambd + ".weapp_path");
        m = bo.getInt((String)paramMap.get(parambd + ".weapp_version"), 0);
        int n = bo.getInt((String)paramMap.get(parambd + ".weapp_state"), 0);
        parambd = new w.8(this, str2, bo.nullAsNil((String)paramMap.get(".msg.appmsg.template_id")), n, m, (String)localObject2, str1, k);
        ((a)localObject1).zbb.setOnClickListener(parambd);
      }
      while (true)
      {
        j++;
        break;
        localObject1 = (LinearLayout)LayoutInflater.from(this.yJI.yTx.getContext()).inflate(2130969015, null, false);
        localObject2 = new a();
        ((a)localObject2).gsf = ((TextView)((LinearLayout)localObject1).findViewById(2131822400));
        ((a)localObject2).iNr = ((ImageView)((LinearLayout)localObject1).findViewById(2131822401));
        ((a)localObject2).zbb = ((LinearLayout)((LinearLayout)localObject1).findViewById(2131822398));
        ((a)localObject2).grM = ((TextView)((LinearLayout)localObject1).findViewById(2131822402));
        ((LinearLayout)localObject1).setTag(localObject2);
        localLinearLayout.addView((View)localObject1);
        break label214;
        label826: k = bo.getInt((String)paramMap.get(parambd + ".display_line_number"), 1);
        ab.i("MicroMsg.ChattingItemDyeingTemplate", "show rich text: %s", new Object[] { Integer.valueOf(k) });
        ((a)localObject1).gsf.setSingleLine(false);
        ((a)localObject1).gsf.setText(str1);
        ((a)localObject1).gsf.setMaxLines(k);
        j.a(((a)localObject1).gsf, false, null);
        break label360;
        label924: ((a)localObject1).iNr.setVisibility(0);
        h(((a)localObject1).iNr, (String)localObject2);
        ((a)localObject1).gsf.setPadding(0, 0, com.tencent.mm.bz.a.fromDPToPix(this.yJI.yTx.getContext(), 28), 0);
        break label400;
        label972: if (m == 2)
          ((a)localObject1).zbb.setOnClickListener(new w.9(this, k, paramMap));
        else
          ((a)localObject1).zbb.setOnClickListener(new w.10(this, str3, str1, k));
      }
      label1025: AppMethodBeat.o(33166);
    }
  }

  private void a(bd parambd, String paramString1, String paramString2, Map<String, String> paramMap, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(33164);
    parambd.ziO.setText(j.b(this.yJI.yTx.getContext(), paramString2, parambd.ziO.getTextSize()));
    o.ahp().a(paramString1, parambd.ziN, this.yqf);
    parambd.ziN.setTag(null);
    parambd.ziN.setOnClickListener(null);
    parambd.ziM.setTag(null);
    parambd.ziM.setOnClickListener(null);
    parambd.ziM.setVisibility(0);
    paramString2 = bo.nullAsNil((String)paramMap.get(".msg.appmsg.mmreader.template_header.weapp_username"));
    paramString1 = bo.nullAsNil((String)paramMap.get(".msg.appmsg.mmreader.template_header.header_jump_url"));
    if ((!bo.isNullOrNil(paramString2)) || (!bo.isNullOrNil(paramString1)))
    {
      paramString1 = bo.nullAsNil((String)paramMap.get(".msg.fromusername"));
      parambd.ziM.setTag(new ay(parambi, paramString1));
      parambd.ziM.setOnClickListener(this.zeR);
      paramString1 = bo.nullAsNil((String)paramMap.get(".msg.appmsg.mmreader.template_header.shortcut_icon_url"));
      if ((!paramBoolean) || (bo.isNullOrNil(paramString1)))
        break label258;
      ((View)parambd.ziQ.getParent()).setVisibility(0);
      o.ahp().a(paramString1, parambd.ziQ, this.yqf);
      AppMethodBeat.o(33164);
    }
    while (true)
    {
      return;
      parambd.ziM.setOnClickListener(null);
      break;
      label258: ((View)parambd.ziQ.getParent()).setVisibility(8);
      AppMethodBeat.o(33164);
    }
  }

  private void a(Map<String, String> paramMap, bi parambi, bd parambd, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(33165);
    LinearLayout localLinearLayout = parambd.zjt;
    int i;
    if (paramBoolean1)
    {
      i = 0;
      localLinearLayout.setVisibility(i);
      if (!paramBoolean2)
        break label108;
      parambd.ziP.setVisibility(0);
      parambd.zju.setText(this.yJI.yTx.getMMResources().getString(2131301852));
    }
    while (true)
    {
      parambd.zjt.setTag(2131822501, parambi);
      parambd.zjt.setOnClickListener(new w.18(this, paramMap, paramBoolean2, parambd, parambi));
      AppMethodBeat.o(33165);
      return;
      i = 8;
      break;
      label108: parambd.ziP.setVisibility(8);
      parambd.zju.setText(this.yJI.yTx.getMMResources().getString(2131301834));
    }
  }

  private static int arE(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(33170);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(33170);
    while (true)
    {
      return i;
      int j = 0;
      i = 0;
      if (j < paramString.length())
      {
        if (paramString.substring(j, j + 1).matches("[Α-￥]"))
          i += 2;
        while (true)
        {
          j++;
          break;
          i++;
        }
      }
      AppMethodBeat.o(33170);
    }
  }

  private static int e(Map<String, String> paramMap, String paramString, int paramInt)
  {
    AppMethodBeat.i(33169);
    if ((paramMap == null) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(33169);
    while (true)
    {
      return paramInt;
      try
      {
        int i = Color.parseColor(bo.nullAsNil((String)paramMap.get(paramString)));
        paramInt = i;
        label44: AppMethodBeat.o(33169);
      }
      catch (Exception paramMap)
      {
        break label44;
      }
    }
  }

  private static void h(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(33167);
    if ((bo.isNullOrNil(paramString)) || (paramImageView == null))
      AppMethodBeat.o(33167);
    while (true)
    {
      return;
      Object localObject = new com.tencent.mm.at.a.a.c.a();
      com.tencent.mm.model.aw.ZK();
      ((com.tencent.mm.at.a.a.c.a)localObject).ePK = com.tencent.mm.model.c.XX();
      ((com.tencent.mm.at.a.a.c.a)localObject).ePH = true;
      ((com.tencent.mm.at.a.a.c.a)localObject).ePZ = true;
      localObject = ((com.tencent.mm.at.a.a.c.a)localObject).ahG();
      o.ahp().a(paramString, paramImageView, (com.tencent.mm.at.a.a.c)localObject);
      AppMethodBeat.o(33167);
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33158);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969042);
      paramLayoutInflater = new aw();
      paramLayoutInflater.moo = ((CheckBox)((View)localObject).findViewById(2131820580));
      paramLayoutInflater.iVh = ((View)localObject).findViewById(2131820586);
      paramLayoutInflater.qkY = ((TextView)((View)localObject).findViewById(2131821102));
      paramLayoutInflater.zbv = ((AvatarImageView)((View)localObject).findViewById(2131821101));
      paramLayoutInflater.enf = ((TextView)((View)localObject).findViewById(2131820587));
      paramLayoutInflater.jPr = ((LinearLayout)((View)localObject).findViewById(2131822453));
      paramLayoutInflater.zii.jOR = ((View)localObject).findViewById(2131822460);
      paramLayoutInflater.zii.zil = ((View)localObject).findViewById(2131822502);
      paramLayoutInflater.zii.gsf = ((TextView)paramLayoutInflater.zii.jOR.findViewById(2131820678));
      paramLayoutInflater.zii.ngD = ((TextView)paramLayoutInflater.zii.jOR.findViewById(2131822504));
      paramLayoutInflater.zii.ziq = ((LinearLayout)paramLayoutInflater.zii.jOR.findViewById(2131822506));
      paramLayoutInflater.zii.zio = ((TextView)paramLayoutInflater.jPr.findViewById(2131821867));
      paramLayoutInflater.zii.zir = paramLayoutInflater.jPr.findViewById(2131822507);
      paramLayoutInflater.zii.zim = ((View)localObject).findViewById(2131822503);
      paramLayoutInflater.zii.zin = ((View)localObject).findViewById(2131822505);
      paramLayoutInflater.zij.ziK = ((View)localObject).findViewById(2131822461);
      paramLayoutInflater.zij.ziL = ((ImageView)((View)localObject).findViewById(2131822470));
      paramLayoutInflater.zij.ziM = ((View)localObject).findViewById(2131822464);
      paramLayoutInflater.zij.ziO = ((TextView)((View)localObject).findViewById(2131822466));
      paramLayoutInflater.zij.ziN = ((ImageView)((View)localObject).findViewById(2131822465));
      paramLayoutInflater.zij.ziP = ((View)localObject).findViewById(2131822467);
      paramLayoutInflater.zij.ziQ = ((ImageView)((View)localObject).findViewById(2131822469));
      paramLayoutInflater.zij.ziR = ((View)localObject).findViewById(2131822468);
      paramLayoutInflater.zij.ziS = ((View)localObject).findViewById(2131822474);
      paramLayoutInflater.zij.ziT = ((TextView)((View)localObject).findViewById(2131822472));
      paramLayoutInflater.zij.ziU = ((TextView)((View)localObject).findViewById(2131822473));
      paramLayoutInflater.zij.ziV = ((TextView)((View)localObject).findViewById(2131822475));
      paramLayoutInflater.zij.ziW = ((View)localObject).findViewById(2131822471);
      paramLayoutInflater.zij.ziX = ((LinearLayout)((View)localObject).findViewById(2131822476));
      paramLayoutInflater.zij.ziY = ((TextView)((View)localObject).findViewById(2131822477));
      paramLayoutInflater.zij.zja = ((TextView)((View)localObject).findViewById(2131822479));
      paramLayoutInflater.zij.ziZ = ((TextView)((View)localObject).findViewById(2131822478));
      paramLayoutInflater.zij.zjb = ((TextView)((View)localObject).findViewById(2131822480));
      paramLayoutInflater.zij.zjc = ((View)localObject).findViewById(2131822481);
      paramLayoutInflater.zij.zjd = ((LinearLayout)((View)localObject).findViewById(2131822486));
      paramLayoutInflater.zij.zjh = ((View)localObject).findViewById(2131821475);
      paramLayoutInflater.zij.zje = ((View)localObject).findViewById(2131822487);
      paramLayoutInflater.zij.zjf = ((LinearLayout)((View)localObject).findViewById(2131822488));
      paramLayoutInflater.zij.zjg = ((LinearLayout)((View)localObject).findViewById(2131822499));
      paramLayoutInflater.zij.zji = ((LinearLayout)((View)localObject).findViewById(2131822489));
      paramLayoutInflater.zij.zjl = ((TextView)((View)localObject).findViewById(2131822490));
      paramLayoutInflater.zij.zjn = ((ImageView)((View)localObject).findViewById(2131822491));
      paramLayoutInflater.zij.zjk = ((View)localObject).findViewById(2131822492);
      paramLayoutInflater.zij.zjj = ((LinearLayout)((View)localObject).findViewById(2131822493));
      paramLayoutInflater.zij.zjm = ((TextView)((View)localObject).findViewById(2131822494));
      paramLayoutInflater.zij.zjo = ((ImageView)((View)localObject).findViewById(2131822495));
      paramLayoutInflater.zij.zjp = ((ImageView)((View)localObject).findViewById(2131822403));
      paramLayoutInflater.zbW = ((ImageView)((View)localObject).findViewById(2131822462));
      paramLayoutInflater.zij.zjq = ((View)localObject).findViewById(2131822496);
      paramLayoutInflater.zij.zjr = ((ImageView)((View)localObject).findViewById(2131822497));
      paramLayoutInflater.zij.zjs = ((TextView)((View)localObject).findViewById(2131822498));
      paramLayoutInflater.zij.zjt = ((LinearLayout)((View)localObject).findViewById(2131822500));
      paramLayoutInflater.zij.zju = ((TextView)((View)localObject).findViewById(2131822501));
      paramLayoutInflater.zik.zbc = ((LinearLayout)((View)localObject).findViewById(2131822482));
      paramLayoutInflater.zik.zbd = ((CdnImageView)((View)localObject).findViewById(2131822483));
      paramLayoutInflater.zik.zbe = ((TextView)((View)localObject).findViewById(2131822484));
      paramLayoutInflater.zik.zbf = ((TextView)((View)localObject).findViewById(2131822485));
      ((View)localObject).setTag(paramLayoutInflater);
    }
    AppMethodBeat.o(33158);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33159);
    this.yJI = parama1;
    aw localaw = (aw)parama;
    Map localMap = br.z(parambi.field_content, "msg");
    if ((localMap == null) || (localMap.size() == 0))
    {
      ab.e("MicroMsg.ChattingItemDyeingTemplate", "filling fail, values is empty");
      localaw.jPr.setVisibility(8);
      AppMethodBeat.o(33159);
      return;
    }
    localaw.jPr.setVisibility(0);
    int i = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
    this.zeS = bo.nullAsNil((String)localMap.get(".msg.appmsg.template_id"));
    this.zeT = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.pay_style"), 0);
    com.tencent.mm.sdk.b.a.xxA.d(this.yTn);
    ((com.tencent.mm.ui.chatting.c.b.g)parama1.aF(com.tencent.mm.ui.chatting.c.b.g.class)).b(this.zeQ);
    Object localObject1;
    if (i != 0)
    {
      localaw.zii.jOR.setVisibility(8);
      localObject1 = localaw.zij;
      if (bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.type"), 0) == 1)
      {
        a((bd)localObject1, bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.app.avatar_url")), bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.app.display_name")), localMap, parambi, false);
        label258: if (bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.hide_icon_and_display_name_line"), 0) == 0)
          break label2357;
        ((bd)localObject1).ziM.setBackgroundResource(2130839563);
        label289: if (bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.ignore_hide_title_and_time"), 0) != 0)
          break label6527;
      }
    }
    label526: label573: label595: label738: label746: label760: label6268: label6527: for (int j = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.hide_title_and_time"), 0); ; j = 0)
    {
      int k = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.hide_title"), 0);
      int m = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.hide_time"), 0);
      ((bd)localObject1).ziT.setVisibility(8);
      ((bd)localObject1).ziU.setVisibility(8);
      if (j == 0)
      {
        if (k == 0)
        {
          ((bd)localObject1).ziT.setVisibility(0);
          parama = bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_header.title"));
          k = e(localMap, ".msg.appmsg.mmreader.template_header.title_color", -16777216);
          ((bd)localObject1).ziT.setTextColor(k);
          ((bd)localObject1).ziT.setText(parama);
        }
        if (m == 0)
        {
          long l = bo.getLong(bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_header.pub_time")), 0L);
          if (l <= 0L)
            break label2394;
          ((bd)localObject1).ziU.setText(com.tencent.mm.pluginsdk.f.h.formatTime(this.yJI.yTx.getMMResources().getString(2131299936), l));
          ((bd)localObject1).ziU.setVisibility(0);
        }
      }
      parama = bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_header.first_data"));
      m = e(localMap, ".msg.appmsg.mmreader.template_header.first_color", zeV);
      boolean bool1;
      boolean bool2;
      boolean bool3;
      boolean bool4;
      if (bo.isNullOrNil(parama))
      {
        ((bd)localObject1).ziV.setVisibility(8);
        if ((j == 0) || (!bo.isNullOrNil(parama)))
          break label2486;
        ((bd)localObject1).ziW.setVisibility(8);
        bool1 = false;
        bool2 = false;
        bool3 = bool2;
        if ("notifymessage".equals(parambi.field_talker))
        {
          parama1 = bo.nullAsNil((String)localMap.get(".msg.fromusername"));
          bool4 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).mg(parama1);
          bool1 = bool4;
          bool3 = bool2;
          if (bool4)
          {
            ((com.tencent.mm.ui.chatting.c.b.g)this.yJI.aF(com.tencent.mm.ui.chatting.c.b.g.class)).a(this.zeQ);
            com.tencent.mm.sdk.b.a.xxA.c(this.yTn);
            parama = ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zb(parama1);
            if (parama == null)
              break label2504;
            this.mAppId = parama.field_appId;
            if ((parama.field_appOpt & 0x1) <= 0)
              break label2498;
            bool1 = true;
            bool3 = bool1;
            bool1 = bool4;
          }
        }
        parama = ((bd)localObject1).ziR;
        if (!bool1)
          break label2560;
        j = 0;
        parama.setVisibility(j);
        ((bd)localObject1).ziR.setTag(2131822468, parambi);
        ((bd)localObject1).ziR.setOnClickListener(this.zeM);
        a(localMap, parambi, (bd)localObject1, bool1, bool3);
        ((bd)localObject1).ziL.setVisibility(8);
        parama = bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_header.first_data"));
        ((bd)localObject1).ziV.setText(parama);
        parama1 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.word");
        parama = (String)localMap.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.word");
        paramString = (String)localMap.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.strikethrough_word");
        if (bo.isNullOrNil(parama))
          break label2624;
        j = e(localMap, ".msg.appmsg.mmreader.template_detail.line_content.topline.key.color", -16777216);
        m = e(localMap, ".msg.appmsg.mmreader.template_detail.line_content.topline.value.color", -16777216);
        k = e(localMap, ".msg.appmsg.mmreader.template_detail.line_content.topline.value.strikethrough_word_color", -16777216);
        i = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.small_text_count"), 0);
        ((bd)localObject1).ziY.setTextColor(j);
        ((bd)localObject1).zja.setTextColor(m);
        ((bd)localObject1).zjb.setTextColor(k);
        ((bd)localObject1).zjb.getPaint().setFlags(16);
        ((bd)localObject1).ziY.setText(parama1);
        if ((i <= 0) || (i >= parama.length()))
          break label2567;
        ((bd)localObject1).ziZ.setVisibility(0);
        ((bd)localObject1).ziZ.setText(parama.substring(0, i));
        ((bd)localObject1).ziZ.setTextColor(m);
        ((bd)localObject1).ziZ.setTypeface(((b)com.tencent.mm.kernel.g.K(b.class)).ex(this.yJI.yTx.getContext()));
        ((bd)localObject1).zja.setTypeface(((b)com.tencent.mm.kernel.g.K(b.class)).ex(this.yJI.yTx.getContext()));
        ((bd)localObject1).zja.setText(parama.substring(i));
        if (bo.isNullOrNil(paramString))
          break label2611;
        ((bd)localObject1).zjb.setText(paramString);
        ((bd)localObject1).zjb.setVisibility(0);
        ((bd)localObject1).ziX.setVisibility(0);
        k = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
        if (k != 2)
          break label2789;
        ab.i("MicroMsg.ChattingItemDyeingTemplate", "[fillingCustomView]");
        ((bd)localObject1).ziU.setVisibility(8);
        ((bd)localObject1).zjd.setVisibility(8);
        parama1 = (ViewGroup)((bd)localObject1).zjd.getParent();
        parama = parama1.findViewById(2131824554);
        if (parama != null)
          break label6524;
        parama = LayoutInflater.from(parama1.getContext()).inflate(2130970506, null);
        paramString = new av();
        paramString.iNr = ((ImageView)parama.findViewById(2131823704));
        paramString.zih = ((TextView)parama.findViewById(2131826964));
        paramString.ngD = ((TextView)parama.findViewById(2131822504));
        paramString.gsf = ((TextView)parama.findViewById(2131820678));
        parama.setTag(paramString);
        parama1.addView(parama);
      }
      while (true)
      {
        parama.setVisibility(0);
        Object localObject2 = (av)parama.getTag();
        parama = (String)localMap.get(".msg.appmsg.mmreader.category.item.schedule_content");
        paramString = (String)localMap.get(".msg.appmsg.mmreader.category.item.schedule_username");
        parama1 = (String)localMap.get(".msg.appmsg.mmreader.category.item.schedule_nickname");
        Object localObject3 = (String)localMap.get(".msg.appmsg.mmreader.category.item.schedule_time");
        j = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.category.item.schedule_remindsubtype"), -1);
        ((av)localObject2).gsf.setText(j.b(((av)localObject2).gsf.getContext(), parama));
        Object localObject4 = ((av)localObject2).zih;
        Object localObject5 = ((av)localObject2).gsf.getContext();
        if (bo.isNullOrNil(paramString))
          parama = "";
        while (true)
        {
          ((TextView)localObject4).setText(j.b((Context)localObject5, parama));
          ((av)localObject2).ngD.setText((CharSequence)localObject3);
          if (j == 2)
          {
            ((av)localObject2).iNr.setImageDrawable(ah.getContext().getResources().getDrawable(2130837704));
            if (bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.show_type"), 0) == 0)
              break label3544;
            ((bd)localObject1).zjq.setVisibility(8);
            ((bd)localObject1).zjf.setVisibility(8);
            ((bd)localObject1).zjh.setVisibility(8);
            ((bd)localObject1).zjg.setVisibility(0);
            ((bd)localObject1).zje.setVisibility(0);
            a((bd)localObject1, parambi, localMap);
            localObject3 = bo.nullAsNil((String)localMap.get(".msg.fromusername"));
            parama = null;
            if (!bo.isNullOrNil((String)localObject3))
            {
              com.tencent.mm.model.aw.ZK();
              parama = com.tencent.mm.model.c.XM().aoO((String)localObject3).Oi();
            }
            localObject2 = (String)localMap.get(".msg.appmsg.mmreader.category.item.title");
            localObject4 = (String)localMap.get(".msg.appmsg.mmreader.category.item.url");
            paramString = (String)localMap.get(".msg.appmsg.mmreader.category.item.native_url");
            parama1 = (String)localMap.get(".msg.appmsg.template_id");
            localObject5 = (String)localMap.get(".msg.appmsg.mmreader.category.item.weapp_username");
            if ((k != 1) || (TextUtils.isEmpty((CharSequence)localObject5)))
              break label4995;
            paramString = new ay(parambi, (String)localObject3, (String)localObject4);
            paramString.position = paramInt;
            ((bd)localObject1).ziK.setTag(paramString);
            ((bd)localObject1).ziK.setOnClickListener(this.lBl);
            ((bd)localObject1).ziK.setOnLongClickListener(c(this.yJI));
            ((bd)localObject1).ziK.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)this.yJI.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
            if (com.tencent.mm.m.g.Nv().Nk())
            {
              localaw.zbW.setVisibility(0);
              c(this.yJI, localaw.zbW, new s.o(parama1, parambi, parama));
            }
            parama = bo.nullAsNil((String)localMap.get(".msg.fromusername"));
            if ((!((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).mg(parama)) || (!"notifymessage".equals(parambi.field_talker)))
              break label5225;
            ab.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew handled by app brand");
            ((bd)localObject1).ziS.setTag(null);
            ((bd)localObject1).ziS.setVisibility(8);
          }
          while (true)
          {
            localaw.zij.ziK.setVisibility(0);
            AppMethodBeat.o(33159);
            break;
            if (bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.show_icon_and_display_name"), 0) != 0)
            {
              a((bd)localObject1, bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_header.icon_url")), bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_header.display_name")), localMap, parambi, true);
              break label258;
            }
            ((View)((bd)localObject1).ziQ.getParent()).setVisibility(8);
            if ("notifymessage".equals(parambi.field_talker))
            {
              parama1 = bo.nullAsNil((String)localMap.get(".msg.fromusername"));
              if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).mg(parama1))
              {
                paramString = ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zb(parama1);
                if (paramString == null)
                {
                  parama = null;
                  a(((bd)localObject1).ziN, this.yJI, parama1, parambi, parama);
                  if (paramString != null)
                    break label2232;
                  parama = parama1;
                }
              }
              while (true)
              {
                ((bd)localObject1).ziO.setText(j.b(this.yJI.yTx.getContext(), parama, ((bd)localObject1).ziO.getTextSize()));
                if (!((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).mg(parama1))
                  break label2281;
                ((bd)localObject1).ziM.setTag(new ay(parambi, parama1));
                ((bd)localObject1).ziM.setOnClickListener(this.zeO);
                ((bd)localObject1).ziM.setVisibility(0);
                break;
                parama = paramString.field_brandIconURL;
                break label2110;
                parama = paramString.field_nickname;
                continue;
                a(((bd)localObject1).ziN, this.yJI, parama1, parambi, null);
                parama = ((f)this.yJI.aF(f.class)).arj(parama1);
              }
              paramString = ((bd)localObject1).ziM;
              if (this.yJI.dFx());
              for (parama = this.yJI.getTalkerUserName(); ; parama = null)
              {
                paramString.setTag(new ay(parama1, parama));
                ((bd)localObject1).ziM.setOnClickListener(e(this.yJI));
                break;
              }
            }
            ((bd)localObject1).ziM.setVisibility(8);
            break label258;
            j = ((bd)localObject1).ziM.getPaddingLeft();
            ((bd)localObject1).ziM.setBackgroundResource(2130839162);
            ((bd)localObject1).ziM.setPadding(j, 0, 0, 0);
            break label289;
            ((bd)localObject1).ziU.setVisibility(8);
            break label526;
            ((bd)localObject1).ziV.setTextColor(m);
            ((bd)localObject1).ziV.setText(parama);
            ((bd)localObject1).ziV.setVisibility(0);
            if (i == 2)
            {
              ((bd)localObject1).ziV.setPadding(0, this.yJI.yTx.getMMResources().getDimensionPixelOffset(2131427776), 0, 0);
              break label573;
            }
            ((bd)localObject1).ziV.setPadding(0, 0, 0, 0);
            break label573;
            ((bd)localObject1).ziW.setVisibility(0);
            break label595;
            bool1 = false;
            break label738;
            ab.i("MicroMsg.ChattingItemDyeingTemplate", "try2HandleAppBrandLogic, sync attr username %s", new Object[] { parama1 });
            ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).a(parama1, new w.17(this, localMap, parambi, (bd)localObject1));
            bool1 = bool4;
            bool3 = bool2;
            break label746;
            j = 8;
            break label760;
            ((bd)localObject1).ziZ.setTypeface(Typeface.DEFAULT);
            ((bd)localObject1).ziZ.setVisibility(8);
            ((bd)localObject1).zja.setTypeface(Typeface.DEFAULT);
            ((bd)localObject1).zja.setText(parama);
            break label1127;
            ((bd)localObject1).zjb.setVisibility(8);
            break label1154;
            ((bd)localObject1).ziX.setVisibility(8);
            break label1163;
            parama = null;
            ad localad;
            if (t.kH(paramString))
            {
              com.tencent.mm.model.aw.ZK();
              localad = com.tencent.mm.model.c.XM().aoO(paramString);
              if (localad != null)
              {
                if (localad.Oj() != null)
                  break label2729;
                parama = localad.Oi();
              }
            }
            while (true)
            {
              if (!bo.isNullOrNil(parama))
                break label6521;
              ab.i("MicroMsg.ChattingItemDyeingTemplate", "[getDisplayName] username:%s nickname:%s", new Object[] { paramString, parama1 });
              parama = parama1;
              if (parama1 != null)
                break;
              parama = ah.getContext().getString(2131298223);
              break;
              parama = localad.Oj();
              continue;
              com.tencent.mm.model.aw.ZK();
              parama = com.tencent.mm.model.c.XM().aoO(paramString);
              if (parama.Oj() == null)
                parama = parama.Oi();
              else
                parama = parama.Oj();
            }
            a.b.b(((av)localObject2).iNr, paramString);
            break label1522;
            parama1 = new ArrayList();
            j = 0;
            i = 0;
            if (i < 100)
            {
              if (i == 0)
              {
                parama = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
                paramString = (String)localMap.get(parama + ".value.word");
                localObject2 = (String)localMap.get(parama + ".key.word");
                if ((!bo.isNullOrNil(paramString)) || (!bo.isNullOrNil((String)localObject2)))
                  break label3121;
                ab.i("MicroMsg.ChattingItemDyeingTemplate", "fillingLines: lines count=%d", new Object[] { Integer.valueOf(i) });
              }
            }
            else
            {
              if (j <= 8)
                break label3309;
              j = 8;
              paramString = ((bd)localObject1).zjd;
              paramString.setVisibility(0);
              parama = ((ViewGroup)((bd)localObject1).zjd.getParent()).findViewById(2131824554);
              if (parama != null)
                parama.setVisibility(8);
              if (paramString.getChildCount() > parama1.size())
              {
                if (parama1.size() != 0)
                  break label3312;
                paramString.removeAllViews();
              }
              m = paramString.getChildCount();
              i = 0;
              if (i >= parama1.size())
                break label3465;
              localObject3 = (ba)parama1.get(i);
              if (i >= m)
                break label3342;
              parama = (LinearLayout)paramString.getChildAt(i);
              parama = (bb)parama.getTag();
              if (!((ba)localObject3).ziG)
                break label3421;
              parama.ziH.setVisibility(8);
            }
            while (true)
            {
              parama.ziI.setTextColor(((ba)localObject3).ziF);
              parama.ziI.setText(((ba)localObject3).ziD);
              i++;
              break label3009;
              parama = ".msg.appmsg.mmreader.template_detail.line_content.lines.line".concat(String.valueOf(i));
              break label2819;
              localObject3 = new ba();
              ((ba)localObject3).ziD = paramString;
              ((ba)localObject3).ziC = bo.nullAsNil((String)localObject2);
              ((ba)localObject3).ziE = e(localMap, parama + ".key.color", zeU);
              ((ba)localObject3).ziF = e(localMap, parama + ".value.color", -16777216);
              if (bo.getInt((String)localMap.get(parama + ".key.hide"), 0) != 0)
              {
                bool1 = true;
                ((ba)localObject3).ziG = bool1;
                m = (arE(((ba)localObject3).ziC) + 1) / 2;
                if (m <= j)
                  break label3306;
                j = m;
              }
              while (true)
              {
                parama1.add(localObject3);
                i++;
                break;
                bool1 = false;
                break label3253;
              }
              break label2930;
              i = paramString.getChildCount();
              paramString.removeViews(parama1.size(), i - parama1.size());
              break label2999;
              parama = (LinearLayout)LayoutInflater.from(this.yJI.yTx.getContext()).inflate(2130969016, null, false);
              localObject2 = new bb();
              ((bb)localObject2).ziH = ((TextView)parama.findViewById(2131822404));
              ((bb)localObject2).ziI = ((TextView)parama.findViewById(2131822405));
              parama.setTag(localObject2);
              paramString.addView(parama);
              break label3051;
              parama.ziH.setVisibility(0);
              parama.ziH.setEms(j);
              parama.ziH.setTextColor(((ba)localObject3).ziE);
              parama.ziH.setText(((ba)localObject3).ziC);
            }
            if (paramString.getChildCount() == 0)
            {
              ((bd)localObject1).zjc.setVisibility(8);
              paramString.setVisibility(8);
              break label1522;
            }
            if (bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.hide_dash_line"), 0) != 0)
              ((bd)localObject1).zjc.setVisibility(8);
            while (true)
            {
              paramString.setVisibility(0);
              break;
              ((bd)localObject1).zjc.setVisibility(0);
            }
            ((bd)localObject1).zjg.setVisibility(8);
            parama1 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.word");
            parama = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.icon");
            if (!bo.isNullOrNil(parama1))
            {
              j = e(localMap, ".msg.appmsg.mmreader.template_detail.opitems.opitem.color", -16777216);
              ((bd)localObject1).zjl.setTextColor(j);
              ((bd)localObject1).zjl.setText(parama1);
              if (bo.isNullOrNil(parama))
              {
                ((bd)localObject1).zjn.setVisibility(8);
                ((bd)localObject1).zjl.setPadding(0, 0, 0, 0);
                localObject2 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.url");
                paramString = bo.nullAsNil((String)localMap.get(".msg.fromusername"));
                j = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.op_type"), 0);
                parama1 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_username");
                localObject3 = new ay(parambi, paramString, (String)localObject2);
                ((bd)localObject1).zji.setTag(localObject3);
                ((bd)localObject1).zjq.setTag(localObject3);
                if ((j != 1) || (TextUtils.isEmpty(parama1)))
                  break label4542;
                localObject3 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_path");
                i = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_version"), 0);
                j = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_state"), 0);
                parama1 = new w.3(this, parama1, bo.nullAsNil((String)localMap.get(".msg.appmsg.template_id")), j, i, (String)localObject3, paramString);
                ((bd)localObject1).zji.setOnClickListener(parama1);
                ((bd)localObject1).zjq.setOnClickListener(parama1);
                ((bd)localObject1).zji.setVisibility(0);
                paramString = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.word");
                parama1 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.icon");
                if (bo.isNullOrNil(paramString))
                  break label4657;
                j = e(localMap, ".msg.appmsg.mmreader.template_detail.opitems.opitem1.color", -16777216);
                ((bd)localObject1).zjm.setTextColor(j);
                ((bd)localObject1).zjm.setText(paramString);
                if (!bo.isNullOrNil(parama1))
                  break label4587;
                ((bd)localObject1).zjo.setVisibility(8);
                ((bd)localObject1).zjm.setPadding(0, 0, 0, 0);
                localObject2 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.url");
                localObject3 = bo.nullAsNil((String)localMap.get(".msg.fromusername"));
                j = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.op_type"), 0);
                paramString = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_username");
                ((bd)localObject1).zjj.setTag(new ay(parambi, (String)localObject3, (String)localObject2));
                if ((j != 1) || (TextUtils.isEmpty(paramString)))
                  break label4634;
                localObject2 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_path");
                i = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_version"), 0);
                j = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_state"), 0);
                localObject5 = bo.nullAsNil((String)localMap.get(".msg.appmsg.template_id"));
                ((bd)localObject1).zjj.setOnClickListener(new w.5(this, paramString, (String)localObject5, j, i, (String)localObject2, (String)localObject3));
                ((bd)localObject1).zjj.setVisibility(0);
                ((bd)localObject1).zjp.setVisibility(8);
                if ((((bd)localObject1).zji.getVisibility() != 8) || (((bd)localObject1).zjj.getVisibility() != 8))
                  break label4670;
                ((bd)localObject1).zjf.setVisibility(8);
                ((bd)localObject1).zje.setVisibility(8);
                ((bd)localObject1).zjh.setVisibility(8);
                if ((((bd)localObject1).zji.getVisibility() != 0) || (((bd)localObject1).zjj.getVisibility() != 0))
                  break label4951;
                ((bd)localObject1).zjk.setVisibility(0);
                parama = bo.nullAsNil((String)localMap.get(".msg.fromusername"));
                j = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.op_type"), 0);
                paramString = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_username");
                if ((ad.mg(parama)) || (((bd)localObject1).zji.getVisibility() == 8) || (((bd)localObject1).zjj.getVisibility() != 8) || (j != 1) || (!ad.mg(paramString)))
                  break label4982;
                localObject3 = ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zb(paramString);
                if (localObject3 != null)
                  break label4964;
                parama = null;
                if (localObject3 != null)
                  break label4973;
              }
            }
            for (parama1 = paramString; ; parama1 = ((WxaAttributes)localObject3).field_nickname)
            {
              o.ahp().a(parama, ((bd)localObject1).zjr, this.yqf);
              ((bd)localObject1).zjs.setText(parama1);
              if (localObject3 == null)
                ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).a(paramString, new w.7(this, (bd)localObject1, paramString));
              ((bd)localObject1).zjq.setVisibility(0);
              ((bd)localObject1).zjf.setVisibility(8);
              break;
              ((bd)localObject1).zjn.setVisibility(0);
              h(((bd)localObject1).zjn, parama);
              ((bd)localObject1).zjl.setPadding(0, 0, com.tencent.mm.bz.a.fromDPToPix(this.yJI.yTx.getContext(), 16), 0);
              break label3650;
              ((bd)localObject1).zji.setOnClickListener(new w.4(this, (String)localObject2, paramString));
              ((bd)localObject1).zjq.setOnClickListener(null);
              break label3869;
              ((bd)localObject1).zji.setVisibility(8);
              break label3878;
              ((bd)localObject1).zjo.setVisibility(0);
              h(((bd)localObject1).zjo, parama1);
              ((bd)localObject1).zjm.setPadding(0, 0, com.tencent.mm.bz.a.fromDPToPix(this.yJI.yTx.getContext(), 16), 0);
              break label3977;
              ((bd)localObject1).zjj.setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymousView)
                {
                  AppMethodBeat.i(33132);
                  if (!bo.isNullOrNil(this.val$url))
                  {
                    paramAnonymousView = new Intent();
                    paramAnonymousView.putExtra("rawUrl", this.val$url);
                    com.tencent.mm.bp.d.b(w.b(w.this).yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
                    com.tencent.mm.plugin.report.service.h.pYm.e(11608, new Object[] { w.d(w.this), this.uHr, Integer.valueOf(2) });
                  }
                  AppMethodBeat.o(33132);
                }
              });
              break label4178;
              ((bd)localObject1).zjj.setVisibility(8);
              break label4187;
              ((bd)localObject1).zjh.setVisibility(0);
              j = this.yJI.yTx.getMMResources().getDimensionPixelOffset(2131427776);
              if ((((bd)localObject1).zji.getVisibility() == 0) && (((bd)localObject1).zjj.getVisibility() == 0))
              {
                ((bd)localObject1).zji.setGravity(17);
                ((bd)localObject1).zjj.setGravity(17);
                ((bd)localObject1).zji.setPadding(j, 0, j, 0);
                ((bd)localObject1).zjj.setPadding(j, 0, j, 0);
              }
              while (true)
              {
                ((bd)localObject1).zjf.setVisibility(0);
                ((bd)localObject1).zje.setVisibility(0);
                break;
                if (((bd)localObject1).zji.getVisibility() == 0)
                {
                  if (bo.isNullOrNil(parama))
                  {
                    ((bd)localObject1).zji.setGravity(19);
                    ((bd)localObject1).zji.setPadding(j, 0, 0, 0);
                    ((bd)localObject1).zjp.setVisibility(0);
                  }
                  else
                  {
                    ((bd)localObject1).zji.setGravity(17);
                    ((bd)localObject1).zji.setPadding(j, 0, j, 0);
                  }
                }
                else if (bo.isNullOrNil(parama1))
                {
                  ((bd)localObject1).zjj.setGravity(19);
                  ((bd)localObject1).zjj.setPadding(this.yJI.yTx.getMMResources().getDimensionPixelOffset(2131427776), 0, 0, 0);
                  ((bd)localObject1).zjp.setVisibility(0);
                }
                else
                {
                  ((bd)localObject1).zjj.setGravity(17);
                  ((bd)localObject1).zjj.setPadding(j, 0, j, 0);
                }
              }
              ((bd)localObject1).zjk.setVisibility(8);
              break label4284;
              parama = ((WxaAttributes)localObject3).field_brandIconURL;
              break label4407;
            }
            ((bd)localObject1).zjq.setVisibility(8);
            break label1600;
            if ((k == -1) && (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).mg((String)localObject3)))
            {
              localObject4 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.url");
              localObject5 = ((bd)localObject1).ziK;
              localObject3 = new ay(parambi, false, paramInt, (String)localObject3, false, this.yJI.dDw(), (String)localObject3, parama, (String)localObject2);
              ((ay)localObject3).cRS = paramString;
              ((ay)localObject3).hzj = ((String)localObject4);
              ((View)localObject5).setTag(localObject3);
              ((bd)localObject1).ziK.setOnClickListener(this.zeP);
              break label1777;
            }
            if (k == 2)
            {
              paramString = new ay(parambi, (String)localObject3, (String)localObject4);
              paramString.position = paramInt;
              ((bd)localObject1).ziK.setTag(paramString);
              ((bd)localObject1).ziK.setOnClickListener(this.lBl);
              break label1777;
            }
            localObject5 = ((bd)localObject1).ziK;
            localObject3 = new ay(parambi, false, paramInt, (String)localObject4, false, this.yJI.dDw(), (String)localObject3, parama, (String)localObject2);
            ((ay)localObject3).cRS = paramString;
            ((View)localObject5).setTag(localObject3);
            ((bd)localObject1).ziK.setOnClickListener(h(this.yJI));
            break label1777;
            if (bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.show_complaint_button"), 0) == 1)
            {
              paramInt = 1;
              if (paramInt != 0)
                break label5306;
              ab.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew showMoreV false");
            }
            do
            {
              ((bd)localObject1).ziR.setTag(null);
              ((bd)localObject1).ziS.setTag(null);
              ((bd)localObject1).ziR.setVisibility(8);
              ((bd)localObject1).ziS.setVisibility(8);
              break;
              paramInt = 0;
              break label5248;
              if (((bd)localObject1).ziM.getVisibility() == 0)
              {
                ((bd)localObject1).ziR.setTag(parambi);
                ((bd)localObject1).ziR.setOnClickListener(this.zeN);
                ((bd)localObject1).ziR.setVisibility(0);
                ((bd)localObject1).ziS.setVisibility(8);
                break;
              }
            }
            while (((bd)localObject1).ziW.getVisibility() != 0);
            ((bd)localObject1).ziS.setTag(parambi);
            ((bd)localObject1).ziS.setOnClickListener(this.zeN);
            ((bd)localObject1).ziS.setVisibility(0);
            ((bd)localObject1).ziR.setVisibility(8);
          }
          localaw.zij.ziK.setVisibility(8);
          parama1 = bo.nullAsNil((String)localMap.get(".msg.fromusername"));
          j = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.type"), 0);
          ab.i("MicroMsg.ChattingItemDyeingTemplate", "fillingOld extType=%d", new Object[] { Integer.valueOf(j) });
          if (j == 1)
          {
            parama = bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.app.avatar_url"));
            paramString = bo.nullAsNil((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.app.display_name"));
            a(localaw, j.b(this.yJI.yTx.getContext(), paramString, localaw.qkY.getTextSize()));
            localaw.zbv.setTag(null);
            localaw.zbv.setOnClickListener(null);
            o.ahp().a(parama, localaw.zbv, this.yqf);
            ab.d("MicroMsg.ChattingItemDyeingTemplate", "dyeing template talker(%s).", new Object[] { parambi.field_talker });
            if ((!"notifymessage".equals(parambi.field_talker)) && (j != 1))
              break label6268;
            localaw.zii.zil.setVisibility(0);
            localaw.zii.gsf.setTextSize(0, com.tencent.mm.bz.a.al(localaw.zii.gsf.getContext(), 2131427813));
            localaw.zii.jOR.setVisibility(0);
            paramString = w.b.aX(localMap);
            localaw.zii.gsf.setText(paramString.title);
            localaw.zii.ngD.setText(com.tencent.mm.pluginsdk.f.h.formatTime(this.yJI.yTx.getMMResources().getString(2131299933), paramString.time));
            x.a(localaw.zii.ziq, localMap);
            parama = null;
            if (!bo.isNullOrNil(parama1))
            {
              com.tencent.mm.model.aw.ZK();
              parama = com.tencent.mm.model.c.XM().aoO(parama1).Oi();
            }
            if (bo.isNullOrNil(paramString.url))
              break label6314;
            j = 1;
            i = bo.getInt((String)localMap.get(".msg.appmsg.mmreader.category.item.template_op_type"), 0);
            localObject1 = (String)localMap.get(".msg.appmsg.mmreader.category.item.weapp_username");
            if ((i != 1) || (TextUtils.isEmpty((CharSequence)localObject1)))
              break label6320;
            parama1 = new ay(parambi, parama1, paramString.url);
            parama1.position = paramInt;
            localaw.zii.jOR.setTag(parama1);
            localaw.zii.jOR.setOnClickListener(this.lBl);
            j = 1;
            localaw.zii.jOR.setOnLongClickListener(c(this.yJI));
            localaw.zii.jOR.setOnTouchListener(((com.tencent.mm.ui.chatting.c.b.h)this.yJI.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dCZ());
            if (j != 0)
              break label6399;
            localaw.zii.zir.setVisibility(8);
            localaw.zii.zio.setVisibility(8);
            if (com.tencent.mm.m.g.Nv().Nk())
            {
              localaw.zbW.setVisibility(0);
              c(this.yJI, localaw.zbW, new s.o(paramString.fhu, parambi, parama));
            }
            parama = localaw.zii;
            if (bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.show_complaint_button"), 0) != 1)
              break label6426;
            paramInt = 1;
            if (paramInt != 0)
              break label6431;
            ab.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew showMoreV false");
            parama.zim.setTag(null);
            parama.zin.setTag(null);
            parama.zim.setVisibility(8);
            parama.zin.setVisibility(8);
          }
          while (true)
          {
            localaw.zii.jOR.setVisibility(0);
            AppMethodBeat.o(33159);
            break;
            a(localaw, this.yJI, parambi, parama1);
            a(localaw.zbv, this.yJI, parama1, parambi, null);
            if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).mg(parama1))
            {
              localaw.zii.zil.setTag(new ay(parambi, parama1));
              localaw.zii.zil.setOnClickListener(this.zeO);
              break label5588;
            }
            paramString = localaw.zii.zil;
            if (this.yJI.dFx());
            for (parama = this.yJI.getTalkerUserName(); ; parama = null)
            {
              paramString.setTag(new ay(parama1, parama));
              localaw.zii.zil.setOnClickListener(e(this.yJI));
              break;
            }
            localaw.zii.zil.setVisibility(8);
            localaw.zii.gsf.setTextSize(0, com.tencent.mm.bz.a.al(localaw.zii.gsf.getContext(), 2131427496));
            break label5670;
            j = 0;
            break label5794;
            localObject1 = localaw.zii.jOR;
            parama1 = new ay(parambi, false, paramInt, paramString.url, false, this.yJI.dDw(), parama1, parama, paramString.title);
            parama1.cRS = paramString.cRS;
            ((View)localObject1).setTag(parama1);
            localaw.zii.jOR.setOnClickListener(h(this.yJI));
            break label5893;
            label6399: localaw.zii.zir.setVisibility(0);
            localaw.zii.zio.setVisibility(0);
            break label5972;
            paramInt = 0;
            break label6046;
            if (parama.zil.getVisibility() == 0)
            {
              parama.zim.setTag(parambi);
              parama.zim.setOnClickListener(this.zeN);
              parama.zim.setVisibility(0);
              parama.zin.setVisibility(8);
            }
            else
            {
              parama.zin.setTag(parambi);
              parama.zin.setOnClickListener(this.zeN);
              parama.zin.setVisibility(0);
              parama.zim.setVisibility(8);
            }
          }
        }
      }
    }
  }

  protected final void a(c.a parama, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33162);
    if ((paramString == null) || (parama.qkY == null))
      AppMethodBeat.o(33162);
    while (true)
    {
      return;
      parambi = ((f)parama1.aF(f.class)).arj(paramString);
      a(parama, j.b(parama1.yTx.getContext(), parambi, parama.qkY.getTextSize()));
      AppMethodBeat.o(33162);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33160);
    parambi = (ay)paramView.getTag();
    boolean bool;
    if (parambi == null)
    {
      AppMethodBeat.o(33160);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = parambi.position;
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298154));
      bool = true;
      AppMethodBeat.o(33160);
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33161);
    paramMenuItem.getItemId();
    AppMethodBeat.o(33161);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if (paramInt == 318767153);
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

  protected final boolean dHn()
  {
    if (this.zeT == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w
 * JD-Core Version:    0.6.2
 */
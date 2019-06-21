package com.tencent.mm.plugin.fav.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.a.a;
import com.tencent.mm.plugin.fav.a.a.b;
import com.tencent.mm.plugin.fav.a.a.c;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.aaz;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class g extends com.tencent.mm.g.c.bo
{
  public static c.a ccO;
  private static g.a meP;
  private static g.a meQ;

  static
  {
    AppMethodBeat.i(102647);
    ccO = com.tencent.mm.g.c.bo.Hm();
    meP = new g.1();
    meQ = new g.2();
    AppMethodBeat.o(102647);
  }

  public g()
  {
    AppMethodBeat.i(102632);
    this.field_flag = -1;
    this.field_fromUser = "";
    this.field_toUser = "";
    this.field_id = -1;
    this.field_realChatName = "";
    this.field_sourceType = -1;
    this.field_updateTime = -1L;
    this.field_type = -1;
    this.field_updateSeq = -1;
    this.field_xml = "";
    this.field_itemStatus = 0;
    bus();
    AppMethodBeat.o(102632);
  }

  private static void a(String paramString, g.a parama, aay paramaay)
  {
    AppMethodBeat.i(102640);
    if (paramaay == null)
      AppMethodBeat.o(102640);
    while (true)
    {
      return;
      parama.log(paramString + " ----loc item----");
      parama.log(paramString + "  lng: " + paramaay.lng);
      parama.log(paramString + "  lat: " + paramaay.lat);
      parama.log(paramString + "  scale: " + paramaay.cED);
      parama.log(paramString + "  label: " + paramaay.label);
      parama.log(paramString + "  poiname: " + paramaay.cIK);
      AppMethodBeat.o(102640);
    }
  }

  private static void a(String paramString, g.a parama, aaz paramaaz)
  {
    AppMethodBeat.i(102638);
    if (paramaaz == null)
      AppMethodBeat.o(102638);
    while (true)
    {
      return;
      parama.log(paramString + " ----noteInfoItem item----");
      parama.log(paramString + "  author: " + paramaaz.wim);
      parama.log(paramString + "  editor: " + paramaaz.win);
      AppMethodBeat.o(102638);
    }
  }

  private static void a(String paramString, g.a parama, abe paramabe)
  {
    AppMethodBeat.i(102639);
    if (paramabe == null)
      AppMethodBeat.o(102639);
    while (true)
    {
      return;
      parama.log(paramString + " ----product item----");
      parama.log(paramString + "  title: " + paramabe.title);
      parama.log(paramString + "  desc: " + paramabe.desc);
      parama.log(paramString + "  thumbUrl: " + paramabe.thumbUrl);
      parama.log(paramString + "  type: " + paramabe.type);
      AppMethodBeat.o(102639);
    }
  }

  private static void a(String paramString, g.a parama, abo paramabo)
  {
    AppMethodBeat.i(102637);
    if (paramabo == null)
      AppMethodBeat.o(102637);
    while (true)
    {
      return;
      parama.log(paramString + " ----tv item----");
      parama.log(paramString + "  title: " + paramabo.title);
      parama.log(paramString + "  desc: " + paramabo.desc);
      parama.log(paramString + "  thumbUrl: " + paramabo.thumbUrl);
      AppMethodBeat.o(102637);
    }
  }

  private static void a(String paramString, g.a parama, abu paramabu)
  {
    AppMethodBeat.i(102641);
    if (paramabu == null)
      AppMethodBeat.o(102641);
    while (true)
    {
      return;
      parama.log(paramString + " ----url item----");
      parama.log(paramString + "  title: " + paramabu.title);
      parama.log(paramString + "  desc: " + paramabu.desc);
      parama.log(paramString + "  cleanUrl: " + paramabu.wiY);
      parama.log(paramString + "  thumbUrl: " + paramabu.thumbUrl);
      parama.log(paramString + "  opencache: " + paramabu.wja);
      AppMethodBeat.o(102641);
    }
  }

  private void bus()
  {
    AppMethodBeat.i(102633);
    this.field_favProto = new abf();
    abl localabl = new abl();
    localabl.LN(1);
    this.field_favProto.a(localabl);
    this.field_favProto.b(new abu());
    this.field_favProto.b(new aay());
    this.field_favProto.b(new abe());
    this.field_favProto.b(new abo());
    this.field_favProto.LL(-1);
    this.field_tagProto = new abs();
    this.field_favProto.a(new aaz());
    AppMethodBeat.o(102633);
  }

  public static String s(g paramg)
  {
    AppMethodBeat.i(102643);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("<favitem");
    localStringBuffer.append(" type='").append(paramg.field_type).append("'");
    localStringBuffer.append(">");
    Object localObject1 = paramg.field_favProto;
    StringBuilder localStringBuilder = new StringBuilder();
    if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((abf)localObject1).title))
      localStringBuilder.append("<title>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abf)localObject1).title)).append("</title>");
    if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((abf)localObject1).desc))
      localStringBuilder.append("<desc>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abf)localObject1).desc)).append("</desc>");
    if (((abf)localObject1).lgR > 0L)
      localStringBuilder.append("<edittime>").append(((abf)localObject1).lgR).append("</edittime>");
    if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((abf)localObject1).hHV))
    {
      localStringBuilder.append("<remark ");
      if (((abf)localObject1).whH > 0L)
        localStringBuilder.append(" time ='").append(((abf)localObject1).whH).append("'");
      localStringBuilder.append(">").append(com.tencent.mm.sdk.platformtools.bo.ani(((abf)localObject1).hHV)).append("</remark>");
    }
    if (((abf)localObject1).whK)
      localStringBuilder.append("<ctrlflag>").append(((abf)localObject1).whJ).append("</ctrlflag>");
    Object localObject2;
    if (((abf)localObject1).wix)
    {
      localStringBuilder.append("<version>").append(((abf)localObject1).version).append("</version>");
      localObject2 = ((abf)localObject1).wit;
      if ((localObject2 != null) && (((abl)localObject2).computeSize() != 0))
        break label610;
      ab.w("MicroMsg.FavSourceItemParser", "klem toXml, source item empty");
      localObject3 = "";
      label322: localStringBuilder.append((String)localObject3);
      localStringBuilder.append(a.bK(((abf)localObject1).wiv));
      localObject3 = paramg.field_favProto.why;
      if ((localObject3 != null) && (((aay)localObject3).computeSize() != 0))
        break label981;
      ab.d("MicroMsg.FavLocItemParser", "klem toXml, loc item empty");
      localObject3 = "";
      label376: localStringBuilder.append((String)localObject3);
      localObject2 = paramg.field_favProto.whA;
      if ((localObject2 != null) && (((abu)localObject2).computeSize() != 0))
        break label1176;
      ab.d("MicroMsg.FavUrlItemParser", "klem toXml, url item empty");
      localObject3 = "";
      label418: localStringBuilder.append((String)localObject3);
      localObject2 = paramg.field_favProto.whC;
      if ((localObject2 != null) && (((abe)localObject2).computeSize() != 0))
        break label1442;
      ab.d("MicroMsg.FavProductItemParser", "klem toXml, product item empty");
      localObject3 = "";
      label460: localStringBuilder.append((String)localObject3);
      localObject2 = paramg.field_favProto.whE;
      if ((localObject2 != null) && (((abo)localObject2).computeSize() != 0))
        break label1655;
      ab.d("MicroMsg.FavTVItemParser", "klem toXml, product item empty");
      localObject3 = "";
      label502: localStringBuilder.append((String)localObject3);
      localObject3 = ((abf)localObject1).vzK;
      if ((localObject3 != null) && (((aaz)localObject3).computeSize() != 0))
        break label1828;
      ab.w("MicroMsg.FavNoteInfoItemParser", "klem toXml, source item empty");
    }
    for (Object localObject3 = ""; ; localObject3 = ((StringBuffer)localObject1).toString())
    {
      localStringBuilder.append((String)localObject3);
      localStringBuffer.append(localStringBuilder.toString());
      localStringBuffer.append(c.a(paramg.field_tagProto));
      localStringBuffer.append("</favitem>");
      paramg = localStringBuffer.toString();
      AppMethodBeat.o(102643);
      return paramg;
      if (paramg.field_type != 18)
        break;
      localStringBuilder.append("<version>1</version>");
      break;
      label610: localObject3 = new StringBuffer();
      ((StringBuffer)localObject3).append("<source");
      if (((abl)localObject2).whP)
        ((StringBuffer)localObject3).append(" sourcetype='").append(((abl)localObject2).cvp).append("'");
      if (((abl)localObject2).wiD)
        ((StringBuffer)localObject3).append(" sourceid='").append(((abl)localObject2).wiC).append("'");
      ((StringBuffer)localObject3).append(">");
      if (((abl)localObject2).whQ)
        ((StringBuffer)localObject3).append("<fromusr>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abl)localObject2).cEV)).append("</fromusr>");
      if (((abl)localObject2).whR)
        ((StringBuffer)localObject3).append("<tousr>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abl)localObject2).toUser)).append("</tousr>");
      if (((abl)localObject2).whV)
        ((StringBuffer)localObject3).append("<realchatname>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abl)localObject2).whU)).append("</realchatname>");
      if (((abl)localObject2).whW)
        ((StringBuffer)localObject3).append("<msgid>").append(((abl)localObject2).cJb).append("</msgid>");
      if (((abl)localObject2).whX)
        ((StringBuffer)localObject3).append("<eventid>").append(((abl)localObject2).cOS).append("</eventid>");
      if (((abl)localObject2).whY)
        ((StringBuffer)localObject3).append("<appid>").append(((abl)localObject2).appId).append("</appid>");
      if (((abl)localObject2).whZ)
        ((StringBuffer)localObject3).append("<link>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abl)localObject2).link)).append("</link>");
      if (((abl)localObject2).wic)
        ((StringBuffer)localObject3).append("<brandid>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abl)localObject2).csl)).append("</brandid>");
      ((StringBuffer)localObject3).append("</source>");
      localObject3 = ((StringBuffer)localObject3).toString();
      break label322;
      label981: localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append("<locitem>");
      if (((aay)localObject3).wik)
        ((StringBuffer)localObject2).append("<label>").append(com.tencent.mm.sdk.platformtools.bo.ani(((aay)localObject3).label)).append("</label>");
      if (((aay)localObject3).wii)
        ((StringBuffer)localObject2).append("<lat>").append(((aay)localObject3).lat).append("</lat>");
      if (((aay)localObject3).wih)
        ((StringBuffer)localObject2).append("<lng>").append(((aay)localObject3).lng).append("</lng>");
      if (((aay)localObject3).wij)
        ((StringBuffer)localObject2).append("<scale>").append(((aay)localObject3).cED).append("</scale>");
      if (((aay)localObject3).wil)
        ((StringBuffer)localObject2).append("<poiname>").append(((aay)localObject3).cIK).append("</poiname>");
      ((StringBuffer)localObject2).append("</locitem>");
      localObject3 = ((StringBuffer)localObject2).toString();
      break label376;
      label1176: localObject3 = new StringBuffer();
      ((StringBuffer)localObject3).append("<weburlitem>");
      if (((abu)localObject2).wiZ)
        ((StringBuffer)localObject3).append("<clean_url>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abu)localObject2).wiY)).append("</clean_url>");
      if (((abu)localObject2).wfT)
        ((StringBuffer)localObject3).append("<pagedesc>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abu)localObject2).desc)).append("</pagedesc>");
      if (((abu)localObject2).wiq)
        ((StringBuffer)localObject3).append("<pagethumb_url>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abu)localObject2).thumbUrl)).append("</pagethumb_url>");
      if (((abu)localObject2).wfS)
        ((StringBuffer)localObject3).append("<pagetitle>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abu)localObject2).title)).append("</pagetitle>");
      if (((abu)localObject2).wjb)
        ((StringBuffer)localObject3).append("<opencache>").append(((abu)localObject2).wja).append("</opencache>");
      if (((abu)localObject2).wjc)
        ((StringBuffer)localObject3).append("<contentattr>").append(((abu)localObject2).fgt).append("</contentattr>");
      if (((abu)localObject2).whe)
        ((StringBuffer)localObject3).append("<canvasPageXml>").append(((abu)localObject2).canvasPageXml).append("</canvasPageXml>");
      ((StringBuffer)localObject3).append("</weburlitem>");
      localObject3 = ((StringBuffer)localObject3).toString();
      break label418;
      label1442: localObject3 = new StringBuffer();
      ((StringBuffer)localObject3).append("<productitem");
      if (((abe)localObject2).wis)
        ((StringBuffer)localObject3).append(" type='").append(((abe)localObject2).type).append("'");
      ((StringBuffer)localObject3).append(">");
      if (((abe)localObject2).wfS)
        ((StringBuffer)localObject3).append("<producttitle>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abe)localObject2).title)).append("</producttitle>");
      if (((abe)localObject2).wfT)
        ((StringBuffer)localObject3).append("<productdesc>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abe)localObject2).desc)).append("</productdesc>");
      if (((abe)localObject2).wiq)
        ((StringBuffer)localObject3).append("<productthumb_url>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abe)localObject2).thumbUrl)).append("</productthumb_url>");
      if (((abe)localObject2).wir)
        ((StringBuffer)localObject3).append("<productinfo>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abe)localObject2).info)).append("</productinfo>");
      ((StringBuffer)localObject3).append("</productitem>");
      localObject3 = ((StringBuffer)localObject3).toString();
      break label460;
      label1655: localObject3 = new StringBuffer();
      ((StringBuffer)localObject3).append("<tvitem>");
      if (((abo)localObject2).wfS)
        ((StringBuffer)localObject3).append("<tvtitle>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abo)localObject2).title)).append("</tvtitle>");
      if (((abo)localObject2).wfT)
        ((StringBuffer)localObject3).append("<tvdesc>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abo)localObject2).desc)).append("</tvdesc>");
      if (((abo)localObject2).wiq)
        ((StringBuffer)localObject3).append("<tvthumb_url>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abo)localObject2).thumbUrl)).append("</tvthumb_url>");
      if (((abo)localObject2).wir)
        ((StringBuffer)localObject3).append("<tvinfo>").append(com.tencent.mm.sdk.platformtools.bo.ani(((abo)localObject2).info)).append("</tvinfo>");
      ((StringBuffer)localObject3).append("</tvitem>");
      localObject3 = ((StringBuffer)localObject3).toString();
      break label502;
      label1828: localObject1 = new StringBuffer();
      ((StringBuffer)localObject1).append("<noteinfo>");
      ((StringBuffer)localObject1).append("<noteauthor>").append(com.tencent.mm.sdk.platformtools.bo.ani(((aaz)localObject3).wim)).append("</noteauthor>");
      ((StringBuffer)localObject1).append("<noteeditor>").append(com.tencent.mm.sdk.platformtools.bo.ani(((aaz)localObject3).win)).append("</noteeditor>");
      ((StringBuffer)localObject1).append("</noteinfo>");
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final g LH(String paramString)
  {
    AppMethodBeat.i(102635);
    if ((paramString == null) || (paramString.equals("")))
    {
      ab.e("MicroMsg.FavItemInfo", "klem, FavItemInfo xml null");
      AppMethodBeat.o(102635);
    }
    while (true)
    {
      return this;
      Map localMap = br.z(paramString, "favitem");
      if (localMap == null)
      {
        ab.e("MicroMsg.FavItemInfo", "klem, FavItemInfo maps null");
        AppMethodBeat.o(102635);
        continue;
      }
      try
      {
        bus();
        Object localObject1 = this.field_favProto;
        ((abf)localObject1).alB((String)localMap.get(".favitem.title"));
        ((abf)localObject1).alC((String)localMap.get(".favitem.desc"));
        ((abf)localObject1).alA((String)localMap.get(".favitem.remark"));
        ((abf)localObject1).mj(com.tencent.mm.sdk.platformtools.bo.getLong((String)localMap.get(".favitem.remark.$time"), 0L));
        Object localObject2 = (String)localMap.get(".favitem.edittime");
        ((abf)localObject1).LM(com.tencent.mm.sdk.platformtools.bo.getInt((String)localMap.get(".favitem.version"), 0));
        ((abf)localObject1).mk(com.tencent.mm.sdk.platformtools.bo.getLong((String)localObject2, 0L));
        ((abf)localObject1).LL(com.tencent.mm.sdk.platformtools.bo.getInt((String)localMap.get(".favitem.ctrlflag"), -1));
        localObject2 = ((abf)localObject1).wit;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).LN(com.tencent.mm.sdk.platformtools.bo.getInt((String)localMap.get(".favitem.source" + ".$sourcetype"), 0));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).alF((String)localMap.get(".favitem.source" + ".$sourceid"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).alD((String)localMap.get(".favitem.source" + ".fromusr"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).alE((String)localMap.get(".favitem.source" + ".tousr"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).alG((String)localMap.get(".favitem.source" + ".realchatname"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).ml(com.tencent.mm.sdk.platformtools.bo.getLong((String)localMap.get(".favitem.source" + ".createtime"), 0L));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).alH((String)localMap.get(".favitem.source" + ".msgid"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).alI((String)localMap.get(".favitem.source" + ".eventid"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).alJ((String)localMap.get(".favitem.source" + ".appid"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).alK((String)localMap.get(".favitem.source" + ".link"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((abl)localObject2).alL((String)localMap.get(".favitem.source" + ".brandid"));
        b.a(paramString, (abf)localObject1);
        paramString = ((abf)localObject1).why;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil((String)localMap.get(".favitem.locitem" + ".label")))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alu((String)localMap.get(".favitem.locitem" + ".label"));
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil((String)localMap.get(".favitem.locitem" + ".poiname")))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alv((String)localMap.get(".favitem.locitem" + ".poiname"));
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = (String)localMap.get(".favitem.locitem" + ".lng");
        if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil((String)localObject2))
          paramString.D(com.tencent.mm.sdk.platformtools.bo.getDouble((String)localObject2, 0.0D));
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = (String)localMap.get(".favitem.locitem" + ".lat");
        if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil((String)localObject2))
          paramString.E(com.tencent.mm.sdk.platformtools.bo.getDouble((String)localObject2, 0.0D));
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = (String)localMap.get(".favitem.locitem" + ".scale");
        if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil((String)localObject2))
        {
          if (((String)localObject2).indexOf('.') == -1)
            break label2181;
          paramString.LJ(com.tencent.mm.sdk.platformtools.bo.getInt(((String)localObject2).substring(0, ((String)localObject2).indexOf('.')), -1));
        }
        while (true)
        {
          paramString = ((abf)localObject1).whA;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alS((String)localMap.get(".favitem.weburlitem" + ".clean_url"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alR((String)localMap.get(".favitem.weburlitem" + ".pagedesc"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alT((String)localMap.get(".favitem.weburlitem" + ".pagethumb_url"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alQ((String)localMap.get(".favitem.weburlitem" + ".pagetitle"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.LO(com.tencent.mm.sdk.platformtools.bo.getInt((String)localMap.get(".favitem.weburlitem" + ".opencache"), 0));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.LP(com.tencent.mm.sdk.platformtools.bo.getInt((String)localMap.get(".favitem.weburlitem" + ".contentattr"), 0));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alU((String)localMap.get(".favitem.weburlitem" + ".canvasPageXml"));
          paramString = ((abf)localObject1).whC;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alw((String)localMap.get(".favitem.productitem" + ".producttitle"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alx((String)localMap.get(".favitem.productitem" + ".productdesc"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.aly((String)localMap.get(".favitem.productitem" + ".productthumb_url"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alz((String)localMap.get(".favitem.productitem" + ".productinfo"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.LK(com.tencent.mm.sdk.platformtools.bo.getInt((String)localMap.get(".favitem.productitem" + ".$type"), 0));
          paramString = ((abf)localObject1).whE;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alM((String)localMap.get(".favitem.tvitem" + ".tvtitle"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alN((String)localMap.get(".favitem.tvitem" + ".tvdesc"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alO((String)localMap.get(".favitem.tvitem" + ".tvthumb_url"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.alP((String)localMap.get(".favitem.tvitem" + ".tvinfo"));
          paramString = ((abf)localObject1).vzK;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.wim = ((String)localMap.get(".favitem.noteinfo" + ".noteauthor"));
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          paramString.win = ((String)localMap.get(".favitem.noteinfo" + ".noteeditor"));
          paramString = ((abf)localObject1).whN;
          if (paramString != null)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            paramString.username = ((String)localMap.get(".favitem.appbranditem" + ".username"));
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            paramString.appId = ((String)localMap.get(".favitem.appbranditem" + ".appid"));
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            paramString.cBc = com.tencent.mm.sdk.platformtools.bo.getInt((String)localMap.get(".favitem.appbranditem" + ".pkgtype"), 0);
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            paramString.iconUrl = ((String)localMap.get(".favitem.appbranditem" + ".iconurl"));
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            paramString.type = com.tencent.mm.sdk.platformtools.bo.getInt((String)localMap.get(".favitem.appbranditem" + ".type"), 0);
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            paramString.csu = ((String)localMap.get(".favitem.appbranditem" + ".pagepath"));
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            paramString.wfO = ((String)localMap.get(".favitem.appbranditem" + ".sourcedisplayname"));
          }
          if (this.field_favProto.wit != null)
          {
            paramString = this.field_favProto.wit;
            this.field_sourceId = paramString.wiC;
            this.field_sourceType = paramString.cvp;
            this.field_fromUser = paramString.cEV;
            this.field_toUser = paramString.toUser;
          }
          this.field_edittime = this.field_favProto.lgR;
          c.a(localMap, this.field_tagProto);
          AppMethodBeat.o(102635);
          break;
          label2181: paramString.LJ(com.tencent.mm.sdk.platformtools.bo.getInt((String)localObject2, -1));
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.FavItemInfo", paramString, "", new Object[0]);
          ab.e("MicroMsg.FavItemInfo", "klem , FavItemInfo exception:+%s", new Object[] { paramString.toString() });
        }
      }
    }
  }

  public final void LI(String paramString)
  {
    AppMethodBeat.i(102636);
    g.a locala = meP;
    locala.log("----dump favitem from[" + paramString + "] beg----");
    locala.log("type: " + this.field_type);
    locala.log("favId: " + this.field_id);
    locala.log("localId: " + this.field_localId);
    locala.log("itemStatus: " + this.field_itemStatus);
    locala.log("localSeq: " + this.field_localSeq);
    locala.log("updateSeq: " + this.field_updateSeq);
    locala.log("ctrlFlag: " + this.field_flag);
    locala.log("sourceId: " + this.field_sourceId);
    locala.log("sourceType: " + this.field_sourceType);
    locala.log("sourceCreateTime: " + this.field_sourceCreateTime);
    locala.log("updateTime: " + this.field_updateTime);
    locala.log("editTime: " + this.field_edittime);
    locala.log("fromuser: " + this.field_fromUser);
    locala.log("toUser: " + this.field_toUser);
    locala.log("realChatName: " + this.field_realChatName);
    if (this.field_favProto != null)
    {
      locala.log("remarktime: " + this.field_favProto.whH);
      locala.log("dataitemCount: " + this.field_favProto.wiv.size());
      if (this.field_favProto.wit != null)
      {
        locala.log(" ----source item----");
        paramString = this.field_favProto.wit;
        locala.log("  sourceType: " + paramString.cvp);
        locala.log("  fromUser: " + paramString.cEV);
        locala.log("  toUser: " + paramString.toUser);
        locala.log("  sourceId: " + paramString.wiC);
        locala.log("  realChatName: " + paramString.whU);
        locala.log("  createTime: " + paramString.createTime);
        locala.log("  msgId: " + paramString.cJb);
        locala.log("  eventId: " + paramString.cOS);
        locala.log("  appId: " + paramString.appId);
        locala.log("  link: " + paramString.link);
        locala.log("  mediaId: " + paramString.wia);
        locala.log("  brandId: " + paramString.csl);
      }
      paramString = this.field_favProto.wiv.iterator();
      for (int i = 0; paramString.hasNext(); i++)
      {
        aar localaar = (aar)paramString.next();
        locala.log(" ----data item " + i + "----");
        locala.log("  dataId: " + localaar.mnd);
        locala.log("  dataType: " + localaar.dataType);
        locala.log("  dataSouceId: " + localaar.wgH);
        locala.log("  svrDataStatus: " + localaar.wgP);
        locala.log("  cdnThumbUrl: " + localaar.fgE);
        locala.log("  cdnThumbKey: " + localaar.wfV);
        locala.log("  cdnDataUrl: " + localaar.wfZ);
        locala.log("  cdnDataKey: " + localaar.wgb);
        locala.log("  cdnEncryVer: " + localaar.wgd);
        locala.log("  fullmd5: " + localaar.wgq);
        locala.log("  head256md5: " + localaar.wgs);
        locala.log("  fullsize: " + localaar.wgu);
        locala.log("  thumbMd5: " + localaar.wgB);
        locala.log("  thumbHead256md5: " + localaar.wgD);
        locala.log("  thumbfullsize: " + localaar.wgF);
        locala.log("  duration: " + localaar.duration);
        locala.log("  datafmt: " + localaar.wgo);
        locala.log("  streamWebUrl: " + localaar.wgg);
        locala.log("  streamDataUrl: " + localaar.wgi);
        locala.log("  streamLowBandUrl: " + localaar.wgk);
        locala.log("  ext: " + localaar.cvq);
        if (localaar.wgT != null)
        {
          locala.log("  remarktime: " + localaar.wgT.whH);
          locala.log("  ctrlflag: " + localaar.wgT.whJ);
          locala.log("  edittime: " + localaar.wgT.lgR);
          if (localaar.wgT.whw != null)
          {
            locala.log("   ----data source item----");
            aat localaat = localaar.wgT.whw;
            locala.log("    sourceType: " + localaat.cvp);
            locala.log("    fromUser: " + localaat.cEV);
            locala.log("    toUser: " + localaat.toUser);
            locala.log("    realChatName: " + localaat.whU);
            locala.log("    createTime: " + localaat.createTime);
            locala.log("    msgId: " + localaat.cJb);
            locala.log("    eventId: " + localaat.cOS);
            locala.log("    appId: " + localaat.appId);
            locala.log("    link: " + localaat.link);
            locala.log("    mediaId: " + localaat.wia);
            locala.log("    brandId: " + localaat.csl);
          }
          a("  ", locala, localaar.wgT.why);
          a("  ", locala, localaar.wgT.whA);
          a("  ", locala, localaar.wgT.whC);
          a("  ", locala, localaar.wgT.whE);
          a("  ", locala, localaar.wgT.vzK);
        }
      }
      a("", locala, this.field_favProto.why);
      a("", locala, this.field_favProto.whA);
      a("", locala, this.field_favProto.whC);
      a("", locala, this.field_favProto.whE);
      a("  ", locala, this.field_favProto.vzK);
    }
    locala.log("----dump favitem end----");
    AppMethodBeat.o(102636);
  }

  public final boolean LJ(String paramString)
  {
    AppMethodBeat.i(102642);
    boolean bool;
    if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(102642);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = this.field_tagProto.wiJ.iterator();
      while (true)
        if (localIterator.hasNext())
          if (paramString.equals((String)localIterator.next()))
          {
            AppMethodBeat.o(102642);
            bool = false;
            break;
          }
      this.field_tagProto.wiJ.add(paramString);
      bool = true;
      AppMethodBeat.o(102642);
    }
  }

  public final boolean buA()
  {
    if ((this.field_itemStatus == 12) || (this.field_itemStatus == 13) || (this.field_itemStatus == 14));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final g buB()
  {
    AppMethodBeat.i(102644);
    g localg = new g();
    localg.field_favProto = this.field_favProto;
    localg.field_sourceId = this.field_sourceId;
    localg.field_edittime = this.field_edittime;
    localg.field_ext = this.field_ext;
    localg.field_flag = this.field_flag;
    localg.field_fromUser = this.field_fromUser;
    localg.field_id = this.field_id;
    localg.field_itemStatus = this.field_itemStatus;
    localg.field_localId = this.field_localId;
    localg.field_localSeq = this.field_localSeq;
    localg.field_realChatName = this.field_realChatName;
    localg.field_tagProto = this.field_tagProto;
    localg.field_sourceCreateTime = this.field_sourceCreateTime;
    localg.field_updateSeq = this.field_updateSeq;
    localg.field_toUser = this.field_toUser;
    localg.field_updateTime = this.field_updateTime;
    localg.field_type = this.field_type;
    localg.field_xml = this.field_xml;
    localg.field_datatotalsize = this.field_datatotalsize;
    AppMethodBeat.o(102644);
    return localg;
  }

  public final boolean buC()
  {
    AppMethodBeat.i(102645);
    Iterator localIterator = this.field_favProto.wiv.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (((aar)localIterator.next()).whl != 0)
      {
        bool = true;
        AppMethodBeat.o(102645);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(102645);
    }
  }

  public final boolean but()
  {
    if ((this.field_favProto.whJ & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean buu()
  {
    if ((this.field_favProto.whJ & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final Bundle buv()
  {
    AppMethodBeat.i(102634);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("key_ctrl_flag_open_chat", but());
    localBundle.putBoolean("key_ctrl_flag_open_sns", buu());
    if ((this.field_favProto.whJ & 0x4) != 0)
    {
      bool = true;
      localBundle.putBoolean("key_ctrl_flag_open_weibo", bool);
      if ((this.field_favProto.whJ & 0x8) == 0)
        break label183;
      bool = true;
      label73: localBundle.putBoolean("key_ctrl_flag_open_cplink", bool);
      if ((this.field_favProto.whJ & 0x10) == 0)
        break label188;
      bool = true;
      label96: localBundle.putBoolean("key_ctrl_flag_open_browser", bool);
      if ((this.field_favProto.whJ & 0x20) == 0)
        break label193;
      bool = true;
      label119: localBundle.putBoolean("key_ctrl_flag_open_weiyun", bool);
      if ((this.field_favProto.whJ & 0x40) == 0)
        break label198;
    }
    label183: label188: label193: label198: for (boolean bool = true; ; bool = false)
    {
      localBundle.putBoolean("key_ctrl_flag_open_facebook", bool);
      ab.i("MicroMsg.FavItemInfo", "get ctrl args=[%s]", new Object[] { localBundle.toString() });
      AppMethodBeat.o(102634);
      return localBundle;
      bool = false;
      break;
      bool = false;
      break label73;
      bool = false;
      break label96;
      bool = false;
      break label119;
    }
  }

  public final boolean buw()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (this.field_itemStatus != 1)
    {
      bool2 = bool1;
      if (this.field_itemStatus != 4)
      {
        bool2 = bool1;
        if (this.field_itemStatus != 9)
        {
          bool2 = bool1;
          if (this.field_itemStatus != 12)
          {
            bool2 = bool1;
            if (this.field_itemStatus != 13)
            {
              bool2 = bool1;
              if (this.field_itemStatus != 15)
                if (this.field_itemStatus != 17)
                  break label79;
            }
          }
        }
      }
    }
    label79: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public final boolean bux()
  {
    if ((this.field_itemStatus == 3) || (this.field_itemStatus == 6) || (this.field_itemStatus == 11) || (this.field_itemStatus == 14) || (this.field_itemStatus == 16) || (this.field_itemStatus == 18));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean buy()
  {
    if (this.field_itemStatus == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean buz()
  {
    if ((this.field_itemStatus == 15) || (this.field_itemStatus == 16));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isDone()
  {
    if (this.field_itemStatus == 10);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isDownloading()
  {
    if (this.field_itemStatus == 7);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.g
 * JD-Core Version:    0.6.2
 */
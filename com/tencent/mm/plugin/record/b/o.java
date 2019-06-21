package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.model.t;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class o
{
  public static String bK(List<aar> paramList)
  {
    AppMethodBeat.i(135721);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.w("MicroMsg.RecordMsgParser", "klem toXml data list empty");
      paramList = "";
      AppMethodBeat.o(135721);
    }
    while (true)
    {
      return paramList;
      int i = paramList.size();
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("<datalist count='").append(i).append("'>");
      int j = 0;
      if (j < i)
      {
        Object localObject1 = (aar)paramList.get(j);
        localStringBuffer.append("<dataitem ");
        if (((aar)localObject1).wgn)
          localStringBuffer.append("datatype='").append(((aar)localObject1).dataType).append("'");
        if (((aar)localObject1).wgQ)
          localStringBuffer.append(" datastatus='").append(((aar)localObject1).wgP).append("'");
        if (((aar)localObject1).wgw)
          localStringBuffer.append(" dataid='").append(((aar)localObject1).mnd).append("'");
        if (((aar)localObject1).whc)
          localStringBuffer.append(" htmlid='").append(((aar)localObject1).whb).append("'");
        if (((aar)localObject1).whi)
          localStringBuffer.append(" dataillegaltype='").append(((aar)localObject1).whh).append("'");
        if (((aar)localObject1).wgI)
          localStringBuffer.append(" datasourceid='").append(((aar)localObject1).wgH).append("'");
        localStringBuffer.append(">");
        if (((aar)localObject1).wgp)
          localStringBuffer.append("<datafmt>").append(((aar)localObject1).wgo).append("</datafmt>");
        if (((aar)localObject1).wfS)
          localStringBuffer.append("<datatitle>").append(bo.ani(((aar)localObject1).title)).append("</datatitle>");
        if (((aar)localObject1).wfT)
          localStringBuffer.append("<datadesc>").append(bo.ani(((aar)localObject1).desc)).append("</datadesc>");
        if (((aar)localObject1).wfU)
          localStringBuffer.append("<cdnthumburl>").append(bo.ani(((aar)localObject1).fgE)).append("</cdnthumburl>");
        if (((aar)localObject1).wfX)
          localStringBuffer.append("<thumbwidth>").append(((aar)localObject1).fgJ).append("</thumbwidth>");
        if (((aar)localObject1).wfY)
          localStringBuffer.append("<thumbheight>").append(((aar)localObject1).fgI).append("</thumbheight>");
        if (((aar)localObject1).wga)
          localStringBuffer.append("<cdndataurl>").append(bo.ani(((aar)localObject1).wfZ)).append("</cdndataurl>");
        if (((aar)localObject1).wfW)
          localStringBuffer.append("<cdnthumbkey>").append(bo.ani(((aar)localObject1).wfV)).append("</cdnthumbkey>");
        if (((aar)localObject1).wgc)
          localStringBuffer.append("<cdndatakey>").append(bo.ani(((aar)localObject1).wgb)).append("</cdndatakey>");
        if (((aar)localObject1).wge)
          localStringBuffer.append("<cdnencryver>").append(((aar)localObject1).wgd).append("</cdnencryver>");
        if (((aar)localObject1).wgf)
          localStringBuffer.append("<duration>").append(((aar)localObject1).duration).append("</duration>");
        if (((aar)localObject1).wgh)
          localStringBuffer.append("<streamweburl>").append(bo.ani(((aar)localObject1).wgg)).append("</streamweburl>");
        if (((aar)localObject1).wgj)
          localStringBuffer.append("<streamdataurl>").append(bo.ani(((aar)localObject1).wgi)).append("</streamdataurl>");
        if (((aar)localObject1).wgl)
          localStringBuffer.append("<streamlowbandurl>").append(bo.ani(((aar)localObject1).wgk)).append("</streamlowbandurl>");
        if (((aar)localObject1).wgm)
          localStringBuffer.append("<dataext>").append(bo.ani(((aar)localObject1).cvq)).append("</dataext>");
        if (((aar)localObject1).wgr)
          localStringBuffer.append("<fullmd5>").append(((aar)localObject1).wgq).append("</fullmd5>");
        if (((aar)localObject1).wgt)
          localStringBuffer.append("<head256md5>").append(((aar)localObject1).wgs).append("</head256md5>");
        if (((aar)localObject1).wgv)
          localStringBuffer.append("<datasize>").append(((aar)localObject1).wgu).append("</datasize>");
        if (((aar)localObject1).wgC)
          localStringBuffer.append("<thumbfullmd5>").append(((aar)localObject1).wgB).append("</thumbfullmd5>");
        if (((aar)localObject1).wgE)
          localStringBuffer.append("<thumbhead256md5>").append(((aar)localObject1).wgD).append("</thumbhead256md5>");
        if (((aar)localObject1).wgG)
          localStringBuffer.append("<thumbsize>").append(((aar)localObject1).wgF).append("</thumbsize>");
        if (((aar)localObject1).wgK)
          localStringBuffer.append("<streamvideoid>").append(bo.ani(((aar)localObject1).wgJ)).append("</streamvideoid>");
        if (((aar)localObject1).wgS)
          localStringBuffer.append("<sourcetitle>").append(bo.ani(((aar)localObject1).wgR)).append("</sourcetitle>");
        if (((aar)localObject1).wgW)
          localStringBuffer.append("<sourcename>").append(bo.ani(((aar)localObject1).wgV)).append("</sourcename>");
        if (((aar)localObject1).whv)
          localStringBuffer.append("<sourcedesc>").append(bo.ani(((aar)localObject1).whu)).append("</sourcedesc>");
        if (((aar)localObject1).wgY)
          localStringBuffer.append("<sourcetime>").append(bo.ani(((aar)localObject1).wgX)).append("</sourcetime>");
        if (((aar)localObject1).whd)
          localStringBuffer.append("<statextstr>").append(bo.ani(((aar)localObject1).cMn)).append("</statextstr>");
        if (((aar)localObject1).whk)
          localStringBuffer.append("<recordxml>").append(((aar)localObject1).whj).append("</recordxml>");
        Object localObject2 = ((aar)localObject1).wgT;
        if ((localObject2 == null) || (((aas)localObject2).whw == null) || (((aas)localObject2).whw.computeSize() == 0))
        {
          ab.w("MicroMsg.RecordMsgParser", "klem toXml, data source item empty");
          label1167: localObject2 = ((aar)localObject1).wgT;
          if ((localObject2 != null) && (((aas)localObject2).why != null) && (((aas)localObject2).why.computeSize() != 0))
            break label1650;
          ab.w("MicroMsg.RecordMsgParser", "klem toXml, loc item empty");
          label1206: localObject2 = ((aar)localObject1).wgT;
          if ((localObject2 != null) && (((aas)localObject2).whA != null) && (((aas)localObject2).whA.computeSize() != 0))
            break label1829;
          ab.w("MicroMsg.RecordMsgParser", "klem toXml, url item empty");
          label1245: localObject2 = ((aar)localObject1).wgT;
          if ((localObject2 != null) && (((aas)localObject2).whC != null) && (((aas)localObject2).whC.computeSize() != 0))
            break label2047;
          ab.w("MicroMsg.RecordMsgParser", "klem toXml, product item empty");
          label1284: localObject2 = ((aar)localObject1).wgT;
          if ((localObject2 != null) && (((aas)localObject2).whE != null) && (((aas)localObject2).whE.computeSize() != 0))
            break label2241;
          ab.w("MicroMsg.RecordMsgParser", "klem toXml, product item empty");
          label1323: localObject1 = ((aar)localObject1).wgT;
          if ((localObject1 != null) && (((aas)localObject1).whN != null))
            break label2399;
          ab.e("MicroMsg.RecordMsgParser", "setAppBrandXml toXml, item empty");
        }
        while (true)
        {
          localStringBuffer.append("</dataitem>");
          j++;
          break;
          localObject2 = ((aas)localObject2).whw;
          if (((aat)localObject2).whY)
            localStringBuffer.append("<appid>").append(((aat)localObject2).appId).append("</appid>");
          if (((aat)localObject2).whZ)
            localStringBuffer.append("<link>").append(bo.ani(((aat)localObject2).link)).append("</link>");
          if (((aat)localObject2).wic)
            localStringBuffer.append("<brandid>").append(bo.ani(((aat)localObject2).csl)).append("</brandid>");
          if ((((aat)localObject2).whQ) && (((aat)localObject2).whV))
          {
            if (((aat)localObject2).cEV.equals(((aat)localObject2).whU))
            {
              localStringBuffer.append("<dataitemsource><fromusr>").append(bo.ani(((aat)localObject2).cEV)).append("</fromusr></dataitemsource>");
              break label1167;
            }
            if ((!t.kH(((aat)localObject2).cEV)) && (!e.rr(((aat)localObject2).whU)))
              break label1167;
            localStringBuffer.append("<dataitemsource><realchatname>").append(bo.ani(((aat)localObject2).whU)).append("</realchatname></dataitemsource>");
            break label1167;
          }
          if (((aat)localObject2).whQ)
          {
            localStringBuffer.append("<dataitemsource><fromusr>").append(bo.ani(((aat)localObject2).cEV)).append("</fromusr></dataitemsource>");
            break label1167;
          }
          if (!((aat)localObject2).whV)
            break label1167;
          localStringBuffer.append("<dataitemsource><realchatname>").append(bo.ani(((aat)localObject2).whU)).append("</realchatname></dataitemsource>");
          break label1167;
          label1650: localObject2 = ((aas)localObject2).why;
          localStringBuffer.append("<locitem>");
          if (((aay)localObject2).wik)
            localStringBuffer.append("<label>").append(bo.ani(((aay)localObject2).label)).append("</label>");
          if (((aay)localObject2).wii)
            localStringBuffer.append("<lat>").append(((aay)localObject2).lat).append("</lat>");
          if (((aay)localObject2).wih)
            localStringBuffer.append("<lng>").append(((aay)localObject2).lng).append("</lng>");
          if (((aay)localObject2).wij)
            localStringBuffer.append("<scale>").append(((aay)localObject2).cED).append("</scale>");
          if (((aay)localObject2).wil)
            localStringBuffer.append("<poiname>").append(((aay)localObject2).cIK).append("</poiname>");
          localStringBuffer.append("</locitem>");
          break label1206;
          label1829: localObject2 = ((aas)localObject2).whA;
          localStringBuffer.append("<weburlitem>");
          if (((abu)localObject2).wiZ)
            localStringBuffer.append("<link>").append(bo.ani(((abu)localObject2).wiY)).append("</link>");
          if (((abu)localObject2).wfT)
            localStringBuffer.append("<desc>").append(bo.ani(((abu)localObject2).desc)).append("</desc>");
          if (((abu)localObject2).wiq)
            localStringBuffer.append("<thumburl>").append(bo.ani(((abu)localObject2).thumbUrl)).append("</thumburl>");
          if (((abu)localObject2).wfS)
            localStringBuffer.append("<title>").append(bo.ani(((abu)localObject2).title)).append("</title>");
          if (((abu)localObject2).wjb)
            localStringBuffer.append("<opencache>").append(((abu)localObject2).wja).append("</opencache>");
          if (((abu)localObject2).wjc)
            localStringBuffer.append("<contentattr>").append(((abu)localObject2).fgt).append("</contentattr>");
          localStringBuffer.append("</weburlitem>");
          break label1245;
          label2047: localObject2 = ((aas)localObject2).whC;
          localStringBuffer.append("<productitem");
          if (((abe)localObject2).wis)
            localStringBuffer.append(" type='").append(((abe)localObject2).type).append("'");
          localStringBuffer.append(">");
          if (((abe)localObject2).wfS)
            localStringBuffer.append("<title>").append(bo.ani(((abe)localObject2).title)).append("</title>");
          if (((abe)localObject2).wfT)
            localStringBuffer.append("<desc>").append(bo.ani(((abe)localObject2).desc)).append("</desc>");
          if (((abe)localObject2).wiq)
            localStringBuffer.append("<thumburl>").append(bo.ani(((abe)localObject2).thumbUrl)).append("</thumburl>");
          if (((abe)localObject2).wir)
            localStringBuffer.append("<productinfo>").append(bo.ani(((abe)localObject2).info)).append("</productinfo>");
          localStringBuffer.append("</productitem>");
          break label1284;
          label2241: localObject2 = ((aas)localObject2).whE;
          localStringBuffer.append("<tvitem>");
          if (((abo)localObject2).wfS)
            localStringBuffer.append("<title>").append(bo.ani(((abo)localObject2).title)).append("</title>");
          if (((abo)localObject2).wfT)
            localStringBuffer.append("<desc>").append(bo.ani(((abo)localObject2).desc)).append("</desc>");
          if (((abo)localObject2).wiq)
            localStringBuffer.append("<thumburl>").append(bo.ani(((abo)localObject2).thumbUrl)).append("</thumburl>");
          if (((abo)localObject2).wir)
            localStringBuffer.append("<tvinfo>").append(bo.ani(((abo)localObject2).info)).append("</tvinfo>");
          localStringBuffer.append("</tvitem>");
          break label1323;
          label2399: localObject1 = ((aas)localObject1).whN;
          if (localObject1 != null)
          {
            localStringBuffer.append("<appbranditem>");
            localStringBuffer.append("<username>").append(bo.ani(((aap)localObject1).username)).append("</username>");
            localStringBuffer.append("<appid>").append(bo.ani(((aap)localObject1).appId)).append("</appid>");
            localStringBuffer.append("<pkgtype>").append(((aap)localObject1).cBc).append("</pkgtype>");
            localStringBuffer.append("<iconurl>").append(bo.ani(((aap)localObject1).iconUrl)).append("</iconurl>");
            localStringBuffer.append("<type>").append(((aap)localObject1).type).append("</type>");
            localStringBuffer.append("<pagepath>").append(bo.ani(((aap)localObject1).csu)).append("</pagepath>");
            localStringBuffer.append("<sourcedisplayname>").append(bo.ani(((aap)localObject1).wfO)).append("</sourcedisplayname>");
            localStringBuffer.append("</appbranditem>");
          }
        }
      }
      localStringBuffer.append("</datalist>");
      paramList = localStringBuffer.toString();
      AppMethodBeat.o(135721);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.o
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.fav.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class a
{
  public static String bK(List<aar> paramList)
  {
    AppMethodBeat.i(102754);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.v("MicroMsg.FavDataItemParser", "klem toXml data list empty");
      paramList = "";
      AppMethodBeat.o(102754);
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
          localStringBuffer.append(" htmlid='").append(bo.ani(((aar)localObject1).whb)).append("'");
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
          localStringBuffer.append("<cdn_thumburl>").append(bo.ani(((aar)localObject1).fgE)).append("</cdn_thumburl>");
        if (((aar)localObject1).wfX)
          localStringBuffer.append("<thumb_width>").append(((aar)localObject1).fgJ).append("</thumb_width>");
        if (((aar)localObject1).wfY)
          localStringBuffer.append("<thumb_height>").append(((aar)localObject1).fgI).append("</thumb_height>");
        if (((aar)localObject1).wga)
          localStringBuffer.append("<cdn_dataurl>").append(bo.ani(((aar)localObject1).wfZ)).append("</cdn_dataurl>");
        if (((aar)localObject1).wfW)
          localStringBuffer.append("<cdn_thumbkey>").append(bo.ani(((aar)localObject1).wfV)).append("</cdn_thumbkey>");
        if (((aar)localObject1).wgc)
          localStringBuffer.append("<cdn_datakey>").append(bo.ani(((aar)localObject1).wgb)).append("</cdn_datakey>");
        if (((aar)localObject1).wge)
          localStringBuffer.append("<cdn_encryver>").append(((aar)localObject1).wgd).append("</cdn_encryver>");
        if (((aar)localObject1).wgf)
          localStringBuffer.append("<duration>").append(((aar)localObject1).duration).append("</duration>");
        if (((aar)localObject1).wgh)
          localStringBuffer.append("<stream_weburl>").append(bo.ani(((aar)localObject1).wgg)).append("</stream_weburl>");
        if (((aar)localObject1).wgj)
          localStringBuffer.append("<stream_dataurl>").append(bo.ani(((aar)localObject1).wgi)).append("</stream_dataurl>");
        if (((aar)localObject1).wgl)
          localStringBuffer.append("<stream_lowbandurl>").append(bo.ani(((aar)localObject1).wgk)).append("</stream_lowbandurl>");
        if (((aar)localObject1).wgm)
          localStringBuffer.append("<dataext>").append(bo.ani(((aar)localObject1).cvq)).append("</dataext>");
        if (((aar)localObject1).wgr)
          localStringBuffer.append("<fullmd5>").append(((aar)localObject1).wgq).append("</fullmd5>");
        if (((aar)localObject1).wgt)
          localStringBuffer.append("<head256md5>").append(((aar)localObject1).wgs).append("</head256md5>");
        if (((aar)localObject1).wgv)
          localStringBuffer.append("<fullsize>").append(((aar)localObject1).wgu).append("</fullsize>");
        if (((aar)localObject1).wgC)
          localStringBuffer.append("<thumbfullmd5>").append(((aar)localObject1).wgB).append("</thumbfullmd5>");
        if (((aar)localObject1).wgE)
          localStringBuffer.append("<thumbhead256md5>").append(((aar)localObject1).wgD).append("</thumbhead256md5>");
        if (((aar)localObject1).wgG)
          localStringBuffer.append("<thumbfullsize>").append(((aar)localObject1).wgF).append("</thumbfullsize>");
        if (((aar)localObject1).wgK)
          localStringBuffer.append("<stream_videoid>").append(bo.ani(((aar)localObject1).wgJ)).append("</stream_videoid>");
        if (((aar)localObject1).wgS)
          localStringBuffer.append("<datasrctitle>").append(bo.ani(((aar)localObject1).wgR)).append("</datasrctitle>");
        if (((aar)localObject1).wgW)
          localStringBuffer.append("<datasrcname>").append(bo.ani(((aar)localObject1).wgV)).append("</datasrcname>");
        if (((aar)localObject1).wgY)
          localStringBuffer.append("<datasrctime>").append(bo.ani(((aar)localObject1).wgX)).append("</datasrctime>");
        if ((((aar)localObject1).whe) && ((((aar)localObject1).wgT == null) || (((aar)localObject1).wgT.whA == null) || (((aar)localObject1).wgT.whA.computeSize() == 0)))
          localStringBuffer.append("<canvasPageXml>").append(bo.ani(((aar)localObject1).canvasPageXml)).append("</canvasPageXml>");
        if (((aar)localObject1).whd)
          localStringBuffer.append("<statextstr>").append(bo.ani(((aar)localObject1).cMn)).append("</statextstr>");
        if (((aar)localObject1).whk)
          localStringBuffer.append("<recordxml>").append(((aar)localObject1).whj).append("</recordxml>");
        Object localObject2 = ((aar)localObject1).wgZ;
        if (localObject2 != null)
        {
          localStringBuffer.append("<streamvideo>");
          localStringBuffer.append("<streamvideourl>").append(bo.ani(((aau)localObject2).fiG)).append("</streamvideourl>");
          localStringBuffer.append("<streamvideototaltime>").append(((aau)localObject2).wid).append("</streamvideototaltime>");
          localStringBuffer.append("<streamvideotitle>").append(bo.ani(((aau)localObject2).fiI)).append("</streamvideotitle>");
          localStringBuffer.append("<streamvideowording>").append(bo.ani(((aau)localObject2).fiJ)).append("</streamvideowording>");
          localStringBuffer.append("<streamvideoweburl>").append(bo.ani(((aau)localObject2).fiK)).append("</streamvideoweburl>");
          localStringBuffer.append("<streamvideoaduxinfo>").append(bo.ani(((aau)localObject2).fiM)).append("</streamvideoaduxinfo>");
          localStringBuffer.append("<streamvideopublishid>").append(bo.ani(((aau)localObject2).fiN)).append("</streamvideopublishid>");
          localStringBuffer.append("</streamvideo>");
        }
        localObject2 = ((aar)localObject1).wgT;
        if ((localObject2 == null) || (((aas)localObject2).whw == null) || (((aas)localObject2).whw.computeSize() == 0))
        {
          ab.v("MicroMsg.FavDataItemParser", "klem toXml, data source item empty");
          label1403: localObject2 = ((aar)localObject1).wgT;
          if ((localObject2 != null) && (((aas)localObject2).why != null) && (((aas)localObject2).why.computeSize() != 0))
            break label1947;
          ab.v("MicroMsg.FavDataItemParser", "klem toXml, loc item empty");
          label1442: localObject2 = ((aar)localObject1).wgT;
          if ((localObject2 != null) && (((aas)localObject2).whA != null) && (((aas)localObject2).whA.computeSize() != 0))
            break label2126;
          ab.v("MicroMsg.FavDataItemParser", "klem toXml, url item empty");
          label1481: localObject2 = ((aar)localObject1).wgT;
          if ((localObject2 != null) && (((aas)localObject2).whC != null) && (((aas)localObject2).whC.computeSize() != 0))
            break label2377;
          ab.v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
          label1520: localObject2 = ((aar)localObject1).wgT;
          if ((localObject2 != null) && (((aas)localObject2).whE != null) && (((aas)localObject2).whE.computeSize() != 0))
            break label2571;
          ab.v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
          label1559: localObject1 = ((aar)localObject1).wgT;
          if ((localObject1 != null) && (((aas)localObject1).whN != null))
            break label2729;
          ab.e("MicroMsg.FavDataItemParser", "setAppBrandXml toXml, item empty");
        }
        while (true)
        {
          localStringBuffer.append("</dataitem>");
          j++;
          break;
          localObject2 = ((aas)localObject2).whw;
          localStringBuffer.append("<dataitemsource");
          if (((aat)localObject2).whP)
            localStringBuffer.append(" sourcetype='").append(((aat)localObject2).cvp).append("'");
          if (((aat)localObject2).whT)
            localStringBuffer.append(" sourceid='").append(((aat)localObject2).whS).append("'");
          localStringBuffer.append(">");
          if (((aat)localObject2).whQ)
            localStringBuffer.append("<fromusr>").append(bo.ani(((aat)localObject2).cEV)).append("</fromusr>");
          if (((aat)localObject2).whR)
            localStringBuffer.append("<tousr>").append(bo.ani(((aat)localObject2).toUser)).append("</tousr>");
          if (((aat)localObject2).whV)
            localStringBuffer.append("<realchatname>").append(bo.ani(((aat)localObject2).whU)).append("</realchatname>");
          if (((aat)localObject2).whW)
            localStringBuffer.append("<msgid>").append(((aat)localObject2).cJb).append("</msgid>");
          if (((aat)localObject2).whX)
            localStringBuffer.append("<eventid>").append(((aat)localObject2).cOS).append("</eventid>");
          if (((aat)localObject2).whY)
            localStringBuffer.append("<appid>").append(((aat)localObject2).appId).append("</appid>");
          if (((aat)localObject2).whZ)
            localStringBuffer.append("<link>").append(bo.ani(((aat)localObject2).link)).append("</link>");
          if (((aat)localObject2).wic)
            localStringBuffer.append("<brandid>").append(bo.ani(((aat)localObject2).csl)).append("</brandid>");
          localStringBuffer.append("</dataitemsource>");
          break label1403;
          label1947: localObject2 = ((aas)localObject2).why;
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
          break label1442;
          label2126: localObject2 = ((aas)localObject2).whA;
          localStringBuffer.append("<weburlitem>");
          if (((abu)localObject2).wiZ)
            localStringBuffer.append("<clean_url>").append(bo.ani(((abu)localObject2).wiY)).append("</clean_url>");
          if (((abu)localObject2).wfT)
            localStringBuffer.append("<pagedesc>").append(bo.ani(((abu)localObject2).desc)).append("</pagedesc>");
          if (((abu)localObject2).wiq)
            localStringBuffer.append("<pagethumb_url>").append(bo.ani(((abu)localObject2).thumbUrl)).append("</pagethumb_url>");
          if (((abu)localObject2).wfS)
            localStringBuffer.append("<pagetitle>").append(bo.ani(((abu)localObject2).title)).append("</pagetitle>");
          if (((abu)localObject2).wjb)
            localStringBuffer.append("<opencache>").append(((abu)localObject2).wja).append("</opencache>");
          if (((abu)localObject2).wjc)
            localStringBuffer.append("<contentattr>").append(((abu)localObject2).fgt).append("</contentattr>");
          if (((abu)localObject2).whe)
            localStringBuffer.append("<canvasPageXml>").append(bo.ani(((abu)localObject2).canvasPageXml)).append("</canvasPageXml>");
          localStringBuffer.append("</weburlitem>");
          break label1481;
          label2377: localObject2 = ((aas)localObject2).whC;
          localStringBuffer.append("<productitem");
          if (((abe)localObject2).wis)
            localStringBuffer.append(" type='").append(((abe)localObject2).type).append("'");
          localStringBuffer.append(">");
          if (((abe)localObject2).wfS)
            localStringBuffer.append("<producttitle>").append(bo.ani(((abe)localObject2).title)).append("</producttitle>");
          if (((abe)localObject2).wfT)
            localStringBuffer.append("<productdesc>").append(bo.ani(((abe)localObject2).desc)).append("</productdesc>");
          if (((abe)localObject2).wiq)
            localStringBuffer.append("<productthumb_url>").append(bo.ani(((abe)localObject2).thumbUrl)).append("</productthumb_url>");
          if (((abe)localObject2).wir)
            localStringBuffer.append("<productinfo>").append(bo.ani(((abe)localObject2).info)).append("</productinfo>");
          localStringBuffer.append("</productitem>");
          break label1520;
          label2571: localObject2 = ((aas)localObject2).whE;
          localStringBuffer.append("<tvitem>");
          if (((abo)localObject2).wfS)
            localStringBuffer.append("<tvtitle>").append(bo.ani(((abo)localObject2).title)).append("</tvtitle>");
          if (((abo)localObject2).wfT)
            localStringBuffer.append("<tvdesc>").append(bo.ani(((abo)localObject2).desc)).append("</tvdesc>");
          if (((abo)localObject2).wiq)
            localStringBuffer.append("<tvthumb_url>").append(bo.ani(((abo)localObject2).thumbUrl)).append("</tvthumb_url>");
          if (((abo)localObject2).wir)
            localStringBuffer.append("<tvinfo>").append(bo.ani(((abo)localObject2).info)).append("</tvinfo>");
          localStringBuffer.append("</tvitem>");
          break label1559;
          label2729: localObject1 = ((aas)localObject1).whN;
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
      AppMethodBeat.o(102754);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.a.a
 * JD-Core Version:    0.6.2
 */
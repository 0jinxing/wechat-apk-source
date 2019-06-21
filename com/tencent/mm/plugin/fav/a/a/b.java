package com.tencent.mm.plugin.fav.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class b
{
  public static void a(String paramString, abf paramabf)
  {
    AppMethodBeat.i(102755);
    paramabf.wiv.clear();
    for (Object localObject1 = DocumentBuilderFactory.newInstance(); ; localObject1 = null)
      while (true)
      {
        try
        {
          localObject1 = ((DocumentBuilderFactory)localObject1).newDocumentBuilder();
          localObject2 = new org/xml/sax/InputSource;
          localObject3 = new java/io/ByteArrayInputStream;
          ((ByteArrayInputStream)localObject3).<init>(paramString.getBytes());
          ((InputSource)localObject2).<init>((InputStream)localObject3);
          paramString = ((DocumentBuilder)localObject1).parse((InputSource)localObject2);
          paramString.normalize();
          paramString = paramString.getDocumentElement().getElementsByTagName("datalist");
          if (paramString == null)
            break label4063;
          NodeList localNodeList = paramString.item(0).getChildNodes();
          if ((localNodeList == null) || (localNodeList.getLength() <= 0))
            break label4063;
          int i = localNodeList.getLength();
          int j = 0;
          if (j >= i)
            break label4063;
          localObject1 = localNodeList.item(j);
          paramString = br.b((Node)localObject1);
          localObject1 = ((Element)localObject1).getElementsByTagName("recordxml");
          if ((localObject1 == null) || (((NodeList)localObject1).getLength() <= 0))
            break;
          localObject1 = br.b(((NodeList)localObject1).item(0).getFirstChild());
          if (!paramString.trim().startsWith("<dataitem"))
            break label4071;
          paramString = br.z(paramString, "dataitem");
          if (paramString != null)
          {
            aar localaar = new com/tencent/mm/protocal/protobuf/aar;
            localaar.<init>();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.LE(bo.getInt((String)paramString.get(".dataitem" + ".$datatype"), 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akZ((String)paramString.get(".dataitem" + ".$datasourceid"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.LF(bo.getInt((String)paramString.get(".dataitem" + ".$datastatus"), 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akR((String)paramString.get(".dataitem" + ".datafmt"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akH((String)paramString.get(".dataitem" + ".datatitle"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akI((String)paramString.get(".dataitem" + ".datadesc"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akJ((String)paramString.get(".dataitem" + ".cdn_thumburl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akK((String)paramString.get(".dataitem" + ".cdn_thumbkey"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.LB(bo.getInt((String)paramString.get(".dataitem" + ".thumb_width"), 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.LC(bo.getInt((String)paramString.get(".dataitem" + ".thumb_height"), 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akL((String)paramString.get(".dataitem" + ".cdn_dataurl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akM((String)paramString.get(".dataitem" + ".cdn_datakey"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = (String)paramString.get(".dataitem" + ".duration");
            if ((localObject2 != null) && (((String)localObject2).length() > 0))
              localaar.LD(bo.getInt((String)localObject2, 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akO((String)paramString.get(".dataitem" + ".stream_dataurl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akP((String)paramString.get(".dataitem" + ".stream_lowbandurl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akN((String)paramString.get(".dataitem" + ".stream_weburl"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.alg((String)paramString.get(".dataitem" + ".canvasPageXml"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akS((String)paramString.get(".dataitem" + ".fullmd5"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akT((String)paramString.get(".dataitem" + ".head256md5"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = (String)paramString.get(".dataitem" + ".fullsize");
            if (!bo.isNullOrNil((String)localObject2))
              localaar.mf(bo.getInt((String)localObject2, 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akQ((String)paramString.get(".dataitem" + ".dataext"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akX((String)paramString.get(".dataitem" + ".thumbfullmd5"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.akY((String)paramString.get(".dataitem" + ".thumbhead256md5"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = (String)paramString.get(".dataitem" + ".thumbfullsize");
            if (!bo.isNullOrNil((String)localObject2))
              localaar.mg(bo.getInt((String)localObject2, 0));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.ala((String)paramString.get(".dataitem" + ".stream_videoid"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = (String)paramString.get(".dataitem" + ".$dataid");
            if (!bo.isNullOrNil((String)localObject3))
            {
              localObject2 = localObject3;
              if (((String)localObject3).length() >= 32);
            }
            else
            {
              localObject2 = com.tencent.mm.plugin.fav.a.b.cf(localaar.toString(), localaar.dataType);
            }
            localaar.akU((String)localObject2);
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.alb((String)paramString.get(".dataitem" + ".datasrctitle"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.alc((String)paramString.get(".dataitem" + ".datasrcname"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.ald((String)paramString.get(".dataitem" + ".datasrctime"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.alf((String)paramString.get(".dataitem" + ".statextstr"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.ale((String)paramString.get(".dataitem" + ".$htmlid"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localaar.LG(bo.getInt((String)paramString.get(".dataitem" + ".$dataillegaltype"), 0));
            if (localObject1 != null)
              localaar.alh((String)localObject1);
            localObject1 = new com/tencent/mm/protocal/protobuf/aau;
            ((aau)localObject1).<init>();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aau)localObject1).fiG = bo.bc((String)paramString.get(".dataitem" + ".streamvideo.streamvideourl"), "");
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aau)localObject1).wid = bo.ank((String)paramString.get(".dataitem" + ".streamvideo.streamvideototaltime"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aau)localObject1).fiI = bo.bc((String)paramString.get(".dataitem" + ".streamvideo.streamvideotitle"), "");
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aau)localObject1).fiJ = bo.bc((String)paramString.get(".dataitem" + ".streamvideo.streamvideowording"), "");
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aau)localObject1).fiK = bo.bc((String)paramString.get(".dataitem" + ".streamvideo.streamvideoweburl"), "");
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aau)localObject1).fiM = bo.bc((String)paramString.get(".dataitem" + ".streamvideo.streamvideoaduxinfo"), "");
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((aau)localObject1).fiN = bo.bc((String)paramString.get(".dataitem" + ".streamvideo.streamvideopublishid"), "");
            localaar.a((aau)localObject1);
            localObject1 = new com/tencent/mm/protocal/protobuf/aas;
            ((aas)localObject1).<init>();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ".dataitem" + ".dataitemsource";
            if (!paramString.containsKey(localObject2))
            {
              ab.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = ".dataitem" + ".locitem";
              if (paramString.containsKey(localObject3))
                break label2674;
              ab.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject3 });
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ".dataitem" + ".weburlitem";
              if (paramString.containsKey(localObject2))
                break label3057;
              ab.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ".dataitem" + ".productitem";
              if (paramString.containsKey(localObject2))
                break label3364;
              ab.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = ".dataitem" + ".tvitem";
              if (paramString.containsKey(localObject3))
                break label3588;
              ab.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject3 });
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = ".dataitem" + ".appbranditem";
              if (paramString.containsKey(localObject3))
                break label3765;
              ab.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject3 });
              localaar.a((aas)localObject1);
              paramabf.wiv.add(localaar);
            }
          }
          else
          {
            j++;
            continue;
          }
          localObject3 = new com/tencent/mm/protocal/protobuf/aat;
          ((aat)localObject3).<init>();
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).LI(bo.getInt((String)paramString.get((String)localObject2 + ".$sourcetype"), 0));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).alo((String)paramString.get((String)localObject2 + ".$sourceid"));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).alm((String)paramString.get((String)localObject2 + ".fromusr"));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).aln((String)paramString.get((String)localObject2 + ".tousr"));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).alp((String)paramString.get((String)localObject2 + ".realchatname"));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).mi(bo.getLong((String)paramString.get((String)localObject2 + ".createtime"), 0L));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).alq((String)paramString.get((String)localObject2 + ".msgid"));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).cOS = ((String)paramString.get((String)localObject2 + ".eventid"));
          ((aat)localObject3).whX = true;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).alr((String)paramString.get((String)localObject2 + ".appid"));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).als((String)paramString.get((String)localObject2 + ".link"));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aat)localObject3).alt((String)paramString.get((String)localObject2 + ".brandid"));
          ((aas)localObject1).c((aat)localObject3);
          continue;
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.FavProtoItemParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
          AppMethodBeat.o(102755);
          return;
        }
        label2674: Object localObject2 = new com/tencent/mm/protocal/protobuf/aay;
        ((aay)localObject2).<init>();
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        if (!bo.isNullOrNil((String)paramString.get((String)localObject3 + ".label")))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aay)localObject2).alu((String)paramString.get((String)localObject3 + ".label"));
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        if (!bo.isNullOrNil((String)paramString.get((String)localObject3 + ".poiname")))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((aay)localObject2).alv((String)paramString.get((String)localObject3 + ".poiname"));
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = (String)paramString.get((String)localObject3 + ".lng");
        if (!bo.isNullOrNil((String)localObject4))
          ((aay)localObject2).D(bo.getDouble((String)localObject4, 0.0D));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = (String)paramString.get((String)localObject3 + ".lat");
        if (!bo.isNullOrNil((String)localObject4))
          ((aay)localObject2).E(bo.getDouble((String)localObject4, 0.0D));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        Object localObject3 = (String)paramString.get((String)localObject3 + ".scale");
        if (!bo.isNullOrNil((String)localObject3))
        {
          if (((String)localObject3).indexOf('.') == -1)
            break label3043;
          ((aay)localObject2).LJ(bo.getInt(((String)localObject3).substring(0, ((String)localObject3).indexOf('.')), -1));
        }
        while (true)
        {
          ((aas)localObject1).a((aay)localObject2);
          break;
          label3043: ((aay)localObject2).LJ(bo.getInt((String)localObject3, -1));
        }
        label3057: localObject3 = new com/tencent/mm/protocal/protobuf/abu;
        ((abu)localObject3).<init>();
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abu)localObject3).alS((String)paramString.get((String)localObject2 + ".clean_url"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abu)localObject3).alR((String)paramString.get((String)localObject2 + ".pagedesc"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abu)localObject3).alT((String)paramString.get((String)localObject2 + ".pagethumb_url"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abu)localObject3).alQ((String)paramString.get((String)localObject2 + ".pagetitle"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abu)localObject3).LO(bo.getInt((String)paramString.get((String)localObject2 + ".opencache"), 0));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abu)localObject3).LP(bo.getInt((String)paramString.get((String)localObject2 + ".contentattr"), 0));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abu)localObject3).alU((String)paramString.get((String)localObject2 + ".canvasPageXml"));
        ((aas)localObject1).a((abu)localObject3);
        continue;
        label3364: localObject3 = new com/tencent/mm/protocal/protobuf/abe;
        ((abe)localObject3).<init>();
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abe)localObject3).alw((String)paramString.get((String)localObject2 + ".producttitle"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abe)localObject3).alx((String)paramString.get((String)localObject2 + ".productdesc"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abe)localObject3).aly((String)paramString.get((String)localObject2 + ".productthumb_url"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abe)localObject3).alz((String)paramString.get((String)localObject2 + ".productinfo"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abe)localObject3).LK(bo.getInt((String)paramString.get((String)localObject2 + ".$type"), 0));
        ((aas)localObject1).a((abe)localObject3);
        continue;
        label3588: localObject2 = new com/tencent/mm/protocal/protobuf/abo;
        ((abo)localObject2).<init>();
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abo)localObject2).alM((String)paramString.get((String)localObject3 + ".tvtitle"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abo)localObject2).alN((String)paramString.get((String)localObject3 + ".tvdesc"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abo)localObject2).alO((String)paramString.get((String)localObject3 + ".tvthumb_url"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((abo)localObject2).alP((String)paramString.get((String)localObject3 + ".tvinfo"));
        ((aas)localObject1).a((abo)localObject2);
        continue;
        label3765: localObject2 = new com/tencent/mm/protocal/protobuf/aap;
        ((aap)localObject2).<init>();
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((aap)localObject2).username = ((String)paramString.get((String)localObject3 + ".username"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((aap)localObject2).appId = ((String)paramString.get((String)localObject3 + ".appid"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((aap)localObject2).cBc = bo.getInt((String)paramString.get((String)localObject3 + ".pkgtype"), 0);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((aap)localObject2).iconUrl = ((String)paramString.get((String)localObject3 + ".iconurl"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((aap)localObject2).type = bo.getInt((String)paramString.get((String)localObject3 + ".type"), 0);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((aap)localObject2).csu = ((String)paramString.get((String)localObject3 + ".pagepath"));
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((aap)localObject2).wfO = ((String)paramString.get((String)localObject3 + ".sourcedisplayname"));
        ((aas)localObject1).a((aap)localObject2);
        continue;
        label4063: AppMethodBeat.o(102755);
        continue;
        label4071: paramString = null;
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.a.b
 * JD-Core Version:    0.6.2
 */
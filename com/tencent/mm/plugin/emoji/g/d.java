package com.tencent.mm.plugin.emoji.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class d
{
  public static ArrayList<EmojiGroupInfo> JG(String paramString)
  {
    AppMethodBeat.i(53162);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] parse xml faild. xml is null.");
      paramString = null;
      AppMethodBeat.o(53162);
    }
    while (true)
    {
      return paramString;
      Object localObject1 = DocumentBuilderFactory.newInstance();
      label661: 
      while (true)
      {
        int i;
        Object localObject4;
        try
        {
          Object localObject2 = ((DocumentBuilderFactory)localObject1).newDocumentBuilder();
          localObject1 = new org/xml/sax/InputSource;
          Object localObject3 = new java/io/ByteArrayInputStream;
          ((ByteArrayInputStream)localObject3).<init>(paramString.getBytes());
          ((InputSource)localObject1).<init>((InputStream)localObject3);
          paramString = ((DocumentBuilder)localObject2).parse((InputSource)localObject1);
          paramString.normalize();
          localObject3 = paramString.getDocumentElement().getElementsByTagName("Emotion");
          if ((localObject3 != null) && (((NodeList)localObject3).getLength() > 0))
          {
            paramString = new java/util/ArrayList;
            paramString.<init>();
            i = 0;
            if (i >= ((NodeList)localObject3).getLength())
              break label737;
            localObject1 = new com/tencent/mm/storage/emotion/EmojiGroupInfo;
            ((EmojiGroupInfo)localObject1).<init>();
            localObject2 = ((NodeList)localObject3).item(i).getChildNodes();
            int j = ((NodeList)localObject2).getLength();
            int k = 0;
            if (k >= j)
              break label661;
            localObject4 = ((NodeList)localObject2).item(k);
            if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("ProductID")))
            {
              localObject4 = ((Node)localObject4).getTextContent();
              ab.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] productId:%s", new Object[] { localObject4 });
              ((EmojiGroupInfo)localObject1).field_productID = ((String)localObject4);
              k++;
              continue;
            }
            if ((localObject4 == null) || (((Node)localObject4).getNodeName() == null) || (!((Node)localObject4).getNodeName().equals("RecType")))
              break label335;
            localObject4 = ((Node)localObject4).getTextContent();
            ab.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] RecType:%s", new Object[] { localObject4 });
            ((EmojiGroupInfo)localObject1).field_recommandType = Integer.valueOf((String)localObject4).intValue();
            continue;
          }
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.emoji.EmojiRecommendXMLParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
          paramString = null;
          AppMethodBeat.o(53162);
        }
        break;
        label335: if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("RecWord")))
        {
          localObject4 = ((Node)localObject4).getTextContent();
          ab.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] recWord:%s", new Object[] { localObject4 });
          ((EmojiGroupInfo)localObject1).field_recommandWord = ((String)localObject4);
        }
        else if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("Name")))
        {
          localObject4 = ((Node)localObject4).getTextContent();
          ab.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] Name:%s", new Object[] { localObject4 });
          ((EmojiGroupInfo)localObject1).field_packName = ((String)localObject4);
        }
        else if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("Panel")))
        {
          localObject4 = ((Node)localObject4).getTextContent();
          ab.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] iconUrl:%s", new Object[] { localObject4 });
          ((EmojiGroupInfo)localObject1).field_packGrayIconUrl = ((String)localObject4);
        }
        else if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("Icon")))
        {
          localObject4 = ((Node)localObject4).getTextContent();
          ab.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] BigIconUrl:%s", new Object[] { localObject4 });
          ((EmojiGroupInfo)localObject1).field_BigIconUrl = ((String)localObject4);
        }
        else if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("ButtonType")))
        {
          localObject4 = ((Node)localObject4).getTextContent();
          ab.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] buttonType:%s", new Object[] { localObject4 });
          ((EmojiGroupInfo)localObject1).field_buttonType = Integer.valueOf((String)localObject4).intValue();
          continue;
          if (!bo.isNullOrNil(((EmojiGroupInfo)localObject1).field_productID))
          {
            ((EmojiGroupInfo)localObject1).field_recommand = 1;
            ((EmojiGroupInfo)localObject1).field_lastUseTime = System.currentTimeMillis();
            ((EmojiGroupInfo)localObject1).field_sort = 0;
            h.pYm.e(12068, new Object[] { Integer.valueOf(1), ((EmojiGroupInfo)localObject1).field_productID, Integer.valueOf(((EmojiGroupInfo)localObject1).field_recommandType) });
            paramString.add(localObject1);
          }
          i++;
        }
      }
      label737: AppMethodBeat.o(53162);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.g.d
 * JD-Core Version:    0.6.2
 */
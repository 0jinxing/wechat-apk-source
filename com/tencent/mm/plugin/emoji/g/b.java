package com.tencent.mm.plugin.emoji.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class b
{
  public static ArrayList<xx> JE(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(53158);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.emoji.EmojiBackupXMLParser", "[backup emotion parser] parse xml faild. xml is null.");
      AppMethodBeat.o(53158);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = DocumentBuilderFactory.newInstance();
      try
      {
        localObject2 = ((DocumentBuilderFactory)localObject2).newDocumentBuilder();
        Object localObject3 = new org/xml/sax/InputSource;
        Object localObject4 = new java/io/ByteArrayInputStream;
        ((ByteArrayInputStream)localObject4).<init>(paramString.getBytes());
        ((InputSource)localObject3).<init>((InputStream)localObject4);
        paramString = ((DocumentBuilder)localObject2).parse((InputSource)localObject3);
        paramString.normalize();
        localObject4 = paramString.getDocumentElement().getElementsByTagName("EmojiMd5");
        if ((localObject4 != null) && (((NodeList)localObject4).getLength() > 0))
        {
          paramString = new java/util/ArrayList;
          paramString.<init>();
          int i = ((NodeList)localObject4).getLength();
          for (int j = 0; j < i; j++)
          {
            Object localObject5 = ((NodeList)localObject4).item(j);
            localObject2 = new com/tencent/mm/protocal/protobuf/xx;
            ((xx)localObject2).<init>();
            localObject3 = ((Node)localObject5).getTextContent().toLowerCase();
            localObject5 = ((Node)localObject5).getAttributes();
            Node localNode = ((NamedNodeMap)localObject5).getNamedItem("thumburl");
            if (localNode != null)
              ((xx)localObject2).ThumbUrl = localNode.getNodeValue();
            localNode = ((NamedNodeMap)localObject5).getNamedItem("cdnurl");
            if (localNode != null)
              ((xx)localObject2).Url = localNode.getNodeValue();
            localNode = ((NamedNodeMap)localObject5).getNamedItem("productid");
            if (localNode != null)
              ((xx)localObject2).ProductID = localNode.getNodeValue();
            localNode = ((NamedNodeMap)localObject5).getNamedItem("designerid");
            if (localNode != null)
              ((xx)localObject2).wdC = localNode.getNodeValue();
            localNode = ((NamedNodeMap)localObject5).getNamedItem("aeskey");
            if (localNode != null)
              ((xx)localObject2).AesKey = localNode.getNodeValue();
            localNode = ((NamedNodeMap)localObject5).getNamedItem("encrypturl");
            if (localNode != null)
              ((xx)localObject2).EncryptUrl = localNode.getNodeValue();
            localObject5 = ((NamedNodeMap)localObject5).getNamedItem("activityid");
            if (localObject5 != null)
              ((xx)localObject2).ActivityID = ((Node)localObject5).getNodeValue();
            ((xx)localObject2).Md5 = ((String)localObject3);
            paramString.add(localObject2);
          }
          AppMethodBeat.o(53158);
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.emoji.EmojiBackupXMLParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
        AppMethodBeat.o(53158);
        paramString = localObject1;
      }
    }
  }

  public static ArrayList<String> JF(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(53159);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.emoji.EmojiBackupXMLParser", "[backup emotion parser] parse xml faild. xml is null.");
      AppMethodBeat.o(53159);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = DocumentBuilderFactory.newInstance();
      try
      {
        DocumentBuilder localDocumentBuilder = ((DocumentBuilderFactory)localObject2).newDocumentBuilder();
        localObject2 = new org/xml/sax/InputSource;
        ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
        localByteArrayInputStream.<init>(paramString.getBytes());
        ((InputSource)localObject2).<init>(localByteArrayInputStream);
        paramString = localDocumentBuilder.parse((InputSource)localObject2);
        paramString.normalize();
        localObject2 = paramString.getDocumentElement().getElementsByTagName("ProductID");
        if ((localObject2 != null) && (((NodeList)localObject2).getLength() > 0))
        {
          paramString = new java/util/ArrayList;
          paramString.<init>();
          int i = ((NodeList)localObject2).getLength();
          for (int j = 0; j < i; j++)
            paramString.add(((NodeList)localObject2).item(j).getTextContent());
          AppMethodBeat.o(53159);
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.emoji.EmojiBackupXMLParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
        AppMethodBeat.o(53159);
        paramString = localObject1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.g.b
 * JD-Core Version:    0.6.2
 */
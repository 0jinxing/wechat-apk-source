package com.tencent.mm.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class c
{
  b fnW = null;
  b fnX = null;

  public final boolean aaI()
  {
    if (this.fnW == null);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final e oP(String paramString)
  {
    AppMethodBeat.i(118143);
    e locale1 = null;
    if (this.fnW != null)
      locale1 = this.fnW.oP(paramString);
    e locale2 = locale1;
    if (locale1 == null)
    {
      locale2 = locale1;
      if (this.fnX != null)
        locale2 = this.fnX.oP(paramString);
    }
    AppMethodBeat.o(118143);
    return locale2;
  }

  final void oQ(String paramString)
  {
    AppMethodBeat.i(118142);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.abtest.AbTestManager", "[Abtest] parse xml faild. xml is null.");
      AppMethodBeat.o(118142);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.abtest.AbTestManager", "[Abtest] parseXML content:%s", new Object[] { paramString });
      Object localObject1 = DocumentBuilderFactory.newInstance();
      Object localObject2;
      int i;
      while (true)
      {
        Object localObject3;
        Object localObject4;
        try
        {
          localObject2 = ((DocumentBuilderFactory)localObject1).newDocumentBuilder();
          localObject3 = new org/xml/sax/InputSource;
          localObject1 = new java/io/ByteArrayInputStream;
          ((ByteArrayInputStream)localObject1).<init>(paramString.getBytes());
          ((InputSource)localObject3).<init>((InputStream)localObject1);
          paramString = ((DocumentBuilder)localObject2).parse((InputSource)localObject3);
          paramString.normalize();
          paramString = paramString.getDocumentElement().getElementsByTagName("testcase");
          if (paramString == null)
            break label698;
          i = 0;
          if (i >= paramString.getLength())
            break label698;
          localObject2 = new com/tencent/mm/model/a/b;
          ((b)localObject2).<init>();
          localObject1 = paramString.item(i).getChildNodes();
          int j = ((NodeList)localObject1).getLength();
          int k = 0;
          if (k >= j)
            break label657;
          localObject4 = ((NodeList)localObject1).item(k);
          if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("testpoint")))
          {
            Object localObject5 = ((Node)localObject4).getAttributes();
            localObject3 = new com/tencent/mm/model/a/e;
            ((e)localObject3).<init>();
            if (localObject5 != null)
            {
              Object localObject6 = ((NamedNodeMap)localObject5).getNamedItem("id");
              if (localObject6 != null)
              {
                localObject6 = ((Node)localObject6).getNodeValue();
                ab.d("MicroMsg.abtest.AbTestManager", "[Abtest] idValue:%s", new Object[] { localObject6 });
                ((e)localObject3).id = ((String)localObject6);
              }
              localObject5 = ((NamedNodeMap)localObject5).getNamedItem("reportid");
              if (localObject5 != null)
              {
                localObject5 = ((Node)localObject5).getNodeValue();
                ab.d("MicroMsg.abtest.AbTestManager", "[Abtest] reportIdValue:%s", new Object[] { localObject5 });
                ((e)localObject3).fnY = ((String)localObject5);
              }
            }
            localObject4 = ((Node)localObject4).getTextContent();
            ab.d("MicroMsg.abtest.AbTestManager", "[Abtest] casePointContent:%s", new Object[] { localObject4 });
            ((e)localObject3).value = ((String)localObject4);
            localObject4 = ((e)localObject3).id;
            ((b)localObject2).fnV.put(localObject4, localObject3);
            k++;
            continue;
          }
          if ((localObject4 == null) || (((Node)localObject4).getNodeName() == null) || (!((Node)localObject4).getNodeName().equals("verifymd5")))
            break label465;
          localObject3 = ((Node)localObject4).getTextContent();
          ab.d("MicroMsg.abtest.AbTestManager", "[Abtest] verifymd5Content:%s", new Object[] { localObject3 });
          ((b)localObject2).eyp = ((String)localObject3);
          continue;
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.abtest.AbTestManager", "[Abtest] parseXML exception:%s", new Object[] { paramString.toString() });
          AppMethodBeat.o(118142);
        }
        break;
        label465: if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("testcaseid")))
        {
          localObject3 = ((Node)localObject4).getTextContent();
          ab.d("MicroMsg.abtest.AbTestManager", "[Abtest] testcaseidContent:%s", new Object[] { localObject3 });
          ((b)localObject2).fnS = ((String)localObject3);
        }
        else if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("starttime")))
        {
          localObject3 = ((Node)localObject4).getTextContent();
          ab.d("MicroMsg.abtest.AbTestManager", "[Abtest] starttimeContent:%s", new Object[] { localObject3 });
          ((b)localObject2).fnT = ((String)localObject3);
        }
        else if ((localObject4 != null) && (((Node)localObject4).getNodeName() != null) && (((Node)localObject4).getNodeName().equals("endtime")))
        {
          localObject3 = ((Node)localObject4).getTextContent();
          ab.d("MicroMsg.abtest.AbTestManager", "[Abtest] endtimeContent:%s", new Object[] { localObject3 });
          ((b)localObject2).fnU = ((String)localObject3);
        }
      }
      label657: if ((!bo.isNullOrNil(((b)localObject2).fnS)) && ("0".equals(((b)localObject2).fnS)))
        this.fnX = ((b)localObject2);
      while (true)
      {
        i++;
        break;
        this.fnW = ((b)localObject2);
      }
      label698: AppMethodBeat.o(118142);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.a.c
 * JD-Core Version:    0.6.2
 */
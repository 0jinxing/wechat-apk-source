package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.g.a.ci;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class w
  implements e
{
  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(77798);
    parama = parama.eAB;
    if ((parama == null) || (parama.vED == null))
    {
      ab.f("MicroMsg.DeletePackageMsgExtension", "[oneliang]DeletePackageMsgExtension failed, invalid cmdAM");
      AppMethodBeat.o(77798);
    }
    while (true)
    {
      return null;
      ab.i("MicroMsg.DeletePackageMsgExtension", "[oneliang]DeletePackageMsgExtension start");
      parama = aa.a(parama.vED);
      Object localObject = DocumentBuilderFactory.newInstance();
      try
      {
        localObject = ((DocumentBuilderFactory)localObject).newDocumentBuilder();
        InputSource localInputSource = new org/xml/sax/InputSource;
        ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
        localByteArrayInputStream.<init>(parama.getBytes("utf-8"));
        localInputSource.<init>(localByteArrayInputStream);
        parama = ((DocumentBuilder)localObject).parse(localInputSource);
        parama.normalize();
        parama = parama.getDocumentElement().getElementsByTagName("deletepackage");
        if ((parama != null) && (parama.getLength() == 1))
        {
          parama = parama.item(0).getChildNodes();
          int i = parama.getLength();
          for (int j = 0; j < i; j++)
          {
            localObject = parama.item(j);
            if ((localObject != null) && (((Node)localObject).getNodeName() != null) && (((Node)localObject).getNodeName().equals("pack")))
            {
              localObject = ((Node)localObject).getAttributes();
              if (localObject != null)
              {
                localObject = ((NamedNodeMap)localObject).getNamedItem("type");
                if (localObject != null)
                {
                  int k = bo.getInt(((Node)localObject).getNodeValue(), 0);
                  localObject = new com/tencent/mm/g/a/ci;
                  ((ci)localObject).<init>();
                  ((ci)localObject).cvy.cvz = k;
                  a.xxA.m((b)localObject);
                }
              }
            }
          }
        }
        ab.i("MicroMsg.DeletePackageMsgExtension", "[oneliang]DeletePackageMsgExtension end");
        AppMethodBeat.o(77798);
      }
      catch (Exception parama)
      {
        ab.e("MicroMsg.DeletePackageMsgExtension", "exception:%s", new Object[] { bo.l(parama) });
        AppMethodBeat.o(77798);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.w
 * JD-Core Version:    0.6.2
 */
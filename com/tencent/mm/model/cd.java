package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.ba.k;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class cd
  implements e
{
  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(77826);
    parama = parama.eAB;
    if ((parama == null) || (parama.vED == null))
    {
      ab.f("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension failed, invalid cmdAM");
      AppMethodBeat.o(77826);
    }
    while (true)
    {
      return null;
      ab.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension start");
      parama = aa.a(parama.vED);
      Object localObject1 = DocumentBuilderFactory.newInstance();
      try
      {
        DocumentBuilder localDocumentBuilder = ((DocumentBuilderFactory)localObject1).newDocumentBuilder();
        localObject1 = new org/xml/sax/InputSource;
        Object localObject2 = new java/io/ByteArrayInputStream;
        ((ByteArrayInputStream)localObject2).<init>(parama.getBytes("utf-8"));
        ((InputSource)localObject1).<init>((InputStream)localObject2);
        parama = localDocumentBuilder.parse((InputSource)localObject1);
        parama.normalize();
        parama = parama.getDocumentElement().getElementsByTagName("updatepackage");
        if ((parama != null) && (parama.getLength() == 1))
        {
          parama = parama.item(0).getChildNodes();
          int i = parama.getLength();
          for (int j = 0; j < i; j++)
          {
            localObject1 = parama.item(j);
            if ((localObject1 != null) && (((Node)localObject1).getNodeName() != null) && (((Node)localObject1).getNodeName().equals("pack")))
            {
              localObject1 = ((Node)localObject1).getAttributes();
              if (localObject1 != null)
              {
                localObject1 = ((NamedNodeMap)localObject1).getNamedItem("type");
                if (localObject1 != null)
                {
                  localObject1 = ((Node)localObject1).getNodeValue();
                  localObject2 = new com/tencent/mm/ba/k;
                  ((k)localObject2).<init>(bo.getInt((String)localObject1, 0));
                  g.RO().eJo.a((m)localObject2, 0);
                }
              }
            }
          }
        }
        ab.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension end");
        AppMethodBeat.o(77826);
      }
      catch (Exception parama)
      {
        ab.e("MicroMsg.UpdatePackageMsgExtension", "exception:%s", new Object[] { bo.l(parama) });
        AppMethodBeat.o(77826);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cd
 * JD-Core Version:    0.6.2
 */
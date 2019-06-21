package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class br
{
  private static ThreadLocal<XmlPullParser> xCn;

  static
  {
    AppMethodBeat.i(52443);
    xCn = new ThreadLocal();
    AppMethodBeat.o(52443);
  }

  public static String b(Node paramNode)
  {
    AppMethodBeat.i(52442);
    StringWriter localStringWriter = new StringWriter();
    try
    {
      Transformer localTransformer = TransformerFactory.newInstance().newTransformer();
      localTransformer.setOutputProperty("omit-xml-declaration", "yes");
      DOMSource localDOMSource = new javax/xml/transform/dom/DOMSource;
      localDOMSource.<init>(paramNode);
      paramNode = new javax/xml/transform/stream/StreamResult;
      paramNode.<init>(localStringWriter);
      localTransformer.transform(localDOMSource, paramNode);
      paramNode = localStringWriter.toString();
      AppMethodBeat.o(52442);
      return paramNode;
    }
    catch (TransformerException paramNode)
    {
      while (true)
        ab.e("MicroMsg.SDK.XmlParser", "nodeToString: %s", new Object[] { paramNode.getMessage() });
    }
  }

  public static Map<String, String> z(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52441);
    if (paramString1 == null);
    for (int i = -1; i < 0; i = paramString1.indexOf("<".concat(String.valueOf(paramString2))))
    {
      ab.e("MicroMsg.SDK.XmlParser", "can not find the tag <%s>", new Object[] { paramString2 });
      AppMethodBeat.o(52441);
      paramString1 = null;
      return paramString1;
    }
    String str = paramString1;
    if (i > 0)
      str = paramString1.substring(i);
    while (true)
    {
      a locala;
      try
      {
        locala = new com/tencent/mm/sdk/platformtools/br$a;
        locala.<init>(str, paramString2);
        i = locala.xCo.getEventType();
        if (i == 1)
          break label480;
        i = locala.xCo.next();
        if (i != 2)
          break label390;
        locala.xCq.append('.').append(locala.xCo.getName());
        paramString1 = locala.xCq.toString();
        int j = paramString1.hashCode();
        paramString2 = (Integer)locala.xCs.get(Integer.valueOf(j));
        if (paramString2 != null)
        {
          paramString2 = Integer.valueOf(paramString2.intValue() + 1);
          locala.xCq.append(paramString2);
          locala.xCs.put(Integer.valueOf(j), paramString2);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramString1 = paramString1 + paramString2;
          locala.xCr.put(paramString1, "");
          j = 0;
          if (j >= locala.xCo.getAttributeCount())
            break label387;
          paramString2 = locala.xCr;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramString2.put(paramString1 + ".$" + locala.xCo.getAttributeName(j), locala.xCo.getAttributeValue(j));
          j++;
          continue;
        }
        locala.xCs.put(Integer.valueOf(j), Integer.valueOf(0));
        continue;
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.SDK.XmlParser", paramString1, "[ %s ]", new Object[] { str });
        AppMethodBeat.o(52441);
        paramString1 = null;
      }
      break;
      label387: continue;
      label390: if (i == 4)
      {
        paramString1 = locala.xCo.getText();
        if (paramString1 != null)
          locala.xCr.put(locala.xCq.toString(), paramString1);
      }
      else if (i == 3)
      {
        locala.xCq = locala.xCq.delete(locala.xCq.lastIndexOf("."), locala.xCq.length());
        if (locala.xCq.length() == 0)
        {
          label480: paramString1 = locala.xCr;
          AppMethodBeat.o(52441);
          break;
        }
      }
    }
  }

  static final class a
  {
    XmlPullParser xCo;
    private String xCp;
    StringBuilder xCq;
    Map<String, String> xCr;
    Map<Integer, Integer> xCs;

    public a(String paramString1, String paramString2)
    {
      AppMethodBeat.i(52440);
      this.xCq = new StringBuilder();
      this.xCp = paramString2;
      paramString2 = (XmlPullParser)br.dpO().get();
      this.xCo = paramString2;
      if (paramString2 == null)
      {
        ThreadLocal localThreadLocal = br.dpO();
        paramString2 = XmlPullParserFactory.newInstance().newPullParser();
        this.xCo = paramString2;
        localThreadLocal.set(paramString2);
      }
      this.xCo.setInput(new StringReader(paramString1));
      this.xCs = new HashMap();
      this.xCr = new HashMap();
      AppMethodBeat.o(52440);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.br
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.welab;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.welab.b.c;
import com.tencent.mm.plugin.welab.d.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class f
{
  private static DocumentBuilder foC = null;

  public static a a(c paramc)
  {
    AppMethodBeat.i(80560);
    a locala = new a();
    locala.field_expId = String.valueOf(paramc.uMa);
    locala.field_sequence = paramc.uMb;
    if (paramc.startTime > 0L)
    {
      l = paramc.startTime;
      locala.field_starttime = l;
      if (paramc.endTime <= 0L)
        break label954;
    }
    label954: for (long l = paramc.endTime; ; l = 9223372036854775807L)
    {
      locala.field_endtime = l;
      String str = "xlab_" + paramc.uMa;
      paramc = paramc.cag;
      locala.field_AllVer = bo.ank((String)paramc.get(ep(str, "AllVer")));
      locala.field_BizType = bo.ank((String)paramc.get(ep(str, "BizType")));
      locala.field_Desc_cn = ((String)paramc.get(ep(str, "Desc_cn")));
      locala.field_Desc_en = ((String)paramc.get(ep(str, "Desc_en")));
      locala.field_Desc_hk = ((String)paramc.get(ep(str, "Desc_hk")));
      locala.field_Desc_tw = ((String)paramc.get(ep(str, "Desc_tw")));
      locala.field_DetailURL = ((String)paramc.get(ep(str, "DetailURL")));
      locala.field_Introduce_cn = ((String)paramc.get(ep(str, "Introduce_cn")));
      locala.field_Introduce_en = ((String)paramc.get(ep(str, "Introduce_en")));
      locala.field_Introduce_hk = ((String)paramc.get(ep(str, "Introduce_hk")));
      locala.field_Introduce_tw = ((String)paramc.get(ep(str, "Introduce_tw")));
      locala.field_Pos = bo.ank((String)paramc.get(ep(str, "Pos")));
      locala.field_Type = bo.ank((String)paramc.get(ep(str, "Type")));
      locala.field_Switch = bo.ank((String)paramc.get(ep(str, "Switch")));
      locala.field_WeAppPath = ((String)paramc.get(ep(str, "WeAppPath")));
      locala.field_WeAppUser = ((String)paramc.get(ep(str, "WeAppUser")));
      locala.field_LabsAppId = ((String)paramc.get(ep(str, "LabsAppId")));
      locala.field_TitleKey_android = ((String)paramc.get(ep(str, "TitleKey_android")));
      locala.field_Title_cn = ((String)paramc.get(ep(str, "Title_cn")));
      locala.field_Title_en = ((String)paramc.get(ep(str, "Title_en")));
      locala.field_Title_hk = ((String)paramc.get(ep(str, "Title_hk")));
      locala.field_Title_tw = ((String)paramc.get(ep(str, "Title_tw")));
      locala.field_ThumbUrl_cn = ((String)paramc.get(ep(str, "ThumbUrl_cn")));
      locala.field_ThumbUrl_en = ((String)paramc.get(ep(str, "ThumbUrl_en")));
      locala.field_ThumbUrl_hk = ((String)paramc.get(ep(str, "ThumbUrl_hk")));
      locala.field_ThumbUrl_tw = ((String)paramc.get(ep(str, "ThumbUrl_tw")));
      locala.field_ImgUrl_android_cn = a(paramc, ep(str, "ImgUrl_android_cn")).replace(',', ';');
      locala.field_ImgUrl_android_tw = a(paramc, ep(str, "ImgUrl_android_tw")).replace(',', ';');
      locala.field_ImgUrl_android_en = a(paramc, ep(str, "ImgUrl_android_en")).replace(',', ';');
      locala.field_ImgUrl_android_hk = a(paramc, ep(str, "ImgUrl_android_hk")).replace(',', ';');
      if (TextUtils.isEmpty(locala.field_ImgUrl_android_cn))
        locala.field_ImgUrl_android_cn = ((String)paramc.get(ep(str, "ImgUrl_cn")));
      if (TextUtils.isEmpty(locala.field_ImgUrl_android_en))
        locala.field_ImgUrl_android_en = ((String)paramc.get(ep(str, "ImgUrl_en")));
      if (TextUtils.isEmpty(locala.field_ImgUrl_android_hk))
        locala.field_ImgUrl_android_hk = ((String)paramc.get(ep(str, "ImgUrl_hk")));
      if (TextUtils.isEmpty(locala.field_ImgUrl_android_tw))
        locala.field_ImgUrl_android_tw = ((String)paramc.get(ep(str, "ImgUrl_tw")));
      locala.field_RedPoint = bo.ank((String)paramc.get(ep(str, "RedPoint")));
      locala.field_WeAppDebugMode = bo.ank((String)paramc.get(ep(str, "WeAppDebugMode")));
      locala.field_TitleKey_android = ((String)paramc.get(ep(str, "TitleKey_android")));
      locala.field_Icon = ((String)paramc.get(ep(str, "Icon")));
      locala.field_bItemFromXExpt = 1;
      locala.field_status = bo.ank((String)paramc.get(ep(str, "status")));
      locala.field_idkey = bo.ank((String)paramc.get(ep(str, "idkey")));
      locala.field_idkeyValue = bo.ank((String)paramc.get(ep(str, "idkeyValue")));
      AppMethodBeat.o(80560);
      return locala;
      l = System.currentTimeMillis() / 1000L;
      break;
    }
  }

  private static String a(HashMap<String, String> paramHashMap, String paramString)
  {
    AppMethodBeat.i(80557);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramHashMap.containsKey(paramString))
    {
      localStringBuilder.append((String)paramHashMap.get(paramString)).append(";");
      for (int i = 1; ; i++)
      {
        String str = paramString + "_" + i;
        if (!paramHashMap.containsKey(str))
          break;
        localStringBuilder.append((String)paramHashMap.get(str)).append(";");
      }
    }
    paramHashMap = localStringBuilder.toString();
    AppMethodBeat.o(80557);
    while (true)
    {
      return paramHashMap;
      paramHashMap = localStringBuilder.toString();
      AppMethodBeat.o(80557);
    }
  }

  public static a agK(String paramString)
  {
    AppMethodBeat.i(80556);
    ab.v("MicroMsg.Welabparser", "ABTest msg content: %s", new Object[] { paramString });
    Object localObject1 = paramString.replaceAll(">\n+\\s*<", "><");
    paramString = new a();
    Object localObject2 = pd((String)localObject1);
    if (localObject2 == null)
    {
      ab.e("MicroMsg.Welabparser", "Msg parsing failed, msg: %s", new Object[] { localObject1 });
      AppMethodBeat.o(80556);
    }
    while (true)
    {
      return paramString;
      localObject1 = ((Element)localObject2).getAttributes();
      if (localObject1 != null)
        break;
      paramString = null;
      AppMethodBeat.o(80556);
    }
    localObject1 = ((NamedNodeMap)localObject1).getNamedItem("type");
    int i = 1;
    if ((localObject1 != null) && ("newabtestlabs".equals(((Node)localObject1).getNodeValue())))
    {
      localObject1 = ((Element)localObject2).getElementsByTagName("prioritylevel");
      if (((NodeList)localObject1).getLength() > 0)
        i = bo.getInt(((NodeList)localObject1).item(0).getTextContent(), 1);
      localObject1 = ((Element)localObject2).getElementsByTagName("status");
      if (((NodeList)localObject1).getLength() > 0)
        paramString.field_status = bo.getInt(((NodeList)localObject1).item(0).getTextContent(), 1);
      paramString.field_prioritylevel = i;
      localObject2 = ((Element)localObject2).getChildNodes();
      i = 0;
      if (i >= ((NodeList)localObject2).getLength())
        break label1412;
      localObject1 = ((NodeList)localObject2).item(i);
      if ((localObject1 == null) || (((Node)localObject1).getNodeType() != 1) || (!((Node)localObject1).getNodeName().equals("expinfo")))
        break label797;
    }
    label1412: label1421: label1424: 
    while (true)
    {
      long l1;
      long l2;
      long l3;
      try
      {
        while (true)
        {
          localObject1 = (Element)localObject1;
          Object localObject3 = ((Element)localObject1).getAttributes();
          if (localObject3 != null)
          {
            localObject3 = ((NamedNodeMap)localObject3).getNamedItem("id");
            if (localObject3 != null)
            {
              paramString.field_expId = ((Node)localObject3).getNodeValue();
              localObject3 = ((Element)localObject1).getElementsByTagName("sequence");
              if (((NodeList)localObject3).getLength() != 0)
              {
                l1 = bo.getLong(((NodeList)localObject3).item(0).getTextContent(), 0L);
                localObject3 = ((Element)localObject1).getElementsByTagName("starttime");
                if (((NodeList)localObject3).getLength() > 0)
                {
                  l2 = bo.getLong(((NodeList)localObject3).item(0).getTextContent(), 0L);
                  if (l2 != 0L)
                    break label1424;
                  l2 = System.currentTimeMillis() / 1000L;
                }
                try
                {
                  while (true)
                  {
                    paramString.field_idkey = bo.getInt(((Element)localObject1).getElementsByTagName("monitor").item(0).getChildNodes().item(0).getChildNodes().item(0).getTextContent(), -1);
                    paramString.field_idkeyValue = bo.getInt(((Element)localObject1).getElementsByTagName("monitor").item(0).getChildNodes().item(0).getChildNodes().item(1).getTextContent(), -1);
                    localObject3 = ((Element)localObject1).getElementsByTagName("endtime");
                    if (((NodeList)localObject3).getLength() > 0)
                    {
                      l3 = bo.getLong(((NodeList)localObject3).item(0).getTextContent(), 0L);
                      if (l3 != 0L)
                        break label1421;
                    }
                    l3 = 9223372036854775807L;
                    localObject3 = new java/util/HashMap;
                    ((HashMap)localObject3).<init>();
                    localObject1 = ((Element)localObject1).getElementsByTagName("args");
                    if (((NodeList)localObject1).getLength() <= 0)
                      break label803;
                    NodeList localNodeList = ((NodeList)localObject1).item(0).getChildNodes();
                    for (int j = 0; j < localNodeList.getLength(); j++)
                    {
                      Object localObject4 = localNodeList.item(j);
                      if ((((Node)localObject4).getNodeType() == 1) && (((Node)localObject4).getNodeName().equals("arg")))
                      {
                        localObject1 = ((Element)localObject4).getElementsByTagName("key");
                        localObject4 = ((Element)localObject4).getElementsByTagName("value");
                        if ((((NodeList)localObject1).getLength() != 0) && (((NodeList)localObject4).getLength() != 0))
                          ((HashMap)localObject3).put(((NodeList)localObject1).item(0).getTextContent(), ((NodeList)localObject4).item(0).getTextContent());
                      }
                    }
                    ab.i("MicroMsg.Welabparser", "recv illegal type msg");
                    AppMethodBeat.o(80556);
                    break;
                    l2 = System.currentTimeMillis() / 1000L;
                  }
                }
                catch (Exception localException2)
                {
                  while (true)
                    ab.e("MicroMsg.Welabparser", bo.l(localException2));
                }
              }
            }
          }
        }
      }
      catch (Exception localException1)
      {
        ab.e("MicroMsg.Welabparser", localException1.getMessage());
      }
      while (true)
      {
        label797: i++;
        break;
        label803: paramString.field_sequence = l1;
        paramString.field_starttime = l2;
        paramString.field_endtime = l3;
        paramString.field_AllVer = bo.ank((String)localException2.get("AllVer"));
        paramString.field_BizType = bo.ank((String)localException2.get("BizType"));
        paramString.field_Desc_cn = ((String)localException2.get("Desc_cn"));
        paramString.field_Desc_en = ((String)localException2.get("Desc_en"));
        paramString.field_Desc_hk = ((String)localException2.get("Desc_hk"));
        paramString.field_Desc_tw = ((String)localException2.get("Desc_tw"));
        paramString.field_DetailURL = ((String)localException2.get("DetailURL"));
        paramString.field_Introduce_cn = ((String)localException2.get("Introduce_cn"));
        paramString.field_Introduce_en = ((String)localException2.get("Introduce_en"));
        paramString.field_Introduce_hk = ((String)localException2.get("Introduce_hk"));
        paramString.field_Introduce_tw = ((String)localException2.get("Introduce_tw"));
        paramString.field_Pos = bo.ank((String)localException2.get("Pos"));
        paramString.field_Type = bo.ank((String)localException2.get("Type"));
        paramString.field_Switch = bo.ank((String)localException2.get("Switch"));
        paramString.field_WeAppPath = ((String)localException2.get("WeAppPath"));
        paramString.field_WeAppUser = ((String)localException2.get("WeAppUser"));
        paramString.field_LabsAppId = ((String)localException2.get("LabsAppId"));
        paramString.field_TitleKey_android = ((String)localException2.get("TitleKey_android"));
        paramString.field_Title_cn = ((String)localException2.get("Title_cn"));
        paramString.field_Title_en = ((String)localException2.get("Title_en"));
        paramString.field_Title_hk = ((String)localException2.get("Title_hk"));
        paramString.field_Title_tw = ((String)localException2.get("Title_tw"));
        paramString.field_ThumbUrl_cn = ((String)localException2.get("ThumbUrl_cn"));
        paramString.field_ThumbUrl_en = ((String)localException2.get("ThumbUrl_en"));
        paramString.field_ThumbUrl_hk = ((String)localException2.get("ThumbUrl_hk"));
        paramString.field_ThumbUrl_tw = ((String)localException2.get("ThumbUrl_tw"));
        paramString.field_ImgUrl_android_cn = a(localException2, "ImgUrl_android_cn");
        paramString.field_ImgUrl_android_tw = a(localException2, "ImgUrl_android_tw");
        paramString.field_ImgUrl_android_en = a(localException2, "ImgUrl_android_en");
        paramString.field_ImgUrl_android_hk = a(localException2, "ImgUrl_android_hk");
        if (TextUtils.isEmpty(paramString.field_ImgUrl_android_cn))
          paramString.field_ImgUrl_android_cn = ((String)localException2.get("ImgUrl_cn"));
        if (TextUtils.isEmpty(paramString.field_ImgUrl_android_en))
          paramString.field_ImgUrl_android_en = ((String)localException2.get("ImgUrl_en"));
        if (TextUtils.isEmpty(paramString.field_ImgUrl_android_hk))
          paramString.field_ImgUrl_android_hk = ((String)localException2.get("ImgUrl_hk"));
        if (TextUtils.isEmpty(paramString.field_ImgUrl_android_tw))
          paramString.field_ImgUrl_android_tw = ((String)localException2.get("ImgUrl_tw"));
        paramString.field_RedPoint = bo.ank((String)localException2.get("RedPoint"));
        paramString.field_WeAppDebugMode = bo.ank((String)localException2.get("WeAppDebugMode"));
        paramString.field_TitleKey_android = ((String)localException2.get("TitleKey_android"));
        paramString.field_Icon = ((String)localException2.get("Icon"));
      }
      AppMethodBeat.o(80556);
      break;
    }
  }

  public static List<String> agL(String paramString)
  {
    AppMethodBeat.i(80558);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = Collections.EMPTY_LIST;
      AppMethodBeat.o(80558);
    }
    while (true)
    {
      return paramString;
      paramString = Arrays.asList(paramString.split(";"));
      AppMethodBeat.o(80558);
    }
  }

  private static String ep(String paramString1, String paramString2)
  {
    AppMethodBeat.i(80561);
    paramString1 = (paramString1 + "_" + paramString2).toLowerCase();
    AppMethodBeat.o(80561);
    return paramString1;
  }

  private static Element pd(String paramString)
  {
    AppMethodBeat.i(80559);
    try
    {
      InputSource localInputSource = new org/xml/sax/InputSource;
      ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
      localByteArrayInputStream.<init>(paramString.getBytes());
      localInputSource.<init>(localByteArrayInputStream);
      if (foC != null)
        paramString = foC;
      while (true)
      {
        paramString = paramString.parse(localInputSource);
        paramString.normalize();
        paramString = paramString.getDocumentElement();
        AppMethodBeat.o(80559);
        return paramString;
        paramString = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        foC = paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Welabparser", paramString.toString());
        paramString = null;
        AppMethodBeat.o(80559);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.f
 * JD-Core Version:    0.6.2
 */
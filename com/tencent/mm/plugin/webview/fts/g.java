package com.tencent.mm.plugin.webview.fts;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ig;
import com.tencent.mm.g.a.ig.a;
import com.tencent.mm.g.a.ns;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.fts.a.a.d.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.websearch.api.af;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.protocal.protobuf.bem;
import com.tencent.mm.protocal.protobuf.cgg;
import com.tencent.mm.protocal.protobuf.cmg;
import com.tencent.mm.protocal.protobuf.cvf;
import com.tencent.mm.protocal.protobuf.cxo;
import com.tencent.mm.protocal.protobuf.li;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
  implements com.tencent.mm.ai.f
{
  static final long ufL;
  public com.tencent.mm.plugin.fts.a.a.a mEx;
  private com.tencent.mm.plugin.fts.a.l plf;
  private al rdm;
  public cvf tZK;
  private Set<String> ufM;
  volatile boolean ufO;
  volatile boolean ufP;
  volatile CountDownLatch ufQ;
  private volatile s ufR;
  volatile boolean ufT;
  public com.tencent.mm.sdk.b.c ufU;
  public int ugc;
  public cvf ugd;
  public Map<String, Integer> uge;
  long ugf;
  public com.tencent.mm.sdk.b.c ugg;
  private com.tencent.mm.plugin.websearch.c.a.c ugh;
  public g.a ugi;
  public g.b ugj;

  static
  {
    AppMethodBeat.i(5762);
    ufL = com.tencent.mm.ui.d.dwu() + 500;
    AppMethodBeat.o(5762);
  }

  public g()
  {
    AppMethodBeat.i(5747);
    this.rdm = new al("WebSearchLogic_worker");
    this.ugc = 0;
    this.uge = new HashMap();
    this.ufU = new com.tencent.mm.sdk.b.c()
    {
    };
    this.ugg = new g.2(this);
    this.ugh = new com.tencent.mm.plugin.websearch.c.a.b();
    this.ugi = new g.a(this, (byte)0);
    this.ugj = new g.b(this, (byte)0);
    this.plf = new g.5(this);
    ab.d("MicroMsg.FTS.WebSearchLogic", "create WebSearchLogic");
    this.ufU.dnU();
    this.ugg.dnU();
    this.ufM = new HashSet();
    this.ufM.add("netType");
    this.ufM.add("currentPage");
    this.ufM.add("requestId");
    this.ufM.add("parentSearchID");
    cWp();
    AppMethodBeat.o(5747);
  }

  private static boolean Iy(int paramInt)
  {
    if (paramInt == 201);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static final JSONObject a(com.tencent.mm.plugin.fts.a.a.l paraml, com.tencent.mm.plugin.fts.a.a.g paramg)
  {
    AppMethodBeat.i(5758);
    Object localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paraml.mDx);
    Object localObject2 = com.tencent.mm.plugin.fts.a.d.LC(paraml.mDx);
    boolean bool1;
    boolean bool2;
    int i;
    int j;
    Object localObject3;
    Object localObject4;
    switch (paraml.mDw)
    {
    case 8:
    case 9:
    case 10:
    case 12:
    case 13:
    case 14:
    default:
      bool1 = false;
      bool2 = false;
      i = 0;
      j = 0;
      localObject3 = null;
      localObject4 = null;
      label261: if (j != 0)
      {
        localObject2 = com.tencent.mm.plugin.fts.a.a.d.a((CharSequence)localObject2, paramg, bool2, bool1);
        ((com.tencent.mm.plugin.fts.a.a.d)localObject2).mDD = d.a.mDM;
        ((com.tencent.mm.plugin.fts.a.a.d)localObject2).mDI = "<em class=\"highlight\">";
        ((com.tencent.mm.plugin.fts.a.a.d)localObject2).mDJ = "</em>";
        localObject2 = com.tencent.mm.plugin.fts.a.f.a((com.tencent.mm.plugin.fts.a.a.d)localObject2).mDR.toString();
        label193: if (i != 0)
        {
          paramg = com.tencent.mm.plugin.fts.a.a.d.a((CharSequence)localObject3, paramg, bool2, bool1);
          paramg.mDD = d.a.mDM;
          paramg.mDI = "<em class=\"highlight\">";
          paramg.mDJ = "</em>";
          paramg = com.tencent.mm.plugin.fts.a.f.a(paramg).mDR.toString();
          paramg = (String)localObject4 + paramg;
          localObject3 = new JSONObject();
        }
      }
      break;
    case 3:
    case 7:
    case 4:
    case 15:
    case 16:
    case 18:
    case 17:
    case 11:
    case 2:
    case 1:
    case 6:
    case 5:
    }
    while (true)
    {
      try
      {
        ((JSONObject)localObject3).put("nickName", com.tencent.mm.plugin.fts.a.d.LC(paraml.mDx));
        ((JSONObject)localObject3).put("userName", paraml.mDx);
        if (j != 0)
          ((JSONObject)localObject3).put("nickNameHighlight", localObject2);
        if (i != 0)
          ((JSONObject)localObject3).put("extraHighlight", paramg);
        AppMethodBeat.o(5758);
        return localObject3;
        bool1 = true;
        bool2 = true;
        i = 0;
        j = 1;
        localObject3 = null;
        localObject4 = null;
        break;
        bool1 = true;
        bool2 = true;
        localObject3 = ((ap)localObject1).field_nickname;
        localObject4 = ah.getContext().getString(2131302829);
        i = 1;
        j = 0;
        break;
        localObject3 = ((ap)localObject1).dul;
        localObject4 = ah.getContext().getString(2131302824);
        bool1 = false;
        bool2 = false;
        i = 1;
        j = 0;
        break;
        localObject4 = ((ad)localObject1).Hq();
        localObject3 = localObject4;
        if (bo.isNullOrNil((String)localObject4))
          localObject3 = ((ap)localObject1).field_username;
        localObject4 = ah.getContext().getString(2131302833);
        bool1 = false;
        bool2 = false;
        i = 1;
        j = 0;
        break;
        localObject4 = paraml.content;
        if (bo.isNullOrNil((String)localObject4))
          break label829;
        localObject1 = ((String)localObject4).split("​");
        j = localObject1.length;
        i = 0;
        if (i >= j)
          break label829;
        localObject3 = localObject1[i];
        if (((String)localObject3).startsWith(paramg.mDY))
        {
          localObject4 = ah.getContext().getString(2131302828);
          bool1 = false;
          bool2 = false;
          i = 1;
          j = 0;
          break;
        }
        i++;
        continue;
        localObject3 = paraml.content;
        localObject4 = ah.getContext().getString(2131302830);
        bool1 = false;
        bool2 = false;
        i = 1;
        j = 0;
        break;
        localObject3 = paraml.content;
        localObject4 = ah.getContext().getString(2131302823);
        bool1 = false;
        bool2 = false;
        i = 1;
        j = 0;
        break;
        localObject1 = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSMainDB().MX(((ap)localObject1).field_contactLabelIds);
        StringBuffer localStringBuffer = new StringBuffer();
        String[] arrayOfString = paramg.mEa;
        j = arrayOfString.length;
        i = 0;
        if (i < j)
        {
          String str = arrayOfString[i];
          localObject4 = ((List)localObject1).iterator();
          if (((Iterator)localObject4).hasNext())
          {
            localObject3 = (String)((Iterator)localObject4).next();
            if (!com.tencent.mm.plugin.fts.a.d.Nb((String)localObject3).contains(str))
              continue;
            localStringBuffer.append((String)localObject3);
            localStringBuffer.append(",");
            continue;
          }
          i++;
          continue;
        }
        localStringBuffer.trimToSize();
        if (localStringBuffer.length() == 0)
        {
          localObject3 = "";
          localObject4 = ah.getContext().getString(2131302832);
          bool1 = false;
          bool2 = false;
          i = 1;
          j = 0;
          break;
        }
        localObject3 = localStringBuffer.substring(0, localStringBuffer.length() - 1);
        continue;
      }
      catch (JSONException paraml)
      {
        continue;
      }
      paramg = (com.tencent.mm.plugin.fts.a.a.g)localObject3;
      break label261;
      break label193;
      label829: localObject3 = localObject4;
      continue;
      bool1 = false;
      continue;
      bool1 = false;
      bool2 = false;
      continue;
      bool1 = false;
      continue;
      bool1 = false;
      bool2 = false;
    }
  }

  private void a(int paramInt, String paramString1, boolean paramBoolean, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(5756);
    this.rdm.aa(new g.4(this, paramInt, paramString2, paramString1, paramBoolean, paramBundle));
    AppMethodBeat.o(5756);
  }

  // ERROR //
  private static Set<String> aE(Map<String, Object> paramMap)
  {
    // Byte code:
    //   0: sipush 5750
    //   3: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc_w 408
    //   10: invokestatic 414	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   13: astore_0
    //   14: aload_0
    //   15: invokestatic 299	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   18: ifne +91 -> 109
    //   21: new 134	java/util/HashSet
    //   24: astore_1
    //   25: aload_1
    //   26: invokespecial 135	java/util/HashSet:<init>	()V
    //   29: new 416	org/json/JSONArray
    //   32: astore_2
    //   33: aload_2
    //   34: aload_0
    //   35: invokespecial 417	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   38: iconst_0
    //   39: istore_3
    //   40: aload_1
    //   41: astore_0
    //   42: iload_3
    //   43: aload_2
    //   44: invokevirtual 418	org/json/JSONArray:length	()I
    //   47: if_icmpge +54 -> 101
    //   50: aload_2
    //   51: iload_3
    //   52: invokevirtual 422	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   55: astore_0
    //   56: new 424	com/tencent/mm/protocal/protobuf/tn
    //   59: invokespecial 425	com/tencent/mm/protocal/protobuf/tn:<init>	()V
    //   62: aload_1
    //   63: aload_0
    //   64: ldc_w 427
    //   67: ldc_w 387
    //   70: invokevirtual 431	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   73: invokeinterface 145 2 0
    //   78: pop
    //   79: iinc 3 1
    //   82: goto -42 -> 40
    //   85: astore_1
    //   86: aconst_null
    //   87: astore_0
    //   88: ldc 118
    //   90: aload_1
    //   91: ldc_w 387
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokestatic 435	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: sipush 5750
    //   104: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: aload_0
    //   108: areturn
    //   109: invokestatic 441	java/util/Collections:emptySet	()Ljava/util/Set;
    //   112: astore_0
    //   113: goto -12 -> 101
    //   116: astore_2
    //   117: aload_1
    //   118: astore_0
    //   119: aload_2
    //   120: astore_1
    //   121: goto -33 -> 88
    //
    // Exception table:
    //   from	to	target	type
    //   21	29	85	java/lang/Exception
    //   29	38	116	java/lang/Exception
    //   42	79	116	java/lang/Exception
  }

  private s aF(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5754);
    int i = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "scene", 0);
    s locals = new s();
    locals.ctj = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query");
    locals.offset = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "offset", 0);
    locals.businessType = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "type", 0);
    locals.scene = i;
    locals.tZy = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "sugId");
    locals.tZA = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "sugType", 0);
    locals.tZz = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "prefixSug");
    locals.tZL = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "poiInfo");
    if (com.tencent.mm.plugin.websearch.api.aa.u(paramMap, "isHomePage"))
      i = 1;
    JSONObject localJSONObject;
    while (true)
    {
      locals.tZw = i;
      locals.lcA = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "searchId");
      if (paramMap.containsKey("sessionId"))
        locals.cvF = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "sessionId");
      locals.cIC = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "sceneActionType", 1);
      locals.tZC = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "displayPattern", 2);
      locals.tZD = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "sugPosition", 0);
      locals.tZE = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "sugBuffer");
      locals.nQB = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "requestId");
      locals.cvF = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "sessionId");
      locals.cIy = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "subSessionId");
      locals.tZM = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "tagId");
      localObject1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "extReqParams");
      if (!bo.isNullOrNil((String)localObject1))
        try
        {
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>((String)localObject1);
          i = 0;
          while (i < localJSONArray.length())
          {
            localJSONObject = localJSONArray.getJSONObject(i);
            localObject1 = new com/tencent/mm/protocal/protobuf/tn;
            ((tn)localObject1).<init>();
            ((tn)localObject1).key = localJSONObject.optString("key", "");
            ((tn)localObject1).waD = localJSONObject.optInt("uintValue", 0);
            ((tn)localObject1).waE = localJSONObject.optString("textValue", "");
            locals.tZG.add(localObject1);
            i++;
            continue;
            i = 0;
          }
        }
        catch (Exception localException1)
        {
          ab.printErrStackTrace("MicroMsg.FTS.WebSearchLogic", localException1, "commKvJSONArray", new Object[0]);
        }
    }
    Object localObject1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "matchUser");
    if (!bo.isNullOrNil((String)localObject1));
    try
    {
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>((String)localObject1);
      localObject1 = new com/tencent/mm/protocal/protobuf/cmg;
      ((cmg)localObject1).<init>();
      ((cmg)localObject1).jBB = ((JSONObject)localObject2).optString("userName");
      ((cmg)localObject1).xkl = ((JSONObject)localObject2).optString("matchWord");
      if (!TextUtils.isEmpty(((cmg)localObject1).jBB))
        locals.tZx.add(localObject1);
      localObject1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "prefixQuery");
      if (bo.isNullOrNil((String)localObject1));
    }
    catch (Exception localException2)
    {
      try
      {
        Object localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>((String)localObject1);
        i = 0;
        while (i < ((JSONArray)localObject2).length())
        {
          localObject1 = ((JSONArray)localObject2).getString(i);
          locals.tZB.add(localObject1);
          i++;
          continue;
          localException2 = localException2;
          ab.printErrStackTrace("MicroMsg.FTS.WebSearchLogic", localException2, "matchUserJSONArray", new Object[0]);
        }
      }
      catch (Exception localException3)
      {
        ab.printErrStackTrace("MicroMsg.FTS.WebSearchLogic", localException3, "prefixQueryJSONArray", new Object[0]);
      }
      localObject1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "tagInfo");
      if (!bo.isNullOrNil((String)localObject1));
      try
      {
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>((String)localObject1);
        localObject1 = new com/tencent/mm/protocal/protobuf/cgg;
        ((cgg)localObject1).<init>();
        locals.tZF = ((cgg)localObject1);
        locals.tZF.xfp = ((JSONObject)localObject3).optString("tagText");
        locals.tZF.xfo = ((JSONObject)localObject3).optInt("tagType");
        locals.tZF.xfq = ((JSONObject)localObject3).optString("tagExtValue");
        localObject1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "numConditions");
        if (bo.isNullOrNil((String)localObject1));
      }
      catch (Exception localException4)
      {
        try
        {
          Object localObject3 = new org/json/JSONArray;
          ((JSONArray)localObject3).<init>((String)localObject1);
          i = 0;
          while (i < ((JSONArray)localObject3).length())
          {
            localJSONObject = ((JSONArray)localObject3).optJSONObject(i);
            localObject1 = new com/tencent/mm/protocal/protobuf/bem;
            ((bem)localObject1).<init>();
            ((bem)localObject1).wIB = localJSONObject.optLong("from");
            ((bem)localObject1).wIC = localJSONObject.optLong("to");
            ((bem)localObject1).wIA = localJSONObject.optInt("field");
            locals.tZH.add(localObject1);
            i++;
            continue;
            localException4 = localException4;
            ab.printErrStackTrace("MicroMsg.FTS.WebSearchLogic", localException4, "tagInfoObj", new Object[0]);
          }
        }
        catch (Exception localException5)
        {
          ab.printErrStackTrace("MicroMsg.FTS.WebSearchLogic", localException5, "numConditionsArray", new Object[0]);
        }
        locals.cIv = bo.g(paramMap.get("webview_instance_id"), -1);
        locals.aOt = com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext());
        locals.mDw = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "subType", 0);
        if (com.tencent.mm.plugin.appbrand.r.r.aNU())
        {
          locals.tZI = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "isWeAppMore", 0);
          if (locals.tZI == 1)
          {
            locals.tZJ = new cxo();
            localObject4 = new ig();
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject4);
            locals.tZJ.xsP = ((ig)localObject4).cDp.cDq;
            locals.tZJ.xsR = com.tencent.mm.modelappbrand.b.fpE;
            locals.tZJ.xsQ = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "subType", 0);
            locals.tZJ.session_id = com.tencent.mm.modelappbrand.b.fpD;
            locals.tZJ.xsS = locals.tZD;
            localObject4 = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xQh, null);
            if ((localObject4 != null) && ((localObject4 instanceof String)))
              locals.tZJ.xrS = ((String)localObject4);
          }
        }
        if (this.ugc != 1)
          break label1283;
      }
      locals.tZK = this.tZK;
    }
    Object localObject4 = locals.ctj;
    com.tencent.mm.plugin.webview.fts.b.a.a.cWt();
    localObject4 = com.tencent.mm.plugin.webview.fts.b.a.a.aeb((String)localObject4);
    if (localObject4 == null);
    for (localObject4 = ""; ; localObject4 = ((com.tencent.mm.plugin.webview.fts.b.a.a.a)localObject4).ugB)
    {
      if (!TextUtils.isEmpty((CharSequence)localObject4))
      {
        locals.ctj = ((String)localObject4);
        locals.tZK = this.tZK;
      }
      if ((locals.scene == 33) && (this.ugd != null))
      {
        if (locals.tZK == null)
          locals.tZK = new cvf();
        if (locals.tZK.xrk == null)
          locals.tZK.xrk = new li();
        if (this.ugd.xrk != null)
        {
          locals.tZK.xrk.vOV = this.ugd.xrk.vOV;
          ab.i("MicroMsg.FTS.WebSearchLogic", "websearch from url [%s]", new Object[] { this.ugd.xrk.vOV });
        }
        this.ugd = null;
      }
      if ((locals.businessType == 262144) && (this.ugd != null) && (this.ugd.xrk.vOS == 1))
      {
        localObject4 = new Bundle();
        ((Bundle)localObject4).putInt("isRefresh", 1);
        ((Bundle)localObject4).putString("widgetId", com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "widgetId"));
        locals.tZN = ((Bundle)localObject4);
        locals.tZK = this.ugd;
        this.ugd = null;
      }
      AppMethodBeat.o(5754);
      return locals;
      label1283: locals.tZK = null;
      break;
      ab.i("MicroMsg.FTS.WebSearchLogic", "test-widget-ui args %s, %s, %s, %s", new Object[] { ((com.tencent.mm.plugin.webview.fts.b.a.a.a)localObject4).ugB, ((com.tencent.mm.plugin.webview.fts.b.a.a.a)localObject4).csB, ((com.tencent.mm.plugin.webview.fts.b.a.a.a)localObject4).ugz, ((com.tencent.mm.plugin.webview.fts.b.a.a.a)localObject4).ugA });
      this.tZK = new cvf();
      this.tZK.xrj = 1L;
      this.tZK.xrk = new li();
      this.tZK.xrk.csB = ((com.tencent.mm.plugin.webview.fts.b.a.a.a)localObject4).csB;
      this.tZK.xrk.vOO = bo.ank(((com.tencent.mm.plugin.webview.fts.b.a.a.a)localObject4).ugz);
      this.tZK.xrk.kLN = ((com.tencent.mm.plugin.webview.fts.b.a.a.a)localObject4).ugA;
    }
  }

  private boolean ay(LinkedList<tn> paramLinkedList)
  {
    AppMethodBeat.i(5753);
    HashSet localHashSet = new HashSet();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
      localHashSet.add(((tn)paramLinkedList.next()).key);
    boolean bool = this.ufM.equals(localHashSet);
    AppMethodBeat.o(5753);
    return bool;
  }

  public static void bB(int paramInt, String paramString)
  {
    AppMethodBeat.i(5752);
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", Integer.valueOf(paramInt));
    localHashMap.put("statSessionId", paramString);
    paramString = new c(localHashMap, 1);
    com.tencent.mm.kernel.g.Rg().a(paramString, 0);
    AppMethodBeat.o(5752);
  }

  private boolean k(Set<String> paramSet)
  {
    AppMethodBeat.i(5749);
    boolean bool;
    if ((paramSet == null) || (this.ufM.containsAll(paramSet)))
    {
      bool = true;
      AppMethodBeat.o(5749);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5749);
    }
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, String paramString5, String paramString6, int paramInt2)
  {
    AppMethodBeat.i(5751);
    ab.i("MicroMsg.FTS.WebSearchLogic", "preGetSearchData");
    HashMap localHashMap = new HashMap();
    localHashMap.put("displayPattern", "2");
    localHashMap.put("query", paramString4);
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("type", "0");
    localHashMap.put("isHomePage", "1");
    localHashMap.put("sugId", paramString6);
    localHashMap.put("sceneActionType", Integer.valueOf(paramInt2));
    paramString4 = new JSONArray();
    try
    {
      paramString6 = new org/json/JSONObject;
      paramString6.<init>();
      paramString6.put("key", "netType");
      paramString6.put("textValue", com.tencent.mm.plugin.websearch.api.aa.bVP());
      paramString4.put(paramString6);
      paramString6 = new org/json/JSONObject;
      paramString6.<init>();
      paramString6.put("key", "currentPage");
      paramString6.put("textValue", 1);
      paramString4.put(paramString6);
      paramString6 = new org/json/JSONObject;
      paramString6.<init>();
      paramString6.put("key", "requestId");
      paramString6.put("textValue", paramString1);
      paramString4.put(paramString6);
      paramString6 = new org/json/JSONObject;
      paramString6.<init>();
      paramString6.put("key", "parentSearchID");
      paramString6.put("textValue", paramString5);
      paramString4.put(paramString6);
      localHashMap.put("extReqParams", paramString4.toString());
      localHashMap.put("sessionId", paramString2);
      localHashMap.put("subSessionId", paramString3);
      localHashMap.put("requestId", paramString1);
      paramString1 = aF(localHashMap);
      paramString1.tZO = true;
      if (!ay(paramString1.tZG))
      {
        paramString1 = new IllegalStateException("pre get data must use same commKvSets with hardcode set");
        AppMethodBeat.o(5751);
        throw paramString1;
      }
    }
    catch (JSONException paramString5)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.FTS.WebSearchLogic", paramString5, "", new Object[0]);
      this.ugi.b(paramString1);
      AppMethodBeat.o(5751);
    }
    return false;
  }

  public final boolean aD(Map<String, Object> paramMap)
  {
    int i = 1;
    AppMethodBeat.i(5748);
    ab.i("MicroMsg.FTS.WebSearchLogic", "getSearchData: %s", new Object[] { paramMap.toString() });
    h.JR(bo.g(paramMap.get("webview_instance_id"), -1)).c(com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "type", 0), com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query"), paramMap);
    int j;
    if (this.ufO)
    {
      this.ufO = false;
      j = bo.g(paramMap.get("webview_instance_id"), -1);
      if (this.ufR != null)
        this.ufR.cIv = j;
      if (!k(aE(paramMap)))
      {
        ab.e("MicroMsg.FTS.WebSearchLogic", "wtf , recv unsupported commKvSet after pre get, interrupt pre get now");
        this.ufP = true;
        if (this.ufQ != null)
          this.ufQ.countDown();
        j = 0;
        if (j == 0)
          break label242;
        ab.i("MicroMsg.FTS.WebSearchLogic", "waiting for pre getdata back");
        AppMethodBeat.o(5748);
      }
    }
    while (true)
    {
      return false;
      if (this.ufQ != null)
        this.ufQ.countDown();
      j = i;
      if (this.ufR == null)
        break;
      ab.i("MicroMsg.FTS.WebSearchLogic", "do not send this call, wait for pre get, webivewId %d, %s", new Object[] { Integer.valueOf(this.ufR.cIv), this.ufR });
      j = i;
      break;
      if (this.ufQ != null)
        this.ufQ.countDown();
      j = 0;
      break;
      label242: paramMap = aF(paramMap);
      this.ugi.b(paramMap);
      AppMethodBeat.o(5748);
    }
  }

  public final boolean aG(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5757);
    ab.i("MicroMsg.FTS.WebSearchLogic", "getSuggestionData %s", new Object[] { paramMap });
    Object localObject1 = new s();
    ((s)localObject1).ctj = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query");
    try
    {
      ((s)localObject1).ctj = URLDecoder.decode(((s)localObject1).ctj, "UTF-8");
      label55: ((s)localObject1).businessType = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "type", 0);
      ((s)localObject1).scene = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "scene", 0);
      int i;
      Object localObject2;
      if (com.tencent.mm.plugin.websearch.api.aa.u(paramMap, "isHomePage"))
      {
        i = 1;
        ((s)localObject1).tZw = i;
        ((s)localObject1).cIv = bo.g(paramMap.get("webview_instance_id"), -1);
        ((s)localObject1).tZB.add(com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "prefixQuery"));
        i = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "requestType", 0);
        ((s)localObject1).mDw = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "subtype", 0);
        ab.i("MicroMsg.FTS.WebSearchLogic", "getSearchData, webviewID = %d", new Object[] { Integer.valueOf(((s)localObject1).cIv) });
        if (com.tencent.mm.plugin.appbrand.r.r.aNU())
        {
          ((s)localObject1).tZI = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "isWeAppMore", 0);
          if (((s)localObject1).tZI == 1)
          {
            ((s)localObject1).tZJ = new cxo();
            localObject2 = new ig();
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
            ((s)localObject1).tZJ.xsP = ((ig)localObject2).cDp.cDq;
            ((s)localObject1).tZJ.xsR = com.tencent.mm.modelappbrand.b.fpE;
            ((s)localObject1).tZJ.xsQ = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "subType", 0);
            ((s)localObject1).tZJ.session_id = com.tencent.mm.modelappbrand.b.fpD;
            paramMap = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xQh, null);
            if ((paramMap != null) && ((paramMap instanceof String)))
              ((s)localObject1).tZJ.xrS = ((String)paramMap);
          }
        }
        switch (i)
        {
        default:
        case 0:
        case 2:
        case 1:
        }
      }
      int j;
      do
      {
        while (true)
        {
          AppMethodBeat.o(5757);
          return false;
          i = 0;
          break;
          localObject2 = this.ugj;
          if (((g.b)localObject2).ugp != null)
          {
            com.tencent.mm.kernel.g.Rg().b(((g.b)localObject2).ugp.getType(), ((g.b)localObject2).ugk);
            com.tencent.mm.kernel.g.Rg().c(((g.b)localObject2).ugp);
            ((g.b)localObject2).ugp = null;
          }
          if (((g.b)localObject2).ugp == null)
          {
            if (!com.tencent.mm.plugin.appbrand.r.r.aNU())
              if (Iy(((s)localObject1).scene))
                paramMap = new com.tencent.mm.modelappbrand.r(((s)localObject1).ctj, ((s)localObject1).scene, ((s)localObject1).cIv);
            while (true)
            {
              ((g.b)localObject2).ugp = paramMap;
              com.tencent.mm.kernel.g.Rg().a(((g.b)localObject2).ugp.getType(), ((g.b)localObject2).ugk);
              com.tencent.mm.kernel.g.Rg().a(((g.b)localObject2).ugp, 0);
              break;
              paramMap = new e((s)localObject1);
              continue;
              paramMap = new e((s)localObject1);
            }
            h.JR(((s)localObject1).cIv).agq(af.cVm());
          }
        }
        localObject2 = ((s)localObject1).ctj;
        i = ((s)localObject1).businessType;
        j = ((s)localObject1).cIv;
      }
      while (bo.isNullOrNil((String)localObject2));
      if (this.mEx != null)
      {
        ((n)com.tencent.mm.kernel.g.M(n.class)).cancelSearchTask(this.mEx);
        this.mEx = null;
      }
      switch (i)
      {
      default:
        paramMap = null;
      case 8:
      }
      while (paramMap != null)
      {
        localObject1 = new i();
        ((i)localObject1).hbo = 16;
        ((i)localObject1).query = ((String)localObject2);
        ((i)localObject1).mEr = paramMap;
        ((i)localObject1).mEt = 5;
        ((i)localObject1).mEv = com.tencent.mm.plugin.fts.a.c.b.mEV;
        ((i)localObject1).mEu = new HashSet();
        ((i)localObject1).mEw = this.plf;
        this.mEx = ((n)com.tencent.mm.kernel.g.M(n.class)).search(2, (i)localObject1);
        this.mEx.mDs = Integer.valueOf(j);
        break;
        paramMap = new int[1];
        paramMap[0] = 131072;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label55;
    }
  }

  public final void cWp()
  {
    AppMethodBeat.i(5759);
    String str = com.tencent.mm.plugin.websearch.api.aa.If(0);
    ab.i("MicroMsg.FTS.WebSearchLogic", "config commKV %s", new Object[] { str });
    if (TextUtils.isEmpty(str))
    {
      this.ufT = true;
      AppMethodBeat.o(5759);
    }
    while (true)
    {
      return;
      this.ufT = k(new HashSet(Arrays.asList(str.split(","))));
      AppMethodBeat.o(5759);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(5755);
    int i;
    if (paramm != null)
      i = paramm.getType();
    while (true)
    {
      ab.v("MicroMsg.FTS.WebSearchLogic", "onSceneEnd(type : %s), errType : %s, errCode : %s, errMsg : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
      JSONObject localJSONObject;
      if ((paramm instanceof com.tencent.mm.plugin.websearch.api.a))
      {
        com.tencent.mm.kernel.g.Rg().b(paramm.getType(), this);
        paramString = (com.tencent.mm.plugin.websearch.api.a)paramm;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.i("MicroMsg.FTS.WebSearchLogic", "net scene fail %s", new Object[] { paramString.bAk() });
          localJSONObject = new JSONObject();
        }
      }
      try
      {
        localJSONObject.put("ret", -1);
        label128: paramm = localJSONObject.toString();
        a(paramString.cUO(), paramm, paramString.cUP(), paramString.cUR(), null);
        AppMethodBeat.o(5755);
        while (true)
        {
          return;
          i = 0;
          break;
          paramm = paramString.abH();
          paramInt1 = paramString.abI();
          ab.i("MicroMsg.FTS.WebSearchLogic", "callback %s", new Object[] { paramString.bAk() });
          a(paramString.cUO(), paramm, paramString.cUP(), paramString.cUR(), paramString.cUQ());
          if (paramInt1 > 0)
          {
            ab.i("MicroMsg.FTS.WebSearchLogic", "updateCode %d, need update", new Object[] { Integer.valueOf(paramInt1) });
            b.c.dif();
            com.tencent.mm.pluginsdk.g.a.a.b.Ky(27);
          }
          AppMethodBeat.o(5755);
          continue;
          if ((paramm instanceof com.tencent.mm.plugin.websearch.api.b))
          {
            com.tencent.mm.kernel.g.Rg().b(paramm.getType(), this);
            paramString = (com.tencent.mm.plugin.websearch.api.b)paramm;
            if ((paramInt1 != 0) || (paramInt2 != 0))
            {
              ab.i("MicroMsg.FTS.WebSearchLogic", "net scene fail %s", new Object[] { paramString.getQuery() });
              h.JR(paramString.cUO()).agq("{}");
              AppMethodBeat.o(5755);
            }
            else
            {
              paramm = paramString.abH();
              h.JR(paramString.cUO()).agq(paramm);
            }
          }
          else
          {
            AppMethodBeat.o(5755);
          }
        }
      }
      catch (JSONException paramm)
      {
        break label128;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.g
 * JD-Core Version:    0.6.2
 */
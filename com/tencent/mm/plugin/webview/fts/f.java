package com.tencent.mm.plugin.webview.fts;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ig;
import com.tencent.mm.g.a.ig.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.appbrand.r.r;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.protocal.protobuf.bem;
import com.tencent.mm.protocal.protobuf.cgg;
import com.tencent.mm.protocal.protobuf.cmg;
import com.tencent.mm.protocal.protobuf.cxo;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
  implements com.tencent.mm.ai.f
{
  private static final long ufL;
  private static f ufS;
  private al rdm;
  private Set<String> ufM;
  public f.a ufN;
  private volatile boolean ufO;
  private volatile boolean ufP;
  private volatile CountDownLatch ufQ;
  private volatile s ufR;
  private volatile boolean ufT;
  public c ufU;

  static
  {
    AppMethodBeat.i(5735);
    ufL = d.dwu() + 500;
    ufS = new f();
    AppMethodBeat.o(5735);
  }

  public f()
  {
    AppMethodBeat.i(5726);
    this.rdm = new al("RecommendLogic_worker");
    this.ufN = new f.a(this, (byte)0);
    this.ufU = new f.1(this);
    ab.d("MicroMsg.TopStory.RecommendLogic", "create RecommendLogic");
    ab.d("MicroMsg.TopStory.RecommendLogic", "create RecommendLogic, duplicate for patch fix");
    this.ufU.dnU();
    this.ufM = new HashSet();
    this.ufM.add("netType");
    this.ufM.add("time_zone_min");
    this.ufM.add("currentPage");
    this.ufM.add("is_prefetch");
    this.ufM.add("direction");
    this.ufM.add("seq");
    this.ufM.add("client_exposed_info");
    this.ufM.add("requestId");
    this.ufM.add("recType");
    this.ufM.add("redPointMsgId");
    cWp();
    AppMethodBeat.o(5726);
  }

  private void a(int paramInt, String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(5732);
    this.rdm.aa(new f.2(this, paramInt, paramString2, paramString1, paramBoolean));
    AppMethodBeat.o(5732);
  }

  // ERROR //
  private static Set<String> aE(Map<String, Object> paramMap)
  {
    // Byte code:
    //   0: sipush 5729
    //   3: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc 151
    //   9: invokestatic 157	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   12: astore_0
    //   13: aload_0
    //   14: invokestatic 163	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   17: ifne +88 -> 105
    //   20: new 96	java/util/HashSet
    //   23: astore_1
    //   24: aload_1
    //   25: invokespecial 97	java/util/HashSet:<init>	()V
    //   28: new 165	org/json/JSONArray
    //   31: astore_2
    //   32: aload_2
    //   33: aload_0
    //   34: invokespecial 166	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   37: iconst_0
    //   38: istore_3
    //   39: aload_1
    //   40: astore_0
    //   41: iload_3
    //   42: aload_2
    //   43: invokevirtual 169	org/json/JSONArray:length	()I
    //   46: if_icmpge +51 -> 97
    //   49: aload_2
    //   50: iload_3
    //   51: invokevirtual 173	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   54: astore_0
    //   55: new 175	com/tencent/mm/protocal/protobuf/tn
    //   58: invokespecial 176	com/tencent/mm/protocal/protobuf/tn:<init>	()V
    //   61: aload_1
    //   62: aload_0
    //   63: ldc 178
    //   65: ldc 180
    //   67: invokevirtual 186	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   70: invokeinterface 107 2 0
    //   75: pop
    //   76: iinc 3 1
    //   79: goto -40 -> 39
    //   82: astore_1
    //   83: aconst_null
    //   84: astore_0
    //   85: ldc 78
    //   87: aload_1
    //   88: ldc 180
    //   90: iconst_0
    //   91: anewarray 4	java/lang/Object
    //   94: invokestatic 190	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: sipush 5729
    //   100: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: aload_0
    //   104: areturn
    //   105: invokestatic 196	java/util/Collections:emptySet	()Ljava/util/Set;
    //   108: astore_0
    //   109: goto -12 -> 97
    //   112: astore_2
    //   113: aload_1
    //   114: astore_0
    //   115: aload_2
    //   116: astore_1
    //   117: goto -32 -> 85
    //
    // Exception table:
    //   from	to	target	type
    //   20	28	82	java/lang/Exception
    //   28	37	112	java/lang/Exception
    //   41	76	112	java/lang/Exception
  }

  private static s aF(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5730);
    s locals = new s();
    locals.ctj = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query");
    locals.offset = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "offset", 0);
    locals.businessType = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "type", 0);
    locals.scene = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "scene", 0);
    locals.tZy = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "sugId");
    locals.tZA = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "sugType", 0);
    locals.tZz = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "prefixSug");
    locals.tZL = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "poiInfo");
    int i;
    if (com.tencent.mm.plugin.websearch.api.aa.u(paramMap, "isHomePage"))
      i = 1;
    Object localObject4;
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
            localObject4 = localJSONArray.getJSONObject(i);
            localObject1 = new com/tencent/mm/protocal/protobuf/tn;
            ((tn)localObject1).<init>();
            ((tn)localObject1).key = ((JSONObject)localObject4).optString("key", "");
            ((tn)localObject1).waD = ((JSONObject)localObject4).optInt("uintValue", 0);
            ((tn)localObject1).waE = ((JSONObject)localObject4).optString("textValue", "");
            locals.tZG.add(localObject1);
            i++;
            continue;
            i = 0;
          }
        }
        catch (Exception localException1)
        {
          ab.printErrStackTrace("MicroMsg.TopStory.RecommendLogic", localException1, "commKvJSONArray", new Object[0]);
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
          ab.printErrStackTrace("MicroMsg.TopStory.RecommendLogic", localException2, "matchUserJSONArray", new Object[0]);
        }
      }
      catch (Exception localException3)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.RecommendLogic", localException3, "prefixQueryJSONArray", new Object[0]);
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
            localObject1 = ((JSONArray)localObject3).optJSONObject(i);
            localObject4 = new com/tencent/mm/protocal/protobuf/bem;
            ((bem)localObject4).<init>();
            ((bem)localObject4).wIB = ((JSONObject)localObject1).optLong("from");
            ((bem)localObject4).wIC = ((JSONObject)localObject1).optLong("to");
            ((bem)localObject4).wIA = ((JSONObject)localObject1).optInt("field");
            locals.tZH.add(localObject4);
            i++;
            continue;
            localException4 = localException4;
            ab.printErrStackTrace("MicroMsg.TopStory.RecommendLogic", localException4, "tagInfoObj", new Object[0]);
          }
        }
        catch (Exception localException5)
        {
          ab.printErrStackTrace("MicroMsg.TopStory.RecommendLogic", localException5, "numConditionsArray", new Object[0]);
        }
        locals.cIv = bo.g(paramMap.get("webview_instance_id"), -1);
        locals.aOt = com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext());
        locals.mDw = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "subType", 0);
        locals.cdf = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "channelId", 0);
        locals.tZP = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "navigationId");
        if (r.aNU())
        {
          locals.tZI = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "isWeAppMore", 0);
          if (locals.tZI == 1)
          {
            locals.tZJ = new cxo();
            ig localig = new ig();
            com.tencent.mm.sdk.b.a.xxA.m(localig);
            locals.tZJ.xsP = localig.cDp.cDq;
            locals.tZJ.xsR = com.tencent.mm.modelappbrand.b.fpE;
            locals.tZJ.xsQ = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "subType", 0);
            locals.tZJ.session_id = com.tencent.mm.modelappbrand.b.fpD;
            locals.tZJ.xsS = locals.tZD;
            paramMap = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xQh, null);
            if ((paramMap != null) && ((paramMap instanceof String)))
              locals.tZJ.xrS = ((String)paramMap);
          }
        }
        AppMethodBeat.o(5730);
      }
    }
    return locals;
  }

  public static f cWo()
  {
    return ufS;
  }

  private boolean k(Set<String> paramSet)
  {
    AppMethodBeat.i(5727);
    boolean bool;
    if ((paramSet == null) || (this.ufM.containsAll(paramSet)))
    {
      bool = true;
      AppMethodBeat.o(5727);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5727);
    }
  }

  public static void start()
  {
    AppMethodBeat.i(5733);
    try
    {
      Looper.prepare();
      AppMethodBeat.o(5733);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(5733);
    }
  }

  public final boolean aD(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5728);
    ab.i("MicroMsg.TopStory.RecommendLogic", "getSearchData: %s", new Object[] { paramMap.toString() });
    h.JR(bo.g(paramMap.get("webview_instance_id"), -1)).c(com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "type", 0), com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query"), paramMap);
    int i;
    if (this.ufO)
    {
      this.ufO = false;
      i = bo.g(paramMap.get("webview_instance_id"), -1);
      if (this.ufR != null)
        this.ufR.cIv = i;
      if (!k(aE(paramMap)))
      {
        ab.e("MicroMsg.TopStory.RecommendLogic", "wtf , recv unsupported commKvSet after pre get, interrupt pre get now");
        this.ufP = true;
        if (this.ufQ != null)
          this.ufQ.countDown();
        i = 0;
        if (i == 0)
          break label228;
        AppMethodBeat.o(5728);
      }
    }
    while (true)
    {
      return false;
      if (this.ufQ != null)
        this.ufQ.countDown();
      if (this.ufR != null)
        ab.i("MicroMsg.TopStory.RecommendLogic", "do not send this call, wait for pre get, webivewId %d, %s", new Object[] { Integer.valueOf(this.ufR.cIv), this.ufR });
      i = 1;
      break;
      if (this.ufQ != null)
        this.ufQ.countDown();
      i = 0;
      break;
      label228: s locals = aF(paramMap);
      paramMap = this.ufN;
      if (paramMap.uga != null)
        paramMap.uga.jxQ = true;
      paramMap.uga = new f.a.a(paramMap, (byte)0);
      paramMap.uga.fpL = locals;
      paramMap.ufV.ufR = locals;
      paramMap.uga.run();
      AppMethodBeat.o(5728);
    }
  }

  public final void cWp()
  {
    AppMethodBeat.i(5734);
    String str = com.tencent.mm.plugin.websearch.api.aa.If(1);
    ab.i("MicroMsg.TopStory.RecommendLogic", "config commKV %s", new Object[] { str });
    if (TextUtils.isEmpty(str))
    {
      this.ufT = true;
      AppMethodBeat.o(5734);
    }
    while (true)
    {
      return;
      this.ufT = k(new HashSet(Arrays.asList(str.split(","))));
      AppMethodBeat.o(5734);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(5731);
    int i;
    if (paramm != null)
      i = paramm.getType();
    while (true)
    {
      ab.v("MicroMsg.TopStory.RecommendLogic", "onSceneEnd(type : %s), errType : %s, errCode : %s, errMsg : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
      JSONObject localJSONObject;
      if ((paramm instanceof com.tencent.mm.plugin.websearch.api.a))
      {
        com.tencent.mm.kernel.g.Rg().b(paramm.getType(), this);
        paramString = (com.tencent.mm.plugin.websearch.api.a)paramm;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.i("MicroMsg.TopStory.RecommendLogic", "net scene fail %s", new Object[] { paramString.bAk() });
          localJSONObject = new JSONObject();
        }
      }
      try
      {
        localJSONObject.put("ret", -1);
        label128: paramm = localJSONObject.toString();
        a(paramString.cUO(), paramm, paramString.cUP(), paramString.cUR());
        AppMethodBeat.o(5731);
        while (true)
        {
          return;
          i = 0;
          break;
          paramm = paramString.abH();
          paramInt1 = paramString.abI();
          ab.i("MicroMsg.TopStory.RecommendLogic", "callback %s", new Object[] { paramString.bAk() });
          a(paramString.cUO(), paramm, paramString.cUP(), paramString.cUR());
          if (paramInt1 > 0)
          {
            ab.i("MicroMsg.TopStory.RecommendLogic", "updateCode %d, need update", new Object[] { Integer.valueOf(paramInt1) });
            b.c.dif();
            com.tencent.mm.pluginsdk.g.a.a.b.Ky(27);
          }
          AppMethodBeat.o(5731);
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
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.f
 * JD-Core Version:    0.6.2
 */
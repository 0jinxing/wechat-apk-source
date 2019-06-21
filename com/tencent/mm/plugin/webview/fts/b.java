package com.tencent.mm.plugin.webview.fts;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.appbrand.r.r;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.af;
import com.tencent.mm.plugin.websearch.api.ai;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.websearch.api.v;
import com.tencent.mm.plugin.websearch.api.w;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.azv;
import com.tencent.mm.protocal.protobuf.azy;
import com.tencent.mm.protocal.protobuf.bdi;
import com.tencent.mm.protocal.protobuf.bdj;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.protocal.protobuf.bvf;
import com.tencent.mm.protocal.protobuf.cst;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map<Ljava.lang.String;Ljava.lang.Object;>;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.ai.f
{
  public com.tencent.mm.sdk.b.c hAA;
  private long ijU;
  public com.tencent.mm.plugin.fts.a.a.a mEx;
  public l plf;
  public Set<Integer> ufg;
  public l ufh;
  private HashMap<String, b.b> ufi;
  public e ufj;
  public v ufk;
  private Map<Integer, b.g> ufl;
  public b.e ufm;
  public List<com.tencent.mm.aw.e> ufn;
  private com.tencent.mm.plugin.websearch.c.a.c ufo;
  com.tencent.mm.plugin.websearch.c.a.d ufp;

  public b()
  {
    AppMethodBeat.i(5689);
    this.ufh = new b.1(this);
    this.ufl = new HashMap();
    this.ufm = new b.e(this);
    this.hAA = new b.3(this);
    this.plf = new b.4(this);
    ab.i("MicroMsg.FTS.FTSWebViewLogic", "create FTSWebViewLogic");
    this.ufi = new HashMap();
    this.ufg = Collections.synchronizedSet(new HashSet());
    com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
    AppMethodBeat.o(5689);
  }

  static void a(com.tencent.mm.plugin.websearch.c.a.d paramd, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(5710);
    paramd = paramd.gq(paramInt1, paramInt2);
    h.JR(paramInt3).aP(paramd);
    AppMethodBeat.o(5710);
  }

  private static void a(b.c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(5702);
    int i;
    if (paramc.ufE != 0)
      i = paramc.ufE;
    while (true)
    {
      ai.adO(paramc.username);
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", paramc.username);
      localIntent.putExtra("Contact_Nick", paramc.nickname);
      localIntent.putExtra("Contact_BrandIconURL", paramc.pln);
      localIntent.putExtra("Contact_Signature", paramc.signature);
      localIntent.putExtra("Contact_VUser_Info_Flag", paramc.ufB);
      localIntent.putExtra("Contact_Scene", i);
      if (paramc.pmz != null);
      try
      {
        localIntent.putExtra("Contact_customInfo", paramc.pmz.toByteArray());
        label117: Bundle localBundle = new Bundle();
        localBundle.putString("Contact_Ext_Args_Search_Id", paramc.hlm);
        localBundle.putString("Contact_Ext_Args_Query_String", paramc.query);
        localBundle.putInt("Contact_Scene", i);
        localBundle.putInt("Contact_Ext_Args_Index", paramc.position);
        localBundle.putString("Contact_Ext_Extra_Params", paramc.ufD);
        localIntent.putExtra("preChatTYPE", 10);
        localIntent.putExtra("Contact_Ext_Args", localBundle);
        com.tencent.mm.bp.d.b(ah.getContext(), "profile", ".ui.ContactInfoUI", localIntent);
        AppMethodBeat.o(5702);
        return;
        if (paramc.cIC == 2)
        {
          i = 89;
          continue;
        }
        if (paramBoolean)
        {
          i = 85;
          continue;
        }
        if ((paramc.scene == 3) || (paramc.scene == 16))
        {
          if (paramc.ufC)
          {
            i = 88;
            continue;
          }
          i = 87;
          continue;
        }
        i = 39;
      }
      catch (IOException localIOException)
      {
        break label117;
      }
    }
  }

  private static void a(b.d paramd)
  {
    AppMethodBeat.i(5701);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramd.username);
    localIntent.putExtra("Contact_Nick", paramd.nickname);
    localIntent.putExtra("Contact_Alias", paramd.dFl);
    localIntent.putExtra("Contact_Sex", paramd.dtS);
    localIntent.putExtra("Contact_Scene", paramd.scene);
    localIntent.putExtra("Contact_KHideExpose", true);
    localIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.aC(paramd.country, paramd.duc, paramd.dud));
    localIntent.putExtra("Contact_Signature", paramd.signature);
    localIntent.putExtra("Contact_KSnsIFlag", paramd.ufF);
    localIntent.putExtra("Contact_full_Mobile_MD5", paramd.query);
    com.tencent.mm.bp.d.b(ah.getContext(), "profile", ".ui.ContactInfoUI", localIntent);
    AppMethodBeat.o(5701);
  }

  private static void a(String paramString1, Bundle paramBundle, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(5699);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("convertActivityFromTranslucent", false);
    localIntent.putExtra("customize_status_bar_color", paramInt1);
    localIntent.putExtra("status_bar_style", paramString2);
    if (!bo.isNullOrNil(paramString3))
    {
      localIntent.putExtra("prePublishId", paramString3);
      localIntent.putExtra("KPublisherId", paramString3);
    }
    while (true)
    {
      if (paramInt2 > 0)
        localIntent.putExtra("pay_channel", paramInt2);
      localIntent.putExtra("preChatTYPE", 10);
      com.tencent.mm.bp.d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(5699);
      return;
      if ((paramBundle != null) && (!bo.isNullOrNil(paramString1)))
      {
        paramString1 = paramBundle.getString("publishIdPrefix", "gs") + "_" + com.tencent.mm.a.g.x(paramString1.getBytes());
        localIntent.putExtra("prePublishId", paramString1);
        localIntent.putExtra("KPublisherId", paramString1);
      }
    }
  }

  private b.d aA(Map<String, Object> paramMap)
  {
    int i = 3;
    AppMethodBeat.i(5706);
    b.d locald = new b.d(this, (byte)0);
    locald.username = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "userName");
    locald.nickname = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "nickName");
    locald.dFl = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "alias");
    locald.signature = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "signature");
    locald.dtS = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "sex", 0);
    locald.country = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "country");
    locald.dud = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "city");
    locald.duc = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "province");
    locald.ufF = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "snsFlag", 0);
    String str = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query");
    if (!bo.isNullOrNil(str))
    {
      if (Character.isDigit(str.charAt(0)))
        i = 15;
      locald.scene = i;
      if (locald.scene == 15)
      {
        if (!"mobile".equals(com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "matchType")))
          break label195;
        locald.query = str;
      }
    }
    while (true)
    {
      AppMethodBeat.o(5706);
      return locald;
      label195: locald.scene = 1;
      continue;
      locald.scene = 3;
    }
  }

  public static boolean aB(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5708);
    ab.i("MicroMsg.FTS.FTSWebViewLogic", "setSearchInputWord %s", new Object[] { paramMap });
    String str1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "word");
    boolean bool = com.tencent.mm.plugin.websearch.api.aa.u(paramMap, "isInputChange");
    String str2 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "custom");
    String str3 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "tagList");
    com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = h.JR(bo.g(paramMap.get("webview_instance_id"), -1));
    paramMap = new Bundle();
    paramMap.putString("fts_key_new_query", str1);
    paramMap.putString("fts_key_custom_query", str2);
    paramMap.putBoolean("fts_key_need_keyboard", bool);
    paramMap.putString("fts_key_tag_list", str3);
    try
    {
      if (localg.umI != null)
        localg.umI.c(122, paramMap);
      AppMethodBeat.o(5708);
      return false;
    }
    catch (RemoteException paramMap)
    {
      while (true)
        ab.w("MicroMsg.MsgHandler", "onFTSSearchQueryChange exception" + paramMap.getMessage());
    }
  }

  private b.c az(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5705);
    b.c localc = new b.c(this, (byte)0);
    localc.username = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "userName");
    localc.nickname = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "nickName");
    localc.pln = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "headHDImgUrl");
    localc.ufB = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "verifyFlag", 0);
    localc.signature = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "signature");
    localc.scene = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "scene", 0);
    localc.cIC = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "sceneActionType", 1);
    localc.pmz = new uy();
    localc.pmz.gvb = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "brandFlag", 0);
    localc.pmz.gve = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "iconUrl");
    localc.pmz.gvd = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "brandInfo");
    localc.pmz.gvc = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "externalInfo");
    localc.hlm = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "searchId");
    localc.query = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query");
    localc.position = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "position", 0);
    localc.ufC = com.tencent.mm.plugin.websearch.api.aa.u(paramMap, "isCurrentDetailPage");
    localc.ufD = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "extraParams");
    localc.ufE = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "friendScene", 0);
    AppMethodBeat.o(5705);
    return localc;
  }

  public static int c(Map<String, Object> paramMap1, Map<String, Object> paramMap2)
  {
    AppMethodBeat.i(5703);
    paramMap1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap1, "data");
    try
    {
      JSONArray localJSONArray1 = new org/json/JSONArray;
      localJSONArray1.<init>(paramMap1);
      JSONArray localJSONArray2 = new org/json/JSONArray;
      localJSONArray2.<init>();
      int i = 0;
      if (i < localJSONArray1.length())
      {
        Object localObject = localJSONArray1.getJSONObject(i);
        if (((JSONObject)localObject).has("id"))
        {
          paramMap1 = ((JSONObject)localObject).getString("id");
          label71: if (!((JSONObject)localObject).has("userName"))
            break label161;
        }
        label161: for (localObject = ((JSONObject)localObject).getString("userName"); ; localObject = "")
        {
          String str = s.mJ((String)localObject);
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("id", paramMap1);
          localJSONObject.put("userName", localObject);
          localJSONObject.put("displayName", str);
          localJSONArray2.put(localJSONObject);
          i++;
          break;
          paramMap1 = "";
          break label71;
        }
      }
      paramMap2.put("ret", Integer.valueOf(0));
      paramMap2.put("data", localJSONArray2.toString());
      AppMethodBeat.o(5703);
      return 0;
    }
    catch (JSONException paramMap1)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.FTS.FTSWebViewLogic", paramMap1, "", new Object[0]);
    }
  }

  private static void o(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(5698);
    a(paramString, paramBundle, 0, "", "", 0);
    AppMethodBeat.o(5698);
  }

  public static Bundle p(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(5690);
    Bundle localBundle = new Bundle();
    switch (paramInt)
    {
    case 3:
    case 5:
    default:
    case 7:
    case 2:
    case 4:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(5690);
      return localBundle;
      localBundle.putString("data", com.tencent.mm.plugin.webview.modeltools.g.cYC().cWl());
      continue;
      try
      {
        paramBundle = paramBundle.getString("key");
        localBundle.putString("result", ac.adL(paramBundle).toString());
        if (!"educationTab".equals(paramBundle))
          continue;
        paramBundle = ac.adL("discoverSearchGuide");
        if (paramBundle.optJSONArray("items").length() <= 0)
          continue;
        localBundle.putString("result_1", paramBundle.toString());
      }
      catch (Exception paramBundle)
      {
      }
      continue;
      paramBundle = com.tencent.mm.plugin.websearch.api.aa.d(paramBundle.getInt("scene"), paramBundle.getBoolean("isHomePage"), paramBundle.getInt("type"));
      localBundle.putString("type", (String)paramBundle.get("type"));
      localBundle.putString("isMostSearchBiz", (String)paramBundle.get("isMostSearchBiz"));
      localBundle.putString("isLocalSug", (String)paramBundle.get("isLocalSug"));
      localBundle.putString("isSug", (String)paramBundle.get("isSug"));
      localBundle.putString("scene", (String)paramBundle.get("scene"));
      continue;
      try
      {
        localBundle.putString("result", ac.adM(paramBundle.getString("key")));
      }
      catch (Exception paramBundle)
      {
      }
    }
  }

  static String s(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(5707);
    Object localObject = "FTS_BizCacheObj" + paramInt1 + "-" + paramInt2;
    String str = com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext());
    str = (String)localObject + "-" + str;
    if (paramBoolean)
    {
      AppMethodBeat.o(5707);
      localObject = str;
    }
    while (true)
    {
      return localObject;
      if (new File(com.tencent.mm.plugin.record.b.XZ(), str).exists())
      {
        AppMethodBeat.o(5707);
        localObject = str;
      }
      else
      {
        AppMethodBeat.o(5707);
      }
    }
  }

  private static void z(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(5700);
    TimeLineObject localTimeLineObject = ((com.tencent.mm.plugin.sns.b.m)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.sns.b.m.class)).tC(paramString1);
    paramString1 = new Intent();
    paramString1.putExtra("INTENT_TALKER", paramString2);
    paramString1.putExtra("INTENT_SNSID", new BigInteger(localTimeLineObject.Id).longValue());
    paramString1.putExtra("SNS_FROM_MUSIC_ITEM", paramBoolean);
    try
    {
      paramString1.putExtra("INTENT_SNS_TIMELINEOBJECT", localTimeLineObject.toByteArray());
      label82: com.tencent.mm.bp.d.b(ah.getContext(), "sns", ".ui.SnsCommentDetailUI", paramString1);
      AppMethodBeat.o(5700);
      return;
    }
    catch (IOException paramString2)
    {
      break label82;
    }
  }

  // ERROR //
  public final boolean a(Map<String, Object> paramMap, com.tencent.mm.plugin.webview.ui.tools.jsapi.g paramg)
  {
    // Byte code:
    //   0: sipush 5695
    //   3: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 88
    //   8: ldc_w 732
    //   11: iconst_1
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_1
    //   18: invokevirtual 733	java/lang/Object:toString	()Ljava/lang/String;
    //   21: aastore
    //   22: invokestatic 434	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: aload_1
    //   26: ldc_w 735
    //   29: invokeinterface 454 2 0
    //   34: checkcast 360	java/lang/String
    //   37: invokestatic 738	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   40: istore_3
    //   41: aload_1
    //   42: ldc_w 645
    //   45: iconst_0
    //   46: invokestatic 397	com/tencent/mm/plugin/websearch/api/aa:d	(Ljava/util/Map;Ljava/lang/String;I)I
    //   49: istore 4
    //   51: aload_1
    //   52: ldc_w 740
    //   55: invokeinterface 454 2 0
    //   60: checkcast 360	java/lang/String
    //   63: astore 5
    //   65: aload_1
    //   66: ldc_w 742
    //   69: invokeinterface 454 2 0
    //   74: checkcast 360	java/lang/String
    //   77: astore 6
    //   79: aload_1
    //   80: ldc_w 744
    //   83: invokeinterface 454 2 0
    //   88: checkcast 360	java/lang/String
    //   91: astore 7
    //   93: aload_1
    //   94: ldc_w 746
    //   97: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   100: astore 8
    //   102: ldc_w 748
    //   105: aload_1
    //   106: ldc_w 750
    //   109: invokeinterface 454 2 0
    //   114: checkcast 360	java/lang/String
    //   117: invokevirtual 423	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   120: istore 9
    //   122: aload_1
    //   123: ldc_w 640
    //   126: invokeinterface 454 2 0
    //   131: checkcast 360	java/lang/String
    //   134: invokestatic 738	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   137: istore 10
    //   139: aload_1
    //   140: ldc_w 654
    //   143: invokeinterface 454 2 0
    //   148: invokestatic 753	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   151: astore 11
    //   153: aload_1
    //   154: ldc_w 755
    //   157: invokeinterface 454 2 0
    //   162: checkcast 360	java/lang/String
    //   165: astore 12
    //   167: aload 12
    //   169: invokestatic 761	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   172: ifne +168 -> 340
    //   175: new 554	org/json/JSONObject
    //   178: astore 13
    //   180: aload 13
    //   182: aload 12
    //   184: invokespecial 762	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   187: aload 13
    //   189: ldc_w 764
    //   192: invokevirtual 557	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   195: ifeq +1575 -> 1770
    //   198: aload 13
    //   200: ldc_w 764
    //   203: invokevirtual 767	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   206: astore 13
    //   208: iconst_0
    //   209: istore 14
    //   211: aload 7
    //   213: invokestatic 331	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   216: ifne +10 -> 226
    //   219: aload 7
    //   221: invokestatic 772	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   224: istore 14
    //   226: aload_1
    //   227: ldc_w 774
    //   230: invokeinterface 454 2 0
    //   235: checkcast 360	java/lang/String
    //   238: astore 12
    //   240: aload_1
    //   241: ldc_w 776
    //   244: invokeinterface 454 2 0
    //   249: checkcast 360	java/lang/String
    //   252: astore 15
    //   254: aload_1
    //   255: ldc_w 778
    //   258: invokeinterface 454 2 0
    //   263: checkcast 360	java/lang/String
    //   266: astore 7
    //   268: iload_3
    //   269: tableswitch	default:+43 -> 312, 1:+115->384, 2:+278->547, 3:+333->602, 4:+43->312, 5:+1163->1432, 6:+43->312, 7:+333->602
    //   313: istore 9
    //   315: sipush 5695
    //   318: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   321: iload 9
    //   323: ireturn
    //   324: astore 13
    //   326: ldc 88
    //   328: aload 13
    //   330: ldc_w 577
    //   333: iconst_0
    //   334: anewarray 4	java/lang/Object
    //   337: invokestatic 593	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: aconst_null
    //   341: astore 13
    //   343: goto -135 -> 208
    //   346: astore_1
    //   347: ldc 88
    //   349: new 343	java/lang/StringBuilder
    //   352: dup
    //   353: ldc_w 780
    //   356: invokespecial 485	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   359: aload_1
    //   360: invokevirtual 781	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   363: invokevirtual 356	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: invokevirtual 373	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   369: invokestatic 784	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   372: iconst_1
    //   373: istore 9
    //   375: sipush 5695
    //   378: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   381: goto -60 -> 321
    //   384: iload 4
    //   386: lookupswitch	default:+34->420, 1:+138->524, 8:+89->475, 32:+150->536
    //   421: ldc_w 786
    //   424: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   427: astore_1
    //   428: ldc 88
    //   430: ldc_w 788
    //   433: iconst_1
    //   434: anewarray 4	java/lang/Object
    //   437: dup
    //   438: iconst_0
    //   439: aload_1
    //   440: aastore
    //   441: invokestatic 434	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   444: aload_2
    //   445: invokevirtual 792	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:dcJ	()Landroid/os/Bundle;
    //   448: astore_2
    //   449: aload_1
    //   450: invokestatic 331	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   453: ifne -141 -> 312
    //   456: invokestatic 607	com/tencent/mm/plugin/webview/modeltools/g:cYC	()Lcom/tencent/mm/plugin/webview/fts/b;
    //   459: pop
    //   460: aload_1
    //   461: aload_2
    //   462: iload 14
    //   464: aload 12
    //   466: aload 8
    //   468: iconst_0
    //   469: invokestatic 597	com/tencent/mm/plugin/webview/fts/b:a	(Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/String;Ljava/lang/String;I)V
    //   472: goto -160 -> 312
    //   475: aload_1
    //   476: ldc_w 794
    //   479: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   482: pop
    //   483: aload_1
    //   484: ldc_w 796
    //   487: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   490: astore_2
    //   491: aload_1
    //   492: ldc_w 380
    //   495: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   498: astore 13
    //   500: aload_1
    //   501: ldc_w 798
    //   504: invokestatic 442	com/tencent/mm/plugin/websearch/api/aa:u	(Ljava/util/Map;Ljava/lang/String;)Z
    //   507: istore 9
    //   509: invokestatic 607	com/tencent/mm/plugin/webview/modeltools/g:cYC	()Lcom/tencent/mm/plugin/webview/fts/b;
    //   512: pop
    //   513: aload_2
    //   514: aload 13
    //   516: iload 9
    //   518: invokestatic 800	com/tencent/mm/plugin/webview/fts/b:z	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   521: goto -209 -> 312
    //   524: aload_0
    //   525: aload_1
    //   526: invokespecial 802	com/tencent/mm/plugin/webview/fts/b:az	(Ljava/util/Map;)Lcom/tencent/mm/plugin/webview/fts/b$c;
    //   529: iconst_0
    //   530: invokestatic 804	com/tencent/mm/plugin/webview/fts/b:a	(Lcom/tencent/mm/plugin/webview/fts/b$c;Z)V
    //   533: goto -221 -> 312
    //   536: aload_0
    //   537: aload_1
    //   538: invokespecial 806	com/tencent/mm/plugin/webview/fts/b:aA	(Ljava/util/Map;)Lcom/tencent/mm/plugin/webview/fts/b$d;
    //   541: invokestatic 808	com/tencent/mm/plugin/webview/fts/b:a	(Lcom/tencent/mm/plugin/webview/fts/b$d;)V
    //   544: goto -232 -> 312
    //   547: aload_1
    //   548: ldc_w 786
    //   551: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   554: astore_1
    //   555: ldc 88
    //   557: ldc_w 788
    //   560: iconst_1
    //   561: anewarray 4	java/lang/Object
    //   564: dup
    //   565: iconst_0
    //   566: aload_1
    //   567: aastore
    //   568: invokestatic 434	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   571: aload_2
    //   572: invokevirtual 792	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:dcJ	()Landroid/os/Bundle;
    //   575: astore_2
    //   576: aload_1
    //   577: invokestatic 331	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   580: ifne -268 -> 312
    //   583: invokestatic 607	com/tencent/mm/plugin/webview/modeltools/g:cYC	()Lcom/tencent/mm/plugin/webview/fts/b;
    //   586: pop
    //   587: aload_1
    //   588: aload_2
    //   589: iload 14
    //   591: aload 12
    //   593: aload 8
    //   595: iconst_0
    //   596: invokestatic 597	com/tencent/mm/plugin/webview/fts/b:a	(Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/String;Ljava/lang/String;I)V
    //   599: goto -287 -> 312
    //   602: aload_1
    //   603: ldc_w 405
    //   606: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   609: astore 16
    //   611: aload_1
    //   612: ldc_w 500
    //   615: iconst_0
    //   616: invokestatic 397	com/tencent/mm/plugin/websearch/api/aa:d	(Ljava/util/Map;Ljava/lang/String;I)I
    //   619: istore 17
    //   621: aload_1
    //   622: ldc_w 525
    //   625: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   628: astore 18
    //   630: new 161	android/content/Intent
    //   633: dup
    //   634: invokespecial 162	android/content/Intent:<init>	()V
    //   637: astore_2
    //   638: aload_2
    //   639: ldc_w 810
    //   642: getstatic 816	com/tencent/mm/protocal/JsapiPermissionWrapper:vxI	Lcom/tencent/mm/protocal/JsapiPermissionWrapper;
    //   645: invokevirtual 819	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   648: pop
    //   649: aload_2
    //   650: ldc_w 821
    //   653: getstatic 827	com/tencent/mm/protocal/GeneralControlWrapper:vxE	Lcom/tencent/mm/protocal/GeneralControlWrapper;
    //   656: invokevirtual 819	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   659: pop
    //   660: aload_2
    //   661: ldc_w 829
    //   664: iconst_1
    //   665: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   668: pop
    //   669: aload_2
    //   670: ldc_w 831
    //   673: iconst_1
    //   674: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   677: pop
    //   678: aload_2
    //   679: ldc_w 833
    //   682: aload 16
    //   684: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   687: pop
    //   688: aload_2
    //   689: ldc_w 835
    //   692: iload 4
    //   694: invokevirtual 191	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   697: pop
    //   698: aload_2
    //   699: ldc_w 323
    //   702: iload 14
    //   704: invokevirtual 191	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   707: pop
    //   708: aload_2
    //   709: ldc_w 325
    //   712: aload 12
    //   714: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   717: pop
    //   718: aload_2
    //   719: ldc_w 837
    //   722: ldc_w 839
    //   725: aload 6
    //   727: invokevirtual 842	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   730: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   733: pop
    //   734: aload_2
    //   735: ldc_w 335
    //   738: aload 8
    //   740: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   743: pop
    //   744: aload_2
    //   745: ldc_w 844
    //   748: iload 17
    //   750: invokevirtual 191	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   753: pop
    //   754: aload 13
    //   756: ifnull +13 -> 769
    //   759: aload_2
    //   760: ldc_w 764
    //   763: aload 13
    //   765: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   768: pop
    //   769: invokestatic 849	com/tencent/mm/plugin/appbrand/r/r:aNU	()Z
    //   772: ifne +95 -> 867
    //   775: iload 17
    //   777: iload 4
    //   779: invokestatic 855	com/tencent/mm/bd/a:cA	(II)Ljava/util/Map;
    //   782: astore_1
    //   783: aload_1
    //   784: ldc_w 405
    //   787: aload 16
    //   789: invokeinterface 588 3 0
    //   794: pop
    //   795: aload_1
    //   796: ldc_w 525
    //   799: aload 18
    //   801: invokeinterface 588 3 0
    //   806: pop
    //   807: aload_2
    //   808: ldc_w 319
    //   811: iload 17
    //   813: aload_1
    //   814: invokestatic 858	com/tencent/mm/bd/a:b	(ILjava/util/Map;)Ljava/lang/String;
    //   817: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   820: pop
    //   821: iload 17
    //   823: bipush 20
    //   825: if_icmpeq +17 -> 842
    //   828: iload 17
    //   830: bipush 22
    //   832: if_icmpeq +10 -> 842
    //   835: iload 17
    //   837: bipush 33
    //   839: if_icmpne +21 -> 860
    //   842: ldc_w 860
    //   845: astore_1
    //   846: invokestatic 251	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   849: ldc_w 339
    //   852: aload_1
    //   853: aload_2
    //   854: invokestatic 261	com/tencent/mm/bp/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   857: goto -545 -> 312
    //   860: ldc_w 862
    //   863: astore_1
    //   864: goto -18 -> 846
    //   867: aload_1
    //   868: ldc_w 864
    //   871: iconst_0
    //   872: invokestatic 397	com/tencent/mm/plugin/websearch/api/aa:d	(Ljava/util/Map;Ljava/lang/String;I)I
    //   875: iconst_1
    //   876: if_icmpne +220 -> 1096
    //   879: iconst_1
    //   880: istore 19
    //   882: aload_1
    //   883: ldc_w 866
    //   886: iconst_0
    //   887: invokestatic 397	com/tencent/mm/plugin/websearch/api/aa:d	(Ljava/util/Map;Ljava/lang/String;I)I
    //   890: istore 20
    //   892: iload 19
    //   894: ifeq +208 -> 1102
    //   897: iload 17
    //   899: iconst_0
    //   900: iload 4
    //   902: aload 5
    //   904: invokestatic 869	com/tencent/mm/plugin/appbrand/r/r:a	(IZILjava/lang/String;)Ljava/util/Map;
    //   907: astore 13
    //   909: aload 13
    //   911: ldc_w 405
    //   914: aload 16
    //   916: invokeinterface 588 3 0
    //   921: pop
    //   922: aload 13
    //   924: ldc_w 525
    //   927: aload 18
    //   929: invokeinterface 588 3 0
    //   934: pop
    //   935: aload 13
    //   937: ldc_w 871
    //   940: aload_1
    //   941: ldc_w 871
    //   944: iconst_0
    //   945: invokestatic 397	com/tencent/mm/plugin/websearch/api/aa:d	(Ljava/util/Map;Ljava/lang/String;I)I
    //   948: invokestatic 874	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   951: invokeinterface 588 3 0
    //   956: pop
    //   957: aload 13
    //   959: ldc_w 864
    //   962: aload_1
    //   963: ldc_w 864
    //   966: iconst_0
    //   967: invokestatic 397	com/tencent/mm/plugin/websearch/api/aa:d	(Ljava/util/Map;Ljava/lang/String;I)I
    //   970: invokestatic 874	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   973: invokeinterface 588 3 0
    //   978: pop
    //   979: invokestatic 879	com/tencent/mm/modelappbrand/b:abv	()Ljava/lang/String;
    //   982: astore_1
    //   983: aload 13
    //   985: ldc_w 778
    //   988: aload_1
    //   989: invokeinterface 588 3 0
    //   994: pop
    //   995: aload 13
    //   997: ldc_w 778
    //   1000: aload_1
    //   1001: invokeinterface 588 3 0
    //   1006: pop
    //   1007: aload 13
    //   1009: ldc_w 881
    //   1012: aload_1
    //   1013: invokeinterface 588 3 0
    //   1018: pop
    //   1019: aload_2
    //   1020: ldc_w 883
    //   1023: aload_1
    //   1024: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1027: pop
    //   1028: aload_2
    //   1029: ldc_w 319
    //   1032: aload 13
    //   1034: invokestatic 887	com/tencent/mm/plugin/appbrand/r/r:E	(Ljava/util/Map;)Ljava/lang/String;
    //   1037: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1040: pop
    //   1041: aload_2
    //   1042: ldc_w 844
    //   1045: iload 17
    //   1047: invokevirtual 191	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1050: pop
    //   1051: aload_2
    //   1052: ldc_w 323
    //   1055: iload 14
    //   1057: invokevirtual 191	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1060: pop
    //   1061: aload_2
    //   1062: ldc_w 325
    //   1065: aload 12
    //   1067: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1070: pop
    //   1071: aload_2
    //   1072: ldc_w 778
    //   1075: aload_1
    //   1076: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1079: pop
    //   1080: invokestatic 251	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1083: ldc_w 889
    //   1086: ldc_w 891
    //   1089: aload_2
    //   1090: invokestatic 261	com/tencent/mm/bp/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   1093: goto -781 -> 312
    //   1096: iconst_0
    //   1097: istore 19
    //   1099: goto -217 -> 882
    //   1102: iload 17
    //   1104: iconst_0
    //   1105: iload 4
    //   1107: aload 5
    //   1109: invokestatic 892	com/tencent/mm/plugin/websearch/api/aa:a	(IZILjava/lang/String;)Ljava/util/Map;
    //   1112: astore_1
    //   1113: aload_1
    //   1114: ldc_w 405
    //   1117: aload 16
    //   1119: invokeinterface 588 3 0
    //   1124: pop
    //   1125: aload_1
    //   1126: ldc_w 525
    //   1129: aload 18
    //   1131: invokeinterface 588 3 0
    //   1136: pop
    //   1137: aload_1
    //   1138: ldc_w 640
    //   1141: iload 10
    //   1143: invokestatic 874	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1146: invokeinterface 588 3 0
    //   1151: pop
    //   1152: aload_1
    //   1153: ldc_w 654
    //   1156: aload 11
    //   1158: invokeinterface 588 3 0
    //   1163: pop
    //   1164: aload 7
    //   1166: invokestatic 761	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1169: ifne +25 -> 1194
    //   1172: aload_1
    //   1173: ldc_w 778
    //   1176: aload 7
    //   1178: invokeinterface 588 3 0
    //   1183: pop
    //   1184: aload_2
    //   1185: ldc_w 778
    //   1188: aload 7
    //   1190: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1193: pop
    //   1194: iload 17
    //   1196: invokestatic 895	com/tencent/mm/plugin/websearch/api/aa:HP	(I)Ljava/lang/String;
    //   1199: astore 8
    //   1201: aload_1
    //   1202: ldc_w 881
    //   1205: aload 8
    //   1207: invokeinterface 588 3 0
    //   1212: pop
    //   1213: aload_2
    //   1214: ldc_w 881
    //   1217: aload 8
    //   1219: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1222: pop
    //   1223: aload_2
    //   1224: ldc_w 319
    //   1227: iload 17
    //   1229: aload_1
    //   1230: invokestatic 858	com/tencent/mm/bd/a:b	(ILjava/util/Map;)Ljava/lang/String;
    //   1233: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1236: pop
    //   1237: aload_2
    //   1238: ldc_w 833
    //   1241: aload 16
    //   1243: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1246: pop
    //   1247: aload_2
    //   1248: ldc_w 323
    //   1251: iload 14
    //   1253: invokevirtual 191	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1256: pop
    //   1257: aload_2
    //   1258: ldc_w 325
    //   1261: aload 12
    //   1263: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1266: pop
    //   1267: aload_2
    //   1268: ldc_w 897
    //   1271: aload 15
    //   1273: invokevirtual 168	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1276: pop
    //   1277: aload_2
    //   1278: ldc_w 831
    //   1281: iconst_1
    //   1282: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1285: pop
    //   1286: iload_3
    //   1287: bipush 7
    //   1289: if_icmpne +12 -> 1301
    //   1292: aload_2
    //   1293: ldc_w 899
    //   1296: iconst_1
    //   1297: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1300: pop
    //   1301: iload 20
    //   1303: iconst_1
    //   1304: if_icmpne +43 -> 1347
    //   1307: aload_2
    //   1308: ldc_w 901
    //   1311: iconst_0
    //   1312: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1315: pop
    //   1316: invokestatic 251	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1319: aload 16
    //   1321: aload_2
    //   1322: aload 13
    //   1324: aload 5
    //   1326: aload 18
    //   1328: aload 7
    //   1330: aload 8
    //   1332: invokestatic 904	com/tencent/mm/plugin/websearch/api/aa:a	(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1335: iconst_0
    //   1336: istore 9
    //   1338: sipush 5695
    //   1341: invokestatic 121	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1344: goto -1023 -> 321
    //   1347: iload 17
    //   1349: bipush 20
    //   1351: if_icmpeq +30 -> 1381
    //   1354: iload 17
    //   1356: bipush 22
    //   1358: if_icmpeq +23 -> 1381
    //   1361: iload 17
    //   1363: bipush 33
    //   1365: if_icmpeq +16 -> 1381
    //   1368: iload 17
    //   1370: iconst_3
    //   1371: if_icmpeq +10 -> 1381
    //   1374: iload 17
    //   1376: bipush 36
    //   1378: if_icmpne +47 -> 1425
    //   1381: aload_2
    //   1382: ldc_w 906
    //   1385: iconst_1
    //   1386: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1389: pop
    //   1390: aload_2
    //   1391: ldc_w 908
    //   1394: iload 9
    //   1396: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1399: pop
    //   1400: ldc_w 910
    //   1403: astore_1
    //   1404: aload_1
    //   1405: invokestatic 761	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1408: ifne -1096 -> 312
    //   1411: invokestatic 251	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1414: ldc_w 339
    //   1417: aload_1
    //   1418: aload_2
    //   1419: invokestatic 261	com/tencent/mm/bp/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   1422: goto -1110 -> 312
    //   1425: ldc_w 862
    //   1428: astore_1
    //   1429: goto -25 -> 1404
    //   1432: aload_1
    //   1433: ldc_w 405
    //   1436: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   1439: astore_2
    //   1440: aload_1
    //   1441: ldc_w 912
    //   1444: iconst_0
    //   1445: invokestatic 397	com/tencent/mm/plugin/websearch/api/aa:d	(Ljava/util/Map;Ljava/lang/String;I)I
    //   1448: istore 14
    //   1450: aload_1
    //   1451: ldc_w 776
    //   1454: iconst_0
    //   1455: invokestatic 397	com/tencent/mm/plugin/websearch/api/aa:d	(Ljava/util/Map;Ljava/lang/String;I)I
    //   1458: istore 19
    //   1460: aload_1
    //   1461: ldc_w 914
    //   1464: invokestatic 386	com/tencent/mm/plugin/websearch/api/aa:t	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   1467: astore 8
    //   1469: aload 7
    //   1471: astore_1
    //   1472: aload 7
    //   1474: invokestatic 331	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1477: ifeq +9 -> 1486
    //   1480: iload 14
    //   1482: invokestatic 895	com/tencent/mm/plugin/websearch/api/aa:HP	(I)Ljava/lang/String;
    //   1485: astore_1
    //   1486: invokestatic 919	java/lang/System:currentTimeMillis	()J
    //   1489: invokestatic 922	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1492: astore 7
    //   1494: new 70	java/util/HashMap
    //   1497: dup
    //   1498: invokespecial 71	java/util/HashMap:<init>	()V
    //   1501: astore 11
    //   1503: aload 11
    //   1505: ldc_w 500
    //   1508: ldc_w 924
    //   1511: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1514: pop
    //   1515: aload 11
    //   1517: ldc_w 405
    //   1520: aload_2
    //   1521: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1524: pop
    //   1525: aload 11
    //   1527: ldc_w 740
    //   1530: aload 5
    //   1532: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1535: pop
    //   1536: aload 11
    //   1538: ldc_w 778
    //   1541: aload_1
    //   1542: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1545: pop
    //   1546: aload 11
    //   1548: ldc_w 881
    //   1551: aload_1
    //   1552: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1555: pop
    //   1556: aload 11
    //   1558: ldc_w 927
    //   1561: aload 7
    //   1563: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1566: pop
    //   1567: aload 11
    //   1569: ldc_w 929
    //   1572: aload 7
    //   1574: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1577: pop
    //   1578: aload 11
    //   1580: ldc_w 931
    //   1583: aload 7
    //   1585: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1588: pop
    //   1589: aload 11
    //   1591: ldc_w 914
    //   1594: aload 8
    //   1596: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1599: pop
    //   1600: aload 11
    //   1602: ldc_w 933
    //   1605: iload 19
    //   1607: invokestatic 874	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1610: invokevirtual 925	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1613: pop
    //   1614: new 935	com/tencent/mm/protocal/protobuf/chn
    //   1617: dup
    //   1618: invokespecial 936	com/tencent/mm/protocal/protobuf/chn:<init>	()V
    //   1621: astore 5
    //   1623: aload 5
    //   1625: invokestatic 941	com/tencent/mm/plugin/topstory/ui/c:cFx	()Ljava/lang/String;
    //   1628: putfield 944	com/tencent/mm/protocal/protobuf/chn:xgj	Ljava/lang/String;
    //   1631: aload 5
    //   1633: iload 14
    //   1635: putfield 945	com/tencent/mm/protocal/protobuf/chn:scene	I
    //   1638: aload 5
    //   1640: ldc_w 577
    //   1643: putfield 946	com/tencent/mm/protocal/protobuf/chn:hlm	Ljava/lang/String;
    //   1646: aload 5
    //   1648: aload_2
    //   1649: putfield 949	com/tencent/mm/protocal/protobuf/chn:ctj	Ljava/lang/String;
    //   1652: aload 5
    //   1654: aload_1
    //   1655: putfield 952	com/tencent/mm/protocal/protobuf/chn:cvF	Ljava/lang/String;
    //   1658: aload 5
    //   1660: aload_1
    //   1661: putfield 955	com/tencent/mm/protocal/protobuf/chn:cIy	Ljava/lang/String;
    //   1664: aload 5
    //   1666: iconst_2
    //   1667: putfield 958	com/tencent/mm/protocal/protobuf/chn:xgl	I
    //   1670: aload 5
    //   1672: aload 11
    //   1674: invokestatic 963	com/tencent/mm/plugin/topstory/a/g:o	(Ljava/util/HashMap;)Ljava/lang/String;
    //   1677: putfield 966	com/tencent/mm/protocal/protobuf/chn:url	Ljava/lang/String;
    //   1680: aload 5
    //   1682: aload 13
    //   1684: putfield 969	com/tencent/mm/protocal/protobuf/chn:xgm	Ljava/lang/String;
    //   1687: aload 5
    //   1689: iload 19
    //   1691: putfield 972	com/tencent/mm/protocal/protobuf/chn:cdf	I
    //   1694: aload 5
    //   1696: aload 7
    //   1698: putfield 975	com/tencent/mm/protocal/protobuf/chn:nQB	Ljava/lang/String;
    //   1701: aload 5
    //   1703: aload 8
    //   1705: putfield 978	com/tencent/mm/protocal/protobuf/chn:tZP	Ljava/lang/String;
    //   1708: aload 5
    //   1710: invokestatic 981	com/tencent/mm/plugin/websearch/api/aa:bVP	()Ljava/lang/String;
    //   1713: putfield 984	com/tencent/mm/protocal/protobuf/chn:xgn	Ljava/lang/String;
    //   1716: new 986	com/tencent/mm/protocal/protobuf/tn
    //   1719: dup
    //   1720: invokespecial 987	com/tencent/mm/protocal/protobuf/tn:<init>	()V
    //   1723: astore_1
    //   1724: aload_1
    //   1725: ldc_w 989
    //   1728: putfield 991	com/tencent/mm/protocal/protobuf/tn:key	Ljava/lang/String;
    //   1731: aload_1
    //   1732: iload 19
    //   1734: i2l
    //   1735: putfield 994	com/tencent/mm/protocal/protobuf/tn:waD	J
    //   1738: aload_1
    //   1739: iload 19
    //   1741: invokestatic 874	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1744: putfield 997	com/tencent/mm/protocal/protobuf/tn:waE	Ljava/lang/String;
    //   1747: aload 5
    //   1749: getfield 1001	com/tencent/mm/protocal/protobuf/chn:tZG	Ljava/util/LinkedList;
    //   1752: aload_1
    //   1753: invokevirtual 1006	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   1756: pop
    //   1757: invokestatic 251	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1760: aload 5
    //   1762: aload 7
    //   1764: invokestatic 1009	com/tencent/mm/plugin/topstory/ui/c:a	(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/chn;Ljava/lang/String;)V
    //   1767: goto -1455 -> 312
    //   1770: aconst_null
    //   1771: astore 13
    //   1773: goto -1565 -> 208
    //
    // Exception table:
    //   from	to	target	type
    //   175	208	324	org/json/JSONException
    //   219	226	346	java/lang/IllegalArgumentException
  }

  public final boolean a(Map<String, Object> paramMap, com.tencent.mm.plugin.webview.ui.tools.jsapi.g paramg, String paramString)
  {
    AppMethodBeat.i(5696);
    this.ufm.sAY = true;
    boolean bool1 = com.tencent.mm.plugin.websearch.api.aa.u(paramMap, "isTeachPage");
    boolean bool2 = com.tencent.mm.plugin.websearch.api.aa.u(paramMap, "isMoreButton");
    int i;
    if (com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "isFeedBack", 0) == 1)
      i = 1;
    while (true)
    {
      int j;
      String str1;
      String str2;
      String str3;
      int k;
      if (com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "isWeAppMore", 0) == 1)
      {
        j = 1;
        str1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "sessionId");
        str2 = (String)paramMap.get("navBarColor");
        str3 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "searchPlaceHolder");
        k = 0;
        if (bo.isNullOrNil(str2));
      }
      try
      {
        k = Color.parseColor(str2);
        str2 = (String)paramMap.get("statusBarStyle");
        if (i != 0)
        {
          paramString = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "jumpUrl");
          paramMap = null;
          if (paramg != null)
            paramMap = paramg.dcJ();
          com.tencent.mm.plugin.webview.modeltools.g.cYC();
          o(paramString, paramMap);
          bool1 = false;
          AppMethodBeat.o(5696);
          return bool1;
          i = 0;
          continue;
          j = 0;
        }
      }
      catch (IllegalArgumentException paramMap)
      {
        while (true)
        {
          ab.e("MicroMsg.FTS.FTSWebViewLogic", "startSearchItemDetailPage: " + paramMap.getMessage());
          bool1 = true;
          AppMethodBeat.o(5696);
          continue;
          i = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "type", 0);
          int m = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "opType", 0);
          if (m > 0)
          {
            switch (m)
            {
            default:
              break;
            case 2:
              a(az(paramMap), bool1);
              break;
            case 3:
              paramMap = az(paramMap);
              if (!t.mY(paramMap.username))
              {
                a(paramMap, bool1);
                continue;
              }
              ai.adO(paramMap.username);
              paramg = new Intent();
              paramg.putExtra("Chat_User", paramMap.username);
              paramg.putExtra("finish_direct", true);
              paramg.putExtra("key_temp_session_show_type", 0);
              paramg.putExtra("preChatTYPE", 9);
              com.tencent.mm.bp.d.f(ah.getContext(), ".ui.chatting.ChattingUI", paramg);
              break;
            case 4:
              paramString = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "jumpUrl");
              paramMap = null;
              if (paramg != null)
                paramMap = paramg.dcJ();
              com.tencent.mm.plugin.webview.modeltools.g.cYC();
              o(paramString, paramMap);
              break;
            }
          }
          else if (bool2)
          {
            String str4 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query");
            k = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "scene", 0);
            str2 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "searchId");
            paramg = new Intent();
            paramg.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
            paramg.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
            paramg.putExtra("neverGetA8Key", true);
            paramg.putExtra("key_load_js_without_delay", true);
            paramg.putExtra("ftsQuery", str4);
            paramg.putExtra("ftsType", i);
            paramg.putExtra("sessionId", str1);
            if (!r.aNU())
            {
              paramMap = com.tencent.mm.bd.a.cA(k, i);
              try
              {
                paramMap.put("query", q.encode(str4, "UTF-8"));
                paramMap.put("searchId", str2);
                paramMap.put("sessionId", str1);
                paramString = com.tencent.mm.plugin.websearch.api.aa.HP(bo.ank((String)paramMap.get("scene")));
                paramMap.put("subSessionId", paramString);
                paramg.putExtra("subSessionId", paramString);
                paramg.putExtra("key_session_id", str1);
                paramg.putExtra("rawUrl", com.tencent.mm.bd.a.b(k, paramMap));
                if ((k == 20) || (k == 22) || (k == 24) || (k == 33))
                {
                  paramMap = ".ui.tools.fts.FTSSOSMoreWebViewUI";
                  com.tencent.mm.bp.d.b(ah.getContext(), "webview", paramMap, paramg);
                }
              }
              catch (Exception paramString)
              {
                while (true)
                {
                  paramMap.put("query", str4);
                  continue;
                  paramMap = ".ui.tools.fts.FTSSearchTabWebViewUI";
                }
              }
            }
            else if (j != 0)
            {
              paramString = r.a(k, false, i, paramString);
              try
              {
                paramString.put("query", q.encode(str4, "UTF-8"));
                paramString.put("searchId", str2);
                paramString.put("subType", String.valueOf(com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "subType", 0)));
                paramString.put("isWeAppMore", String.valueOf(com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "isWeAppMore", 0)));
                paramString.put("sessionId", str1);
                str1 = com.tencent.mm.modelappbrand.b.abv();
                paramString.put("sessionId", str1);
                paramMap = com.tencent.mm.plugin.websearch.api.aa.HP(bo.ank((String)paramString.get("scene")));
                paramString.put("subSessionId", paramMap);
                paramg.putExtra("subSessionId", paramMap);
                paramg.putExtra("key_session_id", str1);
                paramg.putExtra("rawUrl", r.E(paramString));
                paramg.putExtra("ftsbizscene", k);
                paramg.putExtra("key_search_place_holder", str3);
                com.tencent.mm.bp.d.b(ah.getContext(), "appbrand", ".ui.AppBrandSearchUI", paramg);
              }
              catch (Exception localException)
              {
                while (true)
                  paramString.put("query", str4);
              }
            }
            else
            {
              paramMap = com.tencent.mm.plugin.websearch.api.aa.a(k, false, i, paramString);
              try
              {
                paramMap.put("query", q.encode(str4, "UTF-8"));
                paramMap.put("searchId", str2);
                paramMap.put("sessionId", str1);
                paramString = com.tencent.mm.plugin.websearch.api.aa.HP(bo.ank((String)paramMap.get("scene")));
                paramMap.put("subSessionId", paramString);
                paramg.putExtra("subSessionId", paramString);
                paramg.putExtra("rawUrl", com.tencent.mm.bd.a.b(k, paramMap));
                paramg.putExtra("key_session_id", str1);
                paramg.putExtra("searchId", str2);
                if ((k == 20) || (k == 22) || (k == 24) || (k == 33))
                {
                  paramMap = ".ui.tools.fts.FTSSOSMoreWebViewUI";
                  com.tencent.mm.bp.d.b(ah.getContext(), "webview", paramMap, paramg);
                }
              }
              catch (Exception paramString)
              {
                while (true)
                {
                  paramMap.put("query", str4);
                  continue;
                  paramMap = ".ui.tools.fts.FTSSearchTabWebViewUI";
                }
              }
            }
          }
          else
          {
            ab.i("MicroMsg.FTS.FTSWebViewLogic", "doStartSearchItemDetailPage: type=%d link=%s", new Object[] { Integer.valueOf(i), (String)paramMap.get("url") });
            switch (i)
            {
            default:
              str1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "jumpUrl");
              paramString = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "publishId");
              j = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "payScene", 0);
              ab.i("MicroMsg.FTS.FTSWebViewLogic", "jump url = %s, publishId = %s, payScene = %d", new Object[] { str1, paramString, Integer.valueOf(j) });
              paramMap = null;
              if (paramg != null)
                paramMap = paramg.dcJ();
              if (!bo.isNullOrNil(str1))
              {
                com.tencent.mm.plugin.webview.modeltools.g.cYC();
                a(str1, paramMap, k, str2, paramString, j);
              }
              break;
            case 8:
              com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "snsid");
              paramg = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "objectXmlDesc");
              paramString = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "userName");
              bool1 = com.tencent.mm.plugin.websearch.api.aa.u(paramMap, "fromMusicItem");
              com.tencent.mm.plugin.webview.modeltools.g.cYC();
              z(paramg, paramString, bool1);
              break;
            case 1:
              a(az(paramMap), false);
              break;
            case 32:
              a(aA(paramMap));
            }
          }
        }
      }
    }
  }

  public final boolean aC(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5709);
    String str = (String)paramMap.get("query");
    Object localObject = (String)paramMap.get("sortedContacts");
    int i = bo.ank((String)paramMap.get("offset"));
    int j = bo.ank((String)paramMap.get("count"));
    int k = bo.g(paramMap.get("webview_instance_id"), -1);
    paramMap = (Map<String, Object>)localObject;
    if (TextUtils.isEmpty((CharSequence)localObject))
      paramMap = "";
    localObject = new ArrayList();
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramMap);
      for (int m = 0; m < localJSONArray.length(); m++)
        ((List)localObject).add(localJSONArray.optString(m));
    }
    catch (JSONException paramMap)
    {
      ab.printErrStackTrace("MicroMsg.FTS.FTSWebViewLogic", paramMap, "", new Object[0]);
      if (this.ufo == null)
        this.ufo = new com.tencent.mm.plugin.websearch.c.a.b();
      paramMap = new com.tencent.mm.plugin.websearch.c.a.d(str, (List)localObject);
      if (this.ufp == null)
        break label206;
    }
    if (!this.ufp.equals(paramMap))
    {
      label206: this.ufp = paramMap;
      this.ufo.a(paramMap, new b.5(this, i, j, k));
    }
    while (true)
    {
      AppMethodBeat.o(5709);
      return false;
      if (this.ufp.ctn)
        a(this.ufp, i, j, k);
    }
  }

  public final boolean av(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5691);
    switch (com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "action", 0))
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(5691);
      return false;
      if (af.uax == null)
        af.cVk();
      af.uax.jBw.clear();
      paramMap = ah.getContext().getSharedPreferences("fts_history_search_sp", 0);
      Object localObject;
      String str;
      try
      {
        localObject = af.cVl();
        str = Base64.encodeToString(af.uax.toByteArray(), 0);
        paramMap.edit().putString((String)localObject, str).apply();
        ab.i("MicroMsg.WebSearch.WebSearchHistoryLogic", "addHistory pbListString %s", new Object[] { str });
      }
      catch (IOException paramMap)
      {
      }
      continue;
      int i = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "type", 0);
      int j = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "scene", 0);
      if (System.currentTimeMillis() - this.ijU > 1000L)
      {
        this.ijU = System.currentTimeMillis();
        if (!com.tencent.mm.plugin.websearch.api.aa.HU(0))
        {
          ab.e("MicroMsg.FTS.FTSWebViewLogic", "fts h5 template not avail");
        }
        else
        {
          an.x(i, j, ac.adM("searchID"));
          paramMap = com.tencent.mm.plugin.websearch.api.aa.cVd();
          paramMap.putExtra("ftsneedkeyboard", true);
          paramMap.putExtra("ftsbizscene", j);
          paramMap.putExtra("ftsType", i);
          paramMap.putExtra("rawUrl", com.tencent.mm.plugin.websearch.api.aa.E(com.tencent.mm.plugin.websearch.api.aa.d(j, true, i)));
          paramMap.putExtra("key_load_js_without_delay", true);
          com.tencent.mm.bp.d.b(ah.getContext(), "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", paramMap);
          continue;
          localObject = h.JR(com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "webview_instance_id", -1));
          j = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "scene", 0);
          str = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query");
          if ((j != 20) || (bo.isNullOrNil(str)))
          {
            ab.w("MicroMsg.MsgHandler", "doSearchHotWordOperation warning, scene=%d, query=%s", new Object[] { Integer.valueOf(j), str });
          }
          else
          {
            paramMap = new Bundle();
            paramMap.putString("fts_key_new_query", str);
            try
            {
              if (((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject).umI != null)
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject).umI.c(136, paramMap);
            }
            catch (Exception paramMap)
            {
              ab.w("MicroMsg.MsgHandler", "doSearchHotWordOperation exception" + paramMap.getMessage());
            }
          }
        }
      }
    }
  }

  public final boolean aw(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5693);
    ab.i("MicroMsg.FTS.FTSWebViewLogic", "getTeachSearchData: %s", new Object[] { paramMap });
    int i = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "scene", 0);
    int j = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "type", 0);
    int k = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "requestType", 0);
    int m = bo.g(paramMap.get("webview_instance_id"), -1);
    String str = (String)paramMap.get("requestId");
    boolean bool = com.tencent.mm.plugin.websearch.api.aa.u(paramMap, "ignoreCache");
    Object localObject1;
    if (k == 0)
    {
      paramMap = s(i, j, true);
      if (this.ufi.get(paramMap) == null)
      {
        localObject1 = new b.b(this, (byte)0);
        ((b.b)localObject1).gr(i, j);
        this.ufi.put(paramMap, localObject1);
      }
      paramMap = (b.b)this.ufi.get(paramMap);
      if ((!bo.isNullOrNil(paramMap.cBF)) && (!bool))
      {
        ab.i("MicroMsg.FTS.FTSWebViewLogic", "getTeachSearchData, webviewID = %d, cache %s", new Object[] { Integer.valueOf(m), paramMap.cBF });
        if ((paramMap.scene != 20) || (paramMap.type != 0) || ((!paramMap.fOb) && (paramMap.isAvailable())))
          h.JR(m).d(k, paramMap.cBF, 1, str);
      }
      if ((paramMap.isAvailable()) && (!bool))
      {
        ab.i("MicroMsg.FTS.FTSWebViewLogic", "hit the cache: %d %d %d %d, data %s", new Object[] { Integer.valueOf(paramMap.scene), Long.valueOf(paramMap.ufz), Long.valueOf(paramMap.ufA), Integer.valueOf(paramMap.type), paramMap.cBF });
        if ((paramMap.scene == 20) && (paramMap.type == 0))
          an.a(paramMap.scene, 0, paramMap.lcA, paramMap.type, 2, paramMap.cWm(), 1);
        while (true)
        {
          AppMethodBeat.o(5693);
          return false;
          an.a(paramMap.scene, 0, paramMap.lcA, paramMap.type, 1, "", 0);
        }
      }
      com.tencent.mm.kernel.g.Rg().a(1048, this);
      ab.i("MicroMsg.FTS.FTSWebViewLogic", "getTeachSearchData, webviewID = %d", new Object[] { Integer.valueOf(m) });
      paramMap = com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext());
      long l = ac.adL("discoverSearchEntry").optLong("guideParam");
      this.ufk = new v(i, j, com.tencent.mm.plugin.websearch.api.aa.HV(0), m, paramMap, l, str);
      com.tencent.mm.kernel.g.Rg().a(this.ufk, 0);
    }
    while (true)
    {
      AppMethodBeat.o(5693);
      break;
      localObject1 = ai.cVo();
      try
      {
        JSONObject localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        paramMap = new org/json/JSONArray;
        paramMap.<init>();
        JSONObject localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        for (i = ((bdj)localObject1).jBw.size() - 1; i >= 0; i--)
        {
          JSONObject localJSONObject3 = new org/json/JSONObject;
          localJSONObject3.<init>();
          Object localObject2 = (bdi)((bdj)localObject1).jBw.get(i);
          if (t.mY(((bdi)localObject2).vHl))
          {
            localObject2 = com.tencent.mm.aj.f.qX(((bdi)localObject2).vHl);
            if (localObject2 != null)
            {
              localJSONObject3.put("avatarUrl", ((com.tencent.mm.aj.d)localObject2).field_brandIconURL);
              localJSONObject3.put("userName", ((com.tencent.mm.aj.d)localObject2).field_username);
              localJSONObject3.put("nickName", s.mJ(((com.tencent.mm.aj.d)localObject2).field_username));
              localJSONArray.put(localJSONObject3);
            }
          }
        }
        localJSONObject2.put("items", localJSONArray);
        localJSONObject2.put("type", 5);
        localJSONObject2.put("title", "");
        paramMap.put(localJSONObject2);
        localJSONObject1.put("data", paramMap);
        paramMap = localJSONObject1.toString();
        ab.d("MicroMsg.FTS.FTSWebViewLogic", "getTeachSearchData returnString=%s", new Object[] { paramMap });
        h.JR(m).d(1, paramMap, 1, str);
      }
      catch (Exception paramMap)
      {
        ab.printErrStackTrace("MicroMsg.FTS.FTSWebViewLogic", paramMap, "gen mostSearchBizContactList error", new Object[0]);
      }
    }
  }

  public final boolean ax(Map<String, Object> paramMap)
  {
    boolean bool = true;
    AppMethodBeat.i(5694);
    int i = bo.g(paramMap.get("webview_instance_id"), -1);
    Object localObject;
    if (this.ufl.get(Integer.valueOf(201)) == null)
    {
      localObject = b.g.cWn();
      if (localObject != null)
        this.ufl.put(Integer.valueOf(201), localObject);
    }
    b.g localg = (b.g)this.ufl.get(Integer.valueOf(201));
    String str;
    if (localg != null)
    {
      localObject = h.JR(i);
      str = localg.cBF;
      if (!localg.isExpired())
        break label196;
    }
    label196: for (i = 1; ; i = 0)
    {
      ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject).m(str, 1, i, localg.ufH);
      bool = localg.isExpired();
      if (bool)
      {
        com.tencent.mm.kernel.g.Rg().a(1866, this);
        localObject = new c(paramMap, 0);
        if (paramMap != null)
          ((c)localObject).cIv = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "webview_instance_id", -1);
        com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      }
      AppMethodBeat.o(5694);
      return false;
    }
  }

  public final boolean ay(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5697);
    ab.i("MicroMsg.FTS.FTSWebViewLogic", "reportSearchRealTimeReport: %s", new Object[] { paramMap.toString() });
    bsj localbsj = new bsj();
    localbsj.wUu = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "logString");
    com.tencent.mm.kernel.g.Rg().a(1134, this);
    paramMap = new w(localbsj);
    com.tencent.mm.kernel.g.Rg().a(paramMap, 0);
    AppMethodBeat.o(5697);
    return false;
  }

  public final String cWl()
  {
    AppMethodBeat.i(5692);
    Object localObject = s(20, 0, true);
    if (this.ufi.get(localObject) == null)
    {
      b.b localb = new b.b(this, (byte)0);
      localb.gr(20, 0);
      this.ufi.put(localObject, localb);
    }
    localObject = (b.b)this.ufi.get(localObject);
    if (((b.b)localObject).isAvailable())
    {
      localObject = ((b.b)localObject).cBF;
      if (!bo.isNullOrNil((String)localObject))
        break label102;
      localObject = "";
      AppMethodBeat.o(5692);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      break;
      label102: AppMethodBeat.o(5692);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(5704);
    if ((paramm instanceof v))
    {
      com.tencent.mm.kernel.g.Rg().b(1048, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.FTS.FTSWebViewLogic", "onSceneEnd errType %d,errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(5704);
      }
    }
    while (true)
    {
      return;
      paramm = (v)paramm;
      Object localObject = new b.b(this, (byte)0);
      ((b.b)localObject).scene = paramm.scene;
      ((b.b)localObject).ufz = paramm.tZT.wDL;
      ((b.b)localObject).cBF = paramm.tZT.vOy;
      ((b.b)localObject).ufA = (System.currentTimeMillis() / 1000L);
      ((b.b)localObject).lcA = paramm.tZT.wDM;
      ((b.b)localObject).type = paramm.businessType;
      paramString = s(((b.b)localObject).scene, ((b.b)localObject).type, true);
      ab.i("MicroMsg.FTS.FTSWebViewLogic", "NetSceneWebSearchGuide cgi data %s ", new Object[] { ((b.b)localObject).cBF });
      if (!bo.isNullOrNil(((b.b)localObject).cBF))
      {
        h.JR(paramm.cIv).d(0, ((b.b)localObject).cBF, 0, paramm.nQB);
        ab.i("MicroMsg.FTS.FTSWebViewLogic", "onTeachSearchDataReady, %s", new Object[] { ((b.b)localObject).cBF });
      }
      this.ufi.put(paramString, localObject);
      if (((b.b)localObject).ufz == 0L)
      {
        paramInt2 = ((b.b)localObject).scene;
        paramInt1 = ((b.b)localObject).type;
        ab.i("MicroMsg.FTS.FTSWebViewLogic", "delete biz cache %d %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
        paramString = com.tencent.mm.plugin.record.b.XZ();
        paramm = new File(paramString, s(paramInt2, paramInt1, true));
        if (paramm.exists())
          paramm.delete();
        paramString = new File(paramString, s(paramInt2, paramInt1, false));
        if (paramString.exists())
          paramString.delete();
        label364: if ((((b.b)localObject).scene != 20) || (((b.b)localObject).type != 0))
          break label616;
        an.a(((b.b)localObject).scene, 1, ((b.b)localObject).lcA, ((b.b)localObject).type, 2, ((b.b)localObject).cWm(), 1);
        AppMethodBeat.o(5704);
        continue;
      }
      paramm = new azv();
      paramm.scene = ((b.b)localObject).scene;
      paramm.vOy = ((b.b)localObject).cBF;
      paramm.wDD = ((b.b)localObject).ufz;
      paramm.wDE = ((b.b)localObject).ufA;
      paramm.vQg = ((b.b)localObject).lcA;
      paramm.jCt = ((b.b)localObject).type;
      paramString = null;
      try
      {
        paramm = paramm.toByteArray();
        paramString = paramm;
        if (paramString != null)
        {
          paramm = new File(com.tencent.mm.plugin.record.b.XZ(), s(((b.b)localObject).scene, ((b.b)localObject).type, true));
          if (!paramm.getParentFile().exists())
            paramm.getParentFile().mkdirs();
          if (paramm.exists())
            paramm.delete();
          com.tencent.mm.a.e.b(paramm.getAbsolutePath(), paramString, paramString.length);
          ab.i("MicroMsg.FTS.FTSWebViewLogic", "save bizCacheFile %s %d", new Object[] { paramm.getAbsolutePath(), Integer.valueOf(paramString.length) });
          break label364;
        }
        ab.i("MicroMsg.FTS.FTSWebViewLogic", "save bizCacheFile fail");
        break label364;
        label616: an.a(((b.b)localObject).scene, 1, ((b.b)localObject).lcA, ((b.b)localObject).type, 1, "", 0);
        AppMethodBeat.o(5704);
        continue;
        if ((paramm instanceof w))
        {
          com.tencent.mm.kernel.g.Rg().b(1134, this);
          AppMethodBeat.o(5704);
          continue;
        }
        if ((paramm instanceof e))
        {
          com.tencent.mm.kernel.g.Rg().b(1161, this);
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            AppMethodBeat.o(5704);
            continue;
          }
          paramm = this.ufj.abH();
          ArrayList localArrayList = new ArrayList();
          try
          {
            paramString = new org/json/JSONObject;
            paramString.<init>(paramm);
            JSONArray localJSONArray = paramString.optJSONArray("data");
            paramm = paramString.optString("suggestionID", "");
            paramString = null;
            for (paramInt1 = 0; paramInt1 < localJSONArray.length(); paramInt1++)
            {
              localObject = localJSONArray.optJSONObject(paramInt1);
              if (((JSONObject)localObject).optInt("type") != 1)
                break label1016;
              paramString = (String)localObject;
            }
            if (paramString != null)
            {
              paramString = paramString.optJSONArray("items");
              for (paramInt1 = 0; paramInt1 < paramString.length(); paramInt1++)
              {
                localObject = paramString.optJSONObject(paramInt1).optString("word");
                if (!bo.isNullOrNil((String)localObject))
                  localArrayList.add(localObject);
              }
            }
            paramString = paramm;
            al.d(new b.2(this, paramString, localArrayList));
            AppMethodBeat.o(5704);
          }
          catch (Exception paramString)
          {
            while (true)
              paramString = "";
          }
        }
        if ((paramm instanceof c))
        {
          com.tencent.mm.kernel.g.Rg().b(1866, this);
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            AppMethodBeat.o(5704);
            continue;
          }
          paramString = (c)paramm;
          if (paramString.cIv != -1)
            h.JR(paramString.cIv).m(((cst)paramString.ehh.fsH.fsP).cBF, 0, 0, 0);
          if (paramString.ufI != null)
            this.ufl.put(Integer.valueOf(paramString.ufI.scene), paramString.ufI);
        }
        AppMethodBeat.o(5704);
      }
      catch (IOException paramm)
      {
        label1016: 
        while (true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.model.q;
import com.tencent.mm.plugin.webview.model.r;
import com.tencent.mm.plugin.webview.model.s;
import com.tencent.mm.plugin.webview.model.t;
import com.tencent.mm.plugin.webview.stub.WebViewStubTempUI;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.avf;
import com.tencent.mm.protocal.protobuf.avg;
import com.tencent.mm.protocal.protobuf.avh;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.avo;
import com.tencent.mm.protocal.protobuf.avp;
import com.tencent.mm.protocal.protobuf.avr;
import com.tencent.mm.protocal.protobuf.avs;
import com.tencent.mm.protocal.protobuf.awg;
import com.tencent.mm.protocal.protobuf.cmu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public final class c
  implements f
{
  private Context context;
  private final HashMap<String, avf> uFb;
  private final HashMap<String, String> uFc;
  final HashMap<String, c.d> ujx;
  final int ulX;
  private e umI;

  public c(int paramInt)
  {
    AppMethodBeat.i(8858);
    this.uFb = new HashMap();
    this.uFc = new HashMap();
    this.ujx = new HashMap();
    this.ulX = paramInt;
    AppMethodBeat.o(8858);
  }

  private void a(int paramInt1, final int paramInt2, String paramString, final q paramq)
  {
    AppMethodBeat.i(8861);
    if (paramq == null)
    {
      ab.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth scene is null");
      AppMethodBeat.o(8861);
    }
    while (true)
    {
      return;
      int i = 0;
      int j = i;
      if (paramq.cXy() != null)
      {
        j = i;
        if (paramq.cXy().wzj != null)
          j = paramq.cXy().wzj.cyE;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth netscene error, %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (paramInt1 == 4)
        {
          paramq.ulV.a(c.a.a.uFh, paramString, null, paramInt2, j);
          AppMethodBeat.o(8861);
        }
        else
        {
          paramq.ulV.a(c.a.a.uFh, null, null, paramInt2, j);
          AppMethodBeat.o(8861);
        }
      }
      else if (bo.isNullOrNil(paramq.ulW))
      {
        ab.e("MicroMsg.webview.JSVerifyHelper", "scene.jsapi is null or nil.");
        paramq.ulV.a(c.a.a.uFh, null, null, paramInt2, j);
        AppMethodBeat.o(8861);
      }
      else
      {
        paramString = paramq.cXy();
        if ((paramString == null) || (paramString.wzj == null))
        {
          ab.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth resp is null");
          paramq.ulV.a(c.a.a.uFh, null, null, paramInt2, j);
          AppMethodBeat.o(8861);
        }
        else if (paramString.wzj.cyE != 0)
        {
          ab.e("MicroMsg.webview.JSVerifyHelper", "auth jsapi_baseresponse %s, %s", new Object[] { Integer.valueOf(paramString.wzj.cyE), paramString.wzj.cyF });
          paramq.ulV.a(c.a.a.uFh, paramString.wzj.cyF, null, paramInt2, j);
          AppMethodBeat.o(8861);
        }
        else
        {
          if (paramq.cXx() == null);
          for (paramInt1 = 0; ; paramInt1 = paramq.cXx().wzi)
          {
            ab.i("MicroMsg.webview.JSVerifyHelper", "signature flag : %d.", new Object[] { Integer.valueOf(paramInt1) });
            if (paramInt1 != 1)
              break label580;
            if (paramString.wzm != null)
              break label419;
            ab.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPI scope_auth_info is null.");
            paramq.ulV.a(c.a.a.uFh, null, null, paramInt2, j);
            AppMethodBeat.o(8861);
            break;
          }
          label419: paramString = paramString.wzm.iterator();
          Object localObject;
          while (paramString.hasNext())
          {
            localObject = (awg)paramString.next();
            if (((awg)localObject).wzX == null)
            {
              ab.e("MicroMsg.webview.JSVerifyHelper", "authInfo.apiname is null.");
            }
            else
            {
              Iterator localIterator = ((awg)localObject).wzX.iterator();
              while (localIterator.hasNext())
              {
                String str = (String)localIterator.next();
                if (!bo.isNullOrNil(str))
                {
                  avf localavf = new avf();
                  localavf.wzd = str;
                  localavf.vIc = ((awg)localObject).wzW;
                  localavf.wze = ((awg)localObject).qkh;
                  this.uFb.put(localavf.wzd + paramq.url, localavf);
                }
              }
            }
          }
          label580: if (paramString.wzk == null)
          {
            ab.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth auth_info is null");
            paramq.ulV.a(c.a.a.uFh, "nullAuthInfo", null, paramInt2, j);
            AppMethodBeat.o(8861);
          }
          else
          {
            paramString = paramString.wzk.iterator();
            while (paramString.hasNext())
            {
              localObject = (avf)paramString.next();
              if (!bo.isNullOrNil(((avf)localObject).wzd))
                this.uFb.put(((avf)localObject).wzd + paramq.url, localObject);
            }
            paramString = (avf)this.uFb.get(paramq.ulW + paramq.url);
            if (paramString == null)
            {
              ab.e("MicroMsg.webview.JSVerifyHelper", "The JSAPIAuthInfo is null. (jsapi : %s , url : %s)", new Object[] { paramq.ulW, paramq.url });
              paramq.ulV.a(c.a.a.uFh, null, null, paramInt2, j);
              AppMethodBeat.o(8861);
            }
            else if (paramString.vIc == 1)
            {
              paramq.ulV.a(c.a.a.uFg, null, null, paramInt2, j);
              AppMethodBeat.o(8861);
            }
            else if (this.context == null)
            {
              ab.e("MicroMsg.webview.JSVerifyHelper", "JSVerify context not activity");
              a(paramq, paramInt2, paramString);
              AppMethodBeat.o(8861);
            }
            else
            {
              WebViewStubTempUI.a(this.context, this.umI, bo.nullAsNil(paramString.wze), "", this.context.getString(2131300863), this.context.getString(2131300862), new c.1(this, paramq, paramInt2, paramString), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  AppMethodBeat.i(8853);
                  ab.i("MicroMsg.webview.JSVerifyHelper", "showDlgForJSVerify click cancel");
                  paramq.ulV.a(c.a.a.uFi, "cancel", null, paramInt2, paramq.cXy().wzj.cyE);
                  AppMethodBeat.o(8853);
                }
              });
              AppMethodBeat.o(8861);
            }
          }
        }
      }
    }
  }

  static String aef(String paramString)
  {
    AppMethodBeat.i(8863);
    int i = paramString.indexOf("#");
    if (i < 0)
      AppMethodBeat.o(8863);
    while (true)
    {
      return paramString;
      paramString = paramString.substring(0, i);
      AppMethodBeat.o(8863);
    }
  }

  final void a(Context paramContext, e parame)
  {
    this.context = paramContext;
    this.umI = parame;
  }

  final void a(q paramq, int paramInt, avf paramavf)
  {
    AppMethodBeat.i(8862);
    avg localavg = paramq.cXx();
    Object localObject = paramq.cXy();
    if (localavg == null)
    {
      ab.e("MicroMsg.webview.JSVerifyHelper", "authReq is null");
      paramq.ulV.a(c.a.a.uFh, null, null, paramInt, paramq.cXy().wzj.cyE);
      AppMethodBeat.o(8862);
    }
    while (true)
    {
      return;
      if (localObject == null)
      {
        ab.e("MicroMsg.webview.JSVerifyHelper", "authResp is null");
        paramq.ulV.a(c.a.a.uFh, null, null, paramInt, paramq.cXy().wzj.cyE);
        AppMethodBeat.o(8862);
      }
      else
      {
        g.Rg().a(1096, this);
        localObject = ((avh)localObject).wzm;
        if (localObject != null)
        {
          Iterator localIterator = ((LinkedList)localObject).iterator();
          awg localawg;
          while (localIterator.hasNext())
          {
            localawg = (awg)localIterator.next();
            if (localawg != null)
            {
              ab.i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", new Object[] { localawg.wzX, localawg.scope, localawg.qkh, Integer.valueOf(localawg.wzW), localavg.wzd });
              localawg.wzW = 1;
            }
          }
          localIterator = ((LinkedList)localObject).iterator();
          while (localIterator.hasNext())
          {
            localawg = (awg)localIterator.next();
            if (localawg != null)
              ab.i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", new Object[] { localawg.wzX, localawg.scope, localawg.qkh, Integer.valueOf(localawg.wzW), localavg.wzd });
          }
        }
        paramavf = new t(paramavf, localavg.url, localavg.mZr, localavg.wzd, localavg.cvO, localavg.wzf, localavg.signature, localavg.wzg, localavg.wzh, localavg.wzi, (LinkedList)localObject, this.ulX);
        g.Rg().a(paramavf, 0);
        paramq.ulV.a(c.a.a.uFg, null, null, paramInt, paramq.cXy().wzj.cyE);
        AppMethodBeat.o(8862);
      }
    }
  }

  public final void a(JsapiPermissionWrapper paramJsapiPermissionWrapper, String paramString, int paramInt, i parami, a parama)
  {
    AppMethodBeat.i(8860);
    String str1 = "";
    if (parami != null)
      str1 = parami.uIJ;
    if (bo.isNullOrNil(str1))
    {
      ab.e("MicroMsg.webview.JSVerifyHelper", "jsapi is null, %s", new Object[] { paramString });
      parama.a(c.a.a.uFj, null, null, 0, 0);
      AppMethodBeat.o(8860);
      return;
    }
    if ((paramJsapiPermissionWrapper == null) || (bo.isNullOrNil(paramString)) || (parami == null) || (paramJsapiPermissionWrapper.vxM == null))
    {
      if (paramJsapiPermissionWrapper != null);
      for (boolean bool = true; ; bool = false)
      {
        ab.e("MicroMsg.webview.JSVerifyHelper", "handleJSVerify invalid argument, currentUrl = %s, jsapi = %s, %s", new Object[] { paramString, str1, Boolean.valueOf(bool) });
        parama.a(c.a.a.uFh, "localParameters", null, 0, 0);
        AppMethodBeat.o(8860);
        break;
      }
    }
    int i = paramJsapiPermissionWrapper.Lx(paramInt);
    ab.i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify jsApi = %s, permission pos = %d, permission = %s currentUrl = %s", new Object[] { str1, Integer.valueOf(paramInt), Integer.valueOf(i), paramString });
    paramJsapiPermissionWrapper = (String)this.uFc.get(paramString);
    if (bo.isNullOrNil(paramJsapiPermissionWrapper))
      paramJsapiPermissionWrapper = (String)parami.puc.get("verifyAppId");
    while (true)
    {
      Object localObject1 = parami.uII;
      ((Map)localObject1).put("permissionValue", Integer.valueOf(i));
      ((Map)localObject1).put("appId", paramJsapiPermissionWrapper);
      switch (i)
      {
      default:
        parama.a(c.a.a.uFh, "unkonwPermission_".concat(String.valueOf(i)), null, 0, 0);
        ab.e("MicroMsg.webview.JSVerifyHelper", "unknow permission");
        AppMethodBeat.o(8860);
        break;
      case 1:
        parama.a(c.a.a.uFg, null, null, 0, 0);
        AppMethodBeat.o(8860);
        break;
      case 2:
        if (str1.equals("preVerifyJSAPI"))
        {
          parama.a(c.a.a.uFg, null, null, 0, 0);
          AppMethodBeat.o(8860);
          break;
        }
        parama.a(c.a.a.uFj, null, null, 0, 0);
        AppMethodBeat.o(8860);
        break;
      case 0:
        parama.a(c.a.a.uFj, null, null, 0, 0);
        AppMethodBeat.o(8860);
        break;
      case 4:
        localObject1 = (avf)this.uFb.get(str1 + paramString);
        if ((localObject1 != null) && (((avf)localObject1).vIc == 1))
        {
          parama.a(c.a.a.uFg, null, null, 0, 0);
          AppMethodBeat.o(8860);
        }
        break;
      case 3:
        label308: localObject1 = (String)parami.puc.get("verifySignature");
        String str2 = (String)parami.puc.get("verifyNonceStr");
        Object localObject2 = (String)parami.puc.get("verifyTimestamp");
        String str3 = (String)parami.puc.get("verifySignType");
        String str4 = (String)parami.puc.get("scope");
        Object localObject3 = (String)parami.puc.get("addrSign");
        ab.i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify addrSign = %s, signature = %s", new Object[] { localObject3, localObject1 });
        paramInt = 0;
        if ((bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil((String)localObject3)))
        {
          paramInt = 1;
          paramJsapiPermissionWrapper = (String)parami.puc.get("appId");
          localObject2 = (String)parami.puc.get("addrSign");
          localObject3 = (String)parami.puc.get("signType");
          localObject1 = (String)parami.puc.get("timeStamp");
          str2 = (String)parami.puc.get("nonceStr");
        }
        while (true)
        {
          str3 = null;
          JSONObject localJSONObject = i.a.ao(parami.puc);
          parami = str3;
          if (localJSONObject != null)
            parami = localJSONObject.toString().getBytes();
          if (i == 4)
          {
            paramJsapiPermissionWrapper = new q(parama, paramString, paramJsapiPermissionWrapper, str1, (String)localObject1, str2, (String)localObject2, (String)localObject3, parami, paramInt, str4, this.ulX);
            g.Rg().a(1095, this);
            g.Rg().a(paramJsapiPermissionWrapper, 0);
            AppMethodBeat.o(8860);
            break;
            if (bo.isNullOrNil((String)localObject1))
              break label947;
            paramInt = 2;
            localObject3 = localObject2;
            localObject2 = localObject1;
            localObject1 = localObject3;
            localObject3 = str3;
            continue;
          }
          if (i != 3)
            break label308;
          paramJsapiPermissionWrapper = new s(parama, paramString, paramJsapiPermissionWrapper, str1, (String)localObject1, str2, (String)localObject2, (String)localObject3, parami, this.ulX);
          g.Rg().a(1094, this);
          g.Rg().a(paramJsapiPermissionWrapper, 0);
          AppMethodBeat.o(8860);
          break;
          label947: localObject3 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject3;
          localObject3 = str3;
        }
      }
    }
  }

  public final String agj(String paramString)
  {
    AppMethodBeat.i(8857);
    Object localObject;
    if (paramString == null)
    {
      localObject = null;
      AppMethodBeat.o(8857);
    }
    while (true)
    {
      return localObject;
      String str1 = (String)this.uFc.get(paramString);
      localObject = str1;
      if (bo.isNullOrNil(str1))
      {
        String str2 = aef(paramString);
        ab.i("MicroMsg.webview.JSVerifyHelper", "appid = %s, url = %s, drophash url = %s", new Object[] { str1, paramString, str2 });
        localObject = str1;
        if (!bo.isNullOrNil(str2))
          localObject = (String)this.uFc.get(str2);
      }
      AppMethodBeat.o(8857);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(8859);
    ab.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: type[%d], errType[%s], errCode[%s], errMsg[%s]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!(paramm instanceof c.b))
    {
      ab.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: net scene type mismatched, return");
      AppMethodBeat.o(8859);
    }
    while (true)
    {
      return;
      if (((c.b)paramm).cXz() != this.ulX)
      {
        ab.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: this.binderId = %d, incoming binderId = %d, not equal, return", new Object[] { Integer.valueOf(this.ulX), Integer.valueOf(((c.b)paramm).cXz()) });
        AppMethodBeat.o(8859);
      }
      else
      {
        i = paramm.getType();
        if (i == 1093)
        {
          g.Rg().b(1093, this);
          paramm = (r)paramm;
          if (paramm == null)
          {
            ab.e("MicroMsg.webview.JSVerifyHelper", "");
            AppMethodBeat.o(8859);
          }
          else if (paramm.ulV == null)
          {
            ab.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIPreVerify, VerifyCallback is null");
            AppMethodBeat.o(8859);
          }
          else
          {
            int j = 0;
            i = j;
            if (paramm.cXA() != null)
            {
              i = j;
              if (paramm.cXA().wzj != null)
                i = paramm.cXA().wzj.cyE;
            }
            if ((paramInt1 != 0) || (paramInt2 != 0))
            {
              if (paramInt1 == 4)
              {
                paramm.ulV.a(c.a.a.uFh, paramInt2 + "_" + paramString, null, paramInt2, i);
                AppMethodBeat.o(8859);
              }
              else
              {
                paramm.ulV.a(c.a.a.uFh, null, null, paramInt2, i);
                AppMethodBeat.o(8859);
              }
            }
            else
            {
              avp localavp = paramm.cXA();
              label362: boolean bool1;
              label400: boolean bool2;
              if (paramm.ehh == null)
              {
                paramString = null;
                if ((localavp != null) && (!bo.isNullOrNil(paramm.iCz)) && (paramString != null) && (!bo.isNullOrNil(paramString.csB)))
                  break label510;
                if (localavp != null)
                  break label498;
                bool1 = true;
                bool2 = bo.isNullOrNil(paramm.iCz);
                if (paramString != null)
                  break label504;
              }
              label498: label504: for (boolean bool3 = true; ; bool3 = false)
              {
                ab.e("MicroMsg.webview.JSVerifyHelper", "something null %b, %b, %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
                paramm.ulV.a(c.a.a.uFh, null, null, paramInt2, i);
                AppMethodBeat.o(8859);
                break;
                paramString = (avo)paramm.ehh.fsG.fsP;
                break label362;
                bool1 = false;
                break label400;
              }
              label510: if (localavp.wzj == null)
              {
                ab.e("MicroMsg.webview.JSVerifyHelper", "jsapi_baseresponse null");
                paramm.ulV.a(c.a.a.uFh, null, null, paramInt2, i);
                AppMethodBeat.o(8859);
              }
              else if (localavp.wzj.cyE != 0)
              {
                ab.e("MicroMsg.webview.JSVerifyHelper", "jsapi baseresponse errcode fail : %d, errmsg = %s", new Object[] { Integer.valueOf(localavp.wzj.cyE), localavp.wzj.cyF });
                paramm.ulV.a(c.a.a.uFh, localavp.wzj.cyF, null, paramInt2, i);
                AppMethodBeat.o(8859);
              }
              else
              {
                paramm.ulV.agk(localavp.wzB);
                this.uFc.put(aef(paramString.url), paramString.csB);
                c.d locald = new c.d();
                locald.appId = paramString.csB;
                locald.uFm = localavp.wzA;
                this.ujx.put(aef(paramString.url), locald);
                paramm.ulV.a(c.a.a.uFg, null, localavp.wzz, paramInt2, i);
                ab.d("MicroMsg.webview.JSVerifyHelper", "dealJSAPIPreVerify url is %s", new Object[] { paramString.url });
                AppMethodBeat.o(8859);
              }
            }
          }
        }
        else if (i == 1095)
        {
          g.Rg().b(1095, this);
          a(paramInt1, paramInt2, paramString, (q)paramm);
          AppMethodBeat.o(8859);
        }
        else
        {
          if (i != 1094)
            break label1288;
          g.Rg().b(1094, this);
          paramm = (s)paramm;
          if (paramm != null)
            break;
          ab.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify scene is null");
          AppMethodBeat.o(8859);
        }
      }
    }
    h.pYm.a(157L, 24L, 1L, false);
    if ((paramm.cXB() != null) && (paramm.cXB().wzj != null));
    for (int i = paramm.cXB().wzj.cyE; ; i = 0)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify netscene error", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        h.pYm.a(157L, 25L, 1L, false);
        if (paramInt1 == 4)
        {
          paramm.ulV.a(c.a.a.uFh, paramInt2 + "_" + paramString, null, paramInt2, i);
          AppMethodBeat.o(8859);
          break;
        }
        paramm.ulV.a(c.a.a.uFh, null, null, paramInt2, i);
        AppMethodBeat.o(8859);
        break;
      }
      paramString = paramm.cXB();
      if ((paramString == null) || (paramString.wzj == null))
      {
        ab.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify resp is null");
        paramm.ulV.a(c.a.a.uFh, null, null, paramInt2, i);
        AppMethodBeat.o(8859);
        break;
      }
      if (paramString.wzj.cyE != 0)
      {
        ab.e("MicroMsg.webview.JSVerifyHelper", "realtime jsapi_baseresponse %s, %s", new Object[] { Integer.valueOf(paramString.wzj.cyE), paramString.wzj.cyF });
        paramm.ulV.a(c.a.a.uFh, paramString.wzj.cyF, null, paramInt2, i);
        AppMethodBeat.o(8859);
        break;
      }
      paramString = paramString.wzC;
      if (paramString == null)
      {
        ab.e("MicroMsg.webview.JSVerifyHelper", "realtime not ok, vInfo is null");
        paramm.ulV.a(c.a.a.uFh, "verifyFail", null, paramInt2, i);
        AppMethodBeat.o(8859);
        break;
      }
      if (paramString.xkt != 1)
      {
        ab.e("MicroMsg.webview.JSVerifyHelper", "realtime not ok, %s", new Object[] { Integer.valueOf(paramString.xkt) });
        paramm.ulV.a(c.a.a.uFh, "verifyFail", null, paramInt2, i);
        AppMethodBeat.o(8859);
        break;
      }
      paramm.ulV.a(c.a.a.uFg, null, null, paramInt2, i);
      AppMethodBeat.o(8859);
      break;
      label1288: if (i == 1096)
      {
        g.Rg().b(1096, this);
        paramString = (t)paramm;
        if (paramString.ehh == null);
        for (paramString = null; ; paramString = (avs)paramString.ehh.fsG.fsP)
        {
          if (paramString != null)
            break label1359;
          ab.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, setAuthReq is null");
          AppMethodBeat.o(8859);
          break;
        }
        label1359: if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, errType[%s], errCode[%s], %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString.wzd });
          AppMethodBeat.o(8859);
          break;
        }
        if (com.tencent.mm.protocal.c.akD(bo.nullAsNil(paramString.wzd)) == null)
        {
          ab.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, errType[%s], errCode[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          AppMethodBeat.o(8859);
          break;
        }
        paramm = ((t)paramm).ulY;
        paramm.vIc = 1;
        this.uFb.put(paramString.wzd + paramString.url, paramm);
      }
      AppMethodBeat.o(8859);
      break;
    }
  }

  public static abstract interface a
  {
    public abstract void a(c.a.a parama, String paramString, LinkedList<cmu> paramLinkedList, int paramInt1, int paramInt2);

    public abstract void agk(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.c
 * JD-Core Version:    0.6.2
 */
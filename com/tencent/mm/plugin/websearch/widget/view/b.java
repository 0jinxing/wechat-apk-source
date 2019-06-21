package com.tencent.mm.plugin.websearch.widget.view;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cw;
import com.tencent.mm.g.b.a.cx;
import com.tencent.mm.g.b.a.o;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.api.WidgetData.MoreFooter;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.f;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.api.n;
import com.tencent.mm.plugin.websearch.api.q;
import com.tencent.mm.plugin.websearch.widget.view.footer.BtnSwitchFooter;
import com.tencent.mm.plugin.websearch.widget.view.footer.DirectionSwitchFooter;
import com.tencent.mm.plugin.websearch.widget.view.footer.DownArrowSwitchFooter;
import com.tencent.mm.plugin.websearch.widget.view.footer.MoreFooter;
import com.tencent.mm.plugin.websearch.widget.view.footer.a.a;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
  implements q
{
  ViewGroup eAl;
  boolean gBF;
  MMActivity hwd;
  volatile boolean isLoading;
  boolean isRetry;
  com.tencent.mm.plugin.websearch.api.g mJG;
  i mJs;
  private boolean mVC;
  TextView pNv;
  b.b udH;
  View udL;
  LinearLayout udM;
  f udN;
  String udO;
  String udP;
  View udQ;
  View udR;
  private com.tencent.mm.plugin.websearch.widget.view.footer.a udS;
  LinearLayout udT;
  MoreFooter udU;
  float[] udV;
  int udW;
  b.a udX;
  WidgetData udY;
  WidgetData udZ;
  ThreeDotsLoadingView uea;
  View ueb;
  View uec;
  private a.a ued;
  View.OnClickListener uee;
  View view;

  public b()
  {
    AppMethodBeat.i(91536);
    this.udV = new float[2];
    this.ued = new b.1(this);
    this.uee = new b.2(this);
    AppMethodBeat.o(91536);
  }

  private static void ap(Map<String, String> paramMap)
  {
    AppMethodBeat.i(91555);
    bsj localbsj = new bsj();
    localbsj.wUu = aq(paramMap);
    com.tencent.mm.ai.w.a(new com.tencent.mm.plugin.websearch.api.w(localbsj).fAT, null);
    AppMethodBeat.o(91555);
  }

  private static String aq(Map<String, String> paramMap)
  {
    AppMethodBeat.i(91556);
    StringBuilder localStringBuilder = new StringBuilder();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localStringBuilder.append((String)localEntry.getKey()).append("=").append(URLEncoder.encode((String)localEntry.getValue())).append("&");
    }
    paramMap = localStringBuilder.toString();
    AppMethodBeat.o(91556);
    return paramMap;
  }

  private void cVY()
  {
    AppMethodBeat.i(91539);
    boolean bool;
    Object localObject;
    if (this.view != null)
    {
      bool = this.mVC;
      if (this.view.getVisibility() != 0)
      {
        this.mVC = false;
        AppMethodBeat.o(91539);
        return;
      }
      localObject = new int[2];
      this.view.getLocationOnScreen((int[])localObject);
      if ((this.mJG == null) || (!this.mJG.u((int[])localObject)))
        break label504;
    }
    label504: for (this.mVC = true; ; this.mVC = false)
    {
      if ((bool != this.mVC) && (this.mVC))
      {
        ab.i("WidgetView", "exposure");
        String str1 = String.format("262144:%s:%d:%s;", new Object[] { this.udY.ubs.ubA, Long.valueOf(System.currentTimeMillis() / 1000L), this.udY.ubs.ubB });
        String str2 = this.udY.ubs.fmr + ";";
        String str3 = "262144:" + this.udY.ubs.fmr + ";";
        localObject = new HashMap();
        ((Map)localObject).put("isexpose", "1");
        ((Map)localObject).put("content", str1);
        ((Map)localObject).put("searchid", this.udY.ubs.hlm);
        ((Map)localObject).put("scene", "47");
        ((Map)localObject).put("query", this.udY.query);
        ((Map)localObject).put("sessionid", this.udY.ubv);
        ((Map)localObject).put("resulttype", str3);
        ((Map)localObject).put("resultsubtypelist", str2);
        ((Map)localObject).put("ishomepage", "1");
        ((Map)localObject).put("height", this.udM.getHeight() + ";");
        ((Map)localObject).put("requestid", System.currentTimeMillis());
        ap((Map)localObject);
        if (this.mJG != null)
          this.mJG.bBg();
        localObject = new cx().hR(str1).hU(this.udY.query).hW(str2).hV(str3).hS(this.udY.ubs.hlm).hT(this.udY.ubv);
        ((cx)localObject).cXP = 47L;
        ((cx)localObject).ajK();
      }
      AppMethodBeat.o(91539);
      break;
    }
  }

  private void cWb()
  {
    AppMethodBeat.i(91550);
    if (this.udY.ubr != null)
    {
      this.udU.setTitle(this.udY.ubr.title);
      AppMethodBeat.o(91550);
    }
    while (true)
    {
      return;
      this.udU.setVisibility(8);
      ab.e("WidgetView", "more footer has empty title");
      AppMethodBeat.o(91550);
    }
  }

  private void cWc()
  {
    AppMethodBeat.i(91551);
    Object localObject = a.b.eGM;
    localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.ll("100443");
    if (localObject == null)
    {
      ab.i("WidgetView", "openSearchPreload item is null");
      AppMethodBeat.o(91551);
      return;
    }
    int i = 3;
    if (((c)localObject).isValid())
      i = bo.ank((String)((c)localObject).dru().get("switchType"));
    switch (i)
    {
    default:
      if (!(this.udS instanceof DownArrowSwitchFooter))
      {
        this.udT.removeView((View)this.udS);
        this.udS = new DownArrowSwitchFooter(this.udT.getContext());
        this.udT.addView((View)this.udS);
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      this.udS.setCallback(this.ued);
      this.udS.setTitle(cWe());
      this.udS.setIcon(this.udY.ubs.iconUrl);
      AppMethodBeat.o(91551);
      break;
      if (!(this.udS instanceof BtnSwitchFooter))
      {
        this.udT.removeView((View)this.udS);
        this.udS = new BtnSwitchFooter(this.udT.getContext());
        this.udT.addView((View)this.udS);
        continue;
        if (!(this.udS instanceof DirectionSwitchFooter))
        {
          this.udT.removeView((View)this.udS);
          this.udS = new DirectionSwitchFooter(this.udT.getContext());
          this.udT.addView((View)this.udS);
        }
      }
    }
  }

  private String cWd()
  {
    AppMethodBeat.i(91552);
    String str;
    if (!TextUtils.isEmpty(this.udY.ubs.ubD))
    {
      str = this.udY.ubs.ubD;
      AppMethodBeat.o(91552);
    }
    while (true)
    {
      return str;
      str = ah.getContext().getString(2131305960);
      AppMethodBeat.o(91552);
    }
  }

  private String cWe()
  {
    AppMethodBeat.i(91553);
    String str;
    if (!TextUtils.isEmpty(this.udY.ubs.kcx))
    {
      str = this.udY.ubs.kcx;
      AppMethodBeat.o(91553);
    }
    while (true)
    {
      return str;
      str = ah.getContext().getString(2131305958, new Object[] { this.udY.ubs.bCu });
      AppMethodBeat.o(91553);
    }
  }

  private void clQ()
  {
    AppMethodBeat.i(91549);
    switch (this.udY.ubu)
    {
    default:
      ab.w("WidgetView", "unknown footer type %d", new Object[] { Integer.valueOf(this.udY.ubu) });
      AppMethodBeat.o(91549);
    case 2:
    case 1:
    }
    while (true)
    {
      return;
      this.udT.setVisibility(8);
      this.udU.setVisibility(0);
      cWb();
      AppMethodBeat.o(91549);
      continue;
      this.udU.setVisibility(8);
      this.udT.setVisibility(0);
      cWc();
      AppMethodBeat.o(91549);
    }
  }

  private void f(WidgetData paramWidgetData)
  {
    AppMethodBeat.i(91547);
    if (paramWidgetData != null)
    {
      this.isLoading = true;
      this.ueb.setVisibility(8);
      this.uea.dKT();
      this.udM.removeView(this.uea);
      this.udZ = paramWidgetData;
      this.udL.setVisibility(8);
      this.udM.setVisibility(0);
      this.udN.adE(this.udO);
      this.udY = paramWidgetData;
      this.udO = ("widgetid_" + System.currentTimeMillis());
      this.udN.a(paramWidgetData, this.udO, ((n)com.tencent.mm.kernel.g.K(n.class)).cUM(), 47);
      cu();
      ab.v("WidgetView", "%s, last %s, cur %s", new Object[] { toString(), this.udZ.toString(), this.udY.toString() });
    }
    AppMethodBeat.o(91547);
  }

  final void K(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(91537);
    if (this.udY == null)
    {
      AppMethodBeat.o(91537);
      return;
    }
    Object localObject1 = paramString1;
    Object localObject3;
    if (!TextUtils.isEmpty(paramString1))
    {
      localObject2 = Uri.parse(paramString1);
      localObject3 = ((Uri)localObject2).getPath();
      localObject1 = paramString1;
      if (!TextUtils.isEmpty((CharSequence)localObject3))
      {
        localObject1 = paramString1;
        if (!((String)localObject3).endsWith(".html"))
        {
          paramString1 = (String)localObject3 + ".html";
          localObject1 = ((Uri)localObject2).buildUpon().path(paramString1).build().toString();
        }
      }
    }
    u.i("WidgetView", "open app with path %s", new Object[] { localObject1 });
    Object localObject2 = new AppBrandStatObject();
    ((AppBrandStatObject)localObject2).scene = 1108;
    paramString1 = String.format("1:%s:%d:%s:%s:%s:%s:%d:%s", new Object[] { "", Long.valueOf(System.currentTimeMillis()), this.udY.ubs.ubB, "isWidget=1", this.udO, this.udY.ubs.fpS, Integer.valueOf(this.udY.ubs.fmr), Integer.valueOf(0) });
    ((AppBrandStatObject)localObject2).cst = (this.udY.ubv + "::" + this.udY.ubs.hlm + ":" + this.udY.ubs.ubA + ":1:" + paramString1);
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      paramString1 = this.udY.ubs.csu;
      label323: if (!TextUtils.isEmpty(paramString2))
        break label493;
      paramString2 = this.udY.ubs.userName;
      label341: localObject3 = (e)com.tencent.mm.kernel.g.K(e.class);
      localObject1 = ah.getContext();
      if (paramInt != -1)
        break label496;
      paramInt = this.udY.ubs.ubz;
    }
    label493: label496: 
    while (true)
    {
      ((e)localObject3).a((Context)localObject1, paramString2, null, paramInt, this.udY.ubs.version, paramString1, (AppBrandStatObject)localObject2);
      localObject1 = this.udY;
      localObject2 = new o();
      ((o)localObject2).cWq = 1L;
      paramString1 = ((o)localObject2).eK(paramString1).eJ(((WidgetData)localObject1).query).Fp().eH(((WidgetData)localObject1).ubs.hlm);
      paramString1.cWt = ((WidgetData)localObject1).ubs.fmr;
      paramString1.eI(((WidgetData)localObject1).ubv).eL(paramString2).ajK();
      AppMethodBeat.o(91537);
      break;
      paramString1 = (String)localObject1;
      break label323;
      break label341;
    }
  }

  public final void bcM()
  {
    AppMethodBeat.i(91545);
    this.udN.adE(this.udO);
    AppMethodBeat.o(91545);
  }

  final void cVZ()
  {
    AppMethodBeat.i(91544);
    this.udL.setVisibility(8);
    this.udM.setVisibility(8);
    this.ueb.setVisibility(0);
    this.uea.dKS();
    if (this.udN != null)
      this.udN.adE(this.udO);
    AppMethodBeat.o(91544);
  }

  final void cWa()
  {
    AppMethodBeat.i(91546);
    if ((this.eAl == null) || (this.udZ == this.udY))
    {
      ab.v("WidgetView", "%s same widgetData", new Object[] { toString() });
      AppMethodBeat.o(91546);
    }
    while (true)
    {
      return;
      this.udL.setVisibility(8);
      this.udM.setVisibility(0);
      f(this.udY);
      AppMethodBeat.o(91546);
    }
  }

  final void cu()
  {
    AppMethodBeat.i(91548);
    if (this.udY == null)
    {
      AppMethodBeat.o(91548);
      return;
    }
    if (this.udY.ubs.ubE)
    {
      this.udR.setVisibility(0);
      this.udQ.setVisibility(0);
      clQ();
    }
    while (true)
    {
      this.pNv.setText(cWd());
      AppMethodBeat.o(91548);
      break;
      this.udR.setVisibility(8);
      this.udQ.setVisibility(8);
    }
  }

  public final void e(WidgetData paramWidgetData)
  {
    AppMethodBeat.i(91543);
    if (paramWidgetData == null)
      AppMethodBeat.o(91543);
    while (true)
    {
      return;
      this.udY = paramWidgetData;
      ab.v("WidgetView", "%s, cur data %s", new Object[] { toString(), this.udY.toString() });
      if (this.gBF)
      {
        cWa();
        AppMethodBeat.o(91543);
      }
      else
      {
        if (this.udY != this.udZ)
          cVZ();
        AppMethodBeat.o(91543);
      }
    }
  }

  public final void hide()
  {
    AppMethodBeat.i(91538);
    if (!this.gBF)
      AppMethodBeat.o(91538);
    while (true)
    {
      return;
      onPause();
      AppMethodBeat.o(91538);
    }
  }

  public final void iv(boolean paramBoolean)
  {
    AppMethodBeat.i(91557);
    ab.i("WidgetView", "report click");
    HashMap localHashMap = new HashMap();
    localHashMap.put("content", String.format("262144:%s:%d:%s", new Object[] { this.udY.ubs.ubA, Long.valueOf(System.currentTimeMillis() / 1000L), this.udY.ubs.ubB }));
    localHashMap.put("searchid", this.udY.ubs.hlm);
    localHashMap.put("scene", "47");
    localHashMap.put("query", this.udY.query);
    localHashMap.put("sessionid", this.udY.ubv);
    localHashMap.put("docid", this.udY.ubs.ubA);
    localHashMap.put("timestamp", System.currentTimeMillis() / 1000L);
    localHashMap.put("jumpurl", this.udY.ubs.csu);
    String str1 = this.udY.ubs.ubB;
    String str2 = System.currentTimeMillis();
    if (paramBoolean);
    for (Object localObject = "1"; ; localObject = "0")
    {
      localHashMap.put("expand2", String.format("{\"statBuffer\":\"%s\";\"adBuffer\":\"\";\"clickId\":%s;\"isMore\":%s}", new Object[] { str1, str2, localObject }));
      localHashMap.put("businesstype", "262144");
      localHashMap.put("h5version", aa.HV(0));
      localHashMap.put("resulttype", "262144");
      localHashMap.put("resultsubtype", this.udY.ubs.fmr);
      ap(localHashMap);
      if (this.mJG != null)
        this.mJG.onClick();
      localObject = new cw();
      ((cw)localObject).dio = bo.ank((String)localHashMap.get("businesstype"));
      localObject = ((cw)localObject).hN((String)localHashMap.get("docid")).hO((String)localHashMap.get("expand2")).hP((String)localHashMap.get("query"));
      ((cw)localObject).dit = bo.ank((String)localHashMap.get("resultsubtype"));
      ((cw)localObject).diq = System.currentTimeMillis();
      localObject = ((cw)localObject).hM(this.udY.ubs.hlm).hQ(this.udY.ubv);
      ((cw)localObject).cXP = 47L;
      ((cw)localObject).ajK();
      AppMethodBeat.o(91557);
      return;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(91542);
    if (this.udN == null)
      AppMethodBeat.o(91542);
    while (true)
    {
      return;
      this.udN.adE(this.udO);
      this.udN.onDestroy();
      this.udY = null;
      this.udO = null;
      this.hwd = null;
      AppMethodBeat.o(91542);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(91541);
    if (!this.gBF)
      AppMethodBeat.o(91541);
    while (true)
    {
      return;
      if (this.udN != null)
        this.udN.onPause();
      this.mVC = false;
      ab.v("WidgetView", "%s paused", new Object[] { toString() });
      AppMethodBeat.o(91541);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(91540);
    if (!this.gBF)
      AppMethodBeat.o(91540);
    while (true)
    {
      return;
      this.udN.onResume();
      cVY();
      ab.v("WidgetView", "%s resume", new Object[] { toString() });
      AppMethodBeat.o(91540);
    }
  }

  public final void setSelected(boolean paramBoolean)
  {
    AppMethodBeat.i(91554);
    ab.v("WidgetView", "%s selected %b", new Object[] { toString(), Boolean.valueOf(paramBoolean) });
    this.gBF = paramBoolean;
    if (this.gBF)
    {
      cWa();
      cVY();
      AppMethodBeat.o(91554);
    }
    while (true)
    {
      return;
      this.mVC = false;
      AppMethodBeat.o(91554);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.b
 * JD-Core Version:    0.6.2
 */
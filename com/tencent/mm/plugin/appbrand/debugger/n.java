package com.tencent.mm.plugin.appbrand.debugger;

import android.app.Activity;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.h.j;
import com.tencent.mm.plugin.appbrand.l.k.b;
import com.tencent.mm.protocal.protobuf.anr;
import com.tencent.mm.protocal.protobuf.ans;
import com.tencent.mm.protocal.protobuf.cqx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.g.c;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public final class n
  implements com.tencent.mm.plugin.appbrand.h.i
{
  private Activity gNy;
  l hjR;
  String hjS;
  s hjT;
  p hjU;
  com.tencent.luggage.sdk.a.a.b hjV;
  public u hjW;
  k.b hjX;

  public n()
  {
    AppMethodBeat.i(101840);
    this.hjU = new p();
    this.hjX = new n.2(this);
    com.tencent.mm.sdk.b.a.xxA.b(new n.4(this));
    AppMethodBeat.o(101840);
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(101841);
    this.hjR = paraml;
    this.hjV = this.hjR.hjn;
    this.gNy = ((Activity)this.hjV.getContext());
    this.hjW = new u(this.gNy, this.hjR, new n.1(this));
    paraml = this.hjW;
    paraml.hkC = ((ViewGroup)this.hjV.xL().gNE.getParent());
    for (int i = 0; i < paraml.hkC.getChildCount(); i++)
    {
      View localView = paraml.hkC.getChildAt(i);
      if ((localView instanceof u))
        paraml.hkC.removeView(localView);
    }
    paraml.hkC.addView(paraml);
    paraml.hkC.bringChildToFront(paraml);
    paraml.hkD = ((RemoteDebugMoveView)LayoutInflater.from(paraml.getContext()).inflate(2130968728, null));
    paraml.hkG = ((TextView)paraml.hkD.findViewById(2131821354));
    paraml.hkF = ((TextView)paraml.hkD.findViewById(2131821359));
    paraml.hkH = ((TextView)paraml.hkD.findViewById(2131821360));
    paraml.hkI = ((TextView)paraml.hkD.findViewById(2131821363));
    paraml.hkJ = ((TextView)paraml.hkD.findViewById(2131821355));
    paraml.hkK = ((TextView)paraml.hkD.findViewById(2131821364));
    paraml.hkL = ((TextView)paraml.hkD.findViewById(2131821361));
    paraml.hkN = ((ImageView)paraml.hkD.findViewById(2131821353));
    paraml.hkM = ((ImageView)paraml.hkD.findViewById(2131821358));
    paraml.hkO = paraml.hkD.findViewById(2131821356);
    paraml.show();
    paraml.hkJ.setOnClickListener(paraml.mOnClickListener);
    paraml.hkK.setOnClickListener(paraml.mOnClickListener);
    paraml.hkI.setOnClickListener(paraml.mOnClickListener);
    paraml.postDelayed(new u.1(paraml), 100L);
    connect();
    if (bo.isNullOrNil(this.hjR.ayY()))
    {
      ab.i("MicroMsg.RemoteDebugJsEngine", "getRemoteDebugTicket");
      paraml = new anr();
      ((com.tencent.mm.plugin.appbrand.networking.a)this.hjV.B(com.tencent.mm.plugin.appbrand.networking.a.class)).a("/cgi-bin/mmbiz-bin/wxabusiness/getremotedebugticket", paraml, ans.class).c(new n.3(this));
    }
    AppMethodBeat.o(101841);
  }

  public final void a(o paramo)
  {
    AppMethodBeat.i(101848);
    this.hjU.a(paramo);
    AppMethodBeat.o(101848);
  }

  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(101843);
    evaluateJavascript(paramString, paramValueCallback);
    AppMethodBeat.o(101843);
  }

  public final void a(URL paramURL, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(101844);
    evaluateJavascript(paramString3, paramValueCallback);
    AppMethodBeat.o(101844);
  }

  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
  }

  public final <T extends j> T af(Class<T> paramClass)
  {
    return null;
  }

  final void connect()
  {
    AppMethodBeat.i(101846);
    if (this.hjT == null)
    {
      this.hjT = new s((com.tencent.mm.plugin.appbrand.l.a)this.hjV.aa(com.tencent.mm.plugin.appbrand.l.a.class));
      this.hjU.a(this.hjT, this.hjR, this.hjW);
    }
    if (this.hjR.aze())
    {
      this.hjT.a("ws://localhost:" + this.hjR.hjt.hjP, this.hjX);
      AppMethodBeat.o(101846);
    }
    while (true)
    {
      return;
      this.hjT.a("wss://wxagame.weixin.qq.com/remote/", this.hjX);
      AppMethodBeat.o(101846);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(101845);
    this.hjU.quit();
    this.hjU.azo();
    AppMethodBeat.o(101845);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(101842);
    if (this.hjR.azb())
      AppMethodBeat.o(101842);
    while (true)
    {
      return;
      if (this.hjR.isReady())
        break;
      this.hjR.hjE.add(new Pair(paramString, paramValueCallback));
      this.hjS = null;
      AppMethodBeat.o(101842);
    }
    Object localObject = new cqx();
    ((cqx)localObject).xoI = this.hjR.hjz.incrementAndGet();
    ((cqx)localObject).script = paramString;
    o localo = t.a((com.tencent.mm.bt.a)localObject, this.hjR, "evaluateJavascript");
    this.hjU.a(localo);
    int i = ((cqx)localObject).xoI;
    localObject = new b();
    if (!bo.isNullOrNil(this.hjS))
    {
      ((b)localObject).ctq = this.hjS;
      this.hjS = null;
    }
    while (true)
    {
      ((b)localObject).hjf = System.currentTimeMillis();
      ((b)localObject).size = paramString.length();
      ((b)localObject).hje = paramValueCallback;
      this.hjR.hjI.put(Integer.valueOf(i), localObject);
      AppMethodBeat.o(101842);
      break;
      ((b)localObject).ctq = q.zM(paramString);
    }
  }

  final void onReady()
  {
    AppMethodBeat.i(101847);
    ab.i("MicroMsg.RemoteDebugJsEngine", "onReady");
    this.hjR.setStatus(3);
    ab.i("MicroMsg.RemoteDebugJsEngine", "clearPendingScript");
    Iterator localIterator = this.hjR.hjE.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      evaluateJavascript((String)localPair.first, (ValueCallback)localPair.second);
    }
    this.hjR.hjE.clear();
    this.hjU.cV(this.hjR.ayZ(), 2147483647);
    this.hjW.azw();
    AppMethodBeat.o(101847);
  }

  public final void setJsExceptionHandler(h paramh)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.n
 * JD-Core Version:    0.6.2
 */
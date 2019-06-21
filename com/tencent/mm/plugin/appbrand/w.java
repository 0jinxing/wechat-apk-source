package com.tencent.mm.plugin.appbrand;

import android.webkit.JavascriptInterface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.c;
import com.tencent.mm.d.a.l;
import com.tencent.mm.d.a.t;
import com.tencent.mm.d.a.t.3;
import com.tencent.mm.d.a.t.a;
import com.tencent.mm.d.a.u;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.k;
import com.tencent.mm.plugin.appbrand.r.d;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public class w
{
  u ciG;
  q gNC;
  k gQi;
  public t gQj;
  private ArrayList<t.a> gQk;

  public w(q paramq)
  {
    AppMethodBeat.i(86783);
    this.ciG = new w.1(this);
    this.gNC = paramq;
    this.gQi = ((k)paramq.aBx().af(k.class));
    this.gQj = auv();
    this.gQk = new ArrayList();
    String str1 = this.gNC.auf() + "wxa_library/bootstrap_j2v8_worker.js";
    String str2 = d.Eb("wxa_library/bootstrap_j2v8_worker.js");
    this.gQk.add(new t.a(str1, str2));
    paramq.aBx().addJavascriptInterface(this, "WeixinWorker");
    AppMethodBeat.o(86783);
  }

  protected t auv()
  {
    AppMethodBeat.i(86784);
    t localt = new t(this.ciG);
    AppMethodBeat.o(86784);
    return localt;
  }

  protected void b(ArrayList<t.a> paramArrayList, String paramString)
  {
    AppMethodBeat.i(86787);
    paramArrayList.add(new t.a(this.gNC.auf() + "config", String.format("var __wxConfig = %s;", new Object[] { this.gNC.xW().toString() })));
    AppMethodBeat.o(86787);
  }

  @JavascriptInterface
  public int create(String paramString)
  {
    AppMethodBeat.i(86785);
    ArrayList localArrayList = new ArrayList(this.gQk);
    b(localArrayList, paramString);
    localArrayList.add(xi(paramString));
    int i = this.gQj.e(localArrayList);
    AppMethodBeat.o(86785);
    return i;
  }

  @JavascriptInterface
  public void postMsgToWorker(int paramInt, String paramString)
  {
    AppMethodBeat.i(86789);
    t localt = this.gQj;
    l locall = (l)localt.ciF.get(Integer.valueOf(paramInt));
    if (locall != null)
      locall.chO.k(new t.3(localt, locall, paramString));
    AppMethodBeat.o(86789);
  }

  @JavascriptInterface
  public void terminate(int paramInt)
  {
    AppMethodBeat.i(86788);
    l locall = (l)this.gQj.ciF.remove(Integer.valueOf(paramInt));
    if (locall != null)
      locall.destroy();
    AppMethodBeat.o(86788);
  }

  protected t.a xi(String paramString)
  {
    AppMethodBeat.i(86786);
    paramString = new t.a(this.gNC.aug() + paramString, aw.a(this.gNC.getRuntime(), paramString) + this.gNC.xc(paramString));
    AppMethodBeat.o(86786);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.w
 * JD-Core Version:    0.6.2
 */
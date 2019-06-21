package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public class b extends f
{
  public String cJF;
  public String ffA;
  public String ffB;
  public String ffC;
  public String ffD;
  public String ffE;
  public String ffF;
  public String ffG;
  public String ffH;
  public String ffI;
  public String ffJ;
  public String ffK;
  public String ffL;
  public String ffM;
  public String ffq;
  public String ffr;
  public String ffs;
  public String fft;
  public String ffu;
  public String ffv;
  public String ffw;
  public String ffx;
  public String ffy;
  public String ffz;

  private static String d(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(16186);
    paramMap = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.".concat(String.valueOf(paramString))));
    AppMethodBeat.o(16186);
    return paramMap;
  }

  public final f Xz()
  {
    AppMethodBeat.i(16184);
    b localb = new b();
    AppMethodBeat.o(16184);
    return localb;
  }

  public final void a(StringBuilder paramStringBuilder, j.b paramb, String paramString, d paramd, int paramInt1, int paramInt2)
  {
  }

  public final void a(Map<String, String> paramMap, j.b paramb)
  {
    AppMethodBeat.i(16185);
    if (paramb.type == 2002)
    {
      this.ffq = d(paramMap, "templateid");
      this.ffr = d(paramMap, "senderurl");
      this.ffs = d(paramMap, "sendernativeurl");
      this.fft = d(paramMap, "receiverurl");
      this.ffu = d(paramMap, "receivernativeurl");
      this.ffv = d(paramMap, "iconurl");
      this.ffw = d(paramMap, "miniiconurl");
      this.ffx = d(paramMap, "backgroundurl");
      this.ffy = d(paramMap, "backgroundname");
      this.ffz = d(paramMap, "backgroundcolor");
      this.ffA = d(paramMap, "receivertitle");
      this.ffB = d(paramMap, "sendertitle");
      this.ffC = d(paramMap, "titlecolor");
      this.ffD = d(paramMap, "senderscenetext");
      this.ffE = d(paramMap, "receiverscenetext");
      this.ffF = d(paramMap, "senderdes");
      this.ffG = d(paramMap, "receiverdes");
      this.ffH = d(paramMap, "descolor");
      this.ffI = d(paramMap, "sceneid");
      this.cJF = d(paramMap, "paymsgid");
      this.ffJ = d(paramMap, "senderbackgroundname");
      this.ffK = d(paramMap, "senderbackgroundurl");
      this.ffL = d(paramMap, "receiverbackgroundname");
      this.ffM = d(paramMap, "receiverbackgroundurl");
    }
    AppMethodBeat.o(16185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.b
 * JD-Core Version:    0.6.2
 */
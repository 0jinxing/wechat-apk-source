package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public class c extends f
{
  public int cuu;
  public String ffN;
  public String ffO;
  public String ffP;
  public String ffQ;
  public String ffR;
  public String ffS;
  public String ffT;
  public String ffU;
  public String ffV;
  public String ffW;
  public String ffX;
  public String ffY;

  public final f Xz()
  {
    AppMethodBeat.i(16187);
    c localc = new c();
    AppMethodBeat.o(16187);
    return localc;
  }

  public final void a(StringBuilder paramStringBuilder, j.b paramb, String paramString, d paramd, int paramInt1, int paramInt2)
  {
  }

  public final void a(Map<String, String> paramMap, j.b paramb)
  {
    AppMethodBeat.i(16188);
    if (paramb.type == 2001)
    {
      this.ffN = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.locallogoicon"));
      this.ffO = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.localbubbleicon"));
      this.ffP = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.effectresource"));
      ab.i("MicroMsg.AppContentC2cMsgPiece", "locallogoicon: %s, localbubbleicon: %s, effectResource: %s", new Object[] { this.ffN, this.ffO, this.ffP });
      this.ffQ = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.corpname"));
      this.ffR = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.senderc2cshowsourceurl"));
      this.ffS = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.senderc2cshowsourcemd5"));
      this.ffT = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.receiverc2cshowsourceurl"));
      this.ffU = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.receiverc2cshowsourcemd5"));
      this.ffV = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.recshowsourceurl"));
      this.ffW = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.recshowsourcemd5"));
      this.ffX = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.detailshowsourceurl"));
      this.ffY = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.detailshowsourcemd5"));
      this.cuu = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.subtype"), 0);
    }
    AppMethodBeat.o(16188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.c
 * JD-Core Version:    0.6.2
 */
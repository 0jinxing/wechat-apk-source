package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.af.j.b;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class h
{
  public int fhF;
  public String fhG;
  public String fhH;
  public String fhI;
  public String fhJ;
  public String fhK;
  public String fhL;
  public String fhM;
  public int ver;

  public static h b(j.b paramb)
  {
    AppMethodBeat.i(114431);
    paramb = paramb.fjf;
    h localh = new h();
    localh.fhG = bo.bc((String)paramb.get(".msg.appmsg.giftcard_info.order_id"), "");
    localh.fhF = p.cB((String)paramb.get(".msg.appmsg.giftcard_info.biz_uin"));
    localh.fhH = bo.bc((String)paramb.get(".msg.appmsg.giftcard_info.app_name"), "");
    localh.fhI = bo.bc((String)paramb.get(".msg.appmsg.giftcard_info.recv_digest"), "");
    localh.fhJ = bo.bc((String)paramb.get(".msg.appmsg.giftcard_info.send_digest"), "");
    localh.fhK = bo.bc((String)paramb.get(".msg.appmsg.giftcard_info.background_pic_url"), "");
    localh.fhL = bo.bc((String)paramb.get(".msg.appmsg.giftcard_info.title_color"), "");
    localh.fhM = bo.bc((String)paramb.get(".msg.appmsg.giftcard_info.des_color"), "");
    localh.ver = p.cB((String)paramb.get(".msg.appmsg.giftcard_info.ver"));
    AppMethodBeat.o(114431);
    return localh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.h
 * JD-Core Version:    0.6.2
 */
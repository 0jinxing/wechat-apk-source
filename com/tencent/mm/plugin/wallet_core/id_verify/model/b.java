package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ang;
import com.tencent.mm.protocal.protobuf.anh;
import com.tencent.mm.protocal.protobuf.awr;
import com.tencent.mm.protocal.protobuf.bqs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.k.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends m
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  public com.tencent.mm.wallet_core.c.k nYe;
  public boolean ttQ;
  private long tvA;

  public b()
  {
    AppMethodBeat.i(46636);
    this.tvA = 10L;
    this.ttQ = false;
    ab.i("MicroMsg.NetSceneGetRealnameWording", "NetSceneGetRealnameWording call");
    b.a locala = new b.a();
    ang localang = new ang();
    localang.vRP = com.tencent.mm.plugin.wallet_core.model.k.cPy();
    if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
      localang.vWV = com.tencent.mm.pluginsdk.wallet.f.dlI();
    locala.fsJ = localang;
    locala.fsK = new anh();
    locala.uri = "/cgi-bin/mmpay-bin/getrealnamewording";
    locala.fsI = 1666;
    this.ehh = locala.acD();
    this.ehh.ftb = true;
    AppMethodBeat.o(46636);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(46637);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46637);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46638);
    ab.i("MicroMsg.NetSceneGetRealnameWording", "onGYNetEnd,errType=" + paramInt2 + "errCode=" + paramInt3);
    anh localanh;
    long l;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localanh = (anh)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      if (localanh.wrT <= 0L)
        l = this.tvA;
    }
    while (true)
    {
      this.ttQ = localanh.ttQ;
      ab.i("MicroMsg.NetSceneGetRealnameWording", "need_agree_duty %s", new Object[] { Boolean.valueOf(this.ttQ) });
      Object localObject = new JSONObject();
      try
      {
        ((JSONObject)localObject).put("bindcardTitle", localanh.wrM);
        ((JSONObject)localObject).put("bindcardSubTitle", localanh.wrN);
        ((JSONObject)localObject).put("bindIdTitle", localanh.wrO);
        ((JSONObject)localObject).put("bindIdSubTitle", localanh.wrP);
        ((JSONObject)localObject).put("extral_wording", localanh.wrQ);
        ((JSONObject)localObject).put("question_answer_switch", localanh.wrR);
        ((JSONObject)localObject).put("question_answer_url", localanh.wrS);
        ((JSONObject)localObject).put("cache_time", l);
        ((JSONObject)localObject).put("timestamp", Long.valueOf(System.currentTimeMillis() / 1000L));
        ((JSONObject)localObject).put("isShowBindCard", localanh.wrU);
        ((JSONObject)localObject).put("isShowBindCardVerify", localanh.wrW);
        ((JSONObject)localObject).put("isShowBindId", localanh.wrV);
        ((JSONObject)localObject).put("bindCardVerifyTitle", localanh.wrX);
        ((JSONObject)localObject).put("bindCardVerifySubtitle", localanh.wrY);
        ((JSONObject)localObject).put("bindCardVerifyAlertViewRightBtnTxt", localanh.wrZ);
        ((JSONObject)localObject).put("bindCardVerifyAlertViewContent", localanh.wsa);
        ((JSONObject)localObject).put("isShowBindCardVerifyAlertView", localanh.wsb);
        if ((localanh.wsc != null) && (localanh.wsc.size() > 0))
        {
          paramq = new java/lang/StringBuffer;
          paramq.<init>();
          paramArrayOfByte = localanh.wsc.iterator();
          paramInt1 = 0;
          while (true)
            if (paramArrayOfByte.hasNext())
            {
              String str = (String)paramArrayOfByte.next();
              if (paramInt1 != 0)
                paramq.append("\n");
              paramq.append(str);
              paramInt1 = 1;
              continue;
              l = localanh.wrT;
              break;
            }
          ((JSONObject)localObject).put("cache_header_titles", paramq.toString());
        }
        ((JSONObject)localObject).put("isShowCapitalSecurity", localanh.wse);
        g.RQ();
        g.RP().Ry().set(ac.a.xNA, ((JSONObject)localObject).toString());
        g.RQ();
        g.RP().Ry().dsb();
        localObject = localanh.wsd;
        if (localObject == null)
          paramq = null;
        while (true)
        {
          this.nYe = paramq;
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(46638);
          return;
          paramArrayOfByte = new com/tencent/mm/wallet_core/c/k;
          paramArrayOfByte.<init>();
          paramArrayOfByte.wAV = ((awr)localObject).wAV;
          paramArrayOfByte.ttd = ((awr)localObject).ttd;
          paramArrayOfByte.cEh = ((awr)localObject).cEh;
          paramArrayOfByte.nZb = ((awr)localObject).nZb;
          paramArrayOfByte.nZc = ((awr)localObject).nZc;
          paramArrayOfByte.title = ((awr)localObject).title;
          paramq = new com/tencent/mm/wallet_core/c/k$a;
          paramq.<init>();
          paramArrayOfByte.Afp = paramq;
          paramq = paramArrayOfByte;
          if (((awr)localObject).wAW != null)
          {
            paramArrayOfByte.Afp.type = ((awr)localObject).wAW.type;
            paramArrayOfByte.Afp.csB = ((awr)localObject).wAW.csB;
            paramArrayOfByte.Afp.wTe = ((awr)localObject).wAW.wTe;
            paramArrayOfByte.Afp.path = ((awr)localObject).wAW.path;
            paramArrayOfByte.Afp.tff = ((awr)localObject).wAW.tff;
            paramq = paramArrayOfByte;
          }
        }
      }
      catch (JSONException paramq)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NetSceneGetRealnameWording", paramq, "", new Object[0]);
      }
    }
  }

  public final int getType()
  {
    return 1666;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.model.b
 * JD-Core Version:    0.6.2
 */
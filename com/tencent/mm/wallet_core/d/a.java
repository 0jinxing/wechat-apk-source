package com.tencent.mm.wallet_core.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.tenpay.model.c;
import com.tencent.mm.wallet_core.tenpay.model.d;
import com.tencent.mm.wallet_core.tenpay.model.e;
import com.tencent.mm.wallet_core.tenpay.model.i;
import com.tencent.mm.wallet_core.tenpay.model.j;
import com.tencent.mm.wallet_core.tenpay.model.k;
import com.tencent.mm.wallet_core.tenpay.model.l;
import com.tencent.mm.wallet_core.tenpay.model.n;
import java.util.Map;
import org.json.JSONObject;

public final class a
  implements com.tencent.mm.ai.f
{
  private n Agh;
  private com.tencent.mm.wallet_core.tenpay.model.g Agi;
  int Agj = 0;
  private com.tencent.mm.ai.f Agk;

  public a(com.tencent.mm.ai.f paramf)
  {
    this.Agk = paramf;
  }

  private void a(int paramInt1, int paramInt2, String paramString, JSONObject paramJSONObject, com.tencent.mm.wallet_core.tenpay.model.g paramg)
  {
    AppMethodBeat.i(49116);
    ab.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback errCode = " + paramInt2 + "errType = " + paramInt1);
    if ((this.Agh != null) && (paramJSONObject != null) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mScene !=null");
      this.Agh.a(paramInt2, paramString, paramJSONObject);
      this.Agk.onSceneEnd(paramInt1, paramInt2, paramString, this.Agh);
      if (this.Agj == 1)
        com.tencent.mm.plugin.report.service.h.pYm.k(965L, 4L, 1L);
    }
    while (true)
    {
      ab.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback reset");
      this.Agj = 0;
      AppMethodBeat.o(49116);
      return;
      if (this.Agj == 2)
      {
        com.tencent.mm.plugin.report.service.h.pYm.k(965L, 5L, 1L);
      }
      else if (this.Agj == 3)
      {
        com.tencent.mm.plugin.report.service.h.pYm.k(965L, 6L, 1L);
        continue;
        if (this.Agk != null)
        {
          ab.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mRealCallback !=null");
          this.Agk.onSceneEnd(paramInt1, paramInt2, paramString, this.Agh);
          if (this.Agj == 1)
            com.tencent.mm.plugin.report.service.h.pYm.k(965L, 7L, 1L);
          while (true)
          {
            if (paramg.AfM)
              break label305;
            if (this.Agj != 1)
              break label307;
            com.tencent.mm.plugin.report.service.h.pYm.k(965L, 15L, 1L);
            break;
            if (this.Agj == 2)
              com.tencent.mm.plugin.report.service.h.pYm.k(965L, 8L, 1L);
            else if (this.Agj == 3)
              com.tencent.mm.plugin.report.service.h.pYm.k(965L, 9L, 1L);
          }
          label305: continue;
          label307: if (this.Agj == 2)
            com.tencent.mm.plugin.report.service.h.pYm.k(965L, 16L, 1L);
          else if (this.Agj == 3)
            com.tencent.mm.plugin.report.service.h.pYm.k(965L, 17L, 1L);
        }
      }
    }
  }

  private void b(n paramn)
  {
    AppMethodBeat.i(49113);
    this.Agh = paramn;
    this.Agh.pOZ = true;
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(385, this);
    int i = r.cPI().cQJ();
    this.Agj += 1;
    this.Agi = bb(this.Agh.dOr());
    this.Agi.AgA = true;
    int j = r.cPI().mRetryCount;
    paramn = this.Agi;
    if (this.Agj >= j);
    for (boolean bool = true; ; bool = false)
    {
      paramn.K(bool, this.Agj);
      ab.i("MicroMsg.DelayQueryOrderHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(this.Agi, i);
      AppMethodBeat.o(49113);
      return;
    }
  }

  private static com.tencent.mm.wallet_core.tenpay.model.g bb(Map<String, String> paramMap)
  {
    AppMethodBeat.i(49114);
    String str = (String)paramMap.get("req_key");
    if (bo.isNullOrNil(str))
    {
      ab.i("MicroMsg.DelayQueryOrderHelper", "no reqKey");
      paramMap = new com.tencent.mm.wallet_core.tenpay.model.g(paramMap);
      AppMethodBeat.o(49114);
    }
    while (true)
    {
      return paramMap;
      ab.i("MicroMsg.DelayQueryOrderHelper", "payorder reqKey: %s", new Object[] { str });
      ab.i("MicroMsg.DelayQueryOrderHelper", "delayquery go new split cgi");
      if (str.startsWith("sns_aa_"))
      {
        paramMap = new com.tencent.mm.wallet_core.tenpay.model.b(paramMap);
        AppMethodBeat.o(49114);
      }
      else if (str.startsWith("sns_tf_"))
      {
        paramMap = new k(paramMap);
        AppMethodBeat.o(49114);
      }
      else if (str.startsWith("sns_ff_"))
      {
        paramMap = new d(paramMap);
        AppMethodBeat.o(49114);
      }
      else if (str.startsWith("ts_"))
      {
        paramMap = new e(paramMap);
        AppMethodBeat.o(49114);
      }
      else if (str.startsWith("sns_"))
      {
        paramMap = new i(paramMap);
        AppMethodBeat.o(49114);
      }
      else if (str.startsWith("offline_"))
      {
        paramMap = new com.tencent.mm.wallet_core.tenpay.model.f(paramMap);
        AppMethodBeat.o(49114);
      }
      else if (str.startsWith("up_"))
      {
        paramMap = new l(paramMap);
        AppMethodBeat.o(49114);
      }
      else if (str.startsWith("seb_ff_"))
      {
        paramMap = new com.tencent.mm.wallet_core.tenpay.model.h(paramMap);
        AppMethodBeat.o(49114);
      }
      else if (str.startsWith("tax_"))
      {
        paramMap = new j(paramMap);
        AppMethodBeat.o(49114);
      }
      else if (str.startsWith("dc_"))
      {
        paramMap = new c(paramMap);
        AppMethodBeat.o(49114);
      }
      else
      {
        paramMap = new com.tencent.mm.wallet_core.tenpay.model.g(paramMap);
        AppMethodBeat.o(49114);
      }
    }
  }

  public final void a(n paramn)
  {
    AppMethodBeat.i(49112);
    ab.i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
    this.Agj = 0;
    b(paramn);
    AppMethodBeat.o(49112);
  }

  public final void destory()
  {
    AppMethodBeat.i(49115);
    this.Agk = null;
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(385, this);
    AppMethodBeat.o(49115);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(49117);
    ab.d("MicroMsg.DelayQueryOrderHelper", "errType: %d, errCode: %d, errMsg: %s scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    if (((paramm instanceof com.tencent.mm.wallet_core.tenpay.model.g)) && (this.Agi.equals(paramm)))
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(385, this);
      paramm = (com.tencent.mm.wallet_core.tenpay.model.g)paramm;
      ab.d("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder errType: %d, errCode: %d, errMsg: %s scene %s  errmsgtype %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm, Integer.valueOf(paramm.Agz) });
      if (paramm.Agz == 1)
      {
        ab.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step A");
        a(paramInt1, paramInt2, paramString, paramm.dOp(), paramm);
        AppMethodBeat.o(49117);
      }
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step B");
        if (paramm.Agz == 2)
        {
          a(this.Agh.AgH, this.Agh.AgI, this.Agh.AgJ, this.Agh.AgK, paramm);
          AppMethodBeat.o(49117);
        }
        else
        {
          a(paramInt1, paramInt2, paramString, paramm.dOp(), paramm);
          AppMethodBeat.o(49117);
        }
      }
      else if ((!paramm.AfM) && (this.Agj < r.cPI().mRetryCount))
      {
        ab.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step C");
        ab.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", new Object[] { r.cPI().tDf });
        com.tencent.mm.plugin.report.service.h.pYm.k(965L, 0L, 1L);
        b(this.Agh);
        AppMethodBeat.o(49117);
      }
      else
      {
        n localn = this.Agh;
        int i = r.cPI().mRetryCount;
        ab.i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", new Object[] { Boolean.valueOf(localn.dOs()), Integer.valueOf(this.Agj) });
        if (this.Agj < i);
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label433;
          ab.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D doLoopDelayScene");
          b(this.Agh);
          AppMethodBeat.o(49117);
          break;
        }
        label433: ab.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D fail, retmsg_type: %s", new Object[] { Integer.valueOf(paramm.Agz) });
        if (paramm.Agz == 1)
        {
          a(paramInt1, paramInt2, paramString, paramm.dOp(), paramm);
          AppMethodBeat.o(49117);
        }
        else if (paramm.Agz == 2)
        {
          a(this.Agh.AgH, this.Agh.AgI, this.Agh.AgJ, this.Agh.AgK, paramm);
          AppMethodBeat.o(49117);
        }
        else
        {
          paramString = r.cPI().tDf;
          if (!bo.isNullOrNil(this.Agh.AgJ))
            paramString = this.Agh.AgJ;
          ab.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", new Object[] { paramString });
          a(this.Agh.AgH, this.Agh.AgI, paramString, this.Agh.AgK, paramm);
          AppMethodBeat.o(49117);
          continue;
          if (((paramm instanceof n)) && (this.Agh.equals(paramm)))
          {
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.b(385, this);
            if (((n)paramm).AgP)
            {
              if (this.Agh.tpw)
              {
                ab.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess ok");
                a(paramInt1, paramInt2, paramString, ((n)paramm).AgK, this.Agi);
                AppMethodBeat.o(49117);
                continue;
              }
              if (this.Agh.dOs())
              {
                ab.i("MicroMsg.DelayQueryOrderHelper", "try isServerDelayQuery true");
                b(this.Agh);
                AppMethodBeat.o(49117);
                continue;
              }
              paramString = r.cPI().tDf;
              ab.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", new Object[] { paramString });
              a(paramInt1, paramInt2, paramString, ((n)paramm).AgK, this.Agi);
            }
          }
          else
          {
            AppMethodBeat.o(49117);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.a
 * JD-Core Version:    0.6.2
 */
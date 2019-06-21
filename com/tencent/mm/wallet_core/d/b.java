package com.tencent.mm.wallet_core.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave.RetryPayInfo;
import com.tencent.mm.wallet_core.tenpay.model.n;
import java.util.HashMap;
import org.json.JSONObject;

public final class b
  implements f
{
  static ITenpaySave.RetryPayInfo tfe;
  private n Agh;
  private int Agj = 0;
  private f Agk;

  public b(f paramf)
  {
    this.Agk = paramf;
  }

  private void a(int paramInt1, int paramInt2, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49122);
    ab.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback errCode = " + paramInt2 + "errType = " + paramInt1);
    if ((this.Agh != null) && (paramJSONObject != null) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mScene !=null");
      this.Agh.a(paramInt2, paramString, paramJSONObject);
      this.Agk.onSceneEnd(paramInt1, paramInt2, paramString, this.Agh);
    }
    while (true)
    {
      ab.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback reset");
      this.Agj = 0;
      AppMethodBeat.o(49122);
      return;
      if (this.Agk != null)
      {
        ab.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mRealCallback !=null");
        this.Agk.onSceneEnd(paramInt1, paramInt2, paramString, this.Agh);
      }
    }
  }

  private void c(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(49124);
    a(paramInt1, paramInt2, tfe.Agw, ((n)paramm).AgK);
    AppMethodBeat.o(49124);
  }

  private boolean dOi()
  {
    AppMethodBeat.i(49118);
    int i = dOj();
    boolean bool;
    if (this.Agj >= i)
    {
      bool = false;
      AppMethodBeat.o(49118);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(49118);
    }
  }

  private static int dOj()
  {
    AppMethodBeat.i(49119);
    int i;
    if ((tfe != null) && (tfe.bVy()))
    {
      i = tfe.Agv;
      AppMethodBeat.o(49119);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(49119);
    }
  }

  public final boolean c(n paramn)
  {
    boolean bool = false;
    AppMethodBeat.i(49120);
    if ((tfe != null) && (tfe.bVy()));
    int j;
    for (int i = tfe.Agu; ; i = 0)
    {
      j = dOj();
      this.Agj += 1;
      if (this.Agj <= j)
        break;
      AppMethodBeat.o(49120);
      return bool;
    }
    this.Agh = paramn;
    this.Agh.pOZ = true;
    g.RQ();
    g.RO().eJo.a(385, this);
    this.Agh.dOt();
    int k = this.Agj;
    if (this.Agj >= j);
    for (int m = 1; ; m = 0)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("retry_count", String.valueOf(k));
      localHashMap.put("is_last_retry", String.valueOf(m));
      paramn.aZ(localHashMap);
      ab.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      g.RQ();
      g.RO().eJo.a(paramn, i * 1000);
      AppMethodBeat.o(49120);
      bool = true;
      break;
    }
  }

  public final void destory()
  {
    AppMethodBeat.i(49121);
    this.Agk = null;
    g.RQ();
    g.RO().eJo.b(385, this);
    AppMethodBeat.o(49121);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(49123);
    ab.d("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "errType: %d, errCode: %d, errMsg: %s scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramm instanceof n))
    {
      if ((paramm instanceof ITenpaySave))
      {
        ITenpaySave.RetryPayInfo localRetryPayInfo = ((ITenpaySave)paramm).cMC();
        if (localRetryPayInfo.bVy())
          tfe = localRetryPayInfo;
      }
      g.RQ();
      g.RO().eJo.b(385, this);
      if (((n)paramm).AgP)
        if (this.Agh.tpw)
        {
          ab.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess ok");
          a(paramInt1, paramInt2, paramString, ((n)paramm).AgK);
          AppMethodBeat.o(49123);
        }
    }
    while (true)
    {
      return;
      if ((this.Agh.AgQ) && (dOi()))
      {
        ab.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try isServerDelayQuery true svrcanRetry %s localCanRetry %s", new Object[] { Boolean.valueOf(this.Agh.AgQ), Boolean.valueOf(dOi()) });
        if (!c(this.Agh))
        {
          c(paramInt1, paramInt2, paramm);
          AppMethodBeat.o(49123);
        }
      }
      else if (((n)paramm).AfM)
      {
        ab.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try svr no resp");
        if (!c(this.Agh))
        {
          c(paramInt1, paramInt2, paramm);
          AppMethodBeat.o(49123);
        }
      }
      else
      {
        paramString = tfe.Agw;
        ab.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess error %s", new Object[] { paramString });
        a(paramInt1, paramInt2, paramString, ((n)paramm).AgK);
        AppMethodBeat.o(49123);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.b
 * JD-Core Version:    0.6.2
 */
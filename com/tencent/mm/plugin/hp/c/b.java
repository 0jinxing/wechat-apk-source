package com.tencent.mm.plugin.hp.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.hp.b.e;
import com.tencent.mm.plugin.hp.d.c.a;
import com.tencent.mm.plugin.hp.tinker.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bhv;
import com.tencent.mm.protocal.protobuf.bhx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public final class b extends a
{
  private boolean ntW;
  com.tencent.mm.plugin.hp.d.b ntX;

  public b()
  {
    this("", "", null, false);
  }

  public b(String paramString1, String paramString2, List<bhv> paramList)
  {
    this(paramString1, paramString2, paramList, true);
  }

  private b(String paramString1, String paramString2, List<bhv> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(90622);
    this.ntW = true;
    Object localObject;
    if (!paramBoolean)
    {
      paramString2 = "tinker_id_" + com.tencent.mm.loader.j.a.Ul();
      if (com.tencent.mm.loader.j.a.eSh == null)
      {
        paramString1 = "";
        paramList = bGn();
        this.gOW = 1;
        localObject = paramString1;
        label59: this.ntS = paramString2;
        this.ntT = ((String)localObject);
        this.ntU.addAll(paramList);
        this.ntW = paramBoolean;
        if (!this.ntW)
          break label406;
        paramString2 = new b.1(this);
        paramString1 = ah.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_node", "");
        if (bo.isNullOrNil(paramString1))
          break label398;
      }
    }
    while (true)
    {
      try
      {
        paramList = new com/tencent/mm/protocal/protobuf/bhx;
        paramList.<init>();
        paramList.parseFrom(Base64.decode(paramString1.getBytes(), 0));
        if (paramList.pdA != null)
        {
          if (com.tencent.mm.loader.j.a.eSh == null)
          {
            paramString1 = "";
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("tinker_id_");
            String str = com.tencent.mm.loader.j.a.Ul();
            localObject = ah.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_base_id", "");
            com.tencent.mm.plugin.hp.d.b localb = new com/tencent/mm/plugin/hp/d/b;
            localb.<init>(paramList.wLf);
            ab.i("Tinker.TinkerUtils", "LastResponse PID:%s current PID:%s last baseId:%s current baseId:%s", new Object[] { localb.num, paramString1, localObject, str });
            if ((bo.isNullOrNil(localb.num)) || (localb.num.equalsIgnoreCase(paramString1)) || (bo.isNullOrNil(str)) || (!str.equalsIgnoreCase((String)localObject)))
              break label398;
            paramString2.a(true, localb);
            AppMethodBeat.o(90622);
            return;
            paramString1 = "tinker_id_" + com.tencent.mm.loader.j.a.eSh;
            break;
            this.gOW = 0;
            localObject = paramString2;
            paramString2 = paramString1;
            break label59;
          }
          paramString1 = new java/lang/StringBuilder;
          paramString1.<init>("tinker_id_");
          paramString1 = com.tencent.mm.loader.j.a.eSh;
          continue;
        }
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("Tinker.TinkerUtils", paramString1, "parse tinker update Response failed.", new Object[0]);
        h.pYm.a(614L, 73L, 1L, false);
      }
      label398: paramString2.a(false, null);
      label406: AppMethodBeat.o(90622);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90623);
    ab.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "errType:%d errCode:%d errMsg:%s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    bhx localbhx;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localbhx = (bhx)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      paramq = localbhx.wLf;
      if (paramq != null)
        if (!this.ntW);
    }
    while (true)
    {
      try
      {
        Context localContext = ah.getContext();
        paramArrayOfByte = new java/lang/String;
        paramArrayOfByte.<init>(Base64.encode(localbhx.toByteArray(), 0));
        g.aB(localContext, paramArrayOfByte);
        g.P(ah.getContext(), 0);
        ab.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "node is no empty. try to process");
        paramq = new com.tencent.mm.plugin.hp.d.b(paramq);
        ab.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "node is no empty. new TinkerSyncResponse finish");
        new e(paramq).jdMethod_if(this.ntW);
        ab.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "node is no empty. end process");
        com.tencent.mm.plugin.hp.b.a.en(4, 0);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(90623);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", paramArrayOfByte, "save node failed.", new Object[0]);
        h.pYm.a(614L, 72L, 1L, false);
        continue;
      }
      ab.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "check from setting about ui. ");
      continue;
      if (localbhx.wLh == 1)
      {
        com.tencent.mm.plugin.hp.b.a.en(1, 0);
        label248: if (this.ntX == null)
          break label447;
        if (com.tencent.mm.loader.j.a.eSh != null)
          break label449;
      }
      label447: label449: for (paramq = ""; ; paramq = "tinker_id_" + com.tencent.mm.loader.j.a.eSh)
      {
        if ((bo.isNullOrNil(this.ntX.num)) || (this.ntX.num.equalsIgnoreCase(paramq)))
          break label470;
        paramInt1 = ah.getContext().getSharedPreferences("tinker_patch_share_config", 4).getInt("tinker_node_retry_time", 0);
        if (paramInt1 < 4)
          break label472;
        g.aB(ah.getContext(), "");
        g.P(ah.getContext(), 0);
        ab.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "retry time over %d time, then clear node and count", new Object[] { Integer.valueOf(paramInt1) });
        h.pYm.a(614L, 74L, 1L, false);
        break;
        if (localbhx.wLh == 2)
        {
          com.tencent.mm.plugin.hp.b.a.en(2, 0);
          break label248;
        }
        if (localbhx.wLh == 3)
        {
          com.tencent.mm.plugin.hp.b.a.en(3, 0);
          break label248;
        }
        if (localbhx.wLh == 4)
        {
          com.tencent.mm.plugin.hp.b.a.en(6, 0);
          break label248;
        }
        if (localbhx.wLh == 6)
        {
          ab.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "revoke this patch.");
          break label248;
        }
        com.tencent.mm.plugin.hp.b.a.en(5, 0);
        break label248;
        break;
      }
      label470: continue;
      label472: new e(this.ntX).jdMethod_if(this.ntW);
      h.pYm.a(614L, 70L, 1L, false);
      paramInt1++;
      g.P(ah.getContext(), paramInt1);
      ab.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "add retry time %d", new Object[] { Integer.valueOf(paramInt1) });
      continue;
      ab.d("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "check tinker update failed.");
      com.tencent.mm.plugin.hp.b.a.en(5, paramInt2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.c.b
 * JD-Core Version:    0.6.2
 */
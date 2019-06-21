package com.tencent.mm.ai;

import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.f;
import com.tencent.mm.protocal.j.c;
import com.tencent.mm.protocal.j.c.a;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class k
  implements com.tencent.mm.network.q
{
  private l.d fta;
  public boolean ftb = false;
  private boolean ftc = true;

  protected abstract l.d ZR();

  public int acB()
  {
    return 0;
  }

  public int acC()
  {
    return 0;
  }

  public final l.d acF()
  {
    Object localObject;
    boolean bool;
    int k;
    if (this.fta == null)
    {
      this.fta = ZR();
      localObject = this.fta;
      ((l.d)localObject).vye = com.tencent.mm.compatible.e.q.LM();
      ((l.d)localObject).vyd = d.eSg;
      ((l.d)localObject).vyc = d.vxo;
      ((l.d)localObject).hB(j.c.a.vxR.ZP());
      if ((!f.vxx) || (!g.RK()))
        break label256;
      int i = getType();
      if (((a)g.K(a.class)).Nu().getInt("UseAesGcmSessionKeySwitch", 1) != 0)
        break label245;
      bool = true;
      ab.i("MicroMsg.MMReqRespBase", "summerauths check cgi[%s] accHasReady openSwitch[%s] ", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
      if (bool)
      {
        localObject = ((a)g.K(a.class)).Nu().getValue("UseAesGcmSessionKeyCgiList");
        if (!bo.isNullOrNil((String)localObject))
        {
          ab.i("MicroMsg.MMReqRespBase", "summerauths check cgi list[%s]", new Object[] { localObject });
          localObject = ((String)localObject).trim().split(",");
          if (localObject.length > 0)
          {
            int j = localObject.length;
            k = 0;
            label186: if (k < j)
            {
              String str = localObject[k];
              if (i != bo.getInt(str, 0))
                break label250;
              this.ftc = false;
              ab.i("MicroMsg.MMReqRespBase", "summerauths check cgi list found cgi[%s] singleSession[%s]", new Object[] { str, Boolean.valueOf(this.ftc) });
            }
          }
        }
      }
    }
    while (true)
    {
      return this.fta;
      label245: bool = false;
      break;
      label250: k++;
      break label186;
      label256: ab.i("MicroMsg.MMReqRespBase", "summerauths check cgi[%s] USE_ECDH[%s] accHasReady[%s] ", new Object[] { Integer.valueOf(((l.d)localObject).getCmdId()), Boolean.valueOf(f.vxx), Boolean.valueOf(g.RK()) });
    }
  }

  public final boolean acG()
  {
    return this.ftb;
  }

  public final boolean acH()
  {
    return this.ftc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.k
 * JD-Core Version:    0.6.2
 */
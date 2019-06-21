package com.tencent.mm.plugin.ipcall.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.b.a;
import com.tencent.mm.plugin.ipcall.a.g.j;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Map;

public final class i
  implements at
{
  private static i nvT;
  private static HashMap<Integer, h.d> nwm;
  private g nvU;
  private com.tencent.mm.plugin.ipcall.a.c.a nvV;
  private com.tencent.mm.plugin.ipcall.a.c.b nvW;
  private com.tencent.mm.plugin.ipcall.a.b.b nvX;
  private f nvY;
  private com.tencent.mm.plugin.ipcall.c nvZ;
  private com.tencent.mm.plugin.ipcall.a.g.d nwa;
  private l nwb;
  private j nwc;
  private com.tencent.mm.plugin.ipcall.a.g.h nwd;
  private com.tencent.mm.plugin.voip.video.i nwe;
  private com.tencent.mm.plugin.voip.video.d nwf;
  private Context nwg;
  private long nwh;
  private com.tencent.mm.sdk.b.c nwi;
  private com.tencent.mm.sdk.b.c nwj;
  private com.tencent.mm.sdk.b.c nwk;
  private com.tencent.mm.sdk.b.c nwl;
  private bz.a nwn;
  private bz.a nwo;
  private bz.a nwp;

  static
  {
    AppMethodBeat.i(21790);
    nvT = null;
    HashMap localHashMap = new HashMap();
    nwm = localHashMap;
    localHashMap.put(Integer.valueOf("IPCallAddressItem".hashCode()), new i.7());
    nwm.put(Integer.valueOf("IPCallRecord".hashCode()), new i.8());
    nwm.put(Integer.valueOf("IPCallPopularCountry".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return j.fnj;
      }
    });
    nwm.put(Integer.valueOf("IPCallMsg".hashCode()), new i.10());
    AppMethodBeat.o(21790);
  }

  public i()
  {
    AppMethodBeat.i(21774);
    this.nvU = new g();
    this.nvV = new com.tencent.mm.plugin.ipcall.a.c.a();
    this.nvW = new com.tencent.mm.plugin.ipcall.a.c.b();
    this.nvX = new com.tencent.mm.plugin.ipcall.a.b.b();
    this.nvY = new f();
    this.nvZ = new com.tencent.mm.plugin.ipcall.c();
    this.nwi = new i.1(this);
    this.nwj = new i.4(this);
    this.nwk = new i.5(this);
    this.nwl = new i.6(this);
    this.nwn = new i.11(this);
    this.nwo = new bz.a()
    {
      public final void a(e.a paramAnonymousa)
      {
        AppMethodBeat.i(21765);
        ab.i("MicroMsg.SubCoreIPCall", "WeChatOutMsg onRecieveMsg");
        Object localObject = paramAnonymousa.eAB;
        paramAnonymousa = aa.a(paramAnonymousa.eAB.vED);
        if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
        {
          ab.e("MicroMsg.SubCoreIPCall", "WeChatOutMsg onReceiveMsg, msgContent is null");
          AppMethodBeat.o(21765);
        }
        while (true)
        {
          return;
          paramAnonymousa = br.z(paramAnonymousa, "sysmsg");
          if (paramAnonymousa != null)
            break;
          ab.e("MicroMsg.SubCoreIPCall", "WeChatOutMsg onReceiveMsg, values is null");
          AppMethodBeat.o(21765);
        }
        com.tencent.mm.plugin.ipcall.a.g.h localh = i.bHz();
        long l = ((cm)localObject).ptD;
        int i;
        if (paramAnonymousa != null)
        {
          localObject = new com.tencent.mm.plugin.ipcall.a.g.g();
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_svrId = l;
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.Title"));
          if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title == null)
            ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title = "";
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.Content"));
          if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content == null)
            ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content = "";
          i = bo.getInt((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.MsgType"), 0);
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_msgType = i;
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_pushTime = bo.getLong((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.PushTime"), 0L);
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.DescUrl"));
          if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl == null)
            ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl = "";
          ab.i("MicroMsg.IPCallMsgStorage", "insertNewXml svrId:%s,title:%s,content:%s,msgType:%s,pushTime:%s,descUrl=%s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_svrId, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_msgType, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_pushTime, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl });
          localh.b((com.tencent.mm.sdk.e.c)localObject);
        }
        while (true)
        {
          if (i != -1)
          {
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xLH, Integer.valueOf(i));
          }
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLG, Boolean.TRUE);
          com.tencent.mm.plugin.report.service.h.pYm.e(13254, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(i), Integer.valueOf(-1) });
          AppMethodBeat.o(21765);
          break;
          i = -1;
        }
      }
    };
    this.nwp = new i.3(this);
    AppMethodBeat.o(21774);
  }

  public static com.tencent.mm.plugin.voip.video.i bHA()
  {
    AppMethodBeat.i(21786);
    if (bHp().nwe == null)
      bHp().nwe = new com.tencent.mm.plugin.voip.video.i(ah.getContext());
    com.tencent.mm.plugin.voip.video.i locali = bHp().nwe;
    AppMethodBeat.o(21786);
    return locali;
  }

  public static com.tencent.mm.plugin.voip.video.d bHB()
  {
    AppMethodBeat.i(21787);
    if (bHp().nwf == null)
      bHp().nwf = new com.tencent.mm.plugin.voip.video.d(ah.getContext());
    com.tencent.mm.plugin.voip.video.d locald = bHp().nwf;
    AppMethodBeat.o(21787);
    return locald;
  }

  public static i bHp()
  {
    AppMethodBeat.i(21775);
    if (nvT == null)
    {
      nvT = new i();
      aw.ZE().a("plugin.ipcall", nvT);
    }
    i locali = nvT;
    AppMethodBeat.o(21775);
    return locali;
  }

  public static g bHq()
  {
    AppMethodBeat.i(21776);
    g localg = bHp().nvU;
    AppMethodBeat.o(21776);
    return localg;
  }

  public static com.tencent.mm.plugin.ipcall.a.c.a bHr()
  {
    AppMethodBeat.i(21777);
    com.tencent.mm.plugin.ipcall.a.c.a locala = bHp().nvV;
    AppMethodBeat.o(21777);
    return locala;
  }

  public static com.tencent.mm.plugin.ipcall.a.c.b bHs()
  {
    AppMethodBeat.i(21778);
    com.tencent.mm.plugin.ipcall.a.c.b localb = bHp().nvW;
    AppMethodBeat.o(21778);
    return localb;
  }

  public static com.tencent.mm.plugin.ipcall.a.b.b bHt()
  {
    AppMethodBeat.i(21779);
    com.tencent.mm.plugin.ipcall.a.b.b localb = bHp().nvX;
    AppMethodBeat.o(21779);
    return localb;
  }

  public static f bHu()
  {
    AppMethodBeat.i(21780);
    f localf = bHp().nvY;
    AppMethodBeat.o(21780);
    return localf;
  }

  public static com.tencent.mm.plugin.ipcall.c bHv()
  {
    AppMethodBeat.i(21781);
    com.tencent.mm.plugin.ipcall.c localc = bHp().nvZ;
    AppMethodBeat.o(21781);
    return localc;
  }

  public static com.tencent.mm.plugin.ipcall.a.g.d bHw()
  {
    AppMethodBeat.i(21782);
    com.tencent.mm.kernel.g.RN().QU();
    if (bHp().nwa == null)
    {
      localObject = bHp();
      aw.ZK();
      ((i)localObject).nwa = new com.tencent.mm.plugin.ipcall.a.g.d(com.tencent.mm.model.c.Ru());
    }
    Object localObject = bHp().nwa;
    AppMethodBeat.o(21782);
    return localObject;
  }

  public static l bHx()
  {
    AppMethodBeat.i(21783);
    com.tencent.mm.kernel.g.RN().QU();
    if (bHp().nwb == null)
    {
      localObject = bHp();
      aw.ZK();
      ((i)localObject).nwb = new l(com.tencent.mm.model.c.Ru());
    }
    Object localObject = bHp().nwb;
    AppMethodBeat.o(21783);
    return localObject;
  }

  public static j bHy()
  {
    AppMethodBeat.i(21784);
    com.tencent.mm.kernel.g.RN().QU();
    if (bHp().nwc == null)
    {
      localObject = bHp();
      aw.ZK();
      ((i)localObject).nwc = new j(com.tencent.mm.model.c.Ru());
    }
    Object localObject = bHp().nwc;
    AppMethodBeat.o(21784);
    return localObject;
  }

  public static com.tencent.mm.plugin.ipcall.a.g.h bHz()
  {
    AppMethodBeat.i(21785);
    com.tencent.mm.kernel.g.RN().QU();
    if (bHp().nwd == null)
    {
      localObject = bHp();
      aw.ZK();
      ((i)localObject).nwd = new com.tencent.mm.plugin.ipcall.a.g.h(com.tencent.mm.model.c.Ru());
    }
    Object localObject = bHp().nwd;
    AppMethodBeat.o(21785);
    return localObject;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return nwm;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(21788);
    Object localObject = this.nvU;
    ((g)localObject).nvF.init();
    ((g)localObject).nvG.init();
    ((g)localObject).nvH.init();
    ((g)localObject).nvI.init();
    ((g)localObject).nvJ.init();
    ((g)localObject).nvK.init();
    ((g)localObject).nvL.init();
    ((g)localObject).nvM.init();
    ((g)localObject).nvF.a((a.a)localObject);
    ((g)localObject).nvH.a((a.a)localObject);
    ((g)localObject).nvI.a((a.a)localObject);
    ((g)localObject).nvK.a((a.a)localObject);
    ((g)localObject).nvM.a((a.a)localObject);
    ((g)localObject).nvG.nws = ((b.a)localObject);
    ((g)localObject).nvJ.nws = ((b.a)localObject);
    aw.a(((g)localObject).nvQ);
    b.init();
    localObject = d.bHg();
    com.tencent.mm.sdk.b.a.xxA.c(((d)localObject).nvt);
    localObject = e.bHj();
    com.tencent.mm.sdk.b.a.xxA.c(((e)localObject).gyU);
    aw.getSysCmdMsgExtension().a("WeChatOut", this.nwn, true);
    aw.getSysCmdMsgExtension().a("WeChatOutMsg", this.nwo, true);
    aw.getSysCmdMsgExtension().a("WCONotify", this.nwp, true);
    com.tencent.mm.sdk.b.a.xxA.c(this.nwi);
    com.tencent.mm.sdk.b.a.xxA.c(this.nwj);
    com.tencent.mm.sdk.b.a.xxA.c(this.nwk);
    com.tencent.mm.sdk.b.a.xxA.c(this.nwl);
    AppMethodBeat.o(21788);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(21789);
    if (this.nvY.bHk())
      this.nvZ.eo(0, 0);
    Object localObject = this.nvU;
    ((g)localObject).nvF.destroy();
    ((g)localObject).nvG.destroy();
    ((g)localObject).nvH.destroy();
    ((g)localObject).nvI.destroy();
    ((g)localObject).nvJ.destroy();
    ((g)localObject).nvL.destroy();
    aw.b(((g)localObject).nvQ);
    b.release();
    localObject = d.bHg();
    aw.Rg().b(159, (com.tencent.mm.ai.f)localObject);
    aw.Rg().b(160, (com.tencent.mm.ai.f)localObject);
    com.tencent.mm.sdk.b.a.xxA.d(((d)localObject).nvt);
    localObject = e.bHj();
    com.tencent.mm.sdk.b.a.xxA.d(((e)localObject).gyU);
    aw.getSysCmdMsgExtension().b("WeChatOut", this.nwn, true);
    aw.getSysCmdMsgExtension().b("WeChatOutMsg", this.nwo, true);
    aw.getSysCmdMsgExtension().b("WCONotify", this.nwp, true);
    com.tencent.mm.sdk.b.a.xxA.d(this.nwi);
    com.tencent.mm.sdk.b.a.xxA.d(this.nwj);
    com.tencent.mm.sdk.b.a.xxA.d(this.nwk);
    com.tencent.mm.sdk.b.a.xxA.d(this.nwl);
    AppMethodBeat.o(21789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.i
 * JD-Core Version:    0.6.2
 */
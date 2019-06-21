package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.c.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Map;

public final class g extends l.b
  implements f
{
  private static int qsn = 0;
  private float ecs;
  private float ect;
  private b.a ecy;
  private int emC;
  private com.tencent.mm.modelgeo.d fwu;
  private String hxK;
  public int kdC;
  private ak mHandler;
  private c qsI;
  private e qsJ;
  private boolean qsK;
  private boolean qsL;
  private long qso;

  public g(l.a parama)
  {
    super(parama);
    AppMethodBeat.i(24531);
    this.qsJ = new e();
    this.qso = 0L;
    this.mHandler = new ak();
    this.emC = 0;
    this.hxK = "";
    this.qsK = false;
    this.qsL = false;
    this.ecs = -85.0F;
    this.ect = -1000.0F;
    this.ecy = new g.1(this);
    AppMethodBeat.o(24531);
  }

  private void aZv()
  {
    AppMethodBeat.i(24542);
    if (this.fwu != null)
      this.fwu.c(this.ecy);
    AppMethodBeat.o(24542);
  }

  private void cjv()
  {
    AppMethodBeat.i(24541);
    this.fwu = com.tencent.mm.modelgeo.d.agz();
    this.fwu.a(this.ecy, true);
    AppMethodBeat.o(24541);
  }

  private void ckc()
  {
    AppMethodBeat.i(24537);
    if (this.qsK)
    {
      ab.i("MicroMsg.ShakeCardService", "ShakeCardService is doing doNetSceneShakeCard, return");
      AppMethodBeat.o(24537);
    }
    while (true)
    {
      return;
      this.qsK = true;
      this.qsL = false;
      ab.i("MicroMsg.ShakeCardService", "ShakeCardService do doNetSceneShakeCard");
      this.qsI = new c(this.ect, this.ecs, this.emC, this.hxK);
      aw.Rg().a(this.qsI, 0);
      AppMethodBeat.o(24537);
    }
  }

  private void ckd()
  {
    AppMethodBeat.i(24544);
    long l1 = System.currentTimeMillis() / 1000L;
    if (a.Cw(qsn))
      ab.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is valid");
    for (long l2 = a.Cx(qsn); ; l2 = a.Cy(a.ckr()))
    {
      ab.i("MicroMsg.ShakeCardService", "ShakeCardService updateWaitingTime wait nextInterval is ".concat(String.valueOf(l2)));
      this.qso = (l2 + l1);
      AppMethodBeat.o(24544);
      return;
      ab.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is not valid");
    }
  }

  public final void Ix(String paramString)
  {
    AppMethodBeat.i(24533);
    if ((paramString != null) && (paramString.length() <= 256))
    {
      ab.i("MicroMsg.ShakeCardService", "ShakeCardService mExtInfo:" + this.hxK);
      this.hxK = paramString;
      AppMethodBeat.o(24533);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ShakeCardService", "ShakeCardService ext_info size > 256 byte, extinfo:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(24533);
    }
  }

  public final void cjw()
  {
    AppMethodBeat.i(24540);
    aw.Rg().b(1250, this);
    aZv();
    super.cjw();
    AppMethodBeat.o(24540);
  }

  public final void init()
  {
    AppMethodBeat.i(24534);
    qsn = com.tencent.mm.plugin.shake.b.m.cjY().qsn;
    this.qso = com.tencent.mm.plugin.shake.b.m.cjY().qso;
    this.ecs = com.tencent.mm.plugin.shake.b.m.cjY().ecs;
    this.ect = com.tencent.mm.plugin.shake.b.m.cjY().ect;
    aw.Rg().a(1250, this);
    cjv();
    AppMethodBeat.o(24534);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(24543);
    if ((paramm instanceof c))
    {
      paramm = (c)paramm;
      paramString = this.qsJ;
      paramm = paramm.qsm;
      paramString.kdC = paramm.kdC;
      paramString.kbU = paramm.kbU;
      paramString.cMD = paramm.cMD;
      paramString.title = paramm.title;
      paramString.kbW = paramm.kbW;
      paramString.kbX = paramm.kbX;
      paramString.kdg = paramm.kdg;
      paramString.kbV = paramm.kbV;
      paramString.color = paramm.color;
      paramString.qsn = paramm.qsn;
      paramString.qsq = paramm.qsq;
      paramString.qsr = paramm.qsr;
      paramString.qss = paramm.qss;
      paramString.qst = paramm.qst;
      paramString.qsu = paramm.qsu;
      paramString.kbZ = paramm.kbZ;
      paramString.qsv = paramm.qsv;
      paramString.qsw = paramm.qsw;
      this.kdC = this.qsJ.kdC;
      ab.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd()  action_type:" + this.kdC + "  frequency_level:" + qsn + " control_flag:" + this.qsJ.qsq);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label344;
      qsn = this.qsJ.qsn;
      ab.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd is OK ");
      if (this.qrT != null)
        this.qrT.a(1250, this.qsJ, 1L);
      ckd();
    }
    while (true)
    {
      com.tencent.mm.plugin.shake.b.m.cjY().qsn = qsn;
      com.tencent.mm.plugin.shake.b.m.cjY().qso = this.qso;
      this.qsK = false;
      AppMethodBeat.o(24543);
      return;
      label344: if (((paramInt1 == 5) && (paramInt2 == -1)) || ((paramInt1 == 4) && (paramInt2 != 0)))
      {
        ab.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + paramInt1 + " errCode is " + paramInt2);
        if (this.qrT != null)
          this.qrT.a(1250, this.qsJ, 2L);
        long l1 = System.currentTimeMillis() / 1000L;
        long l2 = a.Cy(a.ckr());
        ab.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd wait nextInterval is ".concat(String.valueOf(l2)));
        this.qso = (l1 + l2);
      }
      else
      {
        ab.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + paramInt1 + " errCode is " + paramInt2);
        if (this.qrT != null)
          this.qrT.a(1250, this.qsJ, 2L);
        ckd();
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(24538);
    aZv();
    AppMethodBeat.o(24538);
  }

  public final void reset()
  {
    AppMethodBeat.i(24535);
    if (this.qsI != null)
      aw.Rg().c(this.qsI);
    AppMethodBeat.o(24535);
  }

  public final void resume()
  {
    AppMethodBeat.i(24539);
    if (this.fwu != null)
      this.fwu.a(this.ecy, true);
    AppMethodBeat.o(24539);
  }

  public final void setFromScene(int paramInt)
  {
    AppMethodBeat.i(24532);
    this.emC = paramInt;
    ab.i("MicroMsg.ShakeCardService", "ShakeCardService from_scene:".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(24532);
  }

  public final void start()
  {
    AppMethodBeat.i(24536);
    init();
    reset();
    if (this.fwu == null)
      cjv();
    this.fwu.b(this.ecy, true);
    Object localObject = com.tencent.mm.plugin.shake.b.m.cjY();
    long l1;
    long l2;
    if ((!TextUtils.isEmpty("key_shake_card_item")) && (((d)localObject).kaV.containsKey("key_shake_card_item")))
    {
      localObject = ((d)localObject).kaV.get("key_shake_card_item");
      l1 = System.currentTimeMillis() / 1000L;
      l2 = this.qso;
      if ((localObject == null) || (!(localObject instanceof e)))
        break label152;
      localObject = (e)localObject;
      this.qrT.a(1250, (e)localObject, 1L);
      com.tencent.mm.plugin.shake.b.m.cjY().putValue("key_shake_card_item", null);
      ab.i("MicroMsg.ShakeCardService", "getlbscard return data is no empty, don't do doNetSceneShakeCard, return ok");
      AppMethodBeat.o(24536);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label152: int i;
      if (this.qso == 0L)
        i = 1;
      while (true)
        if (i != 0)
        {
          if (this.qsK)
          {
            ab.i("MicroMsg.ShakeCardService", "ShakeCardService is doing netscene, return");
            AppMethodBeat.o(24536);
            break;
            if (l1 - l2 >= 0L)
            {
              i = 1;
              continue;
            }
            h.pYm.e(11666, new Object[] { Integer.valueOf(this.emC) });
            this.mHandler.postDelayed(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(24529);
                g.e(g.this).kdC = 3;
                g.a(g.this, g.e(g.this).kdC);
                g.e(g.this).qsu = com.tencent.mm.plugin.shake.b.m.cjY().qsp;
                if (g.f(g.this) != null)
                  g.g(g.this).a(1250, g.e(g.this), 2L);
                AppMethodBeat.o(24529);
              }
            }
            , 3000L);
            ab.i("MicroMsg.ShakeCardService", "ShakeCardService do not doNetSceneShakeCard, because time is not expire");
            i = 0;
            continue;
          }
          if ((this.ecs == -85.0F) || (this.ect == -1000.0F))
          {
            this.qsL = true;
            ab.i("MicroMsg.ShakeCardService", "ShakeCardService location is not geted, wait 4 second");
            this.mHandler.postDelayed(new g.3(this), 4000L);
            AppMethodBeat.o(24536);
            break;
          }
          ckc();
        }
      AppMethodBeat.o(24536);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.a.g
 * JD-Core Version:    0.6.2
 */
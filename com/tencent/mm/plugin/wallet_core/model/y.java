package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.g.a.uq.a;
import com.tencent.mm.g.a.uq.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class y extends c<uq>
  implements f
{
  private boolean cQR;
  private boolean cQS;
  private boolean mru;
  private uq tCt;

  public y()
  {
    AppMethodBeat.i(46904);
    this.mru = false;
    this.cQR = false;
    this.cQS = false;
    this.xxI = uq.class.getName().hashCode();
    AppMethodBeat.o(46904);
  }

  private static boolean Hq(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 0)
    {
      bool2 = bool1;
      if (paramInt != 1)
      {
        bool2 = bool1;
        if (paramInt != 2)
        {
          bool2 = bool1;
          if (paramInt != 3)
          {
            bool2 = bool1;
            if (paramInt != 4)
            {
              bool2 = bool1;
              if (paramInt != 6)
              {
                bool2 = bool1;
                if (paramInt != 8)
                {
                  bool2 = bool1;
                  if (paramInt != 9)
                  {
                    bool2 = bool1;
                    if (paramInt != 10)
                    {
                      bool2 = bool1;
                      if (paramInt != 11)
                      {
                        bool2 = bool1;
                        if (paramInt != 12)
                        {
                          bool2 = bool1;
                          if (paramInt != 13)
                          {
                            bool2 = bool1;
                            if (paramInt != 14)
                            {
                              bool2 = bool1;
                              if (paramInt != 15)
                              {
                                bool2 = bool1;
                                if (paramInt != 16)
                                {
                                  bool2 = bool1;
                                  if (paramInt != 17)
                                  {
                                    bool2 = bool1;
                                    if (paramInt != 18)
                                    {
                                      bool2 = bool1;
                                      if (paramInt != 19)
                                      {
                                        bool2 = bool1;
                                        if (paramInt != 20)
                                        {
                                          bool2 = bool1;
                                          if (paramInt != 21)
                                          {
                                            bool2 = bool1;
                                            if (paramInt != 22)
                                              if (paramInt != 23)
                                                break label174;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label174: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  private void a(int paramInt, String paramString, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(46907);
    if (this.tCt != null)
    {
      this.tCt.cQQ.errCode = paramInt;
      this.tCt.cQQ.aIm = paramString;
      this.tCt.cQQ.cRu = paramm;
      this.tCt.cQQ.cQT = r.cPI().cQg();
      this.tCt.cQQ.cQU = r.cPI().cQG();
      this.tCt.cQQ.cQV = r.cPI().cQI();
      this.tCt.cQQ.cQW = r.cPI().cQo().cPW();
      this.tCt.cQQ.cQX = r.cPI().cQn();
      this.tCt.cQQ.cQY = r.cPI().bhp();
      this.tCt.cQQ.cQZ = r.cPI().cQh();
      this.tCt.cQQ.cRa = r.cPI().cQo().cQa();
      this.tCt.cQQ.cRb = "";
      this.tCt.cQQ.cRo = r.cPI().cQA();
      if ((paramm != null) && ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.y)))
      {
        this.tCt.cQQ.cRb = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRb;
        this.tCt.cQQ.cRc = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRc;
        this.tCt.cQQ.cRd = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRd;
        this.tCt.cQQ.cRe = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRe;
        this.tCt.cQQ.cRf = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRf;
        this.tCt.cQQ.scene = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).scene;
        this.tCt.cQQ.cRg = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRg;
        this.tCt.cQQ.cRh = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRh;
        this.tCt.cQQ.cRi = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRi;
        this.tCt.cQQ.cRj = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRj;
        this.tCt.cQQ.cRk = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRk;
        this.tCt.cQQ.cRl = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRl;
        this.tCt.cQQ.subtitle = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).subtitle;
        this.tCt.cQQ.title = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).title;
        this.tCt.cQQ.cRm = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRm;
        this.tCt.cQQ.cRn = ((com.tencent.mm.plugin.wallet_core.c.y)paramm).cRn;
      }
      paramString = this.tCt.cQQ;
      if (!r.cPI().cQw())
        break label710;
    }
    label710: for (paramInt = 1; ; paramInt = 0)
    {
      paramString.cRp = paramInt;
      this.tCt.cQQ.cRq = r.cPI().cQx();
      this.tCt.cQQ.cRr = r.cPI().cQy();
      this.tCt.cQQ.cRs = r.cPI().cQz();
      this.tCt.cQQ.cRt = paramBoolean;
      ab.d("MicroMsg.WalletGetUserInfoEventListener", "mUserInfo needBind : " + this.tCt.cQQ.cQU + " hasNewTips : " + this.tCt.cQQ.cQV + " swipeOn : " + this.tCt.cQQ.cQW);
      if (this.tCt.callback != null)
        this.tCt.callback.run();
      if (this.tCt.cQQ.cQH != null)
        this.tCt.cQQ.cQH.run();
      if (this.mru)
        this.tCt = null;
      AppMethodBeat.o(46907);
      return;
    }
  }

  private boolean a(uq paramuq)
  {
    boolean bool = false;
    AppMethodBeat.i(46905);
    if (!(paramuq instanceof uq))
    {
      ab.f("MicroMsg.WalletGetUserInfoEventListener", "mismatched event");
      AppMethodBeat.o(46905);
      return bool;
    }
    this.mru = false;
    this.tCt = paramuq;
    this.cQR = paramuq.cQP.cQR;
    this.cQS = paramuq.cQP.cQS;
    ab.i("MicroMsg.WalletGetUserInfoEventListener", "mustNotifyAfterNetEnd: %s", new Object[] { Boolean.valueOf(this.cQS) });
    g.RQ();
    g.RO().eJo.a(385, this);
    g.RQ();
    g.RO().eJo.a(1518, this);
    if (r.cPI().cQl())
    {
      ab.i("MicroMsg.WalletGetUserInfoEventListener", "data is invalid. doScene");
      if (com.tencent.mm.model.r.YM())
      {
        g.RQ();
        g.RO().eJo.a(new a(), 0);
      }
    }
    while (true)
    {
      AppMethodBeat.o(46905);
      bool = true;
      break;
      g.RQ();
      Object localObject = g.RO().eJo;
      if (Hq(paramuq.cQP.scene));
      for (int i = paramuq.cQP.scene; ; i = 0)
      {
        ((p)localObject).a(new com.tencent.mm.plugin.wallet_core.c.y(null, i), 0);
        break;
      }
      long l;
      if (paramuq.cQP.cQR)
      {
        ab.i("MicroMsg.WalletGetUserInfoEventListener", "use cache");
        localObject = r.cPI();
        l = bo.anT();
        ab.i("MicroMsg.WalletUserInfoManger", "checkCacheTimeout, nowSecs: %s, cacheDeadTime: %s", new Object[] { Long.valueOf(l), Long.valueOf(((ak)localObject).tDb) });
        if ((((ak)localObject).tDb <= 0L) || (l > ((ak)localObject).tDb))
          i = 1;
        while (true)
          if (i == 0)
          {
            if (!this.cQS)
              this.mru = true;
            ab.i("MicroMsg.WalletGetUserInfoEventListener", "cache data is ok. doCallback");
            a(0, "", null, false);
            if (com.tencent.mm.model.r.YM())
            {
              g.RQ();
              g.RO().eJo.a(new a(), 0);
              break;
              i = 0;
              continue;
            }
            g.RQ();
            localObject = g.RO().eJo;
            if (Hq(paramuq.cQP.scene));
            for (i = paramuq.cQP.scene; ; i = 0)
            {
              ((p)localObject).a(new com.tencent.mm.plugin.wallet_core.c.y(null, i), 0);
              break;
            }
          }
        ab.i("MicroMsg.WalletGetUserInfoEventListener", "cache timeout, do NetSceneTenpayQueryBoundBankcard");
        if (com.tencent.mm.model.r.YM())
        {
          g.RQ();
          g.RO().eJo.a(new a(), 0);
        }
        else
        {
          g.RQ();
          localObject = g.RO().eJo;
          if (Hq(paramuq.cQP.scene));
          for (i = paramuq.cQP.scene; ; i = 0)
          {
            ((p)localObject).a(new com.tencent.mm.plugin.wallet_core.c.y(null, i), 0);
            break;
          }
        }
      }
      else
      {
        localObject = r.cPI();
        l = bo.fp(((ak)localObject).tDa);
        ab.i("MicroMsg.WalletUserInfoManger", "dead time : %d, nowSec: %d, pass time ".concat(String.valueOf(l)), new Object[] { Long.valueOf(((ak)localObject).tDa), Long.valueOf(System.currentTimeMillis() / 1000L) });
        if (l > 0L)
          i = 1;
        while (true)
          if (i != 0)
          {
            ab.i("MicroMsg.WalletGetUserInfoEventListener", "data is checkTimeOut, do NetSceneTenpayQueryBoundBankcard");
            if (com.tencent.mm.model.r.YM())
            {
              g.RQ();
              g.RO().eJo.a(new a(), 0);
              break;
              i = 0;
              continue;
            }
            g.RQ();
            localObject = g.RO().eJo;
            if (Hq(paramuq.cQP.scene));
            for (i = paramuq.cQP.scene; ; i = 0)
            {
              ((p)localObject).a(new com.tencent.mm.plugin.wallet_core.c.y(null, i), 0);
              break;
            }
          }
        this.mru = true;
        ab.i("MicroMsg.WalletGetUserInfoEventListener", "data is ok. doCallback");
        a(0, "", null, false);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46906);
    ab.i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, errType: %s, errCode: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramm });
    if (((paramm instanceof com.tencent.mm.plugin.wallet_core.c.y)) || ((paramm instanceof a)))
    {
      g.RQ();
      g.RO().eJo.b(385, this);
      g.RQ();
      g.RO().eJo.b(1518, this);
      if ((!this.cQS) && (this.cQR) && (this.mru))
      {
        ab.i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, useCache and event end");
        AppMethodBeat.o(46906);
      }
    }
    while (true)
    {
      return;
      this.mru = true;
      a(paramInt2, paramString, paramm, true);
      AppMethodBeat.o(46906);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.y
 * JD-Core Version:    0.6.2
 */
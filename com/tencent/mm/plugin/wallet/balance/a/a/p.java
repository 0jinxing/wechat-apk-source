package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.protocal.protobuf.azb;
import com.tencent.mm.protocal.protobuf.bfg;
import com.tencent.mm.protocal.protobuf.oq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.FileSystem.a;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;

public final class p
{
  public static final p tfu;
  private static final String tfv;
  private static final String tfw;
  private static final String tfx;
  public azb tfi;
  public azb tfj;
  private long tfk;
  private long tfl;
  private List<Bankcard> tfm;
  private List<Bankcard> tfn;
  private ReentrantLock tfo;
  public String tfp;
  public String tfq;
  public String tfr;
  public int tfs;
  public Vector<p.a> tft;

  static
  {
    AppMethodBeat.i(45260);
    tfu = new p();
    tfv = b.eSn + "wallet/lqt";
    tfw = tfv + "/save/";
    tfx = tfv + "/fetch/";
    AppMethodBeat.o(45260);
  }

  public p()
  {
    AppMethodBeat.i(45248);
    this.tfo = new ReentrantLock();
    this.tft = new Vector();
    AppMethodBeat.o(45248);
  }

  public static List<Bankcard> Ha(int paramInt)
  {
    AppMethodBeat.i(45256);
    Object localObject1 = tfu;
    boolean bool;
    Object localObject2;
    if (paramInt == 1)
    {
      bool = true;
      localObject2 = ((p)localObject1).mJ(bool);
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((List)localObject2).size() != 0);
      }
      else
      {
        s.cNC();
        localObject1 = s.cND().cQF();
      }
      localObject2 = new LinkedList();
      if (localObject1 != null)
        localObject1 = ((List)localObject1).iterator();
    }
    else
    {
      while (true)
      {
        if (!((Iterator)localObject1).hasNext())
          break label190;
        Bankcard localBankcard = (Bankcard)((Iterator)localObject1).next();
        if (localBankcard.cPc())
        {
          s.cNC();
          if (!s.cND().cQi())
          {
            ((List)localObject2).add(localBankcard);
            continue;
            bool = false;
            break;
          }
        }
        if ((paramInt == 1) && ((localBankcard.field_support_lqt_turn_in == 1) || (localBankcard.cPc())))
          ((List)localObject2).add(localBankcard);
        if ((paramInt == 2) && ((localBankcard.field_support_lqt_turn_out == 1) || (localBankcard.cPc())))
          ((List)localObject2).add(localBankcard);
      }
    }
    label190: AppMethodBeat.o(45256);
    return localObject2;
  }

  private List<Bankcard> mK(boolean paramBoolean)
  {
    AppMethodBeat.i(45257);
    azb localazb;
    if (paramBoolean)
      localazb = this.tfi;
    while (true)
    {
      try
      {
        this.tfo.lock();
        if (localazb == null)
        {
          if (paramBoolean)
          {
            this.tfm = null;
            this.tfo.unlock();
            AppMethodBeat.o(45257);
            localazb = null;
            return localazb;
            localazb = this.tfj;
            continue;
          }
          this.tfn = null;
          continue;
        }
      }
      finally
      {
        this.tfo.unlock();
        AppMethodBeat.o(45257);
      }
      Object localObject2;
      if (paramBoolean)
      {
        if ((this.tfm != null) && (this.tfm.size() > 0))
        {
          localObject2 = this.tfm;
          this.tfo.unlock();
          AppMethodBeat.o(45257);
        }
      }
      else if ((this.tfn != null) && (this.tfn.size() > 0))
      {
        localObject2 = this.tfn;
        this.tfo.unlock();
        AppMethodBeat.o(45257);
      }
      else
      {
        Object localObject3;
        if (paramBoolean)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          this.tfm = ((List)localObject2);
          if (this.tfi.wCQ != null)
          {
            localObject2 = af.a(this.tfi.wCQ);
            if (localObject2 != null)
              this.tfm.add(localObject2);
          }
          if ((this.tfi.wmz != null) && (this.tfi.wmz.size() > 0))
          {
            localObject3 = this.tfi.wmz.iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject2 = com.tencent.mm.plugin.wallet_core.model.d.a((oq)((Iterator)localObject3).next());
              if (localObject2 != null)
                this.tfm.add(localObject2);
            }
          }
          localObject2 = this.tfm;
          this.tfo.unlock();
          AppMethodBeat.o(45257);
        }
        else
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          this.tfn = ((List)localObject2);
          if (this.tfj.wCQ != null)
          {
            localObject2 = af.a(this.tfj.wCQ);
            if (localObject2 != null)
              this.tfn.add(localObject2);
          }
          if ((this.tfj.wmz != null) && (this.tfj.wmz.size() > 0))
          {
            localObject2 = this.tfj.wmz.iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = com.tencent.mm.plugin.wallet_core.model.d.a((oq)((Iterator)localObject2).next());
              if (localObject3 != null)
                this.tfn.add(localObject3);
            }
          }
          localObject2 = this.tfn;
          this.tfo.unlock();
          AppMethodBeat.o(45257);
        }
      }
    }
  }

  private void mM(boolean paramBoolean)
  {
    AppMethodBeat.i(45259);
    String str;
    Object localObject1;
    if (paramBoolean)
    {
      str = tfw;
      localObject1 = e.cl(str, false);
      if ((localObject1 != null) && (((List)localObject1).size() != 0))
        break label45;
      AppMethodBeat.o(45259);
    }
    while (true)
    {
      return;
      str = tfx;
      break;
      label45: ab.i("MicroMsg.LqtBindQueryInfoCache", "tryLoadCacheFromDisk: %s, save: %s", new Object[] { localObject1, Boolean.valueOf(paramBoolean) });
      long l1 = System.currentTimeMillis();
      Iterator localIterator = ((List)localObject1).iterator();
      while (true)
      {
        while (true)
        {
          if (!localIterator.hasNext())
            break label329;
          localObject1 = ((FileSystem.a)localIterator.next()).name;
          Object localObject2 = str + (String)localObject1;
          long l2 = bo.getLong((String)localObject1, 0L);
          ab.i("MicroMsg.LqtBindQueryInfoCache", "file name: %s", new Object[] { Long.valueOf(l2) });
          if (l2 <= 0L)
            break label320;
          if (l1 - l2 < 3600000L)
          {
            localObject2 = e.e((String)localObject2, 0, -1);
            localObject1 = new azb();
            try
            {
              ((azb)localObject1).parseFrom((byte[])localObject2);
              if (localObject1 != null)
              {
                this.tfo.lock();
                if (paramBoolean)
                {
                  this.tfi = ((azb)localObject1);
                  this.tfm = null;
                  this.tfk = l2;
                  this.tfo.unlock();
                  ab.i("MicroMsg.LqtBindQueryInfoCache", "succ get saveCache: %s %s", new Object[] { localObject1, Long.valueOf(l2) });
                  AppMethodBeat.o(45259);
                }
              }
            }
            catch (IOException localIOException)
            {
              while (true)
              {
                localObject1 = null;
                ab.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", localIOException, "parse bindquery from cache error: %s", new Object[] { localIOException.getMessage() });
                continue;
                this.tfj = ((azb)localObject1);
                this.tfn = null;
                this.tfl = l2;
              }
            }
          }
        }
        e.deleteFile(localIOException);
        continue;
        label320: e.deleteFile(localIOException);
      }
      label329: AppMethodBeat.o(45259);
    }
  }

  public final void a(azb paramazb, boolean paramBoolean)
  {
    AppMethodBeat.i(45249);
    if (paramazb != null)
    {
      this.tfo.lock();
      if (!paramBoolean)
        break label109;
      this.tfi = paramazb;
      this.tfm = null;
      this.tfk = System.currentTimeMillis();
    }
    while (true)
    {
      this.tfo.unlock();
      ab.i("MicroMsg.LqtBindQueryInfoCache", "setCache: %s, save: %s", new Object[] { paramazb, Boolean.valueOf(paramBoolean) });
      try
      {
        byte[] arrayOfByte = paramazb.toByteArray();
        paramazb = new com/tencent/mm/plugin/wallet/balance/a/a/p$2;
        paramazb.<init>(this, arrayOfByte, paramBoolean);
        com.tencent.mm.sdk.g.d.post(paramazb, "LqtBindQueryInfoCache_saveCacheToDiski");
        al.d(new p.1(this));
        AppMethodBeat.o(45249);
        return;
        label109: this.tfj = paramazb;
        this.tfn = null;
        this.tfl = System.currentTimeMillis();
      }
      catch (Exception paramazb)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", paramazb, "saveCacheToDisk error: %s", new Object[] { paramazb.getMessage() });
      }
    }
  }

  public final void a(bfg parambfg)
  {
    this.tfp = parambfg.tfp;
    this.tfq = parambfg.tfq;
    this.tfr = parambfg.tfr;
    this.tfs = parambfg.tfs;
  }

  public final Bankcard cMF()
  {
    AppMethodBeat.i(45252);
    mL(true);
    Object localObject = this.tfi;
    if (localObject != null)
    {
      localObject = af.a(((azb)localObject).wCQ);
      AppMethodBeat.o(45252);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(45252);
    }
  }

  public final String cMG()
  {
    AppMethodBeat.i(45254);
    mL(true);
    Object localObject = this.tfi;
    if (localObject != null)
    {
      localObject = ((azb)localObject).wCU;
      AppMethodBeat.o(45254);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(45254);
    }
  }

  public final int cMH()
  {
    AppMethodBeat.i(45255);
    mL(true);
    azb localazb = this.tfi;
    int i;
    if (localazb != null)
    {
      i = localazb.wCV;
      AppMethodBeat.o(45255);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(45255);
    }
  }

  public final boolean mH(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(45250);
    mL(paramBoolean);
    azb localazb;
    if (paramBoolean)
    {
      localazb = this.tfi;
      if (localazb == null)
        break label69;
      ab.i("MicroMsg.LqtBindQueryInfoCache", "isReqAgainAfterDeal: %s", new Object[] { Boolean.valueOf(localazb.wCS) });
      paramBoolean = localazb.wCS;
      AppMethodBeat.o(45250);
    }
    while (true)
    {
      return paramBoolean;
      localazb = this.tfj;
      break;
      label69: AppMethodBeat.o(45250);
      paramBoolean = bool;
    }
  }

  public final Bankcard mI(boolean paramBoolean)
  {
    AppMethodBeat.i(45251);
    mL(paramBoolean);
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = this.tfi;
      if ((localObject1 == null) || (bo.isNullOrNil(((azb)localObject1).wCO)))
        break label125;
      Object localObject2 = mK(paramBoolean);
      if ((localObject2 == null) || (((List)localObject2).size() <= 0))
        break label125;
      String str = ((azb)localObject1).wCO;
      if (bo.isNullOrNil(str))
        break label125;
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (Bankcard)((Iterator)localObject2).next();
        if ((localObject1 != null) && (str.equals(((Bankcard)localObject1).field_bindSerial)))
          AppMethodBeat.o(45251);
      }
    }
    while (true)
    {
      return localObject1;
      localObject1 = this.tfj;
      break;
      label125: localObject1 = null;
      AppMethodBeat.o(45251);
    }
  }

  public final List<Bankcard> mJ(boolean paramBoolean)
  {
    AppMethodBeat.i(45253);
    mL(paramBoolean);
    Object localObject;
    if (paramBoolean)
    {
      localObject = this.tfi;
      if (localObject == null)
        break label46;
      localObject = mK(paramBoolean);
      AppMethodBeat.o(45253);
    }
    while (true)
    {
      return localObject;
      localObject = this.tfj;
      break;
      label46: localObject = null;
      AppMethodBeat.o(45253);
    }
  }

  public final void mL(boolean paramBoolean)
  {
    AppMethodBeat.i(45258);
    long l1 = System.currentTimeMillis();
    azb localazb;
    long l2;
    if (paramBoolean)
    {
      localazb = this.tfi;
      if (!paramBoolean)
        break label89;
      l2 = this.tfk;
      label30: if (localazb != null)
      {
        if (l1 - l2 <= 3600000L)
          break label73;
        ab.i("MicroMsg.LqtBindQueryInfoCache", "checkCache, saveCache time exceed, try reload from disk");
        this.tfi = null;
        if (!paramBoolean)
          break label98;
        this.tfk = 0L;
      }
    }
    while (true)
    {
      mM(paramBoolean);
      label73: AppMethodBeat.o(45258);
      return;
      localazb = this.tfj;
      break;
      label89: l2 = this.tfl;
      break label30;
      label98: this.tfl = 0L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.p
 * JD-Core Version:    0.6.2
 */
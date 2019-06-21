package com.tencent.mm.plugin.mall.a;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.plugin.wallet_core.model.mall.d;
import com.tencent.mm.plugin.wallet_core.model.w;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class j
  implements f, at
{
  private ak mHandler;
  ConcurrentHashMap<Integer, w> ola;
  private boolean olb;
  private bz.a olc;
  private bz.a old;

  public j()
  {
    AppMethodBeat.i(43120);
    this.ola = new ConcurrentHashMap();
    this.mHandler = new ak(Looper.getMainLooper());
    this.olb = false;
    this.olc = new bz.a()
    {
      public final void a(e.a paramAnonymousa)
      {
        AppMethodBeat.i(43117);
        paramAnonymousa = aa.a(paramAnonymousa.eAB.vED);
        ab.d("MicroMsg.SubCoreMall", "WalletNotifyConfXml:".concat(String.valueOf(paramAnonymousa)));
        j.a(j.this).post(new j.1.1(this, paramAnonymousa));
        AppMethodBeat.o(43117);
      }
    };
    this.old = new j.2(this);
    AppMethodBeat.o(43120);
  }

  public static j bMV()
  {
    AppMethodBeat.i(43121);
    j localj = (j)q.Y(j.class);
    AppMethodBeat.o(43121);
    return localj;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(43124);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("mallactivity", this.olc, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("paymsg", this.old, true);
    c.cQT().Kh();
    d.cQX().Kh();
    if ((com.tencent.mm.model.r.YM()) && (com.tencent.mm.model.r.YI()))
      com.tencent.mm.plugin.wallet_core.model.mall.b.Hs(com.tencent.mm.plugin.wallet_core.model.mall.b.tDs);
    while (true)
    {
      g.RQ();
      g.RO().eJo.a(302, this);
      AppMethodBeat.o(43124);
      return;
      com.tencent.mm.plugin.wallet_core.model.mall.b.Hs(com.tencent.mm.plugin.wallet_core.model.mall.b.tDr);
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(43125);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("mallactivity", this.olc, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("paymsg", this.old, true);
    g.RQ();
    g.RO().eJo.b(302, this);
    AppMethodBeat.o(43125);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(43126);
    if ((paramInt2 == 0) && (paramInt1 == 0) && (!this.olb) && (com.tencent.mm.model.r.YM()))
    {
      this.olb = true;
      com.tencent.mm.plugin.wallet_core.model.mall.b.Hs(com.tencent.mm.plugin.wallet_core.model.mall.b.tDs);
    }
    AppMethodBeat.o(43126);
  }

  public final w yl(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(43122);
    Object localObject3;
    if (!this.ola.contains(Integer.valueOf(paramInt)))
    {
      localObject3 = com.tencent.mm.plugin.wallet_core.model.r.cPN();
      String str = "select * from WalletFunciontList where wallet_region = ".concat(String.valueOf(paramInt));
      localObject3 = ((com.tencent.mm.plugin.wallet_core.d.e)localObject3).bSd.a(str, null, 2);
      ab.i("MicroMsg.WalletFunctionListStg", "getWalletFunciontListInfo ".concat(String.valueOf(str)));
      if (localObject3 != null)
        break label126;
      if (localObject2 != null)
        this.ola.put(Integer.valueOf(paramInt), localObject2);
    }
    localObject2 = (w)this.ola.get(Integer.valueOf(paramInt));
    if (localObject2 == null)
    {
      localObject2 = new w();
      AppMethodBeat.o(43122);
    }
    while (true)
    {
      return localObject2;
      label126: localObject2 = localObject1;
      if (((Cursor)localObject3).moveToNext())
      {
        localObject2 = new w();
        ((w)localObject2).d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
      break;
      AppMethodBeat.o(43122);
    }
  }

  public final ArrayList<MallFunction> ym(int paramInt)
  {
    AppMethodBeat.i(43123);
    ArrayList localArrayList = yl(paramInt).okP;
    AppMethodBeat.o(43123);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.j
 * JD-Core Version:    0.6.2
 */
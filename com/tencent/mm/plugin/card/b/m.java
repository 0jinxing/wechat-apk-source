package com.tencent.mm.plugin.card.b;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.plugin.card.model.v;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class m
  implements f, b.a
{
  private ak handler;
  public Map<String, Set<m.a>> kbO;
  public HashMap<String, String> kbP;
  private String kbQ;
  public v kbR;

  public m()
  {
    AppMethodBeat.i(87760);
    this.kbO = new HashMap();
    this.kbP = new HashMap();
    g.RO().eJo.a(563, this);
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(87760);
  }

  private void a(String paramString, boolean paramBoolean, ArrayList<od> paramArrayList)
  {
    AppMethodBeat.i(87762);
    this.handler.post(new m.1(this, paramString, paramBoolean, paramArrayList));
    AppMethodBeat.o(87762);
  }

  public final void a(String paramString, m.a arg2)
  {
    AppMethodBeat.i(87761);
    try
    {
      label45: synchronized (this.kbO)
      {
        if (this.kbO.get(paramString) != null)
          ((Set)this.kbO.get(paramString)).remove(???);
      }
      synchronized (this.kbP)
      {
        this.kbP.remove(paramString);
        AppMethodBeat.o(87761);
        return;
        paramString = finally;
        AppMethodBeat.o(87761);
        throw paramString;
      }
    }
    catch (Exception )
    {
      break label45;
    }
  }

  public final boolean a(String paramString1, String paramString2, m.a arg3)
  {
    AppMethodBeat.i(87763);
    ab.d("MicroMsg.CardShopLBSManager", "getShopList, cardTpId = %s, card_id = %s", new Object[] { paramString1, paramString2 });
    this.kbQ = paramString1;
    synchronized (this.kbO)
    {
      if (!this.kbO.containsKey(paramString1))
      {
        Map localMap2 = this.kbO;
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        localMap2.put(paramString1, localHashSet);
      }
      if (!((Set)this.kbO.get(paramString1)).contains(???))
        ((Set)this.kbO.get(paramString1)).add(???);
    }
    while (true)
    {
      synchronized (this.kbP)
      {
        if (!TextUtils.isEmpty(paramString2))
          this.kbP.put(paramString1, paramString2);
        paramString1 = d.agz();
        if (paramString1 == null)
        {
          ab.e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
          i = 0;
          if (i != 0)
            break label224;
          ab.e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
          AppMethodBeat.o(87763);
          bool = false;
          return bool;
          paramString1 = finally;
          AppMethodBeat.o(87763);
          throw paramString1;
        }
      }
      paramString1.b(this);
      int i = 1;
      continue;
      label224: if (this.kbR != null)
        g.RO().eJo.c(this.kbR);
      AppMethodBeat.o(87763);
      boolean bool = true;
    }
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(87765);
    if (!paramBoolean)
    {
      paramBoolean = true;
      AppMethodBeat.o(87765);
    }
    while (true)
    {
      return paramBoolean;
      ??? = d.agz();
      if (??? != null)
        ((com.tencent.mm.modelgeo.b)???).c(this);
      ab.d("MicroMsg.CardShopLBSManager", "onGetLocation, fLongitude = %f, fLatitude = %f, locType = %d, speed = %f, accuracy = %f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt), Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
      synchronized (this.kbO)
      {
        Set localSet = (Set)this.kbO.get(this.kbQ);
        if ((localSet == null) || (localSet.size() == 0))
        {
          ab.e("MicroMsg.CardShopLBSManager", "onGetLocation, already cancelled, no need to doScene");
          paramBoolean = false;
          AppMethodBeat.o(87765);
        }
      }
    }
    while (true)
    {
      synchronized (this.kbP)
      {
        String str = (String)this.kbP.get(this.kbQ);
        ??? = new v(this.kbQ, paramFloat1, paramFloat2, str);
        if (g.RO().eJo.a((com.tencent.mm.ai.m)???, 0))
        {
          this.kbR = ((v)???);
          paramBoolean = true;
          AppMethodBeat.o(87765);
        }
      }
      ab.e("MicroMsg.CardShopLBSManager", "doScene fail, callback immediate");
      a(this.kbQ, false, null);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(87764);
    this.kbR = null;
    paramString = ((v)paramm).kea;
    ab.i("MicroMsg.CardShopLBSManager", "onSceneEnd, reqCardTpId = %s, errType = %d, errCode = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.CardShopLBSManager", "onSceneEnd, cardshoplbs fail");
      a(paramString, false, null);
      AppMethodBeat.o(87764);
      return;
    }
    paramm = ((v)paramm).keb;
    if (paramm == null);
    for (paramInt1 = 0; ; paramInt1 = paramm.size())
    {
      ab.d("MicroMsg.CardShopLBSManager", "onSceneEnd, respShopList size = %d", new Object[] { Integer.valueOf(paramInt1) });
      a(paramString, true, paramm);
      AppMethodBeat.o(87764);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.m
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf.6;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bbo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import java.util.List;

public final class f
{
  public static boolean aeA()
  {
    AppMethodBeat.i(11375);
    boolean bool;
    if (z.aeR().lf(16) > 0)
    {
      bool = true;
      AppMethodBeat.o(11375);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11375);
    }
  }

  public static boolean aeB()
  {
    AppMethodBeat.i(11376);
    boolean bool;
    if (z.aeR().lf(64) > 0)
    {
      bool = true;
      AppMethodBeat.o(11376);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11376);
    }
  }

  public static List<String> aeC()
  {
    AppMethodBeat.i(11377);
    List localList = z.aeR().le(128);
    AppMethodBeat.o(11377);
    return localList;
  }

  public static boolean aeD()
  {
    AppMethodBeat.i(11378);
    boolean bool;
    if (z.aeR().lf(128) > 0)
    {
      bool = true;
      AppMethodBeat.o(11378);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11378);
    }
  }

  public static List<String> aeE()
  {
    AppMethodBeat.i(11379);
    List localList = z.aeR().le(256);
    AppMethodBeat.o(11379);
    return localList;
  }

  public static boolean aeF()
  {
    AppMethodBeat.i(11380);
    boolean bool;
    if (z.aeR().lf(256) > 0)
    {
      bool = true;
      AppMethodBeat.o(11380);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11380);
    }
  }

  public static List<String> aeG()
  {
    AppMethodBeat.i(11381);
    List localList = z.aeR().le(512);
    AppMethodBeat.o(11381);
    return localList;
  }

  public static boolean aeH()
  {
    AppMethodBeat.i(11382);
    boolean bool;
    if (z.aeR().lf(512) > 0)
    {
      bool = true;
      AppMethodBeat.o(11382);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11382);
    }
  }

  public static boolean aex()
  {
    boolean bool = true;
    AppMethodBeat.i(11372);
    if (z.aeR().lf(1) > 0)
      AppMethodBeat.o(11372);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11372);
    }
  }

  public static boolean aey()
  {
    AppMethodBeat.i(11373);
    boolean bool;
    if (z.aeR().lf(4) > 0)
    {
      bool = true;
      AppMethodBeat.o(11373);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11373);
    }
  }

  public static boolean aez()
  {
    AppMethodBeat.i(11374);
    boolean bool;
    if (z.aeR().lf(8) > 0)
    {
      bool = true;
      AppMethodBeat.o(11374);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11374);
    }
  }

  public static void f(d paramd)
  {
    AppMethodBeat.i(11368);
    if (paramd == null)
    {
      ab.e("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession bizInfo is Null");
      AppMethodBeat.o(11368);
      return;
    }
    bbo localbbo = new bbo();
    localbbo.gvb = paramd.field_brandFlag;
    localbbo.jBB = paramd.field_username;
    ad localad = ((j)g.K(j.class)).XM().aoN(paramd.field_username);
    if ((localad != null) && (a.jh(localad.field_type)))
      ((j)g.K(j.class)).XL().c(new j.a(47, localbbo));
    while (true)
    {
      ab.i("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession ret = %b, BrandFlag = %b", new Object[] { Boolean.valueOf(z.aeR().c(paramd, new String[0])), Integer.valueOf(paramd.field_brandFlag) });
      AppMethodBeat.o(11368);
      break;
      ((j)g.K(j.class)).XL().c(new j.a(58, localbbo));
    }
  }

  public static void g(d paramd)
  {
    AppMethodBeat.i(11369);
    if (paramd != null)
    {
      bbo localbbo = new bbo();
      localbbo.gvb = paramd.field_brandFlag;
      localbbo.jBB = paramd.field_username;
      ((j)g.K(j.class)).XL().c(new j.a(47, localbbo));
      z.aeR().c(paramd, new String[0]);
    }
    AppMethodBeat.o(11369);
  }

  public static void h(d paramd)
  {
    AppMethodBeat.i(11370);
    if (paramd != null)
    {
      paramd.field_brandFlag |= 8;
      g(paramd);
    }
    AppMethodBeat.o(11370);
  }

  public static void i(d paramd)
  {
    AppMethodBeat.i(11371);
    if (paramd != null)
    {
      paramd.field_brandFlag &= -9;
      g(paramd);
    }
    AppMethodBeat.o(11371);
  }

  public static boolean kq(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11365);
    paramString = qX(paramString);
    if (paramString == null)
      AppMethodBeat.o(11365);
    while (true)
    {
      return bool;
      if (paramString.adR())
      {
        bool = true;
        AppMethodBeat.o(11365);
      }
      else
      {
        AppMethodBeat.o(11365);
      }
    }
  }

  public static d qX(String paramString)
  {
    AppMethodBeat.i(11359);
    paramString = z.aeR().qP(paramString);
    if (paramString.field_updateTime > 0L)
      AppMethodBeat.o(11359);
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(11359);
    }
  }

  public static boolean qY(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11360);
    paramString = qX(paramString);
    if (paramString == null)
      AppMethodBeat.o(11360);
    while (true)
    {
      return bool;
      if (paramString.adM())
      {
        bool = true;
        AppMethodBeat.o(11360);
      }
      else
      {
        AppMethodBeat.o(11360);
      }
    }
  }

  public static boolean qZ(String paramString)
  {
    AppMethodBeat.i(11361);
    paramString = qX(paramString);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(11361);
    }
    while (true)
    {
      return bool;
      bool = paramString.adN();
      AppMethodBeat.o(11361);
    }
  }

  public static boolean ra(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11362);
    paramString = qX(paramString);
    if (paramString == null)
      AppMethodBeat.o(11362);
    while (true)
    {
      return bool;
      if (paramString.adO())
      {
        bool = true;
        AppMethodBeat.o(11362);
      }
      else
      {
        AppMethodBeat.o(11362);
      }
    }
  }

  public static boolean rb(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11363);
    paramString = qX(paramString);
    if (paramString == null)
      AppMethodBeat.o(11363);
    while (true)
    {
      return bool;
      if (paramString.adQ())
      {
        bool = true;
        AppMethodBeat.o(11363);
      }
      else
      {
        AppMethodBeat.o(11363);
      }
    }
  }

  public static boolean rc(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11364);
    if (paramString == null)
      AppMethodBeat.o(11364);
    while (true)
    {
      return bool;
      paramString = qX(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(11364);
      }
      else if (paramString.adP())
      {
        bool = true;
        AppMethodBeat.o(11364);
      }
      else
      {
        AppMethodBeat.o(11364);
      }
    }
  }

  public static boolean rd(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11366);
    paramString = qX(paramString);
    if (paramString == null)
      AppMethodBeat.o(11366);
    while (true)
    {
      return bool;
      if (paramString.adS())
      {
        bool = true;
        AppMethodBeat.o(11366);
      }
      else
      {
        AppMethodBeat.o(11366);
      }
    }
  }

  public static boolean re(String paramString)
  {
    AppMethodBeat.i(11367);
    paramString = qX(paramString);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(11367);
    }
    while (true)
    {
      return bool;
      bool = paramString.adH();
      AppMethodBeat.o(11367);
    }
  }

  public static void rf(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(11383);
    z.aeR();
    String str = e.qT(paramString);
    if (str != null)
      ((o)g.K(o.class)).XP().Rh(str);
    ((j)g.K(j.class)).XR().aoX(paramString);
    d locald = qX(paramString);
    if (locald == null)
    {
      z.afa().pI(paramString);
      AppMethodBeat.o(11383);
    }
    while (true)
    {
      return;
      if (locald.adP())
      {
        ((j)g.K(j.class)).XR().apq(paramString);
        z.aeR();
        List localList = e.qS(paramString);
        if ((localList == null) || (localList.size() <= 0))
          ab.d("MicroMsg.MsgInfoStorageLogic", "deleteMsgByTalkers, empty talkers");
        while (i < localList.size())
        {
          str = (String)localList.get(i);
          if (kq(str))
            com.tencent.mm.aj.a.e.G(str, true);
          z.aeR().delete(str);
          i++;
          continue;
          ab.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalkers stack[%s]", new Object[] { bo.dpG() });
          com.tencent.mm.sdk.g.d.post(new bf.6(localList), "deleteMsgByTalkers");
        }
      }
      if (locald.adR())
        com.tencent.mm.aj.a.e.G(paramString, true);
      z.aeR().c(locald);
      z.afa().pI(paramString);
      AppMethodBeat.o(11383);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.f
 * JD-Core Version:    0.6.2
 */
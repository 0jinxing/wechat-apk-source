package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.ata;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.cbb;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m
{
  private static final ThreadLocal<HashMap<String, Long>> qHb;

  static
  {
    AppMethodBeat.i(35898);
    qHb = new ThreadLocal();
    AppMethodBeat.o(35898);
  }

  public static boolean Xx(String paramString)
  {
    AppMethodBeat.i(35892);
    paramString = af.cnF().YT(paramString);
    boolean bool = a(paramString, aj.q(paramString));
    AppMethodBeat.o(35892);
    return bool;
  }

  public static boolean a(n paramn, cbf paramcbf)
  {
    AppMethodBeat.i(35894);
    boolean bool;
    if (paramn == null)
    {
      AppMethodBeat.o(35894);
      bool = true;
    }
    while (true)
    {
      return bool;
      bav localbav = paramn.cqM();
      if (paramn.field_type != 21)
      {
        AppMethodBeat.o(35894);
        bool = true;
      }
      else if (localbav.cRU == 1)
      {
        AppMethodBeat.o(35894);
        bool = true;
      }
      else if (r.Yz().equals(paramn.field_userName))
      {
        AppMethodBeat.o(35894);
        bool = true;
      }
      else if (paramcbf.xaE != null)
      {
        paramcbf = paramcbf.xaE.xbh;
        if ((paramcbf == null) || (paramcbf.size() == 0))
        {
          AppMethodBeat.o(35894);
          bool = false;
        }
        else
        {
          paramn = r.Yz();
          paramcbf = paramcbf.iterator();
          while (true)
            if (paramcbf.hasNext())
              if (paramn.equals(((cbb)paramcbf.next()).vHl))
              {
                AppMethodBeat.o(35894);
                bool = true;
                break;
              }
        }
      }
      else
      {
        AppMethodBeat.o(35894);
        bool = false;
      }
    }
  }

  public static long b(n paramn, cbf paramcbf)
  {
    long l = 0L;
    AppMethodBeat.i(35897);
    if (paramn == null)
      AppMethodBeat.o(35897);
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return l;
      localObject1 = paramcbf;
      if (paramcbf == null)
        localObject1 = aj.q(paramn);
      if (localObject1 == null)
      {
        AppMethodBeat.o(35897);
      }
      else
      {
        paramcbf = ((cbf)localObject1).xaE;
        if (paramcbf == null)
        {
          AppMethodBeat.o(35897);
        }
        else
        {
          localObject2 = paramcbf.xbh;
          if (localObject2 != null)
            break;
          AppMethodBeat.o(35897);
        }
      }
    }
    paramcbf = paramn.reW;
    if (bo.isNullOrNil(paramcbf));
    for (paramn = g.x(paramn.field_content) + g.x(paramn.field_attrBuf); ; paramn = paramcbf)
    {
      localObject1 = (HashMap)qHb.get();
      if ((localObject1 != null) && (((HashMap)localObject1).containsKey(paramn)))
      {
        l = ((Long)((HashMap)localObject1).get(paramn)).longValue();
        AppMethodBeat.o(35897);
        break;
      }
      localObject2 = ((List)localObject2).iterator();
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          cbb localcbb = (cbb)((Iterator)localObject2).next();
          paramcbf = new ata();
          try
          {
            paramcbf.parseFrom(aa.a(localcbb.wZK));
            l += paramcbf.cSh;
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicrMsg.SnsLuckyUtil", localException.getMessage() + "hbBuffer is error");
          }
        }
      paramcbf = (cbf)localObject1;
      if (localObject1 == null)
        paramcbf = new HashMap();
      paramcbf.put(paramn, Long.valueOf(l));
      qHb.set(paramcbf);
      AppMethodBeat.o(35897);
      break;
    }
  }

  public static boolean k(n paramn)
  {
    AppMethodBeat.i(35893);
    boolean bool = a(paramn, aj.q(paramn));
    AppMethodBeat.o(35893);
    return bool;
  }

  public static int l(n paramn)
  {
    int i = 0;
    AppMethodBeat.i(35895);
    if (paramn == null)
      AppMethodBeat.o(35895);
    while (true)
    {
      return i;
      paramn = aj.q(paramn);
      if (paramn == null)
      {
        AppMethodBeat.o(35895);
      }
      else
      {
        paramn = paramn.xaE;
        if ((paramn == null) || (paramn.xbh.size() == 0))
        {
          AppMethodBeat.o(35895);
        }
        else
        {
          i = paramn.xbh.size();
          AppMethodBeat.o(35895);
        }
      }
    }
  }

  public static long m(n paramn)
  {
    AppMethodBeat.i(35896);
    long l = b(paramn, null);
    AppMethodBeat.o(35896);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.a.m
 * JD-Core Version:    0.6.2
 */
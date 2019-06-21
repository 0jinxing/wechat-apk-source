package com.tencent.mm.pluginsdk.wallet;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.va;
import com.tencent.mm.g.a.va.b;
import com.tencent.mm.g.a.vb;
import com.tencent.mm.g.a.vb.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static String akq(String paramString)
  {
    AppMethodBeat.i(70469);
    Object localObject = ((j)g.K(j.class)).bOr().Rx(paramString);
    int i;
    int j;
    int k;
    if (localObject != null)
    {
      ab.i("MicroMsg.WalletConvDelCheckLogic", "checkUnProcessWalletMsgCount, msgInfoList size: %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      Iterator localIterator = ((List)localObject).iterator();
      i = 0;
      j = 0;
      k = 0;
      while (localIterator.hasNext())
      {
        localObject = (bi)localIterator.next();
        if (!am((bi)localObject))
          break label338;
        if (((bi)localObject).getType() == 419430449)
        {
          i++;
        }
        else
        {
          if (((bi)localObject).getType() != 436207665)
            break label338;
          localObject = ((cy)localObject).field_content;
          if (localObject == null)
            break label341;
        }
      }
    }
    label338: label341: for (localObject = j.b.me((String)localObject); ; localObject = null)
    {
      if (localObject != null)
      {
        if ("1001".equals(((j.b)localObject).fhY))
        {
          j++;
          break;
        }
        k++;
      }
      while (true)
      {
        break;
        if ((k > 0) || (j > 0) || (i > 0))
          if (t.kH(paramString))
          {
            paramString = ah.getContext().getString(2131304776, new Object[] { Integer.valueOf(j) });
            AppMethodBeat.o(70469);
          }
        while (true)
        {
          return paramString;
          if ((k > 0) && (i <= 0))
          {
            paramString = ah.getContext().getString(2131304778, new Object[] { Integer.valueOf(k) });
            AppMethodBeat.o(70469);
          }
          else if ((i > 0) && (k <= 0))
          {
            paramString = ah.getContext().getString(2131304779, new Object[] { Integer.valueOf(i) });
            AppMethodBeat.o(70469);
          }
          else if ((i > 0) && (k > 0))
          {
            paramString = ah.getContext().getString(2131304777, new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
            AppMethodBeat.o(70469);
          }
          else
          {
            AppMethodBeat.o(70469);
            paramString = null;
          }
        }
      }
    }
  }

  public static boolean am(bi parambi)
  {
    Object localObject1 = null;
    AppMethodBeat.i(70470);
    if (parambi.getType() == 419430449)
    {
      if (parambi.field_isSend != 0)
        break label342;
      localObject1 = parambi.field_content;
      if (localObject1 == null)
        break label360;
    }
    label342: label353: label360: for (parambi = j.b.X((String)localObject1, parambi.field_reserved); ; parambi = null)
    {
      int j;
      boolean bool;
      if (parambi != null)
      {
        localObject1 = new vb();
        ((vb)localObject1).cRW.cEa = parambi.fhy;
        a.xxA.m((b)localObject1);
        i = ((vb)localObject1).cRX.status;
        j = i;
        if (i <= 0)
          j = parambi.fhv;
        if ((j >= 0) && ((j == 1) || (j == 7)))
        {
          AppMethodBeat.o(70470);
          Object localObject2;
          for (bool = true; ; bool = true)
          {
            return bool;
            if ((parambi.getType() != 436207665) || (parambi.field_isSend != 0))
              break label342;
            localObject2 = parambi.field_content;
            if (localObject2 != null)
              localObject1 = j.b.me((String)localObject2);
            if (localObject1 == null)
              break label342;
            if (("1001".equals(((j.b)localObject1).fhY)) || (t.kH(parambi.field_talker)))
              break;
            parambi = new va();
            if (bo.isNullOrNil(((j.b)localObject1).fhZ))
              break label342;
            parambi.cRQ.cRS = ((j.b)localObject1).fhZ;
            a.xxA.m(parambi);
            if (parambi.cRR.cRV != 0)
              break label342;
            AppMethodBeat.o(70470);
          }
          if (t.kH(parambi.field_talker))
          {
            parambi = r.Yz();
            if (bo.ek(((j.b)localObject1).fio))
              break label353;
            localObject1 = ((j.b)localObject1).fio.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = ((String)((Iterator)localObject1).next()).split(",");
              if ((localObject2.length == 3) && (localObject2[0].equals(parambi)))
                j = bo.getInt(localObject2[2], -1);
            }
          }
        }
      }
      for (int i = 1; ; i = 0)
      {
        if ((i != 0) && (j == 1))
        {
          AppMethodBeat.o(70470);
          bool = true;
          break;
        }
        AppMethodBeat.o(70470);
        bool = false;
        break;
        j = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.wallet.e
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.a.o;
import com.tencent.mm.plugin.offline.c.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public final class e extends a<b>
{
  public String oWS;
  private i.a oWT;

  public e()
  {
    AppMethodBeat.i(43305);
    this.oWS = "";
    this.oWT = new e.1(this);
    k.bXg();
    if (k.bXj() != null)
    {
      k.bXg();
      k.bXj().oXw = this.oWT;
    }
    AppMethodBeat.o(43305);
  }

  private static void bWX()
  {
    AppMethodBeat.i(43306);
    k.bXg();
    k.bXj().eP(1, 1);
    AppMethodBeat.o(43306);
  }

  private static void bWY()
  {
    AppMethodBeat.i(43307);
    k.bXg();
    k.bXj().Av(2);
    AppMethodBeat.o(43307);
  }

  public static int bWZ()
  {
    AppMethodBeat.i(43311);
    k.bXg();
    k.bXj();
    int i = i.bXf();
    AppMethodBeat.o(43311);
    return i;
  }

  private static void c(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    AppMethodBeat.i(43308);
    paramString = new o(paramInt1, paramInt2, paramInt3, paramString);
    g.RQ();
    g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(43308);
  }

  public final void aVU()
  {
    AppMethodBeat.i(43304);
    if (this.oWP == null)
      AppMethodBeat.o(43304);
    while (true)
    {
      return;
      for (int i = 0; i < this.oWP.size(); i++)
      {
        Object localObject = (WeakReference)this.oWP.get(i);
        if (localObject != null)
        {
          localObject = (b)((WeakReference)localObject).get();
          if (localObject != null)
            ((b)localObject).bap();
        }
      }
      AppMethodBeat.o(43304);
    }
  }

  public final String q(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(43309);
    ab.i("MicroMsg.OfflineCodesMgr", "generatetKey scene %s isSnapshot %s stack: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), bo.dpG().toString() });
    paramString = r(paramInt1, paramInt2, paramString);
    AppMethodBeat.o(43309);
    return paramString;
  }

  public final String r(int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(43310);
    int j = bWZ();
    Object localObject;
    if (j > 0)
    {
      if (j < k.oXL)
      {
        ab.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount < %s", new Object[] { Integer.valueOf(k.oXL) });
        bWY();
      }
      k.bXg();
      localObject = k.Ax(196617);
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        ab.e("MicroMsg.OfflineCodesMgr", "generateKey_V3 cn is null, the csr is not exist! cn:".concat(String.valueOf(localObject)));
        paramString = "";
        AppMethodBeat.o(43310);
      }
    }
    while (true)
    {
      return paramString;
      com.tencent.mm.wallet_core.c.b.dNJ();
      localObject = com.tencent.mm.wallet_core.c.b.getToken((String)localObject);
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        bWX();
        ab.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null");
        paramString = "";
        AppMethodBeat.o(43310);
        continue;
        paramString = h.pYm;
        if (com.tencent.mm.plugin.offline.c.a.eA(ah.getContext()))
        {
          paramInt1 = 0;
          label148: paramInt2 = i;
          if (at.isNetworkConnected(ah.getContext()))
            paramInt2 = 1;
          paramString.e(14163, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          h.pYm.a(135L, 29L, 1L, true);
          if (!at.isNetworkConnected(ah.getContext()))
            break label257;
          h.pYm.a(135L, 31L, 1L, true);
        }
        while (true)
        {
          bWX();
          ab.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount is 0");
          paramString = "";
          AppMethodBeat.o(43310);
          break;
          paramInt1 = 1;
          break label148;
          label257: h.pYm.a(135L, 30L, 1L, true);
        }
      }
      else
      {
        if (localObject != null)
          ab.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code length : %s ext_business_attach %s %s", new Object[] { Integer.valueOf(((String)localObject).length()), paramString, localObject });
        c(j - 1, paramInt1, paramInt2, paramString);
        ab.i("MicroMsg.OfflineCodesMgr", "doNetSceneShowCode count " + (j - 1));
        paramString = com.tencent.mm.plugin.offline.c.a.Ug(com.tencent.mm.plugin.offline.c.a.bYs());
        if ((paramString != null) && (paramString.size() != 0))
          break;
        ab.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 cardList is null");
        bWX();
        paramString = "";
        AppMethodBeat.o(43310);
      }
    }
    long l1;
    long l2;
    if ((localObject != null) && (com.tencent.mm.plugin.offline.c.a.isNumeric((String)localObject)))
    {
      l1 = Long.valueOf((String)localObject, 10).longValue();
      l2 = 0L;
      paramInt1 = 0;
      label415: if (paramInt1 >= paramString.size())
        break label494;
      localObject = (a.a)paramString.get(paramInt1);
      if ((localObject == null) || (((a.a)localObject).pbo == null) || (!((a.a)localObject).pbo.equals(this.oWS)))
        break label659;
      l2 = ((a.a)localObject).pbm;
    }
    label529: label659: 
    while (true)
    {
      paramInt1++;
      break label415;
      ab.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null or is not isNumeric");
      paramString = "";
      AppMethodBeat.o(43310);
      break;
      label494: localObject = String.valueOf(l2 << 48 | l1);
      if (((String)localObject).length() == 15)
      {
        paramString = "0".concat(String.valueOf(localObject));
        if (TextUtils.isEmpty(com.tencent.mm.plugin.offline.c.a.bYu()))
          break label645;
      }
      for (paramString = com.tencent.mm.plugin.offline.c.a.bYu() + paramString; ; paramString = "12".concat(String.valueOf(paramString)))
      {
        AppMethodBeat.o(43310);
        break;
        if (((String)localObject).length() == 14)
        {
          paramString = "00".concat(String.valueOf(localObject));
          break label529;
        }
        if (((String)localObject).length() == 13)
        {
          paramString = "000".concat(String.valueOf(localObject));
          break label529;
        }
        paramString = (String)localObject;
        if (((String)localObject).length() != 12)
          break label529;
        paramString = "0000".concat(String.valueOf(localObject));
        break label529;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.e
 * JD-Core Version:    0.6.2
 */
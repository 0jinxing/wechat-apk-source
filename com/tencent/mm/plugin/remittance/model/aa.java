package com.tencent.mm.plugin.remittance.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.modelstat.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.remittance.b.d;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.HashMap;
import java.util.HashSet;

public final class aa
{
  public static String TAG = "MicroMsg.RemittanceLocalMsgMgr";
  public Object lock;
  public HashSet<String> pQC;
  public HashMap<String, String> pQD;

  public aa()
  {
    AppMethodBeat.i(44794);
    this.pQC = null;
    this.pQD = new HashMap();
    this.pQC = new HashSet();
    this.lock = new Object();
    AppMethodBeat.o(44794);
  }

  private boolean VP(String paramString)
  {
    try
    {
      AppMethodBeat.i(44796);
      boolean bool;
      if (!this.pQC.contains(paramString))
      {
        bool = this.pQC.add(paramString);
        AppMethodBeat.o(44796);
      }
      while (true)
      {
        return bool;
        ab.i(TAG, "it is a duplicate msg");
        bool = false;
        AppMethodBeat.o(44796);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final boolean VO(String paramString)
  {
    AppMethodBeat.i(44795);
    synchronized (this.lock)
    {
      boolean bool = this.pQC.contains(paramString);
      AppMethodBeat.o(44795);
      return bool;
    }
  }

  public final boolean Z(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(44798);
    boolean bool1;
    if ((TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3)) || (TextUtils.isEmpty(paramString1)))
    {
      ab.e(TAG, "msgxml or toUserName or antiRepeatid is null");
      AppMethodBeat.o(44798);
      bool1 = false;
    }
    bi localbi;
    long l;
    while (true)
    {
      return bool1;
      if (!VP(paramString1))
      {
        AppMethodBeat.o(44798);
        bool1 = false;
      }
      else
      {
        localbi = new bi();
        localbi.setContent(paramString2);
        localbi.setStatus(2);
        localbi.ju(paramString3);
        localbi.eJ(bf.oC(paramString3));
        localbi.hO(1);
        localbi.setType(419430449);
        l = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(localbi);
        if (l >= 0L)
          break;
        ab.e(TAG, com.tencent.mm.compatible.util.g.Mq() + "insert msg failed :" + l);
        this.pQC.remove(paramString1);
        AppMethodBeat.o(44798);
        bool1 = false;
      }
    }
    localbi.setMsgId(l);
    if (localbi.bAA())
    {
      b.fRa.a(localbi, com.tencent.mm.af.k.k(localbi));
      label222: paramString3 = new com.tencent.mm.af.j();
      paramString3.field_xml = localbi.field_content;
      paramString2 = bo.anj(paramString2);
      paramString1 = null;
      if (paramString2 != null)
      {
        paramString2 = j.b.X(paramString2, localbi.field_reserved);
        paramString1 = paramString2;
        if (paramString2 != null)
        {
          paramString3.field_title = paramString2.title;
          paramString3.field_description = paramString2.description;
          paramString1 = paramString2;
        }
      }
      paramString3.field_type = 2000;
      paramString3.field_msgId = l;
      paramString2 = a.bYK().ma(l);
      if ((paramString2 == null) || (paramString2.field_msgId != l))
        break label403;
      bool1 = a.bYK().c(paramString3, new String[0]);
    }
    while (true)
    {
      if (paramString1 != null)
      {
        paramString2 = new com.tencent.mm.plugin.remittance.b.c();
        paramString2.field_locaMsgId = localbi.field_msgId;
        paramString2.field_transferId = paramString1.fhy;
        paramString2.field_receiveStatus = -1;
        paramString2.field_isSend = true;
        com.tencent.mm.plugin.remittance.a.c.ceW();
        com.tencent.mm.plugin.remittance.a.c.ceY().a(paramString2);
      }
      AppMethodBeat.o(44798);
      break;
      b.fRa.j(localbi);
      break label222;
      label403: boolean bool2 = a.bYK().b(paramString3);
      bool1 = bool2;
      if (!bool2)
      {
        ab.e(TAG, "PinOpenApi.getAppMessageStorage().insert msg failed id:".concat(String.valueOf(l)));
        bool1 = bool2;
      }
    }
  }

  public final boolean fN(String paramString1, String paramString2)
  {
    AppMethodBeat.i(44797);
    String str = (String)this.pQD.get(paramString1);
    boolean bool;
    if (bo.isNullOrNil(str))
    {
      ab.w(TAG, "empty transid: %s", new Object[] { paramString1 });
      AppMethodBeat.o(44797);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = Z(paramString1, str, paramString2);
      AppMethodBeat.o(44797);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.aa
 * JD-Core Version:    0.6.2
 */
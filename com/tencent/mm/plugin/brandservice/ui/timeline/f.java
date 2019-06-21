package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.eu;
import com.tencent.mm.protocal.protobuf.ev;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
{
  int ctE;
  int jOd;
  int jOe;
  HashMap<String, f.a> jOf;

  public f(int paramInt)
  {
    AppMethodBeat.i(14174);
    this.jOf = new HashMap();
    this.ctE = paramInt;
    AppMethodBeat.o(14174);
  }

  static int a(q paramq, String paramString)
  {
    AppMethodBeat.i(14176);
    if ((paramq.field_appMsgStatInfoProto == null) || (bo.isNullOrNil(paramString)) || (bo.ek(paramq.field_appMsgStatInfoProto.vGJ)))
    {
      AppMethodBeat.o(14176);
      i = 0;
      return i;
    }
    paramq = paramq.field_appMsgStatInfoProto.vGJ.iterator();
    eu localeu;
    do
    {
      if (!paramq.hasNext())
        break;
      localeu = (eu)paramq.next();
    }
    while (!bo.isEqual(localeu.url, paramString));
    for (int i = localeu.vGI; ; i = 0)
    {
      AppMethodBeat.o(14176);
      break;
    }
  }

  static void a(f.a parama, String paramString)
  {
    AppMethodBeat.i(14177);
    if (((j)g.K(j.class)).XM().aoO(paramString).Oe())
    {
      parama.vNV = 1;
      parama.vNZ = 1;
      AppMethodBeat.o(14177);
    }
    while (true)
    {
      return;
      parama.vNV = 0;
      parama.vNZ = 0;
      AppMethodBeat.o(14177);
    }
  }

  public final void a(q paramq, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(14180);
    b.a("BrandServiceWorkerThread", new f.4(this, paramq, paramInt1, paramInt2, paramInt3), 0L);
    AppMethodBeat.o(14180);
  }

  public final void a(q paramq, boolean paramBoolean)
  {
    AppMethodBeat.i(14178);
    paramq = (f.a)this.jOf.get(Long.valueOf(paramq.field_msgId));
    if (paramq == null)
    {
      AppMethodBeat.o(14178);
      return;
    }
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      paramq.vNr = i;
      AppMethodBeat.o(14178);
      break;
    }
  }

  public final void a(String paramString, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(14182);
    int i = paramInt3;
    if (paramInt3 <= 0)
      i = (int)(System.currentTimeMillis() / 1000L);
    h.pYm.e(15721, new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(this.ctE), Integer.valueOf(paramInt1) });
    AppMethodBeat.o(14182);
  }

  public final void c(q paramq, int paramInt)
  {
    AppMethodBeat.i(14175);
    b.a("BrandServiceWorkerThread", new f.1(this, paramq, paramInt, paramq.field_status, paramq.field_isRead), 0L);
    AppMethodBeat.o(14175);
  }

  public final void d(q paramq, int paramInt)
  {
    AppMethodBeat.i(14179);
    a(paramq, 0, paramInt, -1);
    AppMethodBeat.o(14179);
  }

  public final void si(int paramInt)
  {
    AppMethodBeat.i(14181);
    a("", 0L, 0, paramInt, -1);
    AppMethodBeat.o(14181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.f
 * JD-Core Version:    0.6.2
 */
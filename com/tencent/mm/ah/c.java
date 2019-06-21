package com.tencent.mm.ah;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.auk;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public final class c
  implements com.tencent.mm.ai.f
{
  boolean frc;
  Set<String> frd;
  com.tencent.mm.a.f<String, c.d> fre;
  Stack<h> frf;
  private az frg;
  private az frh;
  String fri;
  com.tencent.mm.a.f<String, String> frj;
  com.tencent.mm.sdk.platformtools.ap frk;

  public c()
  {
    AppMethodBeat.i(77862);
    this.frc = false;
    this.frd = Collections.synchronizedSet(new HashSet());
    this.fre = new com.tencent.mm.memory.a.c(400);
    this.frf = new Stack();
    this.frg = null;
    this.frh = null;
    this.fri = null;
    this.frj = new com.tencent.mm.memory.a.c(200);
    this.frk = new com.tencent.mm.sdk.platformtools.ap(Looper.getMainLooper(), new c.3(this), false);
    g.Rg().a(123, this);
    this.frc = false;
    this.fri = r.Yz();
    AppMethodBeat.o(77862);
  }

  static d acd()
  {
    AppMethodBeat.i(77870);
    d locald;
    if (g.RN().QY())
    {
      locald = o.acd();
      AppMethodBeat.o(77870);
    }
    while (true)
    {
      return locald;
      locald = null;
      AppMethodBeat.o(77870);
    }
  }

  static h qb(String paramString)
  {
    AppMethodBeat.i(77866);
    Object localObject1 = o.act().qo(paramString);
    if ((localObject1 != null) && (((h)localObject1).getUsername().equals(paramString)))
    {
      ab.i("MicroMsg.AvatarService", "[isFlagNeed] getSmallUrl:%s username:%s", new Object[] { ((h)localObject1).acl(), paramString });
      AppMethodBeat.o(77866);
      paramString = (String)localObject1;
    }
    while (true)
    {
      return paramString;
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
      if ((localObject1 == null) || (!((com.tencent.mm.g.c.ap)localObject1).field_username.equals(paramString)))
      {
        if (localObject1 == null);
        for (boolean bool = true; ; bool = false)
        {
          ab.d("MicroMsg.AvatarService", "ct == null? :%s", new Object[] { Boolean.valueOf(bool), paramString });
          paramString = null;
          AppMethodBeat.o(77866);
          break;
        }
      }
      if (((com.tencent.mm.g.c.ap)localObject1).dtR == 4)
      {
        b.U(paramString, ((com.tencent.mm.g.c.ap)localObject1).dtR);
        ab.d("MicroMsg.AvatarService", "ct imgFlag :%s", new Object[] { Integer.valueOf(((com.tencent.mm.g.c.ap)localObject1).dtR) });
        paramString = null;
        AppMethodBeat.o(77866);
        continue;
      }
      localObject1 = new h();
      ((h)localObject1).username = paramString;
      ((h)localObject1).dtR = 3;
      byte[] arrayOfByte = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoS(paramString);
      if (bo.cb(arrayOfByte))
      {
        ab.i("MicroMsg.AvatarService", "[isFlagNeed] cmdBuf is null! username:%s", new Object[] { paramString });
        AppMethodBeat.o(77866);
        paramString = (String)localObject1;
        continue;
      }
      try
      {
        Object localObject2 = new com/tencent/mm/protocal/protobuf/bbv;
        ((bbv)localObject2).<init>();
        localObject2 = b.a(paramString, (bbv)((bbv)localObject2).parseFrom(arrayOfByte));
        localObject1 = localObject2;
        ab.i("MicroMsg.AvatarService", "[isFlagNeed] finally! getSmallUrl:%s getBigUrl:%s username:%s", new Object[] { ((h)localObject1).acl(), ((h)localObject1).ack(), paramString });
        AppMethodBeat.o(77866);
        paramString = (String)localObject1;
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.AvatarService", "exception:%s", new Object[] { bo.l(localException) });
      }
    }
  }

  final int a(az.a parama)
  {
    AppMethodBeat.i(77868);
    com.tencent.mm.sdk.g.a.c localc = com.tencent.mm.sdk.g.d.xDH;
    com.tencent.mm.sdk.g.d.xDH.ak(new c.2(this, parama));
    AppMethodBeat.o(77868);
    return 1;
  }

  public final Bitmap b(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(77863);
    d locald = acd();
    Object localObject1;
    if (locald != null)
      if ((paramInt >= 0) && (paramInt > 5))
      {
        localObject1 = d.qd(String.format("%s$$%d", new Object[] { paramString, Integer.valueOf(paramInt) }));
        if (localObject1 != null)
        {
          ab.i("MicroMsg.AvatarService", "find custom corner avatar, custom corner %d", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(77863);
          paramString = (String)localObject1;
          return paramString;
        }
        ab.i("MicroMsg.AvatarService", "can not find custom corner avatar, custom corner %d", new Object[] { Integer.valueOf(paramInt) });
        label105: localObject2 = localObject1;
        if (localObject1 != null);
      }
    for (Object localObject2 = d.qd(paramString); ; localObject2 = null)
    {
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (paramInt >= 0)
        {
          localObject1 = localObject2;
          if (paramInt > 5)
          {
            ab.i("MicroMsg.AvatarService", "create custom corner avatar, custom corner %d", new Object[] { Integer.valueOf(paramInt) });
            localObject1 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject2, false, paramInt);
            locald.e(String.format("%s$$%d", new Object[] { paramString, Integer.valueOf(paramInt) }), (Bitmap)localObject1);
          }
        }
        AppMethodBeat.o(77863);
        paramString = (String)localObject1;
        break;
      }
      if (paramBoolean)
      {
        AppMethodBeat.o(77863);
        paramString = null;
        break;
      }
      ab.v("MicroMsg.AvatarService", "get bitmap from cache failed, try to load :%s", new Object[] { paramString });
      if (this.frd.contains(paramString))
      {
        AppMethodBeat.o(77863);
        paramString = null;
        break;
      }
      this.frd.add(paramString);
      a(new c.c(this, paramString));
      AppMethodBeat.o(77863);
      paramString = null;
      break;
      localObject1 = null;
      break label105;
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(77867);
    while (this.frf.size() > 0)
      this.frd.remove(this.frf.pop());
    AppMethodBeat.o(77867);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(77869);
    if (paramm == null)
      AppMethodBeat.o(77869);
    while (true)
    {
      return;
      if (paramm.getType() != 123)
      {
        AppMethodBeat.o(77869);
      }
      else
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
          com.tencent.mm.plugin.report.service.h.pYm.a(138L, 12L, 1L, true);
        com.tencent.mm.plugin.report.service.h.pYm.a(138L, 45L, 1L, true);
        j localj = (j)paramm;
        paramString = new HashSet();
        Object localObject;
        if (localj.fsb != null)
        {
          Iterator localIterator = localj.fsb.iterator();
          while (localIterator.hasNext())
          {
            paramm = (auk)localIterator.next();
            localObject = paramm.wyu.wVI;
            if ((paramm.vEF == null) || (paramm.vEF.getBuffer() == null) || (paramm.vEF.getBuffer().wR == null))
            {
              com.tencent.mm.plugin.report.service.h.pYm.a(138L, 11L, 1L, true);
            }
            else
            {
              paramString.add(localObject);
              h localh = new h();
              localh.username = ((String)localObject);
              localh.dtR = 3;
              com.tencent.mm.plugin.report.service.h.pYm.a(138L, 43L, 1L, true);
              a(new c.e(this, localh, paramm.vEF.getBuffer().wR));
            }
          }
        }
        if (localj.fsa != null)
        {
          paramm = localj.fsa.iterator();
          while (paramm.hasNext())
          {
            localObject = (bts)paramm.next();
            if (localObject != null)
            {
              localObject = ((bts)localObject).wVI;
              if (!paramString.contains(localObject))
                this.frd.remove(localObject);
            }
          }
        }
        this.frc = false;
        if (this.frf.size() > 0)
          this.frk.ae(0L, 0L);
        AppMethodBeat.o(77869);
      }
    }
  }

  public final void pZ(String paramString)
  {
    AppMethodBeat.i(77864);
    a(new c.c(this, paramString));
    AppMethodBeat.o(77864);
  }

  public final void qa(String paramString)
  {
    AppMethodBeat.i(77865);
    com.tencent.mm.sdk.g.d.xDH.ak(new c.1(this, paramString));
    AppMethodBeat.o(77865);
  }

  public final String qc(String paramString)
  {
    AppMethodBeat.i(77871);
    String str1;
    if (bo.isNullOrNil(paramString))
    {
      str1 = "";
      AppMethodBeat.o(77871);
    }
    while (true)
    {
      return str1;
      try
      {
        str1 = String.format("%s%x_%s", new Object[] { "ammURL_", Integer.valueOf(paramString.hashCode()), paramString.substring(paramString.length() - 24, paramString.length() - 4) });
        this.frj.put(str1, paramString);
        AppMethodBeat.o(77871);
      }
      catch (Exception localException)
      {
        while (true)
          String str2 = String.format("%s%x_", new Object[] { "ammURL_", Integer.valueOf(paramString.hashCode()) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.c
 * JD-Core Version:    0.6.2
 */
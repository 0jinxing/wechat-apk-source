package com.tencent.mm.plugin.subapp.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.LinkedList;
import java.util.Queue;

public final class b
  implements e, f
{
  private Queue<b.a> ssL = null;
  private boolean ssM = false;

  private void cDC()
  {
    AppMethodBeat.i(25242);
    if (this.ssM)
      AppMethodBeat.o(25242);
    while (true)
    {
      return;
      if (this.ssL.size() == 0)
      {
        AppMethodBeat.o(25242);
      }
      else
      {
        Object localObject = (b.a)this.ssL.peek();
        if (((b.a)localObject).ssN.size() == 0)
        {
          this.ssL.poll();
          aw.ZK();
          c.Ry().set(8193, ((b.a)localObject).gpA);
          aw.ZK();
          c.Ry().set(8449, Long.valueOf(bo.anT()));
          AppMethodBeat.o(25242);
        }
        else
        {
          localObject = (String)((b.a)localObject).ssN.peek();
          if ((localObject == null) || (((String)localObject).length() <= 0))
          {
            AppMethodBeat.o(25242);
          }
          else
          {
            this.ssM = true;
            localObject = new a((String)localObject);
            aw.Rg().a(141, this);
            aw.Rg().a((m)localObject, 0);
            AppMethodBeat.o(25242);
          }
        }
      }
    }
  }

  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(25241);
    parama = aa.a(parama.eAB.vED);
    if (this.ssL == null)
      this.ssL = new LinkedList();
    parama = new b.a(parama);
    if (parama.gpA != null)
    {
      this.ssL.offer(parama);
      cDC();
    }
    AppMethodBeat.o(25241);
    return null;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(25243);
    if (paramm.getType() != 141)
    {
      this.ssM = false;
      AppMethodBeat.o(25243);
    }
    while (true)
    {
      return;
      aw.Rg().b(141, this);
      paramString = ((a)paramm).url;
      paramm = (b.a)this.ssL.peek();
      if ((paramm == null) || (paramm.ssN.size() == 0))
      {
        ab.e("MicroMsg.PushMessageExtension", "getDoSceneQueue failed ! reset queue!");
        this.ssL = new LinkedList();
        this.ssM = false;
        AppMethodBeat.o(25243);
      }
      else if (paramm.ssN.size() == 0)
      {
        ab.e("MicroMsg.PushMessageExtension", "get imgQueue failed ! ignore this message");
        this.ssL.poll();
        this.ssM = false;
        AppMethodBeat.o(25243);
      }
      else if (!((String)paramm.ssN.peek()).equals(paramString))
      {
        ab.e("MicroMsg.PushMessageExtension", "check img url failed ! ignore this message");
        this.ssL.poll();
        this.ssM = false;
        AppMethodBeat.o(25243);
      }
      else if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.PushMessageExtension", "down failed [" + paramInt1 + "," + paramInt2 + "] ignore this message : img:[" + paramString + "] ");
        this.ssL.poll();
        this.ssM = false;
        AppMethodBeat.o(25243);
      }
      else
      {
        paramm.ssN.poll();
        this.ssM = false;
        cDC();
        AppMethodBeat.o(25243);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.b.b
 * JD-Core Version:    0.6.2
 */
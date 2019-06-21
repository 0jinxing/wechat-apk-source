package com.tencent.mm.plugin.translate.a;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cir;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.LinkedList;
import java.util.Queue;

public final class d
  implements f
{
  public int index;
  public SparseArray<c.c> sKE;
  public boolean sKF;
  public b sKG;
  a sKH;
  public ap sKI;
  private long start;

  public d(int paramInt, a parama)
  {
    AppMethodBeat.i(26069);
    this.sKE = null;
    this.sKF = false;
    this.sKI = new ap(new d.1(this), false);
    this.index = paramInt;
    this.sKH = parama;
    AppMethodBeat.o(26069);
  }

  public final void cHJ()
  {
    this.sKG = null;
    this.sKF = false;
  }

  public final boolean e(Queue<c.c> paramQueue)
  {
    AppMethodBeat.i(26070);
    boolean bool;
    if (this.sKF)
    {
      AppMethodBeat.o(26070);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.sKE = new SparseArray();
      if (paramQueue.size() == 0)
      {
        AppMethodBeat.o(26070);
        bool = false;
      }
      else
      {
        this.sKF = true;
        LinkedList localLinkedList = new LinkedList();
        int i = 0;
        if ((i < 512) && (paramQueue.size() > 0))
        {
          c.c localc = (c.c)paramQueue.peek();
          int j = localc.cPz.getBytes().length;
          cir localcir;
          if ((i == 0) || (i + j <= 512))
          {
            paramQueue.poll();
            localcir = new cir();
            localcir.xhA = localc.sKB;
            localcir.xhB = localc.cPz;
            localcir.wlw = new SKBuiltinBuffer_t().setBuffer(localc.dJG);
            if ((localc.type == 1) || (t.kH(localc.source)))
              localcir.xhC = localc.source;
            switch (localc.type)
            {
            default:
            case 1:
            case 0:
            case 2:
            case 3:
            }
          }
          while (true)
          {
            ab.d("MicroMsg.WorkingTranslate", "eventMsg.type: %d, msg.Scene:%d, id: %s", new Object[] { Integer.valueOf(localc.type), Integer.valueOf(localcir.Scene), localc.id });
            localLinkedList.add(localcir);
            this.sKE.put(localc.sKB, localc);
            i += j;
            break;
            localcir.Scene = 4;
            continue;
            localcir.Scene = 1;
            continue;
            localcir.Scene = 2;
            continue;
            localcir.Scene = 3;
          }
        }
        this.sKG = new b(localLinkedList);
        aw.Rg().a(this.sKG, 0);
        this.start = System.currentTimeMillis();
        this.sKI.ae(60000L, 60000L);
        AppMethodBeat.o(26070);
        bool = true;
      }
    }
  }

  public final void init()
  {
    AppMethodBeat.i(26071);
    aw.Rg().a(631, this);
    AppMethodBeat.o(26071);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26072);
    if (this.sKG != paramm)
    {
      ab.e("MicroMsg.WorkingTranslate", "not my translate work");
      AppMethodBeat.o(26072);
      return;
    }
    this.sKI.stopTimer();
    ab.d("MicroMsg.WorkingTranslate", "translate take time : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - this.start) });
    if (((b)paramm).sKv != null);
    for (int i = ((b)paramm).sKv.size(); ; i = 0)
    {
      ab.d("MicroMsg.WorkingTranslate", "errType : %s, errCode : %s, errMsg : %s, translatedMsg.size() : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
      cHJ();
      this.sKH.a(paramInt2, this.sKE, ((b)paramm).sKv);
      AppMethodBeat.o(26072);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.a.d
 * JD-Core Version:    0.6.2
 */
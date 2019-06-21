package com.tencent.mm.plugin.u.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
  implements a.a
{
  public Map<String, List<b.a>> ce;
  public List<String> fGz;
  public ak iGP;
  public Map<String, Set<Integer>> pAo;
  String pAp;
  a pAq;

  public b()
  {
    AppMethodBeat.i(80753);
    this.iGP = new ak(Looper.getMainLooper());
    this.fGz = new LinkedList();
    this.ce = new HashMap();
    this.pAo = new HashMap();
    AppMethodBeat.o(80753);
  }

  public final int a(d paramd)
  {
    AppMethodBeat.i(80756);
    this.iGP.post(new b.3(this, paramd));
    AppMethodBeat.o(80756);
    return 0;
  }

  public final void a(final String paramString, final b.a parama, final Set<Integer> paramSet)
  {
    AppMethodBeat.i(80754);
    ab.i("MicroMsg.FileScanQueueService", "startDecodeBlockLoop, fileUri: %s, callback: %x", new Object[] { paramString, Integer.valueOf(parama.hashCode()) });
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FileScanQueueService", "start failed, uri is null or nil");
      AppMethodBeat.o(80754);
    }
    while (true)
    {
      return;
      this.iGP.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(80750);
          b localb = b.this;
          Object localObject1 = paramString;
          b.a locala1 = parama;
          Object localObject2 = paramSet;
          localb.pAo.put(localObject1, localObject2);
          label94: int i;
          if (localb.ce.containsKey(localObject1))
          {
            localObject1 = (List)localb.ce.get(localObject1);
            if (localObject1 != null)
            {
              if (localObject1 != null)
              {
                if ((localObject1 == null) || (((List)localObject1).size() == 0))
                {
                  ab.e("MicroMsg.FileScanQueueService", "isCallbackInList, list is null or nil");
                  break label127;
                  i = 0;
                  label97: if (i == 0)
                    break label166;
                }
              }
              else
                ab.e("MicroMsg.FileScanQueueService", "addToCallbackList, list is null or callback is already in list");
            }
            else
            {
              label109: localb.cdv();
              AppMethodBeat.o(80750);
            }
          }
          while (true)
          {
            return;
            localObject2 = ((List)localObject1).iterator();
            label127: if (!((Iterator)localObject2).hasNext())
              break label94;
            b.a locala2 = (b.a)((Iterator)localObject2).next();
            if ((locala2 == null) || (locala2 != locala1))
              break;
            i = 1;
            break label97;
            label166: ((List)localObject1).add(locala1);
            break label109;
            localObject2 = new LinkedList();
            ((List)localObject2).add(locala1);
            localb.ce.put(localObject1, localObject2);
            localb.fGz.add(localObject1);
            localb.cdv();
            AppMethodBeat.o(80750);
          }
        }
      });
      AppMethodBeat.o(80754);
    }
  }

  final void cdv()
  {
    AppMethodBeat.i(80755);
    if (this.pAq != null)
    {
      ab.d("MicroMsg.FileScanQueueService", "it is scanning");
      AppMethodBeat.o(80755);
    }
    while (true)
    {
      return;
      if (this.ce.isEmpty())
      {
        ab.d("MicroMsg.FileScanQueueService", "queue is empty");
        AppMethodBeat.o(80755);
      }
      else
      {
        this.pAp = ((String)this.fGz.get(0));
        this.fGz.remove(0);
        this.pAq = new a();
        this.pAq.cJV = ((Set)this.pAo.get(this.pAp));
        a locala = this.pAq;
        String str = this.pAp;
        ab.i("MicroMsg.scanner.DecodeFile", "start decode file: ".concat(String.valueOf(str)));
        locala.pAl = this;
        al.d(new a.1(locala, str));
        AppMethodBeat.o(80755);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.b
 * JD-Core Version:    0.6.2
 */
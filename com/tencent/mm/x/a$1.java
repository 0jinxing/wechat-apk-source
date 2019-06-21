package com.tencent.mm.x;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ac.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

final class a$1 extends ak
{
  a$1(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(77701);
    if ((paramMessage.what == 0) && ((paramMessage.obj instanceof a.b)))
    {
      paramMessage = (a.b)paramMessage.obj;
      if (paramMessage.eEX != null)
      {
        a locala = this.eEV;
        Object localObject1 = paramMessage.eEX;
        paramMessage = null;
        Iterator localIterator = locala.eES.iterator();
        Object localObject2;
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          if ((localWeakReference != null) && (localWeakReference.get() != null))
          {
            ((a.a)localWeakReference.get()).b((ac.a)localObject1);
          }
          else
          {
            localObject2 = paramMessage;
            if (paramMessage == null)
              localObject2 = new ArrayList();
            ((ArrayList)localObject2).add(localWeakReference);
            paramMessage = (Message)localObject2;
          }
        }
        if (paramMessage != null)
        {
          localObject2 = paramMessage.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (WeakReference)((Iterator)localObject2).next();
            locala.eES.remove(localObject1);
          }
          paramMessage.clear();
        }
        AppMethodBeat.o(77701);
      }
    }
    while (true)
    {
      return;
      a.a(this.eEV, paramMessage.eEW, paramMessage.value);
      AppMethodBeat.o(77701);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.x.a.1
 * JD-Core Version:    0.6.2
 */
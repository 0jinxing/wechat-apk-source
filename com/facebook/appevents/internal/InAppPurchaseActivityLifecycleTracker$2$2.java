package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

class InAppPurchaseActivityLifecycleTracker$2$2
  implements Runnable
{
  InAppPurchaseActivityLifecycleTracker$2$2(InAppPurchaseActivityLifecycleTracker.2 param2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(72181);
    Context localContext = FacebookSdk.getApplicationContext();
    ArrayList localArrayList1 = InAppPurchaseEventManager.getPurchasesInapp(localContext, InAppPurchaseActivityLifecycleTracker.access$000());
    ArrayList localArrayList2 = localArrayList1;
    if (localArrayList1.isEmpty())
      localArrayList2 = InAppPurchaseEventManager.getPurchaseHistoryInapp(localContext, InAppPurchaseActivityLifecycleTracker.access$000());
    InAppPurchaseActivityLifecycleTracker.access$100(localContext, localArrayList2);
    AppMethodBeat.o(72181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker.2.2
 * JD-Core Version:    0.6.2
 */
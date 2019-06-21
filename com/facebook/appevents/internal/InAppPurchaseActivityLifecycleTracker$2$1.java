package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

class InAppPurchaseActivityLifecycleTracker$2$1
  implements Runnable
{
  InAppPurchaseActivityLifecycleTracker$2$1(InAppPurchaseActivityLifecycleTracker.2 param2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(72180);
    Context localContext = FacebookSdk.getApplicationContext();
    InAppPurchaseActivityLifecycleTracker.access$100(localContext, InAppPurchaseEventManager.getPurchasesInapp(localContext, InAppPurchaseActivityLifecycleTracker.access$000()));
    Map localMap = InAppPurchaseEventManager.getPurchasesSubs(localContext, InAppPurchaseActivityLifecycleTracker.access$000());
    Iterator localIterator = InAppPurchaseEventManager.getPurchasesSubsExpire(localContext, InAppPurchaseActivityLifecycleTracker.access$000()).iterator();
    while (localIterator.hasNext())
      localMap.put((String)localIterator.next(), SubscriptionType.EXPIRE);
    InAppPurchaseActivityLifecycleTracker.access$200(localContext, localMap);
    AppMethodBeat.o(72180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker.2.1
 * JD-Core Version:    0.6.2
 */
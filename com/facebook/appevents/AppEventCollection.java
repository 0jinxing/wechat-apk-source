package com.facebook.appevents;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.internal.AttributionIdentifiers;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class AppEventCollection
{
  private final HashMap<AccessTokenAppIdPair, SessionEventsState> stateMap;

  public AppEventCollection()
  {
    AppMethodBeat.i(71877);
    this.stateMap = new HashMap();
    AppMethodBeat.o(71877);
  }

  private SessionEventsState getSessionEventsState(AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    try
    {
      AppMethodBeat.i(71883);
      Object localObject1 = (SessionEventsState)this.stateMap.get(paramAccessTokenAppIdPair);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = FacebookSdk.getApplicationContext();
        localObject2 = new com/facebook/appevents/SessionEventsState;
        ((SessionEventsState)localObject2).<init>(AttributionIdentifiers.getAttributionIdentifiers((Context)localObject1), AppEventsLogger.getAnonymousAppDeviceGUID((Context)localObject1));
      }
      this.stateMap.put(paramAccessTokenAppIdPair, localObject2);
      AppMethodBeat.o(71883);
      return localObject2;
    }
    finally
    {
    }
    throw paramAccessTokenAppIdPair;
  }

  public void addEvent(AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEvent paramAppEvent)
  {
    try
    {
      AppMethodBeat.i(71879);
      getSessionEventsState(paramAccessTokenAppIdPair).addEvent(paramAppEvent);
      AppMethodBeat.o(71879);
      return;
    }
    finally
    {
      paramAccessTokenAppIdPair = finally;
    }
    throw paramAccessTokenAppIdPair;
  }

  public void addPersistedEvents(PersistedEvents paramPersistedEvents)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(71878);
        if (paramPersistedEvents == null)
        {
          AppMethodBeat.o(71878);
          return;
        }
        Iterator localIterator = paramPersistedEvents.keySet().iterator();
        if (localIterator.hasNext())
        {
          Object localObject = (AccessTokenAppIdPair)localIterator.next();
          SessionEventsState localSessionEventsState = getSessionEventsState((AccessTokenAppIdPair)localObject);
          localObject = paramPersistedEvents.get((AccessTokenAppIdPair)localObject).iterator();
          if (((Iterator)localObject).hasNext())
          {
            localSessionEventsState.addEvent((AppEvent)((Iterator)localObject).next());
            continue;
          }
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(71878);
    }
  }

  public SessionEventsState get(AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    try
    {
      AppMethodBeat.i(71881);
      paramAccessTokenAppIdPair = (SessionEventsState)this.stateMap.get(paramAccessTokenAppIdPair);
      AppMethodBeat.o(71881);
      return paramAccessTokenAppIdPair;
    }
    finally
    {
      paramAccessTokenAppIdPair = finally;
    }
    throw paramAccessTokenAppIdPair;
  }

  public int getEventCount()
  {
    try
    {
      AppMethodBeat.i(71882);
      Iterator localIterator = this.stateMap.values().iterator();
      for (int i = 0; localIterator.hasNext(); i = ((SessionEventsState)localIterator.next()).getAccumulatedEventCount() + i);
      AppMethodBeat.o(71882);
      return i;
    }
    finally
    {
    }
  }

  public Set<AccessTokenAppIdPair> keySet()
  {
    try
    {
      AppMethodBeat.i(71880);
      Set localSet = this.stateMap.keySet();
      AppMethodBeat.o(71880);
      return localSet;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventCollection
 * JD-Core Version:    0.6.2
 */
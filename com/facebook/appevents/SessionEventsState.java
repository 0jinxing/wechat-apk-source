package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class SessionEventsState
{
  private final int MAX_ACCUMULATED_LOG_EVENTS;
  private List<AppEvent> accumulatedEvents;
  private String anonymousAppDeviceGUID;
  private AttributionIdentifiers attributionIdentifiers;
  private List<AppEvent> inFlightEvents;
  private int numSkippedEventsDueToFullBuffer;

  public SessionEventsState(AttributionIdentifiers paramAttributionIdentifiers, String paramString)
  {
    AppMethodBeat.i(72018);
    this.accumulatedEvents = new ArrayList();
    this.inFlightEvents = new ArrayList();
    this.MAX_ACCUMULATED_LOG_EVENTS = 1000;
    this.attributionIdentifiers = paramAttributionIdentifiers;
    this.anonymousAppDeviceGUID = paramString;
    AppMethodBeat.o(72018);
  }

  private void populateRequest(GraphRequest paramGraphRequest, Context paramContext, int paramInt, JSONArray paramJSONArray, boolean paramBoolean)
  {
    AppMethodBeat.i(72025);
    try
    {
      Object localObject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, paramBoolean, paramContext);
      paramContext = (Context)localObject;
      if (this.numSkippedEventsDueToFullBuffer > 0)
      {
        ((JSONObject)localObject).put("num_skipped_events", paramInt);
        paramContext = (Context)localObject;
      }
      paramGraphRequest.setGraphObject(paramContext);
      localObject = paramGraphRequest.getParameters();
      paramContext = (Context)localObject;
      if (localObject == null)
        paramContext = new Bundle();
      paramJSONArray = paramJSONArray.toString();
      if (paramJSONArray != null)
      {
        paramContext.putString("custom_events", paramJSONArray);
        paramGraphRequest.setTag(paramJSONArray);
      }
      paramGraphRequest.setParameters(paramContext);
      AppMethodBeat.o(72025);
      return;
    }
    catch (JSONException paramContext)
    {
      while (true)
        paramContext = new JSONObject();
    }
  }

  public void accumulatePersistedEvents(List<AppEvent> paramList)
  {
    try
    {
      AppMethodBeat.i(72024);
      this.accumulatedEvents.addAll(paramList);
      AppMethodBeat.o(72024);
      return;
    }
    finally
    {
      paramList = finally;
    }
    throw paramList;
  }

  public void addEvent(AppEvent paramAppEvent)
  {
    try
    {
      AppMethodBeat.i(72019);
      if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= 1000)
      {
        this.numSkippedEventsDueToFullBuffer += 1;
        AppMethodBeat.o(72019);
      }
      while (true)
      {
        return;
        this.accumulatedEvents.add(paramAppEvent);
        AppMethodBeat.o(72019);
      }
    }
    finally
    {
    }
    throw paramAppEvent;
  }

  public void clearInFlightAndStats(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(72021);
      if (paramBoolean)
        this.accumulatedEvents.addAll(this.inFlightEvents);
      this.inFlightEvents.clear();
      this.numSkippedEventsDueToFullBuffer = 0;
      AppMethodBeat.o(72021);
      return;
    }
    finally
    {
    }
  }

  public int getAccumulatedEventCount()
  {
    try
    {
      AppMethodBeat.i(72020);
      int i = this.accumulatedEvents.size();
      AppMethodBeat.o(72020);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public List<AppEvent> getEventsToPersist()
  {
    try
    {
      AppMethodBeat.i(72023);
      List localList = this.accumulatedEvents;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.accumulatedEvents = localArrayList;
      AppMethodBeat.o(72023);
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int populateRequest(GraphRequest paramGraphRequest, Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(72022);
    int i;
    JSONArray localJSONArray;
    while (true)
    {
      AppEvent localAppEvent;
      try
      {
        i = this.numSkippedEventsDueToFullBuffer;
        this.inFlightEvents.addAll(this.accumulatedEvents);
        this.accumulatedEvents.clear();
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        Iterator localIterator = this.inFlightEvents.iterator();
        if (!localIterator.hasNext())
          break;
        localAppEvent = (AppEvent)localIterator.next();
        if (localAppEvent.isChecksumValid())
        {
          if ((!paramBoolean1) && (localAppEvent.getIsImplicit()))
            continue;
          localJSONArray.put(localAppEvent.getJSONObject());
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(72022);
      }
      Utility.logd("Event with invalid checksum: %s", localAppEvent.toString());
    }
    if (localJSONArray.length() == 0)
    {
      i = 0;
      AppMethodBeat.o(72022);
    }
    while (true)
    {
      return i;
      populateRequest(paramGraphRequest, paramContext, i, localJSONArray, paramBoolean2);
      i = localJSONArray.length();
      AppMethodBeat.o(72022);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.SessionEventsState
 * JD-Core Version:    0.6.2
 */
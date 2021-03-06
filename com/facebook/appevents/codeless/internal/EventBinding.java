package com.facebook.appevents.codeless.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EventBinding
{
  private final String activityName;
  private final String appVersion;
  private final String componentId;
  private final String eventName;
  private final EventBinding.MappingMethod method;
  private final List<ParameterComponent> parameters;
  private final List<PathComponent> path;
  private final String pathType;
  private final EventBinding.ActionType type;

  public EventBinding(String paramString1, EventBinding.MappingMethod paramMappingMethod, EventBinding.ActionType paramActionType, String paramString2, List<PathComponent> paramList, List<ParameterComponent> paramList1, String paramString3, String paramString4, String paramString5)
  {
    this.eventName = paramString1;
    this.method = paramMappingMethod;
    this.type = paramActionType;
    this.appVersion = paramString2;
    this.path = paramList;
    this.parameters = paramList1;
    this.componentId = paramString3;
    this.pathType = paramString4;
    this.activityName = paramString5;
  }

  public static EventBinding getInstanceFromJson(JSONObject paramJSONObject)
  {
    int i = 0;
    AppMethodBeat.i(72098);
    String str1 = paramJSONObject.getString("event_name");
    EventBinding.MappingMethod localMappingMethod = EventBinding.MappingMethod.valueOf(paramJSONObject.getString("method").toUpperCase());
    EventBinding.ActionType localActionType = EventBinding.ActionType.valueOf(paramJSONObject.getString("event_type").toUpperCase());
    String str2 = paramJSONObject.getString("app_version");
    Object localObject = paramJSONObject.getJSONArray("path");
    ArrayList localArrayList1 = new ArrayList();
    for (int j = 0; j < ((JSONArray)localObject).length(); j++)
      localArrayList1.add(new PathComponent(((JSONArray)localObject).getJSONObject(j)));
    localObject = paramJSONObject.optString("path_type", "absolute");
    JSONArray localJSONArray = paramJSONObject.optJSONArray("parameters");
    ArrayList localArrayList2 = new ArrayList();
    if (localJSONArray != null)
      for (j = i; j < localJSONArray.length(); j++)
        localArrayList2.add(new ParameterComponent(localJSONArray.getJSONObject(j)));
    paramJSONObject = new EventBinding(str1, localMappingMethod, localActionType, str2, localArrayList1, localArrayList2, paramJSONObject.optString("component_id"), (String)localObject, paramJSONObject.optString("activity_name"));
    AppMethodBeat.o(72098);
    return paramJSONObject;
  }

  public static List<EventBinding> parseArray(JSONArray paramJSONArray)
  {
    int i = 0;
    AppMethodBeat.i(72097);
    ArrayList localArrayList = new ArrayList();
    if (paramJSONArray != null);
    try
    {
      int j = paramJSONArray.length();
      while (i < j)
      {
        localArrayList.add(getInstanceFromJson(paramJSONArray.getJSONObject(i)));
        i++;
        continue;
        j = 0;
      }
    }
    catch (JSONException paramJSONArray)
    {
      AppMethodBeat.o(72097);
    }
    return localArrayList;
  }

  public String getActivityName()
  {
    return this.activityName;
  }

  public String getAppVersion()
  {
    return this.appVersion;
  }

  public String getComponentId()
  {
    return this.componentId;
  }

  public String getEventName()
  {
    return this.eventName;
  }

  public EventBinding.MappingMethod getMethod()
  {
    return this.method;
  }

  public String getPathType()
  {
    return this.pathType;
  }

  public EventBinding.ActionType getType()
  {
    return this.type;
  }

  public List<ParameterComponent> getViewParameters()
  {
    AppMethodBeat.i(72100);
    List localList = Collections.unmodifiableList(this.parameters);
    AppMethodBeat.o(72100);
    return localList;
  }

  public List<PathComponent> getViewPath()
  {
    AppMethodBeat.i(72099);
    List localList = Collections.unmodifiableList(this.path);
    AppMethodBeat.o(72099);
    return localList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.internal.EventBinding
 * JD-Core Version:    0.6.2
 */
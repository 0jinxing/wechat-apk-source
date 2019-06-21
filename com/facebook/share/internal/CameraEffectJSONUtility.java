package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectArguments.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class CameraEffectJSONUtility
{
  private static final Map<Class<?>, CameraEffectJSONUtility.Setter> SETTERS;

  static
  {
    AppMethodBeat.i(96952);
    HashMap localHashMap = new HashMap();
    SETTERS = localHashMap;
    localHashMap.put(String.class, new CameraEffectJSONUtility.1());
    SETTERS.put([Ljava.lang.String.class, new CameraEffectJSONUtility.2());
    SETTERS.put(JSONArray.class, new CameraEffectJSONUtility.3());
    AppMethodBeat.o(96952);
  }

  public static CameraEffectArguments convertToCameraEffectArguments(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96951);
    if (paramJSONObject == null)
    {
      paramJSONObject = null;
      AppMethodBeat.o(96951);
    }
    while (true)
    {
      return paramJSONObject;
      CameraEffectArguments.Builder localBuilder = new CameraEffectArguments.Builder();
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramJSONObject.get(str);
        if ((localObject != null) && (localObject != JSONObject.NULL))
        {
          CameraEffectJSONUtility.Setter localSetter = (CameraEffectJSONUtility.Setter)SETTERS.get(localObject.getClass());
          if (localSetter == null)
          {
            paramJSONObject = new IllegalArgumentException("Unsupported type: " + localObject.getClass());
            AppMethodBeat.o(96951);
            throw paramJSONObject;
          }
          localSetter.setOnArgumentsBuilder(localBuilder, str, localObject);
        }
      }
      paramJSONObject = localBuilder.build();
      AppMethodBeat.o(96951);
    }
  }

  public static JSONObject convertToJSON(CameraEffectArguments paramCameraEffectArguments)
  {
    AppMethodBeat.i(96950);
    if (paramCameraEffectArguments == null)
    {
      paramCameraEffectArguments = null;
      AppMethodBeat.o(96950);
    }
    while (true)
    {
      return paramCameraEffectArguments;
      JSONObject localJSONObject = new JSONObject();
      Iterator localIterator = paramCameraEffectArguments.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramCameraEffectArguments.get(str);
        if (localObject != null)
        {
          CameraEffectJSONUtility.Setter localSetter = (CameraEffectJSONUtility.Setter)SETTERS.get(localObject.getClass());
          if (localSetter == null)
          {
            paramCameraEffectArguments = new IllegalArgumentException("Unsupported type: " + localObject.getClass());
            AppMethodBeat.o(96950);
            throw paramCameraEffectArguments;
          }
          localSetter.setOnJSON(localJSONObject, str, localObject);
        }
      }
      AppMethodBeat.o(96950);
      paramCameraEffectArguments = localJSONObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.CameraEffectJSONUtility
 * JD-Core Version:    0.6.2
 */
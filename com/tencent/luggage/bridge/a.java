package com.tencent.luggage.bridge;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

abstract class a
{
  protected b bOe;
  protected JSONObject bOf;

  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", this.bOe.name());
    localHashMap.put("data", this.bOf);
    return new JSONObject(localHashMap).toString();
  }

  final b wJ()
  {
    return this.bOe;
  }

  final JSONObject wK()
  {
    return this.bOf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.smtt.export.external.interfaces;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class UrlResponseInfo$HeaderBlock
{
  public abstract List<Map.Entry<String, String>> getAsList();

  public abstract Map<String, List<String>> getAsMap();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.UrlResponseInfo.HeaderBlock
 * JD-Core Version:    0.6.2
 */
package com.tencent.xweb;

import android.net.Uri;
import java.util.Map;

public abstract interface n
{
  public abstract String getMethod();

  public abstract Map<String, String> getRequestHeaders();

  public abstract Uri getUrl();

  public abstract boolean hasGesture();

  public abstract boolean isForMainFrame();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.n
 * JD-Core Version:    0.6.2
 */
package org.xwalk.core;

import java.util.List;

public abstract class WebViewExtensionListener
{
  public abstract int getHostByName(String paramString, List<String> paramList);

  public abstract Object onMiscCallBack(String paramString, Object[] paramArrayOfObject);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.xwalk.core.WebViewExtensionListener
 * JD-Core Version:    0.6.2
 */
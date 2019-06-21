package com.tencent.matrix.b;

import android.app.Application;
import com.tencent.matrix.c.c.a;
import com.tencent.matrix.d.d;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b
  implements c.a
{
  public static final int PLUGIN_CREATE = 0;
  public static final int PLUGIN_DESTROYED = 8;
  public static final int PLUGIN_INITED = 1;
  public static final int PLUGIN_STARTED = 2;
  public static final int PLUGIN_STOPPED = 4;
  private static final String TAG = "Matrix.Plugin";
  private Application application;
  private boolean isSupported = true;
  private c pluginListener;
  private int status = 0;

  public void destroy()
  {
    if (isPluginStarted())
      stop();
    if (isPluginDestroyed())
      throw new RuntimeException("plugin destroy, but plugin has been already destroyed");
    this.status = 8;
    if (this.pluginListener == null)
      throw new RuntimeException("plugin destroy, plugin listener is null");
    this.pluginListener.e(this);
  }

  public Application getApplication()
  {
    return this.application;
  }

  public JSONObject getJsonInfo()
  {
    return new JSONObject();
  }

  public int getStatus()
  {
    return this.status;
  }

  public String getTag()
  {
    return getClass().getName();
  }

  public void init(Application paramApplication, c paramc)
  {
    if ((this.application != null) || (this.pluginListener != null))
      throw new RuntimeException("plugin duplicate init, application or plugin listener is not null");
    this.status = 1;
    this.application = paramApplication;
    this.pluginListener = paramc;
  }

  public boolean isPluginDestroyed()
  {
    if (this.status == 8);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isPluginStarted()
  {
    if (this.status == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isPluginStoped()
  {
    if (this.status == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isSupported()
  {
    return this.isSupported;
  }

  public void onDetectIssue(com.tencent.matrix.c.b paramb)
  {
    if (paramb.tag == null)
      paramb.tag = getTag();
    paramb.bWw = this;
    JSONObject localJSONObject = paramb.bWv;
    try
    {
      if (paramb.tag != null)
        localJSONObject.put("tag", paramb.tag);
      if (paramb.bWu != null)
        localJSONObject.put("type", paramb.bWu);
      localJSONObject.put("process", d.aD(this.application));
      localJSONObject.put("time", System.currentTimeMillis());
      this.pluginListener.a(paramb);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        com.tencent.matrix.d.c.e("Matrix.Plugin", "json error", new Object[] { localJSONException });
    }
  }

  public void onForeground(boolean paramBoolean)
  {
  }

  public void start()
  {
    if (isPluginDestroyed())
      throw new RuntimeException("plugin start, but plugin has been already destroyed");
    if (isPluginStarted())
      throw new RuntimeException("plugin start, but plugin has been already started");
    this.status = 2;
    if (this.pluginListener == null)
      throw new RuntimeException("plugin start, plugin listener is null");
    this.pluginListener.c(this);
  }

  public void stop()
  {
    if (isPluginDestroyed())
      throw new RuntimeException("plugin stop, but plugin has been already destroyed");
    if (!isPluginStarted())
      throw new RuntimeException("plugin stop, but plugin is never started");
    this.status = 4;
    if (this.pluginListener == null)
      throw new RuntimeException("plugin stop, plugin listener is null");
    this.pluginListener.d(this);
  }

  public void unSupportPlugin()
  {
    this.isSupported = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.b.b
 * JD-Core Version:    0.6.2
 */
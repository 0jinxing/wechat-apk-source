package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Path;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import org.json.JSONArray;

public abstract interface a
{
  public abstract boolean a(Path paramPath, BasePathActionArg paramBasePathActionArg);

  public abstract boolean a(Path paramPath, JSONArray paramJSONArray);

  public abstract BasePathActionArg ayr();

  public abstract String getMethod();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.a
 * JD-Core Version:    0.6.2
 */
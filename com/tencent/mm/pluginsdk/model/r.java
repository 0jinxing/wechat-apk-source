package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

public abstract class r
{
  public boolean F(Context paramContext, Intent paramIntent)
  {
    return false;
  }

  public String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    return paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager()).toString();
  }

  public abstract boolean aix(String paramString);

  public abstract String anK();

  public abstract String dgX();

  public abstract s.a dgY();

  public abstract boolean fE(Context paramContext);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.r
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.accessibility;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Util
{
  public static Activity getActivityOfView(View paramView)
  {
    AppMethodBeat.i(118645);
    if (paramView == null)
    {
      AppMethodBeat.o(118645);
      paramView = null;
    }
    while (true)
    {
      return paramView;
      for (paramView = paramView.getContext(); ; paramView = ((ContextWrapper)paramView).getBaseContext())
      {
        if (!(paramView instanceof ContextWrapper))
          break label61;
        if ((paramView instanceof Activity))
        {
          paramView = (Activity)paramView;
          AppMethodBeat.o(118645);
          break;
        }
      }
      label61: AppMethodBeat.o(118645);
      paramView = null;
    }
  }

  public static String getViewIdName(View paramView)
  {
    AppMethodBeat.i(118646);
    if (paramView == null)
    {
      paramView = "NO_ID";
      AppMethodBeat.o(118646);
    }
    while (true)
    {
      return paramView;
      int i = paramView.getId();
      StringBuilder localStringBuilder = new StringBuilder(128);
      Object localObject;
      if (i != -1)
      {
        localObject = paramView.getResources();
        if ((resourceHasPackage(i)) && (localObject != null))
          switch (0xFF000000 & i)
          {
          default:
          case 2130706432:
          case 16777216:
          }
      }
      try
      {
        paramView = ((Resources)localObject).getResourcePackageName(i);
        while (true)
        {
          String str = ((Resources)localObject).getResourceTypeName(i);
          localObject = ((Resources)localObject).getResourceEntryName(i);
          localStringBuilder.append(" ");
          localStringBuilder.append(paramView);
          localStringBuilder.append(":");
          localStringBuilder.append(str);
          localStringBuilder.append("/");
          localStringBuilder.append((String)localObject);
          label147: paramView = localStringBuilder.toString();
          AppMethodBeat.o(118646);
          break;
          paramView = "app";
          continue;
          paramView = "android";
        }
      }
      catch (Throwable paramView)
      {
        break label147;
      }
    }
  }

  public static boolean resourceHasPackage(int paramInt)
  {
    if (paramInt >>> 24 != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.accessibility.Util
 * JD-Core Version:    0.6.2
 */
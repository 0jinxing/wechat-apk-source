package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.sdk.platformtools.ah;

public abstract class b
{
  private static float bUz = 3.4028235E+38F;
  private static float uOW = 3.4028235E+38F;
  private static int uOX = -1;
  public static float uOY = 48.0F;

  public static int Kc(int paramInt)
  {
    return Math.round(paramInt * dek());
  }

  public static int Kd(int paramInt)
  {
    return Math.round(paramInt / dek());
  }

  private static float dej()
  {
    try
    {
      if (bUz == 3.4028235E+38F)
        bUz = getDisplayMetrics().density;
      float f = bUz;
      return f;
    }
    finally
    {
    }
  }

  private static float dek()
  {
    try
    {
      if (uOW == 3.4028235E+38F)
        uOW = getDisplayMetrics().density * ah.getContext().getResources().getConfiguration().fontScale;
      float f = uOW;
      return f;
    }
    finally
    {
    }
  }

  public static int del()
  {
    if (uOX == -1)
      uOX = Math.round(dej() * 30.0F);
    return uOX;
  }

  private static DisplayMetrics getDisplayMetrics()
  {
    Display localDisplay = ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }

  public static float getTextSize()
  {
    return uOY;
  }

  public static void setTextSize(float paramFloat)
  {
    uOY = paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.b
 * JD-Core Version:    0.6.2
 */
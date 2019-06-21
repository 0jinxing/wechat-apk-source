package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ak$d extends Resources
{
  ak$d(AssetManager paramAssetManager, DisplayMetrics paramDisplayMetrics, Configuration paramConfiguration)
  {
    super(paramAssetManager, paramDisplayMetrics, paramConfiguration);
  }

  public final String[] getStringArray(int paramInt)
  {
    AppMethodBeat.i(134296);
    String[] arrayOfString;
    if (2131755036 == paramInt)
    {
      arrayOfString = new String[0];
      AppMethodBeat.o(134296);
    }
    while (true)
    {
      return arrayOfString;
      if (2131755037 == paramInt)
      {
        arrayOfString = new String[0];
        AppMethodBeat.o(134296);
      }
      else
      {
        arrayOfString = super.getStringArray(paramInt);
        AppMethodBeat.o(134296);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ak.d
 * JD-Core Version:    0.6.2
 */
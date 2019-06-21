package com.tencent.smtt.sdk;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import com.tencent.smtt.utils.TbsLog;

public abstract class WebChromeClient$FileChooserParams
{
  public static final int MODE_OPEN = 0;
  public static final int MODE_OPEN_FOLDER = 2;
  public static final int MODE_OPEN_MULTIPLE = 1;
  public static final int MODE_SAVE = 3;

  public static Uri[] parseResult(int paramInt, Intent paramIntent)
  {
    Object localObject1 = null;
    try
    {
      localObject2 = bv.a();
      if ((localObject2 != null) && (((bv)localObject2).b()))
        localObject2 = ((bv)localObject2).c().a(paramInt, paramIntent);
      while (true)
      {
        return localObject2;
        localObject2 = localObject1;
        if (Build.VERSION.SDK_INT >= 21)
          localObject2 = android.webkit.WebChromeClient.FileChooserParams.parseResult(paramInt, paramIntent);
      }
    }
    catch (Exception paramIntent)
    {
      while (true)
      {
        TbsLog.i("WebChromeClient", "parseResult:" + paramIntent.toString());
        Object localObject2 = localObject1;
      }
    }
  }

  public abstract Intent createIntent();

  public abstract String[] getAcceptTypes();

  public abstract String getFilenameHint();

  public abstract int getMode();

  public abstract CharSequence getTitle();

  public abstract boolean isCaptureEnabled();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebChromeClient.FileChooserParams
 * JD-Core Version:    0.6.2
 */
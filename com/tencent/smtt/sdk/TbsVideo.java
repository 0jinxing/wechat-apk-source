package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.f.a.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TbsVideo
{
  public static boolean canUseTbsPlayer(Context paramContext)
  {
    AppMethodBeat.i(64603);
    boolean bool = be.a(paramContext).a();
    AppMethodBeat.o(64603);
    return bool;
  }

  public static boolean canUseYunbo(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(64604);
    if ((be.a(paramContext).a()) && (QbSdk.canUseVideoFeatrue(paramContext, 1)))
      AppMethodBeat.o(64604);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(64604);
    }
  }

  public static void openVideo(Context paramContext, String paramString)
  {
    AppMethodBeat.i(64600);
    openVideo(paramContext, paramString, null);
    AppMethodBeat.o(64600);
  }

  public static void openVideo(Context paramContext, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(64601);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(64601);
    while (true)
    {
      return;
      Bundle localBundle = paramBundle;
      if (paramBundle == null)
        localBundle = new Bundle();
      localBundle.putString("videoUrl", paramString);
      paramString = new Intent("com.tencent.smtt.tbs.video.PLAY");
      paramString.setFlags(268435456);
      paramString.setPackage(paramContext.getPackageName());
      paramString.putExtra("extraData", localBundle);
      paramContext.startActivity(paramString);
      AppMethodBeat.o(64601);
    }
  }

  public static boolean openYunboVideo(Context paramContext, String paramString, Bundle paramBundle, b paramb)
  {
    AppMethodBeat.i(64602);
    boolean bool;
    if (canUseYunbo(paramContext))
    {
      bool = be.a(paramContext).a(paramString, paramBundle, paramb);
      AppMethodBeat.o(64602);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(64602);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsVideo
 * JD-Core Version:    0.6.2
 */
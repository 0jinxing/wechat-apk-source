package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public final class a extends r
{
  private final a.a vaQ;
  private final Intent vaR;
  private final w vaS;

  public a(Bundle paramBundle)
  {
    AppMethodBeat.i(125813);
    this.vaS = new w();
    if ((paramBundle == null) || (paramBundle.getParcelable("key_target_intent") == null))
    {
      this.vaQ = a.a.vaU;
      if (this.vaQ != a.a.vaU)
        break label106;
      this.vaR = null;
      AppMethodBeat.o(125813);
    }
    while (true)
    {
      return;
      a.a locala = a.a.Ko(paramBundle.getInt("key_map_app", a.a.vaU.code));
      if (a(ah.getContext(), locala, null) == null)
      {
        this.vaQ = a.a.vaU;
        break;
      }
      this.vaQ = locala;
      break;
      label106: this.vaR = ((Intent)paramBundle.getParcelable("key_target_intent"));
      AppMethodBeat.o(125813);
    }
  }

  private static ResolveInfo a(Context paramContext, a.a parama, Intent paramIntent)
  {
    AppMethodBeat.i(125814);
    Intent localIntent = paramIntent;
    if (paramIntent == null)
      localIntent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%f,%f", new Object[] { Float.valueOf(0.0F), Float.valueOf(0.0F) })));
    paramContext = paramContext.getPackageManager().queryIntentActivities(localIntent, 0);
    if (bo.ek(paramContext))
    {
      AppMethodBeat.o(125814);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      paramIntent = paramContext.iterator();
      while (true)
        if (paramIntent.hasNext())
        {
          paramContext = (ResolveInfo)paramIntent.next();
          if ((paramContext != null) && (paramContext.activityInfo != null) && (parama.getPackage().equals(paramContext.activityInfo.packageName)))
          {
            AppMethodBeat.o(125814);
            break;
          }
        }
      AppMethodBeat.o(125814);
      paramContext = null;
    }
  }

  public final String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    AppMethodBeat.i(125818);
    paramContext = this.vaS.a(paramContext, paramResolveInfo);
    AppMethodBeat.o(125818);
    return paramContext;
  }

  public final boolean aix(String paramString)
  {
    AppMethodBeat.i(125816);
    boolean bool = this.vaQ.getPackage().equals(paramString);
    AppMethodBeat.o(125816);
    return bool;
  }

  public final String anK()
  {
    if (this.vaQ == a.a.vaU);
    for (String str = "http://softroute.map.qq.com/downloadfile?cid=00008&referer=wx_client"; ; str = null)
      return str;
  }

  public final String dgX()
  {
    if (this.vaQ == a.a.vaU);
    for (String str = "TencentMap.apk"; ; str = null)
      return str;
  }

  public final s.a dgY()
  {
    AppMethodBeat.i(125817);
    s.a locala;
    if (this.vaQ == a.a.vaU)
    {
      locala = this.vaS.dgY();
      AppMethodBeat.o(125817);
    }
    while (true)
    {
      return locala;
      locala = new s.a();
      locala.vbF = -1;
      locala.vbC = -1;
      ResolveInfo localResolveInfo = a(ah.getContext(), this.vaQ, this.vaR);
      if (localResolveInfo != null)
        locala.vbG = a(ah.getContext(), localResolveInfo);
      AppMethodBeat.o(125817);
    }
  }

  public final boolean fE(Context paramContext)
  {
    AppMethodBeat.i(125815);
    boolean bool;
    if (this.vaQ == a.a.vaU)
    {
      bool = this.vaS.fE(paramContext);
      AppMethodBeat.o(125815);
    }
    while (true)
    {
      return bool;
      if (a(paramContext, this.vaQ, this.vaR) != null)
      {
        bool = true;
        AppMethodBeat.o(125815);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(125815);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.a
 * JD-Core Version:    0.6.2
 */
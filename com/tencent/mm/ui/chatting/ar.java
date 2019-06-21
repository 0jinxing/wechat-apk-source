package com.tencent.mm.ui.chatting;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.GetMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.GetMessageFromWX.Resp;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.q;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ar
  implements ab
{
  private static l<ab, Bundle> yMP;
  private a cgL;
  private MMFragment yMN;
  private final Set<String> yMO;

  static
  {
    AppMethodBeat.i(31085);
    yMP = new ar.1();
    AppMethodBeat.o(31085);
  }

  public ar(a parama)
  {
    AppMethodBeat.i(31076);
    this.yMO = new HashSet();
    this.yMN = parama.yTx;
    AppMethodBeat.o(31076);
  }

  private q.a a(WXMediaMessage paramWXMediaMessage, f paramf)
  {
    AppMethodBeat.i(31083);
    paramWXMediaMessage = new ar.2(this, paramWXMediaMessage, paramf);
    AppMethodBeat.o(31083);
    return paramWXMediaMessage;
  }

  public static void a(ar paramar)
  {
    AppMethodBeat.i(31080);
    yMP.a(paramar, null);
    AppMethodBeat.o(31080);
  }

  public static void az(Bundle paramBundle)
  {
    AppMethodBeat.i(31077);
    yMP.cF(paramBundle);
    yMP.doNotify();
    AppMethodBeat.o(31077);
  }

  @TargetApi(9)
  private static void b(Context paramContext, Set<String> paramSet)
  {
    AppMethodBeat.i(31084);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramSet != null)
    {
      localObject2 = localObject1;
      if (paramSet.size() > 0)
      {
        localObject2 = new StringBuilder();
        paramSet = paramSet.iterator();
        while (paramSet.hasNext())
        {
          ((StringBuilder)localObject2).append((String)paramSet.next());
          ((StringBuilder)localObject2).append(";");
        }
        localObject2 = ((StringBuilder)localObject2).toString();
      }
    }
    paramContext = paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doD(), 0).edit();
    paramContext.putString("transactions_array_key", (String)localObject2);
    if (Build.VERSION.SDK_INT > 8)
    {
      paramContext.apply();
      AppMethodBeat.o(31084);
    }
    while (true)
    {
      return;
      paramContext.commit();
      AppMethodBeat.o(31084);
    }
  }

  public static void b(ar paramar)
  {
    AppMethodBeat.i(31081);
    yMP.remove(paramar);
    paramar.yMO.clear();
    b(paramar.yMN.getContext(), null);
    AppMethodBeat.o(31081);
  }

  private String p(f paramf)
  {
    AppMethodBeat.i(31082);
    paramf = this.yMN.getString(2131298424, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(this.yMN.getContext(), paramf, null) });
    AppMethodBeat.o(31082);
    return paramf;
  }

  public final void ay(Bundle paramBundle)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(31078);
    if (!this.cgL.caA)
    {
      com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.WXAppMessageReceiver", "handleResp Chatting is a fragment but not foregound");
      AppMethodBeat.o(31078);
    }
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    while (true)
    {
      return;
      localObject1 = Uri.parse(paramBundle.getString("_mmessage_content")).getQueryParameter("appid");
      localObject2 = new GetMessageFromWX.Resp(paramBundle);
      paramBundle = ((GetMessageFromWX.Resp)localObject2).message;
      if (this.yMO.size() == 0)
      {
        localObject3 = this.yMN.getContext();
        localObject4 = new HashSet();
        localObject3 = ((Context)localObject3).getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doD(), 0).getString("transactions_array_key", null);
        if ((localObject3 != null) && (((String)localObject3).length() > 0))
        {
          localObject3 = ((String)localObject3).split(";");
          int k = localObject3.length;
          for (m = 0; m < k; m++)
            ((Set)localObject4).add(localObject3[m]);
        }
        this.yMO.addAll((Collection)localObject4);
      }
      if (!this.yMO.contains(((GetMessageFromWX.Resp)localObject2).transaction))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.WXAppMessageReceiver", "invalid resp, check transaction failed, transaction=" + ((GetMessageFromWX.Resp)localObject2).transaction);
        AppMethodBeat.o(31078);
      }
      else
      {
        this.yMO.remove(((GetMessageFromWX.Resp)localObject2).transaction);
        b(this.yMN.getContext(), this.yMO);
        localObject2 = new f();
        ((f)localObject2).field_appId = ((String)localObject1);
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WXAppMessageReceiver", "handleResp, appId = ".concat(String.valueOf(localObject1)));
        if (am.bYJ().b((com.tencent.mm.sdk.e.c)localObject2, new String[0]))
          break;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.WXAppMessageReceiver", "unregistered app, ignore request, appId = ".concat(String.valueOf(localObject1)));
        AppMethodBeat.o(31078);
      }
    }
    int m = paramBundle.getType();
    switch (m)
    {
    case 6:
    default:
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.WXAppMessageReceiver", "unknown type = ".concat(String.valueOf(m)));
      m = 0;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      while (true)
      {
        if (m == 0)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.WXAppMessageReceiver", "deal fail, result is false");
        AppMethodBeat.o(31078);
        break;
        localObject1 = this.yMN.getController();
        localObject4 = paramBundle.description;
        p((f)localObject2);
        if (com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject1, (String)localObject4, false, a(paramBundle, (f)localObject2)) != null);
        for (m = 1; ; m = 0)
          break;
        if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
        {
          localObject1 = this.yMN.getController();
          localObject4 = paramBundle.thumbData;
          p((f)localObject2);
          paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject1, (byte[])localObject4, false, a(paramBundle, (f)localObject2));
          if (paramBundle != null)
            break label662;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.WXAppMessageReceiver", "showDialogItem3 fail, invalid argument");
        }
        for (m = j; ; m = 1)
        {
          break;
          localObject4 = (WXImageObject)paramBundle.mediaObject;
          if ((((WXImageObject)localObject4).imageData != null) && (((WXImageObject)localObject4).imageData.length > 0))
          {
            localObject1 = this.yMN.getController();
            localObject4 = ((WXImageObject)localObject4).imageData;
            p((f)localObject2);
            paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject1, (byte[])localObject4, false, a(paramBundle, (f)localObject2));
            break label534;
          }
          localObject1 = this.yMN.getController();
          localObject4 = ((WXImageObject)localObject4).imagePath;
          p((f)localObject2);
          paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.b((q)localObject1, (String)localObject4, false, a(paramBundle, (f)localObject2));
          break label534;
        }
        if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
        {
          localObject1 = this.yMN.getController();
          localObject4 = paramBundle.title;
          p((f)localObject2);
        }
        for (paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject1, (String)localObject4, false, 2, a(paramBundle, (f)localObject2)); ; paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject4, 2131230800, (String)localObject1, false, a(paramBundle, (f)localObject2)))
        {
          m = i;
          if (paramBundle != null)
            break;
          m = 0;
          break;
          localObject4 = this.yMN.getController();
          localObject1 = paramBundle.title;
          p((f)localObject2);
        }
        if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
        {
          localObject1 = this.yMN.getController();
          localObject4 = paramBundle.title;
          p((f)localObject2);
        }
        for (paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject1, (String)localObject4, false, 1, a(paramBundle, (f)localObject2)); ; paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject4, 2131230817, (String)localObject1, false, a(paramBundle, (f)localObject2)))
        {
          m = i;
          if (paramBundle != null)
            break;
          m = 0;
          break;
          localObject4 = this.yMN.getController();
          localObject1 = paramBundle.title;
          p((f)localObject2);
        }
        localObject3 = this.yMN.getController();
        localObject1 = paramBundle.title;
        localObject4 = paramBundle.description;
        p((f)localObject2);
        m = i;
        if (com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject3, (String)localObject1, (String)localObject4, a(paramBundle, (f)localObject2)) == null)
          m = 0;
      }
    case 7:
      label534: if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
      {
        localObject1 = this.yMN.getController();
        localObject4 = paramBundle.title;
        p((f)localObject2);
      }
      label662: for (paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject1, (String)localObject4, false, 0, a(paramBundle, (f)localObject2)); ; paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject1, 2131230820, (String)localObject4, false, a(paramBundle, (f)localObject2)))
      {
        m = i;
        if (paramBundle != null)
          break;
        m = 0;
        break;
        localObject1 = this.yMN.getController();
        localObject4 = paramBundle.title;
        p((f)localObject2);
      }
    case 8:
    }
    if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
    {
      localObject4 = this.yMN.getController();
      localObject1 = paramBundle.thumbData;
      p((f)localObject2);
    }
    for (paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject4, (byte[])localObject1, false, a(paramBundle, (f)localObject2)); ; paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((q)localObject1, 2131230820, (String)localObject4, false, a(paramBundle, (f)localObject2)))
    {
      m = i;
      if (paramBundle != null)
        break;
      m = 0;
      break;
      localObject1 = this.yMN.getController();
      localObject4 = paramBundle.title;
      p((f)localObject2);
    }
  }

  public final boolean im(String paramString1, String paramString2)
  {
    AppMethodBeat.i(31079);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WXAppMessageReceiver", "request, pkg = " + paramString1 + ", openId = " + paramString2);
    GetMessageFromWX.Req localReq = new GetMessageFromWX.Req();
    localReq.username = this.cgL.getTalkerUserName();
    localReq.transaction = com.tencent.mm.a.g.x(com.tencent.mm.platformtools.ah.anU().getBytes());
    localReq.openId = paramString2;
    paramString2 = this.yMN.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0);
    this.yMN.getContext();
    localReq.lang = aa.g(paramString2);
    aw.ZK();
    localReq.country = ((String)com.tencent.mm.model.c.Ry().get(274436, null));
    Bundle localBundle = new Bundle();
    localReq.toBundle(localBundle);
    p.at(localBundle);
    p.au(localBundle);
    paramString2 = new MMessageActV2.Args();
    paramString2.targetPkgName = paramString1;
    paramString2.bundle = localBundle;
    boolean bool = MMessageActV2.send(this.yMN.getContext(), paramString2);
    this.yMO.add(localReq.transaction);
    b(this.yMN.getContext(), this.yMO);
    AppMethodBeat.o(31079);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ar
 * JD-Core Version:    0.6.2
 */
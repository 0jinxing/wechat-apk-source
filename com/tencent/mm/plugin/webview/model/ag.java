package com.tencent.mm.plugin.webview.model;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Resp;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.protocal.protobuf.bew;
import com.tencent.mm.protocal.protobuf.bum;
import com.tencent.mm.protocal.protobuf.buo;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.LinkedList;

public final class ag
{
  private String hzR;
  public String mAppId;
  private Context mContext;
  private String mUH;
  String nep;
  private boolean ump;
  boolean umq = false;

  public ag(Context paramContext, String paramString1, String paramString2)
  {
    this.mContext = paramContext;
    this.umq = true;
    this.mAppId = paramString1;
    this.mUH = paramString2;
  }

  public ag(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.mContext = paramContext;
    this.mAppId = paramString1;
    this.nep = paramString2;
    this.hzR = paramString3;
    this.ump = false;
  }

  private boolean II(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(6691);
    if ((paramInt == 1) || (paramInt == 2) || (paramInt == 7) || (paramInt == 8))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SDKOauthUtil", "isNetworkAvailable false, errType = ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(6691);
    }
    while (true)
    {
      return bool;
      if (!at.isConnected(this.mContext))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SDKOauthUtil", "isNetworkAvailable false, not connected");
        AppMethodBeat.o(6691);
      }
      else
      {
        AppMethodBeat.o(6691);
        bool = true;
      }
    }
  }

  private void Ml(final String paramString)
  {
    AppMethodBeat.i(6686);
    h.a(this.mContext, paramString, this.mContext.getString(2131305621), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(6677);
        ag localag;
        String str;
        if (!ag.this.umq)
        {
          localag = ag.this;
          str = paramString;
          paramAnonymousDialogInterface = ag.aer(localag.mAppId);
          if (bo.isNullOrNil(paramAnonymousDialogInterface))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SDKOauthUtil", "dealWithError pkg nil");
            AppMethodBeat.o(6677);
          }
        }
        while (true)
        {
          return;
          SendAuth.Resp localResp = new SendAuth.Resp();
          localResp.transaction = localag.nep;
          localResp.errCode = -1;
          localResp.errStr = str;
          localResp.lang = localag.cXI();
          localResp.country = ag.getCountry();
          localag.a(paramAnonymousDialogInterface, localResp);
          AppMethodBeat.o(6677);
        }
      }
    });
    AppMethodBeat.o(6686);
  }

  public static void a(buo parambuo, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(6694);
    if (d("snsapi_userinfo", parambuo.wIK) != null)
    {
      paramLinkedList.add("snsapi_userinfo");
      AppMethodBeat.o(6694);
    }
    while (true)
    {
      return;
      if (d("snsapi_login", parambuo.wIK) != null)
      {
        paramLinkedList.add("snsapi_login");
        AppMethodBeat.o(6694);
      }
      else
      {
        paramLinkedList.add("group_sns_login");
        AppMethodBeat.o(6694);
      }
    }
  }

  public static void a(LinkedList<String> paramLinkedList, int paramInt, String paramString)
  {
    AppMethodBeat.i(6682);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramLinkedList.size(); i++)
      localStringBuilder.append((String)paramLinkedList.get(i)).append(",");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOauthUtil", "doQRCodeOauthAuthorizeConfirm selectedScopes: %s", new Object[] { localStringBuilder.toString() });
    paramLinkedList = new z(1, paramString, paramLinkedList, paramInt);
    com.tencent.mm.kernel.g.Rg().a(paramLinkedList, 0);
    AppMethodBeat.o(6682);
  }

  public static boolean a(buo parambuo)
  {
    AppMethodBeat.i(6693);
    boolean bool;
    if ((d("snsapi_userinfo", parambuo.wIK) != null) || (d("snsapi_login", parambuo.wIK) != null) || (d("group_sns_login", parambuo.wIK) != null))
    {
      bool = true;
      AppMethodBeat.o(6693);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(6693);
    }
  }

  static String aer(String paramString)
  {
    AppMethodBeat.i(6688);
    Object localObject = null;
    f localf = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, false);
    if (localf != null);
    for (paramString = localf.field_packageName; ; paramString = localObject)
    {
      AppMethodBeat.o(6688);
      return paramString;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SDKOauthUtil", "dealWithCancel getAppInfo null; appid: %s", new Object[] { paramString });
    }
  }

  public static void ag(Activity paramActivity)
  {
    AppMethodBeat.i(6692);
    al.n(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(6678);
        this.ghG.finish();
        AppMethodBeat.o(6678);
      }
    }
    , 500L);
    AppMethodBeat.o(6692);
  }

  public static bew d(String paramString, LinkedList<bew> paramLinkedList)
  {
    AppMethodBeat.i(6684);
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      paramLinkedList = (bew)localIterator.next();
      if (paramString.equals(paramLinkedList.scope))
      {
        AppMethodBeat.o(6684);
        paramString = paramLinkedList;
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(6684);
    }
  }

  static String getCountry()
  {
    AppMethodBeat.i(6689);
    String str = bo.bc((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null), null);
    AppMethodBeat.o(6689);
    return str;
  }

  public final void IH(int paramInt)
  {
    AppMethodBeat.i(6685);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOauthUtil", "dealWithCancel");
    Object localObject1;
    if (this.umq)
    {
      localObject1 = new z(2, this.mUH, null, 0);
      com.tencent.mm.kernel.g.Rg().a((m)localObject1, 0);
      ((MMActivity)this.mContext).finish();
      AppMethodBeat.o(6685);
    }
    while (true)
    {
      return;
      localObject1 = aer(this.mAppId);
      Object localObject2 = new ab(2, this.mAppId, this.hzR, (String)localObject1, null);
      com.tencent.mm.kernel.g.Rg().a((m)localObject2, 0);
      localObject2 = new SendAuth.Resp();
      ((SendAuth.Resp)localObject2).transaction = this.nep;
      ((SendAuth.Resp)localObject2).errCode = paramInt;
      ((SendAuth.Resp)localObject2).lang = cXI();
      ((SendAuth.Resp)localObject2).country = getCountry();
      a((String)localObject1, (SendAuth.Resp)localObject2);
      ((MMActivity)this.mContext).finish();
      AppMethodBeat.o(6685);
    }
  }

  final void a(String paramString, SendAuth.Resp paramResp)
  {
    AppMethodBeat.i(6687);
    if (this.ump)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOauthUtil", "doCallback has callback");
      AppMethodBeat.o(6687);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(6687);
      }
      else
      {
        this.ump = true;
        Bundle localBundle = new Bundle();
        paramResp.toBundle(localBundle);
        com.tencent.mm.pluginsdk.model.app.p.at(localBundle);
        paramResp = new MMessageActV2.Args();
        paramResp.targetPkgName = paramString;
        paramResp.bundle = localBundle;
        MMessageActV2.send(this.mContext, paramResp);
        AppMethodBeat.o(6687);
      }
    }
  }

  public final void aB(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(6679);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramLinkedList.size(); i++)
      localStringBuilder.append((String)paramLinkedList.get(i)).append(",");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOauthUtil", "doSDKOauthAuthorizeConfirm selectedScopes: %s", new Object[] { localStringBuilder.toString() });
    paramLinkedList = new ab(1, this.mAppId, this.hzR, aer(this.mAppId), paramLinkedList);
    com.tencent.mm.kernel.g.Rg().a(paramLinkedList, 0);
    AppMethodBeat.o(6679);
  }

  final String cXI()
  {
    AppMethodBeat.i(6690);
    String str = aa.g(this.mContext.getSharedPreferences(ah.doA(), 0));
    AppMethodBeat.o(6690);
    return str;
  }

  public final void h(LinkedList<String> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(6680);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramLinkedList.size(); i++)
      localStringBuilder.append((String)paramLinkedList.get(i)).append(",");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOauthUtil", "doSDKOauthAuthorizeConfirm selectedScopes: %s", new Object[] { localStringBuilder.toString() });
    paramLinkedList = new ab(this.mAppId, this.hzR, aer(this.mAppId), paramLinkedList, paramInt);
    com.tencent.mm.kernel.g.Rg().a(paramLinkedList, 0);
    AppMethodBeat.o(6680);
  }

  public final void j(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    Object localObject = null;
    AppMethodBeat.i(6681);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOauthUtil", "onSDKOauthAuthorizeConfirmEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    String str1;
    String str2;
    SendAuth.Resp localResp;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      str1 = ((ab)paramm).cXC().vGi;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOauthUtil", "dealWithLoginCallback url : %s", new Object[] { str1 });
      str2 = aer(this.mAppId);
      if (bo.isNullOrNil(str2))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SDKOauthUtil", "dealWithLoginCallback pkg nil");
        AppMethodBeat.o(6681);
        return;
      }
      localResp = new SendAuth.Resp();
      localResp.transaction = this.nep;
      localResp.lang = cXI();
      localResp.country = getCountry();
      if (bo.isNullOrNil(str1))
        break label372;
    }
    label372: for (paramString = Uri.parse(str1); ; paramString = null)
    {
      paramm = localObject;
      if (paramString != null)
      {
        paramm = paramString.getQueryParameter("code");
        localResp.state = paramString.getQueryParameter("state");
        localResp.errStr = paramString.getQueryParameter("reason");
      }
      if (bo.isNullOrNil(paramm))
        localResp.errCode = -1;
      while (true)
      {
        localResp.url = str1;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOauthUtil", "dealWithLoginCallback, pkg:%s code:%s errCode:%d state:%s", new Object[] { str2, localResp.code, Integer.valueOf(localResp.errCode), localResp.state });
        a(str2, localResp);
        ((MMActivity)this.mContext).finish();
        AppMethodBeat.o(6681);
        break;
        if (paramm.toLowerCase().equals("authdeny"))
        {
          localResp.errCode = -4;
        }
        else
        {
          localResp.errCode = 0;
          localResp.code = paramm;
        }
      }
      if (!II(paramInt1))
      {
        Ml(this.mContext.getString(2131305622));
        AppMethodBeat.o(6681);
        break;
      }
      Ml(paramString);
      AppMethodBeat.o(6681);
      break;
    }
  }

  public final void z(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(6683);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SDKOauthUtil", "onQRCodeOauthAuthorizeConfirmEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ((MMActivity)this.mContext).finish();
      AppMethodBeat.o(6683);
    }
    while (true)
    {
      return;
      if (!II(paramInt1))
      {
        Ml(this.mContext.getString(2131305622));
        AppMethodBeat.o(6683);
      }
      else
      {
        Ml(paramString);
        AppMethodBeat.o(6683);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ag
 * JD-Core Version:    0.6.2
 */
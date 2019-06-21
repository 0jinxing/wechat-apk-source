package com.tencent.mm.plugin.webview.luggage.permission;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.adp;
import com.tencent.mm.protocal.protobuf.atp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LuggageGetA8Key
{
  private static final Pattern ule;
  private int gOW;
  private String igi;
  private String mAppId;
  private final HashSet<String> ukW;
  private byte[] ukX;
  private int ukY;
  private boolean ukZ;
  private boolean ula;
  private a ulb;
  private final HashMap<String, String> ulc;
  public LuggageGetA8Key.RunCgiTask uld;

  static
  {
    AppMethodBeat.i(6480);
    ule = Pattern.compile(".*#.*wechat_redirect");
    AppMethodBeat.o(6480);
  }

  public LuggageGetA8Key()
  {
    AppMethodBeat.i(6467);
    this.ukW = new HashSet();
    this.gOW = 0;
    this.igi = "";
    this.mAppId = "";
    this.ukX = new byte[0];
    this.ukZ = true;
    this.ula = false;
    this.ulc = new HashMap();
    this.ukY = ((int)System.currentTimeMillis());
    this.ulb = new a();
    AppMethodBeat.o(6467);
  }

  private static void a(String paramString, adp paramadp, LuggageGetA8Key.a parama)
  {
    AppMethodBeat.i(6477);
    int i = paramadp.vAS;
    String str = paramadp.ncM;
    Object localObject = paramadp.wlJ;
    HashMap localHashMap = new HashMap();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        atp localatp = (atp)((Iterator)localObject).next();
        localHashMap.put(localatp.vMU, localatp.pXM);
      }
    }
    switch (i)
    {
    case 3:
    case 4:
    case 5:
    default:
      AppMethodBeat.o(6477);
    case 1:
    case 2:
    case 7:
    case 6:
    }
    while (true)
    {
      return;
      if ((str == null) || (str.length() == 0))
      {
        ab.e("MicroMsg.LuggageGetA8Key", "getA8key-text fail, invalid content");
        AppMethodBeat.o(6477);
      }
      else
      {
        parama.ha(paramString, str);
        AppMethodBeat.o(6477);
        continue;
        parama.e(paramString, paramadp.wly, localHashMap);
        AppMethodBeat.o(6477);
        continue;
        parama.e(paramString, paramadp.wly, localHashMap);
        AppMethodBeat.o(6477);
      }
    }
  }

  private static String aef(String paramString)
  {
    AppMethodBeat.i(6476);
    int i = paramString.indexOf("#");
    if (i < 0)
      AppMethodBeat.o(6476);
    while (true)
    {
      return paramString;
      paramString = paramString.substring(0, i);
      AppMethodBeat.o(6476);
    }
  }

  private static boolean gs(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean gt(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 4) && (paramInt2 == -2005));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean a(String paramString, int paramInt, LuggageGetA8Key.a parama)
  {
    while (true)
      try
      {
        AppMethodBeat.i(6474);
        boolean bool;
        if (aem(paramString))
        {
          AppMethodBeat.o(6474);
          bool = true;
          return bool;
        }
        Object localObject1 = this.ulb;
        int i;
        if (bo.isNullOrNil(paramString))
        {
          ab.e("MicroMsg.LuggageGetA8KeyPermission", "has fail, url is null");
          i = 0;
          if (i != 0)
          {
            AppMethodBeat.o(6474);
            bool = false;
          }
        }
        else
        {
          Object localObject2 = a.aef(paramString);
          localObject2 = (a.a)((a)localObject1).ulm.get(localObject2);
          if ((localObject2 != null) && (((a.a)localObject2).ulr != ((a)localObject1).ulp) && (((a.a)localObject2).uls != ((a)localObject1).ulq))
          {
            i = 1;
            continue;
            if ((paramInt == 5) && (this.ula))
            {
              ab.w("MicroMsg.LuggageGetA8Key", "disable iframe request");
              AppMethodBeat.o(6474);
              bool = false;
            }
            else
            {
              this.ukW.add(paramString);
              if (parama != null)
                parama.NN(paramString);
              if (this.uld != null)
              {
                this.uld.aBW();
                this.uld = null;
                ab.i("MicroMsg.LuggageGetA8Key", "runCgiTask set null: %s", new Object[] { paramString });
              }
              if (paramInt == -1)
              {
                paramInt = ael(paramString);
                ab.i("MicroMsg.LuggageGetA8Key", "startGetA8Key, url: %s", new Object[] { paramString });
                try
                {
                  localObject1 = new com/tencent/mm/plugin/webview/luggage/permission/LuggageGetA8Key$RunCgiTask;
                  ((LuggageGetA8Key.RunCgiTask)localObject1).<init>(paramString, this.igi, this.gOW, paramInt, this.ukY, this.mAppId, this.ukX);
                  this.uld = ((LuggageGetA8Key.RunCgiTask)localObject1);
                  localObject2 = this.uld;
                  localObject1 = new com/tencent/mm/plugin/webview/luggage/permission/LuggageGetA8Key$1;
                  ((LuggageGetA8Key.1)localObject1).<init>(this, paramString, paramInt, parama);
                  ((LuggageGetA8Key.RunCgiTask)localObject2).ulj = ((Runnable)localObject1);
                  AppBrandMainProcessService.a(this.uld);
                  AppMethodBeat.o(6474);
                  bool = true;
                }
                catch (Exception paramString)
                {
                  ab.i("MicroMsg.LuggageGetA8Key", "ERROR %s", new Object[] { paramString });
                  AppMethodBeat.o(6474);
                  bool = false;
                }
              }
            }
          }
        }
      }
      finally
      {
      }
  }

  public final boolean a(String paramString, LuggageGetA8Key.a parama)
  {
    try
    {
      AppMethodBeat.i(6475);
      boolean bool = a(paramString, -1, parama);
      AppMethodBeat.o(6475);
      return bool;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final JsapiPermissionWrapper aei(String paramString)
  {
    AppMethodBeat.i(6468);
    paramString = this.ulb.aei(paramString);
    AppMethodBeat.o(6468);
    return paramString;
  }

  public final GeneralControlWrapper aej(String paramString)
  {
    AppMethodBeat.i(6469);
    paramString = this.ulb.aej(paramString);
    AppMethodBeat.o(6469);
    return paramString;
  }

  public final String aek(String paramString)
  {
    AppMethodBeat.i(6471);
    synchronized (this.ulc)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("getShareUrl, dropHashUrl = ");
      ab.i("MicroMsg.LuggageGetA8Key", aef(paramString));
      localObject = this.ulc.keySet().iterator();
      if (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        ab.i("MicroMsg.LuggageGetA8Key", "getShareUrl, Key = %s, value = %s", new Object[] { str, this.ulc.get(str) });
      }
    }
    paramString = (String)this.ulc.get(aef(paramString));
    AppMethodBeat.o(6471);
    return paramString;
  }

  public final int ael(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(6472);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.LuggageGetA8Key", "getReason fail, url is null");
      AppMethodBeat.o(6472);
    }
    while (true)
    {
      return i;
      if (this.ukZ)
      {
        this.ukZ = false;
        AppMethodBeat.o(6472);
      }
      else if (ule.matcher(paramString).find())
      {
        i = 2;
        AppMethodBeat.o(6472);
      }
      else
      {
        i = 1;
        AppMethodBeat.o(6472);
      }
    }
  }

  public final boolean aem(String paramString)
  {
    AppMethodBeat.i(6473);
    boolean bool = this.ukW.contains(paramString);
    AppMethodBeat.o(6473);
    return bool;
  }

  public final boolean dA(String paramString, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(6470);
    if (aei(paramString).Lx(paramInt) == 1)
      AppMethodBeat.o(6470);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(6470);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key
 * JD-Core Version:    0.6.2
 */
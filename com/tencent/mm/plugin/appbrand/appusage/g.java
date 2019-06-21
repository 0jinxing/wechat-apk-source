package com.tencent.mm.plugin.appbrand.appusage;

import a.l;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCInteger;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.sdk.e.k;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageIPC;", "Lcom/tencent/mm/sdk/storage/MStorage;", "Lcom/tencent/mm/plugin/appbrand/appusage/IAppBrandCollectionStorage;", "()V", "addCollection", "", "username", "", "versionType", "getCount", "getCountLimit", "isCollection", "", "query", "", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "count", "order", "Lcom/tencent/mm/plugin/appbrand/appusage/IAppBrandCollectionStorage$ORDER;", "refreshOnPullDownOpen", "", "removeCollection", "reorder", "reorderList", "reason", "plugin-appbrand-integration_release"})
public final class g extends k
  implements af
{
  public final List<LocalUsageInfo> a(int paramInt, af.a parama)
  {
    AppMethodBeat.i(134534);
    Parcel localParcel = (Parcel)XIPCInvoker.a("com.tencent.mm", new QueryParams(paramInt, parama), aj.class);
    if (localParcel != null)
    {
      parama = new ArrayList();
      localParcel.readTypedList((List)parama, LocalUsageInfo.CREATOR);
      parama = (List)parama;
      AppMethodBeat.o(134534);
    }
    while (true)
    {
      return parama;
      parama = (List)new ArrayList(0);
      AppMethodBeat.o(134534);
    }
  }

  public final boolean aB(String paramString, int paramInt)
  {
    AppMethodBeat.i(134533);
    CharSequence localCharSequence = (CharSequence)paramString;
    int i;
    boolean bool;
    if ((localCharSequence == null) || (localCharSequence.length() == 0))
    {
      i = 1;
      if (i == 0)
        break label48;
      AppMethodBeat.o(134533);
      bool = false;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label48: paramString = (IPCBoolean)XIPCInvoker.a("com.tencent.mm", new AppIdentity(paramString, paramInt), ah.class);
      if (paramString != null)
      {
        bool = paramString.value;
        AppMethodBeat.o(134533);
      }
      else
      {
        AppMethodBeat.o(134533);
        bool = false;
      }
    }
  }

  public final int aC(String paramString, int paramInt)
  {
    AppMethodBeat.i(134531);
    CharSequence localCharSequence = (CharSequence)paramString;
    int i;
    if ((localCharSequence == null) || (localCharSequence.length() == 0))
    {
      i = 1;
      if (i == 0)
        break label46;
      AppMethodBeat.o(134531);
      paramInt = -1;
    }
    while (true)
    {
      return paramInt;
      i = 0;
      break;
      label46: paramString = (IPCInteger)XIPCInvoker.a("com.tencent.mm", new AppIdentity(paramString, paramInt), a.class);
      if (paramString != null)
      {
        paramInt = paramString.value;
        AppMethodBeat.o(134531);
      }
      else
      {
        AppMethodBeat.o(134531);
        paramInt = -1;
      }
    }
  }

  public final boolean aD(String paramString, int paramInt)
  {
    AppMethodBeat.i(134532);
    CharSequence localCharSequence = (CharSequence)paramString;
    int i;
    boolean bool;
    if ((localCharSequence == null) || (localCharSequence.length() == 0))
    {
      i = 1;
      if (i == 0)
        break label48;
      AppMethodBeat.o(134532);
      bool = false;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label48: paramString = (IPCBoolean)XIPCInvoker.a("com.tencent.mm", new AppIdentity(paramString, paramInt), ak.class);
      if (paramString != null)
      {
        bool = paramString.value;
        AppMethodBeat.o(134532);
      }
      else
      {
        AppMethodBeat.o(134532);
        bool = false;
      }
    }
  }

  public final void awX()
  {
  }

  public final int awY()
  {
    AppMethodBeat.i(134536);
    IPCInteger localIPCInteger = (IPCInteger)XIPCInvoker.a("com.tencent.mm", IPCVoid.eGH, ai.class);
    int i;
    if (localIPCInteger != null)
    {
      i = localIPCInteger.value;
      AppMethodBeat.o(134536);
    }
    while (true)
    {
      return i;
      i = t.axI();
      AppMethodBeat.o(134536);
    }
  }

  public final boolean g(List<LocalUsageInfo> paramList, int paramInt)
  {
    return false;
  }

  public final int getCount()
  {
    AppMethodBeat.i(134535);
    IPCInteger localIPCInteger = (IPCInteger)XIPCInvoker.a("com.tencent.mm", IPCVoid.eGH, ac.class);
    int i;
    if (localIPCInteger != null)
    {
      i = localIPCInteger.value;
      AppMethodBeat.o(134535);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(134535);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.g
 * JD-Core Version:    0.6.2
 */
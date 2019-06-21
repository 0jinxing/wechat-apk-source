package com.tencent.mm.plugin.webview.luggage.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.adl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  Map<String, a.a> ulm;
  private JsapiPermissionWrapper uln;
  private GeneralControlWrapper ulo;
  final JsapiPermissionWrapper ulp;
  final GeneralControlWrapper ulq;

  public a()
  {
    AppMethodBeat.i(6482);
    this.ulm = new HashMap();
    this.ulp = new JsapiPermissionWrapper(2);
    this.ulq = GeneralControlWrapper.vxF;
    this.uln = null;
    if ((ae.giu == null) || (ae.giu.length() == 0))
    {
      ab.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
      this.ulo = null;
      if ((ae.giv != null) && (ae.giv.length() != 0))
        break label227;
      ab.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
    }
    while (true)
    {
      int i;
      while (true)
      {
        ab.i("MicroMsg.LuggageGetA8KeyPermission", "hardcodeJsPerm = " + null + ", hardcodeGenCtrl = " + null);
        AppMethodBeat.o(6482);
        return;
        try
        {
          i = bo.getInt(ae.giu, 0);
          if (i < 0)
            ab.w("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
        }
        catch (Exception localException1)
        {
          ab.e("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + localException1.getMessage());
          this.uln = null;
        }
      }
      Object localObject;
      while (true)
      {
        ab.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.uln);
        break;
        localObject = new com/tencent/mm/protocal/JsapiPermissionWrapper;
        ((JsapiPermissionWrapper)localObject).<init>(i);
        this.uln = ((JsapiPermissionWrapper)localObject);
      }
      try
      {
        label227: i = bo.getInt(ae.giv, 0);
        ab.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, permission = %d", new Object[] { Integer.valueOf(i) });
        localObject = new com/tencent/mm/protocal/protobuf/adl;
        ((adl)localObject).<init>();
        ((adl)localObject).wli = i;
        GeneralControlWrapper localGeneralControlWrapper = new com/tencent/mm/protocal/GeneralControlWrapper;
        localGeneralControlWrapper.<init>((adl)localObject);
        this.ulo = localGeneralControlWrapper;
        ab.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.ulo);
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.e("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl fail, ex = %s", new Object[] { localException2.getMessage() });
          this.ulo = null;
        }
      }
    }
  }

  static String aef(String paramString)
  {
    AppMethodBeat.i(6486);
    int i = paramString.indexOf("#");
    if (i < 0)
      AppMethodBeat.o(6486);
    while (true)
    {
      return paramString;
      paramString = paramString.substring(0, i);
      AppMethodBeat.o(6486);
    }
  }

  public final void a(String paramString, JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
  {
    AppMethodBeat.i(6483);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.LuggageGetA8KeyPermission", "update fail, url is null");
      AppMethodBeat.o(6483);
    }
    while (true)
    {
      return;
      paramString = aef(paramString);
      ab.i("MicroMsg.LuggageGetA8KeyPermission", "edw update, jsPerm = " + paramJsapiPermissionWrapper + ", genCtrl = " + paramGeneralControlWrapper + ", url = " + paramString);
      this.ulm.put(paramString, new a.a(paramJsapiPermissionWrapper, paramGeneralControlWrapper));
      AppMethodBeat.o(6483);
    }
  }

  public final JsapiPermissionWrapper aei(String paramString)
  {
    AppMethodBeat.i(6484);
    if (this.uln != null)
    {
      ab.i("MicroMsg.LuggageGetA8KeyPermission", "getJsPerm, return hardcodeJsPerm = " + this.uln);
      paramString = this.uln;
      AppMethodBeat.o(6484);
    }
    while (true)
    {
      return paramString;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.LuggageGetA8KeyPermission", "getJsPerm fail, url = ".concat(String.valueOf(paramString)));
        paramString = this.ulp;
        AppMethodBeat.o(6484);
      }
      else
      {
        paramString = aef(paramString);
        if (this.ulm == null)
        {
          ab.e("MicroMsg.LuggageGetA8KeyPermission", "getJsPerm fail, permMap is null");
          paramString = this.ulp;
          AppMethodBeat.o(6484);
        }
        else
        {
          paramString = (a.a)this.ulm.get(paramString);
          if (paramString == null)
          {
            paramString = this.ulp;
            AppMethodBeat.o(6484);
          }
          else
          {
            paramString = paramString.ulr;
            AppMethodBeat.o(6484);
          }
        }
      }
    }
  }

  public final GeneralControlWrapper aej(String paramString)
  {
    AppMethodBeat.i(6485);
    if (this.ulo != null)
    {
      ab.i("MicroMsg.LuggageGetA8KeyPermission", "getGenCtrl, return hardcodeGenCtrl = " + this.ulo);
      paramString = this.ulo;
      AppMethodBeat.o(6485);
    }
    while (true)
    {
      return paramString;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.LuggageGetA8KeyPermission", "getGenCtrl fail, url = ".concat(String.valueOf(paramString)));
        paramString = this.ulq;
        AppMethodBeat.o(6485);
      }
      else
      {
        String str = aef(paramString);
        a.a locala = (a.a)this.ulm.get(str);
        StringBuilder localStringBuilder = new StringBuilder("edw getGenCtrl, genCtrl = ");
        if (locala == null);
        for (paramString = null; ; paramString = locala.uls)
        {
          ab.i("MicroMsg.LuggageGetA8KeyPermission", paramString + ", url = " + str);
          if (locala != null)
            break label170;
          paramString = this.ulq;
          AppMethodBeat.o(6485);
          break;
        }
        label170: paramString = locala.uls;
        AppMethodBeat.o(6485);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.permission.a
 * JD-Core Version:    0.6.2
 */
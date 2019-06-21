package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.webview.modeltools.c;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.adl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class k
{
  Map<String, k.a> ulm;
  private JsapiPermissionWrapper uln;
  private GeneralControlWrapper ulo;
  private final JsapiPermissionWrapper ulp;
  private final GeneralControlWrapper ulq;
  private k.b utR;

  public k(JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper, k.b paramb)
  {
    AppMethodBeat.i(7688);
    this.ulp = new JsapiPermissionWrapper(2);
    this.ulq = GeneralControlWrapper.vxF;
    this.uln = paramJsapiPermissionWrapper;
    if ((ae.giu == null) || (ae.giu.length() == 0))
    {
      ab.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
      this.ulo = paramGeneralControlWrapper;
      if ((ae.giv != null) && (ae.giv.length() != 0))
        break label240;
      ab.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
    }
    while (true)
    {
      int i;
      while (true)
      {
        this.utR = paramb;
        ab.i("MicroMsg.WebViewPermission", "edw <init> hardcodeJsPerm = " + paramJsapiPermissionWrapper + ", hardcodeGenCtrl = " + paramGeneralControlWrapper);
        this.ulm = new HashMap();
        AppMethodBeat.o(7688);
        return;
        try
        {
          i = bo.getInt(ae.giu, 0);
          if (i < 0)
            ab.w("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
        }
        catch (Exception localException1)
        {
          ab.e("MicroMsg.WebViewPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + localException1.getMessage());
          this.uln = null;
        }
      }
      Object localObject;
      while (true)
      {
        ab.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.uln);
        break;
        localObject = new com/tencent/mm/protocal/JsapiPermissionWrapper;
        ((JsapiPermissionWrapper)localObject).<init>(i);
        this.uln = ((JsapiPermissionWrapper)localObject);
      }
      try
      {
        label240: i = bo.getInt(ae.giv, 0);
        ab.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, permission = %d", new Object[] { Integer.valueOf(i) });
        adl localadl = new com/tencent/mm/protocal/protobuf/adl;
        localadl.<init>();
        localadl.wli = i;
        localObject = new com/tencent/mm/protocal/GeneralControlWrapper;
        ((GeneralControlWrapper)localObject).<init>(localadl);
        this.ulo = ((GeneralControlWrapper)localObject);
        ab.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.ulo);
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.e("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl fail, ex = %s", new Object[] { localException2.getMessage() });
          this.ulo = null;
        }
      }
    }
  }

  private static String aef(String paramString)
  {
    AppMethodBeat.i(7695);
    int i = paramString.indexOf("#");
    if (i < 0)
      AppMethodBeat.o(7695);
    while (true)
    {
      return paramString;
      paramString = paramString.substring(0, i);
      AppMethodBeat.o(7695);
    }
  }

  private GeneralControlWrapper aej(String paramString)
  {
    AppMethodBeat.i(7694);
    if (this.ulo != null)
    {
      ab.i("MicroMsg.WebViewPermission", "getGenCtrl, return hardcodeGenCtrl = " + this.ulo);
      paramString = this.ulo;
      AppMethodBeat.o(7694);
    }
    while (true)
    {
      return paramString;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.WebViewPermission", "getGenCtrl fail, url = ".concat(String.valueOf(paramString)));
        paramString = this.ulq;
        AppMethodBeat.o(7694);
      }
      else
      {
        String str = aef(paramString);
        k.a locala = (k.a)this.ulm.get(str);
        StringBuilder localStringBuilder = new StringBuilder("edw getGenCtrl, genCtrl = ");
        if (locala == null);
        for (paramString = null; ; paramString = locala.uls)
        {
          ab.i("MicroMsg.WebViewPermission", paramString + ", url = " + str);
          if (locala != null)
            break label170;
          paramString = this.ulq;
          AppMethodBeat.o(7694);
          break;
        }
        label170: paramString = locala.uls;
        AppMethodBeat.o(7694);
      }
    }
  }

  public final void a(String paramString, JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(7689);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WebViewPermission", "update fail, url is null");
      AppMethodBeat.o(7689);
    }
    while (true)
    {
      return;
      if (paramGeneralControlWrapper != null)
      {
        bool1 = bool2;
        if ((paramGeneralControlWrapper.vxG & 0x80000) != 0)
          bool1 = true;
        ab.d("MicroMsg.GeneralControlWrapper", "needClearData, ret = ".concat(String.valueOf(bool1)));
      }
      c.bF(paramString, bool1);
      String str = aef(paramString);
      paramString = paramJsapiPermissionWrapper;
      if (paramJsapiPermissionWrapper == null)
        paramString = this.ulp;
      paramJsapiPermissionWrapper = paramGeneralControlWrapper;
      if (paramGeneralControlWrapper == null)
        paramJsapiPermissionWrapper = this.ulq;
      ab.i("MicroMsg.WebViewPermission", "edw update, jsPerm = " + paramString + ", genCtrl = " + paramJsapiPermissionWrapper + ", url = " + str);
      this.ulm.put(str, new k.a(paramString, paramJsapiPermissionWrapper));
      AppMethodBeat.o(7689);
    }
  }

  public final JsapiPermissionWrapper aei(String paramString)
  {
    AppMethodBeat.i(7692);
    if (this.uln != null)
    {
      ab.i("MicroMsg.WebViewPermission", "getJsPerm, return hardcodeJsPerm = " + this.uln);
      paramString = this.uln;
      AppMethodBeat.o(7692);
    }
    while (true)
    {
      return paramString;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.WebViewPermission", "getJsPerm fail, url = ".concat(String.valueOf(paramString)));
        paramString = this.ulp;
        AppMethodBeat.o(7692);
      }
      else
      {
        paramString = aef(paramString);
        if (this.ulm == null)
        {
          ab.e("MicroMsg.WebViewPermission", "getJsPerm fail, permMap is null");
          paramString = this.ulp;
          AppMethodBeat.o(7692);
        }
        else
        {
          paramString = (k.a)this.ulm.get(paramString);
          if (paramString == null)
          {
            paramString = this.ulp;
            AppMethodBeat.o(7692);
          }
          else
          {
            paramString = paramString.ulr;
            AppMethodBeat.o(7692);
          }
        }
      }
    }
  }

  public final JsapiPermissionWrapper cZS()
  {
    AppMethodBeat.i(7691);
    if (this.uln != null)
    {
      ab.i("MicroMsg.WebViewPermission", "getJsPerm, return hardcodeJsPerm = " + this.uln);
      localObject = this.uln;
      AppMethodBeat.o(7691);
      return localObject;
    }
    if (this.utR != null);
    for (Object localObject = this.utR.aYj(); ; localObject = null)
    {
      localObject = aei((String)localObject);
      AppMethodBeat.o(7691);
      break;
    }
  }

  public final GeneralControlWrapper cZT()
  {
    AppMethodBeat.i(7693);
    if (this.utR != null);
    for (Object localObject = this.utR.aYj(); ; localObject = null)
    {
      localObject = aej((String)localObject);
      AppMethodBeat.o(7693);
      return localObject;
    }
  }

  public final boolean has(String paramString)
  {
    AppMethodBeat.i(7690);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WebViewPermission", "has fail, url is null");
      AppMethodBeat.o(7690);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramString = aef(paramString);
      paramString = (k.a)this.ulm.get(paramString);
      if ((paramString != null) && (paramString.ulr != this.ulp) && (paramString.uls != this.ulq))
      {
        bool = true;
        AppMethodBeat.o(7690);
      }
      else
      {
        AppMethodBeat.o(7690);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.k
 * JD-Core Version:    0.6.2
 */
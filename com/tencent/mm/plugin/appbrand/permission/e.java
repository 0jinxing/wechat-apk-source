package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.k.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import junit.framework.Assert;

public class e
{
  private static final HashMap<Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b>, Integer> iwJ;
  private static final HashMap<Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b>, String> iwK;
  private static final String[] iwR;
  private final i gPI;
  private final int iwL;
  private final boolean iwM;
  private final LinkedList<e.b> iwN;
  public final Object iwO;
  private AppRuntimeApiPermissionBundle iwP;
  public List<e.c> iwQ;

  static
  {
    AppMethodBeat.i(102302);
    iwJ = new HashMap();
    iwK = new HashMap();
    iwR = new String[] { "createSocketTask", "createDownloadTask", "createRequestTask", "createUploadTask" };
    AppMethodBeat.o(102302);
  }

  public e(i parami, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(102294);
    this.iwN = new LinkedList();
    this.iwQ = new ArrayList();
    this.gPI = parami;
    this.iwO = new byte[0];
    this.iwL = paramInt;
    this.iwM = paramBoolean;
    a((AppRuntimeApiPermissionBundle)parami.aa(AppRuntimeApiPermissionBundle.class));
    parami.gNN.a(new e.1(this));
    AppMethodBeat.o(102294);
  }

  private int a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, com.tencent.mm.plugin.appbrand.jsapi.b paramb, String paramString)
  {
    AppMethodBeat.i(102285);
    int i = a(paramc, paramb, paramString, true);
    AppMethodBeat.o(102285);
    return i;
  }

  private int a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b> paramClass)
  {
    AppMethodBeat.i(102287);
    int i = a(paramc, paramClass, null, ai(paramClass), true);
    AppMethodBeat.o(102287);
    return i;
  }

  private int a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b> paramClass, String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(102288);
    int i = this.iwL;
    String str1 = paramc.getAppId();
    if (i == -1)
    {
      ab.d("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlByte, appId = %s, ctrlIndex = %d, hard code perm on", new Object[] { str1, Integer.valueOf(paramInt) });
      paramInt = 1;
      AppMethodBeat.o(102288);
    }
    String str2;
    while (true)
    {
      return paramInt;
      if (i == -2)
      {
        ab.d("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlByte, appId = %s, ctrlIndex = %d, hard code perm off", new Object[] { str1, Integer.valueOf(paramInt) });
        paramInt = 0;
        AppMethodBeat.o(102288);
      }
      else if ((paramClass.isAssignableFrom(p.class)) && ((paramc instanceof u)))
      {
        paramInt = 1;
        AppMethodBeat.o(102288);
      }
      else
      {
        str2 = aj(paramClass);
        i = c.c(paramc, str2, paramString);
        if (i == -2147483648)
          break;
        AppMethodBeat.o(102288);
        paramInt = i;
      }
    }
    paramString = z(paramc);
    int j = E(paramString, paramInt);
    if (paramBoolean)
    {
      paramc = (g)paramc.B(g.class);
      if ((paramc != null) && (paramc.ak(paramClass)))
        break label274;
    }
    label274: for (i = 1; ; i = 0)
    {
      if (i != 0)
        ab.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "getCtrlByte, appId = %s, apiName = %s, ctrlIndex = %d, ctrlIndexLength %d, checkRet %d", new Object[] { str1, str2, Integer.valueOf(paramInt), Integer.valueOf(paramString.length), Integer.valueOf(j) });
      AppMethodBeat.o(102288);
      paramInt = j;
      break;
    }
  }

  private void a(e.b paramb)
  {
    AppMethodBeat.i(102298);
    if (paramb == null)
      AppMethodBeat.o(102298);
    while (true)
    {
      return;
      synchronized (this.iwN)
      {
        this.iwN.addLast(paramb);
        AppMethodBeat.o(102298);
      }
    }
  }

  private AppRuntimeApiPermissionBundle aKx()
  {
    synchronized (this.iwO)
    {
      AppRuntimeApiPermissionBundle localAppRuntimeApiPermissionBundle = this.iwP;
      return localAppRuntimeApiPermissionBundle;
    }
  }

  private static int ai(Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b> paramClass)
  {
    AppMethodBeat.i(102292);
    Integer localInteger = (Integer)iwJ.get(paramClass);
    int i;
    if (localInteger != null)
    {
      i = localInteger.intValue();
      AppMethodBeat.o(102292);
    }
    while (true)
    {
      return i;
      try
      {
        i = ((Integer)org.a.a.be(paramClass).get("CTRL_INDEX")).intValue();
        iwJ.put(paramClass, Integer.valueOf(i));
        AppMethodBeat.o(102292);
      }
      catch (org.a.b localb)
      {
        while (true)
        {
          Assert.assertTrue("Must declare CTRL_INDEX in JsApi Class: " + paramClass.getName(), true);
          i = -1;
        }
      }
    }
  }

  private static String aj(Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b> paramClass)
  {
    AppMethodBeat.i(102293);
    String str = (String)iwK.get(paramClass);
    if (!bo.isNullOrNil(str))
    {
      AppMethodBeat.o(102293);
      paramClass = str;
    }
    while (true)
    {
      return paramClass;
      try
      {
        str = (String)org.a.a.be(paramClass).get("NAME");
        iwK.put(paramClass, str);
        AppMethodBeat.o(102293);
        paramClass = str;
      }
      catch (org.a.b localb)
      {
        Assert.assertTrue("Must declare NAME in JsApi Class: " + paramClass.getName(), true);
        paramClass = paramClass.getSimpleName();
        AppMethodBeat.o(102293);
      }
    }
  }

  private void b(AppRuntimeApiPermissionBundle paramAppRuntimeApiPermissionBundle)
  {
    AppMethodBeat.i(102296);
    byte[] arrayOfByte = paramAppRuntimeApiPermissionBundle.iwG;
    paramAppRuntimeApiPermissionBundle = paramAppRuntimeApiPermissionBundle.iwH;
    for (int i = 0; i < this.iwQ.size(); i++)
      ((e.c)this.iwQ.get(i)).f(arrayOfByte, paramAppRuntimeApiPermissionBundle);
    AppMethodBeat.o(102296);
  }

  public final int E(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 1;
    int j = this.iwL;
    if (j == -1)
      j = i;
    while (true)
    {
      return j;
      if (j == -2)
      {
        j = 0;
      }
      else
      {
        j = i;
        if (paramInt != -2)
          if (paramInt == -1)
          {
            j = i;
            if (!this.iwM)
              j = 0;
          }
          else if ((paramInt >= paramArrayOfByte.length) || (paramInt < 0))
          {
            j = 0;
          }
          else
          {
            j = paramArrayOfByte[paramInt];
          }
      }
    }
  }

  public final int a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, com.tencent.mm.plugin.appbrand.jsapi.b paramb, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(102286);
    int i = a(paramc, paramb.getClass(), paramString, ai(paramb.getClass()), paramBoolean);
    AppMethodBeat.o(102286);
    return i;
  }

  public final e.a a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, com.tencent.mm.plugin.appbrand.jsapi.b paramb, String paramString, e.b paramb1)
  {
    AppMethodBeat.i(102299);
    if ((paramb == null) || (paramc == null))
    {
      paramc = e.a.aKz();
      AppMethodBeat.o(102299);
    }
    while (true)
    {
      return paramc;
      com.tencent.mm.plugin.appbrand.b.b localb = this.gPI.gNN.gWy.awz();
      int i = a(paramc, paramb, paramString);
      paramString = paramc.getAppId();
      if (i == 6)
      {
        ((f)paramc.B(f.class)).Dq(paramb.getName());
        paramc = e.a.aKz();
        AppMethodBeat.o(102299);
      }
      else if (i == 1)
      {
        if (((paramc instanceof q)) && (localb == com.tencent.mm.plugin.appbrand.b.b.gWv) && (com.tencent.mm.compatible.loader.a.contains(iwR, paramb.getName())))
        {
          paramc = new e.a(-1, String.format(Locale.US, "fail: jsapi has no permission, event=%s, runningState=%s, permissionMsg=%s, detail=%s", new Object[] { paramb.getName(), localb.name().toLowerCase(), "permission ok", "network api interrupted in suspend state" }));
          AppMethodBeat.o(102299);
        }
        else
        {
          paramc = e.a.aKy();
          AppMethodBeat.o(102299);
        }
      }
      else if (i == 4)
      {
        if (d.cK(paramString, paramb.getName()))
        {
          paramc = e.a.aKy();
          AppMethodBeat.o(102299);
        }
        else if (d.a((h)paramc, paramb.getName()))
        {
          paramc = e.a.aKy();
          AppMethodBeat.o(102299);
        }
        else
        {
          d.a((h)paramc, paramb.getName(), new e.2(this, paramb1));
          paramc = e.a.aKC();
          AppMethodBeat.o(102299);
        }
      }
      else if (i == 7)
      {
        if (this.gPI.gNN.awx())
        {
          paramc = e.a.aKy();
          AppMethodBeat.o(102299);
        }
        else
        {
          paramc = new e.a(-1, String.format(Locale.US, "fail: jsapi has no permission, event=%s, runningState=%s, permissionMsg=%s, detail=%s", new Object[] { paramb.getName(), localb.name().toLowerCase(), "permission ok", "jsapi permission required playing audio but current not playing audio in background state" }));
          AppMethodBeat.o(102299);
        }
      }
      else if (i == 8)
      {
        a(paramb1);
        paramc = e.a.aKC();
        AppMethodBeat.o(102299);
      }
      else
      {
        paramc = e.a.aKz();
        AppMethodBeat.o(102299);
      }
    }
  }

  public final void a(AppRuntimeApiPermissionBundle paramAppRuntimeApiPermissionBundle)
  {
    AppMethodBeat.i(102295);
    if (paramAppRuntimeApiPermissionBundle == null)
      AppMethodBeat.o(102295);
    while (true)
    {
      return;
      synchronized (this.iwO)
      {
        AppRuntimeApiPermissionBundle localAppRuntimeApiPermissionBundle = this.iwP;
        this.iwP = paramAppRuntimeApiPermissionBundle;
        b(this.iwP);
        ab.i("MicroMsg.AppRuntimeApiPermissionController[permission]", "updatePermission old %s, updated %s", new Object[] { localAppRuntimeApiPermissionBundle, paramAppRuntimeApiPermissionBundle });
        AppMethodBeat.o(102295);
      }
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, com.tencent.mm.plugin.appbrand.jsapi.b paramb)
  {
    AppMethodBeat.i(102291);
    boolean bool;
    if (a(paramc, paramb, null, null).ret == 0)
    {
      bool = true;
      AppMethodBeat.o(102291);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(102291);
    }
  }

  public final Vector<byte[]> aKw()
  {
    AppMethodBeat.i(102297);
    synchronized (this.iwO)
    {
      if (this.iwP == null)
      {
        localObject2 = null;
        AppMethodBeat.o(102297);
        return localObject2;
      }
      byte[] arrayOfByte1 = this.iwP.iwG;
      byte[] arrayOfByte2 = this.iwP.iwH;
      byte[] arrayOfByte3 = this.iwP.iwI;
      Object localObject2 = new Vector(3);
      ((Vector)localObject2).addElement(arrayOfByte1);
      ((Vector)localObject2).addElement(arrayOfByte2);
      ((Vector)localObject2).addElement(arrayOfByte3);
      AppMethodBeat.o(102297);
    }
  }

  @Deprecated
  public final boolean b(com.tencent.mm.plugin.appbrand.jsapi.c paramc, Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b> paramClass)
  {
    boolean bool = true;
    AppMethodBeat.i(102290);
    if (a(paramc, paramClass) == 1)
      AppMethodBeat.o(102290);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(102290);
    }
  }

  public final byte[] z(com.tencent.mm.plugin.appbrand.jsapi.c paramc)
  {
    AppMethodBeat.i(102289);
    int i = this.iwL;
    if (i == -1)
    {
      paramc = new byte[1];
      paramc[0] = ((byte)1);
      AppMethodBeat.o(102289);
    }
    while (true)
    {
      return paramc;
      if (i != -2)
        break;
      paramc = new byte[1];
      paramc[0] = ((byte)0);
      AppMethodBeat.o(102289);
    }
    AppRuntimeApiPermissionBundle localAppRuntimeApiPermissionBundle = aKx();
    if ((paramc instanceof q))
      switch (e.3.gWN[this.gPI.gNN.gWy.awz().ordinal()])
      {
      default:
        paramc = localAppRuntimeApiPermissionBundle.iwG;
      case 1:
      case 2:
      case 3:
      }
    while (true)
    {
      AppMethodBeat.o(102289);
      break;
      paramc = localAppRuntimeApiPermissionBundle.iwH;
      continue;
      paramc = localAppRuntimeApiPermissionBundle.iwG;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.e
 * JD-Core Version:    0.6.2
 */
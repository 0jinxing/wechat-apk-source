package com.tencent.mm.plugin.appbrand.game.a;

import a.aa;
import a.f;
import a.f.b.j;
import a.k.m;
import a.l;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/game/config/WAGameDynamicConfig;", "T", "", "()V", "mConfigMemory", "Ljava/lang/Object;", "askRestart", "", "context", "Landroid/content/Context;", "message", "", "enableABTest", "Lcom/tencent/mm/plugin/expt/api/IExptService$ExptEnum;", "enableAlert", "", "enableKv", "getConfig", "()Ljava/lang/Object;", "getConfigDefaultValue", "getConfigImpl", "getConfigLocalStorage", "onProcessConfig", "input", "(Ljava/lang/String;)Ljava/lang/Object;", "onProcessConfigBoolean", "(Ljava/lang/String;)Ljava/lang/Boolean;", "onProcessConfigFloat", "", "(Ljava/lang/String;)Ljava/lang/Float;", "onProcessConfigInt", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "onProcessConfigLong", "", "(Ljava/lang/String;)Ljava/lang/Long;", "processCommand", "value", "removeConfigLocalStorage", "setConfigLocalStorage", "(Ljava/lang/Object;)V", "Companion", "plugin-appbrand-integration_release"})
public abstract class g<T>
{
  private static final f hqT = a.g.g((a.f.a.a)g.b.hqV);
  public static final g.a hqU = new g.a((byte)0);
  private T hqS;

  protected static Boolean Ar(String paramString)
  {
    if (paramString == null)
      paramString = null;
    while (true)
    {
      return paramString;
      if ("true".contentEquals((CharSequence)paramString))
      {
        paramString = Boolean.TRUE;
      }
      else if ("false".contentEquals((CharSequence)paramString))
      {
        paramString = Boolean.FALSE;
      }
      else
      {
        paramString = m.awy(paramString);
        if (paramString != null)
        {
          if (paramString.intValue() > 0)
            paramString = Boolean.TRUE;
          else if ((paramString.intValue() == 0) || (paramString.intValue() == -1))
            paramString = Boolean.FALSE;
          else
            throw ((Throwable)new IllegalStateException("Ambiguity name"));
        }
        else
          paramString = null;
      }
    }
  }

  private static void W(Context paramContext, String paramString)
  {
    new AlertDialog.Builder(paramContext).setTitle((CharSequence)"").setMessage((CharSequence)paramString).setNegativeButton((CharSequence)"cancel", null).setPositiveButton((CharSequence)"restart", (DialogInterface.OnClickListener)g.c.hqW).show();
  }

  public static final void a(Context paramContext, String[] paramArrayOfString)
  {
    g.a.a(paramContext, paramArrayOfString);
  }

  protected abstract T Ap(String paramString);

  public T Uw()
  {
    Object localObject = this.hqS;
    if (localObject != null)
      return localObject;
    if (aAy() != null)
    {
      localObject = as.amF("WAGameDynamicConfig").amH("WAGameDynamicConfig" + aAy());
      if (localObject == null)
      {
        localObject = null;
        label52: if (localObject == null)
          break label80;
        ab.i("WAGameDynamicConfig", "hit localstorage");
      }
    }
    while (true)
    {
      this.hqS = localObject;
      break;
      localObject = Ap((String)localObject);
      break label52;
      label80: if (aAz() != null)
      {
        localObject = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(aAz(), "");
        if (localObject != null)
        {
          localObject = Ap((String)localObject);
          if (localObject != null)
            ab.i("WAGameDynamicConfig", "hit ABTest");
        }
      }
      else
      {
        localObject = aAB();
      }
    }
  }

  public final void V(Context paramContext, String paramString)
  {
    int i = 1;
    int j = 1;
    j.p(paramContext, "context");
    if (aAy() != null);
    for (int k = 1; (aa.AUz) && (k == 0); k = 0)
      throw ((Throwable)new AssertionError("Assertion failed"));
    Object localObject = Ap(paramString);
    if (localObject == null)
    {
      if (aAy() != null);
      for (k = 1; (aa.AUz) && (k == 0); k = 0)
        throw ((Throwable)new AssertionError("Assertion failed"));
      paramString = as.amF("WAGameDynamicConfig");
      paramString.remove("WAGameDynamicConfig" + aAy());
      paramString.commit();
      if (!paramString.containsKey("WAGameDynamicConfig" + aAy()));
      for (k = j; (aa.AUz) && (k == 0); k = 0)
        throw ((Throwable)new AssertionError("Assertion failed"));
      ab.i("WAGameDynamicConfig", "dl: remove localstorage config");
      if (aAA())
        W(paramContext, "config[" + aAy() + "] removed");
    }
    while (true)
    {
      return;
      if (aAy() != null);
      for (k = i; (aa.AUz) && (k == 0); k = 0)
        throw ((Throwable)new AssertionError("Assertion failed"));
      as localas = as.amF("WAGameDynamicConfig");
      localas.encode("WAGameDynamicConfig" + aAy(), String.valueOf(localObject));
      localas.commit();
      ab.i("WAGameDynamicConfig", "dl: set localstorage config ".concat(String.valueOf(paramString)));
      if (aAA())
        W(paramContext, "config[" + aAy() + "] set to " + localObject);
    }
  }

  protected boolean aAA()
  {
    return true;
  }

  public abstract T aAB();

  protected String aAy()
  {
    return null;
  }

  protected a.a aAz()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.a.g
 * JD-Core Version:    0.6.2
 */
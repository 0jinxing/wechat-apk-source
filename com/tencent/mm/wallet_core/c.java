package com.tencent.mm.wallet_core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.r;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.lang.ref.WeakReference;

public abstract class c
{
  public WeakReference<Context> AeT = new WeakReference(null);
  protected WeakReference<c.a> Jq;
  public Bundle mqu = new Bundle();

  private static String cY(Object paramObject)
  {
    if (paramObject == null)
      paramObject = "";
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof Bundle))
        paramObject = String.format("Bundle: %s, ", new Object[] { paramObject.toString() });
      else if ((paramObject instanceof Context))
        paramObject = String.format("Context: %s, ", new Object[] { paramObject.toString() });
      else if ((paramObject instanceof Class))
        paramObject = String.format("Class: %s, ", new Object[] { ((Class)paramObject).getSimpleName() });
      else
        paramObject = String.format("Value: %s, ", new Object[] { paramObject.toString() });
    }
  }

  private String s(Object[] paramArrayOfObject)
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(String.format("this %s, procname %s", new Object[] { this, bxP() }));
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
      ab.w("MicroMsg.ProcessManager", "vals is null, use '' as value");
    for (paramArrayOfObject = localStringBuilder.toString(); ; paramArrayOfObject = localStringBuilder.toString())
    {
      return paramArrayOfObject;
      int j = paramArrayOfObject.length - 1;
      while (i < j)
      {
        localStringBuilder.append(cY(paramArrayOfObject[i])).append(',');
        i++;
      }
      localStringBuilder.append(cY(paramArrayOfObject[j]));
    }
  }

  public void F(Activity paramActivity)
  {
    F(new Object[] { "finishActivity", paramActivity });
    if ((!paramActivity.isFinishing()) && ((paramActivity instanceof MMActivity)))
      ((MMActivity)paramActivity).finish();
  }

  public final void F(Object[] paramArrayOfObject)
  {
    ab.i("MicroMsg.ProcessManager", "__CURRENT__ %s", new Object[] { s(paramArrayOfObject) });
  }

  public int a(MMActivity paramMMActivity, int paramInt)
  {
    return -1;
  }

  public c a(Activity paramActivity, Bundle paramBundle)
  {
    return this;
  }

  public com.tencent.mm.wallet_core.d.g a(MMActivity paramMMActivity, i parami)
  {
    return null;
  }

  public abstract void a(Activity paramActivity, int paramInt, Bundle paramBundle);

  protected final void a(Activity paramActivity, Class<?> paramClass, int paramInt)
  {
    b(paramActivity, paramClass, null, paramInt);
  }

  protected final void a(Activity paramActivity, Class<?> paramClass, int paramInt, Intent paramIntent, boolean paramBoolean)
  {
    F(new Object[] { "endProcess2", paramActivity, paramClass, Integer.valueOf(paramInt), paramIntent, Boolean.valueOf(paramBoolean) });
    if (this.Jq.get() != null)
      paramIntent = ((c.a)this.Jq.get()).n(paramInt, this.mqu);
    while (true)
    {
      Intent localIntent;
      if (paramIntent != null)
      {
        localIntent = paramIntent;
        if (paramIntent.getExtras() != null)
        {
          localIntent = paramIntent;
          if (!paramIntent.getExtras().containsKey("key_process_is_stay"))
          {
            paramIntent.putExtra("key_process_is_stay", true);
            localIntent = paramIntent;
          }
        }
      }
      while (true)
      {
        if (paramClass != null)
          localIntent.setClass(paramActivity, paramClass);
        localIntent.addFlags(67108864);
        localIntent.putExtra("key_process_is_end", true);
        paramActivity.startActivity(localIntent);
        if (this.mqu != null)
          this.mqu.clear();
        a.remove(getClass().hashCode());
        return;
        localIntent = new Intent(paramActivity, paramClass);
        localIntent.putExtra("key_process_is_stay", paramBoolean);
      }
    }
  }

  protected final void a(Activity paramActivity, Class<?> paramClass, int paramInt, boolean paramBoolean)
  {
    a(paramActivity, paramClass, paramInt, null, paramBoolean);
  }

  protected final void a(Activity paramActivity, Class<?> paramClass, Intent paramIntent)
  {
    a(paramActivity, paramClass, -1, paramIntent, true);
  }

  public final void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle, int paramInt)
  {
    F(new Object[] { "startActivityForResult1", paramActivity, paramClass, paramBundle, Integer.valueOf(paramInt) });
    paramClass = new Intent(paramActivity, paramClass);
    paramClass.putExtra("process_id", getClass().hashCode());
    paramClass.addFlags(67108864);
    paramActivity.startActivityForResult(paramClass, paramInt);
    if (paramBundle != null)
      this.mqu.putAll(paramBundle);
  }

  public final void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle1, Bundle paramBundle2)
  {
    F(new Object[] { "startActivity1", paramActivity, paramClass, paramBundle1 });
    paramClass = new Intent(paramActivity, paramClass);
    paramClass.putExtra("process_id", getClass().hashCode());
    if (paramBundle2 != null)
    {
      paramClass.putExtras(paramBundle2);
      ab.d("MicroMsg.ProcessManager", "put bundle: %s", new Object[] { paramClass.getExtras().toString() });
    }
    paramActivity.startActivity(paramClass);
    if (paramBundle1 != null)
      this.mqu.putAll(paramBundle1);
    ab.d("MicroMsg.ProcessManager", "bankcard tag :" + dNE());
  }

  public final void a(Activity paramActivity, String paramString1, String paramString2, int paramInt, Intent paramIntent, boolean paramBoolean)
  {
    F(new Object[] { "endProcess3", paramActivity, paramString1, paramString2, Integer.valueOf(paramInt), paramIntent, Boolean.valueOf(paramBoolean) });
    Intent localIntent1 = null;
    if (this.Jq.get() != null)
      localIntent1 = ((c.a)this.Jq.get()).n(paramInt, this.mqu);
    Intent localIntent2;
    if (paramIntent != null)
    {
      localIntent2 = paramIntent;
      if (paramIntent.getExtras() != null)
      {
        localIntent2 = paramIntent;
        if (!paramIntent.getExtras().containsKey("key_process_is_stay"))
        {
          paramIntent.putExtra("key_process_is_stay", true);
          localIntent2 = paramIntent;
        }
      }
    }
    while (true)
    {
      if (localIntent1 != null)
        localIntent2.putExtras(localIntent1);
      localIntent2.addFlags(67108864);
      localIntent2.putExtra("key_process_is_end", true);
      d.b(paramActivity, paramString1, paramString2, localIntent2);
      if (this.mqu != null)
        this.mqu.clear();
      a.remove(getClass().hashCode());
      return;
      localIntent2 = new Intent();
      localIntent2.putExtra("key_process_is_stay", paramBoolean);
    }
  }

  protected final void a(Activity paramActivity, String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    a(paramActivity, paramString1, paramString2, paramInt, null, paramBoolean);
  }

  public final void a(Activity paramActivity, String paramString1, String paramString2, Bundle paramBundle)
  {
    F(new Object[] { "startActivity3", paramActivity, paramString1, paramString2, paramBundle });
    Class localClass = d.hM(paramString1, paramString2);
    if (localClass != null)
      b(paramActivity, localClass, paramBundle);
    while (true)
    {
      return;
      ab.e("MicroMsg.ProcessManager", " Class Not Found! can't startActivity to " + paramString1 + paramString2);
    }
  }

  public final void a(c.a parama, Context paramContext)
  {
    this.Jq = new WeakReference(parama);
    this.AeT = new WeakReference(paramContext);
  }

  public void a(WalletBaseUI paramWalletBaseUI)
  {
  }

  public boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    return false;
  }

  public final c aE(Bundle paramBundle)
  {
    this.mqu.putAll(paramBundle);
    return this;
  }

  public final void aF(Activity paramActivity)
  {
    F(new Object[] { "specEndProcess", paramActivity });
    if ((!paramActivity.isFinishing()) && ((paramActivity instanceof MMActivity)))
      ((MMActivity)paramActivity).finish();
    if (this.mqu != null)
      this.mqu.clear();
    a.remove(getClass().hashCode());
    cNF();
  }

  public final void aG(Activity paramActivity)
  {
    F(new Object[] { "endProcess1", paramActivity });
    if ((!paramActivity.isFinishing()) && ((paramActivity instanceof MMActivity)))
      ((MMActivity)paramActivity).finish();
    if (this.mqu != null)
      this.mqu.clear();
    a.remove(getClass().hashCode());
  }

  public abstract void b(Activity paramActivity, Bundle paramBundle);

  public final void b(Activity paramActivity, Class<?> paramClass, Bundle paramBundle)
  {
    F(new Object[] { "startActivity1", paramActivity, paramClass, paramBundle });
    paramClass = new Intent(paramActivity, paramClass);
    paramClass.putExtra("process_id", getClass().hashCode());
    paramActivity.startActivity(paramClass);
    if (paramBundle != null)
      this.mqu.putAll(paramBundle);
    ab.d("MicroMsg.ProcessManager", "bankcard tag :" + dNE());
  }

  protected final void b(Activity paramActivity, Class<?> paramClass, Bundle paramBundle, int paramInt)
  {
    F(new Object[] { "finishActivity", paramActivity, paramClass, "errCode ".concat(String.valueOf(paramInt)) });
    paramClass = new Intent(paramActivity, paramClass);
    paramClass.putExtra("process_id", getClass().hashCode());
    paramClass.addFlags(67108864);
    if (paramBundle != null)
      paramClass.putExtras(paramBundle);
    paramActivity.startActivity(paramClass);
    this.mqu.putInt("key_err_code", paramInt);
  }

  public void b(WalletBaseUI paramWalletBaseUI)
  {
  }

  public abstract String bxP();

  public abstract void c(Activity paramActivity, int paramInt);

  protected final void c(Activity paramActivity, Class<?> paramClass)
  {
    a(paramActivity, paramClass, -1, null, true);
  }

  public abstract boolean c(Activity paramActivity, Bundle paramBundle);

  public void cNF()
  {
  }

  public final boolean cRY()
  {
    return this.mqu.getBoolean("key_is_oversea", false);
  }

  protected final void d(Activity paramActivity, String paramString1, String paramString2)
  {
    a(paramActivity, paramString1, paramString2, -1, true);
  }

  public final void dND()
  {
    this.Jq = null;
    this.AeT = null;
  }

  public final int dNE()
  {
    return this.mqu.getInt("key_support_bankcard", 1);
  }

  public final boolean dNF()
  {
    boolean bool = false;
    if (this.mqu.getInt("key_pay_flag", 0) == 2)
      bool = true;
    return bool;
  }

  public final boolean dNG()
  {
    boolean bool = true;
    if (this.mqu.getInt("key_pay_flag", 0) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean dNH()
  {
    boolean bool = false;
    if (this.mqu.getInt("key_pay_flag", 0) == 3)
      bool = true;
    return bool;
  }

  public final boolean dNI()
  {
    boolean bool1 = false;
    String str = this.mqu.getString("key_bank_username");
    ab.i("MicroMsg.ProcessManager", "follow bank account : isFollow " + this.mqu.getBoolean("key_is_follow_bank_username", false) + ", username : " + str);
    boolean bool2 = bool1;
    if (this.mqu.getBoolean("key_is_follow_bank_username", false))
    {
      bool2 = bool1;
      if (!bo.isNullOrNil(str))
      {
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(new r(str), 0);
        bool2 = true;
      }
    }
    return bool2;
  }

  public boolean h(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }

  public final void l(Activity paramActivity, Bundle paramBundle)
  {
    F(new Object[] { "endProcess1", paramActivity });
    if ((!paramActivity.isFinishing()) && ((paramActivity instanceof MMActivity)))
      ((MMActivity)paramActivity).finish();
    if (this.Jq.get() != null)
      ((c.a)this.Jq.get()).n(0, paramBundle);
    if (paramBundle != null)
      paramBundle.clear();
    a.remove(getClass().hashCode());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.app;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.a;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.ao.c;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.e.b;

public final class v
{
  ApplicationLike cfk;
  volatile boolean cfl;
  boolean cfm;
  private ao.c cfn;
  private volatile boolean mInstalled;

  public v()
  {
    AppMethodBeat.i(115038);
    this.cfk = null;
    this.mInstalled = false;
    this.cfl = false;
    this.cfm = false;
    this.cfn = new ao.c()
    {
      public final void b(String arg1, Throwable paramAnonymousThrowable)
      {
        AppMethodBeat.i(115036);
        if (!b.c(v.this.cfk))
          AppMethodBeat.o(115036);
        while (true)
        {
          return;
          if ((!(paramAnonymousThrowable instanceof NoClassDefFoundError)) && (!(paramAnonymousThrowable instanceof VerifyError)) && (!(paramAnonymousThrowable instanceof IncompatibleClassChangeError)) && (!(paramAnonymousThrowable instanceof InternalError)))
          {
            AppMethodBeat.o(115036);
            continue;
          }
          if (!v.this.cfm)
          {
            AppMethodBeat.o(115036);
            continue;
          }
          paramAnonymousThrowable = v.this.cfk.getApplication().getSharedPreferences("tinker_ensurance_info", 4);
          synchronized (v.this)
          {
            int i;
            if (!v.this.cfl)
            {
              i = paramAnonymousThrowable.getInt("tinker_crash_count", 0);
              if (i > 3)
              {
                Object localObject = new java/lang/StringBuilder;
                ((StringBuilder)localObject).<init>();
                localObject = a.CLIENT_VERSION + "_clean_patch_count";
                i = paramAnonymousThrowable.getInt((String)localObject, 0);
                paramAnonymousThrowable.edit().putInt((String)localObject, i + 1).putInt("tinker_crash_count", 0).commit();
                b.e(v.this.cfk);
                ab.w("MicroMsg.TinkerEnsuranceOnFault", "[tomys] clean patch by ensurance logic!!");
                ab.dou();
              }
            }
            else
            {
              AppMethodBeat.o(115036);
              continue;
            }
            paramAnonymousThrowable.edit().putInt("tinker_crash_count", i + 1).commit();
          }
        }
      }
    };
    AppMethodBeat.o(115038);
  }

  private boolean BD()
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(115041);
      SharedPreferences localSharedPreferences = this.cfk.getApplication().getSharedPreferences("tinker_ensurance_info", 4);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      int i = localSharedPreferences.getInt(a.CLIENT_VERSION + "_clean_patch_count", 0);
      if (i > 0)
      {
        if (!bool)
          break label97;
        ab.w("MicroMsg.TinkerEnsuranceOnFault", "[tomys] ensurance logic says: we have cleaned patch by %s times !!", new Object[] { Integer.valueOf(i) });
      }
      while (true)
      {
        AppMethodBeat.o(115041);
        return bool;
        bool = false;
        break;
        label97: ab.i("MicroMsg.TinkerEnsuranceOnFault", "[tomys] ensurance logic says: clean patch logic is not being triggered.");
      }
    }
    finally
    {
    }
  }

  private boolean BE()
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(115042);
      SharedPreferences localSharedPreferences = this.cfk.getApplication().getSharedPreferences("tinker_ensurance_info", 4);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      if (localSharedPreferences.getInt(a.CLIENT_VERSION + "_clean_patch_reported", 0) != 0)
      {
        bool = true;
        AppMethodBeat.o(115042);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(115042);
      }
    }
    finally
    {
    }
  }

  private boolean BF()
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(115043);
      SharedPreferences localSharedPreferences = this.cfk.getApplication().getSharedPreferences("tinker_ensurance_info", 4);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      if (localSharedPreferences.getInt(a.CLIENT_VERSION + "_block_apply_patch_reported", 0) != 0)
      {
        bool = true;
        AppMethodBeat.o(115043);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(115043);
      }
    }
    finally
    {
    }
  }

  public final void BA()
  {
    try
    {
      this.cfl = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void BB()
  {
    try
    {
      this.cfl = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean BC()
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(115040);
      SharedPreferences localSharedPreferences = this.cfk.getApplication().getSharedPreferences("tinker_ensurance_info", 4);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      if (localSharedPreferences.getInt(a.CLIENT_VERSION + "_clean_patch_count", 0) <= 3)
        bool = true;
      if (bool)
        ab.i("MicroMsg.TinkerEnsuranceOnFault", "[tomys] ensurance logic says: we can apply patch.");
      while (true)
      {
        AppMethodBeat.o(115040);
        return bool;
        ab.w("MicroMsg.TinkerEnsuranceOnFault", "[tomys] ensurance logic says: we CANNOT apply patch !!");
      }
    }
    finally
    {
    }
  }

  public final void BG()
  {
    try
    {
      AppMethodBeat.i(115044);
      Object localObject1 = this.cfk.getApplication().getSharedPreferences("tinker_ensurance_info", 4);
      Object localObject2;
      if ((!BE()) && (BD()))
      {
        e.pXa.a(338L, 231L, 1L, false);
        SharedPreferences.Editor localEditor = ((SharedPreferences)localObject1).edit();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localEditor.putInt(a.CLIENT_VERSION + "_clean_patch_reported", 1).apply();
      }
      if ((!BF()) && (!BC()))
      {
        e.pXa.a(338L, 232L, 1L, false);
        localObject2 = ((SharedPreferences)localObject1).edit();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((SharedPreferences.Editor)localObject2).putInt(a.CLIENT_VERSION + "_block_apply_patch_reported", 1).apply();
      }
      AppMethodBeat.o(115044);
      return;
    }
    finally
    {
    }
  }

  public final void b(ApplicationLike paramApplicationLike)
  {
    while (true)
    {
      Object localObject;
      try
      {
        AppMethodBeat.i(115039);
        if (this.mInstalled)
        {
          AppMethodBeat.o(115039);
          return;
        }
        this.cfk = paramApplicationLike;
        ao.a(this.cfn);
        this.cfm = this.cfk.getApplication().getPackageName().equals(this.cfk.getApplication().getApplicationInfo().processName);
        localObject = this.cfk.getApplication().getSharedPreferences("tinker_ensurance_info", 4);
        paramApplicationLike = ((SharedPreferences)localObject).getString("tinker_last_clientversion", null);
        if (paramApplicationLike == null)
        {
          ((SharedPreferences)localObject).edit().putString("tinker_last_clientversion", a.CLIENT_VERSION).commit();
          this.mInstalled = true;
          AppMethodBeat.o(115039);
          continue;
        }
      }
      finally
      {
      }
      if (!a.CLIENT_VERSION.equals(paramApplicationLike))
      {
        localObject = ((SharedPreferences)localObject).edit();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((SharedPreferences.Editor)localObject).remove(paramApplicationLike + "_clean_patch_count").putString("tinker_last_clientversion", a.CLIENT_VERSION).commit();
      }
    }
  }

  public static final class a
  {
    public static final v cfp;

    static
    {
      AppMethodBeat.i(115037);
      cfp = new v();
      AppMethodBeat.o(115037);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.v
 * JD-Core Version:    0.6.2
 */
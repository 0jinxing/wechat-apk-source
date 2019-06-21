package com.tencent.mm.vending.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.Class<+Lcom.tencent.mm.vending.app.a;>;
import java.lang.Class<+Lcom.tencent.mm.vending.c.b<+Lcom.tencent.mm.vending.app.a;>;>;
import java.util.Map;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.vending.e.b
{
  private int d;
  private b zXh;
  private a zXj;
  private com.tencent.mm.vending.c.b<? extends a> zXk;
  private com.tencent.mm.vending.e.c zXl;

  public c()
  {
    AppMethodBeat.i(126081);
    this.zXh = b.dMb();
    this.d = 0;
    this.zXl = new com.tencent.mm.vending.e.c();
    AppMethodBeat.o(126081);
  }

  private void a()
  {
    AppMethodBeat.i(126084);
    if (this.zXh != null)
      this.zXh.a(this, this.zXj);
    AppMethodBeat.o(126084);
  }

  private <T extends com.tencent.mm.vending.c.b<? extends a>> T aI(Class<? extends com.tencent.mm.vending.c.b<? extends a>> paramClass)
  {
    Object localObject;
    StringBuilder localStringBuilder;
    try
    {
      AppMethodBeat.i(126082);
      if (this.zXk == null)
        break label80;
      if (!paramClass.isInstance(this.zXk))
      {
        localObject = new java/lang/IllegalAccessError;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Only one interactor pair with one presenter! duplicate pairWith : ");
        ((IllegalAccessError)localObject).<init>(paramClass.toString());
        AppMethodBeat.o(126082);
        throw ((Throwable)localObject);
      }
    }
    finally
    {
    }
    paramClass = this.zXk;
    AppMethodBeat.o(126082);
    while (true)
    {
      return paramClass;
      try
      {
        label80: this.zXk = ((com.tencent.mm.vending.c.b)paramClass.newInstance());
        if (this.zXj == null)
          this.zXj = ((a)this.zXk.aog());
        a();
        localObject = this.zXk;
        AppMethodBeat.o(126082);
        paramClass = (Class<? extends com.tencent.mm.vending.c.b<? extends a>>)localObject;
      }
      catch (InstantiationException localInstantiationException)
      {
        InternalError localInternalError = new java/lang/InternalError;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Could not create interactor api instance : ");
        localInternalError.<init>(paramClass.toString());
        AppMethodBeat.o(126082);
        throw localInternalError;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        label134: break label134;
      }
    }
  }

  private <T extends a> T aJ(Class<? extends a> paramClass)
  {
    while (true)
    {
      Object localObject1;
      Object localObject2;
      try
      {
        AppMethodBeat.i(126083);
        if (this.zXk != null)
        {
          paramClass = (a)this.zXk.aog();
          AppMethodBeat.o(126083);
          return paramClass;
        }
        if (this.zXj == null)
          break label108;
        if (!paramClass.isInstance(this.zXj))
        {
          localObject1 = new java/lang/IllegalAccessError;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Only one interactor pair with one presenter! duplicate pairWith : ");
          ((IllegalAccessError)localObject1).<init>(paramClass.toString());
          AppMethodBeat.o(126083);
          throw ((Throwable)localObject1);
        }
      }
      finally
      {
      }
      paramClass = this.zXj;
      AppMethodBeat.o(126083);
      continue;
      try
      {
        label108: this.zXj = ((a)paramClass.newInstance());
        a();
        localObject2 = this.zXj;
        AppMethodBeat.o(126083);
        paramClass = (Class<? extends a>)localObject2;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        InternalError localInternalError = new java/lang/InternalError;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Could not create interactor instance : ");
        localInternalError.<init>(paramClass.toString());
        AppMethodBeat.o(126083);
        throw localInternalError;
      }
      catch (InstantiationException localInstantiationException)
      {
        label139: break label139;
      }
    }
  }

  private void z(Intent paramIntent, Context paramContext)
  {
    try
    {
      AppMethodBeat.i(126085);
      Assert.assertNotNull("You must pair this presenter with a interactor!", this.zXj);
      this.zXj.j = paramContext;
      a locala = this.zXj;
      paramContext = new com/tencent/mm/vending/d/a;
      paramContext.<init>(paramIntent);
      locala.zXe = paramContext;
      AppMethodBeat.o(126085);
      return;
    }
    finally
    {
      paramIntent = finally;
    }
    throw paramIntent;
  }

  public final void A(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(126090);
    z(paramIntent, paramContext);
    a(1);
    AppMethodBeat.o(126090);
  }

  public final a SK()
  {
    try
    {
      AppMethodBeat.i(126086);
      if ((this.zXj == null) && (this.zXh != null))
        this.zXj = ((a)this.zXh.b.get(this));
      Assert.assertNotNull("You must pair this presenter with a interactor!", this.zXj);
      a locala = this.zXj;
      AppMethodBeat.o(126086);
      return locala;
    }
    finally
    {
    }
  }

  public final <T extends com.tencent.mm.vending.c.b<? extends a>> T a(Activity paramActivity, Class<? extends com.tencent.mm.vending.c.b<? extends a>> paramClass)
  {
    AppMethodBeat.i(126087);
    if ((paramActivity.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed())))
    {
      com.tencent.mm.vending.f.a.e("Vending.Presenter", "Activity %s is finished! This is invalid!", new Object[] { paramActivity });
      paramActivity = null;
      AppMethodBeat.o(126087);
    }
    while (true)
    {
      return paramActivity;
      paramActivity = aI(paramClass);
      AppMethodBeat.o(126087);
    }
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(126089);
    this.d = paramInt;
    b localb = this.zXh;
    a locala = (a)localb.b.get(this);
    if (locala != null)
      switch (paramInt)
      {
      default:
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "Unknow phase %s, interactor %s activity %s %s %s", new Object[] { Integer.valueOf(paramInt), locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
        AppMethodBeat.o(126089);
        return;
      case 1:
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "onCreate interactor %s presenter %s %s %s", new Object[] { locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
      case 2:
      case 3:
      case 4:
      }
    while (true)
    {
      localb.d.sendMessage(localb.d.obtainMessage(paramInt, locala));
      localb.zXi.put(hashCode(), paramInt);
      AppMethodBeat.o(126089);
      break;
      com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "onDestroy interactor %s activity %s %s %s", new Object[] { locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
      localb.b.remove(this);
    }
  }

  public final <T extends a> T b(Activity paramActivity, Class<? extends a> paramClass)
  {
    AppMethodBeat.i(126088);
    if ((paramActivity.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed())))
    {
      com.tencent.mm.vending.f.a.e("Vending.Presenter", "Activity %s is finished! This is invalid!", new Object[] { paramActivity });
      paramActivity = null;
      AppMethodBeat.o(126088);
    }
    while (true)
    {
      return paramActivity;
      paramActivity = aJ(paramClass);
      AppMethodBeat.o(126088);
    }
  }

  public final void keep(com.tencent.mm.vending.e.a parama)
  {
    AppMethodBeat.i(126091);
    Assert.assertTrue("target must be a ILifeCycle", parama instanceof com.tencent.mm.vending.e.a);
    this.zXl.keep(parama);
    AppMethodBeat.o(126091);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(126092);
    this.zXl.dead();
    a(4);
    AppMethodBeat.o(126092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.app.c
 * JD-Core Version:    0.6.2
 */
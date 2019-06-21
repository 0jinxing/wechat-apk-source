package com.tencent.luggage.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

public class f
  implements h
{
  protected Class<? extends com.tencent.luggage.webview.a> bPi;
  public FrameLayout bPj;
  public f.a<e> bPk;
  protected d bPl;
  com.tencent.luggage.g.e bPm;
  public j bPn;
  Integer bPo;
  private Class<? extends com.tencent.luggage.webview.a> bPp;
  public g bPq;
  protected Context mContext;

  public f(Activity paramActivity)
  {
    AppMethodBeat.i(90789);
    this.bPk = new f.a(this, (byte)0);
    this.bPo = null;
    this.bPp = null;
    this.bPq = new f.8(this);
    this.mContext = paramActivity;
    FrameLayout localFrameLayout = new FrameLayout(this.mContext);
    localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    localFrameLayout.setBackgroundColor(-1);
    this.bPj = localFrameLayout;
    this.bPl = new d();
    a(null);
    this.bPm = com.tencent.luggage.g.e.ax(paramActivity);
    AppMethodBeat.o(90789);
  }

  private void d(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(90802);
    this.bPj.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(90802);
  }

  private k xd()
  {
    AppMethodBeat.i(90801);
    Object localObject = this.bPo;
    this.bPo = null;
    localObject = m.a(this.mContext, (Integer)localObject);
    if ((localObject != null) && (((k)localObject).bPy.equals(xe())))
      AppMethodBeat.o(90801);
    while (true)
    {
      return localObject;
      AppMethodBeat.o(90801);
      localObject = null;
    }
  }

  final void a(e parame)
  {
    AppMethodBeat.i(90799);
    this.bPj.post(new f.5(this, parame));
    parame.destroy();
    AppMethodBeat.o(90799);
  }

  public final void a(j paramj)
  {
    AppMethodBeat.i(90803);
    Object localObject = paramj;
    if (paramj == null)
      localObject = new f.7(this);
    this.bPn = ((j)localObject);
    AppMethodBeat.o(90803);
  }

  public final boolean a(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(90794);
    e locale = this.bPn.j(paramString, paramBundle);
    this.bPj.addView(locale.getContentView(), 0);
    locale.getContentView().setVisibility(4);
    f.1 local1 = new f.1(this, paramBoolean, locale);
    locale.bPd.a(new f.2(this, local1));
    locale.g(paramString, paramBundle);
    d(local1, 300L);
    if (!paramBoolean)
      local1.run();
    AppMethodBeat.o(90794);
    return true;
  }

  public final boolean aZ(boolean paramBoolean)
  {
    AppMethodBeat.i(90796);
    if (this.bPk.size() <= 1)
    {
      paramBoolean = false;
      AppMethodBeat.o(90796);
      return paramBoolean;
    }
    e locale = (e)this.bPk.pop();
    if (paramBoolean)
    {
      locale.h(new f.3(this, locale));
      label53: if (!paramBoolean)
        break label96;
      ((e)this.bPk.peek()).g(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(90777);
          ((e)f.this.bPk.peek()).wT();
          AppMethodBeat.o(90777);
        }
      });
    }
    while (true)
    {
      AppMethodBeat.o(90796);
      paramBoolean = true;
      break;
      a(locale);
      break label53;
      label96: ((e)this.bPk.peek()).wT();
    }
  }

  public final boolean bC(String paramString)
  {
    AppMethodBeat.i(90792);
    boolean bool = h(paramString, null);
    AppMethodBeat.o(90792);
    return bool;
  }

  public final boolean bJ(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(90797);
    if (paramInt < 0)
    {
      AppMethodBeat.o(90797);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((this.bPk.size() <= 1) || (this.bPk.size() <= paramInt))
      {
        AppMethodBeat.o(90797);
      }
      else if (paramInt == 0)
      {
        bool = aZ(false);
        AppMethodBeat.o(90797);
      }
      else
      {
        a((e)this.bPk.remove(paramInt));
        AppMethodBeat.o(90797);
        bool = true;
      }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(90791);
    Object localObject = this.bPk.iterator();
    while (((Iterator)localObject).hasNext())
      ((e)((Iterator)localObject).next()).destroy();
    localObject = xd();
    if (localObject != null)
      ((k)localObject).destroy();
    com.tencent.luggage.g.e.ay(this.mContext);
    AppMethodBeat.o(90791);
  }

  public final boolean h(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(90793);
    if (!this.bPk.isEmpty());
    for (boolean bool = true; ; bool = false)
    {
      bool = a(paramString, paramBundle, bool);
      AppMethodBeat.o(90793);
      return bool;
    }
  }

  public final boolean i(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(90798);
    if (this.bPk.size() == 0);
    for (e locale = null; ; locale = (e)this.bPk.pop())
    {
      if (locale != null)
        a(locale);
      boolean bool = a(paramString, paramBundle, false);
      AppMethodBeat.o(90798);
      return bool;
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(90807);
    this.bPm.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(90807);
  }

  public final void onPause()
  {
    AppMethodBeat.i(90805);
    e locale = xa();
    if (locale == null)
      AppMethodBeat.o(90805);
    while (true)
    {
      return;
      locale.wV();
      AppMethodBeat.o(90805);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(90804);
    e locale = xa();
    if (locale == null)
      AppMethodBeat.o(90804);
    while (true)
    {
      return;
      locale.wT();
      AppMethodBeat.o(90804);
    }
  }

  public final boolean wY()
  {
    boolean bool = false;
    AppMethodBeat.i(90806);
    e locale = xa();
    if (locale == null)
      AppMethodBeat.o(90806);
    while (true)
    {
      return bool;
      if (locale.wX())
      {
        AppMethodBeat.o(90806);
        bool = true;
      }
      else if (this.bPk.size() > 1)
      {
        aZ(true);
        AppMethodBeat.o(90806);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(90806);
      }
    }
  }

  public final e xa()
  {
    AppMethodBeat.i(90790);
    e locale;
    if (this.bPk.size() > 0)
    {
      locale = (e)this.bPk.peek();
      AppMethodBeat.o(90790);
    }
    while (true)
    {
      return locale;
      locale = null;
      AppMethodBeat.o(90790);
    }
  }

  public final boolean xb()
  {
    AppMethodBeat.i(90795);
    boolean bool = aZ(true);
    AppMethodBeat.o(90795);
    return bool;
  }

  public final void xc()
  {
    AppMethodBeat.i(90800);
    if (this.bPo != null)
      AppMethodBeat.o(90800);
    while (true)
    {
      return;
      d(new f.6(this), 200L);
      AppMethodBeat.o(90800);
    }
  }

  final Class<? extends com.tencent.luggage.webview.a> xe()
  {
    if (this.bPp == null)
      if (this.bPi != null)
        break label28;
    label28: for (Object localObject = com.tencent.luggage.webview.default_impl.a.class; ; localObject = this.bPi)
    {
      this.bPp = ((Class)localObject);
      return this.bPp;
    }
  }

  protected void xf()
  {
  }

  protected void xg()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.f
 * JD-Core Version:    0.6.2
 */
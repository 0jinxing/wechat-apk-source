package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.c;
import java.lang.ref.WeakReference;

public final class k$d extends m
{
  private WeakReference<m> iuM;

  public k$d(WeakReference<m> paramWeakReference)
  {
    this.iuM = paramWeakReference;
  }

  public final boolean IZ(int paramInt)
  {
    AppMethodBeat.i(9969);
    m localm = (m)this.iuM.get();
    boolean bool;
    if (localm != null)
    {
      bool = localm.IZ(paramInt);
      AppMethodBeat.o(9969);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9969);
    }
  }

  public final void W(Bundle paramBundle)
  {
    AppMethodBeat.i(9980);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.W(paramBundle);
    AppMethodBeat.o(9980);
  }

  public final void X(Bundle paramBundle)
  {
    AppMethodBeat.i(9986);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.X(paramBundle);
    AppMethodBeat.o(9986);
  }

  public final boolean a(c paramc)
  {
    AppMethodBeat.i(9971);
    m localm = (m)this.iuM.get();
    boolean bool;
    if (localm != null)
    {
      bool = localm.a(paramc);
      AppMethodBeat.o(9971);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9971);
    }
  }

  public final boolean a(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(9972);
    m localm = (m)this.iuM.get();
    if (localm != null)
    {
      paramBoolean = localm.a(paramString1, paramString2, paramBundle, paramBoolean);
      AppMethodBeat.o(9972);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(9972);
    }
  }

  public final void afd(String paramString)
  {
    AppMethodBeat.i(9981);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.afd(paramString);
    AppMethodBeat.o(9981);
  }

  public final boolean c(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9970);
    m localm = (m)this.iuM.get();
    boolean bool;
    if (localm != null)
    {
      bool = localm.c(paramInt, paramBundle);
      AppMethodBeat.o(9970);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9970);
    }
  }

  public final String cYY()
  {
    AppMethodBeat.i(9973);
    Object localObject = (m)this.iuM.get();
    if (localObject != null)
    {
      localObject = ((m)localObject).cYY();
      AppMethodBeat.o(9973);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(9973);
    }
  }

  public final String cYZ()
  {
    AppMethodBeat.i(9975);
    Object localObject = (m)this.iuM.get();
    if (localObject != null)
    {
      localObject = ((m)localObject).cYZ();
      AppMethodBeat.o(9975);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(9975);
    }
  }

  public final void cZb()
  {
    AppMethodBeat.i(9979);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.cZb();
    AppMethodBeat.o(9979);
  }

  public final void cZc()
  {
    AppMethodBeat.i(9983);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.cZc();
    AppMethodBeat.o(9983);
  }

  public final Bundle dj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9989);
    m localm = (m)this.iuM.get();
    if (localm != null)
    {
      paramString1 = localm.dj(paramString1, paramString2);
      AppMethodBeat.o(9989);
    }
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(9989);
    }
  }

  public final void e(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(9984);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.e(paramString1, paramString2, paramInt1, paramInt2);
    AppMethodBeat.o(9984);
  }

  public final Bundle g(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9985);
    m localm = (m)this.iuM.get();
    if (localm != null)
    {
      paramBundle = localm.g(paramInt, paramBundle);
      AppMethodBeat.o(9985);
    }
    while (true)
    {
      return paramBundle;
      paramBundle = new Bundle();
      AppMethodBeat.o(9985);
    }
  }

  public final String getCurrentUrl()
  {
    AppMethodBeat.i(9974);
    Object localObject = (m)this.iuM.get();
    if (localObject != null)
    {
      localObject = ((m)localObject).getCurrentUrl();
      AppMethodBeat.o(9974);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(9974);
    }
  }

  public final void hd(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9982);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.hd(paramString1, paramString2);
    AppMethodBeat.o(9982);
  }

  public final void he(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9988);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.he(paramString1, paramString2);
    AppMethodBeat.o(9988);
  }

  public final void nJ(boolean paramBoolean)
  {
    AppMethodBeat.i(9976);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.nJ(paramBoolean);
    AppMethodBeat.o(9976);
  }

  public final void nK(boolean paramBoolean)
  {
    AppMethodBeat.i(9977);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.nK(paramBoolean);
    AppMethodBeat.o(9977);
  }

  public final void nL(boolean paramBoolean)
  {
    AppMethodBeat.i(9987);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.nL(paramBoolean);
    AppMethodBeat.o(9987);
  }

  public final void q(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9978);
    m localm = (m)this.iuM.get();
    if (localm != null)
      localm.q(paramInt, paramBundle);
    AppMethodBeat.o(9978);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k.d
 * JD-Core Version:    0.6.2
 */
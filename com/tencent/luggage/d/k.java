package com.tencent.luggage.d;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.luggage.bridge.o;
import com.tencent.luggage.webview.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentHashMap;

public final class k
  implements b
{
  o bOA;
  public com.tencent.luggage.webview.a bPA;
  boolean bPB;
  public com.tencent.luggage.d.a.a bPC;
  public com.tencent.luggage.webview.a.b bPD;
  com.tencent.luggage.webview.a.d bPE;
  final ConcurrentHashMap<String, Class<? extends a>> bPF;
  private a.a bPG;
  private final MutableContextWrapper bPx;
  final Class<? extends com.tencent.luggage.webview.a> bPy;
  public l bPz;
  private Handler mHandler;
  public String mUrl;

  public k(Context paramContext, Class<? extends com.tencent.luggage.webview.a> paramClass)
  {
    AppMethodBeat.i(90823);
    this.bPB = false;
    this.bPF = new ConcurrentHashMap();
    this.bPG = new k.4(this);
    this.bPx = new MutableContextWrapper(paramContext);
    paramContext = paramClass;
    if (paramClass == null)
      paramContext = com.tencent.luggage.webview.default_impl.a.class;
    this.bPy = paramContext;
    this.mHandler = new Handler(Looper.getMainLooper());
    xn();
    this.bPA = ((com.tencent.luggage.webview.a)org.a.a.be(this.bPy).ab(new Object[] { this.bPx }).object);
    this.bPA.setWebCore(this);
    this.bPA.a(this.bPG);
    this.bOA = new o(this.bPA);
    AppMethodBeat.o(90823);
  }

  private void xn()
  {
    AppMethodBeat.i(90824);
    this.bPD = new com.tencent.luggage.webview.a.b();
    this.bPE = new com.tencent.luggage.webview.a.d();
    xo();
    AppMethodBeat.o(90824);
  }

  private void xo()
  {
    AppMethodBeat.i(90825);
    this.bPD.a(new com.tencent.luggage.webview.a.a(this.bPx));
    AppMethodBeat.o(90825);
  }

  private void xs()
  {
    AppMethodBeat.i(90834);
    ViewParent localViewParent = getView().getParent();
    if ((localViewParent instanceof ViewGroup))
      ((ViewGroup)localViewParent).removeView(getView());
    AppMethodBeat.o(90834);
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(90828);
    k.3 local3 = new k.3(this, paramc);
    com.tencent.luggage.d.a.a locala = xp();
    paramc.name();
    locala.a(local3);
    AppMethodBeat.o(90828);
  }

  // ERROR //
  public final void a(java.util.List<Class<? extends a>> paramList, b paramb)
  {
    // Byte code:
    //   0: ldc 190
    //   2: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokeinterface 196 1 0
    //   11: astore_1
    //   12: aload_1
    //   13: invokeinterface 202 1 0
    //   18: ifeq +127 -> 145
    //   21: aload_1
    //   22: invokeinterface 206 1 0
    //   27: checkcast 208	java/lang/Class
    //   30: astore_3
    //   31: aload_3
    //   32: invokevirtual 211	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   35: checkcast 213	com/tencent/luggage/d/a
    //   38: astore 4
    //   40: aload 4
    //   42: aload_2
    //   43: putfield 217	com/tencent/luggage/d/a:bOY	Lcom/tencent/luggage/d/b;
    //   46: aload_0
    //   47: getfield 53	com/tencent/luggage/d/k:bPF	Ljava/util/concurrent/ConcurrentHashMap;
    //   50: aload 4
    //   52: invokevirtual 218	com/tencent/luggage/d/a:name	()Ljava/lang/String;
    //   55: aload_3
    //   56: invokevirtual 222	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   59: pop
    //   60: aload_0
    //   61: getfield 119	com/tencent/luggage/d/k:bOA	Lcom/tencent/luggage/bridge/o;
    //   64: astore 5
    //   66: aload 4
    //   68: invokevirtual 218	com/tencent/luggage/d/a:name	()Ljava/lang/String;
    //   71: astore_3
    //   72: new 224	com/tencent/luggage/d/k$1
    //   75: dup
    //   76: aload_0
    //   77: aload 4
    //   79: invokespecial 227	com/tencent/luggage/d/k$1:<init>	(Lcom/tencent/luggage/d/k;Lcom/tencent/luggage/d/a;)V
    //   82: astore 4
    //   84: aload 5
    //   86: getfield 230	com/tencent/luggage/bridge/o:bOJ	Ljava/util/concurrent/ConcurrentHashMap;
    //   89: aload_3
    //   90: aload 4
    //   92: invokevirtual 222	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   95: pop
    //   96: goto -84 -> 12
    //   99: astore 4
    //   101: ldc 232
    //   103: ldc 234
    //   105: iconst_2
    //   106: anewarray 4	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: aload_3
    //   112: invokevirtual 237	java/lang/Class:getName	()Ljava/lang/String;
    //   115: aastore
    //   116: dup
    //   117: iconst_1
    //   118: aload 4
    //   120: aastore
    //   121: invokestatic 243	com/tencent/luggage/g/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: goto -112 -> 12
    //   127: astore_3
    //   128: ldc 232
    //   130: ldc 245
    //   132: aload_3
    //   133: invokestatic 251	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   136: invokevirtual 255	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   139: invokestatic 258	com/tencent/luggage/g/d:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: goto -130 -> 12
    //   145: ldc 190
    //   147: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: return
    //
    // Exception table:
    //   from	to	target	type
    //   31	40	99	java/lang/Exception
    //   40	46	127	java/lang/Exception
  }

  public final void destroy()
  {
    AppMethodBeat.i(90835);
    xs();
    if (!this.bPB)
      this.bPA.destroy();
    AppMethodBeat.o(90835);
  }

  public final View getView()
  {
    AppMethodBeat.i(90831);
    View localView = this.bPA.getView();
    AppMethodBeat.o(90831);
    return localView;
  }

  public final void loadUrl(String paramString)
  {
    AppMethodBeat.i(90832);
    this.bPA.loadUrl(paramString);
    AppMethodBeat.o(90832);
  }

  public final void setContext(Context paramContext)
  {
    AppMethodBeat.i(90826);
    this.bPx.setBaseContext(paramContext);
    if (this.bPA != null)
      this.bPA.setContext(paramContext);
    AppMethodBeat.o(90826);
  }

  public final void stopLoading()
  {
    AppMethodBeat.i(90833);
    this.bPA.stopLoading();
    AppMethodBeat.o(90833);
  }

  public final com.tencent.luggage.d.a.a xp()
  {
    if (this.bPC == null);
    for (com.tencent.luggage.d.a.a locala = com.tencent.luggage.d.a.a.bPT; ; locala = this.bPC)
      return locala;
  }

  final void xq()
  {
    AppMethodBeat.i(90829);
    if (this.bPB)
    {
      this.bPB = false;
      xn();
    }
    AppMethodBeat.o(90829);
  }

  @Deprecated
  public final <T> T xr()
  {
    AppMethodBeat.i(90830);
    try
    {
      View localView = getView();
      AppMethodBeat.o(90830);
      return localView;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.luggage.g.d.e(getClass().getSimpleName(), "CoreImpl cast failed", new Object[] { localException });
        Object localObject = null;
        AppMethodBeat.o(90830);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.k
 * JD-Core Version:    0.6.2
 */
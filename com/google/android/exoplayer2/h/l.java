package com.google.android.exoplayer2.h;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class l
  implements f
{
  private f aSF;
  private final u<? super f> bpJ;
  private final f bql;
  private f bqm;
  private f bqn;
  private f bqo;
  private f bqp;
  private final Context context;

  public l(Context paramContext, u<? super f> paramu, f paramf)
  {
    AppMethodBeat.i(95816);
    this.context = paramContext.getApplicationContext();
    this.bpJ = paramu;
    this.bql = ((f)a.checkNotNull(paramf));
    AppMethodBeat.o(95816);
  }

  private f ts()
  {
    AppMethodBeat.i(95821);
    if (this.bqn == null)
      this.bqn = new c(this.context, this.bpJ);
    f localf = this.bqn;
    AppMethodBeat.o(95821);
    return localf;
  }

  private f tt()
  {
    AppMethodBeat.i(95822);
    if (this.bqp == null);
    try
    {
      this.bqp = ((f)Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      label38: if (this.bqp == null)
        this.bqp = this.bql;
      f localf = this.bqp;
      AppMethodBeat.o(95822);
      return localf;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      break label38;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label38;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label38;
    }
    catch (InstantiationException localInstantiationException)
    {
      break label38;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label38;
    }
  }

  public final long a(i parami)
  {
    AppMethodBeat.i(95817);
    boolean bool;
    String str;
    if (this.aSF == null)
    {
      bool = true;
      a.checkState(bool);
      str = parami.uri.getScheme();
      if (!v.o(parami.uri))
        break label117;
      if (!parami.uri.getPath().startsWith("/android_asset/"))
        break label84;
      this.aSF = ts();
    }
    while (true)
    {
      long l = this.aSF.a(parami);
      AppMethodBeat.o(95817);
      return l;
      bool = false;
      break;
      label84: if (this.bqm == null)
        this.bqm = new p(this.bpJ);
      this.aSF = this.bqm;
      continue;
      label117: if ("asset".equals(str))
      {
        this.aSF = ts();
      }
      else if ("content".equals(str))
      {
        if (this.bqo == null)
          this.bqo = new e(this.context, this.bpJ);
        this.aSF = this.bqo;
      }
      else if ("rtmp".equals(str))
      {
        this.aSF = tt();
      }
      else
      {
        this.aSF = this.bql;
      }
    }
  }

  public final void close()
  {
    AppMethodBeat.i(95820);
    if (this.aSF != null);
    while (true)
    {
      try
      {
        this.aSF.close();
        return;
      }
      finally
      {
        this.aSF = null;
        AppMethodBeat.o(95820);
      }
      AppMethodBeat.o(95820);
    }
  }

  public final Uri getUri()
  {
    AppMethodBeat.i(95819);
    Uri localUri;
    if (this.aSF == null)
    {
      localUri = null;
      AppMethodBeat.o(95819);
    }
    while (true)
    {
      return localUri;
      localUri = this.aSF.getUri();
      AppMethodBeat.o(95819);
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95818);
    paramInt1 = this.aSF.read(paramArrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(95818);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.l
 * JD-Core Version:    0.6.2
 */
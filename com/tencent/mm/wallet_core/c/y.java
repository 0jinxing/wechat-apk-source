package com.tencent.mm.wallet_core.c;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import java.util.HashMap;
import junit.framework.Assert;

public final class y extends n
{
  public static final String[] fnj;
  public static final Object xIt;
  public y.a<String> AfU;
  public h fni;
  private Handler mHandler;
  private HandlerThread mHandlerThread;
  private HashMap<Integer, y.b> xIw;
  private HashMap<String, y.b> xIx;
  private volatile boolean xIy;
  private final Runnable xIz;

  static
  {
    AppMethodBeat.i(5482);
    fnj = new String[] { "CREATE TABLE IF NOT EXISTS walletcache ( sid TEXT PRIMARY KEY, type INT, value TEXT )" };
    xIt = new Object();
    AppMethodBeat.o(5482);
  }

  public y(h paramh)
  {
    AppMethodBeat.i(5478);
    this.AfU = new y.a(this, "walletcache", "sid");
    this.xIw = new HashMap();
    this.xIx = new HashMap();
    this.xIz = new y.1(this);
    this.fni = paramh;
    this.mHandlerThread = new HandlerThread("ConfigStorage");
    this.mHandlerThread.start();
    this.mHandler = new Handler(this.mHandlerThread.getLooper());
    AppMethodBeat.o(5478);
  }

  public static boolean a(String paramString, Object paramObject, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(5480);
    if ((paramObject == null) && (paramBoolean))
    {
      AppMethodBeat.o(5480);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if ((paramString.equals("INT")) && ((paramObject instanceof Integer)))
      {
        AppMethodBeat.o(5480);
        paramBoolean = bool;
      }
      else if ((paramString.equals("LONG")) && ((paramObject instanceof Long)))
      {
        AppMethodBeat.o(5480);
        paramBoolean = bool;
      }
      else if ((paramString.equals("STRING")) && ((paramObject instanceof String)))
      {
        AppMethodBeat.o(5480);
        paramBoolean = bool;
      }
      else if ((paramString.equals("BOOLEAN")) && ((paramObject instanceof Boolean)))
      {
        AppMethodBeat.o(5480);
        paramBoolean = bool;
      }
      else if ((paramString.equals("FLOAT")) && ((paramObject instanceof Float)))
      {
        AppMethodBeat.o(5480);
        paramBoolean = bool;
      }
      else if ((paramString.equals("DOUBLE")) && ((paramObject instanceof Double)))
      {
        AppMethodBeat.o(5480);
        paramBoolean = bool;
      }
      else
      {
        if ((paramObject != null) && (b.dnO()))
          Assert.assertTrue("checkType failed, input type and value[" + paramString + ", " + paramObject + "] are not match", false);
        if (paramBoolean)
          ab.e("MicroMsg.ConfigStorage", "checkType failed, input type and value[%s, %s] are not match", new Object[] { paramString, paramObject });
        AppMethodBeat.o(5480);
        paramBoolean = false;
      }
    }
  }

  public final boolean apK()
  {
    boolean bool = true;
    AppMethodBeat.i(5481);
    Object localObject;
    if ((this.fni == null) || (this.fni.dpU()))
      if (this.fni == null)
      {
        localObject = "null";
        ab.w("MicroMsg.ConfigStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        AppMethodBeat.o(5481);
        bool = false;
      }
    while (true)
    {
      return bool;
      localObject = Boolean.valueOf(this.fni.dpU());
      break;
      AppMethodBeat.o(5481);
    }
  }

  public final void set(ac.a parama, Object paramObject)
  {
    AppMethodBeat.i(5479);
    if (parama == null)
      AppMethodBeat.o(5479);
    Object localObject;
    while (true)
    {
      return;
      localObject = parama.name();
      if (!bo.isNullOrNil((String)localObject))
        break;
      AppMethodBeat.o(5479);
    }
    String[] arrayOfString = ((String)localObject).split("_");
    parama = arrayOfString[(arrayOfString.length - 1)];
    if (parama.equals("SYNC"))
      parama = arrayOfString[(arrayOfString.length - 2)];
    for (int i = 1; ; i = 0)
    {
      if (!a(parama, paramObject, true))
      {
        AppMethodBeat.o(5479);
        break;
      }
      int j = ((String)localObject).lastIndexOf(parama);
      localObject = ((String)localObject).substring(0, parama.length() + j);
      if (!paramObject.equals(this.AfU.put(localObject, paramObject)))
      {
        if (paramObject != xIt)
          break label269;
        parama = null;
      }
      while (true)
      {
        try
        {
          while (true)
          {
            label139: this.xIx.put(localObject, parama);
            if (i != 0)
              try
              {
                this.mHandler.removeCallbacks(this.xIz);
                this.mHandler.post(this.xIz);
                this.xIy = true;
                ab.i("MicroMsg.ConfigStorage", "Posted appendAllToDisk");
                if (paramObject != xIt)
                  break label337;
                i = 5;
                b(i, this, localObject);
                localObject = new StringBuilder("SET: ").append((String)localObject).append(" => ");
                if (paramObject != xIt)
                  break label343;
                parama = "(DELETED)";
                ab.i("MicroMsg.ConfigStorage", parama);
                AppMethodBeat.o(5479);
                break;
                label269: parama = new y.b(3, paramObject.toString());
                break label139;
              }
              finally
              {
              }
          }
        }
        finally
        {
          AppMethodBeat.o(5479);
        }
        if (!this.xIy)
        {
          this.xIy = true;
          this.mHandler.postDelayed(this.xIz, 30000L);
          continue;
          label337: i = 4;
          continue;
          label343: parama = paramObject.toString();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.y
 * JD-Core Version:    0.6.2
 */
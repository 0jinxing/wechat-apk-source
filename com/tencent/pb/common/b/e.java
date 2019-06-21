package com.tencent.pb.common.b;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.tencent.pb.common.c.c;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import junit.framework.Assert;

public final class e
  implements b
{
  private static e AlV = null;
  private final SparseArray<Set<b>> AlW = new SparseArray();
  private d AlX = null;
  private Vector<d> ftC = new Vector();
  private Vector<d> ftD = new Vector();
  private final Handler handler = new e.1(this, Looper.getMainLooper());

  private void acX()
  {
    if (this.ftD.size() > 0)
    {
      d locald = (d)this.ftD.get(0);
      for (int i = 1; i < this.ftD.size(); i++)
        this.ftD.get(i);
      if (dPv())
      {
        this.ftD.remove(locald);
        b(locald);
      }
    }
  }

  private void b(d paramd)
  {
    if (dPv())
    {
      this.ftC.add(paramd);
      int i = paramd.a(this);
      if (i < 0)
      {
        c.w("MicroMsg.Voip", new Object[] { "doSceneImp do scene failed, ret %d,", Integer.valueOf(i) });
        this.handler.post(new e.2(this, paramd));
      }
    }
    while (true)
    {
      acX();
      return;
      this.ftD.add(paramd);
    }
  }

  public static e dPu()
  {
    if (AlV == null);
    try
    {
      if (AlV == null)
      {
        e locale = new com/tencent/pb/common/b/e;
        locale.<init>();
        AlV = locale;
      }
      return AlV;
    }
    finally
    {
    }
  }

  private boolean dPv()
  {
    if (this.ftC.size() >= 20);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, d paramd)
  {
    this.ftC.remove(paramd);
    acX();
    this.handler.post(new e.3(this, paramd, paramInt1, paramInt2, paramString));
  }

  public final void a(int paramInt, b paramb)
  {
    if (this.AlW.get(paramInt) == null)
      this.AlW.put(paramInt, new HashSet());
    if (!((Set)this.AlW.get(paramInt)).contains(paramb))
      ((Set)this.AlW.get(paramInt)).add(paramb);
  }

  public final boolean a(d paramd)
  {
    boolean bool = false;
    if (!h.isNetworkConnected())
    {
      int i = paramd.getType();
      if ((i == 102) || (i == 104) || (i == 103))
      {
        c.w("MicroMsg.Voip", new Object[] { "doScene do retain mReissueNetScene" });
        this.AlX = paramd;
      }
    }
    Assert.assertTrue(true);
    if (paramd == null);
    while (true)
    {
      return bool;
      b(paramd);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.e
 * JD-Core Version:    0.6.2
 */
package com.tencent.xweb.c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.a;
import com.tencent.xweb.util.f;
import java.util.ArrayList;
import org.xwalk.core.NetworkUtil;
import org.xwalk.core.XWalkEnvironment;

public final class j
{
  static j APz = null;
  int APs;
  int APt;
  long APu;
  ArrayList<Long> APv;
  WebView.d APw;
  long APx;
  boolean APy;

  private j(WebView.d paramd)
  {
    AppMethodBeat.i(3983);
    this.APs = 0;
    this.APt = 0;
    this.APu = 0L;
    this.APv = new ArrayList();
    this.APx = 0L;
    this.APy = false;
    this.APw = paramd;
    if ((this.APw != WebView.d.ANd) && (("tools".equals(WebView.getCurStrModule())) || ("toolsmp".equals(WebView.getCurStrModule()))))
    {
      paramd = a.iG("enable_err_watchdog", "tools");
      boolean bool2 = bool1;
      if (paramd != null)
      {
        bool2 = bool1;
        if (paramd.trim().toLowerCase().equals("true"))
          bool2 = true;
      }
      this.APy = bool2;
      this.APx = e(this.APw).getLong("SP_KEY_NEED_SWITCH_TIME", 0L);
      if (Math.abs(System.currentTimeMillis() - this.APx) >= 43200000L)
        break label177;
      this.APs = 3;
      AppMethodBeat.o(3983);
    }
    while (true)
    {
      return;
      this.APy = false;
      label177: AppMethodBeat.o(3983);
    }
  }

  public static void d(WebView.d paramd)
  {
    try
    {
      AppMethodBeat.i(3982);
      j localj = new com/tencent/xweb/c/j;
      localj.<init>(paramd);
      APz = localj;
      AppMethodBeat.o(3982);
      return;
    }
    finally
    {
      paramd = finally;
    }
    throw paramd;
  }

  public static j dUB()
  {
    try
    {
      AppMethodBeat.i(3981);
      if (APz == null)
      {
        localj = new com/tencent/xweb/c/j;
        WebView.d locald = WebView.getCurWebType();
        WebView.getCurStrModule();
        localj.<init>(locald);
        APz = localj;
      }
      j localj = APz;
      AppMethodBeat.o(3981);
      return localj;
    }
    finally
    {
    }
  }

  private int dUD()
  {
    try
    {
      int i = this.APs;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static SharedPreferences e(WebView.d paramd)
  {
    try
    {
      AppMethodBeat.i(3992);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramd = XWalkEnvironment.getProcessSafePreferences(XWalkEnvironment.getProcessName() + "_LOAD_URL_" + paramd, 4);
      AppMethodBeat.o(3992);
      return paramd;
    }
    finally
    {
      paramd = finally;
    }
    throw paramd;
  }

  public final void dUC()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(3985);
        if (!this.APy)
        {
          AppMethodBeat.o(3985);
          return;
        }
        if (NetworkUtil.isNetworkAvailable())
          this.APv.add(Long.valueOf(System.currentTimeMillis()));
        if (this.APv.size() < 3)
          break label144;
        long l = ((Long)this.APv.get(this.APv.size() - 3)).longValue();
        if (Math.abs(System.currentTimeMillis() - l) >= 120000L)
          break label144;
        this.APs = 1;
        if (this.APw == WebView.d.ANb)
        {
          f.nI(220L);
          AppMethodBeat.o(3985);
          continue;
        }
      }
      finally
      {
      }
      if (this.APw == WebView.d.ANc)
        f.nI(226L);
      label144: AppMethodBeat.o(3985);
    }
  }

  public final boolean dUE()
  {
    boolean bool = true;
    while (true)
    {
      try
      {
        AppMethodBeat.i(3986);
        if ((dUD() == 3) || (dUD() == 2))
        {
          if (this.APw == WebView.d.ANb)
            f.nI(222L);
        }
        else
        {
          if ((dUD() != 1) && (dUD() != 3) && (dUD() != 2))
            break label100;
          AppMethodBeat.o(3986);
          return bool;
        }
        if (this.APw != WebView.d.ANc)
          continue;
        f.nI(228L);
        continue;
      }
      finally
      {
      }
      label100: bool = false;
      AppMethodBeat.o(3986);
    }
  }

  public final boolean dUF()
  {
    try
    {
      AppMethodBeat.i(3987);
      boolean bool;
      if (dUD() == 2)
      {
        bool = true;
        AppMethodBeat.o(3987);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(3987);
      }
    }
    finally
    {
    }
  }

  public final boolean dUG()
  {
    try
    {
      AppMethodBeat.i(3988);
      boolean bool;
      if (dUD() == 3)
      {
        bool = true;
        AppMethodBeat.o(3988);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(3988);
      }
    }
    finally
    {
    }
  }

  public final void dUH()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(3990);
        if (!this.APy)
        {
          AppMethodBeat.o(3990);
          return;
        }
        if (1 != this.APs)
        {
          AppMethodBeat.o(3990);
          continue;
        }
      }
      finally
      {
      }
      if (this.APv.size() > 0)
      {
        long l = ((Long)this.APv.get(this.APv.size() - 1)).longValue();
        if (Math.abs(System.currentTimeMillis() - l) < 60000L)
        {
          if (this.APw == WebView.d.ANb)
            f.nI(221L);
          while (true)
          {
            this.APu = 0L;
            this.APv.clear();
            this.APs = 2;
            this.APx = System.currentTimeMillis();
            e(this.APw).edit().putLong("SP_KEY_NEED_SWITCH_TIME", this.APx).commit();
            AppMethodBeat.o(3990);
            break;
            if (this.APw == WebView.d.ANc)
              f.nI(227L);
          }
        }
      }
      this.APs = 0;
      AppMethodBeat.o(3990);
    }
  }

  public final void dUI()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(3991);
        if (!this.APy)
        {
          AppMethodBeat.o(3991);
          return;
        }
        if (1 != this.APs)
        {
          AppMethodBeat.o(3991);
          continue;
        }
      }
      finally
      {
      }
      this.APu = 0L;
      this.APv.clear();
      this.APs = 0;
      AppMethodBeat.o(3991);
    }
  }

  public final void dUx()
  {
    try
    {
      AppMethodBeat.i(3984);
      this.APu = System.currentTimeMillis();
      AppMethodBeat.o(3984);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void dUy()
  {
    try
    {
      AppMethodBeat.i(3989);
      if (!this.APy)
        AppMethodBeat.o(3989);
      while (true)
      {
        return;
        this.APu = 0L;
        this.APv.clear();
        this.APx = 0L;
        this.APs = 0;
        AppMethodBeat.o(3989);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.c.j
 * JD-Core Version:    0.6.2
 */
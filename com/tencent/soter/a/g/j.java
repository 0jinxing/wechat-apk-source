package com.tencent.soter.a.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.f.d.a;
import com.tencent.soter.core.c.c;
import com.tencent.soter.core.c.h;
import com.tencent.soter.core.c.h.a;
import java.nio.charset.Charset;

public class j extends d
{
  private static final String AwX;
  private boolean AwY;
  private String AwZ;
  private com.tencent.soter.a.f.d Awo;
  private String Awp;
  private int[] Awq;
  private h.a Axa;

  static
  {
    AppMethodBeat.i(10558);
    AwX = "soter_triggered_oom" + com.tencent.soter.core.c.g.x(com.tencent.soter.core.a.dQT().getBytes(Charset.forName("UTF-8")));
    AppMethodBeat.o(10558);
  }

  public j(Context paramContext, e parame)
  {
    AppMethodBeat.i(10553);
    this.AwY = false;
    this.Awp = "";
    this.AwZ = "";
    this.Axa = new j.1(this);
    Object localObject = parame.Awr;
    if (localObject != null)
      com.tencent.soter.core.c.d.a((c)localObject);
    com.tencent.soter.a.c.a locala = com.tencent.soter.a.c.a.dRe();
    localObject = paramContext.getSharedPreferences("soter_status", 0);
    try
    {
      locala.AvP = ((SharedPreferences)localObject);
      h.a(this.Axa);
      com.tencent.soter.core.a.dQK();
      com.tencent.soter.core.a.iO(paramContext);
      com.tencent.soter.core.a.bLV();
      boolean bool2 = bool1;
      if (com.tencent.soter.core.a.dQN())
        if (!com.tencent.soter.core.a.iP(paramContext))
        {
          bool2 = bool1;
          if (!com.tencent.soter.core.a.iQ(paramContext));
        }
        else
        {
          bool2 = true;
        }
      this.AwY = bool2;
      this.Awo = parame.Awo;
      this.Awq = parame.Awq;
      this.Awp = parame.Awp;
      this.AwZ = parame.Aws;
      AppMethodBeat.o(10553);
      return;
    }
    finally
    {
      AppMethodBeat.o(10553);
    }
    throw paramContext;
  }

  private static boolean Rl(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 2)
      if (paramInt != 1)
        break label18;
    label18: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  @SuppressLint({"DefaultLocale"})
  protected void b(String paramString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(10556);
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfInt[j];
      String str = String.format("%suid%d_%s_scene%d", new Object[] { "Wechat", Integer.valueOf(Process.myUid()), com.tencent.soter.core.c.g.nullAsNil(paramString), Integer.valueOf(k) });
      com.tencent.soter.a.c.a.dRe().dRg().put(k, str);
    }
    AppMethodBeat.o(10556);
  }

  final boolean dRl()
  {
    AppMethodBeat.i(10554);
    Object localObject = this.Awq;
    int i;
    boolean bool;
    if ((localObject == null) || (localObject.length <= 0))
    {
      i = 1;
      if (i == 0)
        break label69;
      com.tencent.soter.core.c.d.e("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24", new Object[0]);
      b(new com.tencent.soter.a.b.d(27, "no business scene provided"));
      AppMethodBeat.o(10554);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label69: if (com.tencent.soter.core.c.g.nullAsNil(this.Awp).length() > 16)
      {
        com.tencent.soter.core.c.d.w("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24. soter will try to make it compat", new Object[0]);
        localObject = com.tencent.soter.core.c.g.x(this.Awp.getBytes(Charset.forName("UTF-8")));
        if ((!com.tencent.soter.core.c.g.isNullOrNil((String)localObject)) && (((String)localObject).length() >= 16));
        for (localObject = ((String)localObject).substring(0, 16); ; localObject = null)
        {
          if (!com.tencent.soter.core.c.g.isNullOrNil((String)localObject))
            break label187;
          com.tencent.soter.core.c.d.w("Soter.TaskInit", "soter: saltlen compat failed!!", new Object[0]);
          b(new com.tencent.soter.a.b.d(28, "the account salt length is too long"));
          AppMethodBeat.o(10554);
          bool = true;
          break;
        }
        this.Awp = ((String)localObject);
      }
      label187: if ((!com.tencent.soter.core.c.g.isNullOrNil(this.AwZ)) && (this.AwZ.length() > 24))
      {
        com.tencent.soter.core.c.d.e("Soter.TaskInit", "soter: the passed ask name is too long (larger than 24).", new Object[0]);
        b(new com.tencent.soter.a.b.d(29, "the passed ask name is too long (larger than 24)"));
        AppMethodBeat.o(10554);
        bool = true;
      }
      else
      {
        if (this.Awo == null)
          com.tencent.soter.core.c.d.w("Soter.TaskInit", "soter: it is strongly recommended to check device support from server, so you'd better provider a net wrapper to check it", new Object[0]);
        if (!com.tencent.soter.core.c.g.isNullOrNil(this.AwZ))
        {
          com.tencent.soter.core.c.d.i("Soter.TaskInit", "soter: provided valid ASK name", new Object[0]);
          com.tencent.soter.core.c.e.dQW().Avi = this.AwZ;
        }
        g.dRq().R(new j.2(this));
        AppMethodBeat.o(10554);
        bool = false;
      }
    }
  }

  final void dRm()
  {
  }

  final void execute()
  {
    AppMethodBeat.i(10555);
    if (this.AwY)
      if (this.Awo == null)
      {
        com.tencent.soter.a.c.a.dRe().rq(true);
        com.tencent.soter.a.c.a.dRe().dRf();
        b(new com.tencent.soter.a.b.d(0));
        AppMethodBeat.o(10555);
      }
    while (true)
    {
      return;
      String str = com.tencent.soter.core.a.dQT();
      this.Awo.bR(new d.a(str));
      this.Awo.a(new j.3(this));
      this.Awo.execute();
      AppMethodBeat.o(10555);
      continue;
      com.tencent.soter.core.c.d.w("Soter.TaskInit", "soter: TaskInit check isNativeSupport[" + this.AwY + "]", new Object[0]);
      b(new com.tencent.soter.a.b.d(2));
      try
      {
        com.tencent.soter.a.c.a.dRe().rq(false);
        com.tencent.soter.a.c.a.dRe().dRf();
        AppMethodBeat.o(10555);
      }
      finally
      {
        AppMethodBeat.o(10555);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.j
 * JD-Core Version:    0.6.2
 */
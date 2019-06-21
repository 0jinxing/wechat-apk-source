package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class cx$d extends cx.a
{
  public boolean a;
  public boolean b;
  public boolean c;
  public boolean d = false;
  public List<dh.a> e;
  private int f;
  private int g;

  public cx$d(cx paramcx, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramcx, (byte)0);
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.f = 0;
  }

  public final void run()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 0;
    AppMethodBeat.i(98684);
    this.a = false;
    cx.a(ce.a.a("report_max_report_count", 10, 100, 20));
    int j;
    if (this.b)
    {
      j = cx.f(this.h).size();
      if (j == 0)
      {
        this.e = ((List)localObject2);
        if ((this.e != null) && (this.e.size() != 0))
          break label359;
        cx.b(this.h, false);
        AppMethodBeat.o(98684);
      }
    }
    while (true)
    {
      return;
      localObject1 = new ArrayList();
      localObject2 = new ArrayList();
      int k = 0;
      int m = 0;
      while ((k < j) && (m < cx.c()))
      {
        String str = (String)cx.f(this.h).get(k);
        ((List)localObject2).add(new dh.a(0L, str));
        ((List)localObject1).add(str);
        m++;
        k++;
      }
      for (k = 0; k < ((List)localObject1).size(); k++)
        cx.f(this.h).remove(((List)localObject1).get(k));
      if (cx.f(this.h).size() == 0)
        this.a = true;
      break;
      k = ce.a.a("report_clear_db_num", 1, 10000, 1000);
      if (dh.a(this.h.b()).a(k))
        localObject2 = localObject1;
      while (true)
      {
        this.e = ((List)localObject2);
        break;
        localObject2 = dh.a(this.h.b()).b(cx.c() + 1);
        if (((List)localObject2).size() <= cx.c())
        {
          this.a = true;
          cx.a(this.h, true);
        }
        else
        {
          ((List)localObject2).remove(((List)localObject2).size() - 1);
        }
      }
      label359: localObject2 = new StringBuilder();
      for (k = i; k < this.e.size(); k++)
        ((StringBuilder)localObject2).append(((dh.a)this.e.get(k)).b).append("\n");
      localObject1 = ((StringBuilder)localObject2).toString();
      localObject2 = localObject1;
      if (this.b)
      {
        localObject2 = localObject1;
        if (((String)localObject1).contains("client_report_time"))
          localObject2 = ((String)localObject1).replace("client_report_time", eu.a(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss"));
      }
      localObject2 = ((String)localObject2).getBytes();
      k = localObject2.length;
      this.g = k;
      localObject2 = ce.a.a((byte[])localObject2);
      cx.a(this.h, localObject2.length);
      cx.i(this.h).a((byte[])localObject2, k, this.b, this, cx.h(this.h), this.f);
      AppMethodBeat.o(98684);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cx.d
 * JD-Core Version:    0.6.2
 */
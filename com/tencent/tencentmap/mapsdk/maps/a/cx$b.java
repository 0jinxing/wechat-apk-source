package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class cx$b extends cx.a
{
  private String a;
  private boolean b;
  private boolean c;

  public cx$b(cx paramcx, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramcx, (byte)0);
    this.a = paramString;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }

  public final void run()
  {
    AppMethodBeat.i(98682);
    cx.b(this.d).decrementAndGet();
    if (TextUtils.isEmpty(this.a))
      AppMethodBeat.o(98682);
    while (true)
    {
      return;
      int i = ce.a.a("report_new_record_num", 1, 50, 10);
      if (!this.b)
      {
        if (dh.a(this.d.b()).b(this.a) != -1L)
        {
          if (cx.c(this.d))
          {
            cx.a(this.d, false);
            cx.a(this.d, false, false);
          }
          if (cx.d(this.d).incrementAndGet() >= i)
            cx.b(this.d, this.b, this.c);
          AppMethodBeat.o(98682);
        }
        else
        {
          cx.e(this.d);
          AppMethodBeat.o(98682);
        }
      }
      else
      {
        cx.f(this.d).add(this.a);
        if (this.c)
        {
          if (cx.f(this.d).size() >= i)
          {
            cx.g(this.d).set(1);
            cx.b(this.d, this.b, this.c);
            AppMethodBeat.o(98682);
          }
          else if (cx.g(this.d).get() == 0)
          {
            cx.g(this.d).set(1);
            cx.a(this.d, false, true);
            AppMethodBeat.o(98682);
          }
        }
        else
        {
          cx.b(this.d, this.b, this.c);
          AppMethodBeat.o(98682);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cx.b
 * JD-Core Version:    0.6.2
 */
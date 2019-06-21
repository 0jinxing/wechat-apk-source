package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.os.AsyncTask;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.ak;
import com.tencent.tencentmap.mapsdk.a.ar;
import com.tencent.tencentmap.mapsdk.a.bi;
import com.tencent.tencentmap.mapsdk.a.o;
import com.tencent.tencentmap.mapsdk.a.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public class jk
  implements jm.a
{
  private Context a;
  private bi b;
  private ls c;
  private q d;
  private jj e;
  private List<AsyncTask> f;
  private jo g;

  public jk(ar paramar, ak paramak)
  {
    AppMethodBeat.i(100049);
    this.a = paramar.m();
    this.c = paramar.l().o();
    this.b = paramar.a();
    this.d = paramar.b();
    this.e = paramar.c();
    this.f = new ArrayList();
    String str1 = "";
    String str2 = "";
    String str3 = str1;
    String str4 = str2;
    if (paramak != null)
    {
      if (!StringUtil.isEmpty(paramak.h()))
        str1 = paramak.h().trim();
      str3 = str1;
      str4 = str2;
      if (!StringUtil.isEmpty(paramak.g()))
      {
        str4 = paramak.g().trim();
        str3 = str1;
      }
    }
    this.g = new jo(this.a, paramar, str3);
    this.f.add(new jl(this.b.a, this, str3, str4));
    this.f.add(new jm(this.a, this));
    AppMethodBeat.o(100049);
  }

  public void a()
  {
    AppMethodBeat.i(100051);
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
      ((AsyncTask)localIterator.next()).execute(new Object[0]);
    AppMethodBeat.o(100051);
  }

  public void a(jk.a parama, ak paramak)
  {
    AppMethodBeat.i(100050);
    this.b.a(parama, paramak);
    AppMethodBeat.o(100050);
  }

  public void a(JSONArray paramJSONArray, o paramo)
  {
    AppMethodBeat.i(100052);
    if (this.d == null)
      AppMethodBeat.o(100052);
    while (true)
    {
      return;
      this.d.a(paramJSONArray);
      this.e.a(paramo);
      int i = jj.c;
      if (paramo != null)
        i = paramo.b();
      this.g.a(this.d.a(), i);
      AppMethodBeat.o(100052);
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(100054);
    if (this.b == null)
      AppMethodBeat.o(100054);
    while (true)
    {
      return;
      this.b.i(paramBoolean);
      if (paramBoolean)
        this.c.d();
      this.c.a(true);
      AppMethodBeat.o(100054);
    }
  }

  public void b()
  {
    AppMethodBeat.i(100053);
    if (this.f != null)
    {
      for (int i = 0; i < this.f.size(); i++)
        ((AsyncTask)this.f.get(i)).cancel(true);
      this.f.clear();
    }
    this.f = null;
    AppMethodBeat.o(100053);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jk
 * JD-Core Version:    0.6.2
 */
package com.tencent.tencentmap.mapsdk.a;

import android.os.Handler;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.c;
import com.tencent.map.lib.f;
import com.tencent.map.lib.gl.JNICallback.e;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ft;
import com.tencent.tencentmap.mapsdk.maps.a.gs.c;
import com.tencent.tencentmap.mapsdk.maps.a.iu;
import com.tencent.tencentmap.mapsdk.maps.a.iz;
import com.tencent.tencentmap.mapsdk.maps.a.lf;
import java.util.ArrayList;
import java.util.List;

public class ch
  implements JNICallback.e, ft
{
  cw a;
  private iz b;
  private aj.f c;
  private Handler d;
  private boolean e;

  public ch(iz paramiz)
  {
    AppMethodBeat.i(100930);
    this.c = null;
    this.d = new Handler();
    this.e = false;
    this.a = null;
    this.b = paramiz;
    if ((paramiz != null) && (paramiz.b() != null))
    {
      paramiz = paramiz.b();
      paramiz.a(this);
      paramiz.a(this);
      this.c = new iu(this.b);
    }
    AppMethodBeat.o(100930);
  }

  private void a(String paramString1, String paramString2, String[] paramArrayOfString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(100932);
    if ((this.b == null) || (this.b.b() == null))
      AppMethodBeat.o(100932);
    while (true)
    {
      return;
      Object localObject = this.b.b();
      int j = ((f)localObject).c();
      if ((paramString1 != null) && (paramArrayOfString != null) && (paramArrayOfString.length > 0) && (paramInt >= 0) && (j >= 16))
      {
        if ((this.c != null) && (!this.e))
        {
          this.e = true;
          this.c.onIndoorBuildingFocused();
        }
        ((f)localObject).g(Math.min(this.b.i, 22));
        if (this.c != null)
        {
          localObject = new ArrayList();
          j = paramArrayOfString.length;
          while (i < j)
          {
            ((List)localObject).add(new cy(paramArrayOfString[i]));
            i++;
          }
          try
          {
            if ((this.a != null) && (this.a.a().equals(paramString1)))
            {
              i = this.a.d();
              if (i == paramInt)
                AppMethodBeat.o(100932);
            }
          }
          catch (Exception paramArrayOfString)
          {
            this.a = new cw(paramString1, paramString2, (List)localObject, paramInt);
            this.c.onIndoorLevelActivated(this.a);
          }
        }
        else
        {
          AppMethodBeat.o(100932);
        }
      }
      else
      {
        c();
        if (this.e)
        {
          this.e = false;
          this.a = null;
          if (this.c != null)
            this.c.onIndoorBuildingDeactivated();
        }
        AppMethodBeat.o(100932);
      }
    }
  }

  private void c()
  {
    AppMethodBeat.i(100934);
    if ((this.b == null) || (this.b.b() == null) || (this.e))
      AppMethodBeat.o(100934);
    while (true)
    {
      return;
      f localf = this.b.b();
      int i = Math.min(20, this.b.i);
      if (localf.j() < i)
        localf.g(i);
      AppMethodBeat.o(100934);
    }
  }

  public void a(gs.c paramc)
  {
    AppMethodBeat.i(100933);
    if ((this.b == null) || (this.b.b() == null) || (this.b.D() == null))
      AppMethodBeat.o(100933);
    while (true)
    {
      return;
      if (this.e)
      {
        this.b.D().b(true);
        AppMethodBeat.o(100933);
      }
      else
      {
        this.b.D().b(false);
        c();
        AppMethodBeat.o(100933);
      }
    }
  }

  public boolean a()
  {
    return this.e;
  }

  public void b()
  {
    AppMethodBeat.i(100935);
    String str;
    int i;
    Object localObject;
    if (this.a != null)
    {
      str = this.a.a();
      i = this.a.d();
      localObject = this.a.c();
      if ((localObject == null) || (i >= ((List)localObject).size()))
        AppMethodBeat.o(100935);
    }
    while (true)
    {
      return;
      localObject = ((cy)((List)localObject).get(i)).a();
      if ((!StringUtil.isEmpty(str)) && (!StringUtil.isEmpty((String)localObject)))
        this.b.b().a(str, (String)localObject);
      AppMethodBeat.o(100935);
    }
  }

  public void z()
  {
    AppMethodBeat.i(100931);
    if ((this.b == null) || (this.b.b() == null))
      AppMethodBeat.o(100931);
    while (true)
    {
      return;
      c localc = this.b.b().d(new GeoPoint());
      if (localc == null)
      {
        AppMethodBeat.o(100931);
      }
      else
      {
        String str1 = localc.a;
        String str2 = localc.b;
        String[] arrayOfString = localc.d;
        int i = localc.c;
        this.d.post(new ch.1(this, str1, str2, arrayOfString, i));
        AppMethodBeat.o(100931);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ch
 * JD-Core Version:    0.6.2
 */
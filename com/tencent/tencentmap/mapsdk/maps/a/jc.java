package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.a.b;
import android.support.v4.widget.j;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.tencent.map.lib.f;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.de;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jc extends j
  implements fv
{
  private List<jb> a;
  private List<jb> b;
  private List<jb> c;
  private iz d;
  private Handler e;

  public jc(View paramView, iz paramiz)
  {
    super(paramView);
    AppMethodBeat.i(100009);
    this.a = new ArrayList();
    this.b = new ArrayList();
    this.c = new ArrayList();
    this.e = new Handler();
    this.d = paramiz;
    this.d.b().a(this);
    AppMethodBeat.o(100009);
  }

  private int b(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(100018);
    int i;
    if ((this.a != null) && (this.a.size() > 0))
    {
      i = this.a.size() - 1;
      jb localjb = (jb)this.a.get(i);
      if (((localjb instanceof jd)) && (localjb.a().contains((int)paramFloat1, (int)paramFloat2)))
        AppMethodBeat.o(100018);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(100018);
    }
  }

  public int a(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(100016);
    int i;
    if ((this.a != null) && (this.a.size() > 0))
    {
      i = b(paramFloat1, paramFloat2);
      if (i != -1)
        AppMethodBeat.o(100016);
    }
    while (true)
    {
      return i;
      for (i = 0; ; i++)
      {
        if (i >= this.a.size())
          break label98;
        if (((jb)this.a.get(i)).a().contains((int)paramFloat1, (int)paramFloat2))
        {
          AppMethodBeat.o(100016);
          break;
        }
      }
      label98: AppMethodBeat.o(100016);
      i = -1;
    }
  }

  public void a()
  {
    AppMethodBeat.i(100017);
    this.e.post(new jc.1(this));
    AppMethodBeat.o(100017);
  }

  public void a(hx paramhx)
  {
    AppMethodBeat.i(100019);
    if (paramhx == null)
      AppMethodBeat.o(100019);
    String str;
    while (true)
    {
      return;
      str = paramhx.y.u();
      if (StringUtil.isEmpty(str))
      {
        AppMethodBeat.o(100019);
      }
      else
      {
        if (paramhx.x())
          break;
        AppMethodBeat.o(100019);
      }
    }
    jd localjd = new jd(this.d, paramhx);
    if (this.a.size() > 0)
    {
      paramhx = (jb)this.a.get(this.a.size() - 1);
      if ((paramhx == null) || (!(paramhx instanceof jd)));
    }
    while (true)
    {
      if (str.startsWith("我的位置"))
      {
        this.a.add(localjd);
        AppMethodBeat.o(100019);
        break;
      }
      this.a.clear();
      this.b.add(localjd);
      Collections.sort(this.b);
      this.a.addAll(this.b);
      this.a.addAll(this.c);
      if (paramhx != null)
        this.a.add(paramhx);
      AppMethodBeat.o(100019);
      break;
      paramhx = null;
    }
  }

  public boolean a(int paramInt)
  {
    AppMethodBeat.i(100015);
    boolean bool;
    if (paramInt >= this.a.size())
    {
      AppMethodBeat.o(100015);
      bool = false;
    }
    while (true)
    {
      return bool;
      jb localjb = (jb)this.a.get(paramInt);
      if (localjb == null)
      {
        AppMethodBeat.o(100015);
        bool = false;
      }
      else
      {
        invalidateVirtualView(paramInt);
        sendEventForVirtualView(paramInt, 1);
        localjb.c();
        AppMethodBeat.o(100015);
        bool = true;
      }
    }
  }

  public void b()
  {
    AppMethodBeat.i(100020);
    this.d.b().a(this);
    a();
    AppMethodBeat.o(100020);
  }

  public void c()
  {
    AppMethodBeat.i(100021);
    this.d.b().b(this);
    AppMethodBeat.o(100021);
  }

  public void d()
  {
    AppMethodBeat.i(100022);
    this.d.b().b(this);
    this.a.clear();
    this.b.clear();
    this.c.clear();
    AppMethodBeat.o(100022);
  }

  public int getVirtualViewAt(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(100010);
    int i = a(paramFloat1, paramFloat2);
    if (i == -1)
    {
      i = -2147483648;
      AppMethodBeat.o(100010);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(100010);
    }
  }

  public void getVisibleVirtualViews(List<Integer> paramList)
  {
    AppMethodBeat.i(100011);
    for (int i = 0; i < this.a.size(); i++)
      paramList.add(Integer.valueOf(i));
    AppMethodBeat.o(100011);
  }

  public boolean onPerformActionForVirtualView(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    AppMethodBeat.i(100014);
    boolean bool;
    if (paramInt2 == 16)
    {
      bool = a(paramInt1);
      AppMethodBeat.o(100014);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100014);
    }
  }

  public void onPopulateEventForVirtualView(int paramInt, AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(100012);
    if (paramInt >= this.a.size())
    {
      paramAccessibilityEvent.getText().add("");
      AppMethodBeat.o(100012);
    }
    while (true)
    {
      return;
      jb localjb = (jb)this.a.get(paramInt);
      if (localjb == null)
      {
        paramAccessibilityEvent = new IllegalArgumentException("Invalid virtual view id");
        AppMethodBeat.o(100012);
        throw paramAccessibilityEvent;
      }
      paramAccessibilityEvent.getText().add(localjb.b());
      AppMethodBeat.o(100012);
    }
  }

  public void onPopulateNodeForVirtualView(int paramInt, b paramb)
  {
    AppMethodBeat.i(100013);
    if (paramInt >= this.a.size())
    {
      paramb.setText("");
      paramb.setBoundsInParent(new Rect());
      AppMethodBeat.o(100013);
    }
    while (true)
    {
      return;
      jb localjb = (jb)this.a.get(paramInt);
      if (localjb == null)
      {
        paramb = new IllegalArgumentException("Invalid virtual view id");
        AppMethodBeat.o(100013);
        throw paramb;
      }
      paramb.setText(localjb.b());
      paramb.setBoundsInParent(localjb.a());
      paramb.addAction(16);
      AppMethodBeat.o(100013);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jc
 * JD-Core Version:    0.6.2
 */
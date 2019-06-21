package com.tencent.tencentmap.mapsdk.a;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public class ed
  implements Marker
{
  private de a;
  private eh b;

  public ed(eh parameh, de paramde)
  {
    AppMethodBeat.i(101378);
    this.b = parameh;
    this.a = paramde;
    if ((this.b != null) && (this.b.a() != null));
    while (true)
    {
      try
      {
        this.b.a().add(this.a);
        return;
      }
      finally
      {
        AppMethodBeat.o(101378);
      }
      AppMethodBeat.o(101378);
    }
  }

  public float getAlpha()
  {
    AppMethodBeat.i(101379);
    float f;
    if (this.a != null)
    {
      f = this.a.h();
      AppMethodBeat.o(101379);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(101379);
    }
  }

  public String getContentDescription()
  {
    AppMethodBeat.i(101409);
    String str;
    if (this.a != null)
    {
      str = this.a.u();
      AppMethodBeat.o(101409);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(101409);
    }
  }

  public String getId()
  {
    AppMethodBeat.i(101380);
    String str;
    if (this.a != null)
    {
      str = this.a.c();
      AppMethodBeat.o(101380);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(101380);
    }
  }

  public int getLevel()
  {
    AppMethodBeat.i(101407);
    int i;
    if (this.a != null)
    {
      i = this.a.v();
      AppMethodBeat.o(101407);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(101407);
    }
  }

  public View getMarkerView()
  {
    return null;
  }

  public LatLng getPosition()
  {
    AppMethodBeat.i(101381);
    LatLng localLatLng;
    if (this.a != null)
    {
      localLatLng = ej.a(this.a.e());
      AppMethodBeat.o(101381);
    }
    while (true)
    {
      return localLatLng;
      localLatLng = null;
      AppMethodBeat.o(101381);
    }
  }

  public float getRotation()
  {
    AppMethodBeat.i(101382);
    float f;
    if (this.a != null)
    {
      f = this.a.m();
      AppMethodBeat.o(101382);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(101382);
    }
  }

  public String getSnippet()
  {
    AppMethodBeat.i(101383);
    String str;
    if (this.a != null)
    {
      str = this.a.g();
      AppMethodBeat.o(101383);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(101383);
    }
  }

  public Object getTag()
  {
    AppMethodBeat.i(101402);
    Object localObject;
    if (this.a != null)
    {
      localObject = this.a.t();
      AppMethodBeat.o(101402);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(101402);
    }
  }

  public String getTitle()
  {
    AppMethodBeat.i(101384);
    String str;
    if (this.a != null)
    {
      str = this.a.f();
      AppMethodBeat.o(101384);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(101384);
    }
  }

  public float getZIndex()
  {
    AppMethodBeat.i(101405);
    float f;
    if (this.a != null)
    {
      f = this.a.p();
      AppMethodBeat.o(101405);
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(101405);
    }
  }

  public void hideInfoWindow()
  {
    AppMethodBeat.i(101385);
    if (this.a != null)
      this.a.k();
    AppMethodBeat.o(101385);
  }

  public boolean isDraggable()
  {
    AppMethodBeat.i(101386);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.i();
      AppMethodBeat.o(101386);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101386);
    }
  }

  public boolean isInfoWindowShown()
  {
    AppMethodBeat.i(101387);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.l();
      AppMethodBeat.o(101387);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101387);
    }
  }

  public boolean isVisible()
  {
    AppMethodBeat.i(101388);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.n();
      AppMethodBeat.o(101388);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101388);
    }
  }

  public void remove()
  {
    AppMethodBeat.i(101389);
    if (this.a != null);
    try
    {
      if ((this.b != null) && (this.b.a() != null))
        this.b.a().remove(this.a);
      this.a.b();
      AppMethodBeat.o(101389);
      return;
    }
    finally
    {
      AppMethodBeat.o(101389);
    }
  }

  public void set2Top()
  {
    AppMethodBeat.i(101400);
    if ((this.b == null) || (this.b.a() == null))
      AppMethodBeat.o(101400);
    while (true)
    {
      return;
      try
      {
        int i = this.b.a().size();
        Iterator localIterator = this.b.a().iterator();
        if (localIterator.hasNext())
        {
          localde = (de)localIterator.next();
          if (localde.p() > i)
            i = (int)localde.p();
          while (true)
            break;
        }
        de localde = this.a;
        if (i < 2147483647);
        for (float f = i + 1; ; f = 2.147484E+009F)
        {
          localde.c(f);
          AppMethodBeat.o(101400);
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(101400);
      }
    }
  }

  public void setAlpha(float paramFloat)
  {
    AppMethodBeat.i(101390);
    if (this.a != null)
      this.a.b(paramFloat);
    AppMethodBeat.o(101390);
  }

  public void setAnchor(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(101391);
    if (this.a != null)
      this.a.a(paramFloat1, paramFloat2);
    AppMethodBeat.o(101391);
  }

  public void setContentDescription(String paramString)
  {
    AppMethodBeat.i(101408);
    if (this.a != null)
      this.a.c(paramString);
    AppMethodBeat.o(101408);
  }

  public void setDraggable(boolean paramBoolean)
  {
    AppMethodBeat.i(101392);
    if (this.a != null)
      this.a.a(paramBoolean);
    AppMethodBeat.o(101392);
  }

  public void setIcon(BitmapDescriptor paramBitmapDescriptor)
  {
    AppMethodBeat.i(101393);
    if ((this.a != null) && (paramBitmapDescriptor != null))
      this.a.a(cn.a(paramBitmapDescriptor.getBitmap()));
    AppMethodBeat.o(101393);
  }

  public void setInfoWindowHideAnimation(Animation paramAnimation)
  {
  }

  public void setInfoWindowShowAnimation(Animation paramAnimation)
  {
  }

  public void setLevel(int paramInt)
  {
    AppMethodBeat.i(101406);
    if (this.a != null)
      this.a.a(paramInt);
    AppMethodBeat.o(101406);
  }

  public void setMarkerView(View paramView)
  {
    AppMethodBeat.i(101401);
    if (this.a != null)
      this.a.a(cn.a(paramView));
    AppMethodBeat.o(101401);
  }

  public void setPosition(LatLng paramLatLng)
  {
    AppMethodBeat.i(101394);
    if (this.a != null)
      this.a.a(ej.a(paramLatLng));
    AppMethodBeat.o(101394);
  }

  public void setRotation(float paramFloat)
  {
    AppMethodBeat.i(101395);
    if (this.a != null)
      this.a.a(paramFloat);
    AppMethodBeat.o(101395);
  }

  public void setSnippet(String paramString)
  {
    AppMethodBeat.i(101396);
    if (this.a != null)
      this.a.b(paramString);
    AppMethodBeat.o(101396);
  }

  public void setTag(Object paramObject)
  {
    AppMethodBeat.i(101403);
    if (this.a != null)
      this.a.a(paramObject);
    AppMethodBeat.o(101403);
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(101397);
    if (this.a != null)
      this.a.a(paramString);
    AppMethodBeat.o(101397);
  }

  public void setVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(101398);
    if (this.a != null)
      this.a.b(paramBoolean);
    AppMethodBeat.o(101398);
  }

  public void setZIndex(float paramFloat)
  {
    AppMethodBeat.i(101404);
    if (this.a != null)
      this.a.c(paramFloat);
    AppMethodBeat.o(101404);
  }

  public void showInfoWindow()
  {
    AppMethodBeat.i(101399);
    if (this.a != null)
      this.a.j();
    AppMethodBeat.o(101399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ed
 * JD-Core Version:    0.6.2
 */
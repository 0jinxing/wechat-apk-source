package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.d;
import com.tencent.map.lib.gl.model.GLIcon;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.map.lib.util.SystemUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class gj
{
  public HashMap<Integer, GLIcon> a;
  public HashMap<Integer, GLIcon> b;
  private fn c;
  private gh d;
  private CopyOnWriteArrayList<Integer> e;
  private SparseBooleanArray f;
  private ArrayList<Integer> g;

  gj(fn paramfn, com.tencent.map.lib.gl.b paramb, gh paramgh)
  {
    AppMethodBeat.i(99166);
    this.e = new CopyOnWriteArrayList();
    this.f = new SparseBooleanArray();
    this.g = new ArrayList();
    this.c = paramfn;
    this.d = paramgh;
    this.a = new HashMap();
    this.b = new HashMap();
    AppMethodBeat.o(99166);
  }

  public static Bitmap a(String paramString)
  {
    AppMethodBeat.i(99171);
    paramString = com.tencent.map.lib.util.b.a(paramString);
    AppMethodBeat.o(99171);
    return paramString;
  }

  private int b(d paramd)
  {
    AppMethodBeat.i(99172);
    if (((this.c instanceof gm)) && (paramd != null) && (!paramd.l()))
    {
      Context localContext = ((gm)this.c).k();
      float f1 = paramd.n();
      paramd.a(SystemUtil.getDensity(localContext) * f1);
    }
    int i = this.c.f().a(paramd);
    paramd.a(i);
    if (!this.e.contains(Integer.valueOf(i)))
    {
      this.e.add(Integer.valueOf(i));
      this.f.append(i, paramd.l());
    }
    AppMethodBeat.o(99172);
    return i;
  }

  private void e()
  {
    AppMethodBeat.i(99169);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.a.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      Object localObject3 = ((Map.Entry)localObject2).getKey();
      localObject2 = (GLIcon)((Map.Entry)localObject2).getValue();
      if (!this.b.containsKey(localObject3))
      {
        localArrayList.add(Integer.valueOf(((Integer)localObject3).intValue()));
        com.tencent.map.lib.util.b.b(((GLIcon)localObject2).getIconName());
      }
    }
    int i = localArrayList.size();
    if (i <= 0)
      AppMethodBeat.o(99169);
    while (true)
    {
      return;
      localObject1 = new int[i];
      for (int j = 0; j < i; j++)
        localObject1[j] = ((Integer)localArrayList.get(j)).intValue();
      this.d.a((int[])localObject1, i);
      AppMethodBeat.o(99169);
    }
  }

  private void f()
  {
    AppMethodBeat.i(99170);
    this.a.clear();
    this.a.putAll(this.b);
    this.b.clear();
    AppMethodBeat.o(99170);
  }

  public void a()
  {
    AppMethodBeat.i(99168);
    e();
    f();
    AppMethodBeat.o(99168);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(99173);
    this.c.f().a(paramInt, this.f.get(paramInt));
    this.f.delete(paramInt);
    this.e.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(99173);
  }

  public void a(GeoPoint paramGeoPoint, GLIcon paramGLIcon, boolean paramBoolean1, int paramInt1, boolean paramBoolean2, boolean paramBoolean3, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(99167);
    float f1;
    if (paramBoolean3)
    {
      f1 = 360.0F - paramGLIcon.getRotateAngle();
      if (!this.a.containsKey(Integer.valueOf(paramGLIcon.mDisplayId)))
        break label181;
      if (paramGLIcon.isDirty())
      {
        this.d.a(paramGLIcon.mDisplayId, paramGLIcon.getIconName(), paramGLIcon.mPositionX, paramGLIcon.mPositionY, paramGLIcon.getAnchroX(), paramGLIcon.getAnchorY(), paramGLIcon.getScaleX(), paramGLIcon.getScaleY(), paramGLIcon.getAlpha(), f1, paramBoolean1, paramGLIcon.isFixPos(), paramGLIcon.isFastLoad(), paramGLIcon.isAvoidAnno(), paramInt2, paramInt3);
        if (paramGLIcon.isIconChanged())
        {
          com.tencent.map.lib.util.b.a(paramGLIcon.getIconName(), paramGLIcon.getTextureBm(0));
          if (!StringUtil.isEqual(paramGLIcon.getIconName(), paramGLIcon.getLastName()))
            com.tencent.map.lib.util.b.b(paramGLIcon.getLastName());
          paramGLIcon.setIconChanged(false);
        }
      }
      this.b.put(Integer.valueOf(paramGLIcon.mDisplayId), paramGLIcon);
      AppMethodBeat.o(99167);
    }
    while (true)
    {
      return;
      f1 = paramGLIcon.getRotateAngle();
      break;
      label181: paramGLIcon.mDisplayId = this.d.a(paramGLIcon.getIconName(), paramGLIcon.mPositionX, paramGLIcon.mPositionY, paramGLIcon.getAnchroX(), paramGLIcon.getAnchorY(), paramGLIcon.getScaleX(), paramGLIcon.getScaleY(), paramGLIcon.getAlpha(), f1, paramBoolean1, paramGLIcon.isFixPos(), paramGLIcon.isFastLoad(), paramGLIcon.isAvoidAnno(), paramInt2, paramInt3);
      com.tencent.map.lib.util.b.a(paramGLIcon.getIconName(), paramGLIcon.getTextureBm(0));
      paramGLIcon.setIconChanged(false);
      paramGLIcon.setDirty(false);
      this.b.put(Integer.valueOf(paramGLIcon.mDisplayId), paramGLIcon);
      AppMethodBeat.o(99167);
    }
  }

  public void a(d paramd)
  {
    AppMethodBeat.i(99174);
    if (!this.e.contains(Integer.valueOf(paramd.s())))
    {
      paramd.a(b(paramd));
      this.d.c(paramd);
    }
    if (!this.g.contains(Integer.valueOf(paramd.s())))
      this.g.add(Integer.valueOf(paramd.s()));
    this.d.b(paramd);
    this.d.d(paramd);
    if (paramd.t())
      this.d.h(paramd);
    while (true)
    {
      this.d.f(paramd);
      if (!StringUtil.isEmpty(paramd.w()))
        this.d.e(paramd);
      this.d.i(paramd);
      AppMethodBeat.o(99174);
      return;
      this.d.g(paramd);
    }
  }

  public fn b()
  {
    return this.c;
  }

  protected void c()
  {
    AppMethodBeat.i(99175);
    if ((this.e != null) && (this.e.size() > 0))
    {
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        if (!this.g.contains(Integer.valueOf(i)))
          a(i);
      }
      this.g.clear();
    }
    AppMethodBeat.o(99175);
  }

  public float d()
  {
    AppMethodBeat.i(99176);
    float f1 = this.c.a().l();
    AppMethodBeat.o(99176);
    return f1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gj
 * JD-Core Version:    0.6.2
 */
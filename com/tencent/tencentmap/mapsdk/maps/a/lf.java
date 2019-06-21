package com.tencent.tencentmap.mapsdk.maps.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.ac;
import com.tencent.tencentmap.mapsdk.a.aj;
import com.tencent.tencentmap.mapsdk.a.ar;
import com.tencent.tencentmap.mapsdk.a.ch;
import com.tencent.tencentmap.mapsdk.a.cp;
import com.tencent.tencentmap.mapsdk.a.cw;
import com.tencent.tencentmap.mapsdk.a.cy;
import java.util.ArrayList;
import java.util.List;

public class lf
  implements AdapterView.OnItemClickListener, le, lg.a
{
  private static final int p;
  public boolean a;
  private RelativeLayout b;
  private lg c;
  private TextView d;
  private View e;
  private View f;
  private View g;
  private Bitmap h;
  private Bitmap i;
  private float j;
  private final int k;
  private final int l;
  private final int m;
  private final int n;
  private int o;
  private a q;
  private Context r;
  private ac s;
  private int t;
  private int u;
  private cw v;
  private String w;
  private boolean x;
  private ch y;
  private lf.a.a z;

  static
  {
    AppMethodBeat.i(100357);
    p = Color.argb(200, 56, 56, 56);
    AppMethodBeat.o(100357);
  }

  public lf(Context paramContext, ac paramac)
  {
    AppMethodBeat.i(100339);
    this.j = 1.0F;
    this.k = 45;
    this.l = 4;
    this.m = 90;
    this.n = 10;
    this.o = 0;
    this.t = -1;
    this.u = 0;
    this.x = false;
    this.a = false;
    this.z = null;
    this.s = paramac;
    this.r = paramContext.getApplicationContext();
    this.x = true;
    AppMethodBeat.o(100339);
  }

  private int a(Adapter paramAdapter)
  {
    AppMethodBeat.i(100355);
    this.d.measure(0, 0);
    int i1 = this.d.getMeasuredWidth();
    int i2 = paramAdapter.getCount();
    int i3 = 0;
    View localView = null;
    if (i3 < i2)
    {
      localView = paramAdapter.getView(i3, localView, this.c);
      localView.measure(0, 0);
      int i4 = localView.getMeasuredWidth();
      if (i4 <= i1)
        break label93;
      i1 = i4;
    }
    label93: 
    while (true)
    {
      i3++;
      break;
      AppMethodBeat.o(100355);
      return i1;
    }
  }

  private void a(Context paramContext)
  {
    AppMethodBeat.i(100341);
    this.j = paramContext.getApplicationContext().getResources().getDisplayMetrics().density;
    this.o = ((int)(234.0D * this.j));
    AppMethodBeat.o(100341);
  }

  @TargetApi(9)
  private void a(Context paramContext, a parama)
  {
    AppMethodBeat.i(100345);
    this.b = new RelativeLayout(paramContext);
    this.d = new TextView(paramContext);
    this.d.setSingleLine(true);
    this.e = new View(paramContext);
    this.c = new lg(paramContext);
    this.f = new View(paramContext);
    this.g = new View(paramContext);
    this.c.setChoiceMode(1);
    this.c.setAdapter(parama);
    this.c.setOnItemClickListener(this);
    this.c.setVerticalScrollBarEnabled(false);
    this.c.setHorizontalScrollBarEnabled(false);
    this.c.setOverScrollMode(2);
    this.c.setDivider(null);
    this.c.setDividerHeight(0);
    this.c.setOnDataChangedListener(this);
    paramContext = new RelativeLayout.LayoutParams((int)(30.0F * this.j), -2);
    paramContext.addRule(14, -1);
    paramContext.topMargin = ((int)(this.j * 6.0F));
    this.d.setId(this.d.hashCode());
    this.d.setText("楼层");
    this.d.setTextSize(12.0F);
    this.d.setGravity(17);
    this.d.setTextColor(Color.argb(200, 56, 56, 56));
    this.b.addView(this.d, paramContext);
    paramContext = new RelativeLayout.LayoutParams((int)(30.0F * this.j), (int)(1.0F * this.j));
    paramContext.addRule(3, this.d.getId());
    paramContext.addRule(14, -1);
    paramContext.topMargin = ((int)(this.j * 6.0F));
    this.e.setBackgroundColor(-3355444);
    this.e.setId(this.e.hashCode());
    this.b.addView(this.e, paramContext);
    if (this.h != null)
    {
      parama = this.h.getNinePatchChunk();
      hn localhn = hn.a(parama);
      paramContext = new Rect();
      if (localhn != null)
        paramContext = localhn.a;
      paramContext = new NinePatchDrawable(this.r.getResources(), this.h, parama, paramContext, null);
      this.b.setBackgroundDrawable(paramContext);
    }
    paramContext = new RelativeLayout.LayoutParams((int)(25.0F * this.j), (int)(180.0F * this.j));
    paramContext.addRule(3, this.e.getId());
    paramContext.addRule(14, -1);
    this.b.addView(this.c, paramContext);
    a(this.s);
    this.b.measure(0, 0);
    this.b.setVisibility(8);
    AppMethodBeat.o(100345);
  }

  private void a(List<cy> paramList)
  {
    AppMethodBeat.i(100352);
    FrameLayout.LayoutParams localLayoutParams;
    if ((paramList.size() < 4) && (paramList.size() != this.u))
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.b.getLayoutParams();
      localLayoutParams.height = ((int)(this.o - (4 - paramList.size()) * 45 * this.j));
      this.s.updateViewLayout(this.b, localLayoutParams);
    }
    while (true)
    {
      this.u = paramList.size();
      if (this.q != null)
        this.q.a(paramList);
      AppMethodBeat.o(100352);
      return;
      if ((paramList.size() != this.u) && (this.u < 4))
      {
        localLayoutParams = (FrameLayout.LayoutParams)this.b.getLayoutParams();
        localLayoutParams.height = this.o;
        this.s.updateViewLayout(this.b, localLayoutParams);
      }
    }
  }

  private void b(Context paramContext)
  {
    AppMethodBeat.i(100342);
    this.h = ic.b(paramContext, "indoor_background.9.png");
    this.i = ic.b(paramContext, "item_selected_background.png");
    AppMethodBeat.o(100342);
  }

  private void e()
  {
    AppMethodBeat.i(100340);
    if (this.b == null)
    {
      this.q = new a(this.r, new ArrayList());
      a(this.r);
      b(this.r);
      a(this.r, this.q);
      if ((this.s.getMap() != null) && (this.s.getMap().c() != null) && (this.s.getMap().c().l() != null))
        this.y = this.s.getMap().c().l().E();
    }
    AppMethodBeat.o(100340);
  }

  private FrameLayout.LayoutParams f()
  {
    AppMethodBeat.i(100350);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, this.o);
    localLayoutParams.gravity = 83;
    localLayoutParams.leftMargin = ((int)(10.0F * this.j));
    localLayoutParams.bottomMargin = ((int)(90.0F * this.j));
    AppMethodBeat.o(100350);
    return localLayoutParams;
  }

  private void g()
  {
    AppMethodBeat.i(100353);
    if (this.v == null)
      AppMethodBeat.o(100353);
    int i1;
    while (true)
    {
      return;
      i1 = this.v.d();
      List localList = this.v.c();
      if ((localList == null) || (i1 >= localList.size()) || (i1 == -1))
      {
        AppMethodBeat.o(100353);
      }
      else
      {
        if ((cy)localList.get(i1) != null)
          break;
        AppMethodBeat.o(100353);
      }
    }
    if ((this.w != null) && (this.a) && (this.w.equals(this.v.a())))
    {
      this.c.setItemChecked(i1, true);
      this.a = false;
    }
    while (true)
    {
      this.t = i1;
      this.w = this.v.a();
      AppMethodBeat.o(100353);
      break;
      this.c.setSelectionFromTop(i1, (int)(45.0F * this.j + 0.5D) * 2);
    }
  }

  private void h()
  {
    AppMethodBeat.i(100354);
    if (this.c != null)
    {
      ((RelativeLayout.LayoutParams)this.c.getLayoutParams()).width = a(this.q);
      this.c.requestLayout();
    }
    AppMethodBeat.o(100354);
  }

  public void a()
  {
    AppMethodBeat.i(100347);
    if (this.h != null)
      this.h.recycle();
    if (this.i != null)
      this.i.recycle();
    AppMethodBeat.o(100347);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(100346);
    if ((this.x) && (paramInt2 < this.o + 90.0F * this.j))
    {
      this.b.setVisibility(8);
      AppMethodBeat.o(100346);
    }
    while (true)
    {
      return;
      this.b.setVisibility(0);
      AppMethodBeat.o(100346);
    }
  }

  public void a(cw paramcw)
  {
    AppMethodBeat.i(100344);
    if (paramcw == null)
      AppMethodBeat.o(100344);
    while (true)
    {
      return;
      if (this.b == null)
        e();
      this.v = paramcw;
      a(paramcw.c());
      AppMethodBeat.o(100344);
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(100343);
    if ((this.s == null) || (this.s.getMap() == null))
    {
      AppMethodBeat.o(100343);
      return;
    }
    if (paramBoolean);
    for (this.x = true; ; this.x = false)
    {
      b(this.x);
      AppMethodBeat.o(100343);
      break;
    }
  }

  public boolean a(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(100348);
    if (paramViewGroup.indexOfChild(this.b) < 0)
      paramViewGroup.addView(this.b, f());
    h();
    AppMethodBeat.o(100348);
    return true;
  }

  public void b(boolean paramBoolean)
  {
    AppMethodBeat.i(100351);
    if ((this.s == null) || (this.s.getMap() == null))
      AppMethodBeat.o(100351);
    while (true)
    {
      return;
      if (this.b == null)
        e();
      aj localaj = this.s.getMap();
      cp localcp = localaj.d();
      if ((this.x) && (paramBoolean) && (localcp != null) && (this.y != null) && (this.y.a()))
      {
        if (this.b.getVisibility() != 0)
        {
          this.b.setVisibility(0);
          a(localaj.c().c(localcp.a));
          AppMethodBeat.o(100351);
        }
      }
      else
      {
        if (this.b.getVisibility() == 0)
          this.b.setVisibility(8);
        AppMethodBeat.o(100351);
      }
    }
  }

  public boolean b()
  {
    return this.x;
  }

  public void c()
  {
    AppMethodBeat.i(100356);
    h();
    g();
    AppMethodBeat.o(100356);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(100349);
    paramAdapterView = this.s.getMap();
    if (paramAdapterView == null)
      AppMethodBeat.o(100349);
    while (true)
    {
      return;
      if (this.z != null)
      {
        this.z.a.setTextColor(-16777216);
        this.z.b.setVisibility(4);
      }
      paramView = (lf.a.a)paramView.getTag();
      paramView.a.setTextColor(-1);
      paramView.b.setVisibility(0);
      this.z = paramView;
      this.t = paramInt;
      this.a = true;
      paramAdapterView.c(paramInt);
      AppMethodBeat.o(100349);
    }
  }

  class a extends BaseAdapter
  {
    private Context b;
    private List<cy> c;

    public a(List<cy> arg2)
    {
      Object localObject1;
      this.b = localObject1;
      Object localObject2;
      this.c = localObject2;
    }

    public void a(List<cy> paramList)
    {
      AppMethodBeat.i(100338);
      this.c = paramList;
      notifyDataSetChanged();
      AppMethodBeat.o(100338);
    }

    public int getCount()
    {
      AppMethodBeat.i(100335);
      int i;
      if (this.c == null)
      {
        i = 0;
        AppMethodBeat.o(100335);
      }
      while (true)
      {
        return i;
        i = this.c.size();
        AppMethodBeat.o(100335);
      }
    }

    public Object getItem(int paramInt)
    {
      AppMethodBeat.i(100336);
      Object localObject;
      if (this.c == null)
      {
        localObject = null;
        AppMethodBeat.o(100336);
      }
      while (true)
      {
        return localObject;
        localObject = this.c.get(paramInt);
        AppMethodBeat.o(100336);
      }
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(100337);
      if ((this.c == null) || (this.c.size() == 0))
      {
        paramView = null;
        AppMethodBeat.o(100337);
        return paramView;
      }
      Object localObject;
      if (paramView != null)
      {
        localObject = (lf.a.a)paramView.getTag();
        paramViewGroup = ((lf.a.a)localObject).a;
        localObject = ((lf.a.a)localObject).b;
        label59: paramViewGroup.setText(((cy)this.c.get(paramInt)).a());
        if (paramInt == lf.d(lf.this))
          break label272;
        paramViewGroup.setTextColor(lf.d());
        ((ImageView)localObject).setVisibility(4);
      }
      while (true)
      {
        AppMethodBeat.o(100337);
        break;
        paramView = new FrameLayout(this.b);
        localObject = new ImageView(this.b);
        if (lf.a(lf.this) != null)
          ((ImageView)localObject).setImageBitmap(lf.a(lf.this));
        paramViewGroup = new FrameLayout.LayoutParams(lf.b(lf.this).getMeasuredWidth(), (int)(lf.c(lf.this) * 45.0F));
        paramViewGroup.gravity = 17;
        paramView.addView((View)localObject, paramViewGroup);
        paramViewGroup = new TextView(this.b);
        paramViewGroup.setGravity(17);
        FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, (int)(lf.c(lf.this) * 45.0F));
        localLayoutParams.gravity = 17;
        paramView.addView(paramViewGroup, localLayoutParams);
        paramView.setTag(new lf.a.a(this, paramViewGroup, (ImageView)localObject));
        break label59;
        label272: paramViewGroup.setTextColor(-1);
        ((ImageView)localObject).setVisibility(0);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lf
 * JD-Core Version:    0.6.2
 */
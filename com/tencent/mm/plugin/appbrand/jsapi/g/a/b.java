package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.mm.plugin.appbrand.d.a;
import java.util.LinkedList;
import java.util.List;

public abstract interface b extends h
{
  public abstract boolean Bg(String paramString);

  public abstract boolean Bi(String paramString);

  public abstract void I(float paramFloat1, float paramFloat2);

  public abstract void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5);

  public abstract void a(b.b paramb);

  public abstract void a(b.j paramj, a parama);

  public abstract void a(b.k paramk);

  public abstract void a(b.l paraml);

  public abstract void a(b.n paramn);

  public abstract void a(b.s params);

  public abstract void a(b.t paramt);

  public abstract void a(u paramu);

  public abstract void a(String paramString, int paramInt, b.h paramh, boolean paramBoolean);

  public abstract void a(String paramString, b.r paramr, a parama);

  public abstract void a(String paramString, LinkedList<b.g> paramLinkedList, o paramo);

  public abstract boolean a(b.c paramc, b.m paramm, a parama);

  public abstract boolean a(b.d paramd, a parama);

  public abstract boolean a(v paramv);

  public abstract b.w aDQ();

  public abstract void aDR();

  public abstract float aDS();

  public abstract b.e aDT();

  public abstract boolean aDU();

  public abstract b.h aDV();

  public abstract void aDW();

  public abstract void aDX();

  public abstract void aDY();

  public abstract void aDZ();

  public abstract void aEa();

  public abstract void aEb();

  public abstract void al(float paramFloat);

  public abstract void am(float paramFloat);

  public abstract void an(float paramFloat);

  public abstract void ci(String paramString1, String paramString2);

  public abstract void ed(boolean paramBoolean);

  public abstract void ee(boolean paramBoolean);

  public abstract void ef(boolean paramBoolean);

  public abstract void eg(boolean paramBoolean);

  public abstract void eh(boolean paramBoolean);

  public abstract void ei(boolean paramBoolean);

  public abstract void ej(boolean paramBoolean);

  public abstract void ek(boolean paramBoolean);

  public abstract void el(boolean paramBoolean);

  public abstract void em(boolean paramBoolean);

  public abstract void en(boolean paramBoolean);

  public abstract float getSkew();

  public abstract View getView();

  public abstract int getZoomLevel();

  public abstract void h(List<b.h> paramList, int paramInt);

  public abstract void onDestroy();

  public abstract void onPause();

  public abstract void onResume();

  public abstract void onSizeChanged(int paramInt1, int paramInt2);

  public abstract void onTouchEvent(MotionEvent paramMotionEvent);

  public static abstract interface o
  {
    public abstract void ec(boolean paramBoolean);
  }

  public static final class r$b
  {
    int bgColor;
    int borderColor;
    int borderWidth;
    int color;
    String content;
    int hOg;
    int hOh;
    String hdq;
    int padding;
    int x;
    int y;

    public r$b(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, String paramString2, int paramInt9)
    {
      this.content = paramString1;
      this.color = paramInt1;
      this.hOg = paramInt2;
      this.x = paramInt3;
      this.y = paramInt4;
      this.bgColor = paramInt5;
      this.hOh = paramInt6;
      this.borderWidth = paramInt7;
      this.borderColor = paramInt8;
      this.hdq = paramString2;
      this.padding = paramInt9;
    }
  }

  public static abstract interface u
  {
    public abstract void a(b.p paramp);
  }

  public static final class v
  {
    public int fillColor;
    public List<b.h> hNV;
    public int strokeColor;
    public int strokeWidth;
    public int zIndex;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.b
 * JD-Core Version:    0.6.2
 */